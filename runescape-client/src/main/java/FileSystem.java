import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("FileSystem")
public class FileSystem {
   @ObfuscatedName("n")
   @Export("FileSystem_hasPermissions")
   static boolean FileSystem_hasPermissions = false;
   @ObfuscatedName("v")
   @Export("FileSystem_cacheDir")
   static File FileSystem_cacheDir;
   @ObfuscatedName("d")
   @Export("FileSystem_cacheFiles")
   static Hashtable FileSystem_cacheFiles = new Hashtable(16);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Llc;"
   )
   @Export("rasterProvider")
   public static AbstractRasterProvider rasterProvider;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IS)Ljava/lang/String;",
      garbageValue = "4003"
   )
   @Export("colorStartTag")
   static String colorStartTag(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "14"
   )
   static int method3709(int var0) {
      return (int)((Math.log((double)var0) / Interpreter.field1124 - 7.0D) * 256.0D);
   }
}
