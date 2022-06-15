import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class174 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1359206661
	)
	static int field1891;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgf;",
		garbageValue = "-64"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 23
			var1 = new ParamComposition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 26
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	static final boolean method3458() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 99
	}
}
