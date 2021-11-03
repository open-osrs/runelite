import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eu")
public abstract class class132 extends Node {
	@ObfuscatedName("p")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;

	class132() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1393452113"
	)
	abstract void vmethod2839(Buffer var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-1714930149"
	)
	abstract void vmethod2838(ClanChannel var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-1801380146"
	)
	@Export("sortItemsByName")
	static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 13
			int var4 = (var3 + var2) / 2; // L: 14
			int var5 = var2; // L: 15
			String var6 = var0[var4]; // L: 16
			var0[var4] = var0[var3]; // L: 17
			var0[var3] = var6;
			short var7 = var1[var4]; // L: 19
			var1[var4] = var1[var3]; // L: 20
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;Ljava/lang/String;B)I",
		garbageValue = "101"
	)
	public static int method2769(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		int var4 = var1.length(); // L: 21
		byte[] var5 = new byte[var4]; // L: 22

		for (int var6 = 0; var6 < var4; ++var6) { // L: 23
			char var7 = var1.charAt(var6); // L: 24
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 25
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) { // L: 26
				var5[var6] = -128;
			} else if (var7 == 8218) { // L: 27
				var5[var6] = -126;
			} else if (var7 == 402) { // L: 28
				var5[var6] = -125;
			} else if (var7 == 8222) { // L: 29
				var5[var6] = -124;
			} else if (var7 == 8230) { // L: 30
				var5[var6] = -123;
			} else if (var7 == 8224) { // L: 31
				var5[var6] = -122;
			} else if (var7 == 8225) { // L: 32
				var5[var6] = -121;
			} else if (var7 == 710) { // L: 33
				var5[var6] = -120;
			} else if (var7 == 8240) { // L: 34
				var5[var6] = -119;
			} else if (var7 == 352) { // L: 35
				var5[var6] = -118;
			} else if (var7 == 8249) { // L: 36
				var5[var6] = -117;
			} else if (var7 == 338) { // L: 37
				var5[var6] = -116;
			} else if (var7 == 381) { // L: 38
				var5[var6] = -114;
			} else if (var7 == 8216) { // L: 39
				var5[var6] = -111;
			} else if (var7 == 8217) { // L: 40
				var5[var6] = -110;
			} else if (var7 == 8220) { // L: 41
				var5[var6] = -109;
			} else if (var7 == 8221) { // L: 42
				var5[var6] = -108;
			} else if (var7 == 8226) { // L: 43
				var5[var6] = -107;
			} else if (var7 == 8211) { // L: 44
				var5[var6] = -106;
			} else if (var7 == 8212) { // L: 45
				var5[var6] = -105;
			} else if (var7 == 732) { // L: 46
				var5[var6] = -104;
			} else if (var7 == 8482) { // L: 47
				var5[var6] = -103;
			} else if (var7 == 353) { // L: 48
				var5[var6] = -102;
			} else if (var7 == 8250) { // L: 49
				var5[var6] = -101;
			} else if (var7 == 339) { // L: 50
				var5[var6] = -100;
			} else if (var7 == 382) { // L: 51
				var5[var6] = -98;
			} else if (var7 == 376) { // L: 52
				var5[var6] = -97;
			} else {
				var5[var6] = 63; // L: 53
			}
		}

		var0.writeSmartByteShort(var5.length); // L: 58
		var0.offset += class264.huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 59
		return var0.offset - var2; // L: 60
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-79187056"
	)
	static int method2766(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 617
		Widget var3;
		if (var0 >= 2000) { // L: 618
			var0 -= 1000; // L: 619
			var4 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 620
			var3 = UserComparator9.getWidget(var4); // L: 621
		} else {
			var3 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget; // L: 623
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 624
			class14.Interpreter_intStackSize -= 2; // L: 625
			var3.scrollX = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 626
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 627
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 628
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 629
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 630
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 631
				var3.scrollY = 0;
			}

			class184.invalidateWidget(var3); // L: 632
			return 1; // L: 633
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 635
			var3.color = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 636
			class184.invalidateWidget(var3); // L: 637
			return 1; // L: 638
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 640
			var3.fill = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 641
			class184.invalidateWidget(var3); // L: 642
			return 1; // L: 643
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 645
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 646
			class184.invalidateWidget(var3); // L: 647
			return 1; // L: 648
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 650
			var3.lineWid = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 651
			class184.invalidateWidget(var3); // L: 652
			return 1; // L: 653
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 655
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 656
			class184.invalidateWidget(var3); // L: 657
			return 1; // L: 658
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 660
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 661
			class184.invalidateWidget(var3); // L: 662
			return 1; // L: 663
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 665
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 666
			class184.invalidateWidget(var3); // L: 667
			return 1; // L: 668
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 670
			var3.modelType = 1; // L: 671
			var3.modelId = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 672
			class184.invalidateWidget(var3); // L: 673
			return 1; // L: 674
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 676
			class14.Interpreter_intStackSize -= 6; // L: 677
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 678
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 679
			var3.modelAngleX = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 680
			var3.modelAngleY = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 3]; // L: 681
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 4]; // L: 682
			var3.modelZoom = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 5]; // L: 683
			class184.invalidateWidget(var3); // L: 684
			return 1; // L: 685
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 687
				var8 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 688
				if (var8 != var3.sequenceId) { // L: 689
					var3.sequenceId = var8; // L: 690
					var3.modelFrame = 0; // L: 691
					var3.modelFrameCycle = 0; // L: 692
					class184.invalidateWidget(var3); // L: 693
				}

				return 1; // L: 695
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 697
				var3.modelOrthog = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 698
				class184.invalidateWidget(var3); // L: 699
				return 1; // L: 700
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 702
				String var7 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 703
				if (!var7.equals(var3.text)) { // L: 704
					var3.text = var7; // L: 705
					class184.invalidateWidget(var3); // L: 706
				}

				return 1; // L: 708
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 710
				var3.fontId = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 711
				class184.invalidateWidget(var3); // L: 712
				return 1; // L: 713
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 715
				class14.Interpreter_intStackSize -= 3; // L: 716
				var3.textXAlignment = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 717
				var3.textYAlignment = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 718
				var3.textLineHeight = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 719
				class184.invalidateWidget(var3); // L: 720
				return 1; // L: 721
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 723
				var3.textShadowed = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 724
				class184.invalidateWidget(var3); // L: 725
				return 1; // L: 726
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 728
				var3.outline = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 729
				class184.invalidateWidget(var3); // L: 730
				return 1; // L: 731
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 733
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 734
				class184.invalidateWidget(var3); // L: 735
				return 1; // L: 736
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 738
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 739
				class184.invalidateWidget(var3); // L: 740
				return 1; // L: 741
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 743
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 744
				class184.invalidateWidget(var3); // L: 745
				return 1; // L: 746
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 748
				class14.Interpreter_intStackSize -= 2; // L: 749
				var3.scrollWidth = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 750
				var3.scrollHeight = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 751
				class184.invalidateWidget(var3); // L: 752
				if (var4 != -1 && var3.type == 0) { // L: 753
					MouseRecorder.revalidateWidgetScroll(WorldMapSection1.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 754
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 756
				class92.resumePauseWidget(var3.id, var3.childIndex); // L: 757
				Client.meslayerContinueWidget = var3; // L: 758
				class184.invalidateWidget(var3); // L: 759
				return 1; // L: 760
			} else if (var0 == 1122) { // L: 762
				var3.spriteId = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 763
				class184.invalidateWidget(var3); // L: 764
				return 1; // L: 765
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 767
				var3.color2 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 768
				class184.invalidateWidget(var3); // L: 769
				return 1; // L: 770
			} else if (var0 == 1124) { // L: 772
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 773
				class184.invalidateWidget(var3); // L: 774
				return 1; // L: 775
			} else if (var0 == 1125) { // L: 777
				var8 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 778
				FillMode var6 = (FillMode)UserComparator4.findEnumerated(Ignored.FillMode_values(), var8); // L: 779
				if (var6 != null) { // L: 780
					var3.fillMode = var6; // L: 781
					class184.invalidateWidget(var3); // L: 782
				}

				return 1; // L: 784
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 786
					var5 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 787
					var3.field3085 = var5; // L: 788
					return 1; // L: 789
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 791
					var5 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 792
					var3.modelTransparency = var5; // L: 793
					return 1; // L: 794
				} else if (var0 == 1128) { // L: 796
					class14.Interpreter_intStackSize -= 2; // L: 797
					return 1; // L: 798
				} else {
					return 2; // L: 800
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Lmp;",
		garbageValue = "-2068064468"
	)
	public static AbstractSocket method2767(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2); // L: 10
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lcx;ZI)V",
		garbageValue = "1479413091"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 5060
			var0.isUnanimated = false; // L: 5061
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 5062 5063
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 5065
			int var3 = var0.y >> 7; // L: 5066
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 5067
				long var4 = PacketBuffer.calculateTag(0, 0, 0, false, var0.index); // L: 5068
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 5069
					var0.isUnanimated = false; // L: 5070
					var0.tileHeight = class392.getTileHeight(var0.x, var0.y, GrandExchangeOfferTotalQuantityComparator.Client_plane); // L: 5071
					var0.playerCycle = Client.cycle; // L: 5072
					GameBuild.scene.addNullableObject(GrandExchangeOfferTotalQuantityComparator.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 5073
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 5076
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 5077
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 5078
					}

					var0.tileHeight = class392.getTileHeight(var0.x, var0.y, GrandExchangeOfferTotalQuantityComparator.Client_plane); // L: 5080
					var0.playerCycle = Client.cycle; // L: 5081
					GameBuild.scene.drawEntity(GrandExchangeOfferTotalQuantityComparator.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 5082
				}
			}
		}

	} // L: 5086
}
