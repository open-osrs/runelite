import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -641330339
	)
	public int field3828;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("f")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lly;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3828 = (int)(ObjectComposition.currentTimeMillis() / 1000L); // L: 106
		this.username = var1; // L: 107
		this.world = (short)var2; // L: 108
	} // L: 109

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1148380845"
	)
	static void method5690(String var0) {
		class363.field4079 = var0; // L: 11398

		try {
			String var1 = class23.client.getParameter(Integer.toString(18)); // L: 11400
			String var2 = class23.client.getParameter(Integer.toString(13)); // L: 11401
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 11402
			if (var0.length() == 0) { // L: 11403
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires="; // L: 11405
				long var6 = ObjectComposition.currentTimeMillis() + 94608000000L; // L: 11407
				Calendar.Calendar_calendar.setTime(new Date(var6)); // L: 11409
				int var8 = Calendar.Calendar_calendar.get(7); // L: 11410
				int var9 = Calendar.Calendar_calendar.get(5); // L: 11411
				int var10 = Calendar.Calendar_calendar.get(2); // L: 11412
				int var11 = Calendar.Calendar_calendar.get(1); // L: 11413
				int var12 = Calendar.Calendar_calendar.get(11); // L: 11414
				int var13 = Calendar.Calendar_calendar.get(12); // L: 11415
				int var14 = Calendar.Calendar_calendar.get(13); // L: 11416
				String var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT"; // L: 11417
				var3 = var4 + var5 + "; Max-Age=" + 94608000L; // L: 11419
			}

			class42.method420(class23.client, "document.cookie=\"" + var3 + "\""); // L: 11421
		} catch (Throwable var15) { // L: 11423
		}

	} // L: 11424
}
