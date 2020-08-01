import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1465326177
	)
	static int field3177;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 307318581
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("q")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("j")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("g")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("n")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("u")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("a")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("z")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lmh;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("y")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("c")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 981186733
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("r")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("s")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor();
		field3177 = 0;
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-101"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = FloorOverlayDefinition.method4936(var1, var1.length);
		Buffer var2 = new Buffer(Coord.decompressBytes(var1));
		int var3 = var2.readUnsignedByte();
		if (var3 >= 5 && var3 <= 7) {
			if (var3 >= 6) {
				var2.readInt();
			}

			int var4 = var2.readUnsignedByte();
			if (var3 >= 7) {
				this.groupCount = var2.method5733();
			} else {
				this.groupCount = var2.readUnsignedShort();
			}

			int var5 = 0;
			int var6 = -1;
			this.groupIds = new int[this.groupCount];
			int var7;
			if (var3 >= 7) {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					this.groupIds[var7] = var5 += var2.method5733();
					if (this.groupIds[var7] > var6) {
						var6 = this.groupIds[var7];
					}
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					this.groupIds[var7] = var5 += var2.readUnsignedShort();
					if (this.groupIds[var7] > var6) {
						var6 = this.groupIds[var7];
					}
				}
			}

			this.groupCrcs = new int[var6 + 1];
			this.groupVersions = new int[var6 + 1];
			this.fileCounts = new int[var6 + 1];
			this.fileIds = new int[var6 + 1][];
			this.groups = new Object[var6 + 1];
			this.files = new Object[var6 + 1][];
			if (var4 != 0) {
				this.groupNameHashes = new int[var6 + 1];

				for (var7 = 0; var7 < this.groupCount; ++var7) {
					this.groupNameHashes[this.groupIds[var7]] = var2.readInt();
				}

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) {
				this.groupCrcs[this.groupIds[var7]] = var2.readInt();
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) {
				this.groupVersions[this.groupIds[var7]] = var2.readInt();
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) {
				this.fileCounts[this.groupIds[var7]] = var2.readUnsignedShort();
			}

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			if (var3 >= 7) {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					var5 = 0;
					var10 = -1;
					this.fileIds[var8] = new int[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var12 = this.fileIds[var8][var11] = var5 += var2.method5733();
						if (var12 > var10) {
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1];
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					var5 = 0;
					var10 = -1;
					this.fileIds[var8] = new int[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var12 = this.fileIds[var8][var11] = var5 += var2.readUnsignedShort();
						if (var12 > var10) {
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1];
				}
			}

			if (var4 != 0) {
				this.fileNameHashes = new int[var6 + 1][];
				this.fileNameHashTables = new IntHashTable[var6 + 1];

				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					this.fileNameHashes[var8] = new int[this.files[var8].length];

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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "479482423"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1860640327"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-1226634846"
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

			byte[] var5 = FloorUnderlayDefinition.method4613(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1957538709"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2058273834"
	)
	public boolean method4359(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1896348837"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1350822089"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1718789334"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "490044156"
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

			byte[] var4 = FloorUnderlayDefinition.method4613(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1362853135"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1560066319"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "-56"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-888140327"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-763058439"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1760033757"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-546235261"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "-1692394825"
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
					var21 = FloorUnderlayDefinition.method4613(this.groups[var1], false);
				} else {
					var21 = FloorUnderlayDefinition.method4613(this.groups[var1], true);
					Buffer var8 = new Buffer(var21);
					var8.xteaDecrypt(var2, 5, var8.array.length);
				}

				byte[] var25 = Coord.decompressBytes(var21);
				if (this.releaseGroups) {
					this.groups[var1] = null;
				}

				int var10;
				if (var3 > 1) {
					int var9 = var25.length;
					--var9;
					var10 = var25[var9] & 255;
					var9 -= var10 * var3 * 4;
					Buffer var11 = new Buffer(var25);
					int[] var12 = new int[var3];
					var11.offset = var9;

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) {
						var14 = 0;

						for (var15 = 0; var15 < var3; ++var15) {
							var14 += var11.readInt();
							var12[var15] += var14;
						}
					}

					byte[][] var22 = new byte[var3][];

					for (var14 = 0; var14 < var3; ++var14) {
						var22[var14] = new byte[var12[var14]];
						var12[var14] = 0;
					}

					var11.offset = var9;
					var14 = 0;

					int var17;
					for (var15 = 0; var15 < var10; ++var15) {
						int var16 = 0;

						for (var17 = 0; var17 < var3; ++var17) {
							var16 += var11.readInt();
							System.arraycopy(var25, var14, var22[var17], var12[var17], var16);
							var12[var17] += var16;
							var14 += var16;
						}
					}

					for (var15 = 0; var15 < var3; ++var15) {
						if (!this.shallowFiles) {
							var17 = var4[var15];
							byte[] var19 = var22[var15];
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
							var5[var4[var15]] = var22[var15];
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1113782685"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(class219.hashString(var1));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "1362853135"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(class219.hashString(var2));
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1310066556"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class219.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class219.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "-222408314"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class219.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class219.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-778364429"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class219.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class219.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-81"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class219.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1143877885"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class219.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-252379742"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class219.hashString(var1));
		return this.groupLoadPercent(var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIIIIII)V",
		garbageValue = "-1571118584"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -PacketBufferNode.method3750(var4 + var2 + 932731, var3 + 556238 + var5) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var8 = var0.readUnsignedByte();
					if (var8 == 1) {
						var8 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
					}
					break;
				}

				if (var7 <= 49) {
					Tiles.field524[var1][var2][var3] = var0.readByte();
					Tiles.field525[var1][var2][var3] = (byte)((var7 - 2) / 4);
					WorldMapLabel.field269[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
				} else {
					Tiles.field530[var1][var2][var3] = (byte)(var7 - 81);
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var7 <= 49) {
					var0.readUnsignedByte();
				}
			}
		}

	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "682759182"
	)
	static final int method4411() {
		if (NetSocket.clientPreferences.roofsHidden) {
			return TileItemPile.Client_plane;
		} else {
			int var0 = Language.getTileHeight(MouseHandler.cameraX, ObjectSound.cameraZ, TileItemPile.Client_plane);
			return var0 - WorldMapSection3.cameraY < 800 && (Tiles.Tiles_renderFlags[TileItemPile.Client_plane][MouseHandler.cameraX >> 7][ObjectSound.cameraZ >> 7] & 4) != 0 ? TileItemPile.Client_plane : 3;
		}
	}
}
