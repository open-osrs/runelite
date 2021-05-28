import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class280 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;I)V",
		garbageValue = "236508743"
	)
	public static void method5070(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "925"
	)
	static void method5071(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 107
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2); // L: 108
		if (var4 != null) { // L: 109
			NetCache.NetCache_pendingWritesQueue.addLast(var4); // L: 110
		}
	} // L: 111
}
