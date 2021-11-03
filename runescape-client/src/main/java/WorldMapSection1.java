import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gf")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[[Ljf;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("ff")
	static String field2203;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 627592207
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1419661361
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1032024163
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1425416297
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -605929777
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1140960947
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-1844012640"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 17
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 18
		}

		if (var1.regionLowY > this.regionEndY) { // L: 19
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 20
			var1.regionHighY = this.regionEndY;
		}

	} // L: 21

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1501827396"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) { // L: 24
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 27
		} else {
			return false; // L: 25
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-356013678"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 31
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-79"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 35
			return null; // L: 36
		} else {
			int[] var4 = new int[]{var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 38 39 40
			return var4; // L: 41
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Lie;",
		garbageValue = "494177498"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 45
			return null; // L: 46
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 48
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64); // L: 49
			return new Coord(this.minPlane, var3, var4); // L: 50
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-682362313"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 54
		this.planes = var1.readUnsignedByte(); // L: 55
		this.regionStartX = var1.readUnsignedShort(); // L: 56
		this.regionStartY = var1.readUnsignedShort(); // L: 57
		this.regionEndX = var1.readUnsignedShort(); // L: 58
		this.regionEndY = var1.readUnsignedShort(); // L: 59
		this.postRead(); // L: 60
	} // L: 61

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	@Export("postRead")
	void postRead() {
	} // L: 63

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "-4"
	)
	static int method3999(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget; // L: 1116
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1117
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1118
			return 1; // L: 1119
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1121
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1122
			return 1; // L: 1123
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1125
			Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.text; // L: 1126
			return 1; // L: 1127
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1129
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1130
			return 1; // L: 1131
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1133
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1134
			return 1; // L: 1135
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1137
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1138
			return 1; // L: 1139
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1141
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1142
			return 1; // L: 1143
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1145
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1146
			return 1; // L: 1147
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1149
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1150
			return 1; // L: 1151
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1153
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1154
			return 1; // L: 1155
		} else if (var0 == 1610) { // L: 1157
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1158
			return 1; // L: 1159
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1161
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.color; // L: 1162
			return 1; // L: 1163
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1165
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.color2; // L: 1166
			return 1; // L: 1167
		} else if (var0 == 1613) { // L: 1169
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1170
			return 1; // L: 1171
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1173
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1174
			return 1; // L: 1175
		} else if (var0 != 1615 && var0 != 1616) { // L: 1177
			return 2; // L: 1181
		} else {
			++class14.Interpreter_intStackSize; // L: 1178
			return 1; // L: 1179
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "209576607"
	)
	@Export("updateSoundEffectVolume")
	static final void updateSoundEffectVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11403
		class408.clientPreferences.soundEffectsVolume = var0; // L: 11404
		Login.savePreferences(); // L: 11405
	} // L: 11406
}
