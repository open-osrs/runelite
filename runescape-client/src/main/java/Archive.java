import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("e")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1410432427
	)
	@Export("index")
	int index;
	@ObfuscatedName("k")
	volatile boolean field3686;
	@ObfuscatedName("t")
	boolean field3683;
	@ObfuscatedName("a")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1839449919
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 886571455
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1993950793
	)
	int field3676;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lmm;Lmm;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		this.field3686 = false;
		this.field3683 = false;
		this.field3676 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3;
		this.field3683 = var6;
		UserComparator6.method2466(this, this.index);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-5"
	)
	public boolean method5201() {
		return this.field3686;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "64"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3686) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = ArchiveDiskActionHandler.method5168(255, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "30"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		class150.method2874(this.index, var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "120"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			ArchiveDisk var2 = this.archiveDisk;
			byte[] var4 = null;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
					if ((long)var1 == var6.key && var2 == var6.archiveDisk && var6.type == 0) {
						var4 = var6.data;
						break;
					}
				}
			}

			if (var4 != null) {
				this.load(var2, var1, var4, true);
			} else {
				byte[] var5 = var2.read(var1);
				this.load(var2, var1, var5, true);
			}
		} else {
			ClanSettings.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1828412488"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			int var3 = this.index;
			ArchiveDisk var4 = this.masterDisk;
			byte[] var6 = null;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
					if ((long)var3 == var8.key && var4 == var8.archiveDisk && var8.type == 0) {
						var6 = var8.data;
						break;
					}
				}
			}

			if (var6 != null) {
				this.load(var4, var3, var6, true);
			} else {
				byte[] var7 = var4.read(var3);
				this.load(var4, var3, var7, true);
			}
		} else {
			ClanSettings.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-657787925"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field3686) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				class150.method2873(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				class150.method2873(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = DevicePcmPlayerProvider.method372(var2, false);
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lmm;I[BZB)V",
		garbageValue = "68"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field3686) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				ClanSettings.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				ClanSettings.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var11 = new Buffer(class12.decompressBytes(var3));
			int var12 = var11.readUnsignedByte();
			if (var12 != 5 && var12 != 6) {
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var12 >= 6) {
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) {
				ClanSettings.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field3676) {
				this.field3686 = true;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field3683 || var4) {
					ClanSettings.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field3683 || var4) {
					ClanSettings.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2097641089"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field3686 = true;
		} else {
			this.field3676 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					class133.method2707(var1, this.archiveDisk, this);
					this.field3676 = var1;
				}
			}

			if (this.field3676 == -1) {
				this.field3686 = true;
			}

		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : ArchiveDiskActionHandler.method5168(this.index, var1);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-700098712"
	)
	public boolean method5179(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "36"
	)
	public boolean method5180(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1632636897"
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

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	static final void method5187() {
		Client.field686 = Client.cycleCntr;
		WorldMapSectionType.ClanChat_inClanChat = true;
	}
}
