import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lnh;",
		garbageValue = "64"
	)
	@Export("get")
	PlatformInfo get();
}
