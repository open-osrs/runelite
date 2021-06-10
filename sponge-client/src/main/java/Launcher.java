/*
 * ISC License
 *
 * Copyright (c) 2017-2019, Hunter WB <hunterwb.com>
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

import net.runelite.mapping.ObfuscatedName;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.applet.AudioClip;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.InvalidParameterException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

@SuppressWarnings("deprecation")
public final class Launcher implements AppletStub, AppletContext {
    static ClassLoader classLoader;

    static
    {
        classLoader = null;
        try {
            classLoader = classLoader(gamepackUrl());
            Thread.currentThread().setContextClassLoader(classLoader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws Exception {
        System.setProperty("sun.awt.noerasebackground", "true"); // fixes resize flickering

        Launcher c = load();

        Applet applet = c.loadApplet();

        JFrame frame = new JFrame(c.title());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(applet);
        frame.pack();
        frame.setMinimumSize(frame.getSize());
        frame.setPreferredSize(frame.getSize());
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

        applet.init();
        applet.start();
    }

    private final Map<String, String> properties;

    private final Map<String, String> parameters;

    private Launcher(
            Map<String, String> properties,
            Map<String, String> parameters
    ) {
        this.properties = properties;
        this.parameters = parameters;
    }

    public static Launcher load() throws IOException {
        Map<String, String> properties = new HashMap<>();
        Map<String, String> parameters = new HashMap<>();
        URL url = new URL("http://oldschool.runescape.com/jav_config.ws");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.ISO_8859_1))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split1 = line.split("=", 2);
                switch (split1[0]) {
                    case "param":
                        String[] split2 = split1[1].split("=", 2);
                        parameters.put(split2[0], split2[1]);
                        break;
                    case "msg":
                        // ignore
                        break;
                    default:
                        properties.put(split1[0], split1[1]);
                }
            }
        }
        return new Launcher(properties, parameters);
    }

    public Applet loadApplet() throws Exception {
        Applet applet = (Applet) classLoader.loadClass(initialClass()).newInstance();

        applet.setStub(this);
        applet.setMaximumSize(appletMaxSize());
        applet.setMinimumSize(appletMinSize());
        applet.setPreferredSize(applet.getMinimumSize());
        return applet;
    }

    public String title() {
        return properties.get("title");
    }

    private Dimension appletMinSize() {
        return new Dimension(
                Integer.parseInt(properties.get("applet_minwidth")),
                Integer.parseInt(properties.get("applet_minheight"))
        );
    }

    private Dimension appletMaxSize() {
        return new Dimension(
                Integer.parseInt(properties.get("applet_maxwidth")),
                Integer.parseInt(properties.get("applet_maxheight"))
        );
    }

    private static URL gamepackUrl() throws MalformedURLException {
        return new File("./build/injected/injected-client.jar").toURI().toURL();
    }

    private String initialClass() {
        return "Client";
    }

    @Override public URL getCodeBase() {
        try {
            return new URL(properties.get("codebase"));
        } catch (MalformedURLException e) {
            throw new InvalidParameterException();
        }
    }

    @Override public URL getDocumentBase() {
        return getCodeBase();
    }

    @Override public boolean isActive() {
        return true;
    }

    @Override public String getParameter(String name) {
        return parameters.get(name);
    }

    @Override public void showDocument(URL url) {
        try {
            Desktop.getDesktop().browse(url.toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override public void showDocument(URL url, String target) {
        showDocument(url);
    }

    @Override public AppletContext getAppletContext() {
        return this;
    }

    @Override public void appletResize(int width, int height) {}

    @Override public AudioClip getAudioClip(URL url) {
        throw new UnsupportedOperationException();
    }

    @Override public Image getImage(URL url) {
        throw new UnsupportedOperationException();
    }

    @Override public Applet getApplet(String name) {
        throw new UnsupportedOperationException();
    }

    @Override public Enumeration<Applet> getApplets() {
        throw new UnsupportedOperationException();
    }

    @Override public void showStatus(String status) {
        throw new UnsupportedOperationException();
    }

    @Override public void setStream(String key, InputStream stream) {
        throw new UnsupportedOperationException();
    }

    @Override public InputStream getStream(String key) {
        throw new UnsupportedOperationException();
    }

    @Override public Iterator<String> getStreamKeys() {
        throw new UnsupportedOperationException();
    }

    private static ClassLoader classLoader(URL jarUrl) throws IOException {
        Map<String, byte[]> files = new HashMap<>();
        try (JarInputStream jar = new JarInputStream(new BufferedInputStream(jarUrl.openStream()))) {
            JarEntry entry;
            while ((entry = jar.getNextJarEntry()) != null) {
                files.put('/' + entry.getName(), jar.readAllBytes());
            }
        }
        return new URLClassLoader(new URL[]{new File("./build/injected/injected-client.jar").toURL()});
    }
}