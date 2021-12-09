import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class213 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkt;",
		garbageValue = "1655670329"
	)
	static class288[] method4355() {
		return new class288[]{class288.field3436, class288.field3438}; // L: 35
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ldn;FZI)F",
		garbageValue = "244172504"
	)
	static float method4354(class115 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 138
		if (var0 != null && var0.method2637() != 0) { // L: 139
			float var4 = (float)var0.field1393[0].field1359; // L: 142
			float var5 = (float)var0.field1393[var0.method2637() - 1].field1359; // L: 143
			float var6 = var5 - var4; // L: 144
			if (0.0D == (double)var6) { // L: 145
				return var0.field1393[0].field1349; // L: 146
			} else {
				float var7 = 0.0F; // L: 148
				if (var1 > var5) { // L: 149
					var7 = (var1 - var5) / var6; // L: 150
				} else {
					var7 = (var1 - var4) / var6; // L: 153
				}

				double var8 = (double)((int)var7); // L: 155
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 156
				float var11 = var10 * var6; // L: 157
				var8 = Math.abs(var8 + 1.0D); // L: 158
				double var12 = var8 / 2.0D; // L: 159
				double var14 = (double)((int)var12); // L: 160
				var10 = (float)(var12 - var14); // L: 161
				float var16;
				float var17;
				if (var2) { // L: 164
					if (var0.field1410 == class114.field1386) { // L: 165
						if ((double)var10 != 0.0D) { // L: 166
							var11 += var4; // L: 167
						} else {
							var11 = var5 - var11; // L: 170
						}
					} else if (var0.field1410 != class114.field1384 && var0.field1410 != class114.field1391) { // L: 173
						if (var0.field1410 == class114.field1383) { // L: 176
							var11 = var4 - var1; // L: 177
							var16 = var0.field1393[0].field1350; // L: 178
							var17 = var0.field1393[0].field1351; // L: 179
							var3 = var0.field1393[0].field1349; // L: 180
							if (0.0D != (double)var16) { // L: 181
								var3 -= var11 * var17 / var16; // L: 182
							}

							return var3; // L: 184
						}
					} else {
						var11 = var5 - var11; // L: 174
					}
				} else if (var0.field1396 == class114.field1386) { // L: 188
					if ((double)var10 != 0.0D) { // L: 189
						var11 = var5 - var11; // L: 190
					} else {
						var11 += var4; // L: 193
					}
				} else if (var0.field1396 != class114.field1384 && var0.field1396 != class114.field1391) { // L: 196
					if (var0.field1396 == class114.field1383) { // L: 199
						var11 = var1 - var5; // L: 200
						var16 = var0.field1393[var0.method2637() - 1].field1352; // L: 201
						var17 = var0.field1393[var0.method2637() - 1].field1357; // L: 202
						var3 = var0.field1393[var0.method2637() - 1].field1349; // L: 203
						if (0.0D != (double)var16) { // L: 204
							var3 += var17 * var11 / var16; // L: 205
						}

						return var3; // L: 207
					}
				} else {
					var11 += var4; // L: 197
				}

				var3 = class14.method210(var0, var11); // L: 210
				float var18;
				if (var2 && var0.field1410 == class114.field1391) { // L: 212
					var18 = var0.field1393[var0.method2637() - 1].field1349 - var0.field1393[0].field1349; // L: 213
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 214
				} else if (!var2 && var0.field1396 == class114.field1391) { // L: 216
					var18 = var0.field1393[var0.method2637() - 1].field1349 - var0.field1393[0].field1349; // L: 217
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 218
				}

				return var3; // L: 220
			}
		} else {
			return var3; // L: 140
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1639930062"
	)
	public static void method4356() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 107
			if (ArchiveDiskActionHandler.field3815 != 0) { // L: 108
				ArchiveDiskActionHandler.field3815 = 1; // L: 109

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 111
				} catch (InterruptedException var3) { // L: 113
				}
			}

		}
	} // L: 116
}
