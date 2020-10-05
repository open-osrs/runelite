import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = 1924820265
	)
	static int selectedSpellFlags;
	@ObfuscatedName("z")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;I)I",
		garbageValue = "2134639094"
	)
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-346223119"
	)
	static void method3497() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 59

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 60
			var1.clearIsFromIgnored(); // L: 62
		}

	} // L: 65

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "5447361"
	)
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = SecureRandomCallable.getWidgetChild(var1, var2); // L: 8137
		if (var5 != null) { // L: 8138
			if (var5.onOp != null) { // L: 8139
				ScriptEvent var6 = new ScriptEvent(); // L: 8140
				var6.widget = var5; // L: 8141
				var6.opIndex = var0; // L: 8142
				var6.targetName = var4; // L: 8143
				var6.args = var5.onOp; // L: 8144
				Script.runScriptEvent(var6); // L: 8145
			}

			boolean var8 = true; // L: 8147
			if (var5.contentType > 0) { // L: 8148
				var8 = class4.method60(var5);
			}

			if (var8) { // L: 8149
				if (StudioGame.method4230(WorldMapIcon_0.getWidgetFlags(var5), var0 - 1)) { // L: 8150
					PacketBufferNode var7;
					if (var0 == 1) { // L: 8153
						var7 = Client.getPacketBufferNode(ClientPacket.field2253, Client.packetWriter.isaacCipher); // L: 8155
						var7.packetBuffer.writeInt(var1); // L: 8156
						var7.packetBuffer.writeShort(var2); // L: 8157
						var7.packetBuffer.writeShort(var3); // L: 8158
						Client.packetWriter.addNode(var7); // L: 8159
					}

					if (var0 == 2) { // L: 8161
						var7 = Client.getPacketBufferNode(ClientPacket.field2278, Client.packetWriter.isaacCipher); // L: 8163
						var7.packetBuffer.writeInt(var1); // L: 8164
						var7.packetBuffer.writeShort(var2); // L: 8165
						var7.packetBuffer.writeShort(var3); // L: 8166
						Client.packetWriter.addNode(var7); // L: 8167
					}

					if (var0 == 3) { // L: 8169
						var7 = Client.getPacketBufferNode(ClientPacket.field2268, Client.packetWriter.isaacCipher); // L: 8171
						var7.packetBuffer.writeInt(var1); // L: 8172
						var7.packetBuffer.writeShort(var2); // L: 8173
						var7.packetBuffer.writeShort(var3); // L: 8174
						Client.packetWriter.addNode(var7); // L: 8175
					}

					if (var0 == 4) { // L: 8177
						var7 = Client.getPacketBufferNode(ClientPacket.field2255, Client.packetWriter.isaacCipher); // L: 8179
						var7.packetBuffer.writeInt(var1); // L: 8180
						var7.packetBuffer.writeShort(var2); // L: 8181
						var7.packetBuffer.writeShort(var3); // L: 8182
						Client.packetWriter.addNode(var7); // L: 8183
					}

					if (var0 == 5) { // L: 8185
						var7 = Client.getPacketBufferNode(ClientPacket.field2291, Client.packetWriter.isaacCipher); // L: 8187
						var7.packetBuffer.writeInt(var1); // L: 8188
						var7.packetBuffer.writeShort(var2); // L: 8189
						var7.packetBuffer.writeShort(var3); // L: 8190
						Client.packetWriter.addNode(var7); // L: 8191
					}

					if (var0 == 6) { // L: 8193
						var7 = Client.getPacketBufferNode(ClientPacket.field2330, Client.packetWriter.isaacCipher); // L: 8195
						var7.packetBuffer.writeInt(var1); // L: 8196
						var7.packetBuffer.writeShort(var2); // L: 8197
						var7.packetBuffer.writeShort(var3); // L: 8198
						Client.packetWriter.addNode(var7); // L: 8199
					}

					if (var0 == 7) { // L: 8201
						var7 = Client.getPacketBufferNode(ClientPacket.field2247, Client.packetWriter.isaacCipher); // L: 8203
						var7.packetBuffer.writeInt(var1); // L: 8204
						var7.packetBuffer.writeShort(var2); // L: 8205
						var7.packetBuffer.writeShort(var3); // L: 8206
						Client.packetWriter.addNode(var7); // L: 8207
					}

					if (var0 == 8) { // L: 8209
						var7 = Client.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher); // L: 8211
						var7.packetBuffer.writeInt(var1); // L: 8212
						var7.packetBuffer.writeShort(var2); // L: 8213
						var7.packetBuffer.writeShort(var3); // L: 8214
						Client.packetWriter.addNode(var7); // L: 8215
					}

					if (var0 == 9) { // L: 8217
						var7 = Client.getPacketBufferNode(ClientPacket.field2259, Client.packetWriter.isaacCipher); // L: 8219
						var7.packetBuffer.writeInt(var1); // L: 8220
						var7.packetBuffer.writeShort(var2); // L: 8221
						var7.packetBuffer.writeShort(var3); // L: 8222
						Client.packetWriter.addNode(var7); // L: 8223
					}

					if (var0 == 10) { // L: 8225
						var7 = Client.getPacketBufferNode(ClientPacket.field2300, Client.packetWriter.isaacCipher); // L: 8227
						var7.packetBuffer.writeInt(var1); // L: 8228
						var7.packetBuffer.writeShort(var2); // L: 8229
						var7.packetBuffer.writeShort(var3); // L: 8230
						Client.packetWriter.addNode(var7); // L: 8231
					}

				}
			}
		}
	} // L: 8151 8233
}
