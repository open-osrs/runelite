import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lan;"
   )
   public static final WorldMapCacheName field333 = new WorldMapCacheName("details");
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lan;"
   )
   public static final WorldMapCacheName field323 = new WorldMapCacheName("compositemap");
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lan;"
   )
   public static final WorldMapCacheName field324 = new WorldMapCacheName("compositetexture");
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lan;"
   )
   static final WorldMapCacheName field325 = new WorldMapCacheName("area");
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lan;"
   )
   public static final WorldMapCacheName field326 = new WorldMapCacheName("labels");
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive4")
   static Archive archive4;
   @ObfuscatedName("h")
   @Export("name")
   public final String name;

   WorldMapCacheName(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1996576804"
   )
   @Export("loadInterface")
   public static boolean loadInterface(int var0) {
      if (Widget.Widget_loadedInterfaces[var0]) {
         return true;
      } else if (!FontName.Widget_archive.tryLoadGroup(var0)) {
         return false;
      } else {
         int var1 = FontName.Widget_archive.getGroupFileCount(var0);
         if (var1 == 0) {
            Widget.Widget_loadedInterfaces[var0] = true;
            return true;
         } else {
            if (DefaultsGroup.Widget_interfaceComponents[var0] == null) {
               DefaultsGroup.Widget_interfaceComponents[var0] = new Widget[var1];
            }

            for(int var2 = 0; var2 < var1; ++var2) {
               if (DefaultsGroup.Widget_interfaceComponents[var0][var2] == null) {
                  byte[] var3 = FontName.Widget_archive.takeFile(var0, var2);
                  if (var3 != null) {
                     DefaultsGroup.Widget_interfaceComponents[var0][var2] = new Widget();
                     DefaultsGroup.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
                     if (var3[0] == -1) {
                        DefaultsGroup.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
                     } else {
                        DefaultsGroup.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
                     }
                  }
               }
            }

            Widget.Widget_loadedInterfaces[var0] = true;
            return true;
         }
      }
   }

   @ObfuscatedName("lk")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-11688"
   )
   static void method715() {
      if (Client.oculusOrbState == 1) {
         Client.field747 = true;
      }

   }
}
