import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final WorldMapCacheName field2768;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final WorldMapCacheName field2763;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final WorldMapCacheName field2764;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final WorldMapCacheName field2765;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final WorldMapCacheName field2766;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("s")
	@Export("name")
	public final String name;

	static {
		field2768 = new WorldMapCacheName("details");
		field2763 = new WorldMapCacheName("compositemap");
		field2764 = new WorldMapCacheName("compositetexture");
		field2765 = new WorldMapCacheName("area");
		field2766 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-875853562"
	)
	public static int method4865(int var0, int var1) {
		int var2;
		if (var1 > var0) {
			var2 = var0;
			var0 = var1;
			var1 = var2;
		}

		while (var1 != 0) {
			var2 = var0 % var1;
			var0 = var1;
			var1 = var2;
		}

		return var0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "985293867"
	)
	public static boolean method4864(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}
}
