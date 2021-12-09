import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static AbstractArchive field1802;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	public static EvictingDualNodeHashTable field1795;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 80054529
	)
	public int field1796;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2024143827
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1723644231
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -599583981
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -74289
	)
	public int field1798;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1294615051
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 374618257
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1037854791
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 29322481
	)
	@Export("width")
	public int width;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 702748913
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 14
		field1795 = new EvictingDualNodeHashTable(64); // L: 15
	}

	HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1798 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1574021217"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-1746560139"
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
			this.frontSpriteID = var1.method7400();
		} else if (var2 == 8) { // L: 66
			this.backSpriteID = var1.method7400();
		} else if (var2 == 11) { // L: 67
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 68
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 69
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 71

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;",
		garbageValue = "-1857525750"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 74
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field1795.get((long)this.frontSpriteID); // L: 75
			if (var1 != null) {
				return var1; // L: 76
			} else {
				var1 = class6.SpriteBuffer_getSprite(field1802, this.frontSpriteID, 0); // L: 77
				if (var1 != null) {
					field1795.put(var1, (long)this.frontSpriteID); // L: 78
				}

				return var1; // L: 80
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;",
		garbageValue = "-1451649947"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) { // L: 84
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field1795.get((long)this.backSpriteID); // L: 85
			if (var1 != null) { // L: 86
				return var1;
			} else {
				var1 = class6.SpriteBuffer_getSprite(field1802, this.backSpriteID, 0); // L: 87
				if (var1 != null) { // L: 88
					field1795.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 90
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "127"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 144
	}
}
