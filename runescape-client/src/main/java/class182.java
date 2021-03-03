import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class182 {
	@ObfuscatedName("d")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("c")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1969487819
	)
	public static int field2118;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 512804251
	)
	public static int field2124;
	@ObfuscatedName("e")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("q")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(ZLkd;B)V",
		garbageValue = "-1"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field851 = 0; // L: 7561
		Client.field725 = 0; // L: 7562
		PacketBuffer var2 = Client.packetWriter.packetBuffer; // L: 7564
		var2.importIndex(); // L: 7565
		int var3 = var2.readBits(8); // L: 7566
		int var4;
		if (var3 < Client.npcCount) { // L: 7567
			for (var4 = var3; var4 < Client.npcCount; ++var4) { // L: 7568
				Client.field845[++Client.field851 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) { // L: 7570
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 7571

			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			for (var4 = 0; var4 < var3; ++var4) { // L: 7572
				var5 = Client.npcIndices[var4]; // L: 7573
				NPC var16 = Client.npcs[var5]; // L: 7574
				var7 = var2.readBits(1); // L: 7575
				if (var7 == 0) { // L: 7576
					Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7577
					var16.npcCycle = Client.cycle; // L: 7578
				} else {
					var8 = var2.readBits(2); // L: 7581
					if (var8 == 0) { // L: 7582
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7583
						var16.npcCycle = Client.cycle; // L: 7584
						Client.field697[++Client.field725 - 1] = var5; // L: 7585
					} else if (var8 == 1) { // L: 7588
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7589
						var16.npcCycle = Client.cycle; // L: 7590
						var9 = var2.readBits(3); // L: 7591
						var16.method2178(var9, (byte)1); // L: 7592
						var10 = var2.readBits(1); // L: 7593
						if (var10 == 1) { // L: 7594
							Client.field697[++Client.field725 - 1] = var5;
						}
					} else if (var8 == 2) { // L: 7597
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7598
						var16.npcCycle = Client.cycle; // L: 7599
						var9 = var2.readBits(3); // L: 7600
						var16.method2178(var9, (byte)2); // L: 7601
						var10 = var2.readBits(3); // L: 7602
						var16.method2178(var10, (byte)2); // L: 7603
						var11 = var2.readBits(1); // L: 7604
						if (var11 == 1) { // L: 7605
							Client.field697[++Client.field725 - 1] = var5;
						}
					} else if (var8 == 3) { // L: 7608
						Client.field845[++Client.field851 - 1] = var5; // L: 7609
					}
				}
			}

			SpriteMask.method4174(var0, var1); // L: 7614

			int var14;
			for (var14 = 0; var14 < Client.field725; ++var14) { // L: 7616
				var3 = Client.field697[var14]; // L: 7617
				NPC var15 = Client.npcs[var3]; // L: 7618
				var5 = var1.readUnsignedByte(); // L: 7619
				if ((var5 & 16) != 0) { // L: 7620
					var15.field992 = var1.method5721(); // L: 7621
					var15.field952 = var1.method5721(); // L: 7622
					var15.field996 = var1.method5747(); // L: 7623
					var15.field998 = var1.readByte(); // L: 7624
					var15.field999 = var1.readUnsignedShort() + Client.cycle; // L: 7625
					var15.field1000 = var1.method5729() + Client.cycle; // L: 7626
					var15.field1001 = var1.method5729(); // L: 7627
					var15.pathLength = 1; // L: 7628
					var15.field1012 = 0; // L: 7629
					var15.field992 += var15.pathX[0]; // L: 7630
					var15.field952 += var15.pathY[0]; // L: 7631
					var15.field996 += var15.pathX[0]; // L: 7632
					var15.field998 += var15.pathY[0]; // L: 7633
				}

				int var6;
				if ((var5 & 1) != 0) { // L: 7635
					var15.spotAnimation = var1.method5727(); // L: 7636
					var6 = var1.readInt(); // L: 7637
					var15.field994 = var6 >> 16; // L: 7638
					var15.field993 = (var6 & 65535) + Client.cycle; // L: 7639
					var15.spotAnimationFrame = 0; // L: 7640
					var15.spotAnimationFrameCycle = 0; // L: 7641
					if (var15.field993 > Client.cycle) { // L: 7642
						var15.spotAnimationFrame = -1;
					}

					if (var15.spotAnimation == 65535) { // L: 7643
						var15.spotAnimation = -1;
					}
				}

				if ((var5 & 2) != 0) { // L: 7645
					var15.definition = class90.getNpcDefinition(var1.method5728()); // L: 7646
					var15.field1007 = var15.definition.size; // L: 7647
					var15.field1006 = var15.definition.rotation; // L: 7648
					var15.walkSequence = var15.definition.walkSequence; // L: 7649
					var15.walkBackSequence = var15.definition.walkBackSequence; // L: 7650
					var15.walkLeftSequence = var15.definition.walkLeftSequence; // L: 7651
					var15.walkRightSequence = var15.definition.walkRightSequence; // L: 7652
					var15.idleSequence = var15.definition.idleSequence; // L: 7653
					var15.turnLeftSequence = var15.definition.turnLeftSequence; // L: 7654
					var15.turnRightSequence = var15.definition.turnRightSequence; // L: 7655
				}

				if ((var5 & 4) != 0) { // L: 7657
					var6 = var1.method5727(); // L: 7658
					if (var6 == 65535) { // L: 7659
						var6 = -1;
					}

					var7 = var1.method5717(); // L: 7660
					if (var6 == var15.sequence && var6 != -1) { // L: 7661
						var8 = InterfaceParent.SequenceDefinition_get(var6).field3548; // L: 7662
						if (var8 == 1) { // L: 7663
							var15.sequenceFrame = 0; // L: 7664
							var15.sequenceFrameCycle = 0; // L: 7665
							var15.sequenceDelay = var7; // L: 7666
							var15.field973 = 0; // L: 7667
						}

						if (var8 == 2) { // L: 7669
							var15.field973 = 0; // L: 7670
						}
					} else if (var6 == -1 || var15.sequence == -1 || InterfaceParent.SequenceDefinition_get(var6).field3560 >= InterfaceParent.SequenceDefinition_get(var15.sequence).field3560) { // L: 7673
						var15.sequence = var6; // L: 7674
						var15.sequenceFrame = 0; // L: 7675
						var15.sequenceFrameCycle = 0; // L: 7676
						var15.sequenceDelay = var7; // L: 7677
						var15.field973 = 0; // L: 7678
						var15.field1012 = var15.pathLength; // L: 7679
					}
				}

				if ((var5 & 128) != 0) { // L: 7683
					var6 = var1.readUnsignedByte(); // L: 7684
					int var12;
					if (var6 > 0) { // L: 7685
						for (var7 = 0; var7 < var6; ++var7) { // L: 7686
							var9 = -1; // L: 7688
							var10 = -1; // L: 7689
							var11 = -1; // L: 7690
							var8 = var1.readUShortSmart(); // L: 7691
							if (var8 == 32767) { // L: 7692
								var8 = var1.readUShortSmart(); // L: 7693
								var10 = var1.readUShortSmart(); // L: 7694
								var9 = var1.readUShortSmart(); // L: 7695
								var11 = var1.readUShortSmart(); // L: 7696
							} else if (var8 != 32766) { // L: 7698
								var10 = var1.readUShortSmart(); // L: 7699
							} else {
								var8 = -1; // L: 7701
							}

							var12 = var1.readUShortSmart(); // L: 7702
							var15.addHitSplat(var8, var10, var9, var11, Client.cycle, var12); // L: 7703
						}
					}

					var7 = var1.method5717(); // L: 7706
					if (var7 > 0) { // L: 7707
						for (var8 = 0; var8 < var7; ++var8) { // L: 7708
							var9 = var1.readUShortSmart(); // L: 7709
							var10 = var1.readUShortSmart(); // L: 7710
							if (var10 != 32767) { // L: 7711
								var11 = var1.readUShortSmart(); // L: 7712
								var12 = var1.method5776(); // L: 7713
								int var13 = var10 > 0 ? var1.method5717() : var12; // L: 7714
								var15.addHealthBar(var9, Client.cycle, var10, var11, var12, var13); // L: 7715
							} else {
								var15.removeHealthBar(var9); // L: 7717
							}
						}
					}
				}

				if ((var5 & 32) != 0) { // L: 7721
					var6 = var1.method5727(); // L: 7722
					var7 = var1.readUnsignedShort(); // L: 7723
					var8 = var15.x - (var6 - GrandExchangeOfferNameComparator.baseX - GrandExchangeOfferNameComparator.baseX) * 64; // L: 7724
					var9 = var15.y - (var7 - NetCache.baseY - NetCache.baseY) * 64; // L: 7725
					if (var8 != 0 || var9 != 0) { // L: 7726
						var15.field981 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
					}
				}

				if ((var5 & 64) != 0) { // L: 7728
					var15.targetIndex = var1.method5727(); // L: 7729
					if (var15.targetIndex == 65535) { // L: 7730
						var15.targetIndex = -1;
					}
				}

				if ((var5 & 8) != 0) { // L: 7732
					var15.overheadText = var1.readStringCp1252NullTerminated(); // L: 7733
					var15.overheadTextCyclesRemaining = 100; // L: 7734
				}
			}

			for (var14 = 0; var14 < Client.field851; ++var14) { // L: 7738
				var3 = Client.field845[var14]; // L: 7739
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 7740
					Client.npcs[var3].definition = null; // L: 7741
					Client.npcs[var3] = null; // L: 7742
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 7745
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var14 = 0; var14 < Client.npcCount; ++var14) { // L: 7746
					if (Client.npcs[Client.npcIndices[var14]] == null) { // L: 7747
						throw new RuntimeException(var14 + "," + Client.npcCount); // L: 7748
					}
				}

			}
		}
	} // L: 7751

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "([Lhz;Lhz;ZI)V",
		garbageValue = "-379515741"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * -1633062311 * 262059497 : var1.width * 150294487 * -1593306137; // L: 9940
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * 1576927071 * 2058362015 : var1.height * -937018705 * -1510777777; // L: 9941
		ObjectSound.resizeInterface(var0, var1.id, var3, var4, var2); // L: 9942
		if (var1.children != null) { // L: 9943
			ObjectSound.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 9944
		if (var5 != null) { // L: 9945
			int var6 = var5.group; // L: 9946
			if (WorldMapCacheName.loadInterface(var6)) { // L: 9948
				ObjectSound.resizeInterface(DefaultsGroup.Widget_interfaceComponents[var6], -1, var3, var4, var2); // L: 9949
			}
		}

		if (var1.contentType == 1337) { // L: 9952
		}

	} // L: 9953
}
