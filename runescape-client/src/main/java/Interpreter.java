import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("r")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("h")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("d")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("b")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 546325367
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Lbu;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("p")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("c")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("l")
	static boolean field963;
	@ObfuscatedName("w")
	static boolean field951;
	@ObfuscatedName("a")
	static ArrayList field965;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1747930903
	)
	static int field966;
	@ObfuscatedName("ah")
	static final double field959;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 76
		Interpreter_arrays = new int[5][5000]; // L: 77
		Interpreter_intStack = new int[1000]; // L: 78
		Interpreter_stringStack = new String[1000]; // L: 80
		Interpreter_frameDepth = 0; // L: 82
		Interpreter_frames = new ScriptFrame[50]; // L: 83
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 89
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 92
		field963 = false; // L: 95
		field951 = false; // L: 96
		field965 = new ArrayList(); // L: 97
		field966 = 0; // L: 98
		field959 = Math.log(2.0D); // L: 102
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lem;",
		garbageValue = "-1531306565"
	)
	public static VarcInt method2009(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0); // L: 19
			var1 = new VarcInt(); // L: 20
			if (var2 != null) { // L: 21
				var1.method2745(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "90"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4715
			var2 = 1;
		}

		if (var3 < 1) { // L: 4716
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4717
		int var6;
		if (var5 < 0) { // L: 4719
			var6 = Client.field876;
		} else if (var5 >= 100) { // L: 4720
			var6 = Client.field877;
		} else {
			var6 = (Client.field877 - Client.field876) * var5 / 100 + Client.field876; // L: 4721
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4722
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field881) { // L: 4723
			var10 = Client.field881; // L: 4724
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4725
			if (var6 > Client.field864) { // L: 4726
				var6 = Client.field864; // L: 4727
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 4728
				var9 = (var2 - var8) / 2; // L: 4729
				if (var4) { // L: 4730
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4731
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4732
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4733
				}

				var0 += var9; // L: 4735
				var2 -= var9 * 2; // L: 4736
			}
		} else if (var7 > Client.field690) { // L: 4739
			var10 = Client.field690; // L: 4740
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4741
			if (var6 < Client.field880) { // L: 4742
				var6 = Client.field880; // L: 4743
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 4744
				var9 = (var3 - var8) / 2; // L: 4745
				if (var4) { // L: 4746
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4747
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4748
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4749
				}

				var1 += var9; // L: 4751
				var3 -= var9 * 2; // L: 4752
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4755
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4756
			class12.method209(var2, var3); // L: 4757
		}

		Client.viewportOffsetX = var0; // L: 4759
		Client.viewportOffsetY = var1; // L: 4760
		Client.viewportWidth = var2; // L: 4761
		Client.viewportHeight = var3; // L: 4762
	} // L: 4763
}
