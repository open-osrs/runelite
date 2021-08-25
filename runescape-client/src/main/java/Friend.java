import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("la")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("n")
	boolean field3936;
	@ObfuscatedName("c")
	boolean field3937;

	Friend() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)I",
		garbageValue = "1061817546"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field3936 && !var1.field3936) {
			return -1;
		} else if (!this.field3936 && var1.field3936) {
			return 1;
		} else if (this.field3937 && !var1.field3937) {
			return -1;
		} else if (!this.field3937 && var1.field3937) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lle;I)I",
		garbageValue = "-1041307648"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1747450791"
	)
	static final int method5915(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = class29.method422(var3, var5);
		int var8 = class29.method422(var3 + 1, var5);
		int var9 = class29.method422(var3, var5 + 1);
		int var10 = class29.method422(var3 + 1, var5 + 1);
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var11 = ((65536 - var12) * var7 >> 16) + (var8 * var12 >> 16);
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16);
		return FloorOverlayDefinition.method3270(var11, var13, var6, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "-482644124"
	)
	static int method5916(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class240.Interpreter_intStackSize -= 2;
			Client.field723 = (short)Client.method1609(Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize]);
			if (Client.field723 <= 0) {
				Client.field723 = 256;
			}

			Client.field742 = (short)Client.method1609(Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]);
			if (Client.field742 <= 0) {
				Client.field742 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class240.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class240.Interpreter_intStackSize -= 4;
			Client.field642 = (short)Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			if (Client.field642 <= 0) {
				Client.field642 = 1;
			}

			Client.field746 = (short)Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			if (Client.field746 <= 0) {
				Client.field746 = 32767;
			} else if (Client.field746 < Client.field642) {
				Client.field746 = Client.field642;
			}

			Client.field711 = (short)Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
			if (Client.field711 <= 0) {
				Client.field711 = 1;
			}

			Client.field748 = (short)Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 3];
			if (Client.field748 <= 0) {
				Client.field748 = 32767;
			} else if (Client.field748 < Client.field711) {
				Client.field748 = Client.field711;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class9.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = MusicPatchNode.method4849(Client.field723);
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = MusicPatchNode.method4849(Client.field742);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = InvDefinition.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = GameEngine.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
