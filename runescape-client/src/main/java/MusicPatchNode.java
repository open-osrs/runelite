import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1539628919
	)
	int field3284;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	MusicPatchNode2 field3264;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1874501073
	)
	int field3267;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -370020525
	)
	int field3269;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 785892757
	)
	int field3282;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2029040381
	)
	int field3271;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2036763329
	)
	int field3272;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1389641683
	)
	int field3273;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1743724405
	)
	int field3277;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -848752911
	)
	int field3275;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1533749071
	)
	int field3276;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -950899707
	)
	int field3274;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1022110285
	)
	int field3278;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1739604047
	)
	int field3279;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -407034595
	)
	int field3280;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1860967229
	)
	int field3281;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -292002933
	)
	int field3283;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -799763535
	)
	int field3270;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-120"
	)
	void method5471() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field3264 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljt;",
		garbageValue = "-1448337434"
	)
	public static PacketBufferNode method5473() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 47
			var0 = new PacketBufferNode(); // L: 48
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 51
		}

		var0.clientPacket = null; // L: 54
		var0.clientPacketLength = 0; // L: 55
		var0.packetBuffer = new PacketBuffer(5000); // L: 56
		return var0; // L: 57
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lpv;",
		garbageValue = "-507334207"
	)
	public static class432 method5472(int var0) {
		int var1 = class430.field4652[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class432.field4658; // L: 21
		} else if (var1 == 2) { // L: 23
			return class432.field4657; // L: 24
		} else {
			return var1 == 3 ? class432.field4656 : null; // L: 26 27 29
		}
	}
}
