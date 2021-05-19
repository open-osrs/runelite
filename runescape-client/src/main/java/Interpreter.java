import java.awt.Desktop;
import java.awt.FontMetrics;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cm")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -947609559
	)
	static int field947;
	@ObfuscatedName("t")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("v")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("b")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("q")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("x")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1509964487
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lbx;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("j")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("f")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("y")
	static boolean field950;
	@ObfuscatedName("w")
	static boolean field951;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 991337999
	)
	static int field956;
	@ObfuscatedName("aj")
	static final double field953;
	@ObfuscatedName("aw")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 74
		Interpreter_arrays = new int[5][5000]; // L: 75
		Interpreter_intStack = new int[1000]; // L: 76
		Interpreter_stringStack = new String[1000]; // L: 78
		Interpreter_frameDepth = 0; // L: 80
		Interpreter_frames = new ScriptFrame[50]; // L: 81
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 87
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 90
		field950 = false; // L: 93
		field951 = false; // L: 94
		field956 = 0; // L: 95
		field953 = Math.log(2.0D); // L: 99
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "710417468"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 23
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 24
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 26
					return; // L: 47
				} catch (Exception var4) { // L: 29
				}
			}

			if (class44.field305.startsWith("win")) { // L: 31
				class9.method98(var0, 0); // L: 33
			} else if (class44.field305.startsWith("mac")) { // L: 37
				class230.method4348(var0, 1, "openjs"); // L: 38
			} else {
				class9.method98(var0, 2); // L: 41
			}
		} else {
			class9.method98(var0, 3); // L: 44
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZS)I",
		garbageValue = "-19668"
	)
	static int method1921(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 794
			var0 -= 1000; // L: 795
			var3 = DevicePcmPlayerProvider.getWidget(Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 796
		} else {
			var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 798
		}

		VerticalAlignment.invalidateWidget(var3); // L: 799
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 800
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 820
				var3.modelType = 2; // L: 821
				var3.modelId = Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 822
				return 1; // L: 823
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 825
				var3.modelType = 3; // L: 826
				var3.modelId = class35.localPlayer.appearance.getChatHeadId(); // L: 827
				return 1; // L: 828
			} else {
				return 2; // L: 830
			}
		} else {
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 801
			int var4 = Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 802
			int var5 = Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 803
			var3.itemId = var4; // L: 804
			var3.itemQuantity = var5; // L: 805
			ItemComposition var6 = Strings.ItemDefinition_get(var4); // L: 806
			var3.modelAngleX = var6.xan2d; // L: 807
			var3.modelAngleY = var6.yan2d; // L: 808
			var3.modelAngleZ = var6.zan2d; // L: 809
			var3.modelOffsetX = var6.offsetX2d; // L: 810
			var3.modelOffsetY = var6.offsetY2d; // L: 811
			var3.modelZoom = var6.zoom2d; // L: 812
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 813
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 814
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 815
			}

			if (var3.field3019 > 0) { // L: 816
				var3.modelZoom = var3.modelZoom * 32 / var3.field3019;
			} else if (var3.rawWidth > 0) { // L: 817
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 818
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-4124956"
	)
	static int method1808(int var0) {
		return (int)((Math.log((double)var0) / field953 - 7.0D) * 256.0D); // L: 3515
	}
}
