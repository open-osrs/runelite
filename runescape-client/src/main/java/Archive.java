import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ao")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1429609403
	)
	@Export("index")
	int index;
	@ObfuscatedName("f")
	volatile boolean field3189;
	@ObfuscatedName("ah")
	boolean field3191;
	@ObfuscatedName("ai")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1541564901
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1294218015
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -973433081
	)
	int field3196;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		signature = "(Llp;Llp;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		this.field3189 = false;
		this.field3191 = false;
		this.field3196 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3;
		this.field3191 = var6;
		MusicPatchNode.method3968(this, this.index);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "479482423"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		int var2 = this.index;
		long var3 = (long)((var2 << 16) + var1);
		NetFileRequest var5 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var3);
		if (var5 != null) {
			NetCache.NetCache_pendingWritesQueue.addLast(var5);
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-1350822089"
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
			if (PlayerType.NetCache_currentResponse != null && PlayerType.NetCache_currentResponse.key == var4) {
				var2 = CollisionMap.NetCache_responseArchiveBuffer.offset * 99 / (CollisionMap.NetCache_responseArchiveBuffer.array.length - PlayerType.NetCache_currentResponse.padding) + 1;
			} else {
				var2 = 0;
			}

			return var2;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1560066319"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			WorldMapCacheName.method688(var1, this.archiveDisk, this);
		} else {
			WorldMapEvent.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "6460755"
	)
	public boolean method4456() {
		return this.field3189;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1538719165"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3189) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var2 = this.index;
			long var3 = (long)(var2 + 16711680);
			int var1;
			if (PlayerType.NetCache_currentResponse != null && PlayerType.NetCache_currentResponse.key == var3) {
				var1 = CollisionMap.NetCache_responseArchiveBuffer.offset * 99 / (CollisionMap.NetCache_responseArchiveBuffer.array.length - PlayerType.NetCache_currentResponse.padding) + 1;
			} else {
				var1 = 0;
			}

			int var5 = var1;
			if (var1 >= 100) {
				var5 = 99;
			}

			return var5;
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1870441691"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			WorldMapCacheName.method688(this.index, this.masterDisk, this);
		} else {
			WorldMapEvent.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		signature = "(I[BZZI)V",
		garbageValue = "-1362503762"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field3189) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				SecureRandomFuture.method2270(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				SecureRandomFuture.method2270(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = MenuAction.method2169(var2, false);
			}
		}

	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		signature = "(Llp;I[BZI)V",
		garbageValue = "416222280"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field3189) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				WorldMapEvent.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				WorldMapEvent.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var11 = new Buffer(Coord.decompressBytes(var3));
			int var12 = var11.readUnsignedByte();
			if (var12 != 5 && var12 != 6) {
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var12 >= 6) {
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) {
				WorldMapEvent.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field3196) {
				this.field3189 = true;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field3191 || var4) {
					WorldMapEvent.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field3191 || var4) {
					WorldMapEvent.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				Object[] var7 = super.groups;
				Object var9;
				if (var3 == null) {
					var9 = null;
				} else if (var3.length > 136) {
					DirectByteArrayCopier var10 = new DirectByteArrayCopier();
					var10.set(var3);
					var9 = var10;
				} else {
					var9 = var3;
				}

				var7[var2] = var9;
			}
		}

	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1106038504"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field3189 = true;
		} else {
			this.field3196 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					class228.method4262(var1, this.archiveDisk, this);
					this.field3196 = var1;
				}
			}

			if (this.field3196 == -1) {
				this.field3189 = true;
			}

		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1634778176"
	)
	public boolean method4460(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-587516749"
	)
	public boolean method4452(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1037828577"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0;
		int var2 = 0;

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) {
			if (super.fileCounts[var3] > 0) {
				var1 += 100;
				var2 += this.groupLoadPercent(var3);
			}
		}

		if (var1 == 0) {
			return 100;
		} else {
			var3 = var2 * 100 / var1;
			return var3;
		}
	}
}
