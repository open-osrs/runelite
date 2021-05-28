import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("v")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 836373803
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1131754581
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("y")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1563417631
	)
	static int field2492;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1940869639
	)
	static int field2497;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1999867305
	)
	static int field2496;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 253416581
	)
	@Export("ViewportMouse_entityCount")
	static int ViewportMouse_entityCount;
	@ObfuscatedName("e")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class369 HitSplatDefinition_cachedSprites;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}
}
