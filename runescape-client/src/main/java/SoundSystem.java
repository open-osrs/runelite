import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Ldh;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			PacketWriter.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcd;",
		garbageValue = "1735365545"
	)
	static AttackOption[] method2631() {
		return new AttackOption[]{AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick}; // L: 11714
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1698839968"
	)
	@Export("Messages_getNextChatID")
	static int Messages_getNextChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 77
		if (var1 == null) { // L: 78
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 79 80
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lks;I)V",
		garbageValue = "-359449402"
	)
	static final void method2632(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field726; ++var1) { // L: 7583
			int var2 = Client.field727[var1]; // L: 7584
			NPC var3 = Client.npcs[var2]; // L: 7585
			int var4 = var0.readUnsignedByte(); // L: 7586
			if ((var4 & 16) != 0) { // L: 7587
				var3.targetIndex = var0.method5659(); // L: 7588
				if (var3.targetIndex == 65535) { // L: 7589
					var3.targetIndex = -1;
				}
			}

			int var5;
			int var6;
			int var7;
			if ((var4 & 1) != 0) { // L: 7591
				var5 = var0.method5797(); // L: 7592
				if (var5 == 65535) { // L: 7593
					var5 = -1;
				}

				var6 = var0.method5650(); // L: 7594
				if (var5 == var3.sequence && var5 != -1) { // L: 7595
					var7 = class105.SequenceDefinition_get(var5).field3551; // L: 7596
					if (var7 == 1) { // L: 7597
						var3.sequenceFrame = 0; // L: 7598
						var3.sequenceFrameCycle = 0; // L: 7599
						var3.sequenceDelay = var6; // L: 7600
						var3.field1022 = 0; // L: 7601
					}

					if (var7 == 2) { // L: 7603
						var3.field1022 = 0; // L: 7604
					}
				} else if (var5 == -1 || var3.sequence == -1 || class105.SequenceDefinition_get(var5).field3545 >= class105.SequenceDefinition_get(var3.sequence).field3545) { // L: 7607
					var3.sequence = var5; // L: 7608
					var3.sequenceFrame = 0; // L: 7609
					var3.sequenceFrameCycle = 0; // L: 7610
					var3.sequenceDelay = var6; // L: 7611
					var3.field1022 = 0; // L: 7612
					var3.field1034 = var3.pathLength; // L: 7613
				}
			}

			int var8;
			if ((var4 & 2) != 0) { // L: 7617
				var5 = var0.method5659(); // L: 7618
				var6 = var0.method5659(); // L: 7619
				var7 = var3.x - (var5 - FloorDecoration.baseX - FloorDecoration.baseX) * 64; // L: 7620
				var8 = var3.y - (var6 - WorldMapData_0.baseY - WorldMapData_0.baseY) * 64; // L: 7621
				if (var7 != 0 || var8 != 0) { // L: 7622
					var3.field1003 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 32) != 0) { // L: 7624
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 7625
				var3.overheadTextCyclesRemaining = 100; // L: 7626
			}

			if ((var4 & 8) != 0) { // L: 7628
				var3.field1017 = var0.readByte(); // L: 7629
				var3.field1019 = var0.method5837(); // L: 7630
				var3.field1018 = var0.readByte(); // L: 7631
				var3.field1020 = var0.method5837(); // L: 7632
				var3.field1009 = var0.readUnsignedShort() + Client.cycle; // L: 7633
				var3.field1024 = var0.readUnsignedShort() + Client.cycle; // L: 7634
				var3.field1023 = var0.method5675(); // L: 7635
				var3.pathLength = 1; // L: 7636
				var3.field1034 = 0; // L: 7637
				var3.field1017 += var3.pathX[0]; // L: 7638
				var3.field1019 += var3.pathY[0]; // L: 7639
				var3.field1018 += var3.pathX[0]; // L: 7640
				var3.field1020 += var3.pathY[0]; // L: 7641
			}

			if ((var4 & 128) != 0) { // L: 7643
				var5 = var0.method5668(); // L: 7644
				int var9;
				int var10;
				int var11;
				if (var5 > 0) { // L: 7645
					for (var6 = 0; var6 < var5; ++var6) { // L: 7646
						var8 = -1; // L: 7648
						var9 = -1; // L: 7649
						var10 = -1; // L: 7650
						var7 = var0.readUShortSmart(); // L: 7651
						if (var7 == 32767) { // L: 7652
							var7 = var0.readUShortSmart(); // L: 7653
							var9 = var0.readUShortSmart(); // L: 7654
							var8 = var0.readUShortSmart(); // L: 7655
							var10 = var0.readUShortSmart(); // L: 7656
						} else if (var7 != 32766) { // L: 7658
							var9 = var0.readUShortSmart(); // L: 7659
						} else {
							var7 = -1; // L: 7661
						}

						var11 = var0.readUShortSmart(); // L: 7662
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 7663
					}
				}

				var6 = var0.method5668(); // L: 7666
				if (var6 > 0) { // L: 7667
					for (var7 = 0; var7 < var6; ++var7) { // L: 7668
						var8 = var0.readUShortSmart(); // L: 7669
						var9 = var0.readUShortSmart(); // L: 7670
						if (var9 != 32767) { // L: 7671
							var10 = var0.readUShortSmart(); // L: 7672
							var11 = var0.method5650(); // L: 7673
							int var12 = var9 > 0 ? var0.readUnsignedByte() : var11; // L: 7674
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 7675
						} else {
							var3.removeHealthBar(var8); // L: 7677
						}
					}
				}
			}

			if ((var4 & 64) != 0) { // L: 7681
				var3.definition = Clock.getNpcDefinition(var0.method5797()); // L: 7682
				var3.field1011 = var3.definition.size; // L: 7683
				var3.field1028 = var3.definition.rotation; // L: 7684
				var3.walkSequence = var3.definition.walkSequence; // L: 7685
				var3.walkBackSequence = var3.definition.walkBackSequence; // L: 7686
				var3.walkLeftSequence = var3.definition.walkLeftSequence; // L: 7687
				var3.walkRightSequence = var3.definition.walkRightSequence; // L: 7688
				var3.idleSequence = var3.definition.idleSequence; // L: 7689
				var3.turnLeftSequence = var3.definition.turnLeftSequence; // L: 7690
				var3.turnRightSequence = var3.definition.turnRightSequence; // L: 7691
			}

			if ((var4 & 4) != 0) { // L: 7693
				var3.spotAnimation = var0.readUnsignedShort(); // L: 7694
				var5 = var0.readInt(); // L: 7695
				var3.field1016 = var5 >> 16; // L: 7696
				var3.field1015 = (var5 & 65535) + Client.cycle; // L: 7697
				var3.spotAnimationFrame = 0; // L: 7698
				var3.spotAnimationFrameCycle = 0; // L: 7699
				if (var3.field1015 > Client.cycle) { // L: 7700
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 7701
					var3.spotAnimation = -1;
				}
			}
		}

	} // L: 7704
}
