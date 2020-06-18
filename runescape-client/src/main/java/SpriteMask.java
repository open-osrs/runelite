import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 293169349
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1667471455
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("q")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("j")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-679501708"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("m")
	@Export("sleepExact")
	public static final void sleepExact(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "39704682"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = GameShell.getPreferencesFile("", GrandExchangeOfferWorldComparator.field54.name, true);
			Buffer var1 = NetSocket.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;ZI)V",
		garbageValue = "2008753616"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < HitSplatDefinition.ItemDefinition_fileCount; ++var4) {
			ItemDefinition var5 = KitDefinition.ItemDefinition_get(var4);
			if ((!var1 || var5.isTradable) && var5.noteTemplate == -1 && var5.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					TileItemPile.foundItemIdCount = -1;
					WorldMapScaleHandler.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		WorldMapScaleHandler.foundItemIds = var2;
		ArchiveLoader.foundItemIndex = 0;
		TileItemPile.foundItemIdCount = var3;
		String[] var8 = new String[TileItemPile.foundItemIdCount];

		for (int var9 = 0; var9 < TileItemPile.foundItemIdCount; ++var9) {
			var8[var9] = KitDefinition.ItemDefinition_get(var2[var9]).name;
		}

		WorldMapDecoration.method400(var8, WorldMapScaleHandler.foundItemIds);
	}
}
