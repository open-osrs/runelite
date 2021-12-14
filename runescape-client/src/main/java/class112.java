import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class112 {
	@ObfuscatedName("m")
	public static final float field1361;
	@ObfuscatedName("t")
	public static final float field1362;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Lpa;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;

	static {
		field1361 = Math.ulp(1.0F);
		field1362 = field1361 * 2.0F;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;IZI)Ldb;",
		garbageValue = "1707780051"
	)
	public static class120 method2571(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		byte[] var5 = var0.takeFile(var2 >> 16 & 65535, var2 & 65535);
		if (var5 == null) {
			var4 = false;
			return null;
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0);
			}

			if (var7 == null) {
				var4 = false;
			}

			if (!var4) {
				return null;
			} else {
				try {
					return new class120(var0, var1, var2, var3);
				} catch (Exception var9) {
					return null;
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-1374699895"
	)
	public static String method2565(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "1143513856"
	)
	static int method2560(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class273.method5332(var0, var1, var2);
		} else if (var0 < 1100) {
			return class279.method5405(var0, var1, var2);
		} else if (var0 < 1200) {
			return class143.method2959(var0, var1, var2);
		} else if (var0 < 1300) {
			return Canvas.method404(var0, var1, var2);
		} else if (var0 < 1400) {
			return class120.method2724(var0, var1, var2);
		} else if (var0 < 1500) {
			return WorldMapID.method4804(var0, var1, var2);
		} else if (var0 < 1600) {
			return NetFileRequest.method5588(var0, var1, var2);
		} else if (var0 < 1700) {
			return BufferedSink.method6551(var0, var1, var2);
		} else if (var0 < 1800) {
			return class6.method56(var0, var1, var2);
		} else if (var0 < 1900) {
			return class148.method3019(var0, var1, var2);
		} else if (var0 < 2000) {
			return Strings.method5510(var0, var1, var2);
		} else if (var0 < 2100) {
			return class279.method5405(var0, var1, var2);
		} else if (var0 < 2200) {
			return class143.method2959(var0, var1, var2);
		} else if (var0 < 2300) {
			return Canvas.method404(var0, var1, var2);
		} else if (var0 < 2400) {
			return class120.method2724(var0, var1, var2);
		} else if (var0 < 2500) {
			return WorldMapID.method4804(var0, var1, var2);
		} else if (var0 < 2600) {
			return class4.method20(var0, var1, var2);
		} else if (var0 < 2700) {
			return UrlRequester.method2486(var0, var1, var2);
		} else if (var0 < 2800) {
			return Projectile.method2010(var0, var1, var2);
		} else if (var0 < 2900) {
			return class11.method125(var0, var1, var2);
		} else if (var0 < 3000) {
			return Strings.method5510(var0, var1, var2);
		} else if (var0 < 3200) {
			return ArchiveLoader.method2122(var0, var1, var2);
		} else if (var0 < 3300) {
			return ParamComposition.method3397(var0, var1, var2);
		} else if (var0 < 3400) {
			return class12.method190(var0, var1, var2);
		} else if (var0 < 3500) {
			return ReflectionCheck.method663(var0, var1, var2);
		} else if (var0 < 3600) {
			return class13.method201(var0, var1, var2);
		} else if (var0 < 3700) {
			return SequenceDefinition.method3640(var0, var1, var2);
		} else if (var0 < 3800) {
			return class167.method3269(var0, var1, var2);
		} else if (var0 < 3900) {
			return class332.method6184(var0, var1, var2);
		} else if (var0 < 4000) {
			return class28.method443(var0, var1, var2);
		} else if (var0 < 4100) {
			return class341.method6258(var0, var1, var2);
		} else if (var0 < 4200) {
			return StudioGame.method5500(var0, var1, var2);
		} else if (var0 < 4300) {
			return TriBool.method6472(var0, var1, var2);
		} else if (var0 < 5100) {
			return class167.method3270(var0, var1, var2);
		} else if (var0 < 5400) {
			return class134.method2824(var0, var1, var2);
		} else if (var0 < 5600) {
			return class141.method2950(var0, var1, var2);
		} else if (var0 < 5700) {
			return WorldMapSectionType.method4756(var0, var1, var2);
		} else if (var0 < 6300) {
			return Canvas.method405(var0, var1, var2);
		} else if (var0 < 6600) {
			return ApproximateRouteStrategy.method1139(var0, var1, var2);
		} else if (var0 < 6700) {
			return GameEngine.method581(var0, var1, var2);
		} else if (var0 < 6800) {
			return GameObject.method4341(var0, var1, var2);
		} else if (var0 < 6900) {
			return Client.method1667(var0, var1, var2);
		} else if (var0 < 7000) {
			return class312.method5810(var0, var1, var2);
		} else if (var0 < 7100) {
			return class4.method27(var0, var1, var2);
		} else if (var0 < 7200) {
			return WorldMapLabelSize.method4359(var0, var1, var2);
		} else if (var0 < 7300) {
			return ArchiveLoader.method2120(var0, var1, var2);
		} else {
			return var0 < 7500 ? KitDefinition.method3237(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1450996658"
	)
	static final void method2572(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					SoundCache.field321[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}
}
