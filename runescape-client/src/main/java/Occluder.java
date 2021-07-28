import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1709670941
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1670329551
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1055641369
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -611436287
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1293981005
	)
	@Export("type")
	int type;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1427556997
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 685232413
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -625879659
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -21601359
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 35210795
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -300719963
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 857957481
	)
	int field2365;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 376208763
	)
	int field2366;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -978419187
	)
	int field2367;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 379104137
	)
	int field2368;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1190788297
	)
	int field2370;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1468268797
	)
	int field2359;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1790151051
	)
	int field2371;

	Occluder() {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "24"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class398.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class398.SpriteBuffer_xOffsets = new int[class398.SpriteBuffer_spriteCount];
		class398.SpriteBuffer_yOffsets = new int[class398.SpriteBuffer_spriteCount];
		ClanChannelMember.SpriteBuffer_spriteWidths = new int[class398.SpriteBuffer_spriteCount];
		class374.SpriteBuffer_spriteHeights = new int[class398.SpriteBuffer_spriteCount];
		class398.SpriteBuffer_pixels = new byte[class398.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class398.SpriteBuffer_spriteCount * 8;
		class398.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class398.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class398.SpriteBuffer_spriteCount; ++var3) {
			class398.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class398.SpriteBuffer_spriteCount; ++var3) {
			class398.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class398.SpriteBuffer_spriteCount; ++var3) {
			ClanChannelMember.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class398.SpriteBuffer_spriteCount; ++var3) {
			class374.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class398.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class118.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			class118.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class118.SpriteBuffer_spritePalette[var3] == 0) {
				class118.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class398.SpriteBuffer_spriteCount; ++var3) {
			int var4 = ClanChannelMember.SpriteBuffer_spriteWidths[var3];
			int var5 = class374.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			class398.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}

	}
}
