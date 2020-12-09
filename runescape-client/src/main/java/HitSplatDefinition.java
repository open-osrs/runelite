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
		this.textColor = 16777215;
		this.field3364 = 70;
		this.field3365 = -1;
		this.field3366 = -1;
		this.field3355 = -1;
		this.field3358 = -1;
		this.field3377 = 0;
		this.field3353 = 0;
		this.field3378 = -1;
		this.field3370 = "";
		this.field3373 = -1;
		this.field3374 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "-46"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;IB)V",
		garbageValue = "19"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method5559();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field3365 = var1.method5559();
		} else if (var2 == 4) {
			this.field3355 = var1.method5559();
		} else if (var2 == 5) {
			this.field3366 = var1.method5559();
		} else if (var2 == 6) {
			this.field3358 = var1.method5559();
		} else if (var2 == 7) {
			this.field3377 = var1.readShort();
		} else if (var2 == 8) {
			this.field3370 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field3364 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field3353 = var1.readShort();
		} else if (var2 == 11) {
			this.field3378 = 0;
		} else if (var2 == 12) {
			this.field3373 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field3374 = var1.readShort();
		} else if (var2 == 14) {
			this.field3378 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Lje;",
		garbageValue = "-127"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = Coord.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class198.method3697(var2) : null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1302541631"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field3370;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + HealthBarDefinition.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "-1476611889"
	)
	public Sprite method4583() {
		if (this.field3365 < 0) {
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3365);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Skills.SpriteBuffer_getSprite(field3354, this.field3365, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3365);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "809304727"
	)
	public Sprite method4578() {
		if (this.field3366 < 0) {
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3366);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Skills.SpriteBuffer_getSprite(field3354, this.field3366, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3366);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "644601071"
	)
	public Sprite method4587() {
		if (this.field3355 < 0) {
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3355);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Skills.SpriteBuffer_getSprite(field3354, this.field3355, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3355);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)Llm;",
		garbageValue = "500"
	)
	public Sprite method4585() {
		if (this.field3358 < 0) {
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3358);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Skills.SpriteBuffer_getSprite(field3354, this.field3358, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3358);
				}

				return var1;
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
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = PrivateChatMode.method5934(field3354, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "20"
	)
	public static int method4612(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}
}
