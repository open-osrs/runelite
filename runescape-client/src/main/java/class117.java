import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class117 {
	@ObfuscatedName("v")
	boolean field1413;
	@ObfuscatedName("c")
	boolean field1408;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	class116 field1409;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	class116 field1410;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Ldm;"
	)
	class113[] field1411;
	@ObfuscatedName("n")
	boolean field1412;
	@ObfuscatedName("s")
	float field1422;
	@ObfuscatedName("l")
	float field1414;
	@ObfuscatedName("q")
	float[] field1415;
	@ObfuscatedName("o")
	float[] field1416;
	@ObfuscatedName("r")
	boolean field1407;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1038794237
	)
	int field1418;
	@ObfuscatedName("w")
	float[] field1419;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -297304491
	)
	int field1417;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1891962511
	)
	int field1421;
	@ObfuscatedName("m")
	float field1425;
	@ObfuscatedName("u")
	float field1423;

	class117() {
		this.field1415 = new float[4];
		this.field1416 = new float[4];
		this.field1407 = true;
		this.field1418 = 0;
	} // L: 26

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)I",
		garbageValue = "-14"
	)
	int method2708(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class123 var5 = (class123)MusicPatchPcmStream.findEnumerated(class385.method6974(), var4);
		if (var5 == null) {
			var5 = class123.field1489;
		}

		int var6 = var1.readUnsignedByte();
		class116 var7 = (class116)MusicPatchPcmStream.findEnumerated(class140.method3045(), var6); // L: 38
		if (var7 == null) { // L: 39
			var7 = class116.field1403;
		}

		this.field1409 = var7; // L: 42
		int var8 = var1.readUnsignedByte(); // L: 44
		class116 var9 = (class116)MusicPatchPcmStream.findEnumerated(class140.method3045(), var8); // L: 46
		if (var9 == null) { // L: 47
			var9 = class116.field1403;
		}

		this.field1410 = var9; // L: 50
		this.field1413 = var1.readUnsignedByte() != 0; // L: 51
		this.field1411 = new class113[var3]; // L: 52
		class113 var12 = null; // L: 53

		int var10;
		for (var10 = 0; var10 < var3; ++var10) { // L: 54
			class113 var11 = new class113(); // L: 55
			var11.method2647(var1, var2); // L: 56
			this.field1411[var10] = var11; // L: 57
			if (var12 != null) { // L: 58
				var12.field1375 = var11; // L: 59
			}

			var12 = var11; // L: 61
		}

		this.field1417 = this.field1411[0].field1373; // L: 63
		this.field1421 = this.field1411[this.method2715() - 1].field1373; // L: 64
		this.field1419 = new float[this.method2712() + 1]; // L: 66

		for (var10 = this.method2714(); var10 <= this.method2711(); ++var10) { // L: 67
			this.field1419[var10 - this.method2714()] = class10.method92(this, (float)var10); // L: 68
		}

		this.field1411 = null; // L: 70
		this.field1425 = class10.method92(this, (float)(this.method2714() - 1)); // L: 72
		this.field1423 = class10.method92(this, (float)(this.method2711() + 1)); // L: 73
		return var3; // L: 74
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "937027636"
	)
	public float method2709(int var1) {
		if (var1 < this.method2714()) { // L: 79
			return this.field1425; // L: 80
		} else {
			return var1 > this.method2711() ? this.field1423 : this.field1419[var1 - this.method2714()]; // L: 82 83 85
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-43"
	)
	int method2714() {
		return this.field1417; // L: 90
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-589047321"
	)
	int method2711() {
		return this.field1421; // L: 94
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	int method2712() {
		return this.method2711() - this.method2714(); // L: 98
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-1858768246"
	)
	int method2713(float var1) {
		if (this.field1418 < 0 || (float)this.field1411[this.field1418].field1373 > var1 || this.field1411[this.field1418].field1375 != null && (float)this.field1411[this.field1418].field1375.field1373 <= var1) { // L: 102
			if (var1 >= (float)this.method2714() && var1 <= (float)this.method2711()) { // L: 105
				int var2 = this.method2715(); // L: 108
				int var3 = this.field1418; // L: 109
				if (var2 > 0) { // L: 110
					int var4 = 0; // L: 111
					int var5 = var2 - 1; // L: 112

					do {
						int var6 = var4 + var5 >> 1; // L: 114
						if (var1 < (float)this.field1411[var6].field1373) { // L: 115
							if (var1 > (float)this.field1411[var6 - 1].field1373) { // L: 116
								var3 = var6 - 1; // L: 117
								break;
							}

							var5 = var6 - 1; // L: 121
						} else {
							if (var1 <= (float)this.field1411[var6].field1373) { // L: 124
								var3 = var6; // L: 134
								break; // L: 135
							}

							if (var1 < (float)this.field1411[var6 + 1].field1373) { // L: 125
								var3 = var6; // L: 126
								break; // L: 127
							}

							var4 = var6 + 1; // L: 130
						}
					} while(var4 <= var5); // L: 137
				}

				if (var3 != this.field1418) { // L: 139
					this.field1418 = var3; // L: 140
					this.field1407 = true; // L: 141
				}

				return this.field1418; // L: 143
			} else {
				return -1; // L: 106
			}
		} else {
			return this.field1418; // L: 103
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(FB)Ldm;",
		garbageValue = "-11"
	)
	class113 method2736(float var1) {
		int var2 = this.method2713(var1); // L: 147
		return var2 >= 0 && var2 < this.field1411.length ? this.field1411[var2] : null; // L: 148 149 152
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2021346356"
	)
	int method2715() {
		return this.field1411 == null ? 0 : this.field1411.length; // L: 157 158
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-1434751049"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36
}
