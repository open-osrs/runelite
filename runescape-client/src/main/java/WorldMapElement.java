import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 652863899
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1200781577
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1475941253
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 318056933
	)
	public int field3417;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 226936447
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("m")
	public boolean field3411;
	@ObfuscatedName("d")
	public boolean field3412;
	@ObfuscatedName("c")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("j")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("r")
	int[] field3419;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 878715993
	)
	int field3416;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1352620723
	)
	int field3422;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1995930283
	)
	int field3418;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2048510459
	)
	int field3406;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("a")
	int[] field3413;
	@ObfuscatedName("w")
	byte[] field3423;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1471498251
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
		this.field3411 = true; // L: 24
		this.field3412 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field3416 = Integer.MAX_VALUE; // L: 29
		this.field3422 = Integer.MAX_VALUE; // L: 30
		this.field3418 = Integer.MIN_VALUE; // L: 31
		this.field3406 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "1455317514"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnu;II)V",
		garbageValue = "-1298333373"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 77
			this.sprite1 = var1.method6597();
		} else if (var2 == 2) { // L: 78
			this.sprite2 = var1.method6597();
		} else if (var2 == 3) { // L: 79
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 80
			this.field3417 = var1.readMedium();
		} else if (var2 == 5) { // L: 81
			var1.readMedium(); // L: 82
		} else if (var2 == 6) { // L: 84
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 85
				var6 = var1.readUnsignedByte(); // L: 86
				if ((var6 & 1) == 0) { // L: 87
					this.field3411 = false;
				}

				if ((var6 & 2) == 2) { // L: 88
					this.field3412 = true;
				}
			} else if (var2 == 8) { // L: 90
				var1.readUnsignedByte(); // L: 91
			} else if (var2 >= 10 && var2 <= 14) { // L: 93
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 94
				var6 = var1.readUnsignedByte(); // L: 95
				this.field3419 = new int[var6 * 2]; // L: 96

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 97
					this.field3419[var4] = var1.readShort();
				}

				var1.readInt(); // L: 98
				var4 = var1.readUnsignedByte(); // L: 99
				this.field3413 = new int[var4]; // L: 100

				int var5;
				for (var5 = 0; var5 < this.field3413.length; ++var5) { // L: 101
					this.field3413[var5] = var1.readInt();
				}

				this.field3423 = new byte[var6]; // L: 102

				for (var5 = 0; var5 < var6; ++var5) { // L: 103
					this.field3423[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 105
				if (var2 == 17) { // L: 106
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 107
					var1.method6597(); // L: 108
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
					var1.method6597(); // L: 127
				} else if (var2 == 28) { // L: 129
					var1.readUnsignedByte(); // L: 130
				} else if (var2 == 29) { // L: 132
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field3468, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field3469}; // L: 135
					this.horizontalAlignment = (HorizontalAlignment)UserComparator8.findEnumerated(var3, var1.readUnsignedByte()); // L: 137
				} else if (var2 == 30) { // L: 139
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field3517, VerticalAlignment.field3514}; // L: 142
					this.verticalAlignment = (VerticalAlignment)UserComparator8.findEnumerated(var7, var1.readUnsignedByte()); // L: 144
				}
			}
		}

	} // L: 147

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-465360843"
	)
	void method4907() {
		if (this.field3419 != null) { // L: 150
			for (int var1 = 0; var1 < this.field3419.length; var1 += 2) { // L: 151
				if (this.field3419[var1] < this.field3416) { // L: 152
					this.field3416 = this.field3419[var1];
				} else if (this.field3419[var1] > this.field3418) { // L: 153
					this.field3418 = this.field3419[var1];
				}

				if (this.field3419[var1 + 1] < this.field3422) { // L: 154
					this.field3422 = this.field3419[var1 + 1];
				} else if (this.field3419[var1 + 1] > this.field3406) {
					this.field3406 = this.field3419[var1 + 1]; // L: 155
				}
			}
		}

	} // L: 158

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZI)Loh;",
		garbageValue = "-1983401566"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 161
		return this.getSprite(var2); // L: 162
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Loh;",
		garbageValue = "-73698462"
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
				var2 = ModelData0.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 169
				if (var2 != null) { // L: 170
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 171
				}

				return var2; // L: 173
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-643985376"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 177
	}
}
