import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hk")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("n")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1715632233
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1848697121
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("k")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -739590761
	)
	static int field2568;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -158852347
	)
	static int field2570;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -58663791
	)
	static int field2571;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -197390433
	)
	static int field2563;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2109743487
	)
	static int field2567;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2017777777
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("s")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}
}
