import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jd")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive field3364;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 840460821
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -910808373
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1699415327
	)
	public int field3356;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -359975217
	)
	int field3357;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1100166573
	)
	int field3351;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 620979093
	)
	int field3359;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1746417223
	)
	int field3360;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1873666251
	)
	public int field3368;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1145971425
	)
	public int field3362;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1152481113
	)
	public int field3355;
	@ObfuscatedName("u")
	String field3361;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -444433025
	)
	public int field3365;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1573149035
	)
	public int field3366;
	@ObfuscatedName("l")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1795835533
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1163513145
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field3356 = 70; // L: 28
		this.field3357 = -1; // L: 29
		this.field3351 = -1; // L: 30
		this.field3359 = -1; // L: 31
		this.field3360 = -1; // L: 32
		this.field3368 = 0; // L: 33
		this.field3362 = 0; // L: 34
		this.field3355 = -1; // L: 35
		this.field3361 = ""; // L: 36
		this.field3365 = -1; // L: 37
		this.field3366 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "183277091"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 57
			if (var2 == 0) { // L: 58
				return; // L: 61
			}

			this.decodeNext(var1, var2); // L: 59
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "-2105056828"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method5634();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field3357 = var1.method5634();
		} else if (var2 == 4) { // L: 67
			this.field3359 = var1.method5634();
		} else if (var2 == 5) { // L: 68
			this.field3351 = var1.method5634();
		} else if (var2 == 6) { // L: 69
			this.field3360 = var1.method5634();
		} else if (var2 == 7) { // L: 70
			this.field3368 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field3361 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field3356 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field3362 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field3355 = 0;
		} else if (var2 == 12) { // L: 75
			this.field3365 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field3366 = var1.readShort();
		} else if (var2 == 14) {
			this.field3355 = var1.readUnsignedShort(); // L: 77
		} else if (var2 == 17 || var2 == 18) { // L: 78
			this.transformVarbit = var1.readUnsignedShort(); // L: 79
			if (this.transformVarbit == 65535) { // L: 80
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 81
			if (this.transformVarp == 65535) { // L: 82
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 83
			if (var2 == 18) { // L: 84
				var3 = var1.readUnsignedShort(); // L: 85
				if (var3 == 65535) { // L: 86
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 88
			this.transforms = new int[var4 + 2]; // L: 89

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 90
				this.transforms[var5] = var1.readUnsignedShort(); // L: 91
				if (this.transforms[var5] == 65535) { // L: 92
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 94
		}

	} // L: 97

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Ljd;",
		garbageValue = "-79"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = WorldMapSection1.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? MusicPatchNode.method3929(var2) : null; // L: 106 107
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-265851490"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field3361; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + ModeWhere.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Llp;",
		garbageValue = "-339938865"
	)
	public Sprite method4668() {
		if (this.field3357 < 0) { // L: 121
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3357); // L: 122
			if (var1 != null) {
				return var1; // L: 123
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field3364, this.field3357, 0); // L: 124
				if (var1 != null) { // L: 125
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3357);
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Llp;",
		garbageValue = "68117664"
	)
	public Sprite method4681() {
		if (this.field3351 < 0) { // L: 131
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3351); // L: 132
			if (var1 != null) { // L: 133
				return var1;
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field3364, this.field3351, 0); // L: 134
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3351); // L: 135
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Llp;",
		garbageValue = "962785869"
	)
	public Sprite method4670() {
		if (this.field3359 < 0) { // L: 141
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3359); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field3364, this.field3359, 0); // L: 144
				if (var1 != null) { // L: 145
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3359);
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Llp;",
		garbageValue = "-16"
	)
	public Sprite method4678() {
		if (this.field3360 < 0) { // L: 151
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3360); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field3364, this.field3360, 0); // L: 154
				if (var1 != null) { // L: 155
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3360);
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Lkr;",
		garbageValue = "-456462046"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				var1 = RouteStrategy.method3688(field3364, HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 164
				if (var1 != null) { // L: 165
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1; // L: 167
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZB)I",
		garbageValue = "20"
	)
	static int method4698(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1144
			var0 -= 1000; // L: 1145
			var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1146
		} else {
			var3 = var2 ? Canvas.field438 : class3.field12; // L: 1148
		}

		if (var0 == ScriptOpcodes.CC_CALLONRESIZE) { // L: 1149
			if (Interpreter.field1135 >= 10) { // L: 1150
				throw new RuntimeException(); // L: 1151
			} else if (var3.onResize == null) { // L: 1153
				return 0;
			} else {
				ScriptEvent var4 = new ScriptEvent(); // L: 1154
				var4.widget = var3; // L: 1155
				var4.args = var3.onResize; // L: 1156
				var4.field593 = Interpreter.field1135 + 1; // L: 1157
				Client.scriptEvents.addFirst(var4); // L: 1158
				return 1; // L: 1159
			}
		} else {
			return 2; // L: 1161
		}
	}
}
