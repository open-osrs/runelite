import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Llo;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("n")
	int[] field1033;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1976548071
	)
	int field1034;
	@ObfuscatedName("l")
	int[] field1035;
	@ObfuscatedName("z")
	int[] field1036;
	@ObfuscatedName("u")
	int[] field1037;
	@ObfuscatedName("e")
	int[] field1028;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1475345785
	)
	int field1040;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -432017653
	)
	int field1047;
	@ObfuscatedName("i")
	int[] field1041;
	@ObfuscatedName("f")
	int[] field1042;
	@ObfuscatedName("a")
	int[] field1043;
	@ObfuscatedName("b")
	int[] field1044;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 543060497
	)
	int field1045;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -4471472
	)
	int field1046;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2113799519
	)
	int field1032;

	@ObfuscatedSignature(
		descriptor = "([Llo;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1033 = new int[256];
		this.field1034 = 0;
		this.field1040 = 0;
		this.field1047 = 0;
		this.field1045 = 0;
		this.field1046 = 0;
		this.field1032 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1184453059"
	)
	@Export("initColors")
	void initColors() {
		this.field1036 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1036[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1036[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1036[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1036[var1 + 192] = 16777215;
		}

		this.field1037 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1037[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1037[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1037[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1037[var1 + 192] = 16777215;
		}

		this.field1028 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1028[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1028[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1028[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1028[var1 + 192] = 16777215;
		}

		this.field1035 = new int[256];
		this.field1045 = 0;
		this.field1043 = new int[32768];
		this.field1044 = new int[32768];
		this.method1901((IndexedSprite)null);
		this.field1041 = new int[32768];
		this.field1042 = new int[32768];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1726461364"
	)
	void method1877() {
		this.field1036 = null;
		this.field1037 = null;
		this.field1028 = null;
		this.field1035 = null;
		this.field1043 = null;
		this.field1044 = null;
		this.field1041 = null;
		this.field1042 = null;
		this.field1045 = 0;
		this.field1046 = 0;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-387686576"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1041 == null) {
			this.initColors();
		}

		if (this.field1032 == 0) {
			this.field1032 = var2;
		}

		int var3 = var2 - this.field1032;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1032 = var2;
		if (var3 > 0) {
			this.method1879(var3);
		}

		this.method1881(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1542043970"
	)
	final void method1879(int var1) {
		this.field1045 += var1 * 128;
		int var2;
		if (this.field1045 > this.field1043.length) {
			this.field1045 -= this.field1043.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method1901(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1041[var2 + var3] - this.field1043[var2 + this.field1045 & this.field1043.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1041[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D);
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1041[var9 + var8] = 255;
				} else {
					this.field1041[var9 + var8] = 0;
				}
			}
		}

		if (this.field1040 * 16 > 0) {
			this.field1040 = this.field1040 * 16 - var1 * 4;
		}

		if (this.field1047 * 16 > 0) {
			this.field1047 = this.field1047 * 16 - var1 * 4;
		}

		if (this.field1040 * 16 == 0 && this.field1047 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1040 = 1024;
			}

			if (var7 == 1) {
				this.field1047 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1033[var7] = this.field1033[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1033[var7] = (int)(Math.sin((double)this.field1034 / 14.0D) * 16.0D + Math.sin((double)this.field1034 / 15.0D) * 14.0D + Math.sin((double)this.field1034 / 16.0D) * 12.0D);
			++this.field1034;
		}

		this.field1046 = this.field1046 * 10000 + 10000 * var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1046 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1041[var12 + (var13 << 7)] = 192;
			}

			this.field1046 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1041[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1041[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1042[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1042[var14 + var11 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1042[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1041[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "27"
	)
	final int method1880(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) >> 8;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "19"
	)
	final void method1881(int var1) {
		int var2 = this.field1035.length;
		if (this.field1040 * 16 > 0) {
			this.method1905(this.field1040 * 16, this.field1037);
		} else if (this.field1047 * 16 > 0) {
			this.method1905(this.field1047 * 16, this.field1028);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1035[var3] = this.field1036[var3];
			}
		}

		this.method1902(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "60"
	)
	final void method1905(int var1, int[] var2) {
		int var3 = this.field1035.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1035[var4] = this.method1880(this.field1036[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1035[var4] = var2[var4];
			} else {
				this.field1035[var4] = this.method1880(var2[var4], this.field1036[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1090951606"
	)
	final void method1902(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1033[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= WorldMapIcon_0.rasterProvider.width) {
				var7 = WorldMapIcon_0.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * WorldMapIcon_0.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1041[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1035[var10];
					int var14 = WorldMapIcon_0.rasterProvider.pixels[var8];
					WorldMapIcon_0.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Llo;I)V",
		garbageValue = "1524084760"
	)
	final void method1901(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1043.length; ++var2) {
			this.field1043[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1043[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1044[var5] = (this.field1043[var5 - 128] + this.field1043[var5 + 1] + this.field1043[var5 + 128] + this.field1043[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1043;
			this.field1043 = this.field1044;
			this.field1044 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1043[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lix;",
		garbageValue = "-1374757475"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-124"
	)
	public static int method1904(int var0) {
		return ClientPacket.method3671(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1359894700"
	)
	static final void method1903() {
		if (Client.logoutTimer > 0) {
			WorldMapRectangle.logOut();
		} else {
			Client.timer.method5018();
			WorldMapCacheName.updateGameState(40);
			InterfaceParent.field562 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
