import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	static final PrivateChatMode field3822;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	public static final PrivateChatMode field3821;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	static final PrivateChatMode field3823;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2012095045
	)
	public final int field3824;

	static {
		field3822 = new PrivateChatMode(0); // L: 5
		field3821 = new PrivateChatMode(1); // L: 6
		field3823 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field3824 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lbf;I)Z",
		garbageValue = "200454944"
	)
	static boolean method6022(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 4413
			return false;
		} else if (WorldMapLabelSize.localPlayer == var0) { // L: 4414
			return TileItem.method2208(); // L: 4425
		} else {
			boolean var1 = LoginPacket.method3707() || Client.method1792() && var0.isFriend(); // L: 4415
			if (!var1) { // L: 4416
				boolean var2 = (Client.drawPlayerNames & 2) != 0; // L: 4419
				var1 = var2 && var0.isClanMember(); // L: 4421
			}

			return var1; // L: 4423
		}
	}
}
