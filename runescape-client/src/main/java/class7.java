import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public enum class7 implements Enumerated {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Le;"
   )
   field41(0, 0);

   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 324550527
   )
   @Export("pcmSampleLength")
   public static int pcmSampleLength;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 501713391
   )
   static int field35;
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("worldSelectLeftSprite")
   static IndexedSprite worldSelectLeftSprite;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -997715077
   )
   public final int field36;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1130896925
   )
   final int field37;

   class7(int var3, int var4) {
      this.field36 = var3;
      this.field37 = var4;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "63"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field37;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)[Lgs;",
      garbageValue = "2004297055"
   )
   public static class194[] method85() {
      return new class194[]{class194.field2348, class194.field2354, class194.field2347, class194.field2356, class194.field2350, class194.field2351, class194.field2352, class194.field2353, class194.field2346, class194.field2355};
   }

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)V",
      garbageValue = "-63"
   )
   static void method83(int var0, String var1) {
      int var2 = Players.Players_count;
      int[] var3 = Players.Players_indices;
      boolean var4 = false;
      Username var5 = new Username(var1, Message.loginType);

      for(int var6 = 0; var6 < var2; ++var6) {
         Player var7 = Client.players[var3[var6]];
         if (var7 != null && var7 != UserComparator9.localPlayer && var7.username != null && var7.username.equals(var5)) {
            PacketBufferNode var8;
            if (var0 == 1) {
               var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShortLE(var3[var6]);
               var8.packetBuffer.method5931(0);
               Client.packetWriter.addNode(var8);
            } else if (var0 == 4) {
               var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2275, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShortLE(var3[var6]);
               var8.packetBuffer.method5931(0);
               Client.packetWriter.addNode(var8);
            } else if (var0 == 6) {
               var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2239, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShort(var3[var6]);
               var8.packetBuffer.writeByte(0);
               Client.packetWriter.addNode(var8);
            } else if (var0 == 7) {
               var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2308, Client.packetWriter.isaacCipher);
               var8.packetBuffer.method5883(0);
               var8.packetBuffer.writeIntME(var3[var6]);
               Client.packetWriter.addNode(var8);
            }

            var4 = true;
            break;
         }
      }

      if (!var4) {
         AbstractWorldMapData.addGameMessage(4, "", "Unable to find " + var1);
      }

   }
}
