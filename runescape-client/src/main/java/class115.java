import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class115 {
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1981912443
	)
	public final int field1455;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	public class115 field1447;
	@ObfuscatedName("l")
	float[][] field1446;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lnw;"
	)
	final class388[] field1449;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lnw;"
	)
	class388[] field1452;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Lnw;"
	)
	class388[] field1451;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class388 field1459;
	@ObfuscatedName("s")
	boolean field1450;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class388 field1453;
	@ObfuscatedName("v")
	boolean field1454;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class388 field1456;
	@ObfuscatedName("c")
	float[][] field1457;
	@ObfuscatedName("w")
	float[][] field1458;
	@ObfuscatedName("b")
	float[][] field1448;

	@ObfuscatedSignature(
		descriptor = "(ILpx;Z)V"
	)
	public class115(int var1, Buffer var2, boolean var3) {
		this.field1459 = new class388(); // L: 13
		this.field1450 = true; // L: 14
		this.field1453 = new class388(); // L: 15
		this.field1454 = true; // L: 16
		this.field1456 = new class388(); // L: 17
		this.field1455 = var2.readShort(); // L: 23
		this.field1449 = new class388[var1]; // L: 24
		this.field1452 = new class388[this.field1449.length]; // L: 25
		this.field1451 = new class388[this.field1449.length]; // L: 26
		this.field1446 = new float[this.field1449.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1449.length; ++var4) { // L: 28
			this.field1449[var4] = new class388(var2, var3); // L: 29
			this.field1446[var4][0] = var2.method7570(); // L: 30
			this.field1446[var4][1] = var2.method7570(); // L: 31
			this.field1446[var4][2] = var2.method7570(); // L: 32
		}

		this.method2677(); // L: 34
	} // L: 35

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	void method2677() {
		this.field1457 = new float[this.field1449.length][3]; // L: 38
		this.field1458 = new float[this.field1449.length][3]; // L: 39
		this.field1448 = new float[this.field1449.length][3]; // L: 40
		class388 var1 = Tile.method3904(); // L: 41

		for (int var2 = 0; var2 < this.field1449.length; ++var2) { // L: 42
			class388 var3 = this.method2640(var2); // L: 43
			var1.method6868(var3); // L: 44
			var1.method6820(); // L: 45
			this.field1457[var2] = var1.method6810(); // L: 46
			this.field1458[var2][0] = var3.field4400[12]; // L: 47
			this.field1458[var2][1] = var3.field4400[13]; // L: 48
			this.field1458[var2][2] = var3.field4400[14]; // L: 49
			this.field1448[var2] = var3.method6821(); // L: 50
		}

		var1.method6865(); // L: 52
	} // L: 53

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lnw;",
		garbageValue = "2055144288"
	)
	class388 method2640(int var1) {
		return this.field1449[var1]; // L: 56
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnw;",
		garbageValue = "-82"
	)
	class388 method2641(int var1) {
		if (this.field1452[var1] == null) { // L: 60
			this.field1452[var1] = new class388(this.method2640(var1)); // L: 61
			if (this.field1447 != null) { // L: 62
				this.field1452[var1].method6816(this.field1447.method2641(var1)); // L: 63
			} else {
				this.field1452[var1].method6816(class388.field4403); // L: 66
			}
		}

		return this.field1452[var1]; // L: 69
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Lnw;",
		garbageValue = "543774546"
	)
	class388 method2642(int var1) {
		if (this.field1451[var1] == null) { // L: 73
			this.field1451[var1] = new class388(this.method2641(var1)); // L: 74
			this.field1451[var1].method6820(); // L: 75
		}

		return this.field1451[var1]; // L: 77
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I)V",
		garbageValue = "1597711527"
	)
	void method2645(class388 var1) {
		this.field1459.method6868(var1); // L: 81
		this.field1450 = true; // L: 82
		this.field1454 = true; // L: 83
	} // L: 84

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Lnw;",
		garbageValue = "-1889892168"
	)
	class388 method2672() {
		return this.field1459; // L: 87
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lnw;",
		garbageValue = "-1532476889"
	)
	class388 method2652() {
		if (this.field1450) { // L: 91
			this.field1453.method6868(this.method2672()); // L: 92
			if (this.field1447 != null) { // L: 93
				this.field1453.method6816(this.field1447.method2652()); // L: 94
			}

			this.field1450 = false; // L: 96
		}

		return this.field1453; // L: 98
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lnw;",
		garbageValue = "1098148128"
	)
	public class388 method2666(int var1) {
		if (this.field1454) { // L: 102
			this.field1456.method6868(this.method2642(var1)); // L: 103
			this.field1456.method6816(this.method2652()); // L: 104
			this.field1454 = false; // L: 105
		}

		return this.field1456; // L: 107
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IS)[F",
		garbageValue = "15889"
	)
	float[] method2647(int var1) {
		return this.field1457[var1]; // L: 111
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-2138262360"
	)
	float[] method2655(int var1) {
		return this.field1458[var1]; // L: 115
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "0"
	)
	float[] method2649(int var1) {
		return this.field1448[var1]; // L: 119
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "12"
	)
	static Date method2679() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1011
		var0.setLenient(false); // L: 1012
		StringBuilder var1 = new StringBuilder(); // L: 1013
		String[] var2 = Login.field876; // L: 1015

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1016
			String var4 = var2[var3]; // L: 1017
			if (var4 == null) { // L: 1019
				class126.method2799(7); // L: 1021
				class345.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1022
				return null; // L: 1024
			}

			var1.append(var4); // L: 1026
		}

		var1.append("12"); // L: 1030
		return var0.parse(var1.toString()); // L: 1031
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)V",
		garbageValue = "641789779"
	)
	static final void method2680(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 4211
		if (var0.pathLength == 0) { // L: 4212
			var0.field1194 = 0; // L: 4213
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4216
				SequenceDefinition var1 = class114.SequenceDefinition_get(var0.sequence); // L: 4217
				if (var0.field1200 > 0 && var1.field2224 == 0) { // L: 4218
					++var0.field1194; // L: 4219
					return; // L: 4220
				}

				if (var0.field1200 <= 0 && var1.field2206 == 0) { // L: 4222
					++var0.field1194; // L: 4223
					return; // L: 4224
				}
			}

			int var10 = var0.x; // L: 4227
			int var2 = var0.y; // L: 4228
			int var3 = var0.field1167 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 4229
			int var4 = var0.field1167 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 4230
			if (var10 < var3) { // L: 4231
				if (var2 < var4) { // L: 4232
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 4233
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 4234
				}
			} else if (var10 > var3) { // L: 4236
				if (var2 < var4) { // L: 4237
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 4238
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 4239
				}
			} else if (var2 < var4) { // L: 4241
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 4242
				var0.orientation = 0;
			}

			class193 var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 4243
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 4244
				int var6 = var0.orientation - var0.rotation & 2047; // L: 4251
				if (var6 > 1024) { // L: 4252
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 4253
				if (var6 >= -256 && var6 <= 256) { // L: 4254
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 4255
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 4256
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 4257
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 4258
				int var8 = 4; // L: 4259
				boolean var9 = true; // L: 4260
				if (var0 instanceof NPC) { // L: 4261
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4262
					if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1204 != 0) { // L: 4263
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4264
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4265
						var8 = 8;
					}

					if (var0.field1194 > 0 && var0.pathLength > 1) { // L: 4266
						var8 = 8; // L: 4267
						--var0.field1194; // L: 4268
					}
				} else {
					if (var0.pathLength > 1) { // L: 4272
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4273
						var8 = 8;
					}

					if (var0.field1194 > 0 && var0.pathLength > 1) { // L: 4274
						var8 = 8; // L: 4275
						--var0.field1194; // L: 4276
					}
				}

				if (var5 == class193.field2248) { // L: 4279
					var8 <<= 1;
				} else if (var5 == class193.field2249) { // L: 4280
					var8 >>= 1;
				}

				if (var8 >= 8) { // L: 4281
					if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 4282
						var0.movementSequence = var0.runSequence;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1150 != -1) { // L: 4283
						var0.movementSequence = var0.field1150;
					} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1183 != -1) { // L: 4284
						var0.movementSequence = var0.field1183;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1152 != -1) { // L: 4285
						var0.movementSequence = var0.field1152;
					}
				} else if (var8 <= 1) { // L: 4287
					if (var0.walkSequence == var0.movementSequence && var0.field1160 != -1) { // L: 4288
						var0.movementSequence = var0.field1160;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1154 != -1) { // L: 4289
						var0.movementSequence = var0.field1154;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1155 != -1) { // L: 4290
						var0.movementSequence = var0.field1155;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1156 != -1) { // L: 4291
						var0.movementSequence = var0.field1156;
					}
				}

				if (var10 != var3 || var2 != var4) { // L: 4293
					if (var10 < var3) { // L: 4294
						var0.x += var8; // L: 4295
						if (var0.x > var3) { // L: 4296
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4298
						var0.x -= var8; // L: 4299
						if (var0.x < var3) { // L: 4300
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4302
						var0.y += var8; // L: 4303
						if (var0.y > var4) { // L: 4304
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4306
						var0.y -= var8; // L: 4307
						if (var0.y < var4) { // L: 4308
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4311
					--var0.pathLength; // L: 4312
					if (var0.field1200 > 0) { // L: 4313
						--var0.field1200;
					}
				}

			} else {
				var0.x = var3; // L: 4245
				var0.y = var4; // L: 4246
				--var0.pathLength; // L: 4247
				if (var0.field1200 > 0) { // L: 4248
					--var0.field1200;
				}

			}
		}
	} // L: 4214 4249 4315
}
