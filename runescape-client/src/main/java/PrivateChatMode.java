import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	static final PrivateChatMode field3819;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	public static final PrivateChatMode field3818;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	static final PrivateChatMode field3820;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 530188217
	)
	public final int field3817;

	static {
		field3819 = new PrivateChatMode(0);
		field3818 = new PrivateChatMode(1);
		field3820 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field3817 = var1;
	}
}
