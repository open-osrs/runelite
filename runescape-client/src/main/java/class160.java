import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ff")
public class class160 {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -312324639
	)
	public static int field1749;
	@ObfuscatedName("s")
	public short[] field1745;
	@ObfuscatedName("e")
	public short[] field1746;

	class160(int var1) {
		ItemComposition var2 = Client.ItemDefinition_get(var1); // L: 12
		if (var2.method3525()) { // L: 13
			this.field1745 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1745, 0, this.field1745.length); // L: 15
		}

		if (var2.method3553()) { // L: 17
			this.field1746 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1746, 0, this.field1746.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "-348617731"
	)
	static int method3129(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 3915
			var3 = SoundSystem.Client_plane; // L: 3916
			int var15 = (WorldMapSprite.localPlayer.x >> 7) + Canvas.baseX; // L: 3917
			int var8 = (WorldMapSprite.localPlayer.y >> 7) + class118.baseY; // L: 3918
			WorldMapEvent.getWorldMap().method6894(var3, var15, var8, true); // L: 3919
			return 1; // L: 3920
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 3922
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3923
				String var16 = ""; // L: 3924
				var9 = WorldMapEvent.getWorldMap().getMapArea(var3); // L: 3925
				if (var9 != null) { // L: 3926
					var16 = var9.getExternalName(); // L: 3927
				}

				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var16; // L: 3929
				return 1; // L: 3930
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 3932
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3933
				WorldMapEvent.getWorldMap().setCurrentMapAreaId(var3); // L: 3934
				return 1; // L: 3935
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 3937
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapEvent.getWorldMap().getZoomLevel(); // L: 3938
				return 1; // L: 3939
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 3941
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3942
				WorldMapEvent.getWorldMap().setZoomPercentage(var3); // L: 3943
				return 1; // L: 3944
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 3946
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapEvent.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 3947
				return 1; // L: 3948
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 3950
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3951
					WorldMapEvent.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 3952
					return 1; // L: 3953
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 3955
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3956
					WorldMapEvent.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 3957
					return 1; // L: 3958
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 3960
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3961
					WorldMapEvent.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 3962
					return 1; // L: 3963
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 3965
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3966
					WorldMapEvent.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 3967
					return 1; // L: 3968
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 3970
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapEvent.getWorldMap().getDisplayX(); // L: 3971
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapEvent.getWorldMap().getDisplayY(); // L: 3972
					return 1; // L: 3973
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 3975
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3976
						var11 = WorldMapEvent.getWorldMap().getMapArea(var3); // L: 3977
						if (var11 == null) { // L: 3978
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3979
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 3982
						}

						return 1; // L: 3984
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 3986
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3987
						var11 = WorldMapEvent.getWorldMap().getMapArea(var3); // L: 3988
						if (var11 == null) { // L: 3989
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3990
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3991
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 3994
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 3995
						}

						return 1; // L: 3997
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 3999
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4000
						var11 = WorldMapEvent.getWorldMap().getMapArea(var3); // L: 4001
						if (var11 == null) { // L: 4002
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4003
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4004
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4005
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4006
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4009
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4010
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4011
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4012
						}

						return 1; // L: 4014
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4016
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4017
						var11 = WorldMapEvent.getWorldMap().getMapArea(var3); // L: 4018
						if (var11 == null) { // L: 4019
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4020
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4023
						}

						return 1; // L: 4025
					} else if (var0 == 6615) { // L: 4027
						var14 = WorldMapEvent.getWorldMap().getDisplayCoord(); // L: 4028
						if (var14 == null) { // L: 4029
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4030
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4031
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x; // L: 4034
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y; // L: 4035
						}

						return 1; // L: 4037
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4039
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapEvent.getWorldMap().currentMapAreaId(); // L: 4040
						return 1; // L: 4041
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4043
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4044
						var11 = WorldMapEvent.getWorldMap().getCurrentMapArea(); // L: 4045
						if (var11 == null) { // L: 4046
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4047
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4048
							return 1; // L: 4049
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4051
							if (var12 == null) { // L: 4052
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4053
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4054
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[0]; // L: 4057
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[1]; // L: 4058
							}

							return 1; // L: 4060
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4062
							var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4063
							var11 = WorldMapEvent.getWorldMap().getCurrentMapArea(); // L: 4064
							if (var11 == null) { // L: 4065
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4066
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4067
								return 1; // L: 4068
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4070
								if (var5 == null) { // L: 4071
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4072
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4075
								}

								return 1; // L: 4077
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4079
								Interpreter.Interpreter_intStackSize -= 2; // L: 4080
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4081
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4082
								BoundaryObject.method4276(var3, var10, false); // L: 4083
								return 1; // L: 4084
							} else if (var0 == 6620) { // L: 4086
								Interpreter.Interpreter_intStackSize -= 2; // L: 4087
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4088
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4089
								BoundaryObject.method4276(var3, var10, true); // L: 4090
								return 1; // L: 4091
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4093
								Interpreter.Interpreter_intStackSize -= 2; // L: 4094
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4095
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4096
								var9 = WorldMapEvent.getWorldMap().getMapArea(var3); // L: 4097
								if (var9 == null) { // L: 4098
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4099
									return 1; // L: 4100
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4102
									return 1; // L: 4103
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4105
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapEvent.getWorldMap().getDisplayWith(); // L: 4106
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapEvent.getWorldMap().getDisplayHeight(); // L: 4107
								return 1; // L: 4108
							} else if (var0 == 6623) { // L: 4110
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4111
								var11 = WorldMapEvent.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4112
								if (var11 == null) { // L: 4113
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4114
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId(); // L: 4117
								}

								return 1; // L: 4119
							} else if (var0 == 6624) { // L: 4121
								WorldMapEvent.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4122
								return 1; // L: 4123
							} else if (var0 == 6625) { // L: 4125
								WorldMapEvent.getWorldMap().resetMaxFlashCount(); // L: 4126
								return 1; // L: 4127
							} else if (var0 == 6626) { // L: 4129
								WorldMapEvent.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4130
								return 1; // L: 4131
							} else if (var0 == 6627) { // L: 4133
								WorldMapEvent.getWorldMap().resetCyclesPerFlash(); // L: 4134
								return 1; // L: 4135
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4137
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4138
									WorldMapEvent.getWorldMap().setPerpetualFlash(var13); // L: 4139
									return 1; // L: 4140
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4142
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4143
									WorldMapEvent.getWorldMap().flashElement(var3); // L: 4144
									return 1; // L: 4145
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4147
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4148
									WorldMapEvent.getWorldMap().flashCategory(var3); // L: 4149
									return 1; // L: 4150
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4152
									WorldMapEvent.getWorldMap().stopCurrentFlashes(); // L: 4153
									return 1; // L: 4154
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4156
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4157
									WorldMapEvent.getWorldMap().setElementsDisabled(var13); // L: 4158
									return 1; // L: 4159
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4161
										Interpreter.Interpreter_intStackSize -= 2; // L: 4162
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4163
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4164
										WorldMapEvent.getWorldMap().disableElement(var3, var7); // L: 4165
										return 1; // L: 4166
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4168
										Interpreter.Interpreter_intStackSize -= 2; // L: 4169
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4170
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4171
										WorldMapEvent.getWorldMap().setCategoryDisabled(var3, var7); // L: 4172
										return 1; // L: 4173
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4175
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapEvent.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4176
										return 1; // L: 4177
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4179
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4180
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapEvent.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4181
										return 1; // L: 4182
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4184
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4185
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapEvent.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4186
										return 1; // L: 4187
									} else if (var0 == 6638) { // L: 4189
										Interpreter.Interpreter_intStackSize -= 2; // L: 4190
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4191
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4192
										var5 = WorldMapEvent.getWorldMap().method6897(var3, var10); // L: 4193
										if (var5 == null) { // L: 4194
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4195
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4198
										}

										return 1; // L: 4200
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4202
											var6 = WorldMapEvent.getWorldMap().iconStart(); // L: 4203
											if (var6 == null) { // L: 4204
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4205
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4206
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4209
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4210
											}

											return 1; // L: 4212
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4214
											var6 = WorldMapEvent.getWorldMap().iconNext(); // L: 4215
											if (var6 == null) { // L: 4216
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4217
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4218
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4221
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4222
											}

											return 1; // L: 4224
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4226
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4227
												var4 = class126.WorldMapElement_get(var3); // L: 4228
												if (var4.name == null) { // L: 4229
													Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 4230
												} else {
													Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4.name; // L: 4233
												}

												return 1; // L: 4235
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4237
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4238
												var4 = class126.WorldMapElement_get(var3); // L: 4239
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize; // L: 4240
												return 1; // L: 4241
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4243
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4244
												var4 = class126.WorldMapElement_get(var3); // L: 4245
												if (var4 == null) { // L: 4246
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4247
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category; // L: 4250
												}

												return 1; // L: 4252
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4254
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4255
												var4 = class126.WorldMapElement_get(var3); // L: 4256
												if (var4 == null) { // L: 4257
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4258
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4261
												}

												return 1; // L: 4263
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4265
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class17.worldMapEvent.mapElement; // L: 4266
												return 1; // L: 4267
											} else if (var0 == 6698) { // L: 4269
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class17.worldMapEvent.coord1.packed(); // L: 4270
												return 1; // L: 4271
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4273
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class17.worldMapEvent.coord2.packed(); // L: 4274
												return 1; // L: 4275
											} else {
												return 2; // L: 4277
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1850489952"
	)
	public static int method3126(String var0) {
		return var0.length() + 2; // L: 128
	}
}
