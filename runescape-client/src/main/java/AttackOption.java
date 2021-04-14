import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dy")
@Implements("AttackOption")
public enum AttackOption implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("AttackOption_leftClickWhereAvailable")
	AttackOption_leftClickWhereAvailable(2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3);

	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		intValue = -267672571
	)
	static int field1339;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 834403033
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 741396013
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 11758
	} // L: 11759

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 11762
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "966870433"
	)
	static int method2260(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 605
		Widget var3;
		if (var0 >= 2000) { // L: 606
			var0 -= 1000; // L: 607
			var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 608
			var3 = class139.getWidget(var4); // L: 609
		} else {
			var3 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 611
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 612
			class16.Interpreter_intStackSize -= 2; // L: 613
			var3.scrollX = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 614
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 615
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 616
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 617
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 618
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 619
				var3.scrollY = 0;
			}

			class29.invalidateWidget(var3); // L: 620
			return 1; // L: 621
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 623
			var3.color = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 624
			class29.invalidateWidget(var3); // L: 625
			return 1; // L: 626
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 628
			var3.fill = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 629
			class29.invalidateWidget(var3); // L: 630
			return 1; // L: 631
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 633
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 634
			class29.invalidateWidget(var3); // L: 635
			return 1; // L: 636
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 638
			var3.lineWid = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 639
			class29.invalidateWidget(var3); // L: 640
			return 1; // L: 641
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 643
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 644
			class29.invalidateWidget(var3); // L: 645
			return 1; // L: 646
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 648
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 649
			class29.invalidateWidget(var3); // L: 650
			return 1; // L: 651
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 653
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 654
			class29.invalidateWidget(var3); // L: 655
			return 1; // L: 656
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 658
			var3.modelType = 1; // L: 659
			var3.modelId = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 660
			class29.invalidateWidget(var3); // L: 661
			return 1; // L: 662
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 664
			class16.Interpreter_intStackSize -= 6; // L: 665
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 666
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 667
			var3.modelAngleX = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 668
			var3.modelAngleY = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3]; // L: 669
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 4]; // L: 670
			var3.modelZoom = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 5]; // L: 671
			class29.invalidateWidget(var3); // L: 672
			return 1; // L: 673
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 675
				var8 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 676
				if (var8 != var3.sequenceId) { // L: 677
					var3.sequenceId = var8; // L: 678
					var3.modelFrame = 0; // L: 679
					var3.modelFrameCycle = 0; // L: 680
					class29.invalidateWidget(var3); // L: 681
				}

				return 1; // L: 683
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 685
				var3.modelOrthog = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 686
				class29.invalidateWidget(var3); // L: 687
				return 1; // L: 688
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 690
				String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 691
				if (!var7.equals(var3.text)) { // L: 692
					var3.text = var7; // L: 693
					class29.invalidateWidget(var3); // L: 694
				}

				return 1; // L: 696
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 698
				var3.fontId = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 699
				class29.invalidateWidget(var3); // L: 700
				return 1; // L: 701
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 703
				class16.Interpreter_intStackSize -= 3; // L: 704
				var3.textXAlignment = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 705
				var3.textYAlignment = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 706
				var3.textLineHeight = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 707
				class29.invalidateWidget(var3); // L: 708
				return 1; // L: 709
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 711
				var3.textShadowed = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 712
				class29.invalidateWidget(var3); // L: 713
				return 1; // L: 714
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 716
				var3.outline = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 717
				class29.invalidateWidget(var3); // L: 718
				return 1; // L: 719
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 721
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 722
				class29.invalidateWidget(var3); // L: 723
				return 1; // L: 724
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 726
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 727
				class29.invalidateWidget(var3); // L: 728
				return 1; // L: 729
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 731
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 732
				class29.invalidateWidget(var3); // L: 733
				return 1; // L: 734
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 736
				class16.Interpreter_intStackSize -= 2; // L: 737
				var3.scrollWidth = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 738
				var3.scrollHeight = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 739
				class29.invalidateWidget(var3); // L: 740
				if (var4 != -1 && var3.type == 0) { // L: 741
					UserList.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 742
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 744
				class43.resumePauseWidget(var3.id, var3.childIndex); // L: 745
				Client.meslayerContinueWidget = var3; // L: 746
				class29.invalidateWidget(var3); // L: 747
				return 1; // L: 748
			} else if (var0 == 1122) { // L: 750
				var3.spriteId = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 751
				class29.invalidateWidget(var3); // L: 752
				return 1; // L: 753
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 755
				var3.color2 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 756
				class29.invalidateWidget(var3); // L: 757
				return 1; // L: 758
			} else if (var0 == 1124) { // L: 760
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 761
				class29.invalidateWidget(var3); // L: 762
				return 1; // L: 763
			} else if (var0 == ScriptOpcodes.CC_SETFILLMODE) { // L: 765
				var8 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 766
				FillMode var6 = (FillMode)UserComparator8.findEnumerated(class309.FillMode_values(), var8); // L: 767
				if (var6 != null) { // L: 768
					var3.fillMode = var6; // L: 769
					class29.invalidateWidget(var3); // L: 770
				}

				return 1; // L: 772
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 774
					var5 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 775
					var3.field2727 = var5; // L: 776
					return 1; // L: 777
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 779
					var5 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 780
					var3.modelTransparency = var5; // L: 781
					return 1; // L: 782
				} else if (var0 == 1128) { // L: 784
					class16.Interpreter_intStackSize -= 2; // L: 785
					return 1; // L: 786
				} else {
					return 2; // L: 788
				}
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "-912001400"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 81
		if (var3) { // L: 82
			var5 |= 65536L;
		}

		return var5; // L: 83
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lfb;",
		garbageValue = "1526631437"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 181
		if (var1 != null) { // L: 182
			return var1;
		} else {
			var1 = ItemLayer.loadFrames(GrandExchangeOfferOwnWorldComparator.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 183
			if (var1 != null) { // L: 184
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 185
		}
	}
}
