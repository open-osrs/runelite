import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("p")
public abstract class class14 extends Node {
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;

	class14() {
	} // L: 68

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	abstract void vmethod339(Buffer var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	abstract void vmethod338(class11 var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	static void method224() {
		Tiles.field1097 = null; // L: 48
		class9.field71 = null; // L: 49
		Tiles.field1088 = null; // L: 50
		Tiles.field1086 = null; // L: 51
		Tiles.field1105 = null; // L: 52
		Tiles.field1090 = null; // L: 53
		StructComposition.field1730 = null; // L: 54
		Tiles.Tiles_hue = null; // L: 55
		class280.Tiles_saturation = null; // L: 56
		Tiles.Tiles_lightness = null; // L: 57
		class20.Tiles_hueMultiplier = null; // L: 58
		AbstractByteArrayCopier.field3115 = null; // L: 59
	} // L: 60

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-5"
	)
	static final void method222(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your ignore list").toString(); // L: 180
		WorldMapScaleHandler.addGameMessage(30, "", var1); // L: 182
	} // L: 184

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "-54"
	)
	static int method216(int var0, Script var1, boolean var2) {
		Widget var3 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 1252
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1253
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.x; // L: 1254
			return 1; // L: 1255
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1257
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.y; // L: 1258
			return 1; // L: 1259
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1261
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.width; // L: 1262
			return 1; // L: 1263
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1265
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.height; // L: 1266
			return 1; // L: 1267
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1269
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1270
			return 1; // L: 1271
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1273
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.parentId; // L: 1274
			return 1; // L: 1275
		} else {
			return 2; // L: 1277
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "-112"
	)
	static int method215(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4158
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4163
				if (var0 == 6750) { // L: 4167
					++class13.Interpreter_stringStackSize; // L: 4168
					return 1; // L: 4169
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4171
					if (var0 == 6754) { // L: 4175
						int var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 4176
						NPCComposition var4 = class8.getNpcDefinition(var3); // L: 4177
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4178
						return 1; // L: 4179
					} else {
						return 2; // L: 4181
					}
				} else {
					++WorldMapCacheName.Interpreter_intStackSize; // L: 4172
					return 1; // L: 4173
				}
			} else {
				--WorldMapCacheName.Interpreter_intStackSize; // L: 4164
				return 1; // L: 4165
			}
		} else {
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 4159
			--class13.Interpreter_stringStackSize; // L: 4160
			return 1; // L: 4161
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-464058040"
	)
	static boolean method223() {
		return (Client.drawPlayerNames & 2) != 0; // L: 4838
	}
}
