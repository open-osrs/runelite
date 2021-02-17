import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Liy;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1991794269
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1735605345
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 733089851
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2004503055
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("p")
	@Export("name")
	public String name;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2118102397
	)
	public int field3251;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1394872311
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("e")
	public boolean field3250;
	@ObfuscatedName("m")
	public boolean field3263;
	@ObfuscatedName("c")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("i")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("f")
	int[] field3254;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1853395127
	)
	int field3255;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1120447861
	)
	int field3256;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1444444969
	)
	int field3257;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 765833913
	)
	int field3258;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("s")
	int[] field3261;
	@ObfuscatedName("o")
	byte[] field3242;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1907461079
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0;
		this.field3250 = true;
		this.field3263 = false;
		this.menuActions = new String[5];
		this.field3255 = Integer.MAX_VALUE; // L: 29
		this.field3256 = Integer.MAX_VALUE; // L: 30
		this.field3257 = Integer.MIN_VALUE; // L: 31
		this.field3258 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "-1959908559"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;II)V",
		garbageValue = "-694353382"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 77
			this.sprite1 = var1.method5559();
		} else if (var2 == 2) { // L: 78
			this.sprite2 = var1.method5559();
		} else if (var2 == 3) { // L: 79
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 80
			this.field3251 = var1.readMedium();
		} else if (var2 == 5) { // L: 81
			var1.readMedium(); // L: 82
		} else if (var2 == 6) { // L: 84
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 85
				var6 = var1.readUnsignedByte(); // L: 86
				if ((var6 & 1) == 0) { // L: 87
					this.field3250 = false;
				}

				if ((var6 & 2) == 2) { // L: 88
					this.field3263 = true;
				}
			} else if (var2 == 8) { // L: 90
				var1.readUnsignedByte(); // L: 91
			} else if (var2 >= 10 && var2 <= 14) { // L: 93
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 94
				var6 = var1.readUnsignedByte(); // L: 95
				this.field3254 = new int[var6 * 2]; // L: 96

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 97
					this.field3254[var4] = var1.readShort();
				}

				var1.readInt(); // L: 98
				var4 = var1.readUnsignedByte(); // L: 99
				this.field3261 = new int[var4]; // L: 100

				int var5;
				for (var5 = 0; var5 < this.field3261.length; ++var5) { // L: 101
					this.field3261[var5] = var1.readInt();
				}

				this.field3242 = new byte[var6]; // L: 102

				for (var5 = 0; var5 < var6; ++var5) { // L: 103
					this.field3242[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 105
				if (var2 == 17) { // L: 106
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 107
					var1.method5559(); // L: 108
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
					var1.method5559(); // L: 127
				} else if (var2 == 28) { // L: 129
					var1.readUnsignedByte(); // L: 130
				} else if (var2 == 29) { // L: 132
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field3491, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field3490}; // L: 135
					this.horizontalAlignment = (HorizontalAlignment)UrlRequester.findEnumerated(var3, var1.readUnsignedByte()); // L: 137
				} else if (var2 == 30) { // L: 139
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.field3225, VerticalAlignment.field3229, VerticalAlignment.VerticalAlignment_centered}; // L: 142
					this.verticalAlignment = (VerticalAlignment)UrlRequester.findEnumerated(var7, var1.readUnsignedByte()); // L: 144
				}
			}
		}

	} // L: 147

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-604734124"
	)
	void method4391() {
		if (this.field3254 != null) { // L: 150
			for (int var1 = 0; var1 < this.field3254.length; var1 += 2) { // L: 151
				if (this.field3254[var1] < this.field3255) { // L: 152
					this.field3255 = this.field3254[var1];
				} else if (this.field3254[var1] > this.field3257) { // L: 153
					this.field3257 = this.field3254[var1];
				}

				if (this.field3254[var1 + 1] < this.field3256) { // L: 154
					this.field3256 = this.field3254[var1 + 1];
				} else if (this.field3254[var1 + 1] > this.field3258) {
					this.field3258 = this.field3254[var1 + 1]; // L: 155
				}
			}
		}

	} // L: 158

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZI)Llm;",
		garbageValue = "-375882692"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 161
		return this.getSprite(var2); // L: 162
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Llm;",
		garbageValue = "954144981"
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
				var2 = Skills.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 169
				if (var2 != null) { // L: 170
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 171
				}

				return var2; // L: 173
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1401841512"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 177
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Liw;",
		garbageValue = "1557457090"
	)
	public static FloorUnderlayDefinition method4405(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0); // L: 23
			var1 = new FloorUnderlayDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 26
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}
}
