import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bm")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 393913769
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 992153197
	)
	@Export("type")
	int type;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 849198695
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2111003401
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1849101915
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1844772961
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1649346091
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1098148309
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLgx;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = class114.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2208 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (this.sequenceDefinition == var10.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 39
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 40
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 41
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method3729()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhv;",
		garbageValue = "-238822980"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) { // L: 51
			int var1 = Client.cycle - this.cycleStart; // L: 52
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 53
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method3729(); // L: 68
				this.frame += var1; // L: 69
				var1 = 0; // L: 70
				if (this.frame >= var2) { // L: 71
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) { // L: 73
						this.sequenceDefinition = null; // L: 74
					}
				}
			} else {
				label81: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 55
								break label81;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 56
							++this.frame; // L: 57
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 58

						this.frame -= this.sequenceDefinition.frameCount; // L: 59
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 60

					this.sequenceDefinition = null; // L: 61
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = class82.getObjectDefinition(this.id); // L: 80
		if (var12.transforms != null) { // L: 81
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 82
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 85
				var2 = var12.sizeX; // L: 90
				var3 = var12.sizeY; // L: 91
			} else {
				var2 = var12.sizeY; // L: 86
				var3 = var12.sizeX; // L: 87
			}

			int var4 = (var2 >> 1) + this.x; // L: 93
			int var5 = (var2 + 1 >> 1) + this.x; // L: 94
			int var6 = (var3 >> 1) + this.y; // L: 95
			int var7 = (var3 + 1 >> 1) + this.y; // L: 96
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 97
			int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1327477180"
	)
	public static int method1957(int var0, int var1, int var2) {
		int var3 = class147.method3000(var2 - var1 + 1); // L: 62
		var3 <<= var1; // L: 63
		return var0 & ~var3; // L: 64
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "2018004509"
	)
	static int method1963(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1470
			var7 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 1471
			WorldMapEvent.addGameMessage(0, "", var7); // L: 1472
			return 1; // L: 1473
		} else if (var0 == ScriptOpcodes.ANIM) {
			class12.Interpreter_intStackSize -= 2; // L: 1476
			JagexCache.performPlayerAnimation(ModelData0.localPlayer, Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]); // L: 1477
			return 1; // L: 1478
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field833) { // L: 1481
				Interpreter.field835 = true; // L: 1482
			}

			return 1; // L: 1484
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 1487
				var15 = 0; // L: 1488
				if (NetFileRequest.isNumber(var7)) { // L: 1489
					var15 = class92.method2373(var7);
				}

				PacketBufferNode var13 = WallDecoration.getPacketBufferNode(ClientPacket.field2972, Client.packetWriter.isaacCipher); // L: 1491
				var13.packetBuffer.writeInt(var15); // L: 1492
				Client.packetWriter.addNode(var13); // L: 1493
				return 1; // L: 1494
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 1497
					var11 = WallDecoration.getPacketBufferNode(ClientPacket.field3048, Client.packetWriter.isaacCipher); // L: 1499
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1500
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1501
					Client.packetWriter.addNode(var11); // L: 1502
					return 1; // L: 1503
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 1506
					var11 = WallDecoration.getPacketBufferNode(ClientPacket.field3033, Client.packetWriter.isaacCipher); // L: 1508
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1509
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1510
					Client.packetWriter.addNode(var11); // L: 1511
					return 1; // L: 1512
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1515
						var4 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 1516
						method1964(var10, var4); // L: 1517
						return 1; // L: 1518
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class12.Interpreter_intStackSize -= 3; // L: 1521
						var10 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 1522
						var15 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 1523
						int var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 1524
						Widget var14 = class92.getWidget(var9); // L: 1525
						class10.clickWidget(var14, var10, var15); // L: 1526
						return 1; // L: 1527
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class12.Interpreter_intStackSize -= 2; // L: 1530
						var10 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 1531
						var15 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 1532
						Widget var12 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget; // L: 1533
						class10.clickWidget(var12, var10, var15); // L: 1534
						return 1; // L: 1535
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						Login.mouseCam = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 1538
						return 1; // L: 1539
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class12.clientPreferences.method2222() ? 1 : 0; // L: 1542
						return 1; // L: 1543
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class12.clientPreferences.method2219(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1); // L: 1546
						return 1; // L: 1547
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 1550
						boolean var8 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 1551
						ScriptEvent.openURL(var7, var8, false); // L: 1552
						return 1; // L: 1553
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1556
						var11 = WallDecoration.getPacketBufferNode(ClientPacket.field3017, Client.packetWriter.isaacCipher); // L: 1558
						var11.packetBuffer.writeShort(var10); // L: 1559
						Client.packetWriter.addNode(var11); // L: 1560
						return 1; // L: 1561
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1564
						class9.Interpreter_stringStackSize -= 2; // L: 1565
						var4 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize]; // L: 1566
						String var5 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize + 1]; // L: 1567
						if (var4.length() > 500) { // L: 1568
							return 1;
						} else if (var5.length() > 500) { // L: 1569
							return 1;
						} else {
							PacketBufferNode var6 = WallDecoration.getPacketBufferNode(ClientPacket.field3044, Client.packetWriter.isaacCipher); // L: 1570
							var6.packetBuffer.writeShort(1 + class392.stringCp1252NullTerminatedByteSize(var4) + class392.stringCp1252NullTerminatedByteSize(var5)); // L: 1571
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1572
							var6.packetBuffer.method7687(var10); // L: 1573
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1574
							Client.packetWriter.addNode(var6); // L: 1575
							return 1; // L: 1576
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 1579
						return 1; // L: 1580
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 1583
						return 1; // L: 1584
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 1587
						return 1; // L: 1588
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1) { // L: 1591
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1592
						}

						return 1; // L: 1593
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1) { // L: 1596
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1597
						}

						return 1; // L: 1598
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1) { // L: 1601
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1602
						}

						return 1; // L: 1603
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1) { // L: 1606
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1607
						}

						return 1; // L: 1608
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1611
						return 1; // L: 1612
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 1615
						return 1; // L: 1616
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 1619
						return 1; // L: 1620
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class33.setTapToDrop(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1); // L: 1623
						return 1; // L: 1624
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = WallDecoration.getTapToDrop() ? 1 : 0; // L: 1627
						return 1; // L: 1628
					} else if (var0 == 3129) {
						class12.Interpreter_intStackSize -= 2; // L: 1631
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 1632
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 1633
						return 1; // L: 1634
					} else if (var0 == 3130) {
						class12.Interpreter_intStackSize -= 2; // L: 1637
						return 1; // L: 1638
					} else if (var0 == 3131) {
						--class12.Interpreter_intStackSize; // L: 1641
						return 1; // L: 1642
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = GraphicsObject.canvasWidth; // L: 1645
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class433.canvasHeight; // L: 1646
						return 1; // L: 1647
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class12.Interpreter_intStackSize; // L: 1650
						return 1; // L: 1651
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1654
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class12.Interpreter_intStackSize -= 2; // L: 1657
						return 1; // L: 1658
					} else if (var0 == 3136) {
						Client.field487 = 3; // L: 1661
						Client.field657 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1662
						return 1; // L: 1663
					} else if (var0 == 3137) {
						Client.field487 = 2; // L: 1666
						Client.field657 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1667
						return 1; // L: 1668
					} else if (var0 == 3138) {
						Client.field487 = 0; // L: 1671
						return 1; // L: 1672
					} else if (var0 == 3139) {
						Client.field487 = 1; // L: 1675
						return 1; // L: 1676
					} else if (var0 == 3140) {
						Client.field487 = 3; // L: 1679
						Client.field657 = var2 ? Interpreter.scriptDotWidget.id * 1115174973 * -203153643 : KeyHandler.scriptActiveWidget.id * 1115174973 * -203153643; // L: 1680
						return 1; // L: 1681
					} else {
						boolean var3;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 1684
							class12.clientPreferences.method2223(var3); // L: 1685
							return 1; // L: 1686
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class12.clientPreferences.method2257() ? 1 : 0; // L: 1689
							return 1; // L: 1690
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 1693
							Client.Login_isUsernameRemembered = var3; // L: 1694
							if (!var3) { // L: 1695
								class12.clientPreferences.method2297(""); // L: 1696
							}

							return 1; // L: 1698
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1701
							return 1; // L: 1702
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 1705
						} else if (var0 == 3146) {
							var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 1708
							class12.clientPreferences.method2305(!var3); // L: 1709
							return 1; // L: 1710
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class12.clientPreferences.method2226() ? 0 : 1; // L: 1713
							return 1; // L: 1714
						} else if (var0 == 3148) {
							return 1; // L: 1717
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1720
							return 1; // L: 1721
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1724
							return 1; // L: 1725
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1728
							return 1; // L: 1729
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1732
							return 1; // L: 1733
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1736
							return 1; // L: 1737
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class136.method2868(); // L: 1740
							return 1; // L: 1741
						} else if (var0 == 3155) {
							--class9.Interpreter_stringStackSize; // L: 1744
							return 1; // L: 1745
						} else if (var0 == 3156) {
							return 1; // L: 1748
						} else if (var0 == 3157) {
							class12.Interpreter_intStackSize -= 2; // L: 1751
							return 1; // L: 1752
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1755
							return 1; // L: 1756
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1759
							return 1; // L: 1760
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1763
							return 1; // L: 1764
						} else if (var0 == 3161) {
							--class12.Interpreter_intStackSize; // L: 1767
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1768
							return 1; // L: 1769
						} else if (var0 == 3162) {
							--class12.Interpreter_intStackSize; // L: 1772
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1773
							return 1; // L: 1774
						} else if (var0 == 3163) {
							--class9.Interpreter_stringStackSize; // L: 1777
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1778
							return 1; // L: 1779
						} else if (var0 == 3164) {
							--class12.Interpreter_intStackSize; // L: 1782
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 1783
							return 1; // L: 1784
						} else if (var0 == 3165) {
							--class12.Interpreter_intStackSize; // L: 1787
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1788
							return 1; // L: 1789
						} else if (var0 == 3166) {
							class12.Interpreter_intStackSize -= 2; // L: 1792
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1793
							return 1; // L: 1794
						} else if (var0 == 3167) {
							class12.Interpreter_intStackSize -= 2; // L: 1797
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1798
							return 1; // L: 1799
						} else if (var0 == 3168) {
							class12.Interpreter_intStackSize -= 2; // L: 1802
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 1803
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 1804
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 1805
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 1806
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 1807
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 1808
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 1809
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 1810
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 1811
							return 1; // L: 1812
						} else if (var0 == 3169) {
							return 1; // L: 1815
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1818
							return 1; // L: 1819
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1822
							return 1; // L: 1823
						} else if (var0 == 3172) {
							--class12.Interpreter_intStackSize; // L: 1826
							return 1; // L: 1827
						} else if (var0 == 3173) {
							--class12.Interpreter_intStackSize; // L: 1830
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1831
							return 1; // L: 1832
						} else if (var0 == 3174) {
							--class12.Interpreter_intStackSize; // L: 1835
							return 1; // L: 1836
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1839
							return 1; // L: 1840
						} else if (var0 == 3176) {
							return 1; // L: 1843
						} else if (var0 == 3177) {
							return 1; // L: 1846
						} else if (var0 == 3178) {
							--class9.Interpreter_stringStackSize; // L: 1849
							return 1; // L: 1850
						} else if (var0 == 3179) {
							return 1; // L: 1853
						} else if (var0 == 3180) {
							--class9.Interpreter_stringStackSize; // L: 1856
							return 1; // L: 1857
						} else if (var0 == 3181) {
							World.method1664(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1860
							return 1; // L: 1861
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = GameBuild.method5586(); // L: 1864
							return 1; // L: 1865
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								class9.Interpreter_stringStackSize -= 2; // L: 1872
								return 1; // L: 1873
							} else {
								return var0 == 3188 ? 1 : 2; // L: 1876 1878
							}
						} else {
							--class12.Interpreter_intStackSize; // L: 1868
							return 1; // L: 1869
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "424896925"
	)
	static void method1964(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9727
		int[] var3 = Players.Players_indices; // L: 9728
		boolean var4 = false; // L: 9729
		Username var5 = new Username(var1, class391.loginType); // L: 9730

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9731
			Player var7 = Client.players[var3[var6]]; // L: 9732
			if (var7 != null && var7 != ModelData0.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9733
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9734
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2965, Client.packetWriter.isaacCipher); // L: 9736
					var8.packetBuffer.writeShort(var3[var6]); // L: 9737
					var8.packetBuffer.method7687(0); // L: 9738
					Client.packetWriter.addNode(var8); // L: 9739
				} else if (var0 == 4) { // L: 9741
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2962, Client.packetWriter.isaacCipher); // L: 9743
					var8.packetBuffer.writeByte(0); // L: 9744
					var8.packetBuffer.method7641(var3[var6]); // L: 9745
					Client.packetWriter.addNode(var8); // L: 9746
				} else if (var0 == 6) { // L: 9748
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2969, Client.packetWriter.isaacCipher); // L: 9750
					var8.packetBuffer.method7641(var3[var6]); // L: 9751
					var8.packetBuffer.method7687(0); // L: 9752
					Client.packetWriter.addNode(var8); // L: 9753
				} else if (var0 == 7) { // L: 9755
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher); // L: 9757
					var8.packetBuffer.method7596(0); // L: 9758
					var8.packetBuffer.method7641(var3[var6]); // L: 9759
					Client.packetWriter.addNode(var8); // L: 9760
				}

				var4 = true; // L: 9762
				break;
			}
		}

		if (!var4) { // L: 9766
			WorldMapEvent.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9767
}
