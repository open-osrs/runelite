import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aq")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static Archive archive5;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 2023281377
	)
	static int baseY;
	@ObfuscatedName("z")
	String text;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1365255333
	)
	int width;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2029280505
	)
	int height;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILab;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-1281997654"
	)
	static int method497(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 548
		Widget var3;
		if (var0 >= 2000) { // L: 549
			var0 -= 1000; // L: 550
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 551
			var3 = TileItem.getWidget(var4); // L: 552
		} else {
			var3 = var2 ? Canvas.field438 : class3.field12; // L: 554
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 555
			Interpreter.Interpreter_intStackSize -= 2; // L: 556
			var3.scrollX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 557
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 558
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 559
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 560
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 561
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 562
				var3.scrollY = 0;
			}

			class52.invalidateWidget(var3); // L: 563
			return 1; // L: 564
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 566
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 567
			class52.invalidateWidget(var3); // L: 568
			return 1; // L: 569
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 571
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 572
			class52.invalidateWidget(var3); // L: 573
			return 1; // L: 574
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 576
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 577
			class52.invalidateWidget(var3); // L: 578
			return 1; // L: 579
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 581
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 582
			class52.invalidateWidget(var3); // L: 583
			return 1; // L: 584
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 586
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 587
			class52.invalidateWidget(var3); // L: 588
			return 1; // L: 589
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 591
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 592
			class52.invalidateWidget(var3); // L: 593
			return 1; // L: 594
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 596
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 597
			class52.invalidateWidget(var3); // L: 598
			return 1; // L: 599
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 601
			var3.modelType = 1; // L: 602
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 603
			class52.invalidateWidget(var3); // L: 604
			return 1; // L: 605
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 607
			Interpreter.Interpreter_intStackSize -= 6; // L: 608
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 609
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 610
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 611
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 612
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 613
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 614
			class52.invalidateWidget(var3); // L: 615
			return 1; // L: 616
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 618
				var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 619
				if (var8 != var3.sequenceId) { // L: 620
					var3.sequenceId = var8; // L: 621
					var3.modelFrame = 0; // L: 622
					var3.modelFrameCycle = 0; // L: 623
					class52.invalidateWidget(var3); // L: 624
				}

				return 1; // L: 626
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 628
				var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 629
				class52.invalidateWidget(var3); // L: 630
				return 1; // L: 631
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 633
				String var7 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 634
				if (!var7.equals(var3.text)) { // L: 635
					var3.text = var7; // L: 636
					class52.invalidateWidget(var3); // L: 637
				}

				return 1; // L: 639
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 641
				var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 642
				class52.invalidateWidget(var3); // L: 643
				return 1; // L: 644
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 646
				Interpreter.Interpreter_intStackSize -= 3; // L: 647
				var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 648
				var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 649
				var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 650
				class52.invalidateWidget(var3); // L: 651
				return 1; // L: 652
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 654
				var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 655
				class52.invalidateWidget(var3); // L: 656
				return 1; // L: 657
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 659
				var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 660
				class52.invalidateWidget(var3); // L: 661
				return 1; // L: 662
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 664
				var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 665
				class52.invalidateWidget(var3); // L: 666
				return 1; // L: 667
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 669
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 670
				class52.invalidateWidget(var3); // L: 671
				return 1; // L: 672
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 674
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 675
				class52.invalidateWidget(var3); // L: 676
				return 1; // L: 677
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 679
				Interpreter.Interpreter_intStackSize -= 2; // L: 680
				var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 681
				var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 682
				class52.invalidateWidget(var3); // L: 683
				if (var4 != -1 && var3.type == 0) { // L: 684
					class4.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 685
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 687
				AbstractSocket.resumePauseWidget(var3.id, var3.childIndex); // L: 688
				Client.meslayerContinueWidget = var3; // L: 689
				class52.invalidateWidget(var3); // L: 690
				return 1; // L: 691
			} else if (var0 == 1122) { // L: 693
				var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 694
				class52.invalidateWidget(var3); // L: 695
				return 1; // L: 696
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 698
				var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 699
				class52.invalidateWidget(var3); // L: 700
				return 1; // L: 701
			} else if (var0 == 1124) { // L: 703
				var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 704
				class52.invalidateWidget(var3); // L: 705
				return 1; // L: 706
			} else if (var0 == ScriptOpcodes.CC_SETFILLMODE) { // L: 708
				var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 709
				FillMode var6 = (FillMode)TextureProvider.findEnumerated(class25.FillMode_values(), var8); // L: 710
				if (var6 != null) { // L: 711
					var3.fillMode = var6; // L: 712
					class52.invalidateWidget(var3); // L: 713
				}

				return 1; // L: 715
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 717
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 718
					var3.field2639 = var5; // L: 719
					return 1; // L: 720
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 722
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 723
					var3.modelTransparency = var5; // L: 724
					return 1; // L: 725
				} else {
					return 2; // L: 727
				}
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "88"
	)
	protected static final void method498() {
		AbstractWorldMapIcon.clock.mark(); // L: 404

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 405
			GameShell.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 406
			GameShell.clientTickTimes[var0] = 0L;
		}

		class58.gameCyclesToDo = 0; // L: 407
	} // L: 408
}
