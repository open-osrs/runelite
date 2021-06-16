import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -592681403
	)
	static int field3599;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2033401093
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("g")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("t")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("u")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("q")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("s")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("p")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("c")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lox;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("l")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("w")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1153167145
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("ak")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("ad")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field3599 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "341986030"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1768582746"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 204

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1362561714"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "619109968"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = ItemLayer.method3863(var1, var1.length); // L: 37
		Buffer var2 = new Buffer(class106.decompressBytes(var1)); // L: 38
		int var3 = var2.readUnsignedByte(); // L: 39
		if (var3 >= 5 && var3 <= 7) { // L: 40
			if (var3 >= 6) { // L: 41
				var2.readInt(); // L: 42
			}

			int var4 = var2.readUnsignedByte();
			if (var3 >= 7) {
				this.groupCount = var2.method6629();
			} else {
				this.groupCount = var2.readUnsignedShort(); // L: 47
			}

			int var5 = 0; // L: 48
			int var6 = -1; // L: 49
			this.groupIds = new int[this.groupCount]; // L: 50
			int var7;
			if (var3 >= 7) { // L: 51
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 52
					this.groupIds[var7] = var5 += var2.method6629(); // L: 53
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
						var12 = this.fileIds[var8][var11] = var5 += var2.method6629(); // L: 85
						if (var12 > var10) { // L: 86
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1]; // L: 88
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					var5 = 0;
					var10 = -1;
					this.fileIds[var8] = new int[var9]; // L: 97

					for (var11 = 0; var11 < var9; ++var11) { // L: 98
						var12 = this.fileIds[var8][var11] = var5 += var2.readUnsignedShort();
						if (var12 > var10) {
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1];
				}
			}

			if (var4 != 0) {
				this.fileNameHashes = new int[var6 + 1][]; // L: 106
				this.fileNameHashTables = new IntHashTable[var6 + 1]; // L: 107

				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					this.fileNameHashes[var8] = new int[this.files[var8].length]; // L: 111

					for (var10 = 0; var10 < var9; ++var10) {
						this.fileNameHashes[var8][this.fileIds[var8][var10]] = var2.readInt();
					}

					this.fileNameHashTables[var8] = new IntHashTable(this.fileNameHashes[var8]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIS)[B",
		garbageValue = "-23090"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "456038683"
	)
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 125
			if (this.files[var1][var2] == null) { // L: 126
				boolean var4 = this.buildFiles(var1, var3);
				if (!var4) { // L: 128
					this.loadGroup(var1); // L: 129
					var4 = this.buildFiles(var1, var3);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = class304.method5597(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "974691239"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] != null) { // L: 141
				return true;
			} else if (this.groups[var1] != null) { // L: 142
				return true;
			} else {
				this.loadGroup(var1);
				return this.groups[var1] != null;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	public boolean method5071(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 150
		} else {
			throw new RuntimeException(); // L: 151
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) { // L: 155
			return true;
		} else {
			this.loadGroup(var1);
			return this.groups[var1] != null;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1206998992"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true;

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) { // L: 163
			int var3 = this.groupIds[var2]; // L: 164
			if (this.groups[var3] == null) {
				this.loadGroup(var3);
				if (this.groups[var3] == null) {
					var1 = false;
				}
			}
		}

		return var1; // L: 170
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1122798118"
	)
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) {
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1973943836"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 185
			if (this.files[var1][var2] == null) {
				boolean var3 = this.buildFiles(var1, (int[])null); // L: 187
				if (!var3) { // L: 188
					this.loadGroup(var1); // L: 189
					var3 = this.buildFiles(var1, (int[])null); // L: 190
					if (!var3) { // L: 191
						return null;
					}
				}
			}

			byte[] var4 = class304.method5597(this.files[var1][var2], false); // L: 194
			return var4; // L: 195
		} else {
			return null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "2061465489"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1723486034"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 207 208 210
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-404024789"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length; // L: 214
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-95"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 218
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 222
			this.groups[var1] = null;
		}

	} // L: 223

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "282074373"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 226
			this.files[var1][var2] = null;
		}

	} // L: 227

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-952876246"
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "0"
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
				byte[] var21;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 251
					var21 = class304.method5597(this.groups[var1], false); // L: 256
				} else {
					var21 = class304.method5597(this.groups[var1], true); // L: 252
					Buffer var8 = new Buffer(var21); // L: 253
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 254
				}

				byte[] var25 = class106.decompressBytes(var21); // L: 259
				if (this.releaseGroups) { // L: 264
					this.groups[var1] = null;
				}

				int var10;
				if (var3 > 1) { // L: 265
					int var22 = var25.length; // L: 266
					--var22; // L: 267
					var10 = var25[var22] & 255;
					var22 -= var3 * var10 * 4; // L: 268
					Buffer var11 = new Buffer(var25); // L: 269
					int[] var12 = new int[var3]; // L: 270
					var11.offset = var22; // L: 271

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 272
						var14 = 0; // L: 273

						for (var15 = 0; var15 < var3; ++var15) { // L: 274
							var14 += var11.readInt(); // L: 275
							var12[var15] += var14; // L: 276
						}
					}

					byte[][] var23 = new byte[var3][]; // L: 279

					for (var14 = 0; var14 < var3; ++var14) { // L: 280
						var23[var14] = new byte[var12[var14]]; // L: 281
						var12[var14] = 0; // L: 282
					}

					var11.offset = var22; // L: 284
					var14 = 0; // L: 285

					int var17;
					for (var15 = 0; var15 < var10; ++var15) { // L: 286
						int var24 = 0; // L: 287

						for (var17 = 0; var17 < var3; ++var17) { // L: 288
							var24 += var11.readInt(); // L: 289
							System.arraycopy(var25, var14, var23[var17], var12[var17], var24); // L: 290
							var12[var17] += var24; // L: 291
							var14 += var24; // L: 292
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 295
						if (!this.shallowFiles) { // L: 296
							var17 = var4[var15]; // L: 298
							byte[] var19 = var23[var15]; // L: 300
							Object var18;
							if (var19 == null) { // L: 302
								var18 = null; // L: 303
							} else if (var19.length > 136) { // L: 306
								DirectByteArrayCopier var20 = new DirectByteArrayCopier(); // L: 308
								var20.set(var19); // L: 309
								var18 = var20; // L: 310
							} else {
								var18 = var19; // L: 315
							}

							var5[var17] = var18; // L: 317
						} else {
							var5[var4[var15]] = var23[var15]; // L: 319
						}
					}
				} else if (!this.shallowFiles) { // L: 323
					var10 = var4[0]; // L: 325
					Object var26;
					if (var25 == null) { // L: 328
						var26 = null; // L: 329
					} else if (var25.length > 136) { // L: 332
						DirectByteArrayCopier var27 = new DirectByteArrayCopier(); // L: 334
						var27.set(var25); // L: 335
						var26 = var27; // L: 336
					} else {
						var26 = var25; // L: 341
					}

					var5[var10] = var26; // L: 343
				} else {
					var5[var4[0]] = var25; // L: 345
				}

				return true; // L: 347
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "48"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 351
		return this.groupNameHashTable.get(FontName.hashString(var1)); // L: 352
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "1136247668"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 356
		return this.fileNameHashTables[var1].get(FontName.hashString(var2)); // L: 357
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "-116"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 361
		var2 = var2.toLowerCase(); // L: 362
		int var3 = this.groupNameHashTable.get(FontName.hashString(var1)); // L: 363
		if (var3 < 0) { // L: 364
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(FontName.hashString(var2)); // L: 365
			return var4 >= 0; // L: 366
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "1041405463"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 371
		var2 = var2.toLowerCase(); // L: 372
		int var3 = this.groupNameHashTable.get(FontName.hashString(var1)); // L: 373
		int var4 = this.fileNameHashTables[var3].get(FontName.hashString(var2)); // L: 374
		return this.takeFile(var3, var4); // L: 375
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "1893660482"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 379
		var2 = var2.toLowerCase(); // L: 380
		int var3 = this.groupNameHashTable.get(FontName.hashString(var1)); // L: 381
		int var4 = this.fileNameHashTables[var3].get(FontName.hashString(var2)); // L: 382
		return this.tryLoadFile(var3, var4); // L: 383
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "2073972058"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 387
		int var2 = this.groupNameHashTable.get(FontName.hashString(var1)); // L: 388
		return this.tryLoadGroup(var2); // L: 389
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2081300499"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 393
		int var2 = this.groupNameHashTable.get(FontName.hashString(var1)); // L: 394
		if (var2 >= 0) { // L: 395
			this.loadRegionFromGroup(var2); // L: 396
		}
	} // L: 397

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "366192275"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 400
		int var2 = this.groupNameHashTable.get(FontName.hashString(var1)); // L: 401
		return this.groupLoadPercent(var2); // L: 402
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lns;B)V",
		garbageValue = "101"
	)
	static final void method5160(PacketBuffer var0) {
		int var1 = 0; // L: 89
		var0.importIndex(); // L: 90

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 91
			var5 = Players.Players_indices[var2]; // L: 92
			if ((Players.field1372[var5] & 1) == 0) { // L: 93
				if (var1 > 0) { // L: 94
					--var1; // L: 95
					var10000 = Players.field1372; // L: 96
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 99
					if (var4 == 0) { // L: 100
						var1 = class244.method4805(var0); // L: 101
						var10000 = Players.field1372; // L: 102
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						GrandExchangeOfferWorldComparator.readPlayerUpdate(var0, var5); // L: 105
					}
				}
			}
		}

		var0.exportIndex(); // L: 108
		if (var1 != 0) { // L: 109
			throw new RuntimeException(); // L: 110
		} else {
			var0.importIndex(); // L: 112

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 113
				var5 = Players.Players_indices[var2]; // L: 114
				if ((Players.field1372[var5] & 1) != 0) { // L: 115
					if (var1 > 0) { // L: 116
						--var1; // L: 117
						var10000 = Players.field1372; // L: 118
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 121
						if (var4 == 0) { // L: 122
							var1 = class244.method4805(var0); // L: 123
							var10000 = Players.field1372; // L: 124
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							GrandExchangeOfferWorldComparator.readPlayerUpdate(var0, var5); // L: 127
						}
					}
				}
			}

			var0.exportIndex(); // L: 130
			if (var1 != 0) { // L: 131
				throw new RuntimeException(); // L: 132
			} else {
				var0.importIndex(); // L: 134

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 135
					var5 = Players.Players_emptyIndices[var2]; // L: 136
					if ((Players.field1372[var5] & 1) != 0) { // L: 137
						if (var1 > 0) { // L: 138
							--var1; // L: 139
							var10000 = Players.field1372; // L: 140
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 143
							if (var4 == 0) { // L: 144
								var1 = class244.method4805(var0); // L: 145
								var10000 = Players.field1372; // L: 146
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (class35.updateExternalPlayer(var0, var5)) { // L: 149
								var10000 = Players.field1372;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 152
				if (var1 != 0) { // L: 153
					throw new RuntimeException(); // L: 154
				} else {
					var0.importIndex(); // L: 156

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 157
						var5 = Players.Players_emptyIndices[var2]; // L: 158
						if ((Players.field1372[var5] & 1) == 0) { // L: 159
							if (var1 > 0) { // L: 160
								--var1; // L: 161
								var10000 = Players.field1372; // L: 162
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 165
								if (var4 == 0) { // L: 166
									var1 = class244.method4805(var0); // L: 167
									var10000 = Players.field1372; // L: 168
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (class35.updateExternalPlayer(var0, var5)) { // L: 171
									var10000 = Players.field1372;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 174
					if (var1 != 0) { // L: 175
						throw new RuntimeException(); // L: 176
					} else {
						Players.Players_count = 0; // L: 178
						Players.Players_emptyIdxCount = 0; // L: 179

						for (var2 = 1; var2 < 2048; ++var2) { // L: 180
							var10000 = Players.field1372; // L: 181
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 182
							if (var3 != null) { // L: 183
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 184
							}
						}

					}
				}
			}
		}
	} // L: 186

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1724921062"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}
}
