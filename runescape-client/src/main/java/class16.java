import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public abstract class class16 extends Node {
	@ObfuscatedName("m")
	static byte[][][] field132;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive9")
	static Archive archive9;

	class16() {
	} // L: 48

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "851460888"
	)
	abstract void vmethod331(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1362614343"
	)
	abstract void vmethod332(ClanChannel var1);

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2069823141"
	)
	public static int method245(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 99 100 103
			var2 = var2 << 1 | var0 & 1; // L: 101
			var0 >>>= 1; // L: 102
		}

		return var2; // L: 105
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(ZLns;B)V",
		garbageValue = "58"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field783 = 0; // L: 7480
		Client.field636 = 0; // L: 7481
		class171.method3610(); // L: 7482

		int var2;
		NPC var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 7485
			var2 = var1.readBits(15); // L: 7486
			if (var2 == 32767) { // L: 7487
				break;
			}

			boolean var3 = false; // L: 7488
			if (Client.npcs[var2] == null) { // L: 7489
				Client.npcs[var2] = new NPC(); // L: 7490
				var3 = true; // L: 7491
			}

			var4 = Client.npcs[var2]; // L: 7493
			Client.npcIndices[++Client.npcCount - 1] = var2; // L: 7494
			var4.npcCycle = Client.cycle; // L: 7495
			var4.definition = class248.getNpcDefinition(var1.readBits(14)); // L: 7499
			if (var0) { // L: 7500
				var6 = var1.readBits(8); // L: 7501
				if (var6 > 127) { // L: 7502
					var6 -= 256;
				}
			} else {
				var6 = var1.readBits(5); // L: 7505
				if (var6 > 15) { // L: 7506
					var6 -= 32;
				}
			}

			if (var0) { // L: 7508
				var7 = var1.readBits(8); // L: 7509
				if (var7 > 127) { // L: 7510
					var7 -= 256;
				}
			} else {
				var7 = var1.readBits(5); // L: 7513
				if (var7 > 15) { // L: 7514
					var7 -= 32;
				}
			}

			var8 = var1.readBits(1); // L: 7516
			if (var8 == 1) { // L: 7517
				Client.field763[++Client.field636 - 1] = var2;
			}

			var5 = var1.readBits(1); // L: 7518
			boolean var9 = var1.readBits(1) == 1; // L: 7519
			if (var9) { // L: 7520
				var1.readBits(32); // L: 7521
			}

			var10 = Client.defaultRotations[var1.readBits(3)]; // L: 7523
			if (var3) { // L: 7524
				var4.orientation = var4.rotation = var10;
			}

			var4.field1225 = var4.definition.size; // L: 7525
			var4.field1275 = var4.definition.rotation; // L: 7526
			if (var4.field1275 == 0) { // L: 7527
				var4.rotation = 0;
			}

			var4.walkSequence = var4.definition.walkSequence; // L: 7528
			var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7529
			var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7530
			var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7531
			var4.idleSequence = var4.definition.idleSequence; // L: 7532
			var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7533
			var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7534
			var4.method2347(class262.localPlayer.pathX[0] + var6, class262.localPlayer.pathY[0] + var7, var5 == 1); // L: 7535
		}

		var1.exportIndex(); // L: 7537

		int var14;
		for (var2 = 0; var2 < Client.field636; ++var2) { // L: 7540
			var14 = Client.field763[var2]; // L: 7541
			var4 = Client.npcs[var14]; // L: 7542
			var5 = var1.readUnsignedByte(); // L: 7543
			int var15;
			if ((var5 & 128) != 0) { // L: 7544
				var6 = var1.readUnsignedShort(); // L: 7545
				var7 = var1.readUnsignedShort(); // L: 7546
				var8 = var4.x - (var6 - class15.baseX - class15.baseX) * 64; // L: 7547
				var15 = var4.y - (var7 - WorldMapSprite.baseY - WorldMapSprite.baseY) * 64; // L: 7548
				if (var8 != 0 || var15 != 0) { // L: 7549
					var4.field1280 = (int)(Math.atan2((double)var8, (double)var15) * 325.949D) & 2047;
				}
			}

			if ((var5 & 64) != 0) { // L: 7551
				var4.definition = class248.getNpcDefinition(var1.method6652()); // L: 7552
				var4.field1225 = var4.definition.size; // L: 7553
				var4.field1275 = var4.definition.rotation; // L: 7554
				var4.walkSequence = var4.definition.walkSequence; // L: 7555
				var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7556
				var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7557
				var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7558
				var4.idleSequence = var4.definition.idleSequence; // L: 7559
				var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7560
				var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7561
			}

			if ((var5 & 16) != 0) { // L: 7563
				var6 = var1.readUnsignedShort(); // L: 7564
				if (var6 == 65535) { // L: 7565
					var6 = -1;
				}

				var7 = var1.method6642(); // L: 7566
				if (var6 == var4.sequence && var6 != -1) { // L: 7567
					var8 = WorldMapScaleHandler.SequenceDefinition_get(var6).field1894; // L: 7568
					if (var8 == 1) { // L: 7569
						var4.sequenceFrame = 0; // L: 7570
						var4.sequenceFrameCycle = 0; // L: 7571
						var4.sequenceDelay = var7; // L: 7572
						var4.field1258 = 0; // L: 7573
					}

					if (var8 == 2) { // L: 7575
						var4.field1258 = 0; // L: 7576
					}
				} else if (var6 == -1 || var4.sequence == -1 || WorldMapScaleHandler.SequenceDefinition_get(var6).field1892 >= WorldMapScaleHandler.SequenceDefinition_get(var4.sequence).field1892) { // L: 7579
					var4.sequence = var6; // L: 7580
					var4.sequenceFrame = 0; // L: 7581
					var4.sequenceFrameCycle = 0; // L: 7582
					var4.sequenceDelay = var7; // L: 7583
					var4.field1258 = 0; // L: 7584
					var4.field1281 = var4.pathLength; // L: 7585
				}
			}

			if ((var5 & 2) != 0) { // L: 7589
				var4.overheadText = var1.readStringCp1252NullTerminated(); // L: 7590
				var4.overheadTextCyclesRemaining = 100; // L: 7591
			}

			if ((var5 & 1) != 0) { // L: 7593
				var6 = var1.readUnsignedByte(); // L: 7594
				int var11;
				int var12;
				if (var6 > 0) { // L: 7595
					for (var7 = 0; var7 < var6; ++var7) { // L: 7596
						var15 = -1; // L: 7598
						var10 = -1; // L: 7599
						var11 = -1; // L: 7600
						var8 = var1.readUShortSmart(); // L: 7601
						if (var8 == 32767) { // L: 7602
							var8 = var1.readUShortSmart(); // L: 7603
							var10 = var1.readUShortSmart(); // L: 7604
							var15 = var1.readUShortSmart(); // L: 7605
							var11 = var1.readUShortSmart(); // L: 7606
						} else if (var8 != 32766) { // L: 7608
							var10 = var1.readUShortSmart(); // L: 7609
						} else {
							var8 = -1; // L: 7611
						}

						var12 = var1.readUShortSmart(); // L: 7612
						var4.addHitSplat(var8, var10, var15, var11, Client.cycle, var12); // L: 7613
					}
				}

				var7 = var1.method6643(); // L: 7616
				if (var7 > 0) { // L: 7617
					for (var8 = 0; var8 < var7; ++var8) { // L: 7618
						var15 = var1.readUShortSmart(); // L: 7619
						var10 = var1.readUShortSmart(); // L: 7620
						if (var10 != 32767) { // L: 7621
							var11 = var1.readUShortSmart(); // L: 7622
							var12 = var1.method6643(); // L: 7623
							int var13 = var10 > 0 ? var1.method6642() : var12; // L: 7624
							var4.addHealthBar(var15, Client.cycle, var10, var11, var12, var13); // L: 7625
						} else {
							var4.removeHealthBar(var15); // L: 7627
						}
					}
				}
			}

			if ((var5 & 32) != 0) { // L: 7631
				var4.field1264 = var1.method6619(); // L: 7632
				var4.field1268 = var1.readByte(); // L: 7633
				var4.field1265 = var1.readByte(); // L: 7634
				var4.field1267 = var1.method6682(); // L: 7635
				var4.field1276 = var1.method6651() + Client.cycle; // L: 7636
				var4.field1269 = var1.method6652() + Client.cycle; // L: 7637
				var4.field1270 = var1.method6651(); // L: 7638
				var4.pathLength = 1; // L: 7639
				var4.field1281 = 0; // L: 7640
				var4.field1264 += var4.pathX[0]; // L: 7641
				var4.field1268 += var4.pathY[0]; // L: 7642
				var4.field1265 += var4.pathX[0]; // L: 7643
				var4.field1267 += var4.pathY[0]; // L: 7644
			}

			if ((var5 & 4) != 0) { // L: 7646
				var4.targetIndex = var1.method6653(); // L: 7647
				if (var4.targetIndex == 65535) { // L: 7648
					var4.targetIndex = -1;
				}
			}

			if ((var5 & 8) != 0) { // L: 7650
				var4.spotAnimation = var1.method6651(); // L: 7651
				var6 = var1.method6725(); // L: 7652
				var4.field1263 = var6 >> 16; // L: 7653
				var4.field1262 = (var6 & 65535) + Client.cycle; // L: 7654
				var4.spotAnimationFrame = 0; // L: 7655
				var4.spotAnimationFrameCycle = 0; // L: 7656
				if (var4.field1262 > Client.cycle) { // L: 7657
					var4.spotAnimationFrame = -1;
				}

				if (var4.spotAnimation == 65535) { // L: 7658
					var4.spotAnimation = -1;
				}
			}
		}

		for (var2 = 0; var2 < Client.field783; ++var2) { // L: 7662
			var14 = Client.field859[var2]; // L: 7663
			if (Client.npcs[var14].npcCycle != Client.cycle) { // L: 7664
				Client.npcs[var14].definition = null; // L: 7665
				Client.npcs[var14] = null; // L: 7666
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 7669
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 7670
				if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 7671
					throw new RuntimeException(var2 + "," + Client.npcCount); // L: 7672
				}
			}

		}
	} // L: 7675
}
