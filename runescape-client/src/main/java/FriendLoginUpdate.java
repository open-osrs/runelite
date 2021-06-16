import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1437119291
	)
	public int field3829;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("v")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Llc;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3829 = (int)(ClientPacket.currentTimeMillis() / 1000L); // L: 106
		this.username = var1; // L: 107
		this.world = (short)var2; // L: 108
	} // L: 109
}
