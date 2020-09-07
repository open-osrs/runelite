import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1710257939
	)
	public int field3664;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("i")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lku;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3664 = (int)(PacketWriter.currentTimeMillis() / 1000L); // L: 106
		this.username = var1; // L: 107
		this.world = (short)var2; // L: 108
	} // L: 109
}
