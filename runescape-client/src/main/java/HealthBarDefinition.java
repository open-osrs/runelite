import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("HitSplatDefinition_spritesArchive")
	static AbstractArchive HitSplatDefinition_spritesArchive;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1580647969
	)
	public int field3445;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1915373731
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -705328787
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1087924017
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1064915775
	)
	public int field3449;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1893940143
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -823709463
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2043663533
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 160646161
	)
	@Export("width")
	public int width;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1462204015
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	public HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field3449 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "588225385"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.decodeNext(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnu;II)V",
		garbageValue = "368953375"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 43
			var1.readUnsignedShort(); // L: 44
		} else if (var2 == 2) { // L: 46
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 47
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 48
			this.int3 = 0;
		} else if (var2 == 5) { // L: 49
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 50
			var1.readUnsignedByte(); // L: 51
		} else if (var2 == 7) { // L: 53
			this.frontSpriteID = var1.method6597();
		} else if (var2 == 8) { // L: 54
			this.backSpriteID = var1.method6597();
		} else if (var2 == 11) { // L: 55
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 56
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 57
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 59

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;",
		garbageValue = "1473587494"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 62
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 63
			if (var1 != null) {
				return var1; // L: 64
			} else {
				var1 = ModelData0.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.frontSpriteID, 0); // L: 65
				if (var1 != null) { // L: 66
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 68
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;",
		garbageValue = "-540138434"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) { // L: 72
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 73
			if (var1 != null) {
				return var1; // L: 74
			} else {
				var1 = ModelData0.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.backSpriteID, 0); // L: 75
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 76
				}

				return var1; // L: 78
			}
		}
	}
}
