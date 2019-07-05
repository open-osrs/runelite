import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("iw")
@Implements("VarcInt")
public class VarcInt extends DualNode {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static AbstractIndexCache field942;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Ler;"
   )
   @Export("cachedVarcInts")
   static EvictingDualNodeHashTable cachedVarcInts;
   @ObfuscatedName("q")
   @Export("persist")
   public boolean persist;

   VarcInt() {
      this.persist = false;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgr;I)V",
      garbageValue = "1023420886"
   )
   void method354(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method355(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgr;II)V",
      garbageValue = "-202810982"
   )
   void method355(Buffer var1, int var2) {
      if (var2 == 2) {
         this.persist = true;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/Class;",
      garbageValue = "1680587190"
   )
   @Export("loadClassFromDescriptor")
   static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
      return var0.equals("B") ? Byte.TYPE : (var0.equals("I") ? Integer.TYPE : (var0.equals("S") ? Short.TYPE : (var0.equals("J") ? Long.TYPE : (var0.equals("Z") ? Boolean.TYPE : (var0.equals("F") ? Float.TYPE : (var0.equals("D") ? Double.TYPE : (var0.equals("C") ? Character.TYPE : (var0.equals("void") ? Void.TYPE : Reflection.findClass(var0)))))))));
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "1367119425"
   )
   @Export("isAlphaNumeric")
   public static boolean isAlphaNumeric(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   static {
      cachedVarcInts = new EvictingDualNodeHashTable(64);
   }
}
