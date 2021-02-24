import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("Frames")
public class Frames extends DualNode {
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   static AbstractArchive field1904;
   @ObfuscatedName("he")
   @ObfuscatedSignature(
      descriptor = "[Llm;"
   )
   @Export("crossSprites")
   static Sprite[] crossSprites;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "[Leg;"
   )
   @Export("frames")
   Animation[] frames;

   @ObfuscatedSignature(
      descriptor = "(Lig;Lig;IZ)V"
   )
   Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
      NodeDeque var5 = new NodeDeque();
      int var6 = var1.getGroupFileCount(var3);
      this.frames = new Animation[var6];
      int[] var7 = var1.getGroupFileIds(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.takeFile(var3, var7[var8]);
         Skeleton var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) {
            if (var11 == var12.id) {
               var10 = var12;
               break;
            }
         }

         if (var10 == null) {
            byte[] var13;
            if (var4) {
               var13 = var2.getFile(0, var11);
            } else {
               var13 = var2.getFile(var11, 0);
            }

            var10 = new Skeleton(var11, var13);
            var5.addFirst(var10);
         }

         this.frames[var7[var8]] = new Animation(var9, var10);
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-196452763"
   )
   @Export("hasAlphaTransform")
   public boolean hasAlphaTransform(int var1) {
      return this.frames[var1].hasAlphaTransform;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;Lig;ZI)V",
      garbageValue = "-1252177889"
   )
   public static void method3429(AbstractArchive var0, AbstractArchive var1, boolean var2) {
      ObjectDefinition.ObjectDefinition_archive = var0;
      ObjectDefinition.ObjectDefinition_modelsArchive = var1;
      ObjectDefinition.ObjectDefinition_isLowDetail = var2;
   }
}
