import java.util.ArrayList;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("w")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("f")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("o")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("x")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1217280037
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("p")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1109121055
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lar;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("m")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("b")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("d")
	static boolean field752;
	@ObfuscatedName("y")
	static boolean field740;
	@ObfuscatedName("g")
	static ArrayList field754;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 744034499
	)
	static int field742;
	@ObfuscatedName("aq")
	static final double field756;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field752 = false;
		field740 = false;
		field754 = new ArrayList();
		field742 = 0;
		field756 = Math.log(2.0D);
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1377527653"
	)
	static final void method1579(boolean var0) {
		if (var0) {
			Client.field447 = Login.field820 ? class99.field1268 : class99.field1270;
		} else {
			LinkedHashMap var1 = Decimator.clientPreferences.parameters;
			String var3 = Login.Login_username;
			int var4 = var3.length();
			int var5 = 0;

			for (int var6 = 0; var6 < var4; ++var6) {
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field447 = var1.containsKey(var5) ? class99.field1276 : class99.field1267;
		}

	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "2099924114"
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
			var6 = Client.field660;
		} else if (var5 >= 100) {
			var6 = Client.field631;
		} else {
			var6 = (Client.field631 - Client.field660) * var5 / 100 + Client.field660;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var18;
		if (var7 < Client.field666) {
			var18 = Client.field666;
			var6 = var18 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field542) {
				var6 = Client.field542;
				var8 = var3 * var6 * 512 / (var18 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field667) {
			var18 = Client.field667;
			var6 = var18 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field472) {
				var6 = Client.field472;
				var8 = var18 * var2 * 334 / (var6 * 512);
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
			int[] var17 = new int[9];

			for (var9 = 0; var9 < var17.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = var10 * 3 + 600;
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var15 = var3 - 334;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 100) {
					var15 = 100;
				}

				int var16 = (Client.zoomWidth - Client.zoomHeight) * var15 / 100 + Client.zoomHeight;
				int var14 = var11 * var16 / 256;
				var17[var9] = var13 * var14 >> 16;
			}

			Scene.Scene_buildVisiblityMap(var17, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1368981143"
	)
	static final void method1635() {
		Client.field604 = Client.cycleCntr;
		Players.field1182 = true;
	}
}
