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

@ObfuscatedName("gz")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1594676669
	)
	@Export("z")
	int z;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2089256137
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1339906741
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 8752765505702022363L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -228147233
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BI)Lqe;",
		garbageValue = "-730527050"
	)
	public static final SpritePixels method3920(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var6 * var7]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) { // L: 32
		} catch (InterruptedException var10) { // L: 33
		}

		return new SpritePixels(0, 0); // L: 34
	}
}
