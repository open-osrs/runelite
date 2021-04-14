import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1609482177
	)
	public int field3833;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("u")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Llw;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3833 = (int)(ObjectSound.currentTimeMillis() / 1000L); // L: 106
		this.username = var1; // L: 107
		this.world = (short)var2; // L: 108
	} // L: 109
}
