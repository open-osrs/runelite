import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -285078811
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1160559969
	)
	@Export("health")
	int health;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -93193481
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2006973369
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1575098257"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)V",
		garbageValue = "-241424449"
	)
	public static void method2217(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2004197987"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lpy;ILcw;II)V",
		garbageValue = "-1310765413"
	)
	static final void method2213(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class193.field2192.field2194; // L: 453
		if ((var3 & 8192) != 0) { // L: 454
			var2.field1133 = Client.cycle + var0.method7935(); // L: 455
			var2.field1185 = Client.cycle + var0.method7798(); // L: 456
			var2.field1146 = var0.method7955(); // L: 457
			var2.field1187 = var0.method7955(); // L: 458
			var2.field1188 = var0.method7925(); // L: 459
			var2.field1189 = (byte)var0.method7790(); // L: 460
		}

		if ((var3 & 256) != 0) { // L: 462
			var4 = var0.method7925(); // L: 463
		}

		int var5;
		int var8;
		int var9;
		int var12;
		if ((var3 & 1) != 0) { // L: 465
			var5 = var0.method7798(); // L: 466
			PlayerType var6 = (PlayerType)ChatChannel.findEnumerated(HitSplatDefinition.PlayerType_values(), var0.readUnsignedByte()); // L: 467
			boolean var7 = var0.method7927() == 1; // L: 468
			var8 = var0.method7927(); // L: 469
			var9 = var0.offset; // L: 470
			if (var2.username != null && var2.appearance != null) { // L: 471
				boolean var10 = false; // L: 472
				if (var6.isUser && class155.friendSystem.isIgnored(var2.username)) { // L: 473 474
					var10 = true;
				}

				if (!var10 && Client.field603 == 0 && !var2.isHidden) { // L: 476
					Players.field1299.offset = 0; // L: 477
					var0.method7812(Players.field1299.array, 0, var8); // L: 478
					Players.field1299.offset = 0; // L: 479
					String var11 = AbstractFont.escapeBrackets(AbstractByteArrayCopier.method5528(class118.method2737(Players.field1299))); // L: 480
					var2.overheadText = var11.trim(); // L: 481
					var2.overheadTextColor = var5 >> 8; // L: 482
					var2.overheadTextEffect = var5 & 255; // L: 483
					var2.overheadTextCyclesRemaining = 150; // L: 484
					var2.isAutoChatting = var7; // L: 485
					var2.field1152 = var2 != class19.localPlayer && var6.isUser && "" != Client.field712 && var11.toLowerCase().indexOf(Client.field712) == -1; // L: 486
					if (var6.isPrivileged) { // L: 488
						var12 = var7 ? 91 : 1;
					} else {
						var12 = var7 ? 90 : 2; // L: 489
					}

					if (var6.modIcon != -1) { // L: 490
						Login.addGameMessage(var12, class351.method6579(var6.modIcon) + var2.username.getName(), var11);
					} else {
						Login.addGameMessage(var12, var2.username.getName(), var11); // L: 491
					}
				}
			}

			var0.offset = var8 + var9; // L: 494
		}

		if ((var3 & 2048) != 0) { // L: 496
			for (var5 = 0; var5 < 3; ++var5) { // L: 497
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 4096) != 0) { // L: 499
			var2.spotAnimation = var0.method7798(); // L: 500
			var5 = var0.method7889(); // L: 501
			var2.spotAnimationHeight = var5 >> 16; // L: 502
			var2.field1173 = (var5 & 65535) + Client.cycle; // L: 503
			var2.spotAnimationFrame = 0; // L: 504
			var2.spotAnimationFrameCycle = 0; // L: 505
			if (var2.field1173 > Client.cycle) { // L: 506
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) { // L: 507
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 128) != 0) { // L: 509
			var5 = var0.method7927(); // L: 510
			byte[] var17 = new byte[var5]; // L: 511
			Buffer var13 = new Buffer(var17); // L: 512
			var0.method7812(var17, 0, var5); // L: 513
			Players.field1289[var1] = var13; // L: 514
			var2.read(var13); // L: 515
		}

		if ((var3 & 512) != 0) { // L: 517
			var2.field1175 = var0.method7792(); // L: 518
			var2.field1177 = var0.readByte(); // L: 519
			var2.field1176 = var0.method7925(); // L: 520
			var2.field1178 = var0.method7955(); // L: 521
			var2.field1179 = var0.method7935() + Client.cycle; // L: 522
			var2.field1180 = var0.method7971() + Client.cycle; // L: 523
			var2.field1181 = var0.method7798(); // L: 524
			if (var2.field1109) { // L: 525
				var2.field1175 += var2.tileX; // L: 526
				var2.field1177 += var2.tileY; // L: 527
				var2.field1176 += var2.tileX; // L: 528
				var2.field1178 += var2.tileY; // L: 529
				var2.pathLength = 0; // L: 530
			} else {
				var2.field1175 += var2.pathX[0]; // L: 533
				var2.field1177 += var2.pathY[0]; // L: 534
				var2.field1176 += var2.pathX[0]; // L: 535
				var2.field1178 += var2.pathY[0]; // L: 536
				var2.pathLength = 1; // L: 537
			}

			var2.field1134 = 0; // L: 539
		}

		if ((var3 & 16) != 0) { // L: 541
			var2.field1160 = var0.readUnsignedShort(); // L: 542
			if (var2.pathLength == 0) { // L: 543
				var2.orientation = var2.field1160; // L: 544
				var2.field1160 = -1; // L: 545
			}
		}

		if ((var3 & 2) != 0) { // L: 548
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 549
			if (var2.overheadText.charAt(0) == '~') { // L: 550
				var2.overheadText = var2.overheadText.substring(1); // L: 551
				Login.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 552
			} else if (var2 == class19.localPlayer) { // L: 554
				Login.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 555
			}

			var2.isAutoChatting = false; // L: 557
			var2.overheadTextColor = 0; // L: 558
			var2.overheadTextEffect = 0; // L: 559
			var2.overheadTextCyclesRemaining = 150; // L: 560
		}

		int var14;
		if ((var3 & 8) != 0) { // L: 562
			var5 = var0.method7971(); // L: 563
			if (var5 == 65535) { // L: 564
				var5 = -1;
			}

			var14 = var0.method7927(); // L: 565
			KeyHandler.performPlayerAnimation(var2, var5, var14); // L: 566
		}

		if ((var3 & 16384) != 0) { // L: 568
			Players.field1285[var1] = (class193)ChatChannel.findEnumerated(class124.method2801(), var0.method7955()); // L: 569
		}

		if ((var3 & 32) != 0) { // L: 571
			var2.targetIndex = var0.method7798(); // L: 572
			if (var2.targetIndex == 65535) { // L: 573
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 4) != 0) { // L: 575
			var5 = var0.method7790(); // L: 576
			int var16;
			int var18;
			int var19;
			if (var5 > 0) { // L: 577
				for (var14 = 0; var14 < var5; ++var14) { // L: 578
					var8 = -1; // L: 580
					var9 = -1; // L: 581
					var19 = -1; // L: 582
					var18 = var0.readUShortSmart(); // L: 583
					if (var18 == 32767) { // L: 584
						var18 = var0.readUShortSmart(); // L: 585
						var9 = var0.readUShortSmart(); // L: 586
						var8 = var0.readUShortSmart(); // L: 587
						var19 = var0.readUShortSmart(); // L: 588
					} else if (var18 != 32766) { // L: 590
						var9 = var0.readUShortSmart(); // L: 591
					} else {
						var18 = -1; // L: 593
					}

					var16 = var0.readUShortSmart(); // L: 594
					var2.addHitSplat(var18, var9, var8, var19, Client.cycle, var16); // L: 595
				}
			}

			var14 = var0.readUnsignedByte(); // L: 598
			if (var14 > 0) { // L: 599
				for (var18 = 0; var18 < var14; ++var18) { // L: 600
					var8 = var0.readUShortSmart(); // L: 601
					var9 = var0.readUShortSmart(); // L: 602
					if (var9 != 32767) { // L: 603
						var19 = var0.readUShortSmart(); // L: 604
						var16 = var0.readUnsignedByte(); // L: 605
						var12 = var9 > 0 ? var0.method7790() : var16; // L: 606
						var2.addHealthBar(var8, Client.cycle, var9, var19, var16, var12); // L: 607
					} else {
						var2.removeHealthBar(var8); // L: 609
					}
				}
			}
		}

		if (var2.field1109) { // L: 613
			if (var4 == 127) { // L: 614
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class193 var15;
				if (var4 != class193.field2192.field2194) { // L: 617
					var15 = (class193)ChatChannel.findEnumerated(class124.method2801(), var4);
				} else {
					var15 = Players.field1285[var1]; // L: 618
				}

				var2.method2144(var2.tileX, var2.tileY, var15); // L: 619
			}
		}

	} // L: 623

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "921137815"
	)
	static void method2210(int var0, int var1, int var2) {
		if (var0 != 0) { // L: 3315
			int var3 = var0 >> 8; // L: 3316
			int var4 = var0 >> 4 & 7; // L: 3317
			int var5 = var0 & 15; // L: 3318
			Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 3319
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 3320
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3321
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3322
			int var6 = (var1 - 64) / 128; // L: 3323
			int var7 = (var2 - 64) / 128; // L: 3324
			Client.soundLocations[Client.soundEffectCount] = var5 + (var7 << 8) + (var6 << 16); // L: 3325
			++Client.soundEffectCount; // L: 3326
		}
	} // L: 3327
}
