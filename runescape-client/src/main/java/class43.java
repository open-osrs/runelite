import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class43 {
	@ObfuscatedName("r")
	static byte[][][] field307;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1455356622"
	)
	static int method527(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4210
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4215
				if (var0 == 6750) { // L: 4219
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 4220
					return 1; // L: 4221
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4223
					if (var0 == 6754) { // L: 4227
						int var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 4228
						NPCComposition var4 = class248.getNpcDefinition(var3); // L: 4229
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4230
						return 1; // L: 4231
					} else {
						return 2; // L: 4233
					}
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4224
					return 1; // L: 4225
				}
			} else {
				--ChatChannel.Interpreter_intStackSize; // L: 4216
				return 1; // L: 4217
			}
		} else {
			ChatChannel.Interpreter_intStackSize -= 2; // L: 4211
			--UserComparator9.Interpreter_stringStackSize; // L: 4212
			return 1; // L: 4213
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIB)V",
		garbageValue = "39"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 9986
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 9987
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 9988
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 9989
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 9990
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 9991
		}

		if (var0.yAlignment == 0) { // L: 9992
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 9993
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 9994
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 9995
		} else if (var0.yAlignment == 4) { // L: 9996
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 9997
		}

	} // L: 9998
}
