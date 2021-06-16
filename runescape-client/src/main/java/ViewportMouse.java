import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("f")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -859848203
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1776794129
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("y")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1161898267
	)
	static int field2490;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1274186293
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("g")
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

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1871733181"
	)
	static void method4410(int var0) {
		Client.oculusOrbState = var0; // L: 11669
	} // L: 11670
}
