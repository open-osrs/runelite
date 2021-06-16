import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("musicTrack")
	static MusicTrack musicTrack;
	@ObfuscatedName("x")
	@Export("cacheParentPaths")
	public static String[] cacheParentPaths;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1724172575
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1090866547
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Ljf;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1253534662"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method5031(var1) || this.archive.method5030(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lhg;",
		garbageValue = "-283445178"
	)
	public static PacketBufferNode method2162() {
		PacketBufferNode var0 = WorldMapData_1.method3583(); // L: 50
		var0.clientPacket = null; // L: 51
		var0.clientPacketLength = 0; // L: 52
		var0.packetBuffer = new PacketBuffer(5000); // L: 53
		return var0; // L: 54
	}
}
