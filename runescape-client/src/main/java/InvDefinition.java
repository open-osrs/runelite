import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("en")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1346199123
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "66775283"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.decodeNext(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "2113892179"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.size = var1.readUnsignedShort();
		}

	} // L: 41

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;Ljava/lang/String;Ljava/lang/String;I)Lkc;",
		garbageValue = "-16711936"
	)
	public static Font method2609(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 128
		int var5 = var0.getFileId(var4, var3); // L: 129
		Font var6;
		if (!Username.method5711(var0, var4, var5)) { // L: 132
			var6 = null; // L: 133
		} else {
			byte[] var8 = var1.takeFile(var4, var5); // L: 137
			Font var7;
			if (var8 == null) { // L: 139
				var7 = null; // L: 140
			} else {
				Font var9 = new Font(var8, class243.SpriteBuffer_xOffsets, class396.SpriteBuffer_yOffsets, ArchiveDiskActionHandler.SpriteBuffer_spriteWidths, class372.SpriteBuffer_spriteHeights, AccessFile.SpriteBuffer_spritePalette, class396.SpriteBuffer_pixels); // L: 143
				class243.SpriteBuffer_xOffsets = null; // L: 145
				class396.SpriteBuffer_yOffsets = null; // L: 146
				ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null; // L: 147
				class372.SpriteBuffer_spriteHeights = null; // L: 148
				AccessFile.SpriteBuffer_spritePalette = null; // L: 149
				class396.SpriteBuffer_pixels = null; // L: 150
				var7 = var9; // L: 152
			}

			var6 = var7; // L: 154
		}

		return var6; // L: 156
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1802356722"
	)
	static int method2616(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1397
			var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1398
			WorldMapScaleHandler.addGameMessage(0, "", var7); // L: 1399
			return 1; // L: 1400
		} else if (var0 == ScriptOpcodes.ANIM) {
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1403
			class69.performPlayerAnimation(class35.localPlayer, Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize], Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]); // L: 1404
			return 1; // L: 1405
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field951) { // L: 1408
				Interpreter.field950 = true; // L: 1409
			}

			return 1; // L: 1411
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1414
				var16 = 0; // L: 1415
				if (GrandExchangeOfferAgeComparator.isNumber(var7)) { // L: 1416
					var16 = FontName.method6162(var7);
				}

				PacketBufferNode var14 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2670, Client.packetWriter.isaacCipher); // L: 1418
				var14.packetBuffer.writeInt(var16); // L: 1419
				Client.packetWriter.addNode(var14); // L: 1420
				return 1; // L: 1421
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1424
					var12 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2588, Client.packetWriter.isaacCipher); // L: 1426
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1427
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1428
					Client.packetWriter.addNode(var12); // L: 1429
					return 1; // L: 1430
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1433
					var12 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2626, Client.packetWriter.isaacCipher); // L: 1435
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1436
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1437
					Client.packetWriter.addNode(var12); // L: 1438
					return 1; // L: 1439
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1442
						var4 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1443
						Skeleton.method3899(var10, var4); // L: 1444
						return 1; // L: 1445
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 1448
						var10 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 1449
						var16 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 1450
						int var9 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 1451
						Widget var15 = DevicePcmPlayerProvider.getWidget(var9); // L: 1452
						class214.clickWidget(var15, var10, var16); // L: 1453
						return 1; // L: 1454
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1457
						var10 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 1458
						var16 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 1459
						Widget var13 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 1460
						class214.clickWidget(var13, var10, var16); // L: 1461
						return 1; // L: 1462
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class229.mouseCam = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 1465
						return 1; // L: 1466
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class12.clientPreferences.roofsHidden ? 1 : 0; // L: 1469
						return 1; // L: 1470
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class12.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 1473
						KeyHandler.savePreferences(); // L: 1474
						return 1; // L: 1475
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1478
						boolean var8 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 1479
						Interpreter.openURL(var7, var8, false); // L: 1480
						return 1; // L: 1481
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1484
						var12 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2640, Client.packetWriter.isaacCipher); // L: 1486
						var12.packetBuffer.writeShort(var10); // L: 1487
						Client.packetWriter.addNode(var12); // L: 1488
						return 1; // L: 1489
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1492
						class13.Interpreter_stringStackSize -= 2; // L: 1493
						var4 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize]; // L: 1494
						String var5 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1]; // L: 1495
						if (var4.length() > 500) { // L: 1496
							return 1;
						} else if (var5.length() > 500) { // L: 1497
							return 1;
						} else {
							PacketBufferNode var6 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2644, Client.packetWriter.isaacCipher); // L: 1498
							var6.packetBuffer.writeShort(1 + class4.stringCp1252NullTerminatedByteSize(var4) + class4.stringCp1252NullTerminatedByteSize(var5)); // L: 1499
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1500
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1501
							var6.packetBuffer.writeByte(var10); // L: 1502
							Client.packetWriter.addNode(var6); // L: 1503
							return 1; // L: 1504
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 1507
						return 1; // L: 1508
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 1511
						return 1; // L: 1512
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 1515
						return 1; // L: 1516
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1) { // L: 1519
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1520
						}

						return 1; // L: 1521
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1) { // L: 1524
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1525
						}

						return 1; // L: 1526
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1) { // L: 1529
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1530
						}

						return 1; // L: 1531
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1) { // L: 1534
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1535
						}

						return 1; // L: 1536
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1539
						return 1; // L: 1540
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 1543
						return 1; // L: 1544
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 1547
						return 1; // L: 1548
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class24.setTapToDrop(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1); // L: 1551
						return 1; // L: 1552
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GameObject.getTapToDrop() ? 1 : 0; // L: 1555
						return 1; // L: 1556
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1559
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 1560
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 1561
						return 1; // L: 1562
					} else if (var0 == 3130) {
						WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1565
						return 1; // L: 1566
					} else if (var0 == 3131) {
						--WorldMapCacheName.Interpreter_intStackSize; // L: 1569
						return 1; // L: 1570
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 1573
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = HealthBarDefinition.canvasHeight; // L: 1574
						return 1; // L: 1575
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--WorldMapCacheName.Interpreter_intStackSize; // L: 1578
						return 1; // L: 1579
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1582
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1585
						return 1; // L: 1586
					} else if (var0 == 3136) {
						Client.field778 = 3; // L: 1589
						Client.field779 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1590
						return 1; // L: 1591
					} else if (var0 == 3137) {
						Client.field778 = 2; // L: 1594
						Client.field779 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1595
						return 1; // L: 1596
					} else if (var0 == 3138) {
						Client.field778 = 0; // L: 1599
						return 1; // L: 1600
					} else if (var0 == 3139) {
						Client.field778 = 1; // L: 1603
						return 1; // L: 1604
					} else if (var0 == 3140) {
						Client.field778 = 3; // L: 1607
						Client.field779 = var2 ? class308.scriptDotWidget.id * 1657404511 * 976969631 : class24.scriptActiveWidget.id * 1657404511 * 976969631; // L: 1608
						return 1; // L: 1609
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 1612
							class12.clientPreferences.hideUsername = var11; // L: 1613
							KeyHandler.savePreferences(); // L: 1614
							return 1; // L: 1615
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class12.clientPreferences.hideUsername ? 1 : 0; // L: 1618
							return 1; // L: 1619
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 1622
							Client.Login_isUsernameRemembered = var11; // L: 1623
							if (!var11) { // L: 1624
								class12.clientPreferences.rememberedUsername = ""; // L: 1625
								KeyHandler.savePreferences(); // L: 1626
							}

							return 1; // L: 1628
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1631
							return 1; // L: 1632
						} else if (var0 == 3145) {
							return 1; // L: 1635
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var11 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 1638
							if (var11 == class12.clientPreferences.titleMusicDisabled) { // L: 1639
								class12.clientPreferences.titleMusicDisabled = !var11; // L: 1640
								KeyHandler.savePreferences(); // L: 1641
							}

							return 1; // L: 1643
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class12.clientPreferences.titleMusicDisabled ? 0 : 1; // L: 1646
							return 1; // L: 1647
						} else if (var0 == 3148) {
							return 1; // L: 1650
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1653
							return 1; // L: 1654
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1657
							return 1; // L: 1658
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1661
							return 1; // L: 1662
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1665
							return 1; // L: 1666
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1669
							return 1; // L: 1670
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Script.method2026(); // L: 1673
							return 1; // L: 1674
						} else if (var0 == 3155) {
							--class13.Interpreter_stringStackSize; // L: 1677
							return 1; // L: 1678
						} else if (var0 == 3156) {
							return 1; // L: 1681
						} else if (var0 == 3157) {
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1684
							return 1; // L: 1685
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1688
							return 1; // L: 1689
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1692
							return 1; // L: 1693
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1696
							return 1; // L: 1697
						} else if (var0 == 3161) {
							--WorldMapCacheName.Interpreter_intStackSize; // L: 1700
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1701
							return 1; // L: 1702
						} else if (var0 == 3162) {
							--WorldMapCacheName.Interpreter_intStackSize; // L: 1705
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1706
							return 1; // L: 1707
						} else if (var0 == 3163) {
							--class13.Interpreter_stringStackSize; // L: 1710
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1711
							return 1; // L: 1712
						} else if (var0 == 3164) {
							--WorldMapCacheName.Interpreter_intStackSize; // L: 1715
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1716
							return 1; // L: 1717
						} else if (var0 == 3165) {
							--WorldMapCacheName.Interpreter_intStackSize; // L: 1720
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1721
							return 1; // L: 1722
						} else if (var0 == 3166) {
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1725
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1726
							return 1; // L: 1727
						} else if (var0 == 3167) {
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1730
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1731
							return 1; // L: 1732
						} else if (var0 == 3168) {
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1735
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1736
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1737
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1738
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1739
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1740
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1741
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1742
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1743
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1744
							return 1; // L: 1745
						} else if (var0 == 3169) {
							return 1; // L: 1748
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1751
							return 1; // L: 1752
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1755
							return 1; // L: 1756
						} else if (var0 == 3172) {
							--WorldMapCacheName.Interpreter_intStackSize; // L: 1759
							return 1; // L: 1760
						} else if (var0 == 3173) {
							--WorldMapCacheName.Interpreter_intStackSize; // L: 1763
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1764
							return 1; // L: 1765
						} else if (var0 == 3174) {
							--WorldMapCacheName.Interpreter_intStackSize; // L: 1768
							return 1; // L: 1769
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1772
							return 1; // L: 1773
						} else if (var0 == 3176) {
							return 1; // L: 1776
						} else if (var0 == 3177) {
							return 1; // L: 1779
						} else if (var0 == 3178) {
							--class13.Interpreter_stringStackSize; // L: 1782
							return 1; // L: 1783
						} else if (var0 == 3179) {
							return 1; // L: 1786
						} else if (var0 == 3180) {
							--class13.Interpreter_stringStackSize; // L: 1789
							return 1; // L: 1790
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize], 0), 100); // L: 1793
							class264.method4796((double)(0.5F + (float)var10 / 200.0F)); // L: 1794
							return 1; // L: 1795
						} else if (var0 == 3182) {
							float var3 = ((float)class12.clientPreferences.field1303 - 0.5F) * 200.0F; // L: 1798
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 100 - Math.round(var3); // L: 1799
							return 1; // L: 1800
						} else if (var0 != 3183 && var0 != 3184) {
							return 2; // L: 1806
						} else {
							--WorldMapCacheName.Interpreter_intStackSize; // L: 1803
							return 1; // L: 1804
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "882607989"
	)
	static final void method2615(int var0, int var1, int var2, int var3) {
		class125.method2506(); // L: 5410
	} // L: 5411
}
