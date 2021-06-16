import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("bq")
	@Export("otp")
	static String otp;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -193076461
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 314356507
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -695126527
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 5487494310770586269L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 400175677
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;Ljp;Lie;B)Z",
		garbageValue = "0"
	)
	public static boolean method3860(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class233.musicPatchesArchive = var0; // L: 26
		class233.musicSamplesArchive = var1; // L: 27
		class230.soundEffectsArchive = var2; // L: 28
		class233.midiPcmStream = var3; // L: 29
		return true; // L: 30
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-395066972"
	)
	public static boolean method3861(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) { // L: 45
			if (var0 != 0) { // L: 46
				char[] var1 = class302.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) {
						return true; // L: 52
					}
				}
			}

			return false; // L: 57
		} else {
			return true;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BII)I",
		garbageValue = "-1419386207"
	)
	public static int method3863(byte[] var0, int var1) {
		int var3 = -1; // L: 47

		for (int var4 = 0; var4 < var1; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 54
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Liv;III)V",
		garbageValue = "-1678262366"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 10899
			if (var0 != null) { // L: 10901
				Widget var4 = PlayerComposition.method4851(var0); // L: 10904
				if (var4 == null) { // L: 10905
					var4 = var0.parent;
				}

				if (var4 != null) { // L: 10908
					Client.clickedWidget = var0; // L: 10912
					var4 = PlayerComposition.method4851(var0); // L: 10915
					if (var4 == null) {
						var4 = var0.parent; // L: 10916
					}

					Client.clickedWidgetParent = var4; // L: 10919
					Client.widgetClickX = var1; // L: 10920
					Client.widgetClickY = var2; // L: 10921
					UserComparator7.widgetDragDuration = 0; // L: 10922
					Client.isDraggingWidget = false; // L: 10923
					int var5 = HealthBarUpdate.method2283(); // L: 10924
					if (var5 != -1) { // L: 10925
						WorldMapIcon_1.method3305(var5);
					}

					return; // L: 10926
				}
			}

		}
	} // L: 10910
}
