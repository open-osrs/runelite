import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1188846239
	)
	static int field3176;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1207757515
	)
	int groupCount;
	@ObfuscatedName("s")
	int[] groupIds;
	@ObfuscatedName("t")
	int[] groupNameHashes;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	IntHashTable groupNameHashTable;
	@ObfuscatedName("o")
	int[] groupCrcs;
	@ObfuscatedName("x")
	int[] groupVersions;
	@ObfuscatedName("w")
	int[] fileCounts;
	@ObfuscatedName("g")
	int[][] fileIds;
	@ObfuscatedName("m")
	int[][] fileNameHashes;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lmc;"
	)
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("d")
	Object[] groups;
	@ObfuscatedName("h")
	Object[][] files;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1382012253
	)
	public int hash;
	@ObfuscatedName("c")
	boolean releaseGroups;
	@ObfuscatedName("f")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field3176 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1234348933"
	)
	void decodeIndex(byte[] var1) {
		this.hash = GameShell.method1108(var1, var1.length); // L: 37
		Buffer var2 = new Buffer(DevicePcmPlayerProvider.decompressBytes(var1)); // L: 38
		int var3 = var2.readUnsignedByte(); // L: 39
		if (var3 >= 5 && var3 <= 7) { // L: 40
			if (var3 >= 6) { // L: 41
				var2.readInt(); // L: 42
			}

			int var4 = var2.readUnsignedByte(); // L: 45
			if (var3 >= 7) { // L: 46
				this.groupCount = var2.method5666();
			} else {
				this.groupCount = var2.readUnsignedShort(); // L: 47
			}

			int var5 = 0; // L: 48
			int var6 = -1; // L: 49
			this.groupIds = new int[this.groupCount]; // L: 50
			int var7;
			if (var3 >= 7) { // L: 51
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 52
					this.groupIds[var7] = var5 += var2.method5666(); // L: 53
					if (this.groupIds[var7] > var6) { // L: 54
						var6 = this.groupIds[var7];
					}
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 58
					this.groupIds[var7] = var5 += var2.readUnsignedShort(); // L: 59
					if (this.groupIds[var7] > var6) { // L: 60
						var6 = this.groupIds[var7];
					}
				}
			}

			this.groupCrcs = new int[var6 + 1]; // L: 63
			this.groupVersions = new int[var6 + 1]; // L: 64
			this.fileCounts = new int[var6 + 1]; // L: 65
			this.fileIds = new int[var6 + 1][]; // L: 66
			this.groups = new Object[var6 + 1]; // L: 67
			this.files = new Object[var6 + 1][]; // L: 68
			if (var4 != 0) { // L: 69
				this.groupNameHashes = new int[var6 + 1]; // L: 70

				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 71
					this.groupNameHashes[this.groupIds[var7]] = var2.readInt();
				}

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes); // L: 72
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 74
				this.groupCrcs[this.groupIds[var7]] = var2.readInt();
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 75
				this.groupVersions[this.groupIds[var7]] = var2.readInt();
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 76
				this.fileCounts[this.groupIds[var7]] = var2.readUnsignedShort();
			}

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			if (var3 >= 7) { // L: 77
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 78
					var8 = this.groupIds[var7]; // L: 79
					var9 = this.fileCounts[var8]; // L: 80
					var5 = 0; // L: 81
					var10 = -1; // L: 82
					this.fileIds[var8] = new int[var9]; // L: 83

					for (var11 = 0; var11 < var9; ++var11) { // L: 84
						var12 = this.fileIds[var8][var11] = var5 += var2.method5666(); // L: 85
						if (var12 > var10) { // L: 86
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1]; // L: 88
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 92
					var8 = this.groupIds[var7]; // L: 93
					var9 = this.fileCounts[var8]; // L: 94
					var5 = 0; // L: 95
					var10 = -1; // L: 96
					this.fileIds[var8] = new int[var9]; // L: 97

					for (var11 = 0; var11 < var9; ++var11) { // L: 98
						var12 = this.fileIds[var8][var11] = var5 += var2.readUnsignedShort(); // L: 99
						if (var12 > var10) { // L: 100
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1]; // L: 102
				}
			}

			if (var4 != 0) { // L: 105
				this.fileNameHashes = new int[var6 + 1][]; // L: 106
				this.fileNameHashTables = new IntHashTable[var6 + 1]; // L: 107

				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 108
					var8 = this.groupIds[var7]; // L: 109
					var9 = this.fileCounts[var8]; // L: 110
					this.fileNameHashes[var8] = new int[this.files[var8].length]; // L: 111

					for (var10 = 0; var10 < var9; ++var10) { // L: 112
						this.fileNameHashes[var8][this.fileIds[var8][var10]] = var2.readInt();
					}

					this.fileNameHashTables[var8] = new IntHashTable(this.fileNameHashes[var8]); // L: 113
				}
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 116

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "176946518"
	)
	void loadRegionFromGroup(int var1) {
	} // L: 118

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "273690094"
	)
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 121
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "1965350454"
	)
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 125
			if (this.files[var1][var2] == null) { // L: 126
				boolean var4 = this.buildFiles(var1, var3); // L: 127
				if (!var4) { // L: 128
					this.loadGroup(var1); // L: 129
					var4 = this.buildFiles(var1, var3); // L: 130
					if (!var4) { // L: 131
						return null;
					}
				}
			}

			byte[] var5 = Script.method2323(this.files[var1][var2], false); // L: 134
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 135
			}

			return var5; // L: 136
		} else {
			return null;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "49"
	)
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 140
			if (this.files[var1][var2] != null) { // L: 141
				return true;
			} else if (this.groups[var1] != null) { // L: 142
				return true;
			} else {
				this.loadGroup(var1); // L: 143
				return this.groups[var1] != null; // L: 144
			}
		} else {
			return false; // L: 145
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "5"
	)
	public boolean method4251(int var1) {
		if (this.files.length == 1) { // L: 149
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 150
		} else {
			throw new RuntimeException(); // L: 151
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2078810359"
	)
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) { // L: 155
			return true;
		} else {
			this.loadGroup(var1); // L: 156
			return this.groups[var1] != null; // L: 157
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-719435847"
	)
	public boolean isFullyLoaded() {
		boolean var1 = true; // L: 162

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) { // L: 163
			int var3 = this.groupIds[var2]; // L: 164
			if (this.groups[var3] == null) { // L: 165
				this.loadGroup(var3); // L: 166
				if (this.groups[var3] == null) { // L: 167
					var1 = false;
				}
			}
		}

		return var1; // L: 170
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-21407020"
	)
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 174 175
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1800797786"
	)
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) { // L: 179
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0); // L: 180
		} else {
			throw new RuntimeException(); // L: 181
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1118526903"
	)
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 185
			if (this.files[var1][var2] == null) { // L: 186
				boolean var3 = this.buildFiles(var1, (int[])null); // L: 187
				if (!var3) { // L: 188
					this.loadGroup(var1); // L: 189
					var3 = this.buildFiles(var1, (int[])null); // L: 190
					if (!var3) { // L: 191
						return null;
					}
				}
			}

			byte[] var4 = Script.method2323(this.files[var1][var2], false); // L: 194
			return var4; // L: 195
		} else {
			return null;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "89"
	)
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) { // L: 199
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0); // L: 200
		} else {
			throw new RuntimeException(); // L: 201
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "450530880"
	)
	void loadGroup(int var1) {
	} // L: 204

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "-40"
	)
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 207 208 210
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1433553741"
	)
	public int getGroupFileCount(int var1) {
		return this.files[var1].length; // L: 214
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2124979087"
	)
	public int getGroupCount() {
		return this.files.length; // L: 218
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1681224039"
	)
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 222
			this.groups[var1] = null;
		}

	} // L: 223

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1439856856"
	)
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 226
			this.files[var1][var2] = null;
		}

	} // L: 227

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-83"
	)
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 230
			if (this.files[var1] != null) { // L: 231
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 232
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 235

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "303004992"
	)
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) { // L: 238
			return false;
		} else {
			int var3 = this.fileCounts[var1]; // L: 239
			int[] var4 = this.fileIds[var1]; // L: 240
			Object[] var5 = this.files[var1]; // L: 241
			boolean var6 = true; // L: 242

			for (int var7 = 0; var7 < var3; ++var7) { // L: 243
				if (var5[var4[var7]] == null) { // L: 244
					var6 = false; // L: 245
					break;
				}
			}

			if (var6) { // L: 249
				return true;
			} else {
				byte[] var18;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 251
					var18 = Script.method2323(this.groups[var1], false); // L: 256
				} else {
					var18 = Script.method2323(this.groups[var1], true); // L: 252
					Buffer var8 = new Buffer(var18); // L: 253
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 254
				}

				byte[] var20 = DevicePcmPlayerProvider.decompressBytes(var18); // L: 259
				if (this.releaseGroups) { // L: 264
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 265
					int var9 = var20.length; // L: 266
					--var9;
					int var10 = var20[var9] & 255; // L: 267
					var9 -= var10 * var3 * 4; // L: 268
					Buffer var11 = new Buffer(var20); // L: 269
					int[] var12 = new int[var3]; // L: 270
					var11.offset = var9; // L: 271

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 272
						var14 = 0; // L: 273

						for (var15 = 0; var15 < var3; ++var15) { // L: 274
							var14 += var11.readInt(); // L: 275
							var12[var15] += var14; // L: 276
						}
					}

					byte[][] var19 = new byte[var3][]; // L: 279

					for (var14 = 0; var14 < var3; ++var14) { // L: 280
						var19[var14] = new byte[var12[var14]]; // L: 281
						var12[var14] = 0; // L: 282
					}

					var11.offset = var9; // L: 284
					var14 = 0; // L: 285

					for (var15 = 0; var15 < var10; ++var15) { // L: 286
						int var16 = 0; // L: 287

						for (int var17 = 0; var17 < var3; ++var17) { // L: 288
							var16 += var11.readInt(); // L: 289
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16); // L: 290
							var12[var17] += var16; // L: 291
							var14 += var16; // L: 292
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 295
						if (!this.shallowFiles) { // L: 296
							var5[var4[var15]] = MenuAction.method2140(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 297
						}
					}
				} else if (!this.shallowFiles) { // L: 301
					var5[var4[0]] = MenuAction.method2140(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 302
				}

				return true; // L: 304
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1161611566"
	)
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 308
		return this.groupNameHashTable.get(Timer.hashString(var1)); // L: 309
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)I",
		garbageValue = "-117"
	)
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 313
		return this.fileNameHashTables[var1].get(Timer.hashString(var2)); // L: 314
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1221134152"
	)
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 318
		var2 = var2.toLowerCase(); // L: 319
		int var3 = this.groupNameHashTable.get(Timer.hashString(var1)); // L: 320
		if (var3 < 0) { // L: 321
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(Timer.hashString(var2)); // L: 322
			return var4 >= 0; // L: 323
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "-406743682"
	)
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 328
		var2 = var2.toLowerCase(); // L: 329
		int var3 = this.groupNameHashTable.get(Timer.hashString(var1)); // L: 330
		int var4 = this.fileNameHashTables[var3].get(Timer.hashString(var2)); // L: 331
		return this.takeFile(var3, var4); // L: 332
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "63"
	)
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 336
		var2 = var2.toLowerCase(); // L: 337
		int var3 = this.groupNameHashTable.get(Timer.hashString(var1)); // L: 338
		int var4 = this.fileNameHashTables[var3].get(Timer.hashString(var2)); // L: 339
		return this.tryLoadFile(var3, var4); // L: 340
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1277602080"
	)
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 344
		int var2 = this.groupNameHashTable.get(Timer.hashString(var1)); // L: 345
		return this.tryLoadGroup(var2); // L: 346
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "663022777"
	)
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 350
		int var2 = this.groupNameHashTable.get(Timer.hashString(var1)); // L: 351
		if (var2 >= 0) { // L: 352
			this.loadRegionFromGroup(var2); // L: 353
		}
	} // L: 354

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1179908278"
	)
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 357
		int var2 = this.groupNameHashTable.get(Timer.hashString(var1)); // L: 358
		return this.groupLoadPercent(var2); // L: 359
	}
}
