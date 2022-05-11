import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1647278563
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1174190197
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1853548417
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 195753019
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("s")
	@Export("name")
	public String name;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 814064351
	)
	public int field1871;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1883868595
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("c")
	public boolean field1876;
	@ObfuscatedName("w")
	public boolean field1874;
	@ObfuscatedName("b")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("t")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("g")
	int[] field1873;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -945687381
	)
	int field1865;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2079888943
	)
	int field1869;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1349758673
	)
	int field1885;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -817462247
	)
	int field1881;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("j")
	int[] field1884;
	@ObfuscatedName("z")
	byte[] field1877;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1922405763
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1876 = true; // L: 24
		this.field1874 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1865 = Integer.MAX_VALUE; // L: 29
		this.field1869 = Integer.MAX_VALUE; // L: 30
		this.field1885 = Integer.MIN_VALUE; // L: 31
		this.field1881 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "49"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 70
			if (var2 == 0) { // L: 71
				return; // L: 74
			}

			this.decodeNext(var1, var2); // L: 72
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IB)V",
		garbageValue = "6"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 77
			this.sprite1 = var1.method7532();
		} else if (var2 == 2) { // L: 78
			this.sprite2 = var1.method7532();
		} else if (var2 == 3) { // L: 79
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 80
			this.field1871 = var1.readMedium();
		} else if (var2 == 5) { // L: 81
			var1.readMedium(); // L: 82
		} else if (var2 == 6) { // L: 84
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 85
				var6 = var1.readUnsignedByte(); // L: 86
				if ((var6 & 1) == 0) { // L: 87
					this.field1876 = false;
				}

				if ((var6 & 2) == 2) { // L: 88
					this.field1874 = true;
				}
			} else if (var2 == 8) { // L: 90
				var1.readUnsignedByte(); // L: 91
			} else if (var2 >= 10 && var2 <= 14) { // L: 93
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 94
				var6 = var1.readUnsignedByte(); // L: 95
				this.field1873 = new int[var6 * 2]; // L: 96

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 97
					this.field1873[var4] = var1.readShort();
				}

				var1.readInt(); // L: 98
				var4 = var1.readUnsignedByte(); // L: 99
				this.field1884 = new int[var4]; // L: 100

				int var5;
				for (var5 = 0; var5 < this.field1884.length; ++var5) { // L: 101
					this.field1884[var5] = var1.readInt();
				}

				this.field1877 = new byte[var6]; // L: 102

				for (var5 = 0; var5 < var6; ++var5) { // L: 103
					this.field1877[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 105
				if (var2 == 17) { // L: 106
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 107
					var1.method7532(); // L: 108
				} else if (var2 == 19) { // L: 110
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 111
					var1.readInt(); // L: 112
				} else if (var2 == 22) { // L: 114
					var1.readInt(); // L: 115
				} else if (var2 == 23) { // L: 117
					var1.readUnsignedByte(); // L: 118
					var1.readUnsignedByte(); // L: 119
					var1.readUnsignedByte(); // L: 120
				} else if (var2 == 24) { // L: 122
					var1.readShort(); // L: 123
					var1.readShort(); // L: 124
				} else if (var2 == 25) { // L: 126
					var1.method7532(); // L: 127
				} else if (var2 == 28) { // L: 129
					var1.readUnsignedByte(); // L: 130
				} else if (var2 == 29) { // L: 132
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1937, HorizontalAlignment.field1938}; // L: 135
					this.horizontalAlignment = (HorizontalAlignment)class291.findEnumerated(var3, var1.readUnsignedByte()); // L: 137
				} else if (var2 == 30) { // L: 139
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.field2001, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1994}; // L: 142
					this.verticalAlignment = (VerticalAlignment)class291.findEnumerated(var7, var1.readUnsignedByte()); // L: 144
				}
			}
		}

	} // L: 147

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	void method3291() {
		if (this.field1873 != null) { // L: 150
			for (int var1 = 0; var1 < this.field1873.length; var1 += 2) { // L: 151
				if (this.field1873[var1] < this.field1865) { // L: 152
					this.field1865 = this.field1873[var1];
				} else if (this.field1873[var1] > this.field1885) { // L: 153
					this.field1885 = this.field1873[var1];
				}

				if (this.field1873[var1 + 1] < this.field1869) { // L: 154
					this.field1869 = this.field1873[var1 + 1];
				} else if (this.field1873[var1 + 1] > this.field1881) {
					this.field1881 = this.field1873[var1 + 1]; // L: 155
				}
			}
		}

	} // L: 158

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lqr;",
		garbageValue = "-1312642050"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 161
		return this.getSprite(var2); // L: 162
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lqr;",
		garbageValue = "1990397357"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 166
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 167
			if (var2 != null) { // L: 168
				return var2;
			} else {
				var2 = StructComposition.SpriteBuffer_getSprite(GrandExchangeOfferWorldComparator.WorldMapElement_archive, var1, 0); // L: 169
				if (var2 != null) { // L: 170
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 171
				}

				return var2; // L: 173
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 177
	}
}
