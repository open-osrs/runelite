import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1607694617
	)
	static int field4096;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1414251107
	)
	public int field4097;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("p")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lpo;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4097 = (int)(Ignored.method6459() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
