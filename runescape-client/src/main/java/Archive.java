import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("id")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ao")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1087109335
	)
	@Export("index")
	int index;
	@ObfuscatedName("i")
	volatile boolean field3180;
	@ObfuscatedName("ab")
	boolean field3183;
	@ObfuscatedName("ac")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -861635571
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 711915875
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 833914621
	)
	int field3188;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Llt;Llt;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		this.field3180 = false; // L: 14
		this.field3183 = false; // L: 15
		this.field3188 = -1;
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3183 = var6; // L: 27
		class236.method4263(this, this.index); // L: 28
	} // L: 29

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1666992241"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		WorldMapSection3.method870(this.index, var1); // L: 54
	} // L: 55

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1168057688"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else if (this.validGroups[var1]) {
			return 100;
		} else {
			int var3 = this.index;
			long var4 = (long)((var3 << 16) + var1);
			int var2;
			if (NetCache.NetCache_currentResponse != null && var4 == NetCache.NetCache_currentResponse.key) {
				var2 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding) + 1; // L: 231
			} else {
				var2 = 0; // L: 228
			}

			return var2; // L: 233
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1308309481"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 58
			ArchiveDisk var2 = this.archiveDisk; // L: 59
			byte[] var4 = null; // L: 62
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 63
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 64
					if (var6.key == (long)var1 && var2 == var6.archiveDisk && var6.type == 0) { // L: 65
						var4 = var6.data; // L: 66
						break; // L: 67
					}
				}
			}

			if (var4 != null) { // L: 71
				this.load(var2, var1, var4, true); // L: 72
			} else {
				byte[] var5 = var2.read(var1); // L: 75
				this.load(var2, var1, var5, true); // L: 76
			}
		} else {
			VarcInt.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 79
		}

	} // L: 80

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1771311633"
	)
	public boolean method4420() {
		return this.field3180; // L: 32
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "853852990"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3180) { // L: 36
			return 100;
		} else if (super.groups != null) { // L: 37
			return 99;
		} else {
			int var2 = this.index; // L: 39
			long var3 = (long)(var2 + 16711680); // L: 41
			int var1;
			if (NetCache.NetCache_currentResponse != null && var3 == NetCache.NetCache_currentResponse.key) { // L: 42
				var1 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding) + 1; // L: 46
			} else {
				var1 = 0; // L: 43
			}

			int var5 = var1; // L: 48
			if (var1 >= 100) { // L: 49
				var5 = 99;
			}

			return var5; // L: 50
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2008218250"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 83
		this.indexVersion = var2; // L: 84
		if (this.masterDisk != null) { // L: 85
			int var3 = this.index; // L: 86
			ArchiveDisk var4 = this.masterDisk; // L: 87
			byte[] var6 = null; // L: 90
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 91
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 92
					if ((long)var3 == var8.key && var4 == var8.archiveDisk && var8.type == 0) { // L: 93
						var6 = var8.data; // L: 94
						break; // L: 95
					}
				}
			}

			if (var6 != null) { // L: 99
				this.load(var4, var3, var6, true); // L: 100
			} else {
				byte[] var7 = var4.read(var3); // L: 103
				this.load(var4, var3, var7, true); // L: 104
			}
		} else {
			VarcInt.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 107
		}

	} // L: 108

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-1937939642"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 111
			if (this.field3180) { // L: 112
				throw new RuntimeException(); // L: 113
			}

			if (this.masterDisk != null) { // L: 115
				UrlRequester.method3417(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 116
			this.loadAllLocal(); // L: 117
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 120
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 121
			if (this.archiveDisk != null) { // L: 122
				UrlRequester.method3417(var1, var2, this.archiveDisk); // L: 123
				this.validGroups[var1] = true; // L: 124
			}

			if (var4) {
				super.groups[var1] = AbstractByteArrayCopier.method4069(var2, false); // L: 126
			}
		}

	} // L: 128

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Llt;I[BZI)V",
		garbageValue = "-1033218148"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 131
			if (this.field3180) { // L: 132
				throw new RuntimeException(); // L: 133
			}

			if (var3 == null) { // L: 135
				VarcInt.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 136
				return; // L: 137
			}

			Archive_crc.reset(); // L: 139
			Archive_crc.update(var3, 0, var3.length); // L: 140
			var5 = (int)Archive_crc.getValue(); // L: 141
			if (var5 != this.indexCrc) { // L: 142
				VarcInt.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 143
				return; // L: 144
			}

			Buffer var9 = new Buffer(UserComparator3.decompressBytes(var3)); // L: 146
			int var7 = var9.readUnsignedByte(); // L: 147
			if (var7 != 5 && var7 != 6) { // L: 148
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 149
			if (var7 >= 6) { // L: 150
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 151
				VarcInt.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 152
				return; // L: 153
			}

			this.decodeIndex(var3); // L: 155
			this.loadAllLocal(); // L: 156
		} else {
			if (!var4 && var2 == this.field3188) { // L: 159
				this.field3180 = true; // L: 160
			}

			if (var3 == null || var3.length <= 2) { // L: 162
				this.validGroups[var2] = false; // L: 163
				if (this.field3183 || var4) { // L: 164
					VarcInt.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 165
			}

			Archive_crc.reset(); // L: 167
			Archive_crc.update(var3, 0, var3.length - 2); // L: 168
			var5 = (int)Archive_crc.getValue(); // L: 169
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 170
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 171
				this.validGroups[var2] = false; // L: 172
				if (this.field3183 || var4) { // L: 173
					VarcInt.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 174
			}

			this.validGroups[var2] = true; // L: 176
			if (var4) { // L: 177
				super.groups[var2] = AbstractByteArrayCopier.method4069(var3, false);
			}
		}

	} // L: 179

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1835807428"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 182

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 183
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 184
			this.field3180 = true; // L: 185
		} else {
			this.field3188 = -1; // L: 188

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 189
				if (super.fileCounts[var1] > 0) { // L: 190
					ArchiveDisk var2 = this.archiveDisk; // L: 191
					ArchiveDiskAction var4 = new ArchiveDiskAction(); // L: 194
					var4.type = 1; // L: 195
					var4.key = (long)var1; // L: 196
					var4.archiveDisk = var2; // L: 197
					var4.archive = this; // L: 198
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 199
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4); // L: 200
					} // L: 201

					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 203
						if (ArchiveDiskActionHandler.field3176 == 0) { // L: 204
							class105.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 205
							class105.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 206
							class105.ArchiveDiskActionHandler_thread.start(); // L: 207
							class105.ArchiveDiskActionHandler_thread.setPriority(5); // L: 208
						}

						ArchiveDiskActionHandler.field3176 = 600; // L: 210
					}

					this.field3188 = var1; // L: 214
				}
			}

			if (this.field3188 == -1) { // L: 217
				this.field3180 = true;
			}

		}
	} // L: 186

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1907030186"
	)
	public boolean method4411(int var1) {
		return this.validGroups[var1]; // L: 237
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method4416(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 241
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "2047"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 245
		int var2 = 0; // L: 246

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 247
			if (super.fileCounts[var3] > 0) { // L: 248
				var1 += 100; // L: 249
				var2 += this.groupLoadPercent(var3); // L: 250
			}
		}

		if (var1 == 0) { // L: 253
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 254
			return var3; // L: 255
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "-2056845281"
	)
	public static double[] method4445(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1; // L: 18
		double[] var6 = new double[var5]; // L: 19
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = Script.method2356((double)var7, var0, var2); // L: 21
			++var7; // L: 20
		}

		return var6; // L: 23
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "-1832830458"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 218
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 219
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 220
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE; // L: 221
		} else if (var0.equals("Z")) { // L: 222
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 223
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 224
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE; // L: 225
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 226 227
		}
	}
}
