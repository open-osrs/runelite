import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
public class class82 {
	@ObfuscatedName("f")
	static final BigInteger field1000;
	@ObfuscatedName("e")
	static final BigInteger field996;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1114873797
	)
	static int field999;

	static {
		field1000 = new BigInteger("10001", 16); // L: 6
		field996 = new BigInteger("8dc6a1a83bbb640252f3f8edaa19da8f7ef11de714d12d808467f1e9d80d457a089db79c00e6a7fd1a413a29a10b5e31f3f81b773f9d3de5b509aa3b4c6aae73b449122c91af25cff56ecc0f2c688f36a0fea3a8856adec0b7e11b2ecacc1f766e1e89462aa2839db7c7d469e5816d2ef676ec87a7e70f3fdb76b0f86d9f34a7", 16); // L: 7
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "0"
	)
	static int method2031(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1411
			var7 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 1412
			UserComparator10.addGameMessage(0, "", var7); // L: 1413
			return 1; // L: 1414
		} else if (var0 == ScriptOpcodes.ANIM) {
			ChatChannel.Interpreter_intStackSize -= 2; // L: 1417
			World.performPlayerAnimation(class262.localPlayer, Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]); // L: 1418
			return 1; // L: 1419
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field951) { // L: 1422
				Interpreter.field963 = true; // L: 1423
			}

			return 1; // L: 1425
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 1428
				var16 = 0; // L: 1429
				if (Varps.isNumber(var7)) { // L: 1430
					var16 = FontName.method6335(var7);
				}

				PacketBufferNode var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2664, Client.packetWriter.isaacCipher); // L: 1432
				var14.packetBuffer.writeInt(var16); // L: 1433
				Client.packetWriter.addNode(var14); // L: 1434
				return 1; // L: 1435
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 1438
					var12 = InterfaceParent.getPacketBufferNode(ClientPacket.field2582, Client.packetWriter.isaacCipher); // L: 1440
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1441
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1442
					Client.packetWriter.addNode(var12); // L: 1443
					return 1; // L: 1444
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 1447
					var12 = InterfaceParent.getPacketBufferNode(ClientPacket.field2610, Client.packetWriter.isaacCipher); // L: 1449
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1450
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1451
					Client.packetWriter.addNode(var12); // L: 1452
					return 1; // L: 1453
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1456
						var4 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 1457
						FriendsList.method5711(var10, var4); // L: 1458
						return 1; // L: 1459
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						ChatChannel.Interpreter_intStackSize -= 3; // L: 1462
						var10 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 1463
						var16 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 1464
						int var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 1465
						Widget var15 = WorldMapData_1.getWidget(var9); // L: 1466
						ItemLayer.clickWidget(var15, var10, var16); // L: 1467
						return 1; // L: 1468
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						ChatChannel.Interpreter_intStackSize -= 2; // L: 1471
						var10 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 1472
						var16 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 1473
						Widget var13 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 1474
						ItemLayer.clickWidget(var13, var10, var16); // L: 1475
						return 1; // L: 1476
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						UserComparator3.mouseCam = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 1479
						return 1; // L: 1480
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class4.clientPreferences.roofsHidden ? 1 : 0; // L: 1483
						return 1; // L: 1484
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class4.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 1487
						Actor.savePreferences(); // L: 1488
						return 1; // L: 1489
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 1492
						boolean var8 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 1493
						AttackOption.openURL(var7, var8, false); // L: 1494
						return 1; // L: 1495
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1498
						var12 = InterfaceParent.getPacketBufferNode(ClientPacket.field2622, Client.packetWriter.isaacCipher); // L: 1500
						var12.packetBuffer.writeShort(var10); // L: 1501
						Client.packetWriter.addNode(var12); // L: 1502
						return 1; // L: 1503
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1506
						UserComparator9.Interpreter_stringStackSize -= 2; // L: 1507
						var4 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize]; // L: 1508
						String var5 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1]; // L: 1509
						if (var4.length() > 500) { // L: 1510
							return 1;
						} else if (var5.length() > 500) { // L: 1511
							return 1;
						} else {
							PacketBufferNode var6 = InterfaceParent.getPacketBufferNode(ClientPacket.field2651, Client.packetWriter.isaacCipher); // L: 1512
							var6.packetBuffer.writeShort(1 + class44.stringCp1252NullTerminatedByteSize(var4) + class44.stringCp1252NullTerminatedByteSize(var5)); // L: 1513
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1514
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1515
							var6.packetBuffer.method6640(var10); // L: 1516
							Client.packetWriter.addNode(var6); // L: 1517
							return 1; // L: 1518
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 1521
						return 1; // L: 1522
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 1525
						return 1; // L: 1526
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 1529
						return 1; // L: 1530
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1) { // L: 1533
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1534
						}

						return 1; // L: 1535
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1) { // L: 1538
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1539
						}

						return 1; // L: 1540
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1) { // L: 1543
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1544
						}

						return 1; // L: 1545
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1) { // L: 1548
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1549
						}

						return 1; // L: 1550
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1553
						return 1; // L: 1554
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 1557
						return 1; // L: 1558
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 1561
						return 1; // L: 1562
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						Fonts.setTapToDrop(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1); // L: 1565
						return 1; // L: 1566
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = PendingSpawn.getTapToDrop() ? 1 : 0; // L: 1569
						return 1; // L: 1570
					} else if (var0 == 3129) {
						ChatChannel.Interpreter_intStackSize -= 2; // L: 1573
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 1574
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 1575
						return 1; // L: 1576
					} else if (var0 == 3130) {
						ChatChannel.Interpreter_intStackSize -= 2; // L: 1579
						return 1; // L: 1580
					} else if (var0 == 3131) {
						--ChatChannel.Interpreter_intStackSize; // L: 1583
						return 1; // L: 1584
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = AttackOption.canvasWidth; // L: 1587
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class0.canvasHeight; // L: 1588
						return 1; // L: 1589
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--ChatChannel.Interpreter_intStackSize; // L: 1592
						return 1; // L: 1593
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1596
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						ChatChannel.Interpreter_intStackSize -= 2; // L: 1599
						return 1; // L: 1600
					} else if (var0 == 3136) {
						Client.field784 = 3; // L: 1603
						Client.field694 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1604
						return 1; // L: 1605
					} else if (var0 == 3137) {
						Client.field784 = 2; // L: 1608
						Client.field694 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1609
						return 1; // L: 1610
					} else if (var0 == 3138) {
						Client.field784 = 0; // L: 1613
						return 1; // L: 1614
					} else if (var0 == 3139) {
						Client.field784 = 1; // L: 1617
						return 1; // L: 1618
					} else if (var0 == 3140) {
						Client.field784 = 3; // L: 1621
						Client.field694 = var2 ? UserComparator5.scriptDotWidget.id * -464746545 * 363798319 : User.scriptActiveWidget.id * -464746545 * 363798319; // L: 1622
						return 1; // L: 1623
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 1626
							class4.clientPreferences.hideUsername = var11; // L: 1627
							Actor.savePreferences(); // L: 1628
							return 1; // L: 1629
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class4.clientPreferences.hideUsername ? 1 : 0; // L: 1632
							return 1; // L: 1633
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 1636
							Client.Login_isUsernameRemembered = var11; // L: 1637
							if (!var11) { // L: 1638
								class4.clientPreferences.rememberedUsername = ""; // L: 1639
								Actor.savePreferences(); // L: 1640
							}

							return 1; // L: 1642
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1645
							return 1; // L: 1646
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 1649
						} else if (var0 == 3146) {
							var11 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 1652
							if (var11 == class4.clientPreferences.titleMusicDisabled) { // L: 1653
								class4.clientPreferences.titleMusicDisabled = !var11; // L: 1654
								Actor.savePreferences(); // L: 1655
							}

							return 1; // L: 1657
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class4.clientPreferences.titleMusicDisabled ? 0 : 1; // L: 1660
							return 1; // L: 1661
						} else if (var0 == 3148) {
							return 1; // L: 1664
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1667
							return 1; // L: 1668
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1671
							return 1; // L: 1672
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1675
							return 1; // L: 1676
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1679
							return 1; // L: 1680
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1683
							return 1; // L: 1684
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = FontName.method6329(); // L: 1687
							return 1; // L: 1688
						} else if (var0 == 3155) {
							--UserComparator9.Interpreter_stringStackSize; // L: 1691
							return 1; // L: 1692
						} else if (var0 == 3156) {
							return 1; // L: 1695
						} else if (var0 == 3157) {
							ChatChannel.Interpreter_intStackSize -= 2; // L: 1698
							return 1; // L: 1699
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1702
							return 1; // L: 1703
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1706
							return 1; // L: 1707
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1710
							return 1; // L: 1711
						} else if (var0 == 3161) {
							--ChatChannel.Interpreter_intStackSize; // L: 1714
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1715
							return 1; // L: 1716
						} else if (var0 == 3162) {
							--ChatChannel.Interpreter_intStackSize; // L: 1719
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1720
							return 1; // L: 1721
						} else if (var0 == 3163) {
							--UserComparator9.Interpreter_stringStackSize; // L: 1724
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1725
							return 1; // L: 1726
						} else if (var0 == 3164) {
							--ChatChannel.Interpreter_intStackSize; // L: 1729
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 1730
							return 1; // L: 1731
						} else if (var0 == 3165) {
							--ChatChannel.Interpreter_intStackSize; // L: 1734
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1735
							return 1; // L: 1736
						} else if (var0 == 3166) {
							ChatChannel.Interpreter_intStackSize -= 2; // L: 1739
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1740
							return 1; // L: 1741
						} else if (var0 == 3167) {
							ChatChannel.Interpreter_intStackSize -= 2; // L: 1744
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1745
							return 1; // L: 1746
						} else if (var0 == 3168) {
							ChatChannel.Interpreter_intStackSize -= 2; // L: 1749
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 1750
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 1751
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 1752
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 1753
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 1754
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 1755
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 1756
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 1757
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 1758
							return 1; // L: 1759
						} else if (var0 == 3169) {
							return 1; // L: 1762
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1765
							return 1; // L: 1766
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1769
							return 1; // L: 1770
						} else if (var0 == 3172) {
							--ChatChannel.Interpreter_intStackSize; // L: 1773
							return 1; // L: 1774
						} else if (var0 == 3173) {
							--ChatChannel.Interpreter_intStackSize; // L: 1777
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1778
							return 1; // L: 1779
						} else if (var0 == 3174) {
							--ChatChannel.Interpreter_intStackSize; // L: 1782
							return 1; // L: 1783
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1786
							return 1; // L: 1787
						} else if (var0 == 3176) {
							return 1; // L: 1790
						} else if (var0 == 3177) {
							return 1; // L: 1793
						} else if (var0 == 3178) {
							--UserComparator9.Interpreter_stringStackSize; // L: 1796
							return 1; // L: 1797
						} else if (var0 == 3179) {
							return 1; // L: 1800
						} else if (var0 == 3180) {
							--UserComparator9.Interpreter_stringStackSize; // L: 1803
							return 1; // L: 1804
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize], 0), 100); // L: 1807
							UserComparator10.method2568((double)(0.5F + (float)var10 / 200.0F)); // L: 1808
							return 1; // L: 1809
						} else if (var0 == 3182) {
							float var3 = 200.0F * ((float)class4.clientPreferences.field1312 - 0.5F); // L: 1812
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 100 - Math.round(var3); // L: 1813
							return 1; // L: 1814
						} else if (var0 != 3183 && var0 != 3184) {
							return 2; // L: 1820
						} else {
							--ChatChannel.Interpreter_intStackSize; // L: 1817
							return 1; // L: 1818
						}
					}
				}
			}
		}
	}
}
