import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class194 {
	@ObfuscatedName("i")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("f")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("l")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("q")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-32639"
	)
	public static int method3890(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 24
	}
}
