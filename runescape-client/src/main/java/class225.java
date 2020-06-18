import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
public class class225 {
	@ObfuscatedName("t")
	static String field2587;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 1529364225
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "950917676"
	)
	static final String method4182(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
