import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("h")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 935537311
	)
	@Export("index")
	int index;
	@ObfuscatedName("o")
	volatile boolean field3562;
	@ObfuscatedName("m")
	boolean field3566;
	@ObfuscatedName("r")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 449580407
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1844159497
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1224107027
	)
	int field3572;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Lla;Lla;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field3562 = false; // L: 14
		this.field3566 = false; // L: 15
		this.field3572 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3566 = var6; // L: 27
		int var8 = this.index; // L: 29
		if (UserComparator6.NetCache_reference != null) { // L: 31
			UserComparator6.NetCache_reference.offset = var8 * 8 + 5; // L: 32
			int var9 = UserComparator6.NetCache_reference.readInt();
			int var10 = UserComparator6.NetCache_reference.readInt();
			this.loadIndex(var9, var10);
		} else {
			MenuAction.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var8] = this;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1162495531"
	)
	public boolean method5044() {
		return this.field3562;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "976210931"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3562) { // L: 48
			return 100;
		} else if (super.groups != null) { // L: 49
			return 99;
		} else {
			int var2 = this.index; // L: 51
			long var3 = (long)(var2 + 16711680); // L: 53
			int var1;
			if (class34.NetCache_currentResponse != null && var3 == class34.NetCache_currentResponse.key) { // L: 54
				var1 = class254.NetCache_responseArchiveBuffer.offset * 99 / (class254.NetCache_responseArchiveBuffer.array.length - class34.NetCache_currentResponse.padding) + 1; // L: 58
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "341986030"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1768582746"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 76
			PendingSpawn.method2261(var1, this.archiveDisk, this);
		} else {
			MenuAction.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 77
		}

	} // L: 78

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1807724358"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 81
		this.indexVersion = var2; // L: 82
		if (this.masterDisk != null) { // L: 83
			PendingSpawn.method2261(this.index, this.masterDisk, this);
		} else {
			MenuAction.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 84
		}

	} // L: 85

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "1456040345"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 88
			if (this.field3562) { // L: 89
				throw new RuntimeException(); // L: 90
			}

			if (this.masterDisk != null) { // L: 92
				int var5 = this.index; // L: 93
				ArchiveDisk var6 = this.masterDisk; // L: 94
				ArchiveDiskAction var7 = new ArchiveDiskAction(); // L: 96
				var7.type = 0; // L: 97
				var7.key = (long)var5; // L: 98
				var7.data = var2; // L: 99
				var7.archiveDisk = var6; // L: 100
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 101
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7); // L: 102
				} // L: 103

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 105
					if (ArchiveDiskActionHandler.field3557 == 0) { // L: 106
						class305.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 107
						class305.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 108
						class305.ArchiveDiskActionHandler_thread.start(); // L: 109
						class305.ArchiveDiskActionHandler_thread.setPriority(5); // L: 110
					}

					ArchiveDiskActionHandler.field3557 = 600; // L: 112
				}
			}

			this.decodeIndex(var2); // L: 117
			this.loadAllLocal(); // L: 118
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 121
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 122
			if (this.archiveDisk != null) { // L: 123
				ArchiveDisk var13 = this.archiveDisk; // L: 124
				ArchiveDiskAction var19 = new ArchiveDiskAction(); // L: 126
				var19.type = 0; // L: 127
				var19.key = (long)var1; // L: 128
				var19.data = var2; // L: 129
				var19.archiveDisk = var13; // L: 130
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 131
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var19); // L: 132
				} // L: 133

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 135
					if (ArchiveDiskActionHandler.field3557 == 0) { // L: 136
						class305.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 137
						class305.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 138
						class305.ArchiveDiskActionHandler_thread.start(); // L: 139
						class305.ArchiveDiskActionHandler_thread.setPriority(5); // L: 140
					}

					ArchiveDiskActionHandler.field3557 = 600; // L: 142
				}

				this.validGroups[var1] = true; // L: 146
			}

			if (var4) { // L: 148
				Object[] var21 = super.groups; // L: 149
				Object var20;
				if (var2 == null) {
					var20 = null; // L: 154
				} else if (var2.length > 136) { // L: 157
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 159
					var8.set(var2); // L: 160
					var20 = var8; // L: 161
				} else {
					var20 = var2; // L: 166
				}

				var21[var1] = var20; // L: 168
			}
		}

	} // L: 171

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lla;I[BZI)V",
		garbageValue = "2098263983"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 174
			if (this.field3562) {
				throw new RuntimeException(); // L: 176
			}

			if (var3 == null) { // L: 178
				MenuAction.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 179
				return; // L: 180
			}

			Archive_crc.reset(); // L: 182
			Archive_crc.update(var3, 0, var3.length); // L: 183
			var5 = (int)Archive_crc.getValue(); // L: 184
			if (var5 != this.indexCrc) { // L: 185
				MenuAction.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 186
				return; // L: 187
			}

			Buffer var11 = new Buffer(class106.decompressBytes(var3)); // L: 189
			int var12 = var11.readUnsignedByte(); // L: 190
			if (var12 != 5 && var12 != 6) { // L: 191
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 192
			if (var12 >= 6) { // L: 193
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 194
				MenuAction.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 195
				return; // L: 196
			}

			this.decodeIndex(var3); // L: 198
			this.loadAllLocal(); // L: 199
		} else {
			if (!var4 && var2 == this.field3572) { // L: 202
				this.field3562 = true; // L: 203
			}

			if (var3 == null || var3.length <= 2) { // L: 205
				this.validGroups[var2] = false; // L: 206
				if (this.field3566 || var4) { // L: 207
					MenuAction.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 208
			}

			Archive_crc.reset(); // L: 210
			Archive_crc.update(var3, 0, var3.length - 2); // L: 211
			var5 = (int)Archive_crc.getValue(); // L: 212
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 213
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 214
				this.validGroups[var2] = false; // L: 215
				if (this.field3566 || var4) { // L: 216
					MenuAction.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 217
			}

			this.validGroups[var2] = true; // L: 219
			if (var4) { // L: 220
				Object[] var7 = super.groups; // L: 221
				Object var9;
				if (var3 == null) { // L: 225
					var9 = null; // L: 226
				} else if (var3.length > 136) { // L: 229
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 231
					var10.set(var3); // L: 232
					var9 = var10; // L: 233
				} else {
					var9 = var3; // L: 238
				}

				var7[var2] = var9; // L: 240
			}
		}

	} // L: 243

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 246

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 247
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 248
			this.field3562 = true; // L: 249
		} else {
			this.field3572 = -1; // L: 252

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 253
				if (super.fileCounts[var1] > 0) { // L: 254
					MouseHandler.method727(var1, this.archiveDisk, this); // L: 255
					this.field3572 = var1; // L: 256
				}
			}

			if (this.field3572 == -1) { // L: 259
				this.field3562 = true;
			}

		}
	} // L: 250 260

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1362561714"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 263
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : class248.method4915(this.index, var1); // L: 264 265
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1991091922"
	)
	public boolean method5030(int var1) {
		return this.validGroups[var1]; // L: 269
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	public boolean method5031(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 273
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "21"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 277
		int var2 = 0; // L: 278

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 279
			if (super.fileCounts[var3] > 0) { // L: 280
				var1 += 100; // L: 281
				var2 += this.groupLoadPercent(var3); // L: 282
			}
		}

		if (var1 == 0) { // L: 285
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 286
			return var3; // L: 287
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lek;",
		garbageValue = "681923343"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lof;",
		garbageValue = "447770531"
	)
	static IndexedSprite method5021(boolean var0, boolean var1) {
		return var0 ? (var1 ? Login.field1005 : WorldMapCacheName.options_buttons_2Sprite) : (var1 ? NetFileRequest.field3577 : Login.options_buttons_0Sprite); // L: 175
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-64"
	)
	public static void method5060(int var0, int var1) {
		VarbitComposition var2 = WorldMapSection2.method3329(var0); // L: 33
		int var3 = var2.baseVar; // L: 34
		int var4 = var2.startBit; // L: 35
		int var5 = var2.endBit; // L: 36
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 37
		if (var1 < 0 || var1 > var6) { // L: 38
			var1 = 0;
		}

		var6 <<= var4; // L: 39
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 40
	} // L: 41

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "-513021878"
	)
	public static int method5061(boolean var0, boolean var1) {
		byte var2 = 0; // L: 151
		int var3 = var2 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount; // L: 152
		return var3; // L: 153
	}
}
