import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ai")
@Implements("WorldMapManager")
public final class WorldMapManager {
   @ObfuscatedName("qw")
   @ObfuscatedGetter(
      intValue = -188939136
   )
   static int field345;
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "[Lly;"
   )
   @Export("worldSelectFlagSprites")
   static IndexedSprite[] worldSelectFlagSprites;
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive11")
   static Archive archive11;
   @ObfuscatedName("ei")
   @Export("secureRandom")
   static SecureRandom secureRandom;
   @ObfuscatedName("n")
   @Export("loaded")
   boolean loaded = false;
   @ObfuscatedName("v")
   @Export("loadStarted")
   boolean loadStarted = false;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lau;"
   )
   @Export("mapAreaData")
   WorldMapAreaData mapAreaData;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("compositeTextureSprite")
   SpritePixels compositeTextureSprite;
   @ObfuscatedName("y")
   @Export("icons")
   HashMap icons;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "[[Las;"
   )
   @Export("regions")
   WorldMapRegion[][] regions;
   @ObfuscatedName("z")
   @Export("scaleHandlers")
   HashMap scaleHandlers = new HashMap();
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "[Lly;"
   )
   @Export("mapSceneSprites")
   IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("geographyArchive")
   final AbstractArchive geographyArchive;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("groundArchive")
   final AbstractArchive groundArchive;
   @ObfuscatedName("s")
   @Export("fonts")
   final HashMap fonts;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 749583707
   )
   @Export("tileX")
   int tileX;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 461859631
   )
   @Export("tileY")
   int tileY;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -571129221
   )
   @Export("tileWidth")
   int tileWidth;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 2077457216
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1259035297
   )
   @Export("pixelsPerTile")
   public int pixelsPerTile = 0;

   @ObfuscatedSignature(
      descriptor = "([Lly;Ljava/util/HashMap;Lig;Lig;)V"
   )
   public WorldMapManager(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
      this.mapSceneSprites = var1;
      this.fonts = var2;
      this.geographyArchive = var3;
      this.groundArchive = var4;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;Ljava/lang/String;ZI)V",
      garbageValue = "1075163259"
   )
   @Export("load")
   public void load(AbstractArchive var1, String var2, boolean var3) {
      if (!this.loadStarted) {
         this.loaded = false;
         this.loadStarted = true;
         System.nanoTime();
         int var4 = var1.getGroupId(WorldMapCacheName.field333.name);
         int var5 = var1.getFileId(var4, var2);
         Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field333.name, var2));
         Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field323.name, var2));
         System.nanoTime();
         System.nanoTime();
         this.mapAreaData = new WorldMapAreaData();

         try {
            this.mapAreaData.init(var6, var7, var5, var3);
         } catch (IllegalStateException var19) {
            return;
         }

         this.mapAreaData.getOriginX();
         this.mapAreaData.getOriginPlane();
         this.mapAreaData.getOriginY();
         this.tileX = this.mapAreaData.getRegionLowX() * 64;
         this.tileY = this.mapAreaData.getRegionLowY() * 64;
         this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 64;
         this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 4096;
         int var16 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1;
         int var9 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1;
         System.nanoTime();
         System.nanoTime();
         Messages.method2372();
         this.regions = new WorldMapRegion[var16][var9];
         Iterator var10 = this.mapAreaData.worldMapData0Set.iterator();

         while(var10.hasNext()) {
            WorldMapData_0 var11 = (WorldMapData_0)var10.next();
            int var12 = var11.regionX;
            int var13 = var11.regionY;
            int var14 = var12 - this.mapAreaData.getRegionLowX();
            int var15 = var13 - this.mapAreaData.getRegionLowY();
            this.regions[var14][var15] = new WorldMapRegion(var12, var13, this.mapAreaData.getBackGroundColor(), this.fonts);
            this.regions[var14][var15].initWorldMapData0(var11, this.mapAreaData.iconList);
         }

         for(int var17 = 0; var17 < var16; ++var17) {
            for(int var18 = 0; var18 < var9; ++var18) {
               if (this.regions[var17][var18] == null) {
                  this.regions[var17][var18] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var17, this.mapAreaData.getRegionLowY() + var18, this.mapAreaData.getBackGroundColor(), this.fonts);
                  this.regions[var17][var18].initWorldMapData1(this.mapAreaData.worldMapData1Set, this.mapAreaData.iconList);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.isValidFileName(WorldMapCacheName.field324.name, var2)) {
            byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field324.name, var2);
            this.compositeTextureSprite = WorldMapRectangle.convertJpgToSprite(var20);
         }

         System.nanoTime();
         var1.clearGroups();
         var1.clearFiles();
         this.loaded = true;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-192155866"
   )
   @Export("clearIcons")
   public final void clearIcons() {
      this.icons = null;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIII)V",
      garbageValue = "-1854160239"
   )
   @Export("drawTiles")
   public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = Rasterizer2D.Rasterizer2D_pixels;
      int var10 = Rasterizer2D.Rasterizer2D_width;
      int var11 = Rasterizer2D.Rasterizer2D_height;
      int[] var12 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var12);
      WorldMapRectangle var13 = this.createWorldMapRectangle(var1, var2, var3, var4);
      float var14 = this.getPixelsPerTile(var7 - var5, var3 - var1);
      int var15 = (int)Math.ceil((double)var14);
      this.pixelsPerTile = var15;
      if (!this.scaleHandlers.containsKey(var15)) {
         WorldMapScaleHandler var16 = new WorldMapScaleHandler(var15);
         var16.init();
         this.scaleHandlers.put(var15, var16);
      }

      int var23 = var13.x + var13.width - 1;
      int var17 = var13.y + var13.height - 1;

      int var18;
      int var19;
      for(var18 = var13.x; var18 <= var23; ++var18) {
         for(var19 = var13.y; var19 <= var17; ++var19) {
            this.regions[var18][var19].drawTile(var15, (WorldMapScaleHandler)this.scaleHandlers.get(var15), this.mapSceneSprites, this.geographyArchive, this.groundArchive);
         }
      }

      Rasterizer2D.Rasterizer2D_replace(var9, var10, var11);
      Rasterizer2D.Rasterizer2D_setClipArray(var12);
      var18 = (int)(var14 * 64.0F);
      var19 = this.tileX * 4096 + var1;
      int var20 = this.tileY * 4096 + var2;

      for(int var21 = var13.x; var21 < var13.width + var13.x; ++var21) {
         for(int var22 = var13.y; var22 < var13.height + var13.y; ++var22) {
            this.regions[var21][var22].method506(var5 + var18 * (this.regions[var21][var22].regionX * 64 - var19) / 64, var8 - var18 * (this.regions[var21][var22].regionY * 64 - var20 + 64) / 64, var18);
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
      garbageValue = "-2105446269"
   )
   @Export("drawElements")
   public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4);
      float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1);
      int var16 = (int)(var15 * 64.0F);
      int var17 = this.tileX * 4096 + var1;
      int var18 = this.tileY * 4096 + var2;

      int var19;
      int var20;
      for(var19 = var14.x; var19 < var14.width + var14.x; ++var19) {
         for(var20 = var14.y; var20 < var14.height + var14.y; ++var20) {
            if (var13) {
               this.regions[var19][var20].initWorldMapIcon1s();
            }

            this.regions[var19][var20].method516(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = var14.x; var19 < var14.width + var14.x; ++var19) {
            for(var20 = var14.y; var20 < var14.height + var14.y; ++var20) {
               this.regions[var19][var20].flashElements(var10, var11, var12);
            }
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(IIIILjava/util/HashSet;III)V",
      garbageValue = "1410026121"
   )
   @Export("drawOverview")
   public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (this.compositeTextureSprite != null) {
         this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.icons == null) {
               this.buildIcons0();
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.icons.get(var9);
               } while(var10 == null);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next();
                  int var13 = var3 * (var12.coord2.x - this.tileX * 4096) / (this.tileWidth * 4096);
                  int var14 = var4 - (var12.coord2.y - this.tileY * 4096) * var4 / (this.tileHeight * 64);
                  Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIII)Ljava/util/List;",
      garbageValue = "-1800022691"
   )
   public List method722(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.loaded) {
         return var11;
      } else {
         WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4);
         float var13 = this.getPixelsPerTile(var7, var3 - var1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.tileX * 4096 + var1;
         int var16 = this.tileY * 4096 + var2;

         for(int var17 = var12.x; var17 < var12.x + var12.width; ++var17) {
            for(int var18 = var12.y; var18 < var12.height + var12.y; ++var18) {
               List var19 = this.regions[var17][var18].method537(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10);
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IIIII)Laq;",
      garbageValue = "-2121459740"
   )
   @Export("createWorldMapRectangle")
   WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
      WorldMapRectangle var5 = new WorldMapRectangle(this);
      int var6 = this.tileX * 4096 + var1;
      int var7 = this.tileY * 4096 + var2;
      int var8 = var3 + this.tileX * 4096;
      int var9 = this.tileY * 4096 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.width = var12 - var10 + 1;
      var5.height = var13 - var11 + 1;
      var5.x = var10 - this.mapAreaData.getRegionLowX();
      var5.y = var11 - this.mapAreaData.getRegionLowY();
      if (var5.x < 0) {
         var5.width += var5.x;
         var5.x = 0;
      }

      if (var5.x > this.regions.length - var5.width) {
         var5.width = this.regions.length - var5.x;
      }

      if (var5.y < 0) {
         var5.height += var5.y;
         var5.y = 0;
      }

      if (var5.y > this.regions[0].length - var5.height) {
         var5.height = this.regions[0].length - var5.y;
      }

      var5.width = Math.min(var5.width, this.regions.length);
      var5.height = Math.min(var5.height, this.regions[0].length);
      return var5;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "14"
   )
   @Export("isLoaded")
   public boolean isLoaded() {
      return this.loaded;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/HashMap;",
      garbageValue = "108"
   )
   @Export("buildIcons")
   public HashMap buildIcons() {
      this.buildIcons0();
      return this.icons;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "118"
   )
   @Export("buildIcons0")
   void buildIcons0() {
      if (this.icons == null) {
         this.icons = new HashMap();
      }

      this.icons.clear();

      for(int var1 = 0; var1 < this.regions.length; ++var1) {
         for(int var2 = 0; var2 < this.regions[var1].length; ++var2) {
            List var3 = this.regions[var1][var2].icons();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
               if (var5.hasValidElement()) {
                  int var6 = var5.getElement();
                  if (!this.icons.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.icons.put(var6, var7);
                  } else {
                     List var8 = (List)this.icons.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IIB)F",
      garbageValue = "11"
   )
   @Export("getPixelsPerTile")
   float getPixelsPerTile(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)Ljx;",
      garbageValue = "-2146982596"
   )
   @Export("getEnum")
   public static EnumComposition getEnum(int var0) {
      EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
         var1 = new EnumComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "([BIIIIIII[Lfe;B)V",
      garbageValue = "0"
   )
   static final void method749(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
      int var10;
      for(int var9 = 0; var9 < 8; ++var9) {
         for(var10 = 0; var10 < 8; ++var10) {
            if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
               var8[var1].flags[var9 + var2][var10 + var3] &= -16777217;
            }
         }
      }

      Buffer var13 = new Buffer(var0);

      for(var10 = 0; var10 < 4; ++var10) {
         for(int var11 = 0; var11 < 64; ++var11) {
            for(int var12 = 0; var12 < 64; ++var12) {
               if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) {
                  KeyHandler.loadTerrain(var13, var1, var2 + class236.method4332(var11 & 7, var12 & 7, var7), var3 + TextureProvider.method2914(var11 & 7, var12 & 7, var7), 0, 0, var7);
               } else {
                  KeyHandler.loadTerrain(var13, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-74"
   )
   static void method738() {
      Login.Login_username = Login.Login_username.trim();
      if (Login.Login_username.length() == 0) {
         InvDefinition.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var1;
         try {
            URL var3 = new URL(GrandExchangeOfferNameComparator.method209("services", false) + "m=accountappeal/login.ws");
            URLConnection var4 = var3.openConnection();
            var4.setRequestProperty("connection", "close");
            var4.setDoInput(true);
            var4.setDoOutput(true);
            var4.setConnectTimeout(5000);
            OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
            var5.write("data1=req");
            var5.flush();
            InputStream var6 = var4.getInputStream();
            Buffer var7 = new Buffer(new byte[1000]);

            while(true) {
               int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset);
               if (var8 == -1) {
                  var7.offset = 0;
                  long var20 = var7.readLong();
                  var1 = var20;
                  break;
               }

               var7.offset += var8;
               if (var7.offset >= 1000) {
                  var1 = 0L;
                  break;
               }
            }
         } catch (Exception var28) {
            var1 = 0L;
         }

         byte var0;
         if (0L == var1) {
            var0 = 5;
         } else {
            String var29 = Login.Login_username;
            Random var30 = new Random();
            Buffer var24 = new Buffer(128);
            Buffer var9 = new Buffer(128);
            int[] var10 = new int[]{var30.nextInt(), var30.nextInt(), (int)(var1 >> 32), (int)var1};
            var24.writeByte(10);

            int var11;
            for(var11 = 0; var11 < 4; ++var11) {
               var24.writeInt(var30.nextInt());
            }

            var24.writeInt(var10[0]);
            var24.writeInt(var10[1]);
            var24.writeLong(var1);
            var24.writeLong(0L);

            for(var11 = 0; var11 < 4; ++var11) {
               var24.writeInt(var30.nextInt());
            }

            var24.encryptRsa(class89.field1155, class89.field1154);
            var9.writeByte(10);

            for(var11 = 0; var11 < 3; ++var11) {
               var9.writeInt(var30.nextInt());
            }

            var9.writeLong(var30.nextLong());
            var9.writeLongMedium(var30.nextLong());
            GrandExchangeOfferOwnWorldComparator.method1378(var9);
            var9.writeLong(var30.nextLong());
            var9.encryptRsa(class89.field1155, class89.field1154);
            var11 = WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var29);
            if (var11 % 8 != 0) {
               var11 += 8 - var11 % 8;
            }

            Buffer var12 = new Buffer(var11);
            var12.writeStringCp1252NullTerminated(var29);
            var12.offset = var11;
            var12.xteaEncryptAll(var10);
            Buffer var13 = new Buffer(var12.offset + var9.offset + var24.offset + 5);
            var13.writeByte(2);
            var13.writeByte(var24.offset);
            var13.writeBytes(var24.array, 0, var24.offset);
            var13.writeByte(var9.offset);
            var13.writeBytes(var9.array, 0, var9.offset);
            var13.writeShort(var12.offset);
            var13.writeBytes(var12.array, 0, var12.offset);
            String var14 = VertexNormal.method3163(var13.array);

            byte var25;
            try {
               URL var15 = new URL(GrandExchangeOfferNameComparator.method209("services", false) + "m=accountappeal/login.ws");
               URLConnection var16 = var15.openConnection();
               var16.setDoInput(true);
               var16.setDoOutput(true);
               var16.setConnectTimeout(5000);
               OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
               var17.write("data2=" + WallDecoration.method3450(var14) + "&dest=" + WallDecoration.method3450("passwordchoice.ws"));
               var17.flush();
               InputStream var18 = var16.getInputStream();
               var13 = new Buffer(new byte[1000]);

               while(true) {
                  int var19 = var18.read(var13.array, var13.offset, 1000 - var13.offset);
                  if (var19 == -1) {
                     var17.close();
                     var18.close();
                     String var26 = new String(var13.array);
                     if (var26.startsWith("OFFLINE")) {
                        var25 = 4;
                     } else if (var26.startsWith("WRONG")) {
                        var25 = 7;
                     } else if (var26.startsWith("RELOAD")) {
                        var25 = 3;
                     } else if (var26.startsWith("Not permitted for social network accounts.")) {
                        var25 = 6;
                     } else {
                        var13.xteaDecryptAll(var10);

                        while(var13.offset > 0 && var13.array[var13.offset - 1] == 0) {
                           --var13.offset;
                        }

                        var26 = new String(var13.array, 0, var13.offset);
                        if (ReflectionCheck.method2452(var26)) {
                           WorldMapRectangle.openURL(var26, true, false);
                           var25 = 2;
                        } else {
                           var25 = 5;
                        }
                     }
                     break;
                  }

                  var13.offset += var19;
                  if (var13.offset >= 1000) {
                     var25 = 5;
                     break;
                  }
               }
            } catch (Throwable var27) {
               var27.printStackTrace();
               var25 = 5;
            }

            var0 = var25;
         }

         switch(var0) {
         case 2:
            InvDefinition.setLoginResponseString(Strings.field3056, Strings.field3057, Strings.field3058);
            Login.loginIndex = 6;
            break;
         case 3:
            InvDefinition.setLoginResponseString("", "Error connecting to server.", "");
            break;
         case 4:
            InvDefinition.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            break;
         case 5:
            InvDefinition.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            break;
         case 6:
            InvDefinition.setLoginResponseString("", "Error connecting to server.", "");
            break;
         case 7:
            InvDefinition.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }

      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZB)I",
      garbageValue = "1"
   )
   static int method746(int var0, Script var1, boolean var2) {
      int var3;
      int var6;
      int var9;
      if (var0 == ScriptOpcodes.ENUM_STRING) {
         Interpreter.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         EnumComposition var10 = getEnum(var3);
         if (var10.outputType != 's') {
            ;
         }

         for(var6 = 0; var6 < var10.outputCount; ++var6) {
            if (var9 == var10.keys[var6]) {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6];
               var10 = null;
               break;
            }
         }

         if (var10 != null) {
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
         }

         return 1;
      } else if (var0 != ScriptOpcodes.ENUM) {
         if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            EnumComposition var4 = getEnum(var3);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size();
            return 1;
         } else {
            return 2;
         }
      } else {
         Interpreter.Interpreter_intStackSize -= 4;
         var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         EnumComposition var7 = getEnum(var5);
         if (var3 == var7.inputType && var9 == var7.outputType) {
            for(int var8 = 0; var8 < var7.outputCount; ++var8) {
               if (var6 == var7.keys[var8]) {
                  if (var9 == 115) {
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8];
                  }

                  var7 = null;
                  break;
               }
            }

            if (var7 != null) {
               if (var9 == 115) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt;
               }
            }

            return 1;
         } else {
            if (var9 == 115) {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
      garbageValue = "4"
   )
   @Export("insertMenuItemNoShift")
   public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
      WorldMapEvent.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      descriptor = "(Lhz;IIZB)V",
      garbageValue = "1"
   )
   @Export("alignWidgetSize")
   static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
      int var4 = var0.width;
      int var5 = var0.height;
      if (var0.widthAlignment == 0) {
         var0.width = var0.rawWidth;
      } else if (var0.widthAlignment == 1) {
         var0.width = var1 - var0.rawWidth;
      } else if (var0.widthAlignment == 2) {
         var0.width = var0.rawWidth * var1 >> 14;
      }

      if (var0.heightAlignment == 0) {
         var0.height = var0.rawHeight;
      } else if (var0.heightAlignment == 1) {
         var0.height = var2 - var0.rawHeight;
      } else if (var0.heightAlignment == 2) {
         var0.height = var2 * var0.rawHeight >> 14;
      }

      if (var0.widthAlignment == 4) {
         var0.width = var0.field2610 * var0.height / var0.field2611;
      }

      if (var0.heightAlignment == 4) {
         var0.height = var0.field2611 * var0.width / var0.field2610;
      }

      if (var0.contentType == 1337) {
         Client.viewportWidget = var0;
      }

      if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
         ScriptEvent var6 = new ScriptEvent();
         var6.widget = var0;
         var6.args = var0.onResize;
         Client.scriptEvents.addFirst(var6);
      }

   }
}
