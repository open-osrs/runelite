import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1767972963
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 1856258713
	)
	static int field1855;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1991201937
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("n")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("s")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("l")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("q")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("o")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("r")
	@Export("models")
	int[] models;
	@ObfuscatedName("p")
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-322514028"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 38
			if (var2 == 0) { // L: 39
				return; // L: 42
			}

			this.decodeNext(var1, var2); // L: 40
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "14"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 45
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 46
				var3 = var1.readUnsignedByte(); // L: 47
				this.models2 = new int[var3]; // L: 48

				for (var4 = 0; var4 < var3; ++var4) { // L: 49
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 51
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 52
				var3 = var1.readUnsignedByte(); // L: 53
				this.recolorFrom = new short[var3]; // L: 54
				this.recolorTo = new short[var3]; // L: 55

				for (var4 = 0; var4 < var3; ++var4) { // L: 56
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) { // L: 61
				var3 = var1.readUnsignedByte(); // L: 62
				this.retextureFrom = new short[var3]; // L: 63
				this.retextureTo = new short[var3]; // L: 64

				for (var4 = 0; var4 < var3; ++var4) { // L: 65
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 66
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 67
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 70
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 72

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "579619376"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 75
			return true;
		} else {
			boolean var1 = true; // L: 76

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 77
				if (!class147.KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 78
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lhc;",
		garbageValue = "-1349429336"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 82
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 83

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 84
				var1[var2] = ModelData.ModelData_get(class147.KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 86
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 87
			}

			int var3;
			if (this.recolorFrom != null) { // L: 88
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 89
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 90
				}
			}

			if (this.retextureFrom != null) { // L: 93
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 94
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 95
				}
			}

			return var4; // L: 98
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "293914398"
	)
	public boolean method3447() {
		boolean var1 = true; // L: 102

		for (int var2 = 0; var2 < 5; ++var2) { // L: 103
			if (this.models[var2] != -1 && !class147.KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 104
				var1 = false;
			}
		}

		return var1; // L: 106
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)Lhc;",
		garbageValue = "1402"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5]; // L: 110
		int var2 = 0; // L: 111

		for (int var3 = 0; var3 < 5; ++var3) { // L: 112
			if (this.models[var3] != -1) { // L: 113
				var1[var2++] = ModelData.ModelData_get(class147.KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 115
		int var4;
		if (this.recolorFrom != null) { // L: 116
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 117
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 118
			}
		}

		if (this.retextureFrom != null) { // L: 121
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 122
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 123
			}
		}

		return var5; // L: 126
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;I)V",
		garbageValue = "-1509322924"
	)
	public static void method3452(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0; // L: 57
		NPCComposition.NpcDefinition_modelArchive = var1; // L: 58
	} // L: 59

	@ObfuscatedName("kq")
	static final void method3453(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0); // L: 11999
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0); // L: 12000
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 12002
		class131.clientPreferences.method2239(var0); // L: 12004
	} // L: 12005

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2073437950"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 12355

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 12356
			var1.clearIsFromIgnored(); // L: 12358
		}

		if (ClientPacket.friendsChat != null) { // L: 12362
			ClientPacket.friendsChat.invalidateIgnoreds(); // L: 12363
		}

	} // L: 12365
}
