import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("f")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -758081505
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1320055371
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("m")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2115742795
	)
	static int field1770;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -167939353
	)
	static int field1768;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1914713633
	)
	static int field1771;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1576236925
	)
	static int field1772;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -904988337
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("p")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("af")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 1308821627
	)
	@Export("cameraYaw")
	static int cameraYaw;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}
}
