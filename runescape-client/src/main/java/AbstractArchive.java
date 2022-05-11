import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 293139291
	)
	static int field4026;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static GameBuild field4038;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1312413643
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("t")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("g")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("n")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("e")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("h")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("f")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("d")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lqz;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("z")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("i")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1395137629
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("ar")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("am")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4026 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "738299214"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 118

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-250456045"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 204

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-41"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 174 175
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1642448854"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = WorldMapArchiveLoader.method7020(var1, var1.length); // L: 37
		Buffer var2 = new Buffer(Skills.decompressBytes(var1)); // L: 38
		int var3 = var2.readUnsignedByte(); // L: 39
		if (var3 >= 5 && var3 <= 7) { // L: 40
			if (var3 >= 6) { // L: 41
				var2.readInt(); // L: 42
			}

			int var4 = var2.readUnsignedByte(); // L: 45
			if (var3 >= 7) { // L: 46
				this.groupCount = var2.method7627();
			} else {
				this.groupCount = var2.readUnsignedShort(); // L: 47
			}

			int var5 = 0; // L: 48
			int var6 = -1; // L: 49
			this.groupIds = new int[this.groupCount]; // L: 50
			int var7;
			if (var3 >= 7) { // L: 51
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 52
					this.groupIds[var7] = var5 += var2.method7627(); // L: 53
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
						var12 = this.fileIds[var8][var11] = var5 += var2.method7627(); // L: 85
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "9206278"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 121
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "1321797482"
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

			byte[] var5 = class125.method2791(this.files[var1][var2], false); // L: 134
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 135
			}

			return var5; // L: 136
		} else {
			return null;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1947570801"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "39"
	)
	public boolean method5668(int var1) {
		if (this.files.length == 1) { // L: 149
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 150
		} else {
			throw new RuntimeException(); // L: 151
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1465759290"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "903768645"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1699435814"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1081005917"
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

			byte[] var4 = class125.method2791(this.files[var1][var2], false); // L: 194
			return var4; // L: 195
		} else {
			return null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "515956954"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "100488775"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 207 208 210
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-373253911"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length; // L: 214
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1109930040"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 218
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2116699017"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 222
			this.groups[var1] = null;
		}

	} // L: 223

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 226
			this.files[var1][var2] = null;
		}

	} // L: 227

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1417383387"
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "53"
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
					var18 = class125.method2791(this.groups[var1], false); // L: 256
				} else {
					var18 = class125.method2791(this.groups[var1], true); // L: 252
					Buffer var8 = new Buffer(var18); // L: 253
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 254
				}

				byte[] var20 = Skills.decompressBytes(var18); // L: 259
				if (this.releaseGroups) { // L: 271
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 272
					int var9 = var20.length; // L: 273
					--var9; // L: 274
					int var10 = var20[var9] & 255;
					var9 -= var3 * var10 * 4; // L: 275
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
							var5[var4[var15]] = WorldMapEvent.method4929(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 304
						}
					}
				} else if (!this.shallowFiles) { // L: 308
					var5[var4[0]] = WorldMapEvent.method4929(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 309
				}

				return true; // L: 311
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-459533989"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 315
		return this.groupNameHashTable.get(class101.hashString(var1)); // L: 316
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "-99961512"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 320
		return this.fileNameHashTables[var1].get(class101.hashString(var2)); // L: 321
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1697073381"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 325
		var2 = var2.toLowerCase(); // L: 326
		int var3 = this.groupNameHashTable.get(class101.hashString(var1)); // L: 327
		if (var3 < 0) { // L: 328
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class101.hashString(var2)); // L: 329
			return var4 >= 0; // L: 330
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "-1285301345"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 335
		var2 = var2.toLowerCase(); // L: 336
		int var3 = this.groupNameHashTable.get(class101.hashString(var1)); // L: 337
		int var4 = this.fileNameHashTables[var3].get(class101.hashString(var2)); // L: 338
		return this.takeFile(var3, var4); // L: 339
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "569165055"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 343
		var2 = var2.toLowerCase(); // L: 344
		int var3 = this.groupNameHashTable.get(class101.hashString(var1)); // L: 345
		int var4 = this.fileNameHashTables[var3].get(class101.hashString(var2)); // L: 346
		return this.tryLoadFile(var3, var4); // L: 347
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "31747175"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 351
		int var2 = this.groupNameHashTable.get(class101.hashString(var1)); // L: 352
		return this.tryLoadGroup(var2); // L: 353
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "286297343"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 357
		int var2 = this.groupNameHashTable.get(class101.hashString(var1)); // L: 358
		if (var2 >= 0) { // L: 359
			this.loadRegionFromGroup(var2); // L: 360
		}
	} // L: 361

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-586809240"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 364
		int var2 = this.groupNameHashTable.get(class101.hashString(var1)); // L: 365
		return this.groupLoadPercent(var2); // L: 366
	}
}
