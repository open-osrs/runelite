import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	static AbstractArchive field1797;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1133546297
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -274265119
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1756131241
	)
	public int field1804;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1463385181
	)
	int field1800;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 337855297
	)
	int field1806;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1116832275
	)
	int field1814;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 18132261
	)
	int field1808;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1398460241
	)
	public int field1809;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1600829023
	)
	public int field1810;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1648565925
	)
	public int field1811;
	@ObfuscatedName("t")
	String field1812;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 235922287
	)
	public int field1813;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1798400573
	)
	public int field1817;
	@ObfuscatedName("w")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1583927141
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1197970835
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
		this.field1804 = 70;
		this.field1800 = -1;
		this.field1806 = -1;
		this.field1814 = -1;
		this.field1808 = -1;
		this.field1809 = 0;
		this.field1810 = 0;
		this.field1811 = -1;
		this.field1812 = "";
		this.field1813 = -1;
		this.field1817 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1268103481"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "1356754774"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method6985();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field1800 = var1.method6985();
		} else if (var2 == 4) {
			this.field1814 = var1.method6985();
		} else if (var2 == 5) {
			this.field1806 = var1.method6985();
		} else if (var2 == 6) {
			this.field1808 = var1.method6985();
		} else if (var2 == 7) {
			this.field1809 = var1.readShort();
		} else if (var2 == 8) {
			this.field1812 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field1804 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field1810 = var1.readShort();
		} else if (var2 == 11) {
			this.field1811 = 0;
		} else if (var2 == 12) {
			this.field1813 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field1817 = var1.readShort();
		} else if (var2 == 14) {
			this.field1811 = var1.readUnsignedShort();
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lfe;",
		garbageValue = "12"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class247.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? PendingSpawn.method2120(var2) : null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-75134339"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field1812;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + EnumComposition.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Loc;",
		garbageValue = "124"
	)
	public SpritePixels method3091() {
		if (this.field1800 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1800);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class258.SpriteBuffer_getSprite(field1797, this.field1800, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1800);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Loc;",
		garbageValue = "-1897521484"
	)
	public SpritePixels method3121() {
		if (this.field1806 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1806);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class258.SpriteBuffer_getSprite(field1797, this.field1806, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1806);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Loc;",
		garbageValue = "1980072037"
	)
	public SpritePixels method3122() {
		if (this.field1814 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1814);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class258.SpriteBuffer_getSprite(field1797, this.field1814, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1814);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)Loc;",
		garbageValue = "18912"
	)
	public SpritePixels method3107() {
		if (this.field1808 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1808);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class258.SpriteBuffer_getSprite(field1797, this.field1808, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1808);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Llu;",
		garbageValue = "-96"
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
				var1 = AbstractSocket.method6107(field1797, class245.HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lff;",
		garbageValue = "28"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "153503644"
	)
	public static void method3115() {
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-836457989"
	)
	static char method3123(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1906173449"
	)
	static boolean method3108(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
				return true;
			}
		}

		return false;
	}
}
