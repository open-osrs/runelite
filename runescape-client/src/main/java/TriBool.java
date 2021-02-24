import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("TriBool")
public class TriBool {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lka;"
   )
   @Export("TriBool_unknown")
   public static final TriBool TriBool_unknown = new TriBool();
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lka;"
   )
   @Export("TriBool_true")
   public static final TriBool TriBool_true = new TriBool();
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lka;"
   )
   @Export("TriBool_false")
   public static final TriBool TriBool_false = new TriBool();
   @ObfuscatedName("z")
   @Export("ByteArrayPool_alternativeSizes")
   static int[] ByteArrayPool_alternativeSizes;

   @ObfuscatedName("kx")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-107"
   )
   public static boolean method5372() {
      return Client.staffModLevel >= 2;
   }
}
