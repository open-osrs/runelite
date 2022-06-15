import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Los;",
		garbageValue = "51821248"
	)
	@Export("get")
	PlatformInfo get();
}
