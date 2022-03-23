import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = 1198231863
	)
	static int field1608;
	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	static Widget[] field1622;
	@ObfuscatedName("o")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("h")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 3945145856419995181L
	)
	long field1607;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 618465929
	)
	int field1598;
	@ObfuscatedName("n")
	@Export("name")
	public String name;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1783912821
	)
	int field1594;
	@ObfuscatedName("f")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("u")
	public byte field1602;
	@ObfuscatedName("r")
	public byte field1603;
	@ObfuscatedName("k")
	public byte field1604;
	@ObfuscatedName("x")
	public byte field1613;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1908103089
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("j")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("p")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("s")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("b")
	int[] field1610;
	@ObfuscatedName("w")
	public int[] field1611;
	@ObfuscatedName("a")
	public boolean[] field1600;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1818610271
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1447317987
	)
	public int field1614;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1779654551
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("z")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("e")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("t")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lpd;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1598 = 0; // L: 14
		this.name = null; // L: 15
		this.field1594 = 0; // L: 16
		this.currentOwner = -1; // L: 29
		this.field1614 = -1; // L: 30
		this.method2931(var1); // L: 43
	} // L: 44

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-123"
	)
	void method2913(int var1) {
		if (this.useHashes) { // L: 47
			if (this.memberHashes != null) { // L: 48
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1]; // L: 49
			}
		}

		if (this.useNames) { // L: 51
			if (this.memberNames != null) { // L: 52
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1]; // L: 53
			}
		}

		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount); // L: 55
		} else {
			this.memberRanks = new byte[var1]; // L: 56
		}

		if (this.field1610 != null) { // L: 57
			System.arraycopy(this.field1610, 0, this.field1610 = new int[var1], 0, this.memberCount);
		} else {
			this.field1610 = new int[var1]; // L: 58
		}

		if (this.field1611 != null) { // L: 59
			System.arraycopy(this.field1611, 0, this.field1611 = new int[var1], 0, this.memberCount);
		} else {
			this.field1611 = new int[var1]; // L: 60
		}

		if (this.field1600 != null) {
			System.arraycopy(this.field1600, 0, this.field1600 = new boolean[var1], 0, this.memberCount); // L: 61
		} else {
			this.field1600 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "9"
	)
	void method2973(int var1) {
		if (this.useHashes) { // L: 66
			if (this.bannedMemberHashes != null) { // L: 67
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount);
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1580381638"
	)
	public int method2979(String var1) {
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1226760366"
	)
	public int method2915(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field1610[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Integer;",
		garbageValue = "-18"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "11"
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
			WorldMapData_0.method4518(var1, var3, 0, var1.length - 1); // L: 107
		}

		return this.sortedMembers; // L: 110
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "1792170403"
	)
	void method2918(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 114
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 115
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 116
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 117
				this.method2913(this.memberCount + 5);
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

			this.field1610[this.memberCount] = 0; // L: 127
			this.field1611[this.memberCount] = var4; // L: 128
			this.field1600[this.memberCount] = false; // L: 129
			++this.memberCount; // L: 130
			this.sortedMembers = null; // L: 131
		}
	} // L: 132

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method2919(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) { // L: 135
			--this.memberCount; // L: 136
			this.sortedMembers = null; // L: 137
			if (this.memberCount == 0) { // L: 138
				this.memberHashes = null; // L: 139
				this.memberNames = null; // L: 140
				this.memberRanks = null; // L: 141
				this.field1610 = null; // L: 142
				this.field1611 = null; // L: 143
				this.field1600 = null; // L: 144
				this.currentOwner = -1; // L: 145
				this.field1614 = -1; // L: 146
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 149
				System.arraycopy(this.field1610, var1 + 1, this.field1610, var1, this.memberCount - var1); // L: 150
				System.arraycopy(this.field1611, var1 + 1, this.field1611, var1, this.memberCount - var1); // L: 151
				System.arraycopy(this.field1600, var1 + 1, this.field1600, var1, this.memberCount - var1); // L: 152
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "56399515"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 160
			this.currentOwner = -1; // L: 161
			this.field1614 = -1; // L: 162
		} else {
			this.currentOwner = -1; // L: 165
			this.field1614 = -1; // L: 166
			int var1 = 0; // L: 167
			byte var2 = this.memberRanks[0]; // L: 168

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 169
				if (this.memberRanks[var3] > var2) { // L: 170
					if (var2 == 125) { // L: 171
						this.field1614 = var1;
					}

					var1 = var3; // L: 172
					var2 = this.memberRanks[var3]; // L: 173
				} else if (this.field1614 == -1 && this.memberRanks[var3] == 125) { // L: 175
					this.field1614 = var3; // L: 176
				}
			}

			this.currentOwner = var1; // L: 179
			if (this.currentOwner != -1) { // L: 180
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 163 181

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)V",
		garbageValue = "94"
	)
	void method2912(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 184
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 185
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) { // L: 186
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 187
				this.method2973(this.bannedMemberCount + 5);
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2044582624"
	)
	void method2922(int var1) {
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "2038770318"
	)
	int method2940(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 206
			if (this.currentOwner == var1 && (this.field1614 == -1 || this.memberRanks[this.field1614] < 125)) { // L: 207
				return -1;
			} else if (this.memberRanks[var1] == var2) { // L: 208
				return -1;
			} else {
				this.memberRanks[var1] = var2; // L: 209
				this.updateOwner(); // L: 210
				return var1; // L: 211
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-190759888"
	)
	boolean method2924(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 215
			this.memberRanks[this.currentOwner] = 125; // L: 216
			this.field1614 = this.currentOwner; // L: 217
			this.memberRanks[var1] = 126; // L: 218
			this.currentOwner = var1; // L: 219
			return true; // L: 220
		} else {
			return false;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-606065608"
	)
	int method2925(int var1, boolean var2) {
		if (this.field1600[var1] == var2) { // L: 224
			return -1;
		} else {
			this.field1600[var1] = var2; // L: 225
			return var1; // L: 226
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)I",
		garbageValue = "23318"
	)
	int method2926(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 230
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 231
		int var7 = var6 ^ var5; // L: 232
		var2 <<= var3; // L: 233
		var2 &= var7; // L: 234
		int var8 = this.field1610[var1]; // L: 235
		if ((var8 & var7) == var2) {
			return -1; // L: 236
		} else {
			var8 &= ~var7; // L: 237
			this.field1610[var1] = var8 | var2; // L: 238
			return var1; // L: 239
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "0"
	)
	boolean method2927(int var1, int var2) {
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "-101"
	)
	boolean method2928(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("w")
	boolean method2938(int var1, long var2) {
		if (this.parameters != null) { // L: 285
			Node var4 = this.parameters.get((long)var1); // L: 286
			if (var4 != null) { // L: 287
				if (var4 instanceof class406) { // L: 288
					class406 var5 = (class406)var4; // L: 289
					if (var5.field4407 == var2) { // L: 290
						return false;
					}

					var5.field4407 = var2; // L: 291
					return true; // L: 292
				}

				var4.remove(); // L: 294
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 297
		}

		this.parameters.put(new class406(var2), (long)var1); // L: 298
		return true; // L: 299
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "-529235235"
	)
	boolean method2956(int var1, String var2) {
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "18266587"
	)
	void method2931(Buffer var1) {
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

			this.field1598 = var1.readInt(); // L: 339
			this.field1594 = var1.readInt(); // L: 340
			if (var2 <= 3 && this.field1594 != 0) { // L: 341
				this.field1594 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 342
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 343
			this.name = var1.readStringCp1252NullTerminated(); // L: 344
			if (var2 >= 4) { // L: 345
				var1.readInt(); // L: 346
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 348
			this.field1602 = var1.readByte(); // L: 349
			this.field1603 = var1.readByte(); // L: 350
			this.field1604 = var1.readByte(); // L: 351
			this.field1613 = var1.readByte(); // L: 352
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

				if (this.field1610 == null || this.field1610.length < this.memberCount) { // L: 357
					this.field1610 = new int[this.memberCount];
				}

				if (this.field1611 == null || this.field1611.length < this.memberCount) { // L: 358
					this.field1611 = new int[this.memberCount];
				}

				if (this.field1600 == null || this.field1600.length < this.memberCount) { // L: 359
					this.field1600 = new boolean[this.memberCount];
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
						this.field1610[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 365
						this.field1611[var4] = var1.readUnsignedShort();
					} else {
						this.field1611[var4] = 0; // L: 366
					}

					if (var2 >= 6) { // L: 367
						this.field1600[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1600[var4] = false; // L: 368
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
					this.parameters = new IterableNodeHashTable(var4 < 16 ? Login.method1894(var4) : 16); // L: 383

					while (var4-- > 0) { // L: 384
						int var5 = var1.readInt(); // L: 385
						int var6 = var5 & 1073741823; // L: 386
						int var7 = var5 >>> 30; // L: 387
						if (var7 == 0) { // L: 388
							int var12 = var1.readInt(); // L: 389
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 390
						} else if (var7 == 1) { // L: 392
							long var10 = var1.readLong(); // L: 393
							this.parameters.put(new class406(var10), (long)var6); // L: 394
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpq;III)I",
		garbageValue = "1431232639"
	)
	static int method2976(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "([Lkn;II)V",
		garbageValue = "1847121175"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11119
			Widget var3 = var0[var2]; // L: 11120
			if (var3 != null) { // L: 11121
				if (var3.type == 0) { // L: 11122
					if (var3.children != null) { // L: 11123
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11124
					if (var4 != null) { // L: 11125
						MouseHandler.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11127
					var5 = new ScriptEvent(); // L: 11128
					var5.widget = var3; // L: 11129
					var5.args = var3.onDialogAbort; // L: 11130
					class1.runScriptEvent(var5); // L: 11131
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11133
					if (var3.childIndex >= 0) { // L: 11134
						Widget var6 = HorizontalAlignment.getWidget(var3.id); // L: 11135
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11136
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11140
					var5.widget = var3; // L: 11141
					var5.args = var3.onSubChange; // L: 11142
					class1.runScriptEvent(var5); // L: 11143
				}
			}
		}

	} // L: 11146
}
