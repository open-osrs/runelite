import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1608001459
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1563453913
	)
	@Export("height")
	int height;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1270457979
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1248595947
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1891554599
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 835758211
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1267971371
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -509888291
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -2077981723
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 569603025
	)
	int field2552;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1288318445
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 4383749992013445467L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1389469279
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-126"
	)
	public static void method4431() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 116
			if (ArchiveDiskActionHandler.field3557 != 0) { // L: 117
				ArchiveDiskActionHandler.field3557 = 1; // L: 118

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 120
				} catch (InterruptedException var3) { // L: 122
				}
			}

		}
	} // L: 125

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1327988393"
	)
	static void method4433() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 195
			Login.currentLoginField = 1; // L: 196
		} else {
			Login.currentLoginField = 0; // L: 199
		}

	} // L: 201

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1544544242"
	)
	static void method4432() {
		Login.loginIndex = 24; // L: 1527
		CollisionMap.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 1528
	} // L: 1529

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1747523197"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 7935
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 7936
			Client.mouseCrossX = var6; // L: 8020
			Client.mouseCrossY = var7; // L: 8021
			Client.mouseCrossColor = 2; // L: 8022
			Client.mouseCrossState = 0; // L: 8023
			Client.destinationX = var0; // L: 8024
			Client.destinationY = var1; // L: 8025
			var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2642, Client.packetWriter.isaacCipher); // L: 8027
			var8.packetBuffer.method6649(var0 + class15.baseX); // L: 8028
			var8.packetBuffer.writeShort(var3); // L: 8029
			var8.packetBuffer.method6649(Timer.selectedItemSlot); // L: 8030
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8031
			var8.packetBuffer.method6658(class246.selectedItemWidget); // L: 8032
			var8.packetBuffer.writeShort(WorldMapSprite.baseY + var1); // L: 8033
			var8.packetBuffer.method6648(Buddy.selectedItemId); // L: 8034
			Client.packetWriter.addNode(var8); // L: 8035
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 8632
			Client.mouseCrossY = var7; // L: 8633
			Client.mouseCrossColor = 2; // L: 8634
			Client.mouseCrossState = 0; // L: 8635
			Client.destinationX = var0; // L: 8636
			Client.destinationY = var1; // L: 8637
			var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2639, Client.packetWriter.isaacCipher); // L: 8638
			var8.packetBuffer.method6648(Client.field634); // L: 8639
			var8.packetBuffer.method6649(var0 + class15.baseX); // L: 8640
			var8.packetBuffer.method6705(Client.selectedSpellChildIndex); // L: 8641
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8642
			var8.packetBuffer.method6658(class15.selectedSpellWidget); // L: 8643
			var8.packetBuffer.method6705(WorldMapSprite.baseY + var1); // L: 8644
			var8.packetBuffer.method6649(var3); // L: 8645
			Client.packetWriter.addNode(var8); // L: 8646
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 8427
			Client.mouseCrossY = var7; // L: 8428
			Client.mouseCrossColor = 2; // L: 8429
			Client.mouseCrossState = 0; // L: 8430
			Client.destinationX = var0; // L: 8431
			Client.destinationY = var1; // L: 8432
			var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2578, Client.packetWriter.isaacCipher); // L: 8434
			var8.packetBuffer.writeShort(WorldMapSprite.baseY + var1); // L: 8435
			var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8436
			var8.packetBuffer.method6648(var0 + class15.baseX); // L: 8437
			var8.packetBuffer.writeShort(var3); // L: 8438
			Client.packetWriter.addNode(var8); // L: 8439
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 8669
			Client.mouseCrossY = var7; // L: 8670
			Client.mouseCrossColor = 2; // L: 8671
			Client.mouseCrossState = 0; // L: 8672
			Client.destinationX = var0; // L: 8673
			Client.destinationY = var1; // L: 8674
			var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2589, Client.packetWriter.isaacCipher); // L: 8676
			var8.packetBuffer.method6648(WorldMapSprite.baseY + var1); // L: 8677
			var8.packetBuffer.method6649(var0 + class15.baseX); // L: 8678
			var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8679
			var8.packetBuffer.method6648(var3); // L: 8680
			Client.packetWriter.addNode(var8); // L: 8681
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 8314
			Client.mouseCrossY = var7; // L: 8315
			Client.mouseCrossColor = 2; // L: 8316
			Client.mouseCrossState = 0; // L: 8317
			Client.destinationX = var0; // L: 8318
			Client.destinationY = var1; // L: 8319
			var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2657, Client.packetWriter.isaacCipher); // L: 8321
			var8.packetBuffer.writeShort(var0 + class15.baseX); // L: 8322
			var8.packetBuffer.method6649(WorldMapSprite.baseY + var1); // L: 8323
			var8.packetBuffer.writeShort(var3); // L: 8324
			var8.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8325
			Client.packetWriter.addNode(var8); // L: 8326
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 8617
			Client.mouseCrossY = var7; // L: 8618
			Client.mouseCrossColor = 2; // L: 8619
			Client.mouseCrossState = 0; // L: 8620
			Client.destinationX = var0; // L: 8621
			Client.destinationY = var1; // L: 8622
			var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2616, Client.packetWriter.isaacCipher); // L: 8624
			var8.packetBuffer.writeShort(var3); // L: 8625
			var8.packetBuffer.method6649(WorldMapSprite.baseY + var1); // L: 8626
			var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8627
			var8.packetBuffer.method6649(var0 + class15.baseX); // L: 8628
			Client.packetWriter.addNode(var8); // L: 8629
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 8558
				if (var13 != null) { // L: 8559
					Client.mouseCrossX = var6; // L: 8560
					Client.mouseCrossY = var7; // L: 8561
					Client.mouseCrossColor = 2; // L: 8562
					Client.mouseCrossState = 0; // L: 8563
					Client.destinationX = var0; // L: 8564
					Client.destinationY = var1; // L: 8565
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2666, Client.packetWriter.isaacCipher); // L: 8567
					var9.packetBuffer.method6648(var3); // L: 8568
					var9.packetBuffer.method6648(Buddy.selectedItemId); // L: 8569
					var9.packetBuffer.method6658(class246.selectedItemWidget); // L: 8570
					var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8571
					var9.packetBuffer.writeShort(Timer.selectedItemSlot); // L: 8572
					Client.packetWriter.addNode(var9); // L: 8573
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 8052
				if (var13 != null) { // L: 8053
					Client.mouseCrossX = var6; // L: 8054
					Client.mouseCrossY = var7; // L: 8055
					Client.mouseCrossColor = 2; // L: 8056
					Client.mouseCrossState = 0; // L: 8057
					Client.destinationX = var0; // L: 8058
					Client.destinationY = var1; // L: 8059
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2617, Client.packetWriter.isaacCipher); // L: 8060
					var9.packetBuffer.method6649(Client.selectedSpellChildIndex); // L: 8061
					var9.packetBuffer.writeInt(class15.selectedSpellWidget); // L: 8062
					var9.packetBuffer.writeShort(Client.field634); // L: 8063
					var9.packetBuffer.method6649(var3); // L: 8064
					var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8065
					Client.packetWriter.addNode(var9); // L: 8066
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 8108
				if (var13 != null) { // L: 8109
					Client.mouseCrossX = var6; // L: 8110
					Client.mouseCrossY = var7; // L: 8111
					Client.mouseCrossColor = 2; // L: 8112
					Client.mouseCrossState = 0; // L: 8113
					Client.destinationX = var0; // L: 8114
					Client.destinationY = var1; // L: 8115
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2671, Client.packetWriter.isaacCipher); // L: 8117
					var9.packetBuffer.method6648(var3); // L: 8118
					var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8119
					Client.packetWriter.addNode(var9); // L: 8120
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 8272
				if (var13 != null) { // L: 8273
					Client.mouseCrossX = var6; // L: 8274
					Client.mouseCrossY = var7; // L: 8275
					Client.mouseCrossColor = 2; // L: 8276
					Client.mouseCrossState = 0; // L: 8277
					Client.destinationX = var0; // L: 8278
					Client.destinationY = var1; // L: 8279
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2649, Client.packetWriter.isaacCipher); // L: 8281
					var9.packetBuffer.method6649(var3); // L: 8282
					var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8283
					Client.packetWriter.addNode(var9); // L: 8284
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 8442
				if (var13 != null) { // L: 8443
					Client.mouseCrossX = var6; // L: 8444
					Client.mouseCrossY = var7; // L: 8445
					Client.mouseCrossColor = 2; // L: 8446
					Client.mouseCrossState = 0; // L: 8447
					Client.destinationX = var0; // L: 8448
					Client.destinationY = var1; // L: 8449
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2597, Client.packetWriter.isaacCipher); // L: 8451
					var9.packetBuffer.method6648(var3); // L: 8452
					var9.packetBuffer.method6640(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8453
					Client.packetWriter.addNode(var9); // L: 8454
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 7953
				if (var13 != null) { // L: 7954
					Client.mouseCrossX = var6; // L: 7955
					Client.mouseCrossY = var7; // L: 7956
					Client.mouseCrossColor = 2; // L: 7957
					Client.mouseCrossState = 0; // L: 7958
					Client.destinationX = var0; // L: 7959
					Client.destinationY = var1; // L: 7960
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2681, Client.packetWriter.isaacCipher); // L: 7962
					var9.packetBuffer.method6640(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7963
					var9.packetBuffer.method6705(var3); // L: 7964
					Client.packetWriter.addNode(var9); // L: 7965
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 7996
				if (var13 != null) { // L: 7997
					Client.mouseCrossX = var6; // L: 7998
					Client.mouseCrossY = var7; // L: 7999
					Client.mouseCrossColor = 2; // L: 8000
					Client.mouseCrossState = 0; // L: 8001
					Client.destinationX = var0; // L: 8002
					Client.destinationY = var1; // L: 8003
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2595, Client.packetWriter.isaacCipher); // L: 8005
					var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8006
					var9.packetBuffer.method6705(var3); // L: 8007
					Client.packetWriter.addNode(var9); // L: 8008
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 8587
					if (var15 != null) { // L: 8588
						Client.mouseCrossX = var6; // L: 8589
						Client.mouseCrossY = var7; // L: 8590
						Client.mouseCrossColor = 2; // L: 8591
						Client.mouseCrossState = 0; // L: 8592
						Client.destinationX = var0; // L: 8593
						Client.destinationY = var1; // L: 8594
						var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2650, Client.packetWriter.isaacCipher); // L: 8596
						var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8597
						var9.packetBuffer.writeShort(var3); // L: 8598
						var9.packetBuffer.method6649(Timer.selectedItemSlot); // L: 8599
						var9.packetBuffer.method6649(Buddy.selectedItemId); // L: 8600
						var9.packetBuffer.writeIntME(class246.selectedItemWidget); // L: 8601
						Client.packetWriter.addNode(var9); // L: 8602
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 8238
					if (var15 != null) { // L: 8239
						Client.mouseCrossX = var6; // L: 8240
						Client.mouseCrossY = var7; // L: 8241
						Client.mouseCrossColor = 2; // L: 8242
						Client.mouseCrossState = 0; // L: 8243
						Client.destinationX = var0; // L: 8244
						Client.destinationY = var1; // L: 8245
						var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2611, Client.packetWriter.isaacCipher); // L: 8246
						var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8247
						var9.packetBuffer.method6658(class15.selectedSpellWidget); // L: 8248
						var9.packetBuffer.method6649(var3); // L: 8249
						var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8250
						var9.packetBuffer.method6705(Client.field634); // L: 8251
						Client.packetWriter.addNode(var9); // L: 8252
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 8220
					Client.mouseCrossY = var7; // L: 8221
					Client.mouseCrossColor = 2; // L: 8222
					Client.mouseCrossState = 0; // L: 8223
					Client.destinationX = var0; // L: 8224
					Client.destinationY = var1; // L: 8225
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2654, Client.packetWriter.isaacCipher); // L: 8227
					var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8228
					var8.packetBuffer.method6659(class246.selectedItemWidget); // L: 8229
					var8.packetBuffer.method6648(Buddy.selectedItemId); // L: 8230
					var8.packetBuffer.writeShort(Timer.selectedItemSlot); // L: 8231
					var8.packetBuffer.writeShort(var3); // L: 8232
					var8.packetBuffer.method6649(var0 + class15.baseX); // L: 8233
					var8.packetBuffer.method6648(WorldMapSprite.baseY + var1); // L: 8234
					Client.packetWriter.addNode(var8); // L: 8235
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 8649
					Client.mouseCrossY = var7; // L: 8650
					Client.mouseCrossColor = 2; // L: 8651
					Client.mouseCrossState = 0; // L: 8652
					Client.destinationX = var0; // L: 8653
					Client.destinationY = var1; // L: 8654
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2646, Client.packetWriter.isaacCipher); // L: 8655
					var8.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8656
					var8.packetBuffer.writeInt(class15.selectedSpellWidget); // L: 8657
					var8.packetBuffer.method6649(var3); // L: 8658
					var8.packetBuffer.method6648(Client.selectedSpellChildIndex); // L: 8659
					var8.packetBuffer.method6649(var0 + class15.baseX); // L: 8660
					var8.packetBuffer.method6648(Client.field634); // L: 8661
					var8.packetBuffer.method6649(WorldMapSprite.baseY + var1); // L: 8662
					Client.packetWriter.addNode(var8); // L: 8663
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 8340
					Client.mouseCrossY = var7; // L: 8341
					Client.mouseCrossColor = 2; // L: 8342
					Client.mouseCrossState = 0; // L: 8343
					Client.destinationX = var0; // L: 8344
					Client.destinationY = var1; // L: 8345
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2614, Client.packetWriter.isaacCipher); // L: 8347
					var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8348
					var8.packetBuffer.method6649(WorldMapSprite.baseY + var1); // L: 8349
					var8.packetBuffer.method6705(var0 + class15.baseX); // L: 8350
					var8.packetBuffer.method6649(var3); // L: 8351
					Client.packetWriter.addNode(var8); // L: 8352
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 8701
					Client.mouseCrossY = var7; // L: 8702
					Client.mouseCrossColor = 2; // L: 8703
					Client.mouseCrossState = 0; // L: 8704
					Client.destinationX = var0; // L: 8705
					Client.destinationY = var1; // L: 8706
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2613, Client.packetWriter.isaacCipher); // L: 8708
					var8.packetBuffer.method6705(var0 + class15.baseX); // L: 8709
					var8.packetBuffer.writeShort(var3); // L: 8710
					var8.packetBuffer.writeShort(WorldMapSprite.baseY + var1); // L: 8711
					var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8712
					Client.packetWriter.addNode(var8); // L: 8713
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 8288
					Client.mouseCrossY = var7; // L: 8289
					Client.mouseCrossColor = 2; // L: 8290
					Client.mouseCrossState = 0; // L: 8291
					Client.destinationX = var0; // L: 8292
					Client.destinationY = var1; // L: 8293
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2602, Client.packetWriter.isaacCipher); // L: 8295
					var8.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8296
					var8.packetBuffer.method6649(WorldMapSprite.baseY + var1); // L: 8297
					var8.packetBuffer.writeShort(var0 + class15.baseX); // L: 8298
					var8.packetBuffer.method6649(var3); // L: 8299
					Client.packetWriter.addNode(var8); // L: 8300
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 8474
					Client.mouseCrossY = var7; // L: 8475
					Client.mouseCrossColor = 2; // L: 8476
					Client.mouseCrossState = 0; // L: 8477
					Client.destinationX = var0; // L: 8478
					Client.destinationY = var1; // L: 8479
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2678, Client.packetWriter.isaacCipher); // L: 8481
					var8.packetBuffer.method6705(var3); // L: 8482
					var8.packetBuffer.method6705(WorldMapSprite.baseY + var1); // L: 8483
					var8.packetBuffer.method6648(var0 + class15.baseX); // L: 8484
					var8.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8485
					Client.packetWriter.addNode(var8); // L: 8486
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 8355
					Client.mouseCrossY = var7; // L: 8356
					Client.mouseCrossColor = 2; // L: 8357
					Client.mouseCrossState = 0; // L: 8358
					Client.destinationX = var0; // L: 8359
					Client.destinationY = var1; // L: 8360
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2604, Client.packetWriter.isaacCipher); // L: 8362
					var8.packetBuffer.method6640(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8363
					var8.packetBuffer.method6705(var0 + class15.baseX); // L: 8364
					var8.packetBuffer.method6648(var3); // L: 8365
					var8.packetBuffer.method6705(WorldMapSprite.baseY + var1); // L: 8366
					Client.packetWriter.addNode(var8); // L: 8367
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8012
						DevicePcmPlayerProvider.scene.setViewportWalking(); // L: 8013
					} else {
						DevicePcmPlayerProvider.scene.menuOpen(SoundSystem.Client_plane, var0, var1, true); // L: 8016
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = WorldMapData_1.getWidget(var1); // L: 8606
						boolean var12 = true; // L: 8607
						if (var16.contentType > 0) { // L: 8608
							var12 = class343.method6080(var16);
						}

						if (var12) { // L: 8609
							var11 = InterfaceParent.getPacketBufferNode(ClientPacket.field2677, Client.packetWriter.isaacCipher); // L: 8611
							var11.packetBuffer.writeInt(var1); // L: 8612
							Client.packetWriter.addNode(var11); // L: 8613
						}
					} else {
						if (var2 == 25) {
							var16 = class17.getWidgetChild(var1, var0); // L: 8204
							if (var16 != null) { // L: 8205
								class20.Widget_runOnTargetLeave(); // L: 8206
								ItemComposition.selectSpell(var1, var0, ModelData0.Widget_unpackTargetMask(class22.getWidgetFlags(var16)), var16.itemId); // L: 8207
								Client.isItemSelected = 0; // L: 8208
								Client.selectedSpellActionName = SecureRandomCallable.Widget_getSpellActionName(var16); // L: 8209
								if (Client.selectedSpellActionName == null) { // L: 8210
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 8211
									Client.selectedSpellName = var16.dataText + SecureRandomFuture.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = SecureRandomFuture.colorStartTag(65280) + var16.spellName + SecureRandomFuture.colorStartTag(16777215); // L: 8212
								}
							}

							return; // L: 8214
						}

						if (var2 == 26) {
							class20.method288(); // L: 8217
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2677, Client.packetWriter.isaacCipher); // L: 8387
								var8.packetBuffer.writeInt(var1); // L: 8388
								Client.packetWriter.addNode(var8); // L: 8389
								var14 = WorldMapData_1.getWidget(var1); // L: 8390
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8391
									var10 = var14.cs1Instructions[0][1]; // L: 8392
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10]; // L: 8393
									class6.changeGameOptions(var10); // L: 8394
								}
							} else if (var2 == 29) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2677, Client.packetWriter.isaacCipher); // L: 8039
								var8.packetBuffer.writeInt(var1); // L: 8040
								Client.packetWriter.addNode(var8); // L: 8041
								var14 = WorldMapData_1.getWidget(var1); // L: 8042
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8043
									var10 = var14.cs1Instructions[0][1]; // L: 8044
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) { // L: 8045
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0]; // L: 8046
										class6.changeGameOptions(var10); // L: 8047
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 8134
									ClanChannelMember.resumePauseWidget(var1, var0); // L: 8135
									Client.meslayerContinueWidget = class17.getWidgetChild(var1, var0); // L: 8136
									Script.invalidateWidget(Client.meslayerContinueWidget); // L: 8137
								}
							} else if (var2 == 31) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2620, Client.packetWriter.isaacCipher); // L: 8490
								var8.packetBuffer.method6648(Timer.selectedItemSlot); // L: 8491
								var8.packetBuffer.method6658(var1); // L: 8492
								var8.packetBuffer.method6705(Buddy.selectedItemId); // L: 8493
								var8.packetBuffer.writeIntME(class246.selectedItemWidget); // L: 8494
								var8.packetBuffer.method6648(var3); // L: 8495
								var8.packetBuffer.method6705(var0); // L: 8496
								Client.packetWriter.addNode(var8); // L: 8497
								Client.field869 = 0; // L: 8498
								Login.field1034 = WorldMapData_1.getWidget(var1); // L: 8499
								Client.field729 = var0; // L: 8500
							} else if (var2 == 32) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2632, Client.packetWriter.isaacCipher); // L: 8399
								var8.packetBuffer.method6648(var0); // L: 8400
								var8.packetBuffer.writeShort(var3); // L: 8401
								var8.packetBuffer.method6649(Client.selectedSpellChildIndex); // L: 8402
								var8.packetBuffer.writeInt(var1); // L: 8403
								var8.packetBuffer.writeInt(class15.selectedSpellWidget); // L: 8404
								Client.packetWriter.addNode(var8); // L: 8405
								Client.field869 = 0; // L: 8406
								Login.field1034 = WorldMapData_1.getWidget(var1); // L: 8407
								Client.field729 = var0; // L: 8408
							} else if (var2 == 33) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2663, Client.packetWriter.isaacCipher); // L: 8071
								var8.packetBuffer.writeInt(var1); // L: 8072
								var8.packetBuffer.writeShort(var0); // L: 8073
								var8.packetBuffer.method6649(var3); // L: 8074
								Client.packetWriter.addNode(var8); // L: 8075
								Client.field869 = 0; // L: 8076
								Login.field1034 = WorldMapData_1.getWidget(var1); // L: 8077
								Client.field729 = var0; // L: 8078
							} else if (var2 == 34) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2638, Client.packetWriter.isaacCipher); // L: 8548
								var8.packetBuffer.writeInt(var1); // L: 8549
								var8.packetBuffer.method6648(var0); // L: 8550
								var8.packetBuffer.method6649(var3); // L: 8551
								Client.packetWriter.addNode(var8); // L: 8552
								Client.field869 = 0; // L: 8553
								Login.field1034 = WorldMapData_1.getWidget(var1); // L: 8554
								Client.field729 = var0; // L: 8555
							} else if (var2 == 35) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2628, Client.packetWriter.isaacCipher); // L: 8515
								var8.packetBuffer.method6648(var0); // L: 8516
								var8.packetBuffer.method6649(var3); // L: 8517
								var8.packetBuffer.method6659(var1); // L: 8518
								Client.packetWriter.addNode(var8); // L: 8519
								Client.field869 = 0; // L: 8520
								Login.field1034 = WorldMapData_1.getWidget(var1); // L: 8521
								Client.field729 = var0; // L: 8522
							} else if (var2 == 36) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2590, Client.packetWriter.isaacCipher); // L: 7986
								var8.packetBuffer.method6658(var1); // L: 7987
								var8.packetBuffer.method6649(var0); // L: 7988
								var8.packetBuffer.method6648(var3); // L: 7989
								Client.packetWriter.addNode(var8); // L: 7990
								Client.field869 = 0; // L: 7991
								Login.field1034 = WorldMapData_1.getWidget(var1); // L: 7992
								Client.field729 = var0; // L: 7993
							} else if (var2 == 37) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2580, Client.packetWriter.isaacCipher); // L: 8537
								var8.packetBuffer.method6705(var3); // L: 8538
								var8.packetBuffer.writeShort(var0); // L: 8539
								var8.packetBuffer.method6658(var1); // L: 8540
								Client.packetWriter.addNode(var8); // L: 8541
								Client.field869 = 0; // L: 8542
								Login.field1034 = WorldMapData_1.getWidget(var1); // L: 8543
								Client.field729 = var0; // L: 8544
							} else {
								if (var2 == 38) {
									class20.Widget_runOnTargetLeave(); // L: 8096
									var16 = WorldMapData_1.getWidget(var1); // L: 8097
									Client.isItemSelected = 1; // L: 8098
									Timer.selectedItemSlot = var0; // L: 8099
									class246.selectedItemWidget = var1; // L: 8100
									Buddy.selectedItemId = var3; // L: 8101
									Script.invalidateWidget(var16); // L: 8102
									Client.selectedItemName = SecureRandomFuture.colorStartTag(16748608) + class250.ItemDefinition_get(var3).name + SecureRandomFuture.colorStartTag(16777215); // L: 8103
									if (Client.selectedItemName == null) { // L: 8104
										Client.selectedItemName = "null";
									}

									return; // L: 8105
								}

								if (var2 == 39) {
									var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2640, Client.packetWriter.isaacCipher); // L: 8504
									var8.packetBuffer.writeIntME(var1); // L: 8505
									var8.packetBuffer.method6649(var3); // L: 8506
									var8.packetBuffer.method6648(var0); // L: 8507
									Client.packetWriter.addNode(var8); // L: 8508
									Client.field869 = 0; // L: 8509
									Login.field1034 = WorldMapData_1.getWidget(var1); // L: 8510
									Client.field729 = var0; // L: 8511
								} else if (var2 == 40) {
									var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2641, Client.packetWriter.isaacCipher); // L: 8526
									var8.packetBuffer.writeShort(var0); // L: 8527
									var8.packetBuffer.writeIntME(var1); // L: 8528
									var8.packetBuffer.writeShort(var3); // L: 8529
									Client.packetWriter.addNode(var8); // L: 8530
									Client.field869 = 0; // L: 8531
									Login.field1034 = WorldMapData_1.getWidget(var1); // L: 8532
									Client.field729 = var0; // L: 8533
								} else if (var2 == 41) {
									var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2637, Client.packetWriter.isaacCipher); // L: 8304
									var8.packetBuffer.writeShort(var0); // L: 8305
									var8.packetBuffer.method6649(var3); // L: 8306
									var8.packetBuffer.writeIntME(var1); // L: 8307
									Client.packetWriter.addNode(var8); // L: 8308
									Client.field869 = 0; // L: 8309
									Login.field1034 = WorldMapData_1.getWidget(var1); // L: 8310
									Client.field729 = var0; // L: 8311
								} else if (var2 == 42) {
									var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2672, Client.packetWriter.isaacCipher); // L: 8330
									var8.packetBuffer.method6648(var3); // L: 8331
									var8.packetBuffer.method6648(var0); // L: 8332
									var8.packetBuffer.writeInt(var1); // L: 8333
									Client.packetWriter.addNode(var8); // L: 8334
									Client.field869 = 0; // L: 8335
									Login.field1034 = WorldMapData_1.getWidget(var1); // L: 8336
									Client.field729 = var0; // L: 8337
								} else if (var2 == 43) {
									var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2645, Client.packetWriter.isaacCipher); // L: 8691
									var8.packetBuffer.writeIntME(var1); // L: 8692
									var8.packetBuffer.writeShort(var3); // L: 8693
									var8.packetBuffer.method6705(var0); // L: 8694
									Client.packetWriter.addNode(var8); // L: 8695
									Client.field869 = 0; // L: 8696
									Login.field1034 = WorldMapData_1.getWidget(var1); // L: 8697
									Client.field729 = var0; // L: 8698
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 8458
									if (var15 != null) { // L: 8459
										Client.mouseCrossX = var6; // L: 8460
										Client.mouseCrossY = var7; // L: 8461
										Client.mouseCrossColor = 2; // L: 8462
										Client.mouseCrossState = 0; // L: 8463
										Client.destinationX = var0; // L: 8464
										Client.destinationY = var1; // L: 8465
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2618, Client.packetWriter.isaacCipher); // L: 8467
										var9.packetBuffer.method6705(var3); // L: 8468
										var9.packetBuffer.method6640(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8469
										Client.packetWriter.addNode(var9); // L: 8470
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 7969
									if (var15 != null) { // L: 7970
										Client.mouseCrossX = var6; // L: 7971
										Client.mouseCrossY = var7; // L: 7972
										Client.mouseCrossColor = 2; // L: 7973
										Client.mouseCrossState = 0; // L: 7974
										Client.destinationX = var0; // L: 7975
										Client.destinationY = var1; // L: 7976
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2625, Client.packetWriter.isaacCipher); // L: 7978
										var9.packetBuffer.method6649(var3); // L: 7979
										var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7980
										Client.packetWriter.addNode(var9); // L: 7981
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 7937
									if (var15 != null) { // L: 7938
										Client.mouseCrossX = var6; // L: 7939
										Client.mouseCrossY = var7; // L: 7940
										Client.mouseCrossColor = 2; // L: 7941
										Client.mouseCrossState = 0; // L: 7942
										Client.destinationX = var0; // L: 7943
										Client.destinationY = var1; // L: 7944
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2652, Client.packetWriter.isaacCipher); // L: 7946
										var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7947
										var9.packetBuffer.method6649(var3); // L: 7948
										Client.packetWriter.addNode(var9); // L: 7949
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 8256
									if (var15 != null) { // L: 8257
										Client.mouseCrossX = var6; // L: 8258
										Client.mouseCrossY = var7; // L: 8259
										Client.mouseCrossColor = 2; // L: 8260
										Client.mouseCrossState = 0; // L: 8261
										Client.destinationX = var0; // L: 8262
										Client.destinationY = var1; // L: 8263
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2627, Client.packetWriter.isaacCipher); // L: 8265
										var9.packetBuffer.method6640(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8266
										var9.packetBuffer.method6648(var3); // L: 8267
										Client.packetWriter.addNode(var9); // L: 8268
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 8411
									if (var15 != null) { // L: 8412
										Client.mouseCrossX = var6; // L: 8413
										Client.mouseCrossY = var7; // L: 8414
										Client.mouseCrossColor = 2; // L: 8415
										Client.mouseCrossState = 0; // L: 8416
										Client.destinationX = var0; // L: 8417
										Client.destinationY = var1; // L: 8418
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2608, Client.packetWriter.isaacCipher); // L: 8420
										var9.packetBuffer.method6648(var3); // L: 8421
										var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8422
										Client.packetWriter.addNode(var9); // L: 8423
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 8370
									if (var15 != null) { // L: 8371
										Client.mouseCrossX = var6; // L: 8372
										Client.mouseCrossY = var7; // L: 8373
										Client.mouseCrossColor = 2; // L: 8374
										Client.mouseCrossState = 0; // L: 8375
										Client.destinationX = var0; // L: 8376
										Client.destinationY = var1; // L: 8377
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2605, Client.packetWriter.isaacCipher); // L: 8379
										var9.packetBuffer.method6649(var3); // L: 8380
										var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8381
										Client.packetWriter.addNode(var9); // L: 8382
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 8188
									if (var15 != null) { // L: 8189
										Client.mouseCrossX = var6; // L: 8190
										Client.mouseCrossY = var7; // L: 8191
										Client.mouseCrossColor = 2; // L: 8192
										Client.mouseCrossState = 0; // L: 8193
										Client.destinationX = var0; // L: 8194
										Client.destinationY = var1; // L: 8195
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2673, Client.packetWriter.isaacCipher); // L: 8197
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8198
										var9.packetBuffer.method6705(var3); // L: 8199
										Client.packetWriter.addNode(var9); // L: 8200
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 8141
									if (var15 != null) { // L: 8142
										Client.mouseCrossX = var6; // L: 8143
										Client.mouseCrossY = var7; // L: 8144
										Client.mouseCrossColor = 2; // L: 8145
										Client.mouseCrossState = 0; // L: 8146
										Client.destinationX = var0; // L: 8147
										Client.destinationY = var1; // L: 8148
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2674, Client.packetWriter.isaacCipher); // L: 8150
										var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8151
										var9.packetBuffer.writeShort(var3); // L: 8152
										Client.packetWriter.addNode(var9); // L: 8153
									}
								} else if (var2 != 1007 && var2 != 57) {
									if (var2 == 58) {
										var16 = class17.getWidgetChild(var1, var0); // L: 8157
										if (var16 != null) { // L: 8158
											var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2676, Client.packetWriter.isaacCipher); // L: 8160
											var9.packetBuffer.method6649(var16.itemId); // L: 8161
											var9.packetBuffer.writeIntME(var1); // L: 8162
											var9.packetBuffer.method6705(Client.selectedSpellChildIndex); // L: 8163
											var9.packetBuffer.method6648(var0); // L: 8164
											var9.packetBuffer.writeInt(class15.selectedSpellWidget); // L: 8165
											var9.packetBuffer.writeShort(Client.field634); // L: 8166
											Client.packetWriter.addNode(var9); // L: 8167
										}
									} else if (var2 == 1001) {
										Client.mouseCrossX = var6; // L: 8081
										Client.mouseCrossY = var7; // L: 8082
										Client.mouseCrossColor = 2; // L: 8083
										Client.mouseCrossState = 0; // L: 8084
										Client.destinationX = var0; // L: 8085
										Client.destinationY = var1; // L: 8086
										var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2623, Client.packetWriter.isaacCipher); // L: 8088
										var8.packetBuffer.method6649(var3); // L: 8089
										var8.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8090
										var8.packetBuffer.method6705(WorldMapSprite.baseY + var1); // L: 8091
										var8.packetBuffer.method6648(var0 + class15.baseX); // L: 8092
										Client.packetWriter.addNode(var8); // L: 8093
									} else if (var2 == 1002) {
										Client.mouseCrossX = var6; // L: 8124
										Client.mouseCrossY = var7; // L: 8125
										Client.mouseCrossColor = 2; // L: 8126
										Client.mouseCrossState = 0; // L: 8127
										var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2626, Client.packetWriter.isaacCipher); // L: 8129
										var8.packetBuffer.writeShort(var3); // L: 8130
										Client.packetWriter.addNode(var8); // L: 8131
									} else if (var2 == 1003) {
										Client.mouseCrossX = var6; // L: 8171
										Client.mouseCrossY = var7; // L: 8172
										Client.mouseCrossColor = 2; // L: 8173
										Client.mouseCrossState = 0; // L: 8174
										var13 = Client.npcs[var3]; // L: 8175
										if (var13 != null) { // L: 8176
											NPCComposition var17 = var13.definition; // L: 8177
											if (var17.transforms != null) { // L: 8178
												var17 = var17.transform();
											}

											if (var17 != null) { // L: 8179
												var11 = InterfaceParent.getPacketBufferNode(ClientPacket.field2634, Client.packetWriter.isaacCipher); // L: 8181
												var11.packetBuffer.method6649(var17.id); // L: 8182
												Client.packetWriter.addNode(var11); // L: 8183
											}
										}
									} else if (var2 == 1004) {
										Client.mouseCrossX = var6; // L: 8577
										Client.mouseCrossY = var7; // L: 8578
										Client.mouseCrossColor = 2; // L: 8579
										Client.mouseCrossState = 0; // L: 8580
										var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2629, Client.packetWriter.isaacCipher); // L: 8582
										var8.packetBuffer.writeShort(var3); // L: 8583
										Client.packetWriter.addNode(var8); // L: 8584
									} else if (var2 == 1005) {
										var16 = WorldMapData_1.getWidget(var1); // L: 8716
										if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 8717
											UserComparator10.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class250.ItemDefinition_get(var3).name);
										} else {
											var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2629, Client.packetWriter.isaacCipher); // L: 8720
											var9.packetBuffer.writeShort(var3); // L: 8721
											Client.packetWriter.addNode(var9); // L: 8722
										}

										Client.field869 = 0; // L: 8724
										Login.field1034 = WorldMapData_1.getWidget(var1); // L: 8725
										Client.field729 = var0; // L: 8726
									} else if (var2 == 1012 || var2 == 1011 || var2 == 1009 || var2 == 1008 || var2 == 1010) {
										class80.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 8666
									}
								} else {
									var16 = class17.getWidgetChild(var1, var0); // L: 8684
									if (var16 != null) { // L: 8685
										MouseHandler.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 8686
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 8728
			Client.isItemSelected = 0; // L: 8729
			Script.invalidateWidget(WorldMapData_1.getWidget(class246.selectedItemWidget)); // L: 8730
		}

		if (Client.isSpellSelected) { // L: 8732
			class20.Widget_runOnTargetLeave();
		}

		if (Login.field1034 != null && Client.field869 == 0) { // L: 8733
			Script.invalidateWidget(Login.field1034);
		}

	} // L: 8734
}
