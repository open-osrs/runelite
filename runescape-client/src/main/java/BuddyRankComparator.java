import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fy")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("n")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lky;Lky;B)I",
		garbageValue = "-42"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZB)I",
		garbageValue = "1"
	)
	static int method3622(int var0, Script var1, boolean var2) {
		Widget var6;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1146
			int var4;
			if (var0 == 1928) { // L: 1163
				var6 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1164
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1165
				if (var4 >= 1 && var4 <= 10) { // L: 1166
					ApproximateRouteStrategy.widgetDefaultMenuAction(var4, var6.id, var6.childIndex, var6.itemId, ""); // L: 1169
					return 1; // L: 1170
				} else {
					throw new RuntimeException(); // L: 1167
				}
			} else if (var0 == 2928) { // L: 1172
				Interpreter.Interpreter_intStackSize -= 3; // L: 1173
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1174
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1175
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1176
				if (var5 >= 1 && var5 <= 10) { // L: 1177
					ApproximateRouteStrategy.widgetDefaultMenuAction(var5, var3, var4, class237.getWidget(var3).itemId, ""); // L: 1180
					return 1; // L: 1181
				} else {
					throw new RuntimeException(); // L: 1178
				}
			} else {
				return 2; // L: 1183
			}
		} else if (Interpreter.field1123 >= 10) { // L: 1147
			throw new RuntimeException(); // L: 1148
		} else {
			if (var0 >= 2000) { // L: 1151
				var6 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1152
			} else {
				var6 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1154
			}

			if (var6.onResize == null) { // L: 1155
				return 0;
			} else {
				ScriptEvent var7 = new ScriptEvent(); // L: 1156
				var7.widget = var6; // L: 1157
				var7.args = var6.onResize; // L: 1158
				var7.field593 = Interpreter.field1123 + 1; // L: 1159
				Client.scriptEvents.addFirst(var7); // L: 1160
				return 1; // L: 1161
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "-866624945"
	)
	static int method3621(int var0, Script var1, boolean var2) {
		Widget var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1187
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1188
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1189
			return 1; // L: 1190
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1192
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1193
			return 1; // L: 1194
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1196
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1197
			return 1; // L: 1198
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1200
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1201
			return 1; // L: 1202
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1204
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1205
			return 1; // L: 1206
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1208
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1209
			return 1; // L: 1210
		} else {
			return 2; // L: 1212
		}
	}
}
