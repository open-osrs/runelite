import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public final class class236 {
   @ObfuscatedName("fv")
   @ObfuscatedGetter(
      longValue = -1285822729066684367L
   )
   static long field3108;
   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("redHintArrowSprite")
   static Sprite redHintArrowSprite;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "1107662204"
   )
   public static int method4332(int var0, int var1, int var2) {
      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (var2 == 1) {
         return var1;
      } else {
         return var2 == 2 ? 7 - var0 : 7 - var1;
      }
   }
}
