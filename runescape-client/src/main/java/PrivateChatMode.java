import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	static final PrivateChatMode field4634;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final PrivateChatMode field4632;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	static final PrivateChatMode field4633;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1716574203
	)
	public final int field4631;

	static {
		field4634 = new PrivateChatMode(0); // L: 5
		field4632 = new PrivateChatMode(1); // L: 6
		field4633 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field4631 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpc;IB)V",
		garbageValue = "76"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		class150.method3025(var0); // L: 73
		AttackOption.method2292(var0); // L: 74
		if (var0.offset - var2 != var1) { // L: 75
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 76
		}
	} // L: 78
}
