import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lip;"
   )
   @Export("NetCache_currentResponse")
   public static NetFileRequest NetCache_currentResponse;
   @ObfuscatedName("fp")
   @ObfuscatedSignature(
      descriptor = "Lkl;"
   )
   @Export("fontPlain11")
   static Font fontPlain11;

   public Object call() {
      return class39.method643();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1343548281"
   )
   static final int method1226(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-33"
   )
   @Export("logOut")
   static final void logOut() {
      Client.packetWriter.close();
      class228.method4311();
      FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
      KitDefinition.KitDefinition_cached.clear();
      ObjectDefinition.ObjectDefinition_cached.clear();
      ObjectDefinition.ObjectDefinition_cachedModelData.clear();
      ObjectDefinition.ObjectDefinition_cachedEntities.clear();
      ObjectDefinition.ObjectDefinition_cachedModels.clear();
      NPCDefinition.NpcDefinition_cached.clear();
      NPCDefinition.NpcDefinition_cachedModels.clear();
      ItemDefinition.ItemDefinition_cached.clear();
      ItemDefinition.ItemDefinition_cachedModels.clear();
      ItemDefinition.ItemDefinition_cachedSprites.clear();
      SequenceDefinition.SequenceDefinition_cached.clear();
      SequenceDefinition.SequenceDefinition_cachedFrames.clear();
      WorldMapEvent.method851();
      VarbitDefinition.VarbitDefinition_cached.clear();
      World.method1924();
      KeyHandler.method913();
      Tile.method3032();
      StructDefinition.StructDefinition_cached.clear();
      ParamDefinition.ParamDefinition_cached.clear();
      TileItemPile.method2938();
      PlayerAppearance.PlayerAppearance_cachedModels.clear();
      WorldMapEvent.method850();
      ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
      Script.Script_cached.clear();
      class52.archive0.clearFiles();
      SpriteMask.archive1.clearFiles();
      PlayerAppearance.archive3.clearFiles();
      WorldMapCacheName.archive4.clearFiles();
      class8.archive5.clearFiles();
      UrlRequester.archive6.clearFiles();
      WorldMapData_0.archive7.clearFiles();
      ModeWhere.archive8.clearFiles();
      ViewportMouse.archive9.clearFiles();
      LoginScreenAnimation.archive10.clearFiles();
      WorldMapManager.archive11.clearFiles();
      WorldMapSection0.archive12.clearFiles();
      MilliClock.scene.clear();

      for(int var0 = 0; var0 < 4; ++var0) {
         Client.collisionMaps[var0].clear();
      }

      System.gc();
      class206.musicPlayerStatus = 1;
      class206.musicTrackArchive = null;
      class206.musicTrackGroupId = -1;
      SoundSystem.musicTrackFileId = -1;
      DevicePcmPlayerProvider.musicTrackVolume = 0;
      class206.musicTrackBoolean = false;
      class7.pcmSampleLength = 2;
      Client.currentTrackGroupId = -1;
      Client.field899 = false;

      for(ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var1.stream1 != null) {
            VarbitDefinition.pcmStreamMixer.removeSubStream(var1.stream1);
            var1.stream1 = null;
         }

         if (var1.stream2 != null) {
            VarbitDefinition.pcmStreamMixer.removeSubStream(var1.stream2);
            var1.stream2 = null;
         }
      }

      ObjectSound.objectSounds.clear();
      ItemContainer.updateGameState(10);
   }

   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      descriptor = "(Lhz;III)V",
      garbageValue = "860211947"
   )
   @Export("checkIfMinimapClicked")
   static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
      if (Client.minimapState == 0 || Client.minimapState == 3) {
         if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
            SpriteMask var3 = var0.getSpriteMask(true);
            if (var3 == null) {
               return;
            }

            int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
            int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
            if (var3.contains(var4, var5)) {
               var4 -= var3.width / 2;
               var5 -= var3.height / 2;
               int var6 = Client.camAngleY & 2047;
               int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
               int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
               int var9 = var4 * var8 + var5 * var7 >> 11;
               int var10 = var5 * var8 - var7 * var4 >> 11;
               int var11 = var9 + UserComparator9.localPlayer.x >> 7;
               int var12 = UserComparator9.localPlayer.y - var10 >> 7;
               PacketBufferNode var13 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2260, Client.packetWriter.isaacCipher);
               var13.packetBuffer.writeByte(18);
               var13.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
               var13.packetBuffer.writeIntME(NetCache.baseY * 64 + var12);
               var13.packetBuffer.writeShort(GrandExchangeOfferNameComparator.baseX * 64 + var11);
               var13.packetBuffer.writeByte(var4);
               var13.packetBuffer.writeByte(var5);
               var13.packetBuffer.writeShort(Client.camAngleY);
               var13.packetBuffer.writeByte(57);
               var13.packetBuffer.writeByte(0);
               var13.packetBuffer.writeByte(0);
               var13.packetBuffer.writeByte(89);
               var13.packetBuffer.writeShort(UserComparator9.localPlayer.x);
               var13.packetBuffer.writeShort(UserComparator9.localPlayer.y);
               var13.packetBuffer.writeByte(63);
               Client.packetWriter.addNode(var13);
               Client.destinationX = var11;
               Client.destinationY = var12;
            }
         }

      }
   }

   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-358852627"
   )
   static int method1233(int var0, int var1) {
      int var2 = var1 - 334;
      if (var2 < 0) {
         var2 = 0;
      } else if (var2 > 100) {
         var2 = 100;
      }

      int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
      return var0 * var3 / 256;
   }
}
