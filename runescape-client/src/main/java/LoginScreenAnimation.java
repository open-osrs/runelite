import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cw")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -1226274359
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Llh;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("n")
	int[] field1075;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1093888655
	)
	int field1070;
	@ObfuscatedName("a")
	int[] field1062;
	@ObfuscatedName("z")
	int[] field1063;
	@ObfuscatedName("w")
	int[] field1061;
	@ObfuscatedName("y")
	int[] field1065;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1116180601
	)
	int field1066;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2041048793
	)
	int field1064;
	@ObfuscatedName("k")
	int[] field1056;
	@ObfuscatedName("r")
	int[] field1069;
	@ObfuscatedName("s")
	int[] field1067;
	@ObfuscatedName("v")
	int[] field1071;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1998997321
	)
	int field1068;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2027294175
	)
	int field1073;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1633825307
	)
	int field1074;

	@ObfuscatedSignature(
		descriptor = "([Llh;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1075 = new int[256];
		this.field1070 = 0;
		this.field1066 = 0;
		this.field1064 = 0;
		this.field1068 = 0;
		this.field1073 = 0;
		this.field1074 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-16"
	)
	@Export("initColors")
	void initColors() {
		this.field1063 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1063[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1063[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1063[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1063[var1 + 192] = 16777215;
		}

		this.field1061 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1061[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1061[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1061[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1061[var1 + 192] = 16777215;
		}

		this.field1065 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1065[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1065[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1065[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1065[var1 + 192] = 16777215;
		}

		this.field1062 = new int[256];
		this.field1068 = 0;
		this.field1067 = new int[32768];
		this.field1071 = new int[32768];
		this.method1885((IndexedSprite)null);
		this.field1056 = new int[32768];
		this.field1069 = new int[32768];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2116735890"
	)
	void method1878() {
		this.field1063 = null;
		this.field1061 = null;
		this.field1065 = null;
		this.field1062 = null;
		this.field1067 = null;
		this.field1071 = null;
		this.field1056 = null;
		this.field1069 = null;
		this.field1068 = 0;
		this.field1073 = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1329214185"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1056 == null) {
			this.initColors();
		}

		if (this.field1074 == 0) {
			this.field1074 = var2;
		}

		int var3 = var2 - this.field1074;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1074 = var2;
		if (var3 > 0) {
			this.method1880(var3);
		}

		this.method1882(var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-305399146"
	)
	final void method1880(int var1) {
		this.field1068 += 128 * var1;
		int var2;
		if (this.field1068 > this.field1067.length) {
			this.field1068 -= this.field1067.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method1885(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1056[var3 + var2] - this.field1067[var2 + this.field1068 & this.field1067.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1056[var2++] = var6;
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
					this.field1056[var8 + var9] = 255;
				} else {
					this.field1056[var9 + var8] = 0;
				}
			}
		}

		if (this.field1066 > 0) {
			this.field1066 -= var1 * 4;
		}

		if (this.field1064 > 0) {
			this.field1064 -= var1 * 4;
		}

		if (this.field1066 == 0 && this.field1064 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1066 = 1024;
			}

			if (var7 == 1) {
				this.field1064 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1075[var7] = this.field1075[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1075[var7] = (int)(Math.sin((double)this.field1070 / 14.0D) * 16.0D + Math.sin((double)this.field1070 / 15.0D) * 14.0D + Math.sin((double)this.field1070 / 16.0D) * 12.0D);
			++this.field1070;
		}

		this.field1073 += var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1073 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1056[var12 + (var13 << 7)] = 192;
			}

			this.field1073 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1056[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1056[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1069[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1069[var7 * 128 + var14 + var11];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1069[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1056[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "353428721"
	)
	final int method1891(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "40685678"
	)
	final void method1882(int var1) {
		int var2 = this.field1062.length;
		if (this.field1066 > 0) {
			this.method1886(this.field1066, this.field1061);
		} else if (this.field1064 > 0) {
			this.method1886(this.field1064, this.field1065);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1062[var3] = this.field1063[var3];
			}
		}

		this.method1884(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "41"
	)
	final void method1886(int var1, int[] var2) {
		int var3 = this.field1062.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1062[var4] = this.method1891(this.field1063[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1062[var4] = var2[var4];
			} else {
				this.field1062[var4] = this.method1891(var2[var4], this.field1063[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "15252473"
	)
	final void method1884(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1075[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= ArchiveLoader.rasterProvider.width) {
				var7 = ArchiveLoader.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * ArchiveLoader.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1056[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1062[var10];
					int var14 = ArchiveLoader.rasterProvider.pixels[var8];
					ArchiveLoader.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)V",
		garbageValue = "-760749522"
	)
	final void method1885(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1067.length; ++var2) {
			this.field1067[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1067[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1071[var5] = (this.field1067[var5 + 128] + this.field1067[var5 - 128] + this.field1067[var5 + 1] + this.field1067[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1067;
			this.field1067 = this.field1071;
			this.field1071 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1067[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lfz;I)V",
		garbageValue = "66216788"
	)
	static final void method1879(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) {
			for (var10 = 0; var10 < 8; ++var10) {
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var10 + var3] &= -16777217;
				}
			}
		}

		Buffer var21 = new Buffer(var0);

		for (var10 = 0; var10 < 4; ++var10) {
			for (int var11 = 0; var11 < 64; ++var11) {
				for (int var12 = 0; var12 < 64; ++var12) {
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) {
						int var15 = var2 + TilePaint.method3187(var11 & 7, var12 & 7, var7);
						int var18 = var11 & 7;
						int var19 = var12 & 7;
						int var20 = var7 & 3;
						int var17;
						if (var20 == 0) {
							var17 = var19;
						} else if (var20 == 1) {
							var17 = 7 - var18;
						} else if (var20 == 2) {
							var17 = 7 - var19;
						} else {
							var17 = var18;
						}

						AbstractArchive.loadTerrain(var21, var1, var15, var17 + var3, 0, 0, var7);
					} else {
						AbstractArchive.loadTerrain(var21, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-83"
	)
	static void method1908(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-49"
	)
	static void method1906() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-1332294124"
	)
	static int method1883(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = WorldMapSection3.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var3;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var3 = FontName.worldListStart();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var3 = class3.getNextWorldListWorld();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				World var4;
				int var5;
				int var7;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					var4 = null;

					for (var5 = 0; var5 < World.World_count; ++var5) {
						if (var7 == class13.World_worlds[var5].id) {
							var4 = class13.World_worlds[var5];
							break;
						}
					}

					if (var4 != null) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					UrlRequester.Interpreter_intStackSize -= 4;
					var7 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1] == 1;
					var5 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 3] == 1;
					WorldMapSection1.sortWorldList(var7, var10, var5, var6);
					return 1;
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var8;
						ParamDefinition var9;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							UrlRequester.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
							var9 = VarbitDefinition.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = StudioGame.getNpcDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = StudioGame.getNpcDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							UrlRequester.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
							var9 = VarbitDefinition.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = Canvas.getObjectDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Canvas.getObjectDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							UrlRequester.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
							var9 = VarbitDefinition.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = KitDefinition.ItemDefinition_get(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = KitDefinition.ItemDefinition_get(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							UrlRequester.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
							var9 = VarbitDefinition.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = class224.StructDefinition_getStructDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = class224.StructDefinition_getStructDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.clientType & 3;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--WorldMapEvent.Interpreter_stringStackSize;
							--UrlRequester.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--WorldMapEvent.Interpreter_stringStackSize;
							--UrlRequester.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					if (var7 >= 0 && var7 < World.World_count) {
						var4 = class13.World_worlds[var7];
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
