import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class22 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;I)V",
      garbageValue = "-782235051"
   )
   public static void method227(AbstractArchive var0) {
      VarcInt.VarcInt_archive = var0;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lcq;Lcq;IZIZI)I",
      garbageValue = "-385760353"
   )
   static int method226(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
      int var6 = class41.compareWorlds(var0, var1, var2, var3);
      if (var6 != 0) {
         return var3 ? -var6 : var6;
      } else if (var4 == -1) {
         return 0;
      } else {
         int var7 = class41.compareWorlds(var0, var1, var4, var5);
         return var5 ? -var7 : var7;
      }
   }

   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIII)V",
      garbageValue = "-500865093"
   )
   @Export("updateRootInterface")
   static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (WorldMapCacheName.loadInterface(var0)) {
         class169.updateInterface(DefaultsGroup.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }
}
