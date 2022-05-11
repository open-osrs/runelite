import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class122 extends DualNode {
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -676167361
	)
	int field1531;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[[Ldz;"
	)
	public class117[][] field1530;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[[Ldz;"
	)
	class117[][] field1532;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1182736645
	)
	int field1533;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 195847897
	)
	int field1534;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	public Skeleton field1535;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2017030435
	)
	int field1536;
	@ObfuscatedName("s")
	boolean field1537;

	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;IZ)V"
	)
	class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1530 = null; // L: 14
		this.field1532 = null; // L: 15
		this.field1536 = 0; // L: 19
		this.field1531 = var3; // L: 44
		byte[] var5 = var1.takeFile(this.field1531 >> 16 & 65535, this.field1531 & 65535); // L: 45
		Buffer var6 = new Buffer(var5); // L: 46
		int var7 = var6.readUnsignedByte(); // L: 47
		int var8 = var6.readUnsignedShort(); // L: 48
		byte[] var9;
		if (var4) { // L: 50
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0); // L: 51
		}

		this.field1535 = new Skeleton(var8, var9); // L: 52
		this.method2750(var6, var7); // L: 53
	} // L: 54

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-1451589844"
	)
	void method2750(Buffer var1, int var2) {
		this.field1533 = var1.readUnsignedShort(); // L: 57
		this.field1534 = var1.readUnsignedShort(); // L: 58
		this.field1536 = var1.readUnsignedByte(); // L: 59
		int var3 = var1.readUnsignedShort(); // L: 60
		this.field1532 = new class117[this.field1535.method4023().method4003()][]; // L: 61
		this.field1530 = new class117[this.field1535.method4018()][]; // L: 62

		for (int var4 = 0; var4 < var3; ++var4) { // L: 63
			class118 var5 = class160.method3169(var1.readUnsignedByte()); // L: 64
			int var6 = var1.readShortSmart(); // L: 65
			int var8 = var1.readUnsignedByte(); // L: 67
			class119 var9 = (class119)class291.findEnumerated(ItemContainer.method2060(), var8); // L: 69
			if (var9 == null) { // L: 70
				var9 = class119.field1508;
			}

			class117 var10 = new class117(); // L: 74
			var10.method2688(var1, var2); // L: 75
			int var11 = var5.method2732(); // L: 76
			class117[][] var12;
			if (var5 == class118.field1491) { // L: 78
				var12 = this.field1532; // L: 79
			} else {
				var12 = this.field1530; // L: 82
			}

			if (var12[var6] == null) { // L: 84
				var12[var6] = new class117[var11]; // L: 85
			}

			var12[var6][var9.method2738()] = var10; // L: 87
			if (var5 == class118.field1490) { // L: 88
				this.field1537 = true; // L: 89
			}
		}

	} // L: 92

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "64"
	)
	int method2779() {
		return this.field1533; // L: 95
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1081367730"
	)
	int method2752() {
		return this.field1534; // L: 99
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-47"
	)
	public int method2753() {
		return this.field1536; // L: 103
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-98"
	)
	public int method2754() {
		return this.method2752() - this.method2779(); // L: 107
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-65"
	)
	public boolean method2755() {
		return this.field1537; // L: 111
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILdb;IIB)V",
		garbageValue = "-94"
	)
	public void method2756(int var1, class115 var2, int var3, int var4) {
		class388 var5 = Tile.method3904(); // L: 115
		this.method2757(var5, var3, var2, var1); // L: 116
		this.method2758(var5, var3, var2, var1); // L: 117
		this.method2774(var5, var3, var2, var1); // L: 118
		var2.method2645(var5); // L: 119
		var5.method6865(); // L: 120
	} // L: 121

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnw;ILdb;II)V",
		garbageValue = "-565216546"
	)
	void method2757(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2647(this.field1536); // L: 124
		float var6 = var5[0]; // L: 125
		float var7 = var5[1]; // L: 126
		float var8 = var5[2]; // L: 127
		if (this.field1532[var2] != null) { // L: 128
			class117 var9 = this.field1532[var2][0]; // L: 129
			class117 var10 = this.field1532[var2][1]; // L: 130
			class117 var11 = this.field1532[var2][2]; // L: 131
			if (var9 != null) { // L: 132
				var6 = var9.method2689(var4);
			}

			if (var10 != null) { // L: 133
				var7 = var10.method2689(var4);
			}

			if (var11 != null) { // L: 134
				var8 = var11.method2689(var4);
			}
		}

		class387 var22;
		synchronized(class387.field4395) { // L: 138
			if (Frames.field2492 == 0) { // L: 139
				var22 = new class387();
			} else {
				class387.field4395[--Frames.field2492].method6782(); // L: 141
				var22 = class387.field4395[Frames.field2492]; // L: 142
			}
		}

		var22.method6784(1.0F, 0.0F, 0.0F, var6); // L: 147
		class387 var23;
		synchronized(class387.field4395) { // L: 150
			if (Frames.field2492 == 0) { // L: 151
				var23 = new class387();
			} else {
				class387.field4395[--Frames.field2492].method6782(); // L: 153
				var23 = class387.field4395[Frames.field2492]; // L: 154
			}
		}

		var23.method6784(0.0F, 1.0F, 0.0F, var7); // L: 159
		class387 var13;
		synchronized(class387.field4395) { // L: 162
			if (Frames.field2492 == 0) { // L: 163
				var13 = new class387();
			} else {
				class387.field4395[--Frames.field2492].method6782(); // L: 165
				var13 = class387.field4395[Frames.field2492]; // L: 166
			}
		}

		var13.method6784(0.0F, 0.0F, 1.0F, var8); // L: 171
		class387 var15;
		synchronized(class387.field4395) { // L: 174
			if (Frames.field2492 == 0) { // L: 175
				var15 = new class387();
			} else {
				class387.field4395[--Frames.field2492].method6782(); // L: 177
				var15 = class387.field4395[Frames.field2492]; // L: 178
			}
		}

		var15.method6783(var13); // L: 183
		var15.method6783(var22); // L: 184
		var15.method6783(var23); // L: 185
		class388 var17 = Tile.method3904(); // L: 186
		var17.method6817(var15); // L: 187
		var1.method6816(var17); // L: 188
		var22.method6779(); // L: 189
		var23.method6779(); // L: 190
		var13.method6779(); // L: 191
		var15.method6779(); // L: 192
		var17.method6865(); // L: 193
	} // L: 194

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnw;ILdb;IB)V",
		garbageValue = "-29"
	)
	void method2774(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2655(this.field1536); // L: 197
		float var6 = var5[0]; // L: 198
		float var7 = var5[1]; // L: 199
		float var8 = var5[2]; // L: 200
		if (this.field1532[var2] != null) { // L: 201
			class117 var9 = this.field1532[var2][3]; // L: 202
			class117 var10 = this.field1532[var2][4]; // L: 203
			class117 var11 = this.field1532[var2][5]; // L: 204
			if (var9 != null) { // L: 205
				var6 = var9.method2689(var4);
			}

			if (var10 != null) { // L: 206
				var7 = var10.method2689(var4);
			}

			if (var11 != null) { // L: 207
				var8 = var11.method2689(var4);
			}
		}

		var1.field4400[12] = var6; // L: 209
		var1.field4400[13] = var7; // L: 210
		var1.field4400[14] = var8; // L: 211
	} // L: 212

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnw;ILdb;IB)V",
		garbageValue = "-6"
	)
	void method2758(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2649(this.field1536); // L: 215
		float var6 = var5[0]; // L: 216
		float var7 = var5[1]; // L: 217
		float var8 = var5[2]; // L: 218
		if (this.field1532[var2] != null) { // L: 219
			class117 var9 = this.field1532[var2][6]; // L: 220
			class117 var10 = this.field1532[var2][7]; // L: 221
			class117 var11 = this.field1532[var2][8]; // L: 222
			if (var9 != null) { // L: 223
				var6 = var9.method2689(var4);
			}

			if (var10 != null) { // L: 224
				var7 = var10.method2689(var4);
			}

			if (var11 != null) { // L: 225
				var8 = var11.method2689(var4);
			}
		}

		class388 var12 = Tile.method3904(); // L: 227
		var12.method6814(var6, var7, var8); // L: 228
		var1.method6816(var12); // L: 229
		var12.method6865(); // L: 230
	} // L: 231
}
