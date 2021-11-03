import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	public static class300 field1440;
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = -1256129645
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("w")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("s")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 7512820562405009479L
	)
	long field1456;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 83798711
	)
	int field1465;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 627794383
	)
	int field1442;
	@ObfuscatedName("p")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("j")
	public byte field1444;
	@ObfuscatedName("b")
	public byte field1439;
	@ObfuscatedName("x")
	public byte field1446;
	@ObfuscatedName("y")
	public byte field1447;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 287156229
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("t")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("l")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("u")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("n")
	int[] field1452;
	@ObfuscatedName("z")
	public int[] field1453;
	@ObfuscatedName("q")
	public boolean[] field1454;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1564397769
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1945382455
	)
	public int field1438;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1604545471
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("c")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("f")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("h")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lop;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1465 = 0; // L: 14
		this.name = null; // L: 15
		this.field1442 = 0; // L: 16
		this.currentOwner = -1; // L: 29
		this.field1438 = -1; // L: 30
		this.method2715(var1); // L: 43
	} // L: 44

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-21"
	)
	void method2650(int var1) {
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

		if (this.field1452 != null) { // L: 57
			System.arraycopy(this.field1452, 0, this.field1452 = new int[var1], 0, this.memberCount);
		} else {
			this.field1452 = new int[var1]; // L: 58
		}

		if (this.field1453 != null) { // L: 59
			System.arraycopy(this.field1453, 0, this.field1453 = new int[var1], 0, this.memberCount);
		} else {
			this.field1453 = new int[var1]; // L: 60
		}

		if (this.field1454 != null) { // L: 61
			System.arraycopy(this.field1454, 0, this.field1454 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1454 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1402687223"
	)
	void method2711(int var1) {
		if (this.useHashes) {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberHashes = new long[var1]; // L: 68
			}
		}

		if (this.useNames) { // L: 70
			if (this.bannedMemberNames != null) { // L: 71
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1];
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	public int method2649(String var1) {
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-83"
	)
	public int method2652(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field1452[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "688025424"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-723355828"
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

			BufferedSource.method6301(var1, this.sortedMembers); // L: 105
		}

		return this.sortedMembers; // L: 107
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;IB)V",
		garbageValue = "86"
	)
	void method2655(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 111
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 112
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 113
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 114
				this.method2650(this.memberCount + 5);
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

			this.field1452[this.memberCount] = 0; // L: 124
			this.field1453[this.memberCount] = var4; // L: 125
			this.field1454[this.memberCount] = false; // L: 126
			++this.memberCount; // L: 127
			this.sortedMembers = null; // L: 128
		}
	} // L: 129

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1629682496"
	)
	void method2656(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) { // L: 132
			--this.memberCount; // L: 133
			this.sortedMembers = null; // L: 134
			if (this.memberCount == 0) { // L: 135
				this.memberHashes = null; // L: 136
				this.memberNames = null; // L: 137
				this.memberRanks = null; // L: 138
				this.field1452 = null; // L: 139
				this.field1453 = null; // L: 140
				this.field1454 = null; // L: 141
				this.currentOwner = -1; // L: 142
				this.field1438 = -1; // L: 143
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 146
				System.arraycopy(this.field1452, var1 + 1, this.field1452, var1, this.memberCount - var1); // L: 147
				System.arraycopy(this.field1453, var1 + 1, this.field1453, var1, this.memberCount - var1); // L: 148
				System.arraycopy(this.field1454, var1 + 1, this.field1454, var1, this.memberCount - var1); // L: 149
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 157
			this.currentOwner = -1; // L: 158
			this.field1438 = -1; // L: 159
		} else {
			this.currentOwner = -1; // L: 162
			this.field1438 = -1; // L: 163
			int var1 = 0; // L: 164
			byte var2 = this.memberRanks[0]; // L: 165

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 166
				if (this.memberRanks[var3] > var2) { // L: 167
					if (var2 == 125) {
						this.field1438 = var1; // L: 168
					}

					var1 = var3; // L: 169
					var2 = this.memberRanks[var3]; // L: 170
				} else if (this.field1438 == -1 && this.memberRanks[var3] == 125) { // L: 172
					this.field1438 = var3; // L: 173
				}
			}

			this.currentOwner = var1; // L: 176
			if (this.currentOwner != -1) { // L: 177
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 160 178

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "1006184517"
	)
	void method2658(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 181
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 182
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) { // L: 183
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 184
				this.method2711(this.bannedMemberCount + 5);
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-465841653"
	)
	void method2687(int var1) {
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "-1408414552"
	)
	int method2673(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 203
			if (this.currentOwner == var1 && (this.field1438 == -1 || this.memberRanks[this.field1438] < 125)) { // L: 204
				return -1;
			} else if (this.memberRanks[var1] == var2) { // L: 205
				return -1;
			} else {
				this.memberRanks[var1] = var2; // L: 206
				this.updateOwner(); // L: 207
				return var1; // L: 208
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1614826959"
	)
	boolean method2661(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 212
			this.memberRanks[this.currentOwner] = 125; // L: 213
			this.field1438 = this.currentOwner; // L: 214
			this.memberRanks[var1] = 126; // L: 215
			this.currentOwner = var1; // L: 216
			return true; // L: 217
		} else {
			return false;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "32"
	)
	int method2662(int var1, boolean var2) {
		if (this.field1454[var1] == var2) { // L: 221
			return -1;
		} else {
			this.field1454[var1] = var2; // L: 222
			return var1; // L: 223
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "1"
	)
	int method2663(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 227
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 228
		int var7 = var6 ^ var5; // L: 229
		var2 <<= var3; // L: 230
		var2 &= var7; // L: 231
		int var8 = this.field1452[var1]; // L: 232
		if ((var8 & var7) == var2) {
			return -1; // L: 233
		} else {
			var8 &= ~var7; // L: 234
			this.field1452[var1] = var8 | var2; // L: 235
			return var1; // L: 236
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1591029993"
	)
	boolean method2664(int var1, int var2) {
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "32"
	)
	boolean method2665(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("z")
	boolean method2666(int var1, long var2) {
		if (this.parameters != null) { // L: 282
			Node var4 = this.parameters.get((long)var1); // L: 283
			if (var4 != null) { // L: 284
				if (var4 instanceof class367) { // L: 285
					class367 var5 = (class367)var4; // L: 286
					if (var2 == var5.field4071) { // L: 287
						return false;
					}

					var5.field4071 = var2; // L: 288
					return true; // L: 289
				}

				var4.remove(); // L: 291
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 294
		}

		this.parameters.put(new class367(var2), (long)var1); // L: 295
		return true; // L: 296
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "-203243509"
	)
	boolean method2667(int var1, String var2) {
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1240053331"
	)
	void method2715(Buffer var1) {
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

			this.field1465 = var1.readInt(); // L: 336
			this.field1442 = var1.readInt(); // L: 337
			if (var2 <= 3 && this.field1442 != 0) { // L: 338
				this.field1442 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 339
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 340
			this.name = var1.readStringCp1252NullTerminated(); // L: 341
			if (var2 >= 4) { // L: 342
				var1.readInt(); // L: 343
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 345
			this.field1444 = var1.readByte(); // L: 346
			this.field1439 = var1.readByte(); // L: 347
			this.field1446 = var1.readByte(); // L: 348
			this.field1447 = var1.readByte(); // L: 349
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

				if (this.field1452 == null || this.field1452.length < this.memberCount) { // L: 354
					this.field1452 = new int[this.memberCount];
				}

				if (this.field1453 == null || this.field1453.length < this.memberCount) { // L: 355
					this.field1453 = new int[this.memberCount];
				}

				if (this.field1454 == null || this.field1454.length < this.memberCount) { // L: 356
					this.field1454 = new boolean[this.memberCount];
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
						this.field1452[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 362
						this.field1453[var4] = var1.readUnsignedShort();
					} else {
						this.field1453[var4] = 0; // L: 363
					}

					if (var2 >= 6) { // L: 364
						this.field1454[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1454[var4] = false; // L: 365
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
					int var5;
					int var6;
					int var7;
					if (var4 < 16) { // L: 381
						var7 = var4 - 1; // L: 385
						var7 |= var7 >>> 1; // L: 386
						var7 |= var7 >>> 2; // L: 387
						var7 |= var7 >>> 4; // L: 388
						var7 |= var7 >>> 8; // L: 389
						var7 |= var7 >>> 16; // L: 390
						var6 = var7 + 1; // L: 391
						var5 = var6; // L: 393
					} else {
						var5 = 16; // L: 395
					}

					this.parameters = new IterableNodeHashTable(var5); // L: 396

					while (var4-- > 0) { // L: 397
						var6 = var1.readInt(); // L: 398
						var7 = var6 & 1073741823; // L: 399
						int var8 = var6 >>> 30; // L: 400
						if (var8 == 0) { // L: 401
							int var13 = var1.readInt(); // L: 402
							this.parameters.put(new IntegerNode(var13), (long)var7); // L: 403
						} else if (var8 == 1) { // L: 405
							long var11 = var1.readLong(); // L: 406
							this.parameters.put(new class367(var11), (long)var7); // L: 407
						} else if (var8 == 2) { // L: 409
							String var9 = var1.readStringCp1252NullTerminated(); // L: 410
							this.parameters.put(new ObjectNode(var9), (long)var7); // L: 411
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 416

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILmr;Lkd;B)V",
		garbageValue = "-44"
	)
	static void method2653(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 1; // L: 19
		var3.key = (long)var0; // L: 20
		var3.archiveDisk = var1; // L: 21
		var3.archive = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		Login.method1952(); // L: 26
	} // L: 27

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-80"
	)
	public static void method2703(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 66
	} // L: 67

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1184927599"
	)
	static void method2714(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "257088762"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 5089
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 5090
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 5091
				int var3 = var2.x >> 7; // L: 5092
				int var4 = var2.y >> 7; // L: 5093
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 5094
					if (var2.field1087 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 5095
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 5096
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 5097
					}

					long var5 = PacketBuffer.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 5099
					var2.playerCycle = Client.cycle; // L: 5100
					GameBuild.scene.drawEntity(GrandExchangeOfferTotalQuantityComparator.Client_plane, var2.x, var2.y, class392.getTileHeight(var2.field1087 * 64 - 64 + var2.x, var2.field1087 * 64 - 64 + var2.y, GrandExchangeOfferTotalQuantityComparator.Client_plane), var2.field1087 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 5101
				}
			}
		}

	} // L: 5105
}
