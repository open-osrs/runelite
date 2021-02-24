import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("ArchiveLoader")
public class ArchiveLoader {
   @ObfuscatedName("pq")
   @ObfuscatedSignature(
      descriptor = "Lld;"
   )
   @Export("privateChatMode")
   static PrivateChatMode privateChatMode;
   @ObfuscatedName("en")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive19")
   static Archive archive19;
   @ObfuscatedName("hn")
   @ObfuscatedGetter(
      intValue = -1907995143
   )
   @Export("cameraY")
   static int cameraY;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive")
   final Archive archive;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 265251349
   )
   @Export("groupCount")
   final int groupCount;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 134465937
   )
   @Export("loadedCount")
   int loadedCount = 0;

   @ObfuscatedSignature(
      descriptor = "(Liy;Ljava/lang/String;)V"
   )
   ArchiveLoader(Archive var1, String var2) {
      this.archive = var1;
      this.groupCount = var1.getGroupCount();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "979008130"
   )
   @Export("isLoaded")
   boolean isLoaded() {
      this.loadedCount = 0;

      for(int var1 = 0; var1 < this.groupCount; ++var1) {
         if (!this.archive.method4471(var1) || this.archive.method4470(var1)) {
            ++this.loadedCount;
         }
      }

      return this.loadedCount >= this.groupCount;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(III)Lhz;",
      garbageValue = "-326621995"
   )
   @Export("getWidgetChild")
   public static Widget getWidgetChild(int var0, int var1) {
      Widget var2 = class237.getWidget(var0);
      if (var1 == -1) {
         return var2;
      } else {
         return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "2065603382"
   )
   static final int method1237(int var0, int var1) {
      int var2 = class60.method972(var0 + '넵', 91923 + var1, 4) - 128 + (class60.method972(10294 + var0, var1 + '鎽', 2) - 128 >> 1) + (class60.method972(var0, var1, 1) - 128 >> 2);
      var2 = (int)(0.3D * (double)var2) + 35;
      if (var2 < 10) {
         var2 = 10;
      } else if (var2 > 60) {
         var2 = 60;
      }

      return var2;
   }
}
