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

@ObfuscatedName("hl")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2820(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2830(1, 0),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2816(2, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2817(3, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2818(9, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2819(4, 1),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2821(5, 1),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2815(6, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2829(7, 1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2823(8, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2827(12, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2825(13, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2831(14, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2836(15, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2828(16, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2832(17, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2824(18, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2814(19, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2826(20, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2833(21, 2),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2834(10, 2),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2835(11, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2837(22, 3);

	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1464574759
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3; // L: 34
	} // L: 35

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 38
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BB)Loh;",
		garbageValue = "-38"
	)
	@Export("convertJpgToSprite")
	public static final SpritePixels convertJpgToSprite(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 22
			int var2 = var1.getWidth(); // L: 23
			int var3 = var1.getHeight(); // L: 24
			int[] var4 = new int[var3 * var2]; // L: 25
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2); // L: 26
			var5.grabPixels(); // L: 27
			return new SpritePixels(var4, var2, var3); // L: 28
		} catch (IOException var7) { // L: 30
		} catch (InterruptedException var8) { // L: 31
		}

		return new SpritePixels(0, 0); // L: 32
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	static void method4370() {
		class0.SpriteBuffer_xOffsets = null; // L: 261
		Interpreter.SpriteBuffer_yOffsets = null; // L: 262
		class395.SpriteBuffer_spriteWidths = null; // L: 263
		class157.SpriteBuffer_spriteHeights = null; // L: 264
		Varps.SpriteBuffer_spritePalette = null; // L: 265
		class223.SpriteBuffer_pixels = null; // L: 266
	} // L: 267
}
