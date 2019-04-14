/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2018 Abex
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.rs;

import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import io.sigpipe.jbsdiff.InvalidHeaderException;
import io.sigpipe.jbsdiff.Patch;

import java.applet.Applet;
import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import lombok.extern.slf4j.Slf4j;

import static java.nio.file.StandardOpenOption.CREATE_NEW;
import static java.nio.file.StandardOpenOption.WRITE;
import static net.runelite.client.rs.ClientUpdateCheckMode.*;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.runelite.client.util.BootstrapParser;
import net.runelite.http.api.RuneLiteAPI;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.compress.compressors.CompressorException;
import org.json.simple.parser.ParseException;

@Slf4j
@Singleton
public class ClientLoader
{
    private final boolean dumpClasses;
    private final ClientConfigLoader clientConfigLoader;
    private ClientUpdateCheckMode updateCheckMode;
    
    private static final int BUFFER_SIZE = 1024 * 1024 * 4; // 4mb
    
    @Inject
    private ClientLoader(
            @Named("updateCheckMode") final ClientUpdateCheckMode updateCheckMode,
            @Named("dumpClasses") final boolean dumpClasses,
            final ClientConfigLoader clientConfigLoader)
    {
        this.updateCheckMode = updateCheckMode;
        this.dumpClasses = dumpClasses;
        this.clientConfigLoader = clientConfigLoader;
    }
    
