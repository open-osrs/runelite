import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 209733467
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1210066833
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("k")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var4 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var4 = var2;
				var5 = var1;
			}

			while (var5 != 0) {
				int var6 = var4 % var5;
				var4 = var5;
				var5 = var6;
			}

			var1 /= var4;
			var2 /= var4;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var7 = 0; var7 < var1; ++var7) {
				int[] var8 = this.table[var7];
				double var9 = (double)var7 / (double)var1 + 6.0D;
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D));
				if (var11 < 0) {
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D);
				if (var12 > 14) {
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
					double var15 = ((double)var11 - var9) * 3.141592653589793D;
					double var17 = var13;
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(((double)var11 - var9) * 0.2243994752564138D);
					var8[var11] = (int)Math.floor(65536.0D * var17 + 0.5D);
				}
			}

		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "-52"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var9 + var4] += var8[var9] * var7;
				}

				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "835574685"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "6"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lbc;Lbc;IZIZI)I",
		garbageValue = "1027479972"
	)
	static int method1024(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = VerticalAlignment.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = VerticalAlignment.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lay;I)V",
		garbageValue = "1657277023"
	)
	static void method1014(GameEngine var0) {
		while (CollisionMap.isKeyDown()) {
			if (class4.field13 == 13) {
				Renderable.method4391();
				return;
			}

			if (class4.field13 == 96) {
				if (Login.worldSelectPage > 0 && WorldMapCacheName.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (class4.field13 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && ByteArrayPool.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !VarbitComposition.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var1 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class19.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class19.changeWorldSelectSorting(0, 1);
				return;
			}

			int var2 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class19.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class19.changeWorldSelectSorting(1, 1);
				return;
			}

			int var3 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class19.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class19.changeWorldSelectSorting(2, 1);
				return;
			}

			int var4 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class19.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class19.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				Renderable.method4391();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var5 = class386.World_worlds[Login.hoveredWorldIndex];
				World.changeWorld(var5);
				Renderable.method4391();
				return;
			}

			if (Login.worldSelectPage > 0 && WorldMapCacheName.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= WorldMapCacheName.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= MouseRecorder.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= MouseRecorder.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && ByteArrayPool.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= Huffman.canvasWidth - ByteArrayPool.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= Huffman.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= MouseRecorder.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= MouseRecorder.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "572846346"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2734, Client.packetWriter.isaacCipher);
		var2.packetBuffer.method6930(var1);
		var2.packetBuffer.writeInt(var0);
		Client.packetWriter.addNode(var2);
	}
}
