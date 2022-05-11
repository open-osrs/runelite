import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("c")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1133434607
	)
	@Export("z")
	int z;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -468638571
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1248756677
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1886236557
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -665264033
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -884502203
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -553687171
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -451444878306106685L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1120239
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljj;Lqh;B)Ljm;",
		garbageValue = "-72"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = FloorOverlayDefinition.method3700(); // L: 27
		var2.clientPacket = var0; // L: 28
		var2.clientPacketLength = var0.length; // L: 29
		if (var2.clientPacketLength == -1) { // L: 30
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000); // L: 31
		} else if (var2.clientPacketLength <= 18) { // L: 32
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 33
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 34
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 35
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 36
		var2.index = 0; // L: 37
		return var2; // L: 38
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-811937066"
	)
	static final int method4391() {
		return ViewportMouse.ViewportMouse_y; // L: 106
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1555036135"
	)
	static final void method4392(String var0, int var1) {
		PacketBufferNode var2 = getPacketBufferNode(ClientPacket.field3026, Client.packetWriter.isaacCipher); // L: 236
		var2.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 237
		var2.packetBuffer.method7542(var1); // L: 238
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 239
		Client.packetWriter.addNode(var2); // L: 240
	} // L: 241

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "20695"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11200
	}
}
