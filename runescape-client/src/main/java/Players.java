import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("Players")
public class Players {
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -419051257
	)
	static int field1317;
	@ObfuscatedName("l")
	static byte[] field1301;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lgd;"
	)
	static class193[] field1302;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lpx;"
	)
	static Buffer[] field1307;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -193801041
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("p")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1455321023
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("r")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("v")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("y")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("c")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1176869757
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("b")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static Buffer field1306;

	static {
		field1301 = new byte[2048]; // L: 18
		field1302 = new class193[2048]; // L: 19
		field1307 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1306 = new Buffer(new byte[5000]); // L: 30
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-145581238"
	)
	public static boolean method2427() {
		try {
			if (class273.musicPlayerStatus == 2) { // L: 74
				if (class273.musicTrack == null) { // L: 75
					class273.musicTrack = MusicTrack.readTrack(ClanChannelMember.musicTrackArchive, StructComposition.musicTrackGroupId, FriendsList.musicTrackFileId); // L: 76
					if (class273.musicTrack == null) { // L: 77
						return false;
					}
				}

				if (class152.soundCache == null) { // L: 79
					class152.soundCache = new SoundCache(class273.soundEffectsArchive, class462.musicSamplesArchive);
				}

				if (class273.midiPcmStream.loadMusicTrack(class273.musicTrack, class273.musicPatchesArchive, class152.soundCache, 22050)) { // L: 80
					class273.midiPcmStream.clearAll(); // L: 81
					class273.midiPcmStream.setPcmStreamVolume(Clock.musicTrackVolume); // L: 82
					class273.midiPcmStream.setMusicTrack(class273.musicTrack, VertexNormal.musicTrackBoolean); // L: 83
					class273.musicPlayerStatus = 0; // L: 84
					class273.musicTrack = null; // L: 85
					class152.soundCache = null; // L: 86
					ClanChannelMember.musicTrackArchive = null; // L: 87
					return true; // L: 88
				}
			}
		} catch (Exception var1) { // L: 92
			var1.printStackTrace(); // L: 93
			class273.midiPcmStream.clear(); // L: 94
			class273.musicPlayerStatus = 0; // L: 95
			class273.musicTrack = null; // L: 96
			class152.soundCache = null; // L: 97
			ClanChannelMember.musicTrackArchive = null; // L: 98
		}

		return false; // L: 100
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lki;II)I",
		garbageValue = "-1939093407"
	)
	static final int method2413(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10905
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10907
				int var3 = 0; // L: 10908
				int var4 = 0; // L: 10909
				byte var5 = 0; // L: 10910

				while (true) {
					int var6 = var2[var4++]; // L: 10912
					int var7 = 0; // L: 10913
					byte var8 = 0; // L: 10914
					if (var6 == 0) { // L: 10915
						return var3;
					}

					if (var6 == 1) { // L: 10916
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10917
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10918
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10919
						var9 = var2[var4++] << 16; // L: 10920
						var9 += var2[var4++]; // L: 10921
						var10 = class92.getWidget(var9); // L: 10922
						var11 = var2[var4++]; // L: 10923
						if (var11 != -1 && (!FileSystem.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10924
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10925
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10926
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10930
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10931
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10932
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10933
						var7 = ModelData0.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10934
						for (var9 = 0; var9 < 25; ++var9) { // L: 10935
							if (Skills.Skills_enabled[var9]) { // L: 10936
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10939
						var9 = var2[var4++] << 16; // L: 10940
						var9 += var2[var4++]; // L: 10941
						var10 = class92.getWidget(var9); // L: 10942
						var11 = var2[var4++]; // L: 10943
						if (var11 != -1 && (!FileSystem.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10944
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10945
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10946
									var7 = 999999999; // L: 10947
									break; // L: 10948
								}
							}
						}
					}

					if (var6 == 11) { // L: 10953
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10954
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10955
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10956
						int var13 = var2[var4++]; // L: 10957
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10958
					}

					if (var6 == 14) { // L: 10960
						var9 = var2[var4++]; // L: 10961
						var7 = class18.getVarbit(var9); // L: 10962
					}

					if (var6 == 15) { // L: 10964
						var8 = 1;
					}

					if (var6 == 16) { // L: 10965
						var8 = 2;
					}

					if (var6 == 17) { // L: 10966
						var8 = 3;
					}

					if (var6 == 18) { // L: 10967
						var7 = (ModelData0.localPlayer.x >> 7) + SecureRandomCallable.baseX;
					}

					if (var6 == 19) { // L: 10968
						var7 = (ModelData0.localPlayer.y >> 7) + GrandExchangeOfferOwnWorldComparator.baseY;
					}

					if (var6 == 20) { // L: 10969
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10970
						if (var5 == 0) { // L: 10971
							var3 += var7;
						}

						if (var5 == 1) { // L: 10972
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10973
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10974
							var3 *= var7;
						}

						var5 = 0; // L: 10975
					} else {
						var5 = var8; // L: 10977
					}
				}
			} catch (Exception var14) { // L: 10980
				return -1; // L: 10981
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	static void method2426(int var0) {
		class116.tempMenuAction = new MenuAction(); // L: 11910
		class116.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 11911
		class116.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 11912
		class116.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 11913
		class116.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 11914
		class116.tempMenuAction.action = Client.menuActions[var0]; // L: 11915
	} // L: 11916
}
