import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	public static final WorldMapCacheName field2210;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	public static final WorldMapCacheName field2211;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	public static final WorldMapCacheName field2215;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	static final WorldMapCacheName field2213;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	public static final WorldMapCacheName field2214;
	@ObfuscatedName("g")
	@Export("name")
	public final String name;

	static {
		field2210 = new WorldMapCacheName("details"); // L: 4
		field2211 = new WorldMapCacheName("compositemap"); // L: 5
		field2215 = new WorldMapCacheName("compositetexture"); // L: 6
		field2213 = new WorldMapCacheName("area"); // L: 7
		field2214 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "605723533"
	)
	public static void method4027() {
		class247.midiPcmStream.clear(); // L: 31
		class247.musicPlayerStatus = 1; // L: 32
		class128.musicTrackArchive = null; // L: 33
	} // L: 34
}
