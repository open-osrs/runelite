import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class23 {
	@ObfuscatedName("l")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1191377295"
	)
	public static boolean method225() {
		ReflectionCheck var0 = (ReflectionCheck)class105.reflectionChecks.last();
		return var0 != null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "8"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
