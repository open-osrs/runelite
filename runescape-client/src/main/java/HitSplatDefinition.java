import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static AbstractArchive field3350;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -815033711
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1301515825
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1266638287
	)
	public int field3370;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -83015757
	)
	int field3360;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 651149395
	)
	int field3349;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1270434679
	)
	int field3362;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1716225461
	)
	int field3363;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 779984005
	)
	public int field3364;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -770163669
	)
	public int field3365;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -604727169
	)
	public int field3366;
	@ObfuscatedName("d")
	String field3367;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1273582511
	)
	public int field3361;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -991437923
	)
	public int field3351;
	@ObfuscatedName("h")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1964734149
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1049290465
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
		this.field3370 = 70; // L: 28
		this.field3360 = -1; // L: 29
		this.field3349 = -1; // L: 30
		this.field3362 = -1; // L: 31
		this.field3363 = -1; // L: 32
		this.field3364 = 0; // L: 33
		this.field3365 = 0; // L: 34
		this.field3366 = -1; // L: 35
		this.field3367 = ""; // L: 36
		this.field3361 = -1; // L: 37
		this.field3351 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "738572554"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "-403077535"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method5851();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field3360 = var1.method5851();
		} else if (var2 == 4) { // L: 67
			this.field3362 = var1.method5851();
		} else if (var2 == 5) { // L: 68
			this.field3349 = var1.method5851();
		} else if (var2 == 6) { // L: 69
			this.field3363 = var1.method5851();
		} else if (var2 == 7) { // L: 70
			this.field3364 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field3367 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field3370 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field3365 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field3366 = 0;
		} else if (var2 == 12) { // L: 75
			this.field3361 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field3351 = var1.readShort();
		} else if (var2 == 14) {
			this.field3366 = var1.readUnsignedShort(); // L: 77
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Ljx;",
		garbageValue = "29"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = ApproximateRouteStrategy.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class258.method4654(var2) : null; // L: 106 107
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "722247792"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field3367; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + class197.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "1144318986"
	)
	public Sprite method4748() {
		if (this.field3360 < 0) { // L: 121
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3360); // L: 122
			if (var1 != null) { // L: 123
				return var1;
			} else {
				var1 = FloorDecoration.SpriteBuffer_getSprite(field3350, this.field3360, 0); // L: 124
				if (var1 != null) { // L: 125
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3360);
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Llc;",
		garbageValue = "-104"
	)
	public Sprite method4733() {
		if (this.field3349 < 0) { // L: 131
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3349); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = FloorDecoration.SpriteBuffer_getSprite(field3350, this.field3349, 0); // L: 134
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3349); // L: 135
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)Llc;",
		garbageValue = "1003"
	)
	public Sprite method4731() {
		if (this.field3362 < 0) { // L: 141
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3362); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = FloorDecoration.SpriteBuffer_getSprite(field3350, this.field3362, 0); // L: 144
				if (var1 != null) { // L: 145
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3362);
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "1948931470"
	)
	public Sprite method4727() {
		if (this.field3363 < 0) { // L: 151
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3363); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = FloorDecoration.SpriteBuffer_getSprite(field3350, this.field3363, 0); // L: 154
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3363); // L: 155
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lkq;",
		garbageValue = "-1921749751"
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
				AbstractArchive var3 = field3350; // L: 165
				AbstractArchive var4 = HitSplatDefinition_fontsArchive; // L: 166
				int var5 = this.fontId; // L: 167
				byte[] var7 = var3.takeFile(var5, 0); // L: 171
				boolean var6;
				if (var7 == null) { // L: 172
					var6 = false; // L: 173
				} else {
					class217.SpriteBuffer_decode(var7); // L: 176
					var6 = true; // L: 177
				}

				Font var2;
				if (!var6) { // L: 179
					var2 = null; // L: 180
				} else {
					var2 = UrlRequester.method3430(var4.takeFile(var5, 0)); // L: 183
				}

				if (var2 != null) { // L: 186
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2; // L: 188
			}
		}
	}
}
