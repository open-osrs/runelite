import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class127 extends class103 {
	@ObfuscatedName("f")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1174076049
	)
	int field1458;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -8036860125565611309L
	)
	long field1455;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	final class106 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	class127(class106 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "0"
	)
	void vmethod2562(Buffer var1) {
		this.field1458 = var1.readInt();
		this.field1455 = var1.readLong();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1598392944"
	)
	void vmethod2567(ClanSettings var1) {
		var1.method2400(this.field1458, this.field1455);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lgl;IIIB)Z",
		garbageValue = "-1"
	)
	static final boolean method2569(Model var0, int var1, int var2, int var3) {
		if (!class183.method3659()) {
			return false;
		} else {
			int var4;
			int var5;
			int var6;
			int var7;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			if (!ViewportMouse.ViewportMouse_false0) {
				var4 = Scene.Scene_cameraPitchSine;
				var5 = Scene.Scene_cameraPitchCosine;
				var6 = Scene.Scene_cameraYawSine;
				var7 = Scene.Scene_cameraYawCosine;
				byte var8 = 50;
				short var9 = 3500;
				var10 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var8 / Rasterizer3D.Rasterizer3D_zoom;
				var11 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var8 / Rasterizer3D.Rasterizer3D_zoom;
				var12 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var9 / Rasterizer3D.Rasterizer3D_zoom;
				int var13 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var9 / Rasterizer3D.Rasterizer3D_zoom;
				int var14 = Rasterizer3D.method3930(var11, var8, var5, var4);
				var15 = Rasterizer3D.method3915(var11, var8, var5, var4);
				var11 = var14;
				var14 = Rasterizer3D.method3930(var13, var9, var5, var4);
				var16 = Rasterizer3D.method3915(var13, var9, var5, var4);
				var13 = var14;
				var14 = Rasterizer3D.method3942(var10, var15, var7, var6);
				var15 = Rasterizer3D.method3913(var10, var15, var7, var6);
				var10 = var14;
				var14 = Rasterizer3D.method3942(var12, var16, var7, var6);
				var16 = Rasterizer3D.method3913(var12, var16, var7, var6);
				ViewportMouse.field2477 = (var10 + var14) / 2;
				ViewportMouse.field2478 = (var11 + var13) / 2;
				GrandExchangeOfferNameComparator.field3628 = (var15 + var16) / 2;
				ViewportMouse.field2479 = (var14 - var10) / 2;
				ViewportMouse.field2480 = (var13 - var11) / 2;
				ViewportMouse.field2481 = (var16 - var15) / 2;
				ScriptFrame.field372 = Math.abs(ViewportMouse.field2479);
				FillMode.field4259 = Math.abs(ViewportMouse.field2480);
				ViewportMouse.field2482 = Math.abs(ViewportMouse.field2481);
			}

			var4 = var0.xMid + var1;
			var5 = var2 + var0.yMid;
			var6 = var3 + var0.zMid;
			var7 = var0.xMidOffset;
			var15 = var0.yMidOffset;
			var16 = var0.zMidOffset;
			var10 = ViewportMouse.field2477 - var4;
			var11 = ViewportMouse.field2478 - var5;
			var12 = GrandExchangeOfferNameComparator.field3628 - var6;
			if (Math.abs(var10) > var7 + ScriptFrame.field372) {
				return false;
			} else if (Math.abs(var11) > var15 + FillMode.field4259) {
				return false;
			} else if (Math.abs(var12) > var16 + ViewportMouse.field2482) {
				return false;
			} else if (Math.abs(var12 * ViewportMouse.field2480 - var11 * ViewportMouse.field2481) > var16 * FillMode.field4259 + var15 * ViewportMouse.field2482) {
				return false;
			} else if (Math.abs(var10 * ViewportMouse.field2481 - var12 * ViewportMouse.field2479) > var16 * ScriptFrame.field372 + var7 * ViewportMouse.field2482) {
				return false;
			} else {
				return Math.abs(var11 * ViewportMouse.field2479 - var10 * ViewportMouse.field2480) <= var7 * FillMode.field4259 + var15 * ScriptFrame.field372;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1521180157"
	)
	static final boolean method2561(int var0, int var1) {
		ObjectComposition var2 = ClanChannel.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var2.method2993(var1);
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-752653495"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (Decimator.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
