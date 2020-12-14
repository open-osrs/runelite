import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
public final class class52 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Llw;",
		garbageValue = "1066778190"
	)
	public static PrivateChatMode method840(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field3834, PrivateChatMode.field3833, PrivateChatMode.field3832}; // L: 18
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field3835) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-677680032"
	)
	public static boolean method844(int var0) {
		return (var0 >> 30 & 1) != 0; // L: 29
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "2036711787"
	)
	static int method845(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 3536
			var3 = GameObject.Client_plane; // L: 3537
			int var15 = (PlayerComposition.localPlayer.x >> 7) + NetFileRequest.baseX; // L: 3538
			int var8 = (PlayerComposition.localPlayer.y >> 7) + class41.baseY; // L: 3539
			Actor.getWorldMap().method6370(var3, var15, var8, true); // L: 3540
			return 1; // L: 3541
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 3543
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3544
				String var16 = ""; // L: 3545
				var9 = Actor.getWorldMap().getMapArea(var3); // L: 3546
				if (var9 != null) { // L: 3547
					var16 = var9.getExternalName(); // L: 3548
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16; // L: 3550
				return 1; // L: 3551
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 3553
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3554
				Actor.getWorldMap().setCurrentMapAreaId(var3); // L: 3555
				return 1; // L: 3556
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 3558
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getZoomLevel(); // L: 3559
				return 1; // L: 3560
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 3562
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3563
				Actor.getWorldMap().setZoomPercentage(var3); // L: 3564
				return 1; // L: 3565
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 3567
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 3568
				return 1; // L: 3569
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 3571
					var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 3572
					Actor.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 3573
					return 1; // L: 3574
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 3576
					var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 3577
					Actor.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 3578
					return 1; // L: 3579
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 3581
					var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 3582
					Actor.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 3583
					return 1; // L: 3584
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 3586
					var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 3587
					Actor.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 3588
					return 1; // L: 3589
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 3591
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayX(); // L: 3592
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayY(); // L: 3593
					return 1; // L: 3594
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 3596
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3597
						var11 = Actor.getWorldMap().getMapArea(var3); // L: 3598
						if (var11 == null) { // L: 3599
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3600
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 3603
						}

						return 1; // L: 3605
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 3607
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3608
						var11 = Actor.getWorldMap().getMapArea(var3); // L: 3609
						if (var11 == null) { // L: 3610
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3611
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3612
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 3615
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 3616
						}

						return 1; // L: 3618
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 3620
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3621
						var11 = Actor.getWorldMap().getMapArea(var3); // L: 3622
						if (var11 == null) { // L: 3623
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3624
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3625
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3626
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3627
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 3630
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 3631
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 3632
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 3633
						}

						return 1; // L: 3635
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 3637
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3638
						var11 = Actor.getWorldMap().getMapArea(var3); // L: 3639
						if (var11 == null) { // L: 3640
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3641
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 3644
						}

						return 1; // L: 3646
					} else if (var0 == 6615) { // L: 3648
						var14 = Actor.getWorldMap().getDisplayCoord(); // L: 3649
						if (var14 == null) { // L: 3650
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3651
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3652
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var14.x; // L: 3655
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var14.y; // L: 3656
						}

						return 1; // L: 3658
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 3660
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().currentMapAreaId(); // L: 3661
						return 1; // L: 3662
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 3664
						var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 3665
						var11 = Actor.getWorldMap().getCurrentMapArea(); // L: 3666
						if (var11 == null) { // L: 3667
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3668
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3669
							return 1; // L: 3670
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 3672
							if (var12 == null) { // L: 3673
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3674
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3675
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var12[0]; // L: 3678
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var12[1]; // L: 3679
							}

							return 1; // L: 3681
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 3683
							var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 3684
							var11 = Actor.getWorldMap().getCurrentMapArea(); // L: 3685
							if (var11 == null) { // L: 3686
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3687
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3688
								return 1; // L: 3689
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 3691
								if (var5 == null) { // L: 3692
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3693
								} else {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var5.packed(); // L: 3696
								}

								return 1; // L: 3698
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 3700
								VarcInt.Interpreter_intStackSize -= 2; // L: 3701
								var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3702
								var10 = new Coord(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]); // L: 3703
								class204.method3721(var3, var10, false); // L: 3704
								return 1; // L: 3705
							} else if (var0 == 6620) { // L: 3707
								VarcInt.Interpreter_intStackSize -= 2; // L: 3708
								var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3709
								var10 = new Coord(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]); // L: 3710
								class204.method3721(var3, var10, true); // L: 3711
								return 1; // L: 3712
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 3714
								VarcInt.Interpreter_intStackSize -= 2; // L: 3715
								var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3716
								var10 = new Coord(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]); // L: 3717
								var9 = Actor.getWorldMap().getMapArea(var3); // L: 3718
								if (var9 == null) { // L: 3719
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3720
									return 1; // L: 3721
								} else {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 3723
									return 1; // L: 3724
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 3726
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayWith(); // L: 3727
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayHeight(); // L: 3728
								return 1; // L: 3729
							} else if (var0 == 6623) { // L: 3731
								var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 3732
								var11 = Actor.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 3733
								if (var11 == null) { // L: 3734
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3735
								} else {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getId(); // L: 3738
								}

								return 1; // L: 3740
							} else if (var0 == 6624) { // L: 3742
								Actor.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 3743
								return 1; // L: 3744
							} else if (var0 == 6625) { // L: 3746
								Actor.getWorldMap().resetMaxFlashCount(); // L: 3747
								return 1; // L: 3748
							} else if (var0 == 6626) { // L: 3750
								Actor.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 3751
								return 1; // L: 3752
							} else if (var0 == 6627) { // L: 3754
								Actor.getWorldMap().resetCyclesPerFlash(); // L: 3755
								return 1; // L: 3756
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 3758
									var13 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 3759
									Actor.getWorldMap().setPerpetualFlash(var13); // L: 3760
									return 1; // L: 3761
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 3763
									var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3764
									Actor.getWorldMap().flashElement(var3); // L: 3765
									return 1; // L: 3766
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 3768
									var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3769
									Actor.getWorldMap().flashCategory(var3); // L: 3770
									return 1; // L: 3771
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 3773
									Actor.getWorldMap().stopCurrentFlashes(); // L: 3774
									return 1; // L: 3775
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 3777
									var13 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 3778
									Actor.getWorldMap().setElementsDisabled(var13); // L: 3779
									return 1; // L: 3780
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 3782
										VarcInt.Interpreter_intStackSize -= 2; // L: 3783
										var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3784
										var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1] == 1; // L: 3785
										Actor.getWorldMap().disableElement(var3, var7); // L: 3786
										return 1; // L: 3787
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 3789
										VarcInt.Interpreter_intStackSize -= 2; // L: 3790
										var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3791
										var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1] == 1; // L: 3792
										Actor.getWorldMap().setCategoryDisabled(var3, var7); // L: 3793
										return 1; // L: 3794
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 3796
										Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 3797
										return 1; // L: 3798
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 3800
										var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3801
										Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 3802
										return 1; // L: 3803
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 3805
										var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3806
										Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 3807
										return 1; // L: 3808
									} else if (var0 == 6638) { // L: 3810
										VarcInt.Interpreter_intStackSize -= 2; // L: 3811
										var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3812
										var10 = new Coord(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]); // L: 3813
										var5 = Actor.getWorldMap().method6414(var3, var10); // L: 3814
										if (var5 == null) { // L: 3815
											Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3816
										} else {
											Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var5.packed(); // L: 3819
										}

										return 1; // L: 3821
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 3823
											var6 = Actor.getWorldMap().iconStart(); // L: 3824
											if (var6 == null) { // L: 3825
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3826
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3827
											} else {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.getElement(); // L: 3830
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 3831
											}

											return 1; // L: 3833
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 3835
											var6 = Actor.getWorldMap().iconNext(); // L: 3836
											if (var6 == null) { // L: 3837
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3838
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3839
											} else {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.getElement(); // L: 3842
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 3843
											}

											return 1; // L: 3845
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 3847
												var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3848
												var4 = UserComparator10.WorldMapElement_get(var3); // L: 3849
												if (var4.name == null) { // L: 3850
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3851
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name; // L: 3854
												}

												return 1; // L: 3856
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 3858
												var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3859
												var4 = UserComparator10.WorldMapElement_get(var3); // L: 3860
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.textSize; // L: 3861
												return 1; // L: 3862
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 3864
												var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3865
												var4 = UserComparator10.WorldMapElement_get(var3); // L: 3866
												if (var4 == null) { // L: 3867
													Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3868
												} else {
													Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.category; // L: 3871
												}

												return 1; // L: 3873
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 3875
												var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3876
												var4 = UserComparator10.WorldMapElement_get(var3); // L: 3877
												if (var4 == null) { // L: 3878
													Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3879
												} else {
													Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.sprite1; // L: 3882
												}

												return 1; // L: 3884
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 3886
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Script.worldMapEvent.mapElement; // L: 3887
												return 1; // L: 3888
											} else if (var0 == 6698) { // L: 3890
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Script.worldMapEvent.coord1.packed(); // L: 3891
												return 1; // L: 3892
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 3894
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Script.worldMapEvent.coord2.packed(); // L: 3895
												return 1; // L: 3896
											} else {
												return 2; // L: 3898
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
