import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public class class376 {
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "1948355809"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class231.getWidgetChild(var1, var2); // L: 8862
		if (var5 != null) { // L: 8863
			if (var5.onOp != null) { // L: 8864
				ScriptEvent var6 = new ScriptEvent(); // L: 8865
				var6.widget = var5; // L: 8866
				var6.opIndex = var0; // L: 8867
				var6.targetName = var4; // L: 8868
				var6.args = var5.onOp; // L: 8869
				class19.runScriptEvent(var6); // L: 8870
			}

			boolean var11 = true; // L: 8872
			if (var5.contentType > 0) { // L: 8873
				var11 = ClanChat.method5644(var5);
			}

			if (var11) { // L: 8874
				int var8 = DirectByteArrayCopier.getWidgetFlags(var5); // L: 8876
				int var9 = var0 - 1; // L: 8877
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 8879
				if (var7) { // L: 8881
					PacketBufferNode var10;
					if (var0 == 1) { // L: 8884
						var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2255, Client.packetWriter.isaacCipher); // L: 8886
						var10.packetBuffer.writeInt(var1); // L: 8887
						var10.packetBuffer.writeShort(var2); // L: 8888
						var10.packetBuffer.writeShort(var3); // L: 8889
						Client.packetWriter.addNode(var10); // L: 8890
					}

					if (var0 == 2) { // L: 8892
						var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2217, Client.packetWriter.isaacCipher); // L: 8894
						var10.packetBuffer.writeInt(var1); // L: 8895
						var10.packetBuffer.writeShort(var2); // L: 8896
						var10.packetBuffer.writeShort(var3); // L: 8897
						Client.packetWriter.addNode(var10); // L: 8898
					}

					if (var0 == 3) { // L: 8900
						var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2227, Client.packetWriter.isaacCipher); // L: 8902
						var10.packetBuffer.writeInt(var1); // L: 8903
						var10.packetBuffer.writeShort(var2); // L: 8904
						var10.packetBuffer.writeShort(var3); // L: 8905
						Client.packetWriter.addNode(var10); // L: 8906
					}

					if (var0 == 4) { // L: 8908
						var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2231, Client.packetWriter.isaacCipher); // L: 8910
						var10.packetBuffer.writeInt(var1); // L: 8911
						var10.packetBuffer.writeShort(var2); // L: 8912
						var10.packetBuffer.writeShort(var3); // L: 8913
						Client.packetWriter.addNode(var10); // L: 8914
					}

					if (var0 == 5) { // L: 8916
						var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2311, Client.packetWriter.isaacCipher); // L: 8918
						var10.packetBuffer.writeInt(var1); // L: 8919
						var10.packetBuffer.writeShort(var2); // L: 8920
						var10.packetBuffer.writeShort(var3); // L: 8921
						Client.packetWriter.addNode(var10); // L: 8922
					}

					if (var0 == 6) { // L: 8924
						var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2263, Client.packetWriter.isaacCipher); // L: 8926
						var10.packetBuffer.writeInt(var1); // L: 8927
						var10.packetBuffer.writeShort(var2); // L: 8928
						var10.packetBuffer.writeShort(var3); // L: 8929
						Client.packetWriter.addNode(var10); // L: 8930
					}

					if (var0 == 7) { // L: 8932
						var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2268, Client.packetWriter.isaacCipher); // L: 8934
						var10.packetBuffer.writeInt(var1); // L: 8935
						var10.packetBuffer.writeShort(var2); // L: 8936
						var10.packetBuffer.writeShort(var3); // L: 8937
						Client.packetWriter.addNode(var10); // L: 8938
					}

					if (var0 == 8) { // L: 8940
						var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2310, Client.packetWriter.isaacCipher); // L: 8942
						var10.packetBuffer.writeInt(var1); // L: 8943
						var10.packetBuffer.writeShort(var2); // L: 8944
						var10.packetBuffer.writeShort(var3); // L: 8945
						Client.packetWriter.addNode(var10); // L: 8946
					}

					if (var0 == 9) { // L: 8948
						var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2239, Client.packetWriter.isaacCipher); // L: 8950
						var10.packetBuffer.writeInt(var1); // L: 8951
						var10.packetBuffer.writeShort(var2); // L: 8952
						var10.packetBuffer.writeShort(var3); // L: 8953
						Client.packetWriter.addNode(var10); // L: 8954
					}

					if (var0 == 10) { // L: 8956
						var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2270, Client.packetWriter.isaacCipher); // L: 8958
						var10.packetBuffer.writeInt(var1); // L: 8959
						var10.packetBuffer.writeShort(var2); // L: 8960
						var10.packetBuffer.writeShort(var3); // L: 8961
						Client.packetWriter.addNode(var10); // L: 8962
					}

				}
			}
		}
	} // L: 8882 8964
}
