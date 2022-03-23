import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -652045891
	)
	public int field4259;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("h")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4259 = (int)(WorldMapSprite.method4989() / 1000L); // L: 109
		this.username = var1; // L: 110
		this.world = (short)var2; // L: 111
	} // L: 112

	@ObfuscatedName("o")
	static final void method6731(long var0) {
		try {
			Thread.sleep(var0); // L: 20
		} catch (InterruptedException var3) { // L: 22
		}

	} // L: 23
}
