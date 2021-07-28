import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lei;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1151780193
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 181121925
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1556885323
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -559473179
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("f")
	@Export("name")
	public String name;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1511118893
	)
	public int field1547;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -49419043
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("p")
	public boolean field1529;
	@ObfuscatedName("h")
	public boolean field1541;
	@ObfuscatedName("k")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("a")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("q")
	int[] field1530;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2054958761
	)
	int field1544;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -820884415
	)
	int field1545;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1627071551
	)
	int field1546;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 347811663
	)
	int field1537;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("z")
	int[] field1550;
	@ObfuscatedName("d")
	byte[] field1551;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1204378113
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1529 = true;
		this.field1541 = false;
		this.menuActions = new String[5];
		this.field1544 = Integer.MAX_VALUE;
		this.field1545 = Integer.MAX_VALUE;
		this.field1546 = Integer.MIN_VALUE;
		this.field1537 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "-1617070752"
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
		garbageValue = "-1051181878"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method6674();
		} else if (var2 == 2) {
			this.sprite2 = var1.method6674();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1547 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1529 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1541 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1530 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1530[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1550 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1550.length; ++var5) {
					this.field1550[var5] = var1.readInt();
				}

				this.field1551 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1551[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method6674();
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
					var1.method6674();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1608, HorizontalAlignment.field1612};
					this.horizontalAlignment = (HorizontalAlignment)Huffman.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)Huffman.findEnumerated(class4.method21(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "970284318"
	)
	void method2735() {
		if (this.field1530 != null) {
			for (int var1 = 0; var1 < this.field1530.length; var1 += 2) {
				if (this.field1530[var1] < this.field1544) {
					this.field1544 = this.field1530[var1];
				} else if (this.field1530[var1] > this.field1546) {
					this.field1546 = this.field1530[var1];
				}

				if (this.field1530[var1 + 1] < this.field1545) {
					this.field1545 = this.field1530[var1 + 1];
				} else if (this.field1530[var1 + 1] > this.field1537) {
					this.field1537 = this.field1530[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lom;",
		garbageValue = "2101643047"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IS)Lom;",
		garbageValue = "5732"
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
				var2 = ViewportMouse.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}
}
