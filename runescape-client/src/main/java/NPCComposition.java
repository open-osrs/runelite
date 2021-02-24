import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("NpcDefinition_archive")
   static AbstractArchive NpcDefinition_archive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("NpcDefinition_modelArchive")
   static AbstractArchive NpcDefinition_modelArchive;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("NpcDefinition_cached")
   public static EvictingDualNodeHashTable NpcDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("NpcDefinition_cachedModels")
   public static EvictingDualNodeHashTable NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("clientLanguage")
   static Language clientLanguage;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 24232169
   )
   @Export("id")
   public int id;
   @ObfuscatedName("h")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 2004298727
   )
   @Export("size")
   public int size = 1;
   @ObfuscatedName("e")
   @Export("models")
   int[] models;
   @ObfuscatedName("q")
   int[] field3505;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1510853809
   )
   @Export("idleSequence")
   public int idleSequence = -1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1120127837
   )
   @Export("turnLeftSequence")
   public int turnLeftSequence = -1;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1037555383
   )
   @Export("turnRightSequence")
   public int turnRightSequence = -1;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1864602667
   )
   @Export("walkSequence")
   public int walkSequence = -1;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1620043443
   )
   @Export("walkBackSequence")
   public int walkBackSequence = -1;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -934098427
   )
   @Export("walkLeftSequence")
   public int walkLeftSequence = -1;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 549437629
   )
   @Export("walkRightSequence")
   public int walkRightSequence = -1;
   @ObfuscatedName("x")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("f")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("g")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("u")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("t")
   @Export("actions")
   public String[] actions = new String[5];
   @ObfuscatedName("p")
   @Export("drawMapDot")
   public boolean drawMapDot = true;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1257946639
   )
   @Export("combatLevel")
   public int combatLevel = -1;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1224141093
   )
   @Export("widthScale")
   int widthScale = 128;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1903775087
   )
   @Export("heightScale")
   int heightScale = 128;
   @ObfuscatedName("j")
   @Export("isVisible")
   public boolean isVisible = false;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1351720473
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1022021323
   )
   @Export("contrast")
   int contrast = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1867413513
   )
   @Export("headIconPrayer")
   public int headIconPrayer = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1974627065
   )
   @Export("rotation")
   public int rotation = 32;
   @ObfuscatedName("ac")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -564802311
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1138034643
   )
   @Export("transformVarp")
   int transformVarp = -1;
   @ObfuscatedName("ak")
   @Export("isInteractable")
   public boolean isInteractable = true;
   @ObfuscatedName("ax")
   @Export("isClickable")
   public boolean isClickable = true;
   @ObfuscatedName("ar")
   @Export("isFollower")
   public boolean isFollower = false;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("params")
   IterableNodeHashTable params;

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1161139559"
   )
   @Export("postDecode")
   void postDecode() {
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
      descriptor = "(Lkx;IB)V",
      garbageValue = "43"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.readUnsignedByte();
         this.models = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.models[var4] = var1.readUnsignedShort();
         }
      } else if (var2 == 2) {
         this.name = var1.readStringCp1252NullTerminated();
      } else if (var2 == 12) {
         this.size = var1.readUnsignedByte();
      } else if (var2 == 13) {
         this.idleSequence = var1.readUnsignedShort();
      } else if (var2 == 14) {
         this.walkSequence = var1.readUnsignedShort();
      } else if (var2 == 15) {
         this.turnLeftSequence = var1.readUnsignedShort();
      } else if (var2 == 16) {
         this.turnRightSequence = var1.readUnsignedShort();
      } else if (var2 == 17) {
         this.walkSequence = var1.readUnsignedShort();
         this.walkBackSequence = var1.readUnsignedShort();
         this.walkLeftSequence = var1.readUnsignedShort();
         this.walkRightSequence = var1.readUnsignedShort();
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
      } else if (var2 == 60) {
         var3 = var1.readUnsignedByte();
         this.field3505 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3505[var4] = var1.readUnsignedShort();
         }
      } else if (var2 == 93) {
         this.drawMapDot = false;
      } else if (var2 == 95) {
         this.combatLevel = var1.readUnsignedShort();
      } else if (var2 == 97) {
         this.widthScale = var1.readUnsignedShort();
      } else if (var2 == 98) {
         this.heightScale = var1.readUnsignedShort();
      } else if (var2 == 99) {
         this.isVisible = true;
      } else if (var2 == 100) {
         this.ambient = var1.readByte();
      } else if (var2 == 101) {
         this.contrast = var1.readByte();
      } else if (var2 == 102) {
         this.headIconPrayer = var1.readUnsignedShort();
      } else if (var2 == 103) {
         this.rotation = var1.readUnsignedShort();
      } else if (var2 != 106 && var2 != 118) {
         if (var2 == 107) {
            this.isInteractable = false;
         } else if (var2 == 109) {
            this.isClickable = false;
         } else if (var2 == 111) {
            this.isFollower = true;
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
         if (var2 == 118) {
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
      descriptor = "(Ljs;ILjs;II)Lef;",
      garbageValue = "-2134889702"
   )
   @Export("getModel")
   public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
      if (this.transforms != null) {
         NPCComposition var12 = this.transform();
         return var12 == null ? null : var12.getModel(var1, var2, var3, var4);
      } else {
         Model var5 = (Model)NpcDefinition_cachedModels.get((long)this.id);
         if (var5 == null) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.models.length; ++var7) {
               if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
                  var6 = true;
               }
            }

            if (var6) {
               return null;
            }

            ModelData[] var8 = new ModelData[this.models.length];

            int var9;
            for(var9 = 0; var9 < this.models.length; ++var9) {
               var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
            }

            ModelData var10;
            if (var8.length == 1) {
               var10 = var8[0];
            } else {
               var10 = new ModelData(var8, var8.length);
            }

            if (this.recolorFrom != null) {
               for(var9 = 0; var9 < this.recolorFrom.length; ++var9) {
                  var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
               }
            }

            if (this.retextureFrom != null) {
               for(var9 = 0; var9 < this.retextureFrom.length; ++var9) {
                  var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
               }
            }

            var5 = var10.toModel(this.ambient + 64, this.contrast * 5 + 850, -30, -50, -30);
            NpcDefinition_cachedModels.put(var5, (long)this.id);
         }

         Model var11;
         if (var1 != null && var3 != null) {
            var11 = var1.applyTransformations(var5, var2, var3, var4);
         } else if (var1 != null) {
            var11 = var1.transformActorModel(var5, var2);
         } else if (var3 != null) {
            var11 = var3.transformActorModel(var5, var4);
         } else {
            var11 = var5.toSharedSequenceModel(true);
         }

         if (this.widthScale != 128 || this.heightScale != 128) {
            var11.scale(this.widthScale, this.heightScale, this.widthScale);
         }

         return var11;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)Lek;",
      garbageValue = "-5"
   )
   @Export("getModelData")
   public final ModelData getModelData() {
      if (this.transforms != null) {
         NPCComposition var7 = this.transform();
         return var7 == null ? null : var7.getModelData();
      } else if (this.field3505 == null) {
         return null;
      } else {
         boolean var1 = false;

         for(int var2 = 0; var2 < this.field3505.length; ++var2) {
            if (!NpcDefinition_modelArchive.tryLoadFile(this.field3505[var2], 0)) {
               var1 = true;
            }
         }

         if (var1) {
            return null;
         } else {
            ModelData[] var5 = new ModelData[this.field3505.length];

            for(int var3 = 0; var3 < this.field3505.length; ++var3) {
               var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field3505[var3], 0);
            }

            ModelData var6;
            if (var5.length == 1) {
               var6 = var5[0];
            } else {
               var6 = new ModelData(var5, var5.length);
            }

            int var4;
            if (this.recolorFrom != null) {
               for(var4 = 0; var4 < this.recolorFrom.length; ++var4) {
                  var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
               }
            }

            if (this.retextureFrom != null) {
               for(var4 = 0; var4 < this.retextureFrom.length; ++var4) {
                  var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
               }
            }

            return var6;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Ljy;",
      garbageValue = "1357950663"
   )
   @Export("transform")
   public final NPCComposition transform() {
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

      return var2 != -1 ? class90.getNpcDefinition(var2) : null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "122"
   )
   @Export("transformIsVisible")
   public boolean transformIsVisible() {
      if (this.transforms == null) {
         return true;
      } else {
         int var1 = -1;
         if (this.transformVarbit != -1) {
            var1 = FontName.getVarbit(this.transformVarbit);
         } else if (this.transformVarp != -1) {
            var1 = Varps.Varps_main[this.transformVarp];
         }

         if (var1 >= 0 && var1 < this.transforms.length) {
            return this.transforms[var1] != -1;
         } else {
            return this.transforms[this.transforms.length - 1] != -1;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "93"
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "2"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return class69.method1258(this.params, var1, var2);
   }
}
