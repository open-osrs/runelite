import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("p")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("j")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("b")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("y")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 137218349
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("r")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("m")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("f")
	static boolean field795;
	@ObfuscatedName("h")
	static boolean field791;
	@ObfuscatedName("v")
	static ArrayList field797;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 519063965
	)
	static int field798;
	@ObfuscatedName("am")
	static final double field801;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 77
		Interpreter_arrays = new int[5][5000]; // L: 78
		Interpreter_intStack = new int[1000]; // L: 79
		Interpreter_stringStack = new String[1000]; // L: 81
		Interpreter_frameDepth = 0; // L: 83
		Interpreter_frames = new ScriptFrame[50]; // L: 84
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 90
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 93
		field795 = false; // L: 96
		field791 = false; // L: 97
		field797 = new ArrayList(); // L: 98
		field798 = 0; // L: 99
		field801 = Math.log(2.0D); // L: 103
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIIB)V",
		garbageValue = "124"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3128 == null) { // L: 999
			throw new RuntimeException(); // L: 1000
		} else {
			var0.field3128[var1] = var2; // L: 1002
			var0.field3129[var1] = var3; // L: 1003
		}
	} // L: 1004

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lfm;IIII)V",
		garbageValue = "-228411245"
	)
	static void method1872(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class408.clientPreferences.areaSoundEffectsVolume != 0) { // L: 4049
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 4050
				int var4 = var0.soundEffects[var1]; // L: 4051
				if (var4 != 0) { // L: 4052
					int var5 = var4 >> 8; // L: 4053
					int var6 = var4 >> 4 & 7; // L: 4054
					int var7 = var4 & 15; // L: 4055
					Client.soundEffectIds[Client.soundEffectCount] = var5; // L: 4056
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6; // L: 4057
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 4058
					Client.soundEffects[Client.soundEffectCount] = null; // L: 4059
					int var8 = (var2 - 64) / 128; // L: 4060
					int var9 = (var3 - 64) / 128; // L: 4061
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16); // L: 4062
					++Client.soundEffectCount; // L: 4063
				}
			}
		}
	} // L: 4064
}
