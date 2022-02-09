import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("v")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1360582527
	)
	@Export("index")
	int index;
	@ObfuscatedName("o")
	volatile boolean field3873;
	@ObfuscatedName("i")
	boolean field3879;
	@ObfuscatedName("w")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1972454573
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1549892383
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1506122643
	)
	int field3884;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Lnb;Lnb;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field3873 = false; // L: 14
		this.field3879 = false; // L: 15
		this.field3884 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3879 = var6; // L: 27
		int var8 = this.index; // L: 29
		if (class346.NetCache_reference != null) { // L: 31
			class346.NetCache_reference.offset = var8 * 8 + 5; // L: 32
			int var9 = class346.NetCache_reference.readInt(); // L: 33
			int var10 = class346.NetCache_reference.readInt(); // L: 34
			this.loadIndex(var9, var10); // L: 35
		} else {
			WorldMapSection1.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 38
			NetCache.NetCache_archives[var8] = this; // L: 39
		}

	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "828442357"
	)
	public boolean method5521() {
		return this.field3873; // L: 44
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "957301933"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3873) { // L: 48
			return 100;
		} else if (super.groups != null) { // L: 49
			return 99;
		} else {
			int var2 = this.index; // L: 51
			long var3 = (long)(var2 + 16711680); // L: 53
			int var1;
			if (class19.NetCache_currentResponse != null && class19.NetCache_currentResponse.key == var3) { // L: 54
				var1 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - class19.NetCache_currentResponse.padding) + 1; // L: 58
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1851114887"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-45"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 76
			class122.method2712(var1, this.archiveDisk, this);
		} else {
			WorldMapSection1.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 77
		}

	} // L: 78

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-732158282"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 81
		this.indexVersion = var2; // L: 82
		if (this.masterDisk != null) { // L: 83
			class122.method2712(this.index, this.masterDisk, this);
		} else {
			WorldMapSection1.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 84
		}

	} // L: 85

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-843194902"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 88
			if (this.field3873) { // L: 89
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
					if (ArchiveDiskActionHandler.field3869 == 0) { // L: 106
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 107
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 108
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 109
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 110
					}

					ArchiveDiskActionHandler.field3869 = 600; // L: 112
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
					if (ArchiveDiskActionHandler.field3869 == 0) { // L: 136
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 137
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 138
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 139
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 140
					}

					ArchiveDiskActionHandler.field3869 = 600; // L: 142
				}

				this.validGroups[var1] = true; // L: 146
			}

			if (var4) { // L: 148
				Object[] var21 = super.groups; // L: 149
				Object var20;
				if (var2 == null) { // L: 153
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I[BZI)V",
		garbageValue = "-844092695"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 174
			if (this.field3873) { // L: 175
				throw new RuntimeException(); // L: 176
			}

			if (var3 == null) { // L: 178
				WorldMapSection1.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 179
				return; // L: 180
			}

			Archive_crc.reset(); // L: 182
			Archive_crc.update(var3, 0, var3.length); // L: 183
			var5 = (int)Archive_crc.getValue(); // L: 184
			if (var5 != this.indexCrc) { // L: 185
				WorldMapSection1.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 186
				return; // L: 187
			}

			Buffer var11 = new Buffer(ArchiveLoader.decompressBytes(var3)); // L: 189
			int var12 = var11.readUnsignedByte(); // L: 190
			if (var12 != 5 && var12 != 6) { // L: 191
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 192
			if (var12 >= 6) { // L: 193
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 194
				WorldMapSection1.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 195
				return; // L: 196
			}

			this.decodeIndex(var3); // L: 198
			this.loadAllLocal(); // L: 199
		} else {
			if (!var4 && var2 == this.field3884) { // L: 202
				this.field3873 = true; // L: 203
			}

			if (var3 == null || var3.length <= 2) { // L: 205
				this.validGroups[var2] = false; // L: 206
				if (this.field3879 || var4) { // L: 207
					WorldMapSection1.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 208
			}

			Archive_crc.reset(); // L: 210
			Archive_crc.update(var3, 0, var3.length - 2); // L: 211
			var5 = (int)Archive_crc.getValue(); // L: 212
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 213
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 214
				this.validGroups[var2] = false; // L: 215
				if (this.field3879 || var4) { // L: 216
					WorldMapSection1.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1939525425"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 246

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 247
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 248
			this.field3873 = true; // L: 249
		} else {
			this.field3884 = -1; // L: 252

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 253
				if (super.fileCounts[var1] > 0) { // L: 254
					UrlRequest.method2422(var1, this.archiveDisk, this); // L: 255
					this.field3884 = var1; // L: 256
				}
			}

			if (this.field3884 == -1) { // L: 259
				this.field3873 = true;
			}

		}
	} // L: 250 260

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-105"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 263
			return 100;
		} else if (this.validGroups[var1]) { // L: 264
			return 100;
		} else {
			int var3 = this.index; // L: 266
			long var4 = (long)((var3 << 16) + var1); // L: 268
			int var2;
			if (class19.NetCache_currentResponse != null && class19.NetCache_currentResponse.key == var4) { // L: 269
				var2 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - class19.NetCache_currentResponse.padding) + 1; // L: 273
			} else {
				var2 = 0; // L: 270
			}

			return var2; // L: 275
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-721473199"
	)
	public boolean method5557(int var1) {
		return this.validGroups[var1]; // L: 279
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1909333797"
	)
	public boolean method5530(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 283
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "59"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 287
		int var2 = 0; // L: 288

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 289
			if (super.fileCounts[var3] > 0) { // L: 290
				var1 += 100; // L: 291
				var2 += this.groupLoadPercent(var3); // L: 292
			}
		}

		if (var1 == 0) { // L: 295
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 296
			return var3; // L: 297
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "27"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = ""; // L: 1187
		Login.Login_response2 = "Enter your username/email & password."; // L: 1188
		Login.Login_response3 = ""; // L: 1189
		Player.method2159(2); // L: 1190
		if (var0) {
			Login.Login_password = ""; // L: 1191
		}

		DynamicObject.method1998(); // L: 1192
		WorldMapLabelSize.method4317(); // L: 1193
	} // L: 1194

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-109"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 10711
	} // L: 10712
}
