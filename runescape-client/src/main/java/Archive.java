import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("h")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1506133489
	)
	@Export("index")
	int index;
	@ObfuscatedName("e")
	volatile boolean field3250;
	@ObfuscatedName("k")
	boolean field3251;
	@ObfuscatedName("g")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1275315877
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -474512255
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1416389537
	)
	int field3256;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field3250 = false; // L: 14
		this.field3251 = false; // L: 15
		this.field3256 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3251 = var6; // L: 27
		CollisionMap.method2622(this, this.index); // L: 28
	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1118403482"
	)
	public boolean method4430() {
		return this.field3250; // L: 32
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1911280804"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3250) { // L: 36
			return 100;
		} else if (super.groups != null) { // L: 37
			return 99;
		} else {
			int var1 = class22.method328(255, this.index); // L: 38
			if (var1 >= 100) { // L: 39
				var1 = 99;
			}

			return var1; // L: 40
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "968295804"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1985410743"
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
			Canvas.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 75
		}

	} // L: 76

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "232168908"
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
			Canvas.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 103
		}

	} // L: 104

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-1098415366"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 107
			if (this.field3250) { // L: 108
				throw new RuntimeException(); // L: 109
			}

			if (this.masterDisk != null) { // L: 111
				SoundSystem.method872(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 112
			this.loadAllLocal(); // L: 113
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 116
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 117
			if (this.archiveDisk != null) { // L: 118
				SoundSystem.method872(var1, var2, this.archiveDisk); // L: 119
				this.validGroups[var1] = true; // L: 120
			}

			if (var4) { // L: 122
				Object[] var5 = super.groups; // L: 123
				Object var7;
				if (var2 == null) { // L: 127
					var7 = null; // L: 128
				} else if (var2.length > 136) { // L: 131
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 133
					var8.set(var2); // L: 134
					var7 = var8; // L: 135
				} else {
					var7 = var2; // L: 140
				}

				var5[var1] = var7; // L: 142
			}
		}

	} // L: 145

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Llp;I[BZI)V",
		garbageValue = "1126674323"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 148
			if (this.field3250) { // L: 149
				throw new RuntimeException(); // L: 150
			}

			if (var3 == null) { // L: 152
				Canvas.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 153
				return; // L: 154
			}

			Archive_crc.reset(); // L: 156
			Archive_crc.update(var3, 0, var3.length); // L: 157
			var5 = (int)Archive_crc.getValue(); // L: 158
			if (var5 != this.indexCrc) { // L: 159
				Canvas.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 160
				return; // L: 161
			}

			Buffer var11 = new Buffer(class238.decompressBytes(var3)); // L: 163
			int var12 = var11.readUnsignedByte(); // L: 164
			if (var12 != 5 && var12 != 6) { // L: 165
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 166
			if (var12 >= 6) { // L: 167
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 168
				Canvas.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 169
				return; // L: 170
			}

			this.decodeIndex(var3); // L: 172
			this.loadAllLocal(); // L: 173
		} else {
			if (!var4 && var2 == this.field3256) { // L: 176
				this.field3250 = true; // L: 177
			}

			if (var3 == null || var3.length <= 2) { // L: 179
				this.validGroups[var2] = false; // L: 180
				if (this.field3251 || var4) { // L: 181
					Canvas.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 182
			}

			Archive_crc.reset(); // L: 184
			Archive_crc.update(var3, 0, var3.length - 2); // L: 185
			var5 = (int)Archive_crc.getValue(); // L: 186
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 187
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 188
				this.validGroups[var2] = false; // L: 189
				if (this.field3251 || var4) {
					Canvas.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4); // L: 190
				}

				return; // L: 191
			}

			this.validGroups[var2] = true; // L: 193
			if (var4) { // L: 194
				Object[] var7 = super.groups; // L: 195
				Object var9;
				if (var3 == null) { // L: 199
					var9 = null; // L: 200
				} else if (var3.length > 136) { // L: 203
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 205
					var10.set(var3); // L: 206
					var9 = var10; // L: 207
				} else {
					var9 = var3; // L: 212
				}

				var7[var2] = var9; // L: 214
			}
		}

	} // L: 217

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "29991317"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 220

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 221
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 222
			this.field3250 = true; // L: 223
		} else {
			this.field3256 = -1; // L: 226

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 227
				if (super.fileCounts[var1] > 0) { // L: 228
					class5.method85(var1, this.archiveDisk, this); // L: 229
					this.field3256 = var1; // L: 230
				}
			}

			if (this.field3256 == -1) { // L: 233
				this.field3250 = true;
			}

		}
	} // L: 224 234

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-13"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 237
			return 100;
		} else if (this.validGroups[var1]) { // L: 238
			return 100;
		} else {
			int var3 = this.index; // L: 240
			long var4 = (long)((var3 << 16) + var1); // L: 242
			int var2;
			if (class208.NetCache_currentResponse != null && class208.NetCache_currentResponse.key == var4) { // L: 243
				var2 = InterfaceParent.NetCache_responseArchiveBuffer.offset * 99 / (InterfaceParent.NetCache_responseArchiveBuffer.array.length - class208.NetCache_currentResponse.padding) + 1; // L: 247
			} else {
				var2 = 0; // L: 244
			}

			return var2; // L: 249
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-8"
	)
	public boolean method4458(int var1) {
		return this.validGroups[var1]; // L: 253
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1999926301"
	)
	public boolean method4440(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 257
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "99"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 261
		int var2 = 0; // L: 262

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 263
			if (super.fileCounts[var3] > 0) { // L: 264
				var1 += 100; // L: 265
				var2 += this.groupLoadPercent(var3); // L: 266
			}
		}

		if (var1 == 0) { // L: 269
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 270
			return var3; // L: 271
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	static final void method4471(int var0) {
		if (class15.loadInterface(var0)) { // L: 11096
			class208.drawModelComponents(Widget.Widget_interfaceComponents[var0], -1); // L: 11097
		}
	} // L: 11098

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1450702687"
	)
	static final void method4470() {
		PacketBufferNode var0 = ObjectComposition.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher); // L: 11289
		Client.packetWriter.addNode(var0); // L: 11290

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11291
			if (var1.type == 0 || var1.type == 3) { // L: 11292
				WorldMapData_1.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11294
			class29.invalidateWidget(Client.meslayerContinueWidget); // L: 11295
			Client.meslayerContinueWidget = null; // L: 11296
		}

	} // L: 11298
}
