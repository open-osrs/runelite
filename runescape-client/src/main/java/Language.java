import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("Language")
public class Language implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Ljh;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = 2000557037
	)
	static int field3357;
	@ObfuscatedName("g")
	final String field3352;
	@ObfuscatedName("h")
	@Export("language")
	final String language;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 862102775
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field3373, 0, "GB"); // L: 10
		Language_DE = new Language("DE", "de", "German", ModeWhere.field3373, 1, "DE"); // L: 11
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field3373, 2, "FR"); // L: 12
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field3373, 3, "BR"); // L: 13
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field3363, 4, "NL"); // L: 14
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3363, 5, "ES"); // L: 15
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3373, 6, "MX"); // L: 16
		Language[] var0 = method4693();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0; // L: 26

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 27
			Language var3 = var1[var2]; // L: 28
			if (Language_valuesOrdered[var3.id] != null) { // L: 30
				throw new IllegalStateException(); // L: 31
			}

			Language_valuesOrdered[var3.id] = var3; // L: 33
		}

	} // L: 37

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljb;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field3352 = var1; // L: 44
		this.language = var2; // L: 45
		this.id = var5; // L: 46
		if (var6 != null) { // L: 47
			new Locale(var2.substring(0, 2), var6); // L: 48
		} else {
			new Locale(var2.substring(0, 2)); // L: 51
		}

	} // L: 53

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 60
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-429051103"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 56
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 69
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "31"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljh;",
		garbageValue = "-79"
	)
	static Language[] method4693() {
		return new Language[]{Language_EN, Language_PT, Language_DE, Language_ES_MX, Language_NL, Language_FR, Language_ES}; // L: 40
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljh;",
		garbageValue = "13"
	)
	public static Language method4691(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null; // L: 64 65
	}
}
