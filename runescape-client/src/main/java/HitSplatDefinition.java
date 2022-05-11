import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 2130203017
	)
	static int field2077;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1395317347
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1417482049
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1131373797
	)
	public int field2071;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1501343813
	)
	int field2062;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -63093085
	)
	int field2067;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -580949191
	)
	int field2064;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 269659311
	)
	int field2054;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 254386385
	)
	public int field2055;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -825953789
	)
	public int field2074;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -801066855
	)
	public int field2072;
	@ObfuscatedName("d")
	String field2069;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1961631307
	)
	public int field2070;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -474593523
	)
	public int field2068;
	@ObfuscatedName("i")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -901285467
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -895793349
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
		this.field2071 = 70; // L: 28
		this.field2062 = -1; // L: 29
		this.field2067 = -1; // L: 30
		this.field2064 = -1; // L: 31
		this.field2054 = -1; // L: 32
		this.field2055 = 0; // L: 33
		this.field2074 = 0; // L: 34
		this.field2072 = -1; // L: 35
		this.field2069 = ""; // L: 36
		this.field2070 = -1; // L: 37
		this.field2068 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "507933572"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "1744488048"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 70
			this.fontId = var1.method7532();
		} else if (var2 == 2) { // L: 71
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 72
			this.field2062 = var1.method7532();
		} else if (var2 == 4) { // L: 73
			this.field2064 = var1.method7532();
		} else if (var2 == 5) { // L: 74
			this.field2067 = var1.method7532();
		} else if (var2 == 6) { // L: 75
			this.field2054 = var1.method7532();
		} else if (var2 == 7) { // L: 76
			this.field2055 = var1.readShort();
		} else if (var2 == 8) { // L: 77
			this.field2069 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 78
			this.field2071 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 79
			this.field2074 = var1.readShort();
		} else if (var2 == 11) { // L: 80
			this.field2072 = 0;
		} else if (var2 == 12) { // L: 81
			this.field2070 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 82
			this.field2068 = var1.readShort();
		} else if (var2 == 14) {
			this.field2072 = var1.readUnsignedShort(); // L: 83
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lgk;",
		garbageValue = "1570100163"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 106
		if (this.transformVarbit != -1) { // L: 107
			var1 = class18.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 108
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 110
			var2 = this.transforms[var1]; // L: 111
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? UserComparator4.method2567(var2) : null; // L: 112 113
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1649280427"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2069; // L: 117

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 119
			if (var3 < 0) { // L: 120
				return var2; // L: 123
			}

			var2 = var2.substring(0, var3) + Message.intToString(var1, false) + var2.substring(var3 + 2); // L: 121
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Lqr;",
		garbageValue = "-97"
	)
	public SpritePixels method3531() {
		if (this.field2062 < 0) { // L: 127
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2062); // L: 128
			if (var1 != null) {
				return var1; // L: 129
			} else {
				var1 = StructComposition.SpriteBuffer_getSprite(ModelData0.field2654, this.field2062, 0); // L: 130
				if (var1 != null) { // L: 131
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2062);
				}

				return var1; // L: 133
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lqr;",
		garbageValue = "-1422876623"
	)
	public SpritePixels method3534() {
		if (this.field2067 < 0) { // L: 137
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2067); // L: 138
			if (var1 != null) {
				return var1; // L: 139
			} else {
				var1 = StructComposition.SpriteBuffer_getSprite(ModelData0.field2654, this.field2067, 0); // L: 140
				if (var1 != null) { // L: 141
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2067);
				}

				return var1; // L: 143
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lqr;",
		garbageValue = "23"
	)
	public SpritePixels method3533() {
		if (this.field2064 < 0) { // L: 147
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2064); // L: 148
			if (var1 != null) {
				return var1; // L: 149
			} else {
				var1 = StructComposition.SpriteBuffer_getSprite(ModelData0.field2654, this.field2064, 0); // L: 150
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2064); // L: 151
				}

				return var1; // L: 153
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lqr;",
		garbageValue = "-554047425"
	)
	public SpritePixels method3559() {
		if (this.field2054 < 0) { // L: 157
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2054); // L: 158
			if (var1 != null) {
				return var1; // L: 159
			} else {
				var1 = StructComposition.SpriteBuffer_getSprite(ModelData0.field2654, this.field2054, 0); // L: 160
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2054); // L: 161
				}

				return var1; // L: 163
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Lmx;",
		garbageValue = "287302031"
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
				var1 = class387.method6781(ModelData0.field2654, class1.HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 170
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId); // L: 171
				}

				return var1; // L: 173
			}
		}
	}
}
