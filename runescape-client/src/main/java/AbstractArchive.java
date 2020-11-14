import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 910501157
	)
	static int field3173;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 775749307
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("l")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("m")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("q")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("k")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("c")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("u")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("t")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lmj;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("o")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("n")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1565476679
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("r")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("y")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field3173 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1837792503"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length; // L: 38
		int var2 = class4.method81(var1, 0, var3); // L: 40
		this.hash = var2; // L: 42
		Buffer var4 = new Buffer(UserComparator3.decompressBytes(var1)); // L: 43
		int var5 = var4.readUnsignedByte(); // L: 44
		if (var5 >= 5 && var5 <= 7) { // L: 45
			if (var5 >= 6) { // L: 46
				var4.readInt(); // L: 47
			}

			int var6 = var4.readUnsignedByte();
			if (var5 >= 7) {
				this.groupCount = var4.method5653();
			} else {
				this.groupCount = var4.readUnsignedShort();
			}

			int var7 = 0;
			int var8 = -1;
			this.groupIds = new int[this.groupCount];
			int var9;
			if (var5 >= 7) {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					this.groupIds[var9] = var7 += var4.method5653();
					if (this.groupIds[var9] > var8) {
						var8 = this.groupIds[var9];
					}
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 63
					this.groupIds[var9] = var7 += var4.readUnsignedShort(); // L: 64
					if (this.groupIds[var9] > var8) { // L: 65
						var8 = this.groupIds[var9];
					}
				}
			}

			this.groupCrcs = new int[var8 + 1]; // L: 68
			this.groupVersions = new int[var8 + 1]; // L: 69
			this.fileCounts = new int[var8 + 1]; // L: 70
			this.fileIds = new int[var8 + 1][]; // L: 71
			this.groups = new Object[var8 + 1]; // L: 72
			this.files = new Object[var8 + 1][]; // L: 73
			if (var6 != 0) { // L: 74
				this.groupNameHashes = new int[var8 + 1]; // L: 75

				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 76
					this.groupNameHashes[this.groupIds[var9]] = var4.readInt();
				}

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes); // L: 77
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 79
				this.groupCrcs[this.groupIds[var9]] = var4.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 80
				this.groupVersions[this.groupIds[var9]] = var4.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 81
				this.fileCounts[this.groupIds[var9]] = var4.readUnsignedShort();
			}

			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			if (var5 >= 7) { // L: 82
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 83
					var10 = this.groupIds[var9]; // L: 84
					var11 = this.fileCounts[var10]; // L: 85
					var7 = 0; // L: 86
					var12 = -1; // L: 87
					this.fileIds[var10] = new int[var11]; // L: 88

					for (var13 = 0; var13 < var11; ++var13) { // L: 89
						var14 = this.fileIds[var10][var13] = var7 += var4.method5653(); // L: 90
						if (var14 > var12) { // L: 91
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1]; // L: 93
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 97
					var10 = this.groupIds[var9]; // L: 98
					var11 = this.fileCounts[var10]; // L: 99
					var7 = 0; // L: 100
					var12 = -1; // L: 101
					this.fileIds[var10] = new int[var11]; // L: 102

					for (var13 = 0; var13 < var11; ++var13) { // L: 103
						var14 = this.fileIds[var10][var13] = var7 += var4.readUnsignedShort(); // L: 104
						if (var14 > var12) { // L: 105
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1]; // L: 107
				}
			}

			if (var6 != 0) { // L: 110
				this.fileNameHashes = new int[var8 + 1][]; // L: 111
				this.fileNameHashTables = new IntHashTable[var8 + 1]; // L: 112

				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 113
					var10 = this.groupIds[var9]; // L: 114
					var11 = this.fileCounts[var10]; // L: 115
					this.fileNameHashes[var10] = new int[this.files[var10].length]; // L: 116

					for (var12 = 0; var12 < var11; ++var12) { // L: 117
						this.fileNameHashes[var10][this.fileIds[var10][var12]] = var4.readInt();
					}

					this.fileNameHashTables[var10] = new IntHashTable(this.fileNameHashes[var10]); // L: 118
				}
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 121

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1666992241"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 123

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1866265901"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 126
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-268941937"
	)
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 130
			if (this.files[var1][var2] == null) { // L: 131
				boolean var4 = this.buildFiles(var1, var3); // L: 132
				if (!var4) { // L: 133
					this.loadGroup(var1); // L: 134
					var4 = this.buildFiles(var1, var3); // L: 135
					if (!var4) { // L: 136
						return null;
					}
				}
			}

			byte[] var5 = CollisionMap.method3712(this.files[var1][var2], false); // L: 139
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 140
			}

			return var5; // L: 141
		} else {
			return null;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-37"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 145
			if (this.files[var1][var2] != null) { // L: 146
				return true;
			} else if (this.groups[var1] != null) { // L: 147
				return true;
			} else {
				this.loadGroup(var1); // L: 148
				return this.groups[var1] != null; // L: 149
			}
		} else {
			return false; // L: 150
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1001289587"
	)
	public boolean method4301(int var1) {
		if (this.files.length == 1) { // L: 154
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 155
		} else {
			throw new RuntimeException(); // L: 156
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "452985431"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) { // L: 160
			return true;
		} else {
			this.loadGroup(var1); // L: 161
			return this.groups[var1] != null; // L: 162
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1015322463"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true; // L: 167

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) { // L: 168
			int var3 = this.groupIds[var2]; // L: 169
			if (this.groups[var3] == null) { // L: 170
				this.loadGroup(var3); // L: 171
				if (this.groups[var3] == null) { // L: 172
					var1 = false;
				}
			}
		}

		return var1; // L: 175
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1168057688"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 179 180
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1769170354"
	)
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) { // L: 184
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0); // L: 185
		} else {
			throw new RuntimeException(); // L: 186
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1969973246"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 190
			if (this.files[var1][var2] == null) { // L: 191
				boolean var3 = this.buildFiles(var1, (int[])null); // L: 192
				if (!var3) { // L: 193
					this.loadGroup(var1); // L: 194
					var3 = this.buildFiles(var1, (int[])null); // L: 195
					if (!var3) { // L: 196
						return null;
					}
				}
			}

			byte[] var4 = CollisionMap.method3712(this.files[var1][var2], false); // L: 199
			return var4; // L: 200
		} else {
			return null;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "475787728"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) { // L: 204
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0); // L: 205
		} else {
			throw new RuntimeException(); // L: 206
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1308309481"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 209

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IS)[I",
		garbageValue = "1393"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-118"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1138802356"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 223
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1555898760"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 227
			this.groups[var1] = null;
		}

	} // L: 228

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-237320932"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 231
			this.files[var1][var2] = null;
		}

	} // L: 232

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-2"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 235
			if (this.files[var1] != null) { // L: 236
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 237
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 240

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "453769668"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) { // L: 243
			return false;
		} else {
			int var3 = this.fileCounts[var1]; // L: 244
			int[] var4 = this.fileIds[var1]; // L: 245
			Object[] var5 = this.files[var1]; // L: 246
			boolean var6 = true; // L: 247

			for (int var7 = 0; var7 < var3; ++var7) { // L: 248
				if (var5[var4[var7]] == null) { // L: 249
					var6 = false; // L: 250
					break;
				}
			}

			if (var6) { // L: 254
				return true;
			} else {
				byte[] var18;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 256
					var18 = CollisionMap.method3712(this.groups[var1], false); // L: 261
				} else {
					var18 = CollisionMap.method3712(this.groups[var1], true); // L: 257
					Buffer var8 = new Buffer(var18); // L: 258
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 259
				}

				byte[] var20 = UserComparator3.decompressBytes(var18); // L: 264
				if (this.releaseGroups) { // L: 282
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 283
					int var9 = var20.length; // L: 284
					--var9; // L: 285
					int var10 = var20[var9] & 255;
					var9 -= var10 * var3 * 4; // L: 286
					Buffer var11 = new Buffer(var20); // L: 287
					int[] var12 = new int[var3]; // L: 288
					var11.offset = var9; // L: 289

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 290
						var14 = 0; // L: 291

						for (var15 = 0; var15 < var3; ++var15) { // L: 292
							var14 += var11.readInt(); // L: 293
							var12[var15] += var14; // L: 294
						}
					}

					byte[][] var19 = new byte[var3][]; // L: 297

					for (var14 = 0; var14 < var3; ++var14) { // L: 298
						var19[var14] = new byte[var12[var14]]; // L: 299
						var12[var14] = 0; // L: 300
					}

					var11.offset = var9; // L: 302
					var14 = 0; // L: 303

					for (var15 = 0; var15 < var10; ++var15) { // L: 304
						int var16 = 0; // L: 305

						for (int var17 = 0; var17 < var3; ++var17) { // L: 306
							var16 += var11.readInt(); // L: 307
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16); // L: 308
							var12[var17] += var16; // L: 309
							var14 += var16; // L: 310
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 313
						if (!this.shallowFiles) { // L: 314
							var5[var4[var15]] = AbstractByteArrayCopier.method4069(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 315
						}
					}
				} else if (!this.shallowFiles) { // L: 319
					var5[var4[0]] = AbstractByteArrayCopier.method4069(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 320
				}

				return true; // L: 322
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-840193001"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 326
		return this.groupNameHashTable.get(UrlRequester.hashString(var1)); // L: 327
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "344989810"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 331
		return this.fileNameHashTables[var1].get(UrlRequester.hashString(var2)); // L: 332
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1115515997"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 336
		var2 = var2.toLowerCase(); // L: 337
		int var3 = this.groupNameHashTable.get(UrlRequester.hashString(var1)); // L: 338
		if (var3 < 0) { // L: 339
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(UrlRequester.hashString(var2)); // L: 340
			return var4 >= 0; // L: 341
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "-1708275377"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 346
		var2 = var2.toLowerCase(); // L: 347
		int var3 = this.groupNameHashTable.get(UrlRequester.hashString(var1)); // L: 348
		int var4 = this.fileNameHashTables[var3].get(UrlRequester.hashString(var2)); // L: 349
		return this.takeFile(var3, var4); // L: 350
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "-77"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 354
		var2 = var2.toLowerCase(); // L: 355
		int var3 = this.groupNameHashTable.get(UrlRequester.hashString(var1)); // L: 356
		int var4 = this.fileNameHashTables[var3].get(UrlRequester.hashString(var2)); // L: 357
		return this.tryLoadFile(var3, var4); // L: 358
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-80"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 362
		int var2 = this.groupNameHashTable.get(UrlRequester.hashString(var1)); // L: 363
		return this.tryLoadGroup(var2); // L: 364
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2009830657"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 368
		int var2 = this.groupNameHashTable.get(UrlRequester.hashString(var1)); // L: 369
		if (var2 >= 0) { // L: 370
			this.loadRegionFromGroup(var2); // L: 371
		}
	} // L: 372

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2077847342"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 375
		int var2 = this.groupNameHashTable.get(UrlRequester.hashString(var1)); // L: 376
		return this.groupLoadPercent(var2); // L: 377
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1262529684"
	)
	static void method4397() {
		Tiles.Tiles_minPlane = 99; // L: 48
		TileItem.field1273 = new byte[4][104][104]; // L: 49
		NPC.field1161 = new byte[4][104][104]; // L: 50
		Tiles.field531 = new byte[4][104][104]; // L: 51
		UserComparator2.field3859 = new byte[4][104][104]; // L: 52
		UserComparator10.field2000 = new int[4][105][105]; // L: 53
		class299.field3679 = new byte[4][105][105]; // L: 54
		UserComparator10.field1999 = new int[105][105]; // L: 55
		GrandExchangeOfferOwnWorldComparator.Tiles_hue = new int[104]; // L: 56
		class238.Tiles_saturation = new int[104]; // L: 57
		TileItemPile.Tiles_lightness = new int[104]; // L: 58
		class248.Tiles_hueMultiplier = new int[104]; // L: 59
		class1.field1 = new int[104]; // L: 60
	} // L: 61

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Liw;IS)V",
		garbageValue = "512"
	)
	static void method4386(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) { // L: 212
			SecureRandomFuture.logoSprite = Canvas.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 213
		} else if ((var1 & 1073741824) != 0) { // L: 215
			SecureRandomFuture.logoSprite = Canvas.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 216
		} else {
			SecureRandomFuture.logoSprite = Canvas.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 219
		}

	} // L: 221
}
