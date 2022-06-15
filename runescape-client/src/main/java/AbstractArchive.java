import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1922333433
	)
	static int field4012;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1192407369
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("l")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("a")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("b")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("n")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("o")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("m")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("d")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lqz;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("ak")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("al")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 944556193
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("ap")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("ac")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4012 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "20"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 123

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "22"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 209

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-227114003"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 179 180
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "16"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length; // L: 38
		int var2 = class93.method2404(var1, 0, var3); // L: 40
		this.hash = var2; // L: 42
		Buffer var4 = new Buffer(SoundSystem.decompressBytes(var1)); // L: 43
		int var5 = var4.readUnsignedByte(); // L: 44
		if (var5 >= 5 && var5 <= 7) { // L: 45
			if (var5 >= 6) { // L: 46
				var4.readInt(); // L: 47
			}

			int var6 = var4.readUnsignedByte(); // L: 50
			if (var5 >= 7) { // L: 51
				this.groupCount = var4.method7715();
			} else {
				this.groupCount = var4.readUnsignedShort(); // L: 52
			}

			int var7 = 0; // L: 53
			int var8 = -1; // L: 54
			this.groupIds = new int[this.groupCount]; // L: 55
			int var9;
			if (var5 >= 7) { // L: 56
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 57
					this.groupIds[var9] = var7 += var4.method7715(); // L: 58
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
					var11 = this.fileCounts[var10]; // L: 85
					var7 = 0; // L: 86
					var12 = -1; // L: 87
					this.fileIds[var10] = new int[var11]; // L: 88

					for (var13 = 0; var13 < var11; ++var13) { // L: 89
						var14 = this.fileIds[var10][var13] = var7 += var4.method7715(); // L: 90
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "-78"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 126
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-1612440449"
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

			byte[] var5 = Varps.method5530(this.files[var1][var2], false); // L: 139
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 140
			}

			return var5; // L: 141
		} else {
			return null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1723804313"
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1576123903"
	)
	public boolean method5849(int var1) {
		if (this.files.length == 1) { // L: 154
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 155
		} else {
			throw new RuntimeException(); // L: 156
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "75"
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-445061509"
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1760059338"
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "-45"
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

			byte[] var4 = Varps.method5530(this.files[var1][var2], false); // L: 199
			return var4; // L: 200
		} else {
			return null;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1079005200"
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "55"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 212 213 215
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "416756426"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length; // L: 219
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1142795127"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 223
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1890355813"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 227
			this.groups[var1] = null;
		}

	} // L: 228

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-624686545"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 231
			this.files[var1][var2] = null;
		}

	} // L: 232

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2144599637"
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
		garbageValue = "78803986"
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
					var18 = Varps.method5530(this.groups[var1], false); // L: 261
				} else {
					var18 = Varps.method5530(this.groups[var1], true); // L: 257
					Buffer var8 = new Buffer(var18); // L: 258
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 259
				}

				byte[] var20 = SoundSystem.decompressBytes(var18); // L: 264
				if (this.releaseGroups) { // L: 283
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 284
					int var9 = var20.length; // L: 285
					--var9;
					int var10 = var20[var9] & 255; // L: 286
					var9 -= var3 * var10 * 4; // L: 287
					Buffer var11 = new Buffer(var20); // L: 288
					int[] var12 = new int[var3]; // L: 289
					var11.offset = var9; // L: 290

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 291
						var14 = 0; // L: 292

						for (var15 = 0; var15 < var3; ++var15) { // L: 293
							var14 += var11.readInt(); // L: 294
							var12[var15] += var14; // L: 295
						}
					}

					byte[][] var19 = new byte[var3][]; // L: 298

					for (var14 = 0; var14 < var3; ++var14) { // L: 299
						var19[var14] = new byte[var12[var14]]; // L: 300
						var12[var14] = 0; // L: 301
					}

					var11.offset = var9; // L: 303
					var14 = 0; // L: 304

					for (var15 = 0; var15 < var10; ++var15) { // L: 305
						int var16 = 0; // L: 306

						for (int var17 = 0; var17 < var3; ++var17) { // L: 307
							var16 += var11.readInt(); // L: 308
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16); // L: 309
							var12[var17] += var16; // L: 310
							var14 += var16; // L: 311
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 314
						if (!this.shallowFiles) { // L: 315
							var5[var4[var15]] = WorldMapArea.method4621(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 316
						}
					}
				} else if (!this.shallowFiles) { // L: 320
					var5[var4[0]] = WorldMapArea.method4621(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 321
				}

				return true; // L: 323
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-563529152"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 327
		return this.groupNameHashTable.get(class357.hashString(var1)); // L: 328
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "1086643666"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 332
		return this.fileNameHashTables[var1].get(class357.hashString(var2)); // L: 333
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-2145340278"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 337
		var2 = var2.toLowerCase(); // L: 338
		int var3 = this.groupNameHashTable.get(class357.hashString(var1)); // L: 339
		if (var3 < 0) { // L: 340
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class357.hashString(var2)); // L: 341
			return var4 >= 0; // L: 342
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B",
		garbageValue = "56"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 347
		var2 = var2.toLowerCase(); // L: 348
		int var3 = this.groupNameHashTable.get(class357.hashString(var1)); // L: 349
		int var4 = this.fileNameHashTables[var3].get(class357.hashString(var2)); // L: 350
		return this.takeFile(var3, var4); // L: 351
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1940545619"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 355
		var2 = var2.toLowerCase(); // L: 356
		int var3 = this.groupNameHashTable.get(class357.hashString(var1)); // L: 357
		int var4 = this.fileNameHashTables[var3].get(class357.hashString(var2)); // L: 358
		return this.tryLoadFile(var3, var4); // L: 359
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-613590995"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 363
		int var2 = this.groupNameHashTable.get(class357.hashString(var1)); // L: 364
		return this.tryLoadGroup(var2); // L: 365
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2089361999"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 369
		int var2 = this.groupNameHashTable.get(class357.hashString(var1)); // L: 370
		if (var2 >= 0) { // L: 371
			this.loadRegionFromGroup(var2); // L: 372
		}
	} // L: 373

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "671301219"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 376
		int var2 = this.groupNameHashTable.get(class357.hashString(var1)); // L: 377
		return this.groupLoadPercent(var2); // L: 378
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1227202994"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4831
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4832
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4833
				int var3 = var2.x >> 7; // L: 4834
				int var4 = var2.y >> 7; // L: 4835
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4836
					if (var2.field1205 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4837
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4838
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4839
					}

					long var5 = TaskHandler.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4841
					var2.playerCycle = Client.cycle; // L: 4842
					class356.scene.drawEntity(PacketWriter.Client_plane, var2.x, var2.y, SceneTilePaint.getTileHeight(var2.field1205 * 64 - 64 + var2.x, var2.field1205 * 64 - 64 + var2.y, PacketWriter.Client_plane), var2.field1205 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4843
				}
			}
		}

	} // L: 4847
}
