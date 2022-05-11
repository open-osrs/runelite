import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public final class class388 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lnw;"
	)
	static class388[] field4402;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -96166557
	)
	static int field4401;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	public static final class388 field4403;
	@ObfuscatedName("a")
	public float[] field4400;

	static {
		field4402 = new class388[0]; // L: 9
		MilliClock.method3219(100); // L: 14
		field4403 = new class388(); // L: 18
	}

	public class388() {
		this.field4400 = new float[16];
		this.method6861(); // L: 43
	} // L: 44

	@ObfuscatedSignature(
		descriptor = "(Lnw;)V"
	)
	public class388(class388 var1) {
		this.field4400 = new float[16];
		this.method6868(var1); // L: 47
	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(Lpx;Z)V"
	)
	public class388(Buffer var1, boolean var2) {
		this.field4400 = new float[16]; // L: 17
		this.method6808(var1, var2); // L: 51
	} // L: 52

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-830138790"
	)
	public void method6865() {
		synchronized(field4402) { // L: 37
			if (field4401 < GrandExchangeOfferTotalQuantityComparator.field4069 - 1) { // L: 38
				field4402[++field4401 - 1] = this;
			}

		}
	} // L: 40

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpx;ZI)V",
		garbageValue = "-1065467020"
	)
	void method6808(Buffer var1, boolean var2) {
		if (var2) { // L: 55
			class389 var4 = new class389(); // L: 56
			var4.method6877(ByteArrayPool.method6364(var1.readShort())); // L: 57
			var4.method6878(ByteArrayPool.method6364(var1.readShort())); // L: 58
			var4.method6879(ByteArrayPool.method6364(var1.readShort())); // L: 59
			var4.method6887((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 60
			this.method6812(var4); // L: 61
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 64
				this.field4400[var3] = var1.method7570(); // L: 65
			}
		}

	} // L: 68

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "817063007"
	)
	float[] method6809() {
		float[] var1 = new float[3]; // L: 71
		if ((double)this.field4400[2] < 0.999D && (double)this.field4400[2] > -0.999D) { // L: 72
			var1[1] = (float)(-Math.asin((double)this.field4400[2])); // L: 73
			double var2 = Math.cos((double)var1[1]); // L: 74
			var1[0] = (float)Math.atan2((double)this.field4400[6] / var2, (double)this.field4400[10] / var2); // L: 75
			var1[2] = (float)Math.atan2((double)this.field4400[1] / var2, (double)this.field4400[0] / var2); // L: 76
		} else {
			var1[0] = 0.0F; // L: 79
			var1[1] = (float)Math.atan2((double)this.field4400[2], 0.0D); // L: 80
			var1[2] = (float)Math.atan2((double)(-this.field4400[9]), (double)this.field4400[5]); // L: 81
		}

		return var1; // L: 83
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "796221265"
	)
	public float[] method6810() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4400[6])), 0.0F, 0.0F}; // L: 87 88
		double var2 = Math.cos((double)var1[0]); // L: 89
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 90
			var4 = (double)this.field4400[2]; // L: 91
			var6 = (double)this.field4400[10]; // L: 92
			double var8 = (double)this.field4400[4]; // L: 93
			double var10 = (double)this.field4400[5]; // L: 94
			var1[1] = (float)Math.atan2(var4, var6); // L: 95
			var1[2] = (float)Math.atan2(var8, var10); // L: 96
		} else {
			var4 = (double)this.field4400[1]; // L: 99
			var6 = (double)this.field4400[0]; // L: 100
			if (this.field4400[6] < 0.0F) { // L: 101
				var1[1] = (float)Math.atan2(var4, var6); // L: 102
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 105
			}

			var1[2] = 0.0F; // L: 107
		}

		return var1; // L: 109
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1318194285"
	)
	void method6861() {
		this.field4400[0] = 1.0F; // L: 113
		this.field4400[1] = 0.0F; // L: 114
		this.field4400[2] = 0.0F; // L: 115
		this.field4400[3] = 0.0F; // L: 116
		this.field4400[4] = 0.0F; // L: 117
		this.field4400[5] = 1.0F; // L: 118
		this.field4400[6] = 0.0F; // L: 119
		this.field4400[7] = 0.0F; // L: 120
		this.field4400[8] = 0.0F; // L: 121
		this.field4400[9] = 0.0F; // L: 122
		this.field4400[10] = 1.0F; // L: 123
		this.field4400[11] = 0.0F; // L: 124
		this.field4400[12] = 0.0F; // L: 125
		this.field4400[13] = 0.0F; // L: 126
		this.field4400[14] = 0.0F; // L: 127
		this.field4400[15] = 1.0F; // L: 128
	} // L: 129

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2033689784"
	)
	public void method6829() {
		this.field4400[0] = 0.0F; // L: 132
		this.field4400[1] = 0.0F; // L: 133
		this.field4400[2] = 0.0F; // L: 134
		this.field4400[3] = 0.0F; // L: 135
		this.field4400[4] = 0.0F; // L: 136
		this.field4400[5] = 0.0F; // L: 137
		this.field4400[6] = 0.0F; // L: 138
		this.field4400[7] = 0.0F; // L: 139
		this.field4400[8] = 0.0F; // L: 140
		this.field4400[9] = 0.0F; // L: 141
		this.field4400[10] = 0.0F; // L: 142
		this.field4400[11] = 0.0F; // L: 143
		this.field4400[12] = 0.0F; // L: 144
		this.field4400[13] = 0.0F; // L: 145
		this.field4400[14] = 0.0F; // L: 146
		this.field4400[15] = 0.0F; // L: 147
	} // L: 148

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnw;B)V",
		garbageValue = "37"
	)
	public void method6868(class388 var1) {
		System.arraycopy(var1.field4400, 0, this.field4400, 0, 16); // L: 151
	} // L: 152

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "114"
	)
	public void method6806(float var1) {
		this.method6814(var1, var1, var1); // L: 155
	} // L: 156

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "627006193"
	)
	public void method6814(float var1, float var2, float var3) {
		this.method6861(); // L: 159
		this.field4400[0] = var1; // L: 160
		this.field4400[5] = var2; // L: 161
		this.field4400[10] = var3; // L: 162
	} // L: 163

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I)V",
		garbageValue = "-1672549450"
	)
	public void method6815(class388 var1) {
		for (int var2 = 0; var2 < this.field4400.length; ++var2) { // L: 166
			float[] var10000 = this.field4400; // L: 167
			var10000[var2] += var1.field4400[var2];
		}

	} // L: 169

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnw;B)V",
		garbageValue = "0"
	)
	public void method6816(class388 var1) {
		float var2 = var1.field4400[8] * this.field4400[2] + var1.field4400[4] * this.field4400[1] + var1.field4400[0] * this.field4400[0] + this.field4400[3] * var1.field4400[12]; // L: 172
		float var3 = this.field4400[1] * var1.field4400[5] + var1.field4400[1] * this.field4400[0] + var1.field4400[9] * this.field4400[2] + var1.field4400[13] * this.field4400[3]; // L: 173
		float var4 = this.field4400[2] * var1.field4400[10] + this.field4400[1] * var1.field4400[6] + var1.field4400[2] * this.field4400[0] + this.field4400[3] * var1.field4400[14]; // L: 174
		float var5 = this.field4400[3] * var1.field4400[15] + var1.field4400[11] * this.field4400[2] + var1.field4400[3] * this.field4400[0] + this.field4400[1] * var1.field4400[7]; // L: 175
		float var6 = this.field4400[7] * var1.field4400[12] + this.field4400[4] * var1.field4400[0] + var1.field4400[4] * this.field4400[5] + this.field4400[6] * var1.field4400[8]; // L: 176
		float var7 = var1.field4400[1] * this.field4400[4] + var1.field4400[5] * this.field4400[5] + var1.field4400[9] * this.field4400[6] + var1.field4400[13] * this.field4400[7]; // L: 177
		float var8 = this.field4400[6] * var1.field4400[10] + this.field4400[4] * var1.field4400[2] + var1.field4400[6] * this.field4400[5] + this.field4400[7] * var1.field4400[14]; // L: 178
		float var9 = this.field4400[4] * var1.field4400[3] + this.field4400[5] * var1.field4400[7] + this.field4400[6] * var1.field4400[11] + this.field4400[7] * var1.field4400[15]; // L: 179
		float var10 = this.field4400[9] * var1.field4400[4] + var1.field4400[0] * this.field4400[8] + var1.field4400[8] * this.field4400[10] + this.field4400[11] * var1.field4400[12]; // L: 180
		float var11 = var1.field4400[1] * this.field4400[8] + var1.field4400[5] * this.field4400[9] + this.field4400[10] * var1.field4400[9] + var1.field4400[13] * this.field4400[11]; // L: 181
		float var12 = var1.field4400[14] * this.field4400[11] + var1.field4400[6] * this.field4400[9] + var1.field4400[2] * this.field4400[8] + var1.field4400[10] * this.field4400[10]; // L: 182
		float var13 = var1.field4400[15] * this.field4400[11] + var1.field4400[11] * this.field4400[10] + var1.field4400[7] * this.field4400[9] + this.field4400[8] * var1.field4400[3]; // L: 183
		float var14 = var1.field4400[8] * this.field4400[14] + this.field4400[13] * var1.field4400[4] + var1.field4400[0] * this.field4400[12] + var1.field4400[12] * this.field4400[15]; // L: 184
		float var15 = var1.field4400[13] * this.field4400[15] + var1.field4400[9] * this.field4400[14] + this.field4400[13] * var1.field4400[5] + var1.field4400[1] * this.field4400[12]; // L: 185
		float var16 = this.field4400[13] * var1.field4400[6] + this.field4400[12] * var1.field4400[2] + this.field4400[14] * var1.field4400[10] + this.field4400[15] * var1.field4400[14]; // L: 186
		float var17 = this.field4400[12] * var1.field4400[3] + var1.field4400[7] * this.field4400[13] + this.field4400[14] * var1.field4400[11] + var1.field4400[15] * this.field4400[15]; // L: 187
		this.field4400[0] = var2; // L: 188
		this.field4400[1] = var3; // L: 189
		this.field4400[2] = var4; // L: 190
		this.field4400[3] = var5; // L: 191
		this.field4400[4] = var6; // L: 192
		this.field4400[5] = var7; // L: 193
		this.field4400[6] = var8; // L: 194
		this.field4400[7] = var9; // L: 195
		this.field4400[8] = var10; // L: 196
		this.field4400[9] = var11; // L: 197
		this.field4400[10] = var12; // L: 198
		this.field4400[11] = var13; // L: 199
		this.field4400[12] = var14; // L: 200
		this.field4400[13] = var15; // L: 201
		this.field4400[14] = var16; // L: 202
		this.field4400[15] = var17; // L: 203
	} // L: 204

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)V",
		garbageValue = "74712963"
	)
	public void method6817(class387 var1) {
		float var2 = var1.field4397 * var1.field4397; // L: 207
		float var3 = var1.field4393 * var1.field4397; // L: 208
		float var4 = var1.field4397 * var1.field4394; // L: 209
		float var5 = var1.field4396 * var1.field4397; // L: 210
		float var6 = var1.field4393 * var1.field4393; // L: 211
		float var7 = var1.field4394 * var1.field4393; // L: 212
		float var8 = var1.field4396 * var1.field4393; // L: 213
		float var9 = var1.field4394 * var1.field4394; // L: 214
		float var10 = var1.field4394 * var1.field4396; // L: 215
		float var11 = var1.field4396 * var1.field4396; // L: 216
		this.field4400[0] = var2 + var6 - var11 - var9; // L: 217
		this.field4400[1] = var7 + var5 + var7 + var5; // L: 218
		this.field4400[2] = var8 - var4 - var4 + var8; // L: 219
		this.field4400[4] = var7 + (var7 - var5 - var5); // L: 220
		this.field4400[5] = var9 + var2 - var6 - var11; // L: 221
		this.field4400[6] = var10 + var3 + var10 + var3; // L: 222
		this.field4400[8] = var4 + var8 + var4 + var8; // L: 223
		this.field4400[9] = var10 + (var10 - var3 - var3); // L: 224
		this.field4400[10] = var2 + var11 - var9 - var6; // L: 225
	} // L: 226

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-51279559"
	)
	void method6812(class389 var1) {
		this.field4400[0] = var1.field4410; // L: 229
		this.field4400[1] = var1.field4405; // L: 230
		this.field4400[2] = var1.field4406; // L: 231
		this.field4400[3] = 0.0F; // L: 232
		this.field4400[4] = var1.field4407; // L: 233
		this.field4400[5] = var1.field4409; // L: 234
		this.field4400[6] = var1.field4412; // L: 235
		this.field4400[7] = 0.0F; // L: 236
		this.field4400[8] = var1.field4413; // L: 237
		this.field4400[9] = var1.field4411; // L: 238
		this.field4400[10] = var1.field4404; // L: 239
		this.field4400[11] = 0.0F; // L: 240
		this.field4400[12] = var1.field4408; // L: 241
		this.field4400[13] = var1.field4414; // L: 242
		this.field4400[14] = var1.field4415; // L: 243
		this.field4400[15] = 1.0F; // L: 244
	} // L: 245

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1576396889"
	)
	float method6819() {
		return this.field4400[12] * this.field4400[9] * this.field4400[6] * this.field4400[3] + (this.field4400[5] * this.field4400[3] * this.field4400[8] * this.field4400[14] + this.field4400[13] * this.field4400[4] * this.field4400[3] * this.field4400[10] + (this.field4400[13] * this.field4400[8] * this.field4400[7] * this.field4400[2] + this.field4400[4] * this.field4400[2] * this.field4400[9] * this.field4400[15] + this.field4400[7] * this.field4400[1] * this.field4400[10] * this.field4400[12] + (this.field4400[8] * this.field4400[1] * this.field4400[6] * this.field4400[15] + this.field4400[14] * this.field4400[1] * this.field4400[4] * this.field4400[11] + (this.field4400[0] * this.field4400[5] * this.field4400[10] * this.field4400[15] - this.field4400[14] * this.field4400[0] * this.field4400[5] * this.field4400[11] - this.field4400[15] * this.field4400[0] * this.field4400[6] * this.field4400[9] + this.field4400[0] * this.field4400[6] * this.field4400[11] * this.field4400[13] + this.field4400[9] * this.field4400[7] * this.field4400[0] * this.field4400[14] - this.field4400[13] * this.field4400[7] * this.field4400[0] * this.field4400[10] - this.field4400[15] * this.field4400[1] * this.field4400[4] * this.field4400[10]) - this.field4400[12] * this.field4400[6] * this.field4400[1] * this.field4400[11] - this.field4400[7] * this.field4400[1] * this.field4400[8] * this.field4400[14]) - this.field4400[13] * this.field4400[4] * this.field4400[2] * this.field4400[11] - this.field4400[15] * this.field4400[2] * this.field4400[5] * this.field4400[8] + this.field4400[12] * this.field4400[11] * this.field4400[2] * this.field4400[5] - this.field4400[9] * this.field4400[2] * this.field4400[7] * this.field4400[12] - this.field4400[14] * this.field4400[9] * this.field4400[3] * this.field4400[4]) - this.field4400[12] * this.field4400[3] * this.field4400[5] * this.field4400[10] - this.field4400[6] * this.field4400[3] * this.field4400[8] * this.field4400[13]); // L: 248
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "122973203"
	)
	public void method6820() {
		float var1 = 1.0F / this.method6819(); // L: 252
		float var2 = (this.field4400[15] * this.field4400[10] * this.field4400[5] - this.field4400[11] * this.field4400[5] * this.field4400[14] - this.field4400[15] * this.field4400[6] * this.field4400[9] + this.field4400[13] * this.field4400[6] * this.field4400[11] + this.field4400[14] * this.field4400[7] * this.field4400[9] - this.field4400[7] * this.field4400[10] * this.field4400[13]) * var1; // L: 253
		float var3 = var1 * (this.field4400[13] * this.field4400[10] * this.field4400[3] + (this.field4400[1] * this.field4400[11] * this.field4400[14] + this.field4400[15] * this.field4400[10] * -this.field4400[1] + this.field4400[2] * this.field4400[9] * this.field4400[15] - this.field4400[11] * this.field4400[2] * this.field4400[13] - this.field4400[9] * this.field4400[3] * this.field4400[14])); // L: 254
		float var4 = var1 * (this.field4400[14] * this.field4400[5] * this.field4400[3] + this.field4400[2] * this.field4400[7] * this.field4400[13] + (this.field4400[6] * this.field4400[1] * this.field4400[15] - this.field4400[14] * this.field4400[7] * this.field4400[1] - this.field4400[15] * this.field4400[2] * this.field4400[5]) - this.field4400[13] * this.field4400[3] * this.field4400[6]); // L: 255
		float var5 = var1 * (this.field4400[11] * -this.field4400[1] * this.field4400[6] + this.field4400[10] * this.field4400[7] * this.field4400[1] + this.field4400[11] * this.field4400[5] * this.field4400[2] - this.field4400[7] * this.field4400[2] * this.field4400[9] - this.field4400[10] * this.field4400[3] * this.field4400[5] + this.field4400[6] * this.field4400[3] * this.field4400[9]); // L: 256
		float var6 = var1 * (this.field4400[15] * this.field4400[8] * this.field4400[6] + this.field4400[14] * this.field4400[11] * this.field4400[4] + this.field4400[10] * -this.field4400[4] * this.field4400[15] - this.field4400[11] * this.field4400[6] * this.field4400[12] - this.field4400[8] * this.field4400[7] * this.field4400[14] + this.field4400[12] * this.field4400[10] * this.field4400[7]); // L: 257
		float var7 = (this.field4400[8] * this.field4400[3] * this.field4400[14] + this.field4400[11] * this.field4400[2] * this.field4400[12] + (this.field4400[15] * this.field4400[0] * this.field4400[10] - this.field4400[14] * this.field4400[0] * this.field4400[11] - this.field4400[15] * this.field4400[2] * this.field4400[8]) - this.field4400[12] * this.field4400[3] * this.field4400[10]) * var1; // L: 258
		float var8 = var1 * (this.field4400[6] * this.field4400[3] * this.field4400[12] + (this.field4400[15] * -this.field4400[0] * this.field4400[6] + this.field4400[7] * this.field4400[0] * this.field4400[14] + this.field4400[15] * this.field4400[4] * this.field4400[2] - this.field4400[12] * this.field4400[7] * this.field4400[2] - this.field4400[14] * this.field4400[3] * this.field4400[4])); // L: 259
		float var9 = var1 * (this.field4400[11] * this.field4400[6] * this.field4400[0] - this.field4400[10] * this.field4400[7] * this.field4400[0] - this.field4400[2] * this.field4400[4] * this.field4400[11] + this.field4400[2] * this.field4400[7] * this.field4400[8] + this.field4400[4] * this.field4400[3] * this.field4400[10] - this.field4400[6] * this.field4400[3] * this.field4400[8]); // L: 260
		float var10 = (this.field4400[11] * this.field4400[5] * this.field4400[12] + (this.field4400[15] * this.field4400[4] * this.field4400[9] - this.field4400[13] * this.field4400[4] * this.field4400[11] - this.field4400[8] * this.field4400[5] * this.field4400[15]) + this.field4400[8] * this.field4400[7] * this.field4400[13] - this.field4400[12] * this.field4400[9] * this.field4400[7]) * var1; // L: 261
		float var11 = (this.field4400[9] * this.field4400[3] * this.field4400[12] + (this.field4400[11] * this.field4400[0] * this.field4400[13] + this.field4400[9] * -this.field4400[0] * this.field4400[15] + this.field4400[8] * this.field4400[1] * this.field4400[15] - this.field4400[12] * this.field4400[11] * this.field4400[1] - this.field4400[3] * this.field4400[8] * this.field4400[13])) * var1; // L: 262
		float var12 = var1 * (this.field4400[15] * this.field4400[5] * this.field4400[0] - this.field4400[0] * this.field4400[7] * this.field4400[13] - this.field4400[1] * this.field4400[4] * this.field4400[15] + this.field4400[7] * this.field4400[1] * this.field4400[12] + this.field4400[13] * this.field4400[3] * this.field4400[4] - this.field4400[12] * this.field4400[3] * this.field4400[5]); // L: 263
		float var13 = var1 * (this.field4400[3] * this.field4400[5] * this.field4400[8] + (this.field4400[1] * this.field4400[4] * this.field4400[11] + this.field4400[7] * this.field4400[0] * this.field4400[9] + -this.field4400[0] * this.field4400[5] * this.field4400[11] - this.field4400[7] * this.field4400[1] * this.field4400[8] - this.field4400[9] * this.field4400[3] * this.field4400[4])); // L: 264
		float var14 = (this.field4400[10] * this.field4400[4] * this.field4400[13] + this.field4400[9] * -this.field4400[4] * this.field4400[14] + this.field4400[8] * this.field4400[5] * this.field4400[14] - this.field4400[5] * this.field4400[10] * this.field4400[12] - this.field4400[13] * this.field4400[8] * this.field4400[6] + this.field4400[12] * this.field4400[6] * this.field4400[9]) * var1; // L: 265
		float var15 = (this.field4400[14] * this.field4400[9] * this.field4400[0] - this.field4400[0] * this.field4400[10] * this.field4400[13] - this.field4400[1] * this.field4400[8] * this.field4400[14] + this.field4400[12] * this.field4400[1] * this.field4400[10] + this.field4400[8] * this.field4400[2] * this.field4400[13] - this.field4400[12] * this.field4400[9] * this.field4400[2]) * var1; // L: 266
		float var16 = (this.field4400[14] * this.field4400[4] * this.field4400[1] + this.field4400[14] * this.field4400[5] * -this.field4400[0] + this.field4400[13] * this.field4400[6] * this.field4400[0] - this.field4400[12] * this.field4400[1] * this.field4400[6] - this.field4400[13] * this.field4400[4] * this.field4400[2] + this.field4400[5] * this.field4400[2] * this.field4400[12]) * var1; // L: 267
		float var17 = (this.field4400[9] * this.field4400[2] * this.field4400[4] + this.field4400[5] * this.field4400[0] * this.field4400[10] - this.field4400[9] * this.field4400[0] * this.field4400[6] - this.field4400[1] * this.field4400[4] * this.field4400[10] + this.field4400[1] * this.field4400[6] * this.field4400[8] - this.field4400[8] * this.field4400[5] * this.field4400[2]) * var1; // L: 268
		this.field4400[0] = var2; // L: 269
		this.field4400[1] = var3; // L: 270
		this.field4400[2] = var4; // L: 271
		this.field4400[3] = var5; // L: 272
		this.field4400[4] = var6; // L: 273
		this.field4400[5] = var7; // L: 274
		this.field4400[6] = var8; // L: 275
		this.field4400[7] = var9; // L: 276
		this.field4400[8] = var10; // L: 277
		this.field4400[9] = var11; // L: 278
		this.field4400[10] = var12; // L: 279
		this.field4400[11] = var13; // L: 280
		this.field4400[12] = var14; // L: 281
		this.field4400[13] = var15; // L: 282
		this.field4400[14] = var16; // L: 283
		this.field4400[15] = var17; // L: 284
	} // L: 285

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "82"
	)
	public float[] method6821() {
		float[] var1 = new float[3]; // L: 322
		class386 var2 = new class386(this.field4400[0], this.field4400[1], this.field4400[2]); // L: 323
		class386 var3 = new class386(this.field4400[4], this.field4400[5], this.field4400[6]); // L: 324
		class386 var4 = new class386(this.field4400[8], this.field4400[9], this.field4400[10]); // L: 325
		var1[0] = var2.method6771(); // L: 326
		var1[1] = var3.method6771(); // L: 327
		var1[2] = var4.method6771(); // L: 328
		return var1; // L: 329
	}

	public int hashCode() {
		boolean var1 = true; // L: 307
		byte var2 = 1; // L: 308
		int var3 = 31 * var2 + Arrays.hashCode(this.field4400); // L: 309
		return var3; // L: 310
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 290
		this.method6810(); // L: 291
		this.method6809(); // L: 292

		for (int var2 = 0; var2 < 4; ++var2) { // L: 293
			for (int var3 = 0; var3 < 4; ++var3) { // L: 294
				if (var3 > 0) {
					var1.append("\t"); // L: 295
				}

				float var4 = this.field4400[var3 + var2 * 4]; // L: 296
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 297
					var4 = 0.0F;
				}

				var1.append(var4); // L: 298
			}

			var1.append("\n"); // L: 300
		}

		return var1.toString(); // L: 302
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class388)) { // L: 315
			return false;
		} else {
			class388 var2 = (class388)var1; // L: 316

			for (int var3 = 0; var3 < 16; ++var3) { // L: 317
				if (this.field4400[var3] != var2.field4400[var3]) {
					return false;
				}
			}

			return true; // L: 318
		}
	}
}
