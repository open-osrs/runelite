import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class122 extends DualNode {
	@ObfuscatedName("dw")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1032049851
	)
	int field1521;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[[Ldo;"
	)
	public class117[][] field1518;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[[Ldo;"
	)
	class117[][] field1519;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2048888313
	)
	int field1520;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1006791161
	)
	int field1524;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	public Skeleton field1523;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2081794131
	)
	int field1522;
	@ObfuscatedName("w")
	boolean field1525;

	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;IZ)V"
	)
	class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1518 = null; // L: 14
		this.field1519 = null; // L: 15
		this.field1522 = 0; // L: 19
		this.field1521 = var3; // L: 44
		byte[] var5 = var1.takeFile(this.field1521 >> 16 & 65535, this.field1521 & 65535); // L: 45
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1523 = new Skeleton(var8, var9);
		this.method2762(var6, var7); // L: 53
	} // L: 54

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;IB)V",
		garbageValue = "73"
	)
	void method2762(Buffer var1, int var2) {
		this.field1520 = var1.readUnsignedShort(); // L: 57
		this.field1524 = var1.readUnsignedShort(); // L: 58
		this.field1522 = var1.readUnsignedByte(); // L: 59
		int var3 = var1.readUnsignedShort(); // L: 60
		this.field1519 = new class117[this.field1523.method4150().method4130()][]; // L: 61
		this.field1518 = new class117[this.field1523.method4148()][]; // L: 62

		for (int var4 = 0; var4 < var3; ++var4) { // L: 63
			class118 var5 = class82.method2116(var1.readUnsignedByte()); // L: 64
			int var6 = var1.readShortSmart(); // L: 65
			class119 var7 = class19.method254(var1.readUnsignedByte()); // L: 66
			class117 var8 = new class117(); // L: 67
			var8.method2702(var1, var2); // L: 68
			int var9 = var5.method2736(); // L: 69
			class117[][] var10;
			if (var5 == class118.field1477) { // L: 71
				var10 = this.field1519; // L: 72
			} else {
				var10 = this.field1518; // L: 75
			}

			if (var10[var6] == null) { // L: 77
				var10[var6] = new class117[var9]; // L: 78
			}

			var10[var6][var7.method2747()] = var8; // L: 80
			if (var5 == class118.field1480) { // L: 81
				this.field1525 = true; // L: 82
			}
		}

	} // L: 85

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-44"
	)
	int method2786() {
		return this.field1520; // L: 88
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1215555890"
	)
	int method2765() {
		return this.field1524; // L: 92
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	public int method2766() {
		return this.field1522; // L: 96
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1618023267"
	)
	public int method2767() {
		return this.method2765() - this.method2786(); // L: 100
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-631493485"
	)
	public boolean method2778() {
		return this.field1525; // L: 104
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILdc;III)V",
		garbageValue = "-6832140"
	)
	public void method2790(int var1, class115 var2, int var3, int var4) {
		class387 var5 = MenuAction.method1884(); // L: 108
		this.method2770(var5, var3, var2, var1); // L: 109
		this.method2772(var5, var3, var2, var1); // L: 110
		this.method2779(var5, var3, var2, var1); // L: 111
		var2.method2656(var5); // L: 112
		var5.method6968(); // L: 113
	} // L: 114

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lny;ILdc;II)V",
		garbageValue = "1743460808"
	)
	void method2770(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2660(this.field1522); // L: 117
		float var6 = var5[0]; // L: 118
		float var7 = var5[1]; // L: 119
		float var8 = var5[2]; // L: 120
		if (this.field1519[var2] != null) { // L: 121
			class117 var9 = this.field1519[var2][0]; // L: 122
			class117 var10 = this.field1519[var2][1]; // L: 123
			class117 var11 = this.field1519[var2][2]; // L: 124
			if (var9 != null) { // L: 125
				var6 = var9.method2701(var4);
			}

			if (var10 != null) { // L: 126
				var7 = var10.method2701(var4);
			}

			if (var11 != null) { // L: 127
				var8 = var11.method2701(var4);
			}
		}

		class386 var22;
		synchronized(class386.field4389) { // L: 131
			if (class386.field4385 == 0) { // L: 132
				var22 = new class386();
			} else {
				class386.field4389[--class386.field4385].method6951(); // L: 134
				var22 = class386.field4389[class386.field4385]; // L: 135
			}
		}

		var22.method6945(1.0F, 0.0F, 0.0F, var6); // L: 140
		class386 var23;
		synchronized(class386.field4389) { // L: 143
			if (class386.field4385 == 0) { // L: 144
				var23 = new class386();
			} else {
				class386.field4389[--class386.field4385].method6951(); // L: 146
				var23 = class386.field4389[class386.field4385]; // L: 147
			}
		}

		var23.method6945(0.0F, 1.0F, 0.0F, var7); // L: 152
		class386 var13;
		synchronized(class386.field4389) { // L: 155
			if (class386.field4385 == 0) { // L: 156
				var13 = new class386();
			} else {
				class386.field4389[--class386.field4385].method6951(); // L: 158
				var13 = class386.field4389[class386.field4385]; // L: 159
			}
		}

		var13.method6945(0.0F, 0.0F, 1.0F, var8); // L: 164
		class386 var15;
		synchronized(class386.field4389) { // L: 167
			if (class386.field4385 == 0) { // L: 168
				var15 = new class386();
			} else {
				class386.field4389[--class386.field4385].method6951(); // L: 170
				var15 = class386.field4389[class386.field4385]; // L: 171
			}
		}

		var15.method6938(var13); // L: 176
		var15.method6938(var22); // L: 177
		var15.method6938(var23); // L: 178
		class387 var17 = MenuAction.method1884(); // L: 179
		var17.method6967(var15); // L: 180
		var1.method6962(var17); // L: 181
		var22.method6936(); // L: 182
		var23.method6936(); // L: 183
		var13.method6936(); // L: 184
		var15.method6936(); // L: 185
		var17.method6968(); // L: 186
	} // L: 187

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lny;ILdc;II)V",
		garbageValue = "75323291"
	)
	void method2779(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2661(this.field1522); // L: 190
		float var6 = var5[0]; // L: 191
		float var7 = var5[1]; // L: 192
		float var8 = var5[2]; // L: 193
		if (this.field1519[var2] != null) { // L: 194
			class117 var9 = this.field1519[var2][3]; // L: 195
			class117 var10 = this.field1519[var2][4]; // L: 196
			class117 var11 = this.field1519[var2][5]; // L: 197
			if (var9 != null) { // L: 198
				var6 = var9.method2701(var4);
			}

			if (var10 != null) { // L: 199
				var7 = var10.method2701(var4);
			}

			if (var11 != null) { // L: 200
				var8 = var11.method2701(var4);
			}
		}

		var1.field4394[12] = var6; // L: 202
		var1.field4394[13] = var7; // L: 203
		var1.field4394[14] = var8; // L: 204
	} // L: 205

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lny;ILdc;II)V",
		garbageValue = "518596926"
	)
	void method2772(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2679(this.field1522); // L: 208
		float var6 = var5[0]; // L: 209
		float var7 = var5[1]; // L: 210
		float var8 = var5[2]; // L: 211
		if (this.field1519[var2] != null) { // L: 212
			class117 var9 = this.field1519[var2][6]; // L: 213
			class117 var10 = this.field1519[var2][7]; // L: 214
			class117 var11 = this.field1519[var2][8]; // L: 215
			if (var9 != null) { // L: 216
				var6 = var9.method2701(var4);
			}

			if (var10 != null) { // L: 217
				var7 = var10.method2701(var4);
			}

			if (var11 != null) { // L: 218
				var8 = var11.method2701(var4);
			}
		}

		class387 var12 = MenuAction.method1884(); // L: 220
		var12.method6964(var6, var7, var8); // L: 221
		var1.method6962(var12); // L: 222
		var12.method6968(); // L: 223
	} // L: 224

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lgr;",
		garbageValue = "51486487"
	)
	public static HitSplatDefinition method2800(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "58"
	)
	public static int method2763(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1164971790"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}
}
