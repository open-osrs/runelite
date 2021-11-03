import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class176 {
	@ObfuscatedName("n")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("r")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "28777"
	)
	static final boolean method3531() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 99
	}
}
