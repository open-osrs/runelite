import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static AbstractArchive field3562;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -921028973
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1347105069
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1413295459
	)
	public int field3581;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 445711767
	)
	int field3573;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1796599539
	)
	int field3577;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -978444857
	)
	int field3575;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -215883891
	)
	int field3576;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1377029969
	)
	public int field3572;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1878239229
	)
	public int field3584;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 412111735
	)
	public int field3579;
	@ObfuscatedName("i")
	String field3580;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -700419329
	)
	public int field3586;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1204516257
	)
	public int field3582;
	@ObfuscatedName("s")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 931180183
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -700804289
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
		this.field3581 = 70; // L: 28
		this.field3573 = -1; // L: 29
		this.field3577 = -1; // L: 30
		this.field3575 = -1; // L: 31
		this.field3576 = -1; // L: 32
		this.field3572 = 0; // L: 33
		this.field3584 = 0; // L: 34
		this.field3579 = -1; // L: 35
		this.field3580 = ""; // L: 36
		this.field3586 = -1; // L: 37
		this.field3582 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "1349410227"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnu;IB)V",
		garbageValue = "0"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 70
			this.fontId = var1.method6597();
		} else if (var2 == 2) { // L: 71
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 72
			this.field3573 = var1.method6597();
		} else if (var2 == 4) { // L: 73
			this.field3575 = var1.method6597();
		} else if (var2 == 5) { // L: 74
			this.field3577 = var1.method6597();
		} else if (var2 == 6) { // L: 75
			this.field3576 = var1.method6597();
		} else if (var2 == 7) { // L: 76
			this.field3572 = var1.readShort();
		} else if (var2 == 8) { // L: 77
			this.field3580 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 78
			this.field3581 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 79
			this.field3584 = var1.readShort();
		} else if (var2 == 11) { // L: 80
			this.field3579 = 0;
		} else if (var2 == 12) { // L: 81
			this.field3586 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 82
			this.field3582 = var1.readShort();
		} else if (var2 == 14) {
			this.field3579 = var1.readUnsignedShort(); // L: 83
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lkt;",
		garbageValue = "-1486809095"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 106
		if (this.transformVarbit != -1) { // L: 107
			var1 = class2.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 108
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 110
			var2 = this.transforms[var1]; // L: 111
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? StudioGame.method4391(var2) : null; // L: 112 113
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1639056635"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field3580; // L: 117

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 119
			if (var3 < 0) { // L: 120
				return var2; // L: 123
			}

			var2 = var2.substring(0, var3) + WallDecoration.intToString(var1, false) + var2.substring(var3 + 2); // L: 121
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;",
		garbageValue = "-1023418983"
	)
	public SpritePixels method5166() {
		if (this.field3573 < 0) { // L: 127
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3573); // L: 128
			if (var1 != null) { // L: 129
				return var1;
			} else {
				var1 = ModelData0.SpriteBuffer_getSprite(field3562, this.field3573, 0); // L: 130
				if (var1 != null) { // L: 131
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3573);
				}

				return var1; // L: 133
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;",
		garbageValue = "1414227613"
	)
	public SpritePixels method5137() {
		if (this.field3577 < 0) { // L: 137
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3577); // L: 138
			if (var1 != null) { // L: 139
				return var1;
			} else {
				var1 = ModelData0.SpriteBuffer_getSprite(field3562, this.field3577, 0); // L: 140
				if (var1 != null) { // L: 141
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3577);
				}

				return var1; // L: 143
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;",
		garbageValue = "-1065428410"
	)
	public SpritePixels method5138() {
		if (this.field3575 < 0) { // L: 147
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3575); // L: 148
			if (var1 != null) {
				return var1; // L: 149
			} else {
				var1 = ModelData0.SpriteBuffer_getSprite(field3562, this.field3575, 0); // L: 150
				if (var1 != null) { // L: 151
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3575);
				}

				return var1; // L: 153
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;",
		garbageValue = "-438870038"
	)
	public SpritePixels method5157() {
		if (this.field3576 < 0) { // L: 157
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3576); // L: 158
			if (var1 != null) {
				return var1; // L: 159
			} else {
				var1 = ModelData0.SpriteBuffer_getSprite(field3562, this.field3576, 0); // L: 160
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3576); // L: 161
				}

				return var1; // L: 163
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lkq;",
		garbageValue = "513658947"
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
				var1 = class236.method4378(field3562, HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 170
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId); // L: 171
				}

				return var1; // L: 173
			}
		}
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Lig;",
		garbageValue = "9"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null; // L: 1674
		if (JagexCache.JagexCache_dat2File != null) { // L: 1675
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, PendingSpawn.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, FriendLoginUpdate.masterDisk, var0, var1, var2, var3); // L: 1676
	}
}
