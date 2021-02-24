import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1552197653
   )
   @Export("width")
   int width;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 522429537
   )
   @Export("height")
   int height;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1426976537
   )
   @Export("x")
   int x;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1260779731
   )
   @Export("y")
   int y;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lai;"
   )
   final WorldMapManager this$0;

   @ObfuscatedSignature(
      descriptor = "(Lai;)V"
   )
   WorldMapRectangle(WorldMapManager var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([BI)Llm;",
      garbageValue = "-1825283733"
   )
   @Export("convertJpgToSprite")
   public static final Sprite convertJpgToSprite(byte[] var0) {
      BufferedImage var1 = null;

      try {
         var1 = ImageIO.read(new ByteArrayInputStream(var0));
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var3 * var2];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
         var5.grabPixels();
         return new Sprite(var4, var2, var3);
      } catch (IOException var7) {
         ;
      } catch (InterruptedException var8) {
         ;
      }

      return new Sprite(0, 0);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZZI)V",
      garbageValue = "1269350728"
   )
   @Export("openURL")
   public static void openURL(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var4) {
               ;
            }
         }

         if (class60.field454.startsWith("win")) {
            ClientPreferences.method1972(var0, 0);
         } else if (class60.field454.startsWith("mac")) {
            class204.method3888(var0, 1, "openjs");
         } else {
            ClientPreferences.method1972(var0, 2);
         }
      } else {
         ClientPreferences.method1972(var0, 3);
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lmc;",
      garbageValue = "59696754"
   )
   @Export("getPreferencesFile")
   public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
      File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            AccessFile var10 = new AccessFile(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
            ;
         }
      }

      String var4 = "";
      if (JagexCache.cacheGamebuild == 33) {
         var4 = "_rc";
      } else if (JagexCache.cacheGamebuild == 34) {
         var4 = "_wip";
      }

      File var5 = new File(JagexCache.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      AccessFile var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new AccessFile(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
            ;
         }
      }

      try {
         var6 = new AccessFile(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1194982929"
   )
   static final void method354() {
      int var0 = Players.Players_count;
      int[] var1 = Players.Players_indices;

      for(int var2 = 0; var2 < var0; ++var2) {
         Player var3 = Client.players[var1[var2]];
         if (var3 != null) {
            class171.updateActorSequence(var3, 1);
         }
      }

   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-1726408780"
   )
   @Export("formatItemStacks")
   static final String formatItemStacks(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      if (var1.length() > 9) {
         return " " + FileSystem.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
      } else {
         return var1.length() > 6 ? " " + FileSystem.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + FileSystem.colorStartTag(16776960) + var1 + "</col>";
      }
   }
}
