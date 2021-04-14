import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = -1797290331
	)
	static int field1435;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;B)I",
		garbageValue = "6"
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

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1402191695"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 7979
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 7980
			Client.mouseCrossX = var6; // L: 8755
			Client.mouseCrossY = var7; // L: 8756
			Client.mouseCrossColor = 2; // L: 8757
			Client.mouseCrossState = 0; // L: 8758
			Client.destinationX = var0; // L: 8759
			Client.destinationY = var1; // L: 8760
			var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2322, Client.packetWriter.isaacCipher); // L: 8762
			var8.packetBuffer.method6771(Client.selectedItemId); // L: 8763
			var8.packetBuffer.writeInt(UserComparator6.selectedItemWidget); // L: 8764
			var8.packetBuffer.writeShort(var3); // L: 8765
			var8.packetBuffer.writeIntME(class208.selectedItemSlot); // L: 8766
			var8.packetBuffer.writeShort(Tile.baseY + var1); // L: 8767
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8768
			var8.packetBuffer.writeShort(var0 + ItemLayer.baseX); // L: 8769
			Client.packetWriter.addNode(var8); // L: 8770
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 8408
			Client.mouseCrossY = var7; // L: 8409
			Client.mouseCrossColor = 2; // L: 8410
			Client.mouseCrossState = 0; // L: 8411
			Client.destinationX = var0; // L: 8412
			Client.destinationY = var1; // L: 8413
			var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2229, Client.packetWriter.isaacCipher); // L: 8415
			var8.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 8416
			var8.packetBuffer.method6614(var0 + ItemLayer.baseX); // L: 8417
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8418
			var8.packetBuffer.method6614(Tile.baseY + var1); // L: 8419
			var8.packetBuffer.method6614(var3); // L: 8420
			var8.packetBuffer.method6625(class148.selectedSpellWidget); // L: 8421
			Client.packetWriter.addNode(var8); // L: 8422
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 8232
			Client.mouseCrossY = var7; // L: 8233
			Client.mouseCrossColor = 2; // L: 8234
			Client.mouseCrossState = 0; // L: 8235
			Client.destinationX = var0; // L: 8236
			Client.destinationY = var1; // L: 8237
			var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2222, Client.packetWriter.isaacCipher); // L: 8239
			var8.packetBuffer.writeIntME(Tile.baseY + var1); // L: 8240
			var8.packetBuffer.writeShortLE(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8241
			var8.packetBuffer.method6771(var3); // L: 8242
			var8.packetBuffer.writeShort(var0 + ItemLayer.baseX); // L: 8243
			Client.packetWriter.addNode(var8); // L: 8244
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 8512
			Client.mouseCrossY = var7; // L: 8513
			Client.mouseCrossColor = 2; // L: 8514
			Client.mouseCrossState = 0; // L: 8515
			Client.destinationX = var0; // L: 8516
			Client.destinationY = var1; // L: 8517
			var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2292, Client.packetWriter.isaacCipher); // L: 8519
			var8.packetBuffer.method6614(Tile.baseY + var1); // L: 8520
			var8.packetBuffer.writeShort(var0 + ItemLayer.baseX); // L: 8521
			var8.packetBuffer.writeShortLE(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8522
			var8.packetBuffer.method6614(var3); // L: 8523
			Client.packetWriter.addNode(var8); // L: 8524
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 8700
			Client.mouseCrossY = var7; // L: 8701
			Client.mouseCrossColor = 2; // L: 8702
			Client.mouseCrossState = 0; // L: 8703
			Client.destinationX = var0; // L: 8704
			Client.destinationY = var1; // L: 8705
			var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2296, Client.packetWriter.isaacCipher); // L: 8707
			var8.packetBuffer.method6771(var0 + ItemLayer.baseX); // L: 8708
			var8.packetBuffer.method6771(var3); // L: 8709
			var8.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8710
			var8.packetBuffer.method6771(Tile.baseY + var1); // L: 8711
			Client.packetWriter.addNode(var8); // L: 8712
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 8630
			Client.mouseCrossY = var7; // L: 8631
			Client.mouseCrossColor = 2; // L: 8632
			Client.mouseCrossState = 0; // L: 8633
			Client.destinationX = var0; // L: 8634
			Client.destinationY = var1; // L: 8635
			var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2261, Client.packetWriter.isaacCipher); // L: 8637
			var8.packetBuffer.writeShort(var3); // L: 8638
			var8.packetBuffer.method6771(Tile.baseY + var1); // L: 8639
			var8.packetBuffer.writeIntME(var0 + ItemLayer.baseX); // L: 8640
			var8.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8641
			Client.packetWriter.addNode(var8); // L: 8642
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 8194
				if (var13 != null) { // L: 8195
					Client.mouseCrossX = var6; // L: 8196
					Client.mouseCrossY = var7; // L: 8197
					Client.mouseCrossColor = 2; // L: 8198
					Client.mouseCrossState = 0; // L: 8199
					Client.destinationX = var0; // L: 8200
					Client.destinationY = var1; // L: 8201
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2248, Client.packetWriter.isaacCipher); // L: 8203
					var9.packetBuffer.writeInt(UserComparator6.selectedItemWidget); // L: 8204
					var9.packetBuffer.method6614(Client.selectedItemId); // L: 8205
					var9.packetBuffer.method6614(class208.selectedItemSlot); // L: 8206
					var9.packetBuffer.writeShortLE(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8207
					var9.packetBuffer.writeIntME(var3); // L: 8208
					Client.packetWriter.addNode(var9); // L: 8209
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 8145
				if (var13 != null) { // L: 8146
					Client.mouseCrossX = var6; // L: 8147
					Client.mouseCrossY = var7; // L: 8148
					Client.mouseCrossColor = 2; // L: 8149
					Client.mouseCrossState = 0; // L: 8150
					Client.destinationX = var0; // L: 8151
					Client.destinationY = var1; // L: 8152
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2215, Client.packetWriter.isaacCipher); // L: 8154
					var9.packetBuffer.writeInt(class148.selectedSpellWidget); // L: 8155
					var9.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8156
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8157
					var9.packetBuffer.method6771(var3); // L: 8158
					Client.packetWriter.addNode(var9); // L: 8159
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 8566
				if (var13 != null) { // L: 8567
					Client.mouseCrossX = var6; // L: 8568
					Client.mouseCrossY = var7; // L: 8569
					Client.mouseCrossColor = 2; // L: 8570
					Client.mouseCrossState = 0; // L: 8571
					Client.destinationX = var0; // L: 8572
					Client.destinationY = var1; // L: 8573
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2278, Client.packetWriter.isaacCipher); // L: 8575
					var9.packetBuffer.method6614(var3); // L: 8576
					var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8577
					Client.packetWriter.addNode(var9); // L: 8578
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 8614
				if (var13 != null) { // L: 8615
					Client.mouseCrossX = var6; // L: 8616
					Client.mouseCrossY = var7; // L: 8617
					Client.mouseCrossColor = 2; // L: 8618
					Client.mouseCrossState = 0; // L: 8619
					Client.destinationX = var0; // L: 8620
					Client.destinationY = var1; // L: 8621
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2242, Client.packetWriter.isaacCipher); // L: 8623
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8624
					var9.packetBuffer.method6771(var3); // L: 8625
					Client.packetWriter.addNode(var9); // L: 8626
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 8216
				if (var13 != null) { // L: 8217
					Client.mouseCrossX = var6; // L: 8218
					Client.mouseCrossY = var7; // L: 8219
					Client.mouseCrossColor = 2; // L: 8220
					Client.mouseCrossState = 0; // L: 8221
					Client.destinationX = var0; // L: 8222
					Client.destinationY = var1; // L: 8223
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2258, Client.packetWriter.isaacCipher); // L: 8225
					var9.packetBuffer.method6614(var3); // L: 8226
					var9.packetBuffer.writeShortLE(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8227
					Client.packetWriter.addNode(var9); // L: 8228
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 8302
				if (var13 != null) { // L: 8303
					Client.mouseCrossX = var6; // L: 8304
					Client.mouseCrossY = var7; // L: 8305
					Client.mouseCrossColor = 2; // L: 8306
					Client.mouseCrossState = 0; // L: 8307
					Client.destinationX = var0; // L: 8308
					Client.destinationY = var1; // L: 8309
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2282, Client.packetWriter.isaacCipher); // L: 8311
					var9.packetBuffer.method6771(var3); // L: 8312
					var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8313
					Client.packetWriter.addNode(var9); // L: 8314
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 8113
				if (var13 != null) { // L: 8114
					Client.mouseCrossX = var6; // L: 8115
					Client.mouseCrossY = var7; // L: 8116
					Client.mouseCrossColor = 2; // L: 8117
					Client.mouseCrossState = 0; // L: 8118
					Client.destinationX = var0; // L: 8119
					Client.destinationY = var1; // L: 8120
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2309, Client.packetWriter.isaacCipher); // L: 8122
					var9.packetBuffer.method6614(var3); // L: 8123
					var9.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8124
					Client.packetWriter.addNode(var9); // L: 8125
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 8681
					if (var15 != null) { // L: 8682
						Client.mouseCrossX = var6; // L: 8683
						Client.mouseCrossY = var7; // L: 8684
						Client.mouseCrossColor = 2; // L: 8685
						Client.mouseCrossState = 0; // L: 8686
						Client.destinationX = var0; // L: 8687
						Client.destinationY = var1; // L: 8688
						var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher); // L: 8690
						var9.packetBuffer.method6624(UserComparator6.selectedItemWidget); // L: 8691
						var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8692
						var9.packetBuffer.writeShort(Client.selectedItemId); // L: 8693
						var9.packetBuffer.writeIntME(class208.selectedItemSlot); // L: 8694
						var9.packetBuffer.method6614(var3); // L: 8695
						Client.packetWriter.addNode(var9); // L: 8696
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 8390
					if (var15 != null) { // L: 8391
						Client.mouseCrossX = var6; // L: 8392
						Client.mouseCrossY = var7; // L: 8393
						Client.mouseCrossColor = 2; // L: 8394
						Client.mouseCrossState = 0; // L: 8395
						Client.destinationX = var0; // L: 8396
						Client.destinationY = var1; // L: 8397
						var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2265, Client.packetWriter.isaacCipher); // L: 8399
						var9.packetBuffer.method6624(class148.selectedSpellWidget); // L: 8400
						var9.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8401
						var9.packetBuffer.writeIntME(var3); // L: 8402
						var9.packetBuffer.method6771(Client.selectedSpellChildIndex); // L: 8403
						Client.packetWriter.addNode(var9); // L: 8404
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 8483
					Client.mouseCrossY = var7; // L: 8484
					Client.mouseCrossColor = 2; // L: 8485
					Client.mouseCrossState = 0; // L: 8486
					Client.destinationX = var0; // L: 8487
					Client.destinationY = var1; // L: 8488
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2259, Client.packetWriter.isaacCipher); // L: 8490
					var8.packetBuffer.method6614(class208.selectedItemSlot); // L: 8491
					var8.packetBuffer.method6625(UserComparator6.selectedItemWidget); // L: 8492
					var8.packetBuffer.method6771(var0 + ItemLayer.baseX); // L: 8493
					var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8494
					var8.packetBuffer.method6614(Client.selectedItemId); // L: 8495
					var8.packetBuffer.method6614(Tile.baseY + var1); // L: 8496
					var8.packetBuffer.writeShort(var3); // L: 8497
					Client.packetWriter.addNode(var8); // L: 8498
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 8549
					Client.mouseCrossY = var7; // L: 8550
					Client.mouseCrossColor = 2; // L: 8551
					Client.mouseCrossState = 0; // L: 8552
					Client.destinationX = var0; // L: 8553
					Client.destinationY = var1; // L: 8554
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2321, Client.packetWriter.isaacCipher); // L: 8556
					var8.packetBuffer.writeInt(class148.selectedSpellWidget); // L: 8557
					var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8558
					var8.packetBuffer.method6771(var3); // L: 8559
					var8.packetBuffer.writeIntME(Tile.baseY + var1); // L: 8560
					var8.packetBuffer.method6614(Client.selectedSpellChildIndex); // L: 8561
					var8.packetBuffer.writeShort(var0 + ItemLayer.baseX); // L: 8562
					Client.packetWriter.addNode(var8); // L: 8563
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 8452
					Client.mouseCrossY = var7; // L: 8453
					Client.mouseCrossColor = 2; // L: 8454
					Client.mouseCrossState = 0; // L: 8455
					Client.destinationX = var0; // L: 8456
					Client.destinationY = var1; // L: 8457
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2232, Client.packetWriter.isaacCipher); // L: 8459
					var8.packetBuffer.method6614(var0 + ItemLayer.baseX); // L: 8460
					var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8461
					var8.packetBuffer.method6614(Tile.baseY + var1); // L: 8462
					var8.packetBuffer.writeShort(var3); // L: 8463
					Client.packetWriter.addNode(var8); // L: 8464
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 8084
					Client.mouseCrossY = var7; // L: 8085
					Client.mouseCrossColor = 2; // L: 8086
					Client.mouseCrossState = 0; // L: 8087
					Client.destinationX = var0; // L: 8088
					Client.destinationY = var1; // L: 8089
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2260, Client.packetWriter.isaacCipher); // L: 8091
					var8.packetBuffer.writeIntME(Tile.baseY + var1); // L: 8092
					var8.packetBuffer.writeShortLE(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8093
					var8.packetBuffer.method6614(var3); // L: 8094
					var8.packetBuffer.writeIntME(var0 + ItemLayer.baseX); // L: 8095
					Client.packetWriter.addNode(var8); // L: 8096
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 8364
					Client.mouseCrossY = var7; // L: 8365
					Client.mouseCrossColor = 2; // L: 8366
					Client.mouseCrossState = 0; // L: 8367
					Client.destinationX = var0; // L: 8368
					Client.destinationY = var1; // L: 8369
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2305, Client.packetWriter.isaacCipher); // L: 8371
					var8.packetBuffer.method6771(var0 + ItemLayer.baseX); // L: 8372
					var8.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8373
					var8.packetBuffer.method6771(Tile.baseY + var1); // L: 8374
					var8.packetBuffer.writeIntME(var3); // L: 8375
					Client.packetWriter.addNode(var8); // L: 8376
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 8262
					Client.mouseCrossY = var7; // L: 8263
					Client.mouseCrossColor = 2; // L: 8264
					Client.mouseCrossState = 0; // L: 8265
					Client.destinationX = var0; // L: 8266
					Client.destinationY = var1; // L: 8267
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2303, Client.packetWriter.isaacCipher); // L: 8269
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8270
					var8.packetBuffer.writeIntME(Tile.baseY + var1); // L: 8271
					var8.packetBuffer.writeIntME(var0 + ItemLayer.baseX); // L: 8272
					var8.packetBuffer.writeShort(var3); // L: 8273
					Client.packetWriter.addNode(var8); // L: 8274
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 8247
					Client.mouseCrossY = var7; // L: 8248
					Client.mouseCrossColor = 2; // L: 8249
					Client.mouseCrossState = 0; // L: 8250
					Client.destinationX = var0; // L: 8251
					Client.destinationY = var1; // L: 8252
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2254, Client.packetWriter.isaacCipher); // L: 8254
					var8.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8255
					var8.packetBuffer.writeIntME(var0 + ItemLayer.baseX); // L: 8256
					var8.packetBuffer.writeShort(Tile.baseY + var1); // L: 8257
					var8.packetBuffer.writeIntME(var3); // L: 8258
					Client.packetWriter.addNode(var8); // L: 8259
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8715
						WorldMapArea.scene.setViewportWalking(); // L: 8716
					} else {
						WorldMapArea.scene.menuOpen(class26.Client_plane, var0, var1, true); // L: 8719
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = class139.getWidget(var1); // L: 8501
						boolean var12 = true; // L: 8502
						if (var16.contentType > 0) { // L: 8503
							var12 = ClanChat.method5644(var16);
						}

						if (var12) { // L: 8504
							var11 = ObjectComposition.getPacketBufferNode(ClientPacket.field2240, Client.packetWriter.isaacCipher); // L: 8506
							var11.packetBuffer.writeInt(var1); // L: 8507
							Client.packetWriter.addNode(var11); // L: 8508
						}
					} else {
						if (var2 == 25) {
							var16 = class231.getWidgetChild(var1, var0); // L: 7981
							if (var16 != null) { // L: 7982
								WorldMapID.Widget_runOnTargetLeave(); // L: 7983
								Strings.selectSpell(var1, var0, class223.Widget_unpackTargetMask(DirectByteArrayCopier.getWidgetFlags(var16)), var16.itemId); // L: 7984
								Client.isItemSelected = 0; // L: 7985
								Client.selectedSpellActionName = class11.Widget_getSpellActionName(var16); // L: 7986
								if (Client.selectedSpellActionName == null) { // L: 7987
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 7988
									Client.selectedSpellName = var16.dataText + DefaultsGroup.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = DefaultsGroup.colorStartTag(65280) + var16.spellName + DefaultsGroup.colorStartTag(16777215); // L: 7989
								}
							}

							return; // L: 7991
						}

						if (var2 == 26) {
							Archive.method4470(); // L: 8191
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2240, Client.packetWriter.isaacCipher); // L: 8034
								var8.packetBuffer.writeInt(var1); // L: 8035
								Client.packetWriter.addNode(var8); // L: 8036
								var14 = class139.getWidget(var1); // L: 8037
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8038
									var10 = var14.cs1Instructions[0][1]; // L: 8039
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10]; // L: 8040
									class27.changeGameOptions(var10); // L: 8041
								}
							} else if (var2 == 29) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2240, Client.packetWriter.isaacCipher); // L: 8100
								var8.packetBuffer.writeInt(var1); // L: 8101
								Client.packetWriter.addNode(var8); // L: 8102
								var14 = class139.getWidget(var1); // L: 8103
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8104
									var10 = var14.cs1Instructions[0][1]; // L: 8105
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) { // L: 8106
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0]; // L: 8107
										class27.changeGameOptions(var10); // L: 8108
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 8045
									class43.resumePauseWidget(var1, var0); // L: 8046
									Client.meslayerContinueWidget = class231.getWidgetChild(var1, var0); // L: 8047
									class29.invalidateWidget(Client.meslayerContinueWidget); // L: 8048
								}
							} else if (var2 == 31) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2274, Client.packetWriter.isaacCipher); // L: 8289
								var8.packetBuffer.method6771(var3); // L: 8290
								var8.packetBuffer.method6754(var1); // L: 8291
								var8.packetBuffer.writeIntME(Client.selectedItemId); // L: 8292
								var8.packetBuffer.writeShort(var0); // L: 8293
								var8.packetBuffer.writeShort(class208.selectedItemSlot); // L: 8294
								var8.packetBuffer.method6754(UserComparator6.selectedItemWidget); // L: 8295
								Client.packetWriter.addNode(var8); // L: 8296
								Client.field708 = 0; // L: 8297
								PacketWriter.field1394 = class139.getWidget(var1); // L: 8298
								Client.field709 = var0; // L: 8299
							} else if (var2 == 32) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2219, Client.packetWriter.isaacCipher); // L: 8164
								var8.packetBuffer.writeIntME(var0); // L: 8165
								var8.packetBuffer.writeShort(var3); // L: 8166
								var8.packetBuffer.method6624(class148.selectedSpellWidget); // L: 8167
								var8.packetBuffer.writeInt(var1); // L: 8168
								var8.packetBuffer.method6614(Client.selectedSpellChildIndex); // L: 8169
								Client.packetWriter.addNode(var8); // L: 8170
								Client.field708 = 0; // L: 8171
								PacketWriter.field1394 = class139.getWidget(var1); // L: 8172
								Client.field709 = var0; // L: 8173
							} else if (var2 == 33) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2277, Client.packetWriter.isaacCipher); // L: 8671
								var8.packetBuffer.method6625(var1); // L: 8672
								var8.packetBuffer.method6771(var3); // L: 8673
								var8.packetBuffer.method6771(var0); // L: 8674
								Client.packetWriter.addNode(var8); // L: 8675
								Client.field708 = 0; // L: 8676
								PacketWriter.field1394 = class139.getWidget(var1); // L: 8677
								Client.field709 = var0; // L: 8678
							} else if (var2 == 34) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2299, Client.packetWriter.isaacCipher); // L: 8278
								var8.packetBuffer.writeIntME(var3); // L: 8279
								var8.packetBuffer.writeIntME(var0); // L: 8280
								var8.packetBuffer.method6754(var1); // L: 8281
								Client.packetWriter.addNode(var8); // L: 8282
								Client.field708 = 0; // L: 8283
								PacketWriter.field1394 = class139.getWidget(var1); // L: 8284
								Client.field709 = var0; // L: 8285
							} else if (var2 == 35) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2264, Client.packetWriter.isaacCipher); // L: 8011
								var8.packetBuffer.writeInt(var1); // L: 8012
								var8.packetBuffer.writeIntME(var3); // L: 8013
								var8.packetBuffer.writeShort(var0); // L: 8014
								Client.packetWriter.addNode(var8); // L: 8015
								Client.field708 = 0; // L: 8016
								PacketWriter.field1394 = class139.getWidget(var1); // L: 8017
								Client.field709 = var0; // L: 8018
							} else if (var2 == 36) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2317, Client.packetWriter.isaacCipher); // L: 8442
								var8.packetBuffer.writeShort(var0); // L: 8443
								var8.packetBuffer.method6771(var3); // L: 8444
								var8.packetBuffer.method6624(var1); // L: 8445
								Client.packetWriter.addNode(var8); // L: 8446
								Client.field708 = 0; // L: 8447
								PacketWriter.field1394 = class139.getWidget(var1); // L: 8448
								Client.field709 = var0; // L: 8449
							} else if (var2 == 37) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2289, Client.packetWriter.isaacCipher); // L: 8053
								var8.packetBuffer.method6624(var1); // L: 8054
								var8.packetBuffer.writeIntME(var3); // L: 8055
								var8.packetBuffer.method6614(var0); // L: 8056
								Client.packetWriter.addNode(var8); // L: 8057
								Client.field708 = 0; // L: 8058
								PacketWriter.field1394 = class139.getWidget(var1); // L: 8059
								Client.field709 = var0; // L: 8060
							} else {
								if (var2 == 38) {
									WorldMapID.Widget_runOnTargetLeave(); // L: 8021
									var16 = class139.getWidget(var1); // L: 8022
									Client.isItemSelected = 1; // L: 8023
									class208.selectedItemSlot = var0; // L: 8024
									UserComparator6.selectedItemWidget = var1; // L: 8025
									Client.selectedItemId = var3; // L: 8026
									class29.invalidateWidget(var16); // L: 8027
									Client.selectedItemName = DefaultsGroup.colorStartTag(16748608) + class23.ItemDefinition_get(var3).name + DefaultsGroup.colorStartTag(16777215); // L: 8028
									if (Client.selectedItemName == null) { // L: 8029
										Client.selectedItemName = "null";
									}

									return; // L: 8030
								}

								if (var2 == 39) {
									var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2315, Client.packetWriter.isaacCipher); // L: 8074
									var8.packetBuffer.method6754(var1); // L: 8075
									var8.packetBuffer.method6771(var3); // L: 8076
									var8.packetBuffer.method6771(var0); // L: 8077
									Client.packetWriter.addNode(var8); // L: 8078
									Client.field708 = 0; // L: 8079
									PacketWriter.field1394 = class139.getWidget(var1); // L: 8080
									Client.field709 = var0; // L: 8081
								} else if (var2 == 40) {
									var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2325, Client.packetWriter.isaacCipher); // L: 8380
									var8.packetBuffer.method6614(var3); // L: 8381
									var8.packetBuffer.writeIntME(var0); // L: 8382
									var8.packetBuffer.method6754(var1); // L: 8383
									Client.packetWriter.addNode(var8); // L: 8384
									Client.field708 = 0; // L: 8385
									PacketWriter.field1394 = class139.getWidget(var1); // L: 8386
									Client.field709 = var0; // L: 8387
								} else if (var2 == 41) {
									var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2280, Client.packetWriter.isaacCipher); // L: 8660
									var8.packetBuffer.method6614(var3); // L: 8661
									var8.packetBuffer.method6614(var0); // L: 8662
									var8.packetBuffer.method6624(var1); // L: 8663
									Client.packetWriter.addNode(var8); // L: 8664
									Client.field708 = 0; // L: 8665
									PacketWriter.field1394 = class139.getWidget(var1); // L: 8666
									Client.field709 = var0; // L: 8667
								} else if (var2 == 42) {
									var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2257, Client.packetWriter.isaacCipher); // L: 8745
									var8.packetBuffer.method6614(var0); // L: 8746
									var8.packetBuffer.method6614(var3); // L: 8747
									var8.packetBuffer.method6754(var1); // L: 8748
									Client.packetWriter.addNode(var8); // L: 8749
									Client.field708 = 0; // L: 8750
									PacketWriter.field1394 = class139.getWidget(var1); // L: 8751
									Client.field709 = var0; // L: 8752
								} else if (var2 == 43) {
									var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2237, Client.packetWriter.isaacCipher); // L: 8724
									var8.packetBuffer.method6614(var0); // L: 8725
									var8.packetBuffer.writeInt(var1); // L: 8726
									var8.packetBuffer.method6771(var3); // L: 8727
									Client.packetWriter.addNode(var8); // L: 8728
									Client.field708 = 0; // L: 8729
									PacketWriter.field1394 = class139.getWidget(var1); // L: 8730
									Client.field709 = var0; // L: 8731
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 8527
									if (var15 != null) { // L: 8528
										Client.mouseCrossX = var6; // L: 8529
										Client.mouseCrossY = var7; // L: 8530
										Client.mouseCrossColor = 2; // L: 8531
										Client.mouseCrossState = 0; // L: 8532
										Client.destinationX = var0; // L: 8533
										Client.destinationY = var1; // L: 8534
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2318, Client.packetWriter.isaacCipher); // L: 8536
										var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8537
										var9.packetBuffer.method6614(var3); // L: 8538
										Client.packetWriter.addNode(var9); // L: 8539
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 8467
									if (var15 != null) { // L: 8468
										Client.mouseCrossX = var6; // L: 8469
										Client.mouseCrossY = var7; // L: 8470
										Client.mouseCrossColor = 2; // L: 8471
										Client.mouseCrossState = 0; // L: 8472
										Client.destinationX = var0; // L: 8473
										Client.destinationY = var1; // L: 8474
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2251, Client.packetWriter.isaacCipher); // L: 8476
										var9.packetBuffer.method6614(var3); // L: 8477
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8478
										Client.packetWriter.addNode(var9); // L: 8479
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 8598
									if (var15 != null) { // L: 8599
										Client.mouseCrossX = var6; // L: 8600
										Client.mouseCrossY = var7; // L: 8601
										Client.mouseCrossColor = 2; // L: 8602
										Client.mouseCrossState = 0; // L: 8603
										Client.destinationX = var0; // L: 8604
										Client.destinationY = var1; // L: 8605
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2275, Client.packetWriter.isaacCipher); // L: 8607
										var9.packetBuffer.writeIntME(var3); // L: 8608
										var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8609
										Client.packetWriter.addNode(var9); // L: 8610
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 7994
									if (var15 != null) { // L: 7995
										Client.mouseCrossX = var6; // L: 7996
										Client.mouseCrossY = var7; // L: 7997
										Client.mouseCrossColor = 2; // L: 7998
										Client.mouseCrossState = 0; // L: 7999
										Client.destinationX = var0; // L: 8000
										Client.destinationY = var1; // L: 8001
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher); // L: 8003
										var9.packetBuffer.writeShortLE(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8004
										var9.packetBuffer.method6771(var3); // L: 8005
										Client.packetWriter.addNode(var9); // L: 8006
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 8318
									if (var15 != null) { // L: 8319
										Client.mouseCrossX = var6; // L: 8320
										Client.mouseCrossY = var7; // L: 8321
										Client.mouseCrossColor = 2; // L: 8322
										Client.mouseCrossState = 0; // L: 8323
										Client.destinationX = var0; // L: 8324
										Client.destinationY = var1; // L: 8325
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2308, Client.packetWriter.isaacCipher); // L: 8327
										var9.packetBuffer.writeShort(var3); // L: 8328
										var9.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8329
										Client.packetWriter.addNode(var9); // L: 8330
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 8425
									if (var15 != null) { // L: 8426
										Client.mouseCrossX = var6; // L: 8427
										Client.mouseCrossY = var7; // L: 8428
										Client.mouseCrossColor = 2; // L: 8429
										Client.mouseCrossState = 0; // L: 8430
										Client.destinationX = var0; // L: 8431
										Client.destinationY = var1; // L: 8432
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2276, Client.packetWriter.isaacCipher); // L: 8434
										var9.packetBuffer.method6614(var3); // L: 8435
										var9.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8436
										Client.packetWriter.addNode(var9); // L: 8437
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 8129
									if (var15 != null) { // L: 8130
										Client.mouseCrossX = var6; // L: 8131
										Client.mouseCrossY = var7; // L: 8132
										Client.mouseCrossColor = 2; // L: 8133
										Client.mouseCrossState = 0; // L: 8134
										Client.destinationX = var0; // L: 8135
										Client.destinationY = var1; // L: 8136
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2244, Client.packetWriter.isaacCipher); // L: 8138
										var9.packetBuffer.writeShortLE(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8139
										var9.packetBuffer.method6614(var3); // L: 8140
										Client.packetWriter.addNode(var9); // L: 8141
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 8582
									if (var15 != null) { // L: 8583
										Client.mouseCrossX = var6; // L: 8584
										Client.mouseCrossY = var7; // L: 8585
										Client.mouseCrossColor = 2; // L: 8586
										Client.mouseCrossState = 0; // L: 8587
										Client.destinationX = var0; // L: 8588
										Client.destinationY = var1; // L: 8589
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2228, Client.packetWriter.isaacCipher); // L: 8591
										var9.packetBuffer.method6771(var3); // L: 8592
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8593
										Client.packetWriter.addNode(var9); // L: 8594
									}
								} else {
									label645: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = class231.getWidgetChild(var1, var0); // L: 8645
												if (var16 != null) { // L: 8646
													var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2223, Client.packetWriter.isaacCipher); // L: 8648
													var9.packetBuffer.method6614(var16.itemId); // L: 8649
													var9.packetBuffer.method6624(var1); // L: 8650
													var9.packetBuffer.writeShort(Client.field874); // L: 8651
													var9.packetBuffer.method6771(Client.selectedSpellChildIndex); // L: 8652
													var9.packetBuffer.method6625(class148.selectedSpellWidget); // L: 8653
													var9.packetBuffer.writeIntME(var0); // L: 8654
													Client.packetWriter.addNode(var9); // L: 8655
												}
												break label645;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6; // L: 8176
												Client.mouseCrossY = var7; // L: 8177
												Client.mouseCrossColor = 2; // L: 8178
												Client.mouseCrossState = 0; // L: 8179
												Client.destinationX = var0; // L: 8180
												Client.destinationY = var1; // L: 8181
												var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2285, Client.packetWriter.isaacCipher); // L: 8183
												var8.packetBuffer.writeIntME(Tile.baseY + var1); // L: 8184
												var8.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8185
												var8.packetBuffer.method6771(var3); // L: 8186
												var8.packetBuffer.method6614(var0 + ItemLayer.baseX); // L: 8187
												Client.packetWriter.addNode(var8); // L: 8188
												break label645;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6; // L: 8063
												Client.mouseCrossY = var7; // L: 8064
												Client.mouseCrossColor = 2; // L: 8065
												Client.mouseCrossState = 0; // L: 8066
												var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2246, Client.packetWriter.isaacCipher); // L: 8068
												var8.packetBuffer.method6614(var3); // L: 8069
												Client.packetWriter.addNode(var8); // L: 8070
												break label645;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6; // L: 8347
												Client.mouseCrossY = var7; // L: 8348
												Client.mouseCrossColor = 2; // L: 8349
												Client.mouseCrossState = 0; // L: 8350
												var13 = Client.npcs[var3]; // L: 8351
												if (var13 != null) { // L: 8352
													NPCComposition var17 = var13.definition; // L: 8353
													if (var17.transforms != null) { // L: 8354
														var17 = var17.transform();
													}

													if (var17 != null) { // L: 8355
														var11 = ObjectComposition.getPacketBufferNode(ClientPacket.field2290, Client.packetWriter.isaacCipher); // L: 8357
														var11.packetBuffer.method6771(var17.id); // L: 8358
														Client.packetWriter.addNode(var11); // L: 8359
													}
												}
												break label645;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6; // L: 8734
												Client.mouseCrossY = var7; // L: 8735
												Client.mouseCrossColor = 2; // L: 8736
												Client.mouseCrossState = 0; // L: 8737
												var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2295, Client.packetWriter.isaacCipher); // L: 8739
												var8.packetBuffer.method6771(var3); // L: 8740
												Client.packetWriter.addNode(var8); // L: 8741
												break label645;
											}

											if (var2 == 1005) {
												var16 = class139.getWidget(var1); // L: 8334
												if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 8335
													class69.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class23.ItemDefinition_get(var3).name);
												} else {
													var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2295, Client.packetWriter.isaacCipher); // L: 8338
													var9.packetBuffer.method6771(var3); // L: 8339
													Client.packetWriter.addNode(var9); // L: 8340
												}

												Client.field708 = 0; // L: 8342
												PacketWriter.field1394 = class139.getWidget(var1); // L: 8343
												Client.field709 = var0; // L: 8344
												break label645;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1008 || var2 == 1012) {
													UserComparator4.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 8213
												}
												break label645;
											}
										}

										var16 = class231.getWidgetChild(var1, var0); // L: 8543
										if (var16 != null) { // L: 8544
											class376.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 8545
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 8772
			Client.isItemSelected = 0; // L: 8773
			class29.invalidateWidget(class139.getWidget(UserComparator6.selectedItemWidget)); // L: 8774
		}

		if (Client.isSpellSelected) { // L: 8776
			WorldMapID.Widget_runOnTargetLeave();
		}

		if (PacketWriter.field1394 != null && Client.field708 == 0) { // L: 8777
			class29.invalidateWidget(PacketWriter.field1394);
		}

	} // L: 8778
}
