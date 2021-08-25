import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static final PrivateChatMode field4392;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	public static final PrivateChatMode field4395;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static final PrivateChatMode field4394;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1838715125
	)
	public final int field4393;

	static {
		field4392 = new PrivateChatMode(0);
		field4395 = new PrivateChatMode(1);
		field4394 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field4393 = var1;
	}
}
