import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 484977617
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 341413753
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("i")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("f")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 943
		this.height = var2; // L: 944
		this.xWidths = var3; // L: 945
		this.xStarts = var4; // L: 946
	} // L: 947

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "24"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 950
			int var3 = this.xStarts[var2]; // L: 951
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 952
				return true;
			}
		}

		return false; // L: 954
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lbb;Lbb;IZB)I",
		garbageValue = "7"
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
			return var0.method1639() ? (var1.method1639() ? 0 : 1) : (var1.method1639() ? -1 : 0);
		} else if (var2 == 5) { // L: 230
			return var0.method1637() ? (var1.method1637() ? 0 : 1) : (var1.method1637() ? -1 : 0);
		} else if (var2 == 6) { // L: 231
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 232
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 233
		}
	}
}
