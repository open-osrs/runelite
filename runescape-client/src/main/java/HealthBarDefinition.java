import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("HealthBarDefinition_archive")
	static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("HitSplatDefinition_spritesArchive")
	static AbstractArchive HitSplatDefinition_spritesArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		longValue = -8980886383990027525L
	)
	static long field1681;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 933389157
	)
	public int field1670;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -358658515
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2089229871
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -860787199
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1783319749
	)
	public int field1675;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -391654511
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 690526725
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 572887043
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -643051501
	)
	@Export("width")
	public int width;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 505163947
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1675 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "1763232152"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;IB)V",
		garbageValue = "-37"
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
			this.frontSpriteID = var1.method6985();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method6985();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Loc;",
		garbageValue = "2090107187"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class258.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Loc;",
		garbageValue = "-1821086561"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class258.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Lip;",
		garbageValue = "-1012659579"
	)
	public static class240[] method2890() {
		return new class240[]{class240.field2755, class240.field2749, class240.field2751, class240.field2752, class240.field2753, class240.field2760, class240.field2750, class240.field2756, class240.field2757, class240.field2758};
	}

	@ObfuscatedName("a")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}
}
