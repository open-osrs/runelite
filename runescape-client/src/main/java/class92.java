import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("cw")
public class class92 {
	@ObfuscatedName("by")
	@Export("otp")
	static String otp;
	@ObfuscatedName("cb")
	static boolean field1273;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive18")
	static Archive archive18;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lki;",
		garbageValue = "-94"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 229
		int var2 = var0 & 65535; // L: 230
		if (NetSocket.Widget_interfaceComponents[var1] == null || NetSocket.Widget_interfaceComponents[var1][var2] == null) { // L: 231
			boolean var3 = WorldMapDecoration.loadInterface(var1); // L: 232
			if (!var3) { // L: 233
				return null;
			}
		}

		return NetSocket.Widget_interfaceComponents[var1][var2]; // L: 235
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1946484556"
	)
	public static void method2372(int var0, int var1) {
		VarbitComposition var2 = class1.method9(var0); // L: 33
		int var3 = var2.baseVar; // L: 34
		int var4 = var2.startBit; // L: 35
		int var5 = var2.endBit; // L: 36
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 37
		if (var1 < 0 || var1 > var6) { // L: 38
			var1 = 0;
		}

		var6 <<= var4; // L: 39
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 40
	} // L: 41

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "379207215"
	)
	public static int method2373(CharSequence var0) {
		return class202.method4016(var0, 10, true);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1906975961"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-127"
	)
	public static int method2376(int var0, int var1, int var2) {
		int var3 = class147.method3000(var2 - var1 + 1); // L: 68
		var3 <<= var1; // L: 69
		var0 |= var3; // L: 70
		return var0; // L: 71
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1780450470"
	)
	public static void method2370() {
		ItemComposition.ItemDefinition_cached.clear(); // L: 541
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 542
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 543
	} // L: 544

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1003322759"
	)
	static long method2374() {
		return Client.field611; // L: 3049
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-34"
	)
	static void method2377(String var0) {
		Client.field662 = var0; // L: 12542

		try {
			String var1 = class82.client.getParameter(Integer.toString(18)); // L: 12544
			String var2 = class82.client.getParameter(Integer.toString(13)); // L: 12545
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12546
			String var5;
			if (var0.length() == 0) { // L: 12547
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires="; // L: 12549
				long var6 = class113.method2624() + 94608000000L; // L: 12551
				Calendar.Calendar_calendar.setTime(new Date(var6)); // L: 12553
				int var8 = Calendar.Calendar_calendar.get(7); // L: 12554
				int var9 = Calendar.Calendar_calendar.get(5); // L: 12555
				int var10 = Calendar.Calendar_calendar.get(2); // L: 12556
				int var11 = Calendar.Calendar_calendar.get(1); // L: 12557
				int var12 = Calendar.Calendar_calendar.get(11); // L: 12558
				int var13 = Calendar.Calendar_calendar.get(12); // L: 12559
				int var14 = Calendar.Calendar_calendar.get(13); // L: 12560
				var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT"; // L: 12561
				var3 = var4 + var5 + "; Max-Age=" + 94608000L; // L: 12563
			}

			Client var16 = class82.client; // L: 12565
			var5 = "document.cookie=\"" + var3 + "\""; // L: 12566
			JSObject.getWindow(var16).eval(var5); // L: 12569
		} catch (Throwable var15) { // L: 12572
		}

	} // L: 12573
}
