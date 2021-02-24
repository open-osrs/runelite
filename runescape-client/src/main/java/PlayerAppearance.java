import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("PlayerAppearance")
public class PlayerAppearance {
   @ObfuscatedName("nn")
   @ObfuscatedGetter(
      intValue = 458719567
   )
   @Export("widgetDragDuration")
   static int widgetDragDuration;
   @ObfuscatedName("z")
   public static short[] field2565;
   @ObfuscatedName("s")
   @Export("equipmentIndices")
   static final int[] equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("PlayerAppearance_cachedModels")
   public static EvictingDualNodeHashTable PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive3")
   static Archive archive3;
   @ObfuscatedName("n")
   @Export("equipment")
   int[] equipment;
   @ObfuscatedName("v")
   @Export("bodyColors")
   int[] bodyColors;
   @ObfuscatedName("d")
   @Export("isFemale")
   public boolean isFemale;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -690765261
   )
   @Export("npcTransformId")
   public int npcTransformId;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      longValue = -999355041191352595L
   )
   @Export("hash")
   long hash;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -9216110116012845385L
   )
   long field2567;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([I[IZII)V",
      garbageValue = "201187402"
   )
   @Export("update")
   public void update(int[] var1, int[] var2, boolean var3, int var4) {
      if (var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
               KitDefinition var7 = Client.KitDefinition_get(var6);
               if (var7 != null && !var7.nonSelectable && var5 + (var3 ? 7 : 0) == var7.bodypartID) {
                  var1[equipmentIndices[var5]] = var6 + 256;
                  break;
               }
            }
         }
      }

      this.equipment = var1;
      this.bodyColors = var2;
      this.isFemale = var3;
      this.npcTransformId = var4;
      this.setHash();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IZB)V",
      garbageValue = "2"
   )
   @Export("changeAppearance")
   public void changeAppearance(int var1, boolean var2) {
      if (var1 != 1 || !this.isFemale) {
         int var3 = this.equipment[equipmentIndices[var1]];
         if (var3 != 0) {
            var3 -= 256;

            KitDefinition var4;
            do {
               if (!var2) {
                  --var3;
                  if (var3 < 0) {
                     var3 = KitDefinition.KitDefinition_fileCount - 1;
                  }
               } else {
                  ++var3;
                  if (var3 >= KitDefinition.KitDefinition_fileCount) {
                     var3 = 0;
                  }
               }

               var4 = Client.KitDefinition_get(var3);
            } while(var4 == null || var4.nonSelectable || var4.bodypartID != var1 + (this.isFemale ? 7 : 0));

            this.equipment[equipmentIndices[var1]] = var3 + 256;
            this.setHash();
         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "1851941979"
   )
   public void method4206(int var1, boolean var2) {
      int var3 = this.bodyColors[var1];
      boolean var4;
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = class105.field1339[var1].length - 1;
            }

            if (var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if (var3 >= class105.field1339[var1].length) {
               var3 = 0;
            }

            if (var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.bodyColors[var1] = var3;
      this.setHash();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "50"
   )
   @Export("changeSex")
   public void changeSex(boolean var1) {
      if (this.isFemale != var1) {
         this.update((int[])null, this.bodyColors, var1, -1);
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "1010099742"
   )
   @Export("write")
   public void write(Buffer var1) {
      var1.writeByte(this.isFemale ? 1 : 0);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.equipment[equipmentIndices[var2]];
         if (var3 == 0) {
            var1.writeByte(-1);
         } else {
            var1.writeByte(var3 - 256);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.writeByte(this.bodyColors[var2]);
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "90"
   )
   @Export("setHash")
   void setHash() {
      long var1 = this.hash;
      int var3 = this.equipment[5];
      int var4 = this.equipment[9];
      this.equipment[5] = var4;
      this.equipment[9] = var3;
      this.hash = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.hash <<= 4;
         if (this.equipment[var5] >= 256) {
            this.hash += (long)(this.equipment[var5] - 256);
         }
      }

      if (this.equipment[0] >= 256) {
         this.hash += (long)(this.equipment[0] - 256 >> 4);
      }

      if (this.equipment[1] >= 256) {
         this.hash += (long)(this.equipment[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.hash <<= 3;
         this.hash += (long)this.bodyColors[var5];
      }

      this.hash <<= 1;
      this.hash += (long)(this.isFemale ? 1 : 0);
      this.equipment[5] = var3;
      this.equipment[9] = var4;
      if (0L != var1 && var1 != this.hash) {
         PlayerAppearance_cachedModels.remove(var1);
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Ljs;ILjs;IB)Lef;",
      garbageValue = "-34"
   )
   @Export("getModel")
   public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
      if (this.npcTransformId != -1) {
         return class90.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
      } else {
         long var5 = this.hash;
         int[] var7 = this.equipment;
         if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
            var7 = new int[12];

            for(int var8 = 0; var8 < 12; ++var8) {
               var7[var8] = this.equipment[var8];
            }

            if (var1.shield >= 0) {
               var5 += (long)(var1.shield - this.equipment[5] << 40);
               var7[5] = var1.shield;
            }

            if (var1.weapon >= 0) {
               var5 += (long)(var1.weapon - this.equipment[3] << 48);
               var7[3] = var1.weapon;
            }
         }

         Model var15 = (Model)PlayerAppearance_cachedModels.get(var5);
         if (var15 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if (var11 >= 256 && var11 < 512 && !Client.KitDefinition_get(var11 - 256).ready()) {
                  var9 = true;
               }

               if (var11 >= 512 && !class281.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) {
                  var9 = true;
               }
            }

            if (var9) {
               if (-1L != this.field2567) {
                  var15 = (Model)PlayerAppearance_cachedModels.get(this.field2567);
               }

               if (var15 == null) {
                  return null;
               }
            }

            if (var15 == null) {
               ModelData[] var16 = new ModelData[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  ModelData var14;
                  if (var13 >= 256 && var13 < 512) {
                     var14 = Client.KitDefinition_get(var13 - 256).getModelData();
                     if (var14 != null) {
                        var16[var11++] = var14;
                     }
                  }

                  if (var13 >= 512) {
                     var14 = class281.ItemDefinition_get(var13 - 512).method4866(this.isFemale);
                     if (var14 != null) {
                        var16[var11++] = var14;
                     }
                  }
               }

               ModelData var17 = new ModelData(var16, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if (this.bodyColors[var13] < class105.field1339[var13].length) {
                     var17.recolor(field2565[var13], class105.field1339[var13][this.bodyColors[var13]]);
                  }

                  if (this.bodyColors[var13] < WorldMapSprite.field259[var13].length) {
                     var17.recolor(HealthBar.field1143[var13], WorldMapSprite.field259[var13][this.bodyColors[var13]]);
                  }
               }

               var15 = var17.toModel(64, 850, -30, -50, -30);
               PlayerAppearance_cachedModels.put(var15, var5);
               this.field2567 = var5;
            }
         }

         if (var1 == null && var3 == null) {
            return var15;
         } else {
            Model var18;
            if (var1 != null && var3 != null) {
               var18 = var1.applyTransformations(var15, var2, var3, var4);
            } else if (var1 != null) {
               var18 = var1.transformActorModel(var15, var2);
            } else {
               var18 = var3.transformActorModel(var15, var4);
            }

            return var18;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Lek;",
      garbageValue = "1513420182"
   )
   @Export("getModelData")
   ModelData getModelData() {
      if (this.npcTransformId != -1) {
         return class90.getNpcDefinition(this.npcTransformId).getModelData();
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.equipment[var2];
            if (var3 >= 256 && var3 < 512 && !Client.KitDefinition_get(var3 - 256).method4640()) {
               var1 = true;
            }

            if (var3 >= 512 && !class281.ItemDefinition_get(var3 - 512).method4879(this.isFemale)) {
               var1 = true;
            }
         }

         if (var1) {
            return null;
         } else {
            ModelData[] var7 = new ModelData[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.equipment[var4];
               ModelData var6;
               if (var5 >= 256 && var5 < 512) {
                  var6 = Client.KitDefinition_get(var5 - 256).getKitDefinitionModels();
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if (var5 >= 512) {
                  var6 = class281.ItemDefinition_get(var5 - 512).method4880(this.isFemale);
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            ModelData var8 = new ModelData(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.bodyColors[var5] < class105.field1339[var5].length) {
                  var8.recolor(field2565[var5], class105.field1339[var5][this.bodyColors[var5]]);
               }

               if (this.bodyColors[var5] < WorldMapSprite.field259[var5].length) {
                  var8.recolor(HealthBar.field1143[var5], WorldMapSprite.field259[var5][this.bodyColors[var5]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1390124562"
   )
   @Export("getChatHeadId")
   public int getChatHeadId() {
      return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + class90.getNpcDefinition(this.npcTransformId).id;
   }
}
