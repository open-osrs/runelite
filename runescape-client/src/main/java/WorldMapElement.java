import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lew;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -298295867
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 300345687
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1973945717
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("b")
	@Export("name")
	public String name;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1016348217
	)
	public int field1557;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 945546823
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("l")
	public boolean field1560;
	@ObfuscatedName("o")
	public boolean field1561;
	@ObfuscatedName("c")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("e")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("g")
	int[] field1564;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 61627465
	)
	int field1565;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1855572569
	)
	int field1574;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1059928721
	)
	int field1567;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1980828279
	)
	int field1568;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("t")
	int[] field1571;
	@ObfuscatedName("h")
	byte[] field1572;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 41328569
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
		this.field1560 = true; // L: 24
		this.field1561 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1565 = Integer.MAX_VALUE; // L: 29
		this.field1574 = Integer.MAX_VALUE; // L: 30
		this.field1567 = Integer.MIN_VALUE; // L: 31
		this.field1568 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1509060370"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "-1414929060"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 77
			this.sprite1 = var1.method6583();
		} else if (var2 == 2) { // L: 78
			this.sprite2 = var1.method6583();
		} else if (var2 == 3) { // L: 79
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 80
			this.field1557 = var1.readMedium();
		} else if (var2 == 5) { // L: 81
			var1.readMedium(); // L: 82
		} else if (var2 == 6) { // L: 84
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) { // L: 85
				var3 = var1.readUnsignedByte(); // L: 86
				if ((var3 & 1) == 0) { // L: 87
					this.field1560 = false;
				}

				if ((var3 & 2) == 2) { // L: 88
					this.field1561 = true;
				}
			} else if (var2 == 8) { // L: 90
				var1.readUnsignedByte(); // L: 91
			} else if (var2 >= 10 && var2 <= 14) { // L: 93
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 94
				var3 = var1.readUnsignedByte(); // L: 95
				this.field1564 = new int[var3 * 2]; // L: 96

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) { // L: 97
					this.field1564[var4] = var1.readShort();
				}

				var1.readInt(); // L: 98
				var4 = var1.readUnsignedByte(); // L: 99
				this.field1571 = new int[var4]; // L: 100

				int var5;
				for (var5 = 0; var5 < this.field1571.length; ++var5) { // L: 101
					this.field1571[var5] = var1.readInt();
				}

				this.field1572 = new byte[var3]; // L: 102

				for (var5 = 0; var5 < var3; ++var5) { // L: 103
					this.field1572[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 105
				if (var2 == 17) { // L: 106
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 107
					var1.method6583(); // L: 108
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
					var1.method6583(); // L: 127
				} else if (var2 == 28) { // L: 129
					var1.readUnsignedByte(); // L: 130
				} else if (var2 == 29) { // L: 132
					this.horizontalAlignment = (HorizontalAlignment)Messages.findEnumerated(FloorOverlayDefinition.method3103(), var1.readUnsignedByte()); // L: 133
				} else if (var2 == 30) { // L: 135
					this.verticalAlignment = (VerticalAlignment)Messages.findEnumerated(MouseRecorder.method2095(), var1.readUnsignedByte()); // L: 136
				}
			}
		}

	} // L: 139

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-505496297"
	)
	void method2634() {
		if (this.field1564 != null) { // L: 142
			for (int var1 = 0; var1 < this.field1564.length; var1 += 2) { // L: 143
				if (this.field1564[var1] < this.field1565) { // L: 144
					this.field1565 = this.field1564[var1];
				} else if (this.field1564[var1] > this.field1567) {
					this.field1567 = this.field1564[var1]; // L: 145
				}

				if (this.field1564[var1 + 1] < this.field1574) { // L: 146
					this.field1574 = this.field1564[var1 + 1];
				} else if (this.field1564[var1 + 1] > this.field1568) {
					this.field1568 = this.field1564[var1 + 1]; // L: 147
				}
			}
		}

	} // L: 150

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZI)Loh;",
		garbageValue = "-2060838679"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 153
		return this.getSprite(var2); // L: 154
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Loh;",
		garbageValue = "2134541760"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 158
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 159
			if (var2 != null) { // L: 160
				return var2;
			} else {
				var2 = ClientPacket.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 161
				if (var2 != null) { // L: 162
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 163
				}

				return var2; // L: 165
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1931066057"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 169
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "-28639"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 134
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1291818540"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 868
			var1 /= 2;
		}

		if (var2 > 192) { // L: 869
			var1 /= 2;
		}

		if (var2 > 217) { // L: 870
			var1 /= 2;
		}

		if (var2 > 243) { // L: 871
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 872
		return var3; // L: 873
	}
}
