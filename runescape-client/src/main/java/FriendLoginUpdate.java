import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1916862787
	)
	public int field3840;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("o")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lla;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3840 = (int)(Archive.currentTimeMillis() / 1000L); // L: 106
		this.username = var1; // L: 107
		this.world = (short)var2; // L: 108
	} // L: 109

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "56"
	)
	public static void method5552(int var0) {
		if (class232.musicPlayerStatus != 0) { // L: 50
			LoginPacket.musicTrackVolume = var0;
		} else {
			class232.midiPcmStream.setPcmStreamVolume(var0); // L: 51
		}

	} // L: 52

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1660242957"
	)
	static final void method5553(int var0, int var1) {
		class3 var2 = var0 >= 0 ? Client.field847[var0] : Players.field1358; // L: 11551
		if (var2 != null && var1 >= 0 && var1 < var2.method39()) { // L: 11552
			class9 var3 = (class9)var2.field32.get(var1); // L: 11553
			if (var3.field76 == -1) {
				String var4 = var3.field73; // L: 11555
				PacketWriter var5 = Client.packetWriter; // L: 11556
				PacketBufferNode var6 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2635, var5.isaacCipher); // L: 11557
				var6.packetBuffer.writeByte(3 + class4.stringCp1252NullTerminatedByteSize(var4)); // L: 11558
				var6.packetBuffer.writeByte(var0); // L: 11559
				var6.packetBuffer.writeShort(var1); // L: 11560
				var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 11561
				var5.addNode(var6); // L: 11562
			}
		}
	} // L: 11554 11563
}
