package zwave;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.json.JSONArray;
import org.json.JSONObject;

public class ProductInfo {

	private byte[] productData;
	private JSONObject jsonConfig;

	ProductInfo(byte[] productData) {
		this.productData = productData;
		resolveConfig();
	}

	public static List<String> getFilenamesForDirnameFromCP(String directoryName)
			throws URISyntaxException, IOException {
		final List<String> filenames = new ArrayList<>();

		URL url = Thread.currentThread().getContextClassLoader().getResource(directoryName);
		if (url != null) {
			if (url.getProtocol().equals("file")) {
				File file = Paths.get(url.toURI()).toFile();
				if (file != null) {
					File[] files = file.listFiles();
					if (files != null) {
						for (File filename : files) {
							filenames.add(filename.toString());
						}
					}
				}
			} else if (url.getProtocol().equals("jar")) {
				String dirname = directoryName + "/";
				String path = url.getPath();
				String jarPath = path.substring(5, path.indexOf("!"));
				try (JarFile jar = new JarFile(URLDecoder.decode(jarPath, StandardCharsets.UTF_8.name()))) {
					Enumeration<JarEntry> entries = jar.entries();
					while (entries.hasMoreElements()) {
						JarEntry entry = entries.nextElement();
						String name = entry.getName();
						if (name.startsWith(dirname) && !dirname.equals(name)) {
							URL resource = Thread.currentThread().getContextClassLoader().getResource(name);
							filenames.add(resource.toString());
						}
					}
				}
			}
		}
		return filenames;
	}

	private void resolveConfig() {

		try {
			List<String> names = getFilenamesForDirnameFromCP("zwave/config/devices");
			String manufacturerKey = "0x" + Utilities.asHex(productData[0]).toLowerCase()
					+ Utilities.asHex(productData[1]).toLowerCase();

			String productTypeKey = "0x" + Utilities.asHex(productData[2]).toLowerCase()
					+ Utilities.asHex(productData[3]).toLowerCase();

			String productIdKey = "0x" + Utilities.asHex(productData[4]).toLowerCase()
					+ Utilities.asHex(productData[5]).toLowerCase();

			for (String string : names) {
				if (string.endsWith(manufacturerKey)) {
					List<String> jsonConfigNames = getFilenamesForDirnameFromCP(
							"zwave/config/devices/" + manufacturerKey);

					for (String configName : jsonConfigNames) {
						try {
							int i = configName.indexOf(manufacturerKey);
							String name = "config/devices/" + configName.substring(i);
							if (name.endsWith(".json")) {
								InputStream in = getClass().getResourceAsStream(name);
								ByteArrayOutputStream buffer = new ByteArrayOutputStream();
								int nRead;
								byte[] data = new byte[1024];
								while ((nRead = in.read(data, 0, data.length)) != -1) {
									buffer.write(data, 0, nRead);
								}

								buffer.flush();
								byte[] byteArray = buffer.toByteArray();

								String text = new String(byteArray, StandardCharsets.UTF_8);

								JSONObject obj = new JSONObject(text);
								JSONArray devices = obj.getJSONArray("devices");
								for (int index = 0; index < devices.length(); index++) {
									JSONObject device = devices.getJSONObject(index);
									String productType = device.optString("productType", "");
									String productId = device.optString("productId", "");
									if (productType.equals(productTypeKey) && productId.equals(productIdKey)) {
										jsonConfig = obj;
										break;
									}

								}

							}
						} catch (Exception e) {
							e.printStackTrace();
						}
						if (jsonConfig != null) {
							break;
						}

					}
					break;
				}
			}
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String toString() {
		if (jsonConfig == null) {
			return "manufacturer:0x" + Utilities.asHex(productData[0]) + Utilities.asHex(productData[1]) + " type:0x"
					+ Utilities.asHex(productData[2]) + Utilities.asHex(productData[3]) + " id:0x"
					+ Utilities.asHex(productData[4]) + Utilities.asHex(productData[5]);
		} else {
			return "manufacturer: " + getManufacturerName() + "(0x" + Utilities.asHex(productData[0])
					+ Utilities.asHex(productData[1]) + ") name: " + getName() + " description: " + getDescription()
					+ " (type:0x" + Utilities.asHex(productData[2]) + Utilities.asHex(productData[3]) + " id:0x"
					+ Utilities.asHex(productData[4]) + Utilities.asHex(productData[5]) + ")";
		}

	}

	public String getManufacturerName() {
		if (jsonConfig == null) {
			return "unknown";
		}
		return jsonConfig.optString("manufacturer", "");
	}

	public String getName() {
		if (jsonConfig == null) {
			return "unknown";
		}
		return jsonConfig.optString("label", "");
	}

	public String getDescription() {
		if (jsonConfig == null) {
			return "unknown";
		}
		return jsonConfig.optString("description", "");
	}
}
