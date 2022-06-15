import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("Huffman")
public class Huffman {
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("c")
	@Export("masks")
	int[] masks;
	@ObfuscatedName("v")
	@Export("bits")
	byte[] bits;
	@ObfuscatedName("q")
	@Export("keys")
	int[] keys;

	public Huffman(byte[] var1) {
		int var2 = var1.length; // L: 9
		this.masks = new int[var2]; // L: 10
		this.bits = var1; // L: 11
		int[] var3 = new int[33]; // L: 12
		this.keys = new int[8]; // L: 13
		int var4 = 0; // L: 14

		for (int var5 = 0; var5 < var2; ++var5) { // L: 15
			byte var6 = var1[var5]; // L: 16
			if (var6 != 0) { // L: 17
				int var7 = 1 << 32 - var6; // L: 18
				int var8 = var3[var6]; // L: 19
				this.masks[var5] = var8; // L: 20
				int var9;
				int var10;
				int var11;
				int var12;
				if ((var8 & var7) != 0) { // L: 22
					var9 = var3[var6 - 1];
				} else {
					var9 = var8 | var7; // L: 24

					for (var10 = var6 - 1; var10 >= 1; --var10) { // L: 25
						var11 = var3[var10]; // L: 26
						if (var8 != var11) { // L: 27
							break;
						}

						var12 = 1 << 32 - var10; // L: 28
						if ((var11 & var12) != 0) { // L: 29
							var3[var10] = var3[var10 - 1]; // L: 30
							break;
						}

						var3[var10] = var11 | var12; // L: 33
					}
				}

				var3[var6] = var9; // L: 38

				for (var10 = var6 + 1; var10 <= 32; ++var10) { // L: 39
					if (var8 == var3[var10]) { // L: 40
						var3[var10] = var9;
					}
				}

				var10 = 0; // L: 42

				for (var11 = 0; var11 < var6; ++var11) { // L: 43
					var12 = Integer.MIN_VALUE >>> var11; // L: 44
					if ((var8 & var12) != 0) { // L: 45
						if (this.keys[var10] == 0) { // L: 46
							this.keys[var10] = var4;
						}

						var10 = this.keys[var10]; // L: 47
					} else {
						++var10; // L: 49
					}

					if (var10 >= this.keys.length) { // L: 50
						int[] var13 = new int[this.keys.length * 2]; // L: 51

						for (int var14 = 0; var14 < this.keys.length; ++var14) { // L: 52
							var13[var14] = this.keys[var14];
						}

						this.keys = var13; // L: 53
					}

					var12 >>>= 1; // L: 55
				}

				this.keys[var10] = ~var5; // L: 57
				if (var10 >= var4) { // L: 58
					var4 = var10 + 1;
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BII[BIB)I",
		garbageValue = "-98"
	)
	@Export("compress")
	int compress(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0; // L: 63
		int var7 = var5 << 3;

		for (var3 += var2; var2 < var3; ++var2) {
			int var8 = var1[var2] & 255;
			int var9 = this.masks[var8]; // L: 68
			byte var10 = this.bits[var8];
			if (var10 == 0) {
				throw new RuntimeException("" + var8);
			}

			int var11 = var7 >> 3;
			int var12 = var7 & 7;
			var6 &= -var12 >> 31; // L: 73
			int var13 = (var12 + var10 - 1 >> 3) + var11;
			var12 += 24;
			var4[var11] = (byte)(var6 |= var9 >>> var12);
			if (var11 < var13) { // L: 78
				++var11; // L: 79
				var12 -= 8;
				var4[var11] = (byte)(var6 = var9 >>> var12); // L: 81
				if (var11 < var13) { // L: 82
					++var11; // L: 83
					var12 -= 8; // L: 84
					var4[var11] = (byte)(var6 = var9 >>> var12); // L: 85
					if (var11 < var13) { // L: 86
						++var11; // L: 87
						var12 -= 8; // L: 88
						var4[var11] = (byte)(var6 = var9 >>> var12); // L: 89
						if (var11 < var13) { // L: 90
							++var11; // L: 91
							var12 -= 8; // L: 92
							var4[var11] = (byte)(var6 = var9 << -var12); // L: 93
						}
					}
				}
			}

			var7 += var10; // L: 95
		}

		return (var7 + 7 >> 3) - var5; // L: 97
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI[BIII)I",
		garbageValue = "669033826"
	)
	@Export("decompress")
	int decompress(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (var5 == 0) { // L: 101
			return 0;
		} else {
			int var6 = 0; // L: 102
			var5 += var4; // L: 103
			int var7 = var2;

			while (true) {
				byte var8 = var1[var7]; // L: 106
				if (var8 < 0) { // L: 108
					var6 = this.keys[var6];
				} else {
					++var6; // L: 109
				}

				int var9;
				if ((var9 = this.keys[var6]) < 0) { // L: 110
					var3[var4++] = (byte)(~var9); // L: 111
					if (var4 >= var5) { // L: 112
						break;
					}

					var6 = 0; // L: 113
				}

				if ((var8 & 64) != 0) { // L: 115
					var6 = this.keys[var6];
				} else {
					++var6; // L: 116
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 117
					var3[var4++] = (byte)(~var9); // L: 118
					if (var4 >= var5) { // L: 119
						break;
					}

					var6 = 0; // L: 120
				}

				if ((var8 & 32) != 0) { // L: 122
					var6 = this.keys[var6];
				} else {
					++var6; // L: 123
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 124
					var3[var4++] = (byte)(~var9); // L: 125
					if (var4 >= var5) { // L: 126
						break;
					}

					var6 = 0; // L: 127
				}

				if ((var8 & 16) != 0) { // L: 129
					var6 = this.keys[var6];
				} else {
					++var6; // L: 130
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 131
					var3[var4++] = (byte)(~var9); // L: 132
					if (var4 >= var5) { // L: 133
						break;
					}

					var6 = 0; // L: 134
				}

				if ((var8 & 8) != 0) { // L: 136
					var6 = this.keys[var6];
				} else {
					++var6; // L: 137
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 138
					var3[var4++] = (byte)(~var9); // L: 139
					if (var4 >= var5) { // L: 140
						break;
					}

					var6 = 0; // L: 141
				}

				if ((var8 & 4) != 0) { // L: 143
					var6 = this.keys[var6];
				} else {
					++var6; // L: 144
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 145
					var3[var4++] = (byte)(~var9); // L: 146
					if (var4 >= var5) { // L: 147
						break;
					}

					var6 = 0; // L: 148
				}

				if ((var8 & 2) != 0) { // L: 150
					var6 = this.keys[var6];
				} else {
					++var6; // L: 151
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 152
					var3[var4++] = (byte)(~var9); // L: 153
					if (var4 >= var5) { // L: 154
						break;
					}

					var6 = 0; // L: 155
				}

				if ((var8 & 1) != 0) {
					var6 = this.keys[var6]; // L: 157
				} else {
					++var6; // L: 158
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 159
					var3[var4++] = (byte)(~var9); // L: 160
					if (var4 >= var5) { // L: 161
						break;
					}

					var6 = 0; // L: 162
				}

				++var7; // L: 105
			}

			return var7 + 1 - var2; // L: 165
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Lbi;",
		garbageValue = "2027632889"
	)
	static Script method5480(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 60
		if (var2 != null) { // L: 61
			return var2; // L: 62
		} else {
			String var3 = String.valueOf(var0); // L: 64
			int var4 = class267.archive12.getGroupId(var3); // L: 65
			if (var4 == -1) { // L: 66
				return null; // L: 67
			} else {
				byte[] var5 = class267.archive12.takeFileFlat(var4); // L: 69
				if (var5 != null) { // L: 70
					if (var5.length <= 1) { // L: 71
						return null; // L: 72
					}

					var2 = class344.newScript(var5); // L: 74
					if (var2 != null) { // L: 75
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 76
						return var2; // L: 77
					}
				}

				return null; // L: 80
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1058305132"
	)
	static int method5474(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 867
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 868
		}
	}
}
