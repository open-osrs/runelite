import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class229 {
	@ObfuscatedName("dj")
	@Export("mouseCam")
	static boolean mouseCam;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Leb;",
		garbageValue = "-2"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructComposition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILjp;IIIZI)V",
		garbageValue = "-1538082454"
	)
	public static void method4321(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class232.musicPlayerStatus = 1; // L: 61
		JagexCache.musicTrackArchive = var1; // L: 62
		class232.musicTrackGroupId = var2; // L: 63
		class232.musicTrackFileId = var3; // L: 64
		LoginPacket.musicTrackVolume = var4; // L: 65
		VarpDefinition.musicTrackBoolean = var5; // L: 66
		class232.pcmSampleLength = var0; // L: 67
	} // L: 68
}
