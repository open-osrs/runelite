import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iv")
@Implements("PlayerType")
public enum PlayerType implements Enumerated {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	field3132(6, 22, false, false, true);

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("a")
	public static boolean field3137;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -765581079
	)
	@Export("id")
	final int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1093542945
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("l")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("s")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 24
		this.modIcon = var4; // L: 25
		this.isPrivileged = var6; // L: 26
		this.isUser = var7; // L: 27
	} // L: 28

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 31
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "2124061265"
	)
	static void method4345(Component var0) {
		var0.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 119
		var0.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 120
		KeyHandler.field417 = -1; // L: 121
	} // L: 122

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "373518150"
	)
	static int method4346(int var0, Script var1, boolean var2) {
		Widget var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1216
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1217
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1218
			return 1; // L: 1219
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1221
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1222
			return 1; // L: 1223
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1225
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1226
			return 1; // L: 1227
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1229
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1230
			return 1; // L: 1231
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1233
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1234
			return 1; // L: 1235
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1237
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1238
			return 1; // L: 1239
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1241
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1242
			return 1; // L: 1243
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1245
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1246
			return 1; // L: 1247
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1249
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1250
			return 1; // L: 1251
		} else if (var0 == ScriptOpcodes.IF_GETTRANSTOP) { // L: 1253
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1254
			return 1; // L: 1255
		} else if (var0 == ScriptOpcodes.IF_GETTRANSBOT) { // L: 1257
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1258
			return 1; // L: 1259
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1261
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1262
			return 1; // L: 1263
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1265
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1266
			return 1; // L: 1267
		} else if (var0 == ScriptOpcodes.IF_GETFILLMODE) { // L: 1269
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1270
			return 1; // L: 1271
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1273
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1274
			return 1; // L: 1275
		} else {
			return 2; // L: 1277
		}
	}
}
