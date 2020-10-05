import java.io.File;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aa")
public class WorldMapDecoration {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1951458321
	)
	final int objectDefinitionId;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1622720231
	)
	final int decoration;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1680868715
	)
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "1315266294"
	)
	static void method406(File var0) {
		FileSystem.FileSystem_cacheDir = var0; // L: 16
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-1984297327"
	)
	static int method405(int var0, Script var1, boolean var2) {
		Widget var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1285
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1286
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.Widget_unpackTargetMask(WorldMapIcon_0.getWidgetFlags(var3)); // L: 1287
			return 1; // L: 1288
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1290
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1297
				if (var3.dataText == null) { // L: 1298
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1299
				}

				return 1; // L: 1300
			} else {
				return 2; // L: 1302
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1291
			--var4; // L: 1292
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1293
				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1294
			} else {
				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1295
		}
	}
}
