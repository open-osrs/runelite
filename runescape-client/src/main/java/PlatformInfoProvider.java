import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lms;",
		garbageValue = "-741799305"
	)
	@Export("get")
	PlatformInfo get();
}
