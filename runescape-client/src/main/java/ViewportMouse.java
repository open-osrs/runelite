import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("m")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1395390715
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 70898143
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("j")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1666776935
	)
	static int field1770;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -94383227
	)
	static int field1771;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -272779311
	)
	static int field1775;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1341524287
	)
	static int field1773;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2037239641
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("k")
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "-104"
	)
	public static int method3091(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "998588366"
	)
	public static boolean method3071(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class297.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}
}
