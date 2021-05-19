import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("Language")
public class Language implements Enumerated {
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = -430967817
	)
	static int field3704;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Lkr;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("v")
	final String field3701;
	@ObfuscatedName("b")
	@Export("language")
	final String language;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2016416161
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field3710, 0, "GB"); // L: 10
		Language_DE = new Language("DE", "de", "German", ModeWhere.field3710, 1, "DE"); // L: 11
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field3710, 2, "FR"); // L: 12
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field3710, 3, "BR"); // L: 13
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field3717, 4, "NL"); // L: 14
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3717, 5, "ES"); // L: 15
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3710, 6, "MX"); // L: 16
		Language[] var0 = new Language[]{Language_DE, Language_NL, Language_FR, Language_ES_MX, Language_EN, Language_PT, Language_ES}; // L: 25
		Language_valuesOrdered = new Language[var0.length]; // L: 28
		Language[] var2 = var0; // L: 30

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 31
			Language var4 = var2[var3]; // L: 32
			if (Language_valuesOrdered[var4.id] != null) { // L: 34
				throw new IllegalStateException(); // L: 35
			}

			Language_valuesOrdered[var4.id] = var4; // L: 37
		}

	} // L: 41

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkb;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field3701 = var1; // L: 44
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-65"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)[B",
		garbageValue = "21"
	)
	public static byte[] method5070(CharSequence var0) {
		int var1 = var0.length(); // L: 45
		byte[] var2 = new byte[var1]; // L: 46

		for (int var3 = 0; var3 < var1; ++var3) { // L: 47
			char var4 = var0.charAt(var3); // L: 48
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 49
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 50
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 51
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 52
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 53
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 54
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 55
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 56
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 57
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 58
				var2[var3] = -119;
			} else if (var4 == 352) { // L: 59
				var2[var3] = -118;
			} else if (var4 == 8249) { // L: 60
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 61
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 62
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 63
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 64
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 65
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 66
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 67
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 68
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 69
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 70
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 71
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 72
				var2[var3] = -102;
			} else if (var4 == 8250) { // L: 73
				var2[var3] = -101;
			} else if (var4 == 339) { // L: 74
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 75
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 76
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 77
			}
		}

		return var2; // L: 79
	}
}
