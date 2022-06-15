import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class class113 {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static IndexedSprite field1427;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 244154869
	)
	int field1420;
	@ObfuscatedName("v")
	float field1423;
	@ObfuscatedName("q")
	float field1421;
	@ObfuscatedName("f")
	float field1422;
	@ObfuscatedName("j")
	float field1419;
	@ObfuscatedName("e")
	float field1425;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	class113 field1426;

	class113() {
		this.field1421 = Float.MAX_VALUE; // L: 8
		this.field1422 = Float.MAX_VALUE; // L: 9
		this.field1419 = Float.MAX_VALUE; // L: 10
		this.field1425 = Float.MAX_VALUE; // L: 11
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;IB)V",
		garbageValue = "-65"
	)
	void method2630(Buffer var1, int var2) {
		this.field1420 = var1.readShort(); // L: 17
		this.field1423 = var1.method7740(); // L: 18
		this.field1421 = var1.method7740(); // L: 19
		this.field1422 = var1.method7740(); // L: 20
		this.field1419 = var1.method7740(); // L: 21
		this.field1425 = var1.method7740(); // L: 22
	} // L: 23

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1059822722"
	)
	static final void method2632(String var0) {
		PacketBufferNode var1 = EnumComposition.getPacketBufferNode(ClientPacket.field2944, Client.packetWriter.isaacCipher); // L: 195
		var1.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var0)); // L: 196
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 197
		Client.packetWriter.addNode(var1); // L: 198
	} // L: 199
}
