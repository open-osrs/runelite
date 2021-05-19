import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class280 {
	@ObfuscatedName("i")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -2114671873
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIB)V",
		garbageValue = "-6"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 7279

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7280 7281 7286
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 7282
				var9 = var10; // L: 7283
				break;
			}
		}

		if (var9 == null) { // L: 7288
			var9 = new PendingSpawn(); // L: 7289
			var9.plane = var0; // L: 7290
			var9.type = var3; // L: 7291
			var9.x = var1; // L: 7292
			var9.y = var2; // L: 7293
			WorldMapData_0.method3145(var9); // L: 7294
			Client.pendingSpawns.addFirst(var9); // L: 7295
		}

		var9.id = var4; // L: 7297
		var9.field1196 = var5; // L: 7298
		var9.orientation = var6; // L: 7299
		var9.delay = var7; // L: 7300
		var9.hitpoints = var8; // L: 7301
	} // L: 7302

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "64684553"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class25.clanChat != null) { // L: 11527
			PacketBufferNode var1 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2621, Client.packetWriter.isaacCipher); // L: 11528
			var1.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var0)); // L: 11529
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11530
			Client.packetWriter.addNode(var1); // L: 11531
		}
	} // L: 11532
}
