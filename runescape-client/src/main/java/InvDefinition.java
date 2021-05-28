import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ep")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1820336081
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1433861399"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.decodeNext(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "-1191086190"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.size = var1.readUnsignedShort();
		}

	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;II)Lin;",
		garbageValue = "-1662391635"
	)
	static MusicPatch method2609(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 21
		return var2 == null ? null : new MusicPatch(var2); // L: 22
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1464061704"
	)
	static int method2619(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 606
		Widget var3;
		if (var0 >= 2000) { // L: 607
			var0 -= 1000; // L: 608
			var4 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 609
			var3 = Frames.getWidget(var4); // L: 610
		} else {
			var3 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 612
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 613
			class44.Interpreter_intStackSize -= 2; // L: 614
			var3.scrollX = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 615
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 616
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 617
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 618
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 619
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 620
				var3.scrollY = 0;
			}

			WorldMapCacheName.invalidateWidget(var3); // L: 621
			return 1; // L: 622
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 624
			var3.color = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 625
			WorldMapCacheName.invalidateWidget(var3); // L: 626
			return 1; // L: 627
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 629
			var3.fill = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 630
			WorldMapCacheName.invalidateWidget(var3); // L: 631
			return 1; // L: 632
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 634
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 635
			WorldMapCacheName.invalidateWidget(var3); // L: 636
			return 1; // L: 637
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 639
			var3.lineWid = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 640
			WorldMapCacheName.invalidateWidget(var3); // L: 641
			return 1; // L: 642
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 644
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 645
			WorldMapCacheName.invalidateWidget(var3); // L: 646
			return 1; // L: 647
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 649
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 650
			WorldMapCacheName.invalidateWidget(var3); // L: 651
			return 1; // L: 652
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 654
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 655
			WorldMapCacheName.invalidateWidget(var3); // L: 656
			return 1; // L: 657
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 659
			var3.modelType = 1; // L: 660
			var3.modelId = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 661
			WorldMapCacheName.invalidateWidget(var3); // L: 662
			return 1; // L: 663
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 665
			class44.Interpreter_intStackSize -= 6; // L: 666
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 667
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 668
			var3.modelAngleX = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 669
			var3.modelAngleY = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3]; // L: 670
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 4]; // L: 671
			var3.modelZoom = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 5]; // L: 672
			WorldMapCacheName.invalidateWidget(var3); // L: 673
			return 1; // L: 674
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 676
				var8 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 677
				if (var8 != var3.sequenceId) { // L: 678
					var3.sequenceId = var8; // L: 679
					var3.modelFrame = 0; // L: 680
					var3.modelFrameCycle = 0; // L: 681
					WorldMapCacheName.invalidateWidget(var3); // L: 682
				}

				return 1; // L: 684
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 686
				var3.modelOrthog = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 687
				WorldMapCacheName.invalidateWidget(var3); // L: 688
				return 1; // L: 689
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 691
				String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 692
				if (!var7.equals(var3.text)) { // L: 693
					var3.text = var7; // L: 694
					WorldMapCacheName.invalidateWidget(var3); // L: 695
				}

				return 1; // L: 697
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 699
				var3.fontId = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 700
				WorldMapCacheName.invalidateWidget(var3); // L: 701
				return 1; // L: 702
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 704
				class44.Interpreter_intStackSize -= 3; // L: 705
				var3.textXAlignment = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 706
				var3.textYAlignment = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 707
				var3.textLineHeight = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 708
				WorldMapCacheName.invalidateWidget(var3); // L: 709
				return 1; // L: 710
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 712
				var3.textShadowed = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 713
				WorldMapCacheName.invalidateWidget(var3); // L: 714
				return 1; // L: 715
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 717
				var3.outline = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 718
				WorldMapCacheName.invalidateWidget(var3); // L: 719
				return 1; // L: 720
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 722
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 723
				WorldMapCacheName.invalidateWidget(var3); // L: 724
				return 1; // L: 725
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 727
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 728
				WorldMapCacheName.invalidateWidget(var3); // L: 729
				return 1; // L: 730
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 732
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 733
				WorldMapCacheName.invalidateWidget(var3); // L: 734
				return 1; // L: 735
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 737
				class44.Interpreter_intStackSize -= 2; // L: 738
				var3.scrollWidth = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 739
				var3.scrollHeight = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 740
				WorldMapCacheName.invalidateWidget(var3); // L: 741
				if (var4 != -1 && var3.type == 0) { // L: 742
					class313.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 743
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 745
				class22.resumePauseWidget(var3.id, var3.childIndex); // L: 746
				Client.meslayerContinueWidget = var3; // L: 747
				WorldMapCacheName.invalidateWidget(var3); // L: 748
				return 1; // L: 749
			} else if (var0 == 1122) { // L: 751
				var3.spriteId = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 752
				WorldMapCacheName.invalidateWidget(var3); // L: 753
				return 1; // L: 754
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 756
				var3.color2 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 757
				WorldMapCacheName.invalidateWidget(var3); // L: 758
				return 1; // L: 759
			} else if (var0 == 1124) { // L: 761
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 762
				WorldMapCacheName.invalidateWidget(var3); // L: 763
				return 1; // L: 764
			} else if (var0 == ScriptOpcodes.CC_SETFILLMODE) { // L: 766
				var8 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 767
				FillMode var6 = (FillMode)Messages.findEnumerated(VertexNormal.FillMode_values(), var8); // L: 768
				if (var6 != null) { // L: 769
					var3.fillMode = var6; // L: 770
					WorldMapCacheName.invalidateWidget(var3); // L: 771
				}

				return 1; // L: 773
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 775
					var5 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 776
					var3.field2992 = var5; // L: 777
					return 1; // L: 778
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 780
					var5 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 781
					var3.modelTransparency = var5; // L: 782
					return 1; // L: 783
				} else if (var0 == 1128) { // L: 785
					class44.Interpreter_intStackSize -= 2; // L: 786
					return 1; // L: 787
				} else {
					return 2; // L: 789
				}
			}
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)Z",
		garbageValue = "-1051636424"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 9871
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 9872
				int var2 = ModeWhere.method5160(var0, var1); // L: 9873
				int var3 = var0.cs1ComparisonValues[var1]; // L: 9874
				if (var0.cs1Comparisons[var1] == 2) { // L: 9875
					if (var2 >= var3) { // L: 9876
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 9878
					if (var2 <= var3) { // L: 9879
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 9881
					if (var3 == var2) { // L: 9882
						return false;
					}
				} else if (var2 != var3) { // L: 9884
					return false;
				}
			}

			return true; // L: 9886
		}
	}
}
