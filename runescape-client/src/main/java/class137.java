import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class137 {
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("v")
	public short[] field1515;
	@ObfuscatedName("j")
	public short[] field1518;

	public class137(int var1) {
		ItemComposition var2 = KeyHandler.ItemDefinition_get(var1);
		if (var2.method3064()) {
			this.field1515 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1515, 0, this.field1515.length);
		}

		if (var2.method3065()) {
			this.field1518 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1518, 0, this.field1518.length);
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Ljy;Ljy;Ljy;B)V",
		garbageValue = "111"
	)
	public static void method2686(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		Widget.Widget_archive = var0;
		UserComparator3.Widget_modelsArchive = var1;
		SoundSystem.Widget_spritesArchive = var2;
		Login.Widget_fontsArchive = var3;
		Widget.Widget_interfaceComponents = new Widget[Widget.Widget_archive.getGroupCount()][];
		class100.Widget_loadedInterfaces = new boolean[Widget.Widget_archive.getGroupCount()];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILgw;[Lfy;B)V",
		garbageValue = "74"
	)
	static final void method2684(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.method6880();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.readUShortSmart();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					ObjectComposition var21 = ClanChannel.getObjectDefinition(var11);
					int var24 = var16 & 7;
					int var25 = var15 & 7;
					int var27 = var21.sizeX;
					int var28 = var21.sizeY;
					int var29;
					if ((var20 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var7 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var24;
					} else if (var26 == 1) {
						var23 = var25;
					} else if (var26 == 2) {
						var23 = 7 - var24 - (var27 - 1);
					} else {
						var23 = 7 - var25 - (var28 - 1);
					}

					var29 = var2 + var23;
					int var30 = var3 + WorldMapRegion.method3454(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
						int var31 = var1;
						if ((Tiles.Tiles_renderFlags[1][var29][var30] & 2) == 2) {
							var31 = var1 - 1;
						}

						CollisionMap var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}

						Client.method1382(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lag;Lag;IZI)I",
		garbageValue = "-1599131261"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1388() ? (var1.method1388() ? 0 : 1) : (var1.method1388() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1386() ? (var1.method1386() ? 0 : 1) : (var1.method1386() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}
}
