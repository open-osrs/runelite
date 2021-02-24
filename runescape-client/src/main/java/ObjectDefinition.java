import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("ObjectDefinition")
public class ObjectDefinition extends DualNode {
   @ObfuscatedName("n")
   @Export("ObjectDefinition_isLowDetail")
   static boolean ObjectDefinition_isLowDetail = false;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("ObjectDefinition_archive")
   static AbstractArchive ObjectDefinition_archive;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("ObjectDefinition_modelsArchive")
   static AbstractArchive ObjectDefinition_modelsArchive;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("ObjectDefinition_cached")
   public static EvictingDualNodeHashTable ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("ObjectDefinition_cachedModelData")
   public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("ObjectDefinition_cachedEntities")
   public static EvictingDualNodeHashTable ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("ObjectDefinition_cachedModels")
   public static EvictingDualNodeHashTable ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "[Lek;"
   )
   static ModelData[] field3410 = new ModelData[4];
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -448703229
   )
   @Export("id")
   public int id;
   @ObfuscatedName("l")
   @Export("modelIds")
   int[] modelIds;
   @ObfuscatedName("s")
   @Export("models")
   int[] models;
   @ObfuscatedName("b")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("a")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("w")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("k")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("i")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 298630257
   )
   @Export("sizeX")
   public int sizeX = 1;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1328331405
   )
   @Export("sizeY")
   public int sizeY = 1;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 270471379
   )
   @Export("interactType")
   public int interactType = 2;
   @ObfuscatedName("u")
   @Export("boolean1")
   public boolean boolean1 = true;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 49633811
   )
   @Export("int1")
   public int int1 = -1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1668805195
   )
   @Export("clipType")
   int clipType = -1;
   @ObfuscatedName("m")
   @Export("nonFlatShading")
   boolean nonFlatShading = false;
   @ObfuscatedName("r")
   @Export("modelClipped")
   public boolean modelClipped = false;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 581638001
   )
   @Export("animationId")
   public int animationId = -1;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -211640911
   )
   @Export("int2")
   public int int2 = 16;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 453955421
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1979235761
   )
   @Export("contrast")
   int contrast = 0;
   @ObfuscatedName("ag")
   @Export("actions")
   public String[] actions = new String[5];
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 2137777107
   )
   @Export("mapIconId")
   public int mapIconId = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 59768053
   )
   @Export("mapSceneId")
   public int mapSceneId = -1;
   @ObfuscatedName("aq")
   @Export("isRotated")
   boolean isRotated = false;
   @ObfuscatedName("at")
   @Export("clipped")
   public boolean clipped = true;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1499464739
   )
   @Export("modelSizeX")
   int modelSizeX = 128;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -561367673
   )
   @Export("modelHeight")
   int modelHeight = 128;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1882279433
   )
   @Export("modelSizeY")
   int modelSizeY = 128;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1934528115
   )
   @Export("offsetX")
   int offsetX = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1408363841
   )
   @Export("offsetHeight")
   int offsetHeight = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1403538025
   )
   @Export("offsetY")
   int offsetY = 0;
   @ObfuscatedName("aw")
   @Export("boolean2")
   public boolean boolean2 = false;
   @ObfuscatedName("az")
   @Export("isSolid")
   boolean isSolid = false;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1437084271
   )
   @Export("int3")
   public int int3 = -1;
   @ObfuscatedName("ap")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -351065157
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 759778209
   )
   @Export("transformVarp")
   int transformVarp = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 411474029
   )
   @Export("ambientSoundId")
   public int ambientSoundId = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 968058385
   )
   @Export("int4")
   public int int4 = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 693369209
   )
   @Export("int5")
   public int int5 = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1791348031
   )
   @Export("int6")
   public int int6 = 0;
   @ObfuscatedName("af")
   @Export("soundEffectIds")
   public int[] soundEffectIds;
   @ObfuscatedName("av")
   public boolean field3429 = true;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("params")
   IterableNodeHashTable params;

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-80"
   )
   @Export("postDecode")
   void postDecode() {
      if (this.int1 == -1) {
         this.int1 = 0;
         if (this.modelIds != null && (this.models == null || this.models[0] == 10)) {
            this.int1 = 1;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if (this.actions[var1] != null) {
               this.int1 = 1;
            }
         }
      }

      if (this.int3 == -1) {
         this.int3 = this.interactType != 0 ? 1 : 0;
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lkx;B)V",
      garbageValue = "0"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lkx;II)V",
      garbageValue = "504124934"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.readUnsignedByte();
         if (var3 > 0) {
            if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
               var1.offset += 3 * var3;
            } else {
               this.models = new int[var3];
               this.modelIds = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.modelIds[var4] = var1.readUnsignedShort();
                  this.models[var4] = var1.readUnsignedByte();
               }
            }
         }
      } else if (var2 == 2) {
         this.name = var1.readStringCp1252NullTerminated();
      } else if (var2 == 5) {
         var3 = var1.readUnsignedByte();
         if (var3 > 0) {
            if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
               var1.offset += var3 * 2;
            } else {
               this.models = null;
               this.modelIds = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.modelIds[var4] = var1.readUnsignedShort();
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
         this.animationId = var1.readUnsignedShort();
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

         for(var4 = 0; var4 < var3; ++var4) {
            this.recolorFrom[var4] = (short)var1.readUnsignedShort();
            this.recolorTo[var4] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 41) {
         var3 = var1.readUnsignedByte();
         this.retextureFrom = new short[var3];
         this.retextureTo = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.retextureFrom[var4] = (short)var1.readUnsignedShort();
            this.retextureTo[var4] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 62) {
         this.isRotated = true;
      } else if (var2 == 64) {
         this.clipped = false;
      } else if (var2 == 65) {
         this.modelSizeX = var1.readUnsignedShort();
      } else if (var2 == 66) {
         this.modelHeight = var1.readUnsignedShort();
      } else if (var2 == 67) {
         this.modelSizeY = var1.readUnsignedShort();
      } else if (var2 == 68) {
         this.mapSceneId = var1.readUnsignedShort();
      } else if (var2 == 69) {
         var1.readUnsignedByte();
      } else if (var2 == 70) {
         this.offsetX = var1.readShort();
      } else if (var2 == 71) {
         this.offsetHeight = var1.readShort();
      } else if (var2 == 72) {
         this.offsetY = var1.readShort();
      } else if (var2 == 73) {
         this.boolean2 = true;
      } else if (var2 == 74) {
         this.isSolid = true;
      } else if (var2 == 75) {
         this.int3 = var1.readUnsignedByte();
      } else if (var2 != 77 && var2 != 92) {
         if (var2 == 78) {
            this.ambientSoundId = var1.readUnsignedShort();
            this.int4 = var1.readUnsignedByte();
         } else if (var2 == 79) {
            this.int5 = var1.readUnsignedShort();
            this.int6 = var1.readUnsignedShort();
            this.int4 = var1.readUnsignedByte();
            var3 = var1.readUnsignedByte();
            this.soundEffectIds = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.soundEffectIds[var4] = var1.readUnsignedShort();
            }
         } else if (var2 == 81) {
            this.clipType = var1.readUnsignedByte() * 256;
         } else if (var2 == 82) {
            this.mapIconId = var1.readUnsignedShort();
         } else if (var2 == 89) {
            this.field3429 = false;
         } else if (var2 == 249) {
            this.params = TextureProvider.readStringIntParameters(var1, this.params);
         }
      } else {
         this.transformVarbit = var1.readUnsignedShort();
         if (this.transformVarbit == 65535) {
            this.transformVarbit = -1;
         }

         this.transformVarp = var1.readUnsignedShort();
         if (this.transformVarp == 65535) {
            this.transformVarp = -1;
         }

         var3 = -1;
         if (var2 == 92) {
            var3 = var1.readUnsignedShort();
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.readUnsignedByte();
         this.transforms = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.transforms[var5] = var1.readUnsignedShort();
            if (this.transforms[var5] == 65535) {
               this.transforms[var5] = -1;
            }
         }

         this.transforms[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2131864128"
   )
   public final boolean method4806(int var1) {
      if (this.models != null) {
         for(int var4 = 0; var4 < this.models.length; ++var4) {
            if (this.models[var4] == var1) {
               return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & '\uffff', 0);
            }
         }

         return true;
      } else if (this.modelIds == null) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.modelIds.length; ++var3) {
            var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "2"
   )
   @Export("needsModelFiles")
   public final boolean needsModelFiles() {
      if (this.modelIds == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.modelIds.length; ++var2) {
            var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & '\uffff', 0);
         }

         return var1;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II[[IIIII)Lem;",
      garbageValue = "2086147511"
   )
   @Export("getEntity")
   public final Entity getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.models == null) {
         var7 = (long)(var2 + (this.id << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Object var9 = (Entity)ObjectDefinition_cachedEntities.get(var7);
      if (var9 == null) {
         ModelData var10 = this.getModelData(var1, var2);
         if (var10 == null) {
            return null;
         }

         if (!this.nonFlatShading) {
            var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         } else {
            var10.ambient = (short)(this.ambient + 64);
            var10.contrast = (short)(this.contrast + 768);
            var10.calculateVertexNormals();
            var9 = var10;
         }

         ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
      }

      if (this.nonFlatShading) {
         var9 = ((ModelData)var9).method2945();
      }

      if (this.clipType * 65536 >= 0) {
         if (var9 instanceof Model) {
            var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
         } else if (var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method2946(var3, var4, var5, var6, true, this.clipType * 65536);
         }
      }

      return (Entity)var9;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(II[[IIIII)Lef;",
      garbageValue = "-1813150019"
   )
   @Export("getModel")
   public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.models == null) {
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

      if (this.clipType * 65536 >= 0) {
         var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
      }

      return var9;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(II[[IIIILjs;II)Lef;",
      garbageValue = "1938080829"
   )
   @Export("getModelDynamic")
   public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
      long var9;
      if (this.models == null) {
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

      if (var7 == null && this.clipType * 65536 == -1) {
         return var11;
      } else {
         if (var7 != null) {
            var11 = var7.transformObjectModel(var11, var8, var2);
         } else {
            var11 = var11.toSharedSequenceModel(true);
         }

         if (this.clipType * 65536 >= 0) {
            var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 65536);
         }

         return var11;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(III)Lek;",
      garbageValue = "-1880429080"
   )
   @Export("getModelData")
   final ModelData getModelData(int var1, int var2) {
      ModelData var3 = null;
      boolean var4;
      int var5;
      int var7;
      if (this.models == null) {
         if (var1 != 10) {
            return null;
         }

         if (this.modelIds == null) {
            return null;
         }

         var4 = this.isRotated;
         if (var1 == 2 && var2 > 3) {
            var4 = !var4;
         }

         var5 = this.modelIds.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            var7 = this.modelIds[var6];
            if (var4) {
               var7 += 65536;
            }

            var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7);
            if (var3 == null) {
               var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & '\uffff', 0);
               if (var3 == null) {
                  return null;
               }

               if (var4) {
                  var3.method2989();
               }

               ObjectDefinition_cachedModelData.put(var3, (long)var7);
            }

            if (var5 > 1) {
               field3410[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new ModelData(field3410, var5);
         }
      } else {
         int var9 = -1;

         for(var5 = 0; var5 < this.models.length; ++var5) {
            if (this.models[var5] == var1) {
               var9 = var5;
               break;
            }
         }

         if (var9 == -1) {
            return null;
         }

         var5 = this.modelIds[var9];
         boolean var10 = this.isRotated ^ var2 > 3;
         if (var10) {
            var5 += 65536;
         }

         var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5);
         if (var3 == null) {
            var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & '\uffff', 0);
            if (var3 == null) {
               return null;
            }

            if (var10) {
               var3.method2989();
            }

            ObjectDefinition_cachedModelData.put(var3, (long)var5);
         }
      }

      if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) {
         var4 = false;
      } else {
         var4 = true;
      }

      boolean var11;
      if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, this.retextureFrom == null, true);
      if (var1 == 4 && var2 > 3) {
         var8.method2951(256);
         var8.changeOffset(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var8.method2948();
      } else if (var2 == 2) {
         var8.method2949();
      } else if (var2 == 3) {
         var8.method3006();
      }

      if (this.recolorFrom != null) {
         for(var7 = 0; var7 < this.recolorFrom.length; ++var7) {
            var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
         }
      }

      if (this.retextureFrom != null) {
         for(var7 = 0; var7 < this.retextureFrom.length; ++var7) {
            var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
         }
      }

      if (var4) {
         var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
      }

      if (var11) {
         var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
      }

      return var8;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)Ljg;",
      garbageValue = "-1578474044"
   )
   @Export("transform")
   public final ObjectDefinition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = FontName.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? WorldMapAreaData.getObjectDefinition(var2) : null;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "495952846"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      IterableNodeHashTable var4 = this.params;
      int var3;
      if (var4 == null) {
         var3 = var2;
      } else {
         IntegerNode var5 = (IntegerNode)var4.get((long)var1);
         if (var5 == null) {
            var3 = var2;
         } else {
            var3 = var5.integer;
         }
      }

      return var3;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "244944647"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return class69.method1258(this.params, var1, var2);
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1187773047"
   )
   @Export("hasSound")
   public boolean hasSound() {
      if (this.transforms == null) {
         return this.ambientSoundId != -1 || this.soundEffectIds != null;
      } else {
         for(int var1 = 0; var1 < this.transforms.length; ++var1) {
            if (this.transforms[var1] != -1) {
               ObjectDefinition var2 = WorldMapAreaData.getObjectDefinition(this.transforms[var1]);
               if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;II[BII)I",
      garbageValue = "-314683087"
   )
   @Export("encodeStringCp1252")
   public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
            var3[var6 + var4] = (byte)var7;
         } else if (var7 == 8364) {
            var3[var6 + var4] = -128;
         } else if (var7 == 8218) {
            var3[var6 + var4] = -126;
         } else if (var7 == 402) {
            var3[var6 + var4] = -125;
         } else if (var7 == 8222) {
            var3[var6 + var4] = -124;
         } else if (var7 == 8230) {
            var3[var6 + var4] = -123;
         } else if (var7 == 8224) {
            var3[var6 + var4] = -122;
         } else if (var7 == 8225) {
            var3[var6 + var4] = -121;
         } else if (var7 == 710) {
            var3[var6 + var4] = -120;
         } else if (var7 == 8240) {
            var3[var6 + var4] = -119;
         } else if (var7 == 352) {
            var3[var6 + var4] = -118;
         } else if (var7 == 8249) {
            var3[var6 + var4] = -117;
         } else if (var7 == 338) {
            var3[var6 + var4] = -116;
         } else if (var7 == 381) {
            var3[var6 + var4] = -114;
         } else if (var7 == 8216) {
            var3[var6 + var4] = -111;
         } else if (var7 == 8217) {
            var3[var6 + var4] = -110;
         } else if (var7 == 8220) {
            var3[var6 + var4] = -109;
         } else if (var7 == 8221) {
            var3[var6 + var4] = -108;
         } else if (var7 == 8226) {
            var3[var6 + var4] = -107;
         } else if (var7 == 8211) {
            var3[var6 + var4] = -106;
         } else if (var7 == 8212) {
            var3[var6 + var4] = -105;
         } else if (var7 == 732) {
            var3[var6 + var4] = -104;
         } else if (var7 == 8482) {
            var3[var6 + var4] = -103;
         } else if (var7 == 353) {
            var3[var6 + var4] = -102;
         } else if (var7 == 8250) {
            var3[var6 + var4] = -101;
         } else if (var7 == 339) {
            var3[var6 + var4] = -100;
         } else if (var7 == 382) {
            var3[var6 + var4] = -98;
         } else if (var7 == 376) {
            var3[var6 + var4] = -97;
         } else {
            var3[var6 + var4] = 63;
         }
      }

      return var5;
   }
}
