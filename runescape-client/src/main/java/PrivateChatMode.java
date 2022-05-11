import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	static final PrivateChatMode field4795;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	public static final PrivateChatMode field4794;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	static final PrivateChatMode field4793;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1775266883
	)
	public final int field4796;

	static {
		field4795 = new PrivateChatMode(0); // L: 5
		field4794 = new PrivateChatMode(1); // L: 6
		field4793 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field4796 = var1; // L: 11
	} // L: 12
}
