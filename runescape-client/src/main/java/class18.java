import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
class class18 implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("KitDefinition_archive")
	static AbstractArchive KitDefinition_archive;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ly;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1; // L: 40
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "105"
	)
	int method239(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 42
	}

	public int compare(Object var1, Object var2) {
		return this.method239((Entry)var1, (Entry)var2); // L: 46
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 50
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-106"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = class1.method9(var0);
		int var2 = var1.baseVar; // L: 25
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "87"
	)
	static int method243(int var0, int var1) {
		if (var0 == -2) { // L: 15
			return 12345678;
		} else if (var0 == -1) { // L: 16
			if (var1 < 0) { // L: 17
				var1 = 0; // L: 18
			} else if (var1 > 127) { // L: 20
				var1 = 127; // L: 21
			}

			var1 = 127 - var1; // L: 23
			return var1; // L: 24
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 26
			if (var1 < 2) { // L: 27
				var1 = 2;
			} else if (var1 > 126) { // L: 28
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 29
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpc;I)I",
		garbageValue = "-1204366603"
	)
	static int method249(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 187
		int var2;
		if (var1 == 0) { // L: 189
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5); // L: 190
		} else if (var1 == 2) { // L: 191
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 192
		}

		return var2; // L: 193
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lki;IIIB)V",
		garbageValue = "-44"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12373
		if (var4 != null) { // L: 12374
			if (Client.minimapState < 3) { // L: 12375
				SoundSystem.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12376
			}

		}
	} // L: 12377
}
