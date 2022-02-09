import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class296 {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -764353757
	)
	static int field3510;

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)V",
		garbageValue = "-1892325000"
	)
	static final void method5489(PendingSpawn var0) {
		long var1 = 0L; // L: 7296
		int var3 = -1; // L: 7297
		int var4 = 0; // L: 7298
		int var5 = 0; // L: 7299
		if (var0.type == 0) { // L: 7300
			var1 = Decimator.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7301
			var1 = Decimator.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7302
			var1 = Decimator.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 7303
			var1 = Decimator.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) { // L: 7304
			int var6 = Decimator.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7305
			var3 = Skeleton.Entity_unpackID(var1); // L: 7306
			var4 = var6 & 31; // L: 7307
			var5 = var6 >> 6 & 3; // L: 7308
		}

		var0.objectId = var3; // L: 7310
		var0.field1100 = var4; // L: 7311
		var0.field1106 = var5; // L: 7312
	} // L: 7313
}
