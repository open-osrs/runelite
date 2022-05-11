import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("o")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("q")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("l")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("x")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgl;",
		garbageValue = "75"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0); // L: 84
		if (var1 != null) { // L: 85
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0); // L: 86
			var1 = new ItemComposition(); // L: 87
			var1.id = var0; // L: 88
			if (var2 != null) { // L: 89
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 90
			if (var1.noteTemplate != -1) { // L: 91
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 92
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 93
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!class82.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 94
				var1.name = "Members object"; // L: 95
				var1.isTradable = false; // L: 96

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 97
					var1.groundActions[var3] = null; // L: 98
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 100
					if (var3 != 4) { // L: 101
						var1.inventoryActions[var3] = null; // L: 102
					}
				}

				var1.shiftClickIndex = -2; // L: 105
				var1.team = 0; // L: 106
				if (var1.params != null) { // L: 107
					boolean var6 = false; // L: 108

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 109
						ParamComposition var5 = class78.getParamDefinition((int)var4.key); // L: 110
						if (var5.autoDisable) { // L: 111
							var4.remove();
						} else {
							var6 = true; // L: 112
						}
					}

					if (!var6) { // L: 114
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0); // L: 117
			return var1; // L: 118
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Lki;IIIIIIB)V",
		garbageValue = "-43"
	)
	static final void method3168(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field559) { // L: 10831
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10832
		}

		Client.field559 = false; // L: 10833
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !Login.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10834
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10835
				var0.scrollY -= 4; // L: 10836
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var0); // L: 10837
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10839
				var0.scrollY += 4; // L: 10840
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var0); // L: 10841
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10843
				var7 = var3 * (var3 - 32) / var4; // L: 10844
				if (var7 < 8) { // L: 10845
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10846
				int var9 = var3 - 32 - var7; // L: 10847
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10848
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var0); // L: 10849
				Client.field559 = true; // L: 10850
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10853
			var7 = var0.width; // L: 10854
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10855
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10856
				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var0); // L: 10857
			}
		}

	} // L: 10860
}
