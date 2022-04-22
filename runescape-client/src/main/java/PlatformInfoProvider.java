import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Loj;",
		garbageValue = "2004856383"
	)
	@Export("get")
	PlatformInfo get();
}
