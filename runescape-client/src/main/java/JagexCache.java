import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("j")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("p")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lmn;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("l")
	public static String field2077;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "201331676"
	)
	static final void method3625() {
		if (Client.field937 != TileItemPile.Client_plane) {
			Client.field937 = TileItemPile.Client_plane;
			int var0 = TileItemPile.Client_plane;
			int[] var1 = class3.sceneMinimapSprite.pixels;
			int var2 = var1.length;

			int var3;
			for (var3 = 0; var3 < var2; ++var3) {
				var1[var3] = 0;
			}

			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) {
				var4 = (103 - var3) * 2048 + 24628;

				for (var5 = 1; var5 < 103; ++var5) {
					if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) {
						UserComparator3.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
						UserComparator3.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
					}

					var4 += 4;
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
			class3.sceneMinimapSprite.setRaster();

			int var6;
			for (var5 = 1; var5 < 103; ++var5) {
				for (var6 = 1; var6 < 103; ++var6) {
					if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) {
						class307.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) {
						class307.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0;

			for (var5 = 0; var5 < 104; ++var5) {
				for (var6 = 0; var6 < 104; ++var6) {
					long var7 = UserComparator3.scene.getFloorDecorationTag(TileItemPile.Client_plane, var5, var6);
					if (0L != var7) {
						int var9 = Language.Entity_unpackID(var7);
						int var10 = Canvas.getObjectDefinition(var9).mapIconId;
						if (var10 >= 0) {
							Client.mapIcons[Client.mapIconCount] = Client.WorldMapElement_get(var10).getSpriteBool(false);
							Client.mapIconXs[Client.mapIconCount] = var5;
							Client.mapIconYs[Client.mapIconCount] = var6;
							++Client.mapIconCount;
						}
					}
				}
			}

			ArchiveLoader.rasterProvider.apply();
		}

	}
}
