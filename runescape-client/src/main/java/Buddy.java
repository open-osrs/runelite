import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -162440659
	)
	@Export("world")
	public int world;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -79798009
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 616576577
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "130615034"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-619942050"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "616550004"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(Lck;ZB)V",
		garbageValue = "94"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 5447
			var0.isUnanimated = false; // L: 5448
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 5449 5450
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 5452
			int var3 = var0.y >> 7; // L: 5453
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 5454
				long var4 = SecureRandomFuture.calculateTag(0, 0, 0, false, var0.index); // L: 5455
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 5456
					var0.isUnanimated = false; // L: 5457
					var0.tileHeight = FaceNormal.getTileHeight(var0.x, var0.y, class20.Client_plane); // L: 5458
					var0.playerCycle = Client.cycle; // L: 5459
					class7.scene.addNullableObject(class20.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 5460
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 5463
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 5464
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 5465
					}

					var0.tileHeight = FaceNormal.getTileHeight(var0.x, var0.y, class20.Client_plane); // L: 5467
					var0.playerCycle = Client.cycle; // L: 5468
					class7.scene.drawEntity(class20.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 5469
				}
			}
		}

	} // L: 5473
}
