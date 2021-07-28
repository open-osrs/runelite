import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "124"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "138258898"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1662367088"
	)
	public static void method4860() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "188753094"
	)
	static final void method4858() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints > 0) {
				--var0.hitpoints;
			}

			if (var0.hitpoints == 0) {
				if (var0.objectId < 0 || class127.method2561(var0.objectId, var0.field1009)) {
					Renderable.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1012, var0.field1009);
					var0.remove();
				}
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) {
					if (var0.id >= 0) {
						int var2 = var0.id;
						int var3 = var0.field1016;
						ObjectComposition var4 = ClanChannel.getObjectDefinition(var2);
						if (var3 == 11) {
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) {
							var3 = 4;
						}

						boolean var1 = var4.method2993(var3);
						if (!var1) {
							continue;
						}
					}

					Renderable.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1016);
					var0.delay = -1;
					if (var0.objectId == var0.id && var0.objectId == -1) {
						var0.remove();
					} else if (var0.objectId == var0.id && var0.field1012 == var0.orientation && var0.field1009 == var0.field1016) {
						var0.remove();
					}
				}
			}
		}

	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1787819457"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		class171.method3555();
		if (MouseRecorder.friendsChat != null) {
			MouseRecorder.friendsChat.invalidateIgnoreds();
		}

	}
}
