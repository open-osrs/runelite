import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4125("", 0, new class327[]{class327.field4109}),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4126("", 1, new class327[]{class327.field4108, class327.field4109}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4127("", 2, new class327[]{class327.field4108, class327.field4110, class327.field4109}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4130("", 3, new class327[]{class327.field4108}),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4129("", 4),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4138("", 5, new class327[]{class327.field4108, class327.field4109}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4131("", 6, new class327[]{class327.field4109}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4132("", 8, new class327[]{class327.field4108, class327.field4109}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4128("", 9, new class327[]{class327.field4108, class327.field4110}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4134("", 10, new class327[]{class327.field4108}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4135("", 11, new class327[]{class327.field4108}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4136("", 12, new class327[]{class327.field4108, class327.field4109}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4133("", 13, new class327[]{class327.field4108});

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1167171757
	)
	@Export("id")
	final int id;
	@ObfuscatedName("t")
	final Set field4137;

	static {
		method5894(); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lls;)V"
	)
	ModeWhere(String var3, int var4, class327[] var5) {
		this.field4137 = new HashSet();
		this.id = var4; // L: 43
		class327[] var6 = var5; // L: 45

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 46
			class327 var8 = var6[var7]; // L: 47
			this.field4137.add(var8); // L: 48
		}

	} // L: 51

	ModeWhere(String var3, int var4) {
		this.field4137 = new HashSet(); // L: 32
		this.id = var4; // L: 39
	} // L: 40

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 55
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)[Llz;",
		garbageValue = "-298356237"
	)
	static ModeWhere[] method5894() {
		return new ModeWhere[]{field4126, field4138, field4127, field4130, field4129, field4136, field4133, field4132, field4128, field4135, field4134, field4131, field4125}; // L: 35
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1808500640"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 8923
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 8924
			Client.mouseCrossX = var6; // L: 9291
			Client.mouseCrossY = var7; // L: 9292
			Client.mouseCrossColor = 2; // L: 9293
			Client.mouseCrossState = 0; // L: 9294
			Client.destinationX = var0; // L: 9295
			Client.destinationY = var1; // L: 9296
			var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2981, Client.packetWriter.isaacCipher); // L: 9298
			var8.packetBuffer.writeInt(class20.selectedItemWidget); // L: 9299
			var8.packetBuffer.method7550(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 9300
			var8.packetBuffer.method7551(var0 + SecureRandomCallable.baseX); // L: 9301
			var8.packetBuffer.method7641(FloorUnderlayDefinition.selectedItemId); // L: 9302
			var8.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9303
			var8.packetBuffer.method7641(var3); // L: 9304
			var8.packetBuffer.method7550(PcmPlayer.selectedItemSlot); // L: 9305
			Client.packetWriter.addNode(var8); // L: 9306
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 9100
			Client.mouseCrossY = var7; // L: 9101
			Client.mouseCrossColor = 2; // L: 9102
			Client.mouseCrossState = 0; // L: 9103
			Client.destinationX = var0; // L: 9104
			Client.destinationY = var1; // L: 9105
			var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3057, Client.packetWriter.isaacCipher); // L: 9106
			var8.packetBuffer.method7551(var0 + SecureRandomCallable.baseX); // L: 9107
			var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 9108
			var8.packetBuffer.method7551(Client.selectedSpellItemId); // L: 9109
			var8.packetBuffer.method7551(Client.selectedSpellChildIndex); // L: 9110
			var8.packetBuffer.method7641(var3); // L: 9111
			var8.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9112
			var8.packetBuffer.writeIntME(ArchiveDiskActionHandler.selectedSpellWidget); // L: 9113
			Client.packetWriter.addNode(var8); // L: 9114
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 8938
			Client.mouseCrossY = var7; // L: 8939
			Client.mouseCrossColor = 2; // L: 8940
			Client.mouseCrossState = 0; // L: 8941
			Client.destinationX = var0; // L: 8942
			Client.destinationY = var1; // L: 8943
			var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2990, Client.packetWriter.isaacCipher); // L: 8945
			var8.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8946
			var8.packetBuffer.method7550(var3); // L: 8947
			var8.packetBuffer.method7641(var0 + SecureRandomCallable.baseX); // L: 8948
			var8.packetBuffer.method7551(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 8949
			Client.packetWriter.addNode(var8); // L: 8950
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 9554
			Client.mouseCrossY = var7; // L: 9555
			Client.mouseCrossColor = 2; // L: 9556
			Client.mouseCrossState = 0; // L: 9557
			Client.destinationX = var0; // L: 9558
			Client.destinationY = var1; // L: 9559
			var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3049, Client.packetWriter.isaacCipher); // L: 9561
			var8.packetBuffer.method7641(var3); // L: 9562
			var8.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9563
			var8.packetBuffer.method7550(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 9564
			var8.packetBuffer.method7550(var0 + SecureRandomCallable.baseX); // L: 9565
			Client.packetWriter.addNode(var8); // L: 9566
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 9014
			Client.mouseCrossY = var7; // L: 9015
			Client.mouseCrossColor = 2; // L: 9016
			Client.mouseCrossState = 0; // L: 9017
			Client.destinationX = var0; // L: 9018
			Client.destinationY = var1; // L: 9019
			var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3041, Client.packetWriter.isaacCipher); // L: 9021
			var8.packetBuffer.method7641(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 9022
			var8.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9023
			var8.packetBuffer.writeShort(var0 + SecureRandomCallable.baseX); // L: 9024
			var8.packetBuffer.method7550(var3); // L: 9025
			Client.packetWriter.addNode(var8); // L: 9026
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 9160
			Client.mouseCrossY = var7; // L: 9161
			Client.mouseCrossColor = 2; // L: 9162
			Client.mouseCrossState = 0; // L: 9163
			Client.destinationX = var0; // L: 9164
			Client.destinationY = var1; // L: 9165
			var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher); // L: 9167
			var8.packetBuffer.writeShort(var3); // L: 9168
			var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 9169
			var8.packetBuffer.writeShort(var0 + SecureRandomCallable.baseX); // L: 9170
			var8.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9171
			Client.packetWriter.addNode(var8); // L: 9172
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 9572
				if (var13 != null) { // L: 9573
					Client.mouseCrossX = var6; // L: 9574
					Client.mouseCrossY = var7; // L: 9575
					Client.mouseCrossColor = 2; // L: 9576
					Client.mouseCrossState = 0; // L: 9577
					Client.destinationX = var0; // L: 9578
					Client.destinationY = var1; // L: 9579
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.field2985, Client.packetWriter.isaacCipher); // L: 9581
					var9.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9582
					var9.packetBuffer.writeShort(FloorUnderlayDefinition.selectedItemId); // L: 9583
					var9.packetBuffer.writeInt(class20.selectedItemWidget); // L: 9584
					var9.packetBuffer.writeShort(var3); // L: 9585
					var9.packetBuffer.writeShort(PcmPlayer.selectedItemSlot); // L: 9586
					Client.packetWriter.addNode(var9); // L: 9587
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 9635
				if (var13 != null) { // L: 9636
					Client.mouseCrossX = var6; // L: 9637
					Client.mouseCrossY = var7; // L: 9638
					Client.mouseCrossColor = 2; // L: 9639
					Client.mouseCrossState = 0; // L: 9640
					Client.destinationX = var0; // L: 9641
					Client.destinationY = var1; // L: 9642
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.field2984, Client.packetWriter.isaacCipher); // L: 9643
					var9.packetBuffer.method7641(var3); // L: 9644
					var9.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9645
					var9.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9646
					var9.packetBuffer.method7551(Client.selectedSpellChildIndex); // L: 9647
					var9.packetBuffer.method7563(ArchiveDiskActionHandler.selectedSpellWidget); // L: 9648
					Client.packetWriter.addNode(var9); // L: 9649
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 9591
				if (var13 != null) { // L: 9592
					Client.mouseCrossX = var6; // L: 9593
					Client.mouseCrossY = var7; // L: 9594
					Client.mouseCrossColor = 2; // L: 9595
					Client.mouseCrossState = 0; // L: 9596
					Client.destinationX = var0; // L: 9597
					Client.destinationY = var1; // L: 9598
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.field3004, Client.packetWriter.isaacCipher); // L: 9600
					var9.packetBuffer.method7551(var3); // L: 9601
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9602
					Client.packetWriter.addNode(var9); // L: 9603
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 9391
				if (var13 != null) { // L: 9392
					Client.mouseCrossX = var6; // L: 9393
					Client.mouseCrossY = var7; // L: 9394
					Client.mouseCrossColor = 2; // L: 9395
					Client.mouseCrossState = 0; // L: 9396
					Client.destinationX = var0; // L: 9397
					Client.destinationY = var1; // L: 9398
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.field3030, Client.packetWriter.isaacCipher); // L: 9400
					var9.packetBuffer.method7550(var3); // L: 9401
					var9.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9402
					Client.packetWriter.addNode(var9); // L: 9403
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 9275
				if (var13 != null) { // L: 9276
					Client.mouseCrossX = var6; // L: 9277
					Client.mouseCrossY = var7; // L: 9278
					Client.mouseCrossColor = 2; // L: 9279
					Client.mouseCrossState = 0; // L: 9280
					Client.destinationX = var0; // L: 9281
					Client.destinationY = var1; // L: 9282
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.field3036, Client.packetWriter.isaacCipher); // L: 9284
					var9.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9285
					var9.packetBuffer.method7641(var3); // L: 9286
					Client.packetWriter.addNode(var9); // L: 9287
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 8953
				if (var13 != null) { // L: 8954
					Client.mouseCrossX = var6; // L: 8955
					Client.mouseCrossY = var7; // L: 8956
					Client.mouseCrossColor = 2; // L: 8957
					Client.mouseCrossState = 0; // L: 8958
					Client.destinationX = var0; // L: 8959
					Client.destinationY = var1; // L: 8960
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.field2977, Client.packetWriter.isaacCipher); // L: 8962
					var9.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8963
					var9.packetBuffer.method7641(var3); // L: 8964
					Client.packetWriter.addNode(var9); // L: 8965
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 9375
				if (var13 != null) { // L: 9376
					Client.mouseCrossX = var6; // L: 9377
					Client.mouseCrossY = var7; // L: 9378
					Client.mouseCrossColor = 2; // L: 9379
					Client.mouseCrossState = 0; // L: 9380
					Client.destinationX = var0; // L: 9381
					Client.destinationY = var1; // L: 9382
					var9 = WallDecoration.getPacketBufferNode(ClientPacket.field3046, Client.packetWriter.isaacCipher); // L: 9384
					var9.packetBuffer.method7550(var3); // L: 9385
					var9.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9386
					Client.packetWriter.addNode(var9); // L: 9387
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 9435
					if (var15 != null) { // L: 9436
						Client.mouseCrossX = var6; // L: 9437
						Client.mouseCrossY = var7; // L: 9438
						Client.mouseCrossColor = 2; // L: 9439
						Client.mouseCrossState = 0; // L: 9440
						Client.destinationX = var0; // L: 9441
						Client.destinationY = var1; // L: 9442
						var9 = WallDecoration.getPacketBufferNode(ClientPacket.field3007, Client.packetWriter.isaacCipher); // L: 9444
						var9.packetBuffer.method7551(PcmPlayer.selectedItemSlot); // L: 9445
						var9.packetBuffer.method7641(var3); // L: 9446
						var9.packetBuffer.writeInt(class20.selectedItemWidget); // L: 9447
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9448
						var9.packetBuffer.method7641(FloorUnderlayDefinition.selectedItemId); // L: 9449
						Client.packetWriter.addNode(var9); // L: 9450
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 9479
					if (var15 != null) { // L: 9480
						Client.mouseCrossX = var6; // L: 9481
						Client.mouseCrossY = var7; // L: 9482
						Client.mouseCrossColor = 2; // L: 9483
						Client.mouseCrossState = 0; // L: 9484
						Client.destinationX = var0; // L: 9485
						Client.destinationY = var1; // L: 9486
						var9 = WallDecoration.getPacketBufferNode(ClientPacket.field3022, Client.packetWriter.isaacCipher); // L: 9487
						var9.packetBuffer.writeInt(ArchiveDiskActionHandler.selectedSpellWidget); // L: 9488
						var9.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9489
						var9.packetBuffer.method7550(Client.selectedSpellItemId); // L: 9490
						var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9491
						var9.packetBuffer.method7641(var3); // L: 9492
						Client.packetWriter.addNode(var9); // L: 9493
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 9520
					Client.mouseCrossY = var7; // L: 9521
					Client.mouseCrossColor = 2; // L: 9522
					Client.mouseCrossState = 0; // L: 9523
					Client.destinationX = var0; // L: 9524
					Client.destinationY = var1; // L: 9525
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher); // L: 9527
					var8.packetBuffer.method7641(var0 + SecureRandomCallable.baseX); // L: 9528
					var8.packetBuffer.method7550(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 9529
					var8.packetBuffer.method7641(FloorUnderlayDefinition.selectedItemId); // L: 9530
					var8.packetBuffer.method7563(class20.selectedItemWidget); // L: 9531
					var8.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9532
					var8.packetBuffer.method7641(PcmPlayer.selectedItemSlot); // L: 9533
					var8.packetBuffer.method7551(var3); // L: 9534
					Client.packetWriter.addNode(var8); // L: 9535
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 9351
					Client.mouseCrossY = var7; // L: 9352
					Client.mouseCrossColor = 2; // L: 9353
					Client.mouseCrossState = 0; // L: 9354
					Client.destinationX = var0; // L: 9355
					Client.destinationY = var1; // L: 9356
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3010, Client.packetWriter.isaacCipher); // L: 9357
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9358
					var8.packetBuffer.method7551(Client.selectedSpellItemId); // L: 9359
					var8.packetBuffer.method7641(Client.selectedSpellChildIndex); // L: 9360
					var8.packetBuffer.writeShort(var3); // L: 9361
					var8.packetBuffer.method7641(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 9362
					var8.packetBuffer.writeInt(ArchiveDiskActionHandler.selectedSpellWidget); // L: 9363
					var8.packetBuffer.writeShort(var0 + SecureRandomCallable.baseX); // L: 9364
					Client.packetWriter.addNode(var8); // L: 9365
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 9056
					Client.mouseCrossY = var7; // L: 9057
					Client.mouseCrossColor = 2; // L: 9058
					Client.mouseCrossState = 0; // L: 9059
					Client.destinationX = var0; // L: 9060
					Client.destinationY = var1; // L: 9061
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3013, Client.packetWriter.isaacCipher); // L: 9063
					var8.packetBuffer.method7550(var0 + SecureRandomCallable.baseX); // L: 9064
					var8.packetBuffer.method7551(var3); // L: 9065
					var8.packetBuffer.method7641(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 9066
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9067
					Client.packetWriter.addNode(var8); // L: 9068
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 9688
					Client.mouseCrossY = var7; // L: 9689
					Client.mouseCrossColor = 2; // L: 9690
					Client.mouseCrossState = 0; // L: 9691
					Client.destinationX = var0; // L: 9692
					Client.destinationY = var1; // L: 9693
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2987, Client.packetWriter.isaacCipher); // L: 9695
					var8.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9696
					var8.packetBuffer.method7550(var0 + SecureRandomCallable.baseX); // L: 9697
					var8.packetBuffer.method7641(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 9698
					var8.packetBuffer.method7551(var3); // L: 9699
					Client.packetWriter.addNode(var8); // L: 9700
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 9249
					Client.mouseCrossY = var7; // L: 9250
					Client.mouseCrossColor = 2; // L: 9251
					Client.mouseCrossState = 0; // L: 9252
					Client.destinationX = var0; // L: 9253
					Client.destinationY = var1; // L: 9254
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2997, Client.packetWriter.isaacCipher); // L: 9256
					var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 9257
					var8.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9258
					var8.packetBuffer.method7551(var0 + SecureRandomCallable.baseX); // L: 9259
					var8.packetBuffer.method7641(var3); // L: 9260
					Client.packetWriter.addNode(var8); // L: 9261
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 9188
					Client.mouseCrossY = var7; // L: 9189
					Client.mouseCrossColor = 2; // L: 9190
					Client.mouseCrossState = 0; // L: 9191
					Client.destinationX = var0; // L: 9192
					Client.destinationY = var1; // L: 9193
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2976, Client.packetWriter.isaacCipher); // L: 9195
					var8.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9196
					var8.packetBuffer.method7550(var0 + SecureRandomCallable.baseX); // L: 9197
					var8.packetBuffer.writeShort(var3); // L: 9198
					var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 9199
					Client.packetWriter.addNode(var8); // L: 9200
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 8983
					Client.mouseCrossY = var7; // L: 8984
					Client.mouseCrossColor = 2; // L: 8985
					Client.mouseCrossState = 0; // L: 8986
					Client.destinationX = var0; // L: 8987
					Client.destinationY = var1; // L: 8988
					var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2978, Client.packetWriter.isaacCipher); // L: 8990
					var8.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8991
					var8.packetBuffer.method7550(var3); // L: 8992
					var8.packetBuffer.method7551(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 8993
					var8.packetBuffer.method7641(var0 + SecureRandomCallable.baseX); // L: 8994
					Client.packetWriter.addNode(var8); // L: 8995
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 9664
						class175.scene.setViewportWalking(); // L: 9665
					} else {
						class175.scene.menuOpen(class128.Client_plane, var0, var1, true); // L: 9668
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = class92.getWidget(var1); // L: 9466
						if (var16 != null) { // L: 9467
							boolean var12 = true; // L: 9468
							if (var16.contentType > 0) { // L: 9469
								var12 = ReflectionCheck.method599(var16);
							}

							if (var12) { // L: 9470
								var11 = WallDecoration.getPacketBufferNode(ClientPacket.field3014, Client.packetWriter.isaacCipher); // L: 9472
								var11.packetBuffer.writeInt(var1); // L: 9473
								Client.packetWriter.addNode(var11); // L: 9474
							}
						}
					} else {
						if (var2 == 25) {
							var16 = ApproximateRouteStrategy.getWidgetChild(var1, var0); // L: 9175
							if (var16 != null) { // L: 9176
								MusicPatchNode2.Widget_runOnTargetLeave(); // L: 9177
								class93.selectSpell(var1, var0, WorldMapSection1.Widget_unpackTargetMask(UrlRequester.getWidgetFlags(var16)), var16.itemId); // L: 9178
								Client.isItemSelected = 0; // L: 9179
								Client.selectedSpellActionName = TriBool.Widget_getSpellActionName(var16); // L: 9180
								if (Client.selectedSpellActionName == null) { // L: 9181
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 9182
									Client.selectedSpellName = var16.dataText + class166.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class166.colorStartTag(65280) + var16.spellName + class166.colorStartTag(16777215); // L: 9183
								}
							}

							return; // L: 9185
						}

						if (var2 == 26) {
							Varps.method5366(); // L: 9569
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3014, Client.packetWriter.isaacCipher); // L: 9498
								var8.packetBuffer.writeInt(var1); // L: 9499
								Client.packetWriter.addNode(var8); // L: 9500
								var14 = class92.getWidget(var1); // L: 9501
								if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 9502
									var10 = var14.cs1Instructions[0][1]; // L: 9503
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10]; // L: 9504
									class321.changeGameOptions(var10); // L: 9505
								}
							} else if (var2 == 29) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3014, Client.packetWriter.isaacCipher); // L: 9072
								var8.packetBuffer.writeInt(var1); // L: 9073
								Client.packetWriter.addNode(var8); // L: 9074
								var14 = class92.getWidget(var1); // L: 9075
								if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 9076
									var10 = var14.cs1Instructions[0][1]; // L: 9077
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) { // L: 9078
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0]; // L: 9079
										class321.changeGameOptions(var10); // L: 9080
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 9368
									Skills.resumePauseWidget(var1, var0); // L: 9369
									Client.meslayerContinueWidget = ApproximateRouteStrategy.getWidgetChild(var1, var0); // L: 9370
									GrandExchangeOfferTotalQuantityComparator.invalidateWidget(Client.meslayerContinueWidget); // L: 9371
								}
							} else if (var2 == 31) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2992, Client.packetWriter.isaacCipher); // L: 8970
								var8.packetBuffer.method7563(var1); // L: 8971
								var8.packetBuffer.method7550(var3); // L: 8972
								var8.packetBuffer.method7641(PcmPlayer.selectedItemSlot); // L: 8973
								var8.packetBuffer.method7565(class20.selectedItemWidget); // L: 8974
								var8.packetBuffer.method7550(var0); // L: 8975
								var8.packetBuffer.method7551(FloorUnderlayDefinition.selectedItemId); // L: 8976
								Client.packetWriter.addNode(var8); // L: 8977
								Client.field598 = 0; // L: 8978
								NPCComposition.field1991 = class92.getWidget(var1); // L: 8979
								Client.field599 = var0; // L: 8980
							} else if (var2 == 32) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3025, Client.packetWriter.isaacCipher); // L: 9204
								var8.packetBuffer.method7550(var0); // L: 9205
								var8.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9206
								var8.packetBuffer.writeIntME(var1); // L: 9207
								var8.packetBuffer.writeIntME(ArchiveDiskActionHandler.selectedSpellWidget); // L: 9208
								var8.packetBuffer.method7550(var3); // L: 9209
								Client.packetWriter.addNode(var8); // L: 9210
								Client.field598 = 0; // L: 9211
								NPCComposition.field1991 = class92.getWidget(var1); // L: 9212
								Client.field599 = var0; // L: 9213
							} else if (var2 == 33) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2971, Client.packetWriter.isaacCipher); // L: 9150
								var8.packetBuffer.writeShort(var0); // L: 9151
								var8.packetBuffer.writeShort(var3); // L: 9152
								var8.packetBuffer.writeIntME(var1); // L: 9153
								Client.packetWriter.addNode(var8); // L: 9154
								Client.field598 = 0; // L: 9155
								NPCComposition.field1991 = class92.getWidget(var1); // L: 9156
								Client.field599 = var0; // L: 9157
							} else if (var2 == 34) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3045, Client.packetWriter.isaacCipher); // L: 9510
								var8.packetBuffer.method7551(var3); // L: 9511
								var8.packetBuffer.writeInt(var1); // L: 9512
								var8.packetBuffer.method7641(var0); // L: 9513
								Client.packetWriter.addNode(var8); // L: 9514
								Client.field598 = 0; // L: 9515
								NPCComposition.field1991 = class92.getWidget(var1); // L: 9516
								Client.field599 = var0; // L: 9517
							} else if (var2 == 35) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3050, Client.packetWriter.isaacCipher); // L: 9408
								var8.packetBuffer.writeIntME(var1); // L: 9409
								var8.packetBuffer.method7551(var0); // L: 9410
								var8.packetBuffer.method7551(var3); // L: 9411
								Client.packetWriter.addNode(var8); // L: 9412
								Client.field598 = 0; // L: 9413
								NPCComposition.field1991 = class92.getWidget(var1); // L: 9414
								Client.field599 = var0; // L: 9415
							} else if (var2 == 36) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3028, Client.packetWriter.isaacCipher); // L: 9619
								var8.packetBuffer.method7641(var3); // L: 9620
								var8.packetBuffer.method7641(var0); // L: 9621
								var8.packetBuffer.writeInt(var1); // L: 9622
								Client.packetWriter.addNode(var8); // L: 9623
								Client.field598 = 0; // L: 9624
								NPCComposition.field1991 = class92.getWidget(var1); // L: 9625
								Client.field599 = var0; // L: 9626
							} else if (var2 == 37) {
								var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2979, Client.packetWriter.isaacCipher); // L: 9030
								var8.packetBuffer.method7550(var0); // L: 9031
								var8.packetBuffer.writeShort(var3); // L: 9032
								var8.packetBuffer.writeInt(var1); // L: 9033
								Client.packetWriter.addNode(var8); // L: 9034
								Client.field598 = 0; // L: 9035
								NPCComposition.field1991 = class92.getWidget(var1); // L: 9036
								Client.field599 = var0; // L: 9037
							} else {
								if (var2 == 38) {
									MusicPatchNode2.Widget_runOnTargetLeave(); // L: 9454
									var16 = class92.getWidget(var1); // L: 9455
									Client.isItemSelected = 1; // L: 9456
									PcmPlayer.selectedItemSlot = var0; // L: 9457
									class20.selectedItemWidget = var1; // L: 9458
									FloorUnderlayDefinition.selectedItemId = var3; // L: 9459
									GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var16); // L: 9460
									Client.selectedItemName = class166.colorStartTag(16748608) + FileSystem.ItemDefinition_get(var3).name + class166.colorStartTag(16777215); // L: 9461
									if (Client.selectedItemName == null) { // L: 9462
										Client.selectedItemName = "null";
									}

									return; // L: 9463
								}

								if (var2 == 39) {
									var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3024, Client.packetWriter.isaacCipher); // L: 9320
									var8.packetBuffer.writeShort(var3); // L: 9321
									var8.packetBuffer.method7551(var0); // L: 9322
									var8.packetBuffer.method7565(var1); // L: 9323
									Client.packetWriter.addNode(var8); // L: 9324
									Client.field598 = 0; // L: 9325
									NPCComposition.field1991 = class92.getWidget(var1); // L: 9326
									Client.field599 = var0; // L: 9327
								} else if (var2 == 40) {
									var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3008, Client.packetWriter.isaacCipher); // L: 9654
									var8.packetBuffer.method7551(var3); // L: 9655
									var8.packetBuffer.method7551(var0); // L: 9656
									var8.packetBuffer.method7565(var1); // L: 9657
									Client.packetWriter.addNode(var8); // L: 9658
									Client.field598 = 0; // L: 9659
									NPCComposition.field1991 = class92.getWidget(var1); // L: 9660
									Client.field599 = var0; // L: 9661
								} else if (var2 == 41) {
									var8 = WallDecoration.getPacketBufferNode(ClientPacket.field3018, Client.packetWriter.isaacCipher); // L: 9608
									var8.packetBuffer.method7641(var0); // L: 9609
									var8.packetBuffer.method7551(var3); // L: 9610
									var8.packetBuffer.writeInt(var1); // L: 9611
									Client.packetWriter.addNode(var8); // L: 9612
									Client.field598 = 0; // L: 9613
									NPCComposition.field1991 = class92.getWidget(var1); // L: 9614
									Client.field599 = var0; // L: 9615
								} else if (var2 == 42) {
									var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2961, Client.packetWriter.isaacCipher); // L: 9265
									var8.packetBuffer.method7641(var0); // L: 9266
									var8.packetBuffer.method7563(var1); // L: 9267
									var8.packetBuffer.method7550(var3); // L: 9268
									Client.packetWriter.addNode(var8); // L: 9269
									Client.field598 = 0; // L: 9270
									NPCComposition.field1991 = class92.getWidget(var1); // L: 9271
									Client.field599 = var0; // L: 9272
								} else if (var2 == 43) {
									var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2966, Client.packetWriter.isaacCipher); // L: 9331
									var8.packetBuffer.method7641(var0); // L: 9332
									var8.packetBuffer.method7550(var3); // L: 9333
									var8.packetBuffer.writeInt(var1); // L: 9334
									Client.packetWriter.addNode(var8); // L: 9335
									Client.field598 = 0; // L: 9336
									NPCComposition.field1991 = class92.getWidget(var1); // L: 9337
									Client.field599 = var0; // L: 9338
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 9672
									if (var15 != null) { // L: 9673
										Client.mouseCrossX = var6; // L: 9674
										Client.mouseCrossY = var7; // L: 9675
										Client.mouseCrossColor = 2; // L: 9676
										Client.mouseCrossState = 0; // L: 9677
										Client.destinationX = var0; // L: 9678
										Client.destinationY = var1; // L: 9679
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.field2965, Client.packetWriter.isaacCipher); // L: 9681
										var9.packetBuffer.writeShort(var3); // L: 9682
										var9.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9683
										Client.packetWriter.addNode(var9); // L: 9684
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 9133
									if (var15 != null) { // L: 9134
										Client.mouseCrossX = var6; // L: 9135
										Client.mouseCrossY = var7; // L: 9136
										Client.mouseCrossColor = 2; // L: 9137
										Client.mouseCrossState = 0; // L: 9138
										Client.destinationX = var0; // L: 9139
										Client.destinationY = var1; // L: 9140
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.field2975, Client.packetWriter.isaacCipher); // L: 9142
										var9.packetBuffer.method7550(var3); // L: 9143
										var9.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9144
										Client.packetWriter.addNode(var9); // L: 9145
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 8998
									if (var15 != null) { // L: 8999
										Client.mouseCrossX = var6; // L: 9000
										Client.mouseCrossY = var7; // L: 9001
										Client.mouseCrossColor = 2; // L: 9002
										Client.mouseCrossState = 0; // L: 9003
										Client.destinationX = var0; // L: 9004
										Client.destinationY = var1; // L: 9005
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.field3003, Client.packetWriter.isaacCipher); // L: 9007
										var9.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9008
										var9.packetBuffer.writeShort(var3); // L: 9009
										Client.packetWriter.addNode(var9); // L: 9010
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 9117
									if (var15 != null) { // L: 9118
										Client.mouseCrossX = var6; // L: 9119
										Client.mouseCrossY = var7; // L: 9120
										Client.mouseCrossColor = 2; // L: 9121
										Client.mouseCrossState = 0; // L: 9122
										Client.destinationX = var0; // L: 9123
										Client.destinationY = var1; // L: 9124
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.field2962, Client.packetWriter.isaacCipher); // L: 9126
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9127
										var9.packetBuffer.method7641(var3); // L: 9128
										Client.packetWriter.addNode(var9); // L: 9129
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 9040
									if (var15 != null) { // L: 9041
										Client.mouseCrossX = var6; // L: 9042
										Client.mouseCrossY = var7; // L: 9043
										Client.mouseCrossColor = 2; // L: 9044
										Client.mouseCrossState = 0; // L: 9045
										Client.destinationX = var0; // L: 9046
										Client.destinationY = var1; // L: 9047
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.field2995, Client.packetWriter.isaacCipher); // L: 9049
										var9.packetBuffer.writeShort(var3); // L: 9050
										var9.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9051
										Client.packetWriter.addNode(var9); // L: 9052
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 9703
									if (var15 != null) { // L: 9704
										Client.mouseCrossX = var6; // L: 9705
										Client.mouseCrossY = var7; // L: 9706
										Client.mouseCrossColor = 2; // L: 9707
										Client.mouseCrossState = 0; // L: 9708
										Client.destinationX = var0; // L: 9709
										Client.destinationY = var1; // L: 9710
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.field2969, Client.packetWriter.isaacCipher); // L: 9712
										var9.packetBuffer.method7641(var3); // L: 9713
										var9.packetBuffer.method7687(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9714
										Client.packetWriter.addNode(var9); // L: 9715
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 9538
									if (var15 != null) { // L: 9539
										Client.mouseCrossX = var6; // L: 9540
										Client.mouseCrossY = var7; // L: 9541
										Client.mouseCrossColor = 2; // L: 9542
										Client.mouseCrossState = 0; // L: 9543
										Client.destinationX = var0; // L: 9544
										Client.destinationY = var1; // L: 9545
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher); // L: 9547
										var9.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9548
										var9.packetBuffer.method7641(var3); // L: 9549
										Client.packetWriter.addNode(var9); // L: 9550
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 9216
									if (var15 != null) { // L: 9217
										Client.mouseCrossX = var6; // L: 9218
										Client.mouseCrossY = var7; // L: 9219
										Client.mouseCrossColor = 2; // L: 9220
										Client.mouseCrossState = 0; // L: 9221
										Client.destinationX = var0; // L: 9222
										Client.destinationY = var1; // L: 9223
										var9 = WallDecoration.getPacketBufferNode(ClientPacket.field3019, Client.packetWriter.isaacCipher); // L: 9225
										var9.packetBuffer.method7542(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9226
										var9.packetBuffer.method7641(var3); // L: 9227
										Client.packetWriter.addNode(var9); // L: 9228
									}
								} else {
									label655: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ApproximateRouteStrategy.getWidgetChild(var1, var0); // L: 9235
												if (var16 != null) { // L: 9236
													var9 = WallDecoration.getPacketBufferNode(ClientPacket.field2963, Client.packetWriter.isaacCipher); // L: 9238
													var9.packetBuffer.method7565(ArchiveDiskActionHandler.selectedSpellWidget); // L: 9239
													var9.packetBuffer.method7563(var1); // L: 9240
													var9.packetBuffer.writeShort(var16.itemId); // L: 9241
													var9.packetBuffer.method7551(Client.selectedSpellChildIndex); // L: 9242
													var9.packetBuffer.method7550(var0); // L: 9243
													var9.packetBuffer.method7641(Client.selectedSpellItemId); // L: 9244
													Client.packetWriter.addNode(var9); // L: 9245
												}
												break label655;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6; // L: 9085
												Client.mouseCrossY = var7; // L: 9086
												Client.mouseCrossColor = 2; // L: 9087
												Client.mouseCrossState = 0; // L: 9088
												Client.destinationX = var0; // L: 9089
												Client.destinationY = var1; // L: 9090
												var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2994, Client.packetWriter.isaacCipher); // L: 9092
												var8.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseY + var1); // L: 9093
												var8.packetBuffer.writeShort(var3); // L: 9094
												var8.packetBuffer.method7641(var0 + SecureRandomCallable.baseX); // L: 9095
												var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9096
												Client.packetWriter.addNode(var8); // L: 9097
												break label655;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6; // L: 9309
												Client.mouseCrossY = var7; // L: 9310
												Client.mouseCrossColor = 2; // L: 9311
												Client.mouseCrossState = 0; // L: 9312
												var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2950, Client.packetWriter.isaacCipher); // L: 9314
												var8.packetBuffer.writeShort(var3); // L: 9315
												Client.packetWriter.addNode(var8); // L: 9316
												break label655;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6; // L: 9418
												Client.mouseCrossY = var7; // L: 9419
												Client.mouseCrossColor = 2; // L: 9420
												Client.mouseCrossState = 0; // L: 9421
												var13 = Client.npcs[var3]; // L: 9422
												if (var13 != null) { // L: 9423
													NPCComposition var17 = var13.definition; // L: 9424
													if (var17.transforms != null) { // L: 9425
														var17 = var17.transform();
													}

													if (var17 != null) { // L: 9426
														var11 = WallDecoration.getPacketBufferNode(ClientPacket.field3016, Client.packetWriter.isaacCipher); // L: 9428
														var11.packetBuffer.method7550(var17.id); // L: 9429
														Client.packetWriter.addNode(var11); // L: 9430
													}
												}
												break label655;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6; // L: 9341
												Client.mouseCrossY = var7; // L: 9342
												Client.mouseCrossColor = 2; // L: 9343
												Client.mouseCrossState = 0; // L: 9344
												var8 = WallDecoration.getPacketBufferNode(ClientPacket.field2986, Client.packetWriter.isaacCipher); // L: 9346
												var8.packetBuffer.writeShort(var3); // L: 9347
												Client.packetWriter.addNode(var8); // L: 9348
												break label655;
											}

											if (var2 == 1005) {
												var16 = class92.getWidget(var1); // L: 8925
												if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 8926
													WorldMapEvent.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + FileSystem.ItemDefinition_get(var3).name);
												} else {
													var9 = WallDecoration.getPacketBufferNode(ClientPacket.field2986, Client.packetWriter.isaacCipher); // L: 8929
													var9.packetBuffer.writeShort(var3); // L: 8930
													Client.packetWriter.addNode(var9); // L: 8931
												}

												Client.field598 = 0; // L: 8933
												NPCComposition.field1991 = class92.getWidget(var1); // L: 8934
												Client.field599 = var0; // L: 8935
												break label655;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1011 || var2 == 1008 || var2 == 1010 || var2 == 1012) {
													ServerPacket.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9232
												}
												break label655;
											}
										}

										var16 = ApproximateRouteStrategy.getWidgetChild(var1, var0); // L: 9629
										if (var16 != null) { // L: 9630
											TaskHandler.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 9631
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 9718
			Client.isItemSelected = 0; // L: 9719
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(class92.getWidget(class20.selectedItemWidget)); // L: 9720
		}

		if (Client.isSpellSelected) { // L: 9722
			MusicPatchNode2.Widget_runOnTargetLeave();
		}

		if (NPCComposition.field1991 != null && Client.field598 == 0) { // L: 9723
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(NPCComposition.field1991);
		}

	} // L: 9724
}
