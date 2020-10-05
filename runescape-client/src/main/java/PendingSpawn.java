import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bs")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1658510555
	)
	int objectId;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 537531937
	)
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -451639577
	)
	int type;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -805517653
	)
	int x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 309622261
	)
	int y;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1728058903
	)
	int field960;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -629147525
	)
	int field961;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -922964443
	)
	int id;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1252885215
	)
	int orientation;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -743478207
	)
	int field964;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1560488333
	)
	int delay;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1735849843
	)
	int hitpoints;

	PendingSpawn() {
		this.delay = 0; // L: 16
		this.hitpoints = -1; // L: 17
	} // L: 19

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "681625855"
	)
	static final int method1795(int var0, int var1) {
		if (var0 == -1) { // L: 863
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 864
			if (var1 < 2) { // L: 865
				var1 = 2;
			} else if (var1 > 126) { // L: 866
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 867
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZB)I",
		garbageValue = "1"
	)
	static int method1794(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Canvas.field438 : class3.field12; // L: 1122
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1123
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.Widget_unpackTargetMask(WorldMapIcon_0.getWidgetFlags(var3)); // L: 1124
			return 1; // L: 1125
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1127
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1134
				if (var3.dataText == null) { // L: 1135
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1136
				}

				return 1; // L: 1137
			} else {
				return 2; // L: 1139
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1128
			--var4; // L: 1129
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1130
				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1131
			} else {
				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1132
		}
	}
}
