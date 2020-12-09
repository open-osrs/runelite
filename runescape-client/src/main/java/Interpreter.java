import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("n")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("p")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("l")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("u")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1712020733
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1415753819
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("a")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("b")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("r")
	static boolean field1104;
	@ObfuscatedName("q")
	static boolean field1103;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1923352627
	)
	static int field1097;
	@ObfuscatedName("d")
	static final double field1093;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field1104 = false;
		field1103 = false;
		field1097 = 0;
		field1093 = Math.log(2.0D);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;IIIZI)V",
		garbageValue = "781493841"
	)
	public static void method2082(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class206.musicPlayerStatus = 1;
		Varps.musicTrackArchive = var0;
		HealthBarUpdate.musicTrackGroupId = var1;
		class206.musicTrackFileId = var2;
		GrandExchangeEvent.musicTrackVolume = var3;
		class231.musicTrackBoolean = var4;
		WorldMapSection1.pcmSampleLength = 10000;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "636889033"
	)
	static boolean method1995(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "([Lhe;IIIZI)V",
		garbageValue = "-182742727"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				TileItem.alignWidgetSize(var6, var2, var3, var4);
				class7.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					PendingSpawn.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
