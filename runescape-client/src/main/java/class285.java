import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class285 {
	@ObfuscatedName("v")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("f")
	int[] field3664;
	@ObfuscatedName("y")
	int[] field3665;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 686309897
	)
	int field3666;

	public class285() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field3664 = new int[2048]; // L: 12
		this.field3665 = new int[2048]; // L: 13
		this.field3666 = 0; // L: 14
		WorldMapID.field2112 = new int[2000]; // L: 22
		int var1 = 0; // L: 23
		int var2 = 240; // L: 24

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) { // L: 25
			var4 = WorldMapRegion.method3437((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var1 * 0.425F / 16.0F)); // L: 27
			WorldMapID.field2112[var1] = var4; // L: 28
			++var1; // L: 26
		}

		var2 = 48; // L: 30

		for (int var6 = var2 / 6; var1 < WorldMapID.field2112.length; var2 -= var6) { // L: 31 32 38
			var4 = var1 * 2; // L: 33

			for (int var5 = WorldMapRegion.method3437((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < WorldMapID.field2112.length; ++var1) { // L: 34 35
				WorldMapID.field2112[var1] = var5; // L: 36
			}
		}

	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-969189545"
	)
	void method5113(int var1) {
		int var2 = var1 * 2 + 1; // L: 44
		double var4 = (double)((float)var1 / 3.0F); // L: 46
		int var6 = var1 * 2 + 1; // L: 48
		double[] var7 = new double[var6]; // L: 49
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = class13.method182((double)var8, 0.0D, var4); // L: 51
			++var8; // L: 50
		}

		double[] var14 = var7; // L: 55
		double var15 = var7[var1] * var7[var1]; // L: 56
		int[] var17 = new int[var2 * var2]; // L: 57
		boolean var10 = false; // L: 58

		for (int var11 = 0; var11 < var2; ++var11) { // L: 59
			for (int var12 = 0; var12 < var2; ++var12) { // L: 60
				int var13 = var17[var12 + var11 * var2] = (int)(var14[var12] * var14[var11] / var15 * 256.0D); // L: 61
				if (!var10 && var13 > 0) { // L: 62
					var10 = true; // L: 63
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2); // L: 67
		this.spriteMap.put(var1, var18); // L: 68
	} // L: 69

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Loh;",
		garbageValue = "-158733567"
	)
	SpritePixels method5115(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 72
			this.method5113(var1); // L: 73
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 75
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "14"
	)
	public final void method5117(int var1, int var2) {
		if (this.field3666 < this.field3664.length) { // L: 79
			this.field3664[this.field3666] = var1; // L: 80
			this.field3665[this.field3666] = var2; // L: 81
			++this.field3666; // L: 82
		}
	} // L: 83

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2075850075"
	)
	public final void method5126() {
		this.field3666 = 0; // L: 86
	} // L: 87

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILoh;FI)V",
		garbageValue = "-7099286"
	)
	public final void method5116(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4); // L: 90
		SpritePixels var6 = this.method5115(var5); // L: 91
		int var7 = var5 * 2 + 1; // L: 92
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 93
		Bounds var9 = new Bounds(0, 0); // L: 94
		this.bounds.setHigh(var7, var7); // L: 95
		System.nanoTime(); // L: 96

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3666; ++var10) { // L: 97
			var11 = this.field3664[var10]; // L: 98
			var12 = this.field3665[var10]; // L: 99
			int var13 = (int)((float)(var11 - var1) * var4) - var5; // L: 100
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5; // L: 101
			this.bounds.setLow(var13, var14); // L: 102
			this.bounds.method5977(var8, var9); // L: 103
			this.method5118(var6, var3, var9); // L: 104
		}

		System.nanoTime(); // L: 106
		System.nanoTime(); // L: 107

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 108
			if (var3.pixels[var10] == 0) { // L: 109
				var3.pixels[var10] = -16777216; // L: 110
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 113
				if (var11 <= 0) { // L: 114
					var3.pixels[var10] = -16777216; // L: 115
				} else {
					if (var11 > WorldMapID.field2112.length) { // L: 118
						var11 = WorldMapID.field2112.length;
					}

					var12 = WorldMapID.field2112[var11 - 1]; // L: 119
					var3.pixels[var10] = -16777216 | var12; // L: 120
				}
			}
		}

		System.nanoTime(); // L: 122
	} // L: 123

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Loh;Loh;Lli;I)V",
		garbageValue = "1348286634"
	)
	void method5118(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 126
			int var4 = 0; // L: 127
			int var5 = 0; // L: 128
			if (var3.lowX == 0) { // L: 129
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 130
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 131
			int var7 = var2.subWidth * var3.lowY + var3.lowX; // L: 132

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 133
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 134
					int[] var10000 = var2.pixels; // L: 135
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 137
				var7 += var2.subWidth - var3.highX; // L: 138
			}

		}
	} // L: 140
}
