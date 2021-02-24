import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("World")
public class World {
   @ObfuscatedName("qf")
   @ObfuscatedSignature(
      descriptor = "Ldq;"
   )
   @Export("decimator")
   static Decimator decimator;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "[Lcq;"
   )
   @Export("World_worlds")
   static World[] World_worlds;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1883151611
   )
   @Export("World_count")
   static int World_count = 0;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1211509963
   )
   @Export("World_listCount")
   static int World_listCount = 0;
   @ObfuscatedName("e")
   @Export("World_sortOption2")
   static int[] World_sortOption2 = new int[]{1, 1, 1, 1};
   @ObfuscatedName("q")
   @Export("World_sortOption1")
   static int[] World_sortOption1 = new int[]{0, 1, 2, 3};
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   static IndexedSprite field1039;
   @ObfuscatedName("ds")
   @ObfuscatedGetter(
      longValue = 4616072820016449217L
   )
   static long field1036;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1941942941
   )
   @Export("id")
   int id;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 2050399625
   )
   @Export("properties")
   int properties;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -602749729
   )
   @Export("population")
   int population;
   @ObfuscatedName("w")
   @Export("host")
   String host;
   @ObfuscatedName("k")
   @Export("activity")
   String activity;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -175273101
   )
   @Export("location")
   int location;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 865975071
   )
   @Export("index")
   int index;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1593793917"
   )
   @Export("isMembersOnly")
   boolean isMembersOnly() {
      return (1 & this.properties) != 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1662495711"
   )
   boolean method1878() {
      return (2 & this.properties) != 0;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1886649606"
   )
   @Export("isPvp")
   boolean isPvp() {
      return (4 & this.properties) != 0;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1928708058"
   )
   boolean method1880() {
      return (8 & this.properties) != 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "28"
   )
   @Export("isDeadman")
   boolean isDeadman() {
      return (536870912 & this.properties) != 0;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1939241099"
   )
   @Export("isBeta")
   boolean isBeta() {
      return (33554432 & this.properties) != 0;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "4"
   )
   boolean method1883() {
      return (1073741824 & this.properties) != 0;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1636550910"
   )
   public static void method1924() {
      VarpDefinition.VarpDefinition_cached.clear();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lkd;IS)Z",
      garbageValue = "-20652"
   )
   @Export("updateExternalPlayer")
   static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
      int var2 = var0.readBits(2);
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      if (var2 == 0) {
         if (var0.readBits(1) != 0) {
            updateExternalPlayer(var0, var1);
         }

         var3 = var0.readBits(13);
         var4 = var0.readBits(13);
         boolean var12 = var0.readBits(1) == 1;
         if (var12) {
            Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
         }

         if (Client.players[var1] != null) {
            throw new RuntimeException();
         } else {
            Player var11 = Client.players[var1] = new Player();
            var11.index = var1;
            if (Players.field1269[var1] != null) {
               var11.read(Players.field1269[var1]);
            }

            var11.orientation = Players.Players_orientations[var1];
            var11.targetIndex = Players.Players_targetIndices[var1];
            var7 = Players.Players_regions[var1];
            var8 = var7 >> 28;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            var11.pathTraversed[0] = Players.field1274[var1];
            var11.plane = (byte)var8;
            var11.resetPath((var9 << 13) + var3 - GrandExchangeOfferNameComparator.baseX * 64, (var10 << 13) + var4 - NetCache.baseY * 64);
            var11.field652 = false;
            return true;
         }
      } else if (var2 == 1) {
         var3 = var0.readBits(2);
         var4 = Players.Players_regions[var1];
         Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
         return false;
      } else {
         int var5;
         int var6;
         if (var2 == 2) {
            var3 = var0.readBits(5);
            var4 = var3 >> 3;
            var5 = var3 & 7;
            var6 = Players.Players_regions[var1];
            var7 = (var6 >> 28) + var4 & 3;
            var8 = var6 >> 14 & 255;
            var9 = var6 & 255;
            if (var5 == 0) {
               --var8;
               --var9;
            }

            if (var5 == 1) {
               --var9;
            }

            if (var5 == 2) {
               ++var8;
               --var9;
            }

            if (var5 == 3) {
               --var8;
            }

            if (var5 == 4) {
               ++var8;
            }

            if (var5 == 5) {
               --var8;
               ++var9;
            }

            if (var5 == 6) {
               ++var9;
            }

            if (var5 == 7) {
               ++var8;
               ++var9;
            }

            Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
            return false;
         } else {
            var3 = var0.readBits(18);
            var4 = var3 >> 16;
            var5 = var3 >> 8 & 255;
            var6 = var3 & 255;
            var7 = Players.Players_regions[var1];
            var8 = (var7 >> 28) + var4 & 3;
            var9 = var5 + (var7 >> 14) & 255;
            var10 = var6 + var7 & 255;
            Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
            return false;
         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "14756"
   )
   static void method1923() {
      Iterator var0 = Messages.Messages_hashTable.iterator();

      while(var0.hasNext()) {
         Message var1 = (Message)var0.next();
         var1.clearIsFromIgnored();
      }

   }

   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "37330821"
   )
   static void method1925() {
      if (UserComparator9.localPlayer.x >> 7 == Client.destinationX && UserComparator9.localPlayer.y >> 7 == Client.destinationY) {
         Client.destinationX = 0;
      }

   }
}
