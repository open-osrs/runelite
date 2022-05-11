import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("az")
public class class33 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "525584260"
	)
	static int method592(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3917
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ClientPreferences.loadWorlds() ? 1 : 0; // L: 3918
			return 1; // L: 3919
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3921
				var9 = ClientPreferences.worldListStart(); // L: 3922
				if (var9 != null) { // L: 3923
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.id; // L: 3924
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.properties; // L: 3925
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var9.activity; // L: 3926
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.location; // L: 3927
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.population; // L: 3928
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var9.host; // L: 3929
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 3932
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3933
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3934
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3935
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3936
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3937
				}

				return 1; // L: 3939
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3941
				var9 = class146.getNextWorldListWorld(); // L: 3942
				if (var9 != null) { // L: 3943
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.id; // L: 3944
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.properties; // L: 3945
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var9.activity; // L: 3946
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.location; // L: 3947
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.population; // L: 3948
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var9.host; // L: 3949
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 3952
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3953
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3954
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3955
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3956
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3957
				}

				return 1; // L: 3959
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3961
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3962
					var7 = null; // L: 3963

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3964
						if (var3 == World.World_worlds[var8].id) { // L: 3965
							var7 = World.World_worlds[var8]; // L: 3966
							break;
						}
					}

					if (var7 != null) { // L: 3970
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.id; // L: 3971
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.properties; // L: 3972
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var7.activity; // L: 3973
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.location; // L: 3974
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.population; // L: 3975
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var7.host; // L: 3976
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 3979
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3980
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3981
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3982
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3983
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3984
					}

					return 1; // L: 3986
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3988
					class12.Interpreter_intStackSize -= 4; // L: 3989
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3990
					boolean var10 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1] == 1; // L: 3991
					var8 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 3992
					boolean var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3] == 1; // L: 3993
					GraphicsDefaults.sortWorldList(var3, var10, var8, var6); // L: 3994
					return 1; // L: 3995
				} else if (var0 != 6511) { // L: 3997
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4018
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 4019
						return 1; // L: 4020
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4022
							class12.Interpreter_intStackSize -= 2; // L: 4023
							var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 4024
							var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 4025
							var5 = class78.getParamDefinition(var4); // L: 4026
							if (var5.isString()) { // L: 4027
								Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = WorldMapSectionType.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4028
							} else {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = WorldMapSectionType.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4031
							}

							return 1; // L: 4033
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4035
							class12.Interpreter_intStackSize -= 2; // L: 4036
							var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 4037
							var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 4038
							var5 = class78.getParamDefinition(var4); // L: 4039
							if (var5.isString()) { // L: 4040
								Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = class82.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4041
							} else {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class82.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4044
							}

							return 1; // L: 4046
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4048
							class12.Interpreter_intStackSize -= 2; // L: 4049
							var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 4050
							var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 4051
							var5 = class78.getParamDefinition(var4); // L: 4052
							if (var5.isString()) { // L: 4053
								Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = FileSystem.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4054
							} else {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FileSystem.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4057
							}

							return 1; // L: 4059
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4061
							class12.Interpreter_intStackSize -= 2; // L: 4062
							var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 4063
							var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 4064
							var5 = class78.getParamDefinition(var4); // L: 4065
							if (var5.isString()) { // L: 4066
								Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = class401.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4067
							} else {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class401.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4070
							}

							return 1; // L: 4072
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4074
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4075
							return 1; // L: 4076
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4078
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.clientType; // L: 4079
							return 1; // L: 4080
						} else if (var0 == 6520) { // L: 4082
							return 1; // L: 4083
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4085
							return 1; // L: 4086
						} else if (var0 == 6522) { // L: 4088
							--class9.Interpreter_stringStackSize; // L: 4089
							--class12.Interpreter_intStackSize; // L: 4090
							return 1; // L: 4091
						} else if (var0 == 6523) { // L: 4093
							--class9.Interpreter_stringStackSize; // L: 4094
							--class12.Interpreter_intStackSize; // L: 4095
							return 1; // L: 4096
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4098
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4099
							return 1; // L: 4100
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4102
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1; // L: 4103
							return 1; // L: 4104
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4106
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1; // L: 4107
							return 1; // L: 4108
						} else if (var0 == 6527) { // L: 4110
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.field486; // L: 4111
							return 1; // L: 4112
						} else {
							return 2; // L: 4114
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3998
					if (var3 >= 0 && var3 < World.World_count) { // L: 3999
						var7 = World.World_worlds[var3]; // L: 4000
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.id; // L: 4001
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.properties; // L: 4002
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var7.activity; // L: 4003
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.location; // L: 4004
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.population; // L: 4005
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var7.host; // L: 4006
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4009
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4010
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 4011
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4012
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4013
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 4014
					}

					return 1; // L: 4016
				}
			}
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "368469089"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 11196
	} // L: 11197
}
