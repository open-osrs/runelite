import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class159 {
	@ObfuscatedName("f")
	@Export("directions")
	static int[][] directions;
	@ObfuscatedName("y")
	@Export("distances")
	static int[][] distances;
	@ObfuscatedName("b")
	@Export("bufferX")
	static int[] bufferX;
	@ObfuscatedName("d")
	@Export("bufferY")
	static int[] bufferY;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1685265527"
	)
	public static void method3192(int var0) {
		class232.musicPlayerStatus = 1; // L: 60
		ModelData0.musicTrackArchive = null; // L: 61
		class32.musicTrackGroupId = -1; // L: 62
		class18.musicTrackFileId = -1; // L: 63
		class232.musicTrackVolume = 0; // L: 64
		class232.musicTrackBoolean = false; // L: 65
		class232.pcmSampleLength = var0; // L: 66
	} // L: 67
}
