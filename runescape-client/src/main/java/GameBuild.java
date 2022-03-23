import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kx")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("l")
	@Export("name")
	public final String name;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -643398901
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0); // L: 5
		BUILDLIVE = new GameBuild("BUILDLIVE", 3); // L: 6
		RC = new GameBuild("RC", 1); // L: 7
		WIP = new GameBuild("WIP", 2); // L: 8
	}

	GameBuild(String var1, int var2) {
		this.name = var1; // L: 13
		this.buildId = var2; // L: 14
	} // L: 15

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Llq;II)Lqx;",
		garbageValue = "-1898780571"
	)
	public static IndexedSprite method5774(AbstractArchive var0, int var1) {
		return !AbstractUserComparator.method6771(var0, var1) ? null : Clock.method3323(); // L: 100 101
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-1736889340"
	)
	static int method5775(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class432.scriptDotWidget : class341.scriptActiveWidget; // L: 1130
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1131
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1132
			return 1; // L: 1133
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1135
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1136
			return 1; // L: 1137
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1139
			Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3.text; // L: 1140
			return 1; // L: 1141
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1143
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1144
			return 1; // L: 1145
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1147
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1148
			return 1; // L: 1149
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1151
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1152
			return 1; // L: 1153
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1155
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1156
			return 1; // L: 1157
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1159
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1160
			return 1; // L: 1161
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1163
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1164
			return 1; // L: 1165
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1167
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1168
			return 1; // L: 1169
		} else if (var0 == 1610) { // L: 1171
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1172
			return 1; // L: 1173
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1175
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.color; // L: 1176
			return 1; // L: 1177
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1179
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.color2; // L: 1180
			return 1; // L: 1181
		} else if (var0 == 1613) { // L: 1183
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1184
			return 1; // L: 1185
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1187
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1188
			return 1; // L: 1189
		} else if (var0 != 1615 && var0 != 1616) { // L: 1191
			return 2; // L: 1195
		} else {
			++class295.Interpreter_intStackSize; // L: 1192
			return 1; // L: 1193
		}
	}
}
