import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1826737113
	)
	@Export("width")
	int width;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 813874845
	)
	@Export("height")
	int height;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1282834747
	)
	@Export("x")
	int x;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 568186345
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 303
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lbk;Lbk;IZI)I",
		garbageValue = "1719503771"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 211
			int var4 = var0.population; // L: 212
			int var5 = var1.population; // L: 213
			if (!var3) { // L: 214
				if (var4 == -1) { // L: 215
					var4 = 2001;
				}

				if (var5 == -1) { // L: 216
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 218
		} else if (var2 == 2) { // L: 220
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 221
			if (var0.activity.equals("-")) { // L: 222
				if (var1.activity.equals("-")) { // L: 223
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 224
				}
			} else if (var1.activity.equals("-")) { // L: 226
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 227
			}
		} else if (var2 == 4) { // L: 229
			return var0.method1757() ? (var1.method1757() ? 0 : 1) : (var1.method1757() ? -1 : 0);
		} else if (var2 == 5) { // L: 230
			return var0.method1749() ? (var1.method1749() ? 0 : 1) : (var1.method1749() ? -1 : 0);
		} else if (var2 == 6) { // L: 231
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 232
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 233
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "-36"
	)
	static void method3709(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 11648
		if (Client.randomDatData == null) { // L: 11650
			Client.randomDatData = new byte[24];
		}

		class307.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 11651
		if (JagexCache.JagexCache_randomDat != null) { // L: 11654
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 11656
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 11657
			} catch (Exception var4) { // L: 11659
			}
		}

	} // L: 11662
}
