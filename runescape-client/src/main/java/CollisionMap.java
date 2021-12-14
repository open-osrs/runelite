import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("Widget_archive")
	static AbstractArchive Widget_archive;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -468449553
	)
	@Export("xInset")
	public int xInset;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1145848025
	)
	@Export("yInset")
	public int yInset;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -19746195
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -626517961
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("aj")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0;
		this.yInset = 0;
		this.xSize = var1;
		this.ySize = var2;
		this.flags = new int[this.xSize][this.ySize];
		this.clear();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1388482876"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) {
			for (int var2 = 0; var2 < this.ySize; ++var2) {
				if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
					this.flags[var1][var2] = 16777216;
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-785660455"
	)
	public void method3721(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 128);
				this.setFlag(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 2);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 8);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 32);
				this.setFlag(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 1);
				this.setFlag(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 4);
				this.setFlag(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 16);
				this.setFlag(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 64);
				this.setFlag(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 130);
				this.setFlag(var1 - 1, var2, 8);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 10);
				this.setFlag(var1, var2 + 1, 32);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 40);
				this.setFlag(var1 + 1, var2, 128);
				this.setFlag(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 160);
				this.setFlag(var1, var2 - 1, 2);
				this.setFlag(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 65536);
					this.setFlag(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 1024);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 4096);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 16384);
					this.setFlag(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 512);
					this.setFlag(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 2048);
					this.setFlag(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 8192);
					this.setFlag(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 32768);
					this.setFlag(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 66560);
					this.setFlag(var1 - 1, var2, 4096);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 5120);
					this.setFlag(var1, var2 + 1, 16384);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 20480);
					this.setFlag(var1 + 1, var2, 65536);
					this.setFlag(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 81920);
					this.setFlag(var1, var2 - 1, 1024);
					this.setFlag(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "517630840"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256;
		if (var5) {
			var6 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;

		for (int var7 = var1; var7 < var3 + var1; ++var7) {
			if (var7 >= 0 && var7 < this.xSize) {
				for (int var8 = var2; var8 < var2 + var4; ++var8) {
					if (var8 >= 0 && var8 < this.ySize) {
						this.setFlag(var7, var8, var6);
					}
				}
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "729918482"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 2097152;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-66"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 262144;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-262672320"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] |= var3;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "508874863"
	)
	public void method3693(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 128);
				this.setFlagOff(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 2);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 8);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 32);
				this.setFlagOff(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 1);
				this.setFlagOff(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 4);
				this.setFlagOff(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 16);
				this.setFlagOff(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 64);
				this.setFlagOff(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 130);
				this.setFlagOff(var1 - 1, var2, 8);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 10);
				this.setFlagOff(var1, var2 + 1, 32);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 40);
				this.setFlagOff(var1 + 1, var2, 128);
				this.setFlagOff(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 160);
				this.setFlagOff(var1, var2 - 1, 2);
				this.setFlagOff(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 65536);
					this.setFlagOff(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 1024);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 4096);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 16384);
					this.setFlagOff(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 512);
					this.setFlagOff(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 2048);
					this.setFlagOff(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 8192);
					this.setFlagOff(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 32768);
					this.setFlagOff(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 66560);
					this.setFlagOff(var1 - 1, var2, 4096);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 5120);
					this.setFlagOff(var1, var2 + 1, 16384);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 20480);
					this.setFlagOff(var1 + 1, var2, 65536);
					this.setFlagOff(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 81920);
					this.setFlagOff(var1, var2 - 1, 1024);
					this.setFlagOff(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)V",
		garbageValue = "8"
	)
	@Export("setFlagOffNonSquare")
	public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
		if (var6) {
			var7 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;
		int var8;
		if (var5 == 1 || var5 == 3) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < var3 + var1; ++var8) {
			if (var8 >= 0 && var8 < this.xSize) {
				for (int var9 = var2; var9 < var2 + var4; ++var9) {
					if (var9 >= 0 && var9 < this.ySize) {
						this.setFlagOff(var8, var9, var7);
					}
				}
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-313256425"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] &= ~var3;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1207646321"
	)
	public void method3701(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] &= -262145;
	}
}
