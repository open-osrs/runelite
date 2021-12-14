import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1947791089
	)
	static int field3843;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "[Lpa;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1495351037
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("g")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("e")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("u")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("k")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("f")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("l")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("q")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lpu;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("z")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("i")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 880297365
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("ao")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("ab")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor();
		field3843 = 0;
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2090166080"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2024016984"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "35"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1691736536"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length;
		int var2 = Friend.method6298(var1, 0, var3);
		this.hash = var2;
		Buffer var4 = new Buffer(ViewportMouse.decompressBytes(var1));
		int var5 = var4.readUnsignedByte();
		if (var5 >= 5 && var5 <= 7) {
			if (var5 >= 6) {
				var4.readInt();
			}

			int var6 = var4.readUnsignedByte();
			if (var5 >= 7) {
				this.groupCount = var4.method7561();
			} else {
				this.groupCount = var4.readUnsignedShort();
			}

			int var7 = 0;
			int var8 = -1;
			this.groupIds = new int[this.groupCount];
			int var9;
			if (var5 >= 7) {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					this.groupIds[var9] = var7 += var4.method7561();
					if (this.groupIds[var9] > var8) {
						var8 = this.groupIds[var9];
					}
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					this.groupIds[var9] = var7 += var4.readUnsignedShort();
					if (this.groupIds[var9] > var8) {
						var8 = this.groupIds[var9];
					}
				}
			}

			this.groupCrcs = new int[var8 + 1];
			this.groupVersions = new int[var8 + 1];
			this.fileCounts = new int[var8 + 1];
			this.fileIds = new int[var8 + 1][];
			this.groups = new Object[var8 + 1];
			this.files = new Object[var8 + 1][];
			if (var6 != 0) {
				this.groupNameHashes = new int[var8 + 1];

				for (var9 = 0; var9 < this.groupCount; ++var9) {
					this.groupNameHashes[this.groupIds[var9]] = var4.readInt();
				}

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) {
				this.groupCrcs[this.groupIds[var9]] = var4.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) {
				this.groupVersions[this.groupIds[var9]] = var4.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) {
				this.fileCounts[this.groupIds[var9]] = var4.readUnsignedShort();
			}

			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			if (var5 >= 7) {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					var10 = this.groupIds[var9];
					var11 = this.fileCounts[var10];
					var7 = 0;
					var12 = -1;
					this.fileIds[var10] = new int[var11];

					for (var13 = 0; var13 < var11; ++var13) {
						var14 = this.fileIds[var10][var13] = var7 += var4.method7561();
						if (var14 > var12) {
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1];
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					var10 = this.groupIds[var9];
					var11 = this.fileCounts[var10];
					var7 = 0;
					var12 = -1;
					this.fileIds[var10] = new int[var11];

					for (var13 = 0; var13 < var11; ++var13) {
						var14 = this.fileIds[var10][var13] = var7 += var4.readUnsignedShort();
						if (var14 > var12) {
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1];
				}
			}

			if (var6 != 0) {
				this.fileNameHashes = new int[var8 + 1][];
				this.fileNameHashTables = new IntHashTable[var8 + 1];

				for (var9 = 0; var9 < this.groupCount; ++var9) {
					var10 = this.groupIds[var9];
					var11 = this.fileCounts[var10];
					this.fileNameHashes[var10] = new int[this.files[var10].length];

					for (var12 = 0; var12 < var11; ++var12) {
						this.fileNameHashes[var10][this.fileIds[var10][var12]] = var4.readInt();
					}

					this.fileNameHashTables[var10] = new IntHashTable(this.fileNameHashes[var10]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "-53"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "2102188024"
	)
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] == null) {
				boolean var4 = this.buildFiles(var1, var3);
				if (!var4) {
					this.loadGroup(var1);
					var4 = this.buildFiles(var1, var3);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = GrandExchangeOfferOwnWorldComparator.method1147(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "-22135"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] != null) {
				return true;
			} else if (this.groups[var1] != null) {
				return true;
			} else {
				this.loadGroup(var1);
				return this.groups[var1] != null;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-43"
	)
	public boolean method5595(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2108715945"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) {
			return true;
		} else {
			this.loadGroup(var1);
			return this.groups[var1] != null;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "89"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true;

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) {
			int var3 = this.groupIds[var2];
			if (this.groups[var3] == null) {
				this.loadGroup(var3);
				if (this.groups[var3] == null) {
					var1 = false;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1730057328"
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "51"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] == null) {
				boolean var3 = this.buildFiles(var1, (int[])null);
				if (!var3) {
					this.loadGroup(var1);
					var3 = this.buildFiles(var1, (int[])null);
					if (!var3) {
						return null;
					}
				}
			}

			byte[] var4 = GrandExchangeOfferOwnWorldComparator.method1147(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1978488509"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) {
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1166188734"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-1"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-949601640"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1889298595"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1137038905"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) {
			if (this.files[var1] != null) {
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
					this.files[var1][var2] = null;
				}
			}
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "16711680"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) {
			return false;
		} else {
			int var3 = this.fileCounts[var1];
			int[] var4 = this.fileIds[var1];
			Object[] var5 = this.files[var1];
			boolean var6 = true;

			for (int var7 = 0; var7 < var3; ++var7) {
				if (var5[var4[var7]] == null) {
					var6 = false;
					break;
				}
			}

			if (var6) {
				return true;
			} else {
				byte[] var21;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
					var21 = GrandExchangeOfferOwnWorldComparator.method1147(this.groups[var1], false);
				} else {
					var21 = GrandExchangeOfferOwnWorldComparator.method1147(this.groups[var1], true);
					Buffer var8 = new Buffer(var21);
					var8.xteaDecrypt(var2, 5, var8.array.length);
				}

				byte[] var25 = ViewportMouse.decompressBytes(var21);
				if (this.releaseGroups) {
					this.groups[var1] = null;
				}

				int var10;
				if (var3 > 1) {
					int var22 = var25.length;
					--var22;
					var10 = var25[var22] & 255;
					var22 -= var10 * var3 * 4;
					Buffer var11 = new Buffer(var25);
					int[] var12 = new int[var3];
					var11.offset = var22;

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) {
						var14 = 0;

						for (var15 = 0; var15 < var3; ++var15) {
							var14 += var11.readInt();
							var12[var15] += var14;
						}
					}

					byte[][] var23 = new byte[var3][];

					for (var14 = 0; var14 < var3; ++var14) {
						var23[var14] = new byte[var12[var14]];
						var12[var14] = 0;
					}

					var11.offset = var22;
					var14 = 0;

					int var17;
					for (var15 = 0; var15 < var10; ++var15) {
						int var24 = 0;

						for (var17 = 0; var17 < var3; ++var17) {
							var24 += var11.readInt();
							System.arraycopy(var25, var14, var23[var17], var12[var17], var24);
							var12[var17] += var24;
							var14 += var24;
						}
					}

					for (var15 = 0; var15 < var3; ++var15) {
						if (!this.shallowFiles) {
							var17 = var4[var15];
							byte[] var19 = var23[var15];
							Object var18;
							if (var19 == null) {
								var18 = null;
							} else if (var19.length > 136) {
								DirectByteArrayCopier var20 = new DirectByteArrayCopier();
								var20.set(var19);
								var18 = var20;
							} else {
								var18 = var19;
							}

							var5[var17] = var18;
						} else {
							var5[var4[var15]] = var23[var15];
						}
					}
				} else if (!this.shallowFiles) {
					var10 = var4[0];
					Object var26;
					if (var25 == null) {
						var26 = null;
					} else if (var25.length > 136) {
						DirectByteArrayCopier var27 = new DirectByteArrayCopier();
						var27.set(var25);
						var26 = var27;
					} else {
						var26 = var25;
					}

					var5[var10] = var26;
				} else {
					var5[var4[0]] = var25;
				}

				return true;
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1240338847"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(Skills.hashString(var1));
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "1416207334"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(Skills.hashString(var2));
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "-124"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(Skills.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(Skills.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B",
		garbageValue = "34"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(Skills.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(Skills.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "27"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(Skills.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(Skills.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-397687589"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(Skills.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-41"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(Skills.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1233825396"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(Skills.hashString(var1));
		return this.groupLoadPercent(var2);
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2059538703"
	)
	static final void method5693() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints > 0) {
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) {
				if (var0.objectId >= 0) {
					var2 = var0.objectId;
					var3 = var0.field1080;
					var4 = class148.getObjectDefinition(var2);
					if (var3 == 11) {
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) {
						var3 = 4;
					}

					var1 = var4.method3491(var3);
					if (!var1) {
						continue;
					}
				}

				DevicePcmPlayerProvider.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1087, var0.field1080);
				var0.remove();
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) {
					if (var0.id >= 0) {
						var2 = var0.id;
						var3 = var0.field1075;
						var4 = class148.getObjectDefinition(var2);
						if (var3 == 11) {
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) {
							var3 = 4;
						}

						var1 = var4.method3491(var3);
						if (!var1) {
							continue;
						}
					}

					DevicePcmPlayerProvider.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1075);
					var0.delay = -1;
					if (var0.id == var0.objectId && var0.objectId == -1) {
						var0.remove();
					} else if (var0.objectId == var0.id && var0.field1087 == var0.orientation && var0.field1080 == var0.field1075) {
						var0.remove();
					}
				}
			}
		}

	}
}
