import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("en")
public class class143 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1200015243
	)
	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -313153463126813519L
	)
	long field1626;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 1337134792886760215L
	)
	long field1625;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	IterableNodeDeque field1618;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public class143(Buffer var1) {
		this.field1625 = -1L; // L: 10
		this.field1618 = new IterableNodeDeque(); // L: 11
		this.method2961(var1); // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "178883097"
	)
	void method2961(Buffer var1) {
		this.field1626 = var1.readLong(); // L: 23
		this.field1625 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class138(this);
			} else if (var2 == 4) {
				var3 = new class149(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class134(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class132(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class139(this);
			}

			((class142)var3).vmethod3022(var1); // L: 34
			this.field1618.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lei;B)V",
		garbageValue = "5"
	)
	public void method2960(ClanChannel var1) {
		if (var1.key == this.field1626 && this.field1625 == var1.field1640) { // L: 41
			for (class142 var2 = (class142)this.field1618.last(); var2 != null; var2 = (class142)this.field1618.previous()) { // L: 42
				var2.vmethod3021(var1); // L: 43
			}

			++var1.field1640; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "100"
	)
	static int method2959(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 614
		Widget var3;
		if (var0 >= 2000) { // L: 615
			var0 -= 1000; // L: 616
			var4 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 617
			var3 = ChatChannel.getWidget(var4); // L: 618
		} else {
			var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget; // L: 620
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 621
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 622
			var3.scrollX = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 623
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 624
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 625
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 626
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 627
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 628
				var3.scrollY = 0;
			}

			SecureRandomCallable.invalidateWidget(var3); // L: 629
			return 1; // L: 630
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 632
			var3.color = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 633
			SecureRandomCallable.invalidateWidget(var3); // L: 634
			return 1; // L: 635
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 637
			var3.fill = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 638
			SecureRandomCallable.invalidateWidget(var3); // L: 639
			return 1; // L: 640
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 642
			var3.transparencyTop = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 643
			SecureRandomCallable.invalidateWidget(var3); // L: 644
			return 1; // L: 645
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 647
			var3.lineWid = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 648
			SecureRandomCallable.invalidateWidget(var3); // L: 649
			return 1; // L: 650
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 652
			var3.spriteId2 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 653
			SecureRandomCallable.invalidateWidget(var3); // L: 654
			return 1; // L: 655
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 657
			var3.spriteAngle = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 658
			SecureRandomCallable.invalidateWidget(var3); // L: 659
			return 1; // L: 660
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 662
			var3.spriteTiling = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 663
			SecureRandomCallable.invalidateWidget(var3); // L: 664
			return 1; // L: 665
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 667
			var3.modelType = 1; // L: 668
			var3.modelId = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 669
			SecureRandomCallable.invalidateWidget(var3); // L: 670
			return 1; // L: 671
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 673
			IsaacCipher.Interpreter_intStackSize -= 6; // L: 674
			var3.modelOffsetX = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 675
			var3.modelOffsetY = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 676
			var3.modelAngleX = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 677
			var3.modelAngleY = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3]; // L: 678
			var3.modelAngleZ = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 4]; // L: 679
			var3.modelZoom = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 5]; // L: 680
			SecureRandomCallable.invalidateWidget(var3); // L: 681
			return 1; // L: 682
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 684
				var8 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 685
				if (var8 != var3.sequenceId) { // L: 686
					var3.sequenceId = var8; // L: 687
					var3.modelFrame = 0; // L: 688
					var3.modelFrameCycle = 0; // L: 689
					SecureRandomCallable.invalidateWidget(var3); // L: 690
				}

				return 1; // L: 692
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 694
				var3.modelOrthog = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 695
				SecureRandomCallable.invalidateWidget(var3); // L: 696
				return 1; // L: 697
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 699
				String var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 700
				if (!var7.equals(var3.text)) { // L: 701
					var3.text = var7; // L: 702
					SecureRandomCallable.invalidateWidget(var3); // L: 703
				}

				return 1; // L: 705
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 707
				var3.fontId = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 708
				SecureRandomCallable.invalidateWidget(var3); // L: 709
				return 1; // L: 710
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 712
				IsaacCipher.Interpreter_intStackSize -= 3; // L: 713
				var3.textXAlignment = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 714
				var3.textYAlignment = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 715
				var3.textLineHeight = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 716
				SecureRandomCallable.invalidateWidget(var3); // L: 717
				return 1; // L: 718
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 720
				var3.textShadowed = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 721
				SecureRandomCallable.invalidateWidget(var3); // L: 722
				return 1; // L: 723
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 725
				var3.outline = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 726
				SecureRandomCallable.invalidateWidget(var3); // L: 727
				return 1; // L: 728
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 730
				var3.spriteShadow = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 731
				SecureRandomCallable.invalidateWidget(var3); // L: 732
				return 1; // L: 733
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 735
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 736
				SecureRandomCallable.invalidateWidget(var3); // L: 737
				return 1; // L: 738
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 740
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 741
				SecureRandomCallable.invalidateWidget(var3); // L: 742
				return 1; // L: 743
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 745
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 746
				var3.scrollWidth = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 747
				var3.scrollHeight = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 748
				SecureRandomCallable.invalidateWidget(var3); // L: 749
				if (var4 != -1 && var3.type == 0) { // L: 750
					class115.revalidateWidgetScroll(MouseRecorder.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 751
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 753
				class288.resumePauseWidget(var3.id, var3.childIndex); // L: 754
				Client.meslayerContinueWidget = var3; // L: 755
				SecureRandomCallable.invalidateWidget(var3); // L: 756
				return 1; // L: 757
			} else if (var0 == 1122) { // L: 759
				var3.spriteId = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 760
				SecureRandomCallable.invalidateWidget(var3); // L: 761
				return 1; // L: 762
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 764
				var3.color2 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 765
				SecureRandomCallable.invalidateWidget(var3); // L: 766
				return 1; // L: 767
			} else if (var0 == 1124) { // L: 769
				var3.transparencyBot = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 770
				SecureRandomCallable.invalidateWidget(var3); // L: 771
				return 1; // L: 772
			} else if (var0 == 1125) { // L: 774
				var8 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 775
				FillMode var6 = (FillMode)class130.findEnumerated(class253.FillMode_values(), var8); // L: 776
				if (var6 != null) { // L: 777
					var3.fillMode = var6; // L: 778
					SecureRandomCallable.invalidateWidget(var3); // L: 779
				}

				return 1; // L: 781
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 783
					var5 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 784
					var3.field3359 = var5; // L: 785
					return 1; // L: 786
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 788
					var5 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 789
					var3.modelTransparency = var5; // L: 790
					return 1; // L: 791
				} else if (var0 == 1128) { // L: 793
					IsaacCipher.Interpreter_intStackSize -= 2; // L: 794
					return 1; // L: 795
				} else {
					return 2; // L: 797
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-317869339"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 569
		if (PacketBufferNode.garbageCollector == null || !PacketBufferNode.garbageCollector.isValid()) { // L: 570
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 572

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 573
					if (var2.isValid()) { // L: 575
						PacketBufferNode.garbageCollector = var2; // L: 576
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 577
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 578
					}
				}
			} catch (Throwable var11) { // L: 583
			}
		}

		if (PacketBufferNode.garbageCollector != null) { // L: 585
			long var9 = Ignored.method6459(); // L: 586
			long var3 = PacketBufferNode.garbageCollector.getCollectionTime(); // L: 587
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) { // L: 588
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 589
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 590
				if (0L != var7) { // L: 591
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 593
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 594
		}

		return var0; // L: 596
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "74"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4969
	}
}
