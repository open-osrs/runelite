import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ju")
@Implements("ParamDefinition")
public class ParamDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("l")
	@Export("type")
	char type;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 432424679
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("z")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("q")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamDefinition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1987481332"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 31

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-425218539"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.decodeNext(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "1961390575"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			byte var4 = var1.readByte(); // L: 44
			int var5 = var4 & 255; // L: 46
			if (var5 == 0) { // L: 47
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) { // L: 48
				char var6 = class298.cp1252AsciiExtension[var5 - 128]; // L: 49
				if (var6 == 0) { // L: 50
					var6 = '?';
				}

				var5 = var6; // L: 51
			}

			char var3 = (char)var5; // L: 53
			this.type = var3; // L: 55
		} else if (var2 == 2) { // L: 57
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) { // L: 58
			this.autoDisable = false;
		} else if (var2 == 5) { // L: 59
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 61

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-12"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 64
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Liw;Ljava/lang/String;Ljava/lang/String;I)[Llc;",
		garbageValue = "-1513719503"
	)
	public static Sprite[] method4677(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 160
		int var4 = var0.getFileId(var3, var2); // L: 161
		return HorizontalAlignment.method4882(var0, var3, var4); // L: 162
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZB)I",
		garbageValue = "6"
	)
	static int method4671(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122; // L: 1039
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1040
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1041
			return 1; // L: 1042
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1044
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1045
			return 1; // L: 1046
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1048
			Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.text; // L: 1049
			return 1; // L: 1050
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1052
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1053
			return 1; // L: 1054
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1056
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1057
			return 1; // L: 1058
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1060
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1061
			return 1; // L: 1062
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1064
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1065
			return 1; // L: 1066
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1068
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1069
			return 1; // L: 1070
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1072
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1073
			return 1; // L: 1074
		} else if (var0 == ScriptOpcodes.CC_GETTRANSTOP) { // L: 1076
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1077
			return 1; // L: 1078
		} else if (var0 == ScriptOpcodes.CC_GETTRANSBOT) { // L: 1080
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1081
			return 1; // L: 1082
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1084
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.color; // L: 1085
			return 1; // L: 1086
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1088
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.color2; // L: 1089
			return 1; // L: 1090
		} else if (var0 == ScriptOpcodes.CC_GETFILLMODE) { // L: 1092
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1093
			return 1; // L: 1094
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1096
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1097
			return 1; // L: 1098
		} else {
			return 2; // L: 1100
		}
	}
}
