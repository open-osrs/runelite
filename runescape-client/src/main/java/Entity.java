import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("Entity")
public abstract class Entity extends DualNode {
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = -1481288719
   )
   @Export("height")
   public int height = 1000;

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Lef;",
      garbageValue = "127"
   )
   @Export("getModel")
   protected Model getModel() {
      return null;
   }

   @ObfuscatedName("cz")
   @Export("draw")
   void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      Model var11 = this.getModel();
      if (var11 != null) {
         this.height = var11.height;
         var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   static final void method3417() {
      if (Client.field889 != class90.Client_plane) {
         Client.field889 = class90.Client_plane;
         class224.method4232(class90.Client_plane);
      }

   }
}
