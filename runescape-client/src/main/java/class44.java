import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class44 {
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = 1478949061
	)
	static int field315;
	@ObfuscatedName("f")
	@Export("applet")
	static Applet applet;
	@ObfuscatedName("e")
	static String field309;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;

	static {
		applet = null; // L: 10
		field309 = ""; // L: 11
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	static void method532() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 42
	} // L: 43

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "67"
	)
	public static void method540(int var0) {
		if (var0 != -1) { // L: 240
			if (Widget.Widget_loadedInterfaces[var0]) { // L: 241
				AttackOption.Widget_archive.clearFilesGroup(var0); // L: 242
				if (GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0] != null) { // L: 243
					boolean var1 = true; // L: 244

					for (int var2 = 0; var2 < GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0].length; ++var2) { // L: 245
						if (GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2] != null) { // L: 246
							if (GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2].type != 2) { // L: 247
								GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false; // L: 248
							}
						}
					}

					if (var1) {
						GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0] = null; // L: 251
					}

					Widget.Widget_loadedInterfaces[var0] = false; // L: 252
				}
			}
		}
	} // L: 253

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1279481562"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 119
	}
}
