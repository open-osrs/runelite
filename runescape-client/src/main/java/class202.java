import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class202 {
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Ldq;"
	)
	class115[] field2350;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 166923325
	)
	int field2352;

	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V"
	)
	class202(Buffer var1, int var2) {
		this.field2350 = new class115[var2]; // L: 13
		this.field2352 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2350.length; ++var3) { // L: 15
			class115 var4 = new class115(this.field2352, var1, false); // L: 16
			this.field2350[var3] = var4; // L: 17
		}

		this.method4115(); // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "245486778"
	)
	void method4115() {
		class115[] var1 = this.field2350; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class115 var3 = var1[var2]; // L: 26
			if (var3.field1410 >= 0) { // L: 28
				var3.field1404 = this.field2350[var3.field1410]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	public int method4098() {
		return this.field2350.length; // L: 37
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldq;",
		garbageValue = "10"
	)
	class115 method4099(int var1) {
		return this.field2350[var1]; // L: 41
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldq;",
		garbageValue = "-796000357"
	)
	class115[] method4100() {
		return this.field2350; // L: 45
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ldu;IB)V",
		garbageValue = "-80"
	)
	void method4106(class122 var1, int var2) {
		this.method4116(var1, var2, (boolean[])null, false); // L: 49
	} // L: 50

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ldu;I[ZZI)V",
		garbageValue = "-1805231033"
	)
	void method4116(class122 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2783(); // L: 53
		int var6 = 0; // L: 54
		class115[] var7 = this.method4100(); // L: 56

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 57
			class115 var9 = var7[var8]; // L: 58
			if (var3 == null || var4 == var3[var6]) { // L: 60
				var1.method2763(var2, var9, var6, var5); // L: 61
			}

			++var6; // L: 63
		}

	} // L: 67

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ldi;FZI)F",
		garbageValue = "-605399100"
	)
	static float method4111(class117 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 197
		if (var0 != null && var0.method2706() != 0) { // L: 198
			float var4 = (float)var0.field1430[0].field1384; // L: 201
			float var5 = (float)var0.field1430[var0.method2706() - 1].field1384; // L: 202
			float var6 = var5 - var4; // L: 203
			if ((double)var6 == 0.0D) { // L: 204
				return var0.field1430[0].field1385; // L: 205
			} else {
				float var7 = 0.0F; // L: 207
				if (var1 > var5) { // L: 208
					var7 = (var1 - var5) / var6; // L: 209
				} else {
					var7 = (var1 - var4) / var6; // L: 212
				}

				double var8 = (double)((int)var7); // L: 214
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 215
				float var11 = var6 * var10; // L: 216
				var8 = Math.abs(var8 + 1.0D); // L: 217
				double var12 = var8 / 2.0D; // L: 218
				double var14 = (double)((int)var12); // L: 219
				var10 = (float)(var12 - var14); // L: 220
				float var16;
				float var17;
				if (var2) { // L: 223
					if (var0.field1428 == class116.field1423) { // L: 224
						if (0.0D != (double)var10) { // L: 225
							var11 += var4; // L: 226
						} else {
							var11 = var5 - var11; // L: 229
						}
					} else if (var0.field1428 != class116.field1425 && var0.field1428 != class116.field1421) { // L: 232
						if (var0.field1428 == class116.field1419) { // L: 235
							var11 = var4 - var1; // L: 236
							var16 = var0.field1430[0].field1386; // L: 237
							var17 = var0.field1430[0].field1390; // L: 238
							var3 = var0.field1430[0].field1385; // L: 239
							if (0.0D != (double)var16) { // L: 240
								var3 -= var17 * var11 / var16; // L: 241
							}

							return var3; // L: 243
						}
					} else {
						var11 = var5 - var11; // L: 233
					}
				} else if (var0.field1429 == class116.field1423) { // L: 247
					if ((double)var10 != 0.0D) { // L: 248
						var11 = var5 - var11; // L: 249
					} else {
						var11 += var4; // L: 252
					}
				} else if (var0.field1429 != class116.field1425 && var0.field1429 != class116.field1421) { // L: 255
					if (var0.field1429 == class116.field1419) { // L: 258
						var11 = var1 - var5; // L: 259
						var16 = var0.field1430[var0.method2706() - 1].field1388; // L: 260
						var17 = var0.field1430[var0.method2706() - 1].field1389; // L: 261
						var3 = var0.field1430[var0.method2706() - 1].field1385; // L: 262
						if (0.0D != (double)var16) { // L: 263
							var3 += var11 * var17 / var16; // L: 264
						}

						return var3; // L: 266
					}
				} else {
					var11 += var4; // L: 256
				}

				var3 = AttackOption.method2392(var0, var11); // L: 269
				float var18;
				if (var2 && var0.field1428 == class116.field1421) { // L: 271
					var18 = var0.field1430[var0.method2706() - 1].field1385 - var0.field1430[0].field1385; // L: 272
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 273
				} else if (!var2 && var0.field1429 == class116.field1421) { // L: 275
					var18 = var0.field1430[var0.method2706() - 1].field1385 - var0.field1430[0].field1385; // L: 276
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 277
				}

				return var3; // L: 279
			}
		} else {
			return var3; // L: 199
		}
	}
}
