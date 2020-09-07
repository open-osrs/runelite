import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lmr;",
		garbageValue = "-1896317364"
	)
	@Export("get")
	PlatformInfo get();
}
