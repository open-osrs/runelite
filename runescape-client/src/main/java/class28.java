import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class28 {
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = -428607811
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Llp;IS)Z",
		garbageValue = "6502"
	)
	static boolean method374(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 172
		if (var2 == null) { // L: 173
			return false;
		} else {
			RouteStrategy.SpriteBuffer_decode(var2); // L: 174
			return true; // L: 175
		}
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-55"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12576
		short[] var2 = new short[16]; // L: 12577
		int var3 = 0; // L: 12578

		for (int var4 = 0; var4 < ItemContainer.ItemDefinition_fileCount; ++var4) { // L: 12579
			ItemComposition var9 = FileSystem.ItemDefinition_get(var4); // L: 12580
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12581 12582 12583
				if (var3 >= 250) { // L: 12584
					UserComparator9.foundItemIdCount = -1; // L: 12585
					class182.foundItemIds = null; // L: 12586
					return; // L: 12587
				}

				if (var3 >= var2.length) { // L: 12589
					short[] var6 = new short[var2.length * 2]; // L: 12590

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12591
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12592
				}

				var2[var3++] = (short)var4; // L: 12594
			}
		}

		class182.foundItemIds = var2; // L: 12596
		Coord.foundItemIndex = 0; // L: 12597
		UserComparator9.foundItemIdCount = var3; // L: 12598
		String[] var8 = new String[UserComparator9.foundItemIdCount]; // L: 12599

		for (int var5 = 0; var5 < UserComparator9.foundItemIdCount; ++var5) { // L: 12600
			var8[var5] = FileSystem.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = class182.foundItemIds; // L: 12601
		Occluder.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 12603
	} // L: 12605
}
