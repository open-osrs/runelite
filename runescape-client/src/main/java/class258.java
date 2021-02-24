import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class258 {
   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIII)V",
      garbageValue = "1214767068"
   )
   static final void method4685(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var5 = SecureRandomCallable.method1233(var5, var6);
      int var7 = 2048 - var3 & 2047;
      int var8 = 2048 - var4 & 2047;
      int var9 = 0;
      int var10 = 0;
      int var11 = var5;
      int var12;
      int var13;
      int var14;
      if (var7 != 0) {
         var12 = Rasterizer3D.Rasterizer3D_sine[var7];
         var13 = Rasterizer3D.Rasterizer3D_cosine[var7];
         var14 = var13 * var10 - var5 * var12 >> 16;
         var11 = var13 * var5 + var12 * var10 >> 16;
         var10 = var14;
      }

      if (var8 != 0) {
         var12 = Rasterizer3D.Rasterizer3D_sine[var8];
         var13 = Rasterizer3D.Rasterizer3D_cosine[var8];
         var14 = var13 * var9 + var11 * var12 >> 16;
         var11 = var13 * var11 - var12 * var9 >> 16;
         var9 = var14;
      }

      SecureRandomFuture.cameraX = var0 - var9;
      ArchiveLoader.cameraY = var1 - var10;
      ObjectSound.cameraZ = var2 - var11;
      KeyHandler.cameraPitch = var3;
      class39.cameraYaw = var4;
      if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (HealthBarUpdate.oculusOrbFocalPointX >> 7 != UserComparator9.localPlayer.x >> 7 || ApproximateRouteStrategy.oculusOrbFocalPointY >> 7 != UserComparator9.localPlayer.y >> 7)) {
         var12 = UserComparator9.localPlayer.plane;
         var13 = GrandExchangeOfferNameComparator.baseX * 64 + (HealthBarUpdate.oculusOrbFocalPointX >> 7);
         var14 = NetCache.baseY * 64 + (ApproximateRouteStrategy.oculusOrbFocalPointY >> 7);
         PacketBufferNode var15 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2230, Client.packetWriter.isaacCipher);
         var15.packetBuffer.writeShortLE(var14);
         var15.packetBuffer.method5883(var12);
         var15.packetBuffer.method5736(Client.field746);
         var15.packetBuffer.writeIntME(var13);
         Client.packetWriter.addNode(var15);
      }

   }
}
