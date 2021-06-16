import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lms;",
		garbageValue = "-1968333950"
	)
	@Export("get")
	PlatformInfo get();
}
