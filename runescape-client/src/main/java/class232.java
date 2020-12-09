import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class232 {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -769848499
	)
	static int field2778;

	static {
		int var0 = 0;
		int var1 = 0;
		class238[] var2 = Occluder.method3377();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class238 var4 = var2[var3];
			if (var4.field3113 > var0) {
				var0 = var4.field3113;
			}

			if (var4.field3117 > var1) {
				var1 = var4.field3117;
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "359325372"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class336.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class336.SpriteBuffer_xOffsets = new int[class336.SpriteBuffer_spriteCount];
		class336.SpriteBuffer_yOffsets = new int[class336.SpriteBuffer_spriteCount];
		class336.SpriteBuffer_spriteWidths = new int[class336.SpriteBuffer_spriteCount];
		class336.SpriteBuffer_spriteHeights = new int[class336.SpriteBuffer_spriteCount];
		GrandExchangeEvents.SpriteBuffer_pixels = new byte[class336.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class336.SpriteBuffer_spriteCount * 8;
		DirectByteArrayCopier.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class336.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
			class336.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
			class336.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
			class336.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
			class336.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class336.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class336.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			class336.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class336.SpriteBuffer_spritePalette[var3] == 0) {
				class336.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class336.SpriteBuffer_spriteWidths[var3];
			int var5 = class336.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			GrandExchangeEvents.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "269523083"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (Timer.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
