import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gf")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("q")
	@Export("type")
	char type;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -480942967
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("j")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("e")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 31

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "0"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.decodeNext(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "-1779670866"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			this.type = class289.method5560(var1.readByte()); // L: 43
		} else if (var2 == 2) { // L: 45
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false; // L: 46
		} else if (var2 == 5) { // L: 47
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 49

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "35"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 52
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Lgh;",
		garbageValue = "273043499"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 358
		if (var1 != null) { // L: 359
			return var1;
		} else {
			var1 = Calendar.method5499(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 360
			if (var1 != null) { // L: 361
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 362
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "126"
	)
	static int method3574(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3927
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class136.loadWorlds() ? 1 : 0; // L: 3928
			return 1; // L: 3929
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3931
				var9 = class151.worldListStart(); // L: 3932
				if (var9 != null) { // L: 3933
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.id; // L: 3934
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.properties; // L: 3935
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity; // L: 3936
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.location; // L: 3937
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.population; // L: 3938
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host; // L: 3939
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 3942
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3943
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3944
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3945
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3946
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3947
				}

				return 1; // L: 3949
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3951
				var9 = Interpreter.getNextWorldListWorld(); // L: 3952
				if (var9 != null) { // L: 3953
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.id; // L: 3954
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.properties; // L: 3955
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity; // L: 3956
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.location; // L: 3957
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.population; // L: 3958
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host; // L: 3959
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 3962
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3963
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3964
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3965
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3966
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3967
				}

				return 1; // L: 3969
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3971
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3972
					var7 = null; // L: 3973

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3974
						if (var3 == class362.World_worlds[var8].id) { // L: 3975
							var7 = class362.World_worlds[var8]; // L: 3976
							break;
						}
					}

					if (var7 != null) { // L: 3980
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.id; // L: 3981
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.properties; // L: 3982
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity; // L: 3983
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.location; // L: 3984
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.population; // L: 3985
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host; // L: 3986
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 3989
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3990
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3991
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3992
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3993
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3994
					}

					return 1; // L: 3996
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3998
					class446.Interpreter_intStackSize -= 4; // L: 3999
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4000
					boolean var10 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1] == 1; // L: 4001
					var8 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 4002
					boolean var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3] == 1; // L: 4003
					class138.sortWorldList(var3, var10, var8, var6); // L: 4004
					return 1; // L: 4005
				} else if (var0 != 6511) { // L: 4007
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4028
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 4029
						return 1; // L: 4030
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4032
							class446.Interpreter_intStackSize -= 2; // L: 4033
							var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4034
							var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 4035
							var5 = class174.getParamDefinition(var4); // L: 4036
							if (var5.isString()) { // L: 4037
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = BuddyRankComparator.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4038
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = BuddyRankComparator.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4041
							}

							return 1; // L: 4043
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4045
							class446.Interpreter_intStackSize -= 2; // L: 4046
							var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4047
							var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 4048
							var5 = class174.getParamDefinition(var4); // L: 4049
							if (var5.isString()) { // L: 4050
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class162.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4051
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class162.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4054
							}

							return 1; // L: 4056
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4058
							class446.Interpreter_intStackSize -= 2; // L: 4059
							var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4060
							var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 4061
							var5 = class174.getParamDefinition(var4); // L: 4062
							if (var5.isString()) { // L: 4063
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = EnumComposition.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4064
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = EnumComposition.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4067
							}

							return 1; // L: 4069
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4071
							class446.Interpreter_intStackSize -= 2; // L: 4072
							var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4073
							var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 4074
							var5 = class174.getParamDefinition(var4); // L: 4075
							if (var5.isString()) { // L: 4076
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapIcon_1.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4077
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapIcon_1.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4080
							}

							return 1; // L: 4082
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4084
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4085
							return 1; // L: 4086
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4088
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.clientType; // L: 4089
							return 1; // L: 4090
						} else if (var0 == 6520) { // L: 4092
							return 1; // L: 4093
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4095
							return 1; // L: 4096
						} else if (var0 == 6522) { // L: 4098
							--Interpreter.Interpreter_stringStackSize; // L: 4099
							--class446.Interpreter_intStackSize; // L: 4100
							return 1; // L: 4101
						} else if (var0 == 6523) { // L: 4103
							--Interpreter.Interpreter_stringStackSize; // L: 4104
							--class446.Interpreter_intStackSize; // L: 4105
							return 1; // L: 4106
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4108
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4109
							return 1; // L: 4110
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4112
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1; // L: 4113
							return 1; // L: 4114
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4116
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1; // L: 4117
							return 1; // L: 4118
						} else if (var0 == 6527) { // L: 4120
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.field484; // L: 4121
							return 1; // L: 4122
						} else {
							return 2; // L: 4124
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4008
					if (var3 >= 0 && var3 < World.World_count) { // L: 4009
						var7 = class362.World_worlds[var3]; // L: 4010
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.id; // L: 4011
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.properties; // L: 4012
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity; // L: 4013
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.location; // L: 4014
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.population; // L: 4015
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host; // L: 4016
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4019
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4020
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4021
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4022
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4023
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4024
					}

					return 1; // L: 4026
				}
			}
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(IIIILqe;Lkp;I)V",
		garbageValue = "1077753678"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12181
			int var6 = Client.camAngleY & 2047; // L: 12182
			int var7 = var3 * var3 + var2 * var2; // L: 12183
			if (var7 <= 6400) { // L: 12184
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12185
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12186
				int var10 = var3 * var8 + var9 * var2 >> 16; // L: 12187
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12188
				if (var7 > 2500) {
					var4.method8270(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12189
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12190
				}

			}
		}
	} // L: 12191
}
