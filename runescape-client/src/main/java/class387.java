import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ny")
public final class class387 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	static class387[] field4393;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1126407779
	)
	static int field4396;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	public static final class387 field4397;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1178194851
	)
	static int field4395;
	@ObfuscatedName("e")
	public float[] field4394;

	static {
		field4393 = new class387[0]; // L: 9
		field4396 = 100; // L: 15
		field4393 = new class387[100]; // L: 16
		field4395 = 0; // L: 17
		field4397 = new class387();
	} // L: 22

	public class387() {
		this.field4394 = new float[16];
		this.method6956(); // L: 41
	} // L: 42

	@ObfuscatedSignature(
		descriptor = "(Lny;)V"
	)
	public class387(class387 var1) {
		this.field4394 = new float[16];
		this.method6973(var1); // L: 45
	} // L: 46

	@ObfuscatedSignature(
		descriptor = "(Lqt;Z)V"
	)
	public class387(Buffer var1, boolean var2) {
		this.field4394 = new float[16]; // L: 21
		this.method6957(var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	public void method6968() {
		synchronized(field4393) { // L: 35
			if (field4395 < field4396 - 1) { // L: 36
				field4393[++field4395 - 1] = this;
			}

		}
	} // L: 38

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;ZS)V",
		garbageValue = "128"
	)
	void method6957(Buffer var1, boolean var2) {
		if (var2) { // L: 53
			class388 var13 = new class388(); // L: 54
			int var6 = var1.readShort(); // L: 57
			var6 &= 16383; // L: 59
			float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586D); // L: 60
			var13.method7029(var5); // L: 62
			int var9 = var1.readShort(); // L: 65
			var9 &= 16383; // L: 67
			float var8 = (float)(6.283185307179586D * (double)((float)var9 / 16384.0F)); // L: 68
			var13.method7027(var8); // L: 70
			int var12 = var1.readShort(); // L: 73
			var12 &= 16383; // L: 75
			float var11 = (float)(6.283185307179586D * (double)((float)var12 / 16384.0F)); // L: 76
			var13.method7039(var11); // L: 78
			var13.method7026((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 79
			this.method6979(var13); // L: 80
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 83
				this.field4394[var3] = var1.method7740(); // L: 84
			}
		}

	} // L: 87

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1345466465"
	)
	float[] method6958() {
		float[] var1 = new float[3]; // L: 90
		if ((double)this.field4394[2] < 0.999D && (double)this.field4394[2] > -0.999D) { // L: 91
			var1[1] = (float)(-Math.asin((double)this.field4394[2])); // L: 92
			double var2 = Math.cos((double)var1[1]); // L: 93
			var1[0] = (float)Math.atan2((double)this.field4394[6] / var2, (double)this.field4394[10] / var2); // L: 94
			var1[2] = (float)Math.atan2((double)this.field4394[1] / var2, (double)this.field4394[0] / var2); // L: 95
		} else {
			var1[0] = 0.0F; // L: 98
			var1[1] = (float)Math.atan2((double)this.field4394[2], 0.0D); // L: 99
			var1[2] = (float)Math.atan2((double)(-this.field4394[9]), (double)this.field4394[5]); // L: 100
		}

		return var1; // L: 102
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "10"
	)
	public float[] method6959() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4394[6])), 0.0F, 0.0F}; // L: 106 107
		double var2 = Math.cos((double)var1[0]); // L: 108
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 109
			var4 = (double)this.field4394[2]; // L: 110
			var6 = (double)this.field4394[10]; // L: 111
			double var8 = (double)this.field4394[4]; // L: 112
			double var10 = (double)this.field4394[5]; // L: 113
			var1[1] = (float)Math.atan2(var4, var6); // L: 114
			var1[2] = (float)Math.atan2(var8, var10); // L: 115
		} else {
			var4 = (double)this.field4394[1]; // L: 118
			var6 = (double)this.field4394[0]; // L: 119
			if (this.field4394[6] < 0.0F) { // L: 120
				var1[1] = (float)Math.atan2(var4, var6); // L: 121
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 124
			}

			var1[2] = 0.0F; // L: 126
		}

		return var1; // L: 128
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-927373903"
	)
	void method6956() {
		this.field4394[0] = 1.0F; // L: 132
		this.field4394[1] = 0.0F; // L: 133
		this.field4394[2] = 0.0F; // L: 134
		this.field4394[3] = 0.0F; // L: 135
		this.field4394[4] = 0.0F; // L: 136
		this.field4394[5] = 1.0F; // L: 137
		this.field4394[6] = 0.0F; // L: 138
		this.field4394[7] = 0.0F; // L: 139
		this.field4394[8] = 0.0F; // L: 140
		this.field4394[9] = 0.0F; // L: 141
		this.field4394[10] = 1.0F; // L: 142
		this.field4394[11] = 0.0F; // L: 143
		this.field4394[12] = 0.0F; // L: 144
		this.field4394[13] = 0.0F; // L: 145
		this.field4394[14] = 0.0F; // L: 146
		this.field4394[15] = 1.0F; // L: 147
	} // L: 148

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "540046278"
	)
	public void method7016() {
		this.field4394[0] = 0.0F; // L: 151
		this.field4394[1] = 0.0F; // L: 152
		this.field4394[2] = 0.0F; // L: 153
		this.field4394[3] = 0.0F; // L: 154
		this.field4394[4] = 0.0F; // L: 155
		this.field4394[5] = 0.0F; // L: 156
		this.field4394[6] = 0.0F; // L: 157
		this.field4394[7] = 0.0F; // L: 158
		this.field4394[8] = 0.0F; // L: 159
		this.field4394[9] = 0.0F; // L: 160
		this.field4394[10] = 0.0F; // L: 161
		this.field4394[11] = 0.0F; // L: 162
		this.field4394[12] = 0.0F; // L: 163
		this.field4394[13] = 0.0F; // L: 164
		this.field4394[14] = 0.0F; // L: 165
		this.field4394[15] = 0.0F; // L: 166
	} // L: 167

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lny;B)V",
		garbageValue = "-5"
	)
	public void method6973(class387 var1) {
		System.arraycopy(var1.field4394, 0, this.field4394, 0, 16); // L: 170
	} // L: 171

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1114711003"
	)
	public void method6963(float var1) {
		this.method6964(var1, var1, var1); // L: 174
	} // L: 175

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-700106798"
	)
	public void method6964(float var1, float var2, float var3) {
		this.method6956(); // L: 178
		this.field4394[0] = var1; // L: 179
		this.field4394[5] = var2; // L: 180
		this.field4394[10] = var3; // L: 181
	} // L: 182

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)V",
		garbageValue = "1311675690"
	)
	public void method6965(class387 var1) {
		for (int var2 = 0; var2 < this.field4394.length; ++var2) { // L: 185
			float[] var10000 = this.field4394; // L: 186
			var10000[var2] += var1.field4394[var2];
		}

	} // L: 188

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lny;B)V",
		garbageValue = "-20"
	)
	public void method6962(class387 var1) {
		float var2 = this.field4394[3] * var1.field4394[12] + var1.field4394[8] * this.field4394[2] + var1.field4394[0] * this.field4394[0] + var1.field4394[4] * this.field4394[1]; // L: 191
		float var3 = this.field4394[2] * var1.field4394[9] + this.field4394[0] * var1.field4394[1] + this.field4394[1] * var1.field4394[5] + this.field4394[3] * var1.field4394[13]; // L: 192
		float var4 = var1.field4394[10] * this.field4394[2] + var1.field4394[2] * this.field4394[0] + var1.field4394[6] * this.field4394[1] + var1.field4394[14] * this.field4394[3]; // L: 193
		float var5 = this.field4394[3] * var1.field4394[15] + this.field4394[2] * var1.field4394[11] + var1.field4394[3] * this.field4394[0] + this.field4394[1] * var1.field4394[7]; // L: 194
		float var6 = var1.field4394[12] * this.field4394[7] + this.field4394[4] * var1.field4394[0] + var1.field4394[4] * this.field4394[5] + this.field4394[6] * var1.field4394[8]; // L: 195
		float var7 = this.field4394[5] * var1.field4394[5] + this.field4394[4] * var1.field4394[1] + this.field4394[6] * var1.field4394[9] + var1.field4394[13] * this.field4394[7]; // L: 196
		float var8 = this.field4394[7] * var1.field4394[14] + var1.field4394[10] * this.field4394[6] + var1.field4394[2] * this.field4394[4] + this.field4394[5] * var1.field4394[6]; // L: 197
		float var9 = this.field4394[6] * var1.field4394[11] + var1.field4394[3] * this.field4394[4] + this.field4394[5] * var1.field4394[7] + var1.field4394[15] * this.field4394[7]; // L: 198
		float var10 = this.field4394[9] * var1.field4394[4] + this.field4394[8] * var1.field4394[0] + var1.field4394[8] * this.field4394[10] + this.field4394[11] * var1.field4394[12]; // L: 199
		float var11 = var1.field4394[13] * this.field4394[11] + this.field4394[10] * var1.field4394[9] + this.field4394[8] * var1.field4394[1] + this.field4394[9] * var1.field4394[5]; // L: 200
		float var12 = this.field4394[8] * var1.field4394[2] + this.field4394[9] * var1.field4394[6] + this.field4394[10] * var1.field4394[10] + this.field4394[11] * var1.field4394[14]; // L: 201
		float var13 = this.field4394[10] * var1.field4394[11] + var1.field4394[7] * this.field4394[9] + this.field4394[8] * var1.field4394[3] + var1.field4394[15] * this.field4394[11]; // L: 202
		float var14 = this.field4394[15] * var1.field4394[12] + var1.field4394[8] * this.field4394[14] + var1.field4394[4] * this.field4394[13] + this.field4394[12] * var1.field4394[0]; // L: 203
		float var15 = var1.field4394[9] * this.field4394[14] + var1.field4394[1] * this.field4394[12] + this.field4394[13] * var1.field4394[5] + this.field4394[15] * var1.field4394[13]; // L: 204
		float var16 = this.field4394[14] * var1.field4394[10] + this.field4394[12] * var1.field4394[2] + var1.field4394[6] * this.field4394[13] + var1.field4394[14] * this.field4394[15]; // L: 205
		float var17 = this.field4394[13] * var1.field4394[7] + var1.field4394[3] * this.field4394[12] + this.field4394[14] * var1.field4394[11] + this.field4394[15] * var1.field4394[15]; // L: 206
		this.field4394[0] = var2; // L: 207
		this.field4394[1] = var3; // L: 208
		this.field4394[2] = var4; // L: 209
		this.field4394[3] = var5; // L: 210
		this.field4394[4] = var6; // L: 211
		this.field4394[5] = var7; // L: 212
		this.field4394[6] = var8; // L: 213
		this.field4394[7] = var9; // L: 214
		this.field4394[8] = var10; // L: 215
		this.field4394[9] = var11; // L: 216
		this.field4394[10] = var12; // L: 217
		this.field4394[11] = var13; // L: 218
		this.field4394[12] = var14; // L: 219
		this.field4394[13] = var15; // L: 220
		this.field4394[14] = var16; // L: 221
		this.field4394[15] = var17; // L: 222
	} // L: 223

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lni;B)V",
		garbageValue = "-93"
	)
	public void method6967(class386 var1) {
		float var2 = var1.field4391 * var1.field4391; // L: 226
		float var3 = var1.field4388 * var1.field4391; // L: 227
		float var4 = var1.field4391 * var1.field4387; // L: 228
		float var5 = var1.field4391 * var1.field4390; // L: 229
		float var6 = var1.field4388 * var1.field4388; // L: 230
		float var7 = var1.field4388 * var1.field4387; // L: 231
		float var8 = var1.field4390 * var1.field4388; // L: 232
		float var9 = var1.field4387 * var1.field4387; // L: 233
		float var10 = var1.field4387 * var1.field4390; // L: 234
		float var11 = var1.field4390 * var1.field4390; // L: 235
		this.field4394[0] = var2 + var6 - var11 - var9; // L: 236
		this.field4394[1] = var7 + var5 + var7 + var5; // L: 237
		this.field4394[2] = var8 - var4 - var4 + var8; // L: 238
		this.field4394[4] = var7 - var5 - var5 + var7; // L: 239
		this.field4394[5] = var9 + var2 - var6 - var11; // L: 240
		this.field4394[6] = var10 + var3 + var10 + var3; // L: 241
		this.field4394[8] = var8 + var8 + var4 + var4; // L: 242
		this.field4394[9] = var10 + (var10 - var3 - var3); // L: 243
		this.field4394[10] = var2 + var11 - var9 - var6; // L: 244
	} // L: 245

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-2099825365"
	)
	void method6979(class388 var1) {
		this.field4394[0] = var1.field4405; // L: 248
		this.field4394[1] = var1.field4400; // L: 249
		this.field4394[2] = var1.field4402; // L: 250
		this.field4394[3] = 0.0F; // L: 251
		this.field4394[4] = var1.field4409; // L: 252
		this.field4394[5] = var1.field4403; // L: 253
		this.field4394[6] = var1.field4408; // L: 254
		this.field4394[7] = 0.0F; // L: 255
		this.field4394[8] = var1.field4401; // L: 256
		this.field4394[9] = var1.field4407; // L: 257
		this.field4394[10] = var1.field4406; // L: 258
		this.field4394[11] = 0.0F; // L: 259
		this.field4394[12] = var1.field4404; // L: 260
		this.field4394[13] = var1.field4410; // L: 261
		this.field4394[14] = var1.field4411; // L: 262
		this.field4394[15] = 1.0F; // L: 263
	} // L: 264

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1763200209"
	)
	float method6969() {
		return this.field4394[12] * this.field4394[9] * this.field4394[3] * this.field4394[6] + (this.field4394[14] * this.field4394[8] * this.field4394[5] * this.field4394[3] + this.field4394[10] * this.field4394[4] * this.field4394[3] * this.field4394[13] + (this.field4394[12] * this.field4394[11] * this.field4394[5] * this.field4394[2] + (this.field4394[12] * this.field4394[1] * this.field4394[7] * this.field4394[10] + (this.field4394[15] * this.field4394[1] * this.field4394[6] * this.field4394[8] + this.field4394[11] * this.field4394[0] * this.field4394[6] * this.field4394[13] + (this.field4394[15] * this.field4394[10] * this.field4394[0] * this.field4394[5] - this.field4394[14] * this.field4394[11] * this.field4394[5] * this.field4394[0] - this.field4394[15] * this.field4394[9] * this.field4394[0] * this.field4394[6]) + this.field4394[7] * this.field4394[0] * this.field4394[9] * this.field4394[14] - this.field4394[10] * this.field4394[0] * this.field4394[7] * this.field4394[13] - this.field4394[10] * this.field4394[1] * this.field4394[4] * this.field4394[15] + this.field4394[1] * this.field4394[4] * this.field4394[11] * this.field4394[14] - this.field4394[11] * this.field4394[6] * this.field4394[1] * this.field4394[12] - this.field4394[14] * this.field4394[7] * this.field4394[1] * this.field4394[8]) + this.field4394[4] * this.field4394[2] * this.field4394[9] * this.field4394[15] - this.field4394[2] * this.field4394[4] * this.field4394[11] * this.field4394[13] - this.field4394[15] * this.field4394[8] * this.field4394[5] * this.field4394[2]) + this.field4394[13] * this.field4394[7] * this.field4394[2] * this.field4394[8] - this.field4394[2] * this.field4394[7] * this.field4394[9] * this.field4394[12] - this.field4394[9] * this.field4394[4] * this.field4394[3] * this.field4394[14]) - this.field4394[10] * this.field4394[3] * this.field4394[5] * this.field4394[12] - this.field4394[13] * this.field4394[3] * this.field4394[6] * this.field4394[8]); // L: 267
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "961919913"
	)
	public void method6970() {
		float var1 = 1.0F / this.method6969(); // L: 271
		float var2 = (this.field4394[7] * this.field4394[9] * this.field4394[14] + this.field4394[5] * this.field4394[10] * this.field4394[15] - this.field4394[14] * this.field4394[5] * this.field4394[11] - this.field4394[15] * this.field4394[6] * this.field4394[9] + this.field4394[11] * this.field4394[6] * this.field4394[13] - this.field4394[13] * this.field4394[7] * this.field4394[10]) * var1; // L: 272
		float var3 = (this.field4394[14] * this.field4394[11] * this.field4394[1] + this.field4394[15] * -this.field4394[1] * this.field4394[10] + this.field4394[9] * this.field4394[2] * this.field4394[15] - this.field4394[13] * this.field4394[2] * this.field4394[11] - this.field4394[9] * this.field4394[3] * this.field4394[14] + this.field4394[10] * this.field4394[3] * this.field4394[13]) * var1; // L: 273
		float var4 = (this.field4394[14] * this.field4394[3] * this.field4394[5] + this.field4394[13] * this.field4394[7] * this.field4394[2] + (this.field4394[15] * this.field4394[6] * this.field4394[1] - this.field4394[14] * this.field4394[1] * this.field4394[7] - this.field4394[2] * this.field4394[5] * this.field4394[15]) - this.field4394[13] * this.field4394[6] * this.field4394[3]) * var1; // L: 274
		float var5 = var1 * (this.field4394[6] * this.field4394[3] * this.field4394[9] + (this.field4394[5] * this.field4394[2] * this.field4394[11] + this.field4394[7] * this.field4394[1] * this.field4394[10] + this.field4394[11] * -this.field4394[1] * this.field4394[6] - this.field4394[9] * this.field4394[7] * this.field4394[2] - this.field4394[10] * this.field4394[3] * this.field4394[5])); // L: 275
		float var6 = (this.field4394[12] * this.field4394[7] * this.field4394[10] + (this.field4394[15] * this.field4394[10] * -this.field4394[4] + this.field4394[4] * this.field4394[11] * this.field4394[14] + this.field4394[8] * this.field4394[6] * this.field4394[15] - this.field4394[12] * this.field4394[6] * this.field4394[11] - this.field4394[7] * this.field4394[8] * this.field4394[14])) * var1; // L: 276
		float var7 = var1 * (this.field4394[2] * this.field4394[11] * this.field4394[12] + (this.field4394[15] * this.field4394[10] * this.field4394[0] - this.field4394[11] * this.field4394[0] * this.field4394[14] - this.field4394[15] * this.field4394[2] * this.field4394[8]) + this.field4394[3] * this.field4394[8] * this.field4394[14] - this.field4394[10] * this.field4394[3] * this.field4394[12]); // L: 277
		float var8 = (this.field4394[2] * this.field4394[4] * this.field4394[15] + this.field4394[14] * this.field4394[7] * this.field4394[0] + -this.field4394[0] * this.field4394[6] * this.field4394[15] - this.field4394[2] * this.field4394[7] * this.field4394[12] - this.field4394[3] * this.field4394[4] * this.field4394[14] + this.field4394[12] * this.field4394[3] * this.field4394[6]) * var1; // L: 278
		float var9 = (this.field4394[7] * this.field4394[2] * this.field4394[8] + (this.field4394[6] * this.field4394[0] * this.field4394[11] - this.field4394[10] * this.field4394[7] * this.field4394[0] - this.field4394[2] * this.field4394[4] * this.field4394[11]) + this.field4394[4] * this.field4394[3] * this.field4394[10] - this.field4394[8] * this.field4394[3] * this.field4394[6]) * var1; // L: 279
		float var10 = var1 * (this.field4394[12] * this.field4394[5] * this.field4394[11] + (this.field4394[9] * this.field4394[4] * this.field4394[15] - this.field4394[4] * this.field4394[11] * this.field4394[13] - this.field4394[8] * this.field4394[5] * this.field4394[15]) + this.field4394[8] * this.field4394[7] * this.field4394[13] - this.field4394[12] * this.field4394[9] * this.field4394[7]); // L: 280
		float var11 = (this.field4394[3] * this.field4394[9] * this.field4394[12] + (this.field4394[15] * this.field4394[9] * -this.field4394[0] + this.field4394[13] * this.field4394[11] * this.field4394[0] + this.field4394[1] * this.field4394[8] * this.field4394[15] - this.field4394[11] * this.field4394[1] * this.field4394[12] - this.field4394[8] * this.field4394[3] * this.field4394[13])) * var1; // L: 281
		float var12 = (this.field4394[7] * this.field4394[1] * this.field4394[12] + (this.field4394[15] * this.field4394[5] * this.field4394[0] - this.field4394[7] * this.field4394[0] * this.field4394[13] - this.field4394[15] * this.field4394[1] * this.field4394[4]) + this.field4394[3] * this.field4394[4] * this.field4394[13] - this.field4394[12] * this.field4394[5] * this.field4394[3]) * var1; // L: 282
		float var13 = var1 * (this.field4394[8] * this.field4394[5] * this.field4394[3] + (this.field4394[11] * this.field4394[4] * this.field4394[1] + this.field4394[9] * this.field4394[0] * this.field4394[7] + this.field4394[11] * -this.field4394[0] * this.field4394[5] - this.field4394[1] * this.field4394[7] * this.field4394[8] - this.field4394[4] * this.field4394[3] * this.field4394[9])); // L: 283
		float var14 = var1 * (this.field4394[6] * this.field4394[9] * this.field4394[12] + (this.field4394[5] * this.field4394[8] * this.field4394[14] + this.field4394[9] * -this.field4394[4] * this.field4394[14] + this.field4394[13] * this.field4394[4] * this.field4394[10] - this.field4394[12] * this.field4394[10] * this.field4394[5] - this.field4394[6] * this.field4394[8] * this.field4394[13])); // L: 284
		float var15 = var1 * (this.field4394[14] * this.field4394[9] * this.field4394[0] - this.field4394[10] * this.field4394[0] * this.field4394[13] - this.field4394[14] * this.field4394[8] * this.field4394[1] + this.field4394[12] * this.field4394[10] * this.field4394[1] + this.field4394[13] * this.field4394[8] * this.field4394[2] - this.field4394[9] * this.field4394[2] * this.field4394[12]); // L: 285
		float var16 = var1 * (this.field4394[12] * this.field4394[2] * this.field4394[5] + (this.field4394[1] * this.field4394[4] * this.field4394[14] + this.field4394[13] * this.field4394[6] * this.field4394[0] + this.field4394[14] * this.field4394[5] * -this.field4394[0] - this.field4394[6] * this.field4394[1] * this.field4394[12] - this.field4394[4] * this.field4394[2] * this.field4394[13])); // L: 286
		float var17 = (this.field4394[9] * this.field4394[2] * this.field4394[4] + this.field4394[5] * this.field4394[0] * this.field4394[10] - this.field4394[9] * this.field4394[0] * this.field4394[6] - this.field4394[10] * this.field4394[1] * this.field4394[4] + this.field4394[1] * this.field4394[6] * this.field4394[8] - this.field4394[5] * this.field4394[2] * this.field4394[8]) * var1; // L: 287
		this.field4394[0] = var2; // L: 288
		this.field4394[1] = var3; // L: 289
		this.field4394[2] = var4; // L: 290
		this.field4394[3] = var5; // L: 291
		this.field4394[4] = var6; // L: 292
		this.field4394[5] = var7; // L: 293
		this.field4394[6] = var8; // L: 294
		this.field4394[7] = var9; // L: 295
		this.field4394[8] = var10; // L: 296
		this.field4394[9] = var11; // L: 297
		this.field4394[10] = var12; // L: 298
		this.field4394[11] = var13; // L: 299
		this.field4394[12] = var14; // L: 300
		this.field4394[13] = var15; // L: 301
		this.field4394[14] = var16; // L: 302
		this.field4394[15] = var17; // L: 303
	} // L: 304

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1510680862"
	)
	public float[] method6992() {
		float[] var1 = new float[3]; // L: 341
		class385 var2 = new class385(this.field4394[0], this.field4394[1], this.field4394[2]); // L: 342
		class385 var3 = new class385(this.field4394[4], this.field4394[5], this.field4394[6]); // L: 343
		class385 var4 = new class385(this.field4394[8], this.field4394[9], this.field4394[10]); // L: 344
		var1[0] = var2.method6929(); // L: 345
		var1[1] = var3.method6929(); // L: 346
		var1[2] = var4.method6929(); // L: 347
		return var1; // L: 348
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 309
		this.method6959(); // L: 310
		this.method6958(); // L: 311

		for (int var2 = 0; var2 < 4; ++var2) { // L: 312
			for (int var3 = 0; var3 < 4; ++var3) { // L: 313
				if (var3 > 0) {
					var1.append("\t"); // L: 314
				}

				float var4 = this.field4394[var3 + var2 * 4]; // L: 315
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 316
					var4 = 0.0F;
				}

				var1.append(var4); // L: 317
			}

			var1.append("\n"); // L: 319
		}

		return var1.toString(); // L: 321
	}

	public int hashCode() {
		boolean var1 = true; // L: 326
		byte var2 = 1; // L: 327
		int var3 = var2 * 31 + Arrays.hashCode(this.field4394); // L: 328
		return var3; // L: 329
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class387)) { // L: 334
			return false;
		} else {
			class387 var2 = (class387)var1; // L: 335

			for (int var3 = 0; var3 < 16; ++var3) { // L: 336
				if (var2.field4394[var3] != this.field4394[var3]) {
					return false;
				}
			}

			return true; // L: 337
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "-412405575"
	)
	static int method7021(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3855
			class446.Interpreter_intStackSize -= 2; // L: 3856
			Client.field748 = (short)class20.method255(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]); // L: 3857
			if (Client.field748 <= 0) { // L: 3858
				Client.field748 = 256;
			}

			Client.field749 = (short)class20.method255(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]); // L: 3859
			if (Client.field749 <= 0) { // L: 3860
				Client.field749 = 256;
			}

			return 1; // L: 3861
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3863
			class446.Interpreter_intStackSize -= 2; // L: 3864
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3865
			if (Client.zoomHeight <= 0) { // L: 3866
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3867
			if (Client.zoomWidth <= 0) { // L: 3868
				Client.zoomWidth = 320;
			}

			return 1; // L: 3869
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3871
			class446.Interpreter_intStackSize -= 4; // L: 3872
			Client.field752 = (short)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3873
			if (Client.field752 <= 0) { // L: 3874
				Client.field752 = 1;
			}

			Client.field753 = (short)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3875
			if (Client.field753 <= 0) { // L: 3876
				Client.field753 = 32767;
			} else if (Client.field753 < Client.field752) { // L: 3877
				Client.field753 = Client.field752;
			}

			Client.field754 = (short)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 3878
			if (Client.field754 <= 0) { // L: 3879
				Client.field754 = 1;
			}

			Client.field755 = (short)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3]; // L: 3880
			if (Client.field755 <= 0) { // L: 3881
				Client.field755 = 32767;
			} else if (Client.field755 < Client.field754) { // L: 3882
				Client.field755 = Client.field754;
			}

			return 1; // L: 3883
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3885
			if (Client.viewportWidget != null) { // L: 3886
				class201.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3887
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3888
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3889
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 3892
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 3893
			}

			return 1; // L: 3895
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3897
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3898
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3899
			return 1; // L: 3900
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3902
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Frames.method4350(Client.field748); // L: 3903
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Frames.method4350(Client.field749); // L: 3904
			return 1; // L: 3905
		} else if (var0 == 6220) { // L: 3907
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3908
			return 1; // L: 3909
		} else if (var0 == 6221) { // L: 3911
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3912
			return 1; // L: 3913
		} else if (var0 == 6222) { // L: 3915
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Script.canvasWidth; // L: 3916
			return 1; // L: 3917
		} else if (var0 == 6223) { // L: 3919
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class78.canvasHeight; // L: 3920
			return 1; // L: 3921
		} else {
			return 2; // L: 3923
		}
	}
}
