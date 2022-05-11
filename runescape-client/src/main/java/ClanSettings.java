import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("q")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("l")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -887635540627119073L
	)
	long field1635;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2108379547
	)
	int field1636;
	@ObfuscatedName("m")
	@Export("name")
	public String name;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2134617101
	)
	int field1638;
	@ObfuscatedName("s")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("r")
	public byte field1633;
	@ObfuscatedName("v")
	public byte field1641;
	@ObfuscatedName("y")
	public byte field1642;
	@ObfuscatedName("c")
	public byte field1648;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -224195769
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("b")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("t")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("g")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("x")
	int[] field1651;
	@ObfuscatedName("n")
	public int[] field1649;
	@ObfuscatedName("e")
	public boolean[] field1650;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2063830339
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2079411577
	)
	public int field1652;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 102858821
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("j")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("z")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("i")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lpx;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1636 = 0; // L: 14
		this.name = null; // L: 15
		this.field1638 = 0; // L: 16
		this.currentOwner = -1; // L: 29
		this.field1652 = -1; // L: 30
		this.method2901(var1); // L: 43
	} // L: 44

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method2882(int var1) {
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

		if (this.field1651 != null) { // L: 57
			System.arraycopy(this.field1651, 0, this.field1651 = new int[var1], 0, this.memberCount);
		} else {
			this.field1651 = new int[var1]; // L: 58
		}

		if (this.field1649 != null) { // L: 59
			System.arraycopy(this.field1649, 0, this.field1649 = new int[var1], 0, this.memberCount);
		} else {
			this.field1649 = new int[var1]; // L: 60
		}

		if (this.field1650 != null) { // L: 61
			System.arraycopy(this.field1650, 0, this.field1650 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1650 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1820150927"
	)
	void method2883(int var1) {
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2117273951"
	)
	public int method2884(String var1) {
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-126239409"
	)
	public int method2885(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field1651[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "-1977188561"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-861135746"
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

			class113.method2625(var1, this.sortedMembers); // L: 105
		}

		return this.sortedMembers; // L: 107
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "193395684"
	)
	void method2888(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 111
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 112
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) { // L: 113
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 114
				this.method2882(this.memberCount + 5);
			}

			if (this.memberHashes != null) { // L: 115
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) { // L: 116
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) { // L: 117
				this.currentOwner = this.memberCount; // L: 118
				this.memberRanks[this.memberCount] = 126; // L: 119
			} else {
				this.memberRanks[this.memberCount] = 0; // L: 122
			}

			this.field1651[this.memberCount] = 0; // L: 124
			this.field1649[this.memberCount] = var4; // L: 125
			this.field1650[this.memberCount] = false; // L: 126
			++this.memberCount; // L: 127
			this.sortedMembers = null; // L: 128
		}
	} // L: 129

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "41"
	)
	void method2926(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) { // L: 132
			--this.memberCount; // L: 133
			this.sortedMembers = null; // L: 134
			if (this.memberCount == 0) { // L: 135
				this.memberHashes = null; // L: 136
				this.memberNames = null; // L: 137
				this.memberRanks = null; // L: 138
				this.field1651 = null; // L: 139
				this.field1649 = null; // L: 140
				this.field1650 = null; // L: 141
				this.currentOwner = -1; // L: 142
				this.field1652 = -1; // L: 143
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 146
				System.arraycopy(this.field1651, var1 + 1, this.field1651, var1, this.memberCount - var1); // L: 147
				System.arraycopy(this.field1649, var1 + 1, this.field1649, var1, this.memberCount - var1); // L: 148
				System.arraycopy(this.field1650, var1 + 1, this.field1650, var1, this.memberCount - var1); // L: 149
				if (this.memberHashes != null) { // L: 150
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) { // L: 151
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner(); // L: 152
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 154

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1770256781"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 157
			this.currentOwner = -1; // L: 158
			this.field1652 = -1; // L: 159
		} else {
			this.currentOwner = -1; // L: 162
			this.field1652 = -1; // L: 163
			int var1 = 0; // L: 164
			byte var2 = this.memberRanks[0]; // L: 165

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 166
				if (this.memberRanks[var3] > var2) { // L: 167
					if (var2 == 125) { // L: 168
						this.field1652 = var1;
					}

					var1 = var3; // L: 169
					var2 = this.memberRanks[var3]; // L: 170
				} else if (this.field1652 == -1 && this.memberRanks[var3] == 125) { // L: 172
					this.field1652 = var3; // L: 173
				}
			}

			this.currentOwner = var1; // L: 176
			if (this.currentOwner != -1) { // L: 177
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 160 178

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)V",
		garbageValue = "1"
	)
	void method2891(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 181
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 182
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 183
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 184
				this.method2883(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) { // L: 185
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) { // L: 186
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount; // L: 187
		}
	} // L: 188

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-40246503"
	)
	void method2892(int var1) {
		--this.bannedMemberCount; // L: 191
		if (this.bannedMemberCount == 0) { // L: 192
			this.bannedMemberHashes = null; // L: 193
			this.bannedMemberNames = null; // L: 194
		} else {
			if (this.bannedMemberHashes != null) { // L: 197
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1); // L: 198
			}
		}

	} // L: 200

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "46712984"
	)
	int method2930(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 203
			if (this.currentOwner == var1 && (this.field1652 == -1 || this.memberRanks[this.field1652] < 125)) { // L: 204
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1; // L: 205
			} else {
				this.memberRanks[var1] = var2; // L: 206
				this.updateOwner(); // L: 207
				return var1; // L: 208
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2047746975"
	)
	boolean method2894(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 212
			this.memberRanks[this.currentOwner] = 125; // L: 213
			this.field1652 = this.currentOwner; // L: 214
			this.memberRanks[var1] = 126; // L: 215
			this.currentOwner = var1; // L: 216
			return true; // L: 217
		} else {
			return false;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1302763835"
	)
	int method2895(int var1, boolean var2) {
		if (this.field1650[var1] == var2) { // L: 221
			return -1;
		} else {
			this.field1650[var1] = var2; // L: 222
			return var1; // L: 223
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1423184573"
	)
	int method2896(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 227
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 228
		int var7 = var6 ^ var5; // L: 229
		var2 <<= var3; // L: 230
		var2 &= var7; // L: 231
		int var8 = this.field1651[var1]; // L: 232
		if ((var8 & var7) == var2) {
			return -1; // L: 233
		} else {
			var8 &= ~var7; // L: 234
			this.field1651[var1] = var8 | var2; // L: 235
			return var1; // L: 236
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1693351143"
	)
	boolean method2909(int var1, int var2) {
		if (this.parameters != null) { // L: 240
			Node var3 = this.parameters.get((long)var1); // L: 241
			if (var3 != null) { // L: 242
				if (var3 instanceof IntegerNode) { // L: 243
					IntegerNode var4 = (IntegerNode)var3; // L: 244
					if (var2 == var4.integer) { // L: 245
						return false;
					}

					var4.integer = var2; // L: 246
					return true; // L: 247
				}

				var3.remove(); // L: 249
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 252
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 253
		return true; // L: 254
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "55"
	)
	boolean method2898(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 258
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 259
		int var7 = var6 ^ var5; // L: 260
		var2 <<= var3; // L: 261
		var2 &= var7; // L: 262
		if (this.parameters != null) { // L: 263
			Node var8 = this.parameters.get((long)var1); // L: 264
			if (var8 != null) { // L: 265
				if (var8 instanceof IntegerNode) { // L: 266
					IntegerNode var9 = (IntegerNode)var8; // L: 267
					if ((var9.integer & var7) == var2) { // L: 268
						return false;
					}

					var9.integer &= ~var7; // L: 269
					var9.integer |= var2; // L: 270
					return true; // L: 271
				}

				var8.remove(); // L: 273
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 276
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 277
		return true; // L: 278
	}

	@ObfuscatedName("n")
	boolean method2889(int var1, long var2) {
		if (this.parameters != null) { // L: 282
			Node var4 = this.parameters.get((long)var1); // L: 283
			if (var4 != null) { // L: 284
				if (var4 instanceof class408) { // L: 285
					class408 var5 = (class408)var4; // L: 286
					if (var2 == var5.field4463) { // L: 287
						return false;
					}

					var5.field4463 = var2; // L: 288
					return true; // L: 289
				}

				var4.remove(); // L: 291
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 294
		}

		this.parameters.put(new class408(var2), (long)var1); // L: 295
		return true; // L: 296
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "-1953428658"
	)
	boolean method2900(int var1, String var2) {
		if (var2 == null) { // L: 300
			var2 = "";
		} else if (var2.length() > 80) { // L: 301
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) { // L: 302
			Node var3 = this.parameters.get((long)var1); // L: 303
			if (var3 != null) { // L: 304
				if (var3 instanceof ObjectNode) { // L: 305
					ObjectNode var4 = (ObjectNode)var3; // L: 306
					if (var4.obj instanceof String) { // L: 307
						if (var2.equals(var4.obj)) { // L: 308
							return false;
						}

						var4.remove(); // L: 309
						this.parameters.put(new ObjectNode(var2), var4.key); // L: 310
						return true; // L: 311
					}
				}

				var3.remove(); // L: 314
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 317
		}

		this.parameters.put(new ObjectNode(var2), (long)var1); // L: 318
		return true; // L: 319
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "-122"
	)
	void method2901(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 323
		if (var2 >= 1 && var2 <= 6) { // L: 324
			int var3 = var1.readUnsignedByte(); // L: 325
			if ((var3 & 1) != 0) { // L: 326
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) { // L: 327
				this.useNames = true;
			}

			if (!this.useHashes) { // L: 328
				this.memberHashes = null; // L: 329
				this.bannedMemberHashes = null; // L: 330
			}

			if (!this.useNames) { // L: 332
				this.memberNames = null; // L: 333
				this.bannedMemberNames = null; // L: 334
			}

			this.field1636 = var1.readInt(); // L: 336
			this.field1638 = var1.readInt(); // L: 337
			if (var2 <= 3 && this.field1638 != 0) { // L: 338
				this.field1638 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 339
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 340
			this.name = var1.readStringCp1252NullTerminated(); // L: 341
			if (var2 >= 4) { // L: 342
				var1.readInt(); // L: 343
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 345
			this.field1633 = var1.readByte(); // L: 346
			this.field1641 = var1.readByte(); // L: 347
			this.field1642 = var1.readByte(); // L: 348
			this.field1648 = var1.readByte(); // L: 349
			int var4;
			if (this.memberCount > 0) { // L: 350
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) { // L: 351
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) { // L: 352
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) { // L: 353
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1651 == null || this.field1651.length < this.memberCount) { // L: 354
					this.field1651 = new int[this.memberCount];
				}

				if (this.field1649 == null || this.field1649.length < this.memberCount) { // L: 355
					this.field1649 = new int[this.memberCount];
				}

				if (this.field1650 == null || this.field1650.length < this.memberCount) { // L: 356
					this.field1650 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) { // L: 357
					if (this.useHashes) { // L: 358
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 359
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte(); // L: 360
					if (var2 >= 2) { // L: 361
						this.field1651[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 362
						this.field1649[var4] = var1.readUnsignedShort();
					} else {
						this.field1649[var4] = 0; // L: 363
					}

					if (var2 >= 6) { // L: 364
						this.field1650[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1650[var4] = false; // L: 365
					}
				}

				this.updateOwner(); // L: 367
			}

			if (this.bannedMemberCount > 0) { // L: 369
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) { // L: 370
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) { // L: 371
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) { // L: 372
					if (this.useHashes) { // L: 373
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 374
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) { // L: 377
				var4 = var1.readUnsignedShort(); // L: 378
				if (var4 > 0) { // L: 379
					this.parameters = new IterableNodeHashTable(var4 < 16 ? FontName.method7228(var4) : 16); // L: 380

					while (var4-- > 0) { // L: 381
						int var5 = var1.readInt(); // L: 382
						int var6 = var5 & 1073741823; // L: 383
						int var7 = var5 >>> 30; // L: 384
						if (var7 == 0) { // L: 385
							int var12 = var1.readInt(); // L: 386
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 387
						} else if (var7 == 1) { // L: 389
							long var10 = var1.readLong(); // L: 390
							this.parameters.put(new class408(var10), (long)var6); // L: 391
						} else if (var7 == 2) { // L: 393
							String var8 = var1.readStringCp1252NullTerminated(); // L: 394
							this.parameters.put(new ObjectNode(var8), (long)var6); // L: 395
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 400

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	@Export("load")
	static void load() {
		int var19;
		if (Client.titleLoadingStage == 0) { // L: 1524
			class175.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1525

			for (var19 = 0; var19 < 4; ++var19) { // L: 1526
				Client.collisionMaps[var19] = new CollisionMap(104, 104);
			}

			InterfaceParent.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1527
			Login.Login_loadingText = "Starting game engine..."; // L: 1528
			Login.Login_loadingPercent = 5; // L: 1529
			Client.titleLoadingStage = 20; // L: 1530
		} else if (Client.titleLoadingStage == 20) { // L: 1533
			Login.Login_loadingText = "Prepared visibility map"; // L: 1534
			Login.Login_loadingPercent = 10; // L: 1535
			Client.titleLoadingStage = 30; // L: 1536
		} else if (Client.titleLoadingStage == 30) { // L: 1539
			NetSocket.archive0 = WorldMapRegion.newArchive(0, false, true, true); // L: 1540
			Clock.archive1 = WorldMapRegion.newArchive(1, false, true, true); // L: 1541
			class356.archive2 = WorldMapRegion.newArchive(2, true, false, true); // L: 1542
			class194.archive3 = WorldMapRegion.newArchive(3, false, true, true); // L: 1543
			MouseHandler.archive4 = WorldMapRegion.newArchive(4, false, true, true); // L: 1544
			Message.archive5 = WorldMapRegion.newArchive(5, true, true, true); // L: 1545
			AbstractUserComparator.archive6 = WorldMapRegion.newArchive(6, true, true, true); // L: 1546
			InterfaceParent.archive7 = WorldMapRegion.newArchive(7, false, true, true); // L: 1547
			class305.archive8 = WorldMapRegion.newArchive(8, false, true, true); // L: 1548
			TileItem.archive9 = WorldMapRegion.newArchive(9, false, true, true); // L: 1549
			ObjectSound.archive10 = WorldMapRegion.newArchive(10, false, true, true); // L: 1550
			UrlRequest.archive11 = WorldMapRegion.newArchive(11, false, true, true); // L: 1551
			class115.archive12 = WorldMapRegion.newArchive(12, false, true, true); // L: 1552
			class16.archive13 = WorldMapRegion.newArchive(13, true, false, true); // L: 1553
			class101.archive14 = WorldMapRegion.newArchive(14, false, true, true); // L: 1554
			Client.archive15 = WorldMapRegion.newArchive(15, false, true, true); // L: 1555
			class114.archive17 = WorldMapRegion.newArchive(17, true, true, true); // L: 1556
			class92.archive18 = WorldMapRegion.newArchive(18, false, true, true); // L: 1557
			VarpDefinition.archive19 = WorldMapRegion.newArchive(19, false, true, true); // L: 1558
			ItemContainer.archive20 = WorldMapRegion.newArchive(20, false, true, true); // L: 1559
			Login.Login_loadingText = "Connecting to update server"; // L: 1560
			Login.Login_loadingPercent = 20; // L: 1561
			Client.titleLoadingStage = 40; // L: 1562
		} else if (Client.titleLoadingStage == 40) { // L: 1565
			byte var33 = 0; // L: 1566
			var19 = var33 + NetSocket.archive0.percentage() * 4 / 100; // L: 1567
			var19 += Clock.archive1.percentage() * 4 / 100; // L: 1568
			var19 += class356.archive2.percentage() * 2 / 100; // L: 1569
			var19 += class194.archive3.percentage() * 2 / 100; // L: 1570
			var19 += MouseHandler.archive4.percentage() * 6 / 100; // L: 1571
			var19 += Message.archive5.percentage() * 4 / 100; // L: 1572
			var19 += AbstractUserComparator.archive6.percentage() * 2 / 100; // L: 1573
			var19 += InterfaceParent.archive7.percentage() * 56 / 100; // L: 1574
			var19 += class305.archive8.percentage() * 2 / 100; // L: 1575
			var19 += TileItem.archive9.percentage() * 2 / 100; // L: 1576
			var19 += ObjectSound.archive10.percentage() * 2 / 100; // L: 1577
			var19 += UrlRequest.archive11.percentage() * 2 / 100; // L: 1578
			var19 += class115.archive12.percentage() * 2 / 100; // L: 1579
			var19 += class16.archive13.percentage() * 2 / 100; // L: 1580
			var19 += class101.archive14.percentage() * 2 / 100; // L: 1581
			var19 += Client.archive15.percentage() * 2 / 100; // L: 1582
			var19 += VarpDefinition.archive19.percentage() / 100; // L: 1583
			var19 += class92.archive18.percentage() / 100; // L: 1584
			var19 += ItemContainer.archive20.percentage() / 100; // L: 1585
			var19 += class114.archive17.method5624() && class114.archive17.isFullyLoaded() ? 1 : 0; // L: 1586
			if (var19 != 100) { // L: 1587
				if (var19 != 0) { // L: 1588
					Login.Login_loadingText = "Checking for updates - " + var19 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1589
			} else {
				HealthBar.method2335(NetSocket.archive0, "Animations"); // L: 1592
				HealthBar.method2335(Clock.archive1, "Skeletons"); // L: 1593
				HealthBar.method2335(MouseHandler.archive4, "Sound FX"); // L: 1594
				HealthBar.method2335(Message.archive5, "Maps"); // L: 1595
				HealthBar.method2335(AbstractUserComparator.archive6, "Music Tracks"); // L: 1596
				HealthBar.method2335(InterfaceParent.archive7, "Models"); // L: 1597
				HealthBar.method2335(class305.archive8, "Sprites"); // L: 1598
				HealthBar.method2335(UrlRequest.archive11, "Music Jingles"); // L: 1599
				HealthBar.method2335(class101.archive14, "Music Samples"); // L: 1600
				HealthBar.method2335(Client.archive15, "Music Patches"); // L: 1601
				HealthBar.method2335(VarpDefinition.archive19, "World Map"); // L: 1602
				HealthBar.method2335(class92.archive18, "World Map Geography"); // L: 1603
				HealthBar.method2335(ItemContainer.archive20, "World Map Ground"); // L: 1604
				class28.spriteIds = new GraphicsDefaults(); // L: 1605
				class28.spriteIds.decode(class114.archive17); // L: 1606
				Login.Login_loadingText = "Loaded update list"; // L: 1607
				Login.Login_loadingPercent = 30; // L: 1608
				Client.titleLoadingStage = 45; // L: 1609
			}
		} else {
			Archive var2;
			Archive var23;
			Archive var30;
			if (Client.titleLoadingStage == 45) { // L: 1612
				WorldMapSprite.method4809(22050, !Client.isLowDetail, 2); // L: 1613
				MidiPcmStream var29 = new MidiPcmStream(); // L: 1614
				var29.method5151(9, 128); // L: 1615
				SecureRandomCallable.pcmPlayer0 = class271.method5045(GameEngine.taskHandler, 0, 22050); // L: 1616
				SecureRandomCallable.pcmPlayer0.setStream(var29); // L: 1617
				var30 = Client.archive15; // L: 1618
				var2 = class101.archive14; // L: 1619
				var23 = MouseHandler.archive4; // L: 1620
				class273.musicPatchesArchive = var30; // L: 1622
				class462.musicSamplesArchive = var2; // L: 1623
				class273.soundEffectsArchive = var23; // L: 1624
				class273.midiPcmStream = var29; // L: 1625
				Fonts.pcmPlayer1 = class271.method5045(GameEngine.taskHandler, 1, 2048); // L: 1627
				class122.pcmStreamMixer = new PcmStreamMixer(); // L: 1628
				Fonts.pcmPlayer1.setStream(class122.pcmStreamMixer); // L: 1629
				class403.decimator = new Decimator(22050, PcmPlayer.field300); // L: 1630
				Login.Login_loadingText = "Prepared sound engine"; // L: 1631
				Login.Login_loadingPercent = 35; // L: 1632
				Client.titleLoadingStage = 50; // L: 1633
				MouseHandler.WorldMapElement_fonts = new Fonts(class305.archive8, class16.archive13); // L: 1634
			} else if (Client.titleLoadingStage == 50) { // L: 1637
				var19 = FontName.method7232().length; // L: 1638
				Client.fontsMap = MouseHandler.WorldMapElement_fonts.createMap(FontName.method7232()); // L: 1639
				if (Client.fontsMap.size() < var19) { // L: 1640
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var19 + "%"; // L: 1641
					Login.Login_loadingPercent = 40; // L: 1642
				} else {
					Varcs.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1645
					class149.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1646
					ChatChannel.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1647
					class135.platformInfo = Client.platformInfoProvider.get(); // L: 1648
					Login.Login_loadingText = "Loaded fonts"; // L: 1649
					Login.Login_loadingPercent = 40; // L: 1650
					Client.titleLoadingStage = 60; // L: 1651
				}
			} else {
				int var20;
				if (Client.titleLoadingStage == 60) { // L: 1654
					var19 = DevicePcmPlayerProvider.method338(ObjectSound.archive10, class305.archive8); // L: 1655
					var20 = Login.field911.length + Login.field910.length; // L: 1658
					if (var19 < var20) { // L: 1661
						Login.Login_loadingText = "Loading title screen - " + var19 * 100 / var20 + "%"; // L: 1662
						Login.Login_loadingPercent = 50; // L: 1663
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1666
						Login.Login_loadingPercent = 50; // L: 1667
						PendingSpawn.updateGameState(5); // L: 1668
						Client.titleLoadingStage = 70; // L: 1669
					}
				} else if (Client.titleLoadingStage == 70) { // L: 1672
					if (!class356.archive2.isFullyLoaded()) { // L: 1673
						Login.Login_loadingText = "Loading config - " + class356.archive2.loadPercent() + "%"; // L: 1674
						Login.Login_loadingPercent = 60; // L: 1675
					} else {
						WorldMapLabelSize.method4417(class356.archive2); // L: 1678
						Archive var28 = class356.archive2; // L: 1679
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var28; // L: 1681
						JagexCache.method3154(class356.archive2, InterfaceParent.archive7); // L: 1683
						class93.method2392(class356.archive2, InterfaceParent.archive7, Client.isLowDetail); // L: 1684
						var30 = class356.archive2; // L: 1685
						var2 = InterfaceParent.archive7; // L: 1686
						NPCComposition.NpcDefinition_archive = var30; // L: 1688
						class17.NpcDefinition_modelArchive = var2; // L: 1689
						World.method1662(class356.archive2); // L: 1691
						var23 = class356.archive2; // L: 1692
						Archive var4 = InterfaceParent.archive7; // L: 1693
						boolean var24 = Client.isMembersWorld; // L: 1694
						Font var25 = Varcs.fontPlain11; // L: 1695
						ItemComposition.ItemDefinition_archive = var23; // L: 1697
						ItemComposition.ItemDefinition_modelArchive = var4; // L: 1698
						class82.ItemDefinition_inMembersWorld = var24; // L: 1699
						ItemContainer.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10); // L: 1700
						class146.ItemDefinition_fontPlain11 = var25; // L: 1701
						Archive var31 = class356.archive2; // L: 1703
						Archive var26 = NetSocket.archive0; // L: 1704
						Archive var32 = Clock.archive1; // L: 1705
						SequenceDefinition.SequenceDefinition_archive = var31; // L: 1707
						SequenceDefinition.SequenceDefinition_animationsArchive = var26; // L: 1708
						SequenceDefinition.SequenceDefinition_skeletonsArchive = var32; // L: 1709
						Archive var27 = class356.archive2; // L: 1711
						Archive var11 = InterfaceParent.archive7; // L: 1712
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var27; // L: 1714
						class175.SpotAnimationDefinition_modelArchive = var11; // L: 1715
						Archive var12 = class356.archive2; // L: 1717
						VarbitComposition.VarbitDefinition_archive = var12; // L: 1719
						Archive var13 = class356.archive2; // L: 1721
						VarpDefinition.VarpDefinition_archive = var13; // L: 1723
						VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1724
						Timer.method6381(class194.archive3, InterfaceParent.archive7, class305.archive8, class16.archive13); // L: 1726
						Archive var14 = class356.archive2; // L: 1727
						InvDefinition.InvDefinition_archive = var14; // L: 1729
						Archive var15 = class356.archive2; // L: 1731
						EnumComposition.EnumDefinition_archive = var15; // L: 1733
						Archive var16 = class356.archive2; // L: 1735
						VarcInt.VarcInt_archive = var16; // L: 1737
						class16.method179(class356.archive2); // L: 1739
						class305.method5592(class356.archive2); // L: 1740
						Login.HitSplatDefinition_cachedSprites = new class428(ApproximateRouteStrategy.field473, 54, class263.clientLanguage, class356.archive2); // L: 1741
						class221.HitSplatDefinition_cached = new class428(ApproximateRouteStrategy.field473, 47, class263.clientLanguage, class356.archive2); // L: 1742
						class125.varcs = new Varcs(); // L: 1743
						GameEngine.method505(class356.archive2, class305.archive8, class16.archive13); // L: 1744
						Archive var17 = class356.archive2; // L: 1745
						Archive var18 = class305.archive8; // L: 1746
						World.HealthBarDefinition_archive = var17; // L: 1748
						HealthBarDefinition.field1911 = var18; // L: 1749
						class154.method3059(class356.archive2, class305.archive8); // L: 1751
						Login.Login_loadingText = "Loaded config"; // L: 1752
						Login.Login_loadingPercent = 60; // L: 1753
						Client.titleLoadingStage = 80; // L: 1754
					}
				} else if (Client.titleLoadingStage == 80) { // L: 1757
					var19 = 0; // L: 1758
					if (SoundSystem.compass == null) { // L: 1759
						SoundSystem.compass = StructComposition.SpriteBuffer_getSprite(class305.archive8, class28.spriteIds.compass, 0);
					} else {
						++var19; // L: 1760
					}

					if (class344.redHintArrowSprite == null) { // L: 1761
						class344.redHintArrowSprite = StructComposition.SpriteBuffer_getSprite(class305.archive8, class28.spriteIds.field4373, 0);
					} else {
						++var19; // L: 1762
					}

					if (class29.mapSceneSprites == null) { // L: 1763
						class29.mapSceneSprites = ItemContainer.method2062(class305.archive8, class28.spriteIds.mapScenes, 0);
					} else {
						++var19; // L: 1764
					}

					SpritePixels[] var1;
					int var3;
					SpritePixels[] var5;
					int var6;
					SpritePixels var7;
					int var8;
					byte[] var9;
					int var10;
					if (UserComparator4.headIconPkSprites == null) { // L: 1765
						var2 = class305.archive8; // L: 1767
						var3 = class28.spriteIds.headIconsPk; // L: 1768
						if (!User.method6514(var2, var3, 0)) { // L: 1770
							var1 = null; // L: 1771
						} else {
							var5 = new SpritePixels[class453.SpriteBuffer_spriteCount]; // L: 1776
							var6 = 0;

							while (true) {
								if (var6 >= class453.SpriteBuffer_spriteCount) {
									VarcInt.method3325(); // L: 1790
									var1 = var5; // L: 1793
									break;
								}

								var7 = var5[var6] = new SpritePixels(); // L: 1778
								var7.width = class453.SpriteBuffer_spriteWidth; // L: 1779
								var7.height = class453.SpriteBuffer_spriteHeight; // L: 1780
								var7.xOffset = class453.SpriteBuffer_xOffsets[var6]; // L: 1781
								var7.yOffset = class453.SpriteBuffer_yOffsets[var6]; // L: 1782
								var7.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var6]; // L: 1783
								var7.subHeight = class453.SpriteBuffer_spriteHeights[var6]; // L: 1784
								var8 = var7.subHeight * var7.subWidth; // L: 1785
								var9 = class127.SpriteBuffer_pixels[var6]; // L: 1786
								var7.pixels = new int[var8]; // L: 1787

								for (var10 = 0; var10 < var8; ++var10) { // L: 1788
									var7.pixels[var10] = Decimator.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6; // L: 1777
							}
						}

						UserComparator4.headIconPkSprites = var1; // L: 1795
					} else {
						++var19; // L: 1797
					}

					if (ChatChannel.headIconPrayerSprites == null) { // L: 1798
						var2 = class305.archive8; // L: 1800
						var3 = class28.spriteIds.field4376; // L: 1801
						if (!User.method6514(var2, var3, 0)) { // L: 1803
							var1 = null; // L: 1804
						} else {
							var5 = new SpritePixels[class453.SpriteBuffer_spriteCount]; // L: 1809
							var6 = 0;

							while (true) {
								if (var6 >= class453.SpriteBuffer_spriteCount) {
									VarcInt.method3325(); // L: 1823
									var1 = var5; // L: 1826
									break;
								}

								var7 = var5[var6] = new SpritePixels(); // L: 1811
								var7.width = class453.SpriteBuffer_spriteWidth; // L: 1812
								var7.height = class453.SpriteBuffer_spriteHeight; // L: 1813
								var7.xOffset = class453.SpriteBuffer_xOffsets[var6]; // L: 1814
								var7.yOffset = class453.SpriteBuffer_yOffsets[var6]; // L: 1815
								var7.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var6]; // L: 1816
								var7.subHeight = class453.SpriteBuffer_spriteHeights[var6]; // L: 1817
								var8 = var7.subWidth * var7.subHeight; // L: 1818
								var9 = class127.SpriteBuffer_pixels[var6]; // L: 1819
								var7.pixels = new int[var8]; // L: 1820

								for (var10 = 0; var10 < var8; ++var10) { // L: 1821
									var7.pixels[var10] = Decimator.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6; // L: 1810
							}
						}

						ChatChannel.headIconPrayerSprites = var1; // L: 1828
					} else {
						++var19; // L: 1830
					}

					if (class21.headIconHintSprites == null) { // L: 1831
						var2 = class305.archive8; // L: 1833
						var3 = class28.spriteIds.field4377; // L: 1834
						if (!User.method6514(var2, var3, 0)) { // L: 1836
							var1 = null; // L: 1837
						} else {
							var5 = new SpritePixels[class453.SpriteBuffer_spriteCount]; // L: 1842
							var6 = 0;

							while (true) {
								if (var6 >= class453.SpriteBuffer_spriteCount) {
									VarcInt.method3325(); // L: 1856
									var1 = var5; // L: 1859
									break;
								}

								var7 = var5[var6] = new SpritePixels(); // L: 1844
								var7.width = class453.SpriteBuffer_spriteWidth; // L: 1845
								var7.height = class453.SpriteBuffer_spriteHeight; // L: 1846
								var7.xOffset = class453.SpriteBuffer_xOffsets[var6]; // L: 1847
								var7.yOffset = class453.SpriteBuffer_yOffsets[var6]; // L: 1848
								var7.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var6]; // L: 1849
								var7.subHeight = class453.SpriteBuffer_spriteHeights[var6]; // L: 1850
								var8 = var7.subWidth * var7.subHeight; // L: 1851
								var9 = class127.SpriteBuffer_pixels[var6]; // L: 1852
								var7.pixels = new int[var8]; // L: 1853

								for (var10 = 0; var10 < var8; ++var10) { // L: 1854
									var7.pixels[var10] = Decimator.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6; // L: 1843
							}
						}

						class21.headIconHintSprites = var1; // L: 1861
					} else {
						++var19; // L: 1863
					}

					if (class146.mapMarkerSprites == null) { // L: 1864
						var2 = class305.archive8; // L: 1866
						var3 = class28.spriteIds.field4378; // L: 1867
						if (!User.method6514(var2, var3, 0)) { // L: 1869
							var1 = null; // L: 1870
						} else {
							var5 = new SpritePixels[class453.SpriteBuffer_spriteCount]; // L: 1875
							var6 = 0;

							while (true) {
								if (var6 >= class453.SpriteBuffer_spriteCount) {
									VarcInt.method3325(); // L: 1889
									var1 = var5; // L: 1892
									break;
								}

								var7 = var5[var6] = new SpritePixels(); // L: 1877
								var7.width = class453.SpriteBuffer_spriteWidth; // L: 1878
								var7.height = class453.SpriteBuffer_spriteHeight; // L: 1879
								var7.xOffset = class453.SpriteBuffer_xOffsets[var6]; // L: 1880
								var7.yOffset = class453.SpriteBuffer_yOffsets[var6]; // L: 1881
								var7.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var6]; // L: 1882
								var7.subHeight = class453.SpriteBuffer_spriteHeights[var6]; // L: 1883
								var8 = var7.subWidth * var7.subHeight; // L: 1884
								var9 = class127.SpriteBuffer_pixels[var6]; // L: 1885
								var7.pixels = new int[var8]; // L: 1886

								for (var10 = 0; var10 < var8; ++var10) { // L: 1887
									var7.pixels[var10] = Decimator.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6; // L: 1876
							}
						}

						class146.mapMarkerSprites = var1; // L: 1894
					} else {
						++var19; // L: 1896
					}

					if (Projectile.crossSprites == null) { // L: 1897
						var2 = class305.archive8; // L: 1899
						var3 = class28.spriteIds.field4374; // L: 1900
						if (!User.method6514(var2, var3, 0)) { // L: 1902
							var1 = null; // L: 1903
						} else {
							var5 = new SpritePixels[class453.SpriteBuffer_spriteCount]; // L: 1908
							var6 = 0;

							while (true) {
								if (var6 >= class453.SpriteBuffer_spriteCount) {
									VarcInt.method3325(); // L: 1922
									var1 = var5; // L: 1925
									break;
								}

								var7 = var5[var6] = new SpritePixels(); // L: 1910
								var7.width = class453.SpriteBuffer_spriteWidth; // L: 1911
								var7.height = class453.SpriteBuffer_spriteHeight; // L: 1912
								var7.xOffset = class453.SpriteBuffer_xOffsets[var6]; // L: 1913
								var7.yOffset = class453.SpriteBuffer_yOffsets[var6]; // L: 1914
								var7.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var6]; // L: 1915
								var7.subHeight = class453.SpriteBuffer_spriteHeights[var6]; // L: 1916
								var8 = var7.subWidth * var7.subHeight; // L: 1917
								var9 = class127.SpriteBuffer_pixels[var6]; // L: 1918
								var7.pixels = new int[var8]; // L: 1919

								for (var10 = 0; var10 < var8; ++var10) { // L: 1920
									var7.pixels[var10] = Decimator.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6; // L: 1909
							}
						}

						Projectile.crossSprites = var1; // L: 1927
					} else {
						++var19; // L: 1929
					}

					if (WallDecoration.mapDotSprites == null) { // L: 1930
						var2 = class305.archive8; // L: 1932
						var3 = class28.spriteIds.field4375; // L: 1933
						if (!User.method6514(var2, var3, 0)) { // L: 1935
							var1 = null; // L: 1936
						} else {
							var5 = new SpritePixels[class453.SpriteBuffer_spriteCount]; // L: 1941
							var6 = 0;

							while (true) {
								if (var6 >= class453.SpriteBuffer_spriteCount) {
									VarcInt.method3325(); // L: 1955
									var1 = var5; // L: 1958
									break;
								}

								var7 = var5[var6] = new SpritePixels(); // L: 1943
								var7.width = class453.SpriteBuffer_spriteWidth; // L: 1944
								var7.height = class453.SpriteBuffer_spriteHeight; // L: 1945
								var7.xOffset = class453.SpriteBuffer_xOffsets[var6]; // L: 1946
								var7.yOffset = class453.SpriteBuffer_yOffsets[var6]; // L: 1947
								var7.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var6]; // L: 1948
								var7.subHeight = class453.SpriteBuffer_spriteHeights[var6]; // L: 1949
								var8 = var7.subHeight * var7.subWidth; // L: 1950
								var9 = class127.SpriteBuffer_pixels[var6]; // L: 1951
								var7.pixels = new int[var8]; // L: 1952

								for (var10 = 0; var10 < var8; ++var10) { // L: 1953
									var7.pixels[var10] = Decimator.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6; // L: 1942
							}
						}

						WallDecoration.mapDotSprites = var1; // L: 1960
					} else {
						++var19; // L: 1962
					}

					if (class127.scrollBarSprites == null) { // L: 1963
						class127.scrollBarSprites = ItemContainer.method2062(class305.archive8, class28.spriteIds.field4381, 0);
					} else {
						++var19; // L: 1964
					}

					if (ScriptEvent.modIconSprites == null) { // L: 1965
						ScriptEvent.modIconSprites = ItemContainer.method2062(class305.archive8, class28.spriteIds.field4372, 0);
					} else {
						++var19; // L: 1966
					}

					if (var19 < 11) { // L: 1967
						Login.Login_loadingText = "Loading sprites - " + var19 * 100 / 12 + "%"; // L: 1968
						Login.Login_loadingPercent = 70; // L: 1969
					} else {
						AbstractFont.AbstractFont_modIconSprites = ScriptEvent.modIconSprites; // L: 1972
						class344.redHintArrowSprite.normalize(); // L: 1973
						var20 = (int)(Math.random() * 21.0D) - 10; // L: 1974
						int var21 = (int)(Math.random() * 21.0D) - 10; // L: 1975
						var3 = (int)(Math.random() * 21.0D) - 10; // L: 1976
						int var22 = (int)(Math.random() * 41.0D) - 20; // L: 1977
						class29.mapSceneSprites[0].shiftColors(var22 + var20, var21 + var22, var3 + var22); // L: 1978
						Login.Login_loadingText = "Loaded sprites"; // L: 1979
						Login.Login_loadingPercent = 70; // L: 1980
						Client.titleLoadingStage = 90; // L: 1981
					}
				} else if (Client.titleLoadingStage == 90) { // L: 1984
					if (!TileItem.archive9.isFullyLoaded()) { // L: 1985
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1986
						Login.Login_loadingPercent = 90; // L: 1987
					} else {
						PcmPlayer.textureProvider = new TextureProvider(TileItem.archive9, class305.archive8, 20, class12.clientPreferences.method2225(), Client.isLowDetail ? 64 : 128); // L: 1990
						Rasterizer3D.Rasterizer3D_setTextureLoader(PcmPlayer.textureProvider); // L: 1991
						Rasterizer3D.Rasterizer3D_setBrightness(class12.clientPreferences.method2225()); // L: 1992
						Client.titleLoadingStage = 100; // L: 1993
					}
				} else if (Client.titleLoadingStage == 100) { // L: 1996
					var19 = PcmPlayer.textureProvider.getLoadedPercentage(); // L: 1997
					if (var19 < 100) { // L: 1998
						Login.Login_loadingText = "Loading textures - " + var19 + "%"; // L: 1999
						Login.Login_loadingPercent = 90; // L: 2000
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 2003
						Login.Login_loadingPercent = 90; // L: 2004
						Client.titleLoadingStage = 110; // L: 2005
					}
				} else if (Client.titleLoadingStage == 110) { // L: 2008
					Varcs.mouseRecorder = new MouseRecorder(); // L: 2009
					GameEngine.taskHandler.newThreadTask(Varcs.mouseRecorder, 10); // L: 2010
					Login.Login_loadingText = "Loaded input handler"; // L: 2011
					Login.Login_loadingPercent = 92; // L: 2012
					Client.titleLoadingStage = 120; // L: 2013
				} else if (Client.titleLoadingStage == 120) { // L: 2016
					if (!ObjectSound.archive10.tryLoadFileByNames("huffman", "")) { // L: 2017
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2018
						Login.Login_loadingPercent = 94; // L: 2019
					} else {
						Huffman var0 = new Huffman(ObjectSound.archive10.takeFileByNames("huffman", "")); // L: 2022
						GraphicsObject.method1870(var0); // L: 2023
						Login.Login_loadingText = "Loaded wordpack"; // L: 2024
						Login.Login_loadingPercent = 94; // L: 2025
						Client.titleLoadingStage = 130; // L: 2026
					}
				} else if (Client.titleLoadingStage == 130) { // L: 2029
					if (!class194.archive3.isFullyLoaded()) { // L: 2030
						Login.Login_loadingText = "Loading interfaces - " + class194.archive3.loadPercent() * 4 / 5 + "%"; // L: 2031
						Login.Login_loadingPercent = 96; // L: 2032
					} else if (!class115.archive12.isFullyLoaded()) { // L: 2035
						Login.Login_loadingText = "Loading interfaces - " + (80 + class115.archive12.loadPercent() / 6) + "%"; // L: 2036
						Login.Login_loadingPercent = 96; // L: 2037
					} else if (!class16.archive13.isFullyLoaded()) { // L: 2040
						Login.Login_loadingText = "Loading interfaces - " + (96 + class16.archive13.loadPercent() / 50) + "%"; // L: 2041
						Login.Login_loadingPercent = 96; // L: 2042
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 2045
						Login.Login_loadingPercent = 98; // L: 2046
						Client.titleLoadingStage = 140; // L: 2047
					}
				} else if (Client.titleLoadingStage == 140) { // L: 2050
					Login.Login_loadingPercent = 100; // L: 2051
					if (!VarpDefinition.archive19.tryLoadGroupByName(WorldMapCacheName.field2910.name)) { // L: 2052
						Login.Login_loadingText = "Loading world map - " + VarpDefinition.archive19.groupLoadPercentByName(WorldMapCacheName.field2910.name) / 10 + "%"; // L: 2053
					} else {
						if (ServerPacket.worldMap == null) { // L: 2056
							ServerPacket.worldMap = new WorldMap(); // L: 2057
							ServerPacket.worldMap.init(VarpDefinition.archive19, class92.archive18, ItemContainer.archive20, ChatChannel.fontBold12, Client.fontsMap, class29.mapSceneSprites); // L: 2058
						}

						Login.Login_loadingText = "Loaded world map"; // L: 2060
						Client.titleLoadingStage = 150; // L: 2061
					}
				} else if (Client.titleLoadingStage == 150) { // L: 2064
					PendingSpawn.updateGameState(10); // L: 2065
				}
			}
		}
	} // L: 1531 1537 1563 1590 1610 1635 1643 1652 1664 1670 1676 1755 1970 1982 1988 1994 2001 2006 2014 2020 2027 2033 2038 2043 2048 2054 2062 2066 2068
}
