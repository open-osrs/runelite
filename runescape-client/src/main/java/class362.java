import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public final class class362 implements Comparable {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("c")
	Object field4276;
	@ObfuscatedName("v")
	Object field4275;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 9010980018461630201L
	)
	long field4277;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 5118343004498114985L
	)
	long field4278;

	class362(Object var1, Object var2) {
		this.field4276 = var1; // L: 10
		this.field4275 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmv;I)I",
		garbageValue = "-1596161732"
	)
	int method6553(class362 var1) {
		if (this.field4278 < var1.field4278) {
			return -1; // L: 15
		} else {
			return this.field4278 > var1.field4278 ? 1 : 0; // L: 16 17
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class362) { // L: 22
			return this.field4275.equals(((class362)var1).field4275);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}

	public int hashCode() {
		return this.field4275.hashCode(); // L: 28
	}

	public int compareTo(Object var1) {
		return this.method6553((class362)var1); // L: 32
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "985949639"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = EnumComposition.getPacketBufferNode(ClientPacket.field2995, Client.packetWriter.isaacCipher); // L: 9588
		var2.packetBuffer.writeIntME(var1); // L: 9589
		var2.packetBuffer.method7783(var0); // L: 9590
		Client.packetWriter.addNode(var2); // L: 9591
	} // L: 9592
}
