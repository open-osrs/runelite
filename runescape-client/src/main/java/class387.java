import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public final class class387 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lnt;"
	)
	public static class387[] field4346;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	public static final class387 field4345;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 288254709
	)
	public static int field4347;
	@ObfuscatedName("n")
	public float[] field4348;

	static {
		field4346 = new class387[0]; // L: 9
		class250.method5112(100); // L: 14
		field4345 = new class387(); // L: 18
	}

	public class387() {
		this.field4348 = new float[16];
		this.method7011(); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	public class387(class387 var1) {
		this.field4348 = new float[16];
		this.method7032(var1); // L: 37
	} // L: 38

	@ObfuscatedSignature(
		descriptor = "(Lpi;Z)V"
	)
	public class387(Buffer var1, boolean var2) {
		this.field4348 = new float[16]; // L: 17
		this.method7014(var1, var2); // L: 41
	} // L: 42

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	public void method7029() {
		synchronized(field4346) { // L: 27
			if (field4347 < class356.field4185 - 1) { // L: 28
				field4346[++field4347 - 1] = this;
			}

		}
	} // L: 30

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;ZB)V",
		garbageValue = "-26"
	)
	void method7014(Buffer var1, boolean var2) {
		if (var2) { // L: 45
			class388 var13 = new class388(); // L: 46
			int var6 = var1.readShort(); // L: 49
			var6 &= 16383; // L: 51
			float var5 = (float)(6.283185307179586D * (double)((float)var6 / 16384.0F)); // L: 52
			var13.method7078(var5); // L: 54
			int var9 = var1.readShort(); // L: 57
			var9 &= 16383; // L: 59
			float var8 = (float)(6.283185307179586D * (double)((float)var9 / 16384.0F)); // L: 60
			var13.method7083(var8); // L: 62
			int var12 = var1.readShort(); // L: 65
			var12 &= 16383; // L: 67
			float var11 = (float)(6.283185307179586D * (double)((float)var12 / 16384.0F)); // L: 68
			var13.method7082(var11); // L: 70
			var13.method7091((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 71
			this.method7012(var13); // L: 72
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 75
				this.field4348[var3] = var1.method7681(); // L: 76
			}
		}

	} // L: 79

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "426109978"
	)
	float[] method7009() {
		float[] var1 = new float[3]; // L: 82
		if ((double)this.field4348[2] < 0.999D && (double)this.field4348[2] > -0.999D) { // L: 83
			var1[1] = (float)(-Math.asin((double)this.field4348[2])); // L: 84
			double var2 = Math.cos((double)var1[1]); // L: 85
			var1[0] = (float)Math.atan2((double)this.field4348[6] / var2, (double)this.field4348[10] / var2); // L: 86
			var1[2] = (float)Math.atan2((double)this.field4348[1] / var2, (double)this.field4348[0] / var2); // L: 87
		} else {
			var1[0] = 0.0F; // L: 90
			var1[1] = (float)Math.atan2((double)this.field4348[2], 0.0D); // L: 91
			var1[2] = (float)Math.atan2((double)(-this.field4348[9]), (double)this.field4348[5]); // L: 92
		}

		return var1; // L: 94
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1375072290"
	)
	public float[] method7010() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4348[6])), 0.0F, 0.0F}; // L: 98 99
		double var2 = Math.cos((double)var1[0]); // L: 100
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 101
			var4 = (double)this.field4348[2]; // L: 102
			var6 = (double)this.field4348[10]; // L: 103
			double var8 = (double)this.field4348[4]; // L: 104
			double var10 = (double)this.field4348[5]; // L: 105
			var1[1] = (float)Math.atan2(var4, var6); // L: 106
			var1[2] = (float)Math.atan2(var8, var10); // L: 107
		} else {
			var4 = (double)this.field4348[1]; // L: 110
			var6 = (double)this.field4348[0]; // L: 111
			if (this.field4348[6] < 0.0F) { // L: 112
				var1[1] = (float)Math.atan2(var4, var6); // L: 113
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 116
			}

			var1[2] = 0.0F; // L: 118
		}

		return var1; // L: 120
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1674890086"
	)
	public void method7011() {
		this.field4348[0] = 1.0F; // L: 124
		this.field4348[1] = 0.0F; // L: 125
		this.field4348[2] = 0.0F; // L: 126
		this.field4348[3] = 0.0F; // L: 127
		this.field4348[4] = 0.0F; // L: 128
		this.field4348[5] = 1.0F; // L: 129
		this.field4348[6] = 0.0F; // L: 130
		this.field4348[7] = 0.0F; // L: 131
		this.field4348[8] = 0.0F; // L: 132
		this.field4348[9] = 0.0F; // L: 133
		this.field4348[10] = 1.0F; // L: 134
		this.field4348[11] = 0.0F; // L: 135
		this.field4348[12] = 0.0F; // L: 136
		this.field4348[13] = 0.0F; // L: 137
		this.field4348[14] = 0.0F; // L: 138
		this.field4348[15] = 1.0F; // L: 139
	} // L: 140

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "39"
	)
	public void method7064() {
		this.field4348[0] = 0.0F; // L: 143
		this.field4348[1] = 0.0F; // L: 144
		this.field4348[2] = 0.0F; // L: 145
		this.field4348[3] = 0.0F; // L: 146
		this.field4348[4] = 0.0F; // L: 147
		this.field4348[5] = 0.0F; // L: 148
		this.field4348[6] = 0.0F; // L: 149
		this.field4348[7] = 0.0F; // L: 150
		this.field4348[8] = 0.0F; // L: 151
		this.field4348[9] = 0.0F; // L: 152
		this.field4348[10] = 0.0F; // L: 153
		this.field4348[11] = 0.0F; // L: 154
		this.field4348[12] = 0.0F; // L: 155
		this.field4348[13] = 0.0F; // L: 156
		this.field4348[14] = 0.0F; // L: 157
		this.field4348[15] = 0.0F; // L: 158
	} // L: 159

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1612769001"
	)
	public void method7032(class387 var1) {
		System.arraycopy(var1.field4348, 0, this.field4348, 0, 16); // L: 162
	} // L: 163

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1962810997"
	)
	public void method7043(float var1) {
		this.method7049(var1, var1, var1); // L: 166
	} // L: 167

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "-93"
	)
	public void method7049(float var1, float var2, float var3) {
		this.method7011(); // L: 170
		this.field4348[0] = var1; // L: 171
		this.field4348[5] = var2; // L: 172
		this.field4348[10] = var3; // L: 173
	} // L: 174

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-290385011"
	)
	public void method7016(class387 var1) {
		for (int var2 = 0; var2 < this.field4348.length; ++var2) { // L: 177
			float[] var10000 = this.field4348; // L: 178
			var10000[var2] += var1.field4348[var2];
		}

	} // L: 180

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1551118407"
	)
	public void method7017(class387 var1) {
		float var2 = var1.field4348[0] * this.field4348[0] + var1.field4348[4] * this.field4348[1] + this.field4348[2] * var1.field4348[8] + this.field4348[3] * var1.field4348[12]; // L: 183
		float var3 = var1.field4348[13] * this.field4348[3] + this.field4348[1] * var1.field4348[5] + this.field4348[0] * var1.field4348[1] + var1.field4348[9] * this.field4348[2]; // L: 184
		float var4 = var1.field4348[14] * this.field4348[3] + this.field4348[2] * var1.field4348[10] + this.field4348[0] * var1.field4348[2] + this.field4348[1] * var1.field4348[6]; // L: 185
		float var5 = var1.field4348[15] * this.field4348[3] + var1.field4348[7] * this.field4348[1] + this.field4348[0] * var1.field4348[3] + var1.field4348[11] * this.field4348[2]; // L: 186
		float var6 = this.field4348[6] * var1.field4348[8] + var1.field4348[0] * this.field4348[4] + var1.field4348[4] * this.field4348[5] + var1.field4348[12] * this.field4348[7]; // L: 187
		float var7 = this.field4348[6] * var1.field4348[9] + var1.field4348[5] * this.field4348[5] + var1.field4348[1] * this.field4348[4] + this.field4348[7] * var1.field4348[13]; // L: 188
		float var8 = this.field4348[7] * var1.field4348[14] + var1.field4348[2] * this.field4348[4] + var1.field4348[6] * this.field4348[5] + var1.field4348[10] * this.field4348[6]; // L: 189
		float var9 = var1.field4348[15] * this.field4348[7] + this.field4348[5] * var1.field4348[7] + this.field4348[4] * var1.field4348[3] + this.field4348[6] * var1.field4348[11]; // L: 190
		float var10 = var1.field4348[12] * this.field4348[11] + var1.field4348[8] * this.field4348[10] + var1.field4348[4] * this.field4348[9] + this.field4348[8] * var1.field4348[0]; // L: 191
		float var11 = this.field4348[11] * var1.field4348[13] + this.field4348[10] * var1.field4348[9] + this.field4348[8] * var1.field4348[1] + this.field4348[9] * var1.field4348[5]; // L: 192
		float var12 = this.field4348[10] * var1.field4348[10] + var1.field4348[6] * this.field4348[9] + this.field4348[8] * var1.field4348[2] + var1.field4348[14] * this.field4348[11]; // L: 193
		float var13 = this.field4348[10] * var1.field4348[11] + this.field4348[8] * var1.field4348[3] + var1.field4348[7] * this.field4348[9] + var1.field4348[15] * this.field4348[11]; // L: 194
		float var14 = var1.field4348[4] * this.field4348[13] + this.field4348[12] * var1.field4348[0] + this.field4348[14] * var1.field4348[8] + this.field4348[15] * var1.field4348[12]; // L: 195
		float var15 = var1.field4348[13] * this.field4348[15] + this.field4348[14] * var1.field4348[9] + var1.field4348[1] * this.field4348[12] + this.field4348[13] * var1.field4348[5]; // L: 196
		float var16 = var1.field4348[14] * this.field4348[15] + var1.field4348[10] * this.field4348[14] + var1.field4348[6] * this.field4348[13] + this.field4348[12] * var1.field4348[2]; // L: 197
		float var17 = var1.field4348[7] * this.field4348[13] + this.field4348[12] * var1.field4348[3] + var1.field4348[11] * this.field4348[14] + this.field4348[15] * var1.field4348[15]; // L: 198
		this.field4348[0] = var2; // L: 199
		this.field4348[1] = var3; // L: 200
		this.field4348[2] = var4; // L: 201
		this.field4348[3] = var5; // L: 202
		this.field4348[4] = var6; // L: 203
		this.field4348[5] = var7; // L: 204
		this.field4348[6] = var8; // L: 205
		this.field4348[7] = var9; // L: 206
		this.field4348[8] = var10; // L: 207
		this.field4348[9] = var11; // L: 208
		this.field4348[10] = var12; // L: 209
		this.field4348[11] = var13; // L: 210
		this.field4348[12] = var14; // L: 211
		this.field4348[13] = var15; // L: 212
		this.field4348[14] = var16; // L: 213
		this.field4348[15] = var17; // L: 214
	} // L: 215

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)V",
		garbageValue = "1080708844"
	)
	public void method7006(class386 var1) {
		float var2 = var1.field4343 * var1.field4343; // L: 218
		float var3 = var1.field4340 * var1.field4343; // L: 219
		float var4 = var1.field4341 * var1.field4343; // L: 220
		float var5 = var1.field4343 * var1.field4342; // L: 221
		float var6 = var1.field4340 * var1.field4340; // L: 222
		float var7 = var1.field4341 * var1.field4340; // L: 223
		float var8 = var1.field4340 * var1.field4342; // L: 224
		float var9 = var1.field4341 * var1.field4341; // L: 225
		float var10 = var1.field4341 * var1.field4342; // L: 226
		float var11 = var1.field4342 * var1.field4342; // L: 227
		this.field4348[0] = var2 + var6 - var11 - var9; // L: 228
		this.field4348[1] = var5 + var7 + var7 + var5; // L: 229
		this.field4348[2] = var8 - var4 - var4 + var8; // L: 230
		this.field4348[4] = var7 + (var7 - var5 - var5); // L: 231
		this.field4348[5] = var2 + var9 - var6 - var11; // L: 232
		this.field4348[6] = var3 + var10 + var10 + var3; // L: 233
		this.field4348[8] = var4 + var8 + var8 + var4; // L: 234
		this.field4348[9] = var10 + (var10 - var3 - var3); // L: 235
		this.field4348[10] = var2 + var11 - var9 - var6; // L: 236
	} // L: 237

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lnb;B)V",
		garbageValue = "-22"
	)
	void method7012(class388 var1) {
		this.field4348[0] = var1.field4355; // L: 240
		this.field4348[1] = var1.field4357; // L: 241
		this.field4348[2] = var1.field4353; // L: 242
		this.field4348[3] = 0.0F; // L: 243
		this.field4348[4] = var1.field4354; // L: 244
		this.field4348[5] = var1.field4352; // L: 245
		this.field4348[6] = var1.field4356; // L: 246
		this.field4348[7] = 0.0F; // L: 247
		this.field4348[8] = var1.field4351; // L: 248
		this.field4348[9] = var1.field4360; // L: 249
		this.field4348[10] = var1.field4359; // L: 250
		this.field4348[11] = 0.0F; // L: 251
		this.field4348[12] = var1.field4362; // L: 252
		this.field4348[13] = var1.field4361; // L: 253
		this.field4348[14] = var1.field4358; // L: 254
		this.field4348[15] = 1.0F; // L: 255
	} // L: 256

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "110"
	)
	float method7075() {
		return this.field4348[13] * this.field4348[8] * this.field4348[7] * this.field4348[2] + this.field4348[15] * this.field4348[9] * this.field4348[2] * this.field4348[4] + this.field4348[15] * this.field4348[8] * this.field4348[1] * this.field4348[6] + this.field4348[0] * this.field4348[7] * this.field4348[9] * this.field4348[14] + this.field4348[11] * this.field4348[0] * this.field4348[6] * this.field4348[13] + (this.field4348[15] * this.field4348[0] * this.field4348[5] * this.field4348[10] - this.field4348[5] * this.field4348[0] * this.field4348[11] * this.field4348[14] - this.field4348[15] * this.field4348[9] * this.field4348[6] * this.field4348[0]) - this.field4348[13] * this.field4348[10] * this.field4348[7] * this.field4348[0] - this.field4348[10] * this.field4348[1] * this.field4348[4] * this.field4348[15] + this.field4348[4] * this.field4348[1] * this.field4348[11] * this.field4348[14] - this.field4348[11] * this.field4348[6] * this.field4348[1] * this.field4348[12] - this.field4348[1] * this.field4348[7] * this.field4348[8] * this.field4348[14] + this.field4348[10] * this.field4348[7] * this.field4348[1] * this.field4348[12] - this.field4348[13] * this.field4348[11] * this.field4348[4] * this.field4348[2] - this.field4348[2] * this.field4348[5] * this.field4348[8] * this.field4348[15] + this.field4348[11] * this.field4348[5] * this.field4348[2] * this.field4348[12] - this.field4348[7] * this.field4348[2] * this.field4348[9] * this.field4348[12] - this.field4348[14] * this.field4348[4] * this.field4348[3] * this.field4348[9] + this.field4348[10] * this.field4348[4] * this.field4348[3] * this.field4348[13] + this.field4348[14] * this.field4348[8] * this.field4348[5] * this.field4348[3] - this.field4348[10] * this.field4348[5] * this.field4348[3] * this.field4348[12] - this.field4348[13] * this.field4348[6] * this.field4348[3] * this.field4348[8] + this.field4348[9] * this.field4348[6] * this.field4348[3] * this.field4348[12]; // L: 259
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1244640444"
	)
	public void method7021() {
		float var1 = 1.0F / this.method7075(); // L: 263
		float var2 = var1 * (this.field4348[10] * this.field4348[5] * this.field4348[15] - this.field4348[11] * this.field4348[5] * this.field4348[14] - this.field4348[15] * this.field4348[9] * this.field4348[6] + this.field4348[11] * this.field4348[6] * this.field4348[13] + this.field4348[14] * this.field4348[9] * this.field4348[7] - this.field4348[13] * this.field4348[7] * this.field4348[10]); // L: 264
		float var3 = (this.field4348[13] * this.field4348[10] * this.field4348[3] + (this.field4348[15] * -this.field4348[1] * this.field4348[10] + this.field4348[14] * this.field4348[11] * this.field4348[1] + this.field4348[2] * this.field4348[9] * this.field4348[15] - this.field4348[13] * this.field4348[11] * this.field4348[2] - this.field4348[3] * this.field4348[9] * this.field4348[14])) * var1; // L: 265
		float var4 = var1 * (this.field4348[5] * this.field4348[3] * this.field4348[14] + this.field4348[6] * this.field4348[1] * this.field4348[15] - this.field4348[14] * this.field4348[7] * this.field4348[1] - this.field4348[5] * this.field4348[2] * this.field4348[15] + this.field4348[13] * this.field4348[7] * this.field4348[2] - this.field4348[6] * this.field4348[3] * this.field4348[13]); // L: 266
		float var5 = (this.field4348[5] * this.field4348[2] * this.field4348[11] + -this.field4348[1] * this.field4348[6] * this.field4348[11] + this.field4348[10] * this.field4348[7] * this.field4348[1] - this.field4348[7] * this.field4348[2] * this.field4348[9] - this.field4348[10] * this.field4348[5] * this.field4348[3] + this.field4348[9] * this.field4348[3] * this.field4348[6]) * var1; // L: 267
		float var6 = (this.field4348[10] * this.field4348[7] * this.field4348[12] + (this.field4348[11] * this.field4348[4] * this.field4348[14] + -this.field4348[4] * this.field4348[10] * this.field4348[15] + this.field4348[15] * this.field4348[6] * this.field4348[8] - this.field4348[12] * this.field4348[6] * this.field4348[11] - this.field4348[14] * this.field4348[7] * this.field4348[8])) * var1; // L: 268
		float var7 = var1 * (this.field4348[14] * this.field4348[3] * this.field4348[8] + this.field4348[12] * this.field4348[2] * this.field4348[11] + (this.field4348[15] * this.field4348[0] * this.field4348[10] - this.field4348[11] * this.field4348[0] * this.field4348[14] - this.field4348[8] * this.field4348[2] * this.field4348[15]) - this.field4348[3] * this.field4348[10] * this.field4348[12]); // L: 269
		float var8 = (this.field4348[2] * this.field4348[4] * this.field4348[15] + this.field4348[14] * this.field4348[7] * this.field4348[0] + this.field4348[6] * -this.field4348[0] * this.field4348[15] - this.field4348[2] * this.field4348[7] * this.field4348[12] - this.field4348[14] * this.field4348[4] * this.field4348[3] + this.field4348[12] * this.field4348[3] * this.field4348[6]) * var1; // L: 270
		float var9 = var1 * (this.field4348[2] * this.field4348[7] * this.field4348[8] + (this.field4348[11] * this.field4348[0] * this.field4348[6] - this.field4348[0] * this.field4348[7] * this.field4348[10] - this.field4348[4] * this.field4348[2] * this.field4348[11]) + this.field4348[4] * this.field4348[3] * this.field4348[10] - this.field4348[6] * this.field4348[3] * this.field4348[8]); // L: 271
		float var10 = var1 * (this.field4348[7] * this.field4348[8] * this.field4348[13] + this.field4348[12] * this.field4348[5] * this.field4348[11] + (this.field4348[15] * this.field4348[4] * this.field4348[9] - this.field4348[13] * this.field4348[4] * this.field4348[11] - this.field4348[5] * this.field4348[8] * this.field4348[15]) - this.field4348[9] * this.field4348[7] * this.field4348[12]); // L: 272
		float var11 = var1 * (this.field4348[15] * this.field4348[8] * this.field4348[1] + this.field4348[13] * this.field4348[11] * this.field4348[0] + this.field4348[15] * -this.field4348[0] * this.field4348[9] - this.field4348[12] * this.field4348[1] * this.field4348[11] - this.field4348[8] * this.field4348[3] * this.field4348[13] + this.field4348[12] * this.field4348[9] * this.field4348[3]); // L: 273
		float var12 = var1 * (this.field4348[5] * this.field4348[0] * this.field4348[15] - this.field4348[13] * this.field4348[0] * this.field4348[7] - this.field4348[4] * this.field4348[1] * this.field4348[15] + this.field4348[12] * this.field4348[7] * this.field4348[1] + this.field4348[13] * this.field4348[3] * this.field4348[4] - this.field4348[5] * this.field4348[3] * this.field4348[12]); // L: 274
		float var13 = var1 * (this.field4348[8] * this.field4348[5] * this.field4348[3] + (this.field4348[4] * this.field4348[1] * this.field4348[11] + -this.field4348[0] * this.field4348[5] * this.field4348[11] + this.field4348[9] * this.field4348[0] * this.field4348[7] - this.field4348[1] * this.field4348[7] * this.field4348[8] - this.field4348[4] * this.field4348[3] * this.field4348[9])); // L: 275
		float var14 = (this.field4348[6] * this.field4348[9] * this.field4348[12] + (this.field4348[5] * this.field4348[8] * this.field4348[14] + this.field4348[13] * this.field4348[4] * this.field4348[10] + this.field4348[14] * -this.field4348[4] * this.field4348[9] - this.field4348[12] * this.field4348[10] * this.field4348[5] - this.field4348[8] * this.field4348[6] * this.field4348[13])) * var1; // L: 276
		float var15 = var1 * (this.field4348[0] * this.field4348[9] * this.field4348[14] - this.field4348[13] * this.field4348[0] * this.field4348[10] - this.field4348[8] * this.field4348[1] * this.field4348[14] + this.field4348[12] * this.field4348[1] * this.field4348[10] + this.field4348[13] * this.field4348[2] * this.field4348[8] - this.field4348[12] * this.field4348[2] * this.field4348[9]); // L: 277
		float var16 = var1 * (this.field4348[12] * this.field4348[5] * this.field4348[2] + (this.field4348[14] * -this.field4348[0] * this.field4348[5] + this.field4348[13] * this.field4348[6] * this.field4348[0] + this.field4348[4] * this.field4348[1] * this.field4348[14] - this.field4348[12] * this.field4348[6] * this.field4348[1] - this.field4348[2] * this.field4348[4] * this.field4348[13])); // L: 278
		float var17 = var1 * (this.field4348[9] * this.field4348[2] * this.field4348[4] + this.field4348[8] * this.field4348[6] * this.field4348[1] + (this.field4348[10] * this.field4348[5] * this.field4348[0] - this.field4348[0] * this.field4348[6] * this.field4348[9] - this.field4348[10] * this.field4348[1] * this.field4348[4]) - this.field4348[2] * this.field4348[5] * this.field4348[8]); // L: 279
		this.field4348[0] = var2; // L: 280
		this.field4348[1] = var3; // L: 281
		this.field4348[2] = var4; // L: 282
		this.field4348[3] = var5; // L: 283
		this.field4348[4] = var6; // L: 284
		this.field4348[5] = var7; // L: 285
		this.field4348[6] = var8; // L: 286
		this.field4348[7] = var9; // L: 287
		this.field4348[8] = var10; // L: 288
		this.field4348[9] = var11; // L: 289
		this.field4348[10] = var12; // L: 290
		this.field4348[11] = var13; // L: 291
		this.field4348[12] = var14; // L: 292
		this.field4348[13] = var15; // L: 293
		this.field4348[14] = var16; // L: 294
		this.field4348[15] = var17; // L: 295
	} // L: 296

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "926402902"
	)
	public float[] method7023() {
		float[] var1 = new float[3]; // L: 330
		class385 var2 = new class385(this.field4348[0], this.field4348[1], this.field4348[2]); // L: 331
		class385 var3 = new class385(this.field4348[4], this.field4348[5], this.field4348[6]); // L: 332
		class385 var4 = new class385(this.field4348[8], this.field4348[9], this.field4348[10]); // L: 333
		var1[0] = var2.method6973(); // L: 334
		var1[1] = var3.method6973(); // L: 335
		var1[2] = var4.method6973(); // L: 336
		return var1; // L: 337
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 300
		this.method7010(); // L: 301
		this.method7009(); // L: 302

		for (int var2 = 0; var2 < 4; ++var2) { // L: 303
			for (int var3 = 0; var3 < 4; ++var3) { // L: 304
				if (var3 > 0) {
					var1.append("\t"); // L: 305
				}

				float var4 = this.field4348[var3 + var2 * 4]; // L: 306
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 307
					var4 = 0.0F;
				}

				var1.append(var4); // L: 308
			}

			var1.append("\n"); // L: 310
		}

		return var1.toString(); // L: 312
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class387)) { // L: 323
			return false;
		} else {
			class387 var2 = (class387)var1; // L: 324

			for (int var3 = 0; var3 < 16; ++var3) { // L: 325
				if (this.field4348[var3] != var2.field4348[var3]) {
					return false;
				}
			}

			return true; // L: 326
		}
	}

	public int hashCode() {
		byte var2 = 1; // L: 317
		int var3 = var2 * 31 + Arrays.hashCode(this.field4348); // L: 318
		return var3; // L: 319
	}
}
