import java.io.File;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("r")
public class class23 {
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/io/File;ZI)Z",
      garbageValue = "-1646838359"
   )
   static boolean method235(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-981908924"
   )
   static void method232() {
      Tiles.field517 = null;
      class200.field2399 = null;
      Tiles.field530 = null;
      class1.field1 = null;
      class2.field12 = null;
      TaskHandler.field2045 = null;
      WorldMapSprite.field257 = null;
      GrandExchangeOfferAgeComparator.Tiles_hue = null;
      Tiles.Tiles_saturation = null;
      WorldMapLabel.Tiles_lightness = null;
      TaskHandler.Tiles_hueMultiplier = null;
      WorldMapID.field292 = null;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(II)[B",
      garbageValue = "-1513413924"
   )
   @Export("ByteArrayPool_getArray")
   public static synchronized byte[] ByteArrayPool_getArray(int var0) {
      return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1738423224"
   )
   @Export("savePreferences")
   static void savePreferences() {
      AccessFile var0 = null;

      try {
         var0 = WorldMapRectangle.getPreferencesFile("", FontName.field3699.name, true);
         Buffer var1 = WorldMapSectionType.clientPreferences.toBuffer();
         var0.write(var1.array, 0, var1.offset);
      } catch (Exception var3) {
         ;
      }

      try {
         if (var0 != null) {
            var0.closeSync(true);
         }
      } catch (Exception var2) {
         ;
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
      garbageValue = "1098573147"
   )
   @Export("loadClassFromDescriptor")
   static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
      }
   }

   @ObfuscatedName("fg")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-354639322"
   )
   static final void method234(boolean var0) {
      if (var0) {
         Client.field661 = Login.field1217 ? class169.field2011 : class169.field2018;
      } else {
         LinkedHashMap var1 = WorldMapSectionType.clientPreferences.parameters;
         String var3 = Login.Login_username;
         int var4 = var3.length();
         int var5 = 0;

         for(int var6 = 0; var6 < var4; ++var6) {
            var5 = (var5 << 5) - var5 + var3.charAt(var6);
         }

         Client.field661 = var1.containsKey(var5) ? class169.field2013 : class169.field2012;
      }

   }
}
