import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("er")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("qi")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("FloorOverlayDefinition_cached")
	static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1001309157
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -62801967
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("l")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1070753701
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1137076507
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1165641247
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1846121867
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1497091503
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 85102399
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 128394293
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "281376633"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) { // L: 41
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue; // L: 43
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb); // L: 47
	} // L: 48

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "-1967254458"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 52
			if (var3 == 0) { // L: 53
				return; // L: 56
			}

			this.decodeNext(var1, var3, var2); // L: 54
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnk;III)V",
		garbageValue = "1171237603"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 59
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) { // L: 60
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) { // L: 61
			this.hideUnderlay = false;
		} else if (var2 == 7) { // L: 62
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) { // L: 63
		}

	} // L: 65

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2102756856"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 68
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 69
		double var6 = (double)(var1 & 255) / 256.0D; // L: 70
		double var8 = var2; // L: 71
		if (var4 < var2) { // L: 72
			var8 = var4;
		}

		if (var6 < var8) { // L: 73
			var8 = var6;
		}

		double var10 = var2; // L: 74
		if (var4 > var2) { // L: 75
			var10 = var4;
		}

		if (var6 > var10) { // L: 76
			var10 = var6;
		}

		double var12 = 0.0D; // L: 77
		double var14 = 0.0D; // L: 78
		double var16 = (var8 + var10) / 2.0D; // L: 79
		if (var10 != var8) { // L: 80
			if (var16 < 0.5D) { // L: 81
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 82
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 83
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 84
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 85
			}
		}

		var12 /= 6.0D; // L: 87
		this.hue = (int)(var12 * 256.0D); // L: 88
		this.saturation = (int)(var14 * 256.0D); // L: 89
		this.lightness = (int)(256.0D * var16); // L: 90
		if (this.saturation < 0) { // L: 91
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 92
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 93
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 94
			this.lightness = 255;
		}

	} // L: 95

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Low;IIII)V",
		garbageValue = "-1684210447"
	)
	static void method3052(SpritePixels var0, int var1, int var2, int var3) {
		DemotingHashTable var4 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 38
		long var6 = (long)(var3 << 16 | var1 << 8 | var2); // L: 42
		var4.put(var0, var6, var0.pixels.length * 4); // L: 44
	} // L: 45

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "2095665462"
	)
	static int method3049(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 1103
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1104
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1105
			return 1; // L: 1106
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1108
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1109
			return 1; // L: 1110
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1112
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.text; // L: 1113
			return 1; // L: 1114
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1116
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1117
			return 1; // L: 1118
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1120
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1121
			return 1; // L: 1122
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1124
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1125
			return 1; // L: 1126
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1128
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1129
			return 1; // L: 1130
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1132
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1133
			return 1; // L: 1134
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1136
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1137
			return 1; // L: 1138
		} else if (var0 == ScriptOpcodes.CC_GETTRANSTOP) { // L: 1140
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1141
			return 1; // L: 1142
		} else if (var0 == ScriptOpcodes.CC_GETTRANSBOT) { // L: 1144
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1145
			return 1; // L: 1146
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1148
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.color; // L: 1149
			return 1; // L: 1150
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1152
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.color2; // L: 1153
			return 1; // L: 1154
		} else if (var0 == ScriptOpcodes.CC_GETFILLMODE) { // L: 1156
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1157
			return 1; // L: 1158
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1160
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1161
			return 1; // L: 1162
		} else if (var0 != 1615 && var0 != 1616) { // L: 1164
			return 2; // L: 1168
		} else {
			++WorldMapCacheName.Interpreter_intStackSize; // L: 1165
			return 1; // L: 1166
		}
	}
}
