import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class225 {
   @ObfuscatedName("z")
   @Export("SpriteBuffer_spriteHeights")
   public static int[] SpriteBuffer_spriteHeights;
   @ObfuscatedName("e")
   @Export("ByteArrayPool_altSizeArrayCounts")
   static int[] ByteArrayPool_altSizeArrayCounts;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)I",
      garbageValue = "-47"
   )
   @Export("hashString")
   public static int hashString(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + LoginPacket.charToByteCp1252(var0.charAt(var3));
      }

      return var2;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "16"
   )
   @Export("isAlphaNumeric")
   public static boolean isAlphaNumeric(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ObfuscatedName("q")
   static boolean method4239(long var0) {
      return (int)(var0 >>> 16 & 1L) == 1;
   }
}
