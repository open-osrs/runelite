import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
@Implements("WorldMap")
public class WorldMap {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   @Export("fontNameVerdana11")
   static final FontName fontNameVerdana11;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   @Export("fontNameVerdana13")
   static final FontName fontNameVerdana13;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   @Export("fontNameVerdana15")
   static final FontName fontNameVerdana15;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("WorldMap_archive")
   AbstractArchive WorldMap_archive;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("WorldMap_geographyArchive")
   AbstractArchive WorldMap_geographyArchive;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("WorldMap_groundArchive")
   AbstractArchive WorldMap_groundArchive;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lkl;"
   )
   @Export("font")
   Font font;
   @ObfuscatedName("w")
   @Export("fonts")
   HashMap fonts;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "[Lly;"
   )
   @Export("mapSceneSprites")
   IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("i")
   @Export("details")
   HashMap details;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lar;"
   )
   @Export("mainMapArea")
   WorldMapArea mainMapArea;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lar;"
   )
   @Export("currentMapArea")
   WorldMapArea currentMapArea;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Lar;"
   )
   WorldMapArea field4001;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lai;"
   )
   @Export("worldMapManager")
   WorldMapManager worldMapManager;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lmj;"
   )
   @Export("cacheLoader")
   WorldMapArchiveLoader cacheLoader;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1485160707
   )
   @Export("centerTileX")
   int centerTileX;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 468675207
   )
   @Export("centerTileY")
   int centerTileY;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -552998349
   )
   @Export("worldMapTargetX")
   int worldMapTargetX = -1;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -103147929
   )
   @Export("worldMapTargetY")
   int worldMapTargetY = -1;
   @ObfuscatedName("j")
   @Export("zoom")
   float zoom;
   @ObfuscatedName("ay")
   @Export("zoomTarget")
   float zoomTarget;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 2118998885
   )
   @Export("worldMapDisplayWidth")
   int worldMapDisplayWidth = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1890808813
   )
   @Export("worldMapDisplayHeight")
   int worldMapDisplayHeight = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -2127306477
   )
   @Export("worldMapDisplayX")
   int worldMapDisplayX = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -511724315
   )
   @Export("worldMapDisplayY")
   int worldMapDisplayY = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 430742145
   )
   @Export("maxFlashCount")
   int maxFlashCount = 3;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -2091000699
   )
   @Export("cyclesPerFlash")
   int cyclesPerFlash = 50;
   @ObfuscatedName("ak")
   @Export("perpetualFlash")
   boolean perpetualFlash = false;
   @ObfuscatedName("ax")
   @Export("flashingElements")
   HashSet flashingElements = null;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -668167233
   )
   @Export("flashCount")
   int flashCount = -1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 369580101
   )
   @Export("flashCycle")
   int flashCycle = -1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -495293641
   )
   int field3983 = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -717916547
   )
   int field4024 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -543796417
   )
   int field4022 = -1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -866652017
   )
   int field4023 = -1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      longValue = -8962083882606265099L
   )
   long field4040;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -255624939
   )
   int field4014;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 795601449
   )
   int field4026;
   @ObfuscatedName("an")
   boolean field4027 = true;
   @ObfuscatedName("au")
   @Export("enabledElements")
   HashSet enabledElements = new HashSet();
   @ObfuscatedName("ad")
   @Export("enabledCategories")
   HashSet enabledCategories = new HashSet();
   @ObfuscatedName("af")
   @Export("enabledElementIds")
   HashSet enabledElementIds = new HashSet();
   @ObfuscatedName("av")
   HashSet field4032 = new HashSet();
   @ObfuscatedName("ao")
   @Export("elementsDisabled")
   boolean elementsDisabled = false;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 1798825541
   )
   int field3994 = 0;
   @ObfuscatedName("bi")
   @Export("menuOpcodes")
   final int[] menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
   @ObfuscatedName("bp")
   List field4035;
   @ObfuscatedName("br")
   @Export("iconIterator")
   Iterator iconIterator;
   @ObfuscatedName("bq")
   HashSet field3992 = new HashSet();
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("mouseCoord")
   Coord mouseCoord = null;
   @ObfuscatedName("bc")
   @Export("showCoord")
   public boolean showCoord = false;
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("sprite")
   Sprite sprite;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -1265489045
   )
   @Export("cachedPixelsPerTile")
   int cachedPixelsPerTile;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 1633065457
   )
   @Export("minCachedTileX")
   int minCachedTileX = -1;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 1866710929
   )
   @Export("minCachedTileY")
   int minCachedTileY = -1;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -1184565479
   )
   int field4044 = -1;

   static {
      fontNameVerdana11 = FontName.FontName_verdana11;
      fontNameVerdana13 = FontName.FontName_verdana13;
      fontNameVerdana15 = FontName.FontName_verdana15;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;Lig;Lig;Lkl;Ljava/util/HashMap;[Lly;B)V",
      garbageValue = "32"
   )
   @Export("init")
   public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
      this.mapSceneSprites = var6;
      this.WorldMap_archive = var1;
      this.WorldMap_geographyArchive = var2;
      this.WorldMap_groundArchive = var3;
      this.font = var4;
      this.fonts = new HashMap();
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
      this.cacheLoader = new WorldMapArchiveLoader(var1);
      int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field333.name);
      int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
      this.details = new HashMap(var8.length);

      for(int var9 = 0; var9 < var8.length; ++var9) {
         Buffer var10 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var9]));
         WorldMapArea var11 = new WorldMapArea();
         var11.read(var10, var8[var9]);
         this.details.put(var11.getInternalName(), var11);
         if (var11.getIsMain()) {
            this.mainMapArea = var11;
         }
      }

      this.setCurrentMapArea(this.mainMapArea);
      this.field4001 = null;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "85863738"
   )
   public void method6584() {
      WorldMapSection1.method671();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IIZIIIII)V",
      garbageValue = "230943505"
   )
   @Export("onCycle")
   public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.cacheLoader.isLoaded()) {
         this.smoothZoom();
         this.scrollToTarget();
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
            int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
            List var10 = this.worldMapManager.method722(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
            HashSet var11 = new HashSet();

            Iterator var12;
            AbstractWorldMapIcon var13;
            ScriptEvent var14;
            WorldMapEvent var15;
            for(var12 = var10.iterator(); var12.hasNext(); PacketWriter.runScriptEvent(var14)) {
               var13 = (AbstractWorldMapIcon)var12.next();
               var11.add(var13);
               var14 = new ScriptEvent();
               var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
               var14.setArgs(new Object[]{var15, var1, var2});
               if (this.field3992.contains(var13)) {
                  var14.setType(17);
               } else {
                  var14.setType(15);
               }
            }

            var12 = this.field3992.iterator();

            while(var12.hasNext()) {
               var13 = (AbstractWorldMapIcon)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new ScriptEvent();
                  var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
                  var14.setArgs(new Object[]{var15, var1, var2});
                  var14.setType(16);
                  PacketWriter.runScriptEvent(var14);
               }
            }

            this.field3992 = var11;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIZZI)V",
      garbageValue = "-1689705014"
   )
   public void method6525(int var1, int var2, boolean var3, boolean var4) {
      long var5 = Tiles.currentTimeMillis();
      this.method6539(var1, var2, var4, var5);
      if (this.hasTarget() || !var4 && !var3) {
         this.method6527();
      } else {
         if (var4) {
            this.field4022 = var1;
            this.field4023 = var2;
            this.field3983 = this.centerTileX;
            this.field4024 = this.centerTileY;
         }

         if (this.field3983 != -1) {
            int var7 = var1 - this.field4022;
            int var8 = var2 - this.field4023;
            this.setWorldMapPosition(this.field3983 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4024, false);
         }
      }

      if (var4) {
         this.field4040 = var5;
         this.field4014 = var1;
         this.field4026 = var2;
      }

   }

   @ObfuscatedName("y")
   void method6539(int var1, int var2, boolean var3, long var4) {
      if (this.currentMapArea != null) {
         int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
         int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
         this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
         if (this.mouseCoord != null && var3) {
            int var9;
            int var10;
            if (TriBool.method5372() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) {
               int var13 = this.mouseCoord.x;
               var9 = this.mouseCoord.y;
               var10 = this.mouseCoord.plane;
               PacketBufferNode var11 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2230, Client.packetWriter.isaacCipher);
               var11.packetBuffer.writeShortLE(var9);
               var11.packetBuffer.method5883(var10);
               var11.packetBuffer.method5736(0);
               var11.packetBuffer.writeIntME(var13);
               Client.packetWriter.addNode(var11);
            } else {
               boolean var8 = true;
               if (this.field4027) {
                  var9 = var1 - this.field4014;
                  var10 = var2 - this.field4026;
                  if (var4 - this.field4040 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                     var8 = false;
                  }
               }

               if (var8) {
                  PacketBufferNode var12 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2304, Client.packetWriter.isaacCipher);
                  var12.packetBuffer.method5736(this.mouseCoord.packed());
                  Client.packetWriter.addNode(var12);
                  this.field4040 = 0L;
               }
            }
         }
      } else {
         this.mouseCoord = null;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-1"
   )
   @Export("smoothZoom")
   void smoothZoom() {
      if (HealthBarUpdate.field1016 != null) {
         this.zoom = this.zoomTarget;
      } else {
         if (this.zoom < this.zoomTarget) {
            this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F);
         }

         if (this.zoom > this.zoomTarget) {
            this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
         }

      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2023842573"
   )
   @Export("scrollToTarget")
   void scrollToTarget() {
      if (this.hasTarget()) {
         int var1 = this.worldMapTargetX - this.centerTileX;
         int var2 = this.worldMapTargetY - this.centerTileY;
         if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true);
         if (this.worldMapTargetX == this.centerTileX && this.centerTileY == this.worldMapTargetY) {
            this.worldMapTargetX = -1;
            this.worldMapTargetY = -1;
         }

      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "1942318889"
   )
   @Export("setWorldMapPosition")
   final void setWorldMapPosition(int var1, int var2, boolean var3) {
      this.centerTileX = var1;
      this.centerTileY = var2;
      Tiles.currentTimeMillis();
      if (var3) {
         this.method6527();
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-759849186"
   )
   final void method6527() {
      this.field4023 = -1;
      this.field4022 = -1;
      this.field4024 = -1;
      this.field3983 = -1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-172308230"
   )
   @Export("hasTarget")
   boolean hasTarget() {
      return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lar;",
      garbageValue = "1643132565"
   )
   @Export("mapAreaAtCoord")
   public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
      Iterator var4 = this.details.values().iterator();

      WorldMapArea var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (WorldMapArea)var4.next();
      } while(!var5.containsCoord(var1, var2, var3));

      return var5;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(IIIZI)V",
      garbageValue = "76619956"
   )
   public void method6530(int var1, int var2, int var3, boolean var4) {
      WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.mainMapArea;
      }

      boolean var6 = false;
      if (var5 != this.field4001 || var4) {
         this.field4001 = var5;
         this.setCurrentMapArea(var5);
         var6 = true;
      }

      if (var6 || var4) {
         this.jump(var1, var2, var3);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1925451385"
   )
   @Export("setCurrentMapAreaId")
   public void setCurrentMapAreaId(int var1) {
      WorldMapArea var2 = this.getMapArea(var1);
      if (var2 != null) {
         this.setCurrentMapArea(var2);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-730626276"
   )
   @Export("currentMapAreaId")
   public int currentMapAreaId() {
      return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(B)Lar;",
      garbageValue = "-84"
   )
   @Export("getCurrentMapArea")
   public WorldMapArea getCurrentMapArea() {
      return this.currentMapArea;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lar;I)V",
      garbageValue = "-248631189"
   )
   @Export("setCurrentMapArea")
   void setCurrentMapArea(WorldMapArea var1) {
      if (this.currentMapArea == null || var1 != this.currentMapArea) {
         this.initializeWorldMapManager(var1);
         this.jump(-1, -1, -1);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lar;I)V",
      garbageValue = "1768917402"
   )
   @Export("initializeWorldMapManager")
   void initializeWorldMapManager(WorldMapArea var1) {
      this.currentMapArea = var1;
      this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
      this.cacheLoader.reset(this.currentMapArea.getInternalName());
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(Lar;Lhd;Lhd;ZI)V",
      garbageValue = "-1378443139"
   )
   public void method6536(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
      if (var1 != null) {
         if (this.currentMapArea == null || var1 != this.currentMapArea) {
            this.initializeWorldMapManager(var1);
         }

         if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) {
            this.jump(var2.plane, var2.x, var2.y);
         } else {
            this.jump(var3.plane, var3.x, var3.y);
         }

      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IIIS)V",
      garbageValue = "-10194"
   )
   @Export("jump")
   void jump(int var1, int var2, int var3) {
      if (this.currentMapArea != null) {
         int[] var4 = this.currentMapArea.position(var1, var2, var3);
         if (var4 == null) {
            var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY());
         }

         this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true);
         this.worldMapTargetX = -1;
         this.worldMapTargetY = -1;
         this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom());
         this.zoomTarget = this.zoom;
         this.field4035 = null;
         this.iconIterator = null;
         this.worldMapManager.clearIcons();
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "943833316"
   )
   @Export("draw")
   public void draw(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var6);
      Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
      int var7 = this.cacheLoader.getPercentLoaded();
      if (var7 < 100) {
         this.drawLoading(var1, var2, var3, var4, var7);
      } else {
         if (!this.worldMapManager.isLoaded()) {
            this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
            if (!this.worldMapManager.isLoaded()) {
               return;
            }
         }

         if (this.flashingElements != null) {
            ++this.flashCycle;
            if (this.flashCycle % this.cyclesPerFlash == 0) {
               this.flashCycle = 0;
               ++this.flashCount;
            }

            if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) {
               this.flashingElements = null;
            }
         }

         int var8 = (int)Math.ceil((double)((float)var3 / this.zoom));
         int var9 = (int)Math.ceil((double)((float)var4 / this.zoom));
         this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
         if (!this.elementsDisabled) {
            boolean var10 = false;
            if (var5 - this.field3994 > 100) {
               this.field3994 = var5;
               var10 = true;
            }

            this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4032, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
         }

         this.method6699(var1, var2, var3, var4, var8, var9);
         if (TriBool.method5372() && this.showCoord && this.mouseCoord != null) {
            this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
         }

         this.worldMapDisplayWidth = var8;
         this.worldMapDisplayHeight = var9;
         this.worldMapDisplayX = var1;
         this.worldMapDisplayY = var2;
         Rasterizer2D.Rasterizer2D_setClipArray(var6);
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)Z",
      garbageValue = "32"
   )
   boolean method6633(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.sprite == null) {
         return true;
      } else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
         if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) {
            return true;
         } else if (this.field4044 != Client.field674) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var3 + var1 < var5 || var2 + var4 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "-1237692088"
   )
   void method6699(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (HealthBarUpdate.field1016 != null) {
         int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2);
         int var8 = var3 + 512;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.getDisplayX() - var5 / 2 - var7;
         int var12 = this.getDisplayY() - var6 / 2 - var7;
         int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile;
         int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
         if (this.method6633(var8, var9, var13, var14, var3, var4)) {
            if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
               Arrays.fill(this.sprite.pixels, 0);
            } else {
               this.sprite = new Sprite(var8, var9);
            }

            this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
            this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
            this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile;
            HealthBarUpdate.field1016.method4511(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
            this.field4044 = Client.field674;
            var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile;
            var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
         }

         Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            this.sprite.method6426(var13, var14, 192);
         } else {
            this.sprite.method6347(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 192);
         }
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-1634362123"
   )
   @Export("drawOverview")
   public void drawOverview(int var1, int var2, int var3, int var4) {
      if (this.cacheLoader.isLoaded()) {
         if (!this.worldMapManager.isLoaded()) {
            this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
            if (!this.worldMapManager.isLoaded()) {
               return;
            }
         }

         this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1829622274"
   )
   @Export("setZoomPercentage")
   public void setZoomPercentage(int var1) {
      this.zoomTarget = this.getZoomFromPercentage(var1);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "-22"
   )
   @Export("drawLoading")
   void drawLoading(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var3 / 2 + var1;
      int var8 = var4 / 2 + var2 - 18 - var6;
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
      Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536);
      Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
      this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(II)F",
      garbageValue = "2058338790"
   )
   @Export("getZoomFromPercentage")
   float getZoomFromPercentage(int var1) {
      if (var1 == 25) {
         return 1.0F;
      } else if (var1 == 37) {
         return 1.5F;
      } else if (var1 == 50) {
         return 2.0F;
      } else if (var1 == 75) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "755044862"
   )
   @Export("getZoomLevel")
   public int getZoomLevel() {
      if ((double)this.zoomTarget == 1.0D) {
         return 25;
      } else if (1.5D == (double)this.zoomTarget) {
         return 37;
      } else if ((double)this.zoomTarget == 2.0D) {
         return 50;
      } else if (3.0D == (double)this.zoomTarget) {
         return 75;
      } else {
         return 4.0D == (double)this.zoomTarget ? 100 : 200;
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "7039"
   )
   @Export("loadCache")
   public void loadCache() {
      this.cacheLoader.load();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1977951354"
   )
   @Export("isCacheLoaded")
   public boolean isCacheLoaded() {
      return this.cacheLoader.isLoaded();
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(II)Lar;",
      garbageValue = "24879988"
   )
   @Export("getMapArea")
   public WorldMapArea getMapArea(int var1) {
      Iterator var2 = this.details.values().iterator();

      WorldMapArea var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (WorldMapArea)var2.next();
      } while(var3.getId() != var1);

      return var3;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1763337265"
   )
   @Export("setWorldMapPositionTarget")
   public void setWorldMapPositionTarget(int var1, int var2) {
      if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
         this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
         this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1279892888"
   )
   @Export("setWorldMapPositionTargetInstant")
   public void setWorldMapPositionTargetInstant(int var1, int var2) {
      if (this.currentMapArea != null) {
         this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
         this.worldMapTargetX = -1;
         this.worldMapTargetY = -1;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "1845440607"
   )
   @Export("jumpToSourceCoord")
   public void jumpToSourceCoord(int var1, int var2, int var3) {
      if (this.currentMapArea != null) {
         int[] var4 = this.currentMapArea.position(var1, var2, var3);
         if (var4 != null) {
            this.setWorldMapPositionTarget(var4[0], var4[1]);
         }

      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "739439346"
   )
   @Export("jumpToSourceCoordInstant")
   public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
      if (this.currentMapArea != null) {
         int[] var4 = this.currentMapArea.position(var1, var2, var3);
         if (var4 != null) {
            this.setWorldMapPositionTargetInstant(var4[0], var4[1]);
         }

      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1657700908"
   )
   @Export("getDisplayX")
   public int getDisplayX() {
      return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-162188906"
   )
   @Export("getDisplayY")
   public int getDisplayY() {
      return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)Lhd;",
      garbageValue = "39771742"
   )
   @Export("getDisplayCoord")
   public Coord getDisplayCoord() {
      return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1570043056"
   )
   @Export("getDisplayWith")
   public int getDisplayWith() {
      return this.worldMapDisplayWidth;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("getDisplayHeight")
   public int getDisplayHeight() {
      return this.worldMapDisplayHeight;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1795336966"
   )
   @Export("setMaxFlashCount")
   public void setMaxFlashCount(int var1) {
      if (var1 >= 1) {
         this.maxFlashCount = var1;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-62"
   )
   @Export("resetMaxFlashCount")
   public void resetMaxFlashCount() {
      this.maxFlashCount = 3;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "91922323"
   )
   @Export("setCyclesPerFlash")
   public void setCyclesPerFlash(int var1) {
      if (var1 >= 1) {
         this.cyclesPerFlash = var1;
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "24643102"
   )
   @Export("resetCyclesPerFlash")
   public void resetCyclesPerFlash() {
      this.cyclesPerFlash = 50;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1604690679"
   )
   @Export("setPerpetualFlash")
   public void setPerpetualFlash(boolean var1) {
      this.perpetualFlash = var1;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-18"
   )
   @Export("flashElement")
   public void flashElement(int var1) {
      this.flashingElements = new HashSet();
      this.flashingElements.add(var1);
      this.flashCount = 0;
      this.flashCycle = 0;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "176453590"
   )
   @Export("flashCategory")
   public void flashCategory(int var1) {
      this.flashingElements = new HashSet();
      this.flashCount = 0;
      this.flashCycle = 0;

      for(int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
         if (InvDefinition.WorldMapElement_get(var2) != null && InvDefinition.WorldMapElement_get(var2).category == var1) {
            this.flashingElements.add(InvDefinition.WorldMapElement_get(var2).objectId);
         }
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "119"
   )
   @Export("stopCurrentFlashes")
   public void stopCurrentFlashes() {
      this.flashingElements = null;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "651351210"
   )
   @Export("setElementsDisabled")
   public void setElementsDisabled(boolean var1) {
      this.elementsDisabled = !var1;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-1491746515"
   )
   @Export("disableElement")
   public void disableElement(int var1, boolean var2) {
      if (!var2) {
         this.enabledElements.add(var1);
      } else {
         this.enabledElements.remove(var1);
      }

      this.method6571();
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "375985188"
   )
   @Export("setCategoryDisabled")
   public void setCategoryDisabled(int var1, boolean var2) {
      if (!var2) {
         this.enabledCategories.add(var1);
      } else {
         this.enabledCategories.remove(var1);
      }

      for(int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) {
         if (InvDefinition.WorldMapElement_get(var3) != null && InvDefinition.WorldMapElement_get(var3).category == var1) {
            int var4 = InvDefinition.WorldMapElement_get(var3).objectId;
            if (!var2) {
               this.enabledElementIds.add(var4);
            } else {
               this.enabledElementIds.remove(var4);
            }
         }
      }

      this.method6571();
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "1"
   )
   @Export("getElementsDisabled")
   public boolean getElementsDisabled() {
      return !this.elementsDisabled;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "799594991"
   )
   @Export("isElementDisabled")
   public boolean isElementDisabled(int var1) {
      return !this.enabledElements.contains(var1);
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1690733813"
   )
   @Export("isCategoryDisabled")
   public boolean isCategoryDisabled(int var1) {
      return !this.enabledCategories.contains(var1);
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "793022783"
   )
   void method6571() {
      this.field4032.clear();
      this.field4032.addAll(this.enabledElements);
      this.field4032.addAll(this.enabledElementIds);
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "-2078368565"
   )
   @Export("addElementMenuOptions")
   public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cacheLoader.isLoaded()) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
         int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
         List var9 = this.worldMapManager.method722(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
               WorldMapElement var12 = InvDefinition.WorldMapElement_get(var11.getElement());
               var13 = false;

               for(int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
                  if (var12.menuActions[var14] != null) {
                     WorldMapManager.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(ILhd;I)Lhd;",
      garbageValue = "242977526"
   )
   public Coord method6643(int var1, Coord var2) {
      if (!this.cacheLoader.isLoaded()) {
         return null;
      } else if (!this.worldMapManager.isLoaded()) {
         return null;
      } else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) {
         return null;
      } else {
         HashMap var3 = this.worldMapManager.buildIcons();
         List var4 = (List)var3.get(var1);
         if (var4 != null && !var4.isEmpty()) {
            AbstractWorldMapIcon var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               AbstractWorldMapIcon var8;
               int var11;
               do {
                  if (!var7.hasNext()) {
                     return var5.coord2;
                  }

                  var8 = (AbstractWorldMapIcon)var7.next();
                  int var9 = var8.coord2.x - var2.x;
                  int var10 = var8.coord2.y - var2.y;
                  var11 = var9 * var9 + var10 * var10;
                  if (var11 == 0) {
                     return var8.coord2;
                  }
               } while(var11 >= var6 && var5 != null);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(IILhd;Lhd;I)V",
      garbageValue = "-1238486806"
   )
   @Export("worldMapMenuAction")
   public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
      ScriptEvent var5 = new ScriptEvent();
      WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4);
      var5.setArgs(new Object[]{var6});
      switch(var1) {
      case 1008:
         var5.setType(10);
         break;
      case 1009:
         var5.setType(11);
         break;
      case 1010:
         var5.setType(12);
         break;
      case 1011:
         var5.setType(13);
         break;
      case 1012:
         var5.setType(14);
      }

      PacketWriter.runScriptEvent(var5);
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(B)Laj;",
      garbageValue = "-77"
   )
   @Export("iconStart")
   public AbstractWorldMapIcon iconStart() {
      if (!this.cacheLoader.isLoaded()) {
         return null;
      } else if (!this.worldMapManager.isLoaded()) {
         return null;
      } else {
         HashMap var1 = this.worldMapManager.buildIcons();
         this.field4035 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field4035.addAll(var3);
         }

         this.iconIterator = this.field4035.iterator();
         return this.iconNext();
      }
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(B)Laj;",
      garbageValue = "-25"
   )
   @Export("iconNext")
   public AbstractWorldMapIcon iconNext() {
      if (this.iconIterator == null) {
         return null;
      } else {
         AbstractWorldMapIcon var1;
         do {
            if (!this.iconIterator.hasNext()) {
               return null;
            }

            var1 = (AbstractWorldMapIcon)this.iconIterator.next();
         } while(var1.getElement() == -1);

         return var1;
      }
   }
}
