import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class130 extends class116 {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 49834049
	)
	int field1482;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class130(class119 var1) {
		this.this$0 = var1;
		this.field1482 = -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-912681401"
	)
	void vmethod2767(Buffer var1) {
		this.field1482 = var1.readUnsignedShort();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1225074726"
	)
	void vmethod2766(ClanSettings var1) {
		var1.method2592(this.field1482);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "99"
	)
	public static void method2677(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "1"
	)
	static final boolean method2682(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label69:
		while (true) {
			int var6 = var4.method7037();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label69;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = class245.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field545;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "-683138531"
	)
	static int method2683(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 6950) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "19136899"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field744;
		} else if (var5 >= 100) {
			var6 = Client.field747;
		} else {
			var6 = (Client.field747 - Client.field744) * var5 / 100 + Client.field744;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field750) {
			var17 = Client.field750;
			var6 = var17 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field749) {
				var6 = Client.field749;
				var8 = var3 * var6 * 512 / (var17 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field501) {
			var17 = Client.field501;
			var6 = var17 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field748) {
				var6 = Client.field748;
				var8 = var17 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var16 = new int[9];

			for (var9 = 0; var9 < var16.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = NetCache.method5335(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var14 = var3 - 334;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 100) {
					var14 = 100;
				}

				int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight;
				int var13 = var11 * var15 / 256;
				var16[var9] = var13 * var12 >> 16;
			}

			Scene.Scene_buildVisiblityMap(var16, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
