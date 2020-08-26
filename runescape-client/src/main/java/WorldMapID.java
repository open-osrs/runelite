import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("av")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	static final WorldMapID field291;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	static final WorldMapID field288;
	@ObfuscatedName("t")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 658473583
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("ev")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 563184905
	)
	@Export("value")
	final int value;

	static {
		field291 = new WorldMapID(0); // L: 4
		field288 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "1634458310"
	)
	static int method617(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1705
			Interpreter.Interpreter_intStackSize -= 3; // L: 1706
			class7.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 1707
			return 1; // L: 1708
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1710
			WorldMapCacheName.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1711
			return 1; // L: 1712
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1714
			Interpreter.Interpreter_intStackSize -= 2; // L: 1715
			class298.playSoundJingle(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1716
			return 1; // L: 1717
		} else {
			return 2; // L: 1719
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1747274457"
	)
	static final void method616(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0; // L: 4841
		boolean var4 = false; // L: 4842
		int var5 = -1; // L: 4843
		int var6 = -1; // L: 4844
		int var7 = Players.Players_count; // L: 4845
		int[] var8 = Players.Players_indices; // L: 4846

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 4847
			Object var20;
			if (var9 < var7) { // L: 4849
				var20 = Client.players[var8[var9]]; // L: 4850
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 4851
					var4 = true; // L: 4852
					var5 = var9; // L: 4853
					continue;
				}

				if (var20 == WorldMapLabelSize.localPlayer) { // L: 4856
					var6 = var9; // L: 4857
					continue; // L: 4858
				}
			} else {
				var20 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 4861
			}

			GrandExchangeOfferNameComparator.drawActor2d((Actor)var20, var9, var0, var1, var2, var3); // L: 4862
		}

		if (Client.renderSelf && var6 != -1) { // L: 4864
			GrandExchangeOfferNameComparator.drawActor2d(WorldMapLabelSize.localPlayer, var6, var0, var1, var2, var3); // L: 4865
		}

		if (var4) { // L: 4867
			GrandExchangeOfferNameComparator.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 4868
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) { // L: 4870
			int var10 = Client.overheadTextXs[var9]; // L: 4871
			int var11 = Client.overheadTextYs[var9]; // L: 4872
			int var12 = Client.overheadTextXOffsets[var9]; // L: 4873
			int var13 = Client.overheadTextAscents[var9]; // L: 4874
			boolean var14 = true; // L: 4875

			while (var14) {
				var14 = false; // L: 4877

				for (int var19 = 0; var19 < var9; ++var19) { // L: 4878
					if (var11 + 2 > Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] && var11 - var13 < Client.overheadTextYs[var19] + 2 && var10 - var12 < Client.overheadTextXs[var19] + Client.overheadTextXOffsets[var19] && var12 + var10 > Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19] && Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] < var11) { // L: 4879 4880
						var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19]; // L: 4881
						var14 = true; // L: 4882
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9]; // L: 4887
			Client.viewportTempY = Client.overheadTextYs[var9] = var11; // L: 4888
			String var15 = Client.overheadText[var9]; // L: 4889
			if (Client.chatEffects == 0) { // L: 4890
				int var16 = 16776960; // L: 4891
				if (Client.overheadTextColors[var9] < 6) { // L: 4892
					var16 = Client.field892[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) { // L: 4893
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) { // L: 4894
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) { // L: 4895
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) { // L: 4896
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4897
					if (var17 < 50) { // L: 4898
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 4899
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 4900
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) { // L: 4902
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4903
					if (var17 < 50) { // L: 4904
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 4905
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 4906
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) { // L: 4908
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4909
					if (var17 < 50) { // L: 4910
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 4911
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 4912
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var9] == 0) { // L: 4914
					class4.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) { // L: 4915
					class4.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) { // L: 4916
					class4.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) { // L: 4917
					class4.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) { // L: 4918
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (class4.fontBold12.stringWidth(var15) + 100) / 150; // L: 4919
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4920
					class4.fontBold12.draw(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0); // L: 4921
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4922
				}

				if (Client.overheadTextEffects[var9] == 5) { // L: 4924
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4925
					int var18 = 0; // L: 4926
					if (var17 < 25) { // L: 4927
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 4928
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class4.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4929
					class4.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0); // L: 4930
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4931
				}
			} else {
				class4.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4935
			}
		}

	} // L: 4938

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(ZLky;B)V",
		garbageValue = "45"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 4988
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 4989
			var2 = var1.method5655(); // L: 4990
			var3 = var1.method5656(); // L: 4991
			int var4 = var1.readUnsignedShort(); // L: 4992
			BoundaryObject.xteaKeys = new int[var4][4]; // L: 4993

			for (var5 = 0; var5 < var4; ++var5) { // L: 4994
				for (var6 = 0; var6 < 4; ++var6) { // L: 4995
					BoundaryObject.xteaKeys[var5][var6] = var1.readInt(); // L: 4996
				}
			}

			class90.regions = new int[var4]; // L: 4999
			GrandExchangeEvents.regionMapArchiveIds = new int[var4]; // L: 5000
			Skeleton.regionLandArchiveIds = new int[var4]; // L: 5001
			AbstractUserComparator.regionLandArchives = new byte[var4][]; // L: 5002
			AbstractWorldMapData.regionMapArchives = new byte[var4][]; // L: 5003
			boolean var16 = false; // L: 5004
			if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) { // L: 5005
				var16 = true;
			}

			if (var2 / 8 == 48 && var3 / 8 == 148) { // L: 5006
				var16 = true;
			}

			var4 = 0; // L: 5007

			for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5008
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) { // L: 5009
					var8 = var7 + (var6 << 8); // L: 5010
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 5011
						class90.regions[var4] = var8; // L: 5012
						GrandExchangeEvents.regionMapArchiveIds[var4] = WorldMapLabel.archive5.getGroupId("m" + var6 + "_" + var7); // L: 5013
						Skeleton.regionLandArchiveIds[var4] = WorldMapLabel.archive5.getGroupId("l" + var6 + "_" + var7); // L: 5014
						++var4; // L: 5015
					}
				}
			}

			Varps.method4067(var2, var3, true); // L: 5018
		} else {
			var2 = var1.readUnsignedShort(); // L: 5021
			var3 = var1.method5656(); // L: 5022
			boolean var15 = var1.method5646() == 1; // L: 5023
			var5 = var1.readUnsignedShort(); // L: 5024
			var1.importIndex(); // L: 5025

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5026
				for (var7 = 0; var7 < 13; ++var7) { // L: 5027
					for (var8 = 0; var8 < 13; ++var8) { // L: 5028
						var9 = var1.readBits(1); // L: 5029
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5030
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5031
						}
					}
				}
			}

			var1.exportIndex(); // L: 5035
			BoundaryObject.xteaKeys = new int[var5][4]; // L: 5036

			for (var6 = 0; var6 < var5; ++var6) { // L: 5037
				for (var7 = 0; var7 < 4; ++var7) { // L: 5038
					BoundaryObject.xteaKeys[var6][var7] = var1.readInt(); // L: 5039
				}
			}

			class90.regions = new int[var5]; // L: 5042
			GrandExchangeEvents.regionMapArchiveIds = new int[var5]; // L: 5043
			Skeleton.regionLandArchiveIds = new int[var5]; // L: 5044
			AbstractUserComparator.regionLandArchives = new byte[var5][]; // L: 5045
			AbstractWorldMapData.regionMapArchives = new byte[var5][]; // L: 5046
			var5 = 0; // L: 5047

			for (var6 = 0; var6 < 4; ++var6) { // L: 5048
				for (var7 = 0; var7 < 13; ++var7) { // L: 5049
					for (var8 = 0; var8 < 13; ++var8) { // L: 5050
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5051
						if (var9 != -1) { // L: 5052
							int var10 = var9 >> 14 & 1023; // L: 5053
							int var11 = var9 >> 3 & 2047; // L: 5054
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5055

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5056
								if (class90.regions[var13] == var12) {
									var12 = -1; // L: 5057
									break; // L: 5058
								}
							}

							if (var12 != -1) { // L: 5060
								class90.regions[var5] = var12; // L: 5061
								var13 = var12 >> 8 & 255; // L: 5062
								int var14 = var12 & 255; // L: 5063
								GrandExchangeEvents.regionMapArchiveIds[var5] = WorldMapLabel.archive5.getGroupId("m" + var13 + "_" + var14); // L: 5064
								Skeleton.regionLandArchiveIds[var5] = WorldMapLabel.archive5.getGroupId("l" + var13 + "_" + var14); // L: 5065
								++var5; // L: 5066
							}
						}
					}
				}
			}

			Varps.method4067(var3, var2, !var15); // L: 5072
		}

	} // L: 5074
}
