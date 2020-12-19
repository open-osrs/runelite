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
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field3218 = new int[2048]; // L: 12
		this.field3216 = new int[2048]; // L: 13
		this.field3220 = 0; // L: 14
		class195.method3680(); // L: 21
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "105508707"
	)
	void method4342(int var1) {
		int var2 = var1 * 2 + 1; // L: 46
		double[] var3 = ArchiveDiskActionHandler.method4294(0.0D, (double)((float)var1 / 3.0F), var1); // L: 47
		double var4 = var3[var1] * var3[var1]; // L: 48
		int[] var6 = new int[var2 * var2]; // L: 49
		boolean var7 = false; // L: 50

		for (int var8 = 0; var8 < var2; ++var8) { // L: 51
			for (int var9 = 0; var9 < var2; ++var9) { // L: 52
				int var10 = var6[var9 + var2 * var8] = (int)(256.0D * (var3[var9] * var3[var8] / var4)); // L: 53
				if (!var7 && var10 > 0) { // L: 54
					var7 = true; // L: 55
				}
			}
		}

		Sprite var11 = new Sprite(var6, var2, var2); // L: 59
		this.spriteMap.put(var1, var11); // L: 60
	} // L: 61

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)Llm;",
		garbageValue = "-2015707218"
	)
	Sprite method4343(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 64
			this.method4342(var1); // L: 65
		}

		return (Sprite)this.spriteMap.get(var1); // L: 67
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2038204538"
	)
	public final void method4344(int var1, int var2) {
		if (this.field3220 < this.field3218.length) { // L: 71
			this.field3218[this.field3220] = var1; // L: 72
			this.field3216[this.field3220] = var2; // L: 73
			++this.field3220; // L: 74
		}
	} // L: 75

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "542816734"
	)
	public final void method4345() {
		this.field3220 = 0; // L: 78
	} // L: 79

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILlm;FB)V",
		garbageValue = "-62"
	)
	public final void method4346(int var1, int var2, Sprite var3, float var4) {
		int var5 = (int)(var4 * 18.0F); // L: 82
		Sprite var6 = this.method4343(var5); // L: 83
		int var7 = var5 * 2 + 1; // L: 84
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 85
		Bounds var9 = new Bounds(0, 0); // L: 86
		this.bounds.setHigh(var7, var7); // L: 87
		System.nanoTime(); // L: 88

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3220; ++var10) { // L: 89
			var11 = this.field3218[var10]; // L: 90
			var12 = this.field3216[var10]; // L: 91
			int var13 = (int)((float)(var11 - var1) * var4) - var5; // L: 92
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 93
			this.bounds.setLow(var13, var14); // L: 94
			this.bounds.method6014(var8, var9); // L: 95
			this.method4347(var6, var3, var9); // L: 96
		}

		System.nanoTime(); // L: 98
		System.nanoTime(); // L: 99

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 100
			if (var3.pixels[var10] == 0) { // L: 101
				var3.pixels[var10] = -16777216; // L: 102
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 105
				if (var11 <= 0) { // L: 106
					var3.pixels[var10] = -16777216; // L: 107
				} else {
					if (var11 > field3219.length) { // L: 110
						var11 = field3219.length;
					}

					var12 = field3219[var11 - 1]; // L: 111
					var3.pixels[var10] = -16777216 | var12; // L: 112
				}
			}
		}

		System.nanoTime(); // L: 114
	} // L: 115

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Llm;Llm;Llc;B)V",
		garbageValue = "36"
	)
	void method4347(Sprite var1, Sprite var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 118
			int var4 = 0; // L: 119
			int var5 = 0; // L: 120
			if (var3.lowX == 0) { // L: 121
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 122
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 123
			int var7 = var2.subWidth * var3.lowY + var3.lowX; // L: 124

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 125
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 126
					int[] var10000 = var2.pixels; // L: 127
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 129
				var7 += var2.subWidth - var3.highX; // L: 130
			}

		}
	} // L: 132
}
