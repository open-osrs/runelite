import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class161 {
	@ObfuscatedName("v")
	@Export("directions")
	static int[][] directions;
	@ObfuscatedName("j")
	@Export("distances")
	static int[][] distances;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2002565011
	)
	static int field1896;
	@ObfuscatedName("f")
	@Export("bufferX")
	static int[] bufferX;
	@ObfuscatedName("o")
	@Export("bufferY")
	static int[] bufferY;

	static {
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2115881206"
	)
	static final void method3211() {
		int var0 = class107.field1323 * 128 + 64;
		int var1 = HitSplatDefinition.field1713 * 128 + 64;
		int var2 = class122.getTileHeight(var0, var1, GrandExchangeEvent.Client_plane) - class6.field14;
		if (ItemContainer.cameraX < var0) {
			ItemContainer.cameraX = (var0 - ItemContainer.cameraX) * class216.field2545 / 1000 + ItemContainer.cameraX + UserComparator6.field1265;
			if (ItemContainer.cameraX > var0) {
				ItemContainer.cameraX = var0;
			}
		}

		if (ItemContainer.cameraX > var0) {
			ItemContainer.cameraX -= class216.field2545 * (ItemContainer.cameraX - var0) / 1000 + UserComparator6.field1265;
			if (ItemContainer.cameraX < var0) {
				ItemContainer.cameraX = var0;
			}
		}

		if (Bounds.cameraY < var2) {
			Bounds.cameraY = (var2 - Bounds.cameraY) * class216.field2545 / 1000 + Bounds.cameraY + UserComparator6.field1265;
			if (Bounds.cameraY > var2) {
				Bounds.cameraY = var2;
			}
		}

		if (Bounds.cameraY > var2) {
			Bounds.cameraY -= class216.field2545 * (Bounds.cameraY - var2) / 1000 + UserComparator6.field1265;
			if (Bounds.cameraY < var2) {
				Bounds.cameraY = var2;
			}
		}

		if (WorldMapArchiveLoader.cameraZ < var1) {
			WorldMapArchiveLoader.cameraZ = (var1 - WorldMapArchiveLoader.cameraZ) * class216.field2545 / 1000 + WorldMapArchiveLoader.cameraZ + UserComparator6.field1265;
			if (WorldMapArchiveLoader.cameraZ > var1) {
				WorldMapArchiveLoader.cameraZ = var1;
			}
		}

		if (WorldMapArchiveLoader.cameraZ > var1) {
			WorldMapArchiveLoader.cameraZ -= class216.field2545 * (WorldMapArchiveLoader.cameraZ - var1) / 1000 + UserComparator6.field1265;
			if (WorldMapArchiveLoader.cameraZ < var1) {
				WorldMapArchiveLoader.cameraZ = var1;
			}
		}

		var0 = class376.field4165 * 128 + 64;
		var1 = ItemLayer.field2147 * 128 + 64;
		var2 = class122.getTileHeight(var0, var1, GrandExchangeEvent.Client_plane) - AbstractSocket.field3874;
		int var3 = var0 - ItemContainer.cameraX;
		int var4 = var2 - Bounds.cameraY;
		int var5 = var1 - WorldMapArchiveLoader.cameraZ;
		int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3));
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.949D) & 2047;
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.949D) & 2047;
		if (var7 < 128) {
			var7 = 128;
		}

		if (var7 > 383) {
			var7 = 383;
		}

		if (class116.cameraPitch < var7) {
			class116.cameraPitch = (var7 - class116.cameraPitch) * Strings.field3397 / 1000 + class116.cameraPitch + KitDefinition.field1577;
			if (class116.cameraPitch > var7) {
				class116.cameraPitch = var7;
			}
		}

		if (class116.cameraPitch > var7) {
			class116.cameraPitch -= Strings.field3397 * (class116.cameraPitch - var7) / 1000 + KitDefinition.field1577;
			if (class116.cameraPitch < var7) {
				class116.cameraPitch = var7;
			}
		}

		int var9 = var8 - class117.cameraYaw;
		if (var9 > 1024) {
			var9 -= 2048;
		}

		if (var9 < -1024) {
			var9 += 2048;
		}

		if (var9 > 0) {
			class117.cameraYaw = var9 * Strings.field3397 / 1000 + class117.cameraYaw + KitDefinition.field1577;
			class117.cameraYaw &= 2047;
		}

		if (var9 < 0) {
			class117.cameraYaw -= -var9 * Strings.field3397 / 1000 + KitDefinition.field1577;
			class117.cameraYaw &= 2047;
		}

		int var10 = var8 - class117.cameraYaw;
		if (var10 > 1024) {
			var10 -= 2048;
		}

		if (var10 < -1024) {
			var10 += 2048;
		}

		if (var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) {
			class117.cameraYaw = var8;
		}

	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-953698862"
	)
	static final void method3210() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				Messages.method2094(var0);
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lbj;ZI)V",
		garbageValue = "1096629684"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			class4.method20(var2);
		}

		World.method1425(var2);
		Widget var4 = UrlRequester.getWidget(var3);
		if (var4 != null) {
			AttackOption.invalidateWidget(var4);
		}

		for (int var5 = 0; var5 < Client.menuOptionsCount; ++var5) {
			if (SoundSystem.method524(Client.menuOpcodes[var5])) {
				if (var5 < Client.menuOptionsCount - 1) {
					for (int var6 = var5; var6 < Client.menuOptionsCount - 1; ++var6) {
						Client.menuActions[var6] = Client.menuActions[var6 + 1];
						Client.menuTargets[var6] = Client.menuTargets[var6 + 1];
						Client.menuOpcodes[var6] = Client.menuOpcodes[var6 + 1];
						Client.menuIdentifiers[var6] = Client.menuIdentifiers[var6 + 1];
						Client.menuArguments1[var6] = Client.menuArguments1[var6 + 1];
						Client.menuArguments2[var6] = Client.menuArguments2[var6 + 1];
						Client.menuShiftClick[var6] = Client.menuShiftClick[var6 + 1];
					}
				}

				--var5;
				--Client.menuOptionsCount;
			}
		}

		SecureRandomFuture.method1711();
		if (Client.rootInterface != -1) {
			WorldMapData_0.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
