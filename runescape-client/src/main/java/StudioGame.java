import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("i")
	@Export("name")
	public final String name;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1751135383
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 21
		this.id = var5; // L: 22
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[SoundSystem.Client_plane][var0][var1]; // L: 7523
		if (var2 == null) { // L: 7524
			Decimator.scene.removeGroundItemPile(SoundSystem.Client_plane, var0, var1); // L: 7525
		} else {
			long var3 = -99999999L; // L: 7528
			TileItem var5 = null; // L: 7529

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7530 7531 7539
				ItemComposition var7 = Client.ItemDefinition_get(var6.id); // L: 7532
				long var11 = (long)var7.price; // L: 7533
				if (var7.isStackable == 1) { // L: 7534
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 7535
					var3 = var11; // L: 7536
					var5 = var6; // L: 7537
				}
			}

			if (var5 == null) { // L: 7541
				Decimator.scene.removeGroundItemPile(SoundSystem.Client_plane, var0, var1); // L: 7542
			} else {
				var2.addLast(var5); // L: 7545
				TileItem var13 = null; // L: 7546
				TileItem var8 = null; // L: 7547

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7548 7549 7554
					if (var5.id != var6.id) { // L: 7550
						if (var13 == null) { // L: 7551
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) { // L: 7552
							var8 = var6;
						}
					}
				}

				long var9 = ScriptEvent.calculateTag(var0, var1, 3, false, 0); // L: 7556
				Decimator.scene.newGroundItemPile(SoundSystem.Client_plane, var0, var1, class92.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, SoundSystem.Client_plane), var5, var9, var13, var8); // L: 7557
			}
		}
	} // L: 7526 7543 7558
}
