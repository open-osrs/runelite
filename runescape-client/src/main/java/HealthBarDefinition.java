import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("HealthBarDefinition_spritesArchive")
	public static AbstractArchive HealthBarDefinition_spritesArchive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Ler;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Ler;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = 1912123225
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1515955705
	)
	public int field381;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 390656615
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1890433231
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1180353973
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1956457117
	)
	@Export("int4")
	public int int4;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -642961053
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1310001257
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1707680631
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -354704697
	)
	@Export("width")
	public int width;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 166567703
	)
	@Export("widthPadding")
	public int widthPadding;

	public HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.int4 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lgr;I)V",
		garbageValue = "280763431"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lgr;IB)V",
		garbageValue = "10"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.method51();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method51();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(B)Lln;",
		garbageValue = "-97"
	)
	@Export("getFrontSprite")
	public Sprite getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		}
		Sprite var1 = (Sprite)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
		if (var1 != null) {
			return var1;
		}
		var1 = class322.SpriteBuffer_tryCreateSprite(HealthBarDefinition_spritesArchive, this.frontSpriteID, 0);
		if (var1 != null) {
			HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
		}

		return var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(B)Lln;",
		garbageValue = "-17"
	)
	@Export("getBackSprite")
	public Sprite getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		}
		Sprite var1 = (Sprite)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
		if (var1 != null) {
			return var1;
		}
		var1 = class322.SpriteBuffer_tryCreateSprite(HealthBarDefinition_spritesArchive, this.backSpriteID, 0);
		if (var1 != null) {
			HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
		}

		return var1;
	}

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}
}
