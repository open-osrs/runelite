import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -200847333
	)
	public static int field1988;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 29

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1284731224"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 33
			if (var2 == 0) { // L: 34
				return; // L: 37
			}

			this.decodeNext(var1, var2); // L: 35
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "297360450"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class214.readStringIntParameters(var1, this.params); // L: 40
		}

	} // L: 42

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-607891890"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 46
		int var3;
		if (var4 == null) { // L: 48
			var3 = var2; // L: 49
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 52
			if (var5 == null) { // L: 53
				var3 = var2; // L: 54
			} else {
				var3 = var5.integer; // L: 57
			}
		}

		return var3; // L: 59
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1724611537"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 64
		String var3;
		if (var4 == null) { // L: 66
			var3 = var2; // L: 67
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 70
			if (var5 == null) { // L: 71
				var3 = var2; // L: 72
			} else {
				var3 = (String)var5.obj; // L: 75
			}
		}

		return var3; // L: 77
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2141365595"
	)
	public static int method3618() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "0"
	)
	public static int method3611(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var0;
		} else if (var2 == 1) { // L: 24
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 25 26
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1317102167"
	)
	public static void method3619(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2929, Client.packetWriter.isaacCipher); // L: 12590
		var4.packetBuffer.writeShort(var0); // L: 12591
		var4.packetBuffer.method7711(var1); // L: 12592
		var4.packetBuffer.method7703(var2); // L: 12593
		var4.packetBuffer.method7721(var3 ? Client.field586 * -480626199 * -416666023 : 0); // L: 12594
		Client.packetWriter.addNode(var4); // L: 12595
	} // L: 12596
}
