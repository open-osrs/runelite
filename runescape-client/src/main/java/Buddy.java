import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 746026781
	)
	@Export("world")
	public int world;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2013337995
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1889859317
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-820539853"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1724193250"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-279238296"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "562871414"
	)
	static int method5363(int var0, int var1) {
		FloorOverlayDefinition var3 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		FloorOverlayDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var3 = new FloorOverlayDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4), var0);
			}

			var3.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		if (var2 == null) {
			return var1;
		} else if (var2.secondaryRgb >= 0) {
			return var2.secondaryRgb | -16777216;
		} else {
			int var5;
			byte var6;
			int var8;
			int var9;
			if (var2.texture >= 0) {
				var5 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				var6 = 96;
				if (var5 == -2) {
					var8 = 12345678;
				} else if (var5 == -1) {
					if (var6 < 0) {
						var6 = 0;
					} else if (var6 > 127) {
						var6 = 127;
					}

					var9 = 127 - var6;
					var8 = var9;
				} else {
					var9 = var6 * (var5 & 127) / 128;
					if (var9 < 2) {
						var9 = 2;
					} else if (var9 > 126) {
						var9 = 126;
					}

					var8 = var9 + (var5 & 65408);
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var8 = Players.method2285(var2.hue, var2.saturation, var2.lightness);
				var6 = 96;
				if (var8 == -2) {
					var5 = 12345678;
				} else if (var8 == -1) {
					if (var6 < 0) {
						var6 = 0;
					} else if (var6 > 127) {
						var6 = 127;
					}

					var9 = 127 - var6;
					var5 = var9;
				} else {
					var9 = var6 * (var8 & 127) / 128;
					if (var9 < 2) {
						var9 = 2;
					} else if (var9 > 126) {
						var9 = 126;
					}

					var5 = var9 + (var8 & 65408);
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var5] | -16777216;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lic;III)Llh;",
		garbageValue = "214880487"
	)
	static IndexedSprite method5355(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class3.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : AttackOption.method2173();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "1714"
	)
	static void method5349(int var0) {
		Login.loginIndex = 12;
		Login.field1212 = var0;
	}
}
