import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("b")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 549068495
	)
	@Export("index")
	int index;
	@ObfuscatedName("z")
	volatile boolean field3586;
	@ObfuscatedName("t")
	boolean field3583;
	@ObfuscatedName("v")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -780107283
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 519027849
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -228949089
	)
	int field3588;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Llw;Llw;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field3586 = false;
		this.field3583 = false;
		this.field3588 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3583 = var6; // L: 27
		int var8 = this.index; // L: 29
		if (SecureRandomCallable.NetCache_reference != null) { // L: 31
			SecureRandomCallable.NetCache_reference.offset = var8 * 8 + 5; // L: 32
			int var9 = SecureRandomCallable.NetCache_reference.readInt(); // L: 33
			int var10 = SecureRandomCallable.NetCache_reference.readInt(); // L: 34
			this.loadIndex(var9, var10); // L: 35
		} else {
			class25.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 38
			NetCache.NetCache_archives[var8] = this; // L: 39
		}

	} // L: 41

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1381527767"
	)
	public boolean method4822() {
		return this.field3586; // L: 44
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "475592211"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3586) { // L: 48
			return 100;
		} else if (super.groups != null) { // L: 49
			return 99;
		} else {
			int var2 = this.index; // L: 51
			long var3 = (long)(var2 + 16711680); // L: 53
			int var1;
			if (class7.NetCache_currentResponse != null && var3 == class7.NetCache_currentResponse.key) { // L: 54
				var1 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - class7.NetCache_currentResponse.padding) + 1; // L: 58
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1103942204"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1184960922"
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
			class25.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 97
		}

	} // L: 98

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-29"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
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
			class25.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 125
		}

	} // L: 126

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I[BZZS)V",
		garbageValue = "-32096"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 129
			if (this.field3586) { // L: 130
				throw new RuntimeException(); // L: 131
			}

			if (this.masterDisk != null) { // L: 133
				int var5 = this.index; // L: 134
				ArchiveDisk var6 = this.masterDisk; // L: 135
				ArchiveDiskAction var7 = new ArchiveDiskAction(); // L: 137
				var7.type = 0; // L: 138
				var7.key = (long)var5; // L: 139
				var7.data = var2; // L: 140
				var7.archiveDisk = var6; // L: 141
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 142
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7); // L: 143
				} // L: 144

				class43.method486(); // L: 145
			}

			this.decodeIndex(var2); // L: 148
			this.loadAllLocal(); // L: 149
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 152
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 153
			if (this.archiveDisk != null) { // L: 154
				ArchiveDisk var11 = this.archiveDisk; // L: 155
				ArchiveDiskAction var14 = new ArchiveDiskAction(); // L: 157
				var14.type = 0; // L: 158
				var14.key = (long)var1; // L: 159
				var14.data = var2; // L: 160
				var14.archiveDisk = var11; // L: 161
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 162
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var14); // L: 163
				} // L: 164

				class43.method486(); // L: 165
				this.validGroups[var1] = true; // L: 167
			}

			if (var4) {
				super.groups[var1] = class34.method388(var2, false); // L: 169
			}
		}

	} // L: 171

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Llw;I[BZI)V",
		garbageValue = "-1720270185"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 174
			if (this.field3586) { // L: 175
				throw new RuntimeException(); // L: 176
			}

			if (var3 == null) { // L: 178
				class25.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 179
				return; // L: 180
			}

			Archive_crc.reset(); // L: 182
			Archive_crc.update(var3, 0, var3.length); // L: 183
			var5 = (int)Archive_crc.getValue(); // L: 184
			if (var5 != this.indexCrc) { // L: 185
				class25.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 186
				return; // L: 187
			}

			Buffer var9 = new Buffer(ObjectSound.decompressBytes(var3)); // L: 189
			int var7 = var9.readUnsignedByte(); // L: 190
			if (var7 != 5 && var7 != 6) { // L: 191
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 192
			if (var7 >= 6) { // L: 193
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 194
				class25.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 195
				return; // L: 196
			}

			this.decodeIndex(var3); // L: 198
			this.loadAllLocal(); // L: 199
		} else {
			if (!var4 && var2 == this.field3588) { // L: 202
				this.field3586 = true; // L: 203
			}

			if (var3 == null || var3.length <= 2) { // L: 205
				this.validGroups[var2] = false; // L: 206
				if (this.field3583 || var4) { // L: 207
					class25.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 208
			}

			Archive_crc.reset(); // L: 210
			Archive_crc.update(var3, 0, var3.length - 2); // L: 211
			var5 = (int)Archive_crc.getValue(); // L: 212
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 213
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 214
				this.validGroups[var2] = false; // L: 215
				if (this.field3583 || var4) { // L: 216
					class25.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 217
			}

			this.validGroups[var2] = true; // L: 219
			if (var4) { // L: 220
				super.groups[var2] = class34.method388(var3, false);
			}
		}

	} // L: 222

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-117239087"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 225

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 226
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 227
			this.field3586 = true; // L: 228
		} else {
			this.field3588 = -1; // L: 231

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 232
				if (super.fileCounts[var1] > 0) { // L: 233
					GrandExchangeOfferNameComparator.method4987(var1, this.archiveDisk, this); // L: 234
					this.field3588 = var1; // L: 235
				}
			}

			if (this.field3588 == -1) { // L: 238
				this.field3586 = true;
			}

		}
	} // L: 229 239

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1290183138"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 242
			return 100;
		} else if (this.validGroups[var1]) { // L: 243
			return 100;
		} else {
			int var3 = this.index; // L: 245
			long var4 = (long)((var3 << 16) + var1); // L: 247
			int var2;
			if (class7.NetCache_currentResponse != null && var4 == class7.NetCache_currentResponse.key) { // L: 248
				var2 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - class7.NetCache_currentResponse.padding) + 1; // L: 252
			} else {
				var2 = 0; // L: 249
			}

			return var2; // L: 254
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1085562127"
	)
	public boolean method4831(int var1) {
		return this.validGroups[var1]; // L: 258
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "123"
	)
	public boolean method4842(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 262
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-55"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 266
		int var2 = 0; // L: 267

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 268
			if (super.fileCounts[var3] > 0) { // L: 269
				var1 += 100; // L: 270
				var2 += this.groupLoadPercent(var3); // L: 271
			}
		}

		if (var1 == 0) { // L: 274
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 275
			return var3; // L: 276
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)J",
		garbageValue = "6233"
	)
	@Export("currentTimeMillis")
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class379.field4152) { // L: 15
			class379.field4153 += class379.field4152 - var0; // L: 16
		}

		class379.field4152 = var0; // L: 18
		return var0 + class379.field4153; // L: 19
	}
}
