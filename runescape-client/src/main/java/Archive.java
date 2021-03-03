import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ag")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 985029217
	)
	@Export("index")
	int index;
	@ObfuscatedName("j")
	volatile boolean field3192;
	@ObfuscatedName("ay")
	boolean field3196;
	@ObfuscatedName("am")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1841826013
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 650586757
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 292662723
	)
	int field3200;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Llu;Llu;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field3192 = false; // L: 14
		this.field3196 = false; // L: 15
		this.field3200 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3196 = var6; // L: 27
		int var8 = this.index; // L: 29
		if (SoundSystem.NetCache_reference != null) { // L: 31
			SoundSystem.NetCache_reference.offset = var8 * 8 + 5; // L: 32
			int var9 = SoundSystem.NetCache_reference.readInt(); // L: 33
			int var10 = SoundSystem.NetCache_reference.readInt(); // L: 34
			this.loadIndex(var9, var10); // L: 35
		} else {
			WorldMapSectionType.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 38
			NetCache.NetCache_archives[var8] = this; // L: 39
		}

	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "31242"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		AttackOption.method2202(this.index, var1); // L: 66
	} // L: 67

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-693356446"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 256
			return 100;
		} else if (this.validGroups[var1]) { // L: 257
			return 100;
		} else {
			int var3 = this.index; // L: 259
			long var4 = (long)((var3 << 16) + var1); // L: 261
			int var2;
			if (SecureRandomCallable.NetCache_currentResponse != null && var4 == SecureRandomCallable.NetCache_currentResponse.key) { // L: 262
				var2 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - SecureRandomCallable.NetCache_currentResponse.padding) + 1; // L: 266
			} else {
				var2 = 0; // L: 263
			}

			return var2; // L: 268
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1209383303"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 70
			ArchiveDisk var2 = this.archiveDisk; // L: 71
			byte[] var4 = null; // L: 74
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 75
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 76
					if ((long)var1 == var6.key && var2 == var6.archiveDisk && var6.type == 0) { // L: 77
						var4 = var6.data; // L: 78
						break; // L: 79
					}
				}
			}

			if (var4 != null) { // L: 83
				this.load(var2, var1, var4, true); // L: 84
			} else {
				byte[] var5 = var2.read(var1); // L: 87
				this.load(var2, var1, var5, true); // L: 88
			}
		} else {
			WorldMapSectionType.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 91
		}

	} // L: 92

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1775407691"
	)
	public boolean method4461() {
		return this.field3192; // L: 44
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "6696"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3192) { // L: 48
			return 100;
		} else if (super.groups != null) { // L: 49
			return 99;
		} else {
			int var2 = this.index; // L: 51
			long var3 = (long)(var2 + 16711680); // L: 53
			int var1;
			if (SecureRandomCallable.NetCache_currentResponse != null && var3 == SecureRandomCallable.NetCache_currentResponse.key) { // L: 54
				var1 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - SecureRandomCallable.NetCache_currentResponse.padding) + 1; // L: 58
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

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 95
		this.indexVersion = var2; // L: 96
		if (this.masterDisk != null) { // L: 97
			int var3 = this.index; // L: 98
			ArchiveDisk var4 = this.masterDisk; // L: 99
			byte[] var6 = null; // L: 102
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 103
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 104
					if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) { // L: 105
						var6 = var8.data; // L: 106
						break; // L: 107
					}
				}
			}

			if (var6 != null) { // L: 111
				this.load(var4, var3, var6, true); // L: 112
			} else {
				byte[] var7 = var4.read(var3); // L: 115
				this.load(var4, var3, var7, true); // L: 116
			}
		} else {
			WorldMapSectionType.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 119
		}

	} // L: 120

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "1626411173"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 123
			if (this.field3192) { // L: 124
				throw new RuntimeException(); // L: 125
			}

			if (this.masterDisk != null) { // L: 127
				int var5 = this.index; // L: 128
				ArchiveDisk var6 = this.masterDisk; // L: 129
				ArchiveDiskAction var7 = new ArchiveDiskAction(); // L: 131
				var7.type = 0; // L: 132
				var7.key = (long)var5; // L: 133
				var7.data = var2; // L: 134
				var7.archiveDisk = var6; // L: 135
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 136
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7); // L: 137
				} // L: 138

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 140
					if (ArchiveDiskActionHandler.field3187 == 0) { // L: 141
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 142
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 143
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 144
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 145
					}

					ArchiveDiskActionHandler.field3187 = 600; // L: 147
				}
			}

			this.decodeIndex(var2); // L: 152
			this.loadAllLocal(); // L: 153
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 156
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 157
			if (this.archiveDisk != null) { // L: 158
				ArchiveDisk var13 = this.archiveDisk; // L: 159
				ArchiveDiskAction var18 = new ArchiveDiskAction(); // L: 161
				var18.type = 0; // L: 162
				var18.key = (long)var1; // L: 163
				var18.data = var2; // L: 164
				var18.archiveDisk = var13; // L: 165
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 166
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var18); // L: 167
				} // L: 168

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 170
					if (ArchiveDiskActionHandler.field3187 == 0) { // L: 171
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 172
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 173
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 174
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 175
					}

					ArchiveDiskActionHandler.field3187 = 600; // L: 177
				}

				this.validGroups[var1] = true; // L: 181
			}

			if (var4) { // L: 183
				super.groups[var1] = class92.method2195(var2, false);
			}
		}

	} // L: 185

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Llu;I[BZI)V",
		garbageValue = "-2146867560"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 188
			if (this.field3192) { // L: 189
				throw new RuntimeException(); // L: 190
			}

			if (var3 == null) { // L: 192
				WorldMapSectionType.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 193
				return; // L: 194
			}

			Archive_crc.reset(); // L: 196
			Archive_crc.update(var3, 0, var3.length); // L: 197
			var5 = (int)Archive_crc.getValue(); // L: 198
			if (var5 != this.indexCrc) { // L: 199
				WorldMapSectionType.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 200
				return; // L: 201
			}

			Buffer var9 = new Buffer(WorldMapDecorationType.decompressBytes(var3)); // L: 203
			int var7 = var9.readUnsignedByte(); // L: 204
			if (var7 != 5 && var7 != 6) { // L: 205
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 206
			if (var7 >= 6) { // L: 207
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 208
				WorldMapSectionType.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 209
				return; // L: 210
			}

			this.decodeIndex(var3); // L: 212
			this.loadAllLocal(); // L: 213
		} else {
			if (!var4 && var2 == this.field3200) { // L: 216
				this.field3192 = true; // L: 217
			}

			if (var3 == null || var3.length <= 2) { // L: 219
				this.validGroups[var2] = false; // L: 220
				if (this.field3196 || var4) { // L: 221
					WorldMapSectionType.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 222
			}

			Archive_crc.reset(); // L: 224
			Archive_crc.update(var3, 0, var3.length - 2); // L: 225
			var5 = (int)Archive_crc.getValue(); // L: 226
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 227
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 228
				this.validGroups[var2] = false; // L: 229
				if (this.field3196 || var4) { // L: 230
					WorldMapSectionType.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 231
			}

			this.validGroups[var2] = true; // L: 233
			if (var4) { // L: 234
				super.groups[var2] = class92.method2195(var3, false);
			}
		}

	} // L: 236

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1754503913"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 239

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 240
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 241
			this.field3192 = true; // L: 242
		} else {
			this.field3200 = -1; // L: 245

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 246
				if (super.fileCounts[var1] > 0) { // L: 247
					Tiles.method1218(var1, this.archiveDisk, this); // L: 248
					this.field3200 = var1; // L: 249
				}
			}

			if (this.field3200 == -1) { // L: 252
				this.field3192 = true;
			}

		}
	} // L: 243 253

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-321850782"
	)
	public boolean method4470(int var1) {
		return this.validGroups[var1]; // L: 272
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "106266787"
	)
	public boolean method4471(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 276
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2024354781"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 280
		int var2 = 0; // L: 281

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 282
			if (super.fileCounts[var3] > 0) { // L: 283
				var1 += 100; // L: 284
				var2 += this.groupLoadPercent(var3); // L: 285
			}
		}

		if (var1 == 0) { // L: 288
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 289
			return var3; // L: 290
		}
	}
}
