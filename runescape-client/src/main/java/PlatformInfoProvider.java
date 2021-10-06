import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lnr;",
		garbageValue = "-1957452301"
	)
	@Export("get")
	PlatformInfo get();
}
