import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public static AbstractArchive field1877;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = 693787955
	)
	static int field1888;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1094973945
	)
	public int field1876;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2143269191
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -131797823
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 546193187
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 701454719
	)
	public int field1881;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1633864587
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1383515023
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 534190147
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1354984089
	)
	@Export("width")
	public int width;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -548301543
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
		this.field1881 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "2126050734"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 43
			if (var2 == 0) { // L: 44
				return; // L: 47
			}

			this.decodeNext(var1, var2); // L: 45
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "442152840"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 50
			var1.readUnsignedShort(); // L: 51
		} else if (var2 == 2) { // L: 53
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 54
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 55
			this.int3 = 0;
		} else if (var2 == 5) { // L: 56
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 57
			var1.readUnsignedByte(); // L: 58
		} else if (var2 == 7) { // L: 60
			this.frontSpriteID = var1.method7752();
		} else if (var2 == 8) { // L: 61
			this.backSpriteID = var1.method7752();
		} else if (var2 == 11) { // L: 62
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 63
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 64
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 66

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lqe;",
		garbageValue = "-83"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 69
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 70
			if (var1 != null) {
				return var1; // L: 71
			} else {
				var1 = class7.SpriteBuffer_getSprite(field1877, this.frontSpriteID, 0); // L: 72
				if (var1 != null) { // L: 73
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 75
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lqe;",
		garbageValue = "-1408497685"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) { // L: 79
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 80
			if (var1 != null) {
				return var1; // L: 81
			} else {
				var1 = class7.SpriteBuffer_getSprite(field1877, this.backSpriteID, 0); // L: 82
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 83
				}

				return var1; // L: 85
			}
		}
	}
}
