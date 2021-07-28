import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lmz;",
		garbageValue = "41"
	)
	@Export("get")
	PlatformInfo get();
}
