import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lme;",
		garbageValue = "1154202585"
	)
	@Export("get")
	PlatformInfo get();
}
