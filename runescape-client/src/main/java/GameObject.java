import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -254047513
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1917415421
	)
	@Export("height")
	int height;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1140262961
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 364858457
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -202388443
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1674574095
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2078907755
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1202737381
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -129893675
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -327316739
	)
	int field2554;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -137941941
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 1142152799211342585L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2139353773
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	static void method4279() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4346
			NetSocket.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4347
		}

	} // L: 4349
}
