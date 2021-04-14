import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gj")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("f")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -108577355
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 463191059
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("p")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1570054271
	)
	static int field2135;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1844660953
	)
	static int field2136;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 809710403
	)
	static int field2137;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -131115169
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("j")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}
}
