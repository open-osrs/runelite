import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class class287 {
	@ObfuscatedName("s")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("v")
	int[] field3666;
	@ObfuscatedName("j")
	int[] field3670;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -239642529
	)
	int field3668;

	public class287() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field3666 = new int[2048];
		this.field3670 = new int[2048];
		this.field3668 = 0;
		ScriptFrame.field375 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = class125.method2543((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var1 / 16.0F));
			ScriptFrame.field375[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < ScriptFrame.field375.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = class125.method2543((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < ScriptFrame.field375.length; ++var1) {
				ScriptFrame.field375[var1] = var5;
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "264341833"
	)
	void method5187(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var16 = (double)(var8 - 0) / var4;
			double var14 = Math.exp(-var16 * var16 / 2.0D) / Math.sqrt(6.283185307179586D);
			double var24 = var14 / var4;
			var7[var9] = var24;
			++var8;
		}

		double[] var18 = var7;
		double var19 = var7[var1] * var7[var1];
		int[] var21 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var21[var12 + var11 * var2] = (int)(var18[var11] * var18[var12] / var19 * 256.0D);
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var22 = new SpritePixels(var21, var2, var2);
		this.spriteMap.put(var1, var22);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Lom;",
		garbageValue = "12"
	)
	SpritePixels method5181(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method5187(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-407683126"
	)
	public final void method5182(int var1, int var2) {
		if (this.field3668 < this.field3666.length) {
			this.field3666[this.field3668] = var1;
			this.field3670[this.field3668] = var2;
			++this.field3668;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-126"
	)
	public final void method5183() {
		this.field3668 = 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IILom;FS)V",
		garbageValue = "-18850"
	)
	public final void method5184(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method5181(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3668; ++var10) {
			var11 = this.field3666[var10];
			var12 = this.field3670[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6028(var8, var9);
			this.method5199(var6, var3, var9);
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
					if (var11 > ScriptFrame.field375.length) {
						var11 = ScriptFrame.field375.length;
					}

					var12 = ScriptFrame.field375[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;Llo;B)V",
		garbageValue = "45"
	)
	void method5199(SpritePixels var1, SpritePixels var2, Bounds var3) {
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "1695667576"
	)
	static long method5201(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var1 % 37L && var1 != 0L) {
			var1 /= 37L;
		}

		return var1;
	}
}
