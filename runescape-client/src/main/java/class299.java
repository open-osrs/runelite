import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public final class class299 {
   @ObfuscatedName("n")
   @Export("base37Table")
   public static final char[] base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   @ObfuscatedName("v")
   static long[] field3683 = new long[12];
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("ItemDefinition_archive")
   public static AbstractArchive ItemDefinition_archive;

   static {
      for(int var0 = 0; var0 < field3683.length; ++var0) {
         field3683[var0] = (long)Math.pow(37.0D, (double)var0);
      }

   }
}
