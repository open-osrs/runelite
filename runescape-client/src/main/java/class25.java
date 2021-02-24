import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class class25 {
   @ObfuscatedName("rh")
   @ObfuscatedGetter(
      intValue = 1113392768
   )
   static int field138;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1122358131
   )
   static int field146;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1646525393
   )
   @Export("canvasHeight")
   public static int canvasHeight;
   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive18")
   static Archive archive18;

   @ObfuscatedName("s")
   @Export("Entity_unpackID")
   public static int Entity_unpackID(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-52"
   )
   @Export("resumePauseWidget")
   static void resumePauseWidget(int var0, int var1) {
      PacketBufferNode var2 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2257, Client.packetWriter.isaacCipher);
      var2.packetBuffer.method5781(var0);
      var2.packetBuffer.writeIntME(var1);
      Client.packetWriter.addNode(var2);
   }
}
