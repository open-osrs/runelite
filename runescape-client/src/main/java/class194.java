import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class194 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   public static final class194 field2348 = new class194(3);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   public static final class194 field2354 = new class194(4);
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   public static final class194 field2347 = new class194(6);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   public static final class194 field2356 = new class194(5);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   public static final class194 field2350 = new class194(14);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   public static final class194 field2351 = new class194(7);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   public static final class194 field2352 = new class194(15);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   public static final class194 field2353 = new class194(4);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   public static final class194 field2346 = new class194(5);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   public static final class194 field2355 = new class194(2);

   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "3"
   )
   class194(int var1) {
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-921891961"
   )
   static final void method3820(int var0) {
      var0 = Math.min(Math.max(var0, 0), 255);
      if (var0 != WorldMapSectionType.clientPreferences.musicVolume) {
         if (WorldMapSectionType.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) {
            ReflectionCheck.method2450(UrlRequester.archive6, Client.currentTrackGroupId, 0, var0, false);
            Client.field899 = false;
         } else if (var0 == 0) {
            ScriptEvent.method1272();
            Client.field899 = false;
         } else if (class206.musicPlayerStatus != 0) {
            DevicePcmPlayerProvider.musicTrackVolume = var0;
         } else {
            VertexNormal.midiPcmStream.setPcmStreamVolume(var0);
         }

         WorldMapSectionType.clientPreferences.musicVolume = var0;
         class23.savePreferences();
      }

   }
}
