import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ax")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -238698165
	)
	@Export("index")
	int index;
	@ObfuscatedName("d")
	volatile boolean field3185;
	@ObfuscatedName("an")
	boolean field3192;
	@ObfuscatedName("aj")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 490839009
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1466147075
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1342642221
	)
	int field3191;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Llx;Llx;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field3185 = false; // L: 14
		this.field3192 = false; // L: 15
		this.field3191 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3192 = var6; // L: 27
		int var8 = this.index; // L: 29
		if (WorldMapLabel.NetCache_reference != null) { // L: 31
			WorldMapLabel.NetCache_reference.offset = var8 * 8 + 5; // L: 32
			int var9 = WorldMapLabel.NetCache_reference.readInt(); // L: 33
			int var10 = WorldMapLabel.NetCache_reference.readInt(); // L: 34
			this.loadIndex(var9, var10); // L: 35
		} else {
			Widget.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 38
			NetCache.NetCache_archives[var8] = this; // L: 39
		}

	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1807571765"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		int var2 = this.index; // L: 66
		long var3 = (long)((var2 << 16) + var1); // L: 68
		NetFileRequest var5 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var3); // L: 69
		if (var5 != null) { // L: 70
			NetCache.NetCache_pendingWritesQueue.addLast(var5); // L: 71
		}

	} // L: 73

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2120197275"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 277
			return 100;
		} else if (this.validGroups[var1]) { // L: 278
			return 100;
		} else {
			int var3 = this.index; // L: 280
			long var4 = (long)((var3 << 16) + var1); // L: 282
			int var2;
			if (NetCache.NetCache_currentResponse != null && NetCache.NetCache_currentResponse.key == var4) { // L: 283
				var2 = class206.NetCache_responseArchiveBuffer.offset * 99 / (class206.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding) + 1; // L: 287
			} else {
				var2 = 0; // L: 284
			}

			return var2; // L: 289
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "786262695"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 76
			ArchiveDisk var2 = this.archiveDisk; // L: 77
			byte[] var4 = null; // L: 80
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 81
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 82
					if (var6.key == (long)var1 && var2 == var6.archiveDisk && var6.type == 0) { // L: 83
						var4 = var6.data; // L: 84
						break; // L: 85
					}
				}
			}

			if (var4 != null) { // L: 89
				this.load(var2, var1, var4, true); // L: 90
			} else {
				byte[] var5 = var2.read(var1); // L: 93
				this.load(var2, var1, var5, true); // L: 94
			}
		} else {
			Widget.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 97
		}

	} // L: 98

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public boolean method4304() {
		return this.field3185; // L: 44
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "564971922"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3185) { // L: 48
			return 100;
		} else if (super.groups != null) { // L: 49
			return 99;
		} else {
			int var2 = this.index; // L: 51
			long var3 = (long)(var2 + 16711680); // L: 53
			int var1;
			if (NetCache.NetCache_currentResponse != null && NetCache.NetCache_currentResponse.key == var3) { // L: 54
				var1 = class206.NetCache_responseArchiveBuffer.offset * 99 / (class206.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding) + 1; // L: 58
			} else {
				var1 = 0; // L: 55
			}

			int var5 = var1; // L: 60
			if (var1 >= 100) { // L: 61
				var5 = 99;
			}

			return var5; // L: 62
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1317908799"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 101
		this.indexVersion = var2; // L: 102
		if (this.masterDisk != null) { // L: 103
			int var3 = this.index; // L: 104
			ArchiveDisk var4 = this.masterDisk; // L: 105
			byte[] var6 = null; // L: 108
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 109
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 110
					if ((long)var3 == var8.key && var4 == var8.archiveDisk && var8.type == 0) { // L: 111
						var6 = var8.data; // L: 112
						break; // L: 113
					}
				}
			}

			if (var6 != null) { // L: 117
				this.load(var4, var3, var6, true); // L: 118
			} else {
				byte[] var7 = var4.read(var3); // L: 121
				this.load(var4, var3, var7, true); // L: 122
			}
		} else {
			Widget.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 125
		}

	} // L: 126

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "1890692"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 129
			if (this.field3185) { // L: 130
				throw new RuntimeException(); // L: 131
			}

			if (this.masterDisk != null) { // L: 133
				KeyHandler.method872(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 134
			this.loadAllLocal(); // L: 135
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 138
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 139
			if (this.archiveDisk != null) { // L: 140
				KeyHandler.method872(var1, var2, this.archiveDisk); // L: 141
				this.validGroups[var1] = true; // L: 142
			}

			if (var4) { // L: 144
				Object[] var5 = super.groups; // L: 145
				Object var7;
				if (var2 == null) { // L: 149
					var7 = null; // L: 150
				} else if (var2.length > 136) { // L: 153
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 155
					var8.set(var2); // L: 156
					var7 = var8; // L: 157
				} else {
					var7 = var2; // L: 171
				}

				var5[var1] = var7; // L: 173
			}
		}

	} // L: 176

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Llx;I[BZI)V",
		garbageValue = "1276790127"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 179
			if (this.field3185) { // L: 180
				throw new RuntimeException(); // L: 181
			}

			if (var3 == null) { // L: 183
				Widget.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 184
				return; // L: 185
			}

			Archive_crc.reset(); // L: 187
			Archive_crc.update(var3, 0, var3.length); // L: 188
			var5 = (int)Archive_crc.getValue(); // L: 189
			if (var5 != this.indexCrc) { // L: 190
				Widget.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 191
				return; // L: 192
			}

			Buffer var11 = new Buffer(PrivateChatMode.decompressBytes(var3)); // L: 194
			int var12 = var11.readUnsignedByte(); // L: 195
			if (var12 != 5 && var12 != 6) { // L: 196
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 197
			if (var12 >= 6) { // L: 198
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 199
				Widget.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 200
				return; // L: 201
			}

			this.decodeIndex(var3); // L: 203
			this.loadAllLocal(); // L: 204
		} else {
			if (!var4 && var2 == this.field3191) { // L: 207
				this.field3185 = true; // L: 208
			}

			if (var3 == null || var3.length <= 2) { // L: 210
				this.validGroups[var2] = false; // L: 211
				if (this.field3192 || var4) { // L: 212
					Widget.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 213
			}

			Archive_crc.reset(); // L: 215
			Archive_crc.update(var3, 0, var3.length - 2); // L: 216
			var5 = (int)Archive_crc.getValue(); // L: 217
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 218
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 219
				this.validGroups[var2] = false; // L: 220
				if (this.field3192 || var4) { // L: 221
					Widget.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 222
			}

			this.validGroups[var2] = true; // L: 224
			if (var4) { // L: 225
				Object[] var7 = super.groups; // L: 226
				Object var9;
				if (var3 == null) { // L: 230
					var9 = null; // L: 231
				} else if (var3.length > 136) { // L: 234
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 236
					var10.set(var3); // L: 237
					var9 = var10; // L: 238
				} else {
					var9 = var3; // L: 252
				}

				var7[var2] = var9; // L: 254
			}
		}

	} // L: 257

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-457246550"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 260

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 261
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 262
			this.field3185 = true; // L: 263
		} else {
			this.field3191 = -1; // L: 266

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 267
				if (super.fileCounts[var1] > 0) { // L: 268
					Skills.method4147(var1, this.archiveDisk, this); // L: 269
					this.field3191 = var1; // L: 270
				}
			}

			if (this.field3191 == -1) { // L: 273
				this.field3185 = true;
			}

		}
	} // L: 264 274

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-215383381"
	)
	public boolean method4319(int var1) {
		return this.validGroups[var1]; // L: 293
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "2"
	)
	public boolean method4305(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 297
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1590832710"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 301
		int var2 = 0; // L: 302

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 303
			if (super.fileCounts[var3] > 0) { // L: 304
				var1 += 100; // L: 305
				var2 += this.groupLoadPercent(var3); // L: 306
			}
		}

		if (var1 == 0) { // L: 309
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 310
			return var3; // L: 311
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1996112671"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}
}
