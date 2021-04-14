import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aj")
public final class class32 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "-634814317"
	)
	static int method394(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 471
			class16.Interpreter_intStackSize -= 3; // L: 472
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 473
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 474
			int var11 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 475
			if (var4 == 0) { // L: 476
				throw new RuntimeException(); // L: 477
			} else {
				Widget var6 = class139.getWidget(var9); // L: 479
				if (var6.children == null) { // L: 480
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 481
					Widget[] var7 = new Widget[var11 + 1]; // L: 482

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 483
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 484
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 486
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 487
					var12.type = var4; // L: 488
					var12.parentId = var12.id = var6.id; // L: 489
					var12.childIndex = var11; // L: 490
					var12.isIf3 = true; // L: 491
					var6.children[var11] = var12; // L: 492
					if (var2) { // L: 493
						FriendSystem.scriptDotWidget = var12;
					} else {
						class4.scriptActiveWidget = var12; // L: 494
					}

					class29.invalidateWidget(var6); // L: 495
					return 1; // L: 496
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 498
				var3 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 499
				Widget var10 = class139.getWidget(var3.id); // L: 500
				var10.children[var3.childIndex] = null; // L: 501
				class29.invalidateWidget(var10); // L: 502
				return 1; // L: 503
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 505
				var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 506
				var3.children = null; // L: 507
				class29.invalidateWidget(var3); // L: 508
				return 1; // L: 509
			} else if (var0 == 103) { // L: 511
				class16.Interpreter_intStackSize -= 3; // L: 512
				return 1; // L: 513
			} else if (var0 == 104) { // L: 515
				--class16.Interpreter_intStackSize; // L: 516
				return 1; // L: 517
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 519
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 532
					var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 533
					if (var3 != null) { // L: 534
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1; // L: 535
						if (var2) { // L: 536
							FriendSystem.scriptDotWidget = var3;
						} else {
							class4.scriptActiveWidget = var3; // L: 537
						}
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 539
					}

					return 1; // L: 540
				} else if (var0 == 202) { // L: 542
					Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1] = 0; // L: 543
					return 1; // L: 544
				} else if (var0 == 203) { // L: 546
					Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize + 1] = 0; // L: 547
					return 1; // L: 548
				} else {
					return 2; // L: 550
				}
			} else {
				class16.Interpreter_intStackSize -= 2; // L: 520
				var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 521
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 522
				Widget var5 = class231.getWidgetChild(var9, var4); // L: 523
				if (var5 != null && var4 != -1) { // L: 524
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1; // L: 525
					if (var2) { // L: 526
						FriendSystem.scriptDotWidget = var5;
					} else {
						class4.scriptActiveWidget = var5; // L: 527
					}
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 529
				}

				return 1; // L: 530
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1817166338"
	)
	static void method393(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Lkq;Lkq;I)V",
		garbageValue = "-652668563"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (InterfaceParent.canvasWidth - 765) / 2; // L: 733
		Login.loginBoxX = Login.xPadding + 202; // L: 734
		GraphicsObject.loginBoxCenter = Login.loginBoxX + 180; // L: 735
		byte var3;
		int var4;
		int var9;
		int var11;
		int var26;
		int var27;
		int var32;
		int var39;
		if (Login.worldSelectOpen) { // L: 736
			if (Tile.worldSelectBackSprites == null) { // L: 738
				Tile.worldSelectBackSprites = class124.method2492(SoundSystem.archive8, "sl_back", "");
			}

			if (ByteArrayPool.worldSelectFlagSprites == null) { // L: 739
				ByteArrayPool.worldSelectFlagSprites = Players.method2284(SoundSystem.archive8, "sl_flags", "");
			}

			if (class6.worldSelectArrows == null) { // L: 740
				class6.worldSelectArrows = Players.method2284(SoundSystem.archive8, "sl_arrows", "");
			}

			if (class13.worldSelectStars == null) { // L: 741
				class13.worldSelectStars = Players.method2284(SoundSystem.archive8, "sl_stars", "");
			}

			if (World.worldSelectLeftSprite == null) { // L: 742
				World.worldSelectLeftSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(SoundSystem.archive8, "leftarrow", "");
			}

			if (Interpreter.worldSelectRightSprite == null) { // L: 743
				Interpreter.worldSelectRightSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(SoundSystem.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 744
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 745
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 746
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 747
			if (class13.worldSelectStars != null) { // L: 748
				class13.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 749
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 750
				class13.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 751
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 752
			}

			int var40;
			if (class6.worldSelectArrows != null) { // L: 754
				var32 = Login.xPadding + 280; // L: 755
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 756
					class6.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					class6.worldSelectArrows[0].drawAt(var32, 4); // L: 757
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 758
					class6.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					class6.worldSelectArrows[1].drawAt(var32 + 15, 4); // L: 759
				}

				var0.draw("World", var32 + 32, 17, 16777215, -1); // L: 760
				var4 = Login.xPadding + 390; // L: 761
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 762
					class6.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class6.worldSelectArrows[0].drawAt(var4, 4); // L: 763
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 764
					class6.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class6.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 765
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 766
				var40 = Login.xPadding + 500; // L: 767
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 768
					class6.worldSelectArrows[2].drawAt(var40, 4);
				} else {
					class6.worldSelectArrows[0].drawAt(var40, 4); // L: 769
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 770
					class6.worldSelectArrows[3].drawAt(var40 + 15, 4);
				} else {
					class6.worldSelectArrows[1].drawAt(var40 + 15, 4); // L: 771
				}

				var0.draw("Location", var40 + 32, 17, 16777215, -1); // L: 772
				var27 = Login.xPadding + 610; // L: 773
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 774
					class6.worldSelectArrows[2].drawAt(var27, 4);
				} else {
					class6.worldSelectArrows[0].drawAt(var27, 4); // L: 775
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 776
					class6.worldSelectArrows[3].drawAt(var27 + 15, 4);
				} else {
					class6.worldSelectArrows[1].drawAt(var27 + 15, 4); // L: 777
				}

				var0.draw("Type", var27 + 32, 17, 16777215, -1); // L: 778
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 780
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 781
			Login.hoveredWorldIndex = -1; // L: 782
			if (Tile.worldSelectBackSprites != null) { // L: 783
				var3 = 88; // L: 784
				byte var34 = 19; // L: 785
				var40 = 765 / (var3 + 1) - 1; // L: 786
				var27 = 480 / (var34 + 1); // L: 787

				do {
					var39 = var27; // L: 789
					var26 = var40; // L: 790
					if (var27 * (var40 - 1) >= World.World_count) { // L: 791
						--var40;
					}

					if (var40 * (var27 - 1) >= World.World_count) { // L: 792
						--var27;
					}

					if (var40 * (var27 - 1) >= World.World_count) { // L: 793
						--var27;
					}
				} while(var39 != var27 || var40 != var26); // L: 794

				var39 = (765 - var3 * var40) / (var40 + 1); // L: 796
				if (var39 > 5) { // L: 797
					var39 = 5;
				}

				var26 = (480 - var27 * var34) / (var27 + 1); // L: 798
				if (var26 > 5) { // L: 799
					var26 = 5;
				}

				var9 = (765 - var3 * var40 - var39 * (var40 - 1)) / 2; // L: 800
				int var29 = (480 - var34 * var27 - var26 * (var27 - 1)) / 2; // L: 801
				var11 = (var27 + World.World_count - 1) / var27; // L: 802
				Login.worldSelectPagesCount = var11 - var40; // L: 803
				if (World.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 804
					World.worldSelectLeftSprite.drawAt(8, GameEngine.canvasHeight / 2 - World.worldSelectLeftSprite.subHeight / 2); // L: 805
				}

				if (Interpreter.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 807
					Interpreter.worldSelectRightSprite.drawAt(InterfaceParent.canvasWidth - Interpreter.worldSelectRightSprite.subWidth - 8, GameEngine.canvasHeight / 2 - Interpreter.worldSelectRightSprite.subHeight / 2); // L: 808
				}

				int var36 = var29 + 23; // L: 810
				int var13 = var9 + Login.xPadding; // L: 811
				int var14 = 0; // L: 812
				boolean var15 = false; // L: 813
				int var16 = Login.worldSelectPage; // L: 814

				int var17;
				for (var17 = var16 * var27; var17 < World.World_count && var16 - Login.worldSelectPage < var40; ++var17) { // L: 815 816
					World var18 = class9.World_worlds[var17]; // L: 819
					boolean var19 = true; // L: 820
					String var20 = Integer.toString(var18.population); // L: 821
					if (var18.population == -1) { // L: 822
						var20 = "OFF"; // L: 823
						var19 = false; // L: 824
					} else if (var18.population > 1980) { // L: 826
						var20 = "FULL"; // L: 827
						var19 = false; // L: 828
					}

					int var22 = 0; // L: 831
					byte var21;
					if (var18.isBeta()) { // L: 832
						if (var18.isMembersOnly()) { // L: 833
							var21 = 7;
						} else {
							var21 = 6; // L: 834
						}
					} else if (var18.isDeadman()) { // L: 836
						var22 = 16711680; // L: 837
						if (var18.isMembersOnly()) { // L: 838
							var21 = 5;
						} else {
							var21 = 4; // L: 839
						}
					} else if (var18.method1677()) { // L: 841
						if (var18.isMembersOnly()) { // L: 842
							var21 = 9;
						} else {
							var21 = 8; // L: 843
						}
					} else if (var18.isPvp()) { // L: 845
						if (var18.isMembersOnly()) { // L: 846
							var21 = 3;
						} else {
							var21 = 2; // L: 847
						}
					} else if (var18.isMembersOnly()) { // L: 850
						var21 = 1;
					} else {
						var21 = 0; // L: 851
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var36 && MouseHandler.MouseHandler_x < var13 + var3 && MouseHandler.MouseHandler_y < var34 + var36 && var19) { // L: 853
						Login.hoveredWorldIndex = var17; // L: 854
						Tile.worldSelectBackSprites[var21].drawTransOverlayAt(var13, var36, 128, 16777215); // L: 855
						var15 = true; // L: 856
					} else {
						Tile.worldSelectBackSprites[var21].drawAt(var13, var36); // L: 858
					}

					if (ByteArrayPool.worldSelectFlagSprites != null) { // L: 859
						ByteArrayPool.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var36);
					}

					var0.drawCentered(Integer.toString(var18.id), var13 + 15, var34 / 2 + var36 + 5, var22, -1); // L: 860
					var1.drawCentered(var20, var13 + 60, var34 / 2 + var36 + 5, 268435455, -1); // L: 861
					var36 = var36 + var34 + var26; // L: 862
					++var14; // L: 863
					if (var14 >= var27) {
						var36 = var29 + 23; // L: 864
						var13 = var13 + var39 + var3; // L: 865
						var14 = 0; // L: 866
						++var16; // L: 867
					}
				}

				if (var15) { // L: 870
					var17 = var1.stringWidth(class9.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 871
					int var30 = var1.ascent + 8; // L: 872
					int var37 = MouseHandler.MouseHandler_y + 25; // L: 873
					if (var30 + var37 > 480) { // L: 874
						var37 = MouseHandler.MouseHandler_y - 25 - var30; // L: 875
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var30, 16777120); // L: 877
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var30, 0); // L: 878
					var1.drawCentered(class9.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var37 + var1.ascent + 4, 0, -1); // L: 879
				}
			}

			GameEngine.rasterProvider.drawFull(0, 0); // L: 882
		} else {
			Client.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 886
			ArchiveDiskActionHandler.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 887
			class125.logoSprite.drawAt(Login.xPadding + 382 - class125.logoSprite.subWidth / 2, 18); // L: 888
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 889
				var3 = 20; // L: 890
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 891
				var4 = 253 - var3; // L: 892
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 893
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 894
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 895
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 896
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 897
			}

			String var5;
			String var7;
			String var8;
			char[] var10;
			short var31;
			short var33;
			if (Client.gameState == 20) { // L: 899
				TileItem.titleboxSprite.drawAt(Login.loginBoxX + 180 - TileItem.titleboxSprite.subWidth / 2, 271 - TileItem.titleboxSprite.subHeight / 2); // L: 900
				var31 = 201; // L: 901
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 902
				var32 = var31 + 15; // L: 903
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 904
				var32 += 15; // L: 905
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 906
				var32 += 15; // L: 907
				var32 += 7; // L: 908
				if (Login.loginIndex != 4) { // L: 909
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var32, 16777215, 0); // L: 910
					var33 = 200; // L: 911

					for (var5 = Players.method2283(); var0.stringWidth(var5) > var33; var5 = var5.substring(0, var5.length() - 1)) { // L: 912 913 914
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var32, 16777215, 0); // L: 916
					var32 += 15; // L: 917
					var7 = Login.Login_password; // L: 919
					var9 = var7.length(); // L: 922
					var10 = new char[var9]; // L: 924

					for (var11 = 0; var11 < var9; ++var11) { // L: 925
						var10[var11] = '*';
					}

					var8 = new String(var10); // L: 926

					for (var8 = var8; var0.stringWidth(var8) > var33; var8 = var8.substring(1)) { // L: 930 931 932
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var32, 16777215, 0); // L: 934
					var32 += 15; // L: 935
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) { // L: 938
				TileItem.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 939
				short var23;
				if (Login.loginIndex == 0) { // L: 940
					var31 = 251; // L: 941
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var31, 16776960, 0); // L: 942
					var32 = var31 + 30; // L: 943
					var4 = Login.loginBoxX + 180 - 80; // L: 944
					var23 = 291; // L: 945
					Interpreter.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 946
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 947
					var4 = Login.loginBoxX + 180 + 80; // L: 948
					Interpreter.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 949
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 950
				} else if (Login.loginIndex == 1) { // L: 952
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 953
					var31 = 236; // L: 954
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 955
					var32 = var31 + 15; // L: 956
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 957
					var32 += 15; // L: 958
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 959
					var32 += 15; // L: 960
					var4 = Login.loginBoxX + 180 - 80; // L: 961
					var23 = 321; // L: 962
					Interpreter.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 963
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 964
					var4 = Login.loginBoxX + 180 + 80; // L: 965
					Interpreter.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 966
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 967
				} else {
					short var12;
					IndexedSprite var35;
					if (Login.loginIndex == 2) { // L: 969
						var31 = 201; // L: 970
						var0.drawCentered(Login.Login_response1, GraphicsObject.loginBoxCenter, var31, 16776960, 0); // L: 971
						var32 = var31 + 15; // L: 972
						var0.drawCentered(Login.Login_response2, GraphicsObject.loginBoxCenter, var32, 16776960, 0); // L: 973
						var32 += 15; // L: 974
						var0.drawCentered(Login.Login_response3, GraphicsObject.loginBoxCenter, var32, 16776960, 0); // L: 975
						var32 += 15; // L: 976
						var32 += 7; // L: 977
						var0.draw("Login: ", GraphicsObject.loginBoxCenter - 110, var32, 16777215, 0); // L: 978
						var33 = 200; // L: 979

						for (var5 = Players.method2283(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) { // L: 980 981 982
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? DefaultsGroup.colorStartTag(16776960) + "|" : ""), GraphicsObject.loginBoxCenter - 70, var32, 16777215, 0); // L: 984
						var32 += 15; // L: 985
						var7 = Login.Login_password; // L: 987
						var9 = var7.length(); // L: 990
						var10 = new char[var9]; // L: 992

						for (var11 = 0; var11 < var9; ++var11) { // L: 993
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 994

						for (var8 = var8; var0.stringWidth(var8) > var33; var8 = var8.substring(1)) { // L: 998 999 1000
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? DefaultsGroup.colorStartTag(16776960) + "|" : ""), GraphicsObject.loginBoxCenter - 108, var32, 16777215, 0); // L: 1002
						var32 += 15; // L: 1003
						var31 = 277; // L: 1004
						var9 = GraphicsObject.loginBoxCenter + -117; // L: 1005
						var35 = class12.method213(Client.Login_isUsernameRemembered, Login.field1003); // L: 1006
						var35.drawAt(var9, var31); // L: 1007
						var9 = var9 + var35.subWidth + 5; // L: 1008
						var1.draw("Remember username", var9, var31 + 13, 16776960, 0); // L: 1009
						var9 = GraphicsObject.loginBoxCenter + 24; // L: 1010
						var35 = class12.method213(Login.clientPreferences.hideUsername, Login.field1012); // L: 1011
						var35.drawAt(var9, var31); // L: 1012
						var9 = var9 + var35.subWidth + 5; // L: 1013
						var1.draw("Hide username", var9, var31 + 13, 16776960, 0); // L: 1014
						var32 = var31 + 15; // L: 1015
						var11 = GraphicsObject.loginBoxCenter - 80; // L: 1016
						var12 = 321; // L: 1017
						Interpreter.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1018
						var0.drawCentered("Login", var11, var12 + 5, 16777215, 0); // L: 1019
						var11 = GraphicsObject.loginBoxCenter + 80; // L: 1020
						Interpreter.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1021
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0); // L: 1022
						var31 = 357; // L: 1023
						switch(Login.field994) { // L: 1024
						case 2:
							class34.field229 = "Having trouble logging in?"; // L: 1026
							break;
						default:
							class34.field229 = "Can't login? Click here."; // L: 1029
						}

						ChatChannel.field1084 = new Bounds(GraphicsObject.loginBoxCenter, var31, var1.stringWidth(class34.field229), 11); // L: 1032
						ModeWhere.field3378 = new Bounds(GraphicsObject.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1033
						var1.drawCentered(class34.field229, GraphicsObject.loginBoxCenter, var31, 16777215, 0); // L: 1034
					} else if (Login.loginIndex == 3) { // L: 1036
						var31 = 201; // L: 1037
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1038
						var32 = var31 + 20; // L: 1039
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1040
						var32 += 15; // L: 1041
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1042
						var32 += 15; // L: 1043
						var4 = Login.loginBoxX + 180; // L: 1044
						var23 = 276; // L: 1045
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1046
						var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1047
						var4 = Login.loginBoxX + 180; // L: 1048
						var23 = 326; // L: 1049
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1050
						var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1051
					} else if (Login.loginIndex == 4) { // L: 1053
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1054
						var31 = 236; // L: 1055
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1056
						var32 = var31 + 15; // L: 1057
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1058
						var32 += 15; // L: 1059
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1060
						var32 += 15; // L: 1061
						var5 = "PIN: "; // L: 1063
						var7 = Bounds.otp; // L: 1065
						var9 = var7.length(); // L: 1068
						var10 = new char[var9]; // L: 1070

						for (var11 = 0; var11 < var9; ++var11) { // L: 1071
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 1072
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? DefaultsGroup.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var32, 16777215, 0); // L: 1076
						var32 -= 8; // L: 1077
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var32, 16776960, 0); // L: 1078
						var32 += 15; // L: 1079
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var32, 16776960, 0); // L: 1080
						var26 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1081
						var9 = var32 - var0.ascent; // L: 1082
						if (Login.field1005) { // L: 1084
							var35 = Skeleton.options_buttons_2Sprite; // L: 1085
						} else {
							var35 = TileItem.options_buttons_0Sprite; // L: 1088
						}

						var35.drawAt(var26, var9); // L: 1090
						var32 += 15; // L: 1091
						var11 = Login.loginBoxX + 180 - 80; // L: 1092
						var12 = 321; // L: 1093
						Interpreter.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1094
						var0.drawCentered("Continue", var11, var12 + 5, 16777215, 0); // L: 1095
						var11 = Login.loginBoxX + 180 + 80; // L: 1096
						Interpreter.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1097
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0); // L: 1098
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var12 + 36, 255, 0); // L: 1099
					} else if (Login.loginIndex == 5) { // L: 1101
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1102
						var31 = 221; // L: 1103
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1104
						var32 = var31 + 15; // L: 1105
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1106
						var32 += 15; // L: 1107
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1108
						var32 += 15; // L: 1109
						var32 += 14; // L: 1110
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var32, 16777215, 0); // L: 1111
						var33 = 174; // L: 1112

						for (var5 = Players.method2283(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) { // L: 1113 1114 1115
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? DefaultsGroup.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var32, 16777215, 0); // L: 1117
						var32 += 15; // L: 1118
						var27 = Login.loginBoxX + 180 - 80; // L: 1119
						short var25 = 321; // L: 1120
						Interpreter.titlebuttonSprite.drawAt(var27 - 73, var25 - 20); // L: 1121
						var0.drawCentered("Recover", var27, var25 + 5, 16777215, 0); // L: 1122
						var27 = Login.loginBoxX + 180 + 80; // L: 1123
						Interpreter.titlebuttonSprite.drawAt(var27 - 73, var25 - 20); // L: 1124
						var0.drawCentered("Back", var27, var25 + 5, 16777215, 0); // L: 1125
						var25 = 356; // L: 1126
						var1.drawCentered("Still having trouble logging in?", GraphicsObject.loginBoxCenter, var25, 268435455, 0); // L: 1127
					} else if (Login.loginIndex == 6) { // L: 1129
						var31 = 201; // L: 1130
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1131
						var32 = var31 + 15; // L: 1132
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1133
						var32 += 15; // L: 1134
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1135
						var32 += 15; // L: 1136
						var4 = Login.loginBoxX + 180; // L: 1137
						var23 = 321; // L: 1138
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1139
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1140
					} else if (Login.loginIndex == 7) { // L: 1142
						var31 = 216; // L: 1143
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1144
						var32 = var31 + 15; // L: 1145
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1146
						var32 += 15; // L: 1147
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1148
						var32 += 15; // L: 1149
						var4 = Login.loginBoxX + 180 - 80; // L: 1150
						var23 = 321; // L: 1151
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1152
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1153
						var4 = Login.loginBoxX + 180 + 80; // L: 1154
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1155
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1156
					} else if (Login.loginIndex == 8) { // L: 1158
						var31 = 216; // L: 1159
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1160
						var32 = var31 + 15; // L: 1161
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1162
						var32 += 15; // L: 1163
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1164
						var32 += 15; // L: 1165
						var4 = Login.loginBoxX + 180 - 80; // L: 1166
						var23 = 321; // L: 1167
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1168
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1169
						var4 = Login.loginBoxX + 180 + 80; // L: 1170
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1171
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1172
					} else if (Login.loginIndex == 12) { // L: 1174
						var31 = 201; // L: 1175
						String var24 = ""; // L: 1176
						var5 = ""; // L: 1177
						String var6 = ""; // L: 1178
						switch(Login.field993) { // L: 1179
						case 0:
							var24 = "Your account has been disabled."; // L: 1187
							var5 = Strings.field2966; // L: 1188
							var6 = ""; // L: 1189
							break; // L: 1190
						case 1:
							var24 = "Account locked as we suspect it has been stolen."; // L: 1194
							var5 = Strings.field3005; // L: 1195
							var6 = ""; // L: 1196
							break;
						default:
							class25.Login_promptCredentials(false); // L: 1182
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1200
						var32 = var31 + 15; // L: 1201
						var2.drawCentered(var5, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1202
						var32 += 15; // L: 1203
						var2.drawCentered(var6, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1204
						var32 += 15; // L: 1205
						var39 = Login.loginBoxX + 180; // L: 1206
						short var41 = 276; // L: 1207
						Interpreter.titlebuttonSprite.drawAt(var39 - 73, var41 - 20); // L: 1208
						var0.drawCentered("Support Page", var39, var41 + 5, 16777215, 0); // L: 1209
						var39 = Login.loginBoxX + 180; // L: 1210
						var41 = 326; // L: 1211
						Interpreter.titlebuttonSprite.drawAt(var39 - 73, var41 - 20); // L: 1212
						var0.drawCentered("Back", var39, var41 + 5, 16777215, 0); // L: 1213
					} else if (Login.loginIndex == 24) { // L: 1215
						var31 = 221; // L: 1216
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1217
						var32 = var31 + 15; // L: 1218
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1219
						var32 += 15; // L: 1220
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1221
						var32 += 15; // L: 1222
						var4 = Login.loginBoxX + 180; // L: 1223
						var23 = 301; // L: 1224
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1225
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1226
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1229
				int[] var28 = new int[4]; // L: 1230
				Rasterizer2D.Rasterizer2D_getClipArray(var28); // L: 1231
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, GameEngine.canvasHeight); // L: 1232
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1233
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1234
				Rasterizer2D.Rasterizer2D_setClipArray(var28); // L: 1235
			}

			class373.title_muteSprite[Login.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1237
			if (Client.gameState > 5 && class35.clientLanguage == Language.Language_EN) { // L: 1238
				if (class242.field2900 != null) { // L: 1239
					var32 = Login.xPadding + 5; // L: 1240
					var33 = 463; // L: 1241
					byte var38 = 100; // L: 1242
					byte var42 = 35; // L: 1243
					class242.field2900.drawAt(var32, var33); // L: 1244
					var0.drawCentered("World" + " " + Client.worldId, var38 / 2 + var32, var42 / 2 + var33 - 2, 16777215, 0); // L: 1245
					if (World.World_request != null) { // L: 1246
						var1.drawCentered("Loading...", var38 / 2 + var32, var42 / 2 + var33 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var38 / 2 + var32, var42 / 2 + var33 + 12, 16777215, 0); // L: 1247
					}
				} else {
					class242.field2900 = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(SoundSystem.archive8, "sl_button", ""); // L: 1250
				}
			}

		}
	} // L: 884 1253

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Lcs;IIB)V",
		garbageValue = "-125"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 3572
			int var3 = class225.SequenceDefinition_get(var1).field3707; // L: 3573
			if (var3 == 1) { // L: 3574
				var0.sequenceFrame = 0; // L: 3575
				var0.sequenceFrameCycle = 0; // L: 3576
				var0.sequenceDelay = var2; // L: 3577
				var0.field1245 = 0; // L: 3578
			}

			if (var3 == 2) { // L: 3580
				var0.field1245 = 0; // L: 3581
			}
		} else if (var1 == -1 || var0.sequence == -1 || class225.SequenceDefinition_get(var1).field3718 >= class225.SequenceDefinition_get(var0.sequence).field3718) { // L: 3584
			var0.sequence = var1; // L: 3585
			var0.sequenceFrame = 0; // L: 3586
			var0.sequenceFrameCycle = 0; // L: 3587
			var0.sequenceDelay = var2; // L: 3588
			var0.field1245 = 0; // L: 3589
			var0.field1224 = var0.pathLength; // L: 3590
		}

	} // L: 3592
}
