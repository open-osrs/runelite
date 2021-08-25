import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 798136439
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 277556061
	)
	@Export("type")
	int type;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 510316027
	)
	@Export("x")
	int x;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 928364177
	)
	@Export("y")
	int y;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1051559985
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1704984919
	)
	int field1088;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -643946929
	)
	int field1083;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1287186215
	)
	@Export("id")
	int id;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1547375193
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 516398745
	)
	int field1087;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 409571987
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1484794423
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;Lkk;I)V",
		garbageValue = "1900075173"
	)
	public static void method2121(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0;
		GrandExchangeOfferUnitPriceComparator.KitDefinition_modelsArchive = var1;
		DirectByteArrayCopier.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfe;",
		garbageValue = "24"
	)
	public static HitSplatDefinition method2120(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-238397190"
	)
	static boolean method2118(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-984867343"
	)
	static void method2119() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) {
			int var2 = Client.menuOpcodes[var0];
			boolean var1 = var2 == 57 || var2 == 58 || var2 == 1007 || var2 == 25 || var2 == 30;
			if (var1) {
				if (var0 < Client.menuOptionsCount - 1) {
					for (int var3 = var0; var3 < Client.menuOptionsCount - 1; ++var3) {
						Client.menuActions[var3] = Client.menuActions[var3 + 1];
						Client.menuTargets[var3] = Client.menuTargets[var3 + 1];
						Client.menuOpcodes[var3] = Client.menuOpcodes[var3 + 1];
						Client.menuIdentifiers[var3] = Client.menuIdentifiers[var3 + 1];
						Client.menuArguments1[var3] = Client.menuArguments1[var3 + 1];
						Client.menuArguments2[var3] = Client.menuArguments2[var3 + 1];
						Client.menuShiftClick[var3] = Client.menuShiftClick[var3 + 1];
					}
				}

				--var0;
				--Client.menuOptionsCount;
			}
		}

		NPC.method2214(VarcInt.menuWidth / 2 + WorldMapRegion.menuX, ApproximateRouteStrategy.menuY);
	}
}
