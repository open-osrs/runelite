import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Leo;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -880810839
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = 845293889
	)
	static int field1622;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 876781501
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1137753307
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1145388013
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("a")
	@Export("name")
	public String name;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1017200265
	)
	public int field1630;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 21450715
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("w")
	public boolean field1633;
	@ObfuscatedName("g")
	public boolean field1634;
	@ObfuscatedName("v")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("s")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("c")
	int[] field1636;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 830800723
	)
	int field1638;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1146568603
	)
	int field1643;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -299465407
	)
	int field1640;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1865538037
	)
	int field1641;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("r")
	int[] field1644;
	@ObfuscatedName("n")
	byte[] field1645;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -729856873
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1633 = true;
		this.field1634 = false;
		this.menuActions = new String[5];
		this.field1638 = Integer.MAX_VALUE;
		this.field1643 = Integer.MAX_VALUE;
		this.field1640 = Integer.MIN_VALUE;
		this.field1641 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "359574419"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "371005915"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method6977();
		} else if (var2 == 2) {
			this.sprite2 = var1.method6977();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1630 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1633 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1634 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1636 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1636[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1644 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1644.length; ++var5) {
					this.field1644[var5] = var1.readInt();
				}

				this.field1645 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1645[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method6977();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.method6977();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.horizontalAlignment = (HorizontalAlignment)class128.findEnumerated(PcmPlayer.method702(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.field1747, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1748};
					this.verticalAlignment = (VerticalAlignment)class128.findEnumerated(var3, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2056893790"
	)
	public void method2900() {
		if (this.field1636 != null) {
			for (int var1 = 0; var1 < this.field1636.length; var1 += 2) {
				if (this.field1636[var1] < this.field1638) {
					this.field1638 = this.field1636[var1];
				} else if (this.field1636[var1] > this.field1640) {
					this.field1640 = this.field1636[var1];
				}

				if (this.field1636[var1 + 1] < this.field1643) {
					this.field1643 = this.field1636[var1 + 1];
				} else if (this.field1636[var1 + 1] > this.field1641) {
					this.field1641 = this.field1636[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lon;",
		garbageValue = "-583562620"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Lon;",
		garbageValue = "35"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = AccessFile.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-306914464"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1756483655"
	)
	public static int method2922(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}
}
