import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("d")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1695957245
	)
	@Export("index")
	int index;
	@ObfuscatedName("j")
	volatile boolean field3571;
	@ObfuscatedName("r")
	boolean field3572;
	@ObfuscatedName("b")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1472783963
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2140198139
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1353605799
	)
	int field3566;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field3571 = false; // L: 14
		this.field3572 = false; // L: 15
		this.field3566 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3572 = var6; // L: 27
		class179.method3633(this, this.index); // L: 28
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "212573310"
	)
	public boolean method4869() {
		return this.field3571; // L: 32
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "53"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3571) { // L: 36
			return 100;
		} else if (super.groups != null) { // L: 37
			return 99;
		} else {
			int var1 = class125.method2502(255, this.index); // L: 38
			if (var1 >= 100) { // L: 39
				var1 = 99;
			}

			return var1; // L: 40
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "108"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		class280.method5071(this.index, var1); // L: 44
	} // L: 45

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("loadGroup")
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
			DirectByteArrayCopier.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 69
		}

	} // L: 70

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-887756709"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 73
		this.indexVersion = var2; // L: 74
		if (this.masterDisk != null) { // L: 75
			int var3 = this.index; // L: 76
			ArchiveDisk var4 = this.masterDisk; // L: 77
			byte[] var6 = null; // L: 80
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 81
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 82
					if ((long)var3 == var8.key && var4 == var8.archiveDisk && var8.type == 0) { // L: 83
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
			DirectByteArrayCopier.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 97
		}

	} // L: 98

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "525734565"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 101
			if (this.field3571) { // L: 102
				throw new RuntimeException(); // L: 103
			}

			if (this.masterDisk != null) { // L: 105
				int var5 = this.index; // L: 106
				ArchiveDisk var6 = this.masterDisk; // L: 107
				ArchiveDiskAction var7 = new ArchiveDiskAction(); // L: 109
				var7.type = 0; // L: 110
				var7.key = (long)var5; // L: 111
				var7.data = var2; // L: 112
				var7.archiveDisk = var6; // L: 113
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 114
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7); // L: 115
				} // L: 116

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 118
					if (ArchiveDiskActionHandler.field3562 == 0) { // L: 119
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 120
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 121
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 122
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 123
					}

					ArchiveDiskActionHandler.field3562 = 600; // L: 125
				}
			}

			this.decodeIndex(var2); // L: 130
			this.loadAllLocal(); // L: 131
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 134
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 135
			if (this.archiveDisk != null) { // L: 136
				ArchiveDisk var13 = this.archiveDisk; // L: 137
				ArchiveDiskAction var18 = new ArchiveDiskAction(); // L: 139
				var18.type = 0; // L: 140
				var18.key = (long)var1; // L: 141
				var18.data = var2; // L: 142
				var18.archiveDisk = var13; // L: 143
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 144
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var18); // L: 145
				} // L: 146

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 148
					if (ArchiveDiskActionHandler.field3562 == 0) { // L: 149
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 150
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 151
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 152
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 153
					}

					ArchiveDiskActionHandler.field3562 = 600; // L: 155
				}

				this.validGroups[var1] = true; // L: 159
			}

			if (var4) { // L: 161
				super.groups[var1] = GrandExchangeOfferWorldComparator.method5079(var2, false);
			}
		}

	} // L: 163

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Llh;I[BZB)V",
		garbageValue = "-59"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 166
			if (this.field3571) { // L: 167
				throw new RuntimeException(); // L: 168
			} else if (var3 == null) { // L: 170
				DirectByteArrayCopier.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 171
			} else {
				Archive_crc.reset(); // L: 174
				Archive_crc.update(var3, 0, var3.length); // L: 175
				var5 = (int)Archive_crc.getValue(); // L: 176
				if (var5 != this.indexCrc) { // L: 177
					DirectByteArrayCopier.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 178
				} else {
					Buffer var9 = new Buffer(UserComparator6.decompressBytes(var3)); // L: 181
					int var7 = var9.readUnsignedByte(); // L: 182
					if (var7 != 5 && var7 != 6) { // L: 183
						throw new RuntimeException(var7 + "," + this.index + "," + var2);
					} else {
						int var8 = 0; // L: 184
						if (var7 >= 6) { // L: 185
							var8 = var9.readInt();
						}

						if (var8 != this.indexVersion) { // L: 186
							DirectByteArrayCopier.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 187
						} else {
							this.decodeIndex(var3); // L: 190
							this.loadAllLocal(); // L: 191
						}
					}
				}
			}
		} else {
			if (!var4 && var2 == this.field3566) { // L: 194
				this.field3571 = true; // L: 195
			}

			if (var3 != null && var3.length > 2) { // L: 197
				Archive_crc.reset(); // L: 202
				Archive_crc.update(var3, 0, var3.length - 2); // L: 203
				var5 = (int)Archive_crc.getValue(); // L: 204
				int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 205
				if (var5 == super.groupCrcs[var2] && var6 == super.groupVersions[var2]) { // L: 206
					this.validGroups[var2] = true; // L: 211
					if (var4) { // L: 212
						super.groups[var2] = GrandExchangeOfferWorldComparator.method5079(var3, false);
					}

				} else {
					this.validGroups[var2] = false; // L: 207
					if (this.field3572 || var4) { // L: 208
						DirectByteArrayCopier.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
					}

				}
			} else {
				this.validGroups[var2] = false; // L: 198
				if (this.field3572 || var4) { // L: 199
					DirectByteArrayCopier.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

			}
		}
	} // L: 172 179 188 200 209 214

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2113858228"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 217

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 218
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 219
			this.field3571 = true; // L: 220
		} else {
			this.field3566 = -1; // L: 223

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 224
				if (super.fileCounts[var1] > 0) { // L: 225
					ArchiveDisk var2 = this.archiveDisk; // L: 226
					ArchiveDiskAction var4 = new ArchiveDiskAction(); // L: 229
					var4.type = 1; // L: 230
					var4.key = (long)var1; // L: 231
					var4.archiveDisk = var2; // L: 232
					var4.archive = this; // L: 233
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 234
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4); // L: 235
					} // L: 236

					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 238
						if (ArchiveDiskActionHandler.field3562 == 0) { // L: 239
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 240
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 241
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 242
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 243
						}

						ArchiveDiskActionHandler.field3562 = 600; // L: 245
					}

					this.field3566 = var1; // L: 249
				}
			}

			if (this.field3566 == -1) { // L: 252
				this.field3571 = true;
			}

		}
	} // L: 221 253

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1767586109"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 256
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : class125.method2502(this.index, var1); // L: 257 258
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "510058915"
	)
	public boolean method4884(int var1) {
		return this.validGroups[var1]; // L: 262
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1677083054"
	)
	public boolean method4887(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 266
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1371864603"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 270
		int var2 = 0; // L: 271

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 272
			if (super.fileCounts[var3] > 0) { // L: 273
				var1 += 100; // L: 274
				var2 += this.groupLoadPercent(var3); // L: 275
			}
		}

		if (var1 == 0) { // L: 278
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 279
			return var3; // L: 280
		}
	}
}
