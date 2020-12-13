import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = 127502171
	)
	static int field2124;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1899690821
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1293114999
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1335731435
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -218891237
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIILfo;B)Z",
		garbageValue = "104"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lhu;I)V",
		garbageValue = "747025369"
	)
	public static void method3643(Huffman var0) {
		class219.huffman = var0; // L: 14
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljv;",
		garbageValue = "1923247344"
	)
	public static FloorOverlayDefinition method3648(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 30
		if (var1 != null) { // L: 31
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 32
			var1 = new FloorOverlayDefinition(); // L: 33
			if (var2 != null) { // L: 34
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 35
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 36
			return var1; // L: 37
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	static boolean method3649() {
		return (Client.drawPlayerNames & 2) != 0; // L: 4791
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-824309681"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 7486
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 7487
			Client.mouseCrossX = var6; // L: 8201
			Client.mouseCrossY = var7; // L: 8202
			Client.mouseCrossColor = 2; // L: 8203
			Client.mouseCrossState = 0; // L: 8204
			Client.destinationX = var0; // L: 8205
			Client.destinationY = var1; // L: 8206
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2279, Client.packetWriter.isaacCipher); // L: 8208
			var8.packetBuffer.method5578(WorldMapEvent.selectedItemId); // L: 8209
			var8.packetBuffer.method5578(class41.baseY + var1); // L: 8210
			var8.packetBuffer.method5578(ChatChannel.selectedItemSlot); // L: 8211
			var8.packetBuffer.writeShortLE(var0 + NetFileRequest.baseX); // L: 8212
			var8.packetBuffer.writeInt(WorldMapLabelSize.selectedItemWidget); // L: 8213
			var8.packetBuffer.writeShort(var3); // L: 8214
			var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8215
			Client.packetWriter.addNode(var8); // L: 8216
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 8219
			Client.mouseCrossY = var7; // L: 8220
			Client.mouseCrossColor = 2; // L: 8221
			Client.mouseCrossState = 0; // L: 8222
			Client.destinationX = var0; // L: 8223
			Client.destinationY = var1; // L: 8224
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2237, Client.packetWriter.isaacCipher); // L: 8226
			var8.packetBuffer.method5739(var0 + NetFileRequest.baseX); // L: 8227
			var8.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8228
			var8.packetBuffer.writeShort(class41.baseY + var1); // L: 8229
			var8.packetBuffer.writeInt(MouseHandler.selectedSpellWidget); // L: 8230
			var8.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8231
			var8.packetBuffer.writeShort(var3); // L: 8232
			Client.packetWriter.addNode(var8); // L: 8233
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 7967
			Client.mouseCrossY = var7; // L: 7968
			Client.mouseCrossColor = 2; // L: 7969
			Client.mouseCrossState = 0; // L: 7970
			Client.destinationX = var0; // L: 7971
			Client.destinationY = var1; // L: 7972
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2293, Client.packetWriter.isaacCipher); // L: 7974
			var8.packetBuffer.writeShortLE(var0 + NetFileRequest.baseX); // L: 7975
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7976
			var8.packetBuffer.writeShort(class41.baseY + var1); // L: 7977
			var8.packetBuffer.writeShortLE(var3); // L: 7978
			Client.packetWriter.addNode(var8); // L: 7979
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 7918
			Client.mouseCrossY = var7; // L: 7919
			Client.mouseCrossColor = 2; // L: 7920
			Client.mouseCrossState = 0; // L: 7921
			Client.destinationX = var0; // L: 7922
			Client.destinationY = var1; // L: 7923
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2310, Client.packetWriter.isaacCipher); // L: 7925
			var8.packetBuffer.writeShort(var3); // L: 7926
			var8.packetBuffer.method5739(var0 + NetFileRequest.baseX); // L: 7927
			var8.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7928
			var8.packetBuffer.method5578(class41.baseY + var1); // L: 7929
			Client.packetWriter.addNode(var8); // L: 7930
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 7660
			Client.mouseCrossY = var7; // L: 7661
			Client.mouseCrossColor = 2; // L: 7662
			Client.mouseCrossState = 0; // L: 7663
			Client.destinationX = var0; // L: 7664
			Client.destinationY = var1; // L: 7665
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2267, Client.packetWriter.isaacCipher); // L: 7667
			var8.packetBuffer.writeShortLE(class41.baseY + var1); // L: 7668
			var8.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7669
			var8.packetBuffer.method5739(var3); // L: 7670
			var8.packetBuffer.method5578(var0 + NetFileRequest.baseX); // L: 7671
			Client.packetWriter.addNode(var8); // L: 7672
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 8186
			Client.mouseCrossY = var7; // L: 8187
			Client.mouseCrossColor = 2; // L: 8188
			Client.mouseCrossState = 0; // L: 8189
			Client.destinationX = var0; // L: 8190
			Client.destinationY = var1; // L: 8191
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2324, Client.packetWriter.isaacCipher); // L: 8193
			var8.packetBuffer.method5578(class41.baseY + var1); // L: 8194
			var8.packetBuffer.method5578(var3); // L: 8195
			var8.packetBuffer.method5578(var0 + NetFileRequest.baseX); // L: 8196
			var8.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8197
			Client.packetWriter.addNode(var8); // L: 8198
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 7850
				if (var13 != null) { // L: 7851
					Client.mouseCrossX = var6; // L: 7852
					Client.mouseCrossY = var7; // L: 7853
					Client.mouseCrossColor = 2; // L: 7854
					Client.mouseCrossState = 0; // L: 7855
					Client.destinationX = var0; // L: 7856
					Client.destinationY = var1; // L: 7857
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2258, Client.packetWriter.isaacCipher); // L: 7859
					var9.packetBuffer.method5588(WorldMapLabelSize.selectedItemWidget); // L: 7860
					var9.packetBuffer.writeShortLE(var3); // L: 7861
					var9.packetBuffer.method5739(ChatChannel.selectedItemSlot); // L: 7862
					var9.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7863
					var9.packetBuffer.writeShort(WorldMapEvent.selectedItemId); // L: 7864
					Client.packetWriter.addNode(var9); // L: 7865
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 7949
				if (var13 != null) { // L: 7950
					Client.mouseCrossX = var6; // L: 7951
					Client.mouseCrossY = var7; // L: 7952
					Client.mouseCrossColor = 2; // L: 7953
					Client.mouseCrossState = 0; // L: 7954
					Client.destinationX = var0; // L: 7955
					Client.destinationY = var1; // L: 7956
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2274, Client.packetWriter.isaacCipher); // L: 7958
					var9.packetBuffer.method5739(var3); // L: 7959
					var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex); // L: 7960
					var9.packetBuffer.method5587(MouseHandler.selectedSpellWidget); // L: 7961
					var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7962
					Client.packetWriter.addNode(var9); // L: 7963
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 8170
				if (var13 != null) { // L: 8171
					Client.mouseCrossX = var6; // L: 8172
					Client.mouseCrossY = var7; // L: 8173
					Client.mouseCrossColor = 2; // L: 8174
					Client.mouseCrossState = 0; // L: 8175
					Client.destinationX = var0; // L: 8176
					Client.destinationY = var1; // L: 8177
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher); // L: 8179
					var9.packetBuffer.method5578(var3); // L: 8180
					var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8181
					Client.packetWriter.addNode(var9); // L: 8182
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 7755
				if (var13 != null) { // L: 7756
					Client.mouseCrossX = var6; // L: 7757
					Client.mouseCrossY = var7; // L: 7758
					Client.mouseCrossColor = 2; // L: 7759
					Client.mouseCrossState = 0; // L: 7760
					Client.destinationX = var0; // L: 7761
					Client.destinationY = var1; // L: 7762
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2246, Client.packetWriter.isaacCipher); // L: 7764
					var9.packetBuffer.writeShortLE(var3); // L: 7765
					var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7766
					Client.packetWriter.addNode(var9); // L: 7767
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 7982
				if (var13 != null) { // L: 7983
					Client.mouseCrossX = var6; // L: 7984
					Client.mouseCrossY = var7; // L: 7985
					Client.mouseCrossColor = 2; // L: 7986
					Client.mouseCrossState = 0; // L: 7987
					Client.destinationX = var0; // L: 7988
					Client.destinationY = var1; // L: 7989
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2236, Client.packetWriter.isaacCipher); // L: 7991
					var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7992
					var9.packetBuffer.writeShort(var3); // L: 7993
					Client.packetWriter.addNode(var9); // L: 7994
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 7834
				if (var13 != null) { // L: 7835
					Client.mouseCrossX = var6; // L: 7836
					Client.mouseCrossY = var7; // L: 7837
					Client.mouseCrossColor = 2; // L: 7838
					Client.mouseCrossState = 0; // L: 7839
					Client.destinationX = var0; // L: 7840
					Client.destinationY = var1; // L: 7841
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2309, Client.packetWriter.isaacCipher); // L: 7843
					var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7844
					var9.packetBuffer.method5578(var3); // L: 7845
					Client.packetWriter.addNode(var9); // L: 7846
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 8253
				if (var13 != null) { // L: 8254
					Client.mouseCrossX = var6; // L: 8255
					Client.mouseCrossY = var7; // L: 8256
					Client.mouseCrossColor = 2; // L: 8257
					Client.mouseCrossState = 0; // L: 8258
					Client.destinationX = var0; // L: 8259
					Client.destinationY = var1; // L: 8260
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2276, Client.packetWriter.isaacCipher); // L: 8262
					var9.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8263
					var9.packetBuffer.method5739(var3); // L: 8264
					Client.packetWriter.addNode(var9); // L: 8265
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 7641
					if (var15 != null) { // L: 7642
						Client.mouseCrossX = var6; // L: 7643
						Client.mouseCrossY = var7; // L: 7644
						Client.mouseCrossColor = 2; // L: 7645
						Client.mouseCrossState = 0; // L: 7646
						Client.destinationX = var0; // L: 7647
						Client.destinationY = var1; // L: 7648
						var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2283, Client.packetWriter.isaacCipher); // L: 7650
						var9.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7651
						var9.packetBuffer.method5588(WorldMapLabelSize.selectedItemWidget); // L: 7652
						var9.packetBuffer.writeShortLE(ChatChannel.selectedItemSlot); // L: 7653
						var9.packetBuffer.method5739(var3); // L: 7654
						var9.packetBuffer.writeShort(WorldMapEvent.selectedItemId); // L: 7655
						Client.packetWriter.addNode(var9); // L: 7656
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 8122
					if (var15 != null) { // L: 8123
						Client.mouseCrossX = var6; // L: 8124
						Client.mouseCrossY = var7; // L: 8125
						Client.mouseCrossColor = 2; // L: 8126
						Client.mouseCrossState = 0; // L: 8127
						Client.destinationX = var0; // L: 8128
						Client.destinationY = var1; // L: 8129
						var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2256, Client.packetWriter.isaacCipher); // L: 8131
						var9.packetBuffer.writeShort(var3); // L: 8132
						var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8133
						var9.packetBuffer.method5739(Client.selectedSpellChildIndex); // L: 8134
						var9.packetBuffer.writeInt(MouseHandler.selectedSpellWidget); // L: 8135
						Client.packetWriter.addNode(var9); // L: 8136
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 7675
					Client.mouseCrossY = var7; // L: 7676
					Client.mouseCrossColor = 2; // L: 7677
					Client.mouseCrossState = 0; // L: 7678
					Client.destinationX = var0; // L: 7679
					Client.destinationY = var1; // L: 7680
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2263, Client.packetWriter.isaacCipher); // L: 7682
					var8.packetBuffer.method5587(WorldMapLabelSize.selectedItemWidget); // L: 7683
					var8.packetBuffer.writeShortLE(var0 + NetFileRequest.baseX); // L: 7684
					var8.packetBuffer.method5739(WorldMapEvent.selectedItemId); // L: 7685
					var8.packetBuffer.method5739(class41.baseY + var1); // L: 7686
					var8.packetBuffer.method5578(ChatChannel.selectedItemSlot); // L: 7687
					var8.packetBuffer.writeShortLE(var3); // L: 7688
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7689
					Client.packetWriter.addNode(var8); // L: 7690
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 8236
					Client.mouseCrossY = var7; // L: 8237
					Client.mouseCrossColor = 2; // L: 8238
					Client.mouseCrossState = 0; // L: 8239
					Client.destinationX = var0; // L: 8240
					Client.destinationY = var1; // L: 8241
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher); // L: 8243
					var8.packetBuffer.writeShortLE(class41.baseY + var1); // L: 8244
					var8.packetBuffer.writeShortLE(var0 + NetFileRequest.baseX); // L: 8245
					var8.packetBuffer.writeShortLE(Client.selectedSpellChildIndex); // L: 8246
					var8.packetBuffer.method5578(var3); // L: 8247
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8248
					var8.packetBuffer.method5588(MouseHandler.selectedSpellWidget); // L: 8249
					Client.packetWriter.addNode(var8); // L: 8250
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 7813
					Client.mouseCrossY = var7; // L: 7814
					Client.mouseCrossColor = 2; // L: 7815
					Client.mouseCrossState = 0; // L: 7816
					Client.destinationX = var0; // L: 7817
					Client.destinationY = var1; // L: 7818
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2311, Client.packetWriter.isaacCipher); // L: 7820
					var8.packetBuffer.writeShort(var0 + NetFileRequest.baseX); // L: 7821
					var8.packetBuffer.writeShort(var3); // L: 7822
					var8.packetBuffer.writeShort(class41.baseY + var1); // L: 7823
					var8.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7824
					Client.packetWriter.addNode(var8); // L: 7825
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 8014
					Client.mouseCrossY = var7; // L: 8015
					Client.mouseCrossColor = 2; // L: 8016
					Client.mouseCrossState = 0; // L: 8017
					Client.destinationX = var0; // L: 8018
					Client.destinationY = var1; // L: 8019
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2317, Client.packetWriter.isaacCipher); // L: 8021
					var8.packetBuffer.writeShort(class41.baseY + var1); // L: 8022
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8023
					var8.packetBuffer.method5739(var3); // L: 8024
					var8.packetBuffer.writeShort(var0 + NetFileRequest.baseX); // L: 8025
					Client.packetWriter.addNode(var8); // L: 8026
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 8085
					Client.mouseCrossY = var7; // L: 8086
					Client.mouseCrossColor = 2; // L: 8087
					Client.mouseCrossState = 0; // L: 8088
					Client.destinationX = var0; // L: 8089
					Client.destinationY = var1; // L: 8090
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2254, Client.packetWriter.isaacCipher); // L: 8092
					var8.packetBuffer.method5578(class41.baseY + var1); // L: 8093
					var8.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8094
					var8.packetBuffer.method5578(var0 + NetFileRequest.baseX); // L: 8095
					var8.packetBuffer.method5739(var3); // L: 8096
					Client.packetWriter.addNode(var8); // L: 8097
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 7587
					Client.mouseCrossY = var7; // L: 7588
					Client.mouseCrossColor = 2; // L: 7589
					Client.mouseCrossState = 0; // L: 7590
					Client.destinationX = var0; // L: 7591
					Client.destinationY = var1; // L: 7592
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2248, Client.packetWriter.isaacCipher); // L: 7594
					var8.packetBuffer.writeShort(var0 + NetFileRequest.baseX); // L: 7595
					var8.packetBuffer.method5578(var3); // L: 7596
					var8.packetBuffer.writeShortLE(class41.baseY + var1); // L: 7597
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7598
					Client.packetWriter.addNode(var8); // L: 7599
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 7613
					Client.mouseCrossY = var7; // L: 7614
					Client.mouseCrossColor = 2; // L: 7615
					Client.mouseCrossState = 0; // L: 7616
					Client.destinationX = var0; // L: 7617
					Client.destinationY = var1; // L: 7618
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2305, Client.packetWriter.isaacCipher); // L: 7620
					var8.packetBuffer.writeShort(var3); // L: 7621
					var8.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7622
					var8.packetBuffer.writeShort(class41.baseY + var1); // L: 7623
					var8.packetBuffer.writeShortLE(var0 + NetFileRequest.baseX); // L: 7624
					Client.packetWriter.addNode(var8); // L: 7625
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8151
						ArchiveLoader.scene.setViewportWalking(); // L: 8152
					} else {
						ArchiveLoader.scene.menuOpen(GameObject.Client_plane, var0, var1, true); // L: 8155
					}
				} else {
					PacketBufferNode var12;
					Widget var16;
					if (var2 == 24) {
						var16 = CollisionMap.getWidget(var1); // L: 7774
						boolean var11 = true; // L: 7775
						if (var16.contentType > 0) { // L: 7776
							var11 = HealthBarUpdate.method1825(var16);
						}

						if (var11) { // L: 7777
							var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher); // L: 7779
							var12.packetBuffer.writeInt(var1); // L: 7780
							Client.packetWriter.addNode(var12); // L: 7781
						}
					} else {
						if (var2 == 25) {
							var16 = class92.getWidgetChild(var1, var0); // L: 7491
							if (var16 != null) { // L: 7492
								WorldMapManager.Widget_runOnTargetLeave(); // L: 7493
								class194.selectSpell(var1, var0, ServerPacket.Widget_unpackTargetMask(FaceNormal.getWidgetFlags(var16)), var16.itemId); // L: 7494
								Client.isItemSelected = 0; // L: 7495
								Client.selectedSpellActionName = StudioGame.Widget_getSpellActionName(var16); // L: 7496
								if (Client.selectedSpellActionName == null) { // L: 7497
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 7498
									Client.selectedSpellName = var16.dataText + class23.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class23.colorStartTag(65280) + var16.spellName + class23.colorStartTag(16777215); // L: 7499
								}
							}

							return; // L: 7501
						}

						if (var2 == 26) {
							ServerPacket.method3664(); // L: 7771
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher); // L: 7530
								var8.packetBuffer.writeInt(var1); // L: 7531
								Client.packetWriter.addNode(var8); // L: 7532
								var14 = CollisionMap.getWidget(var1); // L: 7533
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 7534
									var10 = var14.cs1Instructions[0][1]; // L: 7535
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10]; // L: 7536
									Script.changeGameOptions(var10); // L: 7537
								}
							} else if (var2 == 29) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher); // L: 7716
								var8.packetBuffer.writeInt(var1); // L: 7717
								Client.packetWriter.addNode(var8); // L: 7718
								var14 = CollisionMap.getWidget(var1); // L: 7719
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 7720
									var10 = var14.cs1Instructions[0][1]; // L: 7721
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) { // L: 7722
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0]; // L: 7723
										Script.changeGameOptions(var10); // L: 7724
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 7580
									DynamicObject.resumePauseWidget(var1, var0); // L: 7581
									Client.meslayerContinueWidget = class92.getWidgetChild(var1, var0); // L: 7582
									CollisionMap.invalidateWidget(Client.meslayerContinueWidget); // L: 7583
								}
							} else if (var2 == 31) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2295, Client.packetWriter.isaacCipher); // L: 8030
								var8.packetBuffer.writeShort(WorldMapEvent.selectedItemId); // L: 8031
								var8.packetBuffer.writeShort(var3); // L: 8032
								var8.packetBuffer.writeShort(ChatChannel.selectedItemSlot); // L: 8033
								var8.packetBuffer.method5588(WorldMapLabelSize.selectedItemWidget); // L: 8034
								var8.packetBuffer.writeShort(var0); // L: 8035
								var8.packetBuffer.writeInt(var1); // L: 8036
								Client.packetWriter.addNode(var8); // L: 8037
								Client.field754 = 0; // L: 8038
								NPC.field1131 = CollisionMap.getWidget(var1); // L: 8039
								Client.field881 = var0; // L: 8040
							} else if (var2 == 32) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2327, Client.packetWriter.isaacCipher); // L: 7629
								var8.packetBuffer.writeShort(var3); // L: 7630
								var8.packetBuffer.writeShort(var0); // L: 7631
								var8.packetBuffer.method5578(Client.selectedSpellChildIndex); // L: 7632
								var8.packetBuffer.method5588(MouseHandler.selectedSpellWidget); // L: 7633
								var8.packetBuffer.method5587(var1); // L: 7634
								Client.packetWriter.addNode(var8); // L: 7635
								Client.field754 = 0; // L: 7636
								NPC.field1131 = CollisionMap.getWidget(var1); // L: 7637
								Client.field881 = var0; // L: 7638
							} else if (var2 == 33) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2284, Client.packetWriter.isaacCipher); // L: 7730
								var8.packetBuffer.writeShort(var0); // L: 7731
								var8.packetBuffer.method5587(var1); // L: 7732
								var8.packetBuffer.method5578(var3); // L: 7733
								Client.packetWriter.addNode(var8); // L: 7734
								Client.field754 = 0; // L: 7735
								NPC.field1131 = CollisionMap.getWidget(var1); // L: 7736
								Client.field881 = var0; // L: 7737
							} else if (var2 == 34) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2325, Client.packetWriter.isaacCipher); // L: 7705
								var8.packetBuffer.writeShort(var0); // L: 7706
								var8.packetBuffer.method5739(var3); // L: 7707
								var8.packetBuffer.method5587(var1); // L: 7708
								Client.packetWriter.addNode(var8); // L: 7709
								Client.field754 = 0; // L: 7710
								NPC.field1131 = CollisionMap.getWidget(var1); // L: 7711
								Client.field881 = var0; // L: 7712
							} else if (var2 == 35) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2259, Client.packetWriter.isaacCipher); // L: 7519
								var8.packetBuffer.method5739(var0); // L: 7520
								var8.packetBuffer.method5578(var3); // L: 7521
								var8.packetBuffer.method5587(var1); // L: 7522
								Client.packetWriter.addNode(var8); // L: 7523
								Client.field754 = 0; // L: 7524
								NPC.field1131 = CollisionMap.getWidget(var1); // L: 7525
								Client.field881 = var0; // L: 7526
							} else if (var2 == 36) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2265, Client.packetWriter.isaacCipher); // L: 8112
								var8.packetBuffer.writeShortLE(var0); // L: 8113
								var8.packetBuffer.method5588(var1); // L: 8114
								var8.packetBuffer.writeShort(var3); // L: 8115
								Client.packetWriter.addNode(var8); // L: 8116
								Client.field754 = 0; // L: 8117
								NPC.field1131 = CollisionMap.getWidget(var1); // L: 8118
								Client.field881 = var0; // L: 8119
							} else if (var2 == 37) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2229, Client.packetWriter.isaacCipher); // L: 8141
								var8.packetBuffer.method5718(var1); // L: 8142
								var8.packetBuffer.method5739(var0); // L: 8143
								var8.packetBuffer.writeShort(var3); // L: 8144
								Client.packetWriter.addNode(var8); // L: 8145
								Client.field754 = 0; // L: 8146
								NPC.field1131 = CollisionMap.getWidget(var1); // L: 8147
								Client.field881 = var0; // L: 8148
							} else {
								if (var2 == 38) {
									WorldMapManager.Widget_runOnTargetLeave(); // L: 7785
									var16 = CollisionMap.getWidget(var1); // L: 7786
									Client.isItemSelected = 1; // L: 7787
									ChatChannel.selectedItemSlot = var0; // L: 7788
									WorldMapLabelSize.selectedItemWidget = var1; // L: 7789
									WorldMapEvent.selectedItemId = var3; // L: 7790
									CollisionMap.invalidateWidget(var16); // L: 7791
									Client.selectedItemName = class23.colorStartTag(16748608) + SecureRandomCallable.ItemDefinition_get(var3).name + class23.colorStartTag(16777215); // L: 7792
									if (Client.selectedItemName == null) { // L: 7793
										Client.selectedItemName = "null";
									}

									return; // L: 7794
								}

								if (var2 == 39) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2330, Client.packetWriter.isaacCipher); // L: 8160
									var8.packetBuffer.method5578(var3); // L: 8161
									var8.packetBuffer.method5718(var1); // L: 8162
									var8.packetBuffer.method5578(var0); // L: 8163
									Client.packetWriter.addNode(var8); // L: 8164
									Client.field754 = 0; // L: 8165
									NPC.field1131 = CollisionMap.getWidget(var1); // L: 8166
									Client.field881 = var0; // L: 8167
								} else if (var2 == 40) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2264, Client.packetWriter.isaacCipher); // L: 7603
									var8.packetBuffer.writeShort(var3); // L: 7604
									var8.packetBuffer.method5739(var0); // L: 7605
									var8.packetBuffer.writeInt(var1); // L: 7606
									Client.packetWriter.addNode(var8); // L: 7607
									Client.field754 = 0; // L: 7608
									NPC.field1131 = CollisionMap.getWidget(var1); // L: 7609
									Client.field881 = var0; // L: 7610
								} else if (var2 == 41) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2294, Client.packetWriter.isaacCipher); // L: 8270
									var8.packetBuffer.method5578(var3); // L: 8271
									var8.packetBuffer.writeInt(var1); // L: 8272
									var8.packetBuffer.method5739(var0); // L: 8273
									Client.packetWriter.addNode(var8); // L: 8274
									Client.field754 = 0; // L: 8275
									NPC.field1131 = CollisionMap.getWidget(var1); // L: 8276
									Client.field881 = var0; // L: 8277
								} else if (var2 == 42) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2315, Client.packetWriter.isaacCipher); // L: 8101
									var8.packetBuffer.writeShortLE(var0); // L: 8102
									var8.packetBuffer.writeShortLE(var3); // L: 8103
									var8.packetBuffer.method5587(var1); // L: 8104
									Client.packetWriter.addNode(var8); // L: 8105
									Client.field754 = 0; // L: 8106
									NPC.field1131 = CollisionMap.getWidget(var1); // L: 8107
									Client.field881 = var0; // L: 8108
								} else if (var2 == 43) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2257, Client.packetWriter.isaacCipher); // L: 7694
									var8.packetBuffer.writeShortLE(var3); // L: 7695
									var8.packetBuffer.writeShortLE(var0); // L: 7696
									var8.packetBuffer.method5588(var1); // L: 7697
									Client.packetWriter.addNode(var8); // L: 7698
									Client.field754 = 0; // L: 7699
									NPC.field1131 = CollisionMap.getWidget(var1); // L: 7700
									Client.field881 = var0; // L: 7701
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 8069
									if (var15 != null) { // L: 8070
										Client.mouseCrossX = var6; // L: 8071
										Client.mouseCrossY = var7; // L: 8072
										Client.mouseCrossColor = 2; // L: 8073
										Client.mouseCrossState = 0; // L: 8074
										Client.destinationX = var0; // L: 8075
										Client.destinationY = var1; // L: 8076
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2260, Client.packetWriter.isaacCipher); // L: 8078
										var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8079
										var9.packetBuffer.writeShortLE(var3); // L: 8080
										Client.packetWriter.addNode(var9); // L: 8081
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 7551
									if (var15 != null) { // L: 7552
										Client.mouseCrossX = var6; // L: 7553
										Client.mouseCrossY = var7; // L: 7554
										Client.mouseCrossColor = 2; // L: 7555
										Client.mouseCrossState = 0; // L: 7556
										Client.destinationX = var0; // L: 7557
										Client.destinationY = var1; // L: 7558
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2238, Client.packetWriter.isaacCipher); // L: 7560
										var9.packetBuffer.writeShortLE(var3); // L: 7561
										var9.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7562
										Client.packetWriter.addNode(var9); // L: 7563
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 7797
									if (var15 != null) { // L: 7798
										Client.mouseCrossX = var6; // L: 7799
										Client.mouseCrossY = var7; // L: 7800
										Client.mouseCrossColor = 2; // L: 7801
										Client.mouseCrossState = 0; // L: 7802
										Client.destinationX = var0; // L: 7803
										Client.destinationY = var1; // L: 7804
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2278, Client.packetWriter.isaacCipher); // L: 7806
										var9.packetBuffer.writeShort(var3); // L: 7807
										var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7808
										Client.packetWriter.addNode(var9); // L: 7809
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 7886
									if (var15 != null) { // L: 7887
										Client.mouseCrossX = var6; // L: 7888
										Client.mouseCrossY = var7; // L: 7889
										Client.mouseCrossColor = 2; // L: 7890
										Client.mouseCrossState = 0; // L: 7891
										Client.destinationX = var0; // L: 7892
										Client.destinationY = var1; // L: 7893
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2312, Client.packetWriter.isaacCipher); // L: 7895
										var9.packetBuffer.writeShortLE(var3); // L: 7896
										var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7897
										Client.packetWriter.addNode(var9); // L: 7898
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 7902
									if (var15 != null) { // L: 7903
										Client.mouseCrossX = var6; // L: 7904
										Client.mouseCrossY = var7; // L: 7905
										Client.mouseCrossColor = 2; // L: 7906
										Client.mouseCrossState = 0; // L: 7907
										Client.destinationX = var0; // L: 7908
										Client.destinationY = var1; // L: 7909
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2253, Client.packetWriter.isaacCipher); // L: 7911
										var9.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7912
										var9.packetBuffer.method5578(var3); // L: 7913
										Client.packetWriter.addNode(var9); // L: 7914
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 7998
									if (var15 != null) { // L: 7999
										Client.mouseCrossX = var6; // L: 8000
										Client.mouseCrossY = var7; // L: 8001
										Client.mouseCrossColor = 2; // L: 8002
										Client.mouseCrossState = 0; // L: 8003
										Client.destinationX = var0; // L: 8004
										Client.destinationY = var1; // L: 8005
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2242, Client.packetWriter.isaacCipher); // L: 8007
										var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8008
										var9.packetBuffer.method5578(var3); // L: 8009
										Client.packetWriter.addNode(var9); // L: 8010
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 8043
									if (var15 != null) { // L: 8044
										Client.mouseCrossX = var6; // L: 8045
										Client.mouseCrossY = var7; // L: 8046
										Client.mouseCrossColor = 2; // L: 8047
										Client.mouseCrossState = 0; // L: 8048
										Client.destinationX = var0; // L: 8049
										Client.destinationY = var1; // L: 8050
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2268, Client.packetWriter.isaacCipher); // L: 8052
										var9.packetBuffer.method5578(var3); // L: 8053
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8054
										Client.packetWriter.addNode(var9); // L: 8055
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 7933
									if (var15 != null) { // L: 7934
										Client.mouseCrossX = var6; // L: 7935
										Client.mouseCrossY = var7; // L: 7936
										Client.mouseCrossColor = 2; // L: 7937
										Client.mouseCrossState = 0; // L: 7938
										Client.destinationX = var0; // L: 7939
										Client.destinationY = var1; // L: 7940
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2282, Client.packetWriter.isaacCipher); // L: 7942
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7943
										var9.packetBuffer.writeShort(var3); // L: 7944
										Client.packetWriter.addNode(var9); // L: 7945
									}
								} else if (var2 != 1007 && var2 != 57) {
									if (var2 == 58) {
										var16 = class92.getWidgetChild(var1, var0); // L: 7504
										if (var16 != null) { // L: 7505
											var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2296, Client.packetWriter.isaacCipher); // L: 7507
											var9.packetBuffer.writeInt(MouseHandler.selectedSpellWidget); // L: 7508
											var9.packetBuffer.writeShort(var0); // L: 7509
											var9.packetBuffer.method5578(Client.field836); // L: 7510
											var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex); // L: 7511
											var9.packetBuffer.method5739(var16.itemId); // L: 7512
											var9.packetBuffer.method5718(var1); // L: 7513
											Client.packetWriter.addNode(var9); // L: 7514
										}
									} else if (var2 == 1001) {
										Client.mouseCrossX = var6; // L: 7740
										Client.mouseCrossY = var7; // L: 7741
										Client.mouseCrossColor = 2; // L: 7742
										Client.mouseCrossState = 0; // L: 7743
										Client.destinationX = var0; // L: 7744
										Client.destinationY = var1; // L: 7745
										var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2271, Client.packetWriter.isaacCipher); // L: 7747
										var8.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7748
										var8.packetBuffer.method5739(class41.baseY + var1); // L: 7749
										var8.packetBuffer.method5739(var0 + NetFileRequest.baseX); // L: 7750
										var8.packetBuffer.writeShort(var3); // L: 7751
										Client.packetWriter.addNode(var8); // L: 7752
									} else if (var2 == 1002) {
										Client.mouseCrossX = var6; // L: 8059
										Client.mouseCrossY = var7; // L: 8060
										Client.mouseCrossColor = 2; // L: 8061
										Client.mouseCrossState = 0; // L: 8062
										var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2321, Client.packetWriter.isaacCipher); // L: 8064
										var8.packetBuffer.method5739(var3); // L: 8065
										Client.packetWriter.addNode(var8); // L: 8066
									} else if (var2 == 1003) {
										Client.mouseCrossX = var6; // L: 7869
										Client.mouseCrossY = var7; // L: 7870
										Client.mouseCrossColor = 2; // L: 7871
										Client.mouseCrossState = 0; // L: 7872
										var13 = Client.npcs[var3]; // L: 7873
										if (var13 != null) { // L: 7874
											NPCComposition var17 = var13.definition; // L: 7875
											if (var17.transforms != null) { // L: 7876
												var17 = var17.transform();
											}

											if (var17 != null) { // L: 7877
												var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2288, Client.packetWriter.isaacCipher); // L: 7879
												var12.packetBuffer.method5739(var17.id); // L: 7880
												Client.packetWriter.addNode(var12); // L: 7881
											}
										}
									} else if (var2 == 1004) {
										Client.mouseCrossX = var6; // L: 7541
										Client.mouseCrossY = var7; // L: 7542
										Client.mouseCrossColor = 2; // L: 7543
										Client.mouseCrossState = 0; // L: 7544
										var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher); // L: 7546
										var8.packetBuffer.method5578(var3); // L: 7547
										Client.packetWriter.addNode(var8); // L: 7548
									} else if (var2 == 1005) {
										var16 = CollisionMap.getWidget(var1); // L: 7567
										if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 7568
											class234.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + SecureRandomCallable.ItemDefinition_get(var3).name);
										} else {
											var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher); // L: 7571
											var9.packetBuffer.method5578(var3); // L: 7572
											Client.packetWriter.addNode(var9); // L: 7573
										}

										Client.field754 = 0; // L: 7575
										NPC.field1131 = CollisionMap.getWidget(var1); // L: 7576
										Client.field881 = var0; // L: 7577
									} else if (var2 == 1012 || var2 == 1009 || var2 == 1010 || var2 == 1008 || var2 == 1011) {
										WorldMapRectangle.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 7488
									}
								} else {
									var16 = class92.getWidgetChild(var1, var0); // L: 7828
									if (var16 != null) { // L: 7829
										class3.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 7830
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 8279
			Client.isItemSelected = 0; // L: 8280
			CollisionMap.invalidateWidget(CollisionMap.getWidget(WorldMapLabelSize.selectedItemWidget)); // L: 8281
		}

		if (Client.isSpellSelected) { // L: 8283
			WorldMapManager.Widget_runOnTargetLeave();
		}

		if (NPC.field1131 != null && Client.field754 == 0) { // L: 8284
			CollisionMap.invalidateWidget(NPC.field1131);
		}

	} // L: 8285
}
