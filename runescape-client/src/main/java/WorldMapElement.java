import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Len;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1280320999
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2056696763
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -976227479
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1158497187
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("p")
	@Export("name")
	public String name;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1157635857
	)
	public int field1626;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 334109615
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("y")
	public boolean field1641;
	@ObfuscatedName("k")
	public boolean field1629;
	@ObfuscatedName("t")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("l")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("u")
	int[] field1632;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1219303973
	)
	int field1633;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1453776181
	)
	int field1634;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -526173565
	)
	int field1635;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2048716063
	)
	int field1621;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("c")
	int[] field1636;
	@ObfuscatedName("f")
	byte[] field1638;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1234093325
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1641 = true; // L: 24
		this.field1629 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1633 = Integer.MAX_VALUE; // L: 29
		this.field1634 = Integer.MAX_VALUE; // L: 30
		this.field1635 = Integer.MIN_VALUE; // L: 31
		this.field1621 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;S)V",
		garbageValue = "5756"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 52
			if (var2 == 0) { // L: 53
				return; // L: 56
			}

			this.decodeNext(var1, var2); // L: 54
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;IB)V",
		garbageValue = "-64"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method6946();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method6946();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1626 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 67
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field1641 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field1629 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field1632 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field1632[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1636 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1636.length; ++var5) { // L: 83
					this.field1636[var5] = var1.readInt();
				}

				this.field1638 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field1638[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method6946(); // L: 90
				} else if (var2 == 19) { // L: 92
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 93
					var1.readInt(); // L: 94
				} else if (var2 == 22) { // L: 96
					var1.readInt(); // L: 97
				} else if (var2 == 23) { // L: 99
					var1.readUnsignedByte(); // L: 100
					var1.readUnsignedByte(); // L: 101
					var1.readUnsignedByte(); // L: 102
				} else if (var2 == 24) { // L: 104
					var1.readShort(); // L: 105
					var1.readShort(); // L: 106
				} else if (var2 == 25) { // L: 108
					var1.method6946(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1699, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1694}; // L: 117
					this.horizontalAlignment = (HorizontalAlignment)UserComparator4.findEnumerated(var3, var1.readUnsignedByte()); // L: 119
				} else if (var2 == 30) { // L: 121
					this.verticalAlignment = (VerticalAlignment)UserComparator4.findEnumerated(class150.method2969(), var1.readUnsignedByte()); // L: 122
				}
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	public void method3008() {
		if (this.field1632 != null) {
			for (int var1 = 0; var1 < this.field1632.length; var1 += 2) {
				if (this.field1632[var1] < this.field1633) { // L: 130
					this.field1633 = this.field1632[var1];
				} else if (this.field1632[var1] > this.field1635) { // L: 131
					this.field1635 = this.field1632[var1];
				}

				if (this.field1632[var1 + 1] < this.field1634) { // L: 132
					this.field1634 = this.field1632[var1 + 1];
				} else if (this.field1632[var1 + 1] > this.field1621) {
					this.field1621 = this.field1632[var1 + 1]; // L: 133
				}
			}
		}

	} // L: 136

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZI)Low;",
		garbageValue = "1908363794"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 139
		return this.getSprite(var2); // L: 140
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Low;",
		garbageValue = "-834050600"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 144
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 145
			if (var2 != null) { // L: 146
				return var2;
			} else {
				var2 = WorldMapSection0.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 147
				if (var2 != null) { // L: 148
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 149
				}

				return var2; // L: 151
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1251139845"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 155
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "72"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 124
			if (KeyHandler.field107 == KeyHandler.field131) { // L: 125
				return false;
			} else {
				class12.field55 = KeyHandler.field124[KeyHandler.field107]; // L: 126
				class319.field3858 = KeyHandler.field112[KeyHandler.field107]; // L: 127
				KeyHandler.field107 = KeyHandler.field107 + 1 & 127; // L: 128
				return true; // L: 129
			}
		}
	}
}
