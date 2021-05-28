import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	static final PrivateChatMode field3888;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public static final PrivateChatMode field3887;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	static final PrivateChatMode field3889;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -767370613
	)
	public final int field3890;

	static {
		field3888 = new PrivateChatMode(0); // L: 5
		field3887 = new PrivateChatMode(1); // L: 6
		field3889 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field3890 = var1; // L: 11
	} // L: 12
}
