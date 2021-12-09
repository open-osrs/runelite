import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
public final class class366 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lno;"
	)
	public static class366[] field4191;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1036924523
	)
	static int field4192;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	public static final class366 field4194;
	@ObfuscatedName("t")
	public float[] field4196;

	static {
		field4191 = new class366[0]; // L: 9
		Client.method1623(100); // L: 14
		field4194 = new class366(); // L: 18
	}

	public class366() {
		this.field4196 = new float[16];
		this.method6652(); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	public class366(class366 var1) {
		this.field4196 = new float[16];
		this.method6654(var1); // L: 37
	} // L: 38

	@ObfuscatedSignature(
		descriptor = "(Lpi;Z)V"
	)
	public class366(Buffer var1, boolean var2) {
		this.field4196 = new float[16]; // L: 17
		this.method6649(var1, var2); // L: 41
	} // L: 42

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "340941633"
	)
	public void method6656() {
		synchronized(field4191) { // L: 27
			if (class149.field1663 < field4192 - 1) { // L: 28
				field4191[++class149.field1663 - 1] = this;
			}

		}
	} // L: 30

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;ZI)V",
		garbageValue = "-1222867877"
	)
	void method6649(Buffer var1, boolean var2) {
		if (var2) { // L: 45
			class367 var4 = new class367(); // L: 46
			var4.method6732(class329.method6135(var1.readShort())); // L: 47
			var4.method6717(class329.method6135(var1.readShort())); // L: 48
			var4.method6718(class329.method6135(var1.readShort())); // L: 49
			var4.method6719((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 50
			this.method6713(var4); // L: 51
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 54
				this.field4196[var3] = var1.method7369(); // L: 55
			}
		}

	} // L: 58

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "42"
	)
	float[] method6650() {
		float[] var1 = new float[3]; // L: 61
		if ((double)this.field4196[2] < 0.999D && (double)this.field4196[2] > -0.999D) { // L: 62
			var1[1] = (float)(-Math.asin((double)this.field4196[2])); // L: 63
			double var2 = Math.cos((double)var1[1]); // L: 64
			var1[0] = (float)Math.atan2((double)this.field4196[6] / var2, (double)this.field4196[10] / var2); // L: 65
			var1[2] = (float)Math.atan2((double)this.field4196[1] / var2, (double)this.field4196[0] / var2); // L: 66
		} else {
			var1[0] = 0.0F; // L: 69
			var1[1] = (float)Math.atan2((double)this.field4196[2], 0.0D); // L: 70
			var1[2] = (float)Math.atan2((double)(-this.field4196[9]), (double)this.field4196[5]); // L: 71
		}

		return var1; // L: 73
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1676317150"
	)
	public float[] method6651() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4196[6])), 0.0F, 0.0F}; // L: 77 78
		double var2 = Math.cos((double)var1[0]); // L: 79
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 80
			var4 = (double)this.field4196[2]; // L: 81
			var6 = (double)this.field4196[10]; // L: 82
			double var8 = (double)this.field4196[4]; // L: 83
			double var10 = (double)this.field4196[5]; // L: 84
			var1[1] = (float)Math.atan2(var4, var6); // L: 85
			var1[2] = (float)Math.atan2(var8, var10); // L: 86
		} else {
			var4 = (double)this.field4196[1]; // L: 89
			var6 = (double)this.field4196[0]; // L: 90
			if (this.field4196[6] < 0.0F) { // L: 91
				var1[1] = (float)Math.atan2(var4, var6); // L: 92
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 95
			}

			var1[2] = 0.0F; // L: 97
		}

		return var1; // L: 99
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "525334950"
	)
	public void method6652() {
		this.field4196[0] = 1.0F; // L: 103
		this.field4196[1] = 0.0F; // L: 104
		this.field4196[2] = 0.0F; // L: 105
		this.field4196[3] = 0.0F; // L: 106
		this.field4196[4] = 0.0F; // L: 107
		this.field4196[5] = 1.0F; // L: 108
		this.field4196[6] = 0.0F; // L: 109
		this.field4196[7] = 0.0F; // L: 110
		this.field4196[8] = 0.0F; // L: 111
		this.field4196[9] = 0.0F; // L: 112
		this.field4196[10] = 1.0F; // L: 113
		this.field4196[11] = 0.0F; // L: 114
		this.field4196[12] = 0.0F; // L: 115
		this.field4196[13] = 0.0F; // L: 116
		this.field4196[14] = 0.0F; // L: 117
		this.field4196[15] = 1.0F; // L: 118
	} // L: 119

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1795899803"
	)
	public void method6708() {
		this.field4196[0] = 0.0F; // L: 122
		this.field4196[1] = 0.0F; // L: 123
		this.field4196[2] = 0.0F; // L: 124
		this.field4196[3] = 0.0F; // L: 125
		this.field4196[4] = 0.0F; // L: 126
		this.field4196[5] = 0.0F; // L: 127
		this.field4196[6] = 0.0F; // L: 128
		this.field4196[7] = 0.0F; // L: 129
		this.field4196[8] = 0.0F; // L: 130
		this.field4196[9] = 0.0F; // L: 131
		this.field4196[10] = 0.0F; // L: 132
		this.field4196[11] = 0.0F; // L: 133
		this.field4196[12] = 0.0F; // L: 134
		this.field4196[13] = 0.0F; // L: 135
		this.field4196[14] = 0.0F; // L: 136
		this.field4196[15] = 0.0F; // L: 137
	} // L: 138

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lno;I)V",
		garbageValue = "-1679840989"
	)
	public void method6654(class366 var1) {
		System.arraycopy(var1.field4196, 0, this.field4196, 0, 16); // L: 141
	} // L: 142

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-31"
	)
	public void method6655(float var1) {
		this.method6667(var1, var1, var1); // L: 145
	} // L: 146

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1410403960"
	)
	public void method6667(float var1, float var2, float var3) {
		this.method6652(); // L: 149
		this.field4196[0] = var1; // L: 150
		this.field4196[5] = var2; // L: 151
		this.field4196[10] = var3; // L: 152
	} // L: 153

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lno;S)V",
		garbageValue = "-15383"
	)
	public void method6657(class366 var1) {
		for (int var2 = 0; var2 < this.field4196.length; ++var2) { // L: 156
			float[] var10000 = this.field4196; // L: 157
			var10000[var2] += var1.field4196[var2];
		}

	} // L: 159

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lno;I)V",
		garbageValue = "1087473268"
	)
	public void method6670(class366 var1) {
		float var2 = this.field4196[1] * var1.field4196[4] + var1.field4196[0] * this.field4196[0] + this.field4196[2] * var1.field4196[8] + var1.field4196[12] * this.field4196[3]; // L: 162
		float var3 = var1.field4196[5] * this.field4196[1] + var1.field4196[1] * this.field4196[0] + this.field4196[2] * var1.field4196[9] + var1.field4196[13] * this.field4196[3]; // L: 163
		float var4 = var1.field4196[6] * this.field4196[1] + this.field4196[0] * var1.field4196[2] + var1.field4196[10] * this.field4196[2] + var1.field4196[14] * this.field4196[3]; // L: 164
		float var5 = var1.field4196[15] * this.field4196[3] + this.field4196[2] * var1.field4196[11] + this.field4196[1] * var1.field4196[7] + var1.field4196[3] * this.field4196[0]; // L: 165
		float var6 = this.field4196[4] * var1.field4196[0] + var1.field4196[4] * this.field4196[5] + this.field4196[6] * var1.field4196[8] + this.field4196[7] * var1.field4196[12]; // L: 166
		float var7 = var1.field4196[9] * this.field4196[6] + var1.field4196[5] * this.field4196[5] + this.field4196[4] * var1.field4196[1] + this.field4196[7] * var1.field4196[13]; // L: 167
		float var8 = this.field4196[7] * var1.field4196[14] + this.field4196[5] * var1.field4196[6] + var1.field4196[2] * this.field4196[4] + this.field4196[6] * var1.field4196[10]; // L: 168
		float var9 = this.field4196[5] * var1.field4196[7] + this.field4196[4] * var1.field4196[3] + this.field4196[6] * var1.field4196[11] + this.field4196[7] * var1.field4196[15]; // L: 169
		float var10 = var1.field4196[12] * this.field4196[11] + this.field4196[10] * var1.field4196[8] + var1.field4196[0] * this.field4196[8] + this.field4196[9] * var1.field4196[4]; // L: 170
		float var11 = var1.field4196[5] * this.field4196[9] + this.field4196[8] * var1.field4196[1] + var1.field4196[9] * this.field4196[10] + this.field4196[11] * var1.field4196[13]; // L: 171
		float var12 = var1.field4196[10] * this.field4196[10] + this.field4196[8] * var1.field4196[2] + this.field4196[9] * var1.field4196[6] + this.field4196[11] * var1.field4196[14]; // L: 172
		float var13 = this.field4196[8] * var1.field4196[3] + this.field4196[9] * var1.field4196[7] + var1.field4196[11] * this.field4196[10] + this.field4196[11] * var1.field4196[15]; // L: 173
		float var14 = var1.field4196[8] * this.field4196[14] + var1.field4196[4] * this.field4196[13] + this.field4196[12] * var1.field4196[0] + var1.field4196[12] * this.field4196[15]; // L: 174
		float var15 = var1.field4196[13] * this.field4196[15] + this.field4196[12] * var1.field4196[1] + var1.field4196[5] * this.field4196[13] + this.field4196[14] * var1.field4196[9]; // L: 175
		float var16 = this.field4196[14] * var1.field4196[10] + var1.field4196[6] * this.field4196[13] + this.field4196[12] * var1.field4196[2] + this.field4196[15] * var1.field4196[14]; // L: 176
		float var17 = var1.field4196[15] * this.field4196[15] + var1.field4196[11] * this.field4196[14] + var1.field4196[7] * this.field4196[13] + this.field4196[12] * var1.field4196[3]; // L: 177
		this.field4196[0] = var2; // L: 178
		this.field4196[1] = var3; // L: 179
		this.field4196[2] = var4; // L: 180
		this.field4196[3] = var5; // L: 181
		this.field4196[4] = var6; // L: 182
		this.field4196[5] = var7; // L: 183
		this.field4196[6] = var8; // L: 184
		this.field4196[7] = var9; // L: 185
		this.field4196[8] = var10; // L: 186
		this.field4196[9] = var11; // L: 187
		this.field4196[10] = var12; // L: 188
		this.field4196[11] = var13; // L: 189
		this.field4196[12] = var14; // L: 190
		this.field4196[13] = var15; // L: 191
		this.field4196[14] = var16; // L: 192
		this.field4196[15] = var17; // L: 193
	} // L: 194

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lns;B)V",
		garbageValue = "-62"
	)
	public void method6711(class365 var1) {
		float var2 = var1.field4183 * var1.field4183; // L: 197
		float var3 = var1.field4183 * var1.field4186; // L: 198
		float var4 = var1.field4188 * var1.field4183; // L: 199
		float var5 = var1.field4183 * var1.field4187; // L: 200
		float var6 = var1.field4186 * var1.field4186; // L: 201
		float var7 = var1.field4188 * var1.field4186; // L: 202
		float var8 = var1.field4186 * var1.field4187; // L: 203
		float var9 = var1.field4188 * var1.field4188; // L: 204
		float var10 = var1.field4188 * var1.field4187; // L: 205
		float var11 = var1.field4187 * var1.field4187; // L: 206
		this.field4196[0] = var6 + var2 - var11 - var9; // L: 207
		this.field4196[1] = var7 + var7 + var5 + var5; // L: 208
		this.field4196[2] = var8 - var4 - var4 + var8; // L: 209
		this.field4196[4] = var7 + (var7 - var5 - var5); // L: 210
		this.field4196[5] = var9 + var2 - var6 - var11; // L: 211
		this.field4196[6] = var3 + var10 + var3 + var10; // L: 212
		this.field4196[8] = var8 + var4 + var8 + var4; // L: 213
		this.field4196[9] = var10 + (var10 - var3 - var3); // L: 214
		this.field4196[10] = var11 + var2 - var9 - var6; // L: 215
	} // L: 216

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)V",
		garbageValue = "-7"
	)
	void method6713(class367 var1) {
		this.field4196[0] = var1.field4197; // L: 219
		this.field4196[1] = var1.field4198; // L: 220
		this.field4196[2] = var1.field4199; // L: 221
		this.field4196[3] = 0.0F; // L: 222
		this.field4196[4] = var1.field4200; // L: 223
		this.field4196[5] = var1.field4201; // L: 224
		this.field4196[6] = var1.field4202; // L: 225
		this.field4196[7] = 0.0F; // L: 226
		this.field4196[8] = var1.field4204; // L: 227
		this.field4196[9] = var1.field4203; // L: 228
		this.field4196[10] = var1.field4205; // L: 229
		this.field4196[11] = 0.0F; // L: 230
		this.field4196[12] = var1.field4206; // L: 231
		this.field4196[13] = var1.field4207; // L: 232
		this.field4196[14] = var1.field4208; // L: 233
		this.field4196[15] = 1.0F; // L: 234
	} // L: 235

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "115"
	)
	float method6679() {
		return this.field4196[8] * this.field4196[3] * this.field4196[5] * this.field4196[14] + this.field4196[13] * this.field4196[8] * this.field4196[2] * this.field4196[7] + this.field4196[12] * this.field4196[2] * this.field4196[5] * this.field4196[11] + (this.field4196[15] * this.field4196[9] * this.field4196[2] * this.field4196[4] + this.field4196[6] * this.field4196[0] * this.field4196[11] * this.field4196[13] + (this.field4196[5] * this.field4196[0] * this.field4196[10] * this.field4196[15] - this.field4196[14] * this.field4196[5] * this.field4196[0] * this.field4196[11] - this.field4196[9] * this.field4196[0] * this.field4196[6] * this.field4196[15]) + this.field4196[14] * this.field4196[9] * this.field4196[7] * this.field4196[0] - this.field4196[13] * this.field4196[7] * this.field4196[0] * this.field4196[10] - this.field4196[15] * this.field4196[10] * this.field4196[4] * this.field4196[1] + this.field4196[14] * this.field4196[11] * this.field4196[1] * this.field4196[4] + this.field4196[15] * this.field4196[8] * this.field4196[6] * this.field4196[1] - this.field4196[11] * this.field4196[6] * this.field4196[1] * this.field4196[12] - this.field4196[7] * this.field4196[1] * this.field4196[8] * this.field4196[14] + this.field4196[12] * this.field4196[10] * this.field4196[1] * this.field4196[7] - this.field4196[11] * this.field4196[4] * this.field4196[2] * this.field4196[13] - this.field4196[15] * this.field4196[5] * this.field4196[2] * this.field4196[8]) - this.field4196[2] * this.field4196[7] * this.field4196[9] * this.field4196[12] - this.field4196[3] * this.field4196[4] * this.field4196[9] * this.field4196[14] + this.field4196[10] * this.field4196[3] * this.field4196[4] * this.field4196[13] - this.field4196[10] * this.field4196[5] * this.field4196[3] * this.field4196[12] - this.field4196[3] * this.field4196[6] * this.field4196[8] * this.field4196[13] + this.field4196[3] * this.field4196[6] * this.field4196[9] * this.field4196[12]; // L: 238
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "817560716"
	)
	public void method6678() {
		float var1 = 1.0F / this.method6679(); // L: 242
		float var2 = var1 * (this.field4196[15] * this.field4196[5] * this.field4196[10] - this.field4196[14] * this.field4196[5] * this.field4196[11] - this.field4196[6] * this.field4196[9] * this.field4196[15] + this.field4196[13] * this.field4196[6] * this.field4196[11] + this.field4196[9] * this.field4196[7] * this.field4196[14] - this.field4196[10] * this.field4196[7] * this.field4196[13]); // L: 243
		float var3 = (this.field4196[9] * this.field4196[2] * this.field4196[15] + this.field4196[14] * this.field4196[11] * this.field4196[1] + -this.field4196[1] * this.field4196[10] * this.field4196[15] - this.field4196[13] * this.field4196[2] * this.field4196[11] - this.field4196[14] * this.field4196[9] * this.field4196[3] + this.field4196[13] * this.field4196[3] * this.field4196[10]) * var1; // L: 244
		float var4 = var1 * (this.field4196[15] * this.field4196[1] * this.field4196[6] - this.field4196[7] * this.field4196[1] * this.field4196[14] - this.field4196[2] * this.field4196[5] * this.field4196[15] + this.field4196[13] * this.field4196[7] * this.field4196[2] + this.field4196[14] * this.field4196[5] * this.field4196[3] - this.field4196[3] * this.field4196[6] * this.field4196[13]); // L: 245
		float var5 = (this.field4196[6] * this.field4196[3] * this.field4196[9] + (this.field4196[11] * this.field4196[2] * this.field4196[5] + this.field4196[10] * this.field4196[7] * this.field4196[1] + this.field4196[6] * -this.field4196[1] * this.field4196[11] - this.field4196[9] * this.field4196[7] * this.field4196[2] - this.field4196[5] * this.field4196[3] * this.field4196[10])) * var1; // L: 246
		float var6 = var1 * (this.field4196[8] * this.field4196[6] * this.field4196[15] + this.field4196[11] * this.field4196[4] * this.field4196[14] + -this.field4196[4] * this.field4196[10] * this.field4196[15] - this.field4196[6] * this.field4196[11] * this.field4196[12] - this.field4196[8] * this.field4196[7] * this.field4196[14] + this.field4196[12] * this.field4196[10] * this.field4196[7]); // L: 247
		float var7 = var1 * (this.field4196[15] * this.field4196[0] * this.field4196[10] - this.field4196[14] * this.field4196[11] * this.field4196[0] - this.field4196[15] * this.field4196[8] * this.field4196[2] + this.field4196[11] * this.field4196[2] * this.field4196[12] + this.field4196[14] * this.field4196[8] * this.field4196[3] - this.field4196[3] * this.field4196[10] * this.field4196[12]); // L: 248
		float var8 = var1 * (this.field4196[15] * this.field4196[4] * this.field4196[2] + this.field4196[0] * this.field4196[7] * this.field4196[14] + this.field4196[6] * -this.field4196[0] * this.field4196[15] - this.field4196[7] * this.field4196[2] * this.field4196[12] - this.field4196[4] * this.field4196[3] * this.field4196[14] + this.field4196[12] * this.field4196[3] * this.field4196[6]); // L: 249
		float var9 = (this.field4196[2] * this.field4196[7] * this.field4196[8] + (this.field4196[11] * this.field4196[0] * this.field4196[6] - this.field4196[10] * this.field4196[0] * this.field4196[7] - this.field4196[11] * this.field4196[2] * this.field4196[4]) + this.field4196[10] * this.field4196[4] * this.field4196[3] - this.field4196[3] * this.field4196[6] * this.field4196[8]) * var1; // L: 250
		float var10 = var1 * (this.field4196[4] * this.field4196[9] * this.field4196[15] - this.field4196[13] * this.field4196[4] * this.field4196[11] - this.field4196[15] * this.field4196[5] * this.field4196[8] + this.field4196[12] * this.field4196[5] * this.field4196[11] + this.field4196[13] * this.field4196[7] * this.field4196[8] - this.field4196[7] * this.field4196[9] * this.field4196[12]); // L: 251
		float var11 = var1 * (this.field4196[15] * this.field4196[1] * this.field4196[8] + this.field4196[13] * this.field4196[0] * this.field4196[11] + this.field4196[15] * this.field4196[9] * -this.field4196[0] - this.field4196[11] * this.field4196[1] * this.field4196[12] - this.field4196[3] * this.field4196[8] * this.field4196[13] + this.field4196[12] * this.field4196[9] * this.field4196[3]); // L: 252
		float var12 = var1 * (this.field4196[13] * this.field4196[3] * this.field4196[4] + this.field4196[0] * this.field4196[5] * this.field4196[15] - this.field4196[0] * this.field4196[7] * this.field4196[13] - this.field4196[15] * this.field4196[4] * this.field4196[1] + this.field4196[7] * this.field4196[1] * this.field4196[12] - this.field4196[12] * this.field4196[3] * this.field4196[5]); // L: 253
		float var13 = var1 * (this.field4196[11] * this.field4196[4] * this.field4196[1] + this.field4196[9] * this.field4196[0] * this.field4196[7] + this.field4196[11] * -this.field4196[0] * this.field4196[5] - this.field4196[8] * this.field4196[1] * this.field4196[7] - this.field4196[9] * this.field4196[3] * this.field4196[4] + this.field4196[8] * this.field4196[5] * this.field4196[3]); // L: 254
		float var14 = (this.field4196[12] * this.field4196[9] * this.field4196[6] + (this.field4196[5] * this.field4196[8] * this.field4196[14] + this.field4196[10] * this.field4196[4] * this.field4196[13] + this.field4196[9] * -this.field4196[4] * this.field4196[14] - this.field4196[5] * this.field4196[10] * this.field4196[12] - this.field4196[6] * this.field4196[8] * this.field4196[13])) * var1; // L: 255
		float var15 = (this.field4196[13] * this.field4196[8] * this.field4196[2] + this.field4196[12] * this.field4196[10] * this.field4196[1] + (this.field4196[9] * this.field4196[0] * this.field4196[14] - this.field4196[13] * this.field4196[0] * this.field4196[10] - this.field4196[8] * this.field4196[1] * this.field4196[14]) - this.field4196[12] * this.field4196[2] * this.field4196[9]) * var1; // L: 256
		float var16 = var1 * (this.field4196[5] * this.field4196[2] * this.field4196[12] + (this.field4196[4] * this.field4196[1] * this.field4196[14] + this.field4196[0] * this.field4196[6] * this.field4196[13] + this.field4196[5] * -this.field4196[0] * this.field4196[14] - this.field4196[12] * this.field4196[1] * this.field4196[6] - this.field4196[13] * this.field4196[4] * this.field4196[2])); // L: 257
		float var17 = (this.field4196[9] * this.field4196[2] * this.field4196[4] + this.field4196[8] * this.field4196[6] * this.field4196[1] + (this.field4196[0] * this.field4196[5] * this.field4196[10] - this.field4196[6] * this.field4196[0] * this.field4196[9] - this.field4196[10] * this.field4196[4] * this.field4196[1]) - this.field4196[8] * this.field4196[2] * this.field4196[5]) * var1; // L: 258
		this.field4196[0] = var2; // L: 259
		this.field4196[1] = var3; // L: 260
		this.field4196[2] = var4; // L: 261
		this.field4196[3] = var5; // L: 262
		this.field4196[4] = var6; // L: 263
		this.field4196[5] = var7; // L: 264
		this.field4196[6] = var8; // L: 265
		this.field4196[7] = var9; // L: 266
		this.field4196[8] = var10; // L: 267
		this.field4196[9] = var11; // L: 268
		this.field4196[10] = var12; // L: 269
		this.field4196[11] = var13; // L: 270
		this.field4196[12] = var14; // L: 271
		this.field4196[13] = var15; // L: 272
		this.field4196[14] = var16; // L: 273
		this.field4196[15] = var17; // L: 274
	} // L: 275

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(S)[F",
		garbageValue = "768"
	)
	public float[] method6663() {
		float[] var1 = new float[3]; // L: 312
		class364 var2 = new class364(this.field4196[0], this.field4196[1], this.field4196[2]); // L: 313
		class364 var3 = new class364(this.field4196[4], this.field4196[5], this.field4196[6]); // L: 314
		class364 var4 = new class364(this.field4196[8], this.field4196[9], this.field4196[10]); // L: 315
		var1[0] = var2.method6618(); // L: 316
		var1[1] = var3.method6618(); // L: 317
		var1[2] = var4.method6618(); // L: 318
		return var1; // L: 319
	}

	public int hashCode() {
		boolean var1 = true; // L: 297
		byte var2 = 1; // L: 298
		int var3 = 31 * var2 + Arrays.hashCode(this.field4196); // L: 299
		return var3; // L: 300
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class366)) { // L: 305
			return false;
		} else {
			class366 var2 = (class366)var1; // L: 306

			for (int var3 = 0; var3 < 16; ++var3) { // L: 307
				if (this.field4196[var3] != var2.field4196[var3]) {
					return false;
				}
			}

			return true; // L: 308
		}
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 280
		this.method6651(); // L: 281
		this.method6650(); // L: 282

		for (int var2 = 0; var2 < 4; ++var2) { // L: 283
			for (int var3 = 0; var3 < 4; ++var3) { // L: 284
				if (var3 > 0) {
					var1.append("\t"); // L: 285
				}

				float var4 = this.field4196[var3 + var2 * 4]; // L: 286
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 287
					var4 = 0.0F;
				}

				var1.append(var4); // L: 288
			}

			var1.append("\n"); // L: 290
		}

		return var1.toString(); // L: 292
	}
}
