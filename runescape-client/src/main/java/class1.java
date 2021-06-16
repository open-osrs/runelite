import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class class1 extends class14 {
	@ObfuscatedName("ar")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -790224169
	)
	int field6;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1595809253
	)
	int field7;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -864477031
	)
	int field8;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1618165123
	)
	int field9;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class1(class2 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field6 = var1.readInt(); // L: 292
		this.field9 = var1.readInt(); // L: 293
		this.field7 = var1.readUnsignedByte(); // L: 294
		this.field8 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method136(this.field6, this.field9, this.field7, this.field8); // L: 299
	} // L: 300

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Leb;",
		garbageValue = "2027222445"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 25
			var1 = new VarpDefinition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 28
			return var1; // L: 29
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-72"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class289.friendsChat != null) { // L: 11471
			PacketBufferNode var1 = InterfaceParent.getPacketBufferNode(ClientPacket.field2606, Client.packetWriter.isaacCipher); // L: 11472
			var1.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var0)); // L: 11473
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11474
			Client.packetWriter.addNode(var1); // L: 11475
		}
	} // L: 11476
}
