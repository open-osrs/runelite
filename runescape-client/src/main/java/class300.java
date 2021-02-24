import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public class class300 {
   @ObfuscatedName("n")
   static char[] field3688 = new char[64];
   @ObfuscatedName("v")
   static char[] field3685;
   @ObfuscatedName("d")
   static char[] field3686;
   @ObfuscatedName("c")
   static int[] field3687;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field3688[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3688[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3688[var0] = (char)(var0 + 48 - 52);
      }

      field3688[62] = '+';
      field3688[63] = '/';
      field3685 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field3685[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3685[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3685[var0] = (char)(var0 + 48 - 52);
      }

      field3685[62] = '*';
      field3685[63] = '-';
      field3686 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field3686[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3686[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3686[var0] = (char)(var0 + 48 - 52);
      }

      field3686[62] = '-';
      field3686[63] = '_';
      field3687 = new int[128];

      for(var0 = 0; var0 < field3687.length; ++var0) {
         field3687[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field3687[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field3687[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field3687[var0] = var0 - 48 + 52;
      }

      int[] var2 = field3687;
      field3687[43] = 62;
      var2[42] = 62;
      int[] var1 = field3687;
      field3687[47] = 63;
      var1[45] = 63;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-43"
   )
   static final void method5473(String var0) {
      AbstractWorldMapData.addGameMessage(30, "", var0);
   }
}
