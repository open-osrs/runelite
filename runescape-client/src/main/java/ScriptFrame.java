import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -17818799
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("s")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("a")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Lfw;",
		garbageValue = "-39610559"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 57
		if (var1 != null) { // L: 58
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 59
			var1 = new NPCComposition(); // L: 60
			var1.id = var0; // L: 61
			if (var2 != null) { // L: 62
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 63
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 64
			return var1; // L: 65
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "77"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1571821946"
	)
	public static void method1117() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 117
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 118
	} // L: 119

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "1762076085"
	)
	static int method1118(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1412
			var7 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 1413
			class397.addGameMessage(0, "", var7); // L: 1414
			return 1; // L: 1415
		} else if (var0 == ScriptOpcodes.ANIM) {
			class14.Interpreter_intStackSize -= 2; // L: 1418
			FaceNormal.performPlayerAnimation(HealthBarDefinition.localPlayer, Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]); // L: 1419
			return 1; // L: 1420
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field791) { // L: 1423
				Interpreter.field795 = true; // L: 1424
			}

			return 1; // L: 1426
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 1429
				var16 = 0; // L: 1430
				if (class129.isNumber(var7)) { // L: 1431
					var16 = TaskHandler.method2881(var7);
				}

				PacketBufferNode var14 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2754, Client.packetWriter.isaacCipher); // L: 1433
				var14.packetBuffer.writeInt(var16); // L: 1434
				Client.packetWriter.addNode(var14); // L: 1435
				return 1; // L: 1436
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 1439
					var12 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2764, Client.packetWriter.isaacCipher); // L: 1441
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1442
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1443
					Client.packetWriter.addNode(var12); // L: 1444
					return 1; // L: 1445
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 1448
					var12 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2707, Client.packetWriter.isaacCipher); // L: 1450
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1451
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1452
					Client.packetWriter.addNode(var12); // L: 1453
					return 1; // L: 1454
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1457
						var4 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 1458
						AbstractByteArrayCopier.method5169(var10, var4); // L: 1459
						return 1; // L: 1460
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class14.Interpreter_intStackSize -= 3; // L: 1463
						var10 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 1464
						var16 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 1465
						int var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 1466
						Widget var15 = UserComparator9.getWidget(var9); // L: 1467
						UserComparator6.clickWidget(var15, var10, var16); // L: 1468
						return 1; // L: 1469
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class14.Interpreter_intStackSize -= 2; // L: 1472
						var10 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 1473
						var16 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 1474
						Widget var13 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget; // L: 1475
						UserComparator6.clickWidget(var13, var10, var16); // L: 1476
						return 1; // L: 1477
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						ApproximateRouteStrategy.mouseCam = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 1480
						return 1; // L: 1481
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class408.clientPreferences.roofsHidden ? 1 : 0; // L: 1484
						return 1; // L: 1485
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class408.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 1488
						Login.savePreferences(); // L: 1489
						return 1; // L: 1490
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 1493
						boolean var8 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 1494
						class91.openURL(var7, var8, false); // L: 1495
						return 1; // L: 1496
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1499
						var12 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2685, Client.packetWriter.isaacCipher); // L: 1501
						var12.packetBuffer.writeShort(var10); // L: 1502
						Client.packetWriter.addNode(var12); // L: 1503
						return 1; // L: 1504
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1507
						class295.Interpreter_stringStackSize -= 2; // L: 1508
						var4 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize]; // L: 1509
						String var5 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize + 1]; // L: 1510
						if (var4.length() > 500) { // L: 1511
							return 1;
						} else if (var5.length() > 500) { // L: 1512
							return 1;
						} else {
							PacketBufferNode var6 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2724, Client.packetWriter.isaacCipher); // L: 1513
							var6.packetBuffer.writeShort(1 + Client.stringCp1252NullTerminatedByteSize(var4) + Client.stringCp1252NullTerminatedByteSize(var5)); // L: 1514
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1515
							var6.packetBuffer.writeByte(var10); // L: 1516
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1517
							Client.packetWriter.addNode(var6); // L: 1518
							return 1; // L: 1519
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 1522
						return 1; // L: 1523
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 1526
						return 1; // L: 1527
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 1530
						return 1; // L: 1531
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1) { // L: 1534
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1535
						}

						return 1; // L: 1536
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1) { // L: 1539
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1540
						}

						return 1; // L: 1541
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1) { // L: 1544
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1545
						}

						return 1; // L: 1546
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1) { // L: 1549
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1550
						}

						return 1; // L: 1551
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1554
						return 1; // L: 1555
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 1558
						return 1; // L: 1559
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 1562
						return 1; // L: 1563
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						Messages.setTapToDrop(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1); // L: 1566
						return 1; // L: 1567
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Decimator.getTapToDrop() ? 1 : 0; // L: 1570
						return 1; // L: 1571
					} else if (var0 == 3129) {
						class14.Interpreter_intStackSize -= 2; // L: 1574
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 1575
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 1576
						return 1; // L: 1577
					} else if (var0 == 3130) {
						class14.Interpreter_intStackSize -= 2; // L: 1580
						return 1; // L: 1581
					} else if (var0 == 3131) {
						--class14.Interpreter_intStackSize; // L: 1584
						return 1; // L: 1585
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 1588
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = KeyHandler.canvasHeight; // L: 1589
						return 1; // L: 1590
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class14.Interpreter_intStackSize; // L: 1593
						return 1; // L: 1594
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1597
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class14.Interpreter_intStackSize -= 2; // L: 1600
						return 1; // L: 1601
					} else if (var0 == 3136) {
						Client.field479 = 3; // L: 1604
						Client.field633 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1605
						return 1; // L: 1606
					} else if (var0 == 3137) {
						Client.field479 = 2; // L: 1609
						Client.field633 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1610
						return 1; // L: 1611
					} else if (var0 == 3138) {
						Client.field479 = 0; // L: 1614
						return 1; // L: 1615
					} else if (var0 == 3139) {
						Client.field479 = 1; // L: 1618
						return 1; // L: 1619
					} else if (var0 == 3140) {
						Client.field479 = 3; // L: 1622
						Client.field633 = var2 ? class120.scriptDotWidget.id * 851670683 * -830177389 : Frames.scriptActiveWidget.id * 851670683 * -830177389; // L: 1623
						return 1; // L: 1624
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 1627
							class408.clientPreferences.hideUsername = var11; // L: 1628
							Login.savePreferences(); // L: 1629
							return 1; // L: 1630
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class408.clientPreferences.hideUsername ? 1 : 0; // L: 1633
							return 1; // L: 1634
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 1637
							Client.Login_isUsernameRemembered = var11; // L: 1638
							if (!var11) { // L: 1639
								class408.clientPreferences.rememberedUsername = ""; // L: 1640
								Login.savePreferences(); // L: 1641
							}

							return 1; // L: 1643
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1646
							return 1; // L: 1647
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 1650
						} else if (var0 == 3146) {
							var11 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 1653
							if (var11 == class408.clientPreferences.titleMusicDisabled) { // L: 1654
								class408.clientPreferences.titleMusicDisabled = !var11; // L: 1655
								Login.savePreferences(); // L: 1656
							}

							return 1; // L: 1658
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class408.clientPreferences.titleMusicDisabled ? 0 : 1; // L: 1661
							return 1; // L: 1662
						} else if (var0 == 3148) {
							return 1; // L: 1665
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1668
							return 1; // L: 1669
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1672
							return 1; // L: 1673
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1676
							return 1; // L: 1677
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1680
							return 1; // L: 1681
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1684
							return 1; // L: 1685
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class87.method2224(); // L: 1688
							return 1; // L: 1689
						} else if (var0 == 3155) {
							--class295.Interpreter_stringStackSize; // L: 1692
							return 1; // L: 1693
						} else if (var0 == 3156) {
							return 1; // L: 1696
						} else if (var0 == 3157) {
							class14.Interpreter_intStackSize -= 2; // L: 1699
							return 1; // L: 1700
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1703
							return 1; // L: 1704
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1707
							return 1; // L: 1708
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1711
							return 1; // L: 1712
						} else if (var0 == 3161) {
							--class14.Interpreter_intStackSize; // L: 1715
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1716
							return 1; // L: 1717
						} else if (var0 == 3162) {
							--class14.Interpreter_intStackSize; // L: 1720
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1721
							return 1; // L: 1722
						} else if (var0 == 3163) {
							--class295.Interpreter_stringStackSize; // L: 1725
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1726
							return 1; // L: 1727
						} else if (var0 == 3164) {
							--class14.Interpreter_intStackSize; // L: 1730
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 1731
							return 1; // L: 1732
						} else if (var0 == 3165) {
							--class14.Interpreter_intStackSize; // L: 1735
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1736
							return 1; // L: 1737
						} else if (var0 == 3166) {
							class14.Interpreter_intStackSize -= 2; // L: 1740
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1741
							return 1; // L: 1742
						} else if (var0 == 3167) {
							class14.Interpreter_intStackSize -= 2; // L: 1745
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1746
							return 1; // L: 1747
						} else if (var0 == 3168) {
							class14.Interpreter_intStackSize -= 2; // L: 1750
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 1751
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 1752
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 1753
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 1754
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 1755
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 1756
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 1757
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 1758
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 1759
							return 1; // L: 1760
						} else if (var0 == 3169) {
							return 1; // L: 1763
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1766
							return 1; // L: 1767
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1770
							return 1; // L: 1771
						} else if (var0 == 3172) {
							--class14.Interpreter_intStackSize; // L: 1774
							return 1; // L: 1775
						} else if (var0 == 3173) {
							--class14.Interpreter_intStackSize; // L: 1778
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1779
							return 1; // L: 1780
						} else if (var0 == 3174) {
							--class14.Interpreter_intStackSize; // L: 1783
							return 1; // L: 1784
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1787
							return 1; // L: 1788
						} else if (var0 == 3176) {
							return 1; // L: 1791
						} else if (var0 == 3177) {
							return 1; // L: 1794
						} else if (var0 == 3178) {
							--class295.Interpreter_stringStackSize; // L: 1797
							return 1; // L: 1798
						} else if (var0 == 3179) {
							return 1; // L: 1801
						} else if (var0 == 3180) {
							--class295.Interpreter_stringStackSize; // L: 1804
							return 1; // L: 1805
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize], 0), 100); // L: 1808
							class354.method6396((double)((float)var10 / 200.0F + 0.5F)); // L: 1809
							return 1; // L: 1810
						} else if (var0 == 3182) {
							float var3 = ((float)class408.clientPreferences.brightness - 0.5F) * 200.0F; // L: 1813
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 100 - Math.round(var3); // L: 1814
							return 1; // L: 1815
						} else if (var0 != 3183 && var0 != 3184) {
							return 2; // L: 1821
						} else {
							--class14.Interpreter_intStackSize; // L: 1818
							return 1; // L: 1819
						}
					}
				}
			}
		}
	}
}
