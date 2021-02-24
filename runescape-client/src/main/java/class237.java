import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public class class237 {
   static {
      Math.sqrt(8192.0D);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Lhz;",
      garbageValue = "361522526"
   )
   @Export("getWidget")
   public static Widget getWidget(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & '\uffff';
      if (DefaultsGroup.Widget_interfaceComponents[var1] == null || DefaultsGroup.Widget_interfaceComponents[var1][var2] == null) {
         boolean var3 = WorldMapCacheName.loadInterface(var1);
         if (!var3) {
            return null;
         }
      }

      return DefaultsGroup.Widget_interfaceComponents[var1][var2];
   }
}
