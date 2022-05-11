import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("le")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("r")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 232250769
	)
	@Export("index")
	int index;
	@ObfuscatedName("m")
	volatile boolean field4009;
	@ObfuscatedName("p")
	boolean field4010;
	@ObfuscatedName("s")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 693751521
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1377656539
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -463478149
	)
	int field4013;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Lnc;Lnc;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field4009 = false; // L: 14
		this.field4010 = false; // L: 15
		this.field4013 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field4010 = var6; // L: 27
		class125.method2796(this, this.index); // L: 28
	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-611080530"
	)
	public boolean method5624() {
		return this.field4009; // L: 32
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1253089575"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4009) { // L: 36
			return 100;
		} else if (super.groups != null) { // L: 37
			return 99;
		} else {
			int var1 = class6.method45(255, this.index); // L: 38
			if (var1 >= 100) { // L: 39
				var1 = 99;
			}

			return var1; // L: 40
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "738299214"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		DevicePcmPlayerProvider.method336(this.index, var1); // L: 44
	} // L: 45

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-250456045"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 48
			Skeleton.method4022(var1, this.archiveDisk, this);
		} else {
			class250.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 49
		}

	} // L: 50

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2125886075"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 53
		this.indexVersion = var2; // L: 54
		if (this.masterDisk != null) { // L: 55
			Skeleton.method4022(this.index, this.masterDisk, this);
		} else {
			class250.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 56
		}

	} // L: 57

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I[BZZB)V",
		garbageValue = "66"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 60
			if (this.field4009) { // L: 61
				throw new RuntimeException(); // L: 62
			}

			if (this.masterDisk != null) { // L: 64
				ModelData0.method4378(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 65
			this.loadAllLocal(); // L: 66
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 69
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 70
			if (this.archiveDisk != null) { // L: 71
				ModelData0.method4378(var1, var2, this.archiveDisk); // L: 72
				this.validGroups[var1] = true; // L: 73
			}

			if (var4) { // L: 75
				super.groups[var1] = WorldMapEvent.method4929(var2, false);
			}
		}

	} // L: 77

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I[BZB)V",
		garbageValue = "-99"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 80
			if (this.field4009) { // L: 81
				throw new RuntimeException(); // L: 82
			} else if (var3 == null) { // L: 84
				class250.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 85
			} else {
				Archive_crc.reset(); // L: 88
				Archive_crc.update(var3, 0, var3.length); // L: 89
				var5 = (int)Archive_crc.getValue(); // L: 90
				if (var5 != this.indexCrc) { // L: 91
					class250.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 92
				} else {
					Buffer var9 = new Buffer(Skills.decompressBytes(var3)); // L: 95
					int var7 = var9.readUnsignedByte(); // L: 96
					if (var7 != 5 && var7 != 6) { // L: 97
						throw new RuntimeException(var7 + "," + this.index + "," + var2);
					} else {
						int var8 = 0; // L: 98
						if (var7 >= 6) { // L: 99
							var8 = var9.readInt();
						}

						if (var8 != this.indexVersion) { // L: 100
							class250.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 101
						} else {
							this.decodeIndex(var3); // L: 104
							this.loadAllLocal(); // L: 105
						}
					}
				}
			}
		} else {
			if (!var4 && var2 == this.field4013) { // L: 108
				this.field4009 = true; // L: 109
			}

			if (var3 != null && var3.length > 2) { // L: 111
				Archive_crc.reset(); // L: 116
				Archive_crc.update(var3, 0, var3.length - 2); // L: 117
				var5 = (int)Archive_crc.getValue(); // L: 118
				int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 119
				if (var5 == super.groupCrcs[var2] && var6 == super.groupVersions[var2]) { // L: 120
					this.validGroups[var2] = true; // L: 125
					if (var4) { // L: 126
						super.groups[var2] = WorldMapEvent.method4929(var3, false);
					}

				} else {
					this.validGroups[var2] = false; // L: 121
					if (this.field4010 || var4) { // L: 122
						class250.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
					}

				}
			} else {
				this.validGroups[var2] = false; // L: 112
				if (this.field4010 || var4) { // L: 113
					class250.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

			}
		}
	} // L: 86 93 102 114 123 128

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 131

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 132
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 133
			this.field4009 = true; // L: 134
		} else {
			this.field4013 = -1; // L: 137

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 138
				if (super.fileCounts[var1] > 0) { // L: 139
					ArchiveDisk var2 = this.archiveDisk; // L: 140
					ArchiveDiskAction var4 = new ArchiveDiskAction(); // L: 143
					var4.type = 1; // L: 144
					var4.key = (long)var1; // L: 145
					var4.archiveDisk = var2; // L: 146
					var4.archive = this; // L: 147
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 148
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4); // L: 149
					} // L: 150

					class306.method5595(); // L: 151
					this.field4013 = var1; // L: 153
				}
			}

			if (this.field4013 == -1) { // L: 156
				this.field4009 = true;
			}

		}
	} // L: 135 157

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-41"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 160
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : class6.method45(this.index, var1); // L: 161 162
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "9905"
	)
	public boolean method5633(int var1) {
		return this.validGroups[var1]; // L: 166
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1729381802"
	)
	public boolean method5634(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 170
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-62"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 174
		int var2 = 0; // L: 175

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 176
			if (super.fileCounts[var3] > 0) { // L: 177
				var1 += 100; // L: 178
				var2 += this.groupLoadPercent(var3); // L: 179
			}
		}

		if (var1 == 0) { // L: 182
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 183
			return var3; // L: 184
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "489788300"
	)
	static int method5623(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3789
			class12.Interpreter_intStackSize -= 2; // L: 3790
			var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3791
			int var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 3792
			if (!Client.isCameraLocked) { // L: 3793
				Client.camAngleX = var3; // L: 3794
				Client.camAngleY = var4; // L: 3795
			}

			return 1; // L: 3797
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3799
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3800
			return 1; // L: 3801
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3803
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3804
			return 1; // L: 3805
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3807
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3808
			if (var3 < 0) { // L: 3809
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3810
			return 1; // L: 3811
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3813
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3814
			return 1; // L: 3815
		} else {
			return 2; // L: 3817
		}
	}
}
