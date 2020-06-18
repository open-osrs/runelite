import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class234 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lko;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("s")
	static String[] field3096;

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		signature = "(Lhd;I)V",
		garbageValue = "-750902552"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field877) {
			Client.field813[var0.rootIndex] = true;
		}

	}
}
