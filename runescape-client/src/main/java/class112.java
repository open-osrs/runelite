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
		field1361 = Math.ulp(1.0F); // L: 10
		field1362 = field1361 * 2.0F; // L: 11
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;IZI)Ldb;",
		garbageValue = "1707780051"
	)
	public static class120 method2571(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		byte[] var5 = var0.takeFile(var2 >> 16 & 65535, var2 & 65535); // L: 24
		if (var5 == null) {
			var4 = false;
			return null;
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0); // L: 32
			}

			if (var7 == null) { // L: 33
				var4 = false;
			}

			if (!var4) { // L: 34
				return null;
			} else {
				try {
					return new class120(var0, var1, var2, var3); // L: 36
				} catch (Exception var9) { // L: 38
					return null; // L: 39
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
		if (var2 == 0) { // L: 12
			return "";
		} else if (var2 == 1) { // L: 13
			CharSequence var10 = var0[var1]; // L: 14
			return var10 == null ? "null" : var10.toString(); // L: 15 16
		} else {
			int var3 = var2 + var1; // L: 18
			int var4 = 0; // L: 19

			for (int var5 = var1; var5 < var3; ++var5) { // L: 20
				CharSequence var9 = var0[var5]; // L: 21
				if (var9 == null) { // L: 22
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 23
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 25

			for (int var6 = var1; var6 < var3; ++var6) { // L: 26
				CharSequence var7 = var0[var6]; // L: 27
				if (var7 == null) { // L: 28
					var8.append("null");
				} else {
					var8.append(var7); // L: 29
				}
			}

			return var8.toString(); // L: 31
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "1143513856"
	)
	static int method2560(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 429
			return class273.method5332(var0, var1, var2);
		} else if (var0 < 1100) { // L: 430
			return class279.method5405(var0, var1, var2);
		} else if (var0 < 1200) { // L: 431
			return class143.method2959(var0, var1, var2);
		} else if (var0 < 1300) { // L: 432
			return Canvas.method404(var0, var1, var2);
		} else if (var0 < 1400) { // L: 433
			return class120.method2724(var0, var1, var2);
		} else if (var0 < 1500) { // L: 434
			return WorldMapID.method4804(var0, var1, var2);
		} else if (var0 < 1600) { // L: 435
			return NetFileRequest.method5588(var0, var1, var2);
		} else if (var0 < 1700) { // L: 436
			return BufferedSink.method6551(var0, var1, var2);
		} else if (var0 < 1800) { // L: 437
			return class6.method56(var0, var1, var2);
		} else if (var0 < 1900) { // L: 438
			return class148.method3019(var0, var1, var2);
		} else if (var0 < 2000) { // L: 439
			return Strings.method5510(var0, var1, var2);
		} else if (var0 < 2100) { // L: 440
			return class279.method5405(var0, var1, var2);
		} else if (var0 < 2200) { // L: 441
			return class143.method2959(var0, var1, var2);
		} else if (var0 < 2300) { // L: 442
			return Canvas.method404(var0, var1, var2);
		} else if (var0 < 2400) { // L: 443
			return class120.method2724(var0, var1, var2);
		} else if (var0 < 2500) { // L: 444
			return WorldMapID.method4804(var0, var1, var2);
		} else if (var0 < 2600) { // L: 445
			return class4.method20(var0, var1, var2);
		} else if (var0 < 2700) { // L: 446
			return UrlRequester.method2486(var0, var1, var2);
		} else if (var0 < 2800) { // L: 447
			return Projectile.method2010(var0, var1, var2);
		} else if (var0 < 2900) { // L: 448
			return class11.method125(var0, var1, var2);
		} else if (var0 < 3000) { // L: 449
			return Strings.method5510(var0, var1, var2);
		} else if (var0 < 3200) { // L: 450
			return ArchiveLoader.method2122(var0, var1, var2);
		} else if (var0 < 3300) { // L: 451
			return ParamComposition.method3397(var0, var1, var2);
		} else if (var0 < 3400) { // L: 452
			return class12.method190(var0, var1, var2);
		} else if (var0 < 3500) { // L: 453
			return ReflectionCheck.method663(var0, var1, var2);
		} else if (var0 < 3600) { // L: 454
			return class13.method201(var0, var1, var2);
		} else if (var0 < 3700) { // L: 455
			return SequenceDefinition.method3640(var0, var1, var2);
		} else if (var0 < 3800) { // L: 456
			return class167.method3269(var0, var1, var2);
		} else if (var0 < 3900) { // L: 457
			return class332.method6184(var0, var1, var2);
		} else if (var0 < 4000) { // L: 458
			return class28.method443(var0, var1, var2);
		} else if (var0 < 4100) {
			return class341.method6258(var0, var1, var2); // L: 459
		} else if (var0 < 4200) { // L: 460
			return StudioGame.method5500(var0, var1, var2);
		} else if (var0 < 4300) { // L: 461
			return TriBool.method6472(var0, var1, var2);
		} else if (var0 < 5100) { // L: 462
			return class167.method3270(var0, var1, var2);
		} else if (var0 < 5400) { // L: 463
			return class134.method2824(var0, var1, var2);
		} else if (var0 < 5600) { // L: 464
			return class141.method2950(var0, var1, var2);
		} else if (var0 < 5700) { // L: 465
			return WorldMapSectionType.method4756(var0, var1, var2);
		} else if (var0 < 6300) { // L: 466
			return Canvas.method405(var0, var1, var2);
		} else if (var0 < 6600) { // L: 467
			return ApproximateRouteStrategy.method1139(var0, var1, var2);
		} else if (var0 < 6700) { // L: 468
			return GameEngine.method581(var0, var1, var2);
		} else if (var0 < 6800) { // L: 469
			return GameObject.method4341(var0, var1, var2);
		} else if (var0 < 6900) { // L: 470
			return Client.method1667(var0, var1, var2);
		} else if (var0 < 7000) { // L: 471
			return class312.method5810(var0, var1, var2);
		} else if (var0 < 7100) { // L: 472
			return class4.method27(var0, var1, var2);
		} else if (var0 < 7200) { // L: 473
			return WorldMapLabelSize.method4359(var0, var1, var2);
		} else if (var0 < 7300) { // L: 474
			return ArchiveLoader.method2120(var0, var1, var2);
		} else {
			return var0 < 7500 ? KitDefinition.method3237(var0, var1, var2) : 2; // L: 475 476
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1450996658"
	)
	static final void method2572(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 79
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 80
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 81
					SoundCache.field321[0][var5][var4] = 127; // L: 82
					if (var0 == var5 && var5 > 0) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 90
}
