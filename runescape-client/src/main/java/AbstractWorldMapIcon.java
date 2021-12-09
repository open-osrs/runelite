import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("bl")
	static String field2761;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1375469525
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 973974995
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lju;Lju;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1255702565"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lhm;",
		garbageValue = "-577826789"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-21504"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1225820190"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-740062777"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1808683977"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1509429224"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = class78.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) { // L: 54
					break;
				}

				return false;
			case 1:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) { // L: 44
					return false;
				}
				break;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) { // L: 49
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) { // L: 61
					return false;
				}
				break;
			case 1:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) { // L: 66
					return false;
				}
				break;
			case 2:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) { // L: 71
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1210187925"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel(); // L: 79
		if (var3 == null) { // L: 80
			return false; // L: 81
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) { // L: 83
			return var2 >= this.screenY && var2 <= this.screenY + var3.height; // L: 84
		} else {
			return false; // L: 85
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "91"
	)
	public static boolean method4863(int var0) {
		return var0 >= WorldMapDecorationType.field3391.id && var0 <= WorldMapDecorationType.field3385.id || var0 == WorldMapDecorationType.field3406.id; // L: 43
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-356740041"
	)
	static final int method4862() {
		if (SecureRandomFuture.clientPreferences.roofsHidden) { // L: 5508
			return class20.Client_plane;
		} else {
			int var0 = 3; // L: 5509
			if (UserComparator7.cameraPitch < 310) { // L: 5510
				label169: {
					int var1;
					int var2;
					if (Client.oculusOrbState == 1) { // L: 5513
						var1 = class7.oculusOrbFocalPointX >> 7; // L: 5514
						var2 = Actor.oculusOrbFocalPointY >> 7; // L: 5515
					} else {
						var1 = class340.localPlayer.x >> 7; // L: 5518
						var2 = class340.localPlayer.y >> 7; // L: 5519
					}

					int var3 = UserComparator7.cameraX >> 7; // L: 5521
					int var4 = UserComparator10.cameraZ >> 7; // L: 5522
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 5523
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) { // L: 5524
							if ((Tiles.Tiles_renderFlags[class20.Client_plane][var3][var4] & 4) != 0) { // L: 5525
								var0 = class20.Client_plane;
							}

							int var5;
							if (var1 > var3) { // L: 5527
								var5 = var1 - var3;
							} else {
								var5 = var3 - var1; // L: 5528
							}

							int var6;
							if (var2 > var4) { // L: 5530
								var6 = var2 - var4;
							} else {
								var6 = var4 - var2; // L: 5531
							}

							int var7;
							int var8;
							if (var5 > var6) { // L: 5532
								var7 = var6 * 65536 / var5; // L: 5533
								var8 = 32768; // L: 5534

								while (true) {
									if (var3 == var1) { // L: 5535
										break label169;
									}

									if (var3 < var1) {
										++var3; // L: 5536
									} else if (var3 > var1) { // L: 5537
										--var3;
									}

									if ((Tiles.Tiles_renderFlags[class20.Client_plane][var3][var4] & 4) != 0) { // L: 5538
										var0 = class20.Client_plane;
									}

									var8 += var7; // L: 5539
									if (var8 >= 65536) { // L: 5540
										var8 -= 65536; // L: 5541
										if (var4 < var2) { // L: 5542
											++var4;
										} else if (var4 > var2) { // L: 5543
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[class20.Client_plane][var3][var4] & 4) != 0) { // L: 5544
											var0 = class20.Client_plane;
										}
									}
								}
							} else {
								if (var6 > 0) { // L: 5548
									var7 = var5 * 65536 / var6; // L: 5549
									var8 = 32768; // L: 5550

									while (var4 != var2) { // L: 5551
										if (var4 < var2) { // L: 5552
											++var4;
										} else if (var4 > var2) { // L: 5553
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[class20.Client_plane][var3][var4] & 4) != 0) { // L: 5554
											var0 = class20.Client_plane;
										}

										var8 += var7; // L: 5555
										if (var8 >= 65536) { // L: 5556
											var8 -= 65536; // L: 5557
											if (var3 < var1) { // L: 5558
												++var3;
											} else if (var3 > var1) { // L: 5559
												--var3;
											}

											if ((Tiles.Tiles_renderFlags[class20.Client_plane][var3][var4] & 4) != 0) { // L: 5560
												var0 = class20.Client_plane;
											}
										}
									}
								}
								break label169;
							}
						}

						return class20.Client_plane;
					}

					return class20.Client_plane;
				}
			}

			if (class340.localPlayer.x >= 0 && class340.localPlayer.y >= 0 && class340.localPlayer.x < 13312 && class340.localPlayer.y < 13312) { // L: 5565
				if ((Tiles.Tiles_renderFlags[class20.Client_plane][class340.localPlayer.x >> 7][class340.localPlayer.y >> 7] & 4) != 0) { // L: 5566
					var0 = class20.Client_plane;
				}

				return var0; // L: 5567
			} else {
				return class20.Client_plane;
			}
		}
	}
}
