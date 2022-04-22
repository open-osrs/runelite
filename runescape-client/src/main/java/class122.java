import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class122 extends DualNode {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 756927065
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1723408099
	)
	int field1470;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[[Ldt;"
	)
	public class117[][] field1474;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[[Ldt;"
	)
	class117[][] field1471;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2014722717
	)
	int field1469;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -332212275
	)
	int field1473;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	public Skeleton field1472;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1571742799
	)
	int field1475;
	@ObfuscatedName("l")
	boolean field1476;

	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;IZ)V",
		garbageValue = "0"
	)
	public class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1474 = null; // L: 14
		this.field1471 = null; // L: 15
		this.field1475 = 0; // L: 19
		this.field1470 = var3; // L: 23
		byte[] var5 = var1.takeFile(this.field1470 >> 16 & 65535, this.field1470 & 65535); // L: 24
		Buffer var6 = new Buffer(var5); // L: 25
		int var7 = var6.readUnsignedByte(); // L: 26
		int var8 = var6.readUnsignedShort(); // L: 27
		byte[] var9 = var2.getFile(var8, 0); // L: 30
		this.field1472 = new Skeleton(var8, var9); // L: 31
		this.method2780(var6, var7); // L: 32
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-1615717546"
	)
	void method2780(Buffer var1, int var2) {
		this.field1469 = var1.readUnsignedShort(); // L: 36
		this.field1473 = var1.readUnsignedShort(); // L: 37
		this.field1475 = var1.readUnsignedByte(); // L: 38
		int var3 = var1.readUnsignedShort(); // L: 39
		this.field1471 = new class117[this.field1472.method4721().method4698()][]; // L: 40
		this.field1474 = new class117[this.field1472.method4720()][]; // L: 41

		for (int var4 = 0; var4 < var3; ++var4) { // L: 42
			class118 var5 = TriBool.method6838(var1.readUnsignedByte()); // L: 43
			int var6 = var1.readShortSmart(); // L: 44
			int var8 = var1.readUnsignedByte(); // L: 46
			class119 var9 = (class119)MusicPatchPcmStream.findEnumerated(GrandExchangeOfferTotalQuantityComparator.method5977(), var8); // L: 48
			if (var9 == null) { // L: 49
				var9 = class119.field1449;
			}

			class117 var10 = new class117(); // L: 53
			var10.method2708(var1, var2); // L: 54
			int var11 = var5.method2739(); // L: 55
			class117[][] var12;
			if (var5 == class118.field1430) { // L: 57
				var12 = this.field1471; // L: 58
			} else {
				var12 = this.field1474; // L: 61
			}

			if (var12[var6] == null) { // L: 63
				var12[var6] = new class117[var11]; // L: 64
			}

			var12[var6][var9.method2751()] = var10; // L: 66
			if (var5 == class118.field1434) { // L: 67
				this.field1476 = true; // L: 68
			}
		}

	} // L: 71

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "35"
	)
	int method2764() {
		return this.field1469; // L: 74
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1732677053"
	)
	int method2781() {
		return this.field1473; // L: 78
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "30516"
	)
	public int method2766() {
		return this.field1475; // L: 82
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	public int method2762() {
		return this.method2781() - this.method2764(); // L: 86
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1927278316"
	)
	public boolean method2768() {
		return this.field1476; // L: 90
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILda;III)V",
		garbageValue = "-1716818444"
	)
	public void method2796(int var1, class115 var2, int var3, int var4) {
		class387 var5;
		synchronized(class387.field4346) { // L: 96
			if (class387.field4347 == 0) { // L: 97
				var5 = new class387();
			} else {
				class387.field4346[--class387.field4347].method7011(); // L: 99
				var5 = class387.field4346[class387.field4347]; // L: 100
			}
		}

		this.method2763(var5, var3, var2, var1); // L: 105
		this.method2793(var5, var3, var2, var1); // L: 106
		this.method2771(var5, var3, var2, var1); // L: 107
		var2.method2676(var5); // L: 108
		var5.method7029(); // L: 109
	} // L: 110

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnt;ILda;II)V",
		garbageValue = "-1176349802"
	)
	void method2763(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2672(this.field1475); // L: 113
		float var6 = var5[0]; // L: 114
		float var7 = var5[1]; // L: 115
		float var8 = var5[2]; // L: 116
		if (this.field1471[var2] != null) { // L: 117
			class117 var9 = this.field1471[var2][0]; // L: 118
			class117 var10 = this.field1471[var2][1]; // L: 119
			class117 var11 = this.field1471[var2][2]; // L: 120
			if (var9 != null) { // L: 121
				var6 = var9.method2709(var4);
			}

			if (var10 != null) { // L: 122
				var7 = var10.method2709(var4);
			}

			if (var11 != null) { // L: 123
				var8 = var11.method2709(var4);
			}
		}

		class386 var17 = class120.method2761(); // L: 125
		var17.method6984(1.0F, 0.0F, 0.0F, var6); // L: 126
		class386 var18 = class120.method2761(); // L: 127
		var18.method6984(0.0F, 1.0F, 0.0F, var7); // L: 128
		class386 var19 = class120.method2761(); // L: 129
		var19.method6984(0.0F, 0.0F, 1.0F, var8); // L: 130
		class386 var12 = class120.method2761(); // L: 131
		var12.method6986(var19); // L: 132
		var12.method6986(var17); // L: 133
		var12.method6986(var18); // L: 134
		class387 var13;
		synchronized(class387.field4346) { // L: 137
			if (class387.field4347 == 0) { // L: 138
				var13 = new class387();
			} else {
				class387.field4346[--class387.field4347].method7011(); // L: 140
				var13 = class387.field4346[class387.field4347]; // L: 141
			}
		}

		var13.method7006(var12); // L: 146
		var1.method7017(var13); // L: 147
		var17.method6988(); // L: 148
		var18.method6988(); // L: 149
		var19.method6988(); // L: 150
		var12.method6988(); // L: 151
		var13.method7029(); // L: 152
	} // L: 153

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnt;ILda;IB)V",
		garbageValue = "-70"
	)
	void method2771(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2673(this.field1475); // L: 156
		float var6 = var5[0]; // L: 157
		float var7 = var5[1]; // L: 158
		float var8 = var5[2]; // L: 159
		if (this.field1471[var2] != null) { // L: 160
			class117 var9 = this.field1471[var2][3]; // L: 161
			class117 var10 = this.field1471[var2][4]; // L: 162
			class117 var11 = this.field1471[var2][5]; // L: 163
			if (var9 != null) { // L: 164
				var6 = var9.method2709(var4);
			}

			if (var10 != null) { // L: 165
				var7 = var10.method2709(var4);
			}

			if (var11 != null) { // L: 166
				var8 = var11.method2709(var4);
			}
		}

		var1.field4348[12] = var6; // L: 168
		var1.field4348[13] = var7; // L: 169
		var1.field4348[14] = var8; // L: 170
	} // L: 171

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnt;ILda;II)V",
		garbageValue = "16711935"
	)
	void method2793(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2674(this.field1475); // L: 174
		float var6 = var5[0]; // L: 175
		float var7 = var5[1]; // L: 176
		float var8 = var5[2]; // L: 177
		if (this.field1471[var2] != null) { // L: 178
			class117 var9 = this.field1471[var2][6]; // L: 179
			class117 var10 = this.field1471[var2][7]; // L: 180
			class117 var11 = this.field1471[var2][8]; // L: 181
			if (var9 != null) { // L: 182
				var6 = var9.method2709(var4);
			}

			if (var10 != null) { // L: 183
				var7 = var10.method2709(var4);
			}

			if (var11 != null) { // L: 184
				var8 = var11.method2709(var4);
			}
		}

		class387 var14;
		synchronized(class387.field4346) { // L: 188
			if (class387.field4347 == 0) { // L: 189
				var14 = new class387();
			} else {
				class387.field4346[--class387.field4347].method7011(); // L: 191
				var14 = class387.field4346[class387.field4347]; // L: 192
			}
		}

		var14.method7049(var6, var7, var8); // L: 197
		var1.method7017(var14); // L: 198
		var14.method7029(); // L: 199
	} // L: 200
}
