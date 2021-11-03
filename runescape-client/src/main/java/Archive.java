import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("j")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1928964095
	)
	@Export("index")
	int index;
	@ObfuscatedName("g")
	volatile boolean field3673;
	@ObfuscatedName("e")
	boolean field3674;
	@ObfuscatedName("p")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1953931107
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 619553041
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1459687887
	)
	int field3679;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Lmr;Lmr;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field3673 = false; // L: 14
		this.field3674 = false; // L: 15
		this.field3679 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3674 = var6; // L: 27
		int var8 = this.index; // L: 29
		if (class139.NetCache_reference != null) { // L: 31
			class139.NetCache_reference.offset = var8 * 8 + 5; // L: 32
			int var9 = class139.NetCache_reference.readInt(); // L: 33
			int var10 = class139.NetCache_reference.readInt(); // L: 34
			this.loadIndex(var9, var10); // L: 35
		} else {
			AbstractByteArrayCopier.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 38
			NetCache.NetCache_archives[var8] = this; // L: 39
		}

	} // L: 41

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-625670103"
	)
	public boolean method5260() {
		return this.field3673; // L: 44
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1260592296"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3673) { // L: 48
			return 100;
		} else if (super.groups != null) { // L: 49
			return 99;
		} else {
			int var1 = HealthBarUpdate.method2185(255, this.index); // L: 50
			if (var1 >= 100) { // L: 51
				var1 = 99;
			}

			return var1; // L: 52
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "297974277"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		AttackOption.method2297(this.index, var1); // L: 56
	} // L: 57

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "23"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 60
			class318.method5887(var1, this.archiveDisk, this);
		} else {
			AbstractByteArrayCopier.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 61
		}

	} // L: 62

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-60"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 65
		this.indexVersion = var2; // L: 66
		if (this.masterDisk != null) { // L: 67
			class318.method5887(this.index, this.masterDisk, this);
		} else {
			AbstractByteArrayCopier.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 68
		}

	} // L: 69

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-1126308164"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 72
			if (this.field3673) { // L: 73
				throw new RuntimeException(); // L: 74
			}

			if (this.masterDisk != null) { // L: 76
				int var5 = this.index; // L: 77
				ArchiveDisk var6 = this.masterDisk; // L: 78
				ArchiveDiskAction var7 = new ArchiveDiskAction(); // L: 80
				var7.type = 0; // L: 81
				var7.key = (long)var5; // L: 82
				var7.data = var2; // L: 83
				var7.archiveDisk = var6; // L: 84
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 85
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7); // L: 86
				} // L: 87

				Login.method1952(); // L: 88
			}

			this.decodeIndex(var2); // L: 91
			this.loadAllLocal(); // L: 92
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 95
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 96
			if (this.archiveDisk != null) { // L: 97
				ArchiveDisk var11 = this.archiveDisk; // L: 98
				ArchiveDiskAction var16 = new ArchiveDiskAction(); // L: 100
				var16.type = 0; // L: 101
				var16.key = (long)var1; // L: 102
				var16.data = var2; // L: 103
				var16.archiveDisk = var11; // L: 104
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 105
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var16); // L: 106
				} // L: 107

				Login.method1952(); // L: 108
				this.validGroups[var1] = true; // L: 110
			}

			if (var4) { // L: 112
				Object[] var15 = super.groups; // L: 113
				Object var17;
				if (var2 == null) { // L: 117
					var17 = null; // L: 118
				} else if (var2.length > 136) { // L: 121
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 123
					var8.set(var2); // L: 124
					var17 = var8; // L: 125
				} else {
					var17 = var2; // L: 130
				}

				var15[var1] = var17; // L: 132
			}
		}

	} // L: 135

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lmr;I[BZI)V",
		garbageValue = "702092430"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 138
			if (this.field3673) { // L: 139
				throw new RuntimeException(); // L: 140
			}

			if (var3 == null) { // L: 142
				AbstractByteArrayCopier.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 143
				return; // L: 144
			}

			Archive_crc.reset(); // L: 146
			Archive_crc.update(var3, 0, var3.length); // L: 147
			var5 = (int)Archive_crc.getValue(); // L: 148
			if (var5 != this.indexCrc) { // L: 149
				AbstractByteArrayCopier.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 150
				return; // L: 151
			}

			Buffer var11 = new Buffer(ByteArrayPool.decompressBytes(var3)); // L: 153
			int var12 = var11.readUnsignedByte(); // L: 154
			if (var12 != 5 && var12 != 6) { // L: 155
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 156
			if (var12 >= 6) { // L: 157
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 158
				AbstractByteArrayCopier.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 159
				return; // L: 160
			}

			this.decodeIndex(var3); // L: 162
			this.loadAllLocal(); // L: 163
		} else {
			if (!var4 && var2 == this.field3679) { // L: 166
				this.field3673 = true; // L: 167
			}

			if (var3 == null || var3.length <= 2) { // L: 169
				this.validGroups[var2] = false; // L: 170
				if (this.field3674 || var4) { // L: 171
					AbstractByteArrayCopier.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 172
			}

			Archive_crc.reset(); // L: 174
			Archive_crc.update(var3, 0, var3.length - 2); // L: 175
			var5 = (int)Archive_crc.getValue(); // L: 176
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 177
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 178
				this.validGroups[var2] = false; // L: 179
				if (this.field3674 || var4) {
					AbstractByteArrayCopier.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4); // L: 180
				}

				return; // L: 181
			}

			this.validGroups[var2] = true; // L: 183
			if (var4) { // L: 184
				Object[] var7 = super.groups; // L: 185
				Object var9;
				if (var3 == null) { // L: 189
					var9 = null; // L: 190
				} else if (var3.length > 136) { // L: 193
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 195
					var10.set(var3); // L: 196
					var9 = var10; // L: 197
				} else {
					var9 = var3; // L: 202
				}

				var7[var2] = var9; // L: 204
			}
		}

	} // L: 207

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1618182910"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 210

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 211
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 212
			this.field3673 = true; // L: 213
		} else {
			this.field3679 = -1; // L: 216

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 217
				if (super.fileCounts[var1] > 0) { // L: 218
					ClanSettings.method2653(var1, this.archiveDisk, this); // L: 219
					this.field3679 = var1; // L: 220
				}
			}

			if (this.field3679 == -1) { // L: 223
				this.field3673 = true;
			}

		}
	} // L: 214 224

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "14"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 227
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : HealthBarUpdate.method2185(this.index, var1); // L: 228 229
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "836290734"
	)
	public boolean method5269(int var1) {
		return this.validGroups[var1]; // L: 233
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-9"
	)
	public boolean method5270(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 237
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1624563419"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 241
		int var2 = 0; // L: 242

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 243
			if (super.fileCounts[var3] > 0) { // L: 244
				var1 += 100; // L: 245
				var2 += this.groupLoadPercent(var3); // L: 246
			}
		}

		if (var1 == 0) { // L: 249
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 250
			return var3; // L: 251
		}
	}
}
