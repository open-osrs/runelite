import java.awt.Component;
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("WorldMapArea")
public class WorldMapArea {
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   @Export("js5Socket")
   static AbstractSocket js5Socket;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -63029259
   )
   @Export("id")
   int id = -1;
   @ObfuscatedName("v")
   @Export("internalName")
   String internalName;
   @ObfuscatedName("d")
   @Export("externalName")
   String externalName;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1891033177
   )
   @Export("backGroundColor")
   int backGroundColor = -1;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1386343271
   )
   @Export("zoom")
   int zoom = -1;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("origin")
   Coord origin = null;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -861412381
   )
   @Export("regionLowX")
   int regionLowX = Integer.MAX_VALUE;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1942318889
   )
   @Export("regionHighX")
   int regionHighX = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1790073795
   )
   @Export("regionLowY")
   int regionLowY = Integer.MAX_VALUE;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -407810153
   )
   @Export("regionHighY")
   int regionHighY = 0;
   @ObfuscatedName("s")
   @Export("isMain")
   boolean isMain = false;
   @ObfuscatedName("b")
   @Export("sections")
   LinkedList sections;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lkx;II)V",
      garbageValue = "-285424184"
   )
   @Export("read")
   public void read(Buffer var1, int var2) {
      this.id = var2;
      this.internalName = var1.readStringCp1252NullTerminated();
      this.externalName = var1.readStringCp1252NullTerminated();
      this.origin = new Coord(var1.readInt());
      this.backGroundColor = var1.readInt();
      var1.readUnsignedByte();
      this.isMain = var1.readUnsignedByte() == 1;
      this.zoom = var1.readUnsignedByte();
      int var3 = var1.readUnsignedByte();
      this.sections = new LinkedList();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.sections.add(this.readWorldMapSection(var1));
      }

      this.setBounds();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)Lab;",
      garbageValue = "369407724"
   )
   @Export("readWorldMapSection")
   WorldMapSection readWorldMapSection(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE1};
      WorldMapSectionType var4 = (WorldMapSectionType)InterfaceParent.findEnumerated(var3, var2);
      Object var5 = null;
      switch(var4.type) {
      case 0:
         var5 = new WorldMapSection1();
         break;
      case 1:
         var5 = new class51();
         break;
      case 2:
         var5 = new WorldMapSection0();
         break;
      case 3:
         var5 = new WorldMapSection2();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((WorldMapSection)var5).read(var1);
      return (WorldMapSection)var5;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "1455116535"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      Iterator var4 = this.sections.iterator();

      WorldMapSection var5;
      do {
         if (!var4.hasNext()) {
            return false;
         }

         var5 = (WorldMapSection)var4.next();
      } while(!var5.containsCoord(var1, var2, var3));

      return true;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-1715040975"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if (var3 >= this.regionLowX && var3 <= this.regionHighX) {
         if (var4 >= this.regionLowY && var4 <= this.regionHighY) {
            Iterator var5 = this.sections.iterator();

            WorldMapSection var6;
            do {
               if (!var5.hasNext()) {
                  return false;
               }

               var6 = (WorldMapSection)var5.next();
            } while(!var6.containsPosition(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "332088974"
   )
   @Export("position")
   public int[] position(int var1, int var2, int var3) {
      Iterator var4 = this.sections.iterator();

      WorldMapSection var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (WorldMapSection)var4.next();
      } while(!var5.containsCoord(var1, var2, var3));

      return var5.getBorderTileLengths(var1, var2, var3);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(III)Lhd;",
      garbageValue = "1033497447"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      Iterator var3 = this.sections.iterator();

      WorldMapSection var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (WorldMapSection)var3.next();
      } while(!var4.containsPosition(var1, var2));

      return var4.coord(var1, var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2087726603"
   )
   @Export("setBounds")
   void setBounds() {
      Iterator var1 = this.sections.iterator();

      while(var1.hasNext()) {
         WorldMapSection var2 = (WorldMapSection)var1.next();
         var2.expandBounds(this);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "872580750"
   )
   @Export("getId")
   public int getId() {
      return this.id;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-7"
   )
   @Export("getIsMain")
   public boolean getIsMain() {
      return this.isMain;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1550692471"
   )
   @Export("getInternalName")
   public String getInternalName() {
      return this.internalName;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "2036253540"
   )
   @Export("getExternalName")
   public String getExternalName() {
      return this.externalName;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   @Export("getBackGroundColor")
   int getBackGroundColor() {
      return this.backGroundColor;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2014656389"
   )
   @Export("getZoom")
   public int getZoom() {
      return this.zoom;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "128"
   )
   @Export("getRegionLowX")
   public int getRegionLowX() {
      return this.regionLowX;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "20"
   )
   @Export("getRegionHighX")
   public int getRegionHighX() {
      return this.regionHighX;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2024807463"
   )
   @Export("getRegionLowY")
   public int getRegionLowY() {
      return this.regionLowY;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1949221943"
   )
   @Export("getRegionHighY")
   public int getRegionHighY() {
      return this.regionHighY;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "759917118"
   )
   @Export("getOriginX")
   public int getOriginX() {
      return this.origin.x;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-13"
   )
   @Export("getOriginPlane")
   public int getOriginPlane() {
      return this.origin.plane;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-51"
   )
   @Export("getOriginY")
   public int getOriginY() {
      return this.origin.y;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(I)Lhd;",
      garbageValue = "-1797620911"
   )
   @Export("getOrigin")
   public Coord getOrigin() {
      return new Coord(this.origin);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "141354959"
   )
   static void method489(Component var0) {
      var0.addMouseListener(MouseHandler.MouseHandler_instance);
      var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
      var0.addFocusListener(MouseHandler.MouseHandler_instance);
   }

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1792034229"
   )
   @Export("getTapToDrop")
   static boolean getTapToDrop() {
      return Client.tapToDrop;
   }
}
