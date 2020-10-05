import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ao")
	static CRC32 Archive_crc;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	ArchiveDisk archiveDisk;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	ArchiveDisk masterDisk;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1943179967
	)
	int index;
	@ObfuscatedName("e")
	volatile boolean field3185;
	@ObfuscatedName("ab")
	boolean field3186;
	@ObfuscatedName("ag")
	volatile boolean[] validGroups;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 865644011
	)
	int indexCrc;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -193414103
	)
	int indexVersion;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 196080105
	)
	int field3191;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Llz;Llz;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field3185 = false; // L: 14
		this.field3186 = false; // L: 15
		this.field3191 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3186 = var6; // L: 27
		Widget.method4174(this, this.index); // L: 28
	} // L: 29

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "176946518"
	)
	void loadRegionFromGroup(int var1) {
		SecureRandomCallable.method1204(this.index, var1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-21407020"
	)
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 200
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : World.method1845(this.index, var1); // L: 201 202
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "450530880"
	)
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 48
			ArchiveDisk var2 = this.archiveDisk; // L: 49
			byte[] var4 = null; // L: 52
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 53
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 54
					if (var6.key == (long)var1 && var2 == var6.archiveDisk && var6.type == 0) { // L: 55
						var4 = var6.data; // L: 56
						break; // L: 57
					}
				}
			}

			if (var4 != null) { // L: 61
				this.load(var2, var1, var4, true); // L: 62
			} else {
				byte[] var5 = var2.read(var1); // L: 65
				this.load(var2, var1, var5, true); // L: 66
			}
		} else {
			Varps.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 69
		}

	} // L: 70

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1735619365"
	)
	public boolean method4340() {
		return this.field3185; // L: 32
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-121154638"
	)
	public int percentage() {
		if (this.field3185) { // L: 36
			return 100;
		} else if (super.groups != null) { // L: 37
			return 99;
		} else {
			int var1 = World.method1845(255, this.index); // L: 38
			if (var1 >= 100) { // L: 39
				var1 = 99;
			}

			return var1; // L: 40
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1573806265"
	)
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 73
		this.indexVersion = var2; // L: 74
		if (this.masterDisk != null) { // L: 75
			int var3 = this.index; // L: 76
			ArchiveDisk var4 = this.masterDisk; // L: 77
			byte[] var6 = null; // L: 80
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 81
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 82
					if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) { // L: 83
						var6 = var8.data; // L: 84
						break; // L: 85
					}
				}
			}

			if (var6 != null) { // L: 89
				this.load(var4, var3, var6, true); // L: 90
			} else {
				byte[] var7 = var4.read(var3); // L: 93
				this.load(var4, var3, var7, true); // L: 94
			}
		} else {
			Varps.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 97
		}

	} // L: 98

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I[BZZB)V",
		garbageValue = "-85"
	)
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 101
			if (this.field3185) { // L: 102
				throw new RuntimeException(); // L: 103
			}

			if (this.masterDisk != null) { // L: 105
				Calendar.method4039(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 106
			this.loadAllLocal(); // L: 107
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 110
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 111
			if (this.archiveDisk != null) { // L: 112
				ArchiveDisk var5 = this.archiveDisk; // L: 113
				ArchiveDiskAction var6 = new ArchiveDiskAction(); // L: 115
				var6.type = 0; // L: 116
				var6.key = (long)var1; // L: 117
				var6.data = var2; // L: 118
				var6.archiveDisk = var5; // L: 119
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 120
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var6); // L: 121
				} // L: 122

				WorldMapArea.method415(); // L: 123
				this.validGroups[var1] = true; // L: 125
			}

			if (var4) { // L: 127
				super.groups[var1] = MenuAction.method2140(var2, false);
			}
		}

	} // L: 129

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Llz;I[BZI)V",
		garbageValue = "-2086018580"
	)
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 132
			if (this.field3185) { // L: 133
				throw new RuntimeException(); // L: 134
			}

			if (var3 == null) { // L: 136
				Varps.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 137
				return; // L: 138
			}

			Archive_crc.reset(); // L: 140
			Archive_crc.update(var3, 0, var3.length); // L: 141
			var5 = (int)Archive_crc.getValue(); // L: 142
			if (var5 != this.indexCrc) { // L: 143
				Varps.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 144
				return; // L: 145
			}

			Buffer var9 = new Buffer(DevicePcmPlayerProvider.decompressBytes(var3)); // L: 147
			int var7 = var9.readUnsignedByte(); // L: 148
			if (var7 != 5 && var7 != 6) { // L: 149
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 150
			if (var7 >= 6) { // L: 151
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 152
				Varps.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 153
				return; // L: 154
			}

			this.decodeIndex(var3); // L: 156
			this.loadAllLocal(); // L: 157
		} else {
			if (!var4 && var2 == this.field3191) { // L: 160
				this.field3185 = true; // L: 161
			}

			if (var3 == null || var3.length <= 2) { // L: 163
				this.validGroups[var2] = false; // L: 164
				if (this.field3186 || var4) { // L: 165
					Varps.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 166
			}

			Archive_crc.reset(); // L: 168
			Archive_crc.update(var3, 0, var3.length - 2); // L: 169
			var5 = (int)Archive_crc.getValue(); // L: 170
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 171
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 172
				this.validGroups[var2] = false; // L: 173
				if (this.field3186 || var4) { // L: 174
					Varps.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 175
			}

			this.validGroups[var2] = true; // L: 177
			if (var4) { // L: 178
				super.groups[var2] = MenuAction.method2140(var3, false);
			}
		}

	} // L: 180

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1665634170"
	)
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 183

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 184
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 185
			this.field3185 = true; // L: 186
		} else {
			this.field3191 = -1; // L: 189

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 190
				if (super.fileCounts[var1] > 0) { // L: 191
					FaceNormal.method3388(var1, this.archiveDisk, this); // L: 192
					this.field3191 = var1; // L: 193
				}
			}

			if (this.field3191 == -1) { // L: 196
				this.field3185 = true;
			}

		}
	} // L: 187 197

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1146197798"
	)
	public boolean method4349(int var1) {
		return this.validGroups[var1]; // L: 206
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1915493362"
	)
	public boolean method4350(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 210
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-18"
	)
	public int loadPercent() {
		int var1 = 0; // L: 214
		int var2 = 0; // L: 215

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 216
			if (super.fileCounts[var3] > 0) { // L: 217
				var1 += 100; // L: 218
				var2 += this.groupLoadPercent(var3); // L: 219
			}
		}

		if (var1 == 0) { // L: 222
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 223
			return var3; // L: 224
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)Lgb;",
		garbageValue = "-18940"
	)
	public static PacketBufferNode method4385() {
		PacketBufferNode var0 = ItemContainer.method1226(); // L: 42
		var0.clientPacket = null; // L: 43
		var0.clientPacketLength = 0; // L: 44
		var0.packetBuffer = new PacketBuffer(5000); // L: 45
		return var0; // L: 46
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "961891121"
	)
	public static boolean method4386(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 21
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "2129310615"
	)
	static final void method4357(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field702; ++var1) { // L: 6858
			int var2 = Client.field721[var1]; // L: 6859
			NPC var3 = Client.npcs[var2]; // L: 6860
			int var4 = var0.readUnsignedByte(); // L: 6861
			int var5;
			int var6;
			int var7;
			int var8;
			if ((var4 & 128) != 0) { // L: 6862
				var5 = var0.method5639(); // L: 6863
				int var9;
				int var10;
				int var11;
				if (var5 > 0) { // L: 6864
					for (var6 = 0; var6 < var5; ++var6) { // L: 6865
						var8 = -1; // L: 6867
						var9 = -1; // L: 6868
						var10 = -1; // L: 6869
						var7 = var0.readUShortSmart(); // L: 6870
						if (var7 == 32767) { // L: 6871
							var7 = var0.readUShortSmart(); // L: 6872
							var9 = var0.readUShortSmart(); // L: 6873
							var8 = var0.readUShortSmart(); // L: 6874
							var10 = var0.readUShortSmart(); // L: 6875
						} else if (var7 != 32766) { // L: 6877
							var9 = var0.readUShortSmart(); // L: 6878
						} else {
							var7 = -1; // L: 6880
						}

						var11 = var0.readUShortSmart(); // L: 6881
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 6882
					}
				}

				var6 = var0.readUnsignedByte(); // L: 6885
				if (var6 > 0) { // L: 6886
					for (var7 = 0; var7 < var6; ++var7) { // L: 6887
						var8 = var0.readUShortSmart(); // L: 6888
						var9 = var0.readUShortSmart(); // L: 6889
						if (var9 != 32767) { // L: 6890
							var10 = var0.readUShortSmart(); // L: 6891
							var11 = var0.method5612(); // L: 6892
							int var12 = var9 > 0 ? var0.method5639() : var11; // L: 6893
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 6894
						} else {
							var3.removeHealthBar(var8); // L: 6896
						}
					}
				}
			}

			if ((var4 & 16) != 0) { // L: 6900
				var3.targetIndex = var0.method5656(); // L: 6901
				if (var3.targetIndex == 65535) { // L: 6902
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 8) != 0) { // L: 6904
				var3.field997 = var0.method5650(); // L: 6905
				var3.field1016 = var0.method5730(); // L: 6906
				var3.field1015 = var0.method5649(); // L: 6907
				var3.field1017 = var0.method5649(); // L: 6908
				var3.field1026 = var0.method5657() + Client.cycle; // L: 6909
				var3.field1019 = var0.method5657() + Client.cycle; // L: 6910
				var3.field1027 = var0.readUnsignedShort(); // L: 6911
				var3.pathLength = 1; // L: 6912
				var3.field973 = 0; // L: 6913
				var3.field997 += var3.pathX[0]; // L: 6914
				var3.field1016 += var3.pathY[0]; // L: 6915
				var3.field1015 += var3.pathX[0]; // L: 6916
				var3.field1017 += var3.pathY[0]; // L: 6917
			}

			if ((var4 & 2) != 0) { // L: 6919
				var3.definition = Skeleton.getNpcDefinition(var0.readUnsignedShort()); // L: 6920
				var3.field1014 = var3.definition.size; // L: 6921
				var3.field1025 = var3.definition.rotation; // L: 6922
				var3.walkSequence = var3.definition.walkSequence; // L: 6923
				var3.walkBackSequence = var3.definition.walkBackSequence; // L: 6924
				var3.walkLeftSequence = var3.definition.walkLeftSequence; // L: 6925
				var3.walkRightSequence = var3.definition.walkRightSequence; // L: 6926
				var3.idleSequence = var3.definition.idleSequence; // L: 6927
				var3.turnLeftSequence = var3.definition.turnLeftSequence; // L: 6928
				var3.turnRightSequence = var3.definition.turnRightSequence; // L: 6929
			}

			if ((var4 & 4) != 0) { // L: 6931
				var5 = var0.readUnsignedShort(); // L: 6932
				if (var5 == 65535) { // L: 6933
					var5 = -1;
				}

				var6 = var0.method5639(); // L: 6934
				if (var5 == var3.sequence && var5 != -1) { // L: 6935
					var7 = WorldMapRegion.SequenceDefinition_get(var5).field3535; // L: 6936
					if (var7 == 1) { // L: 6937
						var3.sequenceFrame = 0; // L: 6938
						var3.sequenceFrameCycle = 0; // L: 6939
						var3.sequenceDelay = var6; // L: 6940
						var3.field1009 = 0; // L: 6941
					}

					if (var7 == 2) { // L: 6943
						var3.field1009 = 0; // L: 6944
					}
				} else if (var5 == -1 || var3.sequence == -1 || WorldMapRegion.SequenceDefinition_get(var5).field3537 >= WorldMapRegion.SequenceDefinition_get(var3.sequence).field3537) { // L: 6947
					var3.sequence = var5; // L: 6948
					var3.sequenceFrame = 0; // L: 6949
					var3.sequenceFrameCycle = 0; // L: 6950
					var3.sequenceDelay = var6; // L: 6951
					var3.field1009 = 0; // L: 6952
					var3.field973 = var3.pathLength; // L: 6953
				}
			}

			if ((var4 & 1) != 0) { // L: 6957
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 6958
				var3.overheadTextCyclesRemaining = 100; // L: 6959
			}

			if ((var4 & 32) != 0) { // L: 6961
				var3.spotAnimation = var0.method5655(); // L: 6962
				var5 = var0.method5678(); // L: 6963
				var3.field1003 = var5 >> 16; // L: 6964
				var3.field1013 = (var5 & 65535) + Client.cycle; // L: 6965
				var3.spotAnimationFrame = 0; // L: 6966
				var3.spotAnimationFrameCycle = 0; // L: 6967
				if (var3.field1013 > Client.cycle) { // L: 6968
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 6969
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 64) != 0) { // L: 6971
				var5 = var0.method5656(); // L: 6972
				var6 = var0.method5655(); // L: 6973
				var7 = var3.x - (var5 - WorldMapManager.baseX - WorldMapManager.baseX) * 64; // L: 6974
				var8 = var3.y - (var6 - WorldMapLabel.baseY - WorldMapLabel.baseY) * 64; // L: 6975
				if (var7 != 0 || var8 != 0) { // L: 6976
					var3.field1000 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}
		}

	} // L: 6979

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1501250507"
	)
	static void method4383(int var0, String var1) {
		int var2 = Players.Players_count; // L: 8057
		int[] var3 = Players.Players_indices; // L: 8058
		boolean var4 = false; // L: 8059
		Username var5 = new Username(var1, WorldMapAreaData.loginType); // L: 8060

		for (int var6 = 0; var6 < var2; ++var6) { // L: 8061
			Player var7 = Client.players[var3[var6]]; // L: 8062
			if (var7 != null && var7 != WorldMapLabelSize.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 8063
				PacketBufferNode var8;
				if (var0 == 1) { // L: 8064
					var8 = Client.getPacketBufferNode(ClientPacket.field2320, Client.packetWriter.isaacCipher); // L: 8066
					var8.packetBuffer.method5665(var3[var6]); // L: 8067
					var8.packetBuffer.method5644(0); // L: 8068
					Client.packetWriter.addNode(var8); // L: 8069
				} else if (var0 == 4) { // L: 8071
					var8 = Client.getPacketBufferNode(ClientPacket.field2246, Client.packetWriter.isaacCipher); // L: 8073
					var8.packetBuffer.method5653(var3[var6]); // L: 8074
					var8.packetBuffer.writeIntME(0); // L: 8075
					Client.packetWriter.addNode(var8); // L: 8076
				} else if (var0 == 6) { // L: 8078
					var8 = Client.getPacketBufferNode(ClientPacket.field2274, Client.packetWriter.isaacCipher); // L: 8080
					var8.packetBuffer.method5665(var3[var6]); // L: 8081
					var8.packetBuffer.writeIntME(0); // L: 8082
					Client.packetWriter.addNode(var8); // L: 8083
				} else if (var0 == 7) { // L: 8085
					var8 = Client.getPacketBufferNode(ClientPacket.field2343, Client.packetWriter.isaacCipher); // L: 8087
					var8.packetBuffer.writeIntME(0); // L: 8088
					var8.packetBuffer.method5654(var3[var6]); // L: 8089
					Client.packetWriter.addNode(var8); // L: 8090
				}

				var4 = true; // L: 8092
				break;
			}
		}

		if (!var4) { // L: 8096
			WorldMapRectangle.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 8097
}
