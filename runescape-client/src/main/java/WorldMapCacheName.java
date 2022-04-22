import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	public static final WorldMapCacheName field2413;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	public static final WorldMapCacheName field2414;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	public static final WorldMapCacheName field2418;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	static final WorldMapCacheName field2419;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	public static final WorldMapCacheName field2417;
	@ObfuscatedName("n")
	@Export("name")
	public final String name;

	static {
		field2413 = new WorldMapCacheName("details"); // L: 4
		field2414 = new WorldMapCacheName("compositemap"); // L: 5
		field2418 = new WorldMapCacheName("compositetexture"); // L: 6
		field2419 = new WorldMapCacheName("area"); // L: 7
		field2417 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13
}
