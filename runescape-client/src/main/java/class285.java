import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class285 {
	@ObfuscatedName("b")
	static int[] field3675;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("h")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("o")
	int[] field3676;
	@ObfuscatedName("g")
	int[] field3677;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2117277323
	)
	int field3678;

	public class285() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field3676 = new int[2048]; // L: 12
		this.field3677 = new int[2048]; // L: 13
		this.field3678 = 0; // L: 14
		ClientPacket.method4299(); // L: 21
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-70"
	)
	void method5035(int var1) {
		int var2 = var1 * 2 + 1; // L: 46
		double var4 = (double)((float)var1 / 3.0F); // L: 48
		int var6 = var1 * 2 + 1; // L: 50
		double[] var7 = new double[var6]; // L: 51
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = PacketWriter.method2400((double)var8, 0.0D, var4); // L: 53
			++var8; // L: 52
		}

		double[] var14 = var7; // L: 57
		double var15 = var7[var1] * var7[var1]; // L: 58
		int[] var17 = new int[var2 * var2]; // L: 59
		boolean var10 = false; // L: 60

		for (int var11 = 0; var11 < var2; ++var11) { // L: 61
			for (int var12 = 0; var12 < var2; ++var12) { // L: 62
				int var13 = var17[var12 + var11 * var2] = (int)(256.0D * (var14[var12] * var14[var11] / var15)); // L: 63
				if (!var10 && var13 > 0) { // L: 64
					var10 = true; // L: 65
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2); // L: 69
		this.spriteMap.put(var1, var18); // L: 70
	} // L: 71

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Low;",
		garbageValue = "1393112133"
	)
	SpritePixels method5051(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 74
			this.method5035(var1); // L: 75
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 77
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "152070039"
	)
	public final void method5037(int var1, int var2) {
		if (this.field3678 < this.field3676.length) { // L: 81
			this.field3676[this.field3678] = var1; // L: 82
			this.field3677[this.field3678] = var2; // L: 83
			++this.field3678; // L: 84
		}
	} // L: 85

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	public final void method5048() {
		this.field3678 = 0; // L: 88
	} // L: 89

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILow;FI)V",
		garbageValue = "-2008023134"
	)
	public final void method5039(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4); // L: 92
		SpritePixels var6 = this.method5051(var5); // L: 93
		int var7 = var5 * 2 + 1; // L: 94
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 95
		Bounds var9 = new Bounds(0, 0); // L: 96
		this.bounds.setHigh(var7, var7); // L: 97
		System.nanoTime(); // L: 98

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3678; ++var10) { // L: 99
			var11 = this.field3676[var10]; // L: 100
			var12 = this.field3677[var10]; // L: 101
			int var13 = (int)((float)(var11 - var1) * var4) - var5; // L: 102
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 103
			this.bounds.setLow(var13, var14); // L: 104
			this.bounds.method5849(var8, var9); // L: 105
			this.method5040(var6, var3, var9); // L: 106
		}

		System.nanoTime(); // L: 108
		System.nanoTime(); // L: 109

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 110
			if (var3.pixels[var10] == 0) { // L: 111
				var3.pixels[var10] = -16777216; // L: 112
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 115
				if (var11 <= 0) { // L: 116
					var3.pixels[var10] = -16777216; // L: 117
				} else {
					if (var11 > field3675.length) { // L: 120
						var11 = field3675.length;
					}

					var12 = field3675[var11 - 1]; // L: 121
					var3.pixels[var10] = -16777216 | var12; // L: 122
				}
			}
		}

		System.nanoTime(); // L: 124
	} // L: 125

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;Lle;I)V",
		garbageValue = "-159166525"
	)
	void method5040(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 128
			int var4 = 0; // L: 129
			int var5 = 0; // L: 130
			if (var3.lowX == 0) { // L: 131
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 132
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 133
			int var7 = var2.subWidth * var3.lowY + var3.lowX; // L: 134

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 135
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 136
					int[] var10000 = var2.pixels; // L: 137
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 139
				var7 += var2.subWidth - var3.highX; // L: 140
			}

		}
	} // L: 142

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1797269182"
	)
	static void method5055() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79
}
