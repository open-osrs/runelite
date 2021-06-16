import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("HealthBarDefinition_archive")
	static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1611863233
	)
	public int field1602;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 765111099
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -448867717
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 608050033
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 277480779
	)
	public int field1607;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -891708783
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1488754817
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1162639959
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1514706787
	)
	@Export("width")
	public int width;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -320308869
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1607 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1015511162"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 48
			if (var2 == 0) { // L: 49
				return; // L: 52
			}

			this.decodeNext(var1, var2); // L: 50
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "-1870101408"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 55
			var1.readUnsignedShort(); // L: 56
		} else if (var2 == 2) { // L: 58
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 59
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 60
			this.int3 = 0;
		} else if (var2 == 5) { // L: 61
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 62
			var1.readUnsignedByte(); // L: 63
		} else if (var2 == 7) { // L: 65
			this.frontSpriteID = var1.method6630();
		} else if (var2 == 8) { // L: 66
			this.backSpriteID = var1.method6630();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort(); // L: 67
		} else if (var2 == 14) { // L: 68
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 69
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 71

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Loa;",
		garbageValue = "-1342831199"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 74
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 75
			if (var1 != null) {
				return var1; // L: 76
			} else {
				var1 = Tile.SpriteBuffer_getSprite(class378.HitSplatDefinition_spritesArchive, this.frontSpriteID, 0); // L: 77
				if (var1 != null) { // L: 78
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 80
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Loa;",
		garbageValue = "1938378988"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) { // L: 84
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 85
			if (var1 != null) {
				return var1; // L: 86
			} else {
				var1 = Tile.SpriteBuffer_getSprite(class378.HitSplatDefinition_spritesArchive, this.backSpriteID, 0); // L: 87
				if (var1 != null) { // L: 88
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 90
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IZS)Ljava/lang/String;",
		garbageValue = "-25961"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) { // L: 114
			int var3 = var0; // L: 116
			String var2;
			if (var1 && var0 >= 0) { // L: 119
				int var4 = 2; // L: 123

				for (int var5 = var0 / 10; var5 != 0; ++var4) { // L: 124 125 127
					var5 /= 10; // L: 126
				}

				char[] var6 = new char[var4]; // L: 129
				var6[0] = '+'; // L: 130

				for (int var7 = var4 - 1; var7 > 0; --var7) { // L: 131
					int var8 = var3; // L: 132
					var3 /= 10; // L: 133
					int var9 = var8 - var3 * 10; // L: 134
					if (var9 >= 10) { // L: 135
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48); // L: 136
					}
				}

				var2 = new String(var6); // L: 138
			} else {
				var2 = Integer.toString(var0, 10); // L: 120
			}

			return var2; // L: 140
		} else {
			return Integer.toString(var0);
		}
	}
}
