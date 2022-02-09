import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
class class18 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ly;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1; // L: 40
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-1424585601"
	)
	int method261(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 42
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 50
	}

	public int compare(Object var1, Object var2) {
		return this.method261((Entry)var1, (Entry)var2); // L: 46
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "18786529"
	)
	public static void method268() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 94
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 95
	} // L: 96

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2032312560"
	)
	public static final void method260() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 90
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 91
	} // L: 92

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "64"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 8322
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 8323
			Client.mouseCrossX = var6; // L: 8324
			Client.mouseCrossY = var7; // L: 8325
			Client.mouseCrossColor = 2; // L: 8326
			Client.mouseCrossState = 0; // L: 8327
			Client.destinationX = var0; // L: 8328
			Client.destinationY = var1; // L: 8329
			var8 = class135.getPacketBufferNode(ClientPacket.field2845, Client.packetWriter.isaacCipher); // L: 8331
			var8.packetBuffer.method7394(var3); // L: 8332
			var8.packetBuffer.method7555(var0 + Canvas.baseX); // L: 8333
			var8.packetBuffer.method7555(WorldMapAreaData.selectedItemSlot); // L: 8334
			var8.packetBuffer.writeShort(class286.selectedItemId); // L: 8335
			var8.packetBuffer.method7394(class118.baseY + var1); // L: 8336
			var8.packetBuffer.method7370(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8337
			var8.packetBuffer.method7486(class133.selectedItemWidget); // L: 8338
			Client.packetWriter.addNode(var8); // L: 8339
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 8769
			Client.mouseCrossY = var7; // L: 8770
			Client.mouseCrossColor = 2; // L: 8771
			Client.mouseCrossState = 0; // L: 8772
			Client.destinationX = var0; // L: 8773
			Client.destinationY = var1; // L: 8774
			var8 = class135.getPacketBufferNode(ClientPacket.field2910, Client.packetWriter.isaacCipher); // L: 8775
			var8.packetBuffer.writeShort(class118.baseY + var1); // L: 8776
			var8.packetBuffer.writeInt(WorldMapLabelSize.selectedSpellWidget); // L: 8777
			var8.packetBuffer.method7555(var0 + Canvas.baseX); // L: 8778
			var8.packetBuffer.method7555(Client.selectedSpellChildIndex); // L: 8779
			var8.packetBuffer.method7405(Client.field536); // L: 8780
			var8.packetBuffer.writeShort(var3); // L: 8781
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8782
			Client.packetWriter.addNode(var8); // L: 8783
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 8665
			Client.mouseCrossY = var7; // L: 8666
			Client.mouseCrossColor = 2; // L: 8667
			Client.mouseCrossState = 0; // L: 8668
			Client.destinationX = var0; // L: 8669
			Client.destinationY = var1; // L: 8670
			var8 = class135.getPacketBufferNode(ClientPacket.field2876, Client.packetWriter.isaacCipher); // L: 8672
			var8.packetBuffer.method7394(var0 + Canvas.baseX); // L: 8673
			var8.packetBuffer.method7555(class118.baseY + var1); // L: 8674
			var8.packetBuffer.writeShort(var3); // L: 8675
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8676
			Client.packetWriter.addNode(var8); // L: 8677
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 8923
			Client.mouseCrossY = var7; // L: 8924
			Client.mouseCrossColor = 2; // L: 8925
			Client.mouseCrossState = 0; // L: 8926
			Client.destinationX = var0; // L: 8927
			Client.destinationY = var1; // L: 8928
			var8 = class135.getPacketBufferNode(ClientPacket.field2852, Client.packetWriter.isaacCipher); // L: 8930
			var8.packetBuffer.method7555(var0 + Canvas.baseX); // L: 8931
			var8.packetBuffer.method7394(var3); // L: 8932
			var8.packetBuffer.method7555(class118.baseY + var1); // L: 8933
			var8.packetBuffer.method7370(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8934
			Client.packetWriter.addNode(var8); // L: 8935
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 8868
			Client.mouseCrossY = var7; // L: 8869
			Client.mouseCrossColor = 2; // L: 8870
			Client.mouseCrossState = 0; // L: 8871
			Client.destinationX = var0; // L: 8872
			Client.destinationY = var1; // L: 8873
			var8 = class135.getPacketBufferNode(ClientPacket.field2934, Client.packetWriter.isaacCipher); // L: 8875
			var8.packetBuffer.method7555(class118.baseY + var1); // L: 8876
			var8.packetBuffer.method7370(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8877
			var8.packetBuffer.method7555(var3); // L: 8878
			var8.packetBuffer.writeShort(var0 + Canvas.baseX); // L: 8879
			Client.packetWriter.addNode(var8); // L: 8880
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 8725
			Client.mouseCrossY = var7; // L: 8726
			Client.mouseCrossColor = 2; // L: 8727
			Client.mouseCrossState = 0; // L: 8728
			Client.destinationX = var0; // L: 8729
			Client.destinationY = var1; // L: 8730
			var8 = class135.getPacketBufferNode(ClientPacket.field2927, Client.packetWriter.isaacCipher); // L: 8732
			var8.packetBuffer.writeShort(class118.baseY + var1); // L: 8733
			var8.packetBuffer.method7555(var3); // L: 8734
			var8.packetBuffer.method7394(var0 + Canvas.baseX); // L: 8735
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8736
			Client.packetWriter.addNode(var8); // L: 8737
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 9097
				if (var13 != null) { // L: 9098
					Client.mouseCrossX = var6; // L: 9099
					Client.mouseCrossY = var7; // L: 9100
					Client.mouseCrossColor = 2; // L: 9101
					Client.mouseCrossState = 0; // L: 9102
					Client.destinationX = var0; // L: 9103
					Client.destinationY = var1; // L: 9104
					var9 = class135.getPacketBufferNode(ClientPacket.field2889, Client.packetWriter.isaacCipher); // L: 9106
					var9.packetBuffer.method7394(var3); // L: 9107
					var9.packetBuffer.method7394(WorldMapAreaData.selectedItemSlot); // L: 9108
					var9.packetBuffer.method7394(class286.selectedItemId); // L: 9109
					var9.packetBuffer.method7450(class133.selectedItemWidget); // L: 9110
					var9.packetBuffer.method7458(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9111
					Client.packetWriter.addNode(var9); // L: 9112
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 8898
				if (var13 != null) { // L: 8899
					Client.mouseCrossX = var6; // L: 8900
					Client.mouseCrossY = var7; // L: 8901
					Client.mouseCrossColor = 2; // L: 8902
					Client.mouseCrossState = 0; // L: 8903
					Client.destinationX = var0; // L: 8904
					Client.destinationY = var1; // L: 8905
					var9 = class135.getPacketBufferNode(ClientPacket.field2848, Client.packetWriter.isaacCipher); // L: 8906
					var9.packetBuffer.method7555(Client.selectedSpellChildIndex); // L: 8907
					var9.packetBuffer.method7394(var3); // L: 8908
					var9.packetBuffer.method7458(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8909
					var9.packetBuffer.method7450(WorldMapLabelSize.selectedSpellWidget); // L: 8910
					var9.packetBuffer.method7405(Client.field536); // L: 8911
					Client.packetWriter.addNode(var9); // L: 8912
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 8577
				if (var13 != null) { // L: 8578
					Client.mouseCrossX = var6; // L: 8579
					Client.mouseCrossY = var7; // L: 8580
					Client.mouseCrossColor = 2; // L: 8581
					Client.mouseCrossState = 0; // L: 8582
					Client.destinationX = var0; // L: 8583
					Client.destinationY = var1; // L: 8584
					var9 = class135.getPacketBufferNode(ClientPacket.field2834, Client.packetWriter.isaacCipher); // L: 8586
					var9.packetBuffer.method7555(var3); // L: 8587
					var9.packetBuffer.method7403(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8588
					Client.packetWriter.addNode(var9); // L: 8589
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 8694
				if (var13 != null) { // L: 8695
					Client.mouseCrossX = var6; // L: 8696
					Client.mouseCrossY = var7; // L: 8697
					Client.mouseCrossColor = 2; // L: 8698
					Client.mouseCrossState = 0; // L: 8699
					Client.destinationX = var0; // L: 8700
					Client.destinationY = var1; // L: 8701
					var9 = class135.getPacketBufferNode(ClientPacket.field2931, Client.packetWriter.isaacCipher); // L: 8703
					var9.packetBuffer.method7370(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8704
					var9.packetBuffer.method7405(var3); // L: 8705
					Client.packetWriter.addNode(var9); // L: 8706
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 8417
				if (var13 != null) { // L: 8418
					Client.mouseCrossX = var6; // L: 8419
					Client.mouseCrossY = var7; // L: 8420
					Client.mouseCrossColor = 2; // L: 8421
					Client.mouseCrossState = 0; // L: 8422
					Client.destinationX = var0; // L: 8423
					Client.destinationY = var1; // L: 8424
					var9 = class135.getPacketBufferNode(ClientPacket.field2841, Client.packetWriter.isaacCipher); // L: 8426
					var9.packetBuffer.method7405(var3); // L: 8427
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8428
					Client.packetWriter.addNode(var9); // L: 8429
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 8615
				if (var13 != null) { // L: 8616
					Client.mouseCrossX = var6; // L: 8617
					Client.mouseCrossY = var7; // L: 8618
					Client.mouseCrossColor = 2; // L: 8619
					Client.mouseCrossState = 0; // L: 8620
					Client.destinationX = var0; // L: 8621
					Client.destinationY = var1; // L: 8622
					var9 = class135.getPacketBufferNode(ClientPacket.field2843, Client.packetWriter.isaacCipher); // L: 8624
					var9.packetBuffer.method7405(var3); // L: 8625
					var9.packetBuffer.method7458(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8626
					Client.packetWriter.addNode(var9); // L: 8627
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 8976
				if (var13 != null) { // L: 8977
					Client.mouseCrossX = var6; // L: 8978
					Client.mouseCrossY = var7; // L: 8979
					Client.mouseCrossColor = 2; // L: 8980
					Client.mouseCrossState = 0; // L: 8981
					Client.destinationX = var0; // L: 8982
					Client.destinationY = var1; // L: 8983
					var9 = class135.getPacketBufferNode(ClientPacket.field2911, Client.packetWriter.isaacCipher); // L: 8985
					var9.packetBuffer.writeShort(var3); // L: 8986
					var9.packetBuffer.method7403(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8987
					Client.packetWriter.addNode(var9); // L: 8988
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 9078
					if (var15 != null) { // L: 9079
						Client.mouseCrossX = var6; // L: 9080
						Client.mouseCrossY = var7; // L: 9081
						Client.mouseCrossColor = 2; // L: 9082
						Client.mouseCrossState = 0; // L: 9083
						Client.destinationX = var0; // L: 9084
						Client.destinationY = var1; // L: 9085
						var9 = class135.getPacketBufferNode(ClientPacket.field2913, Client.packetWriter.isaacCipher); // L: 9087
						var9.packetBuffer.method7403(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9088
						var9.packetBuffer.writeIntME(class133.selectedItemWidget); // L: 9089
						var9.packetBuffer.method7394(WorldMapAreaData.selectedItemSlot); // L: 9090
						var9.packetBuffer.method7555(var3); // L: 9091
						var9.packetBuffer.method7555(class286.selectedItemId); // L: 9092
						Client.packetWriter.addNode(var9); // L: 9093
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 8472
					if (var15 != null) { // L: 8473
						Client.mouseCrossX = var6; // L: 8474
						Client.mouseCrossY = var7; // L: 8475
						Client.mouseCrossColor = 2; // L: 8476
						Client.mouseCrossState = 0; // L: 8477
						Client.destinationX = var0; // L: 8478
						Client.destinationY = var1; // L: 8479
						var9 = class135.getPacketBufferNode(ClientPacket.field2842, Client.packetWriter.isaacCipher); // L: 8480
						var9.packetBuffer.method7403(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8481
						var9.packetBuffer.writeIntME(WorldMapLabelSize.selectedSpellWidget); // L: 8482
						var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8483
						var9.packetBuffer.method7405(Client.field536); // L: 8484
						var9.packetBuffer.method7405(var3); // L: 8485
						Client.packetWriter.addNode(var9); // L: 8486
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 8740
					Client.mouseCrossY = var7; // L: 8741
					Client.mouseCrossColor = 2; // L: 8742
					Client.mouseCrossState = 0; // L: 8743
					Client.destinationX = var0; // L: 8744
					Client.destinationY = var1; // L: 8745
					var8 = class135.getPacketBufferNode(ClientPacket.field2938, Client.packetWriter.isaacCipher); // L: 8747
					var8.packetBuffer.writeShort(class118.baseY + var1); // L: 8748
					var8.packetBuffer.method7405(WorldMapAreaData.selectedItemSlot); // L: 8749
					var8.packetBuffer.method7405(var3); // L: 8750
					var8.packetBuffer.method7394(var0 + Canvas.baseX); // L: 8751
					var8.packetBuffer.writeIntME(class133.selectedItemWidget); // L: 8752
					var8.packetBuffer.method7370(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8753
					var8.packetBuffer.method7405(class286.selectedItemId); // L: 8754
					Client.packetWriter.addNode(var8); // L: 8755
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 9047
					Client.mouseCrossY = var7; // L: 9048
					Client.mouseCrossColor = 2; // L: 9049
					Client.mouseCrossState = 0; // L: 9050
					Client.destinationX = var0; // L: 9051
					Client.destinationY = var1; // L: 9052
					var8 = class135.getPacketBufferNode(ClientPacket.field2840, Client.packetWriter.isaacCipher); // L: 9053
					var8.packetBuffer.writeInt(WorldMapLabelSize.selectedSpellWidget); // L: 9054
					var8.packetBuffer.method7405(class118.baseY + var1); // L: 9055
					var8.packetBuffer.method7370(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9056
					var8.packetBuffer.method7405(Client.selectedSpellChildIndex); // L: 9057
					var8.packetBuffer.method7405(var3); // L: 9058
					var8.packetBuffer.method7394(var0 + Canvas.baseX); // L: 9059
					var8.packetBuffer.method7394(Client.field536); // L: 9060
					Client.packetWriter.addNode(var8); // L: 9061
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 8816
					Client.mouseCrossY = var7; // L: 8817
					Client.mouseCrossColor = 2; // L: 8818
					Client.mouseCrossState = 0; // L: 8819
					Client.destinationX = var0; // L: 8820
					Client.destinationY = var1; // L: 8821
					var8 = class135.getPacketBufferNode(ClientPacket.field2881, Client.packetWriter.isaacCipher); // L: 8823
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8824
					var8.packetBuffer.writeShort(class118.baseY + var1); // L: 8825
					var8.packetBuffer.method7555(var3); // L: 8826
					var8.packetBuffer.writeShort(var0 + Canvas.baseX); // L: 8827
					Client.packetWriter.addNode(var8); // L: 8828
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 8538
					Client.mouseCrossY = var7; // L: 8539
					Client.mouseCrossColor = 2; // L: 8540
					Client.mouseCrossState = 0; // L: 8541
					Client.destinationX = var0; // L: 8542
					Client.destinationY = var1; // L: 8543
					var8 = class135.getPacketBufferNode(ClientPacket.field2920, Client.packetWriter.isaacCipher); // L: 8545
					var8.packetBuffer.method7555(class118.baseY + var1); // L: 8546
					var8.packetBuffer.method7403(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8547
					var8.packetBuffer.method7394(var0 + Canvas.baseX); // L: 8548
					var8.packetBuffer.method7394(var3); // L: 8549
					Client.packetWriter.addNode(var8); // L: 8550
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 8831
					Client.mouseCrossY = var7; // L: 8832
					Client.mouseCrossColor = 2; // L: 8833
					Client.mouseCrossState = 0; // L: 8834
					Client.destinationX = var0; // L: 8835
					Client.destinationY = var1; // L: 8836
					var8 = class135.getPacketBufferNode(ClientPacket.field2885, Client.packetWriter.isaacCipher); // L: 8838
					var8.packetBuffer.writeShort(class118.baseY + var1); // L: 8839
					var8.packetBuffer.writeShort(var3); // L: 8840
					var8.packetBuffer.method7555(var0 + Canvas.baseX); // L: 8841
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8842
					Client.packetWriter.addNode(var8); // L: 8843
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 8883
					Client.mouseCrossY = var7; // L: 8884
					Client.mouseCrossColor = 2; // L: 8885
					Client.mouseCrossState = 0; // L: 8886
					Client.destinationX = var0; // L: 8887
					Client.destinationY = var1; // L: 8888
					var8 = class135.getPacketBufferNode(ClientPacket.field2909, Client.packetWriter.isaacCipher); // L: 8890
					var8.packetBuffer.method7405(var3); // L: 8891
					var8.packetBuffer.method7394(var0 + Canvas.baseX); // L: 8892
					var8.packetBuffer.method7405(class118.baseY + var1); // L: 8893
					var8.packetBuffer.method7370(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8894
					Client.packetWriter.addNode(var8); // L: 8895
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 8631
					Client.mouseCrossY = var7; // L: 8632
					Client.mouseCrossColor = 2; // L: 8633
					Client.mouseCrossState = 0; // L: 8634
					Client.destinationX = var0; // L: 8635
					Client.destinationY = var1; // L: 8636
					var8 = class135.getPacketBufferNode(ClientPacket.field2844, Client.packetWriter.isaacCipher); // L: 8638
					var8.packetBuffer.method7394(var0 + Canvas.baseX); // L: 8639
					var8.packetBuffer.writeShort(class118.baseY + var1); // L: 8640
					var8.packetBuffer.method7555(var3); // L: 8641
					var8.packetBuffer.method7458(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8642
					Client.packetWriter.addNode(var8); // L: 8643
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8553
						Decimator.scene.setViewportWalking(); // L: 8554
					} else {
						Decimator.scene.menuOpen(SoundSystem.Client_plane, var0, var1, true); // L: 8557
					}
				} else {
					PacketBufferNode var12;
					Widget var16;
					if (var2 == 24) {
						var16 = class130.getWidget(var1); // L: 8802
						boolean var11 = true; // L: 8803
						if (var16.contentType > 0) { // L: 8804
							var11 = LoginScreenAnimation.method2218(var16);
						}

						if (var11) { // L: 8805
							var12 = class135.getPacketBufferNode(ClientPacket.field2936, Client.packetWriter.isaacCipher); // L: 8807
							var12.packetBuffer.writeInt(var1); // L: 8808
							Client.packetWriter.addNode(var12); // L: 8809
						}
					} else {
						if (var2 == 25) {
							var16 = ModeWhere.getWidgetChild(var1, var0); // L: 8459
							if (var16 != null) { // L: 8460
								WorldMapRectangle.Widget_runOnTargetLeave(); // L: 8461
								PendingSpawn.selectSpell(var1, var0, class135.Widget_unpackTargetMask(Language.getWidgetFlags(var16)), var16.itemId); // L: 8462
								Client.isItemSelected = 0; // L: 8463
								Client.selectedSpellActionName = WorldMapEvent.Widget_getSpellActionName(var16); // L: 8464
								if (Client.selectedSpellActionName == null) { // L: 8465
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 8466
									Client.selectedSpellName = var16.dataText + LoginScreenAnimation.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = LoginScreenAnimation.colorStartTag(65280) + var16.spellName + LoginScreenAnimation.colorStartTag(16777215); // L: 8467
								}
							}

							return; // L: 8469
						}

						if (var2 == 26) {
							VertexNormal.method4267(); // L: 8813
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = class135.getPacketBufferNode(ClientPacket.field2936, Client.packetWriter.isaacCipher); // L: 8857
								var8.packetBuffer.writeInt(var1); // L: 8858
								Client.packetWriter.addNode(var8); // L: 8859
								var14 = class130.getWidget(var1); // L: 8860
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8861
									var10 = var14.cs1Instructions[0][1]; // L: 8862
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10]; // L: 8863
									NetFileRequest.changeGameOptions(var10); // L: 8864
								}
							} else if (var2 == 29) {
								var8 = class135.getPacketBufferNode(ClientPacket.field2936, Client.packetWriter.isaacCipher); // L: 8404
								var8.packetBuffer.writeInt(var1); // L: 8405
								Client.packetWriter.addNode(var8); // L: 8406
								var14 = class130.getWidget(var1); // L: 8407
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8408
									var10 = var14.cs1Instructions[0][1]; // L: 8409
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) { // L: 8410
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0]; // L: 8411
										NetFileRequest.changeGameOptions(var10); // L: 8412
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 8916
									class312.resumePauseWidget(var1, var0); // L: 8917
									Client.meslayerContinueWidget = ModeWhere.getWidgetChild(var1, var0); // L: 8918
									class112.invalidateWidget(Client.meslayerContinueWidget); // L: 8919
								}
							} else if (var2 == 31) {
								var8 = class135.getPacketBufferNode(ClientPacket.field2892, Client.packetWriter.isaacCipher); // L: 8681
								var8.packetBuffer.writeIntME(var1); // L: 8682
								var8.packetBuffer.writeInt(class133.selectedItemWidget); // L: 8683
								var8.packetBuffer.method7555(var0); // L: 8684
								var8.packetBuffer.method7555(var3); // L: 8685
								var8.packetBuffer.method7394(WorldMapAreaData.selectedItemSlot); // L: 8686
								var8.packetBuffer.method7405(class286.selectedItemId); // L: 8687
								Client.packetWriter.addNode(var8); // L: 8688
								Client.field610 = 0; // L: 8689
								WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 8690
								Client.field611 = var0; // L: 8691
							} else if (var2 == 32) {
								var8 = class135.getPacketBufferNode(ClientPacket.field2863, Client.packetWriter.isaacCipher); // L: 8447
								var8.packetBuffer.method7394(var3); // L: 8448
								var8.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8449
								var8.packetBuffer.writeInt(WorldMapLabelSize.selectedSpellWidget); // L: 8450
								var8.packetBuffer.method7450(var1); // L: 8451
								var8.packetBuffer.method7555(var0); // L: 8452
								Client.packetWriter.addNode(var8); // L: 8453
								Client.field610 = 0; // L: 8454
								WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 8455
								Client.field611 = var0; // L: 8456
							} else if (var2 == 33) {
								var8 = class135.getPacketBufferNode(ClientPacket.field2914, Client.packetWriter.isaacCipher); // L: 8528
								var8.packetBuffer.method7555(var0); // L: 8529
								var8.packetBuffer.method7555(var3); // L: 8530
								var8.packetBuffer.writeInt(var1); // L: 8531
								Client.packetWriter.addNode(var8); // L: 8532
								Client.field610 = 0; // L: 8533
								WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 8534
								Client.field611 = var0; // L: 8535
							} else if (var2 == 34) {
								var8 = class135.getPacketBufferNode(ClientPacket.field2870, Client.packetWriter.isaacCipher); // L: 8966
								var8.packetBuffer.writeShort(var0); // L: 8967
								var8.packetBuffer.method7486(var1); // L: 8968
								var8.packetBuffer.writeShort(var3); // L: 8969
								Client.packetWriter.addNode(var8); // L: 8970
								Client.field610 = 0; // L: 8971
								WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 8972
								Client.field611 = var0; // L: 8973
							} else if (var2 == 35) {
								var8 = class135.getPacketBufferNode(ClientPacket.field2905, Client.packetWriter.isaacCipher); // L: 8594
								var8.packetBuffer.method7450(var1); // L: 8595
								var8.packetBuffer.method7394(var0); // L: 8596
								var8.packetBuffer.method7405(var3); // L: 8597
								Client.packetWriter.addNode(var8); // L: 8598
								Client.field610 = 0; // L: 8599
								WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 8600
								Client.field611 = var0; // L: 8601
							} else if (var2 == 36) {
								var8 = class135.getPacketBufferNode(ClientPacket.field2918, Client.packetWriter.isaacCipher); // L: 9021
								var8.packetBuffer.writeInt(var1); // L: 9022
								var8.packetBuffer.method7555(var3); // L: 9023
								var8.packetBuffer.method7394(var0); // L: 9024
								Client.packetWriter.addNode(var8); // L: 9025
								Client.field610 = 0; // L: 9026
								WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 9027
								Client.field611 = var0; // L: 9028
							} else if (var2 == 37) {
								var8 = class135.getPacketBufferNode(ClientPacket.field2858, Client.packetWriter.isaacCipher); // L: 8759
								var8.packetBuffer.method7394(var0); // L: 8760
								var8.packetBuffer.method7555(var3); // L: 8761
								var8.packetBuffer.writeInt(var1); // L: 8762
								Client.packetWriter.addNode(var8); // L: 8763
								Client.field610 = 0; // L: 8764
								WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 8765
								Client.field611 = var0; // L: 8766
							} else {
								if (var2 == 38) {
									WorldMapRectangle.Widget_runOnTargetLeave(); // L: 8375
									var16 = class130.getWidget(var1); // L: 8376
									Client.isItemSelected = 1; // L: 8377
									WorldMapAreaData.selectedItemSlot = var0; // L: 8378
									class133.selectedItemWidget = var1; // L: 8379
									class286.selectedItemId = var3; // L: 8380
									class112.invalidateWidget(var16); // L: 8381
									Client.selectedItemName = LoginScreenAnimation.colorStartTag(16748608) + Client.ItemDefinition_get(var3).name + LoginScreenAnimation.colorStartTag(16777215); // L: 8382
									if (Client.selectedItemName == null) { // L: 8383
										Client.selectedItemName = "null";
									}

									return; // L: 8384
								}

								if (var2 == 39) {
									var8 = class135.getPacketBufferNode(ClientPacket.field2833, Client.packetWriter.isaacCipher); // L: 8993
									var8.packetBuffer.writeIntME(var1); // L: 8994
									var8.packetBuffer.method7555(var3); // L: 8995
									var8.packetBuffer.writeShort(var0); // L: 8996
									Client.packetWriter.addNode(var8); // L: 8997
									Client.field610 = 0; // L: 8998
									WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 8999
									Client.field611 = var0; // L: 9000
								} else if (var2 == 40) {
									var8 = class135.getPacketBufferNode(ClientPacket.field2900, Client.packetWriter.isaacCipher); // L: 8955
									var8.packetBuffer.method7555(var3); // L: 8956
									var8.packetBuffer.writeInt(var1); // L: 8957
									var8.packetBuffer.method7555(var0); // L: 8958
									Client.packetWriter.addNode(var8); // L: 8959
									Client.field610 = 0; // L: 8960
									WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 8961
									Client.field611 = var0; // L: 8962
								} else if (var2 == 41) {
									var8 = class135.getPacketBufferNode(ClientPacket.field2924, Client.packetWriter.isaacCipher); // L: 8517
									var8.packetBuffer.writeInt(var1); // L: 8518
									var8.packetBuffer.writeShort(var3); // L: 8519
									var8.packetBuffer.writeShort(var0); // L: 8520
									Client.packetWriter.addNode(var8); // L: 8521
									Client.field610 = 0; // L: 8522
									WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 8523
									Client.field611 = var0; // L: 8524
								} else if (var2 == 42) {
									var8 = class135.getPacketBufferNode(ClientPacket.field2866, Client.packetWriter.isaacCipher); // L: 8605
									var8.packetBuffer.method7394(var3); // L: 8606
									var8.packetBuffer.method7394(var0); // L: 8607
									var8.packetBuffer.method7450(var1); // L: 8608
									Client.packetWriter.addNode(var8); // L: 8609
									Client.field610 = 0; // L: 8610
									WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 8611
									Client.field611 = var0; // L: 8612
								} else if (var2 == 43) {
									var8 = class135.getPacketBufferNode(ClientPacket.field2849, Client.packetWriter.isaacCipher); // L: 8343
									var8.packetBuffer.writeShort(var3); // L: 8344
									var8.packetBuffer.writeShort(var0); // L: 8345
									var8.packetBuffer.writeInt(var1); // L: 8346
									Client.packetWriter.addNode(var8); // L: 8347
									Client.field610 = 0; // L: 8348
									WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 8349
									Client.field611 = var0; // L: 8350
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 8490
									if (var15 != null) { // L: 8491
										Client.mouseCrossX = var6; // L: 8492
										Client.mouseCrossY = var7; // L: 8493
										Client.mouseCrossColor = 2; // L: 8494
										Client.mouseCrossState = 0; // L: 8495
										Client.destinationX = var0; // L: 8496
										Client.destinationY = var1; // L: 8497
										var9 = class135.getPacketBufferNode(ClientPacket.field2859, Client.packetWriter.isaacCipher); // L: 8499
										var9.packetBuffer.method7458(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8500
										var9.packetBuffer.method7405(var3); // L: 8501
										Client.packetWriter.addNode(var9); // L: 8502
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 8938
									if (var15 != null) { // L: 8939
										Client.mouseCrossX = var6; // L: 8940
										Client.mouseCrossY = var7; // L: 8941
										Client.mouseCrossColor = 2; // L: 8942
										Client.mouseCrossState = 0; // L: 8943
										Client.destinationX = var0; // L: 8944
										Client.destinationY = var1; // L: 8945
										var9 = class135.getPacketBufferNode(ClientPacket.field2868, Client.packetWriter.isaacCipher); // L: 8947
										var9.packetBuffer.method7458(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8948
										var9.packetBuffer.method7405(var3); // L: 8949
										Client.packetWriter.addNode(var9); // L: 8950
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 8359
									if (var15 != null) { // L: 8360
										Client.mouseCrossX = var6; // L: 8361
										Client.mouseCrossY = var7; // L: 8362
										Client.mouseCrossColor = 2; // L: 8363
										Client.mouseCrossState = 0; // L: 8364
										Client.destinationX = var0; // L: 8365
										Client.destinationY = var1; // L: 8366
										var9 = class135.getPacketBufferNode(ClientPacket.field2935, Client.packetWriter.isaacCipher); // L: 8368
										var9.packetBuffer.method7394(var3); // L: 8369
										var9.packetBuffer.method7458(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8370
										Client.packetWriter.addNode(var9); // L: 8371
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 9031
									if (var15 != null) { // L: 9032
										Client.mouseCrossX = var6; // L: 9033
										Client.mouseCrossY = var7; // L: 9034
										Client.mouseCrossColor = 2; // L: 9035
										Client.mouseCrossState = 0; // L: 9036
										Client.destinationX = var0; // L: 9037
										Client.destinationY = var1; // L: 9038
										var9 = class135.getPacketBufferNode(ClientPacket.field2884, Client.packetWriter.isaacCipher); // L: 9040
										var9.packetBuffer.method7394(var3); // L: 9041
										var9.packetBuffer.method7403(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9042
										Client.packetWriter.addNode(var9); // L: 9043
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 8561
									if (var15 != null) { // L: 8562
										Client.mouseCrossX = var6; // L: 8563
										Client.mouseCrossY = var7; // L: 8564
										Client.mouseCrossColor = 2; // L: 8565
										Client.mouseCrossState = 0; // L: 8566
										Client.destinationX = var0; // L: 8567
										Client.destinationY = var1; // L: 8568
										var9 = class135.getPacketBufferNode(ClientPacket.field2855, Client.packetWriter.isaacCipher); // L: 8570
										var9.packetBuffer.writeShort(var3); // L: 8571
										var9.packetBuffer.method7458(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8572
										Client.packetWriter.addNode(var9); // L: 8573
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 8786
									if (var15 != null) { // L: 8787
										Client.mouseCrossX = var6; // L: 8788
										Client.mouseCrossY = var7; // L: 8789
										Client.mouseCrossColor = 2; // L: 8790
										Client.mouseCrossState = 0; // L: 8791
										Client.destinationX = var0; // L: 8792
										Client.destinationY = var1; // L: 8793
										var9 = class135.getPacketBufferNode(ClientPacket.field2867, Client.packetWriter.isaacCipher); // L: 8795
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8796
										var9.packetBuffer.method7555(var3); // L: 8797
										Client.packetWriter.addNode(var9); // L: 8798
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 8387
									if (var15 != null) { // L: 8388
										Client.mouseCrossX = var6; // L: 8389
										Client.mouseCrossY = var7; // L: 8390
										Client.mouseCrossColor = 2; // L: 8391
										Client.mouseCrossState = 0; // L: 8392
										Client.destinationX = var0; // L: 8393
										Client.destinationY = var1; // L: 8394
										var9 = class135.getPacketBufferNode(ClientPacket.field2862, Client.packetWriter.isaacCipher); // L: 8396
										var9.packetBuffer.method7458(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8397
										var9.packetBuffer.writeShort(var3); // L: 8398
										Client.packetWriter.addNode(var9); // L: 8399
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 8646
									if (var15 != null) { // L: 8647
										Client.mouseCrossX = var6; // L: 8648
										Client.mouseCrossY = var7; // L: 8649
										Client.mouseCrossColor = 2; // L: 8650
										Client.mouseCrossState = 0; // L: 8651
										Client.destinationX = var0; // L: 8652
										Client.destinationY = var1; // L: 8653
										var9 = class135.getPacketBufferNode(ClientPacket.field2933, Client.packetWriter.isaacCipher); // L: 8655
										var9.packetBuffer.method7555(var3); // L: 8656
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8657
										Client.packetWriter.addNode(var9); // L: 8658
									}
								} else if (var2 != 57 && var2 != 1007) {
									if (var2 == 58) {
										var16 = ModeWhere.getWidgetChild(var1, var0); // L: 9064
										if (var16 != null) { // L: 9065
											var9 = class135.getPacketBufferNode(ClientPacket.field2919, Client.packetWriter.isaacCipher); // L: 9067
											var9.packetBuffer.method7555(Client.field536); // L: 9068
											var9.packetBuffer.method7394(var0); // L: 9069
											var9.packetBuffer.writeIntME(WorldMapLabelSize.selectedSpellWidget); // L: 9070
											var9.packetBuffer.method7394(Client.selectedSpellChildIndex); // L: 9071
											var9.packetBuffer.writeShort(var16.itemId); // L: 9072
											var9.packetBuffer.writeIntME(var1); // L: 9073
											Client.packetWriter.addNode(var9); // L: 9074
										}
									} else if (var2 == 1001) {
										Client.mouseCrossX = var6; // L: 8710
										Client.mouseCrossY = var7; // L: 8711
										Client.mouseCrossColor = 2; // L: 8712
										Client.mouseCrossState = 0; // L: 8713
										Client.destinationX = var0; // L: 8714
										Client.destinationY = var1; // L: 8715
										var8 = class135.getPacketBufferNode(ClientPacket.field2912, Client.packetWriter.isaacCipher); // L: 8717
										var8.packetBuffer.method7555(var0 + Canvas.baseX); // L: 8718
										var8.packetBuffer.writeShort(class118.baseY + var1); // L: 8719
										var8.packetBuffer.writeShort(var3); // L: 8720
										var8.packetBuffer.method7403(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8721
										Client.packetWriter.addNode(var8); // L: 8722
									} else if (var2 == 1002) {
										Client.mouseCrossX = var6; // L: 8846
										Client.mouseCrossY = var7; // L: 8847
										Client.mouseCrossColor = 2; // L: 8848
										Client.mouseCrossState = 0; // L: 8849
										var8 = class135.getPacketBufferNode(ClientPacket.field2901, Client.packetWriter.isaacCipher); // L: 8851
										var8.packetBuffer.writeShort(var3); // L: 8852
										Client.packetWriter.addNode(var8); // L: 8853
									} else if (var2 == 1003) {
										Client.mouseCrossX = var6; // L: 9003
										Client.mouseCrossY = var7; // L: 9004
										Client.mouseCrossColor = 2; // L: 9005
										Client.mouseCrossState = 0; // L: 9006
										var13 = Client.npcs[var3]; // L: 9007
										if (var13 != null) { // L: 9008
											NPCComposition var17 = var13.definition; // L: 9009
											if (var17.transforms != null) { // L: 9010
												var17 = var17.transform();
											}

											if (var17 != null) { // L: 9011
												var12 = class135.getPacketBufferNode(ClientPacket.field2864, Client.packetWriter.isaacCipher); // L: 9013
												var12.packetBuffer.method7394(var17.id); // L: 9014
												Client.packetWriter.addNode(var12); // L: 9015
											}
										}
									} else if (var2 == 1004) {
										Client.mouseCrossX = var6; // L: 8506
										Client.mouseCrossY = var7; // L: 8507
										Client.mouseCrossColor = 2; // L: 8508
										Client.mouseCrossState = 0; // L: 8509
										var8 = class135.getPacketBufferNode(ClientPacket.field2925, Client.packetWriter.isaacCipher); // L: 8511
										var8.packetBuffer.writeShort(var3); // L: 8512
										Client.packetWriter.addNode(var8); // L: 8513
									} else if (var2 == 1005) {
										var16 = class130.getWidget(var1); // L: 8433
										if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 8434
											LoginScreenAnimation.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + Client.ItemDefinition_get(var3).name);
										} else {
											var9 = class135.getPacketBufferNode(ClientPacket.field2925, Client.packetWriter.isaacCipher); // L: 8437
											var9.packetBuffer.writeShort(var3); // L: 8438
											Client.packetWriter.addNode(var9); // L: 8439
										}

										Client.field610 = 0; // L: 8441
										WorldMapSectionType.field2720 = class130.getWidget(var1); // L: 8442
										Client.field611 = var0; // L: 8443
									} else if (var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1008 || var2 == 1012) {
										Huffman.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 8662
									}
								} else {
									var16 = ModeWhere.getWidgetChild(var1, var0); // L: 8353
									if (var16 != null) { // L: 8354
										GameEngine.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 8355
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 9115
			Client.isItemSelected = 0; // L: 9116
			class112.invalidateWidget(class130.getWidget(class133.selectedItemWidget)); // L: 9117
		}

		if (Client.isSpellSelected) { // L: 9119
			WorldMapRectangle.Widget_runOnTargetLeave();
		}

		if (WorldMapSectionType.field2720 != null && Client.field610 == 0) { // L: 9120
			class112.invalidateWidget(WorldMapSectionType.field2720);
		}

	} // L: 9121
}
