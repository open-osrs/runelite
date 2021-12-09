import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class65 {
	@ObfuscatedName("t")
	static final BigInteger field841;
	@ObfuscatedName("s")
	static final BigInteger field842;

	static {
		field841 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field842 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpj;ILck;II)V",
		garbageValue = "-2002121485"
	)
	static final void method1957(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class185.field2119.field2121; // L: 451
		int var5;
		int var6;
		int var8;
		int var9;
		int var12;
		if ((var3 & 4) != 0) { // L: 452
			var5 = var0.readUnsignedByte(); // L: 453
			int var7;
			int var10;
			int var16;
			if (var5 > 0) { // L: 454
				for (var6 = 0; var6 < var5; ++var6) { // L: 455
					var8 = -1; // L: 457
					var9 = -1; // L: 458
					var10 = -1; // L: 459
					var7 = var0.readUShortSmart(); // L: 460
					if (var7 == 32767) { // L: 461
						var7 = var0.readUShortSmart(); // L: 462
						var9 = var0.readUShortSmart(); // L: 463
						var8 = var0.readUShortSmart(); // L: 464
						var10 = var0.readUShortSmart(); // L: 465
					} else if (var7 != 32766) { // L: 467
						var9 = var0.readUShortSmart(); // L: 468
					} else {
						var7 = -1; // L: 470
					}

					var16 = var0.readUShortSmart(); // L: 471
					var2.addHitSplat(var7, var9, var8, var10, Client.cycle, var16); // L: 472
				}
			}

			var6 = var0.method7520(); // L: 475
			if (var6 > 0) { // L: 476
				for (var7 = 0; var7 < var6; ++var7) { // L: 477
					var8 = var0.readUShortSmart(); // L: 478
					var9 = var0.readUShortSmart(); // L: 479
					if (var9 != 32767) { // L: 480
						var10 = var0.readUShortSmart(); // L: 481
						var16 = var0.method7392(); // L: 482
						var12 = var9 > 0 ? var0.method7394() : var16; // L: 483
						var2.addHealthBar(var8, Client.cycle, var9, var10, var16, var12); // L: 484
					} else {
						var2.removeHealthBar(var8); // L: 486
					}
				}
			}
		}

		if ((var3 & 8192) != 0) { // L: 490
			var4 = var0.readByte(); // L: 491
		}

		if ((var3 & 16384) != 0) { // L: 493
			var2.field1132 = var0.method7396(); // L: 494
			var2.field1134 = var0.method7396(); // L: 495
			var2.field1133 = var0.method7397(); // L: 496
			var2.field1135 = var0.method7397(); // L: 497
			var2.field1136 = var0.method7403() + Client.cycle; // L: 498
			var2.field1157 = var0.method7403() + Client.cycle; // L: 499
			var2.field1138 = var0.method7499(); // L: 500
			if (var2.field1055) { // L: 501
				var2.field1132 += var2.tileX; // L: 502
				var2.field1134 += var2.tileY; // L: 503
				var2.field1133 += var2.tileX; // L: 504
				var2.field1135 += var2.tileY; // L: 505
				var2.pathLength = 0; // L: 506
			} else {
				var2.field1132 += var2.pathX[0]; // L: 509
				var2.field1134 += var2.pathY[0]; // L: 510
				var2.field1133 += var2.pathX[0]; // L: 511
				var2.field1135 += var2.pathY[0]; // L: 512
				var2.pathLength = 1; // L: 513
			}

			var2.field1098 = 0; // L: 515
		}

		if ((var3 & 128) != 0) { // L: 517
			var2.targetIndex = var0.method7403(); // L: 518
			if (var2.targetIndex == 65535) { // L: 519
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 1) != 0) { // L: 521
			var5 = var0.readUnsignedByte(); // L: 522
			byte[] var13 = new byte[var5]; // L: 523
			Buffer var14 = new Buffer(var13); // L: 524
			var0.method7413(var13, 0, var5); // L: 525
			Players.field1248[var1] = var14; // L: 526
			var2.read(var14); // L: 527
		}

		if ((var3 & 256) != 0) { // L: 529
			for (var5 = 0; var5 < 3; ++var5) { // L: 530
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 32) != 0) { // L: 532
			var5 = var0.readUnsignedShort(); // L: 533
			PlayerType var19 = (PlayerType)class130.findEnumerated(SpotAnimationDefinition.PlayerType_values(), var0.method7520()); // L: 534
			boolean var17 = var0.method7394() == 1; // L: 535
			var8 = var0.readUnsignedByte(); // L: 536
			var9 = var0.offset; // L: 537
			if (var2.username != null && var2.appearance != null) { // L: 538
				boolean var18 = false; // L: 539
				if (var19.isUser && GameEngine.friendSystem.isIgnored(var2.username)) { // L: 540 541
					var18 = true;
				}

				if (!var18 && Client.field590 == 0 && !var2.isHidden) { // L: 543
					Players.field1257.offset = 0; // L: 544
					var0.readBytes(Players.field1257.array, 0, var8); // L: 545
					Players.field1257.offset = 0; // L: 546
					String var11 = AbstractFont.escapeBrackets(class412.method7287(SequenceDefinition.method3689(Players.field1257))); // L: 547
					var2.overheadText = var11.trim(); // L: 548
					var2.overheadTextColor = var5 >> 8; // L: 549
					var2.overheadTextEffect = var5 & 255; // L: 550
					var2.overheadTextCyclesRemaining = 150; // L: 551
					var2.isAutoChatting = var17; // L: 552
					var2.field1114 = var2 != class340.localPlayer && var19.isUser && "" != Client.field645 && var11.toLowerCase().indexOf(Client.field645) == -1; // L: 553
					if (var19.isPrivileged) { // L: 555
						var12 = var17 ? 91 : 1;
					} else {
						var12 = var17 ? 90 : 2; // L: 556
					}

					if (var19.modIcon != -1) { // L: 557
						class194.addGameMessage(var12, class221.method4705(var19.modIcon) + var2.username.getName(), var11);
					} else {
						class194.addGameMessage(var12, var2.username.getName(), var11); // L: 558
					}
				}
			}

			var0.offset = var9 + var8; // L: 561
		}

		if ((var3 & 2) != 0) { // L: 563
			var5 = var0.method7499(); // L: 564
			if (var5 == 65535) { // L: 565
				var5 = -1;
			}

			var6 = var0.method7520(); // L: 566
			class125.performPlayerAnimation(var2, var5, var6); // L: 567
		}

		if ((var3 & 1024) != 0) { // L: 569
			class185[] var15 = Players.field1246; // L: 570
			class185[] var21 = new class185[]{class185.field2120, class185.field2123, class185.field2122, class185.field2119}; // L: 574
			var15[var1] = (class185)class130.findEnumerated(var21, var0.method7465()); // L: 576
		}

		if ((var3 & 2048) != 0) { // L: 578
			var2.spotAnimation = var0.method7499(); // L: 579
			var5 = var0.method7412(); // L: 580
			var2.field1131 = var5 >> 16; // L: 581
			var2.field1130 = (var5 & 65535) + Client.cycle; // L: 582
			var2.spotAnimationFrame = 0; // L: 583
			var2.spotAnimationFrameCycle = 0; // L: 584
			if (var2.field1130 > Client.cycle) { // L: 585
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) { // L: 586
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 512) != 0) { // L: 588
			var2.field1141 = Client.cycle + var0.method7403(); // L: 589
			var2.field1140 = Client.cycle + var0.method7499(); // L: 590
			var2.field1143 = var0.readByte(); // L: 591
			var2.field1144 = var0.method7397(); // L: 592
			var2.field1095 = var0.readByte(); // L: 593
			var2.field1146 = (byte)var0.readUnsignedByte(); // L: 594
		}

		if ((var3 & 64) != 0) { // L: 596
			var2.field1122 = var0.method7401(); // L: 597
			if (var2.pathLength == 0) { // L: 598
				var2.orientation = var2.field1122; // L: 599
				var2.field1122 = -1; // L: 600
			}
		}

		if ((var3 & 8) != 0) { // L: 603
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 604
			if (var2.overheadText.charAt(0) == '~') { // L: 605
				var2.overheadText = var2.overheadText.substring(1); // L: 606
				class194.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 607
			} else if (var2 == class340.localPlayer) { // L: 609
				class194.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 610
			}

			var2.isAutoChatting = false; // L: 612
			var2.overheadTextColor = 0; // L: 613
			var2.overheadTextEffect = 0; // L: 614
			var2.overheadTextCyclesRemaining = 150; // L: 615
		}

		if (var2.field1055) { // L: 617
			if (var4 == 127) { // L: 618
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class185 var22;
				if (var4 != class185.field2119.field2121) { // L: 621
					class185[] var20 = new class185[]{class185.field2120, class185.field2123, class185.field2122, class185.field2119}; // L: 624
					var22 = (class185)class130.findEnumerated(var20, var4); // L: 626
				} else {
					var22 = Players.field1246[var1]; // L: 628
				}

				var2.method2175(var2.tileX, var2.tileY, var22); // L: 629
			}
		}

	} // L: 633

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "843672691"
	)
	static final void method1958() {
		if (SoundSystem.ClanChat_inClanChat) { // L: 4368
			if (Players.friendsChat != null) { // L: 4369
				Players.friendsChat.sort(); // L: 4370
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 4373
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 4374
				var1.clearIsInFriendsChat(); // L: 4375
			}

			SoundSystem.ClanChat_inClanChat = false; // L: 4378
		}

	} // L: 4380
}
