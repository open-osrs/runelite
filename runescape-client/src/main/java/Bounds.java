import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1843320923
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1031650591
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1371710773
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -179878711
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2); // L: 14
		this.setHigh(var3, var4); // L: 15
	} // L: 16

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2); // L: 10
	} // L: 11

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "7696"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "101"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1805672690"
	)
	public boolean method6341(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.highY + this.lowY; // L: 29
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lmo;Lmo;I)V",
		garbageValue = "-1080090251"
	)
	public void method6353(Bounds var1, Bounds var2) {
		this.method6343(var1, var2); // L: 37
		this.method6344(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmo;Lmo;I)V",
		garbageValue = "-953724915"
	)
	void method6343(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX = (var2.highX * -373048605 - (var1.lowX * -373048605 - this.lowX * -373048605)) * -1371710773; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method6345() > var1.method6345()) { // L: 48
			var2.highX -= var2.method6345() - var1.method6345(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lmo;Lmo;B)V",
		garbageValue = "107"
	)
	void method6344(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY = (var2.highY * -447998599 - (var1.lowY * -447998599 - this.lowY * -447998599)) * -179878711; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method6369() > var1.method6369()) { // L: 61
			var2.highY -= var2.method6369() - var1.method6369(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-123662248"
	)
	int method6345() {
		return this.lowX + this.highX; // L: 68
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "539098241"
	)
	int method6369() {
		return this.highY + this.lowY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	static void method6370() {
		Client.packetWriter.clearBuffer(); // L: 3043
		Client.packetWriter.packetBuffer.offset = 0; // L: 3044
		Client.packetWriter.serverPacket = null; // L: 3045
		Client.packetWriter.field1277 = null; // L: 3046
		Client.packetWriter.field1284 = null; // L: 3047
		Client.packetWriter.field1285 = null; // L: 3048
		Client.packetWriter.serverPacketLength = 0; // L: 3049
		Client.packetWriter.field1275 = 0; // L: 3050
		Client.rebootTimer = 0; // L: 3051
		KeyHandler.method343(); // L: 3052
		Client.minimapState = 0; // L: 3053
		Client.destinationX = 0; // L: 3054

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 3055
			Client.players[var0] = null;
		}

		HealthBarDefinition.localPlayer = null; // L: 3056

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 3057
			NPC var1 = Client.npcs[var0]; // L: 3058
			if (var1 != null) { // L: 3059
				var1.targetIndex = -1; // L: 3060
				var1.false0 = false; // L: 3061
			}
		}

		GrandExchangeOfferUnitPriceComparator.method5485(); // L: 3064
		WorldMapData_1.updateGameState(30); // L: 3065

		for (var0 = 0; var0 < 100; ++var0) { // L: 3066
			Client.field594[var0] = true;
		}

		Frames.method4481(); // L: 3067
	} // L: 3068
}
