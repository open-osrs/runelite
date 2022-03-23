import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lov;",
		garbageValue = "0"
	)
	@Export("get")
	PlatformInfo get();
}
