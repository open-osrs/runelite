import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class1 extends class14 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 920679423
	)
	int field5;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2074698601
	)
	int field6;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1666414987
	)
	int field8;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1361309885
	)
	int field9;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class1(class2 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field5 = var1.readInt(); // L: 292
		this.field9 = var1.readInt(); // L: 293
		this.field6 = var1.readUnsignedByte(); // L: 294
		this.field8 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.method113(this.field5, this.field9, this.field6, this.field8); // L: 299
	} // L: 300

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Ljv;B)V",
		garbageValue = "10"
	)
	public static void method13(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1; // L: 33
	} // L: 34

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	static void method11() {
		Client.menuOptionsCount = 0; // L: 7585
		Client.isMenuOpen = false; // L: 7586
	} // L: 7587

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-375078554"
	)
	static final void method7(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : ApproximateRouteStrategy.guestClanChannel; // L: 11314
		if (var2 != null && var1 >= 0 && var1 < var2.method27()) { // L: 11315
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 11316
			if (var3.rank == -1) { // L: 11317
				String var4 = var3.name; // L: 11318
				PacketWriter var5 = Client.packetWriter; // L: 11319
				PacketBufferNode var6 = class21.getPacketBufferNode(ClientPacket.field2651, var5.isaacCipher); // L: 11320
				var6.packetBuffer.writeByte(3 + Tiles.stringCp1252NullTerminatedByteSize(var4)); // L: 11321
				var6.packetBuffer.writeByte(var0); // L: 11322
				var6.packetBuffer.writeShort(var1); // L: 11323
				var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 11324
				var5.addNode(var6); // L: 11325
			}
		}
	} // L: 11326
}
