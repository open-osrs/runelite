import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		signature = "Llj;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1824184779
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1881172017
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1546680727
	)
	@Export("height")
	int height;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -49650103
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -32489331
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("entity")
	public Entity entity;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -136322441
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 460055653
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 198720377
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1832139769
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1766645403
	)
	int field1959;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -665577125
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -5581328528529906223L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -234800787
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "1896739320"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
