import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static final PrivateChatMode field4412;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	public static final PrivateChatMode field4411;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static final PrivateChatMode field4413;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1139302799
	)
	public final int field4414;

	static {
		field4412 = new PrivateChatMode(0);
		field4411 = new PrivateChatMode(1);
		field4413 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field4414 = var1;
	}
}
