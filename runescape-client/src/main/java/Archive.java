import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("n")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1081704419
	)
	@Export("index")
	int index;
	@ObfuscatedName("s")
	volatile boolean field3821;
	@ObfuscatedName("j")
	boolean field3822;
	@ObfuscatedName("w")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -515391075
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -98227937
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 29264523
	)
	int field3816;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lmy;Lmy;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		this.field3821 = false;
		this.field3822 = false;
		this.field3816 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3;
		this.field3822 = var6;
		int var8 = this.index;
		if (WorldMapLabel.NetCache_reference != null) {
			WorldMapLabel.NetCache_reference.offset = var8 * 8 + 5;
			int var9 = WorldMapLabel.NetCache_reference.readInt();
			int var10 = WorldMapLabel.NetCache_reference.readInt();
			this.loadIndex(var9, var10);
		} else {
			class269.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var8] = this;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "782340670"
	)
	public boolean method5540() {
		return this.field3821;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1520569672"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3821) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = IsaacCipher.method7886(255, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2090166080"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		PendingSpawn.method2225(this.index, var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2024016984"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			class10.method122(var1, this.archiveDisk, this);
		} else {
			class269.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-877437608"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			class10.method122(this.index, this.masterDisk, this);
		} else {
			class269.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "388189625"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field3821) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				NPCComposition.method3321(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				NPCComposition.method3321(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				Object[] var5 = super.groups;
				Object var7;
				if (var2 == null) {
					var7 = null;
				} else if (var2.length > 136) {
					DirectByteArrayCopier var8 = new DirectByteArrayCopier();
					var8.set(var2);
					var7 = var8;
				} else {
					var7 = var2;
				}

				var5[var1] = var7;
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I[BZB)V",
		garbageValue = "1"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field3821) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				class269.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				class269.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var11 = new Buffer(ViewportMouse.decompressBytes(var3));
			int var12 = var11.readUnsignedByte();
			if (var12 != 5 && var12 != 6) {
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var12 >= 6) {
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) {
				class269.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field3816) {
				this.field3821 = true;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field3822 || var4) {
					class269.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field3822 || var4) {
					class269.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				Object[] var7 = super.groups;
				Object var9;
				if (var3 == null) {
					var9 = null;
				} else if (var3.length > 136) {
					DirectByteArrayCopier var10 = new DirectByteArrayCopier();
					var10.set(var3);
					var9 = var10;
				} else {
					var9 = var3;
				}

				var7[var2] = var9;
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "955312949"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field3821 = true;
		} else {
			this.field3816 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					ArchiveDisk var2 = this.archiveDisk;
					ArchiveDiskAction var4 = new ArchiveDiskAction();
					var4.type = 1;
					var4.key = (long)var1;
					var4.archiveDisk = var2;
					var4.archive = this;
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
					}

					class174.method3383();
					this.field3816 = var1;
				}
			}

			if (this.field3816 == -1) {
				this.field3821 = true;
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "35"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : IsaacCipher.method7886(this.index, var1);
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1796808817"
	)
	public boolean method5570(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "832467152"
	)
	public boolean method5584(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "838378005"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0;
		int var2 = 0;

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) {
			if (super.fileCounts[var3] > 0) {
				var1 += 100;
				var2 += this.groupLoadPercent(var3);
			}
		}

		if (var1 == 0) {
			return 100;
		} else {
			var3 = var2 * 100 / var1;
			return var3;
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lck;IILgj;B)V",
		garbageValue = "95"
	)
	static final void method5586(Player var0, int var1, int var2, class185 var3) {
		int var4 = var0.pathX[0];
		int var5 = var0.pathY[0];
		int var6 = var0.transformedSize();
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
				int var8 = var0.transformedSize();
				Client.field754.approxDestinationX = var1;
				Client.field754.approxDestinationY = var2;
				Client.field754.approxDestinationSizeX = 1;
				Client.field754.approxDestinationSizeY = 1;
				ApproximateRouteStrategy var9 = Client.field754;
				ApproximateRouteStrategy var10 = var9;
				CollisionMap var11 = Client.collisionMaps[var0.plane];
				int[] var12 = Client.field755;
				int[] var13 = Client.field756;

				int var14;
				int var15;
				for (var14 = 0; var14 < 128; ++var14) {
					for (var15 = 0; var15 < 128; ++var15) {
						class186.directions[var14][var15] = 0;
						class186.distances[var14][var15] = 99999999;
					}
				}

				int var16;
				int var17;
				byte var19;
				int var20;
				int var21;
				int var23;
				int var25;
				int var26;
				int var27;
				boolean var34;
				int var36;
				int var37;
				int var39;
				if (var8 == 1) {
					var16 = var4;
					var17 = var5;
					byte var18 = 64;
					var19 = 64;
					var20 = var4 - var18;
					var21 = var5 - var19;
					class186.directions[var18][var19] = 99;
					class186.distances[var18][var19] = 0;
					byte var22 = 0;
					var23 = 0;
					class186.bufferX[var22] = var4;
					var39 = var22 + 1;
					class186.bufferY[var22] = var5;
					int[][] var24 = var11.flags;

					boolean var35;
					while (true) {
						if (var39 == var23) {
							class186.field2129 = var16;
							class186.field2130 = var17;
							var35 = false;
							break;
						}

						var16 = class186.bufferX[var23];
						var17 = class186.bufferY[var23];
						var23 = var23 + 1 & 4095;
						var36 = var16 - var20;
						var37 = var17 - var21;
						var25 = var16 - var11.xInset;
						var26 = var17 - var11.yInset;
						if (var10.hasArrived(1, var16, var17, var11)) {
							class186.field2129 = var16;
							class186.field2130 = var17;
							var35 = true;
							break;
						}

						var27 = class186.distances[var36][var37] + 1;
						if (var36 > 0 && class186.directions[var36 - 1][var37] == 0 && (var24[var25 - 1][var26] & 19136776) == 0) {
							class186.bufferX[var39] = var16 - 1;
							class186.bufferY[var39] = var17;
							var39 = var39 + 1 & 4095;
							class186.directions[var36 - 1][var37] = 2;
							class186.distances[var36 - 1][var37] = var27;
						}

						if (var36 < 127 && class186.directions[var36 + 1][var37] == 0 && (var24[var25 + 1][var26] & 19136896) == 0) {
							class186.bufferX[var39] = var16 + 1;
							class186.bufferY[var39] = var17;
							var39 = var39 + 1 & 4095;
							class186.directions[var36 + 1][var37] = 8;
							class186.distances[var36 + 1][var37] = var27;
						}

						if (var37 > 0 && class186.directions[var36][var37 - 1] == 0 && (var24[var25][var26 - 1] & 19136770) == 0) {
							class186.bufferX[var39] = var16;
							class186.bufferY[var39] = var17 - 1;
							var39 = var39 + 1 & 4095;
							class186.directions[var36][var37 - 1] = 1;
							class186.distances[var36][var37 - 1] = var27;
						}

						if (var37 < 127 && class186.directions[var36][var37 + 1] == 0 && (var24[var25][var26 + 1] & 19136800) == 0) {
							class186.bufferX[var39] = var16;
							class186.bufferY[var39] = var17 + 1;
							var39 = var39 + 1 & 4095;
							class186.directions[var36][var37 + 1] = 4;
							class186.distances[var36][var37 + 1] = var27;
						}

						if (var36 > 0 && var37 > 0 && class186.directions[var36 - 1][var37 - 1] == 0 && (var24[var25 - 1][var26 - 1] & 19136782) == 0 && (var24[var25 - 1][var26] & 19136776) == 0 && (var24[var25][var26 - 1] & 19136770) == 0) {
							class186.bufferX[var39] = var16 - 1;
							class186.bufferY[var39] = var17 - 1;
							var39 = var39 + 1 & 4095;
							class186.directions[var36 - 1][var37 - 1] = 3;
							class186.distances[var36 - 1][var37 - 1] = var27;
						}

						if (var36 < 127 && var37 > 0 && class186.directions[var36 + 1][var37 - 1] == 0 && (var24[var25 + 1][var26 - 1] & 19136899) == 0 && (var24[var25 + 1][var26] & 19136896) == 0 && (var24[var25][var26 - 1] & 19136770) == 0) {
							class186.bufferX[var39] = var16 + 1;
							class186.bufferY[var39] = var17 - 1;
							var39 = var39 + 1 & 4095;
							class186.directions[var36 + 1][var37 - 1] = 9;
							class186.distances[var36 + 1][var37 - 1] = var27;
						}

						if (var36 > 0 && var37 < 127 && class186.directions[var36 - 1][var37 + 1] == 0 && (var24[var25 - 1][var26 + 1] & 19136824) == 0 && (var24[var25 - 1][var26] & 19136776) == 0 && (var24[var25][var26 + 1] & 19136800) == 0) {
							class186.bufferX[var39] = var16 - 1;
							class186.bufferY[var39] = var17 + 1;
							var39 = var39 + 1 & 4095;
							class186.directions[var36 - 1][var37 + 1] = 6;
							class186.distances[var36 - 1][var37 + 1] = var27;
						}

						if (var36 < 127 && var37 < 127 && class186.directions[var36 + 1][var37 + 1] == 0 && (var24[var25 + 1][var26 + 1] & 19136992) == 0 && (var24[var25 + 1][var26] & 19136896) == 0 && (var24[var25][var26 + 1] & 19136800) == 0) {
							class186.bufferX[var39] = var16 + 1;
							class186.bufferY[var39] = var17 + 1;
							var39 = var39 + 1 & 4095;
							class186.directions[var36 + 1][var37 + 1] = 12;
							class186.distances[var36 + 1][var37 + 1] = var27;
						}
					}

					var34 = var35;
				} else if (var8 == 2) {
					var34 = Clock.method3132(var4, var5, var9, var11);
				} else {
					var34 = UserComparator2.method7617(var4, var5, var8, var9, var11);
				}

				int var7;
				label346: {
					var15 = var4 - 64;
					var16 = var5 - 64;
					var17 = class186.field2129;
					var36 = class186.field2130;
					if (!var34) {
						var37 = Integer.MAX_VALUE;
						var20 = Integer.MAX_VALUE;
						byte var38 = 10;
						var39 = var10.approxDestinationX;
						var23 = var10.approxDestinationY;
						int var33 = var10.approxDestinationSizeX;
						var25 = var10.approxDestinationSizeY;

						for (var26 = var39 - var38; var26 <= var38 + var39; ++var26) {
							for (var27 = var23 - var38; var27 <= var23 + var38; ++var27) {
								int var28 = var26 - var15;
								int var29 = var27 - var16;
								if (var28 >= 0 && var29 >= 0 && var28 < 128 && var29 < 128 && class186.distances[var28][var29] < 100) {
									int var30 = 0;
									if (var26 < var39) {
										var30 = var39 - var26;
									} else if (var26 > var39 + var33 - 1) {
										var30 = var26 - (var39 + var33 - 1);
									}

									int var31 = 0;
									if (var27 < var23) {
										var31 = var23 - var27;
									} else if (var27 > var25 + var23 - 1) {
										var31 = var27 - (var23 + var25 - 1);
									}

									int var32 = var30 * var30 + var31 * var31;
									if (var32 < var37 || var32 == var37 && class186.distances[var28][var29] < var20) {
										var37 = var32;
										var20 = class186.distances[var28][var29];
										var17 = var26;
										var36 = var27;
									}
								}
							}
						}

						if (var37 == Integer.MAX_VALUE) {
							var7 = -1;
							break label346;
						}
					}

					if (var4 == var17 && var36 == var5) {
						var7 = 0;
					} else {
						var19 = 0;
						class186.bufferX[var19] = var17;
						var37 = var19 + 1;
						class186.bufferY[var19] = var36;

						for (var20 = var21 = class186.directions[var17 - var15][var36 - var16]; var17 != var4 || var36 != var5; var20 = class186.directions[var17 - var15][var36 - var16]) {
							if (var20 != var21) {
								var21 = var20;
								class186.bufferX[var37] = var17;
								class186.bufferY[var37++] = var36;
							}

							if ((var20 & 2) != 0) {
								++var17;
							} else if ((var20 & 8) != 0) {
								--var17;
							}

							if ((var20 & 1) != 0) {
								++var36;
							} else if ((var20 & 4) != 0) {
								--var36;
							}
						}

						var39 = 0;

						while (var37-- > 0) {
							var12[var39] = class186.bufferX[var37];
							var13[var39++] = class186.bufferY[var37];
							if (var39 >= var12.length) {
								break;
							}
						}

						var7 = var39;
					}
				}

				var14 = var7;
				if (var7 >= 1) {
					for (var15 = 0; var15 < var14 - 1; ++var15) {
						var0.method2177(Client.field755[var15], Client.field756[var15], var3);
					}

				}
			}
		}
	}
}
