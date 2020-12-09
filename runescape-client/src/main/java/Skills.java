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
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
		Skills_experienceTable = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			Skills_experienceTable[var1] = var0 / 4;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lib;IIB)Llm;",
		garbageValue = "71"
	)
	@Export("SpriteBuffer_getSprite")
	public static Sprite SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!class304.method5363(var0, var1, var2)) {
			return null;
		} else {
			Sprite var4 = new Sprite();
			var4.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth;
			var4.height = class336.SpriteBuffer_spriteHeight;
			var4.xOffset = class336.SpriteBuffer_xOffsets[0];
			var4.yOffset = class336.SpriteBuffer_yOffsets[0];
			var4.subWidth = class336.SpriteBuffer_spriteWidths[0];
			var4.subHeight = class336.SpriteBuffer_spriteHeights[0];
			int var5 = var4.subWidth * var4.subHeight;
			byte[] var6 = GrandExchangeEvents.SpriteBuffer_pixels[0];
			var4.pixels = new int[var5];

			for (int var7 = 0; var7 < var5; ++var7) {
				var4.pixels[var7] = class336.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class336.SpriteBuffer_xOffsets = null;
			class336.SpriteBuffer_yOffsets = null;
			class336.SpriteBuffer_spriteWidths = null;
			class336.SpriteBuffer_spriteHeights = null;
			class336.SpriteBuffer_spritePalette = null;
			GrandExchangeEvents.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILlx;Lil;I)V",
		garbageValue = "-1369689255"
	)
	static void method4147(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3178 == 0) {
				SecureRandomFuture.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				SecureRandomFuture.ArchiveDiskActionHandler_thread.setDaemon(true);
				SecureRandomFuture.ArchiveDiskActionHandler_thread.start();
				SecureRandomFuture.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field3178 = 600;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)I",
		garbageValue = "-1376261869"
	)
	static int method4146(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}
}
