import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public final class class307 {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      longValue = -5661179998477145969L
   )
   static long field3734;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      longValue = -6375840099148594553L
   )
   static long field3735;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)[Llp;",
      garbageValue = "1168600989"
   )
   @Export("FillMode_values")
   public static class333[] FillMode_values() {
      return new class333[]{class333.field3897, class333.SOLID, class333.field3896};
   }
}
