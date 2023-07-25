package zwave;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.zip.ZipFile;

public class JarPackager {
	final File outputDir;

	JarPackager(File outputDir) throws IOException {
		this.outputDir = outputDir;
		if (!outputDir.exists()) {
			outputDir.mkdir();
		}
	}

	void createMQTTJar() throws IOException {

		final String binPath = "bin";
		final String libPath = "lib";
		int pathLenght = binPath.length() + 1;
		File binDir = new File(binPath);
		File libDir = new File(libPath);
		final File jarFile = new File(outputDir, "zwave-mqqt.jar");
		System.out.println("creating " + jarFile.getCanonicalPath());
		// Dossiers des bin
		final List<File> dirs = new ArrayList<>();
		dirs.add(new File(binDir, "zwave"));
		dirs.add(new File(binDir, "org"));
		List<File> filesToAdd = new ArrayList<>();
		for (File directory : dirs) {
			if (!directory.exists()) {
				System.err.println(directory.getAbsolutePath() + " doesn't exists");
			}
			addChild(directory, filesToAdd);
		}

		final Manifest manifest = new Manifest();
		manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
		manifest.getMainAttributes().put(Attributes.Name.MAIN_CLASS, "zwave.mqtt.MQTTBridge");
		JarOutputStream out = new JarOutputStream(new FileOutputStream(jarFile), manifest);

		// Compress the files
		int nbFiles = filesToAdd.size();
		for (int i = 0; i < nbFiles; i++) {
			final File file = filesToAdd.get(i);
			add(file, pathLenght, out);
		}

		// Jars
		final List<File> jars = new ArrayList<>();
		jars.add(new File(libDir, "jSerialComm-2.9.3.jar"));
		jars.add(new File(libDir, "org.eclipse.paho.client.mqttv3-1.2.5.jar"));

		// includes the jars
		int nbJars = jars.size();
		for (int i = 0; i < nbJars; i++) {
			final File file = jars.get(i);
			addJar(file, out);
		}

		// Complete the ZIP file
		out.close();
	}

	void createToolboxJar() throws IOException {

		final String binPath = "bin";
		final String libPath = "lib";
		int pathLenght = binPath.length() + 1;
		File binDir = new File(binPath);
		File libDir = new File(libPath);
		final File jarFile = new File(outputDir, "zwave-toolbox.jar");
		System.out.println("creating " + jarFile.getCanonicalPath());
		// Dossiers des bin
		final List<File> dirs = new ArrayList<>();
		dirs.add(new File(binDir, "zwave"));
		dirs.add(new File(binDir, "org"));
		List<File> filesToAdd = new ArrayList<>();
		for (File directory : dirs) {
			if (!directory.exists()) {
				System.err.println(directory.getAbsolutePath() + " doesn't exists");
			}
			addChild(directory, filesToAdd);
		}

		final Manifest manifest = new Manifest();
		manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
		manifest.getMainAttributes().put(Attributes.Name.MAIN_CLASS, "zwave.ZWaveSerialAPI");
		JarOutputStream out = new JarOutputStream(new FileOutputStream(jarFile), manifest);

		
		
		// Compress the files
		int nbFiles = filesToAdd.size();
		for (int i = 0; i < nbFiles; i++) {
			final File file = filesToAdd.get(i);
			add(file, pathLenght, out);
		}

		// Jars
		final List<File> jars = new ArrayList<>();
		jars.add(new File(libDir, "jSerialComm-2.9.3.jar"));

		// includes the jars
		int nbJars = jars.size();
		for (int i = 0; i < nbJars; i++) {
			final File file = jars.get(i);
			addJar(file, out);
		}

		// Complete the ZIP file
		out.close();
	}

	protected void addJar(File file, JarOutputStream out) throws IOException {
		JarFile f = new JarFile(file, false, ZipFile.OPEN_READ);

		Enumeration<JarEntry> entries = f.entries();
		while (entries.hasMoreElements()) {
			JarEntry e = entries.nextElement();
			if (!e.getName().startsWith("META-INF")  || e.getName().contains("Factory")) {

				try {
					out.putNextEntry(new JarEntry(e.getName()));
					if (e.getSize() > 0) {
						InputStream in = new BufferedInputStream(f.getInputStream(e));
						byte[] buffer = new byte[4096];
						while (true) {
							int count = in.read(buffer);
							if (count == -1)
								break;
							out.write(buffer, 0, count);
						}
						in.close();
					}
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
		f.close();
	}

	protected void addChild(File directory, List<File> filesToAdd) {
		final File[] files = directory.listFiles();
		final int length = files.length;
		for (int i = 0; i < length; i++) {

			final File f = files[i];
			if (f.isDirectory()) {
				addChild(f, filesToAdd);
			} else {
				filesToAdd.add(f);
			}
		}

	}

	protected void add(File source, int pathLenght, JarOutputStream target) throws IOException {
		BufferedInputStream in = null;
		try {
			String name = source.getPath().replace('\\', '/');
			name = name.substring(pathLenght);
			if (source.isDirectory()) {

				if (!name.isEmpty()) {
					if (!name.endsWith("/"))
						name += "/";
					JarEntry entry = new JarEntry(name);

					target.putNextEntry(entry);
					target.closeEntry();
				}
				for (File nestedFile : source.listFiles()) {
					add(nestedFile, pathLenght, target);
				}
				return;
			}

			JarEntry entry = new JarEntry(name);
			entry.setTime(source.lastModified());
			target.putNextEntry(entry);
			in = new BufferedInputStream(new FileInputStream(source));

			byte[] buffer = new byte[2048];
			while (true) {
				int count = in.read(buffer);
				if (count == -1)
					break;
				target.write(buffer, 0, count);
			}
			target.closeEntry();
		} finally {
			if (in != null)
				in.close();
		}
	}

	public static void main(String[] args) throws Exception {
		JarPackager p = new JarPackager(new File("dist"));
		long t1 = System.nanoTime();
		p.createMQTTJar();
		p.createToolboxJar();
		long t2 = System.nanoTime();
		System.out.println("Total time: " + (t2 - t1) / 1000000 + " ms");
	}
}
