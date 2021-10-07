import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public class class300 {
	@ObfuscatedName("l")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("f")
	int[] field3774;
	@ObfuscatedName("j")
	int[] field3775;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1668663383
	)
	int field3776;

	public class300() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field3774 = new int[2048];
		this.field3775 = new int[2048];
		this.field3776 = 0;
		class268.method5104();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2023948868"
	)
	void method5453(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var20 = WorldMapData_0.method3438((double)(var8 - 0) / var4) / var4;
			var7[var9] = var20;
			++var8;
		}

		double[] var14 = var7;
		double var15 = var7[var1] * var7[var1];
		int[] var17 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + var2 * var11] = (int)(var14[var11] * var14[var12] / var15 * 256.0D);
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2);
		this.spriteMap.put(var1, var18);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lon;",
		garbageValue = "-948726242"
	)
	SpritePixels method5432(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method5453(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "733249359"
	)
	public final void method5433(int var1, int var2) {
		if (this.field3776 < this.field3774.length) {
			this.field3774[this.field3776] = var1;
			this.field3775[this.field3776] = var2;
			++this.field3776;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2111491523"
	)
	public final void method5434() {
		this.field3776 = 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IILon;FI)V",
		garbageValue = "-1572893124"
	)
	public final void method5456(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		SpritePixels var6 = this.method5432(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3776; ++var10) {
			var11 = this.field3774[var10];
			var12 = this.field3775[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6253(var8, var9);
			this.method5437(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > KeyHandler.field145.length) {
						var11 = KeyHandler.field145.length;
					}

					var12 = KeyHandler.field145[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lon;Lon;Lme;B)V",
		garbageValue = "113"
	)
	void method5437(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var3.lowX + var2.subWidth * var3.lowY;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels;
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX;
				var7 += var2.subWidth - var3.highX;
			}

		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIILfo;IB)V",
		garbageValue = "12"
	)
	static void method5457(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.field807 = (var6 + var1) * 128;
		var5.field803 = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field804 = var3.int7 * 128;
		var5.field808 = var3.int5;
		var5.field809 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field811 = var5.field808 + (int)(Math.random() * (double)(var5.field809 - var5.field808));
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-896124"
	)
	static int method5458(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field826 - 7.0D) * 256.0D);
	}
}
