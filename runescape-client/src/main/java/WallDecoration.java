import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("WallDecoration")
public final class WallDecoration {
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 964756049
   )
   @Export("clientTickTimeIdx")
   static int clientTickTimeIdx;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 719575047
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -920611555
   )
   @Export("x")
   int x;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -730740551
   )
   @Export("y")
   int y;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 333766323
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1617230319
   )
   @Export("orientation2")
   int orientation2;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 2092861143
   )
   @Export("xOffset")
   int xOffset;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1518269047
   )
   @Export("yOffset")
   int yOffset;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   @Export("renderable1")
   public Renderable renderable1;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   @Export("renderable2")
   public Renderable renderable2;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = 1249498855339190201L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1390179163
   )
   @Export("flags")
   int flags = 0;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
      garbageValue = "699816166"
   )
   public static String method3450(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
            if (var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = LoginPacket.charToByteCp1252(var4);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }

               var6 = var5 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Ljo;",
      garbageValue = "1862361389"
   )
   public static FloorOverlayDefinition method3449(int var0) {
      FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
         var1 = new FloorOverlayDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), var0);
         }

         var1.postDecode();
         FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
