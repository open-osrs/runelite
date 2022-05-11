import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -780977341
	)
	public static int field2492;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lgu;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;IZ)V",
		garbageValue = "0"
	)
	public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque(); // L: 11
		int var6 = var1.getGroupFileCount(var3); // L: 12
		this.frames = new Animation[var6]; // L: 13
		int[] var7 = var1.getGroupFileIds(var3); // L: 14

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 15
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 16
			Skeleton var10 = null; // L: 17
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 18

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 19
				if (var11 == var12.id) { // L: 21
					var10 = var12;
					break;
				}
			}

			if (var10 == null) {
				byte[] var13 = var2.getFile(var11, 0);
				var10 = new Skeleton(var11, var13); // L: 31
				var5.addFirst(var10);
			}

			this.frames[var7[var8]] = new Animation(var9, var10);
		}

	} // L: 36

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-15"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 39
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BB)Lqr;",
		garbageValue = "7"
	)
	public static final SpritePixels method4217(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var7 * var6]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) { // L: 32
		} catch (InterruptedException var10) { // L: 33
		}

		return new SpritePixels(0, 0); // L: 34
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Llp;Ljava/lang/String;Ljava/lang/String;B)[Lqr;",
		garbageValue = "16"
	)
	public static SpritePixels[] method4218(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 91
		int var4 = var0.getFileId(var3, var2); // L: 92
		SpritePixels[] var5;
		if (!User.method6514(var0, var3, var4)) { // L: 95
			var5 = null; // L: 96
		} else {
			SpritePixels[] var7 = new SpritePixels[class453.SpriteBuffer_spriteCount]; // L: 101

			for (int var8 = 0; var8 < class453.SpriteBuffer_spriteCount; ++var8) { // L: 102
				SpritePixels var9 = var7[var8] = new SpritePixels(); // L: 103
				var9.width = class453.SpriteBuffer_spriteWidth; // L: 104
				var9.height = class453.SpriteBuffer_spriteHeight; // L: 105
				var9.xOffset = class453.SpriteBuffer_xOffsets[var8]; // L: 106
				var9.yOffset = class453.SpriteBuffer_yOffsets[var8]; // L: 107
				var9.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var8]; // L: 108
				var9.subHeight = class453.SpriteBuffer_spriteHeights[var8]; // L: 109
				int var10 = var9.subHeight * var9.subWidth; // L: 110
				byte[] var11 = class127.SpriteBuffer_pixels[var8]; // L: 111
				var9.pixels = new int[var10]; // L: 112

				for (int var12 = 0; var12 < var10; ++var12) { // L: 113
					var9.pixels[var12] = Decimator.SpriteBuffer_spritePalette[var11[var12] & 255];
				}
			}

			VarcInt.method3325(); // L: 115
			var5 = var7; // L: 118
		}

		return var5; // L: 120
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "13"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class128.Client_plane][var0][var1]; // L: 7964
		if (var2 == null) { // L: 7965
			class175.scene.removeGroundItemPile(class128.Client_plane, var0, var1); // L: 7966
		} else {
			long var3 = -99999999L; // L: 7969
			TileItem var5 = null; // L: 7970

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7971 7972 7980
				ItemComposition var7 = FileSystem.ItemDefinition_get(var6.id); // L: 7973
				long var11 = (long)var7.price; // L: 7974
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1); // L: 7975
				}

				if (var11 > var3) { // L: 7976
					var3 = var11; // L: 7977
					var5 = var6; // L: 7978
				}
			}

			if (var5 == null) { // L: 7982
				class175.scene.removeGroundItemPile(class128.Client_plane, var0, var1); // L: 7983
			} else {
				var2.addLast(var5); // L: 7986
				TileItem var13 = null; // L: 7987
				TileItem var8 = null; // L: 7988

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7989 7990 7995
					if (var6.id != var5.id) { // L: 7991
						if (var13 == null) { // L: 7992
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 7993
							var8 = var6;
						}
					}
				}

				long var9 = VarbitComposition.calculateTag(var0, var1, 3, false, 0); // L: 7997
				class175.scene.newGroundItemPile(class128.Client_plane, var0, var1, class202.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class128.Client_plane), var5, var9, var13, var8); // L: 7998
			}
		}
	} // L: 7967 7984 7999
}
