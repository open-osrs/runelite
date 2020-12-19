import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("h")
	@Export("state")
	byte state;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -618339927
	)
	@Export("id")
	public int id;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1523390759
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1138679983
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1993349835
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 484564731
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lkj;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt(); // L: 18
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-9146614"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1433662389"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1068160748"
	)
	void method171(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1708580418"
	)
	void method176(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "32"
	)
	static int method186(int var0, int var1) {
		FloorOverlayDefinition var2 = RouteStrategy.method3648(var0);
		if (var2 == null) {
			return var1; // L: 17
		} else if (var2.secondaryRgb >= 0) {
			return var2.secondaryRgb | -16777216; // L: 20
		} else {
			int var4;
			int var5;
			if (var2.texture >= 0) { // L: 22
				var4 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				byte var11 = 96;
				int var3;
				if (var4 == -2) {
					var3 = 12345678; // L: 28
				} else if (var4 == -1) { // L: 31
					if (var11 < 0) { // L: 32
						var11 = 0; // L: 33
					} else if (var11 > 127) { // L: 35
						var11 = 127; // L: 36
					}

					var5 = 127 - var11; // L: 38
					var3 = var5; // L: 39
				} else {
					var5 = var11 * (var4 & 127) / 128; // L: 42
					if (var5 < 2) { // L: 43
						var5 = 2;
					} else if (var5 > 126) { // L: 44
						var5 = 126;
					}

					var3 = var5 + (var4 & 65408); // L: 45
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216; // L: 48
			} else if (var2.primaryRgb == 16711935) { // L: 50
				return var1; // L: 51
			} else {
				var4 = var2.hue; // L: 55
				var5 = var2.saturation; // L: 56
				int var6 = var2.lightness; // L: 57
				if (var6 > 179) { // L: 59
					var5 /= 2;
				}

				if (var6 > 192) { // L: 60
					var5 /= 2;
				}

				if (var6 > 217) { // L: 61
					var5 /= 2;
				}

				if (var6 > 243) { // L: 62
					var5 /= 2;
				}

				int var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10); // L: 63
				byte var9 = 96; // L: 68
				int var8;
				if (var7 == -2) { // L: 70
					var8 = 12345678; // L: 71
				} else {
					int var12;
					if (var7 == -1) { // L: 74
						if (var9 < 0) { // L: 75
							var9 = 0; // L: 76
						} else if (var9 > 127) { // L: 78
							var9 = 127; // L: 79
						}

						var12 = 127 - var9; // L: 81
						var8 = var12; // L: 82
					} else {
						var12 = var9 * (var7 & 127) / 128; // L: 85
						if (var12 < 2) { // L: 86
							var12 = 2;
						} else if (var12 > 126) { // L: 87
							var12 = 126;
						}

						var8 = var12 + (var7 & 65408); // L: 88
					}
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216; // L: 91
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-2034592352"
	)
	public static byte[] method188(Object var0, boolean var1) {
		if (var0 == null) { // L: 8
			return null;
		} else if (var0 instanceof byte[]) { // L: 9
			byte[] var6 = (byte[])((byte[])var0); // L: 10
			if (var1) { // L: 11
				int var4 = var6.length; // L: 14
				byte[] var5 = new byte[var4]; // L: 15
				System.arraycopy(var6, 0, var5, 0, var4); // L: 16
				return var5; // L: 19
			} else {
				return var6; // L: 21
			}
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 23
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 24
			return var2.get(); // L: 25
		} else {
			throw new IllegalArgumentException(); // L: 27
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "296728880"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 95

		try {
			var0 = WorldMapRegion.getPreferencesFile("", AttackOption.field1174.name, true); // L: 97
			Buffer var1 = Timer.clientPreferences.toBuffer(); // L: 98
			var0.write(var1.array, 0, var1.offset); // L: 99
		} catch (Exception var3) { // L: 101
		}

		try {
			if (var0 != null) { // L: 103
				var0.closeSync(true); // L: 104
			}
		} catch (Exception var2) { // L: 107
		}

	} // L: 108

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "66"
	)
	static final int method190(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 855
		var2 ^= var2 << 13; // L: 856
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 857
		return var3 >> 19 & 255; // L: 858
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-18578608"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5244
			int var3 = SecureRandomFuture.getTileHeight(var0, var1, GameObject.Client_plane) - var2; // L: 5249
			var0 -= Player.cameraX; // L: 5250
			var3 -= KeyHandler.cameraY; // L: 5251
			var1 -= class69.cameraZ; // L: 5252
			int var4 = Rasterizer3D.Rasterizer3D_sine[Skeleton.cameraPitch]; // L: 5253
			int var5 = Rasterizer3D.Rasterizer3D_cosine[Skeleton.cameraPitch]; // L: 5254
			int var6 = Rasterizer3D.Rasterizer3D_sine[AbstractArchive.cameraYaw]; // L: 5255
			int var7 = Rasterizer3D.Rasterizer3D_cosine[AbstractArchive.cameraYaw]; // L: 5256
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5257
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5258
			var0 = var8; // L: 5259
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5260
			var1 = var3 * var4 + var5 * var1 >> 16; // L: 5261
			if (var1 >= 50) { // L: 5263
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5264
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1; // L: 5265
			} else {
				Client.viewportTempX = -1; // L: 5268
				Client.viewportTempY = -1; // L: 5269
			}

		} else {
			Client.viewportTempX = -1; // L: 5245
			Client.viewportTempY = -1; // L: 5246
		}
	} // L: 5247 5271
}
