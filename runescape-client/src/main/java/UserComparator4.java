import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "[Lom;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llr;Llr;I)I",
		garbageValue = "1546969977"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(Ljs;Ljava/lang/String;I)V",
		garbageValue = "1444277374"
	)
	static void method2143(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field682 += var2.groupCount;
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1734558786"
	)
	static void method2149() {
		if (Client.renderSelf) {
			ApproximateRouteStrategy.addPlayerToScene(MouseHandler.localPlayer, false);
		}

	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "70378358"
	)
	static final int method2150() {
		if (Decimator.clientPreferences.roofsHidden) {
			return GrandExchangeEvent.Client_plane;
		} else {
			int var0 = 3;
			if (class116.cameraPitch < 310) {
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) {
					var1 = KeyHandler.oculusOrbFocalPointX >> 7;
					var2 = ArchiveDiskAction.oculusOrbFocalPointY >> 7;
				} else {
					var1 = MouseHandler.localPlayer.x >> 7;
					var2 = MouseHandler.localPlayer.y >> 7;
				}

				int var3 = ItemContainer.cameraX >> 7;
				int var4 = WorldMapArchiveLoader.cameraZ >> 7;
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
					return GrandExchangeEvent.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
					return GrandExchangeEvent.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[GrandExchangeEvent.Client_plane][var3][var4] & 4) != 0) {
					var0 = GrandExchangeEvent.Client_plane;
				}

				int var5;
				if (var1 > var3) {
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1;
				}

				int var6;
				if (var2 > var4) {
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2;
				}

				int var7;
				int var8;
				if (var5 > var6) {
					var7 = var6 * 65536 / var5;
					var8 = 32768;

					while (var3 != var1) {
						if (var3 < var1) {
							++var3;
						} else if (var3 > var1) {
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[GrandExchangeEvent.Client_plane][var3][var4] & 4) != 0) {
							var0 = GrandExchangeEvent.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var4 < var2) {
								++var4;
							} else if (var4 > var2) {
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[GrandExchangeEvent.Client_plane][var3][var4] & 4) != 0) {
								var0 = GrandExchangeEvent.Client_plane;
							}
						}
					}
				} else if (var6 > 0) {
					var7 = var5 * 65536 / var6;
					var8 = 32768;

					while (var4 != var2) {
						if (var4 < var2) {
							++var4;
						} else if (var4 > var2) {
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[GrandExchangeEvent.Client_plane][var3][var4] & 4) != 0) {
							var0 = GrandExchangeEvent.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var3 < var1) {
								++var3;
							} else if (var3 > var1) {
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[GrandExchangeEvent.Client_plane][var3][var4] & 4) != 0) {
								var0 = GrandExchangeEvent.Client_plane;
							}
						}
					}
				}
			}

			if (MouseHandler.localPlayer.x >= 0 && MouseHandler.localPlayer.y >= 0 && MouseHandler.localPlayer.x < 13312 && MouseHandler.localPlayer.y < 13312) {
				if ((Tiles.Tiles_renderFlags[GrandExchangeEvent.Client_plane][MouseHandler.localPlayer.x >> 7][MouseHandler.localPlayer.y >> 7] & 4) != 0) {
					var0 = GrandExchangeEvent.Client_plane;
				}

				return var0;
			} else {
				return GrandExchangeEvent.Client_plane;
			}
		}
	}
}
