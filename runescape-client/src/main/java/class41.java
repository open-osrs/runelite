import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class41 {
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -1092142465
	)
	@Export("port3")
	static int port3;

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "9"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var0][var1]; // L: 7422
		if (var2 == null) { // L: 7423
			ModeWhere.scene.removeGroundItemPile(GrandExchangeOfferUnitPriceComparator.Client_plane, var0, var1); // L: 7424
		} else {
			long var3 = -99999999L; // L: 7427
			TileItem var5 = null; // L: 7428

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7429 7430 7438
				ItemDefinition var7 = AbstractWorldMapData.ItemDefinition_get(var6.id); // L: 7431
				long var11 = (long)var7.price; // L: 7432
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1); // L: 7433
				}

				if (var11 > var3) { // L: 7434
					var3 = var11; // L: 7435
					var5 = var6; // L: 7436
				}
			}

			if (var5 == null) { // L: 7440
				ModeWhere.scene.removeGroundItemPile(GrandExchangeOfferUnitPriceComparator.Client_plane, var0, var1); // L: 7441
			} else {
				var2.addLast(var5); // L: 7444
				TileItem var13 = null; // L: 7445
				TileItem var8 = null; // L: 7446

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7447 7448 7453
					if (var5.id != var6.id) { // L: 7449
						if (var13 == null) { // L: 7450
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 7451
							var8 = var6;
						}
					}
				}

				long var9 = GrandExchangeOfferOwnWorldComparator.calculateTag(var0, var1, 3, false, 0); // L: 7455
				ModeWhere.scene.newGroundItemPile(GrandExchangeOfferUnitPriceComparator.Client_plane, var0, var1, GrandExchangeOfferWorldComparator.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, GrandExchangeOfferUnitPriceComparator.Client_plane), var5, var9, var13, var8); // L: 7456
			}
		}
	} // L: 7425 7442 7457
}
