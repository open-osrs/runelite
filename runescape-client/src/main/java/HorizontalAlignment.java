import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	field1626(0, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	field1632(2, 2);

	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 822805303
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1511289313
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -571608141
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-313207505"
	)
	static final void method2733() {
		int[] var0 = Players.Players_indices; // L: 3854

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3855
			Player var4 = Client.players[var0[var1]]; // L: 3856
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) { // L: 3857
				--var4.overheadTextCyclesRemaining; // L: 3858
				if (var4.overheadTextCyclesRemaining == 0) {
					var4.overheadText = null; // L: 3859
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) { // L: 3862
			int var2 = Client.npcIndices[var1]; // L: 3863
			NPC var3 = Client.npcs[var2]; // L: 3864
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) { // L: 3865
				--var3.overheadTextCyclesRemaining; // L: 3866
				if (var3.overheadTextCyclesRemaining == 0) { // L: 3867
					var3.overheadText = null;
				}
			}
		}

	} // L: 3870

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "4"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 8068
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 8069
			Client.mouseCrossX = var6; // L: 8663
			Client.mouseCrossY = var7; // L: 8664
			Client.mouseCrossColor = 2; // L: 8665
			Client.mouseCrossState = 0; // L: 8666
			Client.destinationX = var0; // L: 8667
			Client.destinationY = var1; // L: 8668
			var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2656, Client.packetWriter.isaacCipher); // L: 8670
			var8.packetBuffer.method6483(class8.selectedItemId); // L: 8671
			var8.packetBuffer.method6484(var3); // L: 8672
			var8.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8673
			var8.packetBuffer.method6484(Messages.baseY + var1); // L: 8674
			var8.packetBuffer.writeInt(class35.selectedItemWidget); // L: 8675
			var8.packetBuffer.method6484(var0 + JagexCache.baseX); // L: 8676
			var8.packetBuffer.writeShort(UserComparator8.selectedItemSlot); // L: 8677
			Client.packetWriter.addNode(var8); // L: 8678
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 8153
			Client.mouseCrossY = var7; // L: 8154
			Client.mouseCrossColor = 2; // L: 8155
			Client.mouseCrossState = 0; // L: 8156
			Client.destinationX = var0; // L: 8157
			Client.destinationY = var1; // L: 8158
			var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2636, Client.packetWriter.isaacCipher); // L: 8159
			var8.packetBuffer.method6482(var0 + JagexCache.baseX); // L: 8160
			var8.packetBuffer.writeShort(var3); // L: 8161
			var8.packetBuffer.method6482(Client.field773); // L: 8162
			var8.packetBuffer.writeShort(Messages.baseY + var1); // L: 8163
			var8.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8164
			var8.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8165
			var8.packetBuffer.method6445(class6.selectedSpellWidget); // L: 8166
			Client.packetWriter.addNode(var8); // L: 8167
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 8338
			Client.mouseCrossY = var7; // L: 8339
			Client.mouseCrossColor = 2; // L: 8340
			Client.mouseCrossState = 0; // L: 8341
			Client.destinationX = var0; // L: 8342
			Client.destinationY = var1; // L: 8343
			var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2634, Client.packetWriter.isaacCipher); // L: 8345
			var8.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8346
			var8.packetBuffer.method6484(var3); // L: 8347
			var8.packetBuffer.writeShort(var0 + JagexCache.baseX); // L: 8348
			var8.packetBuffer.method6482(Messages.baseY + var1); // L: 8349
			Client.packetWriter.addNode(var8); // L: 8350
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 8706
			Client.mouseCrossY = var7; // L: 8707
			Client.mouseCrossColor = 2; // L: 8708
			Client.mouseCrossState = 0; // L: 8709
			Client.destinationX = var0; // L: 8710
			Client.destinationY = var1; // L: 8711
			var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2619, Client.packetWriter.isaacCipher); // L: 8713
			var8.packetBuffer.writeShort(var0 + JagexCache.baseX); // L: 8714
			var8.packetBuffer.method6484(var3); // L: 8715
			var8.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8716
			var8.packetBuffer.method6484(Messages.baseY + var1); // L: 8717
			Client.packetWriter.addNode(var8); // L: 8718
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 8189
			Client.mouseCrossY = var7; // L: 8190
			Client.mouseCrossColor = 2; // L: 8191
			Client.mouseCrossState = 0; // L: 8192
			Client.destinationX = var0; // L: 8193
			Client.destinationY = var1; // L: 8194
			var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2615, Client.packetWriter.isaacCipher); // L: 8196
			var8.packetBuffer.method6482(var0 + JagexCache.baseX); // L: 8197
			var8.packetBuffer.method6484(Messages.baseY + var1); // L: 8198
			var8.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8199
			var8.packetBuffer.method6483(var3); // L: 8200
			Client.packetWriter.addNode(var8); // L: 8201
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 8557
			Client.mouseCrossY = var7; // L: 8558
			Client.mouseCrossColor = 2; // L: 8559
			Client.mouseCrossState = 0; // L: 8560
			Client.destinationX = var0; // L: 8561
			Client.destinationY = var1; // L: 8562
			var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2572, Client.packetWriter.isaacCipher); // L: 8564
			var8.packetBuffer.method6483(var3); // L: 8565
			var8.packetBuffer.method6483(Messages.baseY + var1); // L: 8566
			var8.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8567
			var8.packetBuffer.method6484(var0 + JagexCache.baseX); // L: 8568
			Client.packetWriter.addNode(var8); // L: 8569
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 8289
				if (var13 != null) { // L: 8290
					Client.mouseCrossX = var6; // L: 8291
					Client.mouseCrossY = var7; // L: 8292
					Client.mouseCrossColor = 2; // L: 8293
					Client.mouseCrossState = 0; // L: 8294
					Client.destinationX = var0; // L: 8295
					Client.destinationY = var1; // L: 8296
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2579, Client.packetWriter.isaacCipher); // L: 8298
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8299
					var9.packetBuffer.method6484(class8.selectedItemId); // L: 8300
					var9.packetBuffer.method6445(class35.selectedItemWidget); // L: 8301
					var9.packetBuffer.method6483(var3); // L: 8302
					var9.packetBuffer.method6482(UserComparator8.selectedItemSlot); // L: 8303
					Client.packetWriter.addNode(var9); // L: 8304
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 8501
				if (var13 != null) { // L: 8502
					Client.mouseCrossX = var6; // L: 8503
					Client.mouseCrossY = var7; // L: 8504
					Client.mouseCrossColor = 2; // L: 8505
					Client.mouseCrossState = 0; // L: 8506
					Client.destinationX = var0; // L: 8507
					Client.destinationY = var1; // L: 8508
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2591, Client.packetWriter.isaacCipher); // L: 8509
					var9.packetBuffer.method6445(class6.selectedSpellWidget); // L: 8510
					var9.packetBuffer.method6482(Client.field773); // L: 8511
					var9.packetBuffer.method6482(var3); // L: 8512
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8513
					var9.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8514
					Client.packetWriter.addNode(var9); // L: 8515
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 8745
				if (var13 != null) { // L: 8746
					Client.mouseCrossX = var6; // L: 8747
					Client.mouseCrossY = var7; // L: 8748
					Client.mouseCrossColor = 2; // L: 8749
					Client.mouseCrossState = 0; // L: 8750
					Client.destinationX = var0; // L: 8751
					Client.destinationY = var1; // L: 8752
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2597, Client.packetWriter.isaacCipher); // L: 8754
					var9.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8755
					var9.packetBuffer.method6482(var3); // L: 8756
					Client.packetWriter.addNode(var9); // L: 8757
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 8809
				if (var13 != null) { // L: 8810
					Client.mouseCrossX = var6; // L: 8811
					Client.mouseCrossY = var7; // L: 8812
					Client.mouseCrossColor = 2; // L: 8813
					Client.mouseCrossState = 0; // L: 8814
					Client.destinationX = var0; // L: 8815
					Client.destinationY = var1; // L: 8816
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2612, Client.packetWriter.isaacCipher); // L: 8818
					var9.packetBuffer.method6483(var3); // L: 8819
					var9.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8820
					Client.packetWriter.addNode(var9); // L: 8821
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 8761
				if (var13 != null) { // L: 8762
					Client.mouseCrossX = var6; // L: 8763
					Client.mouseCrossY = var7; // L: 8764
					Client.mouseCrossColor = 2; // L: 8765
					Client.mouseCrossState = 0; // L: 8766
					Client.destinationX = var0; // L: 8767
					Client.destinationY = var1; // L: 8768
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2602, Client.packetWriter.isaacCipher); // L: 8770
					var9.packetBuffer.method6482(var3); // L: 8771
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8772
					Client.packetWriter.addNode(var9); // L: 8773
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 8137
				if (var13 != null) { // L: 8138
					Client.mouseCrossX = var6; // L: 8139
					Client.mouseCrossY = var7; // L: 8140
					Client.mouseCrossColor = 2; // L: 8141
					Client.mouseCrossState = 0; // L: 8142
					Client.destinationX = var0; // L: 8143
					Client.destinationY = var1; // L: 8144
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2594, Client.packetWriter.isaacCipher); // L: 8146
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8147
					var9.packetBuffer.method6483(var3); // L: 8148
					Client.packetWriter.addNode(var9); // L: 8149
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 8572
				if (var13 != null) { // L: 8573
					Client.mouseCrossX = var6; // L: 8574
					Client.mouseCrossY = var7; // L: 8575
					Client.mouseCrossColor = 2; // L: 8576
					Client.mouseCrossState = 0; // L: 8577
					Client.destinationX = var0; // L: 8578
					Client.destinationY = var1; // L: 8579
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2618, Client.packetWriter.isaacCipher); // L: 8581
					var9.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8582
					var9.packetBuffer.method6484(var3); // L: 8583
					Client.packetWriter.addNode(var9); // L: 8584
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 8170
					if (var15 != null) { // L: 8171
						Client.mouseCrossX = var6; // L: 8172
						Client.mouseCrossY = var7; // L: 8173
						Client.mouseCrossColor = 2; // L: 8174
						Client.mouseCrossState = 0; // L: 8175
						Client.destinationX = var0; // L: 8176
						Client.destinationY = var1; // L: 8177
						var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2616, Client.packetWriter.isaacCipher); // L: 8179
						var9.packetBuffer.writeIntME(class35.selectedItemWidget); // L: 8180
						var9.packetBuffer.method6483(class8.selectedItemId); // L: 8181
						var9.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8182
						var9.packetBuffer.method6483(UserComparator8.selectedItemSlot); // L: 8183
						var9.packetBuffer.writeShort(var3); // L: 8184
						Client.packetWriter.addNode(var9); // L: 8185
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 8617
					if (var15 != null) { // L: 8618
						Client.mouseCrossX = var6; // L: 8619
						Client.mouseCrossY = var7; // L: 8620
						Client.mouseCrossColor = 2; // L: 8621
						Client.mouseCrossState = 0; // L: 8622
						Client.destinationX = var0; // L: 8623
						Client.destinationY = var1; // L: 8624
						var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2608, Client.packetWriter.isaacCipher); // L: 8625
						var9.packetBuffer.method6483(Client.selectedSpellChildIndex); // L: 8626
						var9.packetBuffer.method6484(var3); // L: 8627
						var9.packetBuffer.method6493(class6.selectedSpellWidget); // L: 8628
						var9.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8629
						var9.packetBuffer.method6484(Client.field773); // L: 8630
						Client.packetWriter.addNode(var9); // L: 8631
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 8456
					Client.mouseCrossY = var7; // L: 8457
					Client.mouseCrossColor = 2; // L: 8458
					Client.mouseCrossState = 0; // L: 8459
					Client.destinationX = var0; // L: 8460
					Client.destinationY = var1; // L: 8461
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2570, Client.packetWriter.isaacCipher); // L: 8463
					var8.packetBuffer.method6482(UserComparator8.selectedItemSlot); // L: 8464
					var8.packetBuffer.method6483(var3); // L: 8465
					var8.packetBuffer.method6482(class8.selectedItemId); // L: 8466
					var8.packetBuffer.method6484(Messages.baseY + var1); // L: 8467
					var8.packetBuffer.method6482(var0 + JagexCache.baseX); // L: 8468
					var8.packetBuffer.method6445(class35.selectedItemWidget); // L: 8469
					var8.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8470
					Client.packetWriter.addNode(var8); // L: 8471
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 8635
					Client.mouseCrossY = var7; // L: 8636
					Client.mouseCrossColor = 2; // L: 8637
					Client.mouseCrossState = 0; // L: 8638
					Client.destinationX = var0; // L: 8639
					Client.destinationY = var1; // L: 8640
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2661, Client.packetWriter.isaacCipher); // L: 8641
					var8.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8642
					var8.packetBuffer.method6493(class6.selectedSpellWidget); // L: 8643
					var8.packetBuffer.method6482(Messages.baseY + var1); // L: 8644
					var8.packetBuffer.method6484(Client.field773); // L: 8645
					var8.packetBuffer.method6483(var3); // L: 8646
					var8.packetBuffer.writeShort(var0 + JagexCache.baseX); // L: 8647
					var8.packetBuffer.method6482(Client.selectedSpellChildIndex); // L: 8648
					Client.packetWriter.addNode(var8); // L: 8649
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 8721
					Client.mouseCrossY = var7; // L: 8722
					Client.mouseCrossColor = 2; // L: 8723
					Client.mouseCrossState = 0; // L: 8724
					Client.destinationX = var0; // L: 8725
					Client.destinationY = var1; // L: 8726
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2617, Client.packetWriter.isaacCipher); // L: 8728
					var8.packetBuffer.writeShort(var3); // L: 8729
					var8.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8730
					var8.packetBuffer.method6484(Messages.baseY + var1); // L: 8731
					var8.packetBuffer.writeShort(var0 + JagexCache.baseX); // L: 8732
					Client.packetWriter.addNode(var8); // L: 8733
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 8474
					Client.mouseCrossY = var7; // L: 8475
					Client.mouseCrossColor = 2; // L: 8476
					Client.mouseCrossState = 0; // L: 8477
					Client.destinationX = var0; // L: 8478
					Client.destinationY = var1; // L: 8479
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2652, Client.packetWriter.isaacCipher); // L: 8481
					var8.packetBuffer.method6482(var0 + JagexCache.baseX); // L: 8482
					var8.packetBuffer.method6484(Messages.baseY + var1); // L: 8483
					var8.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8484
					var8.packetBuffer.method6482(var3); // L: 8485
					Client.packetWriter.addNode(var8); // L: 8486
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 8308
					Client.mouseCrossY = var7; // L: 8309
					Client.mouseCrossColor = 2; // L: 8310
					Client.mouseCrossState = 0; // L: 8311
					Client.destinationX = var0; // L: 8312
					Client.destinationY = var1; // L: 8313
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2627, Client.packetWriter.isaacCipher); // L: 8315
					var8.packetBuffer.method6483(var3); // L: 8316
					var8.packetBuffer.method6482(var0 + JagexCache.baseX); // L: 8317
					var8.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8318
					var8.packetBuffer.method6484(Messages.baseY + var1); // L: 8319
					Client.packetWriter.addNode(var8); // L: 8320
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 8353
					Client.mouseCrossY = var7; // L: 8354
					Client.mouseCrossColor = 2; // L: 8355
					Client.mouseCrossState = 0; // L: 8356
					Client.destinationX = var0; // L: 8357
					Client.destinationY = var1; // L: 8358
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2645, Client.packetWriter.isaacCipher); // L: 8360
					var8.packetBuffer.method6484(var3); // L: 8361
					var8.packetBuffer.writeShort(Messages.baseY + var1); // L: 8362
					var8.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8363
					var8.packetBuffer.writeShort(var0 + JagexCache.baseX); // L: 8364
					Client.packetWriter.addNode(var8); // L: 8365
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 8323
					Client.mouseCrossY = var7; // L: 8324
					Client.mouseCrossColor = 2; // L: 8325
					Client.mouseCrossState = 0; // L: 8326
					Client.destinationX = var0; // L: 8327
					Client.destinationY = var1; // L: 8328
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2642, Client.packetWriter.isaacCipher); // L: 8330
					var8.packetBuffer.method6484(var3); // L: 8331
					var8.packetBuffer.method6483(var0 + JagexCache.baseX); // L: 8332
					var8.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8333
					var8.packetBuffer.method6483(Messages.baseY + var1); // L: 8334
					Client.packetWriter.addNode(var8); // L: 8335
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8204
						class5.scene.setViewportWalking(); // L: 8205
					} else {
						class5.scene.menuOpen(ParamComposition.Client_plane, var0, var1, true); // L: 8208
					}
				} else {
					PacketBufferNode var10;
					Widget var16;
					if (var2 == 24) {
						var16 = DevicePcmPlayerProvider.getWidget(var1); // L: 8519
						boolean var12 = true; // L: 8520
						if (var16.contentType > 0) { // L: 8521
							var12 = WorldMapSprite.method3580(var16);
						}

						if (var12) { // L: 8522
							var10 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2630, Client.packetWriter.isaacCipher); // L: 8524
							var10.packetBuffer.writeInt(var1); // L: 8525
							Client.packetWriter.addNode(var10); // L: 8526
						}
					} else {
						if (var2 == 25) {
							var16 = PacketWriter.getWidgetChild(var1, var0); // L: 8588
							if (var16 != null) { // L: 8589
								class15.Widget_runOnTargetLeave(); // L: 8590
								GrandExchangeOffer.selectSpell(var1, var0, AttackOption.Widget_unpackTargetMask(class26.getWidgetFlags(var16)), var16.itemId); // L: 8591
								Client.isItemSelected = 0; // L: 8592
								Client.selectedSpellActionName = UserComparator9.Widget_getSpellActionName(var16); // L: 8593
								if (Client.selectedSpellActionName == null) { // L: 8594
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 8595
									Client.selectedSpellName = var16.dataText + colorStartTag(16777215);
								} else {
									Client.selectedSpellName = colorStartTag(65280) + var16.spellName + colorStartTag(16777215); // L: 8596
								}
							}

							return; // L: 8598
						}

						if (var2 == 26) {
							class80.method1943(); // L: 8229
						} else {
							int var11;
							Widget var14;
							if (var2 == 28) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2630, Client.packetWriter.isaacCipher); // L: 8490
								var8.packetBuffer.writeInt(var1); // L: 8491
								Client.packetWriter.addNode(var8); // L: 8492
								var14 = DevicePcmPlayerProvider.getWidget(var1); // L: 8493
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8494
									var11 = var14.cs1Instructions[0][1]; // L: 8495
									Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11]; // L: 8496
									WorldMapData_0.changeGameOptions(var11); // L: 8497
								}
							} else if (var2 == 29) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2630, Client.packetWriter.isaacCipher); // L: 8531
								var8.packetBuffer.writeInt(var1); // L: 8532
								Client.packetWriter.addNode(var8); // L: 8533
								var14 = DevicePcmPlayerProvider.getWidget(var1); // L: 8534
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8535
									var11 = var14.cs1Instructions[0][1]; // L: 8536
									if (Varps.Varps_main[var11] != var14.cs1ComparisonValues[0]) { // L: 8537
										Varps.Varps_main[var11] = var14.cs1ComparisonValues[0]; // L: 8538
										WorldMapData_0.changeGameOptions(var11); // L: 8539
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 8212
									resumePauseWidget(var1, var0); // L: 8213
									Client.meslayerContinueWidget = PacketWriter.getWidgetChild(var1, var0); // L: 8214
									VerticalAlignment.invalidateWidget(Client.meslayerContinueWidget); // L: 8215
								}
							} else if (var2 == 31) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2624, Client.packetWriter.isaacCipher); // L: 8693
								var8.packetBuffer.writeInt(var1); // L: 8694
								var8.packetBuffer.writeIntME(class35.selectedItemWidget); // L: 8695
								var8.packetBuffer.method6483(var0); // L: 8696
								var8.packetBuffer.writeShort(var3); // L: 8697
								var8.packetBuffer.method6484(UserComparator8.selectedItemSlot); // L: 8698
								var8.packetBuffer.method6484(class8.selectedItemId); // L: 8699
								Client.packetWriter.addNode(var8); // L: 8700
								Client.field817 = 0; // L: 8701
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8702
								Client.field633 = var0; // L: 8703
							} else if (var2 == 32) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2663, Client.packetWriter.isaacCipher); // L: 8545
								var8.packetBuffer.method6445(class6.selectedSpellWidget); // L: 8546
								var8.packetBuffer.method6483(Client.selectedSpellChildIndex); // L: 8547
								var8.packetBuffer.method6445(var1); // L: 8548
								var8.packetBuffer.method6482(var3); // L: 8549
								var8.packetBuffer.method6483(var0); // L: 8550
								Client.packetWriter.addNode(var8); // L: 8551
								Client.field817 = 0; // L: 8552
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8553
								Client.field633 = var0; // L: 8554
							} else if (var2 == 33) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2595, Client.packetWriter.isaacCipher); // L: 8396
								var8.packetBuffer.method6445(var1); // L: 8397
								var8.packetBuffer.method6482(var0); // L: 8398
								var8.packetBuffer.writeShort(var3); // L: 8399
								Client.packetWriter.addNode(var8); // L: 8400
								Client.field817 = 0; // L: 8401
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8402
								Client.field633 = var0; // L: 8403
							} else if (var2 == 34) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2569, Client.packetWriter.isaacCipher); // L: 8113
								var8.packetBuffer.writeIntME(var1); // L: 8114
								var8.packetBuffer.method6482(var0); // L: 8115
								var8.packetBuffer.method6482(var3); // L: 8116
								Client.packetWriter.addNode(var8); // L: 8117
								Client.field817 = 0; // L: 8118
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8119
								Client.field633 = var0; // L: 8120
							} else if (var2 == 35) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2620, Client.packetWriter.isaacCipher); // L: 8407
								var8.packetBuffer.writeShort(var3); // L: 8408
								var8.packetBuffer.method6445(var1); // L: 8409
								var8.packetBuffer.method6484(var0); // L: 8410
								Client.packetWriter.addNode(var8); // L: 8411
								Client.field817 = 0; // L: 8412
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8413
								Client.field633 = var0; // L: 8414
							} else if (var2 == 36) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2651, Client.packetWriter.isaacCipher); // L: 8682
								var8.packetBuffer.method6493(var1); // L: 8683
								var8.packetBuffer.method6482(var3); // L: 8684
								var8.packetBuffer.method6484(var0); // L: 8685
								Client.packetWriter.addNode(var8); // L: 8686
								Client.field817 = 0; // L: 8687
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8688
								Client.field633 = var0; // L: 8689
							} else if (var2 == 37) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2575, Client.packetWriter.isaacCipher); // L: 8429
								var8.packetBuffer.writeIntME(var1); // L: 8430
								var8.packetBuffer.method6484(var0); // L: 8431
								var8.packetBuffer.writeShort(var3); // L: 8432
								Client.packetWriter.addNode(var8); // L: 8433
								Client.field817 = 0; // L: 8434
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8435
								Client.field633 = var0; // L: 8436
							} else {
								if (var2 == 38) {
									class15.Widget_runOnTargetLeave(); // L: 8261
									var16 = DevicePcmPlayerProvider.getWidget(var1); // L: 8262
									Client.isItemSelected = 1; // L: 8263
									UserComparator8.selectedItemSlot = var0; // L: 8264
									class35.selectedItemWidget = var1; // L: 8265
									class8.selectedItemId = var3; // L: 8266
									VerticalAlignment.invalidateWidget(var16); // L: 8267
									Client.selectedItemName = colorStartTag(16748608) + Strings.ItemDefinition_get(var3).name + colorStartTag(16777215); // L: 8268
									if (Client.selectedItemName == null) { // L: 8269
										Client.selectedItemName = "null";
									}

									return; // L: 8270
								}

								if (var2 == 39) {
									var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2664, Client.packetWriter.isaacCipher); // L: 8369
									var8.packetBuffer.method6484(var0); // L: 8370
									var8.packetBuffer.method6482(var3); // L: 8371
									var8.packetBuffer.method6493(var1); // L: 8372
									Client.packetWriter.addNode(var8); // L: 8373
									Client.field817 = 0; // L: 8374
									Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8375
									Client.field633 = var0; // L: 8376
								} else if (var2 == 40) {
									var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2641, Client.packetWriter.isaacCipher); // L: 8086
									var8.packetBuffer.method6482(var0); // L: 8087
									var8.packetBuffer.writeIntME(var1); // L: 8088
									var8.packetBuffer.method6483(var3); // L: 8089
									Client.packetWriter.addNode(var8); // L: 8090
									Client.field817 = 0; // L: 8091
									Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8092
									Client.field633 = var0; // L: 8093
								} else if (var2 == 41) {
									var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2668, Client.packetWriter.isaacCipher); // L: 8418
									var8.packetBuffer.method6482(var3); // L: 8419
									var8.packetBuffer.method6483(var0); // L: 8420
									var8.packetBuffer.writeIntME(var1); // L: 8421
									Client.packetWriter.addNode(var8); // L: 8422
									Client.field817 = 0; // L: 8423
									Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8424
									Client.field633 = var0; // L: 8425
								} else if (var2 == 42) {
									var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2577, Client.packetWriter.isaacCipher); // L: 8826
									var8.packetBuffer.method6445(var1); // L: 8827
									var8.packetBuffer.writeShort(var3); // L: 8828
									var8.packetBuffer.method6483(var0); // L: 8829
									Client.packetWriter.addNode(var8); // L: 8830
									Client.field817 = 0; // L: 8831
									Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8832
									Client.field633 = var0; // L: 8833
								} else if (var2 == 43) {
									var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2660, Client.packetWriter.isaacCipher); // L: 8653
									var8.packetBuffer.method6483(var3); // L: 8654
									var8.packetBuffer.method6484(var0); // L: 8655
									var8.packetBuffer.method6493(var1); // L: 8656
									Client.packetWriter.addNode(var8); // L: 8657
									Client.field817 = 0; // L: 8658
									Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8659
									Client.field633 = var0; // L: 8660
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 8601
									if (var15 != null) { // L: 8602
										Client.mouseCrossX = var6; // L: 8603
										Client.mouseCrossY = var7; // L: 8604
										Client.mouseCrossColor = 2; // L: 8605
										Client.mouseCrossState = 0; // L: 8606
										Client.destinationX = var0; // L: 8607
										Client.destinationY = var1; // L: 8608
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2571, Client.packetWriter.isaacCipher); // L: 8610
										var9.packetBuffer.method6483(var3); // L: 8611
										var9.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8612
										Client.packetWriter.addNode(var9); // L: 8613
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 8846
									if (var15 != null) { // L: 8847
										Client.mouseCrossX = var6; // L: 8848
										Client.mouseCrossY = var7; // L: 8849
										Client.mouseCrossColor = 2; // L: 8850
										Client.mouseCrossState = 0; // L: 8851
										Client.destinationX = var0; // L: 8852
										Client.destinationY = var1; // L: 8853
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2647, Client.packetWriter.isaacCipher); // L: 8855
										var9.packetBuffer.method6482(var3); // L: 8856
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8857
										Client.packetWriter.addNode(var9); // L: 8858
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 8793
									if (var15 != null) { // L: 8794
										Client.mouseCrossX = var6; // L: 8795
										Client.mouseCrossY = var7; // L: 8796
										Client.mouseCrossColor = 2; // L: 8797
										Client.mouseCrossState = 0; // L: 8798
										Client.destinationX = var0; // L: 8799
										Client.destinationY = var1; // L: 8800
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2622, Client.packetWriter.isaacCipher); // L: 8802
										var9.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8803
										var9.packetBuffer.writeShort(var3); // L: 8804
										Client.packetWriter.addNode(var9); // L: 8805
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 8273
									if (var15 != null) { // L: 8274
										Client.mouseCrossX = var6; // L: 8275
										Client.mouseCrossY = var7; // L: 8276
										Client.mouseCrossColor = 2; // L: 8277
										Client.mouseCrossState = 0; // L: 8278
										Client.destinationX = var0; // L: 8279
										Client.destinationY = var1; // L: 8280
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2565, Client.packetWriter.isaacCipher); // L: 8282
										var9.packetBuffer.method6483(var3); // L: 8283
										var9.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8284
										Client.packetWriter.addNode(var9); // L: 8285
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 8777
									if (var15 != null) { // L: 8778
										Client.mouseCrossX = var6; // L: 8779
										Client.mouseCrossY = var7; // L: 8780
										Client.mouseCrossColor = 2; // L: 8781
										Client.mouseCrossState = 0; // L: 8782
										Client.destinationX = var0; // L: 8783
										Client.destinationY = var1; // L: 8784
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2654, Client.packetWriter.isaacCipher); // L: 8786
										var9.packetBuffer.method6484(var3); // L: 8787
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8788
										Client.packetWriter.addNode(var9); // L: 8789
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 8379
									if (var15 != null) { // L: 8380
										Client.mouseCrossX = var6; // L: 8381
										Client.mouseCrossY = var7; // L: 8382
										Client.mouseCrossColor = 2; // L: 8383
										Client.mouseCrossState = 0; // L: 8384
										Client.destinationX = var0; // L: 8385
										Client.destinationY = var1; // L: 8386
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2600, Client.packetWriter.isaacCipher); // L: 8388
										var9.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8389
										var9.packetBuffer.method6484(var3); // L: 8390
										Client.packetWriter.addNode(var9); // L: 8391
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 8096
									if (var15 != null) { // L: 8097
										Client.mouseCrossX = var6; // L: 8098
										Client.mouseCrossY = var7; // L: 8099
										Client.mouseCrossColor = 2; // L: 8100
										Client.mouseCrossState = 0; // L: 8101
										Client.destinationX = var0; // L: 8102
										Client.destinationY = var1; // L: 8103
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2613, Client.packetWriter.isaacCipher); // L: 8105
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8106
										var9.packetBuffer.method6484(var3); // L: 8107
										Client.packetWriter.addNode(var9); // L: 8108
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 8232
									if (var15 != null) { // L: 8233
										Client.mouseCrossX = var6; // L: 8234
										Client.mouseCrossY = var7; // L: 8235
										Client.mouseCrossColor = 2; // L: 8236
										Client.mouseCrossState = 0; // L: 8237
										Client.destinationX = var0; // L: 8238
										Client.destinationY = var1; // L: 8239
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2669, Client.packetWriter.isaacCipher); // L: 8241
										var9.packetBuffer.writeShort(var3); // L: 8242
										var9.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8243
										Client.packetWriter.addNode(var9); // L: 8244
									}
								} else {
									label640: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = PacketWriter.getWidgetChild(var1, var0); // L: 8123
												if (var16 != null) { // L: 8124
													var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2598, Client.packetWriter.isaacCipher); // L: 8126
													var9.packetBuffer.writeIntME(var1); // L: 8127
													var9.packetBuffer.method6483(var16.itemId); // L: 8128
													var9.packetBuffer.method6482(Client.field773); // L: 8129
													var9.packetBuffer.writeInt(class6.selectedSpellWidget); // L: 8130
													var9.packetBuffer.method6483(Client.selectedSpellChildIndex); // L: 8131
													var9.packetBuffer.method6482(var0); // L: 8132
													Client.packetWriter.addNode(var9); // L: 8133
												}
												break label640;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6; // L: 8070
												Client.mouseCrossY = var7; // L: 8071
												Client.mouseCrossColor = 2; // L: 8072
												Client.mouseCrossState = 0; // L: 8073
												Client.destinationX = var0; // L: 8074
												Client.destinationY = var1; // L: 8075
												var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2643, Client.packetWriter.isaacCipher); // L: 8077
												var8.packetBuffer.method6484(var0 + JagexCache.baseX); // L: 8078
												var8.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8079
												var8.packetBuffer.writeShort(var3); // L: 8080
												var8.packetBuffer.method6484(Messages.baseY + var1); // L: 8081
												Client.packetWriter.addNode(var8); // L: 8082
												break label640;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6; // L: 8836
												Client.mouseCrossY = var7; // L: 8837
												Client.mouseCrossColor = 2; // L: 8838
												Client.mouseCrossState = 0; // L: 8839
												var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2671, Client.packetWriter.isaacCipher); // L: 8841
												var8.packetBuffer.method6482(var3); // L: 8842
												Client.packetWriter.addNode(var8); // L: 8843
												break label640;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6; // L: 8439
												Client.mouseCrossY = var7; // L: 8440
												Client.mouseCrossColor = 2; // L: 8441
												Client.mouseCrossState = 0; // L: 8442
												var13 = Client.npcs[var3]; // L: 8443
												if (var13 != null) { // L: 8444
													NPCComposition var17 = var13.definition; // L: 8445
													if (var17.transforms != null) { // L: 8446
														var17 = var17.transform();
													}

													if (var17 != null) { // L: 8447
														var10 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2593, Client.packetWriter.isaacCipher); // L: 8449
														var10.packetBuffer.method6482(var17.id); // L: 8450
														Client.packetWriter.addNode(var10); // L: 8451
													}
												}
												break label640;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6; // L: 8219
												Client.mouseCrossY = var7; // L: 8220
												Client.mouseCrossColor = 2; // L: 8221
												Client.mouseCrossState = 0; // L: 8222
												var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2639, Client.packetWriter.isaacCipher); // L: 8224
												var8.packetBuffer.method6482(var3); // L: 8225
												Client.packetWriter.addNode(var8); // L: 8226
												break label640;
											}

											if (var2 == 1005) {
												var16 = DevicePcmPlayerProvider.getWidget(var1); // L: 8248
												if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 8249
													WorldMapScaleHandler.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + Strings.ItemDefinition_get(var3).name);
												} else {
													var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2639, Client.packetWriter.isaacCipher); // L: 8252
													var9.packetBuffer.method6482(var3); // L: 8253
													Client.packetWriter.addNode(var9); // L: 8254
												}

												Client.field817 = 0; // L: 8256
												Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1); // L: 8257
												Client.field633 = var0; // L: 8258
												break label640;
											}

											if (var2 != 1007) {
												if (var2 == 1008 || var2 == 1010 || var2 == 1009 || var2 == 1011 || var2 == 1012) {
													NetSocket.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 8736
												}
												break label640;
											}
										}

										var16 = PacketWriter.getWidgetChild(var1, var0); // L: 8739
										if (var16 != null) { // L: 8740
											class245.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 8741
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 8861
			Client.isItemSelected = 0; // L: 8862
			VerticalAlignment.invalidateWidget(DevicePcmPlayerProvider.getWidget(class35.selectedItemWidget)); // L: 8863
		}

		if (Client.isSpellSelected) { // L: 8865
			class15.Widget_runOnTargetLeave();
		}

		if (Projectile.field1039 != null && Client.field817 == 0) { // L: 8866
			VerticalAlignment.invalidateWidget(Projectile.field1039);
		}

	} // L: 8867

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "999793942"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2584, Client.packetWriter.isaacCipher); // L: 8944
		var2.packetBuffer.method6483(var1); // L: 8945
		var2.packetBuffer.writeIntME(var0); // L: 8946
		Client.packetWriter.addNode(var2); // L: 8947
	} // L: 8948

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)Liv;",
		garbageValue = "2056882108"
	)
	static Widget method2731(Widget var0) {
		int var2 = class26.getWidgetFlags(var0); // L: 11609
		int var1 = var2 >> 17 & 7; // L: 11611
		int var3 = var1; // L: 11613
		if (var1 == 0) { // L: 11614
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) { // L: 11615
				var0 = DevicePcmPlayerProvider.getWidget(var0.parentId); // L: 11616
				if (var0 == null) { // L: 11617
					return null;
				}
			}

			return var0; // L: 11619
		}
	}
}
