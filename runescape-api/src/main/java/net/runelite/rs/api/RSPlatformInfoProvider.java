package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSPlatformInfoProvider {
    @Import("get")
    RSPlatformInfo get();
}
