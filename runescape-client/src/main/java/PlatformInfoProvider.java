import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lnp;",
		garbageValue = "-1940365419"
	)
	@Export("get")
	PlatformInfo get();
}
