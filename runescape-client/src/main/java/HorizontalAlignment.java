import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1699(0, 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1694(2, 2);

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1219094331
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 423871977
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 19
	}

	@ObfuscatedName("i")
	public static String method3113(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0)); // L: 31
		int var2 = Calendar.Calendar_calendar.get(7); // L: 32
		int var3 = Calendar.Calendar_calendar.get(5); // L: 33
		int var4 = Calendar.Calendar_calendar.get(2); // L: 34
		int var5 = Calendar.Calendar_calendar.get(1); // L: 35
		int var6 = Calendar.Calendar_calendar.get(11); // L: 36
		int var7 = Calendar.Calendar_calendar.get(12); // L: 37
		int var8 = Calendar.Calendar_calendar.get(13); // L: 38
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT"; // L: 39
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1221922061"
	)
	public static boolean method3114(int var0) {
		return (var0 >> 28 & 1) != 0; // L: 25
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1099417797"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field687 = 0L; // L: 4556
		if (var0 >= 2) { // L: 4557
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4558
		}

		if (class134.getWindowedMode() == 1) { // L: 4559
			ArchiveLoader.client.setMaxCanvasSize(765, 503); // L: 4560
		} else {
			ArchiveLoader.client.setMaxCanvasSize(7680, 2160); // L: 4563
		}

		if (Client.gameState >= 25) { // L: 4565
			Frames.method4481();
		}

	} // L: 4566

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1045618476"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class174.loadInterface(var0)) { // L: 9676
			NPC.field1207 = null; // L: 9683
			class28.drawInterface(WorldMapSection1.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 9684
			if (NPC.field1207 != null) { // L: 9685
				class28.drawInterface(NPC.field1207, -1412584499, var1, var2, var3, var4, Varcs.field1263, class150.field1604, var7); // L: 9686
				NPC.field1207 = null; // L: 9687
			}

		} else {
			if (var7 != -1) { // L: 9677
				Client.field594[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 9679
					Client.field594[var8] = true;
				}
			}

		}
	} // L: 9681 9689
}
