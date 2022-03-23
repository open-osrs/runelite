import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public final class class387 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lnu;"
	)
	static class387[] field4344;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 623605303
	)
	static int field4345;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -29781141
	)
	static int field4346;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	public static final class387 field4348;
	@ObfuscatedName("l")
	public float[] field4347;

	static {
		field4344 = new class387[0]; // L: 9
		field4345 = 100; // L: 15
		field4344 = new class387[100]; // L: 16
		field4346 = 0; // L: 17
		field4348 = new class387();
	} // L: 22

	public class387() {
		this.field4347 = new float[16];
		this.method7061(); // L: 41
	} // L: 42

	@ObfuscatedSignature(
		descriptor = "(Lnu;)V"
	)
	public class387(class387 var1) {
		this.field4347 = new float[16];
		this.method7064(var1); // L: 45
	} // L: 46

	@ObfuscatedSignature(
		descriptor = "(Lpd;Z)V"
	)
	public class387(Buffer var1, boolean var2) {
		this.field4347 = new float[16]; // L: 21
		this.method7059(var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	public void method7095() {
		synchronized(field4344) { // L: 35
			if (field4346 < field4345 - 1) { // L: 36
				field4344[++field4346 - 1] = this;
			}

		}
	} // L: 38

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpd;ZI)V",
		garbageValue = "-1865581813"
	)
	void method7059(Buffer var1, boolean var2) {
		if (var2) { // L: 53
			class388 var4 = new class388(); // L: 54
			var4.method7128(HealthBarDefinition.method3433(var1.readShort())); // L: 55
			var4.method7129(HealthBarDefinition.method3433(var1.readShort())); // L: 56
			var4.method7139(HealthBarDefinition.method3433(var1.readShort())); // L: 57
			var4.method7131((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 58
			this.method7070(var4); // L: 59
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 62
				this.field4347[var3] = var1.method7965(); // L: 63
			}
		}

	} // L: 66

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "57"
	)
	float[] method7086() {
		float[] var1 = new float[3]; // L: 69
		if ((double)this.field4347[2] < 0.999D && (double)this.field4347[2] > -0.999D) { // L: 70
			var1[1] = (float)(-Math.asin((double)this.field4347[2])); // L: 71
			double var2 = Math.cos((double)var1[1]); // L: 72
			var1[0] = (float)Math.atan2((double)this.field4347[6] / var2, (double)this.field4347[10] / var2); // L: 73
			var1[2] = (float)Math.atan2((double)this.field4347[1] / var2, (double)this.field4347[0] / var2); // L: 74
		} else {
			var1[0] = 0.0F; // L: 77
			var1[1] = (float)Math.atan2((double)this.field4347[2], 0.0D); // L: 78
			var1[2] = (float)Math.atan2((double)(-this.field4347[9]), (double)this.field4347[5]); // L: 79
		}

		return var1; // L: 81
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-2013640874"
	)
	public float[] method7072() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4347[6])), 0.0F, 0.0F}; // L: 85 86
		double var2 = Math.cos((double)var1[0]); // L: 87
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 88
			var4 = (double)this.field4347[2]; // L: 89
			var6 = (double)this.field4347[10]; // L: 90
			double var8 = (double)this.field4347[4]; // L: 91
			double var10 = (double)this.field4347[5]; // L: 92
			var1[1] = (float)Math.atan2(var4, var6); // L: 93
			var1[2] = (float)Math.atan2(var8, var10); // L: 94
		} else {
			var4 = (double)this.field4347[1]; // L: 97
			var6 = (double)this.field4347[0]; // L: 98
			if (this.field4347[6] < 0.0F) { // L: 99
				var1[1] = (float)Math.atan2(var4, var6); // L: 100
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 103
			}

			var1[2] = 0.0F; // L: 105
		}

		return var1; // L: 107
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-521108963"
	)
	void method7061() {
		this.field4347[0] = 1.0F; // L: 111
		this.field4347[1] = 0.0F; // L: 112
		this.field4347[2] = 0.0F; // L: 113
		this.field4347[3] = 0.0F; // L: 114
		this.field4347[4] = 0.0F; // L: 115
		this.field4347[5] = 1.0F; // L: 116
		this.field4347[6] = 0.0F; // L: 117
		this.field4347[7] = 0.0F; // L: 118
		this.field4347[8] = 0.0F; // L: 119
		this.field4347[9] = 0.0F; // L: 120
		this.field4347[10] = 1.0F; // L: 121
		this.field4347[11] = 0.0F; // L: 122
		this.field4347[12] = 0.0F; // L: 123
		this.field4347[13] = 0.0F; // L: 124
		this.field4347[14] = 0.0F; // L: 125
		this.field4347[15] = 1.0F; // L: 126
	} // L: 127

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	public void method7063() {
		this.field4347[0] = 0.0F; // L: 130
		this.field4347[1] = 0.0F; // L: 131
		this.field4347[2] = 0.0F; // L: 132
		this.field4347[3] = 0.0F; // L: 133
		this.field4347[4] = 0.0F; // L: 134
		this.field4347[5] = 0.0F; // L: 135
		this.field4347[6] = 0.0F; // L: 136
		this.field4347[7] = 0.0F; // L: 137
		this.field4347[8] = 0.0F; // L: 138
		this.field4347[9] = 0.0F; // L: 139
		this.field4347[10] = 0.0F; // L: 140
		this.field4347[11] = 0.0F; // L: 141
		this.field4347[12] = 0.0F; // L: 142
		this.field4347[13] = 0.0F; // L: 143
		this.field4347[14] = 0.0F; // L: 144
		this.field4347[15] = 0.0F; // L: 145
	} // L: 146

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-2027114909"
	)
	public void method7064(class387 var1) {
		System.arraycopy(var1.field4347, 0, this.field4347, 0, 16); // L: 149
	} // L: 150

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1159327963"
	)
	public void method7065(float var1) {
		this.method7066(var1, var1, var1); // L: 153
	} // L: 154

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1632887499"
	)
	public void method7066(float var1, float var2, float var3) {
		this.method7061(); // L: 157
		this.field4347[0] = var1; // L: 158
		this.field4347[5] = var2; // L: 159
		this.field4347[10] = var3; // L: 160
	} // L: 161

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "853213330"
	)
	public void method7067(class387 var1) {
		for (int var2 = 0; var2 < this.field4347.length; ++var2) { // L: 164
			float[] var10000 = this.field4347; // L: 165
			var10000[var2] += var1.field4347[var2];
		}

	} // L: 167

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)V",
		garbageValue = "39"
	)
	public void method7109(class387 var1) {
		float var2 = var1.field4347[0] * this.field4347[0] + var1.field4347[4] * this.field4347[1] + this.field4347[2] * var1.field4347[8] + var1.field4347[12] * this.field4347[3]; // L: 170
		float var3 = var1.field4347[1] * this.field4347[0] + var1.field4347[5] * this.field4347[1] + var1.field4347[9] * this.field4347[2] + this.field4347[3] * var1.field4347[13]; // L: 171
		float var4 = this.field4347[3] * var1.field4347[14] + this.field4347[0] * var1.field4347[2] + this.field4347[1] * var1.field4347[6] + var1.field4347[10] * this.field4347[2]; // L: 172
		float var5 = this.field4347[3] * var1.field4347[15] + this.field4347[2] * var1.field4347[11] + this.field4347[1] * var1.field4347[7] + var1.field4347[3] * this.field4347[0]; // L: 173
		float var6 = this.field4347[5] * var1.field4347[4] + this.field4347[4] * var1.field4347[0] + this.field4347[6] * var1.field4347[8] + var1.field4347[12] * this.field4347[7]; // L: 174
		float var7 = var1.field4347[5] * this.field4347[5] + this.field4347[4] * var1.field4347[1] + this.field4347[6] * var1.field4347[9] + this.field4347[7] * var1.field4347[13]; // L: 175
		float var8 = this.field4347[5] * var1.field4347[6] + this.field4347[4] * var1.field4347[2] + var1.field4347[10] * this.field4347[6] + var1.field4347[14] * this.field4347[7]; // L: 176
		float var9 = var1.field4347[7] * this.field4347[5] + var1.field4347[3] * this.field4347[4] + this.field4347[6] * var1.field4347[11] + var1.field4347[15] * this.field4347[7]; // L: 177
		float var10 = var1.field4347[0] * this.field4347[8] + var1.field4347[4] * this.field4347[9] + var1.field4347[8] * this.field4347[10] + var1.field4347[12] * this.field4347[11]; // L: 178
		float var11 = var1.field4347[13] * this.field4347[11] + var1.field4347[1] * this.field4347[8] + var1.field4347[5] * this.field4347[9] + var1.field4347[9] * this.field4347[10]; // L: 179
		float var12 = var1.field4347[6] * this.field4347[9] + this.field4347[8] * var1.field4347[2] + var1.field4347[10] * this.field4347[10] + var1.field4347[14] * this.field4347[11]; // L: 180
		float var13 = this.field4347[11] * var1.field4347[15] + this.field4347[8] * var1.field4347[3] + this.field4347[9] * var1.field4347[7] + var1.field4347[11] * this.field4347[10]; // L: 181
		float var14 = this.field4347[15] * var1.field4347[12] + var1.field4347[4] * this.field4347[13] + var1.field4347[0] * this.field4347[12] + this.field4347[14] * var1.field4347[8]; // L: 182
		float var15 = this.field4347[14] * var1.field4347[9] + var1.field4347[5] * this.field4347[13] + this.field4347[12] * var1.field4347[1] + var1.field4347[13] * this.field4347[15]; // L: 183
		float var16 = var1.field4347[14] * this.field4347[15] + this.field4347[13] * var1.field4347[6] + var1.field4347[2] * this.field4347[12] + this.field4347[14] * var1.field4347[10]; // L: 184
		float var17 = var1.field4347[3] * this.field4347[12] + this.field4347[13] * var1.field4347[7] + this.field4347[14] * var1.field4347[11] + this.field4347[15] * var1.field4347[15]; // L: 185
		this.field4347[0] = var2; // L: 186
		this.field4347[1] = var3; // L: 187
		this.field4347[2] = var4; // L: 188
		this.field4347[3] = var5; // L: 189
		this.field4347[4] = var6; // L: 190
		this.field4347[5] = var7; // L: 191
		this.field4347[6] = var8; // L: 192
		this.field4347[7] = var9; // L: 193
		this.field4347[8] = var10; // L: 194
		this.field4347[9] = var11; // L: 195
		this.field4347[10] = var12; // L: 196
		this.field4347[11] = var13; // L: 197
		this.field4347[12] = var14; // L: 198
		this.field4347[13] = var15; // L: 199
		this.field4347[14] = var16; // L: 200
		this.field4347[15] = var17; // L: 201
	} // L: 202

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnf;I)V",
		garbageValue = "-1554495705"
	)
	public void method7069(class386 var1) {
		float var2 = var1.field4338 * var1.field4338; // L: 205
		float var3 = var1.field4338 * var1.field4339; // L: 206
		float var4 = var1.field4338 * var1.field4340; // L: 207
		float var5 = var1.field4341 * var1.field4338; // L: 208
		float var6 = var1.field4339 * var1.field4339; // L: 209
		float var7 = var1.field4340 * var1.field4339; // L: 210
		float var8 = var1.field4339 * var1.field4341; // L: 211
		float var9 = var1.field4340 * var1.field4340; // L: 212
		float var10 = var1.field4340 * var1.field4341; // L: 213
		float var11 = var1.field4341 * var1.field4341; // L: 214
		this.field4347[0] = var2 + var6 - var11 - var9; // L: 215
		this.field4347[1] = var7 + var5 + var7 + var5; // L: 216
		this.field4347[2] = var8 + (var8 - var4 - var4); // L: 217
		this.field4347[4] = var7 - var5 - var5 + var7; // L: 218
		this.field4347[5] = var9 + var2 - var6 - var11; // L: 219
		this.field4347[6] = var3 + var10 + var3 + var10; // L: 220
		this.field4347[8] = var4 + var4 + var8 + var8; // L: 221
		this.field4347[9] = var10 + (var10 - var3 - var3); // L: 222
		this.field4347[10] = var11 + var2 - var9 - var6; // L: 223
	} // L: 224

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnr;B)V",
		garbageValue = "-72"
	)
	void method7070(class388 var1) {
		this.field4347[0] = var1.field4359; // L: 227
		this.field4347[1] = var1.field4350; // L: 228
		this.field4347[2] = var1.field4351; // L: 229
		this.field4347[3] = 0.0F; // L: 230
		this.field4347[4] = var1.field4352; // L: 231
		this.field4347[5] = var1.field4353; // L: 232
		this.field4347[6] = var1.field4357; // L: 233
		this.field4347[7] = 0.0F; // L: 234
		this.field4347[8] = var1.field4355; // L: 235
		this.field4347[9] = var1.field4349; // L: 236
		this.field4347[10] = var1.field4356; // L: 237
		this.field4347[11] = 0.0F; // L: 238
		this.field4347[12] = var1.field4358; // L: 239
		this.field4347[13] = var1.field4354; // L: 240
		this.field4347[14] = var1.field4360; // L: 241
		this.field4347[15] = 1.0F; // L: 242
	} // L: 243

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "0"
	)
	float method7071() {
		return this.field4347[12] * this.field4347[3] * this.field4347[6] * this.field4347[9] + (this.field4347[8] * this.field4347[3] * this.field4347[5] * this.field4347[14] + this.field4347[13] * this.field4347[3] * this.field4347[4] * this.field4347[10] + (this.field4347[13] * this.field4347[2] * this.field4347[7] * this.field4347[8] + this.field4347[10] * this.field4347[1] * this.field4347[7] * this.field4347[12] + (this.field4347[15] * this.field4347[0] * this.field4347[5] * this.field4347[10] - this.field4347[14] * this.field4347[11] * this.field4347[0] * this.field4347[5] - this.field4347[15] * this.field4347[9] * this.field4347[6] * this.field4347[0] + this.field4347[11] * this.field4347[0] * this.field4347[6] * this.field4347[13] + this.field4347[0] * this.field4347[7] * this.field4347[9] * this.field4347[14] - this.field4347[13] * this.field4347[7] * this.field4347[0] * this.field4347[10] - this.field4347[15] * this.field4347[10] * this.field4347[4] * this.field4347[1] + this.field4347[14] * this.field4347[11] * this.field4347[4] * this.field4347[1] + this.field4347[6] * this.field4347[1] * this.field4347[8] * this.field4347[15] - this.field4347[1] * this.field4347[6] * this.field4347[11] * this.field4347[12] - this.field4347[8] * this.field4347[7] * this.field4347[1] * this.field4347[14]) + this.field4347[15] * this.field4347[2] * this.field4347[4] * this.field4347[9] - this.field4347[2] * this.field4347[4] * this.field4347[11] * this.field4347[13] - this.field4347[15] * this.field4347[8] * this.field4347[5] * this.field4347[2] + this.field4347[12] * this.field4347[11] * this.field4347[2] * this.field4347[5] - this.field4347[12] * this.field4347[9] * this.field4347[2] * this.field4347[7] - this.field4347[4] * this.field4347[3] * this.field4347[9] * this.field4347[14]) - this.field4347[12] * this.field4347[10] * this.field4347[3] * this.field4347[5] - this.field4347[13] * this.field4347[8] * this.field4347[6] * this.field4347[3]); // L: 246
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method7111() {
		float var1 = 1.0F / this.method7071(); // L: 250
		float var2 = (this.field4347[13] * this.field4347[6] * this.field4347[11] + (this.field4347[10] * this.field4347[5] * this.field4347[15] - this.field4347[11] * this.field4347[5] * this.field4347[14] - this.field4347[15] * this.field4347[9] * this.field4347[6]) + this.field4347[7] * this.field4347[9] * this.field4347[14] - this.field4347[13] * this.field4347[7] * this.field4347[10]) * var1; // L: 251
		float var3 = var1 * (this.field4347[10] * this.field4347[3] * this.field4347[13] + (this.field4347[10] * -this.field4347[1] * this.field4347[15] + this.field4347[14] * this.field4347[11] * this.field4347[1] + this.field4347[15] * this.field4347[2] * this.field4347[9] - this.field4347[13] * this.field4347[2] * this.field4347[11] - this.field4347[14] * this.field4347[3] * this.field4347[9])); // L: 252
		float var4 = var1 * (this.field4347[13] * this.field4347[2] * this.field4347[7] + (this.field4347[6] * this.field4347[1] * this.field4347[15] - this.field4347[1] * this.field4347[7] * this.field4347[14] - this.field4347[15] * this.field4347[5] * this.field4347[2]) + this.field4347[5] * this.field4347[3] * this.field4347[14] - this.field4347[3] * this.field4347[6] * this.field4347[13]); // L: 253
		float var5 = (this.field4347[9] * this.field4347[6] * this.field4347[3] + (this.field4347[10] * this.field4347[1] * this.field4347[7] + this.field4347[6] * -this.field4347[1] * this.field4347[11] + this.field4347[2] * this.field4347[5] * this.field4347[11] - this.field4347[9] * this.field4347[2] * this.field4347[7] - this.field4347[3] * this.field4347[5] * this.field4347[10])) * var1; // L: 254
		float var6 = (this.field4347[7] * this.field4347[10] * this.field4347[12] + (this.field4347[14] * this.field4347[11] * this.field4347[4] + this.field4347[15] * -this.field4347[4] * this.field4347[10] + this.field4347[8] * this.field4347[6] * this.field4347[15] - this.field4347[6] * this.field4347[11] * this.field4347[12] - this.field4347[14] * this.field4347[7] * this.field4347[8])) * var1; // L: 255
		float var7 = (this.field4347[3] * this.field4347[8] * this.field4347[14] + this.field4347[12] * this.field4347[11] * this.field4347[2] + (this.field4347[15] * this.field4347[0] * this.field4347[10] - this.field4347[11] * this.field4347[0] * this.field4347[14] - this.field4347[15] * this.field4347[2] * this.field4347[8]) - this.field4347[12] * this.field4347[3] * this.field4347[10]) * var1; // L: 256
		float var8 = var1 * (this.field4347[15] * this.field4347[2] * this.field4347[4] + -this.field4347[0] * this.field4347[6] * this.field4347[15] + this.field4347[14] * this.field4347[7] * this.field4347[0] - this.field4347[12] * this.field4347[2] * this.field4347[7] - this.field4347[14] * this.field4347[3] * this.field4347[4] + this.field4347[6] * this.field4347[3] * this.field4347[12]); // L: 257
		float var9 = var1 * (this.field4347[2] * this.field4347[7] * this.field4347[8] + (this.field4347[11] * this.field4347[0] * this.field4347[6] - this.field4347[7] * this.field4347[0] * this.field4347[10] - this.field4347[11] * this.field4347[2] * this.field4347[4]) + this.field4347[3] * this.field4347[4] * this.field4347[10] - this.field4347[8] * this.field4347[6] * this.field4347[3]); // L: 258
		float var10 = var1 * (this.field4347[12] * this.field4347[11] * this.field4347[5] + (this.field4347[4] * this.field4347[9] * this.field4347[15] - this.field4347[4] * this.field4347[11] * this.field4347[13] - this.field4347[15] * this.field4347[5] * this.field4347[8]) + this.field4347[7] * this.field4347[8] * this.field4347[13] - this.field4347[12] * this.field4347[9] * this.field4347[7]); // L: 259
		float var11 = var1 * (this.field4347[0] * this.field4347[11] * this.field4347[13] + this.field4347[9] * -this.field4347[0] * this.field4347[15] + this.field4347[15] * this.field4347[8] * this.field4347[1] - this.field4347[12] * this.field4347[11] * this.field4347[1] - this.field4347[13] * this.field4347[3] * this.field4347[8] + this.field4347[12] * this.field4347[9] * this.field4347[3]); // L: 260
		float var12 = var1 * (this.field4347[4] * this.field4347[3] * this.field4347[13] + this.field4347[15] * this.field4347[5] * this.field4347[0] - this.field4347[0] * this.field4347[7] * this.field4347[13] - this.field4347[4] * this.field4347[1] * this.field4347[15] + this.field4347[12] * this.field4347[7] * this.field4347[1] - this.field4347[12] * this.field4347[3] * this.field4347[5]); // L: 261
		float var13 = var1 * (this.field4347[8] * this.field4347[5] * this.field4347[3] + (-this.field4347[0] * this.field4347[5] * this.field4347[11] + this.field4347[7] * this.field4347[0] * this.field4347[9] + this.field4347[1] * this.field4347[4] * this.field4347[11] - this.field4347[8] * this.field4347[1] * this.field4347[7] - this.field4347[9] * this.field4347[4] * this.field4347[3])); // L: 262
		float var14 = var1 * (this.field4347[13] * this.field4347[4] * this.field4347[10] + -this.field4347[4] * this.field4347[9] * this.field4347[14] + this.field4347[14] * this.field4347[8] * this.field4347[5] - this.field4347[5] * this.field4347[10] * this.field4347[12] - this.field4347[13] * this.field4347[8] * this.field4347[6] + this.field4347[12] * this.field4347[9] * this.field4347[6]); // L: 263
		float var15 = var1 * (this.field4347[13] * this.field4347[8] * this.field4347[2] + this.field4347[14] * this.field4347[0] * this.field4347[9] - this.field4347[10] * this.field4347[0] * this.field4347[13] - this.field4347[8] * this.field4347[1] * this.field4347[14] + this.field4347[12] * this.field4347[10] * this.field4347[1] - this.field4347[12] * this.field4347[9] * this.field4347[2]); // L: 264
		float var16 = var1 * (-this.field4347[0] * this.field4347[5] * this.field4347[14] + this.field4347[13] * this.field4347[6] * this.field4347[0] + this.field4347[14] * this.field4347[4] * this.field4347[1] - this.field4347[1] * this.field4347[6] * this.field4347[12] - this.field4347[2] * this.field4347[4] * this.field4347[13] + this.field4347[2] * this.field4347[5] * this.field4347[12]); // L: 265
		float var17 = var1 * (this.field4347[2] * this.field4347[4] * this.field4347[9] + this.field4347[10] * this.field4347[0] * this.field4347[5] - this.field4347[9] * this.field4347[0] * this.field4347[6] - this.field4347[10] * this.field4347[1] * this.field4347[4] + this.field4347[8] * this.field4347[6] * this.field4347[1] - this.field4347[5] * this.field4347[2] * this.field4347[8]); // L: 266
		this.field4347[0] = var2; // L: 267
		this.field4347[1] = var3; // L: 268
		this.field4347[2] = var4; // L: 269
		this.field4347[3] = var5; // L: 270
		this.field4347[4] = var6; // L: 271
		this.field4347[5] = var7; // L: 272
		this.field4347[6] = var8; // L: 273
		this.field4347[7] = var9; // L: 274
		this.field4347[8] = var10; // L: 275
		this.field4347[9] = var11; // L: 276
		this.field4347[10] = var12; // L: 277
		this.field4347[11] = var13; // L: 278
		this.field4347[12] = var14; // L: 279
		this.field4347[13] = var15; // L: 280
		this.field4347[14] = var16; // L: 281
		this.field4347[15] = var17; // L: 282
	} // L: 283

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "100"
	)
	public float[] method7074() {
		float[] var1 = new float[3]; // L: 320
		class385 var2 = new class385(this.field4347[0], this.field4347[1], this.field4347[2]); // L: 321
		class385 var3 = new class385(this.field4347[4], this.field4347[5], this.field4347[6]); // L: 322
		class385 var4 = new class385(this.field4347[8], this.field4347[9], this.field4347[10]); // L: 323
		var1[0] = var2.method7026(); // L: 324
		var1[1] = var3.method7026(); // L: 325
		var1[2] = var4.method7026(); // L: 326
		return var1; // L: 327
	}

	public int hashCode() {
		boolean var1 = true; // L: 305
		byte var2 = 1; // L: 306
		int var3 = var2 * 31 + Arrays.hashCode(this.field4347); // L: 307
		return var3; // L: 308
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 288
		this.method7072(); // L: 289
		this.method7086(); // L: 290

		for (int var2 = 0; var2 < 4; ++var2) { // L: 291
			for (int var3 = 0; var3 < 4; ++var3) { // L: 292
				if (var3 > 0) {
					var1.append("\t"); // L: 293
				}

				float var4 = this.field4347[var3 + var2 * 4]; // L: 294
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 295
					var4 = 0.0F;
				}

				var1.append(var4); // L: 296
			}

			var1.append("\n"); // L: 298
		}

		return var1.toString(); // L: 300
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class387)) { // L: 313
			return false;
		} else {
			class387 var2 = (class387)var1; // L: 314

			for (int var3 = 0; var3 < 16; ++var3) { // L: 315
				if (var2.field4347[var3] != this.field4347[var3]) {
					return false;
				}
			}

			return true; // L: 316
		}
	}
}
