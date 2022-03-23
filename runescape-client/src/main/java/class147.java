import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class147 extends class128 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -774752119
	)
	int field1658;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class147(class131 var1) {
		this.this$0 = var1;
		this.field1658 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-73"
	)
	void vmethod3107(Buffer var1) {
		this.field1658 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)V",
		garbageValue = "-1228032820"
	)
	void vmethod3104(ClanSettings var1) {
		var1.method2924(this.field1658); // L: 153
	} // L: 154

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	static final void method3052() {
		int var0 = PcmPlayer.field302 * 128 + 64; // L: 3556
		int var1 = DevicePcmPlayerProvider.field146 * 128 + 64; // L: 3557
		int var2 = Archive.getTileHeight(var0, var1, class160.Client_plane) - ClanSettings.field1608; // L: 3558
		class428.method7654(var0, var2, var1); // L: 3559
		var0 = class12.field62 * 128 + 64; // L: 3560
		var1 = WorldMapSectionType.field2778 * 128 + 64; // L: 3561
		var2 = Archive.getTileHeight(var0, var1, class160.Client_plane) - class351.field4157; // L: 3562
		int var3 = var0 - EnumComposition.cameraX; // L: 3563
		int var4 = var2 - FriendSystem.cameraY; // L: 3564
		int var5 = var1 - CollisionMap.cameraZ; // L: 3565
		int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3)); // L: 3566
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047; // L: 3567
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047; // L: 3568
		class132.method2864(var7, var8); // L: 3569
	} // L: 3570

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-53"
	)
	static final void method3051(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 11766
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3056()) { // L: 11767
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 11768
				PacketBufferNode var4 = ItemContainer.getPacketBufferNode(ClientPacket.field2967, Client.packetWriter.isaacCipher); // L: 11769
				var4.packetBuffer.writeByte(4 + ItemLayer.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 11770
				var4.packetBuffer.writeByte(var0); // L: 11771
				var4.packetBuffer.writeShort(var1); // L: 11772
				var4.packetBuffer.writeBoolean(var2); // L: 11773
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 11774
				Client.packetWriter.addNode(var4); // L: 11775
			}
		}
	} // L: 11776
}
