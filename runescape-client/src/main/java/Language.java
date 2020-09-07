import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("Language")
public class Language implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lgn;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("w")
	final String field2387;
	@ObfuscatedName("g")
	@Export("language")
	final String language;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2011360821
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field2413, 0, "GB"); // L: 10
		Language_DE = new Language("DE", "de", "German", ModeWhere.field2413, 1, "DE"); // L: 11
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field2413, 2, "FR"); // L: 12
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field2413, 3, "BR"); // L: 13
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field2407, 4, "NL"); // L: 14
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field2407, 5, "ES"); // L: 15
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field2413, 6, "MX"); // L: 16
		Language[] var0 = new Language[]{Language_NL, Language_PT, Language_FR, Language_ES_MX, Language_ES, Language_DE, Language_EN}; // L: 25
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgy;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field2387 = var1; // L: 44
		this.language = var2; // L: 45
		this.id = var5; // L: 46
		if (var6 != null) { // L: 47
			new Locale(var2.substring(0, 2), var6); // L: 48
		} else {
			new Locale(var2.substring(0, 2)); // L: 51
		}

	} // L: 53

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1763794440"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 56
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 60
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 64
	}
}
