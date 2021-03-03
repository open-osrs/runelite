import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lmn;",
		garbageValue = "583399336"
	)
	@Export("get")
	PlatformInfo get();
}
