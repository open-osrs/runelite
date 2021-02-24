import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("DynamicObject")
public class DynamicObject extends Entity {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1608906951
   )
   static int field1311;
   @ObfuscatedName("er")
   @ObfuscatedGetter(
      intValue = 1685580933
   )
   @Export("port3")
   static int port3;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1583763067
   )
   @Export("id")
   int id;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1077688157
   )
   @Export("type")
   int type;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1461018485
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 242558127
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -345704253
   )
   @Export("x")
   int x;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2021063101
   )
   @Export("y")
   int y;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -765264835
   )
   @Export("frame")
   int frame;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1029669135
   )
   @Export("cycleStart")
   int cycleStart;

   @ObfuscatedSignature(
      descriptor = "(IIIIIIIZLem;)V"
   )
   DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Entity var9) {
      this.id = var1;
      this.type = var2;
      this.orientation = var3;
      this.plane = var4;
      this.x = var5;
      this.y = var6;
      if (var7 != -1) {
         this.sequenceDefinition = InterfaceParent.SequenceDefinition_get(var7);
         this.frame = 0;
         this.cycleStart = Client.cycle - 1;
         if (this.sequenceDefinition.field3548 == 0 && var9 != null && var9 instanceof DynamicObject) {
            DynamicObject var10 = (DynamicObject)var9;
            if (var10.sequenceDefinition == this.sequenceDefinition) {
               this.frame = var10.frame;
               this.cycleStart = var10.cycleStart;
               return;
            }
         }

         if (var8 && this.sequenceDefinition.frameCount != -1) {
            this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
            this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Lef;",
      garbageValue = "127"
   )
   @Export("getModel")
   protected final Model getModel() {
      if (this.sequenceDefinition != null) {
         int var1 = Client.cycle - this.cycleStart;
         if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
            var1 = 100;
         }

         label55: {
            do {
               do {
                  if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
                     break label55;
                  }

                  var1 -= this.sequenceDefinition.frameLengths[this.frame];
                  ++this.frame;
               } while(this.frame < this.sequenceDefinition.frameIds.length);

               this.frame -= this.sequenceDefinition.frameCount;
            } while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

            this.sequenceDefinition = null;
         }

         this.cycleStart = Client.cycle - var1;
      }

      ObjectDefinition var12 = WorldMapAreaData.getObjectDefinition(this.id);
      if (var12.transforms != null) {
         var12 = var12.transform();
      }

      if (var12 == null) {
         return null;
      } else {
         int var2;
         int var3;
         if (this.orientation != 1 && this.orientation != 3) {
            var2 = var12.sizeX;
            var3 = var12.sizeY;
         } else {
            var2 = var12.sizeY;
            var3 = var12.sizeX;
         }

         int var4 = (var2 >> 1) + this.x;
         int var5 = (var2 + 1 >> 1) + this.x;
         int var6 = (var3 >> 1) + this.y;
         int var7 = (var3 + 1 >> 1) + this.y;
         int[][] var8 = Tiles.Tiles_heights[this.plane];
         int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
         int var10 = (this.x << 7) + (var2 << 6);
         int var11 = (this.y << 7) + (var3 << 6);
         return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
      }
   }
}
