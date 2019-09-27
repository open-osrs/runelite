import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("Strings")
public class Strings {
      @ObfuscatedName("bm")
      public static String field2793 = "Please visit the support page for assistance.";
      @ObfuscatedName("cc")
      public static String field2783 = "Please visit the support page for assistance.";
      @ObfuscatedName("jp")
      public static String field3008 = "";
      @ObfuscatedName("jd")
      public static String field3009 = "Page has opened in a new window.";
      @ObfuscatedName("jo")
      public static String field3010 = "(Please check your popup blocker.)";
      @ObfuscatedName("lt")
      @ObfuscatedSignature(
            signature = "Lho;"
      )
      static Widget field2767;

      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "(II)Z",
            garbageValue = "-552615239"
      )
      public static boolean method4079(int var0) {
            return var0 >= WorldMapDecorationType.field2704.field_50 && var0 <= WorldMapDecorationType.field2720.field_50;
      }

      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "(IB)Z",
            garbageValue = "-5"
      )
      @Export("isWorldMapEvent")
      public static boolean isWorldMapEvent(int var0) {
            return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
      }
}
