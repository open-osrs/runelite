import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ch")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -28991277
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1769235093
	)
	@Export("type")
	int type;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1813016497
	)
	@Export("x")
	int x;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -396145343
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -558546627
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1965670795
	)
	int field1225;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1054712157
	)
	int field1229;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 56083045
	)
	@Export("id")
	int id;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 343995201
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -990188279
	)
	int field1232;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -870224069
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2028634435
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0; // L: 16
		this.hitpoints = -1; // L: 17
	} // L: 19
}
