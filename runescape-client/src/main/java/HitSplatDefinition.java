import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	public static AbstractArchive field3356;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 554677393
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1528040183
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1665504671
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1892048919
	)
	public int field3364;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1862744257
	)
	int field3365;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 173475991
	)
	int field3366;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1837345819
	)
	int field3378;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 275308627
	)
	int field3368;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1590717975
	)
	public int field3369;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1198049763
	)
	public int field3370;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -796375423
	)
	public int field3363;
	@ObfuscatedName("t")
	String field3372;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1600290491
	)
	public int field3373;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1529892703
	)
	public int field3374;
	@ObfuscatedName("i")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 34744135
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -84298271
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	public HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field3364 = 70;
		this.field3365 = -1;
		this.field3366 = -1;
		this.field3378 = -1;
		this.field3368 = -1;
		this.field3369 = 0;
		this.field3370 = 0;
		this.field3363 = -1;
		this.field3372 = "";
		this.field3373 = -1;
		this.field3374 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkn;B)V",
		garbageValue = "-108"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkn;II)V",
		garbageValue = "-2104480969"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method5843();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field3365 = var1.method5843();
		} else if (var2 == 4) {
			this.field3378 = var1.method5843();
		} else if (var2 == 5) {
			this.field3366 = var1.method5843();
		} else if (var2 == 6) {
			this.field3368 = var1.method5843();
		} else if (var2 == 7) {
			this.field3369 = var1.readShort();
		} else if (var2 == 8) {
			this.field3372 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field3364 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field3370 = var1.readShort();
		} else if (var2 == 11) {
			this.field3363 = 0;
		} else if (var2 == 12) {
			this.field3373 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field3374 = var1.readShort();
		} else if (var2 == 14) {
			this.field3363 = var1.readUnsignedShort();
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(S)Ljs;",
		garbageValue = "24687"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = Widget.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		if (var2 != -1) {
			HitSplatDefinition var4 = (HitSplatDefinition)HitSplatDefinition_cached.get((long)var2);
			HitSplatDefinition var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = HitSplatDefinition_archive.takeFile(32, var2);
				var4 = new HitSplatDefinition();
				if (var5 != null) {
					var4.decode(new Buffer(var5));
				}

				HitSplatDefinition_cached.put(var4, (long)var2);
				var3 = var4;
			}

			return var3;
		} else {
			return null;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "2134005517"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field3372;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + class298.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(B)Llz;",
		garbageValue = "85"
	)
	public Sprite method4755() {
		if (this.field3365 < 0) {
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3365);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GameShell.SpriteBuffer_getSprite(field3356, this.field3365, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3365);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Llz;",
		garbageValue = "-2111693825"
	)
	public Sprite method4756() {
		if (this.field3366 < 0) {
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3366);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GameShell.SpriteBuffer_getSprite(field3356, this.field3366, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3366);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(B)Llz;",
		garbageValue = "1"
	)
	public Sprite method4752() {
		if (this.field3378 < 0) {
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3378);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GameShell.SpriteBuffer_getSprite(field3356, this.field3378, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3378);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Llz;",
		garbageValue = "148088504"
	)
	public Sprite method4763() {
		if (this.field3368 < 0) {
			return null;
		} else {
			Sprite var1 = (Sprite)HitSplatDefinition_cachedSprites.get((long)this.field3368);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GameShell.SpriteBuffer_getSprite(field3356, this.field3368, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3368);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(B)Lko;",
		garbageValue = "-13"
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
				var1 = Frames.method3394(field3356, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkb;B)V",
		garbageValue = "121"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex();
		int var1 = Client.localPlayerIndex;
		Player var2 = class60.localPlayer = Client.players[var1] = new Player();
		var2.index = var1;
		int var3 = var0.readBits(30);
		byte var4 = (byte)(var3 >> 28);
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - class182.baseX;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - SecureRandomFuture.baseY;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		TileItemPile.Client_plane = var2.plane = var4;
		if (Players.field1279[var1] != null) {
			var2.read(Players.field1279[var1]);
		}

		Players.Players_count = 0;
		Players.Players_indices[++Players.Players_count - 1] = var1;
		Players.field1282[var1] = 0;
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var1 != var7) {
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
				Players.field1282[var7] = 0;
			}
		}

		var0.exportIndex();
	}
}
