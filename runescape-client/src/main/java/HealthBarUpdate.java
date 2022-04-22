import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cp")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1067255387
	)
	public static int field1189;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1328246863
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 399035073
	)
	@Export("health")
	int health;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 573948343
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2144773551
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1624379348"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2; // L: 20
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;IZB)Lim;",
		garbageValue = "-50"
	)
	public static Frames method2185(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "-30"
	)
	static int method2186(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1269
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1286
				var7 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1287
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1288
				if (var4 >= 1 && var4 <= 10) { // L: 1289
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId); // L: 1292
					Interpreter.field843.add(var8); // L: 1293
					return 1; // L: 1294
				} else {
					throw new RuntimeException(); // L: 1290
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1296
				Interpreter.Interpreter_intStackSize -= 3; // L: 1297
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1298
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1299
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1300
				if (var5 >= 1 && var5 <= 10) { // L: 1301
					class93 var6 = new class93(var5, var3, var4, class127.getWidget(var3).itemId); // L: 1304
					Interpreter.field843.add(var6); // L: 1305
					return 1; // L: 1306
				} else {
					throw new RuntimeException(); // L: 1302
				}
			} else {
				return 2; // L: 1308
			}
		} else if (Interpreter.field844 >= 10) { // L: 1270
			throw new RuntimeException(); // L: 1271
		} else {
			if (var0 >= 2000) { // L: 1274
				var7 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1275
			} else {
				var7 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1277
			}

			if (var7.onResize == null) { // L: 1278
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1279
				var9.widget = var7; // L: 1280
				var9.args = var7.onResize; // L: 1281
				var9.field1031 = Interpreter.field844 + 1; // L: 1282
				Client.scriptEvents.addFirst(var9); // L: 1283
				return 1; // L: 1284
			}
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lky;III)V",
		garbageValue = "-1103204446"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10840
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10841
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10842
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10843
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10844
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10845
		}

		if (var0.yAlignment == 0) { // L: 10846
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10847
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10848
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10849
		} else if (var0.yAlignment == 4) { // L: 10850
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10851
		}

	} // L: 10852
}
