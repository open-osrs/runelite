import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("n")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	public static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("v")
	@Export("DAYS_OF_THE_WEEK")
	public static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("d")
	@Export("Calendar_calendar")
	public static java.util.Calendar Calendar_calendar;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}}; // L: 7
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // L: 17
		java.util.Calendar.getInstance(); // L: 21
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT")); // L: 22
	} // L: 23

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1734349622"
	)
	static String method4153(String var0) {
		PlayerType[] var1 = class69.PlayerType_values(); // L: 11644

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11645
			PlayerType var3 = var1[var2]; // L: 11646
			if (var3.modIcon != -1 && var0.startsWith(UserComparator10.method3580(var3.modIcon))) { // L: 11648 11649
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 11650
				break;
			}
		}

		return var0; // L: 11657
	}
}
