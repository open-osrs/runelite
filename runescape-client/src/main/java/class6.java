import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public enum class6 implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	field10(0, 0);

	@ObfuscatedName("k")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -607968475
	)
	public final int field12;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1626436831
	)
	final int field11;

	class6(int var3, int var4) {
		this.field12 = var3;
		this.field11 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field11;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "2047"
	)
	static final void method44() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints > 0) {
				--var0.hitpoints;
			}

			if (var0.hitpoints == 0) {
				if (var0.objectId < 0 || NPC.method2225(var0.objectId, var0.field1083)) {
					class119.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1088, var0.field1083);
					var0.remove();
				}
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102 && (var0.id < 0 || NPC.method2225(var0.id, var0.field1087))) {
					class119.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1087);
					var0.delay = -1;
					if (var0.id == var0.objectId && var0.objectId == -1) {
						var0.remove();
					} else if (var0.id == var0.objectId && var0.orientation == var0.field1088 && var0.field1083 == var0.field1087) {
						var0.remove();
					}
				}
			}
		}

	}
}
