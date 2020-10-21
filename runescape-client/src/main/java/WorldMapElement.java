import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lij;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1215445883
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1607593407
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 97047321
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("c")
	@Export("name")
	public String name;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1968208311
	)
	public int field3245;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1892301399
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("o")
	public boolean field3258;
	@ObfuscatedName("n")
	public boolean field3248;
	@ObfuscatedName("x")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("p")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("r")
	int[] field3243;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 802871207
	)
	int field3252;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -294512157
	)
	int field3253;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -935648347
	)
	int field3247;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2073996601
	)
	int field3255;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("a")
	int[] field3251;
	@ObfuscatedName("g")
	byte[] field3240;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2142350901
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
		this.field3258 = true; // L: 24
		this.field3248 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field3252 = Integer.MAX_VALUE; // L: 29
		this.field3253 = Integer.MAX_VALUE; // L: 30
		this.field3247 = Integer.MIN_VALUE; // L: 31
		this.field3255 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;S)V",
		garbageValue = "-15323"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "-2023596008"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 77
			this.sprite1 = var1.method5851();
		} else if (var2 == 2) { // L: 78
			this.sprite2 = var1.method5851();
		} else if (var2 == 3) { // L: 79
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 80
			this.field3245 = var1.readMedium();
		} else if (var2 == 5) { // L: 81
			var1.readMedium(); // L: 82
		} else if (var2 == 6) { // L: 84
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 85
				var6 = var1.readUnsignedByte(); // L: 86
				if ((var6 & 1) == 0) { // L: 87
					this.field3258 = false;
				}

				if ((var6 & 2) == 2) { // L: 88
					this.field3248 = true;
				}
			} else if (var2 == 8) { // L: 90
				var1.readUnsignedByte(); // L: 91
			} else if (var2 >= 10 && var2 <= 14) { // L: 93
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 94
				var6 = var1.readUnsignedByte(); // L: 95
				this.field3243 = new int[var6 * 2]; // L: 96

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 97
					this.field3243[var4] = var1.readShort();
				}

				var1.readInt(); // L: 98
				var4 = var1.readUnsignedByte(); // L: 99
				this.field3251 = new int[var4]; // L: 100

				int var5;
				for (var5 = 0; var5 < this.field3251.length; ++var5) { // L: 101
					this.field3251[var5] = var1.readInt();
				}

				this.field3240 = new byte[var6]; // L: 102

				for (var5 = 0; var5 < var6; ++var5) { // L: 103
					this.field3240[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 105
				if (var2 == 17) { // L: 106
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 107
					var1.method5851(); // L: 108
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
					var1.method5851(); // L: 127
				} else if (var2 == 28) { // L: 129
					var1.readUnsignedByte(); // L: 130
				} else if (var2 == 29) { // L: 132
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field3479, HorizontalAlignment.field3481, HorizontalAlignment.HorizontalAlignment_centered}; // L: 135
					this.horizontalAlignment = (HorizontalAlignment)class195.findEnumerated(var3, var1.readUnsignedByte()); // L: 137
				} else if (var2 == 30) { // L: 139
					this.verticalAlignment = (VerticalAlignment)class195.findEnumerated(ScriptEvent.method1279(), var1.readUnsignedByte()); // L: 140
				}
			}
		}

	} // L: 143

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1612993867"
	)
	void method4518() {
		if (this.field3243 != null) { // L: 146
			for (int var1 = 0; var1 < this.field3243.length; var1 += 2) { // L: 147
				if (this.field3243[var1] < this.field3252) { // L: 148
					this.field3252 = this.field3243[var1];
				} else if (this.field3243[var1] > this.field3247) { // L: 149
					this.field3247 = this.field3243[var1];
				}

				if (this.field3243[var1 + 1] < this.field3253) { // L: 150
					this.field3253 = this.field3243[var1 + 1];
				} else if (this.field3243[var1 + 1] > this.field3255) {
					this.field3255 = this.field3243[var1 + 1]; // L: 151
				}
			}
		}

	} // L: 154

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ZI)Llc;",
		garbageValue = "-2016135845"
	)
	@Export("getSpriteBool")
	public Sprite getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 157
		return this.getSprite(var2); // L: 158
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Llc;",
		garbageValue = "1884936089"
	)
	@Export("getSprite")
	Sprite getSprite(int var1) {
		if (var1 < 0) { // L: 162
			return null;
		} else {
			Sprite var2 = (Sprite)WorldMapElement_cachedSprites.get((long)var1); // L: 163
			if (var2 != null) { // L: 164
				return var2;
			} else {
				var2 = FloorDecoration.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 165
				if (var2 != null) { // L: 166
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 167
				}

				return var2; // L: 169
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-932820751"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 173
	}
}
