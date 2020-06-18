import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)Lmc;",
		garbageValue = "-1826697521"
	)
	@Export("get")
	PlatformInfo get();
}
