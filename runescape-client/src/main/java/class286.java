import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public class class286 {
	@ObfuscatedName("gm")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("f")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("v")
	int[] field3664;
	@ObfuscatedName("y")
	int[] field3665;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1113129793
	)
	int field3663;

	public class286() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field3664 = new int[2048]; // L: 12
		this.field3665 = new int[2048]; // L: 13
		this.field3663 = 0; // L: 14
		class379.field4145 = new int[2000]; // L: 22
		int var1 = 0; // L: 23
		int var2 = 240; // L: 24

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) { // L: 25
			var4 = class93.method2186((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var1 / 16.0F + 0.075F)); // L: 27
			class379.field4145[var1] = var4; // L: 28
			++var1; // L: 26
		}

		var2 = 48; // L: 30

		for (int var6 = var2 / 6; var1 < class379.field4145.length; var2 -= var6) { // L: 31 32 38
			var4 = var1 * 2; // L: 33

			for (int var5 = class93.method2186((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class379.field4145.length; ++var1) { // L: 34 35
				class379.field4145[var1] = var5; // L: 36
			}
		}

	} // L: 41

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1586624720"
	)
	void method5250(int var1) {
		int var2 = var1 * 2 + 1; // L: 44
		double[] var3 = class171.method3616(0.0D, (double)((float)var1 / 3.0F), var1); // L: 45
		double var4 = var3[var1] * var3[var1]; // L: 46
		int[] var6 = new int[var2 * var2]; // L: 47
		boolean var7 = false; // L: 48

		for (int var8 = 0; var8 < var2; ++var8) { // L: 49
			for (int var9 = 0; var9 < var2; ++var9) { // L: 50
				int var10 = var6[var9 + var2 * var8] = (int)(256.0D * (var3[var8] * var3[var9] / var4)); // L: 51
				if (!var7 && var10 > 0) { // L: 52
					var7 = true; // L: 53
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2); // L: 57
		this.spriteMap.put(var1, var11); // L: 58
	} // L: 59

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Loa;",
		garbageValue = "62"
	)
	SpritePixels method5244(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 62
			this.method5250(var1); // L: 63
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 65
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1758461055"
	)
	public final void method5245(int var1, int var2) {
		if (this.field3663 < this.field3664.length) { // L: 69
			this.field3664[this.field3663] = var1; // L: 70
			this.field3665[this.field3663] = var2; // L: 71
			++this.field3663; // L: 72
		}
	} // L: 73

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-633875575"
	)
	public final void method5246() {
		this.field3663 = 0; // L: 76
	} // L: 77

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILoa;FB)V",
		garbageValue = "12"
	)
	public final void method5247(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4); // L: 80
		SpritePixels var6 = this.method5244(var5); // L: 81
		int var7 = var5 * 2 + 1; // L: 82
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 83
		Bounds var9 = new Bounds(0, 0); // L: 84
		this.bounds.setHigh(var7, var7); // L: 85
		System.nanoTime(); // L: 86

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3663; ++var10) { // L: 87
			var11 = this.field3664[var10]; // L: 88
			var12 = this.field3665[var10]; // L: 89
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5; // L: 90
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 91
			this.bounds.setLow(var13, var14); // L: 92
			this.bounds.method6009(var8, var9); // L: 93
			this.method5243(var6, var3, var9); // L: 94
		}

		System.nanoTime(); // L: 96
		System.nanoTime(); // L: 97

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 98
			if (var3.pixels[var10] == 0) { // L: 99
				var3.pixels[var10] = -16777216; // L: 100
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 103
				if (var11 <= 0) { // L: 104
					var3.pixels[var10] = -16777216; // L: 105
				} else {
					if (var11 > class379.field4145.length) { // L: 108
						var11 = class379.field4145.length;
					}

					var12 = class379.field4145[var11 - 1]; // L: 109
					var3.pixels[var10] = -16777216 | var12; // L: 110
				}
			}
		}

		System.nanoTime(); // L: 112
	} // L: 113

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;Llw;I)V",
		garbageValue = "1918246887"
	)
	void method5243(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 116
			int var4 = 0; // L: 117
			int var5 = 0; // L: 118
			if (var3.lowX == 0) { // L: 119
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 120
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 121
			int var7 = var2.subWidth * var3.lowY + var3.lowX; // L: 122

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 123
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 124
					int[] var10000 = var2.pixels; // L: 125
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 127
				var7 += var2.subWidth - var3.highX; // L: 128
			}

		}
	} // L: 130
}
