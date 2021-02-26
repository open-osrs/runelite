import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class248 {
	@ObfuscatedName("n")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("d")
	int[] field3224;
	@ObfuscatedName("c")
	int[] field3228;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1846736513
	)
	int field3226;

	public class248() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field3224 = new int[2048]; // L: 12
		this.field3228 = new int[2048]; // L: 13
		this.field3226 = 0; // L: 14
		Strings.method4324(); // L: 21
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-381922948"
	)
	void method4507(int var1) {
		int var2 = var1 * 2 + 1; // L: 46
		double var4 = (double)((float)var1 / 3.0F); // L: 48
		int var6 = var1 * 2 + 1; // L: 50
		double[] var7 = new double[var6]; // L: 51
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = HealthBarDefinition.method4658((double)var8, 0.0D, var4); // L: 53
			++var8; // L: 52
		}

		double[] var14 = var7; // L: 57
		double var15 = var7[var1] * var7[var1]; // L: 58
		int[] var17 = new int[var2 * var2]; // L: 59
		boolean var10 = false; // L: 60

		for (int var11 = 0; var11 < var2; ++var11) { // L: 61
			for (int var12 = 0; var12 < var2; ++var12) { // L: 62
				int var13 = var17[var12 + var2 * var11] = (int)(var14[var11] * var14[var12] / var15 * 256.0D); // L: 63
				if (!var10 && var13 > 0) { // L: 64
					var10 = true; // L: 65
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2); // L: 69
		this.spriteMap.put(var1, var18); // L: 70
	} // L: 71

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Llm;",
		garbageValue = "1559199090"
	)
	SpritePixels method4527(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 74
			this.method4507(var1); // L: 75
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 77
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1110209387"
	)
	public final void method4509(int var1, int var2) {
		if (this.field3226 < this.field3224.length) { // L: 81
			this.field3224[this.field3226] = var1; // L: 82
			this.field3228[this.field3226] = var2; // L: 83
			++this.field3226; // L: 84
		}
	} // L: 85

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1700428858"
	)
	public final void method4510() {
		this.field3226 = 0; // L: 88
	} // L: 89

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IILlm;FI)V",
		garbageValue = "2039360324"
	)
	public final void method4511(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4); // L: 92
		SpritePixels var6 = this.method4527(var5); // L: 93
		int var7 = var5 * 2 + 1; // L: 94
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 95
		Bounds var9 = new Bounds(0, 0); // L: 96
		this.bounds.setHigh(var7, var7); // L: 97
		System.nanoTime(); // L: 98

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3226; ++var10) { // L: 99
			var11 = this.field3224[var10]; // L: 100
			var12 = this.field3228[var10]; // L: 101
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5; // L: 102
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5; // L: 103
			this.bounds.setLow(var13, var14); // L: 104
			this.bounds.method6182(var8, var9); // L: 105
			this.method4506(var6, var3, var9); // L: 106
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
					if (var11 > Coord.field2560.length) { // L: 120
						var11 = Coord.field2560.length;
					}

					var12 = Coord.field2560[var11 - 1]; // L: 121
					var3.pixels[var10] = -16777216 | var12; // L: 122
				}
			}
		}

		System.nanoTime(); // L: 124
	} // L: 125

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Llm;Llm;Lli;I)V",
		garbageValue = "-524888104"
	)
	void method4506(SpritePixels var1, SpritePixels var2, Bounds var3) {
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
			int var7 = var3.lowX + var2.subWidth * var3.lowY; // L: 134

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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	static void method4514() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 206
			if (WorldMapSectionType.clientPreferences.rememberedUsername != null) { // L: 207
				Login.Login_username = WorldMapSectionType.clientPreferences.rememberedUsername; // L: 208
				Client.Login_isUsernameRemembered = true; // L: 209
			} else {
				Client.Login_isUsernameRemembered = false; // L: 211
			}

		}
	} // L: 212
}