    public Applet load()
    {
        if (updateCheckMode == NONE)
        {
            return null;
        }
        
        try
        {
            RSConfig config = clientConfigLoader.fetch();
            
            Map<String, byte[]> zipFile = new HashMap<>();
            {
                Certificate[] jagexCertificateChain = getJagexCertificateChain();
                String codebase = config.getCodeBase();
                String initialJar = config.getInitialJar();
                URL url = new URL(codebase + initialJar);
                Request request = new Request.Builder()
                        .url(url)
                        .build();
                
                try (Response response = RuneLiteAPI.CLIENT.newCall(request).execute())
                {
                    JarInputStream jis = new JarInputStream(response.body().byteStream());
                    
                    byte[] tmp = new byte[4096];
                    ByteArrayOutputStream buffer = new ByteArrayOutputStream(BUFFER_SIZE);
                    for (; ; )
                    {
                        JarEntry metadata = jis.getNextJarEntry();
                        if (metadata == null)
                        {
                            break;
                        }
                        
                        buffer.reset();
                        for (; ; )
                        {
                            int n = jis.read(tmp);
                            if (n <= -1)
                            {
                                break;
                            }
                            buffer.write(tmp, 0, n);
                        }

						/*if (!Arrays.equals(metadata.getCertificates(), jagexCertificateChain))
						{
							if (metadata.getName().startsWith("META-INF/"))
							{
								// META-INF/JAGEXLTD.SF and META-INF/JAGEXLTD.RSA are not signed, but we don't need
								// anything in META-INF anyway.
								continue;
							}
							else
							{
								throw new VerificationException("Unable to verify jar entry: " + metadata.getName());
							}
						}*/
                        
                        zipFile.put(metadata.getName(), buffer.toByteArray());
                    }
                }
            }
            
            if (updateCheckMode == AUTO)
            {
                Map<String, String> hashes;
                try (InputStream is = ClientLoader.class.getResourceAsStream("/patch/hashes.json"))
                {
                    hashes = new Gson().fromJson(new InputStreamReader(is), new TypeToken<HashMap<String, String>>()
                    {
                    }.getType());
                }
                
                for (Map.Entry<String, String> file : hashes.entrySet())
                {
                    byte[] bytes = zipFile.get(file.getKey());
                    
                    String ourHash = null;
                    if (bytes != null)
                    {
                        ourHash = Hashing.sha512().hashBytes(bytes).toString();
                    }
                    
                    if (!file.getValue().equals(ourHash))
                    {
                        log.debug("{} had a hash mismatch; falling back to vanilla. {} != {}", file.getKey(),
                                file.getValue(), ourHash);
                        log.info("Client is outdated!");
                        updateCheckMode = VANILLA;
                        break;
                    }
                }
            }
            
            File rlFolder = new File(System.getProperty("user.home"), ".runelite");
            File patchStageOneDir = new File(rlFolder, "patchOne");
            File rlPatches = new File(rlFolder, "runelite-patches");
            File rlPatchJar = new File(rlFolder, "rl-patches.jar");
            deleteDir(rlPatches);
            deleteDir(patchStageOneDir);
            patchStageOneDir.mkdirs();
            rlPatches.mkdirs();
            
            if (updateCheckMode == AUTO)
            {
                ByteArrayOutputStream patchOs = new ByteArrayOutputStream(BUFFER_SIZE);
                int patchCount = 0;
                BootstrapParser.run();
                downloadFile(BootstrapParser.getClientPatchesUrl(), rlPatchJar);
                
                ZipFile zF = new ZipFile(rlPatchJar);
                zF.extractAll(rlPatches.getAbsolutePath());
                
                File actualDir = new File(rlPatches, "patch");
                
                for (Map.Entry<String, byte[]> file : zipFile.entrySet())
                {
                    
                    if (!file.getKey().contains(".class"))
                    {
                        continue;
                    }
                    
                    byte[] bytes = ByteStreams.toByteArray(new FileInputStream(new File(actualDir, file.getKey() +
                            ".bs")));
                    
                    patchOs.reset();
                    log.debug("Patching class: {}, Patch length: {}, Class length: {}", file.getKey(), bytes.length,
                            file.getValue().length);
                    Patch.patch(file.getValue(), bytes, patchOs);
                    byte[] newClass = patchOs.toByteArray();
                    log.debug("New size: {}", newClass.length);
                    File targ = new File(patchStageOneDir, file.getKey());
                    if (targ.exists())
                    {
                        targ.delete();
                    }
                    Files.write(targ.toPath(), newClass, CREATE_NEW,
                            WRITE);
                    //file.setValue(patchOs.toByteArray());
                    
                    ++patchCount;
                }
                
                log.debug("Patched {} classes", patchCount);
            }
            
            log.info("Patching for PKLite");
            
            if (updateCheckMode == AUTO)
            {
                ByteArrayOutputStream patchOs = new ByteArrayOutputStream(BUFFER_SIZE);
                int patchCount = 0;
                
                File patchesFolder = new File(rlFolder, "pklite-patches");
                File patchesJar = new File(rlFolder, "pklite-patches.jar");
                File finalClasses = new File(rlFolder, "patchedTwo");
                deleteDir(finalClasses);
                deleteDir(patchesFolder);
                finalClasses.mkdirs();
                patchesFolder.mkdirs();
                
                downloadFile("https://gitlab.com/pklitedev/bootstrap/raw/master/patches.jar", patchesJar);
                
                ZipFile zF = new ZipFile(patchesJar);
                zF.extractAll(patchesFolder.getAbsolutePath());
                
                File bsFolder = new File(patchesFolder, "patch");
                
                for (File patchFile : bsFolder.listFiles())
                {
                    String className =
                            patchFile.getName().substring(0, patchFile.getName().length() - 3);
                    byte[] patchBytes = ByteStreams.toByteArray(new FileInputStream(patchFile));
                    byte[] originalClass = ByteStreams.toByteArray(new FileInputStream(new File(patchStageOneDir,
                            className)));
                    patchOs.reset();
                    log.debug("Patching {}", className);
                    Patch.patch(originalClass, patchBytes, patchOs);
                    File targ = new File(finalClasses, className);
                    if (targ.exists())
                    {
                        targ.delete();
                    }
                    Files.write(targ.toPath(), patchOs.toByteArray(), CREATE_NEW,
                            WRITE);
                    patchCount++;
                }

                /*for (File patchFile : new File(patchesFolder, "patch").listFiles())
                {
                    if (!patchFile.getName().endsWith(".bs"))
                    {
                        continue;
                    }
                    String clazz = patchFile.getName().substring(0, patchFile.getName().length()-3);
                    FileInputStream fis = new FileInputStream(patchFile);
                    byte[] patch = ByteStreams.toByteArray(fis);
                    fis.close();
                    byte[] currentClass = zipFile.get(clazz);
                    patchOs.reset();
                    log.info("Patching {}", clazz);
                    Patch.patch(currentClass, patch, patchOs);
                    zipFile.put(clazz, patchOs.toByteArray());
                    patchCount++;
                }*/
            log.info("Patched {} classes", patchCount);
            
            // TODO: populate zipFile
            zipFile.clear();
            
            for (File file : patchStageOneDir.listFiles())
            {
                String fileName = file.getName();
                if (!(finalClasses.listFiles((file2) -> file2.getName().equals(fileName)).length > 0))
                {
                    Files.copy(file.toPath(), new File(finalClasses, fileName).toPath());
                }
            }
            
            Files.walk(finalClasses.toPath()).sorted(Comparator.reverseOrder()).map(Path::toFile)
                    .filter((f) -> f.getName().contains(".class")).forEach((patchedClass) ->
            {
                try
                {
                    zipFile.put(patchedClass.getName(),
                            ByteStreams.toByteArray(new FileInputStream(patchedClass)));
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                    System.exit(-6969);
                }
            });
        }
        
        
        if (dumpClasses)
        {
            File dumpedDir = new File(rlFolder, "dumped-classes");
            dumpedDir.mkdirs();
            for (Map.Entry<String, byte[]> file : zipFile.entrySet())
            {
                if (!file.getKey().contains(".class"))
                {
                    continue;
                }
                File clazz = new File(dumpedDir, file.getKey());
                Files.write(clazz.toPath(), file.getValue());
            }
        }
        
        String initialClass = config.getInitialClass();
        
        ClassLoader rsClassLoader = new ClassLoader(ClientLoader.class.getClassLoader())
        {
            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException
            {
                String path = name.replace('.', '/').concat(".class");
                byte[] data = zipFile.get(path);
                if (data == null)
                {
                    throw new ClassNotFoundException(name);
                }
                
                return defineClass(name, data, 0, data.length);
            }
        };
        
        Class<?> clientClass = rsClassLoader.loadClass(initialClass);
        
        Applet rs = (Applet) clientClass.newInstance();
        rs.setStub(new RSAppletStub(config));
        return rs;
    }
        catch(IOException |ClassNotFoundException |InstantiationException |IllegalAccessException
                |CompressorException |InvalidHeaderException |CertificateException
                |
    SecurityException e)
    
    {
        if (e instanceof ClassNotFoundException)
        {
            log.error("Unable to load client - class not found. This means you"
                    + " are not running RuneLite with Maven as the client patch"
                    + " is not in your classpath.");
        }
        
        log.error("Error loading RS!", e);
        return null;
    }
        catch(ZipException |
    ParseException ignored)
    
    {
        return null;
    }
    
}
    
    private static Certificate[] getJagexCertificateChain() throws CertificateException
    {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        Collection<? extends Certificate> certificates =
                certificateFactory.generateCertificates(ClientLoader.class.getResourceAsStream("jagex.crt"));
        return certificates.toArray(new Certificate[certificates.size()]);
    }
    
    public void downloadFile(String source, File dest) throws IOException
    {
        ReadableByteChannel readChannel = Channels.newChannel(new URL(source).openStream());
        FileOutputStream fileOS = new FileOutputStream(dest);
        FileChannel writeChannel = fileOS.getChannel();
        writeChannel.transferFrom(readChannel, 0, Long.MAX_VALUE);
    }
    
    static void deleteDir(File file) throws IOException
    {
        if (!file.exists())
        {
            return;
        }
        Files.walk(file.toPath())
                .sorted(Comparator.reverseOrder())
                .map(Path::toFile)
                .forEach(File::delete);
    }
    
}
