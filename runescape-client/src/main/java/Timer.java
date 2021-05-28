import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kv")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 8797083750332969957L
	)
	long field3768;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 807741776312371019L
	)
	long field3766;
	@ObfuscatedName("f")
	public boolean field3769;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -8039422533561910721L
	)
	long field3770;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -1942511866147941553L
	)
	long field3767;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -6788679505704133641L
	)
	long field3771;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2093027907
	)
	int field3772;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2015708795
	)
	int field3773;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -211935081
	)
	int field3774;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1004054843
	)
	int field3775;

	public Timer() {
		this.field3768 = -1L; // L: 7
		this.field3766 = -1L; // L: 8
		this.field3769 = false; // L: 9
		this.field3770 = 0L; // L: 10
		this.field3767 = 0L; // L: 11
		this.field3771 = 0L; // L: 12
		this.field3772 = 0; // L: 13
		this.field3773 = 0; // L: 14
		this.field3774 = 0; // L: 15
		this.field3775 = 0; // L: 16
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1898013614"
	)
	public void method5602() {
		this.field3768 = ObjectComposition.currentTimeMillis(); // L: 19
	} // L: 20

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	public void method5590() {
		if (this.field3768 != -1L) { // L: 23
			this.field3767 = ObjectComposition.currentTimeMillis() - this.field3768; // L: 24
			this.field3768 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1638200135"
	)
	public void method5591(int var1) {
		this.field3766 = ObjectComposition.currentTimeMillis(); // L: 30
		this.field3772 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-99"
	)
	public void method5592() {
		if (-1L != this.field3766) { // L: 35
			this.field3770 = ObjectComposition.currentTimeMillis() - this.field3766; // L: 36
			this.field3766 = -1L; // L: 37
		}

		++this.field3774; // L: 39
		this.field3769 = true; // L: 40
	} // L: 41

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-722241109"
	)
	public void method5593() {
		this.field3769 = false; // L: 44
		this.field3773 = 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2107700042"
	)
	public void method5594() {
		this.method5592();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-442398587"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3767; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field3770; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field3771;
		var6 /= 10L;
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field3772); // L: 74
		var1.writeShort(this.field3773); // L: 75
		var1.writeShort(this.field3774); // L: 76
		var1.writeShort(this.field3775); // L: 77
	} // L: 78

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1457822410"
	)
	public static boolean method5614(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) { // L: 45
			if (var0 != 0) { // L: 46
				char[] var1 = class301.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true;
					}
				}
			}

			return false; // L: 57
		} else {
			return true;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2049201204"
	)
	static int method5595(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 66
		if (var1 == null) { // L: 67
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 68 69
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-1991704132"
	)
	static int method5600(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1103
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1104
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1105
			return 1; // L: 1106
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1108
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1109
			return 1; // L: 1110
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1112
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1113
			return 1; // L: 1114
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1116
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1117
			return 1; // L: 1118
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1120
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1121
			return 1; // L: 1122
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1124
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1125
			return 1; // L: 1126
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1128
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1129
			return 1; // L: 1130
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1132
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1133
			return 1; // L: 1134
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1136
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1137
			return 1; // L: 1138
		} else if (var0 == ScriptOpcodes.CC_GETTRANSTOP) { // L: 1140
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1141
			return 1; // L: 1142
		} else if (var0 == ScriptOpcodes.CC_GETTRANSBOT) { // L: 1144
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1145
			return 1; // L: 1146
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1148
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.color; // L: 1149
			return 1; // L: 1150
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1152
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.color2; // L: 1153
			return 1; // L: 1154
		} else if (var0 == ScriptOpcodes.CC_GETFILLMODE) { // L: 1156
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1157
			return 1; // L: 1158
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1160
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1161
			return 1; // L: 1162
		} else if (var0 != 1615 && var0 != 1616) { // L: 1164
			return 2; // L: 1168
		} else {
			++class44.Interpreter_intStackSize; // L: 1165
			return 1; // L: 1166
		}
	}
}
