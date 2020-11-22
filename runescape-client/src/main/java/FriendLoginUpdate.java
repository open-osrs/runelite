import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("u")
	public static short[] field3671;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1131935431
	)
	public int field3670;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("z")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lkm;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3670 = (int)(User.currentTimeMillis() / 1000L); // L: 106
		this.username = var1; // L: 107
		this.world = (short)var2; // L: 108
	} // L: 109
}
