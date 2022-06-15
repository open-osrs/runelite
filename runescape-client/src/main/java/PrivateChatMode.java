import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	static final PrivateChatMode field4818;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	public static final PrivateChatMode field4817;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	static final PrivateChatMode field4819;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2146881289
	)
	public final int field4820;

	static {
		field4818 = new PrivateChatMode(0); // L: 5
		field4817 = new PrivateChatMode(1); // L: 6
		field4819 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field4820 = var1; // L: 11
	} // L: 12
}
