import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("u")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 128196261
	)
	@Export("index")
	int index;
	@ObfuscatedName("n")
	volatile boolean field3953;
	@ObfuscatedName("d")
	boolean field3950;
	@ObfuscatedName("f")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1102130091
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1387834119
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1289318369
	)
	int field3955;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Lnn;Lnn;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field3953 = false; // L: 14
		this.field3950 = false; // L: 15
		this.field3955 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3950 = var6; // L: 27
		RouteStrategy.method3873(this, this.index); // L: 28
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1312612770"
	)
	public boolean method5819() {
		return this.field3953; // L: 32
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-94"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3953) { // L: 36
			return 100;
		} else if (super.groups != null) { // L: 37
			return 99;
		} else {
			int var1 = UserComparator4.method2563(255, this.index); // L: 38
			if (var1 >= 100) { // L: 39
				var1 = 99;
			}

			return var1; // L: 40
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1837860336"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		int var2 = this.index; // L: 44
		long var3 = (long)((var2 << 16) + var1); // L: 46
		NetFileRequest var5 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var3); // L: 47
		if (var5 != null) { // L: 48
			NetCache.NetCache_pendingWritesQueue.addLast(var5); // L: 49
		}

	} // L: 51

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1164111138"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 54
			ArchiveDisk var2 = this.archiveDisk; // L: 55
			byte[] var4 = null; // L: 58
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 59
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 60
					if (var6.key == (long)var1 && var2 == var6.archiveDisk && var6.type == 0) { // L: 61
						var4 = var6.data; // L: 62
						break; // L: 63
					}
				}
			}

			if (var4 != null) { // L: 67
				this.load(var2, var1, var4, true); // L: 68
			} else {
				byte[] var5 = var2.read(var1); // L: 71
				this.load(var2, var1, var5, true); // L: 72
			}
		} else {
			TriBool.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 75
		}

	} // L: 76

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1941382512"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 79
		this.indexVersion = var2; // L: 80
		if (this.masterDisk != null) { // L: 81
			int var3 = this.index; // L: 82
			ArchiveDisk var4 = this.masterDisk; // L: 83
			byte[] var6 = null; // L: 86
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 87
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 88
					if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) { // L: 89
						var6 = var8.data; // L: 90
						break; // L: 91
					}
				}
			}

			if (var6 != null) { // L: 95
				this.load(var4, var3, var6, true); // L: 96
			} else {
				byte[] var7 = var4.read(var3); // L: 99
				this.load(var4, var3, var7, true); // L: 100
			}
		} else {
			TriBool.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 103
		}

	} // L: 104

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-1753203382"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 107
			if (this.field3953) { // L: 108
				throw new RuntimeException(); // L: 109
			}

			if (this.masterDisk != null) { // L: 111
				int var5 = this.index; // L: 112
				ArchiveDisk var6 = this.masterDisk; // L: 113
				ArchiveDiskAction var7 = new ArchiveDiskAction(); // L: 115
				var7.type = 0; // L: 116
				var7.key = (long)var5; // L: 117
				var7.data = var2; // L: 118
				var7.archiveDisk = var6; // L: 119
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 120
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7); // L: 121
				} // L: 122

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 124
					if (ArchiveDiskActionHandler.field3940 == 0) { // L: 125
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 126
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 127
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 128
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 129
					}

					ArchiveDiskActionHandler.field3940 = 600; // L: 131
				}
			}

			this.decodeIndex(var2); // L: 136
			this.loadAllLocal(); // L: 137
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 140
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 141
			if (this.archiveDisk != null) { // L: 142
				ArchiveDisk var13 = this.archiveDisk; // L: 143
				ArchiveDiskAction var18 = new ArchiveDiskAction(); // L: 145
				var18.type = 0; // L: 146
				var18.key = (long)var1; // L: 147
				var18.data = var2; // L: 148
				var18.archiveDisk = var13; // L: 149
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 150
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var18); // L: 151
				} // L: 152

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 154
					if (ArchiveDiskActionHandler.field3940 == 0) { // L: 155
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 156
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 157
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 158
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 159
					}

					ArchiveDiskActionHandler.field3940 = 600; // L: 161
				}

				this.validGroups[var1] = true; // L: 165
			}

			if (var4) { // L: 167
				super.groups[var1] = PacketWriter.method2511(var2, false);
			}
		}

	} // L: 169

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I[BZB)V",
		garbageValue = "57"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 172
			if (this.field3953) { // L: 173
				throw new RuntimeException(); // L: 174
			}

			if (var3 == null) { // L: 176
				TriBool.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 177
				return; // L: 178
			}

			Archive_crc.reset(); // L: 180
			Archive_crc.update(var3, 0, var3.length); // L: 181
			var5 = (int)Archive_crc.getValue(); // L: 182
			if (var5 != this.indexCrc) { // L: 183
				TriBool.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 184
				return; // L: 185
			}

			Buffer var11 = new Buffer(class149.decompressBytes(var3)); // L: 187
			int var12 = var11.readUnsignedByte(); // L: 188
			if (var12 != 5 && var12 != 6) { // L: 189
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 190
			if (var12 >= 6) { // L: 191
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 192
				TriBool.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 193
				return; // L: 194
			}

			this.decodeIndex(var3); // L: 196
			this.loadAllLocal(); // L: 197
		} else {
			if (!var4 && var2 == this.field3955) { // L: 200
				this.field3953 = true; // L: 201
			}

			if (var3 == null || var3.length <= 2) { // L: 203
				this.validGroups[var2] = false; // L: 204
				if (this.field3950 || var4) { // L: 205
					TriBool.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 206
			}

			Archive_crc.reset(); // L: 208
			Archive_crc.update(var3, 0, var3.length - 2); // L: 209
			var5 = (int)Archive_crc.getValue(); // L: 210
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 211
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 212
				this.validGroups[var2] = false; // L: 213
				if (this.field3950 || var4) { // L: 214
					TriBool.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 215
			}

			this.validGroups[var2] = true; // L: 217
			if (var4) { // L: 218
				Object[] var7 = super.groups; // L: 219
				Object var9;
				if (var3 == null) { // L: 223
					var9 = null; // L: 224
				} else if (var3.length > 136) { // L: 227
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 229
					var10.set(var3); // L: 230
					var9 = var10; // L: 231
				} else {
					var9 = var3; // L: 236
				}

				var7[var2] = var9; // L: 238
			}
		}

	} // L: 241

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "113"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 244

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 245
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 246
			this.field3953 = true; // L: 247
		} else {
			this.field3955 = -1; // L: 250

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 251
				if (super.fileCounts[var1] > 0) { // L: 252
					ArchiveDisk var2 = this.archiveDisk; // L: 253
					ArchiveDiskAction var4 = new ArchiveDiskAction(); // L: 256
					var4.type = 1; // L: 257
					var4.key = (long)var1; // L: 258
					var4.archiveDisk = var2; // L: 259
					var4.archive = this; // L: 260
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 261
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4); // L: 262
					} // L: 263

					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 265
						if (ArchiveDiskActionHandler.field3940 == 0) { // L: 266
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 267
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 268
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 269
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 270
						}

						ArchiveDiskActionHandler.field3940 = 600; // L: 272
					}

					this.field3955 = var1; // L: 276
				}
			}

			if (this.field3955 == -1) { // L: 279
				this.field3953 = true;
			}

		}
	} // L: 248 280

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1946405808"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 283
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : UserComparator4.method2563(this.index, var1); // L: 284 285
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1408615413"
	)
	public boolean method5828(int var1) {
		return this.validGroups[var1]; // L: 289
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1483419038"
	)
	public boolean method5829(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 293
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-410498950"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 297
		int var2 = 0; // L: 298

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 299
			if (super.fileCounts[var3] > 0) { // L: 300
				var1 += 100; // L: 301
				var2 += this.groupLoadPercent(var3); // L: 302
			}
		}

		if (var1 == 0) { // L: 305
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 306
			return var3; // L: 307
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "71"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5010
		int var4 = var1 >> 7; // L: 5011
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5012
			int var5 = var2; // L: 5013
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5014
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5015
			int var7 = var1 & 127; // L: 5016
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7; // L: 5017
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] * var6 >> 7; // L: 5018
			return var8 * (128 - var7) + var9 * var7 >> 7; // L: 5019
		} else {
			return 0;
		}
	}
}
