import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("WorldMapElement_archive")
   public static AbstractArchive WorldMapElement_archive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "[Lic;"
   )
   @Export("WorldMapElement_cached")
   public static WorldMapElement[] WorldMapElement_cached;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -346827273
   )
   @Export("WorldMapElement_count")
   public static int WorldMapElement_count;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("WorldMapElement_cachedSprites")
   static EvictingDualNodeHashTable WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1832807857
   )
   @Export("objectId")
   public final int objectId;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -928242387
   )
   @Export("sprite1")
   public int sprite1 = -1;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -342149719
   )
   @Export("sprite2")
   int sprite2 = -1;
   @ObfuscatedName("e")
   @Export("name")
   public String name;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1722981439
   )
   public int field3245;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1426815711
   )
   @Export("textSize")
   public int textSize = 0;
   @ObfuscatedName("b")
   public boolean field3250 = true;
   @ObfuscatedName("a")
   public boolean field3255 = false;
   @ObfuscatedName("w")
   @Export("menuActions")
   public String[] menuActions = new String[5];
   @ObfuscatedName("k")
   @Export("menuTargetName")
   public String menuTargetName;
   @ObfuscatedName("i")
   int[] field3258;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -683625561
   )
   int field3253 = Integer.MAX_VALUE;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -424376699
   )
   int field3259 = Integer.MAX_VALUE;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -934504639
   )
   int field3261 = Integer.MIN_VALUE;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -97806191
   )
   int field3262 = Integer.MIN_VALUE;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lje;"
   )
   @Export("horizontalAlignment")
   public HorizontalAlignment horizontalAlignment;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Lie;"
   )
   @Export("verticalAlignment")
   public VerticalAlignment verticalAlignment;
   @ObfuscatedName("m")
   int[] field3265;
   @ObfuscatedName("r")
   byte[] field3266;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 922243855
   )
   @Export("category")
   public int category;

   public WorldMapElement(int var1) {
      this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
      this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
      this.category = -1;
      this.objectId = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkx;B)V",
      garbageValue = "-21"
   )
   @Export("decode")
   public void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lkx;II)V",
      garbageValue = "835039554"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.sprite1 = var1.method5833();
      } else if (var2 == 2) {
         this.sprite2 = var1.method5833();
      } else if (var2 == 3) {
         this.name = var1.readStringCp1252NullTerminated();
      } else if (var2 == 4) {
         this.field3245 = var1.readMedium();
      } else if (var2 == 5) {
         var1.readMedium();
      } else if (var2 == 6) {
         this.textSize = var1.readUnsignedByte();
      } else {
         int var3;
         if (var2 == 7) {
            var3 = var1.readUnsignedByte();
            if ((var3 & 1) == 0) {
               this.field3250 = false;
            }

            if ((var3 & 2) == 2) {
               this.field3255 = true;
            }
         } else if (var2 == 8) {
            var1.readUnsignedByte();
         } else if (var2 >= 10 && var2 <= 14) {
            this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
         } else if (var2 == 15) {
            var3 = var1.readUnsignedByte();
            this.field3258 = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.field3258[var4] = var1.readShort();
            }

            var1.readInt();
            var4 = var1.readUnsignedByte();
            this.field3265 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field3265.length; ++var5) {
               this.field3265[var5] = var1.readInt();
            }

            this.field3266 = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.field3266[var5] = var1.readByte();
            }
         } else if (var2 != 16) {
            if (var2 == 17) {
               this.menuTargetName = var1.readStringCp1252NullTerminated();
            } else if (var2 == 18) {
               var1.method5833();
            } else if (var2 == 19) {
               this.category = var1.readUnsignedShort();
            } else if (var2 == 21) {
               var1.readInt();
            } else if (var2 == 22) {
               var1.readInt();
            } else if (var2 == 23) {
               var1.readUnsignedByte();
               var1.readUnsignedByte();
               var1.readUnsignedByte();
            } else if (var2 == 24) {
               var1.readShort();
               var1.readShort();
            } else if (var2 == 25) {
               var1.method5833();
            } else if (var2 == 28) {
               var1.readUnsignedByte();
            } else if (var2 == 29) {
               this.horizontalAlignment = (HorizontalAlignment)InterfaceParent.findEnumerated(GameShell.method1137(), var1.readUnsignedByte());
            } else if (var2 == 30) {
               this.verticalAlignment = (VerticalAlignment)InterfaceParent.findEnumerated(class169.method3631(), var1.readUnsignedByte());
            }
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1040699133"
   )
   public void method4576() {
      if (this.field3258 != null) {
         for(int var1 = 0; var1 < this.field3258.length; var1 += 2) {
            if (this.field3258[var1] < this.field3253) {
               this.field3253 = this.field3258[var1];
            } else if (this.field3258[var1] > this.field3261) {
               this.field3261 = this.field3258[var1];
            }

            if (this.field3258[var1 + 1] < this.field3259) {
               this.field3259 = this.field3258[var1 + 1];
            } else if (this.field3258[var1 + 1] > this.field3262) {
               this.field3262 = this.field3258[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(ZI)Llm;",
      garbageValue = "1411469246"
   )
   @Export("getSpriteBool")
   public Sprite getSpriteBool(boolean var1) {
      int var2 = this.sprite1;
      return this.getSprite(var2);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)Llm;",
      garbageValue = "3"
   )
   @Export("getSprite")
   Sprite getSprite(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         Sprite var2 = (Sprite)WorldMapElement_cachedSprites.get((long)var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = BufferedSource.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
            if (var2 != null) {
               WorldMapElement_cachedSprites.put(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1309901264"
   )
   @Export("getObjectId")
   public int getObjectId() {
      return this.objectId;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IILgz;Lfe;B)Z",
      garbageValue = "75"
   )
   public static final boolean method4591(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
      int var4 = var0;
      int var5 = var1;
      byte var6 = 64;
      byte var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      class182.directions[var6][var7] = 99;
      class182.distances[var6][var7] = 0;
      byte var10 = 0;
      int var11 = 0;
      class182.bufferX[var10] = var0;
      byte var10001 = var10;
      int var18 = var10 + 1;
      class182.bufferY[var10001] = var1;
      int[][] var12 = var3.flags;

      while(var18 != var11) {
         var4 = class182.bufferX[var11];
         var5 = class182.bufferY[var11];
         var11 = var11 + 1 & 4095;
         int var16 = var4 - var8;
         int var17 = var5 - var9;
         int var13 = var4 - var3.xInset;
         int var14 = var5 - var3.yInset;
         if (var2.hasArrived(2, var4, var5, var3)) {
            class182.field2118 = var4;
            class182.field2124 = var5;
            return true;
         }

         int var15 = class182.distances[var16][var17] + 1;
         if (var16 > 0 && class182.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
            class182.bufferX[var18] = var4 - 1;
            class182.bufferY[var18] = var5;
            var18 = var18 + 1 & 4095;
            class182.directions[var16 - 1][var17] = 2;
            class182.distances[var16 - 1][var17] = var15;
         }

         if (var16 < 126 && class182.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
            class182.bufferX[var18] = var4 + 1;
            class182.bufferY[var18] = var5;
            var18 = var18 + 1 & 4095;
            class182.directions[var16 + 1][var17] = 8;
            class182.distances[var16 + 1][var17] = var15;
         }

         if (var17 > 0 && class182.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
            class182.bufferX[var18] = var4;
            class182.bufferY[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class182.directions[var16][var17 - 1] = 1;
            class182.distances[var16][var17 - 1] = var15;
         }

         if (var17 < 126 && class182.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
            class182.bufferX[var18] = var4;
            class182.bufferY[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class182.directions[var16][var17 + 1] = 4;
            class182.distances[var16][var17 + 1] = var15;
         }

         if (var16 > 0 && var17 > 0 && class182.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
            class182.bufferX[var18] = var4 - 1;
            class182.bufferY[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class182.directions[var16 - 1][var17 - 1] = 3;
            class182.distances[var16 - 1][var17 - 1] = var15;
         }

         if (var16 < 126 && var17 > 0 && class182.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
            class182.bufferX[var18] = var4 + 1;
            class182.bufferY[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class182.directions[var16 + 1][var17 - 1] = 9;
            class182.distances[var16 + 1][var17 - 1] = var15;
         }

         if (var16 > 0 && var17 < 126 && class182.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
            class182.bufferX[var18] = var4 - 1;
            class182.bufferY[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class182.directions[var16 - 1][var17 + 1] = 6;
            class182.distances[var16 - 1][var17 + 1] = var15;
         }

         if (var16 < 126 && var17 < 126 && class182.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
            class182.bufferX[var18] = var4 + 1;
            class182.bufferY[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class182.directions[var16 + 1][var17 + 1] = 12;
            class182.distances[var16 + 1][var17 + 1] = var15;
         }
      }

      class182.field2118 = var4;
      class182.field2124 = var5;
      return false;
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      descriptor = "(Lbo;B)V",
      garbageValue = "1"
   )
   static final void method4592(PendingSpawn var0) {
      long var1 = 0L;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if (var0.type == 0) {
         var1 = MilliClock.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 1) {
         var1 = MilliClock.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 2) {
         var1 = MilliClock.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 3) {
         var1 = MilliClock.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
      }

      if (0L != var1) {
         int var6 = MilliClock.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
         var3 = class25.Entity_unpackID(var1);
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.objectId = var3;
      var0.field945 = var4;
      var0.field944 = var5;
   }
}
