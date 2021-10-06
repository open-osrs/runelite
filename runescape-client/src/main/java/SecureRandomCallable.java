import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bk")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	}

	public Object call() {
		return Buddy.method6152();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1287485741"
	)
	static void method2036() {
		Tiles.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		class14.Tiles_shapes = null;
		GrandExchangeEvent.field3760 = null;
		Huffman.field3203 = null;
		class281.field3323 = null;
		Tiles.field981 = null;
		class11.Tiles_hue = null;
		Tiles.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		Client.Tiles_hueMultiplier = null;
		Tiles.field984 = null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "1022742204"
	)
	static int method2026(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4 + var3;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4 * var3;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
						break;
					default:
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 | var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
				long var9 = (long)Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				long var11 = (long)Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				long var13 = (long)Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var3 = WorldMapData_1.method3757(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ChatChannel.method1978(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = GrandExchangeEvents.method5348(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 3];
				var3 = GrandExchangeEvents.method5348(var3, var5, var6);
				var7 = FloorOverlayDefinition.method3343(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class185.method3784(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class283.method5141(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				var5 = class140.method2770(var3, var4);
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1668664473"
	)
	static final void method2035() {
		int var0 = LoginScreenAnimation.menuX;
		int var1 = class392.menuY;
		int var2 = UserComparator7.menuWidth;
		int var3 = ApproximateRouteStrategy.menuHeight;
		int var4 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0);
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
		Interpreter.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1);
		int var5 = MouseHandler.MouseHandler_x;
		int var6 = MouseHandler.MouseHandler_y;

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) {
			int var8 = (Client.menuOptionsCount - 1 - var7) * 15 + var1 + 31;
			int var9 = 16777215;
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
				var9 = 16776960;
			}

			Font var10 = Interpreter.fontBold12;
			String var11;
			if (var7 < 0) {
				var11 = "";
			} else if (Client.menuTargets[var7].length() > 0) {
				var11 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var11 = Client.menuActions[var7];
			}

			var10.draw(var11, var0 + 3, var8, var9, 0);
		}

		class112.method2468(LoginScreenAnimation.menuX, class392.menuY, UserComparator7.menuWidth, ApproximateRouteStrategy.menuHeight);
	}
}
