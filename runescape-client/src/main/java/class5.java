import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("z")
public class class5 extends class16 {
	@ObfuscatedName("v")
	@Export("Widget_loadedInterfaces")
	static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1793437277
	)
	int field45;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lm;)V"
	)
	class5(class19 var1) {
		this.this$0 = var1;
		this.field45 = -1; // L: 81
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;S)V",
		garbageValue = "4095"
	)
	void vmethod326(Buffer var1) {
		this.field45 = var1.readUnsignedShort(); // L: 86
		var1.readUnsignedByte(); // L: 87
		if (var1.readUnsignedByte() != 255) { // L: 88
			--var1.offset; // L: 89
			var1.readLong();
		}

	} // L: 92

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lg;B)V",
		garbageValue = "-61"
	)
	void vmethod314(class3 var1) {
		var1.method33(this.field45); // L: 95
	} // L: 96

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "19"
	)
	public static char method68(char var0) {
		switch(var0) { // L: 48
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 106
		case '#':
		case '[':
		case ']':
			return var0; // L: 74
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 101
		case 'Ç':
		case 'ç':
			return 'c'; // L: 68
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 83
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 90
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 51
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 117
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 63
		case 'ß':
			return 'b'; // L: 65
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 54
		default:
			return Character.toLowerCase(var0); // L: 70
		}
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1466168379"
	)
	static void method64(String var0) {
		class253.field3136 = var0; // L: 11648

		try {
			String var1 = class303.client.getParameter(Integer.toString(18)); // L: 11650
			String var2 = class303.client.getParameter(Integer.toString(13)); // L: 11651
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 11652
			String var5;
			if (var0.length() == 0) { // L: 11653
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires="; // L: 11655
				long var6 = Archive.currentTimeMillis() + 94608000000L; // L: 11657
				Calendar.Calendar_calendar.setTime(new Date(var6)); // L: 11659
				int var8 = Calendar.Calendar_calendar.get(7); // L: 11660
				int var9 = Calendar.Calendar_calendar.get(5); // L: 11661
				int var10 = Calendar.Calendar_calendar.get(2); // L: 11662
				int var11 = Calendar.Calendar_calendar.get(1); // L: 11663
				int var12 = Calendar.Calendar_calendar.get(11); // L: 11664
				int var13 = Calendar.Calendar_calendar.get(12); // L: 11665
				int var14 = Calendar.Calendar_calendar.get(13); // L: 11666
				var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT"; // L: 11667
				var3 = var4 + var5 + "; Max-Age=" + 94608000L; // L: 11669
			}

			Client var16 = class303.client; // L: 11671
			var5 = "document.cookie=\"" + var3 + "\""; // L: 11672
			JSObject.getWindow(var16).eval(var5); // L: 11675
		} catch (Throwable var15) { // L: 11678
		}

	} // L: 11679
}
