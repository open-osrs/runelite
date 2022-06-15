import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -698923257
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "23"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.decodeNext(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "-706548236"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.size = var1.readUnsignedShort();
		}

	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ldo;FZI)F",
		garbageValue = "21178512"
	)
	static float method3349(class117 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 187
		if (var0 != null && var0.method2709() != 0) { // L: 188
			float var4 = (float)var0.field1462[0].field1420; // L: 191
			float var5 = (float)var0.field1462[var0.method2709() - 1].field1420; // L: 192
			float var6 = var5 - var4; // L: 193
			if ((double)var6 == 0.0D) { // L: 194
				return var0.field1462[0].field1423; // L: 195
			} else {
				float var7 = 0.0F; // L: 197
				if (var1 > var5) { // L: 198
					var7 = (var1 - var5) / var6; // L: 199
				} else {
					var7 = (var1 - var4) / var6; // L: 202
				}

				double var8 = (double)((int)var7); // L: 204
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 205
				float var11 = var10 * var6; // L: 206
				var8 = Math.abs(var8 + 1.0D); // L: 207
				double var12 = var8 / 2.0D; // L: 208
				double var14 = (double)((int)var12); // L: 209
				var10 = (float)(var12 - var14); // L: 210
				float var16;
				float var17;
				if (var2) { // L: 213
					if (var0.field1468 == class116.field1454) { // L: 214
						if (0.0D != (double)var10) { // L: 215
							var11 += var4; // L: 216
						} else {
							var11 = var5 - var11; // L: 219
						}
					} else if (var0.field1468 != class116.field1450 && var0.field1468 != class116.field1453) { // L: 222
						if (var0.field1468 == class116.field1451) { // L: 225
							var11 = var4 - var1; // L: 226
							var16 = var0.field1462[0].field1421; // L: 227
							var17 = var0.field1462[0].field1422; // L: 228
							var3 = var0.field1462[0].field1423; // L: 229
							if (0.0D != (double)var16) { // L: 230
								var3 -= var17 * var11 / var16; // L: 231
							}

							return var3; // L: 233
						}
					} else {
						var11 = var5 - var11; // L: 223
					}
				} else if (var0.field1461 == class116.field1454) { // L: 237
					if (0.0D != (double)var10) { // L: 238
						var11 = var5 - var11; // L: 239
					} else {
						var11 += var4; // L: 242
					}
				} else if (var0.field1461 != class116.field1450 && var0.field1461 != class116.field1453) { // L: 245
					if (var0.field1461 == class116.field1451) { // L: 248
						var11 = var1 - var5; // L: 249
						var16 = var0.field1462[var0.method2709() - 1].field1419; // L: 250
						var17 = var0.field1462[var0.method2709() - 1].field1425; // L: 251
						var3 = var0.field1462[var0.method2709() - 1].field1423; // L: 252
						if (0.0D != (double)var16) { // L: 253
							var3 += var11 * var17 / var16; // L: 254
						}

						return var3; // L: 256
					}
				} else {
					var11 += var4; // L: 246
				}

				var3 = WorldMapSection0.method4918(var0, var11); // L: 259
				float var18;
				if (var2 && var0.field1468 == class116.field1453) { // L: 261
					var18 = var0.field1462[var0.method2709() - 1].field1423 - var0.field1462[0].field1423; // L: 262
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 263
				} else if (!var2 && var0.field1461 == class116.field1453) { // L: 265
					var18 = var0.field1462[var0.method2709() - 1].field1423 - var0.field1462[0].field1423; // L: 266
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 267
				}

				return var3; // L: 269
			}
		} else {
			return var3; // L: 189
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lpv;I)Ljava/lang/Object;",
		garbageValue = "558019675"
	)
	static Object method3360(class432 var0) {
		if (var0 == null) { // L: 4996
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 4997
		} else {
			switch(var0.field4660) { // L: 4999
			case 0:
				return Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 5003
			case 2:
				return Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 5005
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5001
			}
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "2"
	)
	static final void method3358(int var0, int var1, int var2) {
		if (class18.cameraX < var0) { // L: 3943
			class18.cameraX = (var0 - class18.cameraX) * UserComparator3.field1391 / 1000 + class18.cameraX + PlayerComposition.field3346; // L: 3944
			if (class18.cameraX > var0) { // L: 3945
				class18.cameraX = var0;
			}
		}

		if (class18.cameraX > var0) { // L: 3947
			class18.cameraX -= (class18.cameraX - var0) * UserComparator3.field1391 / 1000 + PlayerComposition.field3346; // L: 3948
			if (class18.cameraX < var0) { // L: 3949
				class18.cameraX = var0;
			}
		}

		if (class16.cameraY < var1) { // L: 3951
			class16.cameraY = (var1 - class16.cameraY) * UserComparator3.field1391 / 1000 + class16.cameraY + PlayerComposition.field3346; // L: 3952
			if (class16.cameraY > var1) { // L: 3953
				class16.cameraY = var1;
			}
		}

		if (class16.cameraY > var1) { // L: 3955
			class16.cameraY -= (class16.cameraY - var1) * UserComparator3.field1391 / 1000 + PlayerComposition.field3346; // L: 3956
			if (class16.cameraY < var1) { // L: 3957
				class16.cameraY = var1;
			}
		}

		if (class228.cameraZ < var2) { // L: 3959
			class228.cameraZ = (var2 - class228.cameraZ) * UserComparator3.field1391 / 1000 + class228.cameraZ + PlayerComposition.field3346; // L: 3960
			if (class228.cameraZ > var2) { // L: 3961
				class228.cameraZ = var2;
			}
		}

		if (class228.cameraZ > var2) { // L: 3963
			class228.cameraZ -= (class228.cameraZ - var2) * UserComparator3.field1391 / 1000 + PlayerComposition.field3346; // L: 3964
			if (class228.cameraZ < var2) { // L: 3965
				class228.cameraZ = var2;
			}
		}

	} // L: 3967
}
