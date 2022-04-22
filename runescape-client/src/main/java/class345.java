import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public class class345 {
	@ObfuscatedName("v")
	@Export("cp1252AsciiExtension")
	static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "12"
	)
	static Date method6441() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1099
		var0.setLenient(false); // L: 1100
		StringBuilder var1 = new StringBuilder(); // L: 1101
		String[] var2 = Login.field904; // L: 1103

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1104
			String var4 = var2[var3]; // L: 1105
			if (var4 == null) { // L: 1107
				Ignored.method6828(7); // L: 1109
				class4.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1110
				return null; // L: 1112
			}

			var1.append(var4); // L: 1114
		}

		var1.append("12"); // L: 1118
		return var0.parse(var1.toString()); // L: 1119
	}
}
