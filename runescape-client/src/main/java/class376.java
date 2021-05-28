import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
public final class class376 {
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = 611240317
	)
	@Export("cameraYaw")
	static int cameraYaw;

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-537904006"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ModeWhere.getWidgetChild(var1, var2); // L: 8669
		if (var5 != null) { // L: 8670
			if (var5.onOp != null) { // L: 8671
				ScriptEvent var6 = new ScriptEvent(); // L: 8672
				var6.widget = var5; // L: 8673
				var6.opIndex = var0; // L: 8674
				var6.targetName = var4; // L: 8675
				var6.args = var5.onOp; // L: 8676
				PacketWriter.runScriptEvent(var6); // L: 8677
			}

			boolean var8 = true; // L: 8679
			if (var5.contentType > 0) { // L: 8680
				var8 = SequenceDefinition.method3148(var5);
			}

			if (var8) { // L: 8681
				if (TextureProvider.method4141(class21.getWidgetFlags(var5), var0 - 1)) { // L: 8682
					PacketBufferNode var7;
					if (var0 == 1) { // L: 8685
						var7 = class21.getPacketBufferNode(ClientPacket.field2604, Client.packetWriter.isaacCipher); // L: 8687
						var7.packetBuffer.writeInt(var1); // L: 8688
						var7.packetBuffer.writeShort(var2); // L: 8689
						var7.packetBuffer.writeShort(var3); // L: 8690
						Client.packetWriter.addNode(var7); // L: 8691
					}

					if (var0 == 2) { // L: 8693
						var7 = class21.getPacketBufferNode(ClientPacket.field2603, Client.packetWriter.isaacCipher); // L: 8695
						var7.packetBuffer.writeInt(var1); // L: 8696
						var7.packetBuffer.writeShort(var2); // L: 8697
						var7.packetBuffer.writeShort(var3); // L: 8698
						Client.packetWriter.addNode(var7); // L: 8699
					}

					if (var0 == 3) { // L: 8701
						var7 = class21.getPacketBufferNode(ClientPacket.field2616, Client.packetWriter.isaacCipher); // L: 8703
						var7.packetBuffer.writeInt(var1); // L: 8704
						var7.packetBuffer.writeShort(var2); // L: 8705
						var7.packetBuffer.writeShort(var3); // L: 8706
						Client.packetWriter.addNode(var7); // L: 8707
					}

					if (var0 == 4) { // L: 8709
						var7 = class21.getPacketBufferNode(ClientPacket.field2678, Client.packetWriter.isaacCipher); // L: 8711
						var7.packetBuffer.writeInt(var1); // L: 8712
						var7.packetBuffer.writeShort(var2); // L: 8713
						var7.packetBuffer.writeShort(var3); // L: 8714
						Client.packetWriter.addNode(var7); // L: 8715
					}

					if (var0 == 5) { // L: 8717
						var7 = class21.getPacketBufferNode(ClientPacket.field2592, Client.packetWriter.isaacCipher); // L: 8719
						var7.packetBuffer.writeInt(var1); // L: 8720
						var7.packetBuffer.writeShort(var2); // L: 8721
						var7.packetBuffer.writeShort(var3); // L: 8722
						Client.packetWriter.addNode(var7); // L: 8723
					}

					if (var0 == 6) { // L: 8725
						var7 = class21.getPacketBufferNode(ClientPacket.field2650, Client.packetWriter.isaacCipher); // L: 8727
						var7.packetBuffer.writeInt(var1); // L: 8728
						var7.packetBuffer.writeShort(var2); // L: 8729
						var7.packetBuffer.writeShort(var3); // L: 8730
						Client.packetWriter.addNode(var7); // L: 8731
					}

					if (var0 == 7) { // L: 8733
						var7 = class21.getPacketBufferNode(ClientPacket.field2648, Client.packetWriter.isaacCipher); // L: 8735
						var7.packetBuffer.writeInt(var1); // L: 8736
						var7.packetBuffer.writeShort(var2); // L: 8737
						var7.packetBuffer.writeShort(var3); // L: 8738
						Client.packetWriter.addNode(var7); // L: 8739
					}

					if (var0 == 8) { // L: 8741
						var7 = class21.getPacketBufferNode(ClientPacket.field2613, Client.packetWriter.isaacCipher); // L: 8743
						var7.packetBuffer.writeInt(var1); // L: 8744
						var7.packetBuffer.writeShort(var2); // L: 8745
						var7.packetBuffer.writeShort(var3); // L: 8746
						Client.packetWriter.addNode(var7); // L: 8747
					}

					if (var0 == 9) { // L: 8749
						var7 = class21.getPacketBufferNode(ClientPacket.field2593, Client.packetWriter.isaacCipher); // L: 8751
						var7.packetBuffer.writeInt(var1); // L: 8752
						var7.packetBuffer.writeShort(var2); // L: 8753
						var7.packetBuffer.writeShort(var3); // L: 8754
						Client.packetWriter.addNode(var7); // L: 8755
					}

					if (var0 == 10) { // L: 8757
						var7 = class21.getPacketBufferNode(ClientPacket.field2632, Client.packetWriter.isaacCipher); // L: 8759
						var7.packetBuffer.writeInt(var1); // L: 8760
						var7.packetBuffer.writeShort(var2); // L: 8761
						var7.packetBuffer.writeShort(var3); // L: 8762
						Client.packetWriter.addNode(var7); // L: 8763
					}

				}
			}
		}
	} // L: 8683 8765
}
