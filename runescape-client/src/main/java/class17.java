import java.io.File;
import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("w")
class class17 implements SSLSession {
	@ObfuscatedName("o")
	@Export("FileSystem_cacheDir")
	public static File FileSystem_cacheDir;
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lc;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lc;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 131
	}

	public int getApplicationBufferSize() {
		return 0; // L: 134
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 139
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 144
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 149
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 154
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 164
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 219
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 174
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 184
	}

	public int getPeerPort() {
		return 0; // L: 189
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 194
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 199
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 224
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field65; // L: 179
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 159
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 209
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 234
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 229
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 204
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 169
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 214
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "912175547"
	)
	static int method259(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1470
			var7 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 1471
			Login.addGameMessage(0, "", var7); // L: 1472
			return 1; // L: 1473
		} else if (var0 == ScriptOpcodes.ANIM) {
			class295.Interpreter_intStackSize -= 2; // L: 1476
			KeyHandler.performPlayerAnimation(class19.localPlayer, Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]); // L: 1477
			return 1; // L: 1478
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field838) { // L: 1481
				Interpreter.field837 = true; // L: 1482
			}

			return 1; // L: 1484
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 1487
				var15 = 0; // L: 1488
				if (class20.isNumber(var7)) { // L: 1489
					var15 = class16.method217(var7);
				}

				PacketBufferNode var13 = ItemContainer.getPacketBufferNode(ClientPacket.field2939, Client.packetWriter.isaacCipher); // L: 1491
				var13.packetBuffer.writeInt(var15); // L: 1492
				Client.packetWriter.addNode(var13); // L: 1493
				return 1; // L: 1494
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 1497
					var11 = ItemContainer.getPacketBufferNode(ClientPacket.field2910, Client.packetWriter.isaacCipher); // L: 1499
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1500
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1501
					Client.packetWriter.addNode(var11); // L: 1502
					return 1; // L: 1503
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 1506
					var11 = ItemContainer.getPacketBufferNode(ClientPacket.field2998, Client.packetWriter.isaacCipher); // L: 1508
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1509
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1510
					Client.packetWriter.addNode(var11); // L: 1511
					return 1; // L: 1512
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1515
						var4 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 1516
						VertexNormal.method4497(var10, var4); // L: 1517
						return 1; // L: 1518
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class295.Interpreter_intStackSize -= 3; // L: 1521
						var10 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 1522
						var15 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 1523
						int var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 1524
						Widget var14 = HorizontalAlignment.getWidget(var9); // L: 1525
						PcmPlayer.clickWidget(var14, var10, var15); // L: 1526
						return 1; // L: 1527
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class295.Interpreter_intStackSize -= 2; // L: 1530
						var10 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 1531
						var15 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 1532
						Widget var12 = var2 ? class432.scriptDotWidget : class341.scriptActiveWidget; // L: 1533
						PcmPlayer.clickWidget(var12, var10, var15); // L: 1534
						return 1; // L: 1535
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						UserComparator5.mouseCam = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 1538
						return 1; // L: 1539
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Interpreter.clientPreferences.method2255() ? 1 : 0; // L: 1542
						return 1; // L: 1543
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						Interpreter.clientPreferences.method2254(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1); // L: 1546
						return 1; // L: 1547
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 1550
						boolean var8 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 1551
						class11.openURL(var7, var8, false); // L: 1552
						return 1; // L: 1553
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1556
						var11 = ItemContainer.getPacketBufferNode(ClientPacket.field2962, Client.packetWriter.isaacCipher); // L: 1558
						var11.packetBuffer.writeShort(var10); // L: 1559
						Client.packetWriter.addNode(var11); // L: 1560
						return 1; // L: 1561
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1564
						ChatChannel.Interpreter_stringStackSize -= 2; // L: 1565
						var4 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize]; // L: 1566
						String var5 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1]; // L: 1567
						if (var4.length() > 500) { // L: 1568
							return 1;
						} else if (var5.length() > 500) { // L: 1569
							return 1;
						} else {
							PacketBufferNode var6 = ItemContainer.getPacketBufferNode(ClientPacket.field2956, Client.packetWriter.isaacCipher); // L: 1570
							var6.packetBuffer.writeShort(1 + ItemLayer.stringCp1252NullTerminatedByteSize(var4) + ItemLayer.stringCp1252NullTerminatedByteSize(var5)); // L: 1571
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1572
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1573
							var6.packetBuffer.method7788(var10); // L: 1574
							Client.packetWriter.addNode(var6); // L: 1575
							return 1; // L: 1576
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 1579
						return 1; // L: 1580
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 1583
						return 1; // L: 1584
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 1587
						return 1; // L: 1588
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1) { // L: 1591
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1592
						}

						return 1; // L: 1593
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1) { // L: 1596
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1597
						}

						return 1; // L: 1598
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1) { // L: 1601
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1602
						}

						return 1; // L: 1603
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1) { // L: 1606
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1607
						}

						return 1; // L: 1608
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1611
						return 1; // L: 1612
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 1615
						return 1; // L: 1616
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 1619
						return 1; // L: 1620
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						SpriteMask.setTapToDrop(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1); // L: 1623
						return 1; // L: 1624
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = TextureProvider.getTapToDrop() ? 1 : 0; // L: 1627
						return 1; // L: 1628
					} else if (var0 == 3129) {
						class295.Interpreter_intStackSize -= 2; // L: 1631
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 1632
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 1633
						return 1; // L: 1634
					} else if (var0 == 3130) {
						class295.Interpreter_intStackSize -= 2; // L: 1637
						return 1; // L: 1638
					} else if (var0 == 3131) {
						--class295.Interpreter_intStackSize; // L: 1641
						return 1; // L: 1642
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class4.canvasWidth; // L: 1645
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class309.canvasHeight; // L: 1646
						return 1; // L: 1647
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class295.Interpreter_intStackSize; // L: 1650
						return 1; // L: 1651
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1654
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class295.Interpreter_intStackSize -= 2; // L: 1657
						return 1; // L: 1658
					} else if (var0 == 3136) {
						Client.field652 = 3; // L: 1661
						Client.field653 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1662
						return 1; // L: 1663
					} else if (var0 == 3137) {
						Client.field652 = 2; // L: 1666
						Client.field653 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1667
						return 1; // L: 1668
					} else if (var0 == 3138) {
						Client.field652 = 0; // L: 1671
						return 1; // L: 1672
					} else if (var0 == 3139) {
						Client.field652 = 1; // L: 1675
						return 1; // L: 1676
					} else if (var0 == 3140) {
						Client.field652 = 3; // L: 1679
						Client.field653 = var2 ? class432.scriptDotWidget.id * 2073510769 * -769712751 : class341.scriptActiveWidget.id * 2073510769 * -769712751; // L: 1680
						return 1; // L: 1681
					} else {
						boolean var3;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 1684
							Interpreter.clientPreferences.method2256(var3); // L: 1685
							return 1; // L: 1686
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Interpreter.clientPreferences.method2257() ? 1 : 0; // L: 1689
							return 1; // L: 1690
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 1693
							Client.Login_isUsernameRemembered = var3; // L: 1694
							if (!var3) { // L: 1695
								Interpreter.clientPreferences.method2316(""); // L: 1696
							}

							return 1; // L: 1698
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1701
							return 1; // L: 1702
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 1705
						} else if (var0 == 3146) {
							var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 1708
							Interpreter.clientPreferences.method2258(!var3); // L: 1709
							return 1; // L: 1710
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Interpreter.clientPreferences.method2259() ? 0 : 1; // L: 1713
							return 1; // L: 1714
						} else if (var0 == 3148) {
							return 1; // L: 1717
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1720
							return 1; // L: 1721
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1724
							return 1; // L: 1725
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1728
							return 1; // L: 1729
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1732
							return 1; // L: 1733
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1736
							return 1; // L: 1737
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = InterfaceParent.method2103(); // L: 1740
							return 1; // L: 1741
						} else if (var0 == 3155) {
							--ChatChannel.Interpreter_stringStackSize; // L: 1744
							return 1; // L: 1745
						} else if (var0 == 3156) {
							return 1; // L: 1748
						} else if (var0 == 3157) {
							class295.Interpreter_intStackSize -= 2; // L: 1751
							return 1; // L: 1752
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1755
							return 1; // L: 1756
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1759
							return 1; // L: 1760
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1763
							return 1; // L: 1764
						} else if (var0 == 3161) {
							--class295.Interpreter_intStackSize; // L: 1767
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1768
							return 1; // L: 1769
						} else if (var0 == 3162) {
							--class295.Interpreter_intStackSize; // L: 1772
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1773
							return 1; // L: 1774
						} else if (var0 == 3163) {
							--ChatChannel.Interpreter_stringStackSize; // L: 1777
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1778
							return 1; // L: 1779
						} else if (var0 == 3164) {
							--class295.Interpreter_intStackSize; // L: 1782
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 1783
							return 1; // L: 1784
						} else if (var0 == 3165) {
							--class295.Interpreter_intStackSize; // L: 1787
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1788
							return 1; // L: 1789
						} else if (var0 == 3166) {
							class295.Interpreter_intStackSize -= 2; // L: 1792
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1793
							return 1; // L: 1794
						} else if (var0 == 3167) {
							class295.Interpreter_intStackSize -= 2; // L: 1797
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1798
							return 1; // L: 1799
						} else if (var0 == 3168) {
							class295.Interpreter_intStackSize -= 2; // L: 1802
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 1803
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 1804
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 1805
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 1806
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 1807
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 1808
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 1809
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 1810
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 1811
							return 1; // L: 1812
						} else if (var0 == 3169) {
							return 1; // L: 1815
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1818
							return 1; // L: 1819
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1822
							return 1; // L: 1823
						} else if (var0 == 3172) {
							--class295.Interpreter_intStackSize; // L: 1826
							return 1; // L: 1827
						} else if (var0 == 3173) {
							--class295.Interpreter_intStackSize; // L: 1830
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1831
							return 1; // L: 1832
						} else if (var0 == 3174) {
							--class295.Interpreter_intStackSize; // L: 1835
							return 1; // L: 1836
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 1839
							return 1; // L: 1840
						} else if (var0 == 3176) {
							return 1; // L: 1843
						} else if (var0 == 3177) {
							return 1; // L: 1846
						} else if (var0 == 3178) {
							--ChatChannel.Interpreter_stringStackSize; // L: 1849
							return 1; // L: 1850
						} else if (var0 == 3179) {
							return 1; // L: 1853
						} else if (var0 == 3180) {
							--ChatChannel.Interpreter_stringStackSize; // L: 1856
							return 1; // L: 1857
						} else if (var0 == 3181) {
							WorldMapSection0.method4940(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1860
							return 1; // L: 1861
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = ViewportMouse.method4492(); // L: 1864
							return 1; // L: 1865
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								ChatChannel.Interpreter_stringStackSize -= 2; // L: 1872
								return 1; // L: 1873
							} else {
								return var0 == 3188 ? 1 : 2; // L: 1876 1878
							}
						} else {
							--class295.Interpreter_intStackSize; // L: 1868
							return 1; // L: 1869
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-1840232783"
	)
	static int method280(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 3039
			class295.Interpreter_intStackSize -= 2; // L: 3040
			var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3041
			var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3042
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 + var4; // L: 3043
			return 1; // L: 3044
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3046
			class295.Interpreter_intStackSize -= 2; // L: 3047
			var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3048
			var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3049
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 - var4; // L: 3050
			return 1; // L: 3051
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3053
			class295.Interpreter_intStackSize -= 2; // L: 3054
			var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3055
			var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3056
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 * var4; // L: 3057
			return 1; // L: 3058
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3060
			class295.Interpreter_intStackSize -= 2; // L: 3061
			var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3062
			var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3063
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 / var4; // L: 3064
			return 1; // L: 3065
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3067
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3068
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 3069
			return 1; // L: 3070
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3072
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3073
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 3074
			return 1; // L: 3075
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3077
				class295.Interpreter_intStackSize -= 5; // L: 3078
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3079
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3080
				var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 3081
				var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3]; // L: 3082
				var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 4]; // L: 3083
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5); // L: 3084
				return 1; // L: 3085
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3087
				class295.Interpreter_intStackSize -= 2; // L: 3088
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3089
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3090
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100; // L: 3091
				return 1; // L: 3092
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3094
				class295.Interpreter_intStackSize -= 2; // L: 3095
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3096
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3097
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 3098
				return 1; // L: 3099
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3101
				class295.Interpreter_intStackSize -= 2; // L: 3102
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3103
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3104
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 3105
				return 1; // L: 3106
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3108
				class295.Interpreter_intStackSize -= 2; // L: 3109
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3110
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3111
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 3112
				return 1; // L: 3113
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3115
				class295.Interpreter_intStackSize -= 2; // L: 3116
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3117
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3118
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 % var4; // L: 3119
				return 1; // L: 3120
			} else if (var0 == ScriptOpcodes.POW) { // L: 3122
				class295.Interpreter_intStackSize -= 2; // L: 3123
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3124
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3125
				if (var3 == 0) { // L: 3126
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 3127
				}

				return 1; // L: 3128
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3130
				class295.Interpreter_intStackSize -= 2; // L: 3131
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3132
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3133
				if (var3 == 0) { // L: 3134
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3135
					return 1; // L: 3136
				} else {
					switch(var4) { // L: 3138
					case 0:
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3156
						break; // L: 3157
					case 1:
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3; // L: 3166
						break;
					case 2:
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 3146
						break; // L: 3147
					case 3:
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 3151
						break; // L: 3152
					case 4:
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 3161
						break; // L: 3162
					default:
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 3141
					}

					return 1; // L: 3170
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3172
				class295.Interpreter_intStackSize -= 2; // L: 3173
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3174
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3175
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 & var4; // L: 3176
				return 1; // L: 3177
			} else if (var0 == ScriptOpcodes.OR) { // L: 3179
				class295.Interpreter_intStackSize -= 2; // L: 3180
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3181
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3182
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 | var4; // L: 3183
				return 1; // L: 3184
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3186
				class295.Interpreter_intStackSize -= 3; // L: 3187
				long var9 = (long)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3188
				long var11 = (long)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3189
				long var13 = (long)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 3190
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11); // L: 3191
				return 1; // L: 3192
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3194
				var3 = class263.method5208(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 3195
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3; // L: 3196
				return 1; // L: 3197
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3199
				class295.Interpreter_intStackSize -= 2; // L: 3200
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3201
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3202
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 3203
				return 1; // L: 3204
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3206
				class295.Interpreter_intStackSize -= 3; // L: 3207
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3208
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3209
				var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 3210
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = NetSocket.method3271(var3, var4, var5); // L: 3211
				return 1; // L: 3212
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3214
				class295.Interpreter_intStackSize -= 3; // L: 3215
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3216
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3217
				var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 3218
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class425.method7636(var3, var4, var5); // L: 3219
				return 1; // L: 3220
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3222
				class295.Interpreter_intStackSize -= 3; // L: 3223
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3224
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3225
				var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 3226
				var6 = 31 - var5; // L: 3227
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4; // L: 3228
				return 1; // L: 3229
			} else if (var0 == 4030) { // L: 3231
				class295.Interpreter_intStackSize -= 4; // L: 3232
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3233
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3234
				var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 3235
				var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3]; // L: 3236
				var3 = class425.method7636(var3, var5, var6); // L: 3237
				var7 = class260.method5203(var6 - var5 + 1); // L: 3238
				if (var4 > var7) { // L: 3239
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 3240
				return 1; // L: 3241
			} else if (var0 == 4032) { // L: 3243
				Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1] = class18.method282(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1]); // L: 3244
				return 1; // L: 3245
			} else if (var0 == 4033) { // L: 3247
				Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1] = class127.method2831(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1]); // L: 3248
				return 1; // L: 3249
			} else if (var0 == 4034) { // L: 3251
				class295.Interpreter_intStackSize -= 2; // L: 3252
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3253
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3254
				var5 = class392.method7190(var3, var4); // L: 3255
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var5; // L: 3256
				return 1; // L: 3257
			} else if (var0 == 4035) { // L: 3259
				Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1]); // L: 3260
				return 1; // L: 3261
			} else {
				return 2; // L: 3263
			}
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-28885"
	)
	static void method228() {
		PacketBufferNode var0 = ItemContainer.getPacketBufferNode(ClientPacket.field2986, Client.packetWriter.isaacCipher); // L: 3938
		var0.packetBuffer.writeByte(ReflectionCheck.getWindowedMode()); // L: 3939
		var0.packetBuffer.writeShort(class4.canvasWidth); // L: 3940
		var0.packetBuffer.writeShort(class309.canvasHeight); // L: 3941
		Client.packetWriter.addNode(var0); // L: 3942
	} // L: 3943
}
