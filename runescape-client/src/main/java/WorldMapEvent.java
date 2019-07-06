import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("WorldMapEvent")
public class WorldMapEvent {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Llq;"
   )
   @Export("runesSprite")
   static IndexedSprite[] runesSprite;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 264384233
   )
   @Export("mapElement")
   public int mapElement;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   @Export("coord1")
   public TileLocation coord1;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   @Export("coord2")
   public TileLocation coord2;

   @ObfuscatedSignature(
      signature = "(ILhu;Lhu;)V"
   )
   public WorldMapEvent(int var1, TileLocation var2, TileLocation var3) {
      this.mapElement = var1;
      this.coord1 = var2;
      this.coord2 = var3;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-782761258"
   )
   public static int method780(int var0) {
      return UnitPriceComparator.method134(ViewportMouse.ViewportMouse_entityTags[var0]);
   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "2"
   )
   @Export("addSceneMenuOptions")
   static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
      if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
         Tiles.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;
      int var8 = 0;

      while (true) {
         int var9 = ViewportMouse.ViewportMouse_entityCount;
         if (var8 >= var9) {
            if (-1L != var4) {
               var8 = UnitPriceComparator.method134(var4);
               int var29 = (int)(var4 >>> 7 & 127L);
               Player var11 = Client.players[Client.combatTargetPlayerIndex];
               TotalQuantityComparator.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var29);
            }

            return;
         }

         long tag = ViewportMouse.ViewportMouse_entityTags[var8];
         if (var6 != tag) {
            label276: {
               var6 = tag;
               int x = method780(var8);
               long var13 = ViewportMouse.ViewportMouse_entityTags[var8];
               int y = (int)(var13 >>> 7 & 127L);
               y = y;
               int var16 = GrandExchangeEvent.method80(var8);
               int identifier = ClientPreferences.method1808(var8);
               if (var16 == 2 && class65.scene.getObjectFlags(SoundSystem.plane, x, y, tag) >= 0) {
                  ObjectDefinition var18 = class50.getObjectDefinition(identifier);
                  if (var18.transforms != null) {
                     var18 = var18.transform();
                  }

                  if (var18 == null) {
                     break label276;
                  }

                  if (Client.isItemSelected == 1) {
                     Tiles.insertMenuItemNoShift("Use", Client.selectedItemName + " -> " + BufferedFile.colorStartTag(65535) + var18.name, 1, identifier, x, y);
                  } else if (Client.isSpellSelected) {
                     if ((FloorDecoration.selectedSpellFlags & 4) == 4) {
                        Tiles.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " -> " + BufferedFile.colorStartTag(65535) + var18.name, 2, identifier, x, y);
                     }
                  } else {
                     String[] var19 = var18.actions;
                     if (var19 != null) {
                        for (int var20 = 4; var20 >= 0; --var20) {
                           if (var19[var20] != null) {
                              short var21 = 0;
                              if (var20 == 0) {
                                 var21 = 3;
                              }

                              if (var20 == 1) {
                                 var21 = 4;
                              }

                              if (var20 == 2) {
                                 var21 = 5;
                              }

                              if (var20 == 3) {
                                 var21 = 6;
                              }

                              if (var20 == 4) {
                                 var21 = 1001;
                              }

                              Tiles.insertMenuItemNoShift(var19[var20], BufferedFile.colorStartTag(65535) + var18.name, var21, identifier, x, y);
                           }
                        }
                     }

                     Tiles.insertMenuItemNoShift("Examine", BufferedFile.colorStartTag(65535) + var18.name, 1002, var18.id, x, y);
                  }
               }

               int var22;
               int var30;
               NPC var31;
               Player var32;
               int[] var34;
               if (var16 == 1) {
                  NPC var23 = Client.npcs[identifier];
                  if (var23 == null) {
                     break label276;
                  }

                  if (var23.definition.size == 1 && (var23.x & 127) == 64 && (var23.y & 127) == 64) {
                     for (var30 = 0; var30 < Client.npcCount; ++var30) {
                        var31 = Client.npcs[Client.npcIndices[var30]];
                        if (var31 != null && var23 != var31 && var31.definition.size == 1 && var31.x == var23.x && var31.y == var23.y) {
                           Tile.addNpcToMenu(var31.definition, Client.npcIndices[var30], x, y);
                        }
                     }

                     var30 = Players.Players_count;
                     var34 = Players.Players_indices;

                     for (var22 = 0; var22 < var30; ++var22) {
                        var32 = Client.players[var34[var22]];
                        if (var32 != null && var32.x == var23.x && var32.y == var23.y) {
                           TotalQuantityComparator.addPlayerToMenu(var32, var34[var22], x, y);
                        }
                     }
                  }

                  Tile.addNpcToMenu(var23.definition, identifier, x, y);
               }

               if (var16 == 0) {
                  Player var33 = Client.players[identifier];
                  if (var33 == null) {
                     break label276;
                  }

                  if ((var33.x & 127) == 64 && (var33.y & 127) == 64) {
                     for (var30 = 0; var30 < Client.npcCount; ++var30) {
                        var31 = Client.npcs[Client.npcIndices[var30]];
                        if (var31 != null && var31.definition.size == 1 && var33.x == var31.x && var33.y == var31.y) {
                           Tile.addNpcToMenu(var31.definition, Client.npcIndices[var30], x, y);
                        }
                     }

                     var30 = Players.Players_count;
                     var34 = Players.Players_indices;

                     for (var22 = 0; var22 < var30; ++var22) {
                        var32 = Client.players[var34[var22]];
                        if (var32 != null && var32 != var33 && var32.x == var33.x && var32.y == var33.y) {
                           TotalQuantityComparator.addPlayerToMenu(var32, var34[var22], x, y);
                        }
                     }
                  }

                  if (identifier != Client.combatTargetPlayerIndex) {
                     TotalQuantityComparator.addPlayerToMenu(var33, identifier, x, y);
                  } else {
                     var4 = tag;
                  }
               }

               if (var16 == 3) {
                  NodeDeque var35 = Client.groundItems[SoundSystem.plane][x][y];
                  if (var35 != null) {
                     for (GroundItem var24 = (GroundItem)var35.first(); var24 != null; var24 = (GroundItem)var35.next()) {
                        ItemDefinition var25 = Skills.getItemDefinition(var24.id);
                        if (Client.isItemSelected == 1) {
                           Tiles.insertMenuItemNoShift("Use", Client.selectedItemName + " -> " + BufferedFile.colorStartTag(16748608) + var25.name, 16, var24.id, x, y);
                        } else if (Client.isSpellSelected) {
                           if ((FloorDecoration.selectedSpellFlags & 1) == 1) {
                              Tiles.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " -> " + BufferedFile.colorStartTag(16748608) + var25.name, 17, var24.id, x, y);
                           }
                        } else {
                           String[] var26 = var25.groundActions;

                           for (int var27 = 4; var27 >= 0; --var27) {
                              if (var26 != null && var26[var27] != null) {
                                 byte var28 = 0;
                                 if (var27 == 0) {
                                    var28 = 18;
                                 }

                                 if (var27 == 1) {
                                    var28 = 19;
                                 }

                                 if (var27 == 2) {
                                    var28 = 20;
                                 }

                                 if (var27 == 3) {
                                    var28 = 21;
                                 }

                                 if (var27 == 4) {
                                    var28 = 22;
                                 }

                                 Tiles.insertMenuItemNoShift(var26[var27], BufferedFile.colorStartTag(16748608) + var25.name, var28, var24.id, x, y);
                              } else if (var27 == 2) {
                                 Tiles.insertMenuItemNoShift("Take", BufferedFile.colorStartTag(16748608) + var25.name, 20, var24.id, x, y);
                              }
                           }

                           Tiles.insertMenuItemNoShift("Examine", BufferedFile.colorStartTag(16748608) + var25.name, 1004, var24.id, x, y);
                        }
                     }
                  }
               }
            }
         }

         ++var8;
      }
   }

   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "43"
   )
   @Export("isShiftPressed")
   static boolean isShiftPressed() {
      return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
   }
}
