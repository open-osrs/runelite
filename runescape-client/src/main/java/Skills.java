import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("v")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("x")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lib;IIB)Llm;",
		garbageValue = "71"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!class304.method5363(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels var4 = new SpritePixels(); // L: 57
			var4.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth; // L: 58
			var4.height = class336.SpriteBuffer_spriteHeight;
			var4.xOffset = class336.SpriteBuffer_xOffsets[0]; // L: 60
			var4.yOffset = class336.SpriteBuffer_yOffsets[0]; // L: 61
			var4.subWidth = class336.SpriteBuffer_spriteWidths[0]; // L: 62
			var4.subHeight = class336.SpriteBuffer_spriteHeights[0]; // L: 63
			int var5 = var4.subWidth * var4.subHeight; // L: 64
			byte[] var6 = GrandExchangeEvents.SpriteBuffer_pixels[0]; // L: 65
			var4.pixels = new int[var5]; // L: 66

			for (int var7 = 0; var7 < var5; ++var7) { // L: 67
				var4.pixels[var7] = class336.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class336.SpriteBuffer_xOffsets = null; // L: 69
			class336.SpriteBuffer_yOffsets = null; // L: 70
			class336.SpriteBuffer_spriteWidths = null; // L: 71
			class336.SpriteBuffer_spriteHeights = null; // L: 72
			class336.SpriteBuffer_spritePalette = null; // L: 73
			GrandExchangeEvents.SpriteBuffer_pixels = null; // L: 74
			return var4; // L: 78
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILlx;Lil;I)V",
		garbageValue = "-1369689255"
	)
	static void method4147(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 40
		var3.type = 1; // L: 41
		var3.key = (long)var0; // L: 42
		var3.archiveDisk = var1; // L: 43
		var3.archive = var2; // L: 44
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 45
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 46
		} // L: 47

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 49
			if (ArchiveDiskActionHandler.field3178 == 0) { // L: 50
				SecureRandomFuture.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 51
				SecureRandomFuture.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 52
				SecureRandomFuture.ArchiveDiskActionHandler_thread.start(); // L: 53
				SecureRandomFuture.ArchiveDiskActionHandler_thread.setPriority(5); // L: 54
			}

			ArchiveDiskActionHandler.field3178 = 600; // L: 56
		}
	} // L: 59

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)I",
		garbageValue = "-1376261869"
	)
	static int method4146(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 189
		int var2;
		if (var1 == 0) { // L: 191
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5); // L: 192
		} else if (var1 == 2) { // L: 193
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 194
		}

		return var2; // L: 195
	}
}
