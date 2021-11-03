import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	static final PrivateChatMode field4422;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	public static final PrivateChatMode field4425;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	static final PrivateChatMode field4423;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -215884787
	)
	public final int field4424;

	static {
		field4422 = new PrivateChatMode(0); // L: 5
		field4425 = new PrivateChatMode(1); // L: 6
		field4423 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field4424 = var1; // L: 11
	} // L: 12
}
