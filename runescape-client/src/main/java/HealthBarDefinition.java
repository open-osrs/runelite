import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static AbstractArchive field1867;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1957048791
	)
	public int field1871;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -283973337
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 694103189
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 177796267
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1297607601
	)
	public int field1876;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2023566389
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1796071987
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -723325657
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1781778827
	)
	@Export("width")
	public int width;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1386746085
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
		this.field1876 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "1589397026"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V",
		garbageValue = "1030861965"
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
			this.frontSpriteID = var1.method7742();
		} else if (var2 == 8) { // L: 61
			this.backSpriteID = var1.method7742();
		} else if (var2 == 11) { // L: 62
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 63
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 64
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 66

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "-249328234"
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
				var1 = InterfaceParent.SpriteBuffer_getSprite(field1867, this.frontSpriteID, 0); // L: 72
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID); // L: 73
				}

				return var1; // L: 75
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "618558112"
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
				var1 = InterfaceParent.SpriteBuffer_getSprite(field1867, this.backSpriteID, 0); // L: 82
				if (var1 != null) { // L: 83
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 85
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lnu;",
		garbageValue = "1"
	)
	public static class387 method3428() {
		synchronized(class387.field4344) {
			if (class387.field4346 == 0) { // L: 26
				return new class387();
			} else {
				class387.field4344[--class387.field4346].method7061(); // L: 28
				return class387.field4344[class387.field4346]; // L: 29
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "0"
	)
	public static float method3433(int var0) {
		var0 &= 16383; // L: 24
		return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D); // L: 25
	}
}
