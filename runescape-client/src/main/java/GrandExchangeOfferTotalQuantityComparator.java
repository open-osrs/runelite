import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -308294739
   )
   @Export("canvasWidth")
   public static int canvasWidth;
   @ObfuscatedName("lu")
   @ObfuscatedGetter(
      intValue = -1017040151
   )
   @Export("menuHeight")
   static int menuHeight;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lx;Lx;B)I",
      garbageValue = "2"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Lcl;",
      garbageValue = "-37"
   )
   @Export("getWorldMapScript")
   static Script getWorldMapScript(int var0, int var1, int var2) {
      int var3 = (var1 << 8) + var0;
      Script var5 = class4.method46(var3, var0);
      if (var5 != null) {
         return var5;
      } else {
         int var6 = (var2 + '鱀' << 8) + var0;
         var5 = class4.method46(var6, var0);
         return var5 != null ? var5 : null;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "1998828049"
   )
   static final void method163(String var0, int var1) {
      PacketBufferNode var2 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2252, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var0) + 1);
      var2.packetBuffer.writeByte(var1);
      var2.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var2);
   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1940935635"
   )
   static void method162(int var0, int var1) {
      int var2 = ScriptEvent.fontBold12.stringWidth("Choose Option");

      int var3;
      int var4;
      for(var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
         var4 = ScriptEvent.fontBold12.stringWidth(WorldMapLabel.method504(var3));
         if (var4 > var2) {
            var2 = var4;
         }
      }

      var2 += 8;
      var3 = Client.menuOptionsCount * 15 + 22;
      var4 = var0 - var2 / 2;
      if (var4 + var2 > canvasWidth) {
         var4 = canvasWidth - var2;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      int var5 = var1;
      if (var3 + var1 > class25.canvasHeight) {
         var5 = class25.canvasHeight - var3;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      ApproximateRouteStrategy.menuX = var4;
      AbstractUserComparator.menuY = var5;
      CollisionMap.menuWidth = var2;
      menuHeight = Client.menuOptionsCount * 15 + 22;
   }
}
