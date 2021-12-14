import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	static final PrivateChatMode field4595;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	public static final PrivateChatMode field4596;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	static final PrivateChatMode field4594;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -38528809
	)
	public final int field4597;

	static {
		field4595 = new PrivateChatMode(0);
		field4596 = new PrivateChatMode(1);
		field4594 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field4597 = var1;
	}
}
