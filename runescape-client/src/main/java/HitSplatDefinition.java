import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	static AbstractArchive field3354;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1754036089
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1663131013
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1159651447
	)
	public int field3364;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1831454563
	)
	int field3365;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1646147789
	)
	int field3366;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -507901103
	)
	int field3355;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1836001377
	)
	int field3358;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 662254573
	)
	public int field3377;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1128487265
	)
	public int field3353;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1126942193
	)
	public int field3378;
	@ObfuscatedName("g")
	String field3370;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1216299051
	)
	public int field3373;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 423501575
	)
	public int field3374;
	@ObfuscatedName("k")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -518228965
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1219592321
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215; // L: 27
		this.field3364 = 70; // L: 28
		this.field3365 = -1; // L: 29
		this.field3366 = -1; // L: 30
		this.field3355 = -1; // L: 31
		this.field3358 = -1; // L: 32
		this.field3377 = 0; // L: 33
		this.field3353 = 0; // L: 34
		this.field3378 = -1; // L: 35
		this.field3370 = ""; // L: 36
		this.field3373 = -1; // L: 37
		this.field3374 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "-46"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 63
			if (var2 == 0) { // L: 64
				return; // L: 67
			}

			this.decodeNext(var1, var2); // L: 65
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;IB)V",
		garbageValue = "19"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 70
			this.fontId = var1.method5559();
		} else if (var2 == 2) { // L: 71
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 72
			this.field3365 = var1.method5559();
		} else if (var2 == 4) { // L: 73
			this.field3355 = var1.method5559();
		} else if (var2 == 5) { // L: 74
			this.field3366 = var1.method5559();
		} else if (var2 == 6) { // L: 75
			this.field3358 = var1.method5559();
		} else if (var2 == 7) { // L: 76
			this.field3377 = var1.readShort();
		} else if (var2 == 8) { // L: 77
			this.field3370 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 78
			this.field3364 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 79
			this.field3353 = var1.readShort();
		} else if (var2 == 11) { // L: 80
			this.field3378 = 0;
		} else if (var2 == 12) { // L: 81
			this.field3373 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 82
			this.field3374 = var1.readShort();
		} else if (var2 == 14) {
			this.field3378 = var1.readUnsignedShort(); // L: 83
		} else if (var2 == 17 || var2 == 18) { // L: 84
			this.transformVarbit = var1.readUnsignedShort(); // L: 85
			if (this.transformVarbit == 65535) { // L: 86
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 87
			if (this.transformVarp == 65535) { // L: 88
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 89
			if (var2 == 18) { // L: 90
				var3 = var1.readUnsignedShort(); // L: 91
				if (var3 == 65535) { // L: 92
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 94
			this.transforms = new int[var4 + 2]; // L: 95

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 96
				this.transforms[var5] = var1.readUnsignedShort(); // L: 97
				if (this.transforms[var5] == 65535) { // L: 98
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 100
		}

	} // L: 103

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Lje;",
		garbageValue = "-127"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 106
		if (this.transformVarbit != -1) { // L: 107
			var1 = Coord.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 108
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 110
			var2 = this.transforms[var1]; // L: 111
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class198.method3697(var2) : null; // L: 112 113
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1302541631"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field3370; // L: 117

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 119
			if (var3 < 0) { // L: 120
				return var2; // L: 123
			}

			var2 = var2.substring(0, var3) + HealthBarDefinition.intToString(var1, false) + var2.substring(var3 + 2); // L: 121
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "-1476611889"
	)
	public SpritePixels method4583() {
		if (this.field3365 < 0) { // L: 127
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3365); // L: 128
			if (var1 != null) { // L: 129
				return var1;
			} else {
				var1 = Skills.SpriteBuffer_getSprite(field3354, this.field3365, 0); // L: 130
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3365); // L: 131
				}

				return var1; // L: 133
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "809304727"
	)
	public SpritePixels method4578() {
		if (this.field3366 < 0) { // L: 137
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3366); // L: 138
			if (var1 != null) { // L: 139
				return var1;
			} else {
				var1 = Skills.SpriteBuffer_getSprite(field3354, this.field3366, 0); // L: 140
				if (var1 != null) { // L: 141
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3366);
				}

				return var1; // L: 143
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "644601071"
	)
	public SpritePixels method4587() {
		if (this.field3355 < 0) { // L: 147
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3355); // L: 148
			if (var1 != null) {
				return var1; // L: 149
			} else {
				var1 = Skills.SpriteBuffer_getSprite(field3354, this.field3355, 0); // L: 150
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3355); // L: 151
				}

				return var1; // L: 153
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)Llm;",
		garbageValue = "500"
	)
	public SpritePixels method4585() {
		if (this.field3358 < 0) { // L: 157
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3358); // L: 158
			if (var1 != null) {
				return var1; // L: 159
			} else {
				var1 = Skills.SpriteBuffer_getSprite(field3354, this.field3358, 0); // L: 160
				if (var1 != null) { // L: 161
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3358);
				}

				return var1; // L: 163
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Lku;",
		garbageValue = "0"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 167
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 168
			if (var1 != null) { // L: 169
				return var1;
			} else {
				var1 = PrivateChatMode.method5934(field3354, HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 170
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId); // L: 171
				}

				return var1; // L: 173
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "20"
	)
	public static int method4612(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var0;
		} else if (var2 == 1) { // L: 24
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 25 26
		}
	}
}
