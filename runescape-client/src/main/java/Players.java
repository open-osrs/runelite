import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ci")
@Implements("Players")
public class Players {
	@ObfuscatedName("s")
	static byte[] field1276;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lgl;"
	)
	static class185[] field1277;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Lpi;"
	)
	static Buffer[] field1278;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -997920691
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("i")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 295337231
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("v")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("a")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("y")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("u")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 221870495
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("q")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	static Buffer field1275;
	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;

	static {
		field1276 = new byte[2048]; // L: 18
		field1277 = new class185[2048]; // L: 19
		field1278 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1275 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lbl;",
		garbageValue = "-502833726"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class148.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = ScriptFrame.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(CLlu;I)C",
		garbageValue = "1415681673"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 69
			if (var0 >= 192 && var0 <= 198) { // L: 70
				return 'A';
			}

			if (var0 == 199) { // L: 71
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 72
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 73
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 74
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 75
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 76
				return 'U';
			}

			if (var0 == 221) { // L: 77
				return 'Y';
			}

			if (var0 == 223) { // L: 78
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 79
				return 'a';
			}

			if (var0 == 231) { // L: 80
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) { // L: 90
			return 'Y';
		} else {
			return var0;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([Lbi;II[I[IB)V",
		garbageValue = "16"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 81
			int var5 = var1 - 1; // L: 82
			int var6 = var2 + 1; // L: 83
			int var7 = (var2 + var1) / 2; // L: 84
			World var8 = var0[var7]; // L: 85
			var0[var7] = var0[var1]; // L: 86
			var0[var1] = var8; // L: 87

			while (var5 < var6) { // L: 88
				boolean var9 = true; // L: 89

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 91

					for (var10 = 0; var10 < 4; ++var10) { // L: 92
						if (var3[var10] == 2) { // L: 95
							var11 = var0[var6].index; // L: 96
							var12 = var8.index; // L: 97
						} else if (var3[var10] == 1) { // L: 99
							var11 = var0[var6].population; // L: 100
							var12 = var8.population; // L: 101
							if (var11 == -1 && var4[var10] == 1) { // L: 102
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 103
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 105
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 106
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 107
						} else {
							var11 = var0[var6].id; // L: 110
							var12 = var8.id; // L: 111
						}

						if (var12 != var11) { // L: 113
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 116 117
								var9 = false; // L: 119
							}
							break;
						}

						if (var10 == 3) { // L: 114
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 124

				do {
					++var5; // L: 126

					for (var10 = 0; var10 < 4; ++var10) { // L: 127
						if (var3[var10] == 2) { // L: 130
							var11 = var0[var5].index; // L: 131
							var12 = var8.index; // L: 132
						} else if (var3[var10] == 1) { // L: 134
							var11 = var0[var5].population; // L: 135
							var12 = var8.population; // L: 136
							if (var11 == -1 && var4[var10] == 1) { // L: 137
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001; // L: 138
							}
						} else if (var3[var10] == 3) { // L: 140
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 141
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 142
						} else {
							var11 = var0[var5].id; // L: 145
							var12 = var8.id; // L: 146
						}

						if (var12 != var11) { // L: 148
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 151 152
								var9 = false; // L: 154
							}
							break;
						}

						if (var10 == 3) { // L: 149
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 159
					World var13 = var0[var5]; // L: 160
					var0[var5] = var0[var6]; // L: 161
					var0[var6] = var13; // L: 162
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 165
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 166
		}

	} // L: 168

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "187224492"
	)
	static boolean method2308(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) { // L: 1176
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) { // L: 1177
				return true;
			}
		}

		return false; // L: 1179
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "97"
	)
	static int method2305(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3714
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class6.loadWorlds() ? 1 : 0; // L: 3715
			return 1; // L: 3716
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3718
				var9 = MusicPatch.worldListStart(); // L: 3719
				if (var9 != null) { // L: 3720
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 3721
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 3722
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var9.activity; // L: 3723
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 3724
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 3725
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var9.host; // L: 3726
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3729
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3730
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3731
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3732
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3733
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3734
				}

				return 1; // L: 3736
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3738
				var9 = class114.getNextWorldListWorld(); // L: 3739
				if (var9 != null) { // L: 3740
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 3741
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 3742
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var9.activity; // L: 3743
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 3744
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 3745
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var9.host; // L: 3746
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3749
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3750
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3751
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3752
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3753
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3754
				}

				return 1; // L: 3756
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3758
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3759
					var7 = null; // L: 3760

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3761
						if (var3 == class33.World_worlds[var8].id) { // L: 3762
							var7 = class33.World_worlds[var8]; // L: 3763
							break;
						}
					}

					if (var7 != null) { // L: 3767
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 3768
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 3769
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var7.activity; // L: 3770
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 3771
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 3772
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var7.host; // L: 3773
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3776
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3777
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3778
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3779
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3780
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3781
					}

					return 1; // L: 3783
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3785
					Interpreter.Interpreter_intStackSize -= 4; // L: 3786
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3787
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3788
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3789
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1; // L: 3790
					class126.sortWorldList(var3, var10, var8, var6); // L: 3791
					return 1; // L: 3792
				} else if (var0 != 6511) { // L: 3794
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3815
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3816
						return 1; // L: 3817
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3819
							Interpreter.Interpreter_intStackSize -= 2; // L: 3820
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3821
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3822
							var5 = HealthBarUpdate.getParamDefinition(var4); // L: 3823
							if (var5.isString()) { // L: 3824
								Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = UserComparator10.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3825
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3828
							}

							return 1; // L: 3830
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3832
							Interpreter.Interpreter_intStackSize -= 2; // L: 3833
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3834
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3835
							var5 = HealthBarUpdate.getParamDefinition(var4); // L: 3836
							if (var5.isString()) { // L: 3837
								Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ParamComposition.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3838
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ParamComposition.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3841
							}

							return 1; // L: 3843
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3845
							Interpreter.Interpreter_intStackSize -= 2; // L: 3846
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3847
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3848
							var5 = HealthBarUpdate.getParamDefinition(var4); // L: 3849
							if (var5.isString()) { // L: 3850
								Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = Client.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 3851
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 3854
							}

							return 1; // L: 3856
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 3858
							Interpreter.Interpreter_intStackSize -= 2; // L: 3859
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3860
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3861
							var5 = HealthBarUpdate.getParamDefinition(var4); // L: 3862
							if (var5.isString()) { // L: 3863
								Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = class136.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3864
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class136.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3867
							}

							return 1; // L: 3869
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 3871
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 3872
							return 1; // L: 3873
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 3875
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType; // L: 3876
							return 1; // L: 3877
						} else if (var0 == 6520) { // L: 3879
							return 1; // L: 3880
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 3882
							return 1; // L: 3883
						} else if (var0 == 6522) { // L: 3885
							--BufferedNetSocket.Interpreter_stringStackSize; // L: 3886
							--Interpreter.Interpreter_intStackSize; // L: 3887
							return 1; // L: 3888
						} else if (var0 == 6523) { // L: 3890
							--BufferedNetSocket.Interpreter_stringStackSize; // L: 3891
							--Interpreter.Interpreter_intStackSize; // L: 3892
							return 1; // L: 3893
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 3895
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3896
							return 1; // L: 3897
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 3899
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3900
							return 1; // L: 3901
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 3903
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3904
							return 1; // L: 3905
						} else if (var0 == 6527) { // L: 3907
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field502; // L: 3908
							return 1; // L: 3909
						} else {
							return 2; // L: 3911
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3795
					if (var3 >= 0 && var3 < World.World_count) { // L: 3796
						var7 = class33.World_worlds[var3]; // L: 3797
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 3798
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 3799
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var7.activity; // L: 3800
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 3801
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 3802
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var7.host; // L: 3803
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3806
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3807
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3808
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3809
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3810
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3811
					}

					return 1; // L: 3813
				}
			}
		}
	}
}
