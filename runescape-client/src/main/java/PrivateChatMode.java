import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static final PrivateChatMode field3885;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static final PrivateChatMode field3886;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static final PrivateChatMode field3881;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1188638191
	)
	public final int field3884;

	static {
		field3885 = new PrivateChatMode(0); // L: 5
		field3886 = new PrivateChatMode(1); // L: 6
		field3881 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field3884 = var1; // L: 11
	} // L: 12
}
