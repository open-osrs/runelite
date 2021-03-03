import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2077405845
	)
	static int field439;
	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("n")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-866196004"
	)
	static int method935(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F)); // L: 3273
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)V",
		garbageValue = "-614885261"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 7245

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7246 7247 7252
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 7248
				var9 = var10; // L: 7249
				break;
			}
		}

		if (var9 == null) { // L: 7254
			var9 = new PendingSpawn(); // L: 7255
			var9.plane = var0; // L: 7256
			var9.type = var3; // L: 7257
			var9.x = var1; // L: 7258
			var9.y = var2; // L: 7259
			WorldMapElement.method4592(var9); // L: 7260
			Client.pendingSpawns.addFirst(var9); // L: 7261
		}

		var9.id = var4; // L: 7263
		var9.field948 = var5; // L: 7264
		var9.orientation = var6; // L: 7265
		var9.delay = var7; // L: 7266
		var9.hitpoints = var8; // L: 7267
	} // L: 7268

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-54323362"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2270, Client.packetWriter.isaacCipher); // L: 11468
		var0.packetBuffer.writeByte(0); // L: 11469
		Client.packetWriter.addNode(var0); // L: 11470
	} // L: 11471
}
