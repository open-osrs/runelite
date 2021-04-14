import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class225 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 896523557
	)
	static int field2777;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lkw;",
		garbageValue = "57239353"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 35
		if (var1 != null) { // L: 36
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 37
			var1 = new SequenceDefinition(); // L: 38
			if (var2 != null) { // L: 39
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 40
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 41
			return var1; // L: 42
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2045310244"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class26.Client_plane][var0][var1]; // L: 7104
		if (var2 == null) { // L: 7105
			WorldMapArea.scene.removeGroundItemPile(class26.Client_plane, var0, var1); // L: 7106
		} else {
			long var3 = -99999999L; // L: 7109
			TileItem var5 = null; // L: 7110

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7111 7112 7120
				ItemComposition var7 = class23.ItemDefinition_get(var6.id); // L: 7113
				long var11 = (long)var7.price; // L: 7114
				if (var7.isStackable == 1) { // L: 7115
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 7116
					var3 = var11; // L: 7117
					var5 = var6; // L: 7118
				}
			}

			if (var5 == null) { // L: 7122
				WorldMapArea.scene.removeGroundItemPile(class26.Client_plane, var0, var1); // L: 7123
			} else {
				var2.addLast(var5); // L: 7126
				TileItem var13 = null; // L: 7127
				TileItem var8 = null; // L: 7128

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7129 7130 7135
					if (var6.id != var5.id) { // L: 7131
						if (var13 == null) { // L: 7132
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 7133
							var8 = var6;
						}
					}
				}

				long var9 = AttackOption.calculateTag(var0, var1, 3, false, 0); // L: 7137
				WorldMapArea.scene.newGroundItemPile(class26.Client_plane, var0, var1, UserComparator7.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class26.Client_plane), var5, var9, var13, var8); // L: 7138
			}
		}
	} // L: 7107 7124 7139
}
