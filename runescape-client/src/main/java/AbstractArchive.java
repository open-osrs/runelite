import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 269464329
	)
	static int field3589;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 15338207
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("e")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("g")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("k")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("m")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("x")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("z")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("w")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lou;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("h")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("q")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2055325169
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("ap")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("ab")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field3589 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "108"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 123

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 209

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1767586109"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 179 180
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "994270424"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length; // L: 38
		int var2 = GrandExchangeOfferOwnWorldComparator.method1176(var1, 0, var3); // L: 40
		this.hash = var2; // L: 42
		Buffer var4 = new Buffer(UserComparator6.decompressBytes(var1)); // L: 43
		int var5 = var4.readUnsignedByte(); // L: 44
		if (var5 >= 5 && var5 <= 7) { // L: 45
			if (var5 >= 6) { // L: 46
				var4.readInt(); // L: 47
			}

			int var6 = var4.readUnsignedByte(); // L: 50
			if (var5 >= 7) { // L: 51
				this.groupCount = var4.method6569();
			} else {
				this.groupCount = var4.readUnsignedShort(); // L: 52
			}

			int var7 = 0; // L: 53
			int var8 = -1; // L: 54
			this.groupIds = new int[this.groupCount]; // L: 55
			int var9;
			if (var5 >= 7) { // L: 56
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 57
					this.groupIds[var9] = var7 += var4.method6569(); // L: 58
					if (this.groupIds[var9] > var8) { // L: 59
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
					var11 = this.fileCounts[var10];
					var7 = 0;
					var12 = -1;
					this.fileIds[var10] = new int[var11]; // L: 88

					for (var13 = 0; var13 < var11; ++var13) { // L: 89
						var14 = this.fileIds[var10][var13] = var7 += var4.method6569();
						if (var14 > var12) {
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1];
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					var10 = this.groupIds[var9];
					var11 = this.fileCounts[var10]; // L: 99
					var7 = 0; // L: 100
					var12 = -1;
					this.fileIds[var10] = new int[var11];

					for (var13 = 0; var13 < var11; ++var13) {
						var14 = this.fileIds[var10][var13] = var7 += var4.readUnsignedShort(); // L: 104
						if (var14 > var12) {
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-26460885"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 126
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "744457350"
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

			byte[] var5 = ByteArrayPool.method5573(this.files[var1][var2], false); // L: 139
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 140
			}

			return var5; // L: 141
		} else {
			return null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "57"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 145
			if (this.files[var1][var2] != null) {
				return true; // L: 146
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method4963(int var1) {
		if (this.files.length == 1) { // L: 154
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 155
		} else {
			throw new RuntimeException(); // L: 156
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "112"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2118992751"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "-116"
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

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "791709889"
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

			byte[] var4 = ByteArrayPool.method5573(this.files[var1][var2], false); // L: 199
			return var4; // L: 200
		} else {
			return null;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "444746714"
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "8"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 212 213 215
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "997984533"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length; // L: 219
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "756558186"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 223
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 227
			this.groups[var1] = null;
		}

	} // L: 228

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1987732503"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 231
			this.files[var1][var2] = null;
		}

	} // L: 232

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "1746231171"
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
				if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) { // L: 256
					var18 = ByteArrayPool.method5573(this.groups[var1], true); // L: 257
					Buffer var8 = new Buffer(var18); // L: 258
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 259
				} else {
					var18 = ByteArrayPool.method5573(this.groups[var1], false); // L: 261
				}

				byte[] var20 = UserComparator6.decompressBytes(var18); // L: 264
				if (this.releaseGroups) { // L: 282
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 283
					int var9 = var20.length; // L: 284
					--var9;
					int var10 = var20[var9] & 255; // L: 285
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
							var5[var4[var15]] = GrandExchangeOfferWorldComparator.method5079(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 315
						}
					}
				} else if (!this.shallowFiles) { // L: 319
					var5[var4[0]] = GrandExchangeOfferWorldComparator.method5079(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 320
				}

				return true; // L: 322
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1575580840"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 326
		return this.groupNameHashTable.get(GraphicsObject.hashString(var1)); // L: 327
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "1997157248"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 331
		return this.fileNameHashTables[var1].get(GraphicsObject.hashString(var2)); // L: 332
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "0"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 336
		var2 = var2.toLowerCase(); // L: 337
		int var3 = this.groupNameHashTable.get(GraphicsObject.hashString(var1)); // L: 338
		if (var3 < 0) { // L: 339
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(GraphicsObject.hashString(var2)); // L: 340
			return var4 >= 0; // L: 341
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "-2113660686"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 346
		var2 = var2.toLowerCase(); // L: 347
		int var3 = this.groupNameHashTable.get(GraphicsObject.hashString(var1)); // L: 348
		int var4 = this.fileNameHashTables[var3].get(GraphicsObject.hashString(var2)); // L: 349
		return this.takeFile(var3, var4); // L: 350
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1619143397"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 354
		var2 = var2.toLowerCase(); // L: 355
		int var3 = this.groupNameHashTable.get(GraphicsObject.hashString(var1)); // L: 356
		int var4 = this.fileNameHashTables[var3].get(GraphicsObject.hashString(var2)); // L: 357
		return this.tryLoadFile(var3, var4); // L: 358
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1308287337"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 362
		int var2 = this.groupNameHashTable.get(GraphicsObject.hashString(var1)); // L: 363
		return this.tryLoadGroup(var2); // L: 364
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-13"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 368
		int var2 = this.groupNameHashTable.get(GraphicsObject.hashString(var1)); // L: 369
		if (var2 >= 0) { // L: 370
			this.loadRegionFromGroup(var2); // L: 371
		}
	} // L: 372

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-469747920"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 375
		int var2 = this.groupNameHashTable.get(GraphicsObject.hashString(var1)); // L: 376
		return this.groupLoadPercent(var2); // L: 377
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Ljv;IIB)Lkt;",
		garbageValue = "7"
	)
	public static Font method5018(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3); // L: 85
		boolean var4;
		if (var5 == null) { // L: 86
			var4 = false; // L: 87
		} else {
			ItemLayer.SpriteBuffer_decode(var5); // L: 90
			var4 = true; // L: 91
		}

		if (!var4) { // L: 93
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3); // L: 95
			Font var8;
			if (var6 == null) { // L: 97
				var8 = null; // L: 98
			} else {
				Font var7 = new Font(var6, WorldMapDecoration.SpriteBuffer_xOffsets, Calendar.SpriteBuffer_yOffsets, class396.SpriteBuffer_spriteWidths, class302.SpriteBuffer_spriteHeights, MilliClock.SpriteBuffer_spritePalette, class396.SpriteBuffer_pixels); // L: 101
				MilliClock.method2587(); // L: 102
				var8 = var7; // L: 103
			}

			return var8; // L: 105
		}
	}
}
