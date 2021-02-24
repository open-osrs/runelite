import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
   @ObfuscatedName("n")
   @Export("reversed")
   final boolean reversed;

   public UserComparator5(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lky;Lky;I)I",
      garbageValue = "-159510893"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var1.world != 0) {
         if (var2.world == 0) {
            return this.reversed ? -1 : 1;
         }
      } else if (var2.world != 0) {
         return this.reversed ? 1 : -1;
      }

      return this.compareUser(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IB)Lld;",
      garbageValue = "25"
   )
   public static PrivateChatMode method3604(int var0) {
      PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field3831, PrivateChatMode.field3829, PrivateChatMode.field3830};
      PrivateChatMode[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         PrivateChatMode var4 = var2[var3];
         if (var0 == var4.field3832) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("fy")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-179435824"
   )
   @Export("playPcmPlayers")
   static final void playPcmPlayers() {
      if (WorldMapDecorationType.pcmPlayer1 != null) {
         WorldMapDecorationType.pcmPlayer1.run();
      }

      if (class197.pcmPlayer0 != null) {
         class197.pcmPlayer0.run();
      }

   }

   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      descriptor = "(Lcv;IIIIIB)V",
      garbageValue = "1"
   )
   @Export("drawActor2d")
   static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 != null && var0.isVisible()) {
         if (var0 instanceof NPC) {
            NPCComposition var6 = ((NPC)var0).definition;
            if (var6.transforms != null) {
               var6 = var6.transform();
            }

            if (var6 == null) {
               return;
            }
         }

         int var75 = Players.Players_count;
         int[] var7 = Players.Players_indices;
         byte var8 = 0;
         Player var10;
         if (var1 < var75 && var0.playerCycle == Client.cycle) {
            var10 = (Player)var0;
            boolean var9;
            if (Client.drawPlayerNames == 0) {
               var9 = false;
            } else if (var10 == UserComparator9.localPlayer) {
               var9 = ArchiveDiskAction.method4359();
            } else {
               boolean var11 = GameBuild.method4350();
               boolean var12;
               if (!var11) {
                  var12 = (Client.drawPlayerNames & 1) != 0;
                  var11 = var12 && var10.isFriend();
               }

               var12 = var11;
               if (!var11) {
                  boolean var13 = (Client.drawPlayerNames & 2) != 0;
                  var12 = var13 && var10.isClanMember();
               }

               var9 = var12;
            }

            if (var9) {
               Player var76 = (Player)var0;
               if (var1 < var75) {
                  SoundCache.method2689(var0, var0.defaultHeight + 15);
                  AbstractFont var77 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
                  byte var91 = 9;
                  var77.drawCentered(var76.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var91, 16777215, 0);
                  var8 = 18;
               }
            }
         }

         int var87 = -2;
         int var15;
         int var22;
         int var23;
         if (!var0.healthBars.method5064()) {
            SoundCache.method2689(var0, var0.defaultHeight + 15);

            for(HealthBar var88 = (HealthBar)var0.healthBars.last(); var88 != null; var88 = (HealthBar)var0.healthBars.previous()) {
               HealthBarUpdate var94 = var88.get(Client.cycle);
               if (var94 == null) {
                  if (var88.isEmpty()) {
                     var88.remove();
                  }
               } else {
                  HealthBarDefinition var95 = var88.definition;
                  SpritePixels var79 = var95.getBackSprite();
                  SpritePixels var81 = var95.getFrontSprite();
                  int var82 = 0;
                  if (var79 != null && var81 != null) {
                     if (var95.widthPadding * 2 < var81.subWidth) {
                        var82 = var95.widthPadding;
                     }

                     var15 = var81.subWidth - var82 * 2;
                  } else {
                     var15 = var95.width;
                  }

                  int var17 = 255;
                  boolean var83 = true;
                  int var84 = Client.cycle - var94.cycle;
                  int var85 = var15 * var94.health2 / var95.width;
                  int var86;
                  int var97;
                  if (var94.cycleOffset > var84) {
                     var86 = var95.field3316 == 0 ? 0 : var95.field3316 * (var84 / var95.field3316);
                     var22 = var15 * var94.health / var95.width;
                     var97 = var86 * (var85 - var22) / var94.cycleOffset + var22;
                  } else {
                     var97 = var85;
                     var86 = var95.int5 + var94.cycleOffset - var84;
                     if (var95.int3 >= 0) {
                        var17 = (var86 << 8) / (var95.int5 - var95.int3);
                     }
                  }

                  if (var94.health2 > 0 && var97 < 1) {
                     var97 = 1;
                  }

                  if (var79 != null && var81 != null) {
                     if (var15 == var97) {
                        var97 += var82 * 2;
                     } else {
                        var97 += var82;
                     }

                     var86 = var79.subHeight;
                     var87 += var86;
                     var22 = var2 + Client.viewportTempX - (var15 >> 1);
                     var23 = var3 + Client.viewportTempY - var87;
                     var22 -= var82;
                     if (var17 >= 0 && var17 < 255) {
                        var79.drawTransAt(var22, var23, var17);
                        Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var97 + var22, var86 + var23);
                        var81.drawTransAt(var22, var23, var17);
                     } else {
                        var79.drawTransBgAt(var22, var23);
                        Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var97 + var22, var86 + var23);
                        var81.drawTransBgAt(var22, var23);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
                     var87 += 2;
                  } else {
                     var87 += 5;
                     if (Client.viewportTempX > -1) {
                        var86 = var2 + Client.viewportTempX - (var15 >> 1);
                        var22 = var3 + Client.viewportTempY - var87;
                        Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var97, 5, 65280);
                        Rasterizer2D.Rasterizer2D_fillRectangle(var86 + var97, var22, var15 - var97, 5, 16711680);
                     }

                     var87 += 2;
                  }
               }
            }
         }

         if (var87 == -2) {
            var87 += 7;
         }

         var87 += var8;
         if (var1 < var75) {
            var10 = (Player)var0;
            if (var10.isHidden) {
               return;
            }

            if (var10.headIconPk != -1 || var10.headIconPrayer != -1) {
               SoundCache.method2689(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  if (var10.headIconPk != -1) {
                     var87 += 25;
                     Client.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87);
                  }

                  if (var10.headIconPrayer != -1) {
                     var87 += 25;
                     class169.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87);
                  }
               }
            }

            if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
               SoundCache.method2689(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  var87 += class13.headIconHintSprites[1].subHeight;
                  class13.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87);
               }
            }
         } else {
            NPCComposition var89 = ((NPC)var0).definition;
            if (var89.transforms != null) {
               var89 = var89.transform();
            }

            if (var89.headIconPrayer >= 0 && var89.headIconPrayer < class169.headIconPrayerSprites.length) {
               SoundCache.method2689(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  class169.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30);
               }
            }

            if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
               SoundCache.method2689(var0, var0.defaultHeight + 15);
               if (Client.viewportTempX > -1) {
                  class13.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
               }
            }
         }

         if (var0.overheadText != null && (var1 >= var75 || !var0.field968 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
            SoundCache.method2689(var0, var0.defaultHeight);
            if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
               Client.overheadTextXOffsets[Client.overheadTextCount] = ScriptEvent.fontBold12.stringWidth(var0.overheadText) / 2;
               Client.overheadTextAscents[Client.overheadTextCount] = ScriptEvent.fontBold12.ascent;
               Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
               Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY;
               Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor;
               Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect;
               Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
               Client.overheadText[Client.overheadTextCount] = var0.overheadText;
               ++Client.overheadTextCount;
            }
         }

         for(int var78 = 0; var78 < 4; ++var78) {
            int var90 = var0.hitSplatCycles[var78];
            int var92 = var0.hitSplatTypes[var78];
            HitSplatDefinition var96 = null;
            int var14 = 0;
            if (var92 >= 0) {
               if (var90 <= Client.cycle) {
                  continue;
               }

               var96 = ScriptFrame.method1222(var0.hitSplatTypes[var78]);
               var14 = var96.field3364;
               if (var96 != null && var96.transforms != null) {
                  var96 = var96.transform();
                  if (var96 == null) {
                     var0.hitSplatCycles[var78] = -1;
                     continue;
                  }
               }
            } else if (var90 < 0) {
               continue;
            }

            var15 = var0.hitSplatTypes2[var78];
            HitSplatDefinition var16 = null;
            if (var15 >= 0) {
               var16 = ScriptFrame.method1222(var15);
               if (var16 != null && var16.transforms != null) {
                  var16 = var16.transform();
               }
            }

            if (var90 - var14 <= Client.cycle) {
               if (var96 == null) {
                  var0.hitSplatCycles[var78] = -1;
               } else {
                  SoundCache.method2689(var0, var0.defaultHeight / 2);
                  if (Client.viewportTempX > -1) {
                     if (var78 == 1) {
                        Client.viewportTempY -= 20;
                     }

                     if (var78 == 2) {
                        Client.viewportTempX -= 15;
                        Client.viewportTempY -= 10;
                     }

                     if (var78 == 3) {
                        Client.viewportTempX += 15;
                        Client.viewportTempY -= 10;
                     }

                     SpritePixels var18 = null;
                     SpritePixels var19 = null;
                     SpritePixels var20 = null;
                     SpritePixels var21 = null;
                     var22 = 0;
                     var23 = 0;
                     int var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     SpritePixels var30 = null;
                     SpritePixels var31 = null;
                     SpritePixels var32 = null;
                     SpritePixels var33 = null;
                     int var34 = 0;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     var18 = var96.method4764();
                     int var43;
                     if (var18 != null) {
                        var22 = var18.subWidth;
                        var43 = var18.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var26 = var18.xOffset;
                     }

                     var19 = var96.method4770();
                     if (var19 != null) {
                        var23 = var19.subWidth;
                        var43 = var19.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var27 = var19.xOffset;
                     }

                     var20 = var96.method4769();
                     if (var20 != null) {
                        var24 = var20.subWidth;
                        var43 = var20.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var28 = var20.xOffset;
                     }

                     var21 = var96.method4766();
                     if (var21 != null) {
                        var25 = var21.subWidth;
                        var43 = var21.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var29 = var21.xOffset;
                     }

                     if (var16 != null) {
                        var30 = var16.method4764();
                        if (var30 != null) {
                           var34 = var30.subWidth;
                           var43 = var30.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var38 = var30.xOffset;
                        }

                        var31 = var16.method4770();
                        if (var31 != null) {
                           var35 = var31.subWidth;
                           var43 = var31.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var39 = var31.xOffset;
                        }

                        var32 = var16.method4769();
                        if (var32 != null) {
                           var36 = var32.subWidth;
                           var43 = var32.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var40 = var32.xOffset;
                        }

                        var33 = var16.method4766();
                        if (var33 != null) {
                           var37 = var33.subWidth;
                           var43 = var33.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var41 = var33.xOffset;
                        }
                     }

                     Font var80 = var96.getFont();
                     if (var80 == null) {
                        var80 = SecureRandomCallable.fontPlain11;
                     }

                     Font var44;
                     if (var16 != null) {
                        var44 = var16.getFont();
                        if (var44 == null) {
                           var44 = SecureRandomCallable.fontPlain11;
                        }
                     } else {
                        var44 = SecureRandomCallable.fontPlain11;
                     }

                     String var45 = null;
                     String var46 = null;
                     boolean var47 = false;
                     int var48 = 0;
                     var45 = var96.getString(var0.hitSplatValues[var78]);
                     int var93 = var80.stringWidth(var45);
                     if (var16 != null) {
                        var46 = var16.getString(var0.hitSplatValues2[var78]);
                        var48 = var44.stringWidth(var46);
                     }

                     int var49 = 0;
                     int var50 = 0;
                     if (var23 > 0) {
                        if (var20 == null && var21 == null) {
                           var49 = 1;
                        } else {
                           var49 = var93 / var23 + 1;
                        }
                     }

                     if (var16 != null && var35 > 0) {
                        if (var32 == null && var33 == null) {
                           var50 = 1;
                        } else {
                           var50 = var48 / var35 + 1;
                        }
                     }

                     int var51 = 0;
                     int var52 = var51;
                     if (var22 > 0) {
                        var51 += var22;
                     }

                     var51 += 2;
                     int var53 = var51;
                     if (var24 > 0) {
                        var51 += var24;
                     }

                     int var54 = var51;
                     int var55 = var51;
                     int var56;
                     if (var23 > 0) {
                        var56 = var23 * var49;
                        var51 += var56;
                        var55 += (var56 - var93) / 2;
                     } else {
                        var51 += var93;
                     }

                     var56 = var51;
                     if (var25 > 0) {
                        var51 += var25;
                     }

                     int var57 = 0;
                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62;
                     if (var16 != null) {
                        var51 += 2;
                        var57 = var51;
                        if (var34 > 0) {
                           var51 += var34;
                        }

                        var51 += 2;
                        var58 = var51;
                        if (var36 > 0) {
                           var51 += var36;
                        }

                        var59 = var51;
                        var61 = var51;
                        if (var35 > 0) {
                           var62 = var35 * var50;
                           var51 += var62;
                           var61 += (var62 - var48) / 2;
                        } else {
                           var51 += var48;
                        }

                        var60 = var51;
                        if (var37 > 0) {
                           var51 += var37;
                        }
                     }

                     var62 = var0.hitSplatCycles[var78] - Client.cycle;
                     int var63 = var96.field3378 - var62 * var96.field3378 / var96.field3364;
                     int var64 = var62 * var96.field3370 / var96.field3364 + -var96.field3370;
                     int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
                     int var66 = var64 + (var3 + Client.viewportTempY - 12);
                     int var67 = var66;
                     int var68 = var66 + var42;
                     int var69 = var66 + var96.field3368 + 15;
                     int var70 = var69 - var80.maxAscent;
                     int var71 = var69 + var80.maxDescent;
                     if (var70 < var66) {
                        var67 = var70;
                     }

                     if (var71 > var68) {
                        var68 = var71;
                     }

                     int var72 = 0;
                     int var73;
                     int var74;
                     if (var16 != null) {
                        var72 = var66 + var16.field3368 + 15;
                        var73 = var72 - var44.maxAscent;
                        var74 = var72 + var44.maxDescent;
                        if (var73 < var67) {
                           ;
                        }

                        if (var74 > var68) {
                           ;
                        }
                     }

                     var73 = 255;
                     if (var96.field3371 >= 0) {
                        var73 = (var62 << 8) / (var96.field3364 - var96.field3371);
                     }

                     if (var73 >= 0 && var73 < 255) {
                        if (var18 != null) {
                           var18.drawTransAt(var52 + var65 - var26, var66, var73);
                        }

                        if (var20 != null) {
                           var20.drawTransAt(var53 + var65 - var28, var66, var73);
                        }

                        if (var19 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var19.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73);
                           }
                        }

                        if (var21 != null) {
                           var21.drawTransAt(var65 + var56 - var29, var66, var73);
                        }

                        var80.drawAlpha(var45, var65 + var55, var69, var96.textColor, 0, var73);
                        if (var16 != null) {
                           if (var30 != null) {
                              var30.drawTransAt(var65 + var57 - var38, var66, var73);
                           }

                           if (var32 != null) {
                              var32.drawTransAt(var65 + var58 - var40, var66, var73);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.drawTransAt(var35 * var74 + (var59 + var65 - var39), var66, var73);
                              }
                           }

                           if (var33 != null) {
                              var33.drawTransAt(var60 + var65 - var41, var66, var73);
                           }

                           var44.drawAlpha(var46, var65 + var61, var72, var16.textColor, 0, var73);
                        }
                     } else {
                        if (var18 != null) {
                           var18.drawTransBgAt(var52 + var65 - var26, var66);
                        }

                        if (var20 != null) {
                           var20.drawTransBgAt(var53 + var65 - var28, var66);
                        }

                        if (var19 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66);
                           }
                        }

                        if (var21 != null) {
                           var21.drawTransBgAt(var65 + var56 - var29, var66);
                        }

                        var80.draw(var45, var55 + var65, var69, var96.textColor | -16777216, 0);
                        if (var16 != null) {
                           if (var30 != null) {
                              var30.drawTransBgAt(var57 + var65 - var38, var66);
                           }

                           if (var32 != null) {
                              var32.drawTransBgAt(var58 + var65 - var40, var66);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.drawTransBgAt(var35 * var74 + (var59 + var65 - var39), var66);
                              }
                           }

                           if (var33 != null) {
                              var33.drawTransBgAt(var60 + var65 - var41, var66);
                           }

                           var44.draw(var46, var61 + var65, var72, var16.textColor | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
