import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("Tile")
public final class Tile extends Node {
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1065165981
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 103024387
   )
   @Export("x")
   int x;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -561562755
   )
   @Export("y")
   int y;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1476296141
   )
   @Export("originalPlane")
   int originalPlane;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Leb;"
   )
   @Export("paint")
   TilePaint paint;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Ldv;"
   )
   @Export("model")
   TileModel model;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lej;"
   )
   @Export("boundaryObject")
   BoundaryObject boundaryObject;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Leq;"
   )
   @Export("wallDecoration")
   WallDecoration wallDecoration;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   @Export("floorDecoration")
   FloorDecoration floorDecoration;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Ldr;"
   )
   @Export("groundItemPile")
   GroundItemPile groundItemPile;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -792635627
   )
   @Export("gameObjectsCount")
   int gameObjectsCount;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "[Leh;"
   )
   @Export("gameObjects")
   GameObject[] gameObjects;
   @ObfuscatedName("n")
   @Export("gameObjectEdgeMasks")
   int[] gameObjectEdgeMasks;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1192947815
   )
   @Export("gameObjectsEdgeMask")
   int gameObjectsEdgeMask;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1078135311
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("z")
   @Export("drawPrimary")
   boolean drawPrimary;
   @ObfuscatedName("j")
   @Export("drawSecondary")
   boolean drawSecondary;
   @ObfuscatedName("s")
   @Export("drawGameObjects")
   boolean drawGameObjects;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 769252193
   )
   @Export("drawGameObjectEdges")
   int drawGameObjectEdges;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1724493981
   )
   @Export("__y")
   int __y;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -172066661
   )
   @Export("__h")
   int __h;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 2030010491
   )
   @Export("__b")
   int __b;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   @Export("linkedBelowTile")
   Tile linkedBelowTile;

   Tile(int var1, int var2, int var3) {
      this.gameObjects = new GameObject[5];
      this.gameObjectEdgeMasks = new int[5];
      this.gameObjectsEdgeMask = 0;
      this.originalPlane = this.plane = var1;
      this.x = var2;
      this.y = var3;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1899580455"
   )
   public static void method2867() {
      UnderlayDefinition.UnderlayDefinition_cached.clear();
   }

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "(Ljz;IIIB)V",
      garbageValue = "117"
   )
   @Export("addNpcToMenu")
   static final void addNpcToMenu(NpcDefinition var0, int var1, int var2, int var3) {
      if(Client.menuOptionsCount < 400) {
         if(var0.transforms != null) {
            var0 = var0.transform();
         }

         if(var0 != null) {
            if(var0.isInteractable) {
               if(!var0.isFollower || Client.followerIndex == var1) {
                  String var4 = var0.name;
                  int var7;
                  int var8;
                  if(var0.combatLevel != 0) {
                     var7 = var0.combatLevel;
                     var8 = Canvas.localPlayer.combatLevel;
                     int var9 = var8 - var7;
                     String var6;
                     if(var9 < -9) {
                        var6 = BufferedFile.colorStartTag(16711680);
                     } else if(var9 < -6) {
                        var6 = BufferedFile.colorStartTag(16723968);
                     } else if(var9 < -3) {
                        var6 = BufferedFile.colorStartTag(16740352);
                     } else if(var9 < 0) {
                        var6 = BufferedFile.colorStartTag(16756736);
                     } else if(var9 > 9) {
                        var6 = BufferedFile.colorStartTag(65280);
                     } else if(var9 > 6) {
                        var6 = BufferedFile.colorStartTag(4259584);
                     } else if(var9 > 3) {
                        var6 = BufferedFile.colorStartTag(8453888);
                     } else if(var9 > 0) {
                        var6 = BufferedFile.colorStartTag(12648192);
                     } else {
                        var6 = BufferedFile.colorStartTag(16776960);
                     }

                     var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")";
                  }

                  if(var0.isFollower && Client.followerOpsLowPriority) {
                     Tiles.insertMenuItemNoShift("Examine", BufferedFile.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
                  }

                  if(Client.isItemSelected == 1) {
                     Tiles.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + BufferedFile.colorStartTag(16776960) + var4, 7, var1, var2, var3);
                  } else if(Client.isSpellSelected) {
                     if((FloorDecoration.selectedSpellFlags & 2) == 2) {
                        Tiles.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + BufferedFile.colorStartTag(16776960) + var4, 8, var1, var2, var3);
                     }
                  } else {
                     int var10 = var0.isFollower && Client.followerOpsLowPriority?2000:0;
                     String[] var11 = var0.actions;
                     if(var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if(var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) {
                              var8 = 0;
                              if(var7 == 0) {
                                 var8 = var10 + 9;
                              }

                              if(var7 == 1) {
                                 var8 = var10 + 10;
                              }

                              if(var7 == 2) {
                                 var8 = var10 + 11;
                              }

                              if(var7 == 3) {
                                 var8 = var10 + 12;
                              }

                              if(var7 == 4) {
                                 var8 = var10 + 13;
                              }

                              Tiles.insertMenuItemNoShift(var11[var7], BufferedFile.colorStartTag(16776960) + var4, var8, var1, var2, var3);
                           }
                        }
                     }

                     if(var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if(var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) {
                              short var12 = 0;
                              if(AttackOption.AttackOption_hidden != Client.npcAttackOption) {
                                 if(AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > Canvas.localPlayer.combatLevel) {
                                    var12 = 2000;
                                 }

                                 var8 = 0;
                                 if(var7 == 0) {
                                    var8 = var12 + 9;
                                 }

                                 if(var7 == 1) {
                                    var8 = var12 + 10;
                                 }

                                 if(var7 == 2) {
                                    var8 = var12 + 11;
                                 }

                                 if(var7 == 3) {
                                    var8 = var12 + 12;
                                 }

                                 if(var7 == 4) {
                                    var8 = var12 + 13;
                                 }

                                 Tiles.insertMenuItemNoShift(var11[var7], BufferedFile.colorStartTag(16776960) + var4, var8, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if(!var0.isFollower || !Client.followerOpsLowPriority) {
                        Tiles.insertMenuItemNoShift("Examine", BufferedFile.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }
}
