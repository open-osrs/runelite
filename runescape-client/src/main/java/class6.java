import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public class class6 implements class11 {
   @ObfuscatedName("n")
   final MessageDigest field34 = this.method70();

   @ObfuscatedSignature(
      descriptor = "(Ls;)V"
   )
   class6(class10 var1) {
   }

   @ObfuscatedName("n")
   boolean method64(int var1, String var2, long var3) {
      byte[] var5 = this.method68(var2, var3);
      return method65(var5) >= var1;
   }

   @ObfuscatedName("c")
   byte[] method68(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field34.reset();

      try {
         this.field34.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field34.digest();
   }

   @ObfuscatedName("y")
   MessageDigest method70() {
      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         return null;
      }
   }

   @ObfuscatedName("v")
   static int method65(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         byte var4 = var2[var3];
         int var5 = method66(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   @ObfuscatedName("d")
   static int method66(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for(int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
            ++var1;
         }
      }

      return var1;
   }
}
