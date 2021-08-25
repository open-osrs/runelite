import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("n")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("c")
	@Export("lock")
	Object lock;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 858657877
	)
	@Export("index")
	int index;
	@ObfuscatedName("k")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("o")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("g")
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
		for (; this.isRunning; PlayerType.method5099(50L)) {
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1522690177"
	)
	static int method2058(int var0, int var1) {
		FloorOverlayDefinition var3 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		FloorOverlayDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var3 = new FloorOverlayDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4), var0);
			}

			var3.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		if (var2 == null) {
			return var1;
		} else if (var2.secondaryRgb >= 0) {
			return var2.secondaryRgb | -16777216;
		} else if (var2.texture >= 0) {
			int var10 = class138.method2696(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
			return Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216;
		} else if (var2.primaryRgb == 16711935) {
			return var1;
		} else {
			int var5 = var2.hue;
			int var6 = var2.saturation;
			int var7 = var2.lightness;
			if (var7 > 179) {
				var6 /= 2;
			}

			if (var7 > 192) {
				var6 /= 2;
			}

			if (var7 > 217) {
				var6 /= 2;
			}

			if (var7 > 243) {
				var6 /= 2;
			}

			int var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10);
			int var9 = class138.method2696(var8, 96);
			return Rasterizer3D.Rasterizer3D_colorPalette[var9] | -16777216;
		}
	}
}
