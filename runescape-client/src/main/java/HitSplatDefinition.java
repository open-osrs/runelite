import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = 1601554383
	)
	static int field1713;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 411738229
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 258226795
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 162491923
	)
	public int field1716;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1731798421
	)
	int field1717;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -687229769
	)
	int field1720;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1240611547
	)
	int field1719;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -670431333
	)
	int field1718;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1031558843
	)
	public int field1721;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1977484367
	)
	public int field1722;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -148229729
	)
	public int field1706;
	@ObfuscatedName("b")
	String field1724;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1909368231
	)
	public int field1725;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1197229655
	)
	public int field1726;
	@ObfuscatedName("y")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -707974113
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -673375799
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
		this.field1716 = 70;
		this.field1717 = -1;
		this.field1720 = -1;
		this.field1719 = -1;
		this.field1718 = -1;
		this.field1721 = 0;
		this.field1722 = 0;
		this.field1706 = -1;
		this.field1724 = "";
		this.field1725 = -1;
		this.field1726 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "992937334"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnv;II)V",
		garbageValue = "144346720"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method6674();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field1717 = var1.method6674();
		} else if (var2 == 4) {
			this.field1719 = var1.method6674();
		} else if (var2 == 5) {
			this.field1720 = var1.method6674();
		} else if (var2 == 6) {
			this.field1718 = var1.method6674();
		} else if (var2 == 7) {
			this.field1721 = var1.readShort();
		} else if (var2 == 8) {
			this.field1724 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field1716 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field1722 = var1.readShort();
		} else if (var2 == 11) {
			this.field1706 = 0;
		} else if (var2 == 12) {
			this.field1725 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field1726 = var1.readShort();
		} else if (var2 == 14) {
			this.field1706 = var1.readUnsignedShort();
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Les;",
		garbageValue = "-1548593405"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = WorldMapSection0.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? ObjectComposition.method3044(var2) : null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "991764239"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field1724;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + MusicPatchNode.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lom;",
		garbageValue = "2141708978"
	)
	public SpritePixels method2970() {
		if (this.field1717 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1717);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ViewportMouse.SpriteBuffer_getSprite(class163.field1913, this.field1717, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1717);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lom;",
		garbageValue = "-5"
	)
	public SpritePixels method2960() {
		if (this.field1720 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1720);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ViewportMouse.SpriteBuffer_getSprite(class163.field1913, this.field1720, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1720);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lom;",
		garbageValue = "-890691987"
	)
	public SpritePixels method2961() {
		if (this.field1719 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1719);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ViewportMouse.SpriteBuffer_getSprite(class163.field1913, this.field1719, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1719);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Lom;",
		garbageValue = "-104"
	)
	public SpritePixels method2962() {
		if (this.field1718 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1718);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ViewportMouse.SpriteBuffer_getSprite(class163.field1913, this.field1718, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1718);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lkt;",
		garbageValue = "1025238458"
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
				var1 = class251.method4840(class163.field1913, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "-1512777852"
	)
	static long method2988(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "172246338"
	)
	static void method2981() {
		if (class367.field4127 != null) {
			Client.field679 = Client.cycle;
			class367.field4127.method5183();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					class367.field4127.method5182((Client.players[var0].x >> 7) + GrandExchangeOfferNameComparator.baseX, (Client.players[var0].y >> 7) + NPC.baseY);
				}
			}
		}

	}
}
