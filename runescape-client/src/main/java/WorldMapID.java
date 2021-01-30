import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ao")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	static final WorldMapID field292;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	static final WorldMapID field296;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1634523621
	)
	@Export("value")
	final int value;

	static {
		field292 = new WorldMapID(0); // L: 4
		field296 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1557996921"
	)
	public static void method601() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 41
	} // L: 42

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-1833830337"
	)
	static int method600(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1327
			var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1328
			class234.addGameMessage(0, "", var7); // L: 1329
			return 1; // L: 1330
		} else if (var0 == ScriptOpcodes.ANIM) {
			VarcInt.Interpreter_intStackSize -= 2; // L: 1333
			Tiles.performPlayerAnimation(PlayerAppearance.localPlayer, Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize], Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]); // L: 1334
			return 1; // L: 1335
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field1103) { // L: 1338
				Interpreter.field1104 = true; // L: 1339
			}

			return 1; // L: 1341
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1344
				var16 = 0; // L: 1345
				if (ArchiveDiskAction.isNumber(var7)) { // L: 1346
					var16 = class279.parseInt(var7);
				}

				PacketBufferNode var14 = ItemContainer.getPacketBufferNode(ClientPacket.field2291, Client.packetWriter.isaacCipher); // L: 1348
				var14.packetBuffer.writeInt(var16); // L: 1349
				Client.packetWriter.addNode(var14); // L: 1350
				return 1; // L: 1351
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1354
					var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2245, Client.packetWriter.isaacCipher); // L: 1356
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1357
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1358
					Client.packetWriter.addNode(var12); // L: 1359
					return 1; // L: 1360
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1363
					var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2261, Client.packetWriter.isaacCipher); // L: 1365
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1366
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1367
					Client.packetWriter.addNode(var12); // L: 1368
					return 1; // L: 1369
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1372
						var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1373
						FloorDecoration.method2931(var10, var4); // L: 1374
						return 1; // L: 1375
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						VarcInt.Interpreter_intStackSize -= 3; // L: 1378
						var10 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 1379
						var16 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1380
						int var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 1381
						Widget var15 = CollisionMap.getWidget(var9); // L: 1382
						class13.clickWidget(var15, var10, var16); // L: 1383
						return 1; // L: 1384
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						VarcInt.Interpreter_intStackSize -= 2; // L: 1387
						var10 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 1388
						var16 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1389
						Widget var13 = var2 ? PlayerAppearance.field2561 : VarcInt.field3264; // L: 1390
						class13.clickWidget(var13, var10, var16); // L: 1391
						return 1; // L: 1392
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						UserComparator9.mouseCam = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 1395
						return 1; // L: 1396
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Timer.clientPreferences.roofsHidden ? 1 : 0; // L: 1399
						return 1; // L: 1400
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						Timer.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 1403
						GrandExchangeOffer.savePreferences(); // L: 1404
						return 1; // L: 1405
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1408
						boolean var8 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 1409
						AttackOption.openURL(var7, var8, false); // L: 1410
						return 1; // L: 1411
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1414
						var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher); // L: 1416
						var12.packetBuffer.writeShort(var10); // L: 1417
						Client.packetWriter.addNode(var12); // L: 1418
						return 1; // L: 1419
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1422
						Interpreter.Interpreter_stringStackSize -= 2; // L: 1423
						var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 1424
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 1425
						if (var4.length() > 500) { // L: 1426
							return 1;
						} else if (var5.length() > 500) { // L: 1427
							return 1;
						} else {
							PacketBufferNode var6 = ItemContainer.getPacketBufferNode(ClientPacket.field2270, Client.packetWriter.isaacCipher); // L: 1428
							var6.packetBuffer.writeShort(1 + FloorDecoration.stringCp1252NullTerminatedByteSize(var4) + FloorDecoration.stringCp1252NullTerminatedByteSize(var5)); // L: 1429
							var6.packetBuffer.writeByte(var10); // L: 1430
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1431
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1432
							Client.packetWriter.addNode(var6); // L: 1433
							return 1; // L: 1434
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 1437
						return 1; // L: 1438
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 1441
						return 1; // L: 1442
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 1445
						return 1; // L: 1446
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1) { // L: 1449
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1450
						}

						return 1; // L: 1451
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1) { // L: 1454
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1455
						}

						return 1; // L: 1456
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1) { // L: 1459
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1460
						}

						return 1; // L: 1461
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1) { // L: 1464
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1465
						}

						return 1; // L: 1466
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1469
						return 1; // L: 1470
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 1473
						return 1; // L: 1474
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 1477
						return 1; // L: 1478
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class25.setTapToDrop(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1); // L: 1481
						return 1; // L: 1482
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class3.getTapToDrop() ? 1 : 0; // L: 1485
						return 1; // L: 1486
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						VarcInt.Interpreter_intStackSize -= 2; // L: 1489
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 1490
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1491
						return 1; // L: 1492
					} else if (var0 == 3130) {
						VarcInt.Interpreter_intStackSize -= 2; // L: 1495
						return 1; // L: 1496
					} else if (var0 == 3131) {
						--VarcInt.Interpreter_intStackSize; // L: 1499
						return 1; // L: 1500
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = IgnoreList.canvasWidth; // L: 1503
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ModelData0.canvasHeight; // L: 1504
						return 1; // L: 1505
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--VarcInt.Interpreter_intStackSize; // L: 1508
						return 1; // L: 1509
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1512
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						VarcInt.Interpreter_intStackSize -= 2; // L: 1515
						return 1; // L: 1516
					} else if (var0 == 3136) {
						Client.field810 = 3; // L: 1519
						Client.field811 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1520
						return 1; // L: 1521
					} else if (var0 == 3137) {
						Client.field810 = 2; // L: 1524
						Client.field811 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1525
						return 1; // L: 1526
					} else if (var0 == 3138) {
						Client.field810 = 0; // L: 1529
						return 1; // L: 1530
					} else if (var0 == 3139) {
						Client.field810 = 1; // L: 1533
						return 1; // L: 1534
					} else if (var0 == 3140) {
						Client.field810 = 3; // L: 1537
						Client.field811 = var2 ? PlayerAppearance.field2561.id * -437932207 * 653064625 : VarcInt.field3264.id * -437932207 * 653064625; // L: 1538
						return 1; // L: 1539
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 1542
							Timer.clientPreferences.hideUsername = var11; // L: 1543
							GrandExchangeOffer.savePreferences(); // L: 1544
							return 1; // L: 1545
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Timer.clientPreferences.hideUsername ? 1 : 0; // L: 1548
							return 1; // L: 1549
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 1552
							Client.Login_isUsernameRemembered = var11; // L: 1553
							if (!var11) { // L: 1554
								Timer.clientPreferences.rememberedUsername = ""; // L: 1555
								GrandExchangeOffer.savePreferences(); // L: 1556
							}

							return 1; // L: 1558
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1561
							return 1; // L: 1562
						} else if (var0 == 3145) {
							return 1; // L: 1565
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var11 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 1568
							if (var11 == Timer.clientPreferences.titleMusicDisabled) { // L: 1569
								Timer.clientPreferences.titleMusicDisabled = !var11; // L: 1570
								GrandExchangeOffer.savePreferences(); // L: 1571
							}

							return 1; // L: 1573
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Timer.clientPreferences.titleMusicDisabled ? 0 : 1; // L: 1576
							return 1; // L: 1577
						} else if (var0 == 3148) {
							return 1; // L: 1580
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1583
							return 1; // L: 1584
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1587
							return 1; // L: 1588
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1591
							return 1; // L: 1592
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1595
							return 1; // L: 1596
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1599
							return 1; // L: 1600
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class13.method132(); // L: 1603
							return 1; // L: 1604
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize; // L: 1607
							return 1; // L: 1608
						} else if (var0 == 3156) {
							return 1; // L: 1611
						} else if (var0 == 3157) {
							VarcInt.Interpreter_intStackSize -= 2; // L: 1614
							return 1; // L: 1615
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1618
							return 1; // L: 1619
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1622
							return 1; // L: 1623
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1626
							return 1; // L: 1627
						} else if (var0 == 3161) {
							--VarcInt.Interpreter_intStackSize; // L: 1630
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1631
							return 1; // L: 1632
						} else if (var0 == 3162) {
							--VarcInt.Interpreter_intStackSize; // L: 1635
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1636
							return 1; // L: 1637
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize; // L: 1640
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1641
							return 1; // L: 1642
						} else if (var0 == 3164) {
							--VarcInt.Interpreter_intStackSize; // L: 1645
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1646
							return 1; // L: 1647
						} else if (var0 == 3165) {
							--VarcInt.Interpreter_intStackSize; // L: 1650
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1651
							return 1; // L: 1652
						} else if (var0 == 3166) {
							VarcInt.Interpreter_intStackSize -= 2; // L: 1655
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1656
							return 1; // L: 1657
						} else if (var0 == 3167) {
							VarcInt.Interpreter_intStackSize -= 2; // L: 1660
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1661
							return 1; // L: 1662
						} else if (var0 == 3168) {
							VarcInt.Interpreter_intStackSize -= 2; // L: 1665
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1666
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1667
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1668
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1669
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1670
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1671
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1672
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1673
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1674
							return 1; // L: 1675
						} else if (var0 == 3169) {
							return 1; // L: 1678
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1681
							return 1; // L: 1682
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1685
							return 1; // L: 1686
						} else if (var0 == 3172) {
							--VarcInt.Interpreter_intStackSize; // L: 1689
							return 1; // L: 1690
						} else if (var0 == 3173) {
							--VarcInt.Interpreter_intStackSize; // L: 1693
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1694
							return 1; // L: 1695
						} else if (var0 == 3174) {
							--VarcInt.Interpreter_intStackSize; // L: 1698
							return 1; // L: 1699
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1702
							return 1; // L: 1703
						} else if (var0 == 3176) {
							return 1; // L: 1706
						} else if (var0 == 3177) {
							return 1; // L: 1709
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_stringStackSize; // L: 1712
							return 1; // L: 1713
						} else if (var0 == 3179) {
							return 1; // L: 1716
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_stringStackSize; // L: 1719
							return 1; // L: 1720
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize], 0), 100); // L: 1723
							WorldMapSection1.method626((double)((float)var10 / 200.0F + 0.5F)); // L: 1724
							return 1; // L: 1725
						} else if (var0 == 3182) {
							float var3 = ((float)Timer.clientPreferences.field1057 - 0.5F) * 200.0F; // L: 1728
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 100 - Math.round(var3); // L: 1729
							return 1; // L: 1730
						} else {
							return 2; // L: 1732
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-1805385873"
	)
	static int method599(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3267
			VarcInt.Interpreter_intStackSize -= 2; // L: 3268
			Client.field896 = (short)HealthBarUpdate.method1823(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]); // L: 3269
			if (Client.field896 <= 0) { // L: 3270
				Client.field896 = 256;
			}

			Client.field897 = (short)HealthBarUpdate.method1823(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]); // L: 3271
			if (Client.field897 <= 0) { // L: 3272
				Client.field897 = 256;
			}

			return 1; // L: 3273
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3275
			VarcInt.Interpreter_intStackSize -= 2; // L: 3276
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3277
			if (Client.zoomHeight <= 0) { // L: 3278
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 3279
			if (Client.zoomWidth <= 0) { // L: 3280
				Client.zoomWidth = 320;
			}

			return 1; // L: 3281
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3283
			VarcInt.Interpreter_intStackSize -= 4; // L: 3284
			Client.field900 = (short)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3285
			if (Client.field900 <= 0) { // L: 3286
				Client.field900 = 1;
			}

			Client.field731 = (short)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 3287
			if (Client.field731 <= 0) { // L: 3288
				Client.field731 = 32767;
			} else if (Client.field731 < Client.field900) { // L: 3289
				Client.field731 = Client.field900;
			}

			Client.field828 = (short)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 3290
			if (Client.field828 <= 0) { // L: 3291
				Client.field828 = 1;
			}

			Client.field903 = (short)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3]; // L: 3292
			if (Client.field903 <= 0) { // L: 3293
				Client.field903 = 32767;
			} else if (Client.field903 < Client.field828) { // L: 3294
				Client.field903 = Client.field828;
			}

			return 1; // L: 3295
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3297
			if (Client.viewportWidget != null) { // L: 3298
				class25.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3299
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3300
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3301
			} else {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3304
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3305
			}

			return 1; // L: 3307
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3309
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3310
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3311
			return 1; // L: 3312
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3314
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = MouseHandler.method1156(Client.field896); // L: 3315
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = MouseHandler.method1156(Client.field897); // L: 3316
			return 1; // L: 3317
		} else if (var0 == 6220) { // L: 3319
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3320
			return 1; // L: 3321
		} else if (var0 == 6221) { // L: 3323
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3324
			return 1; // L: 3325
		} else if (var0 == 6222) { // L: 3327
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = IgnoreList.canvasWidth; // L: 3328
			return 1; // L: 3329
		} else if (var0 == 6223) { // L: 3331
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ModelData0.canvasHeight; // L: 3332
			return 1; // L: 3333
		} else {
			return 2; // L: 3335
		}
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V",
		garbageValue = "646312603"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		if (var0.field984 >= Client.cycle) { // L: 3878
			WorldMapManager.method672(var0);
		} else if (var0.field973 >= Client.cycle) { // L: 3879
			if (var0.field973 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > ParamDefinition.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 3880
				var2 = var0.field973 - var0.field984; // L: 3881
				var3 = Client.cycle - var0.field984; // L: 3882
				var4 = var0.field941 * 64 + var0.field981 * 128; // L: 3883
				int var5 = var0.field941 * 64 + var0.field982 * 128; // L: 3884
				int var6 = var0.field941 * 64 + var0.field958 * 128; // L: 3885
				int var7 = var0.field941 * 64 + var0.field956 * 128; // L: 3886
				var0.x = (var6 * var3 + var4 * (var2 - var3)) / var2; // L: 3887
				var0.y = (var3 * var7 + var5 * (var2 - var3)) / var2; // L: 3888
			}

			var0.field963 = 0; // L: 3890
			var0.orientation = var0.field986; // L: 3891
			var0.rotation = var0.orientation; // L: 3892
		} else {
			class51.method831(var0); // L: 3894
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 3895
			var0.sequence = -1; // L: 3896
			var0.spotAnimation = -1; // L: 3897
			var0.field984 = 0; // L: 3898
			var0.field973 = 0; // L: 3899
			var0.x = var0.pathX[0] * 128 + var0.field941 * 64; // L: 3900
			var0.y = var0.pathY[0] * 128 + var0.field941 * 64; // L: 3901
			var0.method1803(); // L: 3902
		}

		if (PlayerAppearance.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 3904 3905
			var0.sequence = -1; // L: 3906
			var0.spotAnimation = -1; // L: 3907
			var0.field984 = 0; // L: 3908
			var0.field973 = 0; // L: 3909
			var0.x = var0.pathX[0] * 128 + var0.field941 * 64; // L: 3910
			var0.y = var0.field941 * 64 + var0.pathY[0] * 128; // L: 3911
			var0.method1803(); // L: 3912
		}

		if (var0.field940 != 0) { // L: 3916
			if (var0.targetIndex != -1) { // L: 3917
				Object var8 = null; // L: 3918
				if (var0.targetIndex < 32768) { // L: 3919
					var8 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 3920
					var8 = Client.players[var0.targetIndex - 32768];
				}

				if (var8 != null) { // L: 3921
					var3 = var0.x - ((Actor)var8).x; // L: 3922
					var4 = var0.y - ((Actor)var8).y; // L: 3923
					if (var3 != 0 || var4 != 0) { // L: 3924
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 3926
					var0.targetIndex = -1; // L: 3927
					var0.false0 = false; // L: 3928
				}
			}

			if (var0.field959 != -1 && (var0.pathLength == 0 || var0.field963 > 0)) { // L: 3931
				var0.orientation = var0.field959; // L: 3932
				var0.field959 = -1; // L: 3933
			}

			var2 = var0.orientation - var0.rotation & 2047; // L: 3935
			if (var2 == 0 && var0.false0) { // L: 3936
				var0.targetIndex = -1; // L: 3937
				var0.false0 = false; // L: 3938
			}

			if (var2 != 0) { // L: 3940
				++var0.field954; // L: 3941
				boolean var10;
				if (var2 > 1024) { // L: 3942
					var0.rotation -= var0.field940; // L: 3943
					var10 = true; // L: 3944
					if (var2 < var0.field940 || var2 > 2048 - var0.field940) { // L: 3945
						var0.rotation = var0.orientation; // L: 3946
						var10 = false; // L: 3947
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field954 > 25 || var10)) { // L: 3949
						if (var0.turnLeftSequence != -1) { // L: 3950
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3951
						}
					}
				} else {
					var0.rotation += var0.field940; // L: 3955
					var10 = true; // L: 3956
					if (var2 < var0.field940 || var2 > 2048 - var0.field940) { // L: 3957
						var0.rotation = var0.orientation; // L: 3958
						var10 = false; // L: 3959
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field954 > 25 || var10)) { // L: 3961
						if (var0.turnRightSequence != -1) { // L: 3962
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3963
						}
					}
				}

				var0.rotation &= 2047; // L: 3967
			} else {
				var0.field954 = 0; // L: 3969
			}
		}

		TilePaint.method3154(var0); // L: 3971
	} // L: 3972

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "-1609914367"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 8510
			if (Client.menuOptionsCount < 500) { // L: 8511
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 8512
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 8513
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 8514
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 8515
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 8516
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 8517
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 8518
				++Client.menuOptionsCount; // L: 8519
			}

		}
	} // L: 8521
}
