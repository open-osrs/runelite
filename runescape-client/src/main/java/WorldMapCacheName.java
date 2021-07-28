import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final WorldMapCacheName field2117;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final WorldMapCacheName field2115;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final WorldMapCacheName field2114;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	static final WorldMapCacheName field2118;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final WorldMapCacheName field2116;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		longValue = 5083972194157405959L
	)
	static long field2119;
	@ObfuscatedName("n")
	@Export("name")
	public final String name;

	static {
		field2117 = new WorldMapCacheName("details");
		field2115 = new WorldMapCacheName("compositemap");
		field2114 = new WorldMapCacheName("compositetexture");
		field2118 = new WorldMapCacheName("area");
		field2116 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}
}
