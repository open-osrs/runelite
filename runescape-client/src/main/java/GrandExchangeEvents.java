import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("w")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("s")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("a")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("o")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("i")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator(); // L: 11
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator(); // L: 41
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator(); // L: 54
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	} // L: 67

	@ObfuscatedSignature(
		descriptor = "(Lop;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort(); // L: 82
		boolean var4 = var1.readUnsignedByte() == 1; // L: 83
		byte var5;
		if (var4) { // L: 85
			var5 = 1;
		} else {
			var5 = 0; // L: 86
		}

		int var6 = var1.readUnsignedShort(); // L: 87
		this.events = new ArrayList(var6); // L: 88

		for (int var7 = 0; var7 < var6; ++var7) { // L: 89
			this.events.add(new GrandExchangeEvent(var1, var5, var3)); // L: 90
		}

	} // L: 92

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZB)V",
		garbageValue = "35"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) { // L: 95
			Collections.sort(this.events, var1); // L: 96
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1)); // L: 99
		}

	} // L: 101

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "1979542286"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ItemContainer.getWidgetChild(var1, var2); // L: 9156
		if (var5 != null) { // L: 9157
			if (var5.onOp != null) { // L: 9158
				ScriptEvent var6 = new ScriptEvent(); // L: 9159
				var6.widget = var5; // L: 9160
				var6.opIndex = var0; // L: 9161
				var6.targetName = var4; // L: 9162
				var6.args = var5.onOp; // L: 9163
				Tile.runScriptEvent(var6); // L: 9164
			}

			boolean var11 = true; // L: 9166
			if (var5.contentType > 0) { // L: 9167
				var11 = GrandExchangeOfferAgeComparator.method5423(var5);
			}

			if (var11) { // L: 9168
				int var8 = PendingSpawn.getWidgetFlags(var5); // L: 9170
				int var9 = var0 - 1; // L: 9171
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 9173
				if (var7) { // L: 9175
					PacketBufferNode var10;
					if (var0 == 1) { // L: 9178
						var10 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2686, Client.packetWriter.isaacCipher); // L: 9180
						var10.packetBuffer.writeInt(var1); // L: 9181
						var10.packetBuffer.writeShort(var2); // L: 9182
						var10.packetBuffer.writeShort(var3); // L: 9183
						Client.packetWriter.addNode(var10); // L: 9184
					}

					if (var0 == 2) { // L: 9186
						var10 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2681, Client.packetWriter.isaacCipher); // L: 9188
						var10.packetBuffer.writeInt(var1); // L: 9189
						var10.packetBuffer.writeShort(var2); // L: 9190
						var10.packetBuffer.writeShort(var3); // L: 9191
						Client.packetWriter.addNode(var10); // L: 9192
					}

					if (var0 == 3) { // L: 9194
						var10 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2682, Client.packetWriter.isaacCipher); // L: 9196
						var10.packetBuffer.writeInt(var1); // L: 9197
						var10.packetBuffer.writeShort(var2); // L: 9198
						var10.packetBuffer.writeShort(var3); // L: 9199
						Client.packetWriter.addNode(var10); // L: 9200
					}

					if (var0 == 4) { // L: 9202
						var10 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2683, Client.packetWriter.isaacCipher); // L: 9204
						var10.packetBuffer.writeInt(var1); // L: 9205
						var10.packetBuffer.writeShort(var2); // L: 9206
						var10.packetBuffer.writeShort(var3); // L: 9207
						Client.packetWriter.addNode(var10); // L: 9208
					}

					if (var0 == 5) { // L: 9210
						var10 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2734, Client.packetWriter.isaacCipher); // L: 9212
						var10.packetBuffer.writeInt(var1); // L: 9213
						var10.packetBuffer.writeShort(var2); // L: 9214
						var10.packetBuffer.writeShort(var3); // L: 9215
						Client.packetWriter.addNode(var10); // L: 9216
					}

					if (var0 == 6) { // L: 9218
						var10 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2665, Client.packetWriter.isaacCipher); // L: 9220
						var10.packetBuffer.writeInt(var1); // L: 9221
						var10.packetBuffer.writeShort(var2); // L: 9222
						var10.packetBuffer.writeShort(var3); // L: 9223
						Client.packetWriter.addNode(var10); // L: 9224
					}

					if (var0 == 7) { // L: 9226
						var10 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2715, Client.packetWriter.isaacCipher); // L: 9228
						var10.packetBuffer.writeInt(var1); // L: 9229
						var10.packetBuffer.writeShort(var2); // L: 9230
						var10.packetBuffer.writeShort(var3); // L: 9231
						Client.packetWriter.addNode(var10); // L: 9232
					}

					if (var0 == 8) { // L: 9234
						var10 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2751, Client.packetWriter.isaacCipher); // L: 9236
						var10.packetBuffer.writeInt(var1); // L: 9237
						var10.packetBuffer.writeShort(var2); // L: 9238
						var10.packetBuffer.writeShort(var3); // L: 9239
						Client.packetWriter.addNode(var10); // L: 9240
					}

					if (var0 == 9) { // L: 9242
						var10 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2711, Client.packetWriter.isaacCipher); // L: 9244
						var10.packetBuffer.writeInt(var1); // L: 9245
						var10.packetBuffer.writeShort(var2); // L: 9246
						var10.packetBuffer.writeShort(var3); // L: 9247
						Client.packetWriter.addNode(var10); // L: 9248
					}

					if (var0 == 10) { // L: 9250
						var10 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2689, Client.packetWriter.isaacCipher); // L: 9252
						var10.packetBuffer.writeInt(var1); // L: 9253
						var10.packetBuffer.writeShort(var2); // L: 9254
						var10.packetBuffer.writeShort(var3); // L: 9255
						Client.packetWriter.addNode(var10); // L: 9256
					}

				}
			}
		}
	} // L: 9176 9258
}
