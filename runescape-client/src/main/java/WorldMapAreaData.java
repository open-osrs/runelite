import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iq")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("w")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("b")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("t")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;IZI)V",
		garbageValue = "696765491"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lpx;ZI)V",
		garbageValue = "-838366517"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method7532(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "676720431"
	)
	public static boolean method4880(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field120[var0] : false; // L: 227 228
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "782138310"
	)
	static int method4887(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 612
		Widget var3;
		if (var0 >= 2000) { // L: 613
			var0 -= 1000; // L: 614
			var4 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 615
			var3 = class92.getWidget(var4); // L: 616
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget; // L: 618
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 619
			class12.Interpreter_intStackSize -= 2; // L: 620
			var3.scrollX = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 621
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 622
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 623
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 624
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 625
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 626
				var3.scrollY = 0;
			}

			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 627
			return 1; // L: 628
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 630
			var3.color = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 631
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 632
			return 1; // L: 633
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 635
			var3.fill = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 636
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 637
			return 1; // L: 638
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 640
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 641
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 642
			return 1; // L: 643
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 645
			var3.lineWid = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 646
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 647
			return 1; // L: 648
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 650
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 651
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 652
			return 1; // L: 653
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 655
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 656
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 657
			return 1; // L: 658
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 660
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 661
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 662
			return 1; // L: 663
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 665
			var3.modelType = 1; // L: 666
			var3.modelId = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 667
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 668
			return 1; // L: 669
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 671
			class12.Interpreter_intStackSize -= 6; // L: 672
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 673
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 674
			var3.modelAngleX = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 675
			var3.modelAngleY = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3]; // L: 676
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 4]; // L: 677
			var3.modelZoom = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 5]; // L: 678
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 679
			return 1; // L: 680
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 682
				var8 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 683
				if (var8 != var3.sequenceId) { // L: 684
					var3.sequenceId = var8; // L: 685
					var3.modelFrame = 0; // L: 686
					var3.modelFrameCycle = 0; // L: 687
					GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 688
				}

				return 1; // L: 690
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 692
				var3.modelOrthog = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 693
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 694
				return 1; // L: 695
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 697
				String var7 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 698
				if (!var7.equals(var3.text)) { // L: 699
					var3.text = var7; // L: 700
					GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 701
				}

				return 1; // L: 703
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 705
				var3.fontId = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 706
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 707
				return 1; // L: 708
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 710
				class12.Interpreter_intStackSize -= 3; // L: 711
				var3.textXAlignment = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 712
				var3.textYAlignment = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 713
				var3.textLineHeight = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 714
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 715
				return 1; // L: 716
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 718
				var3.textShadowed = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 719
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 720
				return 1; // L: 721
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 723
				var3.outline = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 724
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 725
				return 1; // L: 726
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 728
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 729
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 730
				return 1; // L: 731
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 733
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 734
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 735
				return 1; // L: 736
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 738
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 739
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 740
				return 1; // L: 741
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 743
				class12.Interpreter_intStackSize -= 2; // L: 744
				var3.scrollWidth = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 745
				var3.scrollHeight = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 746
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 747
				if (var4 != -1 && var3.type == 0) { // L: 748
					UserComparator8.revalidateWidgetScroll(NetSocket.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 749
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 751
				Skills.resumePauseWidget(var3.id, var3.childIndex); // L: 752
				Client.meslayerContinueWidget = var3; // L: 753
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 754
				return 1; // L: 755
			} else if (var0 == 1122) { // L: 757
				var3.spriteId = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 758
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 759
				return 1; // L: 760
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 762
				var3.color2 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 763
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 764
				return 1; // L: 765
			} else if (var0 == 1124) { // L: 767
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 768
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 769
				return 1; // L: 770
			} else if (var0 == 1125) { // L: 772
				var8 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 773
				FillMode var6 = (FillMode)class291.findEnumerated(WorldMapEvent.FillMode_values(), var8); // L: 774
				if (var6 != null) { // L: 775
					var3.fillMode = var6; // L: 776
					GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 777
				}

				return 1; // L: 779
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 781
					var5 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 782
					var3.field3428 = var5; // L: 783
					return 1; // L: 784
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 786
					var5 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 787
					var3.modelTransparency = var5; // L: 788
					return 1; // L: 789
				} else if (var0 == 1128) { // L: 791
					class12.Interpreter_intStackSize -= 2; // L: 792
					return 1; // L: 793
				} else if (var0 == 1129) { // L: 795
					var3.field3431 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 796
					GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 797
					return 1; // L: 798
				} else if (var0 == 1130) { // L: 800
					var3.method5449(Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize], UserComparator7.urlRequester, class92.method2374()); // L: 801
					return 1; // L: 802
				} else if (var0 == 1131) { // L: 804
					class12.Interpreter_intStackSize -= 2; // L: 805
					var3.method5451(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]); // L: 806
					return 1; // L: 807
				} else if (var0 == 1132) { // L: 809
					var3.method5468(Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 810
					return 1; // L: 811
				} else {
					return 2; // L: 813
				}
			}
		}
	}
}
