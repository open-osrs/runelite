import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public final class class52 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 465278289
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("gn")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;II)V",
		garbageValue = "-794896402"
	)
	static final void method873(String var0, int var1) {
		PacketBufferNode var2 = UserComparator4.getPacketBufferNode(ClientPacket.field2329, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.method5744(var1);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		signature = "(III)Lga;",
		garbageValue = "-136372501"
	)
	static RouteStrategy method877(int var0, int var1) {
		Client.field905.approxDestinationX = var0;
		Client.field905.approxDestinationY = var1;
		Client.field905.approxDestinationSizeX = 1;
		Client.field905.approxDestinationSizeY = 1;
		return Client.field905;
	}
}
