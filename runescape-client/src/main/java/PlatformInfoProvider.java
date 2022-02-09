import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lom;",
		garbageValue = "-1769654640"
	)
	@Export("get")
	PlatformInfo get();
}
