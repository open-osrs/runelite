import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("s")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("a")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("o")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1626628953
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -997141697
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("p")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("j")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("b")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1999375204"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "498308918"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 48
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 49
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 50
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 51
				this.outputCount = var1.readUnsignedShort(); // L: 52
				this.keys = new int[this.outputCount]; // L: 53
				this.strVals = new String[this.outputCount]; // L: 54

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 55
					this.keys[var3] = var1.readInt(); // L: 56
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 57
				}
			} else if (var2 == 6) { // L: 60
				this.outputCount = var1.readUnsignedShort(); // L: 61
				this.keys = new int[this.outputCount]; // L: 62
				this.intVals = new int[this.outputCount]; // L: 63

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 64
					this.keys[var3] = var1.readInt(); // L: 65
					this.intVals[var3] = var1.readInt(); // L: 66
				}
			}
		}

	} // L: 70

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "689416040"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "211547863"
	)
	public static byte[] method3106(byte[] var0) {
		int var1 = var0.length; // L: 22
		byte[] var2 = new byte[var1]; // L: 23
		System.arraycopy(var0, 0, var2, 0, var1); // L: 24
		return var2; // L: 25
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1659130731"
	)
	static void method3097(boolean var0) {
		byte var1 = 0; // L: 878
		boolean var2 = class408.clientPreferences.field1182 >= Client.field467; // L: 881
		if (!var2) { // L: 883
			var1 = 12; // L: 884
		} else if (ArchiveLoader.client.method1166()) { // L: 886
			var1 = 10; // L: 887
		}

		class275.method5201(var1); // L: 889
		if (var0) { // L: 890
			Login.Login_username = ""; // L: 891
			Login.Login_password = ""; // L: 892
			ReflectionCheck.field429 = 0; // L: 893
			Tiles.otp = ""; // L: 894
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 897
			if (class408.clientPreferences.rememberedUsername != null) { // L: 898
				Login.Login_username = class408.clientPreferences.rememberedUsername; // L: 899
				Client.Login_isUsernameRemembered = true; // L: 900
			} else {
				Client.Login_isUsernameRemembered = false; // L: 902
			}
		}

		ParamComposition.method3216(); // L: 904
	} // L: 905

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "11"
	)
	static final void method3107(int var0, int var1, boolean var2) {
		if (!var2 || var0 != ItemLayer.field2243 || WallDecoration.field2630 != var1) { // L: 5791
			ItemLayer.field2243 = var0; // L: 5794
			WallDecoration.field2630 = var1; // L: 5795
			WorldMapData_1.updateGameState(25); // L: 5796
			class91.drawLoadingMessage("Loading - please wait.", true); // L: 5797
			int var3 = class19.baseX; // L: 5798
			int var4 = DefaultsGroup.baseY; // L: 5799
			class19.baseX = (var0 - 6) * 8; // L: 5800
			DefaultsGroup.baseY = (var1 - 6) * 8; // L: 5801
			int var5 = class19.baseX - var3; // L: 5802
			int var6 = DefaultsGroup.baseY - var4; // L: 5803
			var3 = class19.baseX; // L: 5804
			var4 = DefaultsGroup.baseY; // L: 5805

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5806
				NPC var19 = Client.npcs[var7]; // L: 5807
				if (var19 != null) { // L: 5808
					for (var9 = 0; var9 < 10; ++var9) { // L: 5809
						var10000 = var19.pathX; // L: 5810
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5811
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5813
					var19.y -= var6 * 128; // L: 5814
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5817
				Player var22 = Client.players[var7]; // L: 5818
				if (var22 != null) { // L: 5819
					for (var9 = 0; var9 < 10; ++var9) { // L: 5820
						var10000 = var22.pathX; // L: 5821
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5822
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5824
					var22.y -= var6 * 128; // L: 5825
				}
			}

			byte var20 = 0; // L: 5828
			byte var8 = 104; // L: 5829
			byte var21 = 1; // L: 5830
			if (var5 < 0) { // L: 5831
				var20 = 103; // L: 5832
				var8 = -1; // L: 5833
				var21 = -1; // L: 5834
			}

			byte var10 = 0; // L: 5836
			byte var11 = 104; // L: 5837
			byte var12 = 1; // L: 5838
			if (var6 < 0) { // L: 5839
				var10 = 103; // L: 5840
				var11 = -1; // L: 5841
				var12 = -1; // L: 5842
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5844
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5845
					int var15 = var13 + var5; // L: 5846
					int var16 = var6 + var14; // L: 5847

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5848
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5849
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5850
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5854 5855 5859
				var18.x -= var5; // L: 5856
				var18.y -= var6; // L: 5857
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5858
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5861
				Client.destinationX -= var5; // L: 5862
				Client.destinationY -= var6; // L: 5863
			}

			Client.soundEffectCount = 0; // L: 5865
			Client.isCameraLocked = false; // L: 5866
			WorldMapSectionType.cameraX -= var5 << 7; // L: 5867
			class65.cameraZ -= var6 << 7; // L: 5868
			class320.oculusOrbFocalPointX -= var5 << 7; // L: 5869
			class18.oculusOrbFocalPointY -= var6 << 7; // L: 5870
			Client.field701 = -1; // L: 5871
			Client.graphicsObjects.clear(); // L: 5872
			Client.projectiles.clear(); // L: 5873

			for (var14 = 0; var14 < 4; ++var14) { // L: 5874
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5792 5875

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "1038996465"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		ModelData0.insertMenuItem(var0, var1, var2, var3, var4, var5, false); // L: 9294
	} // L: 9295
}
