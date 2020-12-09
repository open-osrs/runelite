import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public class class248 {
	@ObfuscatedName("l")
	static int[] field3219;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -259199833
	)
	static int field3222;
	@ObfuscatedName("h")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("x")
	int[] field3218;
	@ObfuscatedName("w")
	int[] field3216;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1743285891
	)
	int field3220;

	public class248() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field3218 = new int[2048];
		this.field3216 = new int[2048];
		this.field3220 = 0;
		class195.method3680();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "105508707"
	)
	void method4342(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = ArchiveDiskActionHandler.method4294(0.0D, (double)((float)var1 / 3.0F), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var2 * var8] = (int)(256.0D * (var3[var9] * var3[var8] / var4));
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}

		Sprite var11 = new Sprite(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)Llm;",
		garbageValue = "-2015707218"
	)
	Sprite method4343(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method4342(var1);
		}

		return (Sprite)this.spriteMap.get(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2038204538"
	)
	public final void method4344(int var1, int var2) {
		if (this.field3220 < this.field3218.length) {
			this.field3218[this.field3220] = var1;
			this.field3216[this.field3220] = var2;
			++this.field3220;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "542816734"
	)
	public final void method4345() {
		this.field3220 = 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILlm;FB)V",
		garbageValue = "-62"
	)
	public final void method4346(int var1, int var2, Sprite var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		Sprite var6 = this.method4343(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3220; ++var10) {
			var11 = this.field3218[var10];
			var12 = this.field3216[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6014(var8, var9);
			this.method4347(var6, var3, var9);
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
					if (var11 > field3219.length) {
						var11 = field3219.length;
					}

					var12 = field3219[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Llm;Llm;Llc;B)V",
		garbageValue = "36"
	)
	void method4347(Sprite var1, Sprite var2, Bounds var3) {
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
			int var7 = var2.subWidth * var3.lowY + var3.lowX;

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
}
