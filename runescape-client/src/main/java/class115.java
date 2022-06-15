import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dc")
public class class115 {
	@ObfuscatedName("b")
	@Export("operatingSystemName")
	static String operatingSystemName;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -119583879
	)
	public final int field1448;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	public class115 field1440;
	@ObfuscatedName("q")
	float[][] field1435;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	final class387[] field1433;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	class387[] field1437;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	class387[] field1438;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	class387 field1449;
	@ObfuscatedName("w")
	boolean field1441;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	class387 field1434;
	@ObfuscatedName("i")
	boolean field1442;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	class387 field1443;
	@ObfuscatedName("t")
	float[][] field1444;
	@ObfuscatedName("z")
	float[][] field1439;
	@ObfuscatedName("r")
	float[][] field1446;

	@ObfuscatedSignature(
		descriptor = "(ILqt;Z)V"
	)
	public class115(int var1, Buffer var2, boolean var3) {
		this.field1449 = new class387(); // L: 13
		this.field1441 = true;
		this.field1434 = new class387();
		this.field1442 = true;
		this.field1443 = new class387(); // L: 17
		this.field1448 = var2.readShort(); // L: 23
		this.field1433 = new class387[var1]; // L: 24
		this.field1437 = new class387[this.field1433.length]; // L: 25
		this.field1438 = new class387[this.field1433.length]; // L: 26
		this.field1435 = new float[this.field1433.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1433.length; ++var4) { // L: 28
			this.field1433[var4] = new class387(var2, var3); // L: 29
			this.field1435[var4][0] = var2.method7740(); // L: 30
			this.field1435[var4][1] = var2.method7740(); // L: 31
			this.field1435[var4][2] = var2.method7740(); // L: 32
		}

		this.method2652(); // L: 34
	} // L: 35

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "654014719"
	)
	void method2652() {
		this.field1444 = new float[this.field1433.length][3]; // L: 38
		this.field1439 = new float[this.field1433.length][3]; // L: 39
		this.field1446 = new float[this.field1433.length][3]; // L: 40
		class387 var1 = MenuAction.method1884(); // L: 41

		for (int var2 = 0; var2 < this.field1433.length; ++var2) { // L: 42
			class387 var3 = this.method2653(var2); // L: 43
			var1.method6973(var3);
			var1.method6970();
			this.field1444[var2] = var1.method6959();
			this.field1439[var2][0] = var3.field4394[12];
			this.field1439[var2][1] = var3.field4394[13];
			this.field1439[var2][2] = var3.field4394[14];
			this.field1446[var2] = var3.method6992();
		}

		var1.method6968();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lny;",
		garbageValue = "1273342901"
	)
	class387 method2653(int var1) {
		return this.field1433[var1];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lny;",
		garbageValue = "437863053"
	)
	class387 method2658(int var1) {
		if (this.field1437[var1] == null) { // L: 60
			this.field1437[var1] = new class387(this.method2653(var1)); // L: 61
			if (this.field1440 != null) { // L: 62
				this.field1437[var1].method6962(this.field1440.method2658(var1)); // L: 63
			} else {
				this.field1437[var1].method6962(class387.field4397); // L: 66
			}
		}

		return this.field1437[var1]; // L: 69
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IS)Lny;",
		garbageValue = "-31759"
	)
	class387 method2655(int var1) {
		if (this.field1438[var1] == null) { // L: 73
			this.field1438[var1] = new class387(this.method2658(var1)); // L: 74
			this.field1438[var1].method6970(); // L: 75
		}

		return this.field1438[var1]; // L: 77
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)V",
		garbageValue = "1315349364"
	)
	void method2656(class387 var1) {
		this.field1449.method6973(var1); // L: 81
		this.field1441 = true; // L: 82
		this.field1442 = true; // L: 83
	} // L: 84

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lny;",
		garbageValue = "-1989832149"
	)
	class387 method2657() {
		return this.field1449; // L: 87
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Lny;",
		garbageValue = "240378906"
	)
	class387 method2681() {
		if (this.field1441) { // L: 91
			this.field1434.method6973(this.method2657()); // L: 92
			if (this.field1440 != null) { // L: 93
				this.field1434.method6962(this.field1440.method2681()); // L: 94
			}

			this.field1441 = false; // L: 96
		}

		return this.field1434; // L: 98
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lny;",
		garbageValue = "65631141"
	)
	public class387 method2651(int var1) {
		if (this.field1442) { // L: 102
			this.field1443.method6973(this.method2655(var1)); // L: 103
			this.field1443.method6962(this.method2681()); // L: 104
			this.field1442 = false; // L: 105
		}

		return this.field1443; // L: 107
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IS)[F",
		garbageValue = "180"
	)
	float[] method2660(int var1) {
		return this.field1444[var1]; // L: 111
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "379318512"
	)
	float[] method2661(int var1) {
		return this.field1439[var1]; // L: 115
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1659744707"
	)
	float[] method2679(int var1) {
		return this.field1446[var1]; // L: 119
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "-27"
	)
	public static final synchronized long method2692() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class268.field3170) { // L: 15
			class393.field4425 += class268.field3170 - var0; // L: 16
		}

		class268.field3170 = var0; // L: 18
		return class393.field4425 + var0; // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-71"
	)
	public static void method2693(boolean var0) {
		if (NetCache.NetCache_socket != null) {
			try {
				Buffer var1 = new Buffer(4);
				var1.writeByte(var0 ? 2 : 3); // L: 47
				var1.writeMedium(0);
				NetCache.NetCache_socket.write(var1.array, 0, 4);
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var3) {
				}

				++NetCache.NetCache_ioExceptions; // L: 56
				NetCache.NetCache_socket = null; // L: 57
			}

		}
	} // L: 59

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;I)Z",
		garbageValue = "609480846"
	)
	public static boolean method2691(AbstractArchive var0, AbstractArchive var1) {
		class121.WorldMapElement_archive = var1; // L: 44
		if (!var0.isFullyLoaded()) { // L: 45
			return false; // L: 46
		} else {
			WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35); // L: 48
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 49

			for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 50
				byte[] var3 = var0.takeFile(35, var2); // L: 51
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2); // L: 52
				if (var3 != null) { // L: 53
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3)); // L: 54
					WorldMapElement.WorldMapElement_cached[var2].method3377(); // L: 55
				}
			}

			return true; // L: 58
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "-298256181"
	)
	static int method2682(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1480
			var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1481
			class290.addGameMessage(0, "", var7); // L: 1482
			return 1; // L: 1483
		} else if (var0 == ScriptOpcodes.ANIM) {
			class446.Interpreter_intStackSize -= 2; // L: 1486
			class65.performPlayerAnimation(class101.localPlayer, Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]); // L: 1487
			return 1; // L: 1488
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field842) { // L: 1491
				Interpreter.field829 = true; // L: 1492
			}

			return 1; // L: 1494
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1497
				var15 = 0; // L: 1498
				if (class114.isNumber(var7)) { // L: 1499
					var15 = FaceNormal.method4344(var7);
				}

				PacketBufferNode var13 = EnumComposition.getPacketBufferNode(ClientPacket.field2946, Client.packetWriter.isaacCipher); // L: 1501
				var13.packetBuffer.writeInt(var15); // L: 1502
				Client.packetWriter.addNode(var13); // L: 1503
				return 1; // L: 1504
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1507
					var11 = EnumComposition.getPacketBufferNode(ClientPacket.field2928, Client.packetWriter.isaacCipher); // L: 1509
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1510
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1511
					Client.packetWriter.addNode(var11); // L: 1512
					return 1; // L: 1513
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1516
					var11 = EnumComposition.getPacketBufferNode(ClientPacket.field2985, Client.packetWriter.isaacCipher); // L: 1518
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1519
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1520
					Client.packetWriter.addNode(var11); // L: 1521
					return 1; // L: 1522
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1525
						var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1526
						Coord.method5549(var10, var4); // L: 1527
						return 1; // L: 1528
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class446.Interpreter_intStackSize -= 3; // L: 1531
						var10 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 1532
						var15 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 1533
						int var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 1534
						Widget var14 = class140.getWidget(var9); // L: 1535
						class161.clickWidget(var14, var10, var15); // L: 1536
						return 1; // L: 1537
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class446.Interpreter_intStackSize -= 2; // L: 1540
						var10 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 1541
						var15 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 1542
						Widget var12 = var2 ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget; // L: 1543
						class161.clickWidget(var12, var10, var15); // L: 1544
						return 1; // L: 1545
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class122.mouseCam = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 1548
						return 1; // L: 1549
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class19.clientPreferences.method2245() ? 1 : 0; // L: 1552
						return 1; // L: 1553
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class19.clientPreferences.method2339(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1); // L: 1556
						return 1; // L: 1557
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1560
						boolean var8 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 1561
						class258.openURL(var7, var8, false); // L: 1562
						return 1; // L: 1563
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1566
						var11 = EnumComposition.getPacketBufferNode(ClientPacket.field2927, Client.packetWriter.isaacCipher); // L: 1568
						var11.packetBuffer.writeShort(var10); // L: 1569
						Client.packetWriter.addNode(var11); // L: 1570
						return 1; // L: 1571
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1574
						Interpreter.Interpreter_stringStackSize -= 2; // L: 1575
						var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 1576
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 1577
						if (var4.length() > 500) { // L: 1578
							return 1;
						} else if (var5.length() > 500) { // L: 1579
							return 1;
						} else {
							PacketBufferNode var6 = EnumComposition.getPacketBufferNode(ClientPacket.field2951, Client.packetWriter.isaacCipher); // L: 1580
							var6.packetBuffer.writeShort(1 + ScriptEvent.stringCp1252NullTerminatedByteSize(var4) + ScriptEvent.stringCp1252NullTerminatedByteSize(var5)); // L: 1581
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1582
							var6.packetBuffer.method7762(var10); // L: 1583
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1584
							Client.packetWriter.addNode(var6); // L: 1585
							return 1; // L: 1586
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 1589
						return 1; // L: 1590
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 1593
						return 1; // L: 1594
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 1597
						return 1; // L: 1598
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1) { // L: 1601
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1602
						}

						return 1; // L: 1603
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1) { // L: 1606
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1607
						}

						return 1; // L: 1608
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1) { // L: 1611
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1612
						}

						return 1; // L: 1613
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1) { // L: 1616
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1617
						}

						return 1; // L: 1618
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1621
						return 1; // L: 1622
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 1625
						return 1; // L: 1626
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 1629
						return 1; // L: 1630
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class9.setTapToDrop(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1); // L: 1633
						return 1; // L: 1634
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = HorizontalAlignment.getTapToDrop() ? 1 : 0; // L: 1637
						return 1; // L: 1638
					} else if (var0 == 3129) {
						class446.Interpreter_intStackSize -= 2; // L: 1641
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 1642
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 1643
						return 1; // L: 1644
					} else if (var0 == 3130) {
						class446.Interpreter_intStackSize -= 2; // L: 1647
						return 1; // L: 1648
					} else if (var0 == 3131) {
						--class446.Interpreter_intStackSize; // L: 1651
						return 1; // L: 1652
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Script.canvasWidth; // L: 1655
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class78.canvasHeight; // L: 1656
						return 1; // L: 1657
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class446.Interpreter_intStackSize; // L: 1660
						return 1; // L: 1661
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1664
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class446.Interpreter_intStackSize -= 2; // L: 1667
						return 1; // L: 1668
					} else if (var0 == 3136) {
						Client.field656 = 3; // L: 1671
						Client.field657 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1672
						return 1; // L: 1673
					} else if (var0 == 3137) {
						Client.field656 = 2; // L: 1676
						Client.field657 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1677
						return 1; // L: 1678
					} else if (var0 == 3138) {
						Client.field656 = 0; // L: 1681
						return 1; // L: 1682
					} else if (var0 == 3139) {
						Client.field656 = 1; // L: 1685
						return 1; // L: 1686
					} else if (var0 == 3140) {
						Client.field656 = 3; // L: 1689
						Client.field657 = var2 ? class124.scriptDotWidget.id * -1598663557 * -1038587213 : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget.id * -1598663557 * -1038587213; // L: 1690
						return 1; // L: 1691
					} else {
						boolean var3;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 1694
							class19.clientPreferences.method2246(var3); // L: 1695
							return 1; // L: 1696
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class19.clientPreferences.method2247() ? 1 : 0; // L: 1699
							return 1; // L: 1700
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 1703
							Client.Login_isUsernameRemembered = var3; // L: 1704
							if (!var3) { // L: 1705
								class19.clientPreferences.method2260(""); // L: 1706
							}

							return 1; // L: 1708
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1711
							return 1; // L: 1712
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 1715
						} else if (var0 == 3146) {
							var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 1718
							class19.clientPreferences.method2248(!var3); // L: 1719
							return 1; // L: 1720
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class19.clientPreferences.method2317() ? 0 : 1; // L: 1723
							return 1; // L: 1724
						} else if (var0 == 3148) {
							return 1; // L: 1727
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1730
							return 1; // L: 1731
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1734
							return 1; // L: 1735
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1738
							return 1; // L: 1739
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1742
							return 1; // L: 1743
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1746
							return 1; // L: 1747
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class117.method2719(); // L: 1750
							return 1; // L: 1751
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize; // L: 1754
							return 1; // L: 1755
						} else if (var0 == 3156) {
							return 1; // L: 1758
						} else if (var0 == 3157) {
							class446.Interpreter_intStackSize -= 2; // L: 1761
							return 1; // L: 1762
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1765
							return 1; // L: 1766
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1769
							return 1; // L: 1770
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1773
							return 1; // L: 1774
						} else if (var0 == 3161) {
							--class446.Interpreter_intStackSize; // L: 1777
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1778
							return 1; // L: 1779
						} else if (var0 == 3162) {
							--class446.Interpreter_intStackSize; // L: 1782
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1783
							return 1; // L: 1784
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize; // L: 1787
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1788
							return 1; // L: 1789
						} else if (var0 == 3164) {
							--class446.Interpreter_intStackSize; // L: 1792
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1793
							return 1; // L: 1794
						} else if (var0 == 3165) {
							--class446.Interpreter_intStackSize; // L: 1797
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1798
							return 1; // L: 1799
						} else if (var0 == 3166) {
							class446.Interpreter_intStackSize -= 2; // L: 1802
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1803
							return 1; // L: 1804
						} else if (var0 == 3167) {
							class446.Interpreter_intStackSize -= 2; // L: 1807
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1808
							return 1; // L: 1809
						} else if (var0 == 3168) {
							class446.Interpreter_intStackSize -= 2; // L: 1812
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1813
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1814
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1815
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1816
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1817
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1818
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1819
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1820
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1821
							return 1; // L: 1822
						} else if (var0 == 3169) {
							return 1; // L: 1825
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1828
							return 1; // L: 1829
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1832
							return 1; // L: 1833
						} else if (var0 == 3172) {
							--class446.Interpreter_intStackSize; // L: 1836
							return 1; // L: 1837
						} else if (var0 == 3173) {
							--class446.Interpreter_intStackSize; // L: 1840
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1841
							return 1; // L: 1842
						} else if (var0 == 3174) {
							--class446.Interpreter_intStackSize; // L: 1845
							return 1; // L: 1846
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 1849
							return 1; // L: 1850
						} else if (var0 == 3176) {
							return 1; // L: 1853
						} else if (var0 == 3177) {
							return 1; // L: 1856
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_stringStackSize; // L: 1859
							return 1; // L: 1860
						} else if (var0 == 3179) {
							return 1; // L: 1863
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_stringStackSize; // L: 1866
							return 1; // L: 1867
						} else if (var0 == 3181) {
							WorldMapEvent.method5120(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 1870
							return 1; // L: 1871
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class193.method3919(); // L: 1874
							return 1; // L: 1875
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								Interpreter.Interpreter_stringStackSize -= 2; // L: 1882
								return 1; // L: 1883
							} else {
								return var0 == 3188 ? 1 : 2; // L: 1886 1888
							}
						} else {
							--class446.Interpreter_intStackSize; // L: 1878
							return 1; // L: 1879
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "990148531"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3915
			class19.clientPreferences.method2339(!class19.clientPreferences.method2245()); // L: 3916
			if (class19.clientPreferences.method2245()) { // L: 3917
				class290.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3918
			} else {
				class290.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3921
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3924
			class19.clientPreferences.method2251();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3925
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 3926
		}

		if (Client.staffModLevel >= 2) { // L: 3927
			if (var0.equalsIgnoreCase("errortest")) { // L: 3928
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3929
				class121.worldMap.showCoord = !class121.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3930
				class19.clientPreferences.method2250(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3931
				class19.clientPreferences.method2250(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3932
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3933
				class131.method2877();
			}
		}

		PacketBufferNode var1 = EnumComposition.getPacketBufferNode(ClientPacket.field3013, Client.packetWriter.isaacCipher); // L: 3936
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3937
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3938
		Client.packetWriter.addNode(var1); // L: 3939
	} // L: 3940
}
