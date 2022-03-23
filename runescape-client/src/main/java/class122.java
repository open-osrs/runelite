import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class122 extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("NetCache_reference")
	static Buffer NetCache_reference;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 514562923
	)
	int field1486;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[[Ldi;"
	)
	public class117[][] field1480;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[[Ldi;"
	)
	class117[][] field1490;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1741171979
	)
	int field1483;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -123796151
	)
	int field1484;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	public Skeleton field1485;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1830571413
	)
	int field1482;
	@ObfuscatedName("f")
	boolean field1487;

	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;IZ)V",
		garbageValue = "0"
	)
	public class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1480 = null; // L: 14
		this.field1490 = null; // L: 15
		this.field1482 = 0; // L: 19
		this.field1486 = var3; // L: 23
		byte[] var5 = var1.takeFile(this.field1486 >> 16 & 65535, this.field1486 & 65535); // L: 24
		Buffer var6 = new Buffer(var5); // L: 25
		int var7 = var6.readUnsignedByte(); // L: 26
		int var8 = var6.readUnsignedShort(); // L: 27
		byte[] var9 = var2.getFile(var8, 0); // L: 30
		this.field1485 = new Skeleton(var8, var9); // L: 31
		this.method2758(var6, var7); // L: 32
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V",
		garbageValue = "-1270112984"
	)
	void method2758(Buffer var1, int var2) {
		this.field1483 = var1.readUnsignedShort(); // L: 36
		this.field1484 = var1.readUnsignedShort(); // L: 37
		this.field1482 = var1.readUnsignedByte(); // L: 38
		int var3 = var1.readUnsignedShort(); // L: 39
		this.field1490 = new class117[this.field1485.method4120().method4098()][]; // L: 40
		this.field1480 = new class117[this.field1485.method4119()][]; // L: 41

		for (int var4 = 0; var4 < var3; ++var4) { // L: 42
			int var6 = var1.readUnsignedByte(); // L: 44
			class118[] var7 = new class118[]{class118.field1452, class118.field1444, class118.field1443, class118.field1446, class118.field1445, class118.field1448}; // L: 48
			class118 var8 = (class118)ChatChannel.findEnumerated(var7, var6); // L: 50
			if (var8 == null) { // L: 51
				var8 = class118.field1452;
			}

			int var15 = var1.readShortSmart(); // L: 55
			int var10 = var1.readUnsignedByte(); // L: 57
			class119 var11 = (class119)ChatChannel.findEnumerated(AbstractWorldMapIcon.method5059(), var10); // L: 59
			if (var11 == null) { // L: 60
				var11 = class119.field1457;
			}

			class117 var12 = new class117(); // L: 64
			var12.method2722(var1, var2); // L: 65
			int var13 = var8.method2727(); // L: 66
			class117[][] var14;
			if (var8 == class118.field1444) { // L: 68
				var14 = this.field1490; // L: 69
			} else {
				var14 = this.field1480; // L: 72
			}

			if (var14[var15] == null) { // L: 74
				var14[var15] = new class117[var13]; // L: 75
			}

			var14[var15][var11.method2751()] = var12; // L: 77
			if (var8 == class118.field1445) { // L: 78
				this.field1487 = true; // L: 79
			}
		}

	} // L: 82

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1494944281"
	)
	int method2759() {
		return this.field1483; // L: 85
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-18228"
	)
	int method2767() {
		return this.field1484; // L: 89
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1883189895"
	)
	public int method2783() {
		return this.field1482; // L: 93
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1616413534"
	)
	public int method2771() {
		return this.method2767() - this.method2759(); // L: 97
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-2"
	)
	public boolean method2784() {
		return this.field1487; // L: 101
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILdq;IIB)V",
		garbageValue = "5"
	)
	public void method2763(int var1, class115 var2, int var3, int var4) {
		class387 var5 = HealthBarDefinition.method3428(); // L: 105
		this.method2764(var5, var3, var2, var1); // L: 106
		this.method2766(var5, var3, var2, var1); // L: 107
		this.method2765(var5, var3, var2, var1); // L: 108
		var2.method2654(var5); // L: 109
		var5.method7095(); // L: 110
	} // L: 111

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;ILdq;II)V",
		garbageValue = "-966244253"
	)
	void method2764(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2658(this.field1482); // L: 114
		float var6 = var5[0]; // L: 115
		float var7 = var5[1]; // L: 116
		float var8 = var5[2]; // L: 117
		if (this.field1490[var2] != null) { // L: 118
			class117 var9 = this.field1490[var2][0]; // L: 119
			class117 var10 = this.field1490[var2][1]; // L: 120
			class117 var11 = this.field1490[var2][2]; // L: 121
			if (var9 != null) { // L: 122
				var6 = var9.method2700(var4);
			}

			if (var10 != null) { // L: 123
				var7 = var10.method2700(var4);
			}

			if (var11 != null) { // L: 124
				var8 = var11.method2700(var4);
			}
		}

		class386 var16 = KeyHandler.method378(); // L: 126
		var16.method7032(1.0F, 0.0F, 0.0F, var6); // L: 127
		class386 var14 = KeyHandler.method378(); // L: 128
		var14.method7032(0.0F, 1.0F, 0.0F, var7); // L: 129
		class386 var15 = KeyHandler.method378(); // L: 130
		var15.method7032(0.0F, 0.0F, 1.0F, var8); // L: 131
		class386 var12 = KeyHandler.method378(); // L: 132
		var12.method7036(var15); // L: 133
		var12.method7036(var16); // L: 134
		var12.method7036(var14); // L: 135
		class387 var13 = HealthBarDefinition.method3428(); // L: 136
		var13.method7069(var12); // L: 137
		var1.method7109(var13); // L: 138
		var16.method7043(); // L: 139
		var14.method7043(); // L: 140
		var15.method7043(); // L: 141
		var12.method7043(); // L: 142
		var13.method7095(); // L: 143
	} // L: 144

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnu;ILdq;II)V",
		garbageValue = "-43276704"
	)
	void method2765(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2652(this.field1482); // L: 147
		float var6 = var5[0]; // L: 148
		float var7 = var5[1]; // L: 149
		float var8 = var5[2]; // L: 150
		if (this.field1490[var2] != null) { // L: 151
			class117 var9 = this.field1490[var2][3]; // L: 152
			class117 var10 = this.field1490[var2][4]; // L: 153
			class117 var11 = this.field1490[var2][5]; // L: 154
			if (var9 != null) { // L: 155
				var6 = var9.method2700(var4);
			}

			if (var10 != null) { // L: 156
				var7 = var10.method2700(var4);
			}

			if (var11 != null) { // L: 157
				var8 = var11.method2700(var4);
			}
		}

		var1.field4347[12] = var6; // L: 159
		var1.field4347[13] = var7; // L: 160
		var1.field4347[14] = var8; // L: 161
	} // L: 162

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnu;ILdq;IB)V",
		garbageValue = "-10"
	)
	void method2766(class387 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2687(this.field1482); // L: 165
		float var6 = var5[0]; // L: 166
		float var7 = var5[1]; // L: 167
		float var8 = var5[2]; // L: 168
		if (this.field1490[var2] != null) { // L: 169
			class117 var9 = this.field1490[var2][6]; // L: 170
			class117 var10 = this.field1490[var2][7]; // L: 171
			class117 var11 = this.field1490[var2][8]; // L: 172
			if (var9 != null) { // L: 173
				var6 = var9.method2700(var4);
			}

			if (var10 != null) { // L: 174
				var7 = var10.method2700(var4);
			}

			if (var11 != null) { // L: 175
				var8 = var11.method2700(var4);
			}
		}

		class387 var12 = HealthBarDefinition.method3428(); // L: 177
		var12.method7066(var6, var7, var8); // L: 178
		var1.method7109(var12); // L: 179
		var12.method7095(); // L: 180
	} // L: 181
}
