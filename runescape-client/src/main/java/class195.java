import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gn")
public class class195 {
	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -1672788449
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "1282000590"
	)
	static int method3821(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 3554
			var3 = class90.Client_plane; // L: 3555
			int var15 = (UserComparator9.localPlayer.x >> 7) + GrandExchangeOfferNameComparator.baseX; // L: 3556
			int var8 = (UserComparator9.localPlayer.y >> 7) + NetCache.baseY; // L: 3557
			WorldMapSection0.getWorldMap().method6530(var3, var15, var8, true); // L: 3558
			return 1; // L: 3559
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 3561
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3562
				String var16 = ""; // L: 3563
				var9 = WorldMapSection0.getWorldMap().getMapArea(var3); // L: 3564
				if (var9 != null) { // L: 3565
					var16 = var9.getExternalName(); // L: 3566
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16; // L: 3568
				return 1; // L: 3569
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 3571
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3572
				WorldMapSection0.getWorldMap().setCurrentMapAreaId(var3); // L: 3573
				return 1; // L: 3574
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 3576
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getZoomLevel(); // L: 3577
				return 1; // L: 3578
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 3580
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3581
				WorldMapSection0.getWorldMap().setZoomPercentage(var3); // L: 3582
				return 1; // L: 3583
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 3585
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 3586
				return 1; // L: 3587
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 3589
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3590
					WorldMapSection0.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 3591
					return 1; // L: 3592
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 3594
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3595
					WorldMapSection0.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 3596
					return 1; // L: 3597
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 3599
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3600
					WorldMapSection0.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 3601
					return 1; // L: 3602
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 3604
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3605
					WorldMapSection0.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 3606
					return 1; // L: 3607
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 3609
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getDisplayX(); // L: 3610
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getDisplayY(); // L: 3611
					return 1; // L: 3612
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 3614
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3615
						var11 = WorldMapSection0.getWorldMap().getMapArea(var3); // L: 3616
						if (var11 == null) { // L: 3617
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3618
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 3621
						}

						return 1; // L: 3623
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 3625
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3626
						var11 = WorldMapSection0.getWorldMap().getMapArea(var3); // L: 3627
						if (var11 == null) { // L: 3628
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3629
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3630
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 3633
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 3634
						}

						return 1; // L: 3636
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 3638
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3639
						var11 = WorldMapSection0.getWorldMap().getMapArea(var3); // L: 3640
						if (var11 == null) { // L: 3641
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3642
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3643
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3644
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3645
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 3648
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 3649
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 3650
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 3651
						}

						return 1; // L: 3653
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 3655
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3656
						var11 = WorldMapSection0.getWorldMap().getMapArea(var3); // L: 3657
						if (var11 == null) { // L: 3658
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3659
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 3662
						}

						return 1; // L: 3664
					} else if (var0 == 6615) { // L: 3666
						var14 = WorldMapSection0.getWorldMap().getDisplayCoord(); // L: 3667
						if (var14 == null) { // L: 3668
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3669
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3670
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x; // L: 3673
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y; // L: 3674
						}

						return 1; // L: 3676
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 3678
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().currentMapAreaId(); // L: 3679
						return 1; // L: 3680
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 3682
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3683
						var11 = WorldMapSection0.getWorldMap().getCurrentMapArea(); // L: 3684
						if (var11 == null) { // L: 3685
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3686
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3687
							return 1; // L: 3688
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 3690
							if (var12 == null) { // L: 3691
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3692
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3693
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[0]; // L: 3696
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[1]; // L: 3697
							}

							return 1; // L: 3699
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 3701
							var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3702
							var11 = WorldMapSection0.getWorldMap().getCurrentMapArea(); // L: 3703
							if (var11 == null) { // L: 3704
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3705
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3706
								return 1; // L: 3707
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 3709
								if (var5 == null) { // L: 3710
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3711
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 3714
								}

								return 1; // L: 3716
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 3718
								Interpreter.Interpreter_intStackSize -= 2; // L: 3719
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3720
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3721
								GraphicsObject.method2154(var3, var10, false); // L: 3722
								return 1; // L: 3723
							} else if (var0 == 6620) { // L: 3725
								Interpreter.Interpreter_intStackSize -= 2; // L: 3726
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3727
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3728
								GraphicsObject.method2154(var3, var10, true); // L: 3729
								return 1; // L: 3730
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 3732
								Interpreter.Interpreter_intStackSize -= 2; // L: 3733
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3734
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3735
								var9 = WorldMapSection0.getWorldMap().getMapArea(var3); // L: 3736
								if (var9 == null) { // L: 3737
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3738
									return 1; // L: 3739
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 3741
									return 1; // L: 3742
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 3744
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getDisplayWith(); // L: 3745
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getDisplayHeight(); // L: 3746
								return 1; // L: 3747
							} else if (var0 == 6623) { // L: 3749
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3750
								var11 = WorldMapSection0.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 3751
								if (var11 == null) { // L: 3752
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3753
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId(); // L: 3756
								}

								return 1; // L: 3758
							} else if (var0 == 6624) { // L: 3760
								WorldMapSection0.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3761
								return 1; // L: 3762
							} else if (var0 == 6625) { // L: 3764
								WorldMapSection0.getWorldMap().resetMaxFlashCount(); // L: 3765
								return 1; // L: 3766
							} else if (var0 == 6626) { // L: 3768
								WorldMapSection0.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3769
								return 1; // L: 3770
							} else if (var0 == 6627) { // L: 3772
								WorldMapSection0.getWorldMap().resetCyclesPerFlash(); // L: 3773
								return 1; // L: 3774
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 3776
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3777
									WorldMapSection0.getWorldMap().setPerpetualFlash(var13); // L: 3778
									return 1; // L: 3779
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 3781
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3782
									WorldMapSection0.getWorldMap().flashElement(var3); // L: 3783
									return 1; // L: 3784
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 3786
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3787
									WorldMapSection0.getWorldMap().flashCategory(var3); // L: 3788
									return 1; // L: 3789
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 3791
									WorldMapSection0.getWorldMap().stopCurrentFlashes(); // L: 3792
									return 1; // L: 3793
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 3795
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3796
									WorldMapSection0.getWorldMap().setElementsDisabled(var13); // L: 3797
									return 1; // L: 3798
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 3800
										Interpreter.Interpreter_intStackSize -= 2; // L: 3801
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3802
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3803
										WorldMapSection0.getWorldMap().disableElement(var3, var7); // L: 3804
										return 1; // L: 3805
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 3807
										Interpreter.Interpreter_intStackSize -= 2; // L: 3808
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3809
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3810
										WorldMapSection0.getWorldMap().setCategoryDisabled(var3, var7); // L: 3811
										return 1; // L: 3812
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 3814
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 3815
										return 1; // L: 3816
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 3818
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3819
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 3820
										return 1; // L: 3821
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 3823
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3824
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 3825
										return 1; // L: 3826
									} else if (var0 == 6638) { // L: 3828
										Interpreter.Interpreter_intStackSize -= 2; // L: 3829
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3830
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3831
										var5 = WorldMapSection0.getWorldMap().method6643(var3, var10); // L: 3832
										if (var5 == null) { // L: 3833
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3834
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 3837
										}

										return 1; // L: 3839
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 3841
											var6 = WorldMapSection0.getWorldMap().iconStart(); // L: 3842
											if (var6 == null) { // L: 3843
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3844
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3845
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 3848
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 3849
											}

											return 1; // L: 3851
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 3853
											var6 = WorldMapSection0.getWorldMap().iconNext(); // L: 3854
											if (var6 == null) { // L: 3855
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3856
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3857
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 3860
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 3861
											}

											return 1; // L: 3863
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 3865
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3866
												var4 = InvDefinition.WorldMapElement_get(var3); // L: 3867
												if (var4.name == null) { // L: 3868
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3869
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name; // L: 3872
												}

												return 1; // L: 3874
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 3876
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3877
												var4 = InvDefinition.WorldMapElement_get(var3); // L: 3878
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize; // L: 3879
												return 1; // L: 3880
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 3882
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3883
												var4 = InvDefinition.WorldMapElement_get(var3); // L: 3884
												if (var4 == null) { // L: 3885
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3886
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category; // L: 3889
												}

												return 1; // L: 3891
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 3893
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3894
												var4 = InvDefinition.WorldMapElement_get(var3); // L: 3895
												if (var4 == null) { // L: 3896
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3897
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1; // L: 3900
												}

												return 1; // L: 3902
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 3904
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.mapElement; // L: 3905
												return 1; // L: 3906
											} else if (var0 == 6698) { // L: 3908
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord1.packed(); // L: 3909
												return 1; // L: 3910
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 3912
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord2.packed(); // L: 3913
												return 1; // L: 3914
											} else {
												return 2; // L: 3916
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
