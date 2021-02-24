import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("NPC")
public final class NPC extends Actor {
   @ObfuscatedName("si")
   @ObfuscatedGetter(
      intValue = -1643634883
   )
   @Export("foundItemIdCount")
   static int foundItemIdCount;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ljy;"
   )
   @Export("definition")
   NPCDefinition definition;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IBB)V",
      garbageValue = "1"
   )
   final void method2178(int var1, byte var2) {
      int var3 = super.pathX[0];
      int var4 = super.pathY[0];
      if (var1 == 0) {
         --var3;
         ++var4;
      }

      if (var1 == 1) {
         ++var4;
      }

      if (var1 == 2) {
         ++var3;
         ++var4;
      }

      if (var1 == 3) {
         --var3;
      }

      if (var1 == 4) {
         ++var3;
      }

      if (var1 == 5) {
         --var3;
         --var4;
      }

      if (var1 == 6) {
         --var4;
      }

      if (var1 == 7) {
         ++var3;
         --var4;
      }

      if (super.sequence != -1 && InterfaceParent.SequenceDefinition_get(super.sequence).field3565 == 1) {
         super.sequence = -1;
      }

      if (super.pathLength < 9) {
         ++super.pathLength;
      }

      for(int var5 = super.pathLength; var5 > 0; --var5) {
         super.pathX[var5] = super.pathX[var5 - 1];
         super.pathY[var5] = super.pathY[var5 - 1];
         super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
      }

      super.pathX[0] = var3;
      super.pathY[0] = var4;
      super.pathTraversed[0] = var2;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "502000680"
   )
   final void method2181(int var1, int var2, boolean var3) {
      if (super.sequence != -1 && InterfaceParent.SequenceDefinition_get(super.sequence).field3565 == 1) {
         super.sequence = -1;
      }

      if (!var3) {
         int var4 = var1 - super.pathX[0];
         int var5 = var2 - super.pathY[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if (super.pathLength < 9) {
               ++super.pathLength;
            }

            for(int var6 = super.pathLength; var6 > 0; --var6) {
               super.pathX[var6] = super.pathX[var6 - 1];
               super.pathY[var6] = super.pathY[var6 - 1];
               super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
            }

            super.pathX[0] = var1;
            super.pathY[0] = var2;
            super.pathTraversed[0] = 1;
            return;
         }
      }

      super.pathLength = 0;
      super.field1012 = 0;
      super.field989 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.x = super.field1007 * 64 + super.pathX[0] * 128;
      super.y = super.field1007 * 64 + super.pathY[0] * 128;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Lef;",
      garbageValue = "127"
   )
   @Export("getModel")
   protected final Model getModel() {
      if (this.definition == null) {
         return null;
      } else {
         SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? InterfaceParent.SequenceDefinition_get(super.sequence) : null;
         SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? InterfaceParent.SequenceDefinition_get(super.movementSequence) : null;
         Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
         if (var3 == null) {
            return null;
         } else {
            var3.calculateBoundsCylinder();
            super.defaultHeight = var3.height;
            if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
               Model var4 = AbstractUserComparator.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
               if (var4 != null) {
                  var4.offsetBy(0, -super.field994, 0);
                  Model[] var5 = new Model[]{var3, var4};
                  var3 = new Model(var5, 2);
               }
            }

            if (this.definition.size == 1) {
               var3.isSingleTile = true;
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-251916247"
   )
   @Export("isVisible")
   final boolean isVisible() {
      return this.definition != null;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)Lbd;",
      garbageValue = "874682655"
   )
   @Export("Messages_getMessage")
   static Message Messages_getMessage(int var0) {
      return (Message)Messages.Messages_hashTable.get((long)var0);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-55"
   )
   public static int method2179(int var0) {
      return GrandExchangeOfferNameComparator.Entity_unpackSceneX(ViewportMouse.ViewportMouse_entityTags[var0]);
   }

   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "51"
   )
   static void method2180(int var0, int var1) {
      if (WorldMapSectionType.clientPreferences.musicVolume != 0 && var0 != -1) {
         ReflectionCheck.method2450(WorldMapManager.archive11, var0, 0, WorldMapSectionType.clientPreferences.musicVolume, false);
         Client.field899 = true;
      }

   }
}
