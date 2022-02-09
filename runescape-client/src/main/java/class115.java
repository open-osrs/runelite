import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dt")
public class class115 {
	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class409 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("c")
	boolean field1434;
	@ObfuscatedName("l")
	boolean field1418;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	class114 field1422;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	class114 field1420;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Ldz;"
	)
	class111[] field1430;
	@ObfuscatedName("o")
	boolean field1421;
	@ObfuscatedName("i")
	float field1423;
	@ObfuscatedName("w")
	float field1424;
	@ObfuscatedName("v")
	float[] field1425;
	@ObfuscatedName("a")
	float[] field1426;
	@ObfuscatedName("y")
	boolean field1419;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 653716445
	)
	int field1428;
	@ObfuscatedName("h")
	float[] field1429;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1292100391
	)
	int field1417;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1964265085
	)
	int field1427;
	@ObfuscatedName("p")
	float field1431;
	@ObfuscatedName("n")
	float field1433;

	class115() {
		this.field1425 = new float[4]; // L: 16
		this.field1426 = new float[4]; // L: 17
		this.field1419 = true; // L: 18
		this.field1428 = 0; // L: 19
	} // L: 26

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)I",
		garbageValue = "-1427192972"
	)
	int method2619(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 29
		class334.method6128(var1.readUnsignedByte()); // L: 30
		int var5 = var1.readUnsignedByte(); // L: 32
		class114 var6 = (class114)class140.findEnumerated(UrlRequester.method2418(), var5); // L: 34
		if (var6 == null) { // L: 35
			var6 = class114.field1408;
		}

		this.field1422 = var6; // L: 38
		int var7 = var1.readUnsignedByte(); // L: 40
		class114 var8 = (class114)class140.findEnumerated(UrlRequester.method2418(), var7); // L: 42
		if (var8 == null) { // L: 43
			var8 = class114.field1408;
		}

		this.field1420 = var8; // L: 46
		this.field1434 = var1.readUnsignedByte() != 0; // L: 47
		this.field1430 = new class111[var3]; // L: 48
		class111 var11 = null; // L: 49

		int var9;
		for (var9 = 0; var9 < var3; ++var9) { // L: 50
			class111 var10 = new class111(); // L: 51
			var10.method2526(var1, var2); // L: 52
			this.field1430[var9] = var10; // L: 53
			if (var11 != null) { // L: 54
				var11.field1383 = var10; // L: 55
			}

			var11 = var10; // L: 57
		}

		this.field1417 = this.field1430[0].field1377; // L: 59
		this.field1427 = this.field1430[this.method2617() - 1].field1377; // L: 60
		this.field1429 = new float[this.method2622() + 1]; // L: 62

		for (var9 = this.method2612(); var9 <= this.method2613(); ++var9) { // L: 63
			this.field1429[var9 - this.method2612()] = class127.method2767(this, (float)var9); // L: 64
		}

		this.field1430 = null; // L: 66
		this.field1431 = class127.method2767(this, (float)(this.method2612() - 1)); // L: 68
		this.field1433 = class127.method2767(this, (float)(this.method2613() + 1)); // L: 69
		return var3; // L: 70
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "789038903"
	)
	public float method2611(int var1) {
		if (var1 < this.method2612()) { // L: 75
			return this.field1431; // L: 76
		} else {
			return var1 > this.method2613() ? this.field1433 : this.field1429[var1 - this.method2612()]; // L: 78 79 81
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1770559129"
	)
	int method2612() {
		return this.field1417; // L: 86
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1803710712"
	)
	int method2613() {
		return this.field1427; // L: 90
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2138979238"
	)
	int method2622() {
		return this.method2613() - this.method2612(); // L: 94
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(FB)I",
		garbageValue = "69"
	)
	int method2615(float var1) {
		if (this.field1428 < 0 || (float)this.field1430[this.field1428].field1377 > var1 || this.field1430[this.field1428].field1383 != null && (float)this.field1430[this.field1428].field1383.field1377 <= var1) { // L: 98
			if (var1 >= (float)this.method2612() && var1 <= (float)this.method2613()) { // L: 101
				int var2 = this.method2617(); // L: 104
				int var3 = this.field1428; // L: 105
				if (var2 > 0) { // L: 106
					int var4 = 0;
					int var5 = var2 - 1; // L: 108

					do {
						int var6 = var4 + var5 >> 1; // L: 110
						if (var1 < (float)this.field1430[var6].field1377) { // L: 111
							if (var1 > (float)this.field1430[var6 - 1].field1377) { // L: 112
								var3 = var6 - 1; // L: 113
								break;
							}

							var5 = var6 - 1; // L: 117
						} else {
							if (var1 <= (float)this.field1430[var6].field1377) { // L: 120
								var3 = var6; // L: 130
								break; // L: 131
							}

							if (var1 < (float)this.field1430[var6 + 1].field1377) { // L: 121
								var3 = var6; // L: 122
								break; // L: 123
							}

							var4 = var6 + 1; // L: 126
						}
					} while(var4 <= var5); // L: 133
				}

				if (var3 != this.field1428) { // L: 135
					this.field1428 = var3; // L: 136
					this.field1419 = true; // L: 137
				}

				return this.field1428; // L: 139
			} else {
				return -1; // L: 102
			}
		} else {
			return this.field1428; // L: 99
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(FI)Ldz;",
		garbageValue = "-1285668133"
	)
	class111 method2616(float var1) {
		int var2 = this.method2615(var1); // L: 143
		return var2 >= 0 && var2 < this.field1430.length ? this.field1430[var2] : null; // L: 144 145 148
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method2617() {
		return this.field1430 == null ? 0 : this.field1430.length; // L: 153 154
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldp;",
		garbageValue = "38"
	)
	static class121[] method2620() {
		return new class121[]{class121.field1483, class121.field1485, class121.field1481, class121.field1487, class121.field1480, class121.field1484, class121.field1479, class121.field1486, class121.field1482}; // L: 107
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-596145677"
	)
	public static void method2638(boolean var0) {
		if (var0 != MilliClock.ItemDefinition_inMembersWorld) { // L: 552
			ItemComposition.ItemDefinition_cached.clear(); // L: 554
			ItemComposition.ItemDefinition_cachedModels.clear(); // L: 555
			ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 556
			MilliClock.ItemDefinition_inMembersWorld = var0; // L: 558
		}

	} // L: 560

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "-1910308552"
	)
	static int method2637(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1409
			var7 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 1410
			LoginScreenAnimation.addGameMessage(0, "", var7); // L: 1411
			return 1; // L: 1412
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1415
			ItemContainer.performPlayerAnimation(WorldMapSprite.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1416
			return 1; // L: 1417
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field848) { // L: 1420
				Interpreter.field846 = true; // L: 1421
			}

			return 1; // L: 1423
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 1426
				var16 = 0; // L: 1427
				if (class117.isNumber(var7)) { // L: 1428
					var16 = UserComparator7.method2464(var7);
				}

				PacketBufferNode var14 = class135.getPacketBufferNode(ClientPacket.field2893, Client.packetWriter.isaacCipher); // L: 1430
				var14.packetBuffer.writeInt(var16); // L: 1431
				Client.packetWriter.addNode(var14); // L: 1432
				return 1; // L: 1433
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 1436
					var12 = class135.getPacketBufferNode(ClientPacket.field2894, Client.packetWriter.isaacCipher); // L: 1438
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1439
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1440
					Client.packetWriter.addNode(var12); // L: 1441
					return 1; // L: 1442
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 1445
					var12 = class135.getPacketBufferNode(ClientPacket.field2853, Client.packetWriter.isaacCipher); // L: 1447
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1448
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1449
					Client.packetWriter.addNode(var12); // L: 1450
					return 1; // L: 1451
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1454
						var4 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 1455
						ModelData0.method4274(var10, var4); // L: 1456
						return 1; // L: 1457
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3; // L: 1460
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1461
						var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1462
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1463
						Widget var15 = class130.getWidget(var9); // L: 1464
						class11.clickWidget(var15, var10, var16); // L: 1465
						return 1; // L: 1466
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1469
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1470
						var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1471
						Widget var13 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1472
						class11.clickWidget(var13, var10, var16); // L: 1473
						return 1; // L: 1474
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class370.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1477
						return 1; // L: 1478
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class424.clientPreferences.roofsHidden ? 1 : 0; // L: 1481
						return 1; // L: 1482
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class424.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1485
						GameEngine.savePreferences(); // L: 1486
						return 1; // L: 1487
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 1490
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1491
						MilliClock.openURL(var7, var8, false); // L: 1492
						return 1; // L: 1493
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1496
						var12 = class135.getPacketBufferNode(ClientPacket.field2906, Client.packetWriter.isaacCipher); // L: 1498
						var12.packetBuffer.writeShort(var10); // L: 1499
						Client.packetWriter.addNode(var12); // L: 1500
						return 1; // L: 1501
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1504
						BufferedNetSocket.Interpreter_stringStackSize -= 2; // L: 1505
						var4 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize]; // L: 1506
						String var5 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1]; // L: 1507
						if (var4.length() > 500) { // L: 1508
							return 1;
						} else if (var5.length() > 500) { // L: 1509
							return 1;
						} else {
							PacketBufferNode var6 = class135.getPacketBufferNode(ClientPacket.field2879, Client.packetWriter.isaacCipher); // L: 1510
							var6.packetBuffer.writeShort(1 + GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var4) + GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var5)); // L: 1511
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1512
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1513
							var6.packetBuffer.method7458(var10); // L: 1514
							Client.packetWriter.addNode(var6); // L: 1515
							return 1; // L: 1516
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1519
						return 1; // L: 1520
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1523
						return 1; // L: 1524
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1527
						return 1; // L: 1528
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1531
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1532
						}

						return 1; // L: 1533
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1536
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1537
						}

						return 1; // L: 1538
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1541
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1542
						}

						return 1; // L: 1543
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1546
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1547
						}

						return 1; // L: 1548
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1551
						return 1; // L: 1552
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1555
						return 1; // L: 1556
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1559
						return 1; // L: 1560
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						Archive.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1563
						return 1; // L: 1564
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class126.getTapToDrop() ? 1 : 0; // L: 1567
						return 1; // L: 1568
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1571
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1572
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1573
						return 1; // L: 1574
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1577
						return 1; // L: 1578
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize; // L: 1581
						return 1; // L: 1582
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = DirectByteArrayCopier.canvasWidth; // L: 1585
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = NPC.canvasHeight; // L: 1586
						return 1; // L: 1587
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize; // L: 1590
						return 1; // L: 1591
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1594
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1597
						return 1; // L: 1598
					} else if (var0 == 3136) {
						Client.field666 = 3; // L: 1601
						Client.field667 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1602
						return 1; // L: 1603
					} else if (var0 == 3137) {
						Client.field666 = 2; // L: 1606
						Client.field667 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1607
						return 1; // L: 1608
					} else if (var0 == 3138) {
						Client.field666 = 0; // L: 1611
						return 1; // L: 1612
					} else if (var0 == 3139) {
						Client.field666 = 1; // L: 1615
						return 1; // L: 1616
					} else if (var0 == 3140) {
						Client.field666 = 3; // L: 1619
						Client.field667 = var2 ? class16.scriptDotWidget.id * 98457465 * -180788535 : Interpreter.scriptActiveWidget.id * 98457465 * -180788535; // L: 1620
						return 1; // L: 1621
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1624
							class424.clientPreferences.hideUsername = var11; // L: 1625
							GameEngine.savePreferences(); // L: 1626
							return 1; // L: 1627
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class424.clientPreferences.hideUsername ? 1 : 0; // L: 1630
							return 1; // L: 1631
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1634
							Client.Login_isUsernameRemembered = var11; // L: 1635
							if (!var11) { // L: 1636
								class424.clientPreferences.rememberedUsername = ""; // L: 1637
								GameEngine.savePreferences(); // L: 1638
							}

							return 1; // L: 1640
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1643
							return 1; // L: 1644
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 1647
						} else if (var0 == 3146) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1650
							if (var11 == class424.clientPreferences.titleMusicDisabled) { // L: 1651
								class424.clientPreferences.titleMusicDisabled = !var11; // L: 1652
								GameEngine.savePreferences(); // L: 1653
							}

							return 1; // L: 1655
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class424.clientPreferences.titleMusicDisabled ? 0 : 1; // L: 1658
							return 1; // L: 1659
						} else if (var0 == 3148) {
							return 1; // L: 1662
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1665
							return 1; // L: 1666
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1669
							return 1; // L: 1670
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1673
							return 1; // L: 1674
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1677
							return 1; // L: 1678
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1681
							return 1; // L: 1682
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Actor.method2178(); // L: 1685
							return 1; // L: 1686
						} else if (var0 == 3155) {
							--BufferedNetSocket.Interpreter_stringStackSize; // L: 1689
							return 1; // L: 1690
						} else if (var0 == 3156) {
							return 1; // L: 1693
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1696
							return 1; // L: 1697
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1700
							return 1; // L: 1701
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1704
							return 1; // L: 1705
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1708
							return 1; // L: 1709
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize; // L: 1712
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1713
							return 1; // L: 1714
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize; // L: 1717
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1718
							return 1; // L: 1719
						} else if (var0 == 3163) {
							--BufferedNetSocket.Interpreter_stringStackSize; // L: 1722
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1723
							return 1; // L: 1724
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize; // L: 1727
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 1728
							return 1; // L: 1729
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize; // L: 1732
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1733
							return 1; // L: 1734
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1737
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1738
							return 1; // L: 1739
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1742
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1743
							return 1; // L: 1744
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1747
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 1748
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 1749
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 1750
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 1751
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 1752
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 1753
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 1754
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 1755
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 1756
							return 1; // L: 1757
						} else if (var0 == 3169) {
							return 1; // L: 1760
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1763
							return 1; // L: 1764
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1767
							return 1; // L: 1768
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize; // L: 1771
							return 1; // L: 1772
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize; // L: 1775
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1776
							return 1; // L: 1777
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize; // L: 1780
							return 1; // L: 1781
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1784
							return 1; // L: 1785
						} else if (var0 == 3176) {
							return 1; // L: 1788
						} else if (var0 == 3177) {
							return 1; // L: 1791
						} else if (var0 == 3178) {
							--BufferedNetSocket.Interpreter_stringStackSize; // L: 1794
							return 1; // L: 1795
						} else if (var0 == 3179) {
							return 1; // L: 1798
						} else if (var0 == 3180) {
							--BufferedNetSocket.Interpreter_stringStackSize; // L: 1801
							return 1; // L: 1802
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize], 0), 100); // L: 1805
							LoginType.method7149((double)((float)var10 / 200.0F + 0.5F)); // L: 1806
							return 1; // L: 1807
						} else if (var0 == 3182) {
							float var3 = ((float)class424.clientPreferences.brightness - 0.5F) * 200.0F; // L: 1810
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 100 - Math.round(var3); // L: 1811
							return 1; // L: 1812
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								BufferedNetSocket.Interpreter_stringStackSize -= 2; // L: 1819
								return 1; // L: 1820
							} else {
								return var0 == 3188 ? 1 : 2; // L: 1823 1825
							}
						} else {
							--Interpreter.Interpreter_intStackSize; // L: 1815
							return 1; // L: 1816
						}
					}
				}
			}
		}
	}
}
