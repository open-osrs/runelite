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
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Lmy;Lmy;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field3821 = false; // L: 14
		this.field3822 = false; // L: 15
		this.field3816 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3822 = var6; // L: 27
		int var8 = this.index; // L: 29
		if (WorldMapLabel.NetCache_reference != null) { // L: 31
			WorldMapLabel.NetCache_reference.offset = var8 * 8 + 5; // L: 32
			int var9 = WorldMapLabel.NetCache_reference.readInt(); // L: 33
			int var10 = WorldMapLabel.NetCache_reference.readInt(); // L: 34
			this.loadIndex(var9, var10); // L: 35
		} else {
			class269.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 38
			NetCache.NetCache_archives[var8] = this; // L: 39
		}

	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "782340670"
	)
	public boolean method5540() {
		return this.field3821; // L: 44
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1520569672"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3821) { // L: 48
			return 100;
		} else if (super.groups != null) { // L: 49
			return 99;
		} else {
			int var1 = IsaacCipher.method7886(255, this.index); // L: 50
			if (var1 >= 100) { // L: 51
				var1 = 99;
			}

			return var1; // L: 52
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2090166080"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		PendingSpawn.method2225(this.index, var1); // L: 56
	} // L: 57

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2024016984"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			class10.method122(var1, this.archiveDisk, this); // L: 60
		} else {
			class269.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 61
		}

	} // L: 62

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-877437608"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 65
		this.indexVersion = var2; // L: 66
		if (this.masterDisk != null) { // L: 67
			class10.method122(this.index, this.masterDisk, this);
		} else {
			class269.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 68
		}

	} // L: 69

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "388189625"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 72
			if (this.field3821) { // L: 73
				throw new RuntimeException(); // L: 74
			}

			if (this.masterDisk != null) { // L: 76
				NPCComposition.method3321(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 77
			this.loadAllLocal(); // L: 78
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 81
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 82
			if (this.archiveDisk != null) { // L: 83
				NPCComposition.method3321(var1, var2, this.archiveDisk); // L: 84
				this.validGroups[var1] = true; // L: 85
			}

			if (var4) { // L: 87
				Object[] var5 = super.groups; // L: 88
				Object var7;
				if (var2 == null) { // L: 92
					var7 = null; // L: 93
				} else if (var2.length > 136) { // L: 96
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 98
					var8.set(var2); // L: 99
					var7 = var8; // L: 100
				} else {
					var7 = var2; // L: 105
				}

				var5[var1] = var7; // L: 107
			}
		}

	} // L: 110

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I[BZB)V",
		garbageValue = "1"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 113
			if (this.field3821) { // L: 114
				throw new RuntimeException(); // L: 115
			}

			if (var3 == null) { // L: 117
				class269.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 118
				return; // L: 119
			}

			Archive_crc.reset(); // L: 121
			Archive_crc.update(var3, 0, var3.length); // L: 122
			var5 = (int)Archive_crc.getValue(); // L: 123
			if (var5 != this.indexCrc) { // L: 124
				class269.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 125
				return; // L: 126
			}

			Buffer var11 = new Buffer(ViewportMouse.decompressBytes(var3)); // L: 128
			int var12 = var11.readUnsignedByte(); // L: 129
			if (var12 != 5 && var12 != 6) { // L: 130
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 131
			if (var12 >= 6) { // L: 132
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 133
				class269.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 134
				return; // L: 135
			}

			this.decodeIndex(var3); // L: 137
			this.loadAllLocal(); // L: 138
		} else {
			if (!var4 && var2 == this.field3816) { // L: 141
				this.field3821 = true; // L: 142
			}

			if (var3 == null || var3.length <= 2) { // L: 144
				this.validGroups[var2] = false; // L: 145
				if (this.field3822 || var4) { // L: 146
					class269.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 147
			}

			Archive_crc.reset(); // L: 149
			Archive_crc.update(var3, 0, var3.length - 2); // L: 150
			var5 = (int)Archive_crc.getValue(); // L: 151
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 152
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 153
				this.validGroups[var2] = false; // L: 154
				if (this.field3822 || var4) { // L: 155
					class269.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 156
			}

			this.validGroups[var2] = true; // L: 158
			if (var4) { // L: 159
				Object[] var7 = super.groups; // L: 160
				Object var9;
				if (var3 == null) { // L: 164
					var9 = null; // L: 165
				} else if (var3.length > 136) { // L: 168
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 170
					var10.set(var3); // L: 171
					var9 = var10; // L: 172
				} else {
					var9 = var3; // L: 177
				}

				var7[var2] = var9; // L: 179
			}
		}

	} // L: 182

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "955312949"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 185

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 186
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 187
			this.field3821 = true; // L: 188
		} else {
			this.field3816 = -1; // L: 191

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 192
				if (super.fileCounts[var1] > 0) { // L: 193
					ArchiveDisk var2 = this.archiveDisk; // L: 194
					ArchiveDiskAction var4 = new ArchiveDiskAction(); // L: 197
					var4.type = 1; // L: 198
					var4.key = (long)var1; // L: 199
					var4.archiveDisk = var2; // L: 200
					var4.archive = this; // L: 201
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 202
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4); // L: 203
					} // L: 204

					class174.method3383(); // L: 205
					this.field3816 = var1; // L: 207
				}
			}

			if (this.field3816 == -1) { // L: 210
				this.field3821 = true;
			}

		}
	} // L: 189 211

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "35"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 214
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : IsaacCipher.method7886(this.index, var1); // L: 215 216
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1796808817"
	)
	public boolean method5570(int var1) {
		return this.validGroups[var1]; // L: 220
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "832467152"
	)
	public boolean method5584(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 224
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "838378005"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 228
		int var2 = 0; // L: 229

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 230
			if (super.fileCounts[var3] > 0) { // L: 231
				var1 += 100; // L: 232
				var2 += this.groupLoadPercent(var3); // L: 233
			}
		}

		if (var1 == 0) { // L: 236
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 237
			return var3; // L: 238
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lck;IILgj;B)V",
		garbageValue = "95"
	)
	static final void method5586(Player var0, int var1, int var2, class185 var3) {
		int var4 = var0.pathX[0]; // L: 8574
		int var5 = var0.pathY[0]; // L: 8575
		int var6 = var0.transformedSize(); // L: 8576
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 8577
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 8578
				int var8 = var0.transformedSize(); // L: 8580
				Client.field754.approxDestinationX = var1; // L: 8583
				Client.field754.approxDestinationY = var2; // L: 8584
				Client.field754.field2117 = 1; // L: 8585
				Client.field754.field2114 = 1; // L: 8586
				ApproximateRouteStrategy var9 = Client.field754; // L: 8587
				ApproximateRouteStrategy var10 = var9; // L: 8589
				CollisionMap var11 = Client.collisionMaps[var0.plane]; // L: 8590
				int[] var12 = Client.field755; // L: 8591
				int[] var13 = Client.field756; // L: 8592

				int var14;
				int var15;
				for (var14 = 0; var14 < 128; ++var14) { // L: 8594
					for (var15 = 0; var15 < 128; ++var15) { // L: 8595
						class186.directions[var14][var15] = 0; // L: 8596
						class186.distances[var14][var15] = 99999999; // L: 8597
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
				if (var8 == 1) { // L: 8601
					var16 = var4; // L: 8604
					var17 = var5; // L: 8605
					byte var18 = 64; // L: 8606
					var19 = 64; // L: 8607
					var20 = var4 - var18; // L: 8608
					var21 = var5 - var19; // L: 8609
					class186.directions[var18][var19] = 99; // L: 8610
					class186.distances[var18][var19] = 0; // L: 8611
					byte var22 = 0; // L: 8612
					var23 = 0; // L: 8613
					class186.bufferX[var22] = var4; // L: 8614
					var39 = var22 + 1;
					class186.bufferY[var22] = var5; // L: 8615
					int[][] var24 = var11.flags; // L: 8616

					boolean var35;
					while (true) {
						if (var39 == var23) { // L: 8619
							class186.field2129 = var16; // L: 8691
							class186.field2130 = var17; // L: 8692
							var35 = false; // L: 8693
							break;
						}

						var16 = class186.bufferX[var23]; // L: 8620
						var17 = class186.bufferY[var23]; // L: 8621
						var23 = var23 + 1 & 4095; // L: 8622
						var36 = var16 - var20; // L: 8623
						var37 = var17 - var21; // L: 8624
						var25 = var16 - var11.xInset; // L: 8625
						var26 = var17 - var11.yInset; // L: 8626
						if (var10.hasArrived(1, var16, var17, var11)) { // L: 8627
							class186.field2129 = var16; // L: 8628
							class186.field2130 = var17; // L: 8629
							var35 = true; // L: 8630
							break;
						}

						var27 = class186.distances[var36][var37] + 1; // L: 8633
						if (var36 > 0 && class186.directions[var36 - 1][var37] == 0 && (var24[var25 - 1][var26] & 19136776) == 0) { // L: 8634
							class186.bufferX[var39] = var16 - 1; // L: 8635
							class186.bufferY[var39] = var17; // L: 8636
							var39 = var39 + 1 & 4095; // L: 8637
							class186.directions[var36 - 1][var37] = 2; // L: 8638
							class186.distances[var36 - 1][var37] = var27; // L: 8639
						}

						if (var36 < 127 && class186.directions[var36 + 1][var37] == 0 && (var24[var25 + 1][var26] & 19136896) == 0) { // L: 8641
							class186.bufferX[var39] = var16 + 1; // L: 8642
							class186.bufferY[var39] = var17; // L: 8643
							var39 = var39 + 1 & 4095; // L: 8644
							class186.directions[var36 + 1][var37] = 8; // L: 8645
							class186.distances[var36 + 1][var37] = var27; // L: 8646
						}

						if (var37 > 0 && class186.directions[var36][var37 - 1] == 0 && (var24[var25][var26 - 1] & 19136770) == 0) { // L: 8648
							class186.bufferX[var39] = var16; // L: 8649
							class186.bufferY[var39] = var17 - 1; // L: 8650
							var39 = var39 + 1 & 4095; // L: 8651
							class186.directions[var36][var37 - 1] = 1; // L: 8652
							class186.distances[var36][var37 - 1] = var27; // L: 8653
						}

						if (var37 < 127 && class186.directions[var36][var37 + 1] == 0 && (var24[var25][var26 + 1] & 19136800) == 0) { // L: 8655
							class186.bufferX[var39] = var16; // L: 8656
							class186.bufferY[var39] = var17 + 1; // L: 8657
							var39 = var39 + 1 & 4095; // L: 8658
							class186.directions[var36][var37 + 1] = 4; // L: 8659
							class186.distances[var36][var37 + 1] = var27; // L: 8660
						}

						if (var36 > 0 && var37 > 0 && class186.directions[var36 - 1][var37 - 1] == 0 && (var24[var25 - 1][var26 - 1] & 19136782) == 0 && (var24[var25 - 1][var26] & 19136776) == 0 && (var24[var25][var26 - 1] & 19136770) == 0) { // L: 8662
							class186.bufferX[var39] = var16 - 1; // L: 8663
							class186.bufferY[var39] = var17 - 1; // L: 8664
							var39 = var39 + 1 & 4095; // L: 8665
							class186.directions[var36 - 1][var37 - 1] = 3; // L: 8666
							class186.distances[var36 - 1][var37 - 1] = var27; // L: 8667
						}

						if (var36 < 127 && var37 > 0 && class186.directions[var36 + 1][var37 - 1] == 0 && (var24[var25 + 1][var26 - 1] & 19136899) == 0 && (var24[var25 + 1][var26] & 19136896) == 0 && (var24[var25][var26 - 1] & 19136770) == 0) { // L: 8669
							class186.bufferX[var39] = var16 + 1; // L: 8670
							class186.bufferY[var39] = var17 - 1; // L: 8671
							var39 = var39 + 1 & 4095; // L: 8672
							class186.directions[var36 + 1][var37 - 1] = 9; // L: 8673
							class186.distances[var36 + 1][var37 - 1] = var27; // L: 8674
						}

						if (var36 > 0 && var37 < 127 && class186.directions[var36 - 1][var37 + 1] == 0 && (var24[var25 - 1][var26 + 1] & 19136824) == 0 && (var24[var25 - 1][var26] & 19136776) == 0 && (var24[var25][var26 + 1] & 19136800) == 0) { // L: 8676
							class186.bufferX[var39] = var16 - 1; // L: 8677
							class186.bufferY[var39] = var17 + 1; // L: 8678
							var39 = var39 + 1 & 4095; // L: 8679
							class186.directions[var36 - 1][var37 + 1] = 6; // L: 8680
							class186.distances[var36 - 1][var37 + 1] = var27; // L: 8681
						}

						if (var36 < 127 && var37 < 127 && class186.directions[var36 + 1][var37 + 1] == 0 && (var24[var25 + 1][var26 + 1] & 19136992) == 0 && (var24[var25 + 1][var26] & 19136896) == 0 && (var24[var25][var26 + 1] & 19136800) == 0) { // L: 8683
							class186.bufferX[var39] = var16 + 1; // L: 8684
							class186.bufferY[var39] = var17 + 1; // L: 8685
							var39 = var39 + 1 & 4095; // L: 8686
							class186.directions[var36 + 1][var37 + 1] = 12; // L: 8687
							class186.distances[var36 + 1][var37 + 1] = var27; // L: 8688
						}
					}

					var34 = var35; // L: 8695
				} else if (var8 == 2) { // L: 8697
					var34 = Clock.method3132(var4, var5, var9, var11);
				} else {
					var34 = UserComparator2.method7617(var4, var5, var8, var9, var11); // L: 8698
				}

				int var7;
				label346: {
					var15 = var4 - 64; // L: 8699
					var16 = var5 - 64; // L: 8700
					var17 = class186.field2129; // L: 8701
					var36 = class186.field2130; // L: 8702
					if (!var34) { // L: 8703
						var37 = Integer.MAX_VALUE; // L: 8705
						var20 = Integer.MAX_VALUE; // L: 8706
						byte var38 = 10; // L: 8707
						var39 = var10.approxDestinationX; // L: 8708
						var23 = var10.approxDestinationY; // L: 8709
						int var33 = var10.field2117; // L: 8710
						var25 = var10.field2114; // L: 8711

						for (var26 = var39 - var38; var26 <= var38 + var39; ++var26) { // L: 8712
							for (var27 = var23 - var38; var27 <= var23 + var38; ++var27) { // L: 8713
								int var28 = var26 - var15; // L: 8714
								int var29 = var27 - var16; // L: 8715
								if (var28 >= 0 && var29 >= 0 && var28 < 128 && var29 < 128 && class186.distances[var28][var29] < 100) { // L: 8716 8717
									int var30 = 0; // L: 8718
									if (var26 < var39) { // L: 8719
										var30 = var39 - var26;
									} else if (var26 > var39 + var33 - 1) { // L: 8720
										var30 = var26 - (var39 + var33 - 1);
									}

									int var31 = 0; // L: 8721
									if (var27 < var23) { // L: 8722
										var31 = var23 - var27;
									} else if (var27 > var25 + var23 - 1) {
										var31 = var27 - (var23 + var25 - 1); // L: 8723
									}

									int var32 = var30 * var30 + var31 * var31; // L: 8724
									if (var32 < var37 || var32 == var37 && class186.distances[var28][var29] < var20) { // L: 8725
										var37 = var32; // L: 8726
										var20 = class186.distances[var28][var29]; // L: 8727
										var17 = var26; // L: 8728
										var36 = var27; // L: 8729
									}
								}
							}
						}

						if (var37 == Integer.MAX_VALUE) { // L: 8735
							var7 = -1; // L: 8736
							break label346;
						}
					}

					if (var4 == var17 && var36 == var5) { // L: 8745
						var7 = 0; // L: 8746
					} else {
						var19 = 0; // L: 8749
						class186.bufferX[var19] = var17; // L: 8752
						var37 = var19 + 1;
						class186.bufferY[var19] = var36; // L: 8753

						for (var20 = var21 = class186.directions[var17 - var15][var36 - var16]; var17 != var4 || var36 != var5; var20 = class186.directions[var17 - var15][var36 - var16]) { // L: 8754 8755 8765
							if (var20 != var21) { // L: 8756
								var21 = var20; // L: 8757
								class186.bufferX[var37] = var17; // L: 8758
								class186.bufferY[var37++] = var36; // L: 8759
							}

							if ((var20 & 2) != 0) { // L: 8761
								++var17;
							} else if ((var20 & 8) != 0) { // L: 8762
								--var17;
							}

							if ((var20 & 1) != 0) { // L: 8763
								++var36;
							} else if ((var20 & 4) != 0) { // L: 8764
								--var36;
							}
						}

						var39 = 0; // L: 8767

						while (var37-- > 0) { // L: 8768
							var12[var39] = class186.bufferX[var37]; // L: 8769
							var13[var39++] = class186.bufferY[var37]; // L: 8770
							if (var39 >= var12.length) { // L: 8771
								break;
							}
						}

						var7 = var39; // L: 8773
					}
				}

				var14 = var7; // L: 8775
				if (var7 >= 1) { // L: 8776
					for (var15 = 0; var15 < var14 - 1; ++var15) { // L: 8777
						var0.method2177(Client.field755[var15], Client.field756[var15], var3);
					}

				}
			}
		}
	} // L: 8778
}
