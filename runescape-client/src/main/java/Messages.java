import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("f")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2074438197
	)
	@Export("Messages_count")
	static int Messages_count;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;I)V",
		garbageValue = "-2063920931"
	)
	public static void method2328(AbstractArchive var0) {
		EnumDefinition.EnumDefinition_archive = var0; // L: 25
	} // L: 26

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;B)V",
		garbageValue = "6"
	)
	public static void method2339(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 15
	} // L: 16

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "56"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field916) { // L: 3585
			UserComparator3.method3546(); // L: 3586
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && Client.musicVolume != 0 && !Client.field916) { // L: 3588
			Archive var1 = ApproximateRouteStrategy.archive6; // L: 3589
			int var2 = Client.musicVolume; // L: 3590
			class206.musicPlayerStatus = 1; // L: 3592
			class23.musicTrackArchive = var1; // L: 3593
			TileItem.musicTrackGroupId = var0; // L: 3594
			class206.musicTrackFileId = 0; // L: 3595
			class206.musicTrackVolume = var2; // L: 3596
			class195.musicTrackBoolean = false; // L: 3597
			MusicPatch.pcmSampleLength = 2; // L: 3598
		}

		Client.currentTrackGroupId = var0; // L: 3601
	} // L: 3602

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "1388890654"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ItemContainer.getWidgetChild(var1, var2); // L: 8829
		if (var5 != null) { // L: 8830
			if (var5.onOp != null) { // L: 8831
				ScriptEvent var6 = new ScriptEvent(); // L: 8832
				var6.widget = var5; // L: 8833
				var6.opIndex = var0; // L: 8834
				var6.targetName = var4; // L: 8835
				var6.args = var5.onOp; // L: 8836
				Entity.runScriptEvent(var6); // L: 8837
			}

			boolean var11 = true; // L: 8839
			if (var5.contentType > 0) { // L: 8840
				var11 = Varcs.method2313(var5);
			}

			if (var11) { // L: 8841
				int var8 = WorldMapData_0.getWidgetFlags(var5); // L: 8843
				int var9 = var0 - 1; // L: 8844
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 8846
				if (var7) { // L: 8848
					PacketBufferNode var10;
					if (var0 == 1) { // L: 8851
						var10 = class4.getPacketBufferNode(ClientPacket.field2298, Client.packetWriter.isaacCipher); // L: 8853
						var10.packetBuffer.writeInt(var1); // L: 8854
						var10.packetBuffer.writeShort(var2); // L: 8855
						var10.packetBuffer.writeShort(var3); // L: 8856
						Client.packetWriter.addNode(var10); // L: 8857
					}

					if (var0 == 2) { // L: 8859
						var10 = class4.getPacketBufferNode(ClientPacket.field2274, Client.packetWriter.isaacCipher); // L: 8861
						var10.packetBuffer.writeInt(var1); // L: 8862
						var10.packetBuffer.writeShort(var2); // L: 8863
						var10.packetBuffer.writeShort(var3); // L: 8864
						Client.packetWriter.addNode(var10); // L: 8865
					}

					if (var0 == 3) { // L: 8867
						var10 = class4.getPacketBufferNode(ClientPacket.field2277, Client.packetWriter.isaacCipher); // L: 8869
						var10.packetBuffer.writeInt(var1); // L: 8870
						var10.packetBuffer.writeShort(var2); // L: 8871
						var10.packetBuffer.writeShort(var3); // L: 8872
						Client.packetWriter.addNode(var10); // L: 8873
					}

					if (var0 == 4) { // L: 8875
						var10 = class4.getPacketBufferNode(ClientPacket.field2300, Client.packetWriter.isaacCipher); // L: 8877
						var10.packetBuffer.writeInt(var1); // L: 8878
						var10.packetBuffer.writeShort(var2); // L: 8879
						var10.packetBuffer.writeShort(var3); // L: 8880
						Client.packetWriter.addNode(var10); // L: 8881
					}

					if (var0 == 5) { // L: 8883
						var10 = class4.getPacketBufferNode(ClientPacket.field2251, Client.packetWriter.isaacCipher); // L: 8885
						var10.packetBuffer.writeInt(var1); // L: 8886
						var10.packetBuffer.writeShort(var2); // L: 8887
						var10.packetBuffer.writeShort(var3); // L: 8888
						Client.packetWriter.addNode(var10); // L: 8889
					}

					if (var0 == 6) { // L: 8891
						var10 = class4.getPacketBufferNode(ClientPacket.field2252, Client.packetWriter.isaacCipher); // L: 8893
						var10.packetBuffer.writeInt(var1); // L: 8894
						var10.packetBuffer.writeShort(var2); // L: 8895
						var10.packetBuffer.writeShort(var3); // L: 8896
						Client.packetWriter.addNode(var10); // L: 8897
					}

					if (var0 == 7) { // L: 8899
						var10 = class4.getPacketBufferNode(ClientPacket.field2242, Client.packetWriter.isaacCipher); // L: 8901
						var10.packetBuffer.writeInt(var1); // L: 8902
						var10.packetBuffer.writeShort(var2); // L: 8903
						var10.packetBuffer.writeShort(var3); // L: 8904
						Client.packetWriter.addNode(var10); // L: 8905
					}

					if (var0 == 8) { // L: 8907
						var10 = class4.getPacketBufferNode(ClientPacket.field2285, Client.packetWriter.isaacCipher); // L: 8909
						var10.packetBuffer.writeInt(var1); // L: 8910
						var10.packetBuffer.writeShort(var2); // L: 8911
						var10.packetBuffer.writeShort(var3); // L: 8912
						Client.packetWriter.addNode(var10); // L: 8913
					}

					if (var0 == 9) { // L: 8915
						var10 = class4.getPacketBufferNode(ClientPacket.field2248, Client.packetWriter.isaacCipher); // L: 8917
						var10.packetBuffer.writeInt(var1); // L: 8918
						var10.packetBuffer.writeShort(var2); // L: 8919
						var10.packetBuffer.writeShort(var3); // L: 8920
						Client.packetWriter.addNode(var10); // L: 8921
					}

					if (var0 == 10) { // L: 8923
						var10 = class4.getPacketBufferNode(ClientPacket.field2256, Client.packetWriter.isaacCipher); // L: 8925
						var10.packetBuffer.writeInt(var1); // L: 8926
						var10.packetBuffer.writeShort(var2); // L: 8927
						var10.packetBuffer.writeShort(var3); // L: 8928
						Client.packetWriter.addNode(var10); // L: 8929
					}

				}
			}
		}
	} // L: 8849 8931
}
