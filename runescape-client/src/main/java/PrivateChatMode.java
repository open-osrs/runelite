import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final PrivateChatMode field3892;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final PrivateChatMode field3891;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final PrivateChatMode field3893;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1451320191
	)
	public final int field3890;

	static {
		field3892 = new PrivateChatMode(0); // L: 5
		field3891 = new PrivateChatMode(1); // L: 6
		field3893 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field3890 = var1; // L: 11
	} // L: 12
}
