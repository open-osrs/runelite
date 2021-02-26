import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cs")
public class class90 {
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = -944892435
	)
	@Export("Client_plane")
	static int Client_plane;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljy;",
		garbageValue = "52"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 62
		if (var1 != null) { // L: 63
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 64
			var1 = new NPCComposition(); // L: 65
			var1.id = var0; // L: 66
			if (var2 != null) { // L: 67
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 68
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 69
			return var1; // L: 70
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "630017"
	)
	static int method2193(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 551
		Widget var3;
		if (var0 >= 2000) { // L: 552
			var0 -= 1000; // L: 553
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 554
			var3 = class237.getWidget(var4); // L: 555
		} else {
			var3 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 557
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 558
			Interpreter.Interpreter_intStackSize -= 2; // L: 559
			var3.scrollX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 560
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 561
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 562
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 563
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 564
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 565
				var3.scrollY = 0;
			}

			IsaacCipher.invalidateWidget(var3); // L: 566
			return 1; // L: 567
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 569
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 570
			IsaacCipher.invalidateWidget(var3); // L: 571
			return 1; // L: 572
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 574
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 575
			IsaacCipher.invalidateWidget(var3); // L: 576
			return 1; // L: 577
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 579
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 580
			IsaacCipher.invalidateWidget(var3); // L: 581
			return 1; // L: 582
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 584
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 585
			IsaacCipher.invalidateWidget(var3); // L: 586
			return 1; // L: 587
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 589
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 590
			IsaacCipher.invalidateWidget(var3); // L: 591
			return 1; // L: 592
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 594
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 595
			IsaacCipher.invalidateWidget(var3); // L: 596
			return 1; // L: 597
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 599
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 600
			IsaacCipher.invalidateWidget(var3); // L: 601
			return 1; // L: 602
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 604
			var3.modelType = 1; // L: 605
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 606
			IsaacCipher.invalidateWidget(var3); // L: 607
			return 1; // L: 608
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 610
			Interpreter.Interpreter_intStackSize -= 6; // L: 611
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 612
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 613
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 614
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 615
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 616
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 617
			IsaacCipher.invalidateWidget(var3); // L: 618
			return 1; // L: 619
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8; // L: 624
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0; // L: 626
					IsaacCipher.invalidateWidget(var3); // L: 627
				}

				return 1; // L: 629
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 631
				var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 632
				IsaacCipher.invalidateWidget(var3); // L: 633
				return 1; // L: 634
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 636
				String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 637
				if (!var7.equals(var3.text)) { // L: 638
					var3.text = var7; // L: 639
					IsaacCipher.invalidateWidget(var3); // L: 640
				}

				return 1; // L: 642
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 644
				var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 645
				IsaacCipher.invalidateWidget(var3); // L: 646
				return 1; // L: 647
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 649
				Interpreter.Interpreter_intStackSize -= 3; // L: 650
				var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 651
				var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 652
				var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 653
				IsaacCipher.invalidateWidget(var3); // L: 654
				return 1; // L: 655
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 657
				var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 658
				IsaacCipher.invalidateWidget(var3); // L: 659
				return 1; // L: 660
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 662
				var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 663
				IsaacCipher.invalidateWidget(var3); // L: 664
				return 1; // L: 665
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 667
				var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 668
				IsaacCipher.invalidateWidget(var3); // L: 669
				return 1; // L: 670
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 672
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 673
				IsaacCipher.invalidateWidget(var3); // L: 674
				return 1; // L: 675
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 677
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 678
				IsaacCipher.invalidateWidget(var3); // L: 679
				return 1; // L: 680
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 682
				Interpreter.Interpreter_intStackSize -= 2; // L: 683
				var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 684
				var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 685
				IsaacCipher.invalidateWidget(var3); // L: 686
				if (var4 != -1 && var3.type == 0) { // L: 687
					class182.revalidateWidgetScroll(DefaultsGroup.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 688
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 690
				class25.resumePauseWidget(var3.id, var3.childIndex); // L: 691
				Client.meslayerContinueWidget = var3; // L: 692
				IsaacCipher.invalidateWidget(var3); // L: 693
				return 1; // L: 694
			} else if (var0 == 1122) { // L: 696
				var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 697
				IsaacCipher.invalidateWidget(var3); // L: 698
				return 1; // L: 699
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 701
				var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 702
				IsaacCipher.invalidateWidget(var3); // L: 703
				return 1; // L: 704
			} else if (var0 == 1124) { // L: 706
				var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 707
				IsaacCipher.invalidateWidget(var3); // L: 708
				return 1; // L: 709
			} else if (var0 == ScriptOpcodes.CC_SETFILLMODE) { // L: 711
				var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 712
				FillMode var6 = (FillMode)InterfaceParent.findEnumerated(class307.FillMode_values(), var8); // L: 713
				if (var6 != null) { // L: 714
					var3.fillMode = var6; // L: 715
					IsaacCipher.invalidateWidget(var3); // L: 716
				}

				return 1; // L: 718
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 720
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 721
					var3.field2627 = var5; // L: 722
					return 1; // L: 723
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 725
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 726
					var3.modelTransparency = var5; // L: 727
					return 1; // L: 728
				} else {
					return 2; // L: 730
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2128979355"
	)
	static void method2191() {
		Players.Players_count = 0; // L: 620

		for (int var0 = 0; var0 < 2048; ++var0) { // L: 621
			Players.field1269[var0] = null; // L: 622
			Players.field1274[var0] = 1; // L: 623
		}

	} // L: 625
}
