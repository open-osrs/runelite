import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jk")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("p")
	@Export("name")
	public final String name;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 629900867
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0); // L: 5
		BUILDLIVE = new GameBuild("BUILDLIVE", 3); // L: 6
		RC = new GameBuild("RC", 1); // L: 7
		WIP = new GameBuild("WIP", 2); // L: 8
	}

	GameBuild(String var1, int var2) {
		this.name = var1; // L: 13
		this.buildId = var2; // L: 14
	} // L: 15

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "4"
	)
	static int method4843(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 3792
			var3 = class22.Client_plane; // L: 3793
			int var15 = (class93.localPlayer.x >> 7) + VertexNormal.baseX; // L: 3794
			int var8 = (class93.localPlayer.y >> 7) + SoundSystem.baseY; // L: 3795
			HealthBarUpdate.getWorldMap().method6110(var3, var15, var8, true); // L: 3796
			return 1; // L: 3797
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 3799
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3800
				String var16 = ""; // L: 3801
				var9 = HealthBarUpdate.getWorldMap().getMapArea(var3); // L: 3802
				if (var9 != null) { // L: 3803
					var16 = var9.getExternalName(); // L: 3804
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16; // L: 3806
				return 1; // L: 3807
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 3809
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3810
				HealthBarUpdate.getWorldMap().setCurrentMapAreaId(var3); // L: 3811
				return 1; // L: 3812
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 3814
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().getZoomLevel(); // L: 3815
				return 1; // L: 3816
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 3818
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3819
				HealthBarUpdate.getWorldMap().setZoomPercentage(var3); // L: 3820
				return 1; // L: 3821
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 3823
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 3824
				return 1; // L: 3825
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 3827
					var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 3828
					HealthBarUpdate.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 3829
					return 1; // L: 3830
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 3832
					var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 3833
					HealthBarUpdate.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 3834
					return 1; // L: 3835
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 3837
					var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 3838
					HealthBarUpdate.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 3839
					return 1; // L: 3840
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 3842
					var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 3843
					HealthBarUpdate.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 3844
					return 1; // L: 3845
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 3847
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().getDisplayX(); // L: 3848
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().getDisplayY(); // L: 3849
					return 1; // L: 3850
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 3852
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3853
						var11 = HealthBarUpdate.getWorldMap().getMapArea(var3); // L: 3854
						if (var11 == null) { // L: 3855
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3856
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 3859
						}

						return 1; // L: 3861
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 3863
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3864
						var11 = HealthBarUpdate.getWorldMap().getMapArea(var3); // L: 3865
						if (var11 == null) { // L: 3866
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3867
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3868
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 3871
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 3872
						}

						return 1; // L: 3874
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 3876
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3877
						var11 = HealthBarUpdate.getWorldMap().getMapArea(var3); // L: 3878
						if (var11 == null) { // L: 3879
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3880
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3881
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3882
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3883
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 3886
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 3887
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 3888
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 3889
						}

						return 1; // L: 3891
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 3893
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3894
						var11 = HealthBarUpdate.getWorldMap().getMapArea(var3); // L: 3895
						if (var11 == null) { // L: 3896
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3897
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 3900
						}

						return 1; // L: 3902
					} else if (var0 == 6615) { // L: 3904
						var14 = HealthBarUpdate.getWorldMap().getDisplayCoord(); // L: 3905
						if (var14 == null) { // L: 3906
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3907
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3908
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var14.x; // L: 3911
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var14.y; // L: 3912
						}

						return 1; // L: 3914
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 3916
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().currentMapAreaId(); // L: 3917
						return 1; // L: 3918
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 3920
						var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 3921
						var11 = HealthBarUpdate.getWorldMap().getCurrentMapArea(); // L: 3922
						if (var11 == null) { // L: 3923
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3924
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3925
							return 1; // L: 3926
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 3928
							if (var12 == null) { // L: 3929
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3930
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3931
							} else {
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var12[0]; // L: 3934
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var12[1]; // L: 3935
							}

							return 1; // L: 3937
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 3939
							var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 3940
							var11 = HealthBarUpdate.getWorldMap().getCurrentMapArea(); // L: 3941
							if (var11 == null) { // L: 3942
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3943
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3944
								return 1; // L: 3945
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 3947
								if (var5 == null) { // L: 3948
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3949
								} else {
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.packed(); // L: 3952
								}

								return 1; // L: 3954
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 3956
								class44.Interpreter_intStackSize -= 2; // L: 3957
								var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3958
								var10 = new Coord(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]); // L: 3959
								Skeleton.method3922(var3, var10, false); // L: 3960
								return 1; // L: 3961
							} else if (var0 == 6620) { // L: 3963
								class44.Interpreter_intStackSize -= 2; // L: 3964
								var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3965
								var10 = new Coord(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]); // L: 3966
								Skeleton.method3922(var3, var10, true); // L: 3967
								return 1; // L: 3968
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 3970
								class44.Interpreter_intStackSize -= 2; // L: 3971
								var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3972
								var10 = new Coord(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]); // L: 3973
								var9 = HealthBarUpdate.getWorldMap().getMapArea(var3); // L: 3974
								if (var9 == null) { // L: 3975
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3976
									return 1; // L: 3977
								} else {
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 3979
									return 1; // L: 3980
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 3982
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().getDisplayWith(); // L: 3983
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().getDisplayHeight(); // L: 3984
								return 1; // L: 3985
							} else if (var0 == 6623) { // L: 3987
								var14 = new Coord(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 3988
								var11 = HealthBarUpdate.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 3989
								if (var11 == null) { // L: 3990
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3991
								} else {
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var11.getId(); // L: 3994
								}

								return 1; // L: 3996
							} else if (var0 == 6624) { // L: 3998
								HealthBarUpdate.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 3999
								return 1; // L: 4000
							} else if (var0 == 6625) { // L: 4002
								HealthBarUpdate.getWorldMap().resetMaxFlashCount(); // L: 4003
								return 1; // L: 4004
							} else if (var0 == 6626) { // L: 4006
								HealthBarUpdate.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 4007
								return 1; // L: 4008
							} else if (var0 == 6627) { // L: 4010
								HealthBarUpdate.getWorldMap().resetCyclesPerFlash(); // L: 4011
								return 1; // L: 4012
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4014
									var13 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 4015
									HealthBarUpdate.getWorldMap().setPerpetualFlash(var13); // L: 4016
									return 1; // L: 4017
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4019
									var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 4020
									HealthBarUpdate.getWorldMap().flashElement(var3); // L: 4021
									return 1; // L: 4022
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4024
									var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 4025
									HealthBarUpdate.getWorldMap().flashCategory(var3); // L: 4026
									return 1; // L: 4027
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4029
									HealthBarUpdate.getWorldMap().stopCurrentFlashes(); // L: 4030
									return 1; // L: 4031
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4033
									var13 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 4034
									HealthBarUpdate.getWorldMap().setElementsDisabled(var13); // L: 4035
									return 1; // L: 4036
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4038
										class44.Interpreter_intStackSize -= 2; // L: 4039
										var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 4040
										var7 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1] == 1; // L: 4041
										HealthBarUpdate.getWorldMap().disableElement(var3, var7); // L: 4042
										return 1; // L: 4043
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4045
										class44.Interpreter_intStackSize -= 2; // L: 4046
										var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 4047
										var7 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1] == 1; // L: 4048
										HealthBarUpdate.getWorldMap().setCategoryDisabled(var3, var7); // L: 4049
										return 1; // L: 4050
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4052
										Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4053
										return 1; // L: 4054
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4056
										var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 4057
										Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4058
										return 1; // L: 4059
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4061
										var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 4062
										Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = HealthBarUpdate.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4063
										return 1; // L: 4064
									} else if (var0 == 6638) { // L: 4066
										class44.Interpreter_intStackSize -= 2; // L: 4067
										var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 4068
										var10 = new Coord(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]); // L: 4069
										var5 = HealthBarUpdate.getWorldMap().method6153(var3, var10); // L: 4070
										if (var5 == null) { // L: 4071
											Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 4072
										} else {
											Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.packed(); // L: 4075
										}

										return 1; // L: 4077
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4079
											var6 = HealthBarUpdate.getWorldMap().iconStart(); // L: 4080
											if (var6 == null) { // L: 4081
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 4082
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 4083
											} else {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4086
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4087
											}

											return 1; // L: 4089
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4091
											var6 = HealthBarUpdate.getWorldMap().iconNext(); // L: 4092
											if (var6 == null) { // L: 4093
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 4094
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 4095
											} else {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4098
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4099
											}

											return 1; // L: 4101
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4103
												var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 4104
												var4 = class6.WorldMapElement_get(var3); // L: 4105
												if (var4.name == null) { // L: 4106
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4107
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name; // L: 4110
												}

												return 1; // L: 4112
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4114
												var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 4115
												var4 = class6.WorldMapElement_get(var3); // L: 4116
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.textSize; // L: 4117
												return 1; // L: 4118
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4120
												var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 4121
												var4 = class6.WorldMapElement_get(var3); // L: 4122
												if (var4 == null) { // L: 4123
													Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 4124
												} else {
													Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.category; // L: 4127
												}

												return 1; // L: 4129
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4131
												var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 4132
												var4 = class6.WorldMapElement_get(var3); // L: 4133
												if (var4 == null) { // L: 4134
													Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 4135
												} else {
													Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4138
												}

												return 1; // L: 4140
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4142
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class69.worldMapEvent.mapElement; // L: 4143
												return 1; // L: 4144
											} else if (var0 == 6698) { // L: 4146
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class69.worldMapEvent.coord1.packed(); // L: 4147
												return 1; // L: 4148
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4150
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class69.worldMapEvent.coord2.packed(); // L: 4151
												return 1; // L: 4152
											} else {
												return 2; // L: 4154
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
}
