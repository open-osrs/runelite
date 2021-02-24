import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
   @ObfuscatedName("nz")
   @ObfuscatedSignature(
      descriptor = "[Lhz;"
   )
   static Widget[] field362;
   @ObfuscatedName("a")
   @Export("worldMapData0Set")
   HashSet worldMapData0Set;
   @ObfuscatedName("w")
   @Export("worldMapData1Set")
   HashSet worldMapData1Set;
   @ObfuscatedName("k")
   @Export("iconList")
   List iconList;

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(Lkx;Lkx;IZI)V",
      garbageValue = "1841942277"
   )
   @Export("init")
   void init(Buffer var1, Buffer var2, int var3, boolean var4) {
      this.read(var1, var3);
      int var5 = var2.readUnsignedShort();
      this.worldMapData0Set = new HashSet(var5);

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         WorldMapData_0 var7 = new WorldMapData_0();

         try {
            var7.init(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.worldMapData0Set.add(var7);
      }

      var6 = var2.readUnsignedShort();
      this.worldMapData1Set = new HashSet(var6);

      for(int var10 = 0; var10 < var6; ++var10) {
         WorldMapData_1 var8 = new WorldMapData_1();

         try {
            var8.init(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.worldMapData1Set.add(var8);
      }

      this.initIconsList(var2, var4);
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(Lkx;ZI)V",
      garbageValue = "-1098628565"
   )
   @Export("initIconsList")
   void initIconsList(Buffer var1, boolean var2) {
      this.iconList = new LinkedList();
      int var3 = var1.readUnsignedShort();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.method5833();
         Coord var6 = new Coord(var1.readInt());
         boolean var7 = var1.readUnsignedByte() == 1;
         if (var2 || !var7) {
            this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Ljg;",
      garbageValue = "1068014822"
   )
   @Export("getObjectDefinition")
   public static ObjectComposition getObjectDefinition(int var0) {
      ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
         var1 = new ObjectComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         if (var1.isSolid) {
            var1.interactType = 0;
            var1.boolean1 = false;
         }

         ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-91"
   )
   public static void method782() {
      if (class297.NetCache_socket != null) {
         class297.NetCache_socket.close();
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   static final void method781() {
      class300.method5473("Your ignore list is full. Max of 100 for free users, and 400 for members");
   }
}
