import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
@Implements("IsaacCipher")
public final class IsaacCipher {
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	static class3 field4266;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 140655543
	)
	@Export("valuesRemaining")
	int valuesRemaining;
	@ObfuscatedName("b")
	@Export("results")
	int[] results;
	@ObfuscatedName("e")
	@Export("mm")
	int[] mm;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 112204363
	)
	@Export("aa")
	int aa;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1322370453
	)
	@Export("bb")
	int bb;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1470929015
	)
	@Export("cc")
	int cc;

	public IsaacCipher(int[] var1) {
		this.mm = new int[256]; // L: 15
		this.results = new int[256]; // L: 16

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 17
			this.results[var2] = var1[var2]; // L: 18
		}

		this.method7102(); // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1779543758"
	)
	@Export("nextInt")
	public final int nextInt() {
		if (this.valuesRemaining == 0) { // L: 24
			this.generateMoreResults(); // L: 25
			this.valuesRemaining = 256; // L: 26
		}

		return this.results[--this.valuesRemaining]; // L: 28
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "493852824"
	)
	public final int method7100() {
		if (this.valuesRemaining == 0) { // L: 32
			this.generateMoreResults(); // L: 33
			this.valuesRemaining = 256; // L: 34
		}

		return this.results[this.valuesRemaining - 1]; // L: 36
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "56"
	)
	@Export("generateMoreResults")
	final void generateMoreResults() {
		this.bb += ++this.cc; // L: 43

		for (int var1 = 0; var1 < 256; ++var1) { // L: 44
			int var2 = this.mm[var1]; // L: 45
			if ((var1 & 2) == 0) { // L: 46
				if ((var1 & 1) == 0) { // L: 47
					this.aa ^= this.aa << 13;
				} else {
					this.aa ^= this.aa >>> 6; // L: 48
				}
			} else if ((var1 & 1) == 0) { // L: 51
				this.aa ^= this.aa << 2;
			} else {
				this.aa ^= this.aa >>> 16; // L: 52
			}

			this.aa += this.mm[var1 + 128 & 255]; // L: 54
			int var3;
			this.mm[var1] = var3 = this.mm[(var2 & 1020) >> 2] + this.aa + this.bb; // L: 55
			this.results[var1] = this.bb = this.mm[(var3 >> 8 & 1020) >> 2] + var2; // L: 56
		}

	} // L: 58

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "966648246"
	)
	final void method7102() {
		int var9 = -1640531527; // L: 70
		int var8 = -1640531527; // L: 71
		int var7 = -1640531527; // L: 72
		int var6 = -1640531527; // L: 73
		int var5 = -1640531527; // L: 74
		int var4 = -1640531527; // L: 75
		int var3 = -1640531527; // L: 76
		int var2 = -1640531527; // L: 77

		int var1;
		for (var1 = 0; var1 < 4; ++var1) { // L: 78
			var2 ^= var3 << 11; // L: 79
			var5 += var2; // L: 80
			var3 += var4; // L: 81
			var3 ^= var4 >>> 2; // L: 82
			var6 += var3; // L: 83
			var4 += var5; // L: 84
			var4 ^= var5 << 8; // L: 85
			var7 += var4; // L: 86
			var5 += var6; // L: 87
			var5 ^= var6 >>> 16; // L: 88
			var8 += var5; // L: 89
			var6 += var7; // L: 90
			var6 ^= var7 << 10; // L: 91
			var9 += var6; // L: 92
			var7 += var8; // L: 93
			var7 ^= var8 >>> 4; // L: 94
			var2 += var7; // L: 95
			var8 += var9; // L: 96
			var8 ^= var9 << 8; // L: 97
			var3 += var8; // L: 98
			var9 += var2; // L: 99
			var9 ^= var2 >>> 9; // L: 100
			var4 += var9; // L: 101
			var2 += var3; // L: 102
		}

		for (var1 = 0; var1 < 256; var1 += 8) { // L: 104
			var2 += this.results[var1]; // L: 105
			var3 += this.results[var1 + 1]; // L: 106
			var4 += this.results[var1 + 2]; // L: 107
			var5 += this.results[var1 + 3]; // L: 108
			var6 += this.results[var1 + 4]; // L: 109
			var7 += this.results[var1 + 5]; // L: 110
			var8 += this.results[var1 + 6]; // L: 111
			var9 += this.results[var1 + 7]; // L: 112
			var2 ^= var3 << 11; // L: 113
			var5 += var2; // L: 114
			var3 += var4; // L: 115
			var3 ^= var4 >>> 2; // L: 116
			var6 += var3; // L: 117
			var4 += var5; // L: 118
			var4 ^= var5 << 8; // L: 119
			var7 += var4; // L: 120
			var5 += var6; // L: 121
			var5 ^= var6 >>> 16; // L: 122
			var8 += var5; // L: 123
			var6 += var7; // L: 124
			var6 ^= var7 << 10; // L: 125
			var9 += var6; // L: 126
			var7 += var8; // L: 127
			var7 ^= var8 >>> 4; // L: 128
			var2 += var7; // L: 129
			var8 += var9; // L: 130
			var8 ^= var9 << 8; // L: 131
			var3 += var8; // L: 132
			var9 += var2; // L: 133
			var9 ^= var2 >>> 9; // L: 134
			var4 += var9; // L: 135
			var2 += var3; // L: 136
			this.mm[var1] = var2; // L: 137
			this.mm[var1 + 1] = var3; // L: 138
			this.mm[var1 + 2] = var4; // L: 139
			this.mm[var1 + 3] = var5; // L: 140
			this.mm[var1 + 4] = var6; // L: 141
			this.mm[var1 + 5] = var7; // L: 142
			this.mm[var1 + 6] = var8; // L: 143
			this.mm[var1 + 7] = var9; // L: 144
		}

		for (var1 = 0; var1 < 256; var1 += 8) { // L: 146
			var2 += this.mm[var1]; // L: 147
			var3 += this.mm[var1 + 1]; // L: 148
			var4 += this.mm[var1 + 2]; // L: 149
			var5 += this.mm[var1 + 3]; // L: 150
			var6 += this.mm[var1 + 4]; // L: 151
			var7 += this.mm[var1 + 5]; // L: 152
			var8 += this.mm[var1 + 6]; // L: 153
			var9 += this.mm[var1 + 7]; // L: 154
			var2 ^= var3 << 11; // L: 155
			var5 += var2; // L: 156
			var3 += var4; // L: 157
			var3 ^= var4 >>> 2; // L: 158
			var6 += var3; // L: 159
			var4 += var5; // L: 160
			var4 ^= var5 << 8; // L: 161
			var7 += var4; // L: 162
			var5 += var6; // L: 163
			var5 ^= var6 >>> 16; // L: 164
			var8 += var5; // L: 165
			var6 += var7; // L: 166
			var6 ^= var7 << 10; // L: 167
			var9 += var6; // L: 168
			var7 += var8; // L: 169
			var7 ^= var8 >>> 4; // L: 170
			var2 += var7; // L: 171
			var8 += var9; // L: 172
			var8 ^= var9 << 8; // L: 173
			var3 += var8; // L: 174
			var9 += var2; // L: 175
			var9 ^= var2 >>> 9; // L: 176
			var4 += var9; // L: 177
			var2 += var3; // L: 178
			this.mm[var1] = var2; // L: 179
			this.mm[var1 + 1] = var3; // L: 180
			this.mm[var1 + 2] = var4; // L: 181
			this.mm[var1 + 3] = var5; // L: 182
			this.mm[var1 + 4] = var6; // L: 183
			this.mm[var1 + 5] = var7; // L: 184
			this.mm[var1 + 6] = var8; // L: 185
			this.mm[var1 + 7] = var9; // L: 186
		}

		this.generateMoreResults(); // L: 188
		this.valuesRemaining = 256; // L: 189
	} // L: 190
}
