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
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class238[] var2 = Occluder.method3377(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class238 var4 = var2[var3]; // L: 14
			if (var4.field3113 > var0) {
				var0 = var4.field3113; // L: 16
			}

			if (var4.field3117 > var1) { // L: 17
				var1 = var4.field3117;
			}
		}

	} // L: 21

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "359325372"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 208
		var1.offset = var0.length - 2; // L: 209
		class336.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 210
		class336.SpriteBuffer_xOffsets = new int[class336.SpriteBuffer_spriteCount]; // L: 211
		class336.SpriteBuffer_yOffsets = new int[class336.SpriteBuffer_spriteCount]; // L: 212
		class336.SpriteBuffer_spriteWidths = new int[class336.SpriteBuffer_spriteCount]; // L: 213
		class336.SpriteBuffer_spriteHeights = new int[class336.SpriteBuffer_spriteCount]; // L: 214
		GrandExchangeEvents.SpriteBuffer_pixels = new byte[class336.SpriteBuffer_spriteCount][]; // L: 215
		var1.offset = var0.length - 7 - class336.SpriteBuffer_spriteCount * 8; // L: 216
		DirectByteArrayCopier.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 217
		class336.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 218
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 219

		int var3;
		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 220
			class336.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 221
			class336.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 222
			class336.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 223
			class336.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class336.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 224
		class336.SpriteBuffer_spritePalette = new int[var2]; // L: 225

		for (var3 = 1; var3 < var2; ++var3) { // L: 226
			class336.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 227
			if (class336.SpriteBuffer_spritePalette[var3] == 0) { // L: 228
				class336.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 230

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 231
			int var4 = class336.SpriteBuffer_spriteWidths[var3]; // L: 232
			int var5 = class336.SpriteBuffer_spriteHeights[var3]; // L: 233
			int var6 = var5 * var4; // L: 234
			byte[] var7 = new byte[var6]; // L: 235
			GrandExchangeEvents.SpriteBuffer_pixels[var3] = var7; // L: 236
			int var8 = var1.readUnsignedByte(); // L: 237
			int var9;
			if (var8 == 0) { // L: 238
				for (var9 = 0; var9 < var6; ++var9) { // L: 239
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 241
				for (var9 = 0; var9 < var4; ++var9) { // L: 242
					for (int var10 = 0; var10 < var5; ++var10) { // L: 243
						var7[var9 + var10 * var4] = var1.readByte(); // L: 244
					}
				}
			}
		}

	} // L: 249

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "269523083"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (Timer.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3697
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3698
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3699
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3700
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3701
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3702
			++Client.soundEffectCount; // L: 3703
		}

	} // L: 3705
}
