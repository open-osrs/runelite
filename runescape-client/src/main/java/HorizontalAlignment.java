import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1708(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1707(1, 2);

	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1382972063
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2031336539
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lt;I)Lj;",
		garbageValue = "177330026"
	)
	public static class3 method3014(class6 var0) {
		switch(var0.field18) {
		case 0:
			return new class0();
		default:
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1291496924"
	)
	static final void method3008() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints > 0) {
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) {
				if (var0.objectId >= 0) {
					var2 = var0.objectId;
					var3 = var0.field1096;
					var4 = class245.getObjectDefinition(var2);
					if (var3 == 11) {
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) {
						var3 = 4;
					}

					var1 = var4.method3213(var3);
					if (!var1) {
						continue;
					}
				}

				ServerPacket.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1095, var0.field1096);
				var0.remove();
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) {
					if (var0.id >= 0) {
						var2 = var0.id;
						var3 = var0.field1104;
						var4 = class245.getObjectDefinition(var2);
						if (var3 == 11) {
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) {
							var3 = 4;
						}

						var1 = var4.method3213(var3);
						if (!var1) {
							continue;
						}
					}

					ServerPacket.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1104);
					var0.delay = -1;
					if (var0.id == var0.objectId && var0.objectId == -1) {
						var0.remove();
					} else if (var0.id == var0.objectId && var0.field1095 == var0.orientation && var0.field1096 == var0.field1104) {
						var0.remove();
					}
				}
			}
		}

	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Ljt;III)V",
		garbageValue = "2115549302"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14);
		}

	}
}
