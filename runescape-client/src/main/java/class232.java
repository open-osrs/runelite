import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class232 {
   static {
      int var0 = 0;
      int var1 = 0;
      class238[] var2 = class51.method872();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class238 var4 = var2[var3];
         if (var4.field3124 > var0) {
            var0 = var4.field3124;
         }

         if (var4.field3122 > var1) {
            var1 = var4.field3122;
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1954194850"
   )
   static int method4322(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.quantities.length; ++var4) {
            if (var2.ids[var4] == var1) {
               var3 += var2.quantities[var4];
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2044662786"
   )
   static void method4323() {
      Client.packetWriter.clearBuffer();
      Client.packetWriter.packetBuffer.offset = 0;
      Client.packetWriter.serverPacket = null;
      Client.packetWriter.field1331 = null;
      Client.packetWriter.field1333 = null;
      Client.packetWriter.field1334 = null;
      Client.packetWriter.serverPacketLength = 0;
      Client.packetWriter.field1330 = 0;
      Client.rebootTimer = 0;
      Client.menuOptionsCount = 0;
      Client.isMenuOpen = false;
      Client.minimapState = 0;
      Client.destinationX = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         Client.players[var0] = null;
      }

      UserComparator9.localPlayer = null;

      for(var0 = 0; var0 < Client.npcs.length; ++var0) {
         NPC var1 = Client.npcs[var0];
         if (var1 != null) {
            var1.targetIndex = -1;
            var1.false0 = false;
         }
      }

      ItemContainer.itemContainers = new NodeHashTable(32);
      ItemContainer.updateGameState(30);

      for(var0 = 0; var0 < 100; ++var0) {
         Client.field816[var0] = true;
      }

      PacketBufferNode var2 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2290, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(BoundaryObject.getWindowedMode());
      var2.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth);
      var2.packetBuffer.writeShort(class25.canvasHeight);
      Client.packetWriter.addNode(var2);
   }
}
