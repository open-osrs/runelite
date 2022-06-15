import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1382052049
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 798305999
	)
	@Export("x")
	public int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1552762679
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lkd;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane; // L: 15
		this.x = var1.x; // L: 16
		this.y = var1.y; // L: 17
	} // L: 18

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 9
		this.x = var2; // L: 10
		this.y = var3; // L: 11
	} // L: 12

	public Coord(int var1) {
		if (var1 == -1) { // L: 21
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3; // L: 23
			this.x = var1 >> 14 & 16383; // L: 24
			this.y = var1 & 16383; // L: 25
		}

	} // L: 27

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "34"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane; // L: 31
		int var3 = this.x; // L: 32
		int var4 = this.y; // L: 33
		int var1 = var2 << 28 | var3 << 14 | var4; // L: 35
		return var1; // L: 37
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)Z",
		garbageValue = "-326273528"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 48
			return false;
		} else if (this.x != var1.x) { // L: 49
			return false;
		} else {
			return this.y == var1.y; // L: 50
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "65710498"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 64
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 42
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 43 44
		}
	}

	public int hashCode() {
		return this.packed(); // L: 56
	}

	public String toString() {
		return this.toString(","); // L: 60
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1586830806"
	)
	static void method5549(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9514
		int[] var3 = Players.Players_indices; // L: 9515
		boolean var4 = false; // L: 9516
		Username var5 = new Username(var1, HealthBarDefinition.loginType); // L: 9517

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9518
			Player var7 = Client.players[var3[var6]]; // L: 9519
			if (var7 != null && var7 != class101.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9520
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9521
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2970, Client.packetWriter.isaacCipher); // L: 9523
					var8.packetBuffer.writeShort(var3[var6]); // L: 9524
					var8.packetBuffer.writeByte(0); // L: 9525
					Client.packetWriter.addNode(var8); // L: 9526
				} else if (var0 == 4) { // L: 9528
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2991, Client.packetWriter.isaacCipher); // L: 9530
					var8.packetBuffer.method7762(0); // L: 9531
					var8.packetBuffer.method7863(var3[var6]); // L: 9532
					Client.packetWriter.addNode(var8); // L: 9533
				} else if (var0 == 6) { // L: 9535
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2965, Client.packetWriter.isaacCipher); // L: 9537
					var8.packetBuffer.writeIntME(var3[var6]); // L: 9538
					var8.packetBuffer.method7762(0); // L: 9539
					Client.packetWriter.addNode(var8); // L: 9540
				} else if (var0 == 7) { // L: 9542
					var8 = EnumComposition.getPacketBufferNode(ClientPacket.field2947, Client.packetWriter.isaacCipher); // L: 9544
					var8.packetBuffer.writeShort(var3[var6]); // L: 9545
					var8.packetBuffer.writeByte(0); // L: 9546
					Client.packetWriter.addNode(var8); // L: 9547
				}

				var4 = true; // L: 9549
				break;
			}
		}

		if (!var4) { // L: 9553
			class290.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9554
}
