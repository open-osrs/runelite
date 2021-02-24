import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("Language")
public class Language implements Enumerated {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("Language_EN")
   public static final Language Language_EN;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("Language_DE")
   static final Language Language_DE;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("Language_FR")
   public static final Language Language_FR;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("Language_PT")
   static final Language Language_PT;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("Language_NL")
   static final Language Language_NL;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("Language_ES")
   public static final Language Language_ES;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("Language_ES_MX")
   static final Language Language_ES_MX;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "[Lgp;"
   )
   @Export("Language_valuesOrdered")
   static final Language[] Language_valuesOrdered;
   @ObfuscatedName("e")
   final String field2387;
   @ObfuscatedName("q")
   @Export("language")
   final String language;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 426516807
   )
   @Export("id")
   final int id;

   static {
      Language_EN = new Language("EN", "en", "English", ModeWhere.field2420, 0, "GB");
      Language_DE = new Language("DE", "de", "German", ModeWhere.field2420, 1, "DE");
      Language_FR = new Language("FR", "fr", "French", ModeWhere.field2420, 2, "FR");
      Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field2420, 3, "BR");
      Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field2405, 4, "NL");
      Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field2405, 5, "ES");
      Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field2420, 6, "MX");
      Language[] var0 = new Language[]{Language_FR, Language_DE, Language_ES, Language_NL, Language_PT, Language_EN, Language_ES_MX};
      Language_valuesOrdered = new Language[var0.length];
      Language[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Language var4 = var2[var3];
         if (Language_valuesOrdered[var4.id] != null) {
            throw new IllegalStateException();
         }

         Language_valuesOrdered[var4.id] = var4;
      }

   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgw;ILjava/lang/String;)V"
   )
   Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
      this.field2387 = var1;
      this.language = var2;
      this.id = var5;
      if (var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-40"
   )
   @Export("getLanguage")
   String getLanguage() {
      return this.language;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "63"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   public String toString() {
      return this.getLanguage().toLowerCase(Locale.ENGLISH);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgp;",
      garbageValue = "-86"
   )
   public static Language method3854(int var0) {
      return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
   }
}
