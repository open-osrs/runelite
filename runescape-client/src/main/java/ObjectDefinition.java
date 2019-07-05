import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("ObjectDefinition")
public class ObjectDefinition extends DualNode {
   @ObfuscatedName("m")
   @Export("ObjectDefinition_isLowDetail")
   static boolean ObjectDefinition_isLowDetail;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   @Export("ObjectDefinition_indexCache")
   static AbstractIndexCache ObjectDefinition_indexCache;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static AbstractIndexCache field640;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ler;"
   )
   @Export("ObjectDefinition_cached")
   static EvictingDualNodeHashTable ObjectDefinition_cached;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Ler;"
   )
   public static EvictingDualNodeHashTable field641;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Ler;"
   )
   static EvictingDualNodeHashTable field642;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ler;"
   )
   @Export("ObjectDefinition_cachedModels")
   static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Ldw;"
   )
   static ModelData[] field643;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -2034835389
   )
   @Export("id")
   public int id;
   @ObfuscatedName("x")
   int[] field644;
   @ObfuscatedName("d")
   int[] field645;
   @ObfuscatedName("k")
   @Export("name")
   public String name;
   @ObfuscatedName("n")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("i")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("a")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("z")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 998026479
   )
   @Export("sizeX")
   public int sizeX;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -301273619
   )
   @Export("sizeY")
   public int sizeY;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -553719901
   )
   @Export("interactType")
   public int interactType;
   @ObfuscatedName("y")
   @Export("boolean1")
   public boolean boolean1;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1419333853
   )
   @Export("int1")
   public int int1;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -268374709
   )
   @Export("clipType")
   int clipType;
   @ObfuscatedName("c")
   @Export("nonFlatShading")
   boolean nonFlatShading;
   @ObfuscatedName("r")
   @Export("modelClipped")
   public boolean modelClipped;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1018236769
   )
   @Export("animationId")
   public int animationId;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 713665805
   )
   @Export("int2")
   public int int2;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 533219139
   )
   @Export("ambient")
   int ambient;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -216646581
   )
   @Export("contrast")
   int contrast;
   @ObfuscatedName("aj")
   @Export("actions")
   public String[] actions;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1737602209
   )
   @Export("mapIconId")
   public int mapIconId;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -324183669
   )
   @Export("mapSceneId")
   public int mapSceneId;
   @ObfuscatedName("ac")
   @Export("isRotated")
   boolean isRotated;
   @ObfuscatedName("ay")
   @Export("clipped")
   public boolean clipped;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1509832827
   )
   @Export("modelSizeX")
   int modelSizeX;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 511434049
   )
   @Export("modelHeight")
   int modelHeight;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1746573233
   )
   @Export("modelSizeY")
   int modelSizeY;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 967376007
   )
   @Export("offsetX")
   int offsetX;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1720702573
   )
   @Export("offsetHeight")
   int offsetHeight;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 818611483
   )
   @Export("offsetY")
   int offsetY;
   @ObfuscatedName("at")
   @Export("boolean2")
   public boolean boolean2;
   @ObfuscatedName("ad")
   @Export("isSolid")
   boolean isSolid;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1455451843
   )
   @Export("int3")
   public int int3;
   @ObfuscatedName("as")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1136644531
   )
   @Export("transformVarbit")
   int transformVarbit;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -2119965579
   )
   @Export("transformConfigId")
   int transformConfigId;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 374616127
   )
   @Export("ambientSoundId")
   public int ambientSoundId;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1990510197
   )
   @Export("int4")
   public int int4;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1519592967
   )
   @Export("int5")
   public int int5;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1201773735
   )
   @Export("int6")
   public int int6;
   @ObfuscatedName("ax")
   public int[] field646;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "Llh;"
   )
   @Export("params")
   IterableNodeHashTable params;

   ObjectDefinition() {
      this.name = "null";
      this.sizeX = 1;
      this.sizeY = 1;
      this.interactType = 2;
      this.boolean1 = true;
      this.int1 = -1;
      this.clipType = -1;
      this.nonFlatShading = false;
      this.modelClipped = false;
      this.animationId = -1;
      this.int2 = 16;
      this.ambient = 0;
      this.contrast = 0;
      this.actions = new String[5];
      this.mapIconId = -1;
      this.mapSceneId = -1;
      this.isRotated = false;
      this.clipped = true;
      this.modelSizeX = 128;
      this.modelHeight = 128;
      this.modelSizeY = 128;
      this.offsetX = 0;
      this.offsetHeight = 0;
      this.offsetY = 0;
      this.boolean2 = false;
      this.isSolid = false;
      this.int3 = -1;
      this.transformVarbit = -1;
      this.transformConfigId = -1;
      this.ambientSoundId = -1;
      this.int4 = 0;
      this.int5 = 0;
      this.int6 = 0;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-245255765"
   )
   @Export("init")
   void init() {
      if (this.int1 == -1) {
         this.int1 = 0;
         if (this.field644 != null && (this.field645 == null || this.field645[0] == 10)) {
            this.int1 = 1;
         }

         for (int var1 = 0; var1 < 5; ++var1) {
            if (this.actions[var1] != null) {
               this.int1 = 1;
            }
         }
      }

      if (this.int3 == -1) {
         this.int3 = this.interactType != 0 ? 1 : 0;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgr;I)V",
      garbageValue = "1210669830"
   )
   @Export("read")
   void read(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.readNext(var1, var2);
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lgr;II)V",
      garbageValue = "-2044409717"
   )
   @Export("readNext")
   void readNext(Buffer var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.readUnsignedByte();
         if (var3 > 0) {
            if (this.field644 != null && !ObjectDefinition_isLowDetail) {
               var1.index += var3 * 3;
            } else {
               this.field645 = new int[var3];
               this.field644 = new int[var3];

               for (var4 = 0; var4 < var3; ++var4) {
                  this.field644[var4] = var1.method43();
                  this.field645[var4] = var1.readUnsignedByte();
               }
            }
         }
      } else if (var2 == 2) {
         this.name = var1.readStringCp1252NullTerminated();
      } else if (var2 == 5) {
         var3 = var1.readUnsignedByte();
         if (var3 > 0) {
            if (this.field644 != null && !ObjectDefinition_isLowDetail) {
               var1.index += var3 * 2;
            } else {
               this.field645 = null;
               this.field644 = new int[var3];

               for (var4 = 0; var4 < var3; ++var4) {
                  this.field644[var4] = var1.method43();
               }
            }
         }
      } else if (var2 == 14) {
         this.sizeX = var1.readUnsignedByte();
      } else if (var2 == 15) {
         this.sizeY = var1.readUnsignedByte();
      } else if (var2 == 17) {
         this.interactType = 0;
         this.boolean1 = false;
      } else if (var2 == 18) {
         this.boolean1 = false;
      } else if (var2 == 19) {
         this.int1 = var1.readUnsignedByte();
      } else if (var2 == 21) {
         this.clipType = 0;
      } else if (var2 == 22) {
         this.nonFlatShading = true;
      } else if (var2 == 23) {
         this.modelClipped = true;
      } else if (var2 == 24) {
         this.animationId = var1.method43();
         if (this.animationId == 65535) {
            this.animationId = -1;
         }
      } else if (var2 == 27) {
         this.interactType = 1;
      } else if (var2 == 28) {
         this.int2 = var1.readUnsignedByte();
      } else if (var2 == 29) {
         this.ambient = var1.readByte();
      } else if (var2 == 39) {
         this.contrast = var1.readByte() * 25;
      } else if (var2 >= 30 && var2 < 35) {
         this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
         if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.actions[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.readUnsignedByte();
         this.recolorFrom = new short[var3];
         this.recolorTo = new short[var3];

         for (var4 = 0; var4 < var3; ++var4) {
            this.recolorFrom[var4] = (short)var1.method43();
            this.recolorTo[var4] = (short)var1.method43();
         }
      } else if (var2 == 41) {
         var3 = var1.readUnsignedByte();
         this.retextureFrom = new short[var3];
         this.retextureTo = new short[var3];

         for (var4 = 0; var4 < var3; ++var4) {
            this.retextureFrom[var4] = (short)var1.method43();
            this.retextureTo[var4] = (short)var1.method43();
         }
      } else if (var2 == 62) {
         this.isRotated = true;
      } else if (var2 == 64) {
         this.clipped = false;
      } else if (var2 == 65) {
         this.modelSizeX = var1.method43();
      } else if (var2 == 66) {
         this.modelHeight = var1.method43();
      } else if (var2 == 67) {
         this.modelSizeY = var1.method43();
      } else if (var2 == 68) {
         this.mapSceneId = var1.method43();
      } else if (var2 == 69) {
         var1.readUnsignedByte();
      } else if (var2 == 70) {
         this.offsetX = var1.method44();
      } else if (var2 == 71) {
         this.offsetHeight = var1.method44();
      } else if (var2 == 72) {
         this.offsetY = var1.method44();
      } else if (var2 == 73) {
         this.boolean2 = true;
      } else if (var2 == 74) {
         this.isSolid = true;
      } else if (var2 == 75) {
         this.int3 = var1.readUnsignedByte();
      } else if (var2 != 77 && var2 != 92) {
         if (var2 == 78) {
            this.ambientSoundId = var1.method43();
            this.int4 = var1.readUnsignedByte();
         } else if (var2 == 79) {
            this.int5 = var1.method43();
            this.int6 = var1.method43();
            this.int4 = var1.readUnsignedByte();
            var3 = var1.readUnsignedByte();
            this.field646 = new int[var3];

            for (var4 = 0; var4 < var3; ++var4) {
               this.field646[var4] = var1.method43();
            }
         } else if (var2 == 81) {
            this.clipType = var1.readUnsignedByte() * 256;
         } else if (var2 == 82) {
            this.mapIconId = var1.method43();
         } else if (var2 == 249) {
            this.params = AbstractIndexCache.readStringIntParameters(var1, this.params);
         }
      } else {
         this.transformVarbit = var1.method43();
         if (this.transformVarbit == 65535) {
            this.transformVarbit = -1;
         }

         this.transformConfigId = var1.method43();
         if (this.transformConfigId == 65535) {
            this.transformConfigId = -1;
         }

         var3 = -1;
         if (var2 == 92) {
            var3 = var1.method43();
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.readUnsignedByte();
         this.transforms = new int[var4 + 2];

         for (int var5 = 0; var5 <= var4; ++var5) {
            this.transforms[var5] = var1.method43();
            if (this.transforms[var5] == 65535) {
               this.transforms[var5] = -1;
            }
         }

         this.transforms[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1880172029"
   )
   public final boolean method230(int var1) {
      if (this.field645 != null) {
         for (int var4 = 0; var4 < this.field645.length; ++var4) {
            if (this.field645[var4] == var1) {
               return field640.tryLoadRecord(this.field644[var4] & 65535, 0);
            }
         }

         return true;
      } else if (this.field644 == null) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var2 = true;

         for (int var3 = 0; var3 < this.field644.length; ++var3) {
            var2 &= field640.tryLoadRecord(this.field644[var3] & 65535, 0);
         }

         return var2;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-666846742"
   )
   public final boolean method231() {
      if (this.field644 == null) {
         return true;
      } else {
         boolean var1 = true;

         for (int var2 = 0; var2 < this.field644.length; ++var2) {
            var1 &= field640.tryLoadRecord(this.field644[var2] & 65535, 0);
         }

         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II[[IIIIS)Lex;",
      garbageValue = "-27831"
   )
   public final Entity method232(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.field645 == null) {
         var7 = (long)(var2 + (this.id << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Object var9 = (Entity)field642.get(var7);
      if (var9 == null) {
         ModelData var10 = this.getModelData(var1, var2);
         if (var10 == null) {
            return null;
         }

         if (!this.nonFlatShading) {
            var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         } else {
            var10.field559 = (short)(this.ambient + 64);
            var10.field560 = (short)(this.contrast + 768);
            var10.method216();
            var9 = var10;
         }

         field642.put((DualNode)var9, var7);
      }

      if (this.nonFlatShading) {
         var9 = ((ModelData)var9).method206();
      }

      if (this.clipType >= 0) {
         if (var9 instanceof Model) {
            var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
         } else if (var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method207(var3, var4, var5, var6, true, this.clipType);
         }
      }

      return (Entity)var9;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II[[IIIIB)Ldu;",
      garbageValue = "0"
   )
   @Export("getModel")
   public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.field645 == null) {
         var7 = (long)(var2 + (this.id << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Model var9 = (Model)ObjectDefinition_cachedModels.get(var7);
      if (var9 == null) {
         ModelData var10 = this.getModelData(var1, var2);
         if (var10 == null) {
            return null;
         }

         var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         ObjectDefinition_cachedModels.put(var9, var7);
      }

      if (this.clipType >= 0) {
         var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType);
      }

      return var9;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II[[IIIILjh;II)Ldu;",
      garbageValue = "1045723499"
   )
   @Export("getModelDynamic")
   public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
      long var9;
      if (this.field645 == null) {
         var9 = (long)(var2 + (this.id << 10));
      } else {
         var9 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Model var11 = (Model)ObjectDefinition_cachedModels.get(var9);
      if (var11 == null) {
         ModelData var12 = this.getModelData(var1, var2);
         if (var12 == null) {
            return null;
         }

         var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         ObjectDefinition_cachedModels.put(var11, var9);
      }

      if (var7 == null && this.clipType == -1) {
         return var11;
      } else {
         if (var7 != null) {
            var11 = var7.animateObject(var11, var8, var2);
         } else {
            var11 = var11.toSharedSequenceModel(true);
         }

         if (this.clipType >= 0) {
            var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
         }

         return var11;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IIB)Ldw;",
      garbageValue = "6"
   )
   @Export("getModelData")
   final ModelData getModelData(int var1, int var2) {
      ModelData var3 = null;
      boolean var4;
      int var5;
      int var6;
      int var7;
      if (this.field645 == null) {
         if (var1 != 10) {
            return null;
         }

         if (this.field644 == null) {
            return null;
         }

         var4 = this.isRotated;
         if (var1 == 2 && var2 > 3) {
            var4 = !var4;
         }

         var5 = this.field644.length;

         for (var7 = 0; var7 < var5; ++var7) {
            var6 = this.field644[var7];
            if (var4) {
               var6 += 65536;
            }

            var3 = (ModelData)field641.get((long)var6);
            if (var3 == null) {
               var3 = ModelData.method2788(field640, var6 & 65535, 0);
               if (var3 == null) {
                  return null;
               }

               if (var4) {
                  var3.method214();
               }

               field641.put(var3, (long)var6);
            }

            if (var5 > 1) {
               field643[var7] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new ModelData(field643, var5);
         }
      } else {
         var7 = -1;

         for (var5 = 0; var5 < this.field645.length; ++var5) {
            if (this.field645[var5] == var1) {
               var7 = var5;
               break;
            }
         }

         if (var7 == -1) {
            return null;
         }

         var5 = this.field644[var7];
         boolean var8 = this.isRotated ^ var2 > 3;
         if (var8) {
            var5 += 65536;
         }

         var3 = (ModelData)field641.get((long)var5);
         if (var3 == null) {
            var3 = ModelData.method2788(field640, var5 & 65535, 0);
            if (var3 == null) {
               return null;
            }

            if (var8) {
               var3.method214();
            }

            field641.put(var3, (long)var5);
         }
      }

      if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) {
         var4 = false;
      } else {
         var4 = true;
      }

      boolean var10;
      if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) {
         var10 = false;
      } else {
         var10 = true;
      }

      ModelData var9 = new ModelData(var3, var2 == 0 && !var4 && !var10, this.recolorFrom == null, null == this.retextureFrom, true);
      if (var1 == 4 && var2 > 3) {
         var9.method212(256);
         var9.method213(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var9.method209();
      } else if (var2 == 2) {
         var9.method210();
      } else if (var2 == 3) {
         var9.method211();
      }

      if (this.recolorFrom != null) {
         for (var6 = 0; var6 < this.recolorFrom.length; ++var6) {
            var9.recolor(this.recolorFrom[var6], this.recolorTo[var6]);
         }
      }

      if (this.retextureFrom != null) {
         for (var6 = 0; var6 < this.retextureFrom.length; ++var6) {
            var9.retexture(this.retextureFrom[var6], this.retextureTo[var6]);
         }
      }

      if (var4) {
         var9.method215(this.modelSizeX, this.modelHeight, this.modelSizeY);
      }

      if (var10) {
         var9.method213(this.offsetX, this.offsetHeight, this.offsetY);
      }

      return var9;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)Ljr;",
      garbageValue = "-107"
   )
   @Export("transform")
   public final ObjectDefinition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = WorldMapSection2.getVarbit(this.transformVarbit);
      } else if (this.transformConfigId != -1) {
         var1 = Varps.Varps_main[this.transformConfigId];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? class50.getObjectDefinition(var2) : null;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-52"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      IterableNodeHashTable var3 = this.params;
      int var4;
      if (var3 == null) {
         var4 = var2;
      } else {
         IntegerNode var5 = (IntegerNode)var3.get((long)var1);
         if (var5 == null) {
            var4 = var2;
         } else {
            var4 = var5.integer;
         }
      }

      return var4;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1961654631"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return Frames.method3238(this.params, var1, var2);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "8470625"
   )
   public boolean method233() {
      if (this.transforms == null) {
         return this.ambientSoundId != -1 || this.field646 != null;
      } else {
         for (int var1 = 0; var1 < this.transforms.length; ++var1) {
            if (this.transforms[var1] != -1) {
               ObjectDefinition var2 = class50.getObjectDefinition(this.transforms[var1]);
               if (var2.ambientSoundId != -1 || var2.field646 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljz;",
      garbageValue = "-1284680749"
   )
   @Export("getNpcDefinition")
   public static NPCDefinition getNpcDefinition(int var0) {
      NPCDefinition var1 = (NPCDefinition)NPCDefinition.NpcDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = NPCDefinition.NpcDefinition_indexCache.takeRecord(9, var0);
         var1 = new NPCDefinition();
         var1.id = var0;
         if (var2 != null) {
            var1.read(new Buffer(var2));
         }

         var1.init();
         NPCDefinition.NpcDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   public static void method5041() {
      ItemDefinition.Sprite_cached.clear();
   }

   static {
      ObjectDefinition_isLowDetail = false;
      ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
      field641 = new EvictingDualNodeHashTable(500);
      field642 = new EvictingDualNodeHashTable(30);
      ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
      field643 = new ModelData[4];
   }
}
