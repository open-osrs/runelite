import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lmf;",
		garbageValue = "-1820791637"
	)
	@Export("get")
	PlatformInfo get();
}
