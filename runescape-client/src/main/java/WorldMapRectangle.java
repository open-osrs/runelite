import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ij")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1451061377
	)
	@Export("width")
	int width;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -216115115
	)
	@Export("height")
	int height;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -90003499
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1498862133
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhm;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 305
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "-2108490134"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 222
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 223
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 224
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 225
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 226
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 227
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 228
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 229
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 230 231
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(IB)Lps;",
		garbageValue = "46"
	)
	static class436 method4988(int var0) {
		class436 var1 = (class436)Client.Widget_cachedFonts.get((long)var0); // L: 12486
		if (var1 == null) { // L: 12487
			var1 = new class436(class132.field1588, var0); // L: 12488
		}

		return var1; // L: 12490
	}
}
