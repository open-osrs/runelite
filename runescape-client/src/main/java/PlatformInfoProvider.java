import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lom;",
		garbageValue = "-12"
	)
	@Export("get")
	PlatformInfo get();
}
