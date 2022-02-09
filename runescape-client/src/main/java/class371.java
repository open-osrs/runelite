import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public final class class371 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lni;"
	)
	static class371[] field4238;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2057467461
	)
	static int field4240;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	public static final class371 field4239;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("r")
	public float[] field4241;

	static {
		field4238 = new class371[0]; // L: 9
		Coord.method5335(100); // L: 14
		field4239 = new class371(); // L: 18
	}

	public class371() {
		this.field4241 = new float[16];
		this.method6677(); // L: 43
	} // L: 44

	@ObfuscatedSignature(
		descriptor = "(Lni;)V"
	)
	public class371(class371 var1) {
		this.field4241 = new float[16];
		this.method6699(var1); // L: 47
	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(Lpi;Z)V"
	)
	public class371(Buffer var1, boolean var2) {
		this.field4241 = new float[16]; // L: 17
		this.method6736(var1, var2); // L: 51
	} // L: 52

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-884140696"
	)
	public void method6703() {
		synchronized(field4238) { // L: 37
			if (class296.field3510 < field4240 - 1) { // L: 38
				field4238[++class296.field3510 - 1] = this;
			}

		}
	} // L: 40

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpi;ZB)V",
		garbageValue = "4"
	)
	void method6736(Buffer var1, boolean var2) {
		if (var2) { // L: 55
			class372 var4 = new class372(); // L: 56
			var4.method6746(class114.method2609(var1.readShort())); // L: 57
			var4.method6740(class114.method2609(var1.readShort())); // L: 58
			var4.method6741(class114.method2609(var1.readShort())); // L: 59
			var4.method6742((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 60
			this.method6689(var4); // L: 61
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 64
				this.field4241[var3] = var1.method7374(); // L: 65
			}
		}

	} // L: 68

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "14"
	)
	float[] method6675() {
		float[] var1 = new float[3]; // L: 71
		if ((double)this.field4241[2] < 0.999D && (double)this.field4241[2] > -0.999D) { // L: 72
			var1[1] = (float)(-Math.asin((double)this.field4241[2])); // L: 73
			double var2 = Math.cos((double)var1[1]); // L: 74
			var1[0] = (float)Math.atan2((double)this.field4241[6] / var2, (double)this.field4241[10] / var2); // L: 75
			var1[2] = (float)Math.atan2((double)this.field4241[1] / var2, (double)this.field4241[0] / var2); // L: 76
		} else {
			var1[0] = 0.0F; // L: 79
			var1[1] = (float)Math.atan2((double)this.field4241[2], 0.0D); // L: 80
			var1[2] = (float)Math.atan2((double)(-this.field4241[9]), (double)this.field4241[5]); // L: 81
		}

		return var1; // L: 83
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "20"
	)
	public float[] method6732() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4241[6])), 0.0F, 0.0F}; // L: 87 88
		double var2 = Math.cos((double)var1[0]); // L: 89
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 90
			var4 = (double)this.field4241[2]; // L: 91
			var6 = (double)this.field4241[10]; // L: 92
			double var8 = (double)this.field4241[4]; // L: 93
			double var10 = (double)this.field4241[5]; // L: 94
			var1[1] = (float)Math.atan2(var4, var6); // L: 95
			var1[2] = (float)Math.atan2(var8, var10); // L: 96
		} else {
			var4 = (double)this.field4241[1]; // L: 99
			var6 = (double)this.field4241[0]; // L: 100
			if (this.field4241[6] < 0.0F) { // L: 101
				var1[1] = (float)Math.atan2(var4, var6); // L: 102
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 105
			}

			var1[2] = 0.0F; // L: 107
		}

		return var1; // L: 109
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "120901342"
	)
	void method6677() {
		this.field4241[0] = 1.0F; // L: 113
		this.field4241[1] = 0.0F; // L: 114
		this.field4241[2] = 0.0F; // L: 115
		this.field4241[3] = 0.0F; // L: 116
		this.field4241[4] = 0.0F; // L: 117
		this.field4241[5] = 1.0F; // L: 118
		this.field4241[6] = 0.0F; // L: 119
		this.field4241[7] = 0.0F; // L: 120
		this.field4241[8] = 0.0F; // L: 121
		this.field4241[9] = 0.0F; // L: 122
		this.field4241[10] = 1.0F; // L: 123
		this.field4241[11] = 0.0F; // L: 124
		this.field4241[12] = 0.0F; // L: 125
		this.field4241[13] = 0.0F; // L: 126
		this.field4241[14] = 0.0F; // L: 127
		this.field4241[15] = 1.0F; // L: 128
	} // L: 129

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-38"
	)
	public void method6702() {
		this.field4241[0] = 0.0F; // L: 132
		this.field4241[1] = 0.0F; // L: 133
		this.field4241[2] = 0.0F; // L: 134
		this.field4241[3] = 0.0F; // L: 135
		this.field4241[4] = 0.0F; // L: 136
		this.field4241[5] = 0.0F; // L: 137
		this.field4241[6] = 0.0F; // L: 138
		this.field4241[7] = 0.0F; // L: 139
		this.field4241[8] = 0.0F; // L: 140
		this.field4241[9] = 0.0F; // L: 141
		this.field4241[10] = 0.0F; // L: 142
		this.field4241[11] = 0.0F; // L: 143
		this.field4241[12] = 0.0F; // L: 144
		this.field4241[13] = 0.0F; // L: 145
		this.field4241[14] = 0.0F; // L: 146
		this.field4241[15] = 0.0F; // L: 147
	} // L: 148

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "-1704193184"
	)
	public void method6699(class371 var1) {
		System.arraycopy(var1.field4241, 0, this.field4241, 0, 16); // L: 151
	} // L: 152

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1128809728"
	)
	public void method6680(float var1) {
		this.method6681(var1, var1, var1); // L: 155
	} // L: 156

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1129320536"
	)
	public void method6681(float var1, float var2, float var3) {
		this.method6677(); // L: 159
		this.field4241[0] = var1; // L: 160
		this.field4241[5] = var2; // L: 161
		this.field4241[10] = var3; // L: 162
	} // L: 163

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lni;B)V",
		garbageValue = "9"
	)
	public void method6704(class371 var1) {
		for (int var2 = 0; var2 < this.field4241.length; ++var2) { // L: 166
			float[] var10000 = this.field4241; // L: 167
			var10000[var2] += var1.field4241[var2];
		}

	} // L: 169

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "-2094021930"
	)
	public void method6682(class371 var1) {
		float var2 = var1.field4241[0] * this.field4241[0] + this.field4241[1] * var1.field4241[4] + var1.field4241[8] * this.field4241[2] + this.field4241[3] * var1.field4241[12]; // L: 172
		float var3 = this.field4241[2] * var1.field4241[9] + this.field4241[1] * var1.field4241[5] + var1.field4241[1] * this.field4241[0] + var1.field4241[13] * this.field4241[3]; // L: 173
		float var4 = this.field4241[1] * var1.field4241[6] + this.field4241[0] * var1.field4241[2] + this.field4241[2] * var1.field4241[10] + this.field4241[3] * var1.field4241[14]; // L: 174
		float var5 = var1.field4241[15] * this.field4241[3] + var1.field4241[3] * this.field4241[0] + var1.field4241[7] * this.field4241[1] + this.field4241[2] * var1.field4241[11]; // L: 175
		float var6 = this.field4241[7] * var1.field4241[12] + var1.field4241[4] * this.field4241[5] + var1.field4241[0] * this.field4241[4] + this.field4241[6] * var1.field4241[8]; // L: 176
		float var7 = var1.field4241[13] * this.field4241[7] + var1.field4241[9] * this.field4241[6] + this.field4241[4] * var1.field4241[1] + this.field4241[5] * var1.field4241[5]; // L: 177
		float var8 = var1.field4241[6] * this.field4241[5] + var1.field4241[2] * this.field4241[4] + var1.field4241[10] * this.field4241[6] + var1.field4241[14] * this.field4241[7]; // L: 178
		float var9 = var1.field4241[15] * this.field4241[7] + this.field4241[6] * var1.field4241[11] + var1.field4241[7] * this.field4241[5] + this.field4241[4] * var1.field4241[3]; // L: 179
		float var10 = this.field4241[10] * var1.field4241[8] + var1.field4241[4] * this.field4241[9] + this.field4241[8] * var1.field4241[0] + this.field4241[11] * var1.field4241[12]; // L: 180
		float var11 = var1.field4241[9] * this.field4241[10] + this.field4241[8] * var1.field4241[1] + var1.field4241[5] * this.field4241[9] + var1.field4241[13] * this.field4241[11]; // L: 181
		float var12 = this.field4241[11] * var1.field4241[14] + var1.field4241[6] * this.field4241[9] + this.field4241[8] * var1.field4241[2] + var1.field4241[10] * this.field4241[10]; // L: 182
		float var13 = this.field4241[10] * var1.field4241[11] + this.field4241[8] * var1.field4241[3] + var1.field4241[7] * this.field4241[9] + var1.field4241[15] * this.field4241[11]; // L: 183
		float var14 = var1.field4241[8] * this.field4241[14] + this.field4241[12] * var1.field4241[0] + this.field4241[13] * var1.field4241[4] + this.field4241[15] * var1.field4241[12]; // L: 184
		float var15 = this.field4241[12] * var1.field4241[1] + var1.field4241[5] * this.field4241[13] + var1.field4241[9] * this.field4241[14] + this.field4241[15] * var1.field4241[13]; // L: 185
		float var16 = var1.field4241[14] * this.field4241[15] + var1.field4241[10] * this.field4241[14] + this.field4241[13] * var1.field4241[6] + this.field4241[12] * var1.field4241[2]; // L: 186
		float var17 = var1.field4241[15] * this.field4241[15] + var1.field4241[7] * this.field4241[13] + var1.field4241[3] * this.field4241[12] + this.field4241[14] * var1.field4241[11]; // L: 187
		this.field4241[0] = var2; // L: 188
		this.field4241[1] = var3; // L: 189
		this.field4241[2] = var4; // L: 190
		this.field4241[3] = var5; // L: 191
		this.field4241[4] = var6; // L: 192
		this.field4241[5] = var7; // L: 193
		this.field4241[6] = var8; // L: 194
		this.field4241[7] = var9; // L: 195
		this.field4241[8] = var10; // L: 196
		this.field4241[9] = var11; // L: 197
		this.field4241[10] = var12; // L: 198
		this.field4241[11] = var13; // L: 199
		this.field4241[12] = var14; // L: 200
		this.field4241[13] = var15; // L: 201
		this.field4241[14] = var16; // L: 202
		this.field4241[15] = var17; // L: 203
	} // L: 204

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnq;B)V",
		garbageValue = "-108"
	)
	public void method6683(class370 var1) {
		float var2 = var1.field4232 * var1.field4232; // L: 207
		float var3 = var1.field4232 * var1.field4229; // L: 208
		float var4 = var1.field4232 * var1.field4233; // L: 209
		float var5 = var1.field4232 * var1.field4234; // L: 210
		float var6 = var1.field4229 * var1.field4229; // L: 211
		float var7 = var1.field4229 * var1.field4233; // L: 212
		float var8 = var1.field4234 * var1.field4229; // L: 213
		float var9 = var1.field4233 * var1.field4233; // L: 214
		float var10 = var1.field4233 * var1.field4234; // L: 215
		float var11 = var1.field4234 * var1.field4234; // L: 216
		this.field4241[0] = var2 + var6 - var11 - var9; // L: 217
		this.field4241[1] = var5 + var7 + var5 + var7; // L: 218
		this.field4241[2] = var8 - var4 - var4 + var8; // L: 219
		this.field4241[4] = var7 + (var7 - var5 - var5); // L: 220
		this.field4241[5] = var2 + var9 - var6 - var11; // L: 221
		this.field4241[6] = var3 + var3 + var10 + var10; // L: 222
		this.field4241[8] = var4 + var8 + var8 + var4; // L: 223
		this.field4241[9] = var10 - var3 - var3 + var10; // L: 224
		this.field4241[10] = var11 + var2 - var9 - var6; // L: 225
	} // L: 226

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "789710175"
	)
	void method6689(class372 var1) {
		this.field4241[0] = var1.field4256; // L: 229
		this.field4241[1] = var1.field4253; // L: 230
		this.field4241[2] = var1.field4247; // L: 231
		this.field4241[3] = 0.0F; // L: 232
		this.field4241[4] = var1.field4248; // L: 233
		this.field4241[5] = var1.field4245; // L: 234
		this.field4241[6] = var1.field4249; // L: 235
		this.field4241[7] = 0.0F; // L: 236
		this.field4241[8] = var1.field4251; // L: 237
		this.field4241[9] = var1.field4252; // L: 238
		this.field4241[10] = var1.field4254; // L: 239
		this.field4241[11] = 0.0F; // L: 240
		this.field4241[12] = var1.field4250; // L: 241
		this.field4241[13] = var1.field4255; // L: 242
		this.field4241[14] = var1.field4246; // L: 243
		this.field4241[15] = 1.0F; // L: 244
	} // L: 245

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-1"
	)
	float method6685() {
		return this.field4241[14] * this.field4241[9] * this.field4241[0] * this.field4241[7] + this.field4241[0] * this.field4241[6] * this.field4241[11] * this.field4241[13] + (this.field4241[15] * this.field4241[10] * this.field4241[5] * this.field4241[0] - this.field4241[11] * this.field4241[5] * this.field4241[0] * this.field4241[14] - this.field4241[9] * this.field4241[6] * this.field4241[0] * this.field4241[15]) - this.field4241[13] * this.field4241[10] * this.field4241[7] * this.field4241[0] - this.field4241[10] * this.field4241[1] * this.field4241[4] * this.field4241[15] + this.field4241[14] * this.field4241[11] * this.field4241[4] * this.field4241[1] + this.field4241[1] * this.field4241[6] * this.field4241[8] * this.field4241[15] - this.field4241[12] * this.field4241[11] * this.field4241[6] * this.field4241[1] - this.field4241[1] * this.field4241[7] * this.field4241[8] * this.field4241[14] + this.field4241[12] * this.field4241[7] * this.field4241[1] * this.field4241[10] + this.field4241[15] * this.field4241[2] * this.field4241[4] * this.field4241[9] - this.field4241[13] * this.field4241[2] * this.field4241[4] * this.field4241[11] - this.field4241[15] * this.field4241[8] * this.field4241[2] * this.field4241[5] + this.field4241[11] * this.field4241[5] * this.field4241[2] * this.field4241[12] + this.field4241[8] * this.field4241[2] * this.field4241[7] * this.field4241[13] - this.field4241[9] * this.field4241[7] * this.field4241[2] * this.field4241[12] - this.field4241[9] * this.field4241[3] * this.field4241[4] * this.field4241[14] + this.field4241[13] * this.field4241[10] * this.field4241[4] * this.field4241[3] + this.field4241[5] * this.field4241[3] * this.field4241[8] * this.field4241[14] - this.field4241[3] * this.field4241[5] * this.field4241[10] * this.field4241[12] - this.field4241[13] * this.field4241[8] * this.field4241[6] * this.field4241[3] + this.field4241[9] * this.field4241[6] * this.field4241[3] * this.field4241[12]; // L: 248
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1940439543"
	)
	public void method6705() {
		float var1 = 1.0F / this.method6685(); // L: 252
		float var2 = (this.field4241[14] * this.field4241[7] * this.field4241[9] + this.field4241[13] * this.field4241[11] * this.field4241[6] + (this.field4241[15] * this.field4241[5] * this.field4241[10] - this.field4241[11] * this.field4241[5] * this.field4241[14] - this.field4241[15] * this.field4241[6] * this.field4241[9]) - this.field4241[13] * this.field4241[10] * this.field4241[7]) * var1; // L: 253
		float var3 = var1 * (this.field4241[11] * this.field4241[1] * this.field4241[14] + this.field4241[15] * -this.field4241[1] * this.field4241[10] + this.field4241[9] * this.field4241[2] * this.field4241[15] - this.field4241[2] * this.field4241[11] * this.field4241[13] - this.field4241[9] * this.field4241[3] * this.field4241[14] + this.field4241[3] * this.field4241[10] * this.field4241[13]); // L: 254
		float var4 = var1 * (this.field4241[1] * this.field4241[6] * this.field4241[15] - this.field4241[14] * this.field4241[1] * this.field4241[7] - this.field4241[5] * this.field4241[2] * this.field4241[15] + this.field4241[13] * this.field4241[7] * this.field4241[2] + this.field4241[3] * this.field4241[5] * this.field4241[14] - this.field4241[6] * this.field4241[3] * this.field4241[13]); // L: 255
		float var5 = var1 * (this.field4241[11] * this.field4241[2] * this.field4241[5] + this.field4241[10] * this.field4241[7] * this.field4241[1] + this.field4241[6] * -this.field4241[1] * this.field4241[11] - this.field4241[2] * this.field4241[7] * this.field4241[9] - this.field4241[10] * this.field4241[5] * this.field4241[3] + this.field4241[9] * this.field4241[6] * this.field4241[3]); // L: 256
		float var6 = var1 * (this.field4241[12] * this.field4241[10] * this.field4241[7] + (this.field4241[15] * this.field4241[10] * -this.field4241[4] + this.field4241[4] * this.field4241[11] * this.field4241[14] + this.field4241[8] * this.field4241[6] * this.field4241[15] - this.field4241[12] * this.field4241[6] * this.field4241[11] - this.field4241[14] * this.field4241[7] * this.field4241[8])); // L: 257
		float var7 = var1 * (this.field4241[14] * this.field4241[8] * this.field4241[3] + this.field4241[12] * this.field4241[11] * this.field4241[2] + (this.field4241[15] * this.field4241[10] * this.field4241[0] - this.field4241[14] * this.field4241[11] * this.field4241[0] - this.field4241[2] * this.field4241[8] * this.field4241[15]) - this.field4241[12] * this.field4241[10] * this.field4241[3]); // L: 258
		float var8 = var1 * (this.field4241[15] * -this.field4241[0] * this.field4241[6] + this.field4241[0] * this.field4241[7] * this.field4241[14] + this.field4241[4] * this.field4241[2] * this.field4241[15] - this.field4241[7] * this.field4241[2] * this.field4241[12] - this.field4241[3] * this.field4241[4] * this.field4241[14] + this.field4241[3] * this.field4241[6] * this.field4241[12]); // L: 259
		float var9 = var1 * (this.field4241[8] * this.field4241[7] * this.field4241[2] + (this.field4241[11] * this.field4241[0] * this.field4241[6] - this.field4241[7] * this.field4241[0] * this.field4241[10] - this.field4241[11] * this.field4241[4] * this.field4241[2]) + this.field4241[3] * this.field4241[4] * this.field4241[10] - this.field4241[6] * this.field4241[3] * this.field4241[8]); // L: 260
		float var10 = (this.field4241[11] * this.field4241[5] * this.field4241[12] + (this.field4241[4] * this.field4241[9] * this.field4241[15] - this.field4241[13] * this.field4241[11] * this.field4241[4] - this.field4241[15] * this.field4241[5] * this.field4241[8]) + this.field4241[13] * this.field4241[7] * this.field4241[8] - this.field4241[12] * this.field4241[7] * this.field4241[9]) * var1; // L: 261
		float var11 = var1 * (this.field4241[9] * this.field4241[3] * this.field4241[12] + (this.field4241[15] * this.field4241[8] * this.field4241[1] + this.field4241[15] * -this.field4241[0] * this.field4241[9] + this.field4241[11] * this.field4241[0] * this.field4241[13] - this.field4241[1] * this.field4241[11] * this.field4241[12] - this.field4241[13] * this.field4241[8] * this.field4241[3])); // L: 262
		float var12 = var1 * (this.field4241[1] * this.field4241[7] * this.field4241[12] + (this.field4241[5] * this.field4241[0] * this.field4241[15] - this.field4241[7] * this.field4241[0] * this.field4241[13] - this.field4241[4] * this.field4241[1] * this.field4241[15]) + this.field4241[13] * this.field4241[4] * this.field4241[3] - this.field4241[5] * this.field4241[3] * this.field4241[12]); // L: 263
		float var13 = var1 * (this.field4241[11] * this.field4241[5] * -this.field4241[0] + this.field4241[9] * this.field4241[7] * this.field4241[0] + this.field4241[1] * this.field4241[4] * this.field4241[11] - this.field4241[8] * this.field4241[7] * this.field4241[1] - this.field4241[9] * this.field4241[3] * this.field4241[4] + this.field4241[5] * this.field4241[3] * this.field4241[8]); // L: 264
		float var14 = var1 * (this.field4241[9] * this.field4241[6] * this.field4241[12] + (this.field4241[8] * this.field4241[5] * this.field4241[14] + this.field4241[14] * -this.field4241[4] * this.field4241[9] + this.field4241[4] * this.field4241[10] * this.field4241[13] - this.field4241[5] * this.field4241[10] * this.field4241[12] - this.field4241[6] * this.field4241[8] * this.field4241[13])); // L: 265
		float var15 = (this.field4241[2] * this.field4241[8] * this.field4241[13] + this.field4241[14] * this.field4241[0] * this.field4241[9] - this.field4241[13] * this.field4241[0] * this.field4241[10] - this.field4241[14] * this.field4241[8] * this.field4241[1] + this.field4241[1] * this.field4241[10] * this.field4241[12] - this.field4241[12] * this.field4241[2] * this.field4241[9]) * var1; // L: 266
		float var16 = (this.field4241[2] * this.field4241[5] * this.field4241[12] + (this.field4241[1] * this.field4241[4] * this.field4241[14] + this.field4241[6] * this.field4241[0] * this.field4241[13] + this.field4241[5] * -this.field4241[0] * this.field4241[14] - this.field4241[12] * this.field4241[1] * this.field4241[6] - this.field4241[13] * this.field4241[2] * this.field4241[4])) * var1; // L: 267
		float var17 = var1 * (this.field4241[9] * this.field4241[2] * this.field4241[4] + this.field4241[8] * this.field4241[1] * this.field4241[6] + (this.field4241[5] * this.field4241[0] * this.field4241[10] - this.field4241[9] * this.field4241[0] * this.field4241[6] - this.field4241[4] * this.field4241[1] * this.field4241[10]) - this.field4241[8] * this.field4241[5] * this.field4241[2]); // L: 268
		this.field4241[0] = var2; // L: 269
		this.field4241[1] = var3; // L: 270
		this.field4241[2] = var4; // L: 271
		this.field4241[3] = var5; // L: 272
		this.field4241[4] = var6; // L: 273
		this.field4241[5] = var7; // L: 274
		this.field4241[6] = var8; // L: 275
		this.field4241[7] = var9; // L: 276
		this.field4241[8] = var10; // L: 277
		this.field4241[9] = var11; // L: 278
		this.field4241[10] = var12; // L: 279
		this.field4241[11] = var13; // L: 280
		this.field4241[12] = var14; // L: 281
		this.field4241[13] = var15; // L: 282
		this.field4241[14] = var16; // L: 283
		this.field4241[15] = var17; // L: 284
	} // L: 285

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "56"
	)
	public float[] method6688() {
		float[] var1 = new float[3]; // L: 322
		class369 var2 = new class369(this.field4241[0], this.field4241[1], this.field4241[2]); // L: 323
		class369 var3 = new class369(this.field4241[4], this.field4241[5], this.field4241[6]); // L: 324
		class369 var4 = new class369(this.field4241[8], this.field4241[9], this.field4241[10]); // L: 325
		var1[0] = var2.method6638(); // L: 326
		var1[1] = var3.method6638(); // L: 327
		var1[2] = var4.method6638(); // L: 328
		return var1; // L: 329
	}

	public int hashCode() {
		boolean var1 = true; // L: 307
		byte var2 = 1; // L: 308
		int var3 = var2 * 31 + Arrays.hashCode(this.field4241); // L: 309
		return var3; // L: 310
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class371)) { // L: 315
			return false;
		} else {
			class371 var2 = (class371)var1; // L: 316

			for (int var3 = 0; var3 < 16; ++var3) { // L: 317
				if (var2.field4241[var3] != this.field4241[var3]) {
					return false;
				}
			}

			return true; // L: 318
		}
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 290
		this.method6732(); // L: 291
		this.method6675(); // L: 292

		for (int var2 = 0; var2 < 4; ++var2) { // L: 293
			for (int var3 = 0; var3 < 4; ++var3) { // L: 294
				if (var3 > 0) {
					var1.append("\t"); // L: 295
				}

				float var4 = this.field4241[var3 + var2 * 4]; // L: 296
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 297
					var4 = 0.0F;
				}

				var1.append(var4); // L: 298
			}

			var1.append("\n"); // L: 300
		}

		return var1.toString(); // L: 302
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1467477264"
	)
	static final void method6674(int var0, int var1) {
		if (Client.hintArrowType == 2) { // L: 4719
			class148.worldToScreen((Client.hintArrowX - Canvas.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - class118.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4720
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4721
				SequenceDefinition.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	} // L: 4722
}
