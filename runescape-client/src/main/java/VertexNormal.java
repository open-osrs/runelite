import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("VertexNormal")
public class VertexNormal {
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lgg;"
   )
   @Export("midiPcmStream")
   public static MidiPcmStream midiPcmStream;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1584172969
   )
   @Export("gameCyclesToDo")
   protected static int gameCyclesToDo;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1064061579
   )
   @Export("x")
   int x;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -178122101
   )
   @Export("y")
   int y;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1860163805
   )
   @Export("z")
   int z;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -525129943
   )
   @Export("magnitude")
   int magnitude;

   VertexNormal() {
   }

   @ObfuscatedSignature(
      descriptor = "(Leh;)V"
   )
   VertexNormal(VertexNormal var1) {
      this.x = var1.x;
      this.y = var1.y;
      this.z = var1.z;
      this.magnitude = var1.magnitude;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([BI)Ljava/lang/String;",
      garbageValue = "1971758922"
   )
   public static String method3163(byte[] var0) {
      int var2 = var0.length;
      StringBuilder var3 = new StringBuilder();

      for(int var4 = 0; var4 < var2 + 0; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(class300.field3688[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 255;
            var3.append(class300.field3688[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(class300.field3688[(var6 & 15) << 2 | var7 >>> 6]).append(class300.field3688[var7 & 63]);
            } else {
               var3.append(class300.field3688[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(class300.field3688[(var5 & 3) << 4]).append("==");
         }
      }

      String var1 = var3.toString();
      return var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([BIII)Ljava/lang/String;",
      garbageValue = "-1881073597"
   )
   @Export("decodeStringCp1252")
   public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = class298.cp1252AsciiExtension[var6 - 128];
               if (var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }
}
