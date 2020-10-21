import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("f")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	public static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("b")
	@Export("DAYS_OF_THE_WEEK")
	public static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("l")
	@Export("Calendar_calendar")
	public static java.util.Calendar Calendar_calendar;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}}; // L: 7
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // L: 17
		java.util.Calendar.getInstance(); // L: 21
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT")); // L: 22
	} // L: 23

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-63"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 7947
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 7948
			Client.mouseCrossX = var6; // L: 7974
			Client.mouseCrossY = var7; // L: 7975
			Client.mouseCrossColor = 2; // L: 7976
			Client.mouseCrossState = 0; // L: 7977
			Client.destinationX = var0; // L: 7978
			Client.destinationY = var1; // L: 7979
			var8 = class4.getPacketBufferNode(ClientPacket.field2293, Client.packetWriter.isaacCipher); // L: 7981
			var8.packetBuffer.method5674(var0 + FloorDecoration.baseX); // L: 7982
			var8.packetBuffer.method5684(SpotAnimationDefinition.selectedItemWidget); // L: 7983
			var8.packetBuffer.method5673(Entity.selectedItemId); // L: 7984
			var8.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7985
			var8.packetBuffer.writeShortLE(InvDefinition.selectedItemSlot); // L: 7986
			var8.packetBuffer.method5674(var3); // L: 7987
			var8.packetBuffer.writeShortLE(WorldMapData_0.baseY + var1); // L: 7988
			Client.packetWriter.addNode(var8); // L: 7989
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 8711
			Client.mouseCrossY = var7; // L: 8712
			Client.mouseCrossColor = 2; // L: 8713
			Client.mouseCrossState = 0; // L: 8714
			Client.destinationX = var0; // L: 8715
			Client.destinationY = var1; // L: 8716
			var8 = class4.getPacketBufferNode(ClientPacket.field2282, Client.packetWriter.isaacCipher); // L: 8718
			var8.packetBuffer.writeShort(WorldMapData_0.baseY + var1); // L: 8719
			var8.packetBuffer.method5683(class307.selectedSpellWidget); // L: 8720
			var8.packetBuffer.method5674(Client.selectedSpellChildIndex); // L: 8721
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8722
			var8.packetBuffer.writeShort(var0 + FloorDecoration.baseX); // L: 8723
			var8.packetBuffer.method5674(var3); // L: 8724
			Client.packetWriter.addNode(var8); // L: 8725
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 8403
			Client.mouseCrossY = var7; // L: 8404
			Client.mouseCrossColor = 2; // L: 8405
			Client.mouseCrossState = 0; // L: 8406
			Client.destinationX = var0; // L: 8407
			Client.destinationY = var1; // L: 8408
			var8 = class4.getPacketBufferNode(ClientPacket.field2249, Client.packetWriter.isaacCipher); // L: 8410
			var8.packetBuffer.method5673(var0 + FloorDecoration.baseX); // L: 8411
			var8.packetBuffer.method5674(var3); // L: 8412
			var8.packetBuffer.writeShort(WorldMapData_0.baseY + var1); // L: 8413
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8414
			Client.packetWriter.addNode(var8); // L: 8415
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 8179
			Client.mouseCrossY = var7; // L: 8180
			Client.mouseCrossColor = 2; // L: 8181
			Client.mouseCrossState = 0; // L: 8182
			Client.destinationX = var0; // L: 8183
			Client.destinationY = var1; // L: 8184
			var8 = class4.getPacketBufferNode(ClientPacket.field2301, Client.packetWriter.isaacCipher); // L: 8186
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8187
			var8.packetBuffer.writeShortLE(var0 + FloorDecoration.baseX); // L: 8188
			var8.packetBuffer.method5674(var3); // L: 8189
			var8.packetBuffer.writeShort(WorldMapData_0.baseY + var1); // L: 8190
			Client.packetWriter.addNode(var8); // L: 8191
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 8197
			Client.mouseCrossY = var7; // L: 8198
			Client.mouseCrossColor = 2; // L: 8199
			Client.mouseCrossState = 0; // L: 8200
			Client.destinationX = var0; // L: 8201
			Client.destinationY = var1; // L: 8202
			var8 = class4.getPacketBufferNode(ClientPacket.field2306, Client.packetWriter.isaacCipher); // L: 8204
			var8.packetBuffer.method5674(var0 + FloorDecoration.baseX); // L: 8205
			var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8206
			var8.packetBuffer.writeShort(WorldMapData_0.baseY + var1); // L: 8207
			var8.packetBuffer.method5674(var3); // L: 8208
			Client.packetWriter.addNode(var8); // L: 8209
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 8122
			Client.mouseCrossY = var7; // L: 8123
			Client.mouseCrossColor = 2; // L: 8124
			Client.mouseCrossState = 0; // L: 8125
			Client.destinationX = var0; // L: 8126
			Client.destinationY = var1; // L: 8127
			var8 = class4.getPacketBufferNode(ClientPacket.field2265, Client.packetWriter.isaacCipher); // L: 8129
			var8.packetBuffer.method5674(WorldMapData_0.baseY + var1); // L: 8130
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8131
			var8.packetBuffer.method5674(var3); // L: 8132
			var8.packetBuffer.method5674(var0 + FloorDecoration.baseX); // L: 8133
			Client.packetWriter.addNode(var8); // L: 8134
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 8073
				if (var13 != null) { // L: 8074
					Client.mouseCrossX = var6; // L: 8075
					Client.mouseCrossY = var7; // L: 8076
					Client.mouseCrossColor = 2; // L: 8077
					Client.mouseCrossState = 0; // L: 8078
					Client.destinationX = var0; // L: 8079
					Client.destinationY = var1; // L: 8080
					var9 = class4.getPacketBufferNode(ClientPacket.field2332, Client.packetWriter.isaacCipher); // L: 8082
					var9.packetBuffer.writeInt(SpotAnimationDefinition.selectedItemWidget); // L: 8083
					var9.packetBuffer.writeShort(var3); // L: 8084
					var9.packetBuffer.writeShortLE(InvDefinition.selectedItemSlot); // L: 8085
					var9.packetBuffer.writeShort(Entity.selectedItemId); // L: 8086
					var9.packetBuffer.method5665(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8087
					Client.packetWriter.addNode(var9); // L: 8088
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 8591
				if (var13 != null) { // L: 8592
					Client.mouseCrossX = var6; // L: 8593
					Client.mouseCrossY = var7; // L: 8594
					Client.mouseCrossColor = 2; // L: 8595
					Client.mouseCrossState = 0; // L: 8596
					Client.destinationX = var0; // L: 8597
					Client.destinationY = var1; // L: 8598
					var9 = class4.getPacketBufferNode(ClientPacket.field2304, Client.packetWriter.isaacCipher); // L: 8600
					var9.packetBuffer.method5673(Client.selectedSpellChildIndex); // L: 8601
					var9.packetBuffer.writeShortLE(var3); // L: 8602
					var9.packetBuffer.method5665(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8603
					var9.packetBuffer.method5684(class307.selectedSpellWidget); // L: 8604
					Client.packetWriter.addNode(var9); // L: 8605
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 8500
				if (var13 != null) { // L: 8501
					Client.mouseCrossX = var6; // L: 8502
					Client.mouseCrossY = var7; // L: 8503
					Client.mouseCrossColor = 2; // L: 8504
					Client.mouseCrossState = 0; // L: 8505
					Client.destinationX = var0; // L: 8506
					Client.destinationY = var1; // L: 8507
					var9 = class4.getPacketBufferNode(ClientPacket.field2264, Client.packetWriter.isaacCipher); // L: 8509
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8510
					var9.packetBuffer.method5674(var3); // L: 8511
					Client.packetWriter.addNode(var9); // L: 8512
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 8376
				if (var13 != null) { // L: 8377
					Client.mouseCrossX = var6; // L: 8378
					Client.mouseCrossY = var7; // L: 8379
					Client.mouseCrossColor = 2; // L: 8380
					Client.mouseCrossState = 0; // L: 8381
					Client.destinationX = var0; // L: 8382
					Client.destinationY = var1; // L: 8383
					var9 = class4.getPacketBufferNode(ClientPacket.field2325, Client.packetWriter.isaacCipher); // L: 8385
					var9.packetBuffer.writeShortLE(var3); // L: 8386
					var9.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8387
					Client.packetWriter.addNode(var9); // L: 8388
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 8624
				if (var13 != null) { // L: 8625
					Client.mouseCrossX = var6; // L: 8626
					Client.mouseCrossY = var7; // L: 8627
					Client.mouseCrossColor = 2; // L: 8628
					Client.mouseCrossState = 0; // L: 8629
					Client.destinationX = var0; // L: 8630
					Client.destinationY = var1; // L: 8631
					var9 = class4.getPacketBufferNode(ClientPacket.field2290, Client.packetWriter.isaacCipher); // L: 8633
					var9.packetBuffer.writeShort(var3); // L: 8634
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8635
					Client.packetWriter.addNode(var9); // L: 8636
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 8663
				if (var13 != null) { // L: 8664
					Client.mouseCrossX = var6; // L: 8665
					Client.mouseCrossY = var7; // L: 8666
					Client.mouseCrossColor = 2; // L: 8667
					Client.mouseCrossState = 0; // L: 8668
					Client.destinationX = var0; // L: 8669
					Client.destinationY = var1; // L: 8670
					var9 = class4.getPacketBufferNode(ClientPacket.field2311, Client.packetWriter.isaacCipher); // L: 8672
					var9.packetBuffer.writeShortLE(var3); // L: 8673
					var9.packetBuffer.method5665(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8674
					Client.packetWriter.addNode(var9); // L: 8675
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 8695
				if (var13 != null) { // L: 8696
					Client.mouseCrossX = var6; // L: 8697
					Client.mouseCrossY = var7; // L: 8698
					Client.mouseCrossColor = 2; // L: 8699
					Client.mouseCrossState = 0; // L: 8700
					Client.destinationX = var0; // L: 8701
					Client.destinationY = var1; // L: 8702
					var9 = class4.getPacketBufferNode(ClientPacket.field2235, Client.packetWriter.isaacCipher); // L: 8704
					var9.packetBuffer.method5673(var3); // L: 8705
					var9.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8706
					Client.packetWriter.addNode(var9); // L: 8707
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 8092
					if (var15 != null) { // L: 8093
						Client.mouseCrossX = var6; // L: 8094
						Client.mouseCrossY = var7; // L: 8095
						Client.mouseCrossColor = 2; // L: 8096
						Client.mouseCrossState = 0; // L: 8097
						Client.destinationX = var0; // L: 8098
						Client.destinationY = var1; // L: 8099
						var9 = class4.getPacketBufferNode(ClientPacket.field2328, Client.packetWriter.isaacCipher); // L: 8101
						var9.packetBuffer.writeShort(var3); // L: 8102
						var9.packetBuffer.method5665(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8103
						var9.packetBuffer.method5674(InvDefinition.selectedItemSlot); // L: 8104
						var9.packetBuffer.writeInt(SpotAnimationDefinition.selectedItemWidget); // L: 8105
						var9.packetBuffer.method5674(Entity.selectedItemId); // L: 8106
						Client.packetWriter.addNode(var9); // L: 8107
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 8452
					if (var15 != null) { // L: 8453
						Client.mouseCrossX = var6; // L: 8454
						Client.mouseCrossY = var7; // L: 8455
						Client.mouseCrossColor = 2; // L: 8456
						Client.mouseCrossState = 0; // L: 8457
						Client.destinationX = var0; // L: 8458
						Client.destinationY = var1; // L: 8459
						var9 = class4.getPacketBufferNode(ClientPacket.field2275, Client.packetWriter.isaacCipher); // L: 8461
						var9.packetBuffer.method5682(class307.selectedSpellWidget); // L: 8462
						var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8463
						var9.packetBuffer.writeShortLE(var3); // L: 8464
						var9.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8465
						Client.packetWriter.addNode(var9); // L: 8466
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 8031
					Client.mouseCrossY = var7; // L: 8032
					Client.mouseCrossColor = 2; // L: 8033
					Client.mouseCrossState = 0; // L: 8034
					Client.destinationX = var0; // L: 8035
					Client.destinationY = var1; // L: 8036
					var8 = class4.getPacketBufferNode(ClientPacket.field2299, Client.packetWriter.isaacCipher); // L: 8038
					var8.packetBuffer.writeShortLE(var3); // L: 8039
					var8.packetBuffer.method5673(InvDefinition.selectedItemSlot); // L: 8040
					var8.packetBuffer.writeInt(SpotAnimationDefinition.selectedItemWidget); // L: 8041
					var8.packetBuffer.writeShortLE(WorldMapData_0.baseY + var1); // L: 8042
					var8.packetBuffer.method5674(Entity.selectedItemId); // L: 8043
					var8.packetBuffer.method5673(var0 + FloorDecoration.baseX); // L: 8044
					var8.packetBuffer.method5665(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8045
					Client.packetWriter.addNode(var8); // L: 8046
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 8014
					Client.mouseCrossY = var7; // L: 8015
					Client.mouseCrossColor = 2; // L: 8016
					Client.mouseCrossState = 0; // L: 8017
					Client.destinationX = var0; // L: 8018
					Client.destinationY = var1; // L: 8019
					var8 = class4.getPacketBufferNode(ClientPacket.field2261, Client.packetWriter.isaacCipher); // L: 8021
					var8.packetBuffer.method5665(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8022
					var8.packetBuffer.writeShortLE(var3); // L: 8023
					var8.packetBuffer.method5673(WorldMapData_0.baseY + var1); // L: 8024
					var8.packetBuffer.method5673(Client.selectedSpellChildIndex); // L: 8025
					var8.packetBuffer.method5683(class307.selectedSpellWidget); // L: 8026
					var8.packetBuffer.writeShortLE(var0 + FloorDecoration.baseX); // L: 8027
					Client.packetWriter.addNode(var8); // L: 8028
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 8335
					Client.mouseCrossY = var7; // L: 8336
					Client.mouseCrossColor = 2; // L: 8337
					Client.mouseCrossState = 0; // L: 8338
					Client.destinationX = var0; // L: 8339
					Client.destinationY = var1; // L: 8340
					var8 = class4.getPacketBufferNode(ClientPacket.field2257, Client.packetWriter.isaacCipher); // L: 8342
					var8.packetBuffer.writeShort(WorldMapData_0.baseY + var1); // L: 8343
					var8.packetBuffer.writeShort(var0 + FloorDecoration.baseX); // L: 8344
					var8.packetBuffer.method5673(var3); // L: 8345
					var8.packetBuffer.method5665(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8346
					Client.packetWriter.addNode(var8); // L: 8347
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 8609
					Client.mouseCrossY = var7; // L: 8610
					Client.mouseCrossColor = 2; // L: 8611
					Client.mouseCrossState = 0; // L: 8612
					Client.destinationX = var0; // L: 8613
					Client.destinationY = var1; // L: 8614
					var8 = class4.getPacketBufferNode(ClientPacket.field2258, Client.packetWriter.isaacCipher); // L: 8616
					var8.packetBuffer.method5674(var0 + FloorDecoration.baseX); // L: 8617
					var8.packetBuffer.method5674(var3); // L: 8618
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8619
					var8.packetBuffer.method5674(WorldMapData_0.baseY + var1); // L: 8620
					Client.packetWriter.addNode(var8); // L: 8621
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 8485
					Client.mouseCrossY = var7; // L: 8486
					Client.mouseCrossColor = 2; // L: 8487
					Client.mouseCrossState = 0; // L: 8488
					Client.destinationX = var0; // L: 8489
					Client.destinationY = var1; // L: 8490
					var8 = class4.getPacketBufferNode(ClientPacket.field2305, Client.packetWriter.isaacCipher); // L: 8492
					var8.packetBuffer.method5673(var3); // L: 8493
					var8.packetBuffer.method5665(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8494
					var8.packetBuffer.method5674(var0 + FloorDecoration.baseX); // L: 8495
					var8.packetBuffer.method5673(WorldMapData_0.baseY + var1); // L: 8496
					Client.packetWriter.addNode(var8); // L: 8497
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 8546
					Client.mouseCrossY = var7; // L: 8547
					Client.mouseCrossColor = 2; // L: 8548
					Client.mouseCrossState = 0; // L: 8549
					Client.destinationX = var0; // L: 8550
					Client.destinationY = var1; // L: 8551
					var8 = class4.getPacketBufferNode(ClientPacket.field2288, Client.packetWriter.isaacCipher); // L: 8553
					var8.packetBuffer.writeShortLE(var3); // L: 8554
					var8.packetBuffer.method5665(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8555
					var8.packetBuffer.writeShortLE(var0 + FloorDecoration.baseX); // L: 8556
					var8.packetBuffer.writeShort(WorldMapData_0.baseY + var1); // L: 8557
					Client.packetWriter.addNode(var8); // L: 8558
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 8470
					Client.mouseCrossY = var7; // L: 8471
					Client.mouseCrossColor = 2; // L: 8472
					Client.mouseCrossState = 0; // L: 8473
					Client.destinationX = var0; // L: 8474
					Client.destinationY = var1; // L: 8475
					var8 = class4.getPacketBufferNode(ClientPacket.field2246, Client.packetWriter.isaacCipher); // L: 8477
					var8.packetBuffer.method5673(var0 + FloorDecoration.baseX); // L: 8478
					var8.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8479
					var8.packetBuffer.method5673(var3); // L: 8480
					var8.packetBuffer.writeShortLE(WorldMapData_0.baseY + var1); // L: 8481
					Client.packetWriter.addNode(var8); // L: 8482
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8583
						ModeWhere.scene.setViewportWalking(); // L: 8584
					} else {
						ModeWhere.scene.menuOpen(GrandExchangeOfferUnitPriceComparator.Client_plane, var0, var1, true); // L: 8587
					}
				} else {
					PacketBufferNode var10;
					Widget var16;
					if (var2 == 24) {
						var16 = UserComparator4.getWidget(var1); // L: 8365
						boolean var12 = true; // L: 8366
						if (var16.contentType > 0) { // L: 8367
							var12 = Varcs.method2313(var16);
						}

						if (var12) { // L: 8368
							var10 = class4.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher); // L: 8370
							var10.packetBuffer.writeInt(var1); // L: 8371
							Client.packetWriter.addNode(var10); // L: 8372
						}
					} else {
						if (var2 == 25) {
							var16 = ItemContainer.getWidgetChild(var1, var0); // L: 8728
							if (var16 != null) { // L: 8729
								class69.Widget_runOnTargetLeave(); // L: 8730
								class3.selectSpell(var1, var0, JagexCache.Widget_unpackTargetMask(WorldMapData_0.getWidgetFlags(var16)), var16.itemId); // L: 8731
								Client.isItemSelected = 0; // L: 8732
								Client.selectedSpellActionName = PendingSpawn.Widget_getSpellActionName(var16); // L: 8733
								if (Client.selectedSpellActionName == null) { // L: 8734
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 8735
									Client.selectedSpellName = var16.dataText + Client.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = Client.colorStartTag(65280) + var16.spellName + Client.colorStartTag(16777215); // L: 8736
								}
							}

							return; // L: 8738
						}

						if (var2 == 26) {
							ModeWhere.method3815(); // L: 8532
						} else {
							int var11;
							Widget var14;
							if (var2 == 28) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher); // L: 8254
								var8.packetBuffer.writeInt(var1); // L: 8255
								Client.packetWriter.addNode(var8); // L: 8256
								var14 = UserComparator4.getWidget(var1); // L: 8257
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8258
									var11 = var14.cs1Instructions[0][1]; // L: 8259
									Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11]; // L: 8260
									class23.changeGameOptions(var11); // L: 8261
								}
							} else if (var2 == 29) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher); // L: 8419
								var8.packetBuffer.writeInt(var1); // L: 8420
								Client.packetWriter.addNode(var8); // L: 8421
								var14 = UserComparator4.getWidget(var1); // L: 8422
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8423
									var11 = var14.cs1Instructions[0][1]; // L: 8424
									if (Varps.Varps_main[var11] != var14.cs1ComparisonValues[0]) { // L: 8425
										Varps.Varps_main[var11] = var14.cs1ComparisonValues[0]; // L: 8426
										class23.changeGameOptions(var11); // L: 8427
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 8656
									class171.resumePauseWidget(var1, var0); // L: 8657
									Client.meslayerContinueWidget = ItemContainer.getWidgetChild(var1, var0); // L: 8658
									GrandExchangeOfferOwnWorldComparator.invalidateWidget(Client.meslayerContinueWidget); // L: 8659
								}
							} else if (var2 == 31) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2232, Client.packetWriter.isaacCipher); // L: 8224
								var8.packetBuffer.writeShortLE(Entity.selectedItemId); // L: 8225
								var8.packetBuffer.writeShort(var3); // L: 8226
								var8.packetBuffer.method5674(InvDefinition.selectedItemSlot); // L: 8227
								var8.packetBuffer.method5683(var1); // L: 8228
								var8.packetBuffer.writeInt(SpotAnimationDefinition.selectedItemWidget); // L: 8229
								var8.packetBuffer.method5673(var0); // L: 8230
								Client.packetWriter.addNode(var8); // L: 8231
								Client.field828 = 0; // L: 8232
								MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 8233
								Client.field788 = var0; // L: 8234
							} else if (var2 == 32) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2236, Client.packetWriter.isaacCipher); // L: 8050
								var8.packetBuffer.method5684(class307.selectedSpellWidget); // L: 8051
								var8.packetBuffer.method5674(var0); // L: 8052
								var8.packetBuffer.method5683(var1); // L: 8053
								var8.packetBuffer.writeShort(var3); // L: 8054
								var8.packetBuffer.method5674(Client.selectedSpellChildIndex); // L: 8055
								Client.packetWriter.addNode(var8); // L: 8056
								Client.field828 = 0; // L: 8057
								MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 8058
								Client.field788 = var0; // L: 8059
							} else if (var2 == 33) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher); // L: 7993
								var8.packetBuffer.method5673(var0); // L: 7994
								var8.packetBuffer.writeInt(var1); // L: 7995
								var8.packetBuffer.method5674(var3); // L: 7996
								Client.packetWriter.addNode(var8); // L: 7997
								Client.field828 = 0; // L: 7998
								MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 7999
								Client.field788 = var0; // L: 8000
							} else if (var2 == 34) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2289, Client.packetWriter.isaacCipher); // L: 8063
								var8.packetBuffer.writeShort(var3); // L: 8064
								var8.packetBuffer.method5684(var1); // L: 8065
								var8.packetBuffer.writeShortLE(var0); // L: 8066
								Client.packetWriter.addNode(var8); // L: 8067
								Client.field828 = 0; // L: 8068
								MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 8069
								Client.field788 = var0; // L: 8070
							} else if (var2 == 35) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2263, Client.packetWriter.isaacCipher); // L: 8298
								var8.packetBuffer.writeInt(var1); // L: 8299
								var8.packetBuffer.writeShortLE(var3); // L: 8300
								var8.packetBuffer.method5673(var0); // L: 8301
								Client.packetWriter.addNode(var8); // L: 8302
								Client.field828 = 0; // L: 8303
								MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 8304
								Client.field788 = var0; // L: 8305
							} else if (var2 == 36) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2291, Client.packetWriter.isaacCipher); // L: 8112
								var8.packetBuffer.method5673(var0); // L: 8113
								var8.packetBuffer.method5673(var3); // L: 8114
								var8.packetBuffer.method5682(var1); // L: 8115
								Client.packetWriter.addNode(var8); // L: 8116
								Client.field828 = 0; // L: 8117
								MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 8118
								Client.field788 = var0; // L: 8119
							} else if (var2 == 37) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2266, Client.packetWriter.isaacCipher); // L: 8004
								var8.packetBuffer.method5674(var0); // L: 8005
								var8.packetBuffer.method5682(var1); // L: 8006
								var8.packetBuffer.writeShortLE(var3); // L: 8007
								Client.packetWriter.addNode(var8); // L: 8008
								Client.field828 = 0; // L: 8009
								MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 8010
								Client.field788 = var0; // L: 8011
							} else {
								if (var2 == 38) {
									class69.Widget_runOnTargetLeave(); // L: 8167
									var16 = UserComparator4.getWidget(var1); // L: 8168
									Client.isItemSelected = 1; // L: 8169
									InvDefinition.selectedItemSlot = var0; // L: 8170
									SpotAnimationDefinition.selectedItemWidget = var1; // L: 8171
									Entity.selectedItemId = var3; // L: 8172
									GrandExchangeOfferOwnWorldComparator.invalidateWidget(var16); // L: 8173
									Client.selectedItemName = Client.colorStartTag(16748608) + AbstractWorldMapData.ItemDefinition_get(var3).name + Client.colorStartTag(16777215); // L: 8174
									if (Client.selectedItemName == null) { // L: 8175
										Client.selectedItemName = "null";
									}

									return; // L: 8176
								}

								if (var2 == 39) {
									var8 = class4.getPacketBufferNode(ClientPacket.field2243, Client.packetWriter.isaacCipher); // L: 7950
									var8.packetBuffer.method5674(var3); // L: 7951
									var8.packetBuffer.method5674(var0); // L: 7952
									var8.packetBuffer.writeInt(var1); // L: 7953
									Client.packetWriter.addNode(var8); // L: 7954
									Client.field828 = 0; // L: 7955
									MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 7956
									Client.field788 = var0; // L: 7957
								} else if (var2 == 40) {
									var8 = class4.getPacketBufferNode(ClientPacket.field2294, Client.packetWriter.isaacCipher); // L: 8213
									var8.packetBuffer.method5684(var1); // L: 8214
									var8.packetBuffer.method5673(var0); // L: 8215
									var8.packetBuffer.writeShortLE(var3); // L: 8216
									Client.packetWriter.addNode(var8); // L: 8217
									Client.field828 = 0; // L: 8218
									MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 8219
									Client.field788 = var0; // L: 8220
								} else if (var2 == 41) {
									var8 = class4.getPacketBufferNode(ClientPacket.field2297, Client.packetWriter.isaacCipher); // L: 8325
									var8.packetBuffer.writeShortLE(var3); // L: 8326
									var8.packetBuffer.writeShortLE(var0); // L: 8327
									var8.packetBuffer.method5683(var1); // L: 8328
									Client.packetWriter.addNode(var8); // L: 8329
									Client.field828 = 0; // L: 8330
									MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 8331
									Client.field788 = var0; // L: 8332
								} else if (var2 == 42) {
									var8 = class4.getPacketBufferNode(ClientPacket.field2276, Client.packetWriter.isaacCipher); // L: 8536
									var8.packetBuffer.writeShort(var3); // L: 8537
									var8.packetBuffer.method5674(var0); // L: 8538
									var8.packetBuffer.method5683(var1); // L: 8539
									Client.packetWriter.addNode(var8); // L: 8540
									Client.field828 = 0; // L: 8541
									MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 8542
									Client.field788 = var0; // L: 8543
								} else if (var2 == 43) {
									var8 = class4.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher); // L: 8393
									var8.packetBuffer.method5674(var3); // L: 8394
									var8.packetBuffer.writeInt(var1); // L: 8395
									var8.packetBuffer.method5673(var0); // L: 8396
									Client.packetWriter.addNode(var8); // L: 8397
									Client.field828 = 0; // L: 8398
									MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 8399
									Client.field788 = var0; // L: 8400
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 8265
									if (var15 != null) { // L: 8266
										Client.mouseCrossX = var6; // L: 8267
										Client.mouseCrossY = var7; // L: 8268
										Client.mouseCrossColor = 2; // L: 8269
										Client.mouseCrossState = 0; // L: 8270
										Client.destinationX = var0; // L: 8271
										Client.destinationY = var1; // L: 8272
										var9 = class4.getPacketBufferNode(ClientPacket.field2239, Client.packetWriter.isaacCipher); // L: 8274
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8275
										var9.packetBuffer.method5673(var3); // L: 8276
										Client.packetWriter.addNode(var9); // L: 8277
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 8516
									if (var15 != null) { // L: 8517
										Client.mouseCrossX = var6; // L: 8518
										Client.mouseCrossY = var7; // L: 8519
										Client.mouseCrossColor = 2; // L: 8520
										Client.mouseCrossState = 0; // L: 8521
										Client.destinationX = var0; // L: 8522
										Client.destinationY = var1; // L: 8523
										var9 = class4.getPacketBufferNode(ClientPacket.field2254, Client.packetWriter.isaacCipher); // L: 8525
										var9.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8526
										var9.packetBuffer.method5674(var3); // L: 8527
										Client.packetWriter.addNode(var9); // L: 8528
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 8640
									if (var15 != null) { // L: 8641
										Client.mouseCrossX = var6; // L: 8642
										Client.mouseCrossY = var7; // L: 8643
										Client.mouseCrossColor = 2; // L: 8644
										Client.mouseCrossState = 0; // L: 8645
										Client.destinationX = var0; // L: 8646
										Client.destinationY = var1; // L: 8647
										var9 = class4.getPacketBufferNode(ClientPacket.field2280, Client.packetWriter.isaacCipher); // L: 8649
										var9.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8650
										var9.packetBuffer.method5673(var3); // L: 8651
										Client.packetWriter.addNode(var9); // L: 8652
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 8679
									if (var15 != null) { // L: 8680
										Client.mouseCrossX = var6; // L: 8681
										Client.mouseCrossY = var7; // L: 8682
										Client.mouseCrossColor = 2; // L: 8683
										Client.mouseCrossState = 0; // L: 8684
										Client.destinationX = var0; // L: 8685
										Client.destinationY = var1; // L: 8686
										var9 = class4.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher); // L: 8688
										var9.packetBuffer.writeShort(var3); // L: 8689
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8690
										Client.packetWriter.addNode(var9); // L: 8691
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 8308
									if (var15 != null) { // L: 8309
										Client.mouseCrossX = var6; // L: 8310
										Client.mouseCrossY = var7; // L: 8311
										Client.mouseCrossColor = 2; // L: 8312
										Client.mouseCrossState = 0; // L: 8313
										Client.destinationX = var0; // L: 8314
										Client.destinationY = var1; // L: 8315
										var9 = class4.getPacketBufferNode(ClientPacket.field2308, Client.packetWriter.isaacCipher); // L: 8317
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8318
										var9.packetBuffer.writeShortLE(var3); // L: 8319
										Client.packetWriter.addNode(var9); // L: 8320
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 8561
									if (var15 != null) { // L: 8562
										Client.mouseCrossX = var6; // L: 8563
										Client.mouseCrossY = var7; // L: 8564
										Client.mouseCrossColor = 2; // L: 8565
										Client.mouseCrossState = 0; // L: 8566
										Client.destinationX = var0; // L: 8567
										Client.destinationY = var1; // L: 8568
										var9 = class4.getPacketBufferNode(ClientPacket.field2323, Client.packetWriter.isaacCipher); // L: 8570
										var9.packetBuffer.writeShort(var3); // L: 8571
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8572
										Client.packetWriter.addNode(var9); // L: 8573
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 8237
									if (var15 != null) { // L: 8238
										Client.mouseCrossX = var6; // L: 8239
										Client.mouseCrossY = var7; // L: 8240
										Client.mouseCrossColor = 2; // L: 8241
										Client.mouseCrossState = 0; // L: 8242
										Client.destinationX = var0; // L: 8243
										Client.destinationY = var1; // L: 8244
										var9 = class4.getPacketBufferNode(ClientPacket.field2324, Client.packetWriter.isaacCipher); // L: 8246
										var9.packetBuffer.method5674(var3); // L: 8247
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8248
										Client.packetWriter.addNode(var9); // L: 8249
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 8281
									if (var15 != null) { // L: 8282
										Client.mouseCrossX = var6; // L: 8283
										Client.mouseCrossY = var7; // L: 8284
										Client.mouseCrossColor = 2; // L: 8285
										Client.mouseCrossState = 0; // L: 8286
										Client.destinationX = var0; // L: 8287
										Client.destinationY = var1; // L: 8288
										var9 = class4.getPacketBufferNode(ClientPacket.field2244, Client.packetWriter.isaacCipher); // L: 8290
										var9.packetBuffer.method5673(var3); // L: 8291
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8292
										Client.packetWriter.addNode(var9); // L: 8293
									}
								} else {
									label638: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ItemContainer.getWidgetChild(var1, var0); // L: 7960
												if (var16 != null) { // L: 7961
													var9 = class4.getPacketBufferNode(ClientPacket.field2238, Client.packetWriter.isaacCipher); // L: 7963
													var9.packetBuffer.method5673(var0); // L: 7964
													var9.packetBuffer.writeShortLE(Client.field838); // L: 7965
													var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex); // L: 7966
													var9.packetBuffer.writeInt(var1); // L: 7967
													var9.packetBuffer.method5684(class307.selectedSpellWidget); // L: 7968
													var9.packetBuffer.writeShort(var16.itemId); // L: 7969
													Client.packetWriter.addNode(var9); // L: 7970
												}
												break label638;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6; // L: 8350
												Client.mouseCrossY = var7; // L: 8351
												Client.mouseCrossColor = 2; // L: 8352
												Client.mouseCrossState = 0; // L: 8353
												Client.destinationX = var0; // L: 8354
												Client.destinationY = var1; // L: 8355
												var8 = class4.getPacketBufferNode(ClientPacket.field2259, Client.packetWriter.isaacCipher); // L: 8357
												var8.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8358
												var8.packetBuffer.method5674(var3); // L: 8359
												var8.packetBuffer.method5674(WorldMapData_0.baseY + var1); // L: 8360
												var8.packetBuffer.writeShortLE(var0 + FloorDecoration.baseX); // L: 8361
												Client.packetWriter.addNode(var8); // L: 8362
												break label638;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6; // L: 8432
												Client.mouseCrossY = var7; // L: 8433
												Client.mouseCrossColor = 2; // L: 8434
												Client.mouseCrossState = 0; // L: 8435
												var8 = class4.getPacketBufferNode(ClientPacket.field2233, Client.packetWriter.isaacCipher); // L: 8437
												var8.packetBuffer.writeShort(var3); // L: 8438
												Client.packetWriter.addNode(var8); // L: 8439
												break label638;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6; // L: 8150
												Client.mouseCrossY = var7; // L: 8151
												Client.mouseCrossColor = 2; // L: 8152
												Client.mouseCrossState = 0; // L: 8153
												var13 = Client.npcs[var3]; // L: 8154
												if (var13 != null) { // L: 8155
													NPCDefinition var17 = var13.definition; // L: 8156
													if (var17.transforms != null) { // L: 8157
														var17 = var17.transform();
													}

													if (var17 != null) { // L: 8158
														var10 = class4.getPacketBufferNode(ClientPacket.field2284, Client.packetWriter.isaacCipher); // L: 8160
														var10.packetBuffer.writeShortLE(var17.id); // L: 8161
														Client.packetWriter.addNode(var10); // L: 8162
													}
												}
												break label638;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6; // L: 8442
												Client.mouseCrossY = var7; // L: 8443
												Client.mouseCrossColor = 2; // L: 8444
												Client.mouseCrossState = 0; // L: 8445
												var8 = class4.getPacketBufferNode(ClientPacket.field2317, Client.packetWriter.isaacCipher); // L: 8447
												var8.packetBuffer.writeShortLE(var3); // L: 8448
												Client.packetWriter.addNode(var8); // L: 8449
												break label638;
											}

											if (var2 == 1005) {
												var16 = UserComparator4.getWidget(var1); // L: 8137
												if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 8138
													DevicePcmPlayerProvider.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + AbstractWorldMapData.ItemDefinition_get(var3).name);
												} else {
													var9 = class4.getPacketBufferNode(ClientPacket.field2317, Client.packetWriter.isaacCipher); // L: 8141
													var9.packetBuffer.writeShortLE(var3); // L: 8142
													Client.packetWriter.addNode(var9); // L: 8143
												}

												Client.field828 = 0; // L: 8145
												MouseHandler.field525 = UserComparator4.getWidget(var1); // L: 8146
												Client.field788 = var0; // L: 8147
												break label638;
											}

											if (var2 != 1007) {
												if (var2 == 1008 || var2 == 1011 || var2 == 1009 || var2 == 1010 || var2 == 1012) {
													KeyHandler.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 8194
												}
												break label638;
											}
										}

										var16 = ItemContainer.getWidgetChild(var1, var0); // L: 8577
										if (var16 != null) { // L: 8578
											Messages.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 8579
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 8740
			Client.isItemSelected = 0; // L: 8741
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(UserComparator4.getWidget(SpotAnimationDefinition.selectedItemWidget)); // L: 8742
		}

		if (Client.isSpellSelected) { // L: 8744
			class69.Widget_runOnTargetLeave();
		}

		if (MouseHandler.field525 != null && Client.field828 == 0) { // L: 8745
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(MouseHandler.field525);
		}

	} // L: 8746
}
