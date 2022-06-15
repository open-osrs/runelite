import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aj")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1448497001
	)
	static int field247;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1169863591
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 181292073
	)
	@Export("size")
	int size;
	@ObfuscatedName("q")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("j")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("e")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("g")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("w")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1131201261"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		MouseRecorder.sortWorlds(class362.World_worlds, 0, class362.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1378535469"
	)
	public static void method579() {
		class272.midiPcmStream.clear();
		class272.musicPlayerStatus = 1;
		class272.musicTrackArchive = null; // L: 43
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "-8124"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "-232696808"
	)
	static int method576(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1279
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1296
				var7 = var2 ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget; // L: 1297
				var4 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1298
				if (var4 >= 1 && var4 <= 10) { // L: 1299
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId); // L: 1302
					Interpreter.field843.add(var8); // L: 1303
					return 1; // L: 1304
				} else {
					throw new RuntimeException(); // L: 1300
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1306
				class446.Interpreter_intStackSize -= 3; // L: 1307
				int var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 1308
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 1309
				int var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 1310
				if (var5 >= 1 && var5 <= 10) { // L: 1311
					class93 var6 = new class93(var5, var3, var4, class140.getWidget(var3).itemId); // L: 1314
					Interpreter.field843.add(var6); // L: 1315
					return 1; // L: 1316
				} else {
					throw new RuntimeException(); // L: 1312
				}
			} else {
				return 2; // L: 1318
			}
		} else if (Interpreter.field850 >= 10) { // L: 1280
			throw new RuntimeException(); // L: 1281
		} else {
			if (var0 >= 2000) { // L: 1284
				var7 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 1285
			} else {
				var7 = var2 ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget; // L: 1287
			}

			if (var7.onResize == null) { // L: 1288
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1289
				var9.widget = var7; // L: 1290
				var9.args = var7.onResize; // L: 1291
				var9.field1056 = Interpreter.field850 + 1; // L: 1292
				Client.scriptEvents.addFirst(var9); // L: 1293
				return 1; // L: 1294
			}
		}
	}
}
