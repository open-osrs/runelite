import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final WorldMapCacheName field2910;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final WorldMapCacheName field2907;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final WorldMapCacheName field2908;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final WorldMapCacheName field2909;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final WorldMapCacheName field2911;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1965056495
	)
	static int field2912;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("m")
	@Export("name")
	public final String name;

	static {
		field2910 = new WorldMapCacheName("details"); // L: 4
		field2907 = new WorldMapCacheName("compositemap"); // L: 5
		field2908 = new WorldMapCacheName("compositetexture"); // L: 6
		field2909 = new WorldMapCacheName("area"); // L: 7
		field2911 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13
}
