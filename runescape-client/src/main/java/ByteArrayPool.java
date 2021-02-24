import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("ByteArrayPool")
public class ByteArrayPool {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1247159051
   )
   @Export("ByteArrayPool_smallCount")
   static int ByteArrayPool_smallCount = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1859253651
   )
   @Export("ByteArrayPool_mediumCount")
   static int ByteArrayPool_mediumCount = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 282212251
   )
   @Export("ByteArrayPool_largeCount")
   static int ByteArrayPool_largeCount = 0;
   @ObfuscatedName("c")
   @Export("ByteArrayPool_small")
   static byte[][] ByteArrayPool_small = new byte[1000][];
   @ObfuscatedName("y")
   @Export("ByteArrayPool_medium")
   static byte[][] ByteArrayPool_medium = new byte[250][];
   @ObfuscatedName("h")
   @Export("ByteArrayPool_large")
   static byte[][] ByteArrayPool_large = new byte[50][];
   @ObfuscatedName("q")
   @Export("ByteArrayPool_arrays")
   static byte[][][] ByteArrayPool_arrays;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IZI)[B",
      garbageValue = "-1630315856"
   )
   @Export("ByteArrayPool_getArrayBool")
   static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
      byte[] var4;
      if (var0 != 100) {
         if (var0 < 100) {
            ;
         }
      } else if (ByteArrayPool_smallCount > 0) {
         var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
         ByteArrayPool_small[ByteArrayPool_smallCount] = null;
         return var4;
      }

      if (var0 != 5000) {
         if (var0 < 5000) {
            ;
         }
      } else if (ByteArrayPool_mediumCount > 0) {
         var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
         ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
         return var4;
      }

      if (var0 != 30000) {
         if (var0 < 30000) {
            ;
         }
      } else if (ByteArrayPool_largeCount > 0) {
         var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
         ByteArrayPool_large[ByteArrayPool_largeCount] = null;
         return var4;
      }

      if (ByteArrayPool_arrays != null) {
         for(int var2 = 0; var2 < TriBool.ByteArrayPool_alternativeSizes.length; ++var2) {
            if (TriBool.ByteArrayPool_alternativeSizes[var2] != var0) {
               if (var0 < TriBool.ByteArrayPool_alternativeSizes[var2]) {
                  ;
               }
            } else if (class225.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
               byte[] var3 = ByteArrayPool_arrays[var2][--class225.ByteArrayPool_altSizeArrayCounts[var2]];
               ByteArrayPool_arrays[var2][class225.ByteArrayPool_altSizeArrayCounts[var2]] = null;
               return var3;
            }
         }
      }

      return new byte[var0];
   }
}
