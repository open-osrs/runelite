import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("t")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1616385301
	)
	@Export("index")
	int index;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1061047975
	)
	volatile int field3981;
	@ObfuscatedName("i")
	boolean field3979;
	@ObfuscatedName("s")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2100182859
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -121372543
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 735655197
	)
	int field3989;
	@ObfuscatedName("k")
	boolean field3990;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5); // L: 27
		this.field3981 = 0; // L: 17
		this.field3979 = false; // L: 18
		this.field3989 = -1;
		this.field3990 = false;
		this.archiveDisk = var1; // L: 28
		this.masterDisk = var2; // L: 29
		this.index = var3; // L: 30
		this.field3979 = var6; // L: 31
		this.field3990 = var7; // L: 32
		class93.method2403(this, this.index); // L: 33
	} // L: 34

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1214739037"
	)
	public boolean method5795() {
		return this.field3981 == 1; // L: 37
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1116863257"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3981 != 1 && (!this.field3990 || this.field3981 != 2)) { // L: 41
			if (super.groups != null) { // L: 42
				return 99;
			} else {
				int var2 = this.index; // L: 44
				long var3 = (long)(var2 + 16711680); // L: 46
				int var1;
				if (Buddy.NetCache_currentResponse != null && Buddy.NetCache_currentResponse.key == var3) { // L: 47
					var1 = ObjectSound.NetCache_responseArchiveBuffer.offset * 99 / (ObjectSound.NetCache_responseArchiveBuffer.array.length - Buddy.NetCache_currentResponse.padding) + 1; // L: 51
				} else {
					var1 = 0; // L: 48
				}

				int var5 = var1; // L: 53
				if (var1 >= 100) { // L: 54
					var5 = 99;
				}

				return var5; // L: 55
			}
		} else {
			return 100;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "20"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		FloorOverlayDefinition.method3808(this.index, var1); // L: 59
	} // L: 60

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "22"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 63
			ClientPacket.method5191(var1, this.archiveDisk, this);
		} else {
			ClanChannel.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 64
		}

	} // L: 65

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-927514602"
	)
	void method5822() {
		this.field3981 = 2; // L: 68
		super.groupIds = new int[0]; // L: 69
		super.groupCrcs = new int[0]; // L: 70
		super.groupVersions = new int[0]; // L: 71
		super.fileCounts = new int[0]; // L: 72
		super.fileIds = new int[0][]; // L: 73
		super.groups = new Object[0]; // L: 74
		super.files = new Object[0][]; // L: 75
	} // L: 76

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "28"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 79
		this.indexVersion = var2; // L: 80
		if (this.masterDisk != null) { // L: 81
			ClientPacket.method5191(this.index, this.masterDisk, this);
		} else {
			ClanChannel.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 82
		}

	} // L: 83

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "757512896"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 86
			if (this.field3981 == 1) { // L: 87
				throw new RuntimeException(); // L: 88
			}

			if (this.masterDisk != null) { // L: 90
				class432.method7576(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 91
			this.loadAllLocal(); // L: 92
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 95
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 96
			if (this.archiveDisk != null) { // L: 97
				class432.method7576(var1, var2, this.archiveDisk); // L: 98
				this.validGroups[var1] = true; // L: 99
			}

			if (var4) {
				super.groups[var1] = WorldMapArea.method4621(var2, false); // L: 101
			}
		}

	} // L: 103

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I[BZI)V",
		garbageValue = "667811563"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 106
			if (this.field3981 == 1) { // L: 107
				throw new RuntimeException(); // L: 108
			}

			if (var3 == null) { // L: 110
				ClanChannel.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 111
				return; // L: 112
			}

			Archive_crc.reset(); // L: 114
			Archive_crc.update(var3, 0, var3.length); // L: 115
			var5 = (int)Archive_crc.getValue(); // L: 116
			if (var5 != this.indexCrc) { // L: 117
				ClanChannel.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 118
				return; // L: 119
			}

			Buffer var9 = new Buffer(SoundSystem.decompressBytes(var3)); // L: 121
			int var7 = var9.readUnsignedByte(); // L: 122
			if (var7 != 5 && var7 != 6) { // L: 123
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 124
			if (var7 >= 6) { // L: 125
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 126
				ClanChannel.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 127
				return; // L: 128
			}

			this.decodeIndex(var3); // L: 130
			this.loadAllLocal(); // L: 131
		} else {
			if (!var4 && var2 == this.field3989) { // L: 134
				this.field3981 = 1; // L: 135
			}

			if (var3 == null || var3.length <= 2) { // L: 137
				this.validGroups[var2] = false; // L: 138
				if (this.field3979 || var4) { // L: 139
					ClanChannel.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 140
			}

			Archive_crc.reset(); // L: 142
			Archive_crc.update(var3, 0, var3.length - 2); // L: 143
			var5 = (int)Archive_crc.getValue(); // L: 144
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 145
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 146
				this.validGroups[var2] = false; // L: 147
				if (this.field3979 || var4) { // L: 148
					ClanChannel.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 149
			}

			this.validGroups[var2] = true; // L: 151
			if (var4) { // L: 152
				super.groups[var2] = WorldMapArea.method4621(var3, false);
			}
		}

	} // L: 154

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1883328836"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 157

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 158
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 159
			this.field3981 = 1; // L: 160
		} else {
			this.field3989 = -1; // L: 163

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 164
				if (super.fileCounts[var1] > 0) { // L: 165
					class305.method5764(var1, this.archiveDisk, this); // L: 166
					this.field3989 = var1; // L: 167
				}
			}

			if (this.field3989 == -1) { // L: 170
				this.field3981 = 1;
			}

		}
	} // L: 161 171

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-227114003"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 174
			return 100;
		} else if (this.validGroups[var1]) { // L: 175
			return 100;
		} else {
			int var3 = this.index; // L: 177
			long var4 = (long)((var3 << 16) + var1); // L: 179
			int var2;
			if (Buddy.NetCache_currentResponse != null && Buddy.NetCache_currentResponse.key == var4) { // L: 180
				var2 = ObjectSound.NetCache_responseArchiveBuffer.offset * 99 / (ObjectSound.NetCache_responseArchiveBuffer.array.length - Buddy.NetCache_currentResponse.padding) + 1; // L: 184
			} else {
				var2 = 0; // L: 181
			}

			return var2; // L: 186
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1110096171"
	)
	public boolean method5805(int var1) {
		return this.validGroups[var1]; // L: 190
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2097935878"
	)
	public boolean method5806(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 194
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1832230483"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 198
		int var2 = 0; // L: 199

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 200
			if (super.fileCounts[var3] > 0) { // L: 201
				var1 += 100; // L: 202
				var2 += this.groupLoadPercent(var3); // L: 203
			}
		}

		if (var1 == 0) { // L: 206
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 207
			return var3; // L: 208
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "47"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "([Lkb;II)V",
		garbageValue = "1365503093"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11771
			Widget var3 = var0[var2]; // L: 11772
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !Frames.isComponentHidden(var3))) { // L: 11773 11774 11775
				int var5;
				if (var3.type == 0) { // L: 11776
					if (!var3.isIf3 && Frames.isComponentHidden(var3) && var3 != Language.mousedOverWidgetIf1) { // L: 11777
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11778
					if (var3.children != null) { // L: 11779
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11780
					if (var4 != null) { // L: 11781
						var5 = var4.group; // L: 11782
						if (WorldMapSection2.loadInterface(var5)) { // L: 11784
							drawModelComponents(SoundCache.Widget_interfaceComponents[var5], -1); // L: 11785
						}
					}
				}

				if (var3.type == 6) { // L: 11789
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11790
						boolean var7 = ObjectSound.runCs1(var3); // L: 11791
						if (var7) { // L: 11793
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11794
						}

						if (var5 != -1) { // L: 11795
							SequenceDefinition var6 = ScriptFrame.SequenceDefinition_get(var5); // L: 11796

							for (var3.modelFrameCycle += Client.field555; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; ChatChannel.invalidateWidget(var3)) { // L: 11797 11798 11805
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11799
								++var3.modelFrame; // L: 11800
								if (var3.modelFrame >= var6.frameIds.length) { // L: 11801
									var3.modelFrame -= var6.frameCount; // L: 11802
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11803
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3373 != 0 && !var3.isIf3) { // L: 11809
						int var8 = var3.field3373 >> 16; // L: 11810
						var5 = var3.field3373 << 16 >> 16; // L: 11811
						var8 *= Client.field555; // L: 11812
						var5 *= Client.field555; // L: 11813
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 11814
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11815
						ChatChannel.invalidateWidget(var3); // L: 11816
					}
				}
			}
		}

	} // L: 11820
}
