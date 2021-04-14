import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hz")
public class class227 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("huffman")
	static Huffman huffman;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZB)I",
		garbageValue = "0"
	)
	static int method4327(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 3742
			var3 = class26.Client_plane; // L: 3743
			int var15 = (Varcs.localPlayer.x >> 7) + ItemLayer.baseX; // L: 3744
			int var8 = (Varcs.localPlayer.y >> 7) + Tile.baseY; // L: 3745
			Actor.getWorldMap().method6116(var3, var15, var8, true); // L: 3746
			return 1; // L: 3747
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 3749
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3750
				String var16 = ""; // L: 3751
				var9 = Actor.getWorldMap().getMapArea(var3); // L: 3752
				if (var9 != null) { // L: 3753
					var16 = var9.getExternalName(); // L: 3754
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16; // L: 3756
				return 1; // L: 3757
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 3759
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3760
				Actor.getWorldMap().setCurrentMapAreaId(var3); // L: 3761
				return 1; // L: 3762
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 3764
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Actor.getWorldMap().getZoomLevel(); // L: 3765
				return 1; // L: 3766
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 3768
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3769
				Actor.getWorldMap().setZoomPercentage(var3); // L: 3770
				return 1; // L: 3771
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 3773
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Actor.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 3774
				return 1; // L: 3775
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 3777
					var14 = new Coord(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 3778
					Actor.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 3779
					return 1; // L: 3780
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 3782
					var14 = new Coord(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 3783
					Actor.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 3784
					return 1; // L: 3785
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 3787
					var14 = new Coord(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 3788
					Actor.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 3789
					return 1; // L: 3790
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 3792
					var14 = new Coord(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 3793
					Actor.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 3794
					return 1; // L: 3795
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 3797
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayX(); // L: 3798
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayY(); // L: 3799
					return 1; // L: 3800
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 3802
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3803
						var11 = Actor.getWorldMap().getMapArea(var3); // L: 3804
						if (var11 == null) { // L: 3805
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3806
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 3809
						}

						return 1; // L: 3811
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 3813
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3814
						var11 = Actor.getWorldMap().getMapArea(var3); // L: 3815
						if (var11 == null) { // L: 3816
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3817
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3818
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 3821
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 3822
						}

						return 1; // L: 3824
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 3826
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3827
						var11 = Actor.getWorldMap().getMapArea(var3); // L: 3828
						if (var11 == null) { // L: 3829
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3830
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3831
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3832
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3833
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 3836
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 3837
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 3838
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 3839
						}

						return 1; // L: 3841
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 3843
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3844
						var11 = Actor.getWorldMap().getMapArea(var3); // L: 3845
						if (var11 == null) { // L: 3846
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3847
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 3850
						}

						return 1; // L: 3852
					} else if (var0 == 6615) { // L: 3854
						var14 = Actor.getWorldMap().getDisplayCoord(); // L: 3855
						if (var14 == null) { // L: 3856
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3857
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3858
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var14.x; // L: 3861
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var14.y; // L: 3862
						}

						return 1; // L: 3864
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 3866
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Actor.getWorldMap().currentMapAreaId(); // L: 3867
						return 1; // L: 3868
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 3870
						var14 = new Coord(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 3871
						var11 = Actor.getWorldMap().getCurrentMapArea(); // L: 3872
						if (var11 == null) { // L: 3873
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3874
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3875
							return 1; // L: 3876
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 3878
							if (var12 == null) { // L: 3879
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3880
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3881
							} else {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var12[0]; // L: 3884
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var12[1]; // L: 3885
							}

							return 1; // L: 3887
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 3889
							var14 = new Coord(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 3890
							var11 = Actor.getWorldMap().getCurrentMapArea(); // L: 3891
							if (var11 == null) { // L: 3892
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3893
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3894
								return 1; // L: 3895
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 3897
								if (var5 == null) { // L: 3898
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3899
								} else {
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var5.packed(); // L: 3902
								}

								return 1; // L: 3904
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 3906
								class16.Interpreter_intStackSize -= 2; // L: 3907
								var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3908
								var10 = new Coord(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]); // L: 3909
								class2.method37(var3, var10, false); // L: 3910
								return 1; // L: 3911
							} else if (var0 == 6620) { // L: 3913
								class16.Interpreter_intStackSize -= 2; // L: 3914
								var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3915
								var10 = new Coord(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]); // L: 3916
								class2.method37(var3, var10, true); // L: 3917
								return 1; // L: 3918
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 3920
								class16.Interpreter_intStackSize -= 2; // L: 3921
								var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3922
								var10 = new Coord(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]); // L: 3923
								var9 = Actor.getWorldMap().getMapArea(var3); // L: 3924
								if (var9 == null) { // L: 3925
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3926
									return 1; // L: 3927
								} else {
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 3929
									return 1; // L: 3930
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 3932
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayWith(); // L: 3933
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayHeight(); // L: 3934
								return 1; // L: 3935
							} else if (var0 == 6623) { // L: 3937
								var14 = new Coord(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 3938
								var11 = Actor.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 3939
								if (var11 == null) { // L: 3940
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3941
								} else {
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var11.getId(); // L: 3944
								}

								return 1; // L: 3946
							} else if (var0 == 6624) { // L: 3948
								Actor.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 3949
								return 1; // L: 3950
							} else if (var0 == 6625) { // L: 3952
								Actor.getWorldMap().resetMaxFlashCount(); // L: 3953
								return 1; // L: 3954
							} else if (var0 == 6626) { // L: 3956
								Actor.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 3957
								return 1; // L: 3958
							} else if (var0 == 6627) { // L: 3960
								Actor.getWorldMap().resetCyclesPerFlash(); // L: 3961
								return 1; // L: 3962
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 3964
									var13 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 3965
									Actor.getWorldMap().setPerpetualFlash(var13); // L: 3966
									return 1; // L: 3967
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 3969
									var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3970
									Actor.getWorldMap().flashElement(var3); // L: 3971
									return 1; // L: 3972
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 3974
									var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3975
									Actor.getWorldMap().flashCategory(var3); // L: 3976
									return 1; // L: 3977
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 3979
									Actor.getWorldMap().stopCurrentFlashes(); // L: 3980
									return 1; // L: 3981
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 3983
									var13 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 3984
									Actor.getWorldMap().setElementsDisabled(var13); // L: 3985
									return 1; // L: 3986
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 3988
										class16.Interpreter_intStackSize -= 2; // L: 3989
										var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3990
										var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1] == 1; // L: 3991
										Actor.getWorldMap().disableElement(var3, var7); // L: 3992
										return 1; // L: 3993
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 3995
										class16.Interpreter_intStackSize -= 2; // L: 3996
										var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3997
										var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1] == 1; // L: 3998
										Actor.getWorldMap().setCategoryDisabled(var3, var7); // L: 3999
										return 1; // L: 4000
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4002
										Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Actor.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4003
										return 1; // L: 4004
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4006
										var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 4007
										Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Actor.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4008
										return 1; // L: 4009
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4011
										var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 4012
										Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Actor.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4013
										return 1; // L: 4014
									} else if (var0 == 6638) { // L: 4016
										class16.Interpreter_intStackSize -= 2; // L: 4017
										var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 4018
										var10 = new Coord(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]); // L: 4019
										var5 = Actor.getWorldMap().method6130(var3, var10); // L: 4020
										if (var5 == null) { // L: 4021
											Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 4022
										} else {
											Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var5.packed(); // L: 4025
										}

										return 1; // L: 4027
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4029
											var6 = Actor.getWorldMap().iconStart(); // L: 4030
											if (var6 == null) { // L: 4031
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 4032
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 4033
											} else {
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4036
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4037
											}

											return 1; // L: 4039
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4041
											var6 = Actor.getWorldMap().iconNext(); // L: 4042
											if (var6 == null) { // L: 4043
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 4044
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 4045
											} else {
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4048
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4049
											}

											return 1; // L: 4051
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4053
												var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 4054
												var4 = ByteArrayPool.WorldMapElement_get(var3); // L: 4055
												if (var4.name == null) { // L: 4056
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4057
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name; // L: 4060
												}

												return 1; // L: 4062
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4064
												var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 4065
												var4 = ByteArrayPool.WorldMapElement_get(var3); // L: 4066
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.textSize; // L: 4067
												return 1; // L: 4068
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4070
												var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 4071
												var4 = ByteArrayPool.WorldMapElement_get(var3); // L: 4072
												if (var4 == null) { // L: 4073
													Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 4074
												} else {
													Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.category; // L: 4077
												}

												return 1; // L: 4079
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4081
												var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 4082
												var4 = ByteArrayPool.WorldMapElement_get(var3); // L: 4083
												if (var4 == null) { // L: 4084
													Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 4085
												} else {
													Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4088
												}

												return 1; // L: 4090
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4092
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = UrlRequest.worldMapEvent.mapElement; // L: 4093
												return 1; // L: 4094
											} else if (var0 == 6698) { // L: 4096
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = UrlRequest.worldMapEvent.coord1.packed(); // L: 4097
												return 1; // L: 4098
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4100
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = UrlRequest.worldMapEvent.coord2.packed(); // L: 4101
												return 1; // L: 4102
											} else {
												return 2; // L: 4104
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
