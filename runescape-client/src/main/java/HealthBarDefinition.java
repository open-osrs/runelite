import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("HitSplatDefinition_spritesArchive")
	public static AbstractArchive HitSplatDefinition_spritesArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1202719207
	)
	public int field3310;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 989487885
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 609506575
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1179673119
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1289103719
	)
	public int field3314;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1724859725
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1229803207
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -524037047
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 185744125
	)
	@Export("width")
	public int width;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1513629223
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
		this.field3314 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-1137754671"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.decodeNext(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "1563095853"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			var1.readUnsignedShort(); // L: 39
		} else if (var2 == 2) { // L: 41
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 42
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 43
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort(); // L: 44
		} else if (var2 == 6) { // L: 45
			var1.readUnsignedByte(); // L: 46
		} else if (var2 == 7) { // L: 48
			this.frontSpriteID = var1.method5851();
		} else if (var2 == 8) { // L: 49
			this.backSpriteID = var1.method5851();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort(); // L: 50
		} else if (var2 == 14) { // L: 51
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 52
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 54

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Llc;",
		garbageValue = "124"
	)
	@Export("getFrontSprite")
	public Sprite getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 57
			return null;
		} else {
			Sprite var1 = (Sprite)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 58
			if (var1 != null) {
				return var1; // L: 59
			} else {
				var1 = FloorDecoration.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.frontSpriteID, 0); // L: 60
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID); // L: 61
				}

				return var1; // L: 63
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Llc;",
		garbageValue = "120"
	)
	@Export("getBackSprite")
	public Sprite getBackSprite() {
		if (this.backSpriteID < 0) { // L: 67
			return null;
		} else {
			Sprite var1 = (Sprite)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 68
			if (var1 != null) { // L: 69
				return var1;
			} else {
				var1 = FloorDecoration.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.backSpriteID, 0); // L: 70
				if (var1 != null) { // L: 71
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 73
			}
		}
	}
}
