import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class class116 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class116 field1421;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class116 field1415;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class116 field1416;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class116 field1423;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class116 field1418;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static final class116 field1419;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1981923463
	)
	final int field1420;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -135847907
	)
	final int field1417;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 249405033
	)
	final int field1422;

	static {
		field1421 = new class116(0, 0, (String)null, 0); // L: 14
		field1415 = new class116(1, 1, (String)null, 9); // L: 15
		field1416 = new class116(2, 2, (String)null, 3); // L: 16
		field1423 = new class116(3, 3, (String)null, 6); // L: 17
		field1418 = new class116(4, 4, (String)null, 1); // L: 18
		field1419 = new class116(5, 5, (String)null, 3); // L: 19
	}

	class116(int var1, int var2, String var3, int var4) {
		this.field1420 = var1; // L: 29
		this.field1417 = var2; // L: 30
		this.field1422 = var4; // L: 31
	} // L: 32

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1417; // L: 40
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "94"
	)
	int method2669() {
		return this.field1422; // L: 35
	}

	@ObfuscatedName("p")
	public static boolean method2671(long var0) {
		return 0L != var0 && !class12.method188(var0); // L: 56
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2039612371"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 117
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	static void method2662() {
		Client.packetWriter.clearBuffer(); // L: 3417
		Client.packetWriter.packetBuffer.offset = 0; // L: 3418
		Client.packetWriter.serverPacket = null; // L: 3419
		Client.packetWriter.field1289 = null; // L: 3420
		Client.packetWriter.field1290 = null; // L: 3421
		Client.packetWriter.field1291 = null; // L: 3422
		Client.packetWriter.serverPacketLength = 0; // L: 3423
		Client.packetWriter.field1287 = 0; // L: 3424
		Client.rebootTimer = 0; // L: 3425
		UrlRequest.method2489(); // L: 3426
		Client.minimapState = 0; // L: 3427
		Client.destinationX = 0; // L: 3428

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 3429
			Client.players[var0] = null;
		}

		class340.localPlayer = null; // L: 3430

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 3431
			NPC var1 = Client.npcs[var0]; // L: 3432
			if (var1 != null) { // L: 3433
				var1.targetIndex = -1; // L: 3434
				var1.false0 = false; // L: 3435
			}
		}

		ItemContainer.itemContainers = new NodeHashTable(32); // L: 3439
		VertexNormal.updateGameState(30); // L: 3441

		for (var0 = 0; var0 < 100; ++var0) { // L: 3442
			Client.field504[var0] = true;
		}

		PacketBufferNode var2 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2824, Client.packetWriter.isaacCipher); // L: 3445
		var2.packetBuffer.writeByte(class143.getWindowedMode()); // L: 3446
		var2.packetBuffer.writeShort(class186.canvasWidth); // L: 3447
		var2.packetBuffer.writeShort(BoundaryObject.canvasHeight); // L: 3448
		Client.packetWriter.addNode(var2); // L: 3449
	} // L: 3451
}
