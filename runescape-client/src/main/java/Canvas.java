import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 2077405845
   )
   static int field439;
   @ObfuscatedName("lz")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   @Export("mousedOverWidgetIf1")
   static Widget mousedOverWidgetIf1;
   @ObfuscatedName("n")
   @Export("component")
   Component component;

   Canvas(Component var1) {
      this.component = var1;
   }

   public final void update(Graphics var1) {
      this.component.update(var1);
   }

   public final void paint(Graphics var1) {
      this.component.paint(var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-866196004"
   )
   static int method935(int var0) {
      return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
   }

   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIII)V",
      garbageValue = "-614885261"
   )
   @Export("updatePendingSpawn")
   static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      PendingSpawn var9 = null;

      for(PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
            var9 = var10;
            break;
         }
      }

      if (var9 == null) {
         var9 = new PendingSpawn();
         var9.plane = var0;
         var9.type = var3;
         var9.x = var1;
         var9.y = var2;
         WorldMapElement.method4592(var9);
         Client.pendingSpawns.addFirst(var9);
      }

      var9.id = var4;
      var9.field948 = var5;
      var9.orientation = var6;
      var9.delay = var7;
      var9.hitpoints = var8;
   }

   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-54323362"
   )
   @Export("Clan_leaveChat")
   static final void Clan_leaveChat() {
      PacketBufferNode var0 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2270, Client.packetWriter.isaacCipher);
      var0.packetBuffer.writeByte(0);
      Client.packetWriter.addNode(var0);
   }
}
