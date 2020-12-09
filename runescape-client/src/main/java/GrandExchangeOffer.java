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
	}

	@ObfuscatedSignature(
		descriptor = "(Lkj;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
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
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1068160748"
	)
	void method171(int var1) {
		this.state &= -8;
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
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "32"
	)
	static int method186(int var0, int var1) {
		FloorOverlayDefinition var2 = RouteStrategy.method3648(var0);
		if (var2 == null) {
			return var1;
		} else if (var2.secondaryRgb >= 0) {
			return var2.secondaryRgb | -16777216;
		} else {
			int var4;
			int var5;
			if (var2.texture >= 0) {
				var4 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				byte var11 = 96;
				int var3;
				if (var4 == -2) {
					var3 = 12345678;
				} else if (var4 == -1) {
					if (var11 < 0) {
						var11 = 0;
					} else if (var11 > 127) {
						var11 = 127;
					}

					var5 = 127 - var11;
					var3 = var5;
				} else {
					var5 = var11 * (var4 & 127) / 128;
					if (var5 < 2) {
						var5 = 2;
					} else if (var5 > 126) {
						var5 = 126;
					}

					var3 = var5 + (var4 & 65408);
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var4 = var2.hue;
				var5 = var2.saturation;
				int var6 = var2.lightness;
				if (var6 > 179) {
					var5 /= 2;
				}

				if (var6 > 192) {
					var5 /= 2;
				}

				if (var6 > 217) {
					var5 /= 2;
				}

				if (var6 > 243) {
					var5 /= 2;
				}

				int var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
				byte var9 = 96;
				int var8;
				if (var7 == -2) {
					var8 = 12345678;
				} else {
					int var12;
					if (var7 == -1) {
						if (var9 < 0) {
							var9 = 0;
						} else if (var9 > 127) {
							var9 = 127;
						}

						var12 = 127 - var9;
						var8 = var12;
					} else {
						var12 = var9 * (var7 & 127) / 128;
						if (var12 < 2) {
							var12 = 2;
						} else if (var12 > 126) {
							var12 = 126;
						}

						var8 = var12 + (var7 & 65408);
					}
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-2034592352"
	)
	public static byte[] method188(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])((byte[])var0);
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "296728880"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = WorldMapRegion.getPreferencesFile("", AttackOption.field1174.name, true);
			Buffer var1 = Timer.clientPreferences.toBuffer();
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "66"
	)
	static final int method190(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-18578608"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = SecureRandomFuture.getTileHeight(var0, var1, GameObject.Client_plane) - var2;
			var0 -= Player.cameraX;
			var3 -= KeyHandler.cameraY;
			var1 -= class69.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[Skeleton.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[Skeleton.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[AbstractArchive.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[AbstractArchive.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var3 * var4 + var5 * var1 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
