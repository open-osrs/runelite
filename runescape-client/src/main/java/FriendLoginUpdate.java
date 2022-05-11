import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 281202653
	)
	public int field4314;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("l")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lqv;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4314 = (int)(class113.method2624() / 1000L); // L: 109
		this.username = var1; // L: 110
		this.world = (short)var2; // L: 111
	} // L: 112
}
