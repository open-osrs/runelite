import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public final class class13 {
   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      descriptor = "[Llm;"
   )
   @Export("headIconHintSprites")
   static Sprite[] headIconHintSprites;

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1434868681"
   )
   @Export("drawEntities")
   static final void drawEntities(int var0, int var1, int var2, int var3) {
      ++Client.viewportDrawCount;
      World.method1925();
      if (Client.renderSelf) {
         WorldMapScaleHandler.addPlayerToScene(UserComparator9.localPlayer, false);
      }

      RouteStrategy.method3794();
      GameShell.addNpcsToScene(true);
      int var4 = Players.Players_count;
      int[] var5 = Players.Players_indices;

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
            WorldMapScaleHandler.addPlayerToScene(Client.players[var5[var6]], true);
         }
      }

      GameShell.addNpcsToScene(false);
      Decimator.method2708();
      DevicePcmPlayerProvider.method920();
      MenuAction.setViewportShape(var0, var1, var2, var3, true);
      var0 = Client.viewportOffsetX;
      var1 = Client.viewportOffsetY;
      var2 = Client.viewportWidth;
      var3 = Client.viewportHeight;
      Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
      Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
      int var7;
      int var8;
      int var11;
      int var28;
      if (!Client.isCameraLocked) {
         var4 = Client.camAngleX;
         if (Client.field880 / 256 > var4) {
            var4 = Client.field880 / 256;
         }

         if (Client.field907[4] && Client.field909[4] + 128 > var4) {
            var4 = Client.field909[4] + 128;
         }

         var28 = Client.camAngleY & 2047;
         var6 = HealthBarUpdate.oculusOrbFocalPointX;
         var7 = ModelData0.field1882;
         var8 = ApproximateRouteStrategy.oculusOrbFocalPointY;
         var11 = var4 * 3 + 600;
         class258.method4685(var6, var7, var8, var4, var28, var11, var3);
      }

      if (!Client.isCameraLocked) {
         var4 = AbstractWorldMapIcon.method712();
      } else {
         var4 = class171.method3639();
      }

      var28 = SecureRandomFuture.cameraX;
      var6 = ArchiveLoader.cameraY;
      var7 = ObjectSound.cameraZ;
      var8 = KeyHandler.cameraPitch;
      int var9 = class39.cameraYaw;

      int var10;
      for(var10 = 0; var10 < 5; ++var10) {
         if (Client.field907[var10]) {
            var11 = (int)(Math.random() * (double)(Client.field908[var10] * 2 + 1) - (double)Client.field908[var10] + Math.sin((double)Client.field799[var10] / 100.0D * (double)Client.field911[var10]) * (double)Client.field909[var10]);
            if (var10 == 0) {
               SecureRandomFuture.cameraX += var11;
            }

            if (var10 == 1) {
               ArchiveLoader.cameraY += var11;
            }

            if (var10 == 2) {
               ObjectSound.cameraZ += var11;
            }

            if (var10 == 3) {
               class39.cameraYaw = var11 + class39.cameraYaw & 2047;
            }

            if (var10 == 4) {
               KeyHandler.cameraPitch += var11;
               if (KeyHandler.cameraPitch < 128) {
                  KeyHandler.cameraPitch = 128;
               }

               if (KeyHandler.cameraPitch > 383) {
                  KeyHandler.cameraPitch = 383;
               }
            }
         }
      }

      var10 = MouseHandler.MouseHandler_x;
      var11 = MouseHandler.MouseHandler_y;
      if (MouseHandler.MouseHandler_lastButton != 0) {
         var10 = MouseHandler.MouseHandler_lastPressedX;
         var11 = MouseHandler.MouseHandler_lastPressedY;
      }

      if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) {
         GrandExchangeOfferWorldComparator.method137(var10 - var0, var11 - var1);
      } else {
         ViewportMouse.ViewportMouse_isInViewport = false;
         ViewportMouse.ViewportMouse_entityCount = 0;
      }

      UserComparator5.playPcmPlayers();
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
      UserComparator5.playPcmPlayers();
      int var12 = Rasterizer3D.Rasterizer3D_zoom;
      Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
      MilliClock.scene.draw(SecureRandomFuture.cameraX, ArchiveLoader.cameraY, ObjectSound.cameraZ, KeyHandler.cameraPitch, class39.cameraYaw, var4);
      Rasterizer3D.Rasterizer3D_zoom = var12;
      UserComparator5.playPcmPlayers();
      MilliClock.scene.clearTempGameObjects();
      Client.overheadTextCount = 0;
      boolean var13 = false;
      int var14 = -1;
      int var15 = -1;
      int var16 = Players.Players_count;
      int[] var17 = Players.Players_indices;

      int var18;
      for(var18 = 0; var18 < var16 + Client.npcCount; ++var18) {
         Object var30;
         if (var18 < var16) {
            var30 = Client.players[var17[var18]];
            if (var17[var18] == Client.combatTargetPlayerIndex) {
               var13 = true;
               var14 = var18;
               continue;
            }

            if (var30 == UserComparator9.localPlayer) {
               var15 = var18;
               continue;
            }
         } else {
            var30 = Client.npcs[Client.npcIndices[var18 - var16]];
         }

         UserComparator5.drawActor2d((Actor)var30, var18, var0, var1, var2, var3);
      }

      if (Client.renderSelf && var15 != -1) {
         UserComparator5.drawActor2d(UserComparator9.localPlayer, var15, var0, var1, var2, var3);
      }

      if (var13) {
         UserComparator5.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var14, var0, var1, var2, var3);
      }

      for(var18 = 0; var18 < Client.overheadTextCount; ++var18) {
         int var19 = Client.overheadTextXs[var18];
         int var20 = Client.overheadTextYs[var18];
         int var21 = Client.overheadTextXOffsets[var18];
         int var22 = Client.overheadTextAscents[var18];
         boolean var23 = true;

         while(var23) {
            var23 = false;

            for(int var29 = 0; var29 < var18; ++var29) {
               if (var20 + 2 > Client.overheadTextYs[var29] - Client.overheadTextAscents[var29] && var20 - var22 < Client.overheadTextYs[var29] + 2 && var19 - var21 < Client.overheadTextXs[var29] + Client.overheadTextXOffsets[var29] && var21 + var19 > Client.overheadTextXs[var29] - Client.overheadTextXOffsets[var29] && Client.overheadTextYs[var29] - Client.overheadTextAscents[var29] < var20) {
                  var20 = Client.overheadTextYs[var29] - Client.overheadTextAscents[var29];
                  var23 = true;
               }
            }
         }

         Client.viewportTempX = Client.overheadTextXs[var18];
         Client.viewportTempY = Client.overheadTextYs[var18] = var20;
         String var24 = Client.overheadText[var18];
         if (Client.chatEffects == 0) {
            int var25 = 16776960;
            if (Client.overheadTextColors[var18] < 6) {
               var25 = Client.field879[Client.overheadTextColors[var18]];
            }

            if (Client.overheadTextColors[var18] == 6) {
               var25 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
            }

            if (Client.overheadTextColors[var18] == 7) {
               var25 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
            }

            if (Client.overheadTextColors[var18] == 8) {
               var25 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
            }

            int var26;
            if (Client.overheadTextColors[var18] == 9) {
               var26 = 150 - Client.overheadTextCyclesRemaining[var18];
               if (var26 < 50) {
                  var25 = var26 * 1280 + 16711680;
               } else if (var26 < 100) {
                  var25 = 16776960 - (var26 - 50) * 327680;
               } else if (var26 < 150) {
                  var25 = (var26 - 100) * 5 + '\uff00';
               }
            }

            if (Client.overheadTextColors[var18] == 10) {
               var26 = 150 - Client.overheadTextCyclesRemaining[var18];
               if (var26 < 50) {
                  var25 = var26 * 5 + 16711680;
               } else if (var26 < 100) {
                  var25 = 16711935 - (var26 - 50) * 327680;
               } else if (var26 < 150) {
                  var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
               }
            }

            if (Client.overheadTextColors[var18] == 11) {
               var26 = 150 - Client.overheadTextCyclesRemaining[var18];
               if (var26 < 50) {
                  var25 = 16777215 - var26 * 327685;
               } else if (var26 < 100) {
                  var25 = (var26 - 50) * 327685 + '\uff00';
               } else if (var26 < 150) {
                  var25 = 16777215 - (var26 - 100) * 327680;
               }
            }

            if (Client.overheadTextEffects[var18] == 0) {
               ScriptEvent.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0);
            }

            if (Client.overheadTextEffects[var18] == 1) {
               ScriptEvent.fontBold12.drawCenteredWave(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
            }

            if (Client.overheadTextEffects[var18] == 2) {
               ScriptEvent.fontBold12.drawCenteredWave2(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
            }

            if (Client.overheadTextEffects[var18] == 3) {
               ScriptEvent.fontBold12.drawCenteredShake(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var18]);
            }

            if (Client.overheadTextEffects[var18] == 4) {
               var26 = (150 - Client.overheadTextCyclesRemaining[var18]) * (ScriptEvent.fontBold12.stringWidth(var24) + 100) / 150;
               Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
               ScriptEvent.fontBold12.draw(var24, var0 + Client.viewportTempX + 50 - var26, Client.viewportTempY + var1, var25, 0);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
            }

            if (Client.overheadTextEffects[var18] == 5) {
               var26 = 150 - Client.overheadTextCyclesRemaining[var18];
               int var27 = 0;
               if (var26 < 25) {
                  var27 = var26 - 25;
               } else if (var26 > 125) {
                  var27 = var26 - 125;
               }

               Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - ScriptEvent.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
               ScriptEvent.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, var27 + Client.viewportTempY + var1, var25, 0);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            ScriptEvent.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
         }
      }

      if (Client.hintArrowType == 2) {
         ParamDefinition.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - GrandExchangeOfferNameComparator.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - NetCache.baseY * 64 << 7), Client.hintArrowHeight * 4);
         if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
            headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
         }
      }

      ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field808);
      WorldMapSectionType.method318(var0, var1, var2, var3);
      SecureRandomFuture.cameraX = var28;
      ArchiveLoader.cameraY = var6;
      ObjectSound.cameraZ = var7;
      KeyHandler.cameraPitch = var8;
      class39.cameraYaw = var9;
      if (Client.isLoading) {
         byte var31 = 0;
         var14 = var31 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
         if (var14 == 0) {
            Client.isLoading = false;
         }
      }

      if (Client.isLoading) {
         Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
         WorldMapIcon_1.drawLoadingMessage("Loading - please wait.", false);
      }

   }

   @ObfuscatedName("lx")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1775407691"
   )
   static void method122() {
      if (Client.field747 && UserComparator9.localPlayer != null) {
         int var0 = UserComparator9.localPlayer.pathX[0];
         int var1 = UserComparator9.localPlayer.pathY[0];
         if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
         }

         HealthBarUpdate.oculusOrbFocalPointX = UserComparator9.localPlayer.x;
         int var2 = WorldMapRegion.getTileHeight(UserComparator9.localPlayer.x, UserComparator9.localPlayer.y, class90.Client_plane) - Client.camFollowHeight;
         if (var2 < ModelData0.field1882) {
            ModelData0.field1882 = var2;
         }

         ApproximateRouteStrategy.oculusOrbFocalPointY = UserComparator9.localPlayer.y;
         Client.field747 = false;
      }

   }
}
