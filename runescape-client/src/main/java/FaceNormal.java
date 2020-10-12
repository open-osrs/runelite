import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class FaceNormal {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1856660121
	)
	public static int pcmSampleLength;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 1637295417
	)
	static int cameraY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -364011515
	)
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1271035903
	)
	int y;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1616346001
	)
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILlz;Liw;B)V",
		garbageValue = "81"
	)
	static void method3388(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 30
		var3.type = 1; // L: 31
		var3.key = (long)var0; // L: 32
		var3.archiveDisk = var1; // L: 33
		var3.archive = var2; // L: 34
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 35
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 36
		} // L: 37

		WorldMapArea.method415(); // L: 38
	} // L: 39
}
