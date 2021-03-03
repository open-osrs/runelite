import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1957180243
	)
	static int field3171;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -108727695
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("d")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("c")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("h")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("z")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("e")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("q")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("l")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lma;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("b")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("a")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1729948471
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("i")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("x")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field3171 = 0;
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1548060023"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = GrandExchangeOfferOwnWorldComparator.method1380(var1, var1.length); // L: 37
		Buffer var2 = new Buffer(WorldMapDecorationType.decompressBytes(var1)); // L: 38
		int var3 = var2.readUnsignedByte(); // L: 39
		if (var3 >= 5 && var3 <= 7) { // L: 40
			if (var3 >= 6) { // L: 41
				var2.readInt(); // L: 42
			}

			int var4 = var2.readUnsignedByte(); // L: 45
			if (var3 >= 7) { // L: 46
				this.groupCount = var2.method5705();
			} else {
				this.groupCount = var2.readUnsignedShort(); // L: 47
			}

			int var5 = 0; // L: 48
			int var6 = -1; // L: 49
			this.groupIds = new int[this.groupCount]; // L: 50
			int var7;
			if (var3 >= 7) { // L: 51
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 52
					this.groupIds[var7] = var5 += var2.method5705(); // L: 53
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
						var12 = this.fileIds[var8][var11] = var5 += var2.method5705(); // L: 85
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "31242"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 118

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "53"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 121
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-1298768169"
	)
	@Export("takeFileEncrypted")
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

			byte[] var5 = ChatChannel.method2405(this.files[var1][var2], false); // L: 134
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 135
			}

			return var5; // L: 136
		} else {
			return null;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-751573419"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 140
			if (this.files[var1][var2] != null) {
				return true; // L: 141
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1147077273"
	)
	public boolean method4366(int var1) {
		if (this.files.length == 1) { // L: 149
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 150
		} else {
			throw new RuntimeException(); // L: 151
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1620003564"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) { // L: 155
			return true;
		} else {
			this.loadGroup(var1); // L: 156
			return this.groups[var1] != null; // L: 157
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "71"
	)
	@Export("isFullyLoaded")
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-693356446"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 174 175
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1180778193"
	)
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) { // L: 179
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0); // L: 180
		} else {
			throw new RuntimeException(); // L: 181
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1199791629"
	)
	@Export("getFile")
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

			byte[] var4 = ChatChannel.method2405(this.files[var1][var2], false); // L: 194
			return var4; // L: 195
		} else {
			return null;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1318442994"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) { // L: 199
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0); // L: 200
		} else {
			throw new RuntimeException(); // L: 201
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1209383303"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 204

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-325736688"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 207 208 210
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2092353569"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length; // L: 214
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-379085562"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 218
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1361507951"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 222
			this.groups[var1] = null;
		}

	} // L: 223

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1115746573"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 226
			this.files[var1][var2] = null;
		}

	} // L: 227

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1436245650"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 230
			if (this.files[var1] != null) { // L: 231
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 232
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 235

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "1632026762"
	)
	@Export("buildFiles")
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
					var18 = ChatChannel.method2405(this.groups[var1], false); // L: 256
				} else {
					var18 = ChatChannel.method2405(this.groups[var1], true); // L: 252
					Buffer var8 = new Buffer(var18); // L: 253
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 254
				}

				byte[] var20 = WorldMapDecorationType.decompressBytes(var18); // L: 259
				if (this.releaseGroups) { // L: 271
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 272
					int var9 = var20.length; // L: 273
					--var9;
					int var10 = var20[var9] & 255; // L: 274
					var9 -= var10 * var3 * 4; // L: 275
					Buffer var11 = new Buffer(var20); // L: 276
					int[] var12 = new int[var3]; // L: 277
					var11.offset = var9; // L: 278

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 279
						var14 = 0; // L: 280

						for (var15 = 0; var15 < var3; ++var15) { // L: 281
							var14 += var11.readInt(); // L: 282
							var12[var15] += var14; // L: 283
						}
					}

					byte[][] var19 = new byte[var3][]; // L: 286

					for (var14 = 0; var14 < var3; ++var14) { // L: 287
						var19[var14] = new byte[var12[var14]]; // L: 288
						var12[var14] = 0; // L: 289
					}

					var11.offset = var9; // L: 291
					var14 = 0; // L: 292

					for (var15 = 0; var15 < var10; ++var15) { // L: 293
						int var16 = 0; // L: 294

						for (int var17 = 0; var17 < var3; ++var17) { // L: 295
							var16 += var11.readInt(); // L: 296
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16); // L: 297
							var12[var17] += var16; // L: 298
							var14 += var16; // L: 299
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 302
						if (!this.shallowFiles) { // L: 303
							var5[var4[var15]] = class92.method2195(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 304
						}
					}
				} else if (!this.shallowFiles) { // L: 308
					var5[var4[0]] = class92.method2195(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 309
				}

				return true; // L: 311
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "380978131"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 315
		return this.groupNameHashTable.get(class225.hashString(var1)); // L: 316
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "-1592351891"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 320
		return this.fileNameHashTables[var1].get(class225.hashString(var2)); // L: 321
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-360297059"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 325
		var2 = var2.toLowerCase(); // L: 326
		int var3 = this.groupNameHashTable.get(class225.hashString(var1)); // L: 327
		if (var3 < 0) { // L: 328
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class225.hashString(var2)); // L: 329
			return var4 >= 0; // L: 330
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "-981973425"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 335
		var2 = var2.toLowerCase(); // L: 336
		int var3 = this.groupNameHashTable.get(class225.hashString(var1)); // L: 337
		int var4 = this.fileNameHashTables[var3].get(class225.hashString(var2)); // L: 338
		return this.takeFile(var3, var4); // L: 339
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "1"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 343
		var2 = var2.toLowerCase(); // L: 344
		int var3 = this.groupNameHashTable.get(class225.hashString(var1)); // L: 345
		int var4 = this.fileNameHashTables[var3].get(class225.hashString(var2)); // L: 346
		return this.tryLoadFile(var3, var4); // L: 347
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-101"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 351
		int var2 = this.groupNameHashTable.get(class225.hashString(var1)); // L: 352
		return this.tryLoadGroup(var2); // L: 353
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "208562973"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 357
		int var2 = this.groupNameHashTable.get(class225.hashString(var1)); // L: 358
		if (var2 >= 0) { // L: 359
			this.loadRegionFromGroup(var2); // L: 360
		}
	} // L: 361

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "40"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 364
		int var2 = this.groupNameHashTable.get(class225.hashString(var1)); // L: 365
		return this.groupLoadPercent(var2); // L: 366
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1365583869"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljl;",
		garbageValue = "-4"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 27
			var1 = new ParamComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 30
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(IIIILlm;Lht;I)V",
		garbageValue = "-1045650328"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 11414
			int var6 = Client.camAngleY & 2047; // L: 11415
			int var7 = var3 * var3 + var2 * var2; // L: 11416
			if (var7 <= 6400) { // L: 11417
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 11418
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 11419
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11420
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11421
				if (var7 > 2500) {
					var4.method6350(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 11422
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 11423
				}

			}
		}
	} // L: 11424
}
