import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lfj;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2128430095
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1548608787
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1438813025
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("w")
	@Export("name")
	public String name;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -638140105
	)
	public int field1756;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1797672819
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("v")
	public boolean field1758;
	@ObfuscatedName("d")
	public boolean field1759;
	@ObfuscatedName("h")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("g")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("e")
	int[] field1762;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1652119417
	)
	int field1770;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 158634661
	)
	int field1764;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 772894737
	)
	int field1763;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1373703661
	)
	int field1766;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("x")
	int[] field1749;
	@ObfuscatedName("z")
	byte[] field1769;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -783407031
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
		this.field1758 = true;
		this.field1759 = false;
		this.menuActions = new String[5];
		this.field1770 = Integer.MAX_VALUE;
		this.field1764 = Integer.MAX_VALUE;
		this.field1763 = Integer.MIN_VALUE;
		this.field1766 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-20"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IS)V",
		garbageValue = "2466"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method7400();
		} else if (var2 == 2) {
			this.sprite2 = var1.method7400();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1756 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
					this.field1758 = false;
				}

				if ((var3 & 2) == 2) {
					this.field1759 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field1762 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field1762[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1749 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1749.length; ++var5) {
					this.field1749[var5] = var1.readInt();
				}

				this.field1769 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field1769[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method7400();
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
					var1.method7400();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.horizontalAlignment = (HorizontalAlignment)class130.findEnumerated(class186.method3739(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)class130.findEnumerated(MouseHandler.method651(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2062943344"
	)
	public void method3173() {
		if (this.field1762 != null) {
			for (int var1 = 0; var1 < this.field1762.length; var1 += 2) {
				if (this.field1762[var1] < this.field1770) {
					this.field1770 = this.field1762[var1];
				} else if (this.field1762[var1] > this.field1763) {
					this.field1763 = this.field1762[var1];
				}

				if (this.field1762[var1 + 1] < this.field1764) {
					this.field1764 = this.field1762[var1 + 1];
				} else if (this.field1762[var1 + 1] > this.field1766) {
					this.field1766 = this.field1762[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lpl;",
		garbageValue = "690648807"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lpl;",
		garbageValue = "-89662038"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels) WorldMapElement_cachedSprites.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class6.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "5179"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		UrlRequest.method2489();
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
