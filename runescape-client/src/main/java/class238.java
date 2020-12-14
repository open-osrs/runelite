import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class238 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final class238 field3111;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final class238 field3114;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -455059837
	)
	final int field3113;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -423561667
	)
	final int field3117;

	static {
		field3111 = new class238(51, 27, 800, 0, 16, 16); // L: 29
		field3114 = new class238(25, 28, 800, 656, 40, 40); // L: 30
	}

	class238(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3113 = var5; // L: 39
		this.field3117 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1585982662"
	)
	public static String method4166(CharSequence var0) {
		String var1 = ParamDefinition.base37DecodeLong(Renderable.method3340(var0)); // L: 75
		if (var1 == null) { // L: 76
			var1 = "";
		}

		return var1; // L: 77
	}
}
