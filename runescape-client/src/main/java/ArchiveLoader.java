import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bf")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("fr")
	static int[] field984;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 421357321
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -53898693
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lkz;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1404548417"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method5584(var1) || this.archive.method5570(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("b")
	static boolean method2123(long var0) {
		int var2 = (int)(var0 >>> 14 & 3L); // L: 50
		return var2 == 2; // L: 52
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-1437384176"
	)
	static int method2122(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1409
			var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1410
			class194.addGameMessage(0, "", var7); // L: 1411
			return 1; // L: 1412
		} else if (var0 == ScriptOpcodes.ANIM) {
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 1415
			class125.performPlayerAnimation(class340.localPlayer, Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize], Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]); // L: 1416
			return 1; // L: 1417
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field816) { // L: 1420
				Interpreter.field818 = true; // L: 1421
			}

			return 1; // L: 1423
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1426
				var16 = 0; // L: 1427
				if (ClanSettings.isNumber(var7)) { // L: 1428
					var16 = ClanChannelMember.method2778(var7);
				}

				PacketBufferNode var14 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2862, Client.packetWriter.isaacCipher); // L: 1430
				var14.packetBuffer.writeInt(var16); // L: 1431
				Client.packetWriter.addNode(var14); // L: 1432
				return 1; // L: 1433
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1436
					var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2845, Client.packetWriter.isaacCipher); // L: 1438
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1439
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1440
					Client.packetWriter.addNode(var12); // L: 1441
					return 1; // L: 1442
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1445
					var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2893, Client.packetWriter.isaacCipher); // L: 1447
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1448
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1449
					Client.packetWriter.addNode(var12); // L: 1450
					return 1; // L: 1451
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1454
						var4 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1455
						class136.method2840(var10, var4); // L: 1456
						return 1; // L: 1457
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						IsaacCipher.Interpreter_intStackSize -= 3; // L: 1460
						var10 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 1461
						var16 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 1462
						int var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 1463
						Widget var15 = ChatChannel.getWidget(var9); // L: 1464
						class29.clickWidget(var15, var10, var16); // L: 1465
						return 1; // L: 1466
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						IsaacCipher.Interpreter_intStackSize -= 2; // L: 1469
						var10 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 1470
						var16 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 1471
						Widget var13 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget; // L: 1472
						class29.clickWidget(var13, var10, var16); // L: 1473
						return 1; // L: 1474
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class150.mouseCam = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 1477
						return 1; // L: 1478
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = SecureRandomFuture.clientPreferences.roofsHidden ? 1 : 0; // L: 1481
						return 1; // L: 1482
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						SecureRandomFuture.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 1485
						class127.savePreferences(); // L: 1486
						return 1; // L: 1487
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1490
						boolean var8 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 1491
						WorldMapSprite.openURL(var7, var8, false); // L: 1492
						return 1; // L: 1493
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1496
						var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2808, Client.packetWriter.isaacCipher); // L: 1498
						var12.packetBuffer.writeShort(var10); // L: 1499
						Client.packetWriter.addNode(var12); // L: 1500
						return 1; // L: 1501
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1504
						class13.Interpreter_stringStackSize -= 2; // L: 1505
						var4 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize]; // L: 1506
						String var5 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1]; // L: 1507
						if (var4.length() > 500) { // L: 1508
							return 1;
						} else if (var5.length() > 500) { // L: 1509
							return 1;
						} else {
							PacketBufferNode var6 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2841, Client.packetWriter.isaacCipher); // L: 1510
							var6.packetBuffer.writeShort(1 + class116.stringCp1252NullTerminatedByteSize(var4) + class116.stringCp1252NullTerminatedByteSize(var5)); // L: 1511
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1512
							var6.packetBuffer.method7343(var10); // L: 1513
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1514
							Client.packetWriter.addNode(var6); // L: 1515
							return 1; // L: 1516
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 1519
						return 1; // L: 1520
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 1523
						return 1; // L: 1524
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 1527
						return 1; // L: 1528
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1) { // L: 1531
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1532
						}

						return 1; // L: 1533
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1) { // L: 1536
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1537
						}

						return 1; // L: 1538
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1) { // L: 1541
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1542
						}

						return 1; // L: 1543
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1) { // L: 1546
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1547
						}

						return 1; // L: 1548
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1551
						return 1; // L: 1552
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 1555
						return 1; // L: 1556
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 1559
						return 1; // L: 1560
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class12.setTapToDrop(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1); // L: 1563
						return 1; // L: 1564
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Tiles.getTapToDrop() ? 1 : 0; // L: 1567
						return 1; // L: 1568
					} else if (var0 == 3129) {
						IsaacCipher.Interpreter_intStackSize -= 2; // L: 1571
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 1572
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 1573
						return 1; // L: 1574
					} else if (var0 == 3130) {
						IsaacCipher.Interpreter_intStackSize -= 2; // L: 1577
						return 1; // L: 1578
					} else if (var0 == 3131) {
						--IsaacCipher.Interpreter_intStackSize; // L: 1581
						return 1; // L: 1582
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class186.canvasWidth; // L: 1585
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = BoundaryObject.canvasHeight; // L: 1586
						return 1; // L: 1587
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--IsaacCipher.Interpreter_intStackSize; // L: 1590
						return 1; // L: 1591
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1594
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						IsaacCipher.Interpreter_intStackSize -= 2; // L: 1597
						return 1; // L: 1598
					} else if (var0 == 3136) {
						Client.field638 = 3; // L: 1601
						Client.field639 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1602
						return 1; // L: 1603
					} else if (var0 == 3137) {
						Client.field638 = 2; // L: 1606
						Client.field639 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1607
						return 1; // L: 1608
					} else if (var0 == 3138) {
						Client.field638 = 0; // L: 1611
						return 1; // L: 1612
					} else if (var0 == 3139) {
						Client.field638 = 1; // L: 1615
						return 1; // L: 1616
					} else if (var0 == 3140) {
						Client.field638 = 3; // L: 1619
						Client.field639 = var2 ? WorldMapArea.scriptDotWidget.id * 1695982371 * 2075239563 : Messages.scriptActiveWidget.id * 1695982371 * 2075239563; // L: 1620
						return 1; // L: 1621
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 1624
							SecureRandomFuture.clientPreferences.hideUsername = var11; // L: 1625
							class127.savePreferences(); // L: 1626
							return 1; // L: 1627
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = SecureRandomFuture.clientPreferences.hideUsername ? 1 : 0; // L: 1630
							return 1; // L: 1631
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 1634
							Client.Login_isUsernameRemembered = var11; // L: 1635
							if (!var11) { // L: 1636
								SecureRandomFuture.clientPreferences.rememberedUsername = ""; // L: 1637
								class127.savePreferences(); // L: 1638
							}

							return 1; // L: 1640
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1643
							return 1; // L: 1644
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 1647
						} else if (var0 == 3146) {
							var11 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 1650
							if (var11 == SecureRandomFuture.clientPreferences.titleMusicDisabled) { // L: 1651
								SecureRandomFuture.clientPreferences.titleMusicDisabled = !var11; // L: 1652
								class127.savePreferences(); // L: 1653
							}

							return 1; // L: 1655
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = SecureRandomFuture.clientPreferences.titleMusicDisabled ? 0 : 1; // L: 1658
							return 1; // L: 1659
						} else if (var0 == 3148) {
							return 1; // L: 1662
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1665
							return 1; // L: 1666
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1669
							return 1; // L: 1670
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1673
							return 1; // L: 1674
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1677
							return 1; // L: 1678
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1681
							return 1; // L: 1682
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = AbstractRasterProvider.method7714(); // L: 1685
							return 1; // L: 1686
						} else if (var0 == 3155) {
							--class13.Interpreter_stringStackSize; // L: 1689
							return 1; // L: 1690
						} else if (var0 == 3156) {
							return 1; // L: 1693
						} else if (var0 == 3157) {
							IsaacCipher.Interpreter_intStackSize -= 2; // L: 1696
							return 1; // L: 1697
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1700
							return 1; // L: 1701
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1704
							return 1; // L: 1705
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1708
							return 1; // L: 1709
						} else if (var0 == 3161) {
							--IsaacCipher.Interpreter_intStackSize; // L: 1712
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1713
							return 1; // L: 1714
						} else if (var0 == 3162) {
							--IsaacCipher.Interpreter_intStackSize; // L: 1717
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1718
							return 1; // L: 1719
						} else if (var0 == 3163) {
							--class13.Interpreter_stringStackSize; // L: 1722
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1723
							return 1; // L: 1724
						} else if (var0 == 3164) {
							--IsaacCipher.Interpreter_intStackSize; // L: 1727
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1728
							return 1; // L: 1729
						} else if (var0 == 3165) {
							--IsaacCipher.Interpreter_intStackSize; // L: 1732
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1733
							return 1; // L: 1734
						} else if (var0 == 3166) {
							IsaacCipher.Interpreter_intStackSize -= 2; // L: 1737
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1738
							return 1; // L: 1739
						} else if (var0 == 3167) {
							IsaacCipher.Interpreter_intStackSize -= 2; // L: 1742
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1743
							return 1; // L: 1744
						} else if (var0 == 3168) {
							IsaacCipher.Interpreter_intStackSize -= 2; // L: 1747
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1748
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1749
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1750
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1751
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1752
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1753
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1754
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1755
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 1756
							return 1; // L: 1757
						} else if (var0 == 3169) {
							return 1; // L: 1760
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1763
							return 1; // L: 1764
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1767
							return 1; // L: 1768
						} else if (var0 == 3172) {
							--IsaacCipher.Interpreter_intStackSize; // L: 1771
							return 1; // L: 1772
						} else if (var0 == 3173) {
							--IsaacCipher.Interpreter_intStackSize; // L: 1775
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1776
							return 1; // L: 1777
						} else if (var0 == 3174) {
							--IsaacCipher.Interpreter_intStackSize; // L: 1780
							return 1; // L: 1781
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1784
							return 1; // L: 1785
						} else if (var0 == 3176) {
							return 1; // L: 1788
						} else if (var0 == 3177) {
							return 1; // L: 1791
						} else if (var0 == 3178) {
							--class13.Interpreter_stringStackSize; // L: 1794
							return 1; // L: 1795
						} else if (var0 == 3179) {
							return 1; // L: 1798
						} else if (var0 == 3180) {
							--class13.Interpreter_stringStackSize; // L: 1801
							return 1; // L: 1802
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize], 0), 100); // L: 1805
							InterfaceParent.method2142((double)(0.5F + (float)var10 / 200.0F)); // L: 1806
							return 1; // L: 1807
						} else if (var0 == 3182) {
							float var3 = ((float)SecureRandomFuture.clientPreferences.brightness - 0.5F) * 200.0F; // L: 1810
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 100 - Math.round(var3); // L: 1811
							return 1; // L: 1812
						} else if (var0 != 3183 && var0 != 3184) {
							return 2; // L: 1818
						} else {
							--IsaacCipher.Interpreter_intStackSize; // L: 1815
							return 1; // L: 1816
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "1046590636"
	)
	static int method2120(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) { // L: 4429
			IsaacCipher.Interpreter_intStackSize -= 5; // L: 4430
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4431
			return 1; // L: 4432
		} else if (var0 == 7204) { // L: 4434
			IsaacCipher.Interpreter_intStackSize -= 6; // L: 4435
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4436
			return 1; // L: 4437
		} else if (var0 >= 7205 && var0 < 7209) { // L: 4439
			Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4440
			return 1; // L: 4441
		} else if (var0 == 7209) { // L: 4443
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 4444
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4445
			return 1; // L: 4446
		} else if (var0 >= 7210 && var0 < 7214) { // L: 4448
			--IsaacCipher.Interpreter_intStackSize; // L: 4449
			return 1; // L: 4450
		} else if (var0 == 7214) { // L: 4452
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 4453
			return 1; // L: 4454
		} else {
			return 2; // L: 4456
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-47"
	)
	static boolean method2125() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 11376
	}
}
