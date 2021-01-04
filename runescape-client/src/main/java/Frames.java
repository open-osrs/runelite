import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ep")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Leu;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;IZ)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque();
		int var6 = var1.getGroupFileCount(var3); // L: 36
		this.frames = new Animation[var6]; // L: 37
		int[] var7 = var1.getGroupFileIds(var3); // L: 38

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 39
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 40
			Skeleton var10 = null; // L: 41
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 42

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 43 44 49
				if (var11 == var12.id) { // L: 45
					var10 = var12; // L: 46
					break;
				}
			}

			if (var10 == null) { // L: 51
				byte[] var13;
				if (var4) { // L: 53
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0); // L: 54
				}

				var10 = new Skeleton(var11, var13); // L: 55
				var5.addFirst(var10); // L: 56
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 58
		}

	} // L: 60

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1239705769"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 63
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-67"
	)
	static int method3356(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "2053155417"
	)
	static int method3354(int var0, Script var1, boolean var2) {
		Widget var6;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1145
			int var4;
			if (var0 == 1928) { // L: 1162
				var6 = var2 ? PlayerComposition.field2561 : VarcInt.scriptActiveWidget; // L: 1163
				var4 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1164
				if (var4 >= 1 && var4 <= 10) { // L: 1165
					class3.widgetDefaultMenuAction(var4, var6.id, var6.childIndex, var6.itemId, ""); // L: 1168
					return 1; // L: 1169
				} else {
					throw new RuntimeException(); // L: 1166
				}
			} else if (var0 == 2928) { // L: 1171
				VarcInt.Interpreter_intStackSize -= 3; // L: 1172
				int var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 1173
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1174
				int var5 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 1175
				if (var5 >= 1 && var5 <= 10) { // L: 1176
					class3.widgetDefaultMenuAction(var5, var3, var4, CollisionMap.getWidget(var3).itemId, ""); // L: 1179
					return 1; // L: 1180
				} else {
					throw new RuntimeException(); // L: 1177
				}
			} else {
				return 2; // L: 1182
			}
		} else if (Interpreter.field1097 >= 10) { // L: 1146
			throw new RuntimeException(); // L: 1147
		} else {
			if (var0 >= 2000) { // L: 1150
				var6 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 1151
			} else {
				var6 = var2 ? PlayerComposition.field2561 : VarcInt.scriptActiveWidget; // L: 1153
			}

			if (var6.onResize == null) { // L: 1154
				return 0;
			} else {
				ScriptEvent var7 = new ScriptEvent(); // L: 1155
				var7.widget = var6; // L: 1156
				var7.args = var6.onResize; // L: 1157
				var7.field569 = Interpreter.field1097 + 1; // L: 1158
				Client.scriptEvents.addFirst(var7); // L: 1159
				return 1; // L: 1160
			}
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-41"
	)
	static final void method3352(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 7336
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 7337
				Client.field901[var4] = true;
			}
		}

	} // L: 7339
}
