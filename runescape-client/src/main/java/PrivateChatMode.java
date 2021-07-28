import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	static final PrivateChatMode field4299;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	public static final PrivateChatMode field4298;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	static final PrivateChatMode field4297;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 631961063
	)
	public final int field4300;

	static {
		field4299 = new PrivateChatMode(0);
		field4298 = new PrivateChatMode(1);
		field4297 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field4300 = var1;
	}
}
