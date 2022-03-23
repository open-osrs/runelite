import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("di")
public class class117 {
	@ObfuscatedName("v")
	boolean field1434;
	@ObfuscatedName("o")
	boolean field1427;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	class116 field1428;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	class116 field1429;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Ldh;"
	)
	class113[] field1430;
	@ObfuscatedName("n")
	boolean field1438;
	@ObfuscatedName("d")
	float field1432;
	@ObfuscatedName("f")
	float field1433;
	@ObfuscatedName("u")
	float[] field1440;
	@ObfuscatedName("r")
	float[] field1435;
	@ObfuscatedName("k")
	boolean field1442;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 111409657
	)
	int field1436;
	@ObfuscatedName("c")
	float[] field1439;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1432271977
	)
	int field1426;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1400069259
	)
	int field1431;
	@ObfuscatedName("s")
	float field1441;
	@ObfuscatedName("b")
	float field1437;

	class117() {
		this.field1440 = new float[4]; // L: 16
		this.field1435 = new float[4]; // L: 17
		this.field1442 = true; // L: 18
		this.field1436 = 0; // L: 19
	} // L: 26

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;IB)I",
		garbageValue = "20"
	)
	int method2722(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 29
		int var4 = var1.readUnsignedByte(); // L: 30
		class123 var5 = (class123)ChatChannel.findEnumerated(DevicePcmPlayerProvider.method383(), var4); // L: 32
		if (var5 == null) { // L: 33
			var5 = class123.field1501;
		}

		this.field1428 = class327.method6109(var1.readUnsignedByte()); // L: 35
		this.field1429 = class327.method6109(var1.readUnsignedByte()); // L: 36
		this.field1434 = var1.readUnsignedByte() != 0; // L: 37
		this.field1430 = new class113[var3]; // L: 38
		class113 var8 = null; // L: 39

		int var6;
		for (var6 = 0; var6 < var3; ++var6) { // L: 40
			class113 var7 = new class113(); // L: 41
			var7.method2632(var1, var2); // L: 42
			this.field1430[var6] = var7; // L: 43
			if (var8 != null) { // L: 44
				var8.field1392 = var7; // L: 45
			}

			var8 = var7; // L: 47
		}

		this.field1426 = this.field1430[0].field1384; // L: 49
		this.field1431 = this.field1430[this.method2706() - 1].field1384; // L: 50
		this.field1439 = new float[this.method2703() + 1]; // L: 52

		for (var6 = this.method2699(); var6 <= this.method2702(); ++var6) { // L: 53
			this.field1439[var6 - this.method2699()] = AttackOption.method2392(this, (float)var6); // L: 54
		}

		this.field1430 = null; // L: 56
		this.field1441 = AttackOption.method2392(this, (float)(this.method2699() - 1)); // L: 58
		this.field1437 = AttackOption.method2392(this, (float)(this.method2702() + 1)); // L: 59
		return var3; // L: 60
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "296880524"
	)
	public float method2700(int var1) {
		if (var1 < this.method2699()) { // L: 65
			return this.field1441; // L: 66
		} else {
			return var1 > this.method2702() ? this.field1437 : this.field1439[var1 - this.method2699()]; // L: 68 69 71
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1807012578"
	)
	int method2699() {
		return this.field1426; // L: 76
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1753260984"
	)
	int method2702() {
		return this.field1431; // L: 80
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "760390929"
	)
	int method2703() {
		return this.method2702() - this.method2699(); // L: 84
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "201296115"
	)
	int method2704(float var1) {
		if (this.field1436 < 0 || (float)this.field1430[this.field1436].field1384 > var1 || this.field1430[this.field1436].field1392 != null && (float)this.field1430[this.field1436].field1392.field1384 <= var1) { // L: 88
			if (var1 >= (float)this.method2699() && var1 <= (float)this.method2702()) { // L: 91
				int var2 = this.method2706(); // L: 94
				int var3 = this.field1436; // L: 95
				if (var2 > 0) { // L: 96
					int var4 = 0; // L: 97
					int var5 = var2 - 1; // L: 98

					do {
						int var6 = var4 + var5 >> 1; // L: 100
						if (var1 < (float)this.field1430[var6].field1384) { // L: 101
							if (var1 > (float)this.field1430[var6 - 1].field1384) { // L: 102
								var3 = var6 - 1; // L: 103
								break;
							}

							var5 = var6 - 1; // L: 107
						} else {
							if (var1 <= (float)this.field1430[var6].field1384) { // L: 110
								var3 = var6; // L: 120
								break; // L: 121
							}

							if (var1 < (float)this.field1430[var6 + 1].field1384) { // L: 111
								var3 = var6; // L: 112
								break; // L: 113
							}

							var4 = var6 + 1; // L: 116
						}
					} while(var4 <= var5); // L: 123
				}

				if (var3 != this.field1436) { // L: 125
					this.field1436 = var3; // L: 126
					this.field1442 = true; // L: 127
				}

				return this.field1436; // L: 129
			} else {
				return -1; // L: 92
			}
		} else {
			return this.field1436; // L: 89
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(FI)Ldh;",
		garbageValue = "1784485987"
	)
	class113 method2705(float var1) {
		int var2 = this.method2704(var1); // L: 133
		return var2 >= 0 && var2 < this.field1430.length ? this.field1430[var2] : null; // L: 134 135 138
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "79780462"
	)
	int method2706() {
		return this.field1430 == null ? 0 : this.field1430.length; // L: 143 144
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-1667390542"
	)
	static int method2709(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 612
		Widget var3;
		if (var0 >= 2000) { // L: 613
			var0 -= 1000; // L: 614
			var4 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 615
			var3 = HorizontalAlignment.getWidget(var4); // L: 616
		} else {
			var3 = var2 ? class432.scriptDotWidget : class341.scriptActiveWidget; // L: 618
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 619
			class295.Interpreter_intStackSize -= 2; // L: 620
			var3.scrollX = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 621
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 622
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 623
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 624
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 625
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 626
				var3.scrollY = 0;
			}

			class290.invalidateWidget(var3); // L: 627
			return 1; // L: 628
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 630
			var3.color = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 631
			class290.invalidateWidget(var3); // L: 632
			return 1; // L: 633
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 635
			var3.fill = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 636
			class290.invalidateWidget(var3); // L: 637
			return 1; // L: 638
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 640
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 641
			class290.invalidateWidget(var3); // L: 642
			return 1; // L: 643
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 645
			var3.lineWid = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 646
			class290.invalidateWidget(var3); // L: 647
			return 1; // L: 648
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 650
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 651
			class290.invalidateWidget(var3); // L: 652
			return 1; // L: 653
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 655
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 656
			class290.invalidateWidget(var3); // L: 657
			return 1; // L: 658
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 660
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 661
			class290.invalidateWidget(var3); // L: 662
			return 1; // L: 663
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 665
			var3.modelType = 1; // L: 666
			var3.modelId = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 667
			class290.invalidateWidget(var3); // L: 668
			return 1; // L: 669
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 671
			class295.Interpreter_intStackSize -= 6; // L: 672
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 673
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 674
			var3.modelAngleX = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 675
			var3.modelAngleY = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3]; // L: 676
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 4]; // L: 677
			var3.modelZoom = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 5]; // L: 678
			class290.invalidateWidget(var3); // L: 679
			return 1; // L: 680
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 682
				var8 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 683
				if (var8 != var3.sequenceId) { // L: 684
					var3.sequenceId = var8; // L: 685
					var3.modelFrame = 0; // L: 686
					var3.modelFrameCycle = 0; // L: 687
					class290.invalidateWidget(var3); // L: 688
				}

				return 1; // L: 690
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 692
				var3.modelOrthog = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 693
				class290.invalidateWidget(var3); // L: 694
				return 1; // L: 695
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 697
				String var7 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 698
				if (!var7.equals(var3.text)) { // L: 699
					var3.text = var7; // L: 700
					class290.invalidateWidget(var3); // L: 701
				}

				return 1; // L: 703
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 705
				var3.fontId = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 706
				class290.invalidateWidget(var3); // L: 707
				return 1; // L: 708
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 710
				class295.Interpreter_intStackSize -= 3; // L: 711
				var3.textXAlignment = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 712
				var3.textYAlignment = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 713
				var3.textLineHeight = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 714
				class290.invalidateWidget(var3); // L: 715
				return 1; // L: 716
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 718
				var3.textShadowed = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 719
				class290.invalidateWidget(var3); // L: 720
				return 1; // L: 721
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 723
				var3.outline = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 724
				class290.invalidateWidget(var3); // L: 725
				return 1; // L: 726
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 728
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 729
				class290.invalidateWidget(var3); // L: 730
				return 1; // L: 731
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 733
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 734
				class290.invalidateWidget(var3); // L: 735
				return 1; // L: 736
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 738
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 739
				class290.invalidateWidget(var3); // L: 740
				return 1; // L: 741
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 743
				class295.Interpreter_intStackSize -= 2; // L: 744
				var3.scrollWidth = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 745
				var3.scrollHeight = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 746
				class290.invalidateWidget(var3); // L: 747
				if (var4 != -1 && var3.type == 0) { // L: 748
					GrandExchangeEvents.revalidateWidgetScroll(EnumComposition.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 749
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 751
				Messages.resumePauseWidget(var3.id, var3.childIndex); // L: 752
				Client.meslayerContinueWidget = var3; // L: 753
				class290.invalidateWidget(var3); // L: 754
				return 1; // L: 755
			} else if (var0 == 1122) { // L: 757
				var3.spriteId = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 758
				class290.invalidateWidget(var3); // L: 759
				return 1; // L: 760
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 762
				var3.color2 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 763
				class290.invalidateWidget(var3); // L: 764
				return 1; // L: 765
			} else if (var0 == 1124) { // L: 767
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 768
				class290.invalidateWidget(var3); // L: 769
				return 1; // L: 770
			} else if (var0 == 1125) { // L: 772
				var8 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 773
				FillMode var6 = (FillMode)ChatChannel.findEnumerated(PlayerType.FillMode_values(), var8); // L: 774
				if (var6 != null) { // L: 775
					var3.fillMode = var6; // L: 776
					class290.invalidateWidget(var3); // L: 777
				}

				return 1; // L: 779
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 781
					var5 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 782
					var3.field3491 = var5; // L: 783
					return 1; // L: 784
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 786
					var5 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 787
					var3.modelTransparency = var5; // L: 788
					return 1; // L: 789
				} else if (var0 == 1128) { // L: 791
					class295.Interpreter_intStackSize -= 2; // L: 792
					return 1; // L: 793
				} else if (var0 == 1129) { // L: 795
					var3.field3386 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 796
					class290.invalidateWidget(var3); // L: 797
					return 1; // L: 798
				} else if (var0 == 1130) { // L: 800
					var3.method5720(Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize], UserComparator9.urlRequester, class4.method16()); // L: 801
					return 1; // L: 802
				} else if (var0 == 1131) { // L: 804
					class295.Interpreter_intStackSize -= 2; // L: 805
					var3.method5639(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]); // L: 806
					return 1; // L: 807
				} else if (var0 == 1132) { // L: 809
					var3.method5682(Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 810
					return 1; // L: 811
				} else {
					return 2; // L: 813
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1589949227"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 139
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Ldu;",
		garbageValue = "-1883042828"
	)
	static class122 method2724(int var0) {
		class122 var1 = (class122)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 333
		if (var1 != null) { // L: 334
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 336
			AbstractArchive var4 = DevicePcmPlayerProvider.SequenceDefinition_skeletonsArchive; // L: 337
			boolean var5 = true; // L: 339
			byte[] var6 = var3.takeFile(var0 >> 16 & 65535, var0 & 65535); // L: 340
			class122 var2;
			if (var6 == null) { // L: 341
				var5 = false; // L: 342
				var2 = null; // L: 343
			} else {
				int var7 = (var6[1] & 255) << 8 | var6[2] & 255; // L: 346
				byte[] var8 = var4.getFile(var7, 0); // L: 349
				if (var8 == null) { // L: 350
					var5 = false;
				}

				if (!var5) { // L: 351
					var2 = null; // L: 352
				} else {
					try {
						var2 = new class122(var3, var4, var0, false); // L: 356
					} catch (Exception var10) { // L: 358
						var2 = null; // L: 359
					}
				}
			}

			if (var2 != null) { // L: 363
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2; // L: 364
		}
	}
}
