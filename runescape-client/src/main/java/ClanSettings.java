import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("v")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("q")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -6342819695359626435L
	)
	long field1627;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1887905615
	)
	int field1628;
	@ObfuscatedName("e")
	@Export("name")
	public String name;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -481546883
	)
	int field1630;
	@ObfuscatedName("w")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("y")
	public byte field1637;
	@ObfuscatedName("i")
	public byte field1633;
	@ObfuscatedName("s")
	public byte field1634;
	@ObfuscatedName("t")
	public byte field1645;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 906149583
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("r")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("u")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("k")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("h")
	int[] field1640;
	@ObfuscatedName("x")
	public int[] field1649;
	@ObfuscatedName("l")
	public boolean[] field1642;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 819746427
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 14234283
	)
	public int field1644;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1427901421
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("n")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("o")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("m")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lqt;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1628 = 0; // L: 14
		this.name = null; // L: 15
		this.field1630 = 0; // L: 16
		this.currentOwner = -1; // L: 29
		this.field1644 = -1; // L: 30
		this.method2969(var1); // L: 43
	} // L: 44

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1635442179"
	)
	void method2950(int var1) {
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

		if (this.field1640 != null) { // L: 57
			System.arraycopy(this.field1640, 0, this.field1640 = new int[var1], 0, this.memberCount);
		} else {
			this.field1640 = new int[var1]; // L: 58
		}

		if (this.field1649 != null) { // L: 59
			System.arraycopy(this.field1649, 0, this.field1649 = new int[var1], 0, this.memberCount);
		} else {
			this.field1649 = new int[var1]; // L: 60
		}

		if (this.field1642 != null) { // L: 61
			System.arraycopy(this.field1642, 0, this.field1642 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1642 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1202056039"
	)
	void method2974(int var1) {
		if (this.useHashes) { // L: 66
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount); // L: 67
			} else {
				this.bannedMemberHashes = new long[var1]; // L: 68
			}
		}

		if (this.useNames) { // L: 70
			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1];
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "132002265"
	)
	public int method2991(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var2 = 0; var2 < this.memberCount; ++var2) {
				if (this.memberNames[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "29292"
	)
	public int method2972(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1640[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Integer;",
		garbageValue = "1"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) {
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1);
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "267"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.memberCount]; // L: 98
			this.sortedMembers = new int[this.memberCount]; // L: 99

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) {
				var1[var2] = this.memberNames[var2]; // L: 101
				if (var1[var2] != null) { // L: 102
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			class353.method6507(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;IB)V",
		garbageValue = "-60"
	)
	void method2956(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) {
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 114
				this.method2950(this.memberCount + 5);
			}

			if (this.memberHashes != null) { // L: 115
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) {
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) {
				this.currentOwner = this.memberCount; // L: 118
				this.memberRanks[this.memberCount] = 126; // L: 119
			} else {
				this.memberRanks[this.memberCount] = 0;
			}

			this.field1640[this.memberCount] = 0;
			this.field1649[this.memberCount] = var4;
			this.field1642[this.memberCount] = false; // L: 126
			++this.memberCount; // L: 127
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-721194378"
	)
	void method2957(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount; // L: 133
			this.sortedMembers = null; // L: 134
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null; // L: 138
				this.field1640 = null;
				this.field1649 = null;
				this.field1642 = null;
				this.currentOwner = -1;
				this.field1644 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 146
				System.arraycopy(this.field1640, var1 + 1, this.field1640, var1, this.memberCount - var1); // L: 147
				System.arraycopy(this.field1649, var1 + 1, this.field1649, var1, this.memberCount - var1);
				System.arraycopy(this.field1642, var1 + 1, this.field1642, var1, this.memberCount - var1);
				if (this.memberHashes != null) { // L: 150
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) { // L: 151
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-87"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1; // L: 158
			this.field1644 = -1; // L: 159
		} else {
			this.currentOwner = -1; // L: 162
			this.field1644 = -1; // L: 163
			int var1 = 0;
			byte var2 = this.memberRanks[0]; // L: 165

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 166
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1644 = var1;
					}

					var1 = var3;
					var2 = this.memberRanks[var3]; // L: 170
				} else if (this.field1644 == -1 && this.memberRanks[var3] == 125) {
					this.field1644 = var3;
				}
			}

			this.currentOwner = var1;
			if (this.currentOwner != -1) {
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 178

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "1888589183"
	)
	void method2959(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 182
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
				this.method2974(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) {
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) {
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method3019(int var1) {
		--this.bannedMemberCount; // L: 191
		if (this.bannedMemberCount == 0) {
			this.bannedMemberHashes = null;
			this.bannedMemberNames = null; // L: 194
		} else {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1);
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "-585150872"
	)
	int method2961(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.currentOwner == var1 && (this.field1644 == -1 || this.memberRanks[this.field1644] < 125)) {
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1;
			} else {
				this.memberRanks[var1] = var2;
				this.updateOwner();
				return var1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	boolean method3016(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 212
			this.memberRanks[this.currentOwner] = 125;
			this.field1644 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1677088701"
	)
	int method2963(int var1, boolean var2) {
		if (this.field1642[var1] == var2) {
			return -1;
		} else {
			this.field1642[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-37"
	)
	int method2964(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1640[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field1640[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "62"
	)
	boolean method2965(int var1, int var2) {
		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof IntegerNode) {
					IntegerNode var4 = (IntegerNode)var3;
					if (var2 == var4.integer) {
						return false;
					}

					var4.integer = var2;
					return true;
				}

				var3.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "71"
	)
	boolean method3004(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		if (this.parameters != null) {
			Node var8 = this.parameters.get((long)var1);
			if (var8 != null) {
				if (var8 instanceof IntegerNode) {
					IntegerNode var9 = (IntegerNode)var8;
					if ((var9.integer & var7) == var2) {
						return false;
					}

					var9.integer &= ~var7;
					var9.integer |= var2;
					return true;
				}

				var8.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new IntegerNode(var2), (long)var1);
		return true; // L: 278
	}

	@ObfuscatedName("x")
	boolean method2967(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get((long)var1);
			if (var4 != null) {
				if (var4 instanceof class407) { // L: 285
					class407 var5 = (class407)var4;
					if (var5.field4459 == var2) { // L: 287
						return false;
					}

					var5.field4459 = var2;
					return true;
				}

				var4.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 294
		}

		this.parameters.put(new class407(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "-2147483648"
	)
	boolean method2968(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) { // L: 301
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1); // L: 303
			if (var3 != null) {
				if (var3 instanceof ObjectNode) {
					ObjectNode var4 = (ObjectNode)var3;
					if (var4.obj instanceof String) {
						if (var2.equals(var4.obj)) {
							return false;
						}

						var4.remove(); // L: 309
						this.parameters.put(new ObjectNode(var2), var4.key);
						return true;
					}
				}

				var3.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 317
		}

		this.parameters.put(new ObjectNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "-37"
	)
	void method2969(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 323
		if (var2 >= 1 && var2 <= 6) {
			int var3 = var1.readUnsignedByte();
			if ((var3 & 1) != 0) {
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) {
				this.useNames = true;
			}

			if (!this.useHashes) { // L: 328
				this.memberHashes = null;
				this.bannedMemberHashes = null;
			}

			if (!this.useNames) {
				this.memberNames = null;
				this.bannedMemberNames = null;
			}

			this.field1628 = var1.readInt();
			this.field1630 = var1.readInt();
			if (var2 <= 3 && this.field1630 != 0) { // L: 338
				this.field1630 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated(); // L: 341
			if (var2 >= 4) {
				var1.readInt();
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 345
			this.field1637 = var1.readByte(); // L: 346
			this.field1633 = var1.readByte();
			this.field1634 = var1.readByte();
			this.field1645 = var1.readByte();
			int var4;
			if (this.memberCount > 0) {
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) {
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) {
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) {
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1640 == null || this.field1640.length < this.memberCount) {
					this.field1640 = new int[this.memberCount];
				}

				if (this.field1649 == null || this.field1649.length < this.memberCount) {
					this.field1649 = new int[this.memberCount];
				}

				if (this.field1642 == null || this.field1642.length < this.memberCount) {
					this.field1642 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) { // L: 357
					if (this.useHashes) {
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 359
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte(); // L: 360
					if (var2 >= 2) { // L: 361
						this.field1640[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.field1649[var4] = var1.readUnsignedShort();
					} else {
						this.field1649[var4] = 0;
					}

					if (var2 >= 6) {
						this.field1642[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1642[var4] = false; // L: 365
					}
				}

				this.updateOwner();
			}

			if (this.bannedMemberCount > 0) {
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) {
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) {
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) {
					if (this.useHashes) { // L: 373
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) {
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) {
				var4 = var1.readUnsignedShort();
				if (var4 > 0) {
					this.parameters = new IterableNodeHashTable(var4 < 16 ? class135.method2910(var4) : 16);

					while (var4-- > 0) {
						int var5 = var1.readInt();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30; // L: 384
						if (var7 == 0) {
							int var12 = var1.readInt();
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 387
						} else if (var7 == 1) {
							long var10 = var1.readLong(); // L: 390
							this.parameters.put(new class407(var10), (long)var6); // L: 391
						} else if (var7 == 2) { // L: 393
							String var8 = var1.readStringCp1252NullTerminated();
							this.parameters.put(new ObjectNode(var8), (long)var6); // L: 395
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 400

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;ZIS)V",
		garbageValue = "6367"
	)
	static void method3020(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 183
			if (var3 == 4) {
				WorldMapData_1.method4872(4); // L: 185
			}

		} else {
			if (var3 == 0) {
				class101.method2547(var2); // L: 190
			} else {
				WorldMapData_1.method4872(var3);
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 195
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			class16.leftTitleSprite = ItemLayer.method3920(var4); // L: 197
			Login.rightTitleSprite = class16.leftTitleSprite.mirrorHorizontally(); // L: 198
			SoundSystem.method739(var1, Client.worldProperties);
			class4.titleboxSprite = class421.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class6.titlebuttonSprite = class421.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field914 = class421.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 202
			IgnoreList.field4284 = class421.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class421.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			int var6 = var1.getGroupId("runes");
			int var7 = var1.getFileId(var6, "");
			IndexedSprite[] var5 = ClanChannelMember.method2867(var1, var6, var7);
			AbstractByteArrayCopier.runesSprite = var5; // L: 211
			var7 = var1.getGroupId("title_mute");
			int var8 = var1.getFileId(var7, "");
			IndexedSprite[] var10 = ClanChannelMember.method2867(var1, var7, var8);
			class145.title_muteSprite = var10; // L: 218
			class345.options_buttons_0Sprite = class421.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class113.field1427 = class421.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class228.options_buttons_2Sprite = class421.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			DynamicObject.field979 = class421.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 222
			ReflectionCheck.field247 = class345.options_buttons_0Sprite.subWidth;
			MouseRecorder.field1064 = class345.options_buttons_0Sprite.subHeight;
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(AbstractByteArrayCopier.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field911 = new String[8];
				Login.field910 = 0;
			}

			class240.field2846 = 0;
			World.otp = ""; // L: 233
			Login.field895 = true;
			Login.worldSelectOpen = false;
			if (!class19.clientPreferences.method2317()) {
				Archive var11 = class121.archive6;
				var8 = var11.getGroupId("scape main");
				int var9 = var11.getFileId(var8, "");
				class272.musicPlayerStatus = 1;
				class272.musicTrackArchive = var11;
				class272.musicTrackGroupId = var8;
				class151.musicTrackFileId = var9; // L: 245
				class272.musicTrackVolume = 255;
				class11.musicTrackBoolean = false;
				class272.pcmSampleLength = 2;
			} else {
				class272.musicPlayerStatus = 1; // L: 253
				class272.musicTrackArchive = null;
				class272.musicTrackGroupId = -1;
				class151.musicTrackFileId = -1;
				class272.musicTrackVolume = 0;
				class11.musicTrackBoolean = false;
				class272.pcmSampleLength = 2;
			}

			class115.method2693(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (Script.canvasWidth - 765) / 2; // L: 263
			Login.loginBoxX = Login.xPadding + 202;
			Canvas.loginBoxCenter = Login.loginBoxX + 180;
			class16.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpq;IB)V",
		garbageValue = "118"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		int var3 = 0; // L: 74
		var0.importIndex(); // L: 75

		int var4;
		int var6;
		int var8;
		byte[] var10000;
		int var17;
		int var20;
		for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 76
			var20 = Players.Players_indices[var4]; // L: 77
			if ((Players.field1311[var20] & 1) == 0) { // L: 78
				if (var3 > 0) { // L: 79
					--var3; // L: 80
					var10000 = Players.field1311; // L: 81
					var10000[var20] = (byte)(var10000[var20] | 2);
				} else {
					var6 = var0.readBits(1); // L: 84
					if (var6 == 0) { // L: 85
						var8 = var0.readBits(2); // L: 88
						if (var8 == 0) { // L: 90
							var17 = 0;
						} else if (var8 == 1) { // L: 91
							var17 = var0.readBits(5);
						} else if (var8 == 2) { // L: 92
							var17 = var0.readBits(8);
						} else {
							var17 = var0.readBits(11); // L: 93
						}

						var3 = var17; // L: 96
						var10000 = Players.field1311; // L: 97
						var10000[var20] = (byte)(var10000[var20] | 2);
					} else {
						class14.readPlayerUpdate(var0, var20); // L: 100
					}
				}
			}
		}

		var0.exportIndex(); // L: 103
		if (var3 != 0) { // L: 104
			throw new RuntimeException(); // L: 105
		} else {
			var0.importIndex(); // L: 107

			for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 108
				var20 = Players.Players_indices[var4]; // L: 109
				if ((Players.field1311[var20] & 1) != 0) { // L: 110
					if (var3 > 0) { // L: 111
						--var3; // L: 112
						var10000 = Players.field1311; // L: 113
						var10000[var20] = (byte)(var10000[var20] | 2);
					} else {
						var6 = var0.readBits(1); // L: 116
						if (var6 == 0) { // L: 117
							var8 = var0.readBits(2); // L: 120
							if (var8 == 0) { // L: 122
								var17 = 0;
							} else if (var8 == 1) { // L: 123
								var17 = var0.readBits(5);
							} else if (var8 == 2) { // L: 124
								var17 = var0.readBits(8);
							} else {
								var17 = var0.readBits(11); // L: 125
							}

							var3 = var17; // L: 128
							var10000 = Players.field1311; // L: 129
							var10000[var20] = (byte)(var10000[var20] | 2);
						} else {
							class14.readPlayerUpdate(var0, var20); // L: 132
						}
					}
				}
			}

			var0.exportIndex(); // L: 135
			if (var3 != 0) { // L: 136
				throw new RuntimeException(); // L: 137
			} else {
				var0.importIndex(); // L: 139

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 140
					var20 = Players.Players_emptyIndices[var4]; // L: 141
					if ((Players.field1311[var20] & 1) != 0) { // L: 142
						if (var3 > 0) { // L: 143
							--var3; // L: 144
							var10000 = Players.field1311; // L: 145
							var10000[var20] = (byte)(var10000[var20] | 2);
						} else {
							var6 = var0.readBits(1); // L: 148
							if (var6 == 0) { // L: 149
								var8 = var0.readBits(2); // L: 152
								if (var8 == 0) { // L: 154
									var17 = 0;
								} else if (var8 == 1) { // L: 155
									var17 = var0.readBits(5);
								} else if (var8 == 2) { // L: 156
									var17 = var0.readBits(8);
								} else {
									var17 = var0.readBits(11); // L: 157
								}

								var3 = var17; // L: 160
								var10000 = Players.field1311; // L: 161
								var10000[var20] = (byte)(var10000[var20] | 2);
							} else if (ModelData0.updateExternalPlayer(var0, var20)) { // L: 164
								var10000 = Players.field1311;
								var10000[var20] = (byte)(var10000[var20] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 167
				if (var3 != 0) { // L: 168
					throw new RuntimeException(); // L: 169
				} else {
					var0.importIndex(); // L: 171

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 172
						var20 = Players.Players_emptyIndices[var4]; // L: 173
						if ((Players.field1311[var20] & 1) == 0) { // L: 174
							if (var3 > 0) { // L: 175
								--var3; // L: 176
								var10000 = Players.field1311; // L: 177
								var10000[var20] = (byte)(var10000[var20] | 2);
							} else {
								var6 = var0.readBits(1); // L: 180
								if (var6 == 0) { // L: 181
									var8 = var0.readBits(2); // L: 184
									if (var8 == 0) { // L: 186
										var17 = 0;
									} else if (var8 == 1) { // L: 187
										var17 = var0.readBits(5);
									} else if (var8 == 2) { // L: 188
										var17 = var0.readBits(8);
									} else {
										var17 = var0.readBits(11); // L: 189
									}

									var3 = var17; // L: 192
									var10000 = Players.field1311; // L: 193
									var10000[var20] = (byte)(var10000[var20] | 2);
								} else if (ModelData0.updateExternalPlayer(var0, var20)) { // L: 196
									var10000 = Players.field1311;
									var10000[var20] = (byte)(var10000[var20] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 199
					if (var3 != 0) { // L: 200
						throw new RuntimeException(); // L: 201
					} else {
						Players.Players_count = 0; // L: 203
						Players.Players_emptyIdxCount = 0; // L: 204

						Player var5;
						for (var4 = 1; var4 < 2048; ++var4) { // L: 205
							var10000 = Players.field1311; // L: 206
							var10000[var4] = (byte)(var10000[var4] >> 1);
							var5 = Client.players[var4]; // L: 207
							if (var5 != null) { // L: 208
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4; // L: 209
							}
						}

						for (var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 213
							var4 = Players.Players_pendingUpdateIndices[var3]; // L: 214
							var5 = Client.players[var4]; // L: 215
							var6 = var0.readUnsignedByte(); // L: 216
							if ((var6 & 128) != 0) { // L: 217
								var6 += var0.readUnsignedByte() << 8;
							}

							byte var7 = class192.field2208.field2210; // L: 219
							if ((var6 & 2048) != 0) { // L: 220
								for (var8 = 0; var8 < 3; ++var8) { // L: 221
									var5.actions[var8] = var0.readStringCp1252NullTerminated();
								}
							}

							int var11;
							int var12;
							int var15;
							if ((var6 & 4) != 0) { // L: 223
								var8 = var0.readUnsignedShort(); // L: 224
								PlayerType var9 = (PlayerType)Actor.findEnumerated(SoundSystem.PlayerType_values(), var0.method7766()); // L: 225
								boolean var10 = var0.method7766() == 1; // L: 226
								var11 = var0.readUnsignedByte(); // L: 227
								var12 = var0.offset; // L: 228
								if (var5.username != null && var5.appearance != null) { // L: 229
									boolean var13 = false; // L: 230
									if (var9.isUser && Player.friendSystem.isIgnored(var5.username)) { // L: 231 232
										var13 = true;
									}

									if (!var13 && Client.field607 == 0 && !var5.isHidden) { // L: 234
										Players.field1317.offset = 0; // L: 235
										var0.method7828(Players.field1317.array, 0, var11); // L: 236
										Players.field1317.offset = 0; // L: 237
										String var14 = AbstractFont.escapeBrackets(ArchiveDiskAction.method5777(class134.method2904(Players.field1317))); // L: 238
										var5.overheadText = var14.trim(); // L: 239
										var5.overheadTextColor = var8 >> 8; // L: 240
										var5.overheadTextEffect = var8 & 255; // L: 241
										var5.overheadTextCyclesRemaining = 150; // L: 242
										var5.isAutoChatting = var10; // L: 243
										var5.field1152 = var5 != class101.localPlayer && var9.isUser && "" != Client.field716 && var14.toLowerCase().indexOf(Client.field716) == -1; // L: 244
										if (var9.isPrivileged) { // L: 246
											var15 = var10 ? 91 : 1;
										} else {
											var15 = var10 ? 90 : 2; // L: 247
										}

										if (var9.modIcon != -1) { // L: 248
											class290.addGameMessage(var15, SecureRandomCallable.method2066(var9.modIcon) + var5.username.getName(), var14);
										} else {
											class290.addGameMessage(var15, var5.username.getName(), var14); // L: 249
										}
									}
								}

								var0.offset = var12 + var11; // L: 252
							}

							if ((var6 & 8192) != 0) { // L: 254
								var5.spotAnimation = var0.method7776(); // L: 255
								var8 = var0.readInt(); // L: 256
								var5.spotAnimationHeight = var8 >> 16; // L: 257
								var5.field1178 = (var8 & 65535) + Client.cycle; // L: 258
								var5.spotAnimationFrame = 0; // L: 259
								var5.spotAnimationFrameCycle = 0; // L: 260
								if (var5.field1178 > Client.cycle) { // L: 261
									var5.spotAnimationFrame = -1;
								}

								if (var5.spotAnimation == 65535) { // L: 262
									var5.spotAnimation = -1;
								}
							}

							if ((var6 & 1024) != 0) { // L: 264
								var5.field1140 = var0.method7952(); // L: 265
								var5.field1182 = var0.readByte(); // L: 266
								var5.field1181 = var0.method7952(); // L: 267
								var5.field1183 = var0.method7768(); // L: 268
								var5.field1184 = var0.method7774() + Client.cycle; // L: 269
								var5.field1194 = var0.method7776() + Client.cycle; // L: 270
								var5.field1186 = var0.readUnsignedShort(); // L: 271
								if (var5.field1088) { // L: 272
									var5.field1140 += var5.tileX; // L: 273
									var5.field1182 += var5.tileY; // L: 274
									var5.field1181 += var5.tileX; // L: 275
									var5.field1183 += var5.tileY; // L: 276
									var5.pathLength = 0; // L: 277
								} else {
									var5.field1140 += var5.pathX[0]; // L: 280
									var5.field1182 += var5.pathY[0]; // L: 281
									var5.field1181 += var5.pathX[0]; // L: 282
									var5.field1183 += var5.pathY[0]; // L: 283
									var5.pathLength = 1; // L: 284
								}

								var5.field1203 = 0; // L: 286
							}

							if ((var6 & 8) != 0) { // L: 288
								var5.field1165 = var0.method7775(); // L: 289
								if (var5.pathLength == 0) { // L: 290
									var5.orientation = var5.field1165; // L: 291
									var5.field1165 = -1; // L: 292
								}
							}

							if ((var6 & 256) != 0) { // L: 295
								class192[] var16 = Players.field1304; // L: 296
								class192[] var18 = new class192[]{class192.field2212, class192.field2208, class192.field2209, class192.field2211}; // L: 300
								var16[var4] = (class192)Actor.findEnumerated(var18, var0.method7952()); // L: 302
							}

							if ((var6 & 1) != 0) { // L: 304
								var5.overheadText = var0.readStringCp1252NullTerminated(); // L: 305
								if (var5.overheadText.charAt(0) == '~') { // L: 306
									var5.overheadText = var5.overheadText.substring(1); // L: 307
									class290.addGameMessage(2, var5.username.getName(), var5.overheadText); // L: 308
								} else if (var5 == class101.localPlayer) { // L: 310
									class290.addGameMessage(2, var5.username.getName(), var5.overheadText); // L: 311
								}

								var5.isAutoChatting = false; // L: 313
								var5.overheadTextColor = 0; // L: 314
								var5.overheadTextEffect = 0; // L: 315
								var5.overheadTextCyclesRemaining = 150; // L: 316
							}

							if ((var6 & 2) != 0) { // L: 318
								var8 = var0.readUnsignedShort(); // L: 319
								if (var8 == 65535) { // L: 320
									var8 = -1;
								}

								var17 = var0.method7766(); // L: 321
								class65.performPlayerAnimation(var5, var8, var17); // L: 322
							}

							if ((var6 & 32) != 0) { // L: 324
								var8 = var0.method7767(); // L: 325
								int var19;
								int var23;
								int var24;
								if (var8 > 0) { // L: 326
									for (var17 = 0; var17 < var8; ++var17) { // L: 327
										var11 = -1; // L: 329
										var12 = -1; // L: 330
										var24 = -1; // L: 331
										var23 = var0.readUShortSmart(); // L: 332
										if (var23 == 32767) { // L: 333
											var23 = var0.readUShortSmart(); // L: 334
											var12 = var0.readUShortSmart(); // L: 335
											var11 = var0.readUShortSmart(); // L: 336
											var24 = var0.readUShortSmart(); // L: 337
										} else if (var23 != 32766) { // L: 339
											var12 = var0.readUShortSmart(); // L: 340
										} else {
											var23 = -1; // L: 342
										}

										var19 = var0.readUShortSmart(); // L: 343
										var5.addHitSplat(var23, var12, var11, var24, Client.cycle, var19); // L: 344
									}
								}

								var17 = var0.method7767(); // L: 347
								if (var17 > 0) { // L: 348
									for (var23 = 0; var23 < var17; ++var23) { // L: 349
										var11 = var0.readUShortSmart(); // L: 350
										var12 = var0.readUShortSmart(); // L: 351
										if (var12 != 32767) { // L: 352
											var24 = var0.readUShortSmart(); // L: 353
											var19 = var0.method7766(); // L: 354
											var15 = var12 > 0 ? var0.method7766() : var19; // L: 355
											var5.addHealthBar(var11, Client.cycle, var12, var24, var19, var15); // L: 356
										} else {
											var5.removeHealthBar(var11); // L: 358
										}
									}
								}
							}

							if ((var6 & 64) != 0) { // L: 362
								var5.targetIndex = var0.method7774(); // L: 363
								if (var5.targetIndex == 65535) { // L: 364
									var5.targetIndex = -1;
								}
							}

							if ((var6 & 512) != 0) { // L: 366
								var5.field1189 = Client.cycle + var0.method7774(); // L: 367
								var5.field1135 = Client.cycle + var0.method7776(); // L: 368
								var5.field1191 = var0.method7769(); // L: 369
								var5.field1192 = var0.method7952(); // L: 370
								var5.field1193 = var0.method7769(); // L: 371
								var5.field1133 = (byte)var0.readUnsignedByte(); // L: 372
							}

							if ((var6 & 16384) != 0) { // L: 374
								var7 = var0.method7952(); // L: 375
							}

							if ((var6 & 16) != 0) { // L: 377
								var8 = var0.readUnsignedByte(); // L: 378
								byte[] var21 = new byte[var8]; // L: 379
								Buffer var26 = new Buffer(var21); // L: 380
								var0.method7828(var21, 0, var8); // L: 381
								Players.field1307[var4] = var26; // L: 382
								var5.read(var26); // L: 383
							}

							if (var5.field1088) { // L: 385
								if (var7 == 127) { // L: 386
									var5.resetPath(var5.tileX, var5.tileY);
								} else {
									class192 var25;
									if (var7 != class192.field2208.field2210) { // L: 389
										class192[] var22 = new class192[]{class192.field2212, class192.field2208, class192.field2209, class192.field2211}; // L: 392
										var25 = (class192)Actor.findEnumerated(var22, var7); // L: 394
									} else {
										var25 = Players.field1304[var4]; // L: 396
									}

									var5.method2139(var5.tileX, var5.tileY, var25); // L: 397
								}
							}
						}

						if (var0.offset - var2 != var1) { // L: 404
							throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 405
						}
					}
				}
			}
		}
	} // L: 407
}
