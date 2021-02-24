import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -566421309
   )
   @Export("id")
   int id;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -941337557
   )
   @Export("size")
   int size;
   @ObfuscatedName("d")
   @Export("operations")
   int[] operations;
   @ObfuscatedName("c")
   @Export("creationErrors")
   int[] creationErrors;
   @ObfuscatedName("y")
   @Export("fields")
   Field[] fields;
   @ObfuscatedName("h")
   @Export("intReplaceValues")
   int[] intReplaceValues;
   @ObfuscatedName("z")
   @Export("methods")
   Method[] methods;
   @ObfuscatedName("e")
   @Export("arguments")
   byte[][][] arguments;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Z",
      garbageValue = "-84"
   )
   static boolean method2452(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lig;IIIZB)V",
      garbageValue = "-111"
   )
   public static void method2450(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
      class206.musicPlayerStatus = 1;
      class206.musicTrackArchive = var0;
      class206.musicTrackGroupId = var1;
      SoundSystem.musicTrackFileId = var2;
      DevicePcmPlayerProvider.musicTrackVolume = var3;
      class206.musicTrackBoolean = var4;
      class7.pcmSampleLength = 10000;
   }

   @ObfuscatedName("y")
   public static int method2451(long var0) {
      return (int)(var0 >>> 0 & 127L);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(CII)Ljava/lang/String;",
      garbageValue = "71351387"
   )
   static String method2449(char var0, int var1) {
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0;
      }

      return new String(var2);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ldw;I)V",
      garbageValue = "-1934858738"
   )
   @Export("PcmStream_disable")
   static final void PcmStream_disable(PcmStream var0) {
      var0.active = false;
      if (var0.sound != null) {
         var0.sound.position = 0;
      }

      for(PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
         PcmStream_disable(var1);
      }

   }
}
