import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("KitDefinition_archive")
	static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 12947469
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("KitDefinition_cached")
	public static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -346028961
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("o")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("x")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("w")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("g")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("m")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("n")
	@Export("models")
	int[] models;
	@ObfuscatedName("d")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
	}

	KitDefinition() {
		this.bodypartID = -1; // L: 15
		this.models = new int[]{-1, -1, -1, -1, -1}; // L: 21
		this.nonSelectable = false; // L: 22
	} // L: 24

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-861511508"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 44
			if (var2 == 0) { // L: 45
				return; // L: 48
			}

			this.decodeNext(var1, var2); // L: 46
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkf;IB)V",
		garbageValue = "36"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 51
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 52
				var3 = var1.readUnsignedByte(); // L: 53
				this.models2 = new int[var3]; // L: 54

				for (var4 = 0; var4 < var3; ++var4) { // L: 55
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 57
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 58
				var3 = var1.readUnsignedByte(); // L: 59
				this.recolorFrom = new short[var3]; // L: 60
				this.recolorTo = new short[var3]; // L: 61

				for (var4 = 0; var4 < var3; ++var4) { // L: 62
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 63
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 64
				}
			} else if (var2 == 41) { // L: 67
				var3 = var1.readUnsignedByte(); // L: 68
				this.retextureFrom = new short[var3]; // L: 69
				this.retextureTo = new short[var3]; // L: 70

				for (var4 = 0; var4 < var3; ++var4) { // L: 71
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 72
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 73
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 76
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 78

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-62"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 81
			return true;
		} else {
			boolean var1 = true; // L: 82

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 83
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 84
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lee;",
		garbageValue = "-1978614087"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 88
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 89

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 90
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 92
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 93
			}

			int var3;
			if (this.recolorFrom != null) { // L: 94
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 95
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 96
				}
			}

			if (this.retextureFrom != null) { // L: 99
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 100
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 101
				}
			}

			return var4; // L: 104
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-57"
	)
	public boolean method4543() {
		boolean var1 = true; // L: 108

		for (int var2 = 0; var2 < 5; ++var2) { // L: 109
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 110
				var1 = false;
			}
		}

		return var1; // L: 112
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Lee;",
		garbageValue = "16"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5]; // L: 116
		int var2 = 0; // L: 117

		for (int var3 = 0; var3 < 5; ++var3) { // L: 118
			if (this.models[var3] != -1) { // L: 119
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 121
		int var4;
		if (this.recolorFrom != null) { // L: 122
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 123
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 124
			}
		}

		if (this.retextureFrom != null) { // L: 127
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 128
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 129
			}
		}

		return var5; // L: 132
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1024"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		UserComparator8.method3497(); // L: 10675
		if (Entity.clanChat != null) { // L: 10676
			Entity.clanChat.invalidateIgnoreds(); // L: 10677
		}

	} // L: 10679
}
