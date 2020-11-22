import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static final PrivateChatMode field3827;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	public static final PrivateChatMode field3824;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static final PrivateChatMode field3826;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1809257021
	)
	public final int field3825;

	static {
		field3827 = new PrivateChatMode(0); // L: 5
		field3824 = new PrivateChatMode(1); // L: 6
		field3826 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field3825 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "250205673"
	)
	static String method6034(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}
}
