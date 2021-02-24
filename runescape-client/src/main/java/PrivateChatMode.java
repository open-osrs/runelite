import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("PrivateChatMode")
public class PrivateChatMode {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lld;"
   )
   static final PrivateChatMode field3829 = new PrivateChatMode(0);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lld;"
   )
   public static final PrivateChatMode field3830 = new PrivateChatMode(1);
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lld;"
   )
   static final PrivateChatMode field3831 = new PrivateChatMode(2);
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -441716017
   )
   public final int field3832;

   PrivateChatMode(int var1) {
      this.field3832 = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1722143108"
   )
   public static int method6104(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      descriptor = "(Lhz;IIIIIII)V",
      garbageValue = "-1992669827"
   )
   static final void method6107(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (Client.field731) {
         Client.alternativeScrollbarWidth = 32;
      } else {
         Client.alternativeScrollbarWidth = 0;
      }

      Client.field731 = false;
      int var7;
      if (MouseHandler.MouseHandler_currentButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.scrollY -= 4;
            IsaacCipher.invalidateWidget(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.scrollY += 4;
            IsaacCipher.invalidateWidget(var0);
         } else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var7 = var3 * (var3 - 32) / var4;
            if (var7 < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            int var9 = var3 - 32 - var7;
            var0.scrollY = var8 * (var4 - var3) / var9;
            IsaacCipher.invalidateWidget(var0);
            Client.field731 = true;
         }
      }

      if (Client.mouseWheelRotation != 0) {
         var7 = var0.width;
         if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.scrollY += Client.mouseWheelRotation * 45;
            IsaacCipher.invalidateWidget(var0);
         }
      }

   }
}
