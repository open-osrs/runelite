import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
public class class372 {
	@ObfuscatedName("v")
	public static final int[] field4124;
	@ObfuscatedName("b")
	static byte[][][] field4123;

	static {
		field4124 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, -1, 1, -1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 3, 3}; // L: 4
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)[Lja;",
		garbageValue = "5"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field3548, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ironman, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_normal}; // L: 20
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(III)Lfc;",
		garbageValue = "-43218468"
	)
	static RouteStrategy method6463(int var0, int var1) {
		Client.field785.approxDestinationX = var0; // L: 7577
		Client.field785.approxDestinationY = var1; // L: 7578
		Client.field785.approxDestinationSizeX = 1; // L: 7579
		Client.field785.approxDestinationSizeY = 1; // L: 7580
		return Client.field785; // L: 7581
	}
}
