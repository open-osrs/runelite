import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bp")
	public static String field3400;
	@ObfuscatedName("cy")
	public static String field3439;
	@ObfuscatedName("ji")
	public static String field3609;
	@ObfuscatedName("jk")
	public static String field3610;
	@ObfuscatedName("jo")
	public static String field3611;

	static {
		field3400 = "Please visit the support page for assistance.";
		field3439 = "Please visit the support page for assistance.";
		field3609 = "";
		field3610 = "Page has opened in a new window.";
		field3611 = "(Please check your popup blocker.)";
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "-1754974044"
	)
	public static int method5088(boolean var0, boolean var1) {
		byte var2 = 0;
		int var3 = var2 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
		return var3;
	}
}
