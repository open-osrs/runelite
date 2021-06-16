import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1389060673
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("o")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("m")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("r")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("h")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("d")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("z")
	@Export("models")
	int[] models;
	@ObfuscatedName("b")
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "82"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "-1096590760"
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
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 57
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 58
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "31141"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 75
			return true;
		} else {
			boolean var1 = true; // L: 76

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 77
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 78
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Lga;",
		garbageValue = "-55"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 82
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 83

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 84
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method2754() {
		boolean var1 = true; // L: 102

		for (int var2 = 0; var2 < 5; ++var2) { // L: 103
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 104
				var1 = false;
			}
		}

		return var1; // L: 106
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)Lga;",
		garbageValue = "4207"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5]; // L: 110
		int var2 = 0; // L: 111

		for (int var3 = 0; var3 < 5; ++var3) { // L: 112
			if (this.models[var3] != -1) { // L: 113
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "383487932"
	)
	public static boolean method2778(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field265[var0] : false; // L: 244 245
	}
}
