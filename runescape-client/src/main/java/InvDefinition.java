import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ex")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("musicTrackArchive")
	static AbstractArchive musicTrackArchive;
	@ObfuscatedName("al")
	@Export("null_string")
	protected static String null_string;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1449643111
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1281514365"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 28
			if (var2 == 0) { // L: 29
				return; // L: 32
			}

			this.decodeNext(var1, var2); // L: 30
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IS)V",
		garbageValue = "-25465"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.size = var1.readUnsignedShort();
		}

	} // L: 37

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1727698961"
	)
	static int method2699(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 616
		Widget var3;
		if (var0 >= 2000) { // L: 617
			var0 -= 1000; // L: 618
			var4 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 619
			var3 = WorldMapData_1.getWidget(var4); // L: 620
		} else {
			var3 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 622
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 623
			ChatChannel.Interpreter_intStackSize -= 2; // L: 624
			var3.scrollX = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 625
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 626
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 627
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 628
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 629
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 630
				var3.scrollY = 0;
			}

			Script.invalidateWidget(var3); // L: 631
			return 1; // L: 632
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 634
			var3.color = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 635
			Script.invalidateWidget(var3); // L: 636
			return 1; // L: 637
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 639
			var3.fill = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 640
			Script.invalidateWidget(var3); // L: 641
			return 1; // L: 642
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 644
			var3.transparencyTop = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 645
			Script.invalidateWidget(var3); // L: 646
			return 1; // L: 647
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 649
			var3.lineWid = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 650
			Script.invalidateWidget(var3); // L: 651
			return 1; // L: 652
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 654
			var3.spriteId2 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 655
			Script.invalidateWidget(var3); // L: 656
			return 1; // L: 657
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 659
			var3.spriteAngle = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 660
			Script.invalidateWidget(var3); // L: 661
			return 1; // L: 662
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 664
			var3.spriteTiling = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 665
			Script.invalidateWidget(var3); // L: 666
			return 1; // L: 667
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 669
			var3.modelType = 1; // L: 670
			var3.modelId = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 671
			Script.invalidateWidget(var3); // L: 672
			return 1; // L: 673
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 675
			ChatChannel.Interpreter_intStackSize -= 6; // L: 676
			var3.modelOffsetX = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 677
			var3.modelOffsetY = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 678
			var3.modelAngleX = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 679
			var3.modelAngleY = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3]; // L: 680
			var3.modelAngleZ = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 4]; // L: 681
			var3.modelZoom = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 5]; // L: 682
			Script.invalidateWidget(var3); // L: 683
			return 1; // L: 684
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 686
				var8 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 687
				if (var8 != var3.sequenceId) { // L: 688
					var3.sequenceId = var8; // L: 689
					var3.modelFrame = 0; // L: 690
					var3.modelFrameCycle = 0; // L: 691
					Script.invalidateWidget(var3); // L: 692
				}

				return 1; // L: 694
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 696
				var3.modelOrthog = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 697
				Script.invalidateWidget(var3); // L: 698
				return 1; // L: 699
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 701
				String var7 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 702
				if (!var7.equals(var3.text)) { // L: 703
					var3.text = var7; // L: 704
					Script.invalidateWidget(var3); // L: 705
				}

				return 1; // L: 707
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 709
				var3.fontId = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 710
				Script.invalidateWidget(var3); // L: 711
				return 1; // L: 712
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 714
				ChatChannel.Interpreter_intStackSize -= 3; // L: 715
				var3.textXAlignment = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 716
				var3.textYAlignment = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 717
				var3.textLineHeight = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 718
				Script.invalidateWidget(var3); // L: 719
				return 1; // L: 720
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 722
				var3.textShadowed = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 723
				Script.invalidateWidget(var3); // L: 724
				return 1; // L: 725
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 727
				var3.outline = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 728
				Script.invalidateWidget(var3); // L: 729
				return 1; // L: 730
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 732
				var3.spriteShadow = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 733
				Script.invalidateWidget(var3); // L: 734
				return 1; // L: 735
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 737
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 738
				Script.invalidateWidget(var3); // L: 739
				return 1; // L: 740
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 742
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 743
				Script.invalidateWidget(var3); // L: 744
				return 1; // L: 745
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 747
				ChatChannel.Interpreter_intStackSize -= 2; // L: 748
				var3.scrollWidth = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 749
				var3.scrollHeight = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 750
				Script.invalidateWidget(var3); // L: 751
				if (var4 != -1 && var3.type == 0) { // L: 752
					WorldMapLabelSize.revalidateWidgetScroll(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 753
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 755
				ClanChannelMember.resumePauseWidget(var3.id, var3.childIndex); // L: 756
				Client.meslayerContinueWidget = var3; // L: 757
				Script.invalidateWidget(var3); // L: 758
				return 1; // L: 759
			} else if (var0 == 1122) { // L: 761
				var3.spriteId = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 762
				Script.invalidateWidget(var3); // L: 763
				return 1; // L: 764
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 766
				var3.color2 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 767
				Script.invalidateWidget(var3); // L: 768
				return 1; // L: 769
			} else if (var0 == 1124) { // L: 771
				var3.transparencyBot = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 772
				Script.invalidateWidget(var3); // L: 773
				return 1; // L: 774
			} else if (var0 == 1125) { // L: 776
				var8 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 777
				FillMode var6 = (FillMode)Clock.findEnumerated(GrandExchangeEvent.FillMode_values(), var8); // L: 778
				if (var6 != null) { // L: 779
					var3.fillMode = var6; // L: 780
					Script.invalidateWidget(var3); // L: 781
				}

				return 1; // L: 783
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 785
					var5 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 786
					var3.field2994 = var5; // L: 787
					return 1; // L: 788
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 790
					var5 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 791
					var3.modelTransparency = var5; // L: 792
					return 1; // L: 793
				} else if (var0 == 1128) { // L: 795
					ChatChannel.Interpreter_intStackSize -= 2; // L: 796
					return 1; // L: 797
				} else {
					return 2; // L: 799
				}
			}
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lci;ZB)V",
		garbageValue = "16"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11273
		int var3 = (int)var0.key; // L: 11274
		var0.remove(); // L: 11275
		if (var1) { // L: 11276
			class44.method540(var2);
		}

		class10.method113(var2); // L: 11277
		Widget var4 = WorldMapData_1.getWidget(var3); // L: 11278
		if (var4 != null) { // L: 11279
			Script.invalidateWidget(var4);
		}

		WorldMapScaleHandler.method3856(); // L: 11280
		if (Client.rootInterface != -1) { // L: 11281
			class8.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 11282
}
