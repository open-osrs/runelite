import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bp")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cx")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cw")
	static int[] field435;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -975081949
	)
	static int field422;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 854592381
	)
	static int field423;
	@ObfuscatedName("cd")
	static char[] field424;
	@ObfuscatedName("cj")
	static int[] field425;
	@ObfuscatedName("cm")
	public static int[] field430;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 99767687
	)
	public static int field427;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1166391639
	)
	static int field415;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -440762137
	)
	static int field413;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1638279281
	)
	static int field428;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 49570399
	)
	@Export("KeyHandler_idleCycles")
	static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("co")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 1074315087
	)
	@Export("menuWidth")
	static int menuWidth;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 13
		KeyHandler_pressedKeys = new boolean[112]; // L: 100
		field435 = new int[128]; // L: 103
		field422 = 0; // L: 104
		field423 = 0; // L: 105
		field424 = new char[128]; // L: 106
		field425 = new int[128]; // L: 107
		field430 = new int[128]; // L: 108
		field427 = 0; // L: 109
		field415 = 0; // L: 110
		field413 = 0; // L: 111
		field428 = 0; // L: 112
		KeyHandler_idleCycles = 0; // L: 113
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 114
	}

	KeyHandler() {
	} // L: 116

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 197
			int var2 = var1.getKeyCode(); // L: 198
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 199
				var2 = KeyHandler_keyCodes[var2]; // L: 200
				if ((var2 & 128) != 0) { // L: 201
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 203
			}

			if (field423 >= 0 && var2 >= 0) { // L: 204
				field435[field423] = var2; // L: 205
				field423 = field423 + 1 & 127; // L: 206
				if (field422 == field423) { // L: 207
					field423 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 209
				var3 = field413 + 1 & 127; // L: 210
				if (var3 != field415) { // L: 211
					field425[field413] = var2; // L: 212
					field424[field413] = 0; // L: 213
					field413 = var3; // L: 214
				}
			}

			var3 = var1.getModifiers(); // L: 217
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 218
				var1.consume(); // L: 219
			}
		}

	} // L: 222

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 225
			int var2 = var1.getKeyCode(); // L: 226
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 227
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 228
			}

			if (field423 >= 0 && var2 >= 0) { // L: 229
				field435[field423] = ~var2; // L: 230
				field423 = field423 + 1 & 127; // L: 231
				if (field422 == field423) { // L: 232
					field423 = -1;
				}
			}
		}

		var1.consume(); // L: 235
	} // L: 236

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 239
			char var2 = var1.getKeyChar(); // L: 240
			if (var2 != 0 && var2 != '\uffff') { // L: 241
				boolean var3;
				if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) { // L: 244
					label53: {
						if (var2 != 0) { // L: 248
							char[] var4 = class298.cp1252AsciiExtension; // L: 250

							for (int var5 = 0; var5 < var4.length; ++var5) { // L: 251
								char var6 = var4[var5]; // L: 252
								if (var2 == var6) { // L: 254
									var3 = true; // L: 255
									break label53; // L: 256
								}
							}
						}

						var3 = false; // L: 262
					}
				} else {
					var3 = true; // L: 245
				}

				if (var3) { // L: 264
					int var7 = field413 + 1 & 127; // L: 265
					if (var7 != field415) { // L: 266
						field425[field413] = -1; // L: 267
						field424[field413] = var2; // L: 268
						field413 = var7; // L: 269
					}
				}
			}
		}

		var1.consume(); // L: 274
	} // L: 275

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 280
			field423 = -1; // L: 281
		}

	} // L: 283

	public final void focusGained(FocusEvent var1) {
	} // L: 277

	@ObfuscatedName("m")
	@Export("Entity_unpackSceneX")
	public static int Entity_unpackSceneX(long var0) {
		return (int)(var0 >>> 14 & 3L); // L: 56
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZB)I",
		garbageValue = "3"
	)
	static int method934(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 548
		Widget var3;
		if (var0 >= 2000) { // L: 549
			var0 -= 1000; // L: 550
			var4 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 551
			var3 = UserComparator4.getWidget(var4); // L: 552
		} else {
			var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122; // L: 554
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 555
			MilliClock.Interpreter_intStackSize -= 2; // L: 556
			var3.scrollX = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 557
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 558
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 559
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 560
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 561
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 562
				var3.scrollY = 0;
			}

			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 563
			return 1; // L: 564
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 566
			var3.color = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 567
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 568
			return 1; // L: 569
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 571
			var3.fill = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 572
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 573
			return 1; // L: 574
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 576
			var3.transparencyTop = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 577
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 578
			return 1; // L: 579
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 581
			var3.lineWid = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 582
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 583
			return 1; // L: 584
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 586
			var3.spriteId2 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 587
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 588
			return 1; // L: 589
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 591
			var3.spriteAngle = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 592
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 593
			return 1; // L: 594
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 596
			var3.spriteTiling = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 597
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 598
			return 1; // L: 599
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 601
			var3.modelType = 1; // L: 602
			var3.modelId = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 603
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 604
			return 1; // L: 605
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 607
			MilliClock.Interpreter_intStackSize -= 6; // L: 608
			var3.modelOffsetX = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 609
			var3.modelOffsetY = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 610
			var3.modelAngleX = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 611
			var3.modelAngleY = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3]; // L: 612
			var3.modelAngleZ = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 4]; // L: 613
			var3.modelZoom = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 5]; // L: 614
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 615
			return 1; // L: 616
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 618
				var8 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 619
				if (var8 != var3.sequenceId) { // L: 620
					var3.sequenceId = var8; // L: 621
					var3.modelFrame = 0; // L: 622
					var3.modelFrameCycle = 0; // L: 623
					GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 624
				}

				return 1; // L: 626
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 628
				var3.modelOrthog = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 629
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 630
				return 1; // L: 631
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 633
				String var7 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 634
				if (!var7.equals(var3.text)) { // L: 635
					var3.text = var7; // L: 636
					GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 637
				}

				return 1; // L: 639
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 641
				var3.fontId = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 642
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 643
				return 1; // L: 644
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 646
				MilliClock.Interpreter_intStackSize -= 3; // L: 647
				var3.textXAlignment = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 648
				var3.textYAlignment = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 649
				var3.textLineHeight = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 650
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 651
				return 1; // L: 652
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 654
				var3.textShadowed = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 655
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 656
				return 1; // L: 657
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 659
				var3.outline = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 660
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 661
				return 1; // L: 662
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 664
				var3.spriteShadow = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 665
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 666
				return 1; // L: 667
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 669
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 670
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 671
				return 1; // L: 672
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 674
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 675
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 676
				return 1; // L: 677
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 679
				MilliClock.Interpreter_intStackSize -= 2; // L: 680
				var3.scrollWidth = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 681
				var3.scrollHeight = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 682
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 683
				if (var4 != -1 && var3.type == 0) { // L: 684
					UserComparator9.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 685
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 687
				class171.resumePauseWidget(var3.id, var3.childIndex); // L: 688
				Client.meslayerContinueWidget = var3; // L: 689
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 690
				return 1; // L: 691
			} else if (var0 == 1122) { // L: 693
				var3.spriteId = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 694
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 695
				return 1; // L: 696
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 698
				var3.color2 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 699
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 700
				return 1; // L: 701
			} else if (var0 == 1124) { // L: 703
				var3.transparencyBot = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 704
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 705
				return 1; // L: 706
			} else if (var0 == ScriptOpcodes.CC_SETFILLMODE) { // L: 708
				var8 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 709
				FillMode var6 = (FillMode)class195.findEnumerated(PacketWriter.FillMode_values(), var8); // L: 710
				if (var6 != null) { // L: 711
					var3.fillMode = var6; // L: 712
					GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 713
				}

				return 1; // L: 715
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 717
					var5 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 718
					var3.field2627 = var5; // L: 719
					return 1; // L: 720
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 722
					var5 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 723
					var3.modelTransparency = var5; // L: 724
					return 1; // L: 725
				} else {
					return 2; // L: 727
				}
			}
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1840062887"
	)
	static final void method931() {
		Client.field795 = 0; // L: 5380
		int var0 = (PlayerType.localPlayer.x >> 7) + FloorDecoration.baseX; // L: 5381
		int var1 = (PlayerType.localPlayer.y >> 7) + WorldMapData_0.baseY; // L: 5382
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) { // L: 5383
			Client.field795 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) { // L: 5384
			Client.field795 = 1;
		}

		if (Client.field795 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) { // L: 5385
			Client.field795 = 0;
		}

	} // L: 5386

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "-1824225693"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 8938
			if (Client.menuOptionsCount < 500) { // L: 8939
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 8940
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 8941
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 8942
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 8943
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 8944
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 8945
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 8946
				++Client.menuOptionsCount; // L: 8947
			}

		}
	} // L: 8949

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "82006207"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 8960
			ModelData0.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 8961
		}

		long var4 = -1L; // L: 8964
		long var6 = -1L; // L: 8965
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 8970
			if (var8 >= var10) { // L: 8972
				if (var4 != -1L) { // L: 9114
					var8 = ScriptFrame.method1228(var4); // L: 9115
					int var9 = (int)(var4 >>> 7 & 127L); // L: 9118
					Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 9121
					UserComparator3.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9); // L: 9122
				}

				return; // L: 9124
			}

			long var28 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 8975
			if (var28 != var6) { // L: 8978
				label333: {
					var6 = var28; // L: 8979
					int var15 = ScriptFrame.method1228(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 8982
					int var16 = var15; // L: 8984
					long var19 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 8988
					int var18 = (int)(var19 >>> 7 & 127L); // L: 8990
					var18 = var18; // L: 8994
					int var30 = Entity_unpackSceneX(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 8997
					int var21 = StructDefinition.getEntityIdUnderMouse(var8); // L: 9000
					if (var30 == 2 && ModeWhere.scene.getObjectFlags(GrandExchangeOfferUnitPriceComparator.Client_plane, var15, var18, var28) >= 0) { // L: 9001 9002
						ObjectDefinition var22 = ScriptEvent.getObjectDefinition(var21); // L: 9003
						if (var22.transforms != null) { // L: 9004
							var22 = var22.transform();
						}

						if (var22 == null) { // L: 9005
							break label333;
						}

						if (Client.isItemSelected == 1) { // L: 9006
							ModelData0.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Client.colorStartTag(65535) + var22.name, 1, var21, var15, var18); // L: 9007
						} else if (Client.isSpellSelected) { // L: 9010
							if ((class105.selectedSpellFlags & 4) == 4) { // L: 9011
								ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Client.colorStartTag(65535) + var22.name, 2, var21, var15, var18); // L: 9012
							}
						} else {
							String[] var23 = var22.actions; // L: 9017
							if (var23 != null) { // L: 9018
								for (int var24 = 4; var24 >= 0; --var24) { // L: 9019
									if (var23[var24] != null) { // L: 9020
										short var25 = 0; // L: 9021
										if (var24 == 0) { // L: 9022
											var25 = 3;
										}

										if (var24 == 1) { // L: 9023
											var25 = 4;
										}

										if (var24 == 2) { // L: 9024
											var25 = 5;
										}

										if (var24 == 3) { // L: 9025
											var25 = 6;
										}

										if (var24 == 4) { // L: 9026
											var25 = 1001;
										}

										ModelData0.insertMenuItemNoShift(var23[var24], Client.colorStartTag(65535) + var22.name, var25, var21, var16, var18); // L: 9027
									}
								}
							}

							ModelData0.insertMenuItemNoShift("Examine", Client.colorStartTag(65535) + var22.name, 1002, var22.id, var16, var18); // L: 9032
						}
					}

					Player var26;
					int var31;
					NPC var32;
					int var39;
					int[] var40;
					if (var30 == 1) { // L: 9037
						NPC var35 = Client.npcs[var21]; // L: 9038
						if (var35 == null) { // L: 9039
							break label333;
						}

						if (var35.definition.size == 1 && (var35.x & 127) == 64 && (var35.y & 127) == 64) { // L: 9040
							for (var31 = 0; var31 < Client.npcCount; ++var31) { // L: 9041
								var32 = Client.npcs[Client.npcIndices[var31]]; // L: 9042
								if (var32 != null && var35 != var32 && var32.definition.size == 1 && var32.x == var35.x && var35.y == var32.y) { // L: 9043
									class25.addNpcToMenu(var32.definition, Client.npcIndices[var31], var16, var18);
								}
							}

							var31 = Players.Players_count; // L: 9045
							var40 = Players.Players_indices; // L: 9046

							for (var39 = 0; var39 < var31; ++var39) { // L: 9047
								var26 = Client.players[var40[var39]]; // L: 9048
								if (var26 != null && var35.x == var26.x && var26.y == var35.y) { // L: 9049
									UserComparator3.addPlayerToMenu(var26, var40[var39], var16, var18);
								}
							}
						}

						class25.addNpcToMenu(var35.definition, var21, var16, var18); // L: 9052
					}

					if (var30 == 0) { // L: 9054
						Player var36 = Client.players[var21]; // L: 9055
						if (var36 == null) { // L: 9056
							break label333;
						}

						if ((var36.x & 127) == 64 && (var36.y & 127) == 64) { // L: 9057
							for (var31 = 0; var31 < Client.npcCount; ++var31) { // L: 9058
								var32 = Client.npcs[Client.npcIndices[var31]]; // L: 9059
								if (var32 != null && var32.definition.size == 1 && var36.x == var32.x && var36.y == var32.y) { // L: 9060
									class25.addNpcToMenu(var32.definition, Client.npcIndices[var31], var16, var18);
								}
							}

							var31 = Players.Players_count; // L: 9062
							var40 = Players.Players_indices; // L: 9063

							for (var39 = 0; var39 < var31; ++var39) { // L: 9064
								var26 = Client.players[var40[var39]]; // L: 9065
								if (var26 != null && var26 != var36 && var36.x == var26.x && var36.y == var26.y) { // L: 9066
									UserComparator3.addPlayerToMenu(var26, var40[var39], var16, var18);
								}
							}
						}

						if (var21 != Client.combatTargetPlayerIndex) { // L: 9069
							UserComparator3.addPlayerToMenu(var36, var21, var16, var18);
						} else {
							var4 = var28; // L: 9070
						}
					}

					if (var30 == 3) { // L: 9072
						NodeDeque var38 = Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var16][var18]; // L: 9073
						if (var38 != null) { // L: 9074
							for (TileItem var37 = (TileItem)var38.first(); var37 != null; var37 = (TileItem)var38.next()) { // L: 9075 9076 9109
								ItemDefinition var41 = AbstractWorldMapData.ItemDefinition_get(var37.id); // L: 9077
								if (Client.isItemSelected == 1) { // L: 9078
									ModelData0.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Client.colorStartTag(16748608) + var41.name, 16, var37.id, var16, var18); // L: 9079
								} else if (Client.isSpellSelected) { // L: 9082
									if ((class105.selectedSpellFlags & 1) == 1) { // L: 9083
										ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Client.colorStartTag(16748608) + var41.name, 17, var37.id, var16, var18); // L: 9084
									}
								} else {
									String[] var33 = var41.groundActions; // L: 9089

									for (int var34 = 4; var34 >= 0; --var34) { // L: 9090
										if (var33 != null && var33[var34] != null) { // L: 9091
											byte var27 = 0; // L: 9092
											if (var34 == 0) { // L: 9093
												var27 = 18;
											}

											if (var34 == 1) { // L: 9094
												var27 = 19;
											}

											if (var34 == 2) { // L: 9095
												var27 = 20;
											}

											if (var34 == 3) { // L: 9096
												var27 = 21;
											}

											if (var34 == 4) { // L: 9097
												var27 = 22;
											}

											ModelData0.insertMenuItemNoShift(var33[var34], Client.colorStartTag(16748608) + var41.name, var27, var37.id, var16, var18); // L: 9098
										} else if (var34 == 2) { // L: 9101
											ModelData0.insertMenuItemNoShift("Take", Client.colorStartTag(16748608) + var41.name, 20, var37.id, var16, var18); // L: 9102
										}
									}

									ModelData0.insertMenuItemNoShift("Examine", Client.colorStartTag(16748608) + var41.name, 1004, var37.id, var16, var18); // L: 9106
								}
							}
						}
					}
				}
			}

			++var8; // L: 8966
		}
	}
}
