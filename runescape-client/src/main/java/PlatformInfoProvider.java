import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lmy;",
		garbageValue = "-10"
	)
	@Export("get")
	PlatformInfo get();
}
