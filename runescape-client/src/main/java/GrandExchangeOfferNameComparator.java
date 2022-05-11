import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("la")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;I)I",
		garbageValue = "-271291039"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Llq;II)Ljm;",
		garbageValue = "-1715525516"
	)
	public static PacketBufferNode method5784(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = WallDecoration.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher); // L: 17
		var4.packetBuffer.writeByte(0); // L: 18
		int var5 = var4.packetBuffer.offset; // L: 19
		var4.packetBuffer.writeByte(var0); // L: 20
		String var6 = var1.toLowerCase(); // L: 21
		byte var7 = 0; // L: 22
		if (var6.startsWith("yellow:")) { // L: 23
			var7 = 0; // L: 24
			var1 = var1.substring("yellow:".length()); // L: 25
		} else if (var6.startsWith("red:")) { // L: 27
			var7 = 1; // L: 28
			var1 = var1.substring("red:".length()); // L: 29
		} else if (var6.startsWith("green:")) { // L: 31
			var7 = 2; // L: 32
			var1 = var1.substring("green:".length()); // L: 33
		} else if (var6.startsWith("cyan:")) { // L: 35
			var7 = 3; // L: 36
			var1 = var1.substring("cyan:".length()); // L: 37
		} else if (var6.startsWith("purple:")) { // L: 39
			var7 = 4; // L: 40
			var1 = var1.substring("purple:".length()); // L: 41
		} else if (var6.startsWith("white:")) { // L: 43
			var7 = 5; // L: 44
			var1 = var1.substring("white:".length()); // L: 45
		} else if (var6.startsWith("flash1:")) { // L: 47
			var7 = 6; // L: 48
			var1 = var1.substring("flash1:".length()); // L: 49
		} else if (var6.startsWith("flash2:")) { // L: 51
			var7 = 7; // L: 52
			var1 = var1.substring("flash2:".length()); // L: 53
		} else if (var6.startsWith("flash3:")) { // L: 55
			var7 = 8; // L: 56
			var1 = var1.substring("flash3:".length()); // L: 57
		} else if (var6.startsWith("glow1:")) { // L: 59
			var7 = 9; // L: 60
			var1 = var1.substring("glow1:".length()); // L: 61
		} else if (var6.startsWith("glow2:")) { // L: 63
			var7 = 10; // L: 64
			var1 = var1.substring("glow2:".length()); // L: 65
		} else if (var6.startsWith("glow3:")) { // L: 67
			var7 = 11; // L: 68
			var1 = var1.substring("glow3:".length()); // L: 69
		} else if (var2 != Language.Language_EN) { // L: 71
			if (var6.startsWith("yellow:")) {
				var7 = 0; // L: 73
				var1 = var1.substring("yellow:".length()); // L: 74
			} else if (var6.startsWith("red:")) { // L: 76
				var7 = 1; // L: 77
				var1 = var1.substring("red:".length()); // L: 78
			} else if (var6.startsWith("green:")) { // L: 80
				var7 = 2; // L: 81
				var1 = var1.substring("green:".length()); // L: 82
			} else if (var6.startsWith("cyan:")) { // L: 84
				var7 = 3; // L: 85
				var1 = var1.substring("cyan:".length()); // L: 86
			} else if (var6.startsWith("purple:")) { // L: 88
				var7 = 4; // L: 89
				var1 = var1.substring("purple:".length()); // L: 90
			} else if (var6.startsWith("white:")) { // L: 92
				var7 = 5; // L: 93
				var1 = var1.substring("white:".length()); // L: 94
			} else if (var6.startsWith("flash1:")) { // L: 96
				var7 = 6; // L: 97
				var1 = var1.substring("flash1:".length()); // L: 98
			} else if (var6.startsWith("flash2:")) { // L: 100
				var7 = 7; // L: 101
				var1 = var1.substring("flash2:".length()); // L: 102
			} else if (var6.startsWith("flash3:")) { // L: 104
				var7 = 8; // L: 105
				var1 = var1.substring("flash3:".length()); // L: 106
			} else if (var6.startsWith("glow1:")) { // L: 108
				var7 = 9; // L: 109
				var1 = var1.substring("glow1:".length()); // L: 110
			} else if (var6.startsWith("glow2:")) { // L: 112
				var7 = 10; // L: 113
				var1 = var1.substring("glow2:".length()); // L: 114
			} else if (var6.startsWith("glow3:")) { // L: 116
				var7 = 11; // L: 117
				var1 = var1.substring("glow3:".length()); // L: 118
			}
		}

		var6 = var1.toLowerCase(); // L: 121
		byte var8 = 0; // L: 122
		if (var6.startsWith("wave:")) { // L: 123
			var8 = 1; // L: 124
			var1 = var1.substring("wave:".length()); // L: 125
		} else if (var6.startsWith("wave2:")) { // L: 127
			var8 = 2; // L: 128
			var1 = var1.substring("wave2:".length()); // L: 129
		} else if (var6.startsWith("shake:")) { // L: 131
			var8 = 3; // L: 132
			var1 = var1.substring("shake:".length()); // L: 133
		} else if (var6.startsWith("scroll:")) { // L: 135
			var8 = 4; // L: 136
			var1 = var1.substring("scroll:".length()); // L: 137
		} else if (var6.startsWith("slide:")) { // L: 139
			var8 = 5; // L: 140
			var1 = var1.substring("slide:".length()); // L: 141
		} else if (var2 != Language.Language_EN) { // L: 143
			if (var6.startsWith("wave:")) { // L: 144
				var8 = 1; // L: 145
				var1 = var1.substring("wave:".length()); // L: 146
			} else if (var6.startsWith("wave2:")) { // L: 148
				var8 = 2; // L: 149
				var1 = var1.substring("wave2:".length()); // L: 150
			} else if (var6.startsWith("shake:")) { // L: 152
				var8 = 3; // L: 153
				var1 = var1.substring("shake:".length()); // L: 154
			} else if (var6.startsWith("scroll:")) { // L: 156
				var8 = 4; // L: 157
				var1 = var1.substring("scroll:".length()); // L: 158
			} else if (var6.startsWith("slide:")) { // L: 160
				var8 = 5; // L: 161
				var1 = var1.substring("slide:".length()); // L: 162
			}
		}

		var4.packetBuffer.writeByte(var7); // L: 165
		var4.packetBuffer.writeByte(var8); // L: 166
		User.method6525(var4.packetBuffer, var1); // L: 167
		if (var0 == class296.field3552.rsOrdinal()) { // L: 168
			var4.packetBuffer.writeByte(var3); // L: 169
		}

		var4.packetBuffer.method7740(var4.packetBuffer.offset - var5); // L: 171
		return var4; // L: 172
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "2032747937"
	)
	static int method5782(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 561
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize];
			var4 = class92.getWidget(var3); // L: 566
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class12.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3];
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var4);
			class82.client.alignWidget(var4); // L: 576
			if (var3 != -1 && var4.type == 0) {
				UserComparator8.revalidateWidgetScroll(NetSocket.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class12.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 583
			var4.widthAlignment = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 584
			var4.heightAlignment = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3];
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var4);
			class82.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				UserComparator8.revalidateWidgetScroll(NetSocket.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var4); // L: 595
			}

			return 1; // L: 597
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 599
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpc;ILca;IB)V",
		garbageValue = "98"
	)
	static final void method5786(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class193.field2250.field2252; // L: 451
		int var5;
		int var8;
		int var9;
		int var12;
		if ((var3 & 1) != 0) { // L: 452
			var5 = var0.method7576(); // L: 453
			PlayerType var6 = (PlayerType)class291.findEnumerated(class118.PlayerType_values(), var0.readUnsignedByte()); // L: 454
			boolean var7 = var0.method7593() == 1; // L: 455
			var8 = var0.method7545(); // L: 456
			var9 = var0.offset; // L: 457
			if (var2.username != null && var2.appearance != null) { // L: 458
				boolean var10 = false; // L: 459
				if (var6.isUser && BufferedSource.friendSystem.isIgnored(var2.username)) { // L: 460 461
					var10 = true;
				}

				if (!var10 && Client.field606 == 0 && !var2.isHidden) { // L: 463
					Players.field1306.offset = 0; // L: 464
					var0.method7569(Players.field1306.array, 0, var8); // L: 465
					Players.field1306.offset = 0; // L: 466
					String var11 = AbstractFont.escapeBrackets(WorldMapManager.method4679(LoginPacket.method5025(Players.field1306))); // L: 467
					var2.overheadText = var11.trim(); // L: 468
					var2.overheadTextColor = var5 >> 8; // L: 469
					var2.overheadTextEffect = var5 & 255; // L: 470
					var2.overheadTextCyclesRemaining = 150; // L: 471
					var2.isAutoChatting = var7; // L: 472
					var2.field1198 = var2 != ModelData0.localPlayer && var6.isUser && "" != Client.field549 && var11.toLowerCase().indexOf(Client.field549) == -1; // L: 473
					if (var6.isPrivileged) { // L: 475
						var12 = var7 ? 91 : 1;
					} else {
						var12 = var7 ? 90 : 2; // L: 476
					}

					if (var6.modIcon != -1) { // L: 477
						WorldMapEvent.addGameMessage(var12, StudioGame.method5590(var6.modIcon) + var2.username.getName(), var11);
					} else {
						WorldMapEvent.addGameMessage(var12, var2.username.getName(), var11); // L: 478
					}
				}
			}

			var0.offset = var9 + var8; // L: 481
		}

		if ((var3 & 4) != 0) { // L: 483
			var2.field1172 = var0.method7576(); // L: 484
			if (var2.pathLength == 0) { // L: 485
				var2.orientation = var2.field1172; // L: 486
				var2.field1172 = -1; // L: 487
			}
		}

		if ((var3 & 16) != 0) { // L: 490
			var5 = var0.method7593(); // L: 491
			byte[] var17 = new byte[var5]; // L: 492
			Buffer var13 = new Buffer(var17); // L: 493
			var0.method7569(var17, 0, var5); // L: 494
			Players.field1307[var1] = var13; // L: 495
			var2.read(var13); // L: 496
		}

		if ((var3 & 4096) != 0) { // L: 498
			var2.spotAnimation = var0.method7576(); // L: 499
			var5 = var0.method7567(); // L: 500
			var2.spotAnimationHeight = var5 >> 16; // L: 501
			var2.field1185 = (var5 & 65535) + Client.cycle; // L: 502
			var2.spotAnimationFrame = 0; // L: 503
			var2.spotAnimationFrameCycle = 0; // L: 504
			if (var2.field1185 > Client.cycle) { // L: 505
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) { // L: 506
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 2048) != 0) { // L: 508
			class193[] var14 = Players.field1302; // L: 509
			class193[] var21 = new class193[]{class193.field2248, class193.field2250, class193.field2249, class193.field2251}; // L: 513
			var14[var1] = (class193)class291.findEnumerated(var21, var0.method7549()); // L: 515
		}

		if ((var3 & 16384) != 0) { // L: 517
			var2.field1187 = var0.method7547(); // L: 518
			var2.field1189 = var0.method7548(); // L: 519
			var2.field1188 = var0.method7548(); // L: 520
			var2.field1190 = var0.method7549(); // L: 521
			var2.field1191 = var0.readUnsignedShort() + Client.cycle; // L: 522
			var2.field1192 = var0.method7554() + Client.cycle; // L: 523
			var2.field1139 = var0.readUnsignedShort(); // L: 524
			if (var2.field1095) { // L: 525
				var2.field1187 += var2.tileX; // L: 526
				var2.field1189 += var2.tileY; // L: 527
				var2.field1188 += var2.tileX; // L: 528
				var2.field1190 += var2.tileY; // L: 529
				var2.pathLength = 0; // L: 530
			} else {
				var2.field1187 += var2.pathX[0]; // L: 533
				var2.field1189 += var2.pathY[0]; // L: 534
				var2.field1188 += var2.pathX[0]; // L: 535
				var2.field1190 += var2.pathY[0]; // L: 536
				var2.pathLength = 1; // L: 537
			}

			var2.field1200 = 0; // L: 539
		}

		if ((var3 & 1024) != 0) { // L: 541
			var2.field1196 = Client.cycle + var0.method7576(); // L: 542
			var2.field1197 = Client.cycle + var0.readUnsignedShort(); // L: 543
			var2.field1143 = var0.method7547(); // L: 544
			var2.field1199 = var0.method7549(); // L: 545
			var2.field1153 = var0.method7548(); // L: 546
			var2.field1140 = (byte)var0.readUnsignedByte(); // L: 547
		}

		int var15;
		if ((var3 & 32) != 0) { // L: 549
			var5 = var0.method7554(); // L: 550
			if (var5 == 65535) { // L: 551
				var5 = -1;
			}

			var15 = var0.method7593(); // L: 552
			JagexCache.performPlayerAnimation(var2, var5, var15); // L: 553
		}

		if ((var3 & 256) != 0) { // L: 555
			var4 = var0.method7549(); // L: 556
		}

		if ((var3 & 128) != 0) { // L: 558
			var2.targetIndex = var0.method7554(); // L: 559
			if (var2.targetIndex == 65535) { // L: 560
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 64) != 0) { // L: 562
			var5 = var0.readUnsignedByte(); // L: 563
			int var16;
			int var19;
			int var20;
			if (var5 > 0) { // L: 564
				for (var15 = 0; var15 < var5; ++var15) { // L: 565
					var8 = -1; // L: 567
					var9 = -1; // L: 568
					var20 = -1; // L: 569
					var19 = var0.readUShortSmart(); // L: 570
					if (var19 == 32767) { // L: 571
						var19 = var0.readUShortSmart(); // L: 572
						var9 = var0.readUShortSmart(); // L: 573
						var8 = var0.readUShortSmart(); // L: 574
						var20 = var0.readUShortSmart(); // L: 575
					} else if (var19 != 32766) { // L: 577
						var9 = var0.readUShortSmart(); // L: 578
					} else {
						var19 = -1; // L: 580
					}

					var16 = var0.readUShortSmart(); // L: 581
					var2.addHitSplat(var19, var9, var8, var20, Client.cycle, var16); // L: 582
				}
			}

			var15 = var0.method7546(); // L: 585
			if (var15 > 0) { // L: 586
				for (var19 = 0; var19 < var15; ++var19) { // L: 587
					var8 = var0.readUShortSmart(); // L: 588
					var9 = var0.readUShortSmart(); // L: 589
					if (var9 != 32767) { // L: 590
						var20 = var0.readUShortSmart(); // L: 591
						var16 = var0.readUnsignedByte(); // L: 592
						var12 = var9 > 0 ? var0.method7593() : var16; // L: 593
						var2.addHealthBar(var8, Client.cycle, var9, var20, var16, var12); // L: 594
					} else {
						var2.removeHealthBar(var8); // L: 596
					}
				}
			}
		}

		if ((var3 & 8192) != 0) { // L: 600
			for (var5 = 0; var5 < 3; ++var5) { // L: 601
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 8) != 0) { // L: 603
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 604
			if (var2.overheadText.charAt(0) == '~') { // L: 605
				var2.overheadText = var2.overheadText.substring(1); // L: 606
				WorldMapEvent.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 607
			} else if (var2 == ModelData0.localPlayer) { // L: 609
				WorldMapEvent.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 610
			}

			var2.isAutoChatting = false; // L: 612
			var2.overheadTextColor = 0; // L: 613
			var2.overheadTextEffect = 0; // L: 614
			var2.overheadTextCyclesRemaining = 150; // L: 615
		}

		if (var2.field1095) { // L: 617
			if (var4 == 127) { // L: 618
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class193 var22;
				if (var4 != class193.field2250.field2252) { // L: 621
					class193[] var18 = new class193[]{class193.field2248, class193.field2250, class193.field2249, class193.field2251}; // L: 624
					var22 = (class193)class291.findEnumerated(var18, var4); // L: 626
				} else {
					var22 = Players.field1302[var1]; // L: 628
				}

				var2.method2117(var2.tileX, var2.tileY, var22); // L: 629
			}
		}

	} // L: 633

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1233324510"
	)
	public static int method5790(int var0) {
		return class357.method6392(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 72
	}
}
