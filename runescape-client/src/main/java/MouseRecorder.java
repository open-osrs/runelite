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

@ObfuscatedName("cd")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[[Ljm;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	static Bounds field1044;
	@ObfuscatedName("c")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("b")
	@Export("lock")
	Object lock;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1539237497
	)
	@Export("index")
	int index;
	@ObfuscatedName("m")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("t")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("s")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; Bounds.method6608(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BB)Lpl;",
		garbageValue = "-5"
	)
	public static final SpritePixels method2161(byte[] var0) {
		BufferedImage var1 = null;

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0));
			int var2 = var1.getWidth();
			int var3 = var1.getHeight();
			int[] var4 = new int[var2 * var3];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
			var5.grabPixels();
			return new SpritePixels(var4, var2, var3);
		} catch (IOException var7) {
		} catch (InterruptedException var8) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-41"
	)
	static int method2160(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("s")
	public static int method2159(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}
}
