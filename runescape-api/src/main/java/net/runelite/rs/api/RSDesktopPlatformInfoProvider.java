package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSDesktopPlatformInfoProvider extends RSPlatformInfoProvider {
    @Import("javaVersionMajor")
    int getJavaVersionMajor();
    @Import("javaVersionMinor")
    int getJavaVersionMinor();
    @Import("javaVersionPatch")
    int getJavaVersionPatch();

    @Import("parseJavaVersion")
    void parseJavaVersion(String version);
    @Import("parseJava1Version")
    void parseJava1Version(String version);
    @Import("parseJavaGeneralVersion")
    void parseJavaGeneralVersion(String version);
}
