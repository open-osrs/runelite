package net.runelite.rs.api;

import net.runelite.mapping.*;

public interface RSPlatformInfo extends RSNode {
    @Import("osType")
    int getOsType();
    @Import("is64bit")
    boolean is64Bit();
    @Import("osVersionType")
    int getOsVersionType();
    @Import("javaVendorType")
    int getJavaVersionType();
    @Import("javaVersionMajor")
    int getJavaMajorVersion();
    @Import("javaVersionMinor")
    int getJavaMinorVersion();
    @Import("javaVersionPatch")
    int getJavaPatchVersion();
    @Import("availableProcessors")
    int getAvailableProcessors();
    @Import("maxMemory")
    int getMaxMemory();

    @Import("write")
    void write(RSBuffer var1);
    @Import("size")
    int getSize();
}
