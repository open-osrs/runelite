import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class class58 {
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1266469825
   )
   @Export("VarpDefinition_fileCount")
   public static int VarpDefinition_fileCount;

   static {
      ImageIO.setUseCache(false);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1558646174"
   )
   static void method939() {
      Tiles.Tiles_minPlane = 99;
      Tiles.field517 = new byte[4][104][104];
      class200.field2399 = new byte[4][104][104];
      Tiles.field530 = new byte[4][104][104];
      class1.field1 = new byte[4][104][104];
      class2.field12 = new int[4][105][105];
      TaskHandler.field2045 = new byte[4][105][105];
      WorldMapSprite.field257 = new int[105][105];
      GrandExchangeOfferAgeComparator.Tiles_hue = new int[104];
      Tiles.Tiles_saturation = new int[104];
      WorldMapLabel.Tiles_lightness = new int[104];
      TaskHandler.Tiles_hueMultiplier = new int[104];
      WorldMapID.field292 = new int[104];
   }

   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-1370072473"
   )
   @Export("queueSoundEffect")
   static void queueSoundEffect(int var0, int var1, int var2) {
      if (WorldMapSectionType.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) {
         Client.soundEffectIds[Client.soundEffectCount] = var0;
         Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
         Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
         Client.soundEffects[Client.soundEffectCount] = null;
         Client.soundLocations[Client.soundEffectCount] = 0;
         ++Client.soundEffectCount;
      }

   }

   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      descriptor = "(Lhz;III)V",
      garbageValue = "797800521"
   )
   @Export("Widget_addToMenu")
   static final void Widget_addToMenu(Widget var0, int var1, int var2) {
      if (var0.buttonType == 1) {
         WorldMapManager.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
      }

      String var3;
      if (var0.buttonType == 2 && !Client.isSpellSelected) {
         var3 = Player.Widget_getSpellActionName(var0);
         if (var3 != null) {
            WorldMapManager.insertMenuItemNoShift(var3, FileSystem.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
         }
      }

      if (var0.buttonType == 3) {
         WorldMapManager.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
      }

      if (var0.buttonType == 4) {
         WorldMapManager.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
      }

      if (var0.buttonType == 5) {
         WorldMapManager.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
      }

      if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
         WorldMapManager.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
      }

      int var4;
      int var5;
      int var15;
      if (var0.type == 2) {
         var15 = 0;

         for(var4 = 0; var4 < var0.height; ++var4) {
            for(var5 = 0; var5 < var0.width; ++var5) {
               int var18 = (var0.paddingX + 32) * var5;
               int var7 = (var0.paddingY + 32) * var4;
               if (var15 < 20) {
                  var18 += var0.inventoryXOffsets[var15];
                  var7 += var0.inventoryYOffsets[var15];
               }

               if (var1 >= var18 && var2 >= var7 && var1 < var18 + 32 && var2 < var7 + 32) {
                  Client.dragItemSlotDestination = var15;
                  HorizontalAlignment.hoveredItemContainer = var0;
                  if (var0.itemIds[var15] > 0) {
                     ItemComposition var8 = class281.ItemDefinition_get(var0.itemIds[var15] - 1);
                     if (Client.isItemSelected == 1 && Login.method2244(class60.getWidgetFlags(var0))) {
                        if (var0.id != ClientPacket.selectedItemWidget || var15 != class195.selectedItemSlot) {
                           WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FileSystem.colorStartTag(16748608) + var8.name, 31, var8.id, var15, var0.id);
                        }
                     } else if (Client.isSpellSelected && Login.method2244(class60.getWidgetFlags(var0))) {
                        if ((GrandExchangeOfferNameComparator.selectedSpellFlags & 16) == 16) {
                           WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FileSystem.colorStartTag(16748608) + var8.name, 32, var8.id, var15, var0.id);
                        }
                     } else {
                        String[] var9 = var8.inventoryActions;
                        int var10 = -1;
                        if (Client.shiftClickDrop && ModeWhere.method3875()) {
                           var10 = var8.getShiftClickIndex();
                        }

                        if (Login.method2244(class60.getWidgetFlags(var0))) {
                           for(int var11 = 4; var11 >= 3; --var11) {
                              if (var10 != var11) {
                                 class204.addWidgetItemMenuItem(var0, var8, var15, var11, false);
                              }
                           }
                        }

                        int var12 = class60.getWidgetFlags(var0);
                        boolean var20 = (var12 >> 31 & 1) != 0;
                        if (var20) {
                           WorldMapManager.insertMenuItemNoShift("Use", FileSystem.colorStartTag(16748608) + var8.name, 38, var8.id, var15, var0.id);
                        }

                        Object var10000 = null;
                        int var13;
                        if (Login.method2244(class60.getWidgetFlags(var0))) {
                           for(var13 = 2; var13 >= 0; --var13) {
                              if (var10 != var13) {
                                 class204.addWidgetItemMenuItem(var0, var8, var15, var13, false);
                              }
                           }

                           if (var10 >= 0) {
                              class204.addWidgetItemMenuItem(var0, var8, var15, var10, true);
                           }
                        }

                        var9 = var0.itemActions;
                        if (var9 != null) {
                           for(var13 = 4; var13 >= 0; --var13) {
                              if (var9[var13] != null) {
                                 byte var14 = 0;
                                 if (var13 == 0) {
                                    var14 = 39;
                                 }

                                 if (var13 == 1) {
                                    var14 = 40;
                                 }

                                 if (var13 == 2) {
                                    var14 = 41;
                                 }

                                 if (var13 == 3) {
                                    var14 = 42;
                                 }

                                 if (var13 == 4) {
                                    var14 = 43;
                                 }

                                 WorldMapManager.insertMenuItemNoShift(var9[var13], FileSystem.colorStartTag(16748608) + var8.name, var14, var8.id, var15, var0.id);
                              }
                           }
                        }

                        WorldMapManager.insertMenuItemNoShift("Examine", FileSystem.colorStartTag(16748608) + var8.name, 1005, var8.id, var15, var0.id);
                     }
                  }
               }

               ++var15;
            }
         }
      }

      if (var0.isIf3) {
         if (Client.isSpellSelected) {
            var4 = class60.getWidgetFlags(var0);
            boolean var21 = (var4 >> 21 & 1) != 0;
            if (var21 && (GrandExchangeOfferNameComparator.selectedSpellFlags & 32) == 32) {
               WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
            }
         } else {
            for(var15 = 9; var15 >= 5; --var15) {
               String var17;
               if (!MidiPcmStream.method3972(class60.getWidgetFlags(var0), var15) && var0.onOp == null) {
                  var17 = null;
               } else if (var0.actions != null && var0.actions.length > var15 && var0.actions[var15] != null && var0.actions[var15].trim().length() != 0) {
                  var17 = var0.actions[var15];
               } else {
                  var17 = null;
               }

               if (var17 != null) {
                  WorldMapManager.insertMenuItemNoShift(var17, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id);
               }
            }

            var3 = Player.Widget_getSpellActionName(var0);
            if (var3 != null) {
               WorldMapManager.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
            }

            for(var4 = 4; var4 >= 0; --var4) {
               String var16;
               if (!MidiPcmStream.method3972(class60.getWidgetFlags(var0), var4) && var0.onOp == null) {
                  var16 = null;
               } else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
                  var16 = var0.actions[var4];
               } else {
                  var16 = null;
               }

               if (var16 != null) {
                  WorldMapEvent.insertMenuItem(var16, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
               }
            }

            var5 = class60.getWidgetFlags(var0);
            boolean var19 = (var5 & 1) != 0;
            if (var19) {
               WorldMapManager.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
            }
         }
      }

   }
}
