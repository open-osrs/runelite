import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("de")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = -976382879
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnf;Lnf;I)I",
		garbageValue = "-1564138205"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-27"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ldt;FZI)F",
		garbageValue = "1213299067"
	)
	static float method2616(class117 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 199
		if (var0 != null && var0.method2715() != 0) { // L: 200
			float var4 = (float)var0.field1411[0].field1373; // L: 203
			float var5 = (float)var0.field1411[var0.method2715() - 1].field1373; // L: 204
			float var6 = var5 - var4; // L: 205
			if (0.0D == (double)var6) { // L: 206
				return var0.field1411[0].field1376; // L: 207
			} else {
				float var7 = 0.0F; // L: 209
				if (var1 > var5) { // L: 210
					var7 = (var1 - var5) / var6; // L: 211
				} else {
					var7 = (var1 - var4) / var6; // L: 214
				}

				double var8 = (double)((int)var7); // L: 216
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 217
				float var11 = var10 * var6; // L: 218
				var8 = Math.abs(1.0D + var8); // L: 219
				double var12 = var8 / 2.0D; // L: 220
				double var14 = (double)((int)var12); // L: 221
				var10 = (float)(var12 - var14); // L: 222
				float var16;
				float var17;
				if (var2) { // L: 225
					if (var0.field1409 == class116.field1401) { // L: 226
						if (0.0D != (double)var10) { // L: 227
							var11 += var4; // L: 228
						} else {
							var11 = var5 - var11; // L: 231
						}
					} else if (var0.field1409 != class116.field1400 && var0.field1409 != class116.field1406) { // L: 234
						if (var0.field1409 == class116.field1399) { // L: 237
							var11 = var4 - var1; // L: 238
							var16 = var0.field1411[0].field1371; // L: 239
							var17 = var0.field1411[0].field1377; // L: 240
							var3 = var0.field1411[0].field1376; // L: 241
							if ((double)var16 != 0.0D) { // L: 242
								var3 -= var17 * var11 / var16; // L: 243
							}

							return var3; // L: 245
						}
					} else {
						var11 = var5 - var11; // L: 235
					}
				} else if (var0.field1410 == class116.field1401) { // L: 249
					if (0.0D != (double)var10) { // L: 250
						var11 = var5 - var11; // L: 251
					} else {
						var11 += var4; // L: 254
					}
				} else if (var0.field1410 != class116.field1400 && var0.field1410 != class116.field1406) { // L: 257
					if (var0.field1410 == class116.field1399) { // L: 260
						var11 = var1 - var5; // L: 261
						var16 = var0.field1411[var0.method2715() - 1].field1369; // L: 262
						var17 = var0.field1411[var0.method2715() - 1].field1374; // L: 263
						var3 = var0.field1411[var0.method2715() - 1].field1376; // L: 264
						if ((double)var16 != 0.0D) { // L: 265
							var3 += var11 * var17 / var16; // L: 266
						}

						return var3; // L: 268
					}
				} else {
					var11 += var4; // L: 258
				}

				var3 = class10.method92(var0, var11); // L: 271
				float var18;
				if (var2 && var0.field1409 == class116.field1406) { // L: 273
					var18 = var0.field1411[var0.method2715() - 1].field1376 - var0.field1411[0].field1376; // L: 274
					var3 = (float)((double)var3 - (double)var18 * var8); // L: 275
				} else if (!var2 && var0.field1410 == class116.field1406) { // L: 277
					var18 = var0.field1411[var0.method2715() - 1].field1376 - var0.field1411[0].field1376; // L: 278
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 279
				}

				return var3; // L: 281
			}
		} else {
			return var3; // L: 201
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "2"
	)
	static int method2621(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 612
		Widget var3;
		if (var0 >= 2000) { // L: 613
			var0 -= 1000; // L: 614
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 615
			var3 = class127.getWidget(var4); // L: 616
		} else {
			var3 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 618
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 619
			Interpreter.Interpreter_intStackSize -= 2; // L: 620
			var3.scrollX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 621
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 622
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 623
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 624
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 625
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 626
				var3.scrollY = 0;
			}

			class346.invalidateWidget(var3); // L: 627
			return 1; // L: 628
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 630
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 631
			class346.invalidateWidget(var3); // L: 632
			return 1; // L: 633
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 635
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 636
			class346.invalidateWidget(var3); // L: 637
			return 1; // L: 638
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 640
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 641
			class346.invalidateWidget(var3); // L: 642
			return 1; // L: 643
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 645
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 646
			class346.invalidateWidget(var3); // L: 647
			return 1; // L: 648
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 650
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 651
			class346.invalidateWidget(var3); // L: 652
			return 1; // L: 653
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 655
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 656
			class346.invalidateWidget(var3); // L: 657
			return 1; // L: 658
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 660
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 661
			class346.invalidateWidget(var3); // L: 662
			return 1; // L: 663
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 665
			var3.modelType = 1; // L: 666
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 667
			class346.invalidateWidget(var3); // L: 668
			return 1; // L: 669
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 671
			Interpreter.Interpreter_intStackSize -= 6; // L: 672
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 673
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 674
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 675
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 676
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 677
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 678
			class346.invalidateWidget(var3); // L: 679
			return 1; // L: 680
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 682
				var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 683
				if (var8 != var3.sequenceId) { // L: 684
					var3.sequenceId = var8; // L: 685
					var3.modelFrame = 0; // L: 686
					var3.modelFrameCycle = 0; // L: 687
					class346.invalidateWidget(var3); // L: 688
				}

				return 1; // L: 690
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 692
				var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 693
				class346.invalidateWidget(var3); // L: 694
				return 1; // L: 695
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 697
				String var7 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 698
				if (!var7.equals(var3.text)) { // L: 699
					var3.text = var7; // L: 700
					class346.invalidateWidget(var3); // L: 701
				}

				return 1; // L: 703
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 705
				var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 706
				class346.invalidateWidget(var3); // L: 707
				return 1; // L: 708
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 710
				Interpreter.Interpreter_intStackSize -= 3; // L: 711
				var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 712
				var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 713
				var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 714
				class346.invalidateWidget(var3); // L: 715
				return 1; // L: 716
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 718
				var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 719
				class346.invalidateWidget(var3); // L: 720
				return 1; // L: 721
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 723
				var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 724
				class346.invalidateWidget(var3); // L: 725
				return 1; // L: 726
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 728
				var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 729
				class346.invalidateWidget(var3); // L: 730
				return 1; // L: 731
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 733
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 734
				class346.invalidateWidget(var3); // L: 735
				return 1; // L: 736
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 738
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 739
				class346.invalidateWidget(var3); // L: 740
				return 1; // L: 741
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 743
				Interpreter.Interpreter_intStackSize -= 2; // L: 744
				var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 745
				var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 746
				class346.invalidateWidget(var3); // L: 747
				if (var4 != -1 && var3.type == 0) { // L: 748
					AbstractByteArrayCopier.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 749
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 751
				class268.resumePauseWidget(var3.id, var3.childIndex); // L: 752
				Client.meslayerContinueWidget = var3; // L: 753
				class346.invalidateWidget(var3); // L: 754
				return 1; // L: 755
			} else if (var0 == 1122) { // L: 757
				var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 758
				class346.invalidateWidget(var3); // L: 759
				return 1; // L: 760
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 762
				var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 763
				class346.invalidateWidget(var3); // L: 764
				return 1; // L: 765
			} else if (var0 == 1124) { // L: 767
				var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 768
				class346.invalidateWidget(var3); // L: 769
				return 1; // L: 770
			} else if (var0 == 1125) { // L: 772
				var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 773
				FillMode var6 = (FillMode)MusicPatchPcmStream.findEnumerated(class291.FillMode_values(), var8); // L: 774
				if (var6 != null) { // L: 775
					var3.fillMode = var6; // L: 776
					class346.invalidateWidget(var3); // L: 777
				}

				return 1; // L: 779
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 781
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 782
					var3.field3369 = var5; // L: 783
					return 1; // L: 784
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 786
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 787
					var3.modelTransparency = var5; // L: 788
					return 1; // L: 789
				} else if (var0 == 1128) { // L: 791
					Interpreter.Interpreter_intStackSize -= 2; // L: 792
					return 1; // L: 793
				} else if (var0 == 1129) { // L: 795
					var3.field3487 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 796
					class346.invalidateWidget(var3); // L: 797
					return 1; // L: 798
				} else if (var0 == 1130) { // L: 800
					var3.method5618(Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize], VerticalAlignment.urlRequester, MusicPatchPcmStream.method5456()); // L: 801
					return 1; // L: 802
				} else if (var0 == 1131) { // L: 804
					Interpreter.Interpreter_intStackSize -= 2; // L: 805
					var3.method5722(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 806
					return 1; // L: 807
				} else if (var0 == 1132) { // L: 809
					var3.method5672(Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 810
					return 1; // L: 811
				} else {
					return 2; // L: 813
				}
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "74"
	)
	static final int method2615(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 891
		int var4 = var0 & var2 - 1; // L: 892
		int var5 = var1 / var2; // L: 893
		int var6 = var1 & var2 - 1; // L: 894
		int var7 = class293.method5599(var3, var5); // L: 895
		int var8 = class293.method5599(var3 + 1, var5); // L: 896
		int var9 = class293.method5599(var3, var5 + 1); // L: 897
		int var10 = class293.method5599(var3 + 1, var5 + 1); // L: 898
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 901
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16); // L: 902
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 907
		int var13 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16); // L: 908
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 913
		int var15 = ((65536 - var16) * var11 >> 16) + (var13 * var16 >> 16); // L: 914
		return var15; // L: 916
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)I",
		garbageValue = "-1509768740"
	)
	static int method2617(Widget var0) {
		if (var0.type != 11) { // L: 1227
			--class122.Interpreter_stringStackSize; // L: 1228
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 1229
			return 1; // L: 1230
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 1232
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method5623(var1); // L: 1233
			return 1; // L: 1234
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1180428712"
	)
	protected static final void method2619() {
		class431.clock.mark(); // L: 429

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 430
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 431
			GameEngine.clientTickTimes[var0] = 0L;
		}

		TriBool.gameCyclesToDo = 0; // L: 432
	} // L: 433
}
