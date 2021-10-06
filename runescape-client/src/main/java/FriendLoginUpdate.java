import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 406159979
	)
	public int field3952;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("f")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lpm;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3952 = (int)(UserComparator4.method2406() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
