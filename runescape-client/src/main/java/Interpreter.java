import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("g")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("z")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("a")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("u")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("e")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("y")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1992880187
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 667658721
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lbl;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("b")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("t")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("p")
	static boolean field829;
	@ObfuscatedName("w")
	static boolean field827;
	@ObfuscatedName("i")
	static ArrayList field818;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1057377187
	)
	static int field813;
	@ObfuscatedName("aw")
	static final double field831;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive19")
	static Archive archive19;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field829 = false;
		field827 = false;
		field818 = new ArrayList();
		field813 = 0;
		field831 = Math.log(2.0D);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "1039315251"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		class12.method129(var0, var1, "openjs", var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Lcx;",
		garbageValue = "-72"
	)
	static ClientPreferences method1861() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = class4.getPreferencesFile("", class16.field83.name, false);
			byte[] var2 = new byte[(int)var0.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}
}
