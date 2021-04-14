import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lmo;",
		garbageValue = "-740064176"
	)
	@Export("get")
	PlatformInfo get();
}
