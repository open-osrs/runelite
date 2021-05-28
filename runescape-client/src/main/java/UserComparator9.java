import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dg")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;B)I",
		garbageValue = "-69"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "910297623"
	)
	static int method2466(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1397
			var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1398
			World.addGameMessage(0, "", var7); // L: 1399
			return 1; // L: 1400
		} else if (var0 == ScriptOpcodes.ANIM) {
			class44.Interpreter_intStackSize -= 2; // L: 1403
			class32.performPlayerAnimation(class93.localPlayer, Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]); // L: 1404
			return 1; // L: 1405
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field986) { // L: 1408
				Interpreter.field973 = true; // L: 1409
			}

			return 1; // L: 1411
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1414
				var16 = 0; // L: 1415
				if (class20.isNumber(var7)) { // L: 1416
					var16 = class82.method1908(var7);
				}

				PacketBufferNode var14 = class21.getPacketBufferNode(ClientPacket.field2582, Client.packetWriter.isaacCipher); // L: 1418
				var14.packetBuffer.writeInt(var16); // L: 1419
				Client.packetWriter.addNode(var14); // L: 1420
				return 1; // L: 1421
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1424
					var12 = class21.getPacketBufferNode(ClientPacket.field2595, Client.packetWriter.isaacCipher); // L: 1426
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1427
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1428
					Client.packetWriter.addNode(var12); // L: 1429
					return 1; // L: 1430
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1433
					var12 = class21.getPacketBufferNode(ClientPacket.field2653, Client.packetWriter.isaacCipher); // L: 1435
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1436
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1437
					Client.packetWriter.addNode(var12); // L: 1438
					return 1; // L: 1439
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1442
						var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1443
						Actor.method2192(var10, var4); // L: 1444
						return 1; // L: 1445
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class44.Interpreter_intStackSize -= 3; // L: 1448
						var10 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 1449
						var16 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 1450
						int var9 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 1451
						Widget var15 = Frames.getWidget(var9); // L: 1452
						VarcInt.clickWidget(var15, var10, var16); // L: 1453
						return 1; // L: 1454
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class44.Interpreter_intStackSize -= 2; // L: 1457
						var10 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 1458
						var16 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 1459
						Widget var13 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1460
						VarcInt.clickWidget(var13, var10, var16); // L: 1461
						return 1; // L: 1462
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						Client.mouseCam = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 1465
						return 1; // L: 1466
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ObjectComposition.clientPreferences.roofsHidden ? 1 : 0; // L: 1469
						return 1; // L: 1470
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						ObjectComposition.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 1473
						TileItem.savePreferences(); // L: 1474
						return 1; // L: 1475
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1478
						boolean var8 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 1479
						Players.openURL(var7, var8, false); // L: 1480
						return 1; // L: 1481
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1484
						var12 = class21.getPacketBufferNode(ClientPacket.field2647, Client.packetWriter.isaacCipher); // L: 1486
						var12.packetBuffer.writeShort(var10); // L: 1487
						Client.packetWriter.addNode(var12); // L: 1488
						return 1; // L: 1489
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1492
						Interpreter.Interpreter_stringStackSize -= 2; // L: 1493
						var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 1494
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 1495
						if (var4.length() > 500) { // L: 1496
							return 1;
						} else if (var5.length() > 500) { // L: 1497
							return 1;
						} else {
							PacketBufferNode var6 = class21.getPacketBufferNode(ClientPacket.field2588, Client.packetWriter.isaacCipher); // L: 1498
							var6.packetBuffer.writeShort(1 + Tiles.stringCp1252NullTerminatedByteSize(var4) + Tiles.stringCp1252NullTerminatedByteSize(var5)); // L: 1499
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1500
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1501
							var6.packetBuffer.writeByte(var10); // L: 1502
							Client.packetWriter.addNode(var6); // L: 1503
							return 1; // L: 1504
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 1507
						return 1; // L: 1508
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 1511
						return 1; // L: 1512
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 1515
						return 1; // L: 1516
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1) { // L: 1519
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1520
						}

						return 1; // L: 1521
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1) { // L: 1524
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1525
						}

						return 1; // L: 1526
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1) { // L: 1529
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1530
						}

						return 1; // L: 1531
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1) { // L: 1534
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1535
						}

						return 1; // L: 1536
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1539
						return 1; // L: 1540
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 1543
						return 1; // L: 1544
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 1547
						return 1; // L: 1548
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						UserComparator4.setTapToDrop(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1); // L: 1551
						return 1; // L: 1552
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class8.getTapToDrop() ? 1 : 0; // L: 1555
						return 1; // L: 1556
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						class44.Interpreter_intStackSize -= 2; // L: 1559
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 1560
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 1561
						return 1; // L: 1562
					} else if (var0 == 3130) {
						class44.Interpreter_intStackSize -= 2; // L: 1565
						return 1; // L: 1566
					} else if (var0 == 3131) {
						--class44.Interpreter_intStackSize; // L: 1569
						return 1; // L: 1570
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class32.canvasWidth; // L: 1573
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ReflectionCheck.canvasHeight; // L: 1574
						return 1; // L: 1575
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class44.Interpreter_intStackSize; // L: 1578
						return 1; // L: 1579
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1582
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class44.Interpreter_intStackSize -= 2; // L: 1585
						return 1; // L: 1586
					} else if (var0 == 3136) {
						Client.field803 = 3; // L: 1589
						Client.field805 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1590
						return 1; // L: 1591
					} else if (var0 == 3137) {
						Client.field803 = 2; // L: 1594
						Client.field805 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1595
						return 1; // L: 1596
					} else if (var0 == 3138) {
						Client.field803 = 0; // L: 1599
						return 1; // L: 1600
					} else if (var0 == 3139) {
						Client.field803 = 1; // L: 1603
						return 1; // L: 1604
					} else if (var0 == 3140) {
						Client.field803 = 3; // L: 1607
						Client.field805 = var2 ? class13.scriptDotWidget.id * 1969535585 * -1722455647 : Interpreter.scriptActiveWidget.id * 1969535585 * -1722455647; // L: 1608
						return 1; // L: 1609
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 1612
							ObjectComposition.clientPreferences.hideUsername = var11; // L: 1613
							TileItem.savePreferences(); // L: 1614
							return 1; // L: 1615
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ObjectComposition.clientPreferences.hideUsername ? 1 : 0; // L: 1618
							return 1; // L: 1619
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 1622
							Client.Login_isUsernameRemembered = var11; // L: 1623
							if (!var11) { // L: 1624
								ObjectComposition.clientPreferences.rememberedUsername = ""; // L: 1625
								TileItem.savePreferences(); // L: 1626
							}

							return 1; // L: 1628
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1631
							return 1; // L: 1632
						} else if (var0 == 3145) {
							return 1; // L: 1635
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var11 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 1638
							if (var11 == ObjectComposition.clientPreferences.titleMusicDisabled) { // L: 1639
								ObjectComposition.clientPreferences.titleMusicDisabled = !var11; // L: 1640
								TileItem.savePreferences(); // L: 1641
							}

							return 1; // L: 1643
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ObjectComposition.clientPreferences.titleMusicDisabled ? 0 : 1; // L: 1646
							return 1; // L: 1647
						} else if (var0 == 3148) {
							return 1; // L: 1650
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1653
							return 1; // L: 1654
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1657
							return 1; // L: 1658
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1661
							return 1; // L: 1662
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1665
							return 1; // L: 1666
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1669
							return 1; // L: 1670
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class43.method440(); // L: 1673
							return 1; // L: 1674
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize; // L: 1677
							return 1; // L: 1678
						} else if (var0 == 3156) {
							return 1; // L: 1681
						} else if (var0 == 3157) {
							class44.Interpreter_intStackSize -= 2; // L: 1684
							return 1; // L: 1685
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1688
							return 1; // L: 1689
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1692
							return 1; // L: 1693
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1696
							return 1; // L: 1697
						} else if (var0 == 3161) {
							--class44.Interpreter_intStackSize; // L: 1700
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1701
							return 1; // L: 1702
						} else if (var0 == 3162) {
							--class44.Interpreter_intStackSize; // L: 1705
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1706
							return 1; // L: 1707
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize; // L: 1710
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1711
							return 1; // L: 1712
						} else if (var0 == 3164) {
							--class44.Interpreter_intStackSize; // L: 1715
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1716
							return 1; // L: 1717
						} else if (var0 == 3165) {
							--class44.Interpreter_intStackSize; // L: 1720
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1721
							return 1; // L: 1722
						} else if (var0 == 3166) {
							class44.Interpreter_intStackSize -= 2; // L: 1725
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1726
							return 1; // L: 1727
						} else if (var0 == 3167) {
							class44.Interpreter_intStackSize -= 2; // L: 1730
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1731
							return 1; // L: 1732
						} else if (var0 == 3168) {
							class44.Interpreter_intStackSize -= 2; // L: 1735
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1736
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1737
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1738
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1739
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1740
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1741
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1742
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1743
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1744
							return 1; // L: 1745
						} else if (var0 == 3169) {
							return 1; // L: 1748
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1751
							return 1; // L: 1752
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1755
							return 1; // L: 1756
						} else if (var0 == 3172) {
							--class44.Interpreter_intStackSize; // L: 1759
							return 1; // L: 1760
						} else if (var0 == 3173) {
							--class44.Interpreter_intStackSize; // L: 1763
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1764
							return 1; // L: 1765
						} else if (var0 == 3174) {
							--class44.Interpreter_intStackSize; // L: 1768
							return 1; // L: 1769
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1772
							return 1; // L: 1773
						} else if (var0 == 3176) {
							return 1; // L: 1776
						} else if (var0 == 3177) {
							return 1; // L: 1779
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_stringStackSize; // L: 1782
							return 1; // L: 1783
						} else if (var0 == 3179) {
							return 1; // L: 1786
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_stringStackSize; // L: 1789
							return 1; // L: 1790
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize], 0), 100); // L: 1793
							InterfaceParent.method2082((double)(0.5F + (float)var10 / 200.0F)); // L: 1794
							return 1; // L: 1795
						} else if (var0 == 3182) {
							float var3 = 200.0F * ((float)ObjectComposition.clientPreferences.field1337 - 0.5F); // L: 1798
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 100 - Math.round(var3); // L: 1799
							return 1; // L: 1800
						} else if (var0 != 3183 && var0 != 3184) {
							return 2; // L: 1806
						} else {
							--class44.Interpreter_intStackSize; // L: 1803
							return 1; // L: 1804
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "70996791"
	)
	static int method2467(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field989 - 7.0D) * 256.0D); // L: 3515
	}
}
