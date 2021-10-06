import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	public static final WorldMapCacheName field2220;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	public static final WorldMapCacheName field2215;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	public static final WorldMapCacheName field2216;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	static final WorldMapCacheName field2217;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	public static final WorldMapCacheName field2218;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("k")
	@Export("name")
	public final String name;

	static {
		field2220 = new WorldMapCacheName("details");
		field2215 = new WorldMapCacheName("compositemap");
		field2216 = new WorldMapCacheName("compositetexture");
		field2217 = new WorldMapCacheName("area");
		field2218 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}
}
