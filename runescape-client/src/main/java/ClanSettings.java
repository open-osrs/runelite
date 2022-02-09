import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("cy")
	public static char field1610;
	@ObfuscatedName("l")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("s")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = 6193170943395029015L
	)
	long field1588;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 971129915
	)
	int field1589;
	@ObfuscatedName("o")
	@Export("name")
	public String name;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1750415559
	)
	int field1601;
	@ObfuscatedName("w")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("v")
	public byte field1593;
	@ObfuscatedName("a")
	public byte field1594;
	@ObfuscatedName("y")
	public byte field1595;
	@ObfuscatedName("u")
	public byte field1596;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -435152399
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("q")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("x")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("p")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("n")
	int[] field1585;
	@ObfuscatedName("m")
	public int[] field1602;
	@ObfuscatedName("d")
	public boolean[] field1611;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -98051531
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1722294379
	)
	public int field1591;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -755737021
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("t")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("k")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("b")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1589 = 0;
		this.name = null;
		this.field1601 = 0;
		this.currentOwner = -1;
		this.field1591 = -1;
		this.method2865(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1970785685"
	)
	void method2884(int var1) {
		if (this.useHashes) {
			if (this.memberHashes != null) { // L: 48
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1];
			}
		}

		if (this.useNames) {
			if (this.memberNames != null) {
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1];
			}
		}

		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount);
		} else {
			this.memberRanks = new byte[var1]; // L: 56
		}

		if (this.field1585 != null) {
			System.arraycopy(this.field1585, 0, this.field1585 = new int[var1], 0, this.memberCount);
		} else {
			this.field1585 = new int[var1];
		}

		if (this.field1602 != null) {
			System.arraycopy(this.field1602, 0, this.field1602 = new int[var1], 0, this.memberCount);
		} else {
			this.field1602 = new int[var1];
		}

		if (this.field1611 != null) {
			System.arraycopy(this.field1611, 0, this.field1611 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1611 = new boolean[var1];
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1754163591"
	)
	void method2863(int var1) {
		if (this.useHashes) { // L: 66
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount); // L: 67
			} else {
				this.bannedMemberHashes = new long[var1]; // L: 68
			}
		}

		if (this.useNames) { // L: 70
			if (this.bannedMemberNames != null) { // L: 71
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1]; // L: 72
			}
		}

	} // L: 74

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "2"
	)
	public int method2848(String var1) {
		if (var1 != null && var1.length() != 0) { // L: 77
			for (int var2 = 0; var2 < this.memberCount; ++var2) { // L: 78
				if (this.memberNames[var2].equals(var1)) { // L: 79
					return var2;
				}
			}

			return -1; // L: 81
		} else {
			return -1;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "939210927"
	)
	public int method2849(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field1585[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Integer;",
		garbageValue = "-31"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) { // L: 90
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1); // L: 91
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null; // L: 92 93
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1773630970"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 97
			String[] var1 = new String[this.memberCount]; // L: 98
			this.sortedMembers = new int[this.memberCount]; // L: 99

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) { // L: 100 103
				var1[var2] = this.memberNames[var2]; // L: 101
				if (var1[var2] != null) { // L: 102
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = this.sortedMembers; // L: 105
			UrlRequester.method2421(var1, var3, 0, var1.length - 1); // L: 107
		}

		return this.sortedMembers; // L: 110
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "-71576260"
	)
	void method2859(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 114
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 115
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 116
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 117
				this.method2884(this.memberCount + 5);
			}

			if (this.memberHashes != null) { // L: 118
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) { // L: 119
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) { // L: 120
				this.currentOwner = this.memberCount; // L: 121
				this.memberRanks[this.memberCount] = 126; // L: 122
			} else {
				this.memberRanks[this.memberCount] = 0; // L: 125
			}

			this.field1585[this.memberCount] = 0; // L: 127
			this.field1602[this.memberCount] = var4; // L: 128
			this.field1611[this.memberCount] = false; // L: 129
			++this.memberCount; // L: 130
			this.sortedMembers = null; // L: 131
		}
	} // L: 132

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "13"
	)
	void method2853(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) { // L: 135
			--this.memberCount; // L: 136
			this.sortedMembers = null; // L: 137
			if (this.memberCount == 0) { // L: 138
				this.memberHashes = null; // L: 139
				this.memberNames = null; // L: 140
				this.memberRanks = null; // L: 141
				this.field1585 = null; // L: 142
				this.field1602 = null; // L: 143
				this.field1611 = null; // L: 144
				this.currentOwner = -1; // L: 145
				this.field1591 = -1; // L: 146
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 149
				System.arraycopy(this.field1585, var1 + 1, this.field1585, var1, this.memberCount - var1); // L: 150
				System.arraycopy(this.field1602, var1 + 1, this.field1602, var1, this.memberCount - var1); // L: 151
				System.arraycopy(this.field1611, var1 + 1, this.field1611, var1, this.memberCount - var1); // L: 152
				if (this.memberHashes != null) { // L: 153
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) { // L: 154
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner(); // L: 155
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 157

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1023"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 160
			this.currentOwner = -1; // L: 161
			this.field1591 = -1; // L: 162
		} else {
			this.currentOwner = -1; // L: 165
			this.field1591 = -1; // L: 166
			int var1 = 0; // L: 167
			byte var2 = this.memberRanks[0]; // L: 168

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 169
				if (this.memberRanks[var3] > var2) { // L: 170
					if (var2 == 125) { // L: 171
						this.field1591 = var1;
					}

					var1 = var3; // L: 172
					var2 = this.memberRanks[var3]; // L: 173
				} else if (this.field1591 == -1 && this.memberRanks[var3] == 125) { // L: 175
					this.field1591 = var3; // L: 176
				}
			}

			this.currentOwner = var1; // L: 179
			if (this.currentOwner != -1) { // L: 180
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 163 181

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "1107072540"
	)
	void method2877(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 184
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 185
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 186
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 187
				this.method2863(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) { // L: 188
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) { // L: 189
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount; // L: 190
		}
	} // L: 191

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "619414228"
	)
	void method2856(int var1) {
		--this.bannedMemberCount; // L: 194
		if (this.bannedMemberCount == 0) { // L: 195
			this.bannedMemberHashes = null; // L: 196
			this.bannedMemberNames = null; // L: 197
		} else {
			if (this.bannedMemberHashes != null) { // L: 200
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1); // L: 201
			}
		}

	} // L: 203

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "-1088330284"
	)
	int method2857(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 206
			if (this.currentOwner == var1 && (this.field1591 == -1 || this.memberRanks[this.field1591] < 125)) { // L: 207
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1; // L: 208
			} else {
				this.memberRanks[var1] = var2; // L: 209
				this.updateOwner(); // L: 210
				return var1; // L: 211
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-227021511"
	)
	boolean method2858(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 215
			this.memberRanks[this.currentOwner] = 125; // L: 216
			this.field1591 = this.currentOwner; // L: 217
			this.memberRanks[var1] = 126; // L: 218
			this.currentOwner = var1; // L: 219
			return true; // L: 220
		} else {
			return false;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1665860662"
	)
	int method2883(int var1, boolean var2) {
		if (this.field1611[var1] == var2) { // L: 224
			return -1;
		} else {
			this.field1611[var1] = var2; // L: 225
			return var1; // L: 226
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1682375489"
	)
	int method2860(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 230
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 231
		int var7 = var6 ^ var5; // L: 232
		var2 <<= var3; // L: 233
		var2 &= var7; // L: 234
		int var8 = this.field1585[var1]; // L: 235
		if ((var8 & var7) == var2) {
			return -1; // L: 236
		} else {
			var8 &= ~var7; // L: 237
			this.field1585[var1] = var8 | var2; // L: 238
			return var1; // L: 239
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-608921907"
	)
	boolean method2882(int var1, int var2) {
		if (this.parameters != null) { // L: 243
			Node var3 = this.parameters.get((long)var1); // L: 244
			if (var3 != null) { // L: 245
				if (var3 instanceof IntegerNode) { // L: 246
					IntegerNode var4 = (IntegerNode)var3; // L: 247
					if (var2 == var4.integer) { // L: 248
						return false;
					}

					var4.integer = var2; // L: 249
					return true; // L: 250
				}

				var3.remove(); // L: 252
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 255
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 256
		return true; // L: 257
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "-83"
	)
	boolean method2862(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 261
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 262
		int var7 = var6 ^ var5; // L: 263
		var2 <<= var3; // L: 264
		var2 &= var7; // L: 265
		if (this.parameters != null) { // L: 266
			Node var8 = this.parameters.get((long)var1); // L: 267
			if (var8 != null) { // L: 268
				if (var8 instanceof IntegerNode) { // L: 269
					IntegerNode var9 = (IntegerNode)var8; // L: 270
					if ((var9.integer & var7) == var2) { // L: 271
						return false;
					}

					var9.integer &= ~var7; // L: 272
					var9.integer |= var2; // L: 273
					return true; // L: 274
				}

				var8.remove(); // L: 276
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 279
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 280
		return true; // L: 281
	}

	@ObfuscatedName("m")
	boolean method2869(int var1, long var2) {
		if (this.parameters != null) { // L: 285
			Node var4 = this.parameters.get((long)var1); // L: 286
			if (var4 != null) { // L: 287
				if (var4 instanceof class389) { // L: 288
					class389 var5 = (class389)var4; // L: 289
					if (var5.field4297 == var2) { // L: 290
						return false;
					}

					var5.field4297 = var2; // L: 291
					return true; // L: 292
				}

				var4.remove(); // L: 294
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 297
		}

		this.parameters.put(new class389(var2), (long)var1); // L: 298
		return true; // L: 299
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "1187187723"
	)
	boolean method2864(int var1, String var2) {
		if (var2 == null) { // L: 303
			var2 = "";
		} else if (var2.length() > 80) { // L: 304
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) { // L: 305
			Node var3 = this.parameters.get((long)var1); // L: 306
			if (var3 != null) { // L: 307
				if (var3 instanceof ObjectNode) { // L: 308
					ObjectNode var4 = (ObjectNode)var3; // L: 309
					if (var4.obj instanceof String) { // L: 310
						if (var2.equals(var4.obj)) { // L: 311
							return false;
						}

						var4.remove(); // L: 312
						this.parameters.put(new ObjectNode(var2), var4.key); // L: 313
						return true; // L: 314
					}
				}

				var3.remove(); // L: 317
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 320
		}

		this.parameters.put(new ObjectNode(var2), (long)var1); // L: 321
		return true; // L: 322
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "777712617"
	)
	void method2865(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 326
		if (var2 >= 1 && var2 <= 6) { // L: 327
			int var3 = var1.readUnsignedByte(); // L: 328
			if ((var3 & 1) != 0) { // L: 329
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) { // L: 330
				this.useNames = true;
			}

			if (!this.useHashes) { // L: 331
				this.memberHashes = null; // L: 332
				this.bannedMemberHashes = null; // L: 333
			}

			if (!this.useNames) { // L: 335
				this.memberNames = null; // L: 336
				this.bannedMemberNames = null; // L: 337
			}

			this.field1589 = var1.readInt(); // L: 339
			this.field1601 = var1.readInt(); // L: 340
			if (var2 <= 3 && this.field1601 != 0) { // L: 341
				this.field1601 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 342
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 343
			this.name = var1.readStringCp1252NullTerminated(); // L: 344
			if (var2 >= 4) { // L: 345
				var1.readInt(); // L: 346
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 348
			this.field1593 = var1.readByte(); // L: 349
			this.field1594 = var1.readByte(); // L: 350
			this.field1595 = var1.readByte(); // L: 351
			this.field1596 = var1.readByte(); // L: 352
			int var4;
			if (this.memberCount > 0) { // L: 353
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) { // L: 354
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) { // L: 355
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) { // L: 356
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1585 == null || this.field1585.length < this.memberCount) { // L: 357
					this.field1585 = new int[this.memberCount];
				}

				if (this.field1602 == null || this.field1602.length < this.memberCount) { // L: 358
					this.field1602 = new int[this.memberCount];
				}

				if (this.field1611 == null || this.field1611.length < this.memberCount) { // L: 359
					this.field1611 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) { // L: 360
					if (this.useHashes) { // L: 361
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 362
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte(); // L: 363
					if (var2 >= 2) { // L: 364
						this.field1585[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 365
						this.field1602[var4] = var1.readUnsignedShort();
					} else {
						this.field1602[var4] = 0; // L: 366
					}

					if (var2 >= 6) { // L: 367
						this.field1611[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1611[var4] = false; // L: 368
					}
				}

				this.updateOwner(); // L: 370
			}

			if (this.bannedMemberCount > 0) { // L: 372
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) { // L: 373
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) { // L: 374
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) { // L: 375
					if (this.useHashes) { // L: 376
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 377
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) { // L: 380
				var4 = var1.readUnsignedShort(); // L: 381
				if (var4 > 0) { // L: 382
					this.parameters = new IterableNodeHashTable(var4 < 16 ? GrandExchangeOfferNameComparator.method5702(var4) : 16); // L: 383

					while (var4-- > 0) { // L: 384
						int var5 = var1.readInt(); // L: 385
						int var6 = var5 & 1073741823; // L: 386
						int var7 = var5 >>> 30; // L: 387
						if (var7 == 0) { // L: 388
							int var12 = var1.readInt(); // L: 389
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 390
						} else if (var7 == 1) { // L: 392
							long var10 = var1.readLong(); // L: 393
							this.parameters.put(new class389(var10), (long)var6); // L: 394
						} else if (var7 == 2) { // L: 396
							String var8 = var1.readStringCp1252NullTerminated(); // L: 397
							this.parameters.put(new ObjectNode(var8), (long)var6); // L: 398
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 403

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Llu;B)I",
		garbageValue = "2"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			var7 = Skills.method5473(var9); // L: 33
			var8 = Skills.method5473(var10); // L: 34
			var9 = Players.standardizeChar(var9, var2); // L: 35
			var10 = Players.standardizeChar(var10, var2); // L: 36
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10); // L: 39
				if (var10 != var9) { // L: 40
					return UserComparator6.lowercaseChar(var9, var2) - UserComparator6.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 43

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) { // L: 44
			if (var2 == Language.Language_FR) { // L: 45
				var5 = var3 - 1 - var17; // L: 46
				var6 = var4 - 1 - var17; // L: 47
			} else {
				var6 = var17; // L: 49
				var5 = var17;
			}

			char var11 = var0.charAt(var5); // L: 50
			var12 = var1.charAt(var6); // L: 51
			if (var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11); // L: 53
				var12 = Character.toLowerCase(var12); // L: 54
				if (var12 != var11) {
					return UserComparator6.lowercaseChar(var11, var2) - UserComparator6.lowercaseChar(var12, var2); // L: 55
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) { // L: 59
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) {
				var12 = var0.charAt(var18); // L: 61
				char var13 = var1.charAt(var18);
				if (var13 != var12) {
					return UserComparator6.lowercaseChar(var12, var2) - UserComparator6.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 65
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "944928550"
	)
	static void method2903() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 57

		while (var0.hasNext()) { // L: 62
			Message var1 = (Message)var0.next(); // L: 58
			var1.clearIsFromFriend(); // L: 60
		}

	} // L: 63
}
