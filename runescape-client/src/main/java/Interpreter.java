import java.util.ArrayList;
import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("be")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = -1644525113
	)
	static int field838;
	@ObfuscatedName("m")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("p")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("s")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("r")
	static int[][] field839;
	@ObfuscatedName("v")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2003285519
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("e")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("h")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("d")
	static boolean field835;
	@ObfuscatedName("j")
	static boolean field833;
	@ObfuscatedName("z")
	static ArrayList field821;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -628954657
	)
	static int field823;
	@ObfuscatedName("am")
	static final double field837;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 75
		Interpreter_arrays = new int[5][5000]; // L: 76
		Interpreter_intStack = new int[1000]; // L: 77
		Interpreter_stringStack = new String[1000]; // L: 79
		Interpreter_frameDepth = 0; // L: 81
		Interpreter_frames = new ScriptFrame[50]; // L: 82
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 88
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 91
		field835 = false; // L: 94
		field833 = false; // L: 95
		field821 = new ArrayList(); // L: 96
		field823 = 0; // L: 97
		field837 = Math.log(2.0D); // L: 101
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-1325635329"
	)
	public static void method1866(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 43
			FileSystem.ByteArrayPool_alternativeSizes = var0; // L: 50
			GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 51
			class131.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 52

			for (int var2 = 0; var2 < FileSystem.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 53
				class131.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 54
				ByteArrayPool.field4212.add(var0[var2]); // L: 55
			}

			Collections.sort(ByteArrayPool.field4212); // L: 57
		} else {
			FileSystem.ByteArrayPool_alternativeSizes = null; // L: 44
			GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts = null; // L: 45
			class131.ByteArrayPool_arrays = null; // L: 46
			LoginScreenAnimation.method2217(); // L: 47
		}
	} // L: 48 58

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1050592537"
	)
	static int method1793(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 818
			var0 -= 1000; // L: 819
			var3 = class92.getWidget(Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 820
		} else {
			var3 = var2 ? scriptDotWidget : KeyHandler.scriptActiveWidget; // L: 822
		}

		GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 823
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 824
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 844
				var3.modelType = 2; // L: 845
				var3.modelId = Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 846
				return 1; // L: 847
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 849
				var3.modelType = 3; // L: 850
				var3.modelId = ModelData0.localPlayer.appearance.getChatHeadId(); // L: 851
				return 1; // L: 852
			} else {
				return 2; // L: 854
			}
		} else {
			class12.Interpreter_intStackSize -= 2; // L: 825
			int var4 = Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 826
			int var5 = Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 827
			var3.itemId = var4; // L: 828
			var3.itemQuantity = var5; // L: 829
			ItemComposition var6 = FileSystem.ItemDefinition_get(var4); // L: 830
			var3.modelAngleX = var6.xan2d; // L: 831
			var3.modelAngleY = var6.yan2d; // L: 832
			var3.modelAngleZ = var6.zan2d; // L: 833
			var3.modelOffsetX = var6.offsetX2d; // L: 834
			var3.modelOffsetY = var6.offsetY2d; // L: 835
			var3.modelZoom = var6.zoom2d; // L: 836
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0; // L: 837
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 838
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 839
			}

			if (var3.field3406 > 0) { // L: 840
				var3.modelZoom = var3.modelZoom * 32 / var3.field3406;
			} else if (var3.rawWidth > 0) { // L: 841
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 842
		}
	}
}
