import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("TileItem")
public final class TileItem extends Entity {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2027317293
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1677245385
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)Lef;",
		garbageValue = "1832696685"
	)
	@Export("getModel")
	protected final Model getModel() {
		return KitDefinition.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lic;II)Lhi;",
		garbageValue = "-1379318821"
	)
	static MusicPatch method2255(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lic;B)V",
		garbageValue = "14"
	)
	public static void method2256(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0;
		VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "16711935"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-145657229"
	)
	public static int method2259(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "748561937"
	)
	static final void method2260() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			Player var3 = Client.players[var1[var2]];
			if (var3 != null) {
				TaskHandler.updateActorSequence(var3, 1);
			}
		}

	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		signature = "(IIIIIIIIII)V",
		garbageValue = "393644147"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			MusicPatchNode2.method3819(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field962 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}
}
