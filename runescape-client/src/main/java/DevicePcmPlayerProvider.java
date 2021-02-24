import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class108 {
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -601318053
   )
   @Export("musicTrackVolume")
   public static int musicTrackVolume;
   @ObfuscatedName("ak")
   static String field433;
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "[Lly;"
   )
   @Export("worldSelectArrows")
   static IndexedSprite[] worldSelectArrows;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(S)Ldh;",
      garbageValue = "-25384"
   )
   @Export("player")
   public PcmPlayer player() {
      return new DevicePcmPlayer();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)I",
      garbageValue = "-313683225"
   )
   public static int method921(int var0, int var1, int var2, int var3, int var4, int var5) {
      if ((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      if (var2 == 0) {
         return var1;
      } else if (var2 == 1) {
         return 7 - var0 - (var3 - 1);
      } else {
         return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
      }
   }

   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-3337607"
   )
   static final void method920() {
      for(GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) {
         if (var0.plane == class90.Client_plane && !var0.isFinished) {
            if (Client.cycle >= var0.cycleStart) {
               var0.advance(Client.field808);
               if (var0.isFinished) {
                  var0.remove();
               } else {
                  MilliClock.scene.drawEntity(var0.plane, var0.x, var0.y, var0.height, 60, var0, 0, -1L, false);
               }
            }
         } else {
            var0.remove();
         }
      }

   }

   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      descriptor = "(Lhz;B)Z",
      garbageValue = "103"
   )
   @Export("isComponentHidden")
   static boolean isComponentHidden(Widget var0) {
      return var0.isHidden;
   }
}
