import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	static final PrivateChatMode field4740;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	public static final PrivateChatMode field4738;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	static final PrivateChatMode field4739;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1675526131
	)
	public final int field4737;

	static {
		field4740 = new PrivateChatMode(0); // L: 5
		field4738 = new PrivateChatMode(1); // L: 6
		field4739 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field4737 = var1; // L: 15
	} // L: 16
}
