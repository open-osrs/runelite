import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1889999803
	)
	static int field3171;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -1569410223
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -561639929
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("x")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("w")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("j")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("n")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("p")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("l")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("z")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lmb;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("e")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("m")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2057340569
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("f")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("a")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field3171 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "907674687"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = DynamicObject.method2305(var1, var1.length); // L: 37
		Buffer var2 = new Buffer(PrivateChatMode.decompressBytes(var1)); // L: 38
		int var3 = var2.readUnsignedByte(); // L: 39
		if (var3 >= 5 && var3 <= 7) { // L: 40
			if (var3 >= 6) { // L: 41
				var2.readInt(); // L: 42
			}

			int var4 = var2.readUnsignedByte(); // L: 45
			if (var3 >= 7) { // L: 46
				this.groupCount = var2.method5558();
			} else {
				this.groupCount = var2.readUnsignedShort(); // L: 47
			}

			int var5 = 0; // L: 48
			int var6 = -1; // L: 49
			this.groupIds = new int[this.groupCount]; // L: 50
			int var7;
			if (var3 >= 7) { // L: 51
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 52
					this.groupIds[var7] = var5 += var2.method5558(); // L: 53
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
						var12 = this.fileIds[var8][var11] = var5 += var2.method5558(); // L: 85
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
		descriptor = "(II)V",
		garbageValue = "-1807571765"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 118

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIS)[B",
		garbageValue = "-21068"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 121
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II[IB)[B",
		garbageValue = "-28"
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

			byte[] var5 = GrandExchangeOffer.method188(this.files[var1][var2], false); // L: 134
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 135
			}

			return var5; // L: 136
		} else {
			return null;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1736464380"
	)
	@Export("tryLoadFile")
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "256"
	)
	public boolean method4196(int var1) {
		if (this.files.length == 1) { // L: 149
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 150
		} else {
			throw new RuntimeException(); // L: 151
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1210314032"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1853187618"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2120197275"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 174 175
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "601238415"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "2110561538"
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

			byte[] var4 = GrandExchangeOffer.method188(this.files[var1][var2], false); // L: 194
			return var4; // L: 195
		} else {
			return null;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "66"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "786262695"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 204

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1130356360"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 207 208 210
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "64"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length; // L: 214
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1884163104"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 218
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 222
			this.groups[var1] = null;
		}

	} // L: 223

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1386061158"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 226
			this.files[var1][var2] = null;
		}

	} // L: 227

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "276266857"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "1"
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
					var21 = GrandExchangeOffer.method188(this.groups[var1], false); // L: 256
				} else {
					var21 = GrandExchangeOffer.method188(this.groups[var1], true); // L: 252
					Buffer var8 = new Buffer(var21); // L: 253
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 254
				}

				byte[] var25 = PrivateChatMode.decompressBytes(var21); // L: 259
				if (this.releaseGroups) { // L: 264
					this.groups[var1] = null;
				}

				int var10;
				if (var3 > 1) { // L: 265
					int var22 = var25.length; // L: 266
					--var22; // L: 267
					var10 = var25[var22] & 255;
					var22 -= var10 * var3 * 4; // L: 268
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
								var18 = var19; // L: 324
							}

							var5[var17] = var18; // L: 326
						} else {
							var5[var4[var15]] = var23[var15]; // L: 328
						}
					}
				} else if (!this.shallowFiles) { // L: 332
					var10 = var4[0]; // L: 334
					Object var26;
					if (var25 == null) { // L: 337
						var26 = null; // L: 338
					} else if (var25.length > 136) { // L: 341
						DirectByteArrayCopier var27 = new DirectByteArrayCopier(); // L: 343
						var27.set(var25); // L: 344
						var26 = var27; // L: 345
					} else {
						var26 = var25; // L: 359
					}

					var5[var10] = var26; // L: 361
				} else {
					var5[var4[0]] = var25; // L: 363
				}

				return true; // L: 365
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2131214347"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 369
		return this.groupNameHashTable.get(JagexCache.hashString(var1)); // L: 370
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "1284626629"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 374
		return this.fileNameHashTables[var1].get(JagexCache.hashString(var2)); // L: 375
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1088224070"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 379
		var2 = var2.toLowerCase(); // L: 380
		int var3 = this.groupNameHashTable.get(JagexCache.hashString(var1)); // L: 381
		if (var3 < 0) { // L: 382
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(JagexCache.hashString(var2)); // L: 383
			return var4 >= 0; // L: 384
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "1559839004"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 389
		var2 = var2.toLowerCase(); // L: 390
		int var3 = this.groupNameHashTable.get(JagexCache.hashString(var1)); // L: 391
		int var4 = this.fileNameHashTables[var3].get(JagexCache.hashString(var2)); // L: 392
		return this.takeFile(var3, var4); // L: 393
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "53"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 397
		var2 = var2.toLowerCase(); // L: 398
		int var3 = this.groupNameHashTable.get(JagexCache.hashString(var1)); // L: 399
		int var4 = this.fileNameHashTables[var3].get(JagexCache.hashString(var2)); // L: 400
		return this.tryLoadFile(var3, var4); // L: 401
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "113"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 405
		int var2 = this.groupNameHashTable.get(JagexCache.hashString(var1)); // L: 406
		return this.tryLoadGroup(var2); // L: 407
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "220365579"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 411
		int var2 = this.groupNameHashTable.get(JagexCache.hashString(var1)); // L: 412
		if (var2 >= 0) { // L: 413
			this.loadRegionFromGroup(var2); // L: 414
		}
	} // L: 415

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "-9837"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 418
		int var2 = this.groupNameHashTable.get(JagexCache.hashString(var1)); // L: 419
		return this.groupLoadPercent(var2); // L: 420
	}
}
