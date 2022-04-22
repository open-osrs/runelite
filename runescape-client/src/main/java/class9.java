import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class9 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	static final class9 field28;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	public static final class9 field37;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	static final class9 field38;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	static final class9 field29;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	static final class9 field30;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1242087125
	)
	static int field35;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1758617613
	)
	int field31;
	@ObfuscatedName("s")
	String field32;
	@ObfuscatedName("l")
	boolean field27;
	@ObfuscatedName("q")
	boolean field34;

	static {
		field28 = new class9(0, "POST", true, true); // L: 6
		field37 = new class9(1, "GET", true, false); // L: 7
		field38 = new class9(2, "PUT", false, true); // L: 8
		field29 = new class9(3, "PATCH", false, true); // L: 9
		field30 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field31 = var1; // L: 17
		this.field32 = var2; // L: 18
		this.field27 = var3; // L: 19
		this.field34 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field31; // L: 36
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "5017"
	)
	boolean method63() {
		return this.field27; // L: 24
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1928506926"
	)
	String method62() {
		return this.field32; // L: 28
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "905166088"
	)
	boolean method66() {
		return this.field34; // L: 32
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lqq;",
		garbageValue = "1901588068"
	)
	static IndexedSprite method73(boolean var0, boolean var1) {
		return var0 ? (var1 ? ParamComposition.field1983 : class54.options_buttons_2Sprite) : (var1 ? class93.field1254 : WorldMapSection2.options_buttons_0Sprite); // L: 236
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1522440534"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 8803
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 8804
			Client.mouseCrossX = var6; // L: 9123
			Client.mouseCrossY = var7; // L: 9124
			Client.mouseCrossColor = 2; // L: 9125
			Client.mouseCrossState = 0; // L: 9126
			Client.destinationX = var0; // L: 9127
			Client.destinationY = var1; // L: 9128
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2994, Client.packetWriter.isaacCipher); // L: 9130
			var8.packetBuffer.method7710(class432.selectedItemSlot); // L: 9131
			var8.packetBuffer.method7710(Varcs.selectedItemId); // L: 9132
			var8.packetBuffer.method7701(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9133
			var8.packetBuffer.writeShort(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 9134
			var8.packetBuffer.writeShort(var3); // L: 9135
			var8.packetBuffer.method7723(TaskHandler.selectedItemWidget); // L: 9136
			var8.packetBuffer.method7711(VarcInt.baseY + var1); // L: 9137
			Client.packetWriter.addNode(var8); // L: 9138
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 9053
			Client.mouseCrossY = var7; // L: 9054
			Client.mouseCrossColor = 2; // L: 9055
			Client.mouseCrossState = 0; // L: 9056
			Client.destinationX = var0; // L: 9057
			Client.destinationY = var1; // L: 9058
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2977, Client.packetWriter.isaacCipher); // L: 9059
			var8.packetBuffer.method7711(Client.selectedSpellItemId); // L: 9060
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9061
			var8.packetBuffer.method7712(VarcInt.baseY + var1); // L: 9062
			var8.packetBuffer.method7711(Client.selectedSpellChildIndex); // L: 9063
			var8.packetBuffer.method7711(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 9064
			var8.packetBuffer.method7723(Timer.selectedSpellWidget); // L: 9065
			var8.packetBuffer.method7710(var3); // L: 9066
			Client.packetWriter.addNode(var8); // L: 9067
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 9573
			Client.mouseCrossY = var7; // L: 9574
			Client.mouseCrossColor = 2; // L: 9575
			Client.mouseCrossState = 0; // L: 9576
			Client.destinationX = var0; // L: 9577
			Client.destinationY = var1; // L: 9578
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2914, Client.packetWriter.isaacCipher); // L: 9580
			var8.packetBuffer.method7711(VarcInt.baseY + var1); // L: 9581
			var8.packetBuffer.method7710(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 9582
			var8.packetBuffer.writeShort(var3); // L: 9583
			var8.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9584
			Client.packetWriter.addNode(var8); // L: 9585
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 9189
			Client.mouseCrossY = var7; // L: 9190
			Client.mouseCrossColor = 2; // L: 9191
			Client.mouseCrossState = 0; // L: 9192
			Client.destinationX = var0; // L: 9193
			Client.destinationY = var1; // L: 9194
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2901, Client.packetWriter.isaacCipher); // L: 9196
			var8.packetBuffer.method7703(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9197
			var8.packetBuffer.writeShort(VarcInt.baseY + var1); // L: 9198
			var8.packetBuffer.method7712(var3); // L: 9199
			var8.packetBuffer.method7710(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 9200
			Client.packetWriter.addNode(var8); // L: 9201
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 8870
			Client.mouseCrossY = var7; // L: 8871
			Client.mouseCrossColor = 2; // L: 8872
			Client.mouseCrossState = 0; // L: 8873
			Client.destinationX = var0; // L: 8874
			Client.destinationY = var1; // L: 8875
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2927, Client.packetWriter.isaacCipher); // L: 8877
			var8.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8878
			var8.packetBuffer.method7711(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 8879
			var8.packetBuffer.writeShort(VarcInt.baseY + var1); // L: 8880
			var8.packetBuffer.method7711(var3); // L: 8881
			Client.packetWriter.addNode(var8); // L: 8882
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 8844
			Client.mouseCrossY = var7; // L: 8845
			Client.mouseCrossColor = 2; // L: 8846
			Client.mouseCrossState = 0; // L: 8847
			Client.destinationX = var0; // L: 8848
			Client.destinationY = var1; // L: 8849
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2895, Client.packetWriter.isaacCipher); // L: 8851
			var8.packetBuffer.method7701(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8852
			var8.packetBuffer.method7712(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 8853
			var8.packetBuffer.method7711(var3); // L: 8854
			var8.packetBuffer.method7711(VarcInt.baseY + var1); // L: 8855
			Client.packetWriter.addNode(var8); // L: 8856
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 9034
				if (var13 != null) { // L: 9035
					Client.mouseCrossX = var6; // L: 9036
					Client.mouseCrossY = var7; // L: 9037
					Client.mouseCrossColor = 2; // L: 9038
					Client.mouseCrossState = 0; // L: 9039
					Client.destinationX = var0; // L: 9040
					Client.destinationY = var1; // L: 9041
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2995, Client.packetWriter.isaacCipher); // L: 9043
					var9.packetBuffer.method7710(var3); // L: 9044
					var9.packetBuffer.writeIntME(TaskHandler.selectedItemWidget); // L: 9045
					var9.packetBuffer.method7712(Varcs.selectedItemId); // L: 9046
					var9.packetBuffer.method7703(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9047
					var9.packetBuffer.method7711(class432.selectedItemSlot); // L: 9048
					Client.packetWriter.addNode(var9); // L: 9049
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 9165
				if (var13 != null) { // L: 9166
					Client.mouseCrossX = var6; // L: 9167
					Client.mouseCrossY = var7; // L: 9168
					Client.mouseCrossColor = 2; // L: 9169
					Client.mouseCrossState = 0; // L: 9170
					Client.destinationX = var0; // L: 9171
					Client.destinationY = var1; // L: 9172
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2930, Client.packetWriter.isaacCipher); // L: 9173
					var9.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9174
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9175
					var9.packetBuffer.method7710(var3); // L: 9176
					var9.packetBuffer.method7721(Timer.selectedSpellWidget); // L: 9177
					var9.packetBuffer.method7711(Client.selectedSpellItemId); // L: 9178
					Client.packetWriter.addNode(var9); // L: 9179
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 9332
				if (var13 != null) { // L: 9333
					Client.mouseCrossX = var6; // L: 9334
					Client.mouseCrossY = var7; // L: 9335
					Client.mouseCrossColor = 2; // L: 9336
					Client.mouseCrossState = 0; // L: 9337
					Client.destinationX = var0; // L: 9338
					Client.destinationY = var1; // L: 9339
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2981, Client.packetWriter.isaacCipher); // L: 9341
					var9.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9342
					var9.packetBuffer.method7710(var3); // L: 9343
					Client.packetWriter.addNode(var9); // L: 9344
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 8950
				if (var13 != null) { // L: 8951
					Client.mouseCrossX = var6; // L: 8952
					Client.mouseCrossY = var7; // L: 8953
					Client.mouseCrossColor = 2; // L: 8954
					Client.mouseCrossState = 0; // L: 8955
					Client.destinationX = var0; // L: 8956
					Client.destinationY = var1; // L: 8957
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2925, Client.packetWriter.isaacCipher); // L: 8959
					var9.packetBuffer.writeShort(var3); // L: 8960
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8961
					Client.packetWriter.addNode(var9); // L: 8962
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 9070
				if (var13 != null) { // L: 9071
					Client.mouseCrossX = var6; // L: 9072
					Client.mouseCrossY = var7; // L: 9073
					Client.mouseCrossColor = 2; // L: 9074
					Client.mouseCrossState = 0; // L: 9075
					Client.destinationX = var0; // L: 9076
					Client.destinationY = var1; // L: 9077
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2902, Client.packetWriter.isaacCipher); // L: 9079
					var9.packetBuffer.method7710(var3); // L: 9080
					var9.packetBuffer.method7701(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9081
					Client.packetWriter.addNode(var9); // L: 9082
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 8991
				if (var13 != null) { // L: 8992
					Client.mouseCrossX = var6; // L: 8993
					Client.mouseCrossY = var7; // L: 8994
					Client.mouseCrossColor = 2; // L: 8995
					Client.mouseCrossState = 0; // L: 8996
					Client.destinationX = var0; // L: 8997
					Client.destinationY = var1; // L: 8998
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2940, Client.packetWriter.isaacCipher); // L: 9000
					var9.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9001
					var9.packetBuffer.method7710(var3); // L: 9002
					Client.packetWriter.addNode(var9); // L: 9003
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 9494
				if (var13 != null) { // L: 9495
					Client.mouseCrossX = var6; // L: 9496
					Client.mouseCrossY = var7; // L: 9497
					Client.mouseCrossColor = 2; // L: 9498
					Client.mouseCrossState = 0; // L: 9499
					Client.destinationX = var0; // L: 9500
					Client.destinationY = var1; // L: 9501
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2924, Client.packetWriter.isaacCipher); // L: 9503
					var9.packetBuffer.method7710(var3); // L: 9504
					var9.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9505
					Client.packetWriter.addNode(var9); // L: 9506
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 9442
					if (var15 != null) { // L: 9443
						Client.mouseCrossX = var6; // L: 9444
						Client.mouseCrossY = var7; // L: 9445
						Client.mouseCrossColor = 2; // L: 9446
						Client.mouseCrossState = 0; // L: 9447
						Client.destinationX = var0; // L: 9448
						Client.destinationY = var1; // L: 9449
						var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2956, Client.packetWriter.isaacCipher); // L: 9451
						var9.packetBuffer.method7712(Varcs.selectedItemId); // L: 9452
						var9.packetBuffer.writeShort(var3); // L: 9453
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9454
						var9.packetBuffer.method7711(class432.selectedItemSlot); // L: 9455
						var9.packetBuffer.writeIntME(TaskHandler.selectedItemWidget); // L: 9456
						Client.packetWriter.addNode(var9); // L: 9457
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 9541
					if (var15 != null) { // L: 9542
						Client.mouseCrossX = var6; // L: 9543
						Client.mouseCrossY = var7; // L: 9544
						Client.mouseCrossColor = 2; // L: 9545
						Client.mouseCrossState = 0; // L: 9546
						Client.destinationX = var0; // L: 9547
						Client.destinationY = var1; // L: 9548
						var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher); // L: 9549
						var9.packetBuffer.method7710(Client.selectedSpellChildIndex); // L: 9550
						var9.packetBuffer.method7711(var3); // L: 9551
						var9.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9552
						var9.packetBuffer.writeInt(Timer.selectedSpellWidget); // L: 9553
						var9.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9554
						Client.packetWriter.addNode(var9); // L: 9555
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 8805
					Client.mouseCrossY = var7; // L: 8806
					Client.mouseCrossColor = 2; // L: 8807
					Client.mouseCrossState = 0; // L: 8808
					Client.destinationX = var0; // L: 8809
					Client.destinationY = var1; // L: 8810
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2955, Client.packetWriter.isaacCipher); // L: 8812
					var8.packetBuffer.method7703(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8813
					var8.packetBuffer.method7711(class432.selectedItemSlot); // L: 8814
					var8.packetBuffer.method7711(var3); // L: 8815
					var8.packetBuffer.method7711(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 8816
					var8.packetBuffer.method7712(VarcInt.baseY + var1); // L: 8817
					var8.packetBuffer.writeIntME(TaskHandler.selectedItemWidget); // L: 8818
					var8.packetBuffer.writeShort(Varcs.selectedItemId); // L: 8819
					Client.packetWriter.addNode(var8); // L: 8820
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 8885
					Client.mouseCrossY = var7; // L: 8886
					Client.mouseCrossColor = 2; // L: 8887
					Client.mouseCrossState = 0; // L: 8888
					Client.destinationX = var0; // L: 8889
					Client.destinationY = var1; // L: 8890
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2904, Client.packetWriter.isaacCipher); // L: 8891
					var8.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 8892
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8893
					var8.packetBuffer.method7710(var3); // L: 8894
					var8.packetBuffer.writeInt(Timer.selectedSpellWidget); // L: 8895
					var8.packetBuffer.writeShort(VarcInt.baseY + var1); // L: 8896
					var8.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8897
					var8.packetBuffer.method7711(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 8898
					Client.packetWriter.addNode(var8); // L: 8899
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 9348
					Client.mouseCrossY = var7; // L: 9349
					Client.mouseCrossColor = 2; // L: 9350
					Client.mouseCrossState = 0; // L: 9351
					Client.destinationX = var0; // L: 9352
					Client.destinationY = var1; // L: 9353
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2933, Client.packetWriter.isaacCipher); // L: 9355
					var8.packetBuffer.method7703(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9356
					var8.packetBuffer.method7712(var3); // L: 9357
					var8.packetBuffer.writeShort(VarcInt.baseY + var1); // L: 9358
					var8.packetBuffer.method7710(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 9359
					Client.packetWriter.addNode(var8); // L: 9360
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 9379
					Client.mouseCrossY = var7; // L: 9380
					Client.mouseCrossColor = 2; // L: 9381
					Client.mouseCrossState = 0; // L: 9382
					Client.destinationX = var0; // L: 9383
					Client.destinationY = var1; // L: 9384
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2915, Client.packetWriter.isaacCipher); // L: 9386
					var8.packetBuffer.writeShort(VarcInt.baseY + var1); // L: 9387
					var8.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9388
					var8.packetBuffer.writeShort(var3); // L: 9389
					var8.packetBuffer.method7710(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 9390
					Client.packetWriter.addNode(var8); // L: 9391
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 8919
					Client.mouseCrossY = var7; // L: 8920
					Client.mouseCrossColor = 2; // L: 8921
					Client.mouseCrossState = 0; // L: 8922
					Client.destinationX = var0; // L: 8923
					Client.destinationY = var1; // L: 8924
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2951, Client.packetWriter.isaacCipher); // L: 8926
					var8.packetBuffer.method7710(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 8927
					var8.packetBuffer.writeShort(var3); // L: 8928
					var8.packetBuffer.method7701(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8929
					var8.packetBuffer.method7711(VarcInt.baseY + var1); // L: 8930
					Client.packetWriter.addNode(var8); // L: 8931
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 9526
					Client.mouseCrossY = var7; // L: 9527
					Client.mouseCrossColor = 2; // L: 9528
					Client.mouseCrossState = 0; // L: 9529
					Client.destinationX = var0; // L: 9530
					Client.destinationY = var1; // L: 9531
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2942, Client.packetWriter.isaacCipher); // L: 9533
					var8.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9534
					var8.packetBuffer.writeShort(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 9535
					var8.packetBuffer.method7712(VarcInt.baseY + var1); // L: 9536
					var8.packetBuffer.method7712(var3); // L: 9537
					Client.packetWriter.addNode(var8); // L: 9538
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 9229
					Client.mouseCrossY = var7; // L: 9230
					Client.mouseCrossColor = 2; // L: 9231
					Client.mouseCrossState = 0; // L: 9232
					Client.destinationX = var0; // L: 9233
					Client.destinationY = var1; // L: 9234
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2920, Client.packetWriter.isaacCipher); // L: 9236
					var8.packetBuffer.method7701(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9237
					var8.packetBuffer.method7712(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 9238
					var8.packetBuffer.method7710(VarcInt.baseY + var1); // L: 9239
					var8.packetBuffer.writeShort(var3); // L: 9240
					Client.packetWriter.addNode(var8); // L: 9241
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8823
						ArchiveLoader.scene.setViewportWalking(); // L: 8824
					} else {
						ArchiveLoader.scene.menuOpen(class18.Client_plane, var0, var1, true); // L: 8827
					}
				} else {
					PacketBufferNode var10;
					Widget var16;
					if (var2 == 24) {
						var16 = class127.getWidget(var1); // L: 8966
						if (var16 != null) { // L: 8967
							boolean var11 = true; // L: 8968
							if (var16.contentType > 0) { // L: 8969
								var11 = ModeWhere.method6100(var16);
							}

							if (var11) { // L: 8970
								var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2897, Client.packetWriter.isaacCipher); // L: 8972
								var10.packetBuffer.writeInt(var1); // L: 8973
								Client.packetWriter.addNode(var10); // L: 8974
							}
						}
					} else {
						if (var2 == 25) {
							var16 = ItemComposition.getWidgetChild(var1, var0); // L: 8831
							if (var16 != null) { // L: 8832
								FriendSystem.Widget_runOnTargetLeave(); // L: 8833
								Renderable.selectSpell(var1, var0, WorldMapID.Widget_unpackTargetMask(class326.getWidgetFlags(var16)), var16.itemId); // L: 8834
								Client.isItemSelected = 0; // L: 8835
								Client.selectedSpellActionName = class152.Widget_getSpellActionName(var16); // L: 8836
								if (Client.selectedSpellActionName == null) { // L: 8837
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 8838
									Client.selectedSpellName = var16.dataText + UserComparator9.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = UserComparator9.colorStartTag(65280) + var16.spellName + UserComparator9.colorStartTag(16777215); // L: 8839
								}
							}

							return; // L: 8841
						}

						if (var2 == 26) {
							class20.method294(); // L: 9020
						} else {
							int var12;
							Widget var14;
							if (var2 == 28) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2897, Client.packetWriter.isaacCipher); // L: 9205
								var8.packetBuffer.writeInt(var1); // L: 9206
								Client.packetWriter.addNode(var8); // L: 9207
								var14 = class127.getWidget(var1); // L: 9208
								if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 9209
									var12 = var14.cs1Instructions[0][1]; // L: 9210
									Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12]; // L: 9211
									WorldMapLabel.changeGameOptions(var12); // L: 9212
								}
							} else if (var2 == 29) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2897, Client.packetWriter.isaacCipher); // L: 9560
								var8.packetBuffer.writeInt(var1); // L: 9561
								Client.packetWriter.addNode(var8); // L: 9562
								var14 = class127.getWidget(var1); // L: 9563
								if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 9564
									var12 = var14.cs1Instructions[0][1]; // L: 9565
									if (Varps.Varps_main[var12] != var14.cs1ComparisonValues[0]) { // L: 9566
										Varps.Varps_main[var12] = var14.cs1ComparisonValues[0]; // L: 9567
										WorldMapLabel.changeGameOptions(var12); // L: 9568
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 9394
									class268.resumePauseWidget(var1, var0); // L: 9395
									Client.meslayerContinueWidget = ItemComposition.getWidgetChild(var1, var0); // L: 9396
									class346.invalidateWidget(Client.meslayerContinueWidget); // L: 9397
								}
							} else if (var2 == 31) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2971, Client.packetWriter.isaacCipher); // L: 9319
								var8.packetBuffer.writeIntME(TaskHandler.selectedItemWidget); // L: 9320
								var8.packetBuffer.method7710(class432.selectedItemSlot); // L: 9321
								var8.packetBuffer.method7721(var1); // L: 9322
								var8.packetBuffer.writeShort(var3); // L: 9323
								var8.packetBuffer.writeShort(var0); // L: 9324
								var8.packetBuffer.method7710(Varcs.selectedItemId); // L: 9325
								Client.packetWriter.addNode(var8); // L: 9326
								Client.field610 = 0; // L: 9327
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 9328
								Client.field611 = var0; // L: 9329
							} else if (var2 == 32) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2959, Client.packetWriter.isaacCipher); // L: 9153
								var8.packetBuffer.method7711(var3); // L: 9154
								var8.packetBuffer.writeIntME(Timer.selectedSpellWidget); // L: 9155
								var8.packetBuffer.method7711(var0); // L: 9156
								var8.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9157
								var8.packetBuffer.writeInt(var1); // L: 9158
								Client.packetWriter.addNode(var8); // L: 9159
								Client.field610 = 0; // L: 9160
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 9161
								Client.field611 = var0; // L: 9162
							} else if (var2 == 33) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2985, Client.packetWriter.isaacCipher); // L: 9260
								var8.packetBuffer.writeShort(var3); // L: 9261
								var8.packetBuffer.writeShort(var0); // L: 9262
								var8.packetBuffer.method7721(var1); // L: 9263
								Client.packetWriter.addNode(var8); // L: 9264
								Client.field610 = 0; // L: 9265
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 9266
								Client.field611 = var0; // L: 9267
							} else if (var2 == 34) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2969, Client.packetWriter.isaacCipher); // L: 9589
								var8.packetBuffer.method7721(var1); // L: 9590
								var8.packetBuffer.writeShort(var0); // L: 9591
								var8.packetBuffer.writeShort(var3); // L: 9592
								Client.packetWriter.addNode(var8); // L: 9593
								Client.field610 = 0; // L: 9594
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 9595
								Client.field611 = var0; // L: 9596
							} else if (var2 == 35) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2997, Client.packetWriter.isaacCipher); // L: 9462
								var8.packetBuffer.writeShort(var3); // L: 9463
								var8.packetBuffer.writeShort(var0); // L: 9464
								var8.packetBuffer.method7721(var1); // L: 9465
								Client.packetWriter.addNode(var8); // L: 9466
								Client.field610 = 0; // L: 9467
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 9468
								Client.field611 = var0; // L: 9469
							} else if (var2 == 36) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2954, Client.packetWriter.isaacCipher); // L: 9113
								var8.packetBuffer.method7710(var3); // L: 9114
								var8.packetBuffer.method7721(var1); // L: 9115
								var8.packetBuffer.method7712(var0); // L: 9116
								Client.packetWriter.addNode(var8); // L: 9117
								Client.field610 = 0; // L: 9118
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 9119
								Client.field611 = var0; // L: 9120
							} else if (var2 == 37) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2998, Client.packetWriter.isaacCipher); // L: 8860
								var8.packetBuffer.writeIntME(var1); // L: 8861
								var8.packetBuffer.writeShort(var3); // L: 8862
								var8.packetBuffer.method7712(var0); // L: 8863
								Client.packetWriter.addNode(var8); // L: 8864
								Client.field610 = 0; // L: 8865
								GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 8866
								Client.field611 = var0; // L: 8867
							} else {
								if (var2 == 38) {
									FriendSystem.Widget_runOnTargetLeave(); // L: 8979
									var16 = class127.getWidget(var1); // L: 8980
									Client.isItemSelected = 1; // L: 8981
									class432.selectedItemSlot = var0; // L: 8982
									TaskHandler.selectedItemWidget = var1; // L: 8983
									Varcs.selectedItemId = var3; // L: 8984
									class346.invalidateWidget(var16); // L: 8985
									Client.selectedItemName = UserComparator9.colorStartTag(16748608) + class19.ItemDefinition_get(var3).name + UserComparator9.colorStartTag(16777215); // L: 8986
									if (Client.selectedItemName == null) { // L: 8987
										Client.selectedItemName = "null";
									}

									return; // L: 8988
								}

								if (var2 == 39) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2922, Client.packetWriter.isaacCipher); // L: 9024
									var8.packetBuffer.writeInt(var1); // L: 9025
									var8.packetBuffer.method7711(var0); // L: 9026
									var8.packetBuffer.method7710(var3); // L: 9027
									Client.packetWriter.addNode(var8); // L: 9028
									Client.field610 = 0; // L: 9029
									GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 9030
									Client.field611 = var0; // L: 9031
								} else if (var2 == 40) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2958, Client.packetWriter.isaacCipher); // L: 9142
									var8.packetBuffer.writeIntME(var1); // L: 9143
									var8.packetBuffer.writeShort(var0); // L: 9144
									var8.packetBuffer.method7711(var3); // L: 9145
									Client.packetWriter.addNode(var8); // L: 9146
									Client.field610 = 0; // L: 9147
									GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 9148
									Client.field611 = var0; // L: 9149
								} else if (var2 == 41) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2921, Client.packetWriter.isaacCipher); // L: 9432
									var8.packetBuffer.method7711(var3); // L: 9433
									var8.packetBuffer.method7721(var1); // L: 9434
									var8.packetBuffer.method7712(var0); // L: 9435
									Client.packetWriter.addNode(var8); // L: 9436
									Client.field610 = 0; // L: 9437
									GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 9438
									Client.field611 = var0; // L: 9439
								} else if (var2 == 42) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2896, Client.packetWriter.isaacCipher); // L: 9484
									var8.packetBuffer.method7712(var0); // L: 9485
									var8.packetBuffer.writeInt(var1); // L: 9486
									var8.packetBuffer.method7710(var3); // L: 9487
									Client.packetWriter.addNode(var8); // L: 9488
									Client.field610 = 0; // L: 9489
									GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 9490
									Client.field611 = var0; // L: 9491
								} else if (var2 == 43) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2938, Client.packetWriter.isaacCipher); // L: 9473
									var8.packetBuffer.method7712(var0); // L: 9474
									var8.packetBuffer.method7712(var3); // L: 9475
									var8.packetBuffer.writeInt(var1); // L: 9476
									Client.packetWriter.addNode(var8); // L: 9477
									Client.field610 = 0; // L: 9478
									GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 9479
									Client.field611 = var0; // L: 9480
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 9286
									if (var15 != null) { // L: 9287
										Client.mouseCrossX = var6; // L: 9288
										Client.mouseCrossY = var7; // L: 9289
										Client.mouseCrossColor = 2; // L: 9290
										Client.mouseCrossState = 0; // L: 9291
										Client.destinationX = var0; // L: 9292
										Client.destinationY = var1; // L: 9293
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2913, Client.packetWriter.isaacCipher); // L: 9295
										var9.packetBuffer.method7710(var3); // L: 9296
										var9.packetBuffer.method7701(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9297
										Client.packetWriter.addNode(var9); // L: 9298
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 8934
									if (var15 != null) { // L: 8935
										Client.mouseCrossX = var6; // L: 8936
										Client.mouseCrossY = var7; // L: 8937
										Client.mouseCrossColor = 2; // L: 8938
										Client.mouseCrossState = 0; // L: 8939
										Client.destinationX = var0; // L: 8940
										Client.destinationY = var1; // L: 8941
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2957, Client.packetWriter.isaacCipher); // L: 8943
										var9.packetBuffer.method7710(var3); // L: 8944
										var9.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8945
										Client.packetWriter.addNode(var9); // L: 8946
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 9086
									if (var15 != null) { // L: 9087
										Client.mouseCrossX = var6; // L: 9088
										Client.mouseCrossY = var7; // L: 9089
										Client.mouseCrossColor = 2; // L: 9090
										Client.mouseCrossState = 0; // L: 9091
										Client.destinationX = var0; // L: 9092
										Client.destinationY = var1; // L: 9093
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2964, Client.packetWriter.isaacCipher); // L: 9095
										var9.packetBuffer.method7701(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9096
										var9.packetBuffer.method7711(var3); // L: 9097
										Client.packetWriter.addNode(var9); // L: 9098
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 9510
									if (var15 != null) { // L: 9511
										Client.mouseCrossX = var6; // L: 9512
										Client.mouseCrossY = var7; // L: 9513
										Client.mouseCrossColor = 2; // L: 9514
										Client.mouseCrossState = 0; // L: 9515
										Client.destinationX = var0; // L: 9516
										Client.destinationY = var1; // L: 9517
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2939, Client.packetWriter.isaacCipher); // L: 9519
										var9.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9520
										var9.packetBuffer.writeShort(var3); // L: 9521
										Client.packetWriter.addNode(var9); // L: 9522
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 9415
									if (var15 != null) { // L: 9416
										Client.mouseCrossX = var6; // L: 9417
										Client.mouseCrossY = var7; // L: 9418
										Client.mouseCrossColor = 2; // L: 9419
										Client.mouseCrossState = 0; // L: 9420
										Client.destinationX = var0; // L: 9421
										Client.destinationY = var1; // L: 9422
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2972, Client.packetWriter.isaacCipher); // L: 9424
										var9.packetBuffer.writeShort(var3); // L: 9425
										var9.packetBuffer.method7701(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9426
										Client.packetWriter.addNode(var9); // L: 9427
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 9270
									if (var15 != null) { // L: 9271
										Client.mouseCrossX = var6; // L: 9272
										Client.mouseCrossY = var7; // L: 9273
										Client.mouseCrossColor = 2; // L: 9274
										Client.mouseCrossState = 0; // L: 9275
										Client.destinationX = var0; // L: 9276
										Client.destinationY = var1; // L: 9277
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2931, Client.packetWriter.isaacCipher); // L: 9279
										var9.packetBuffer.method7712(var3); // L: 9280
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9281
										Client.packetWriter.addNode(var9); // L: 9282
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 9363
									if (var15 != null) { // L: 9364
										Client.mouseCrossX = var6; // L: 9365
										Client.mouseCrossY = var7; // L: 9366
										Client.mouseCrossColor = 2; // L: 9367
										Client.mouseCrossState = 0; // L: 9368
										Client.destinationX = var0; // L: 9369
										Client.destinationY = var1; // L: 9370
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2923, Client.packetWriter.isaacCipher); // L: 9372
										var9.packetBuffer.writeShort(var3); // L: 9373
										var9.packetBuffer.method7701(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9374
										Client.packetWriter.addNode(var9); // L: 9375
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 9302
									if (var15 != null) { // L: 9303
										Client.mouseCrossX = var6; // L: 9304
										Client.mouseCrossY = var7; // L: 9305
										Client.mouseCrossColor = 2; // L: 9306
										Client.mouseCrossState = 0; // L: 9307
										Client.destinationX = var0; // L: 9308
										Client.destinationY = var1; // L: 9309
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2974, Client.packetWriter.isaacCipher); // L: 9311
										var9.packetBuffer.method7712(var3); // L: 9312
										var9.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9313
										Client.packetWriter.addNode(var9); // L: 9314
									}
								} else if (var2 != 1007 && var2 != 57) {
									if (var2 == 58) {
										var16 = ItemComposition.getWidgetChild(var1, var0); // L: 9401
										if (var16 != null) { // L: 9402
											var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2894, Client.packetWriter.isaacCipher); // L: 9404
											var9.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9405
											var9.packetBuffer.writeIntME(Timer.selectedSpellWidget); // L: 9406
											var9.packetBuffer.method7711(var16.itemId); // L: 9407
											var9.packetBuffer.method7712(Client.selectedSpellChildIndex); // L: 9408
											var9.packetBuffer.writeInt(var1); // L: 9409
											var9.packetBuffer.method7711(var0); // L: 9410
											Client.packetWriter.addNode(var9); // L: 9411
										}
									} else if (var2 == 1001) {
										Client.mouseCrossX = var6; // L: 9244
										Client.mouseCrossY = var7; // L: 9245
										Client.mouseCrossColor = 2; // L: 9246
										Client.mouseCrossState = 0; // L: 9247
										Client.destinationX = var0; // L: 9248
										Client.destinationY = var1; // L: 9249
										var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2993, Client.packetWriter.isaacCipher); // L: 9251
										var8.packetBuffer.method7710(var3); // L: 9252
										var8.packetBuffer.method7711(var0 + GrandExchangeOfferOwnWorldComparator.baseX); // L: 9253
										var8.packetBuffer.method7804(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9254
										var8.packetBuffer.writeShort(VarcInt.baseY + var1); // L: 9255
										Client.packetWriter.addNode(var8); // L: 9256
									} else if (var2 == 1002) {
										Client.mouseCrossX = var6; // L: 9102
										Client.mouseCrossY = var7; // L: 9103
										Client.mouseCrossColor = 2; // L: 9104
										Client.mouseCrossState = 0; // L: 9105
										var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2949, Client.packetWriter.isaacCipher); // L: 9107
										var8.packetBuffer.method7712(var3); // L: 9108
										Client.packetWriter.addNode(var8); // L: 9109
									} else if (var2 == 1003) {
										Client.mouseCrossX = var6; // L: 8902
										Client.mouseCrossY = var7; // L: 8903
										Client.mouseCrossColor = 2; // L: 8904
										Client.mouseCrossState = 0; // L: 8905
										var13 = Client.npcs[var3]; // L: 8906
										if (var13 != null) { // L: 8907
											NPCComposition var17 = var13.definition; // L: 8908
											if (var17.transforms != null) { // L: 8909
												var17 = var17.transform();
											}

											if (var17 != null) { // L: 8910
												var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2936, Client.packetWriter.isaacCipher); // L: 8912
												var10.packetBuffer.method7710(var17.id); // L: 8913
												Client.packetWriter.addNode(var10); // L: 8914
											}
										}
									} else if (var2 == 1004) {
										Client.mouseCrossX = var6; // L: 9219
										Client.mouseCrossY = var7; // L: 9220
										Client.mouseCrossColor = 2; // L: 9221
										Client.mouseCrossState = 0; // L: 9222
										var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher); // L: 9224
										var8.packetBuffer.method7711(var3); // L: 9225
										Client.packetWriter.addNode(var8); // L: 9226
									} else if (var2 == 1005) {
										var16 = class127.getWidget(var1); // L: 9007
										if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 9008
											Actor.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class19.ItemDefinition_get(var3).name);
										} else {
											var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher); // L: 9011
											var9.packetBuffer.method7711(var3); // L: 9012
											Client.packetWriter.addNode(var9); // L: 9013
										}

										Client.field610 = 0; // L: 9015
										GrandExchangeOfferAgeComparator.field4011 = class127.getWidget(var1); // L: 9016
										Client.field611 = var0; // L: 9017
									} else if (var2 == 1011 || var2 == 1010 || var2 == 1009 || var2 == 1008 || var2 == 1012) {
										ScriptFrame.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9216
									}
								} else {
									var16 = ItemComposition.getWidgetChild(var1, var0); // L: 9183
									if (var16 != null) { // L: 9184
										WorldMapLabelSize.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 9185
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 9598
			Client.isItemSelected = 0; // L: 9599
			class346.invalidateWidget(class127.getWidget(TaskHandler.selectedItemWidget)); // L: 9600
		}

		if (Client.isSpellSelected) { // L: 9602
			FriendSystem.Widget_runOnTargetLeave();
		}

		if (GrandExchangeOfferAgeComparator.field4011 != null && Client.field610 == 0) { // L: 9603
			class346.invalidateWidget(GrandExchangeOfferAgeComparator.field4011);
		}

	} // L: 9604

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-53"
	)
	static final void method74(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10698
		int var7 = var3 - var1; // L: 10699
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10700
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10701
		int var10 = var8; // L: 10702
		if (var8 < var9) { // L: 10703
			var10 = var9;
		}

		if (var10 != 0) { // L: 10704
			int var11 = (var6 << 16) / var10; // L: 10705
			int var12 = (var7 << 16) / var10; // L: 10706
			if (var12 <= var11) { // L: 10707
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10708
			}

			int var13 = var5 * var12 >> 17; // L: 10709
			int var14 = var5 * var12 + 1 >> 17; // L: 10710
			int var15 = var5 * var11 >> 17; // L: 10711
			int var16 = var5 * var11 + 1 >> 17; // L: 10712
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10713
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10714
			int var17 = var0 + var13; // L: 10715
			int var18 = var0 - var14; // L: 10716
			int var19 = var0 + var6 - var14; // L: 10717
			int var20 = var0 + var13 + var6; // L: 10718
			int var21 = var15 + var1; // L: 10719
			int var22 = var1 - var16; // L: 10720
			int var23 = var7 + var1 - var16; // L: 10721
			int var24 = var7 + var15 + var1; // L: 10722
			Rasterizer3D.method4673(var17, var18, var19); // L: 10723
			Rasterizer3D.method4617(var21, var22, var23, var17, var18, var19, var4); // L: 10724
			Rasterizer3D.method4673(var17, var19, var20); // L: 10725
			Rasterizer3D.method4617(var21, var23, var24, var17, var19, var20, var4); // L: 10726
		}
	} // L: 10727
}
