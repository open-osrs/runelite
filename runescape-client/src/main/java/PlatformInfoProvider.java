import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public interface PlatformInfoProvider {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lmr;",
		garbageValue = "-1896317364"
	)
	PlatformInfo get();
}
