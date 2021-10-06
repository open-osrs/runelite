import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = -1564481285
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = 692810023
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Loz;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("t")
	int[] field1177;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1281990765
	)
	int field1181;
	@ObfuscatedName("e")
	int[] field1190;
	@ObfuscatedName("i")
	int[] field1179;
	@ObfuscatedName("y")
	int[] field1180;
	@ObfuscatedName("w")
	int[] field1182;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -32130277
	)
	int field1183;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -464579847
	)
	int field1191;
	@ObfuscatedName("s")
	int[] field1175;
	@ObfuscatedName("c")
	int[] field1186;
	@ObfuscatedName("b")
	int[] field1187;
	@ObfuscatedName("x")
	int[] field1188;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1357468819
	)
	int field1189;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -12695433
	)
	int field1178;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -509899335
	)
	int field1176;

	@ObfuscatedSignature(
		descriptor = "([Loz;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1177 = new int[256];
		this.field1181 = 0;
		this.field1183 = 0;
		this.field1191 = 0;
		this.field1189 = 0;
		this.field1178 = 0;
		this.field1176 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1243250629"
	)
	@Export("initColors")
	void initColors() {
		this.field1179 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1179[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1179[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1179[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1179[var1 + 192] = 16777215;
		}

		this.field1180 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1180[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1180[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1180[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1180[var1 + 192] = 16777215;
		}

		this.field1182 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1182[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1182[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1182[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1182[var1 + 192] = 16777215;
		}

		this.field1190 = new int[256];
		this.field1189 = 0;
		this.field1187 = new int[32768];
		this.field1188 = new int[32768];
		this.method2193((IndexedSprite)null);
		this.field1175 = new int[32768];
		this.field1186 = new int[32768];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1823287172"
	)
	void method2164() {
		this.field1179 = null;
		this.field1180 = null;
		this.field1182 = null;
		this.field1190 = null;
		this.field1187 = null;
		this.field1188 = null;
		this.field1175 = null;
		this.field1186 = null;
		this.field1189 = 0;
		this.field1178 = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2074439873"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1175 == null) {
			this.initColors();
		}

		if (this.field1176 == 0) {
			this.field1176 = var2;
		}

		int var3 = var2 - this.field1176;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1176 = var2;
		if (var3 > 0) {
			this.method2180(var3);
		}

		this.method2168(var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "162428654"
	)
	final void method2180(int var1) {
		this.field1189 += 128 * var1;
		int var2;
		if (this.field1189 > this.field1187.length) {
			this.field1189 -= this.field1187.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2193(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1175[var3 + var2] - this.field1187[var2 + this.field1189 & this.field1187.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1175[var2++] = var6;
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
					this.field1175[var8 + var9] = 255;
				} else {
					this.field1175[var9 + var8] = 0;
				}
			}
		}

		if (this.field1183 > 0) {
			this.field1183 -= var1 * 4;
		}

		if (this.field1191 > 0) {
			this.field1191 -= var1 * 4;
		}

		if (this.field1183 == 0 && this.field1191 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1183 = 1024;
			}

			if (var7 == 1) {
				this.field1191 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1177[var7] = this.field1177[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1177[var7] = (int)(Math.sin((double)this.field1181 / 14.0D) * 16.0D + Math.sin((double)this.field1181 / 15.0D) * 14.0D + Math.sin((double)this.field1181 / 16.0D) * 12.0D);
			++this.field1181;
		}

		this.field1178 += var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1178 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1175[var12 + (var13 << 7)] = 192;
			}

			this.field1178 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1175[var14 + var13 + var7];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1175[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1186[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1186[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1186[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1175[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2100296375"
	)
	final int method2167(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) >> 8;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-20"
	)
	final void method2168(int var1) {
		int var2 = this.field1190.length;
		if (this.field1183 > 0) {
			this.method2169(this.field1183, this.field1180);
		} else if (this.field1191 > 0) {
			this.method2169(this.field1191, this.field1182);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1190[var3] = this.field1179[var3];
			}
		}

		this.method2170(var1);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "762418609"
	)
	final void method2169(int var1, int[] var2) {
		int var3 = this.field1190.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1190[var4] = this.method2167(this.field1179[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1190[var4] = var2[var4];
			} else {
				this.field1190[var4] = this.method2167(var2[var4], this.field1179[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1989037635"
	)
	final void method2170(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1177[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class244.rasterProvider.width) {
				var7 = class244.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class244.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1175[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1190[var10];
					int var14 = class244.rasterProvider.pixels[var8];
					class244.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Loz;I)V",
		garbageValue = "1396461999"
	)
	final void method2193(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1187.length; ++var2) {
			this.field1187[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1187[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1188[var5] = (this.field1187[var5 + 1] + this.field1187[var5 - 128] + this.field1187[var5 + 128] + this.field1187[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1187;
			this.field1187 = this.field1188;
			this.field1188 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1187[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Liz;Lpv;B)Lis;",
		garbageValue = "50"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = Tile.method4117();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "-38"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		class126.method2580(var0, var1, "openjs", var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	public static void method2175() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BII)I",
		garbageValue = "470169586"
	)
	public static int method2192(byte[] var0, int var1) {
		return IgnoreList.method5946(var0, 0, var1);
	}
}
