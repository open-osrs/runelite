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
		field1421 = new class116(0, 0, (String)null, 0);
		field1415 = new class116(1, 1, (String)null, 9);
		field1416 = new class116(2, 2, (String)null, 3);
		field1423 = new class116(3, 3, (String)null, 6);
		field1418 = new class116(4, 4, (String)null, 1);
		field1419 = new class116(5, 5, (String)null, 3);
	}

	class116(int var1, int var2, String var3, int var4) {
		this.field1420 = var1;
		this.field1417 = var2;
		this.field1422 = var4;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1417;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "94"
	)
	int method2669() {
		return this.field1422;
	}

	@ObfuscatedName("p")
	public static boolean method2671(long var0) {
		return 0L != var0 && !class12.method188(var0);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2039612371"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	static void method2662() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1289 = null;
		Client.packetWriter.field1290 = null;
		Client.packetWriter.field1291 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1287 = 0;
		Client.rebootTimer = 0;
		UrlRequest.method2489();
		Client.minimapState = 0;
		Client.destinationX = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		class340.localPlayer = null;

		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		VertexNormal.updateGameState(30);

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field504[var0] = true;
		}

		PacketBufferNode var2 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2824, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class143.getWindowedMode());
		var2.packetBuffer.writeShort(class186.canvasWidth);
		var2.packetBuffer.writeShort(BoundaryObject.canvasHeight);
		Client.packetWriter.addNode(var2);
	}
}
