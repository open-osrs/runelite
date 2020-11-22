import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("KitDefinition_archive")
	static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -609176759
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("KitDefinition_cached")
	public static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 1533008419
	)
	static int field3297;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1729249671
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("q")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("k")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("c")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("u")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("t")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("e")
	@Export("models")
	int[] models;
	@ObfuscatedName("o")
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-902223111"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IB)V",
		garbageValue = "101"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1495290745"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Len;",
		garbageValue = "-99"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1549480832"
	)
	public boolean method4620() {
		boolean var1 = true; // L: 108

		for (int var2 = 0; var2 < 5; ++var2) { // L: 109
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 110
				var1 = false;
			}
		}

		return var1; // L: 112
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Len;",
		garbageValue = "1284292663"
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

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2143746786"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (Client.soundEffectVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3574
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3575
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3576
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3577
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3578
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3579
			++Client.soundEffectCount; // L: 3580
		}

	} // L: 3582

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1433287432"
	)
	static void method4634(int var0, int var1) {
		int var2 = ReflectionCheck.fontBold12.stringWidth("Choose Option"); // L: 7895

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 7896
			Font var7 = ReflectionCheck.fontBold12; // L: 7897
			String var8;
			if (var3 < 0) { // L: 7900
				var8 = ""; // L: 7901
			} else if (Client.menuTargets[var3].length() > 0) { // L: 7904
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3]; // L: 7905
			}

			int var6 = var7.stringWidth(var8); // L: 7907
			if (var6 > var2) { // L: 7908
				var2 = var6;
			}
		}

		var2 += 8; // L: 7910
		var3 = Client.menuOptionsCount * 15 + 22; // L: 7911
		int var4 = var0 - var2 / 2; // L: 7912
		if (var4 + var2 > ItemContainer.canvasWidth) { // L: 7913
			var4 = ItemContainer.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 7914
			var4 = 0;
		}

		int var5 = var1; // L: 7915
		if (var1 + var3 > HealthBar.canvasHeight) { // L: 7916
			var5 = HealthBar.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 7917
			var5 = 0;
		}

		Coord.menuX = var4; // L: 7918
		WorldMapArea.menuY = var5; // L: 7919
		KeyHandler.menuWidth = var2; // L: 7920
		ServerPacket.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 7921
	} // L: 7922
}
