import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public abstract class class14 extends Node {
	@ObfuscatedName("aa")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 570617391
	)
	static int field124;

	class14() {
	} // L: 68

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	abstract void vmethod363(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	abstract void vmethod354(ClanSettings var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1354695002"
	)
	static final void method229(String var0, int var1) {
		PacketBufferNode var2 = InterfaceParent.getPacketBufferNode(ClientPacket.field2653, Client.packetWriter.isaacCipher); // L: 252
		var2.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 253
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 254
		var2.packetBuffer.method6640(var1); // L: 255
		Client.packetWriter.addNode(var2); // L: 256
	} // L: 257

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Liv;Lef;IIZI)V",
		garbageValue = "-3145938"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 10150
		byte var6 = -1; // L: 10151
		String var7 = null; // L: 10152
		if (var5 != null && var5[var3] != null) { // L: 10153
			if (var3 == 0) { // L: 10154
				var6 = 33;
			} else if (var3 == 1) { // L: 10155
				var6 = 34;
			} else if (var3 == 2) { // L: 10156
				var6 = 35;
			} else if (var3 == 3) { // L: 10157
				var6 = 36;
			} else {
				var6 = 37; // L: 10158
			}

			var7 = var5[var3]; // L: 10159
		} else if (var3 == 4) { // L: 10162
			var6 = 37; // L: 10163
			var7 = "Drop"; // L: 10164
		}

		if (var6 != -1 && var7 != null) { // L: 10167
			PacketWriter.insertMenuItem(var7, SecureRandomFuture.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4); // L: 10168
		}

	} // L: 10170
}
