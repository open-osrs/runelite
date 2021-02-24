import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public enum class169 implements Enumerated {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lfw;"
   )
   field2013(3, 0),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lfw;"
   )
   field2011(2, 1),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lfw;"
   )
   field2012(1, 2),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lfw;"
   )
   field2018(0, 3);

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      descriptor = "[Llm;"
   )
   @Export("headIconPrayerSprites")
   static SpritePixels[] headIconPrayerSprites;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -786899821
   )
   public final int field2014;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1802409949
   )
   @Export("id")
   final int id;

   class169(int var3, int var4) {
      this.field2014 = var3;
      this.id = var4;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "63"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)[Lie;",
      garbageValue = "-825659067"
   )
   static VerticalAlignment[] method3631() {
      return new VerticalAlignment[]{VerticalAlignment.field3236, VerticalAlignment.field3234, VerticalAlignment.VerticalAlignment_centered};
   }

   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      descriptor = "(Ljs;IIII)V",
      garbageValue = "1515768650"
   )
   static void method3637(SequenceDefinition var0, int var1, int var2, int var3) {
      if (Client.soundEffectCount < 50 && WorldMapSectionType.clientPreferences.areaSoundEffectsVolume != 0) {
         if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
            int var4 = var0.soundEffects[var1];
            if (var4 != 0) {
               int var5 = var4 >> 8;
               int var6 = var4 >> 4 & 7;
               int var7 = var4 & 15;
               Client.soundEffectIds[Client.soundEffectCount] = var5;
               Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6;
               Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
               Client.soundEffects[Client.soundEffectCount] = null;
               int var8 = (var2 - 64) / 128;
               int var9 = (var3 - 64) / 128;
               Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16);
               ++Client.soundEffectCount;
            }
         }
      }
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      descriptor = "([Lhz;IIIIIIII)V",
      garbageValue = "-1265489045"
   )
   @Export("updateInterface")
   static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         Widget var9 = var0[var8];
         if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || class60.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
            if (var9.isIf3) {
               if (DevicePcmPlayerProvider.isComponentHidden(var9)) {
                  continue;
               }
            } else if (var9.type == 0 && var9 != Canvas.mousedOverWidgetIf1 && DevicePcmPlayerProvider.isComponentHidden(var9)) {
               continue;
            }

            int var10 = var9.x + var6;
            int var11 = var7 + var9.y;
            int var12;
            int var13;
            int var14;
            int var15;
            int var17;
            int var18;
            if (var9.type == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else {
               int var16;
               if (var9.type == 9) {
                  var16 = var10;
                  var17 = var11;
                  var18 = var10 + var9.width;
                  int var19 = var11 + var9.height;
                  if (var18 < var10) {
                     var16 = var18;
                     var18 = var10;
                  }

                  if (var19 < var11) {
                     var17 = var19;
                     var19 = var11;
                  }

                  ++var18;
                  ++var19;
                  var12 = var16 > var2 ? var16 : var2;
                  var13 = var17 > var3 ? var17 : var3;
                  var14 = var18 < var4 ? var18 : var4;
                  var15 = var19 < var5 ? var19 : var5;
               } else {
                  var16 = var10 + var9.width;
                  var17 = var11 + var9.height;
                  var12 = var10 > var2 ? var10 : var2;
                  var13 = var11 > var3 ? var11 : var3;
                  var14 = var16 < var4 ? var16 : var4;
                  var15 = var17 < var5 ? var17 : var5;
               }
            }

            if (var9 == Client.clickedWidget) {
               Client.field754 = true;
               Client.field784 = var10;
               Client.field847 = var11;
            }

            boolean var32 = false;
            if (var9.field2667) {
               switch(Client.field705) {
               case 0:
                  var32 = true;
               case 1:
               default:
                  break;
               case 2:
                  if (Client.field699 == var9.id >>> 16) {
                     var32 = true;
                  }
                  break;
               case 3:
                  if (var9.id == Client.field699) {
                     var32 = true;
                  }
               }
            }

            if (var32 || !var9.isIf3 || var12 < var14 && var13 < var15) {
               if (var9.isIf3) {
                  ScriptEvent var26;
                  if (var9.noClickThrough) {
                     if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        for(var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) {
                           if (var26.isMouseInputEvent) {
                              var26.remove();
                              var26.widget.containsMouse = false;
                           }
                        }

                        if (PlayerComposition.widgetDragDuration == 0) {
                           Client.clickedWidget = null;
                           Client.clickedWidgetParent = null;
                        }

                        if (!Client.isMenuOpen) {
                           Player.addCancelMenuEntry();
                        }
                     }
                  } else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                     for(var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) {
                        if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) {
                           var26.remove();
                        }
                     }
                  }
               }

               var17 = MouseHandler.MouseHandler_x;
               var18 = MouseHandler.MouseHandler_y;
               if (MouseHandler.MouseHandler_lastButton != 0) {
                  var17 = MouseHandler.MouseHandler_lastPressedX;
                  var18 = MouseHandler.MouseHandler_lastPressedY;
               }

               boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
               if (var9.contentType == 1337) {
                  if (!Client.isLoading && !Client.isMenuOpen && var33) {
                     Projectile.addSceneMenuOptions(var17, var18, var12, var13);
                  }
               } else if (var9.contentType == 1338) {
                  SecureRandomCallable.checkIfMinimapClicked(var9, var10, var11);
               } else {
                  if (var9.contentType == 1400) {
                     SoundSystem.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height);
                  }

                  if (!Client.isMenuOpen && var33) {
                     if (var9.contentType == 1400) {
                        SoundSystem.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
                     } else {
                        class58.Widget_addToMenu(var9, var17 - var10, var18 - var11);
                     }
                  }

                  boolean var21;
                  int var23;
                  if (var32) {
                     for(int var20 = 0; var20 < var9.field2668.length; ++var20) {
                        var21 = false;
                        boolean var27 = false;
                        if (!var21 && var9.field2668[var20] != null) {
                           for(var23 = 0; var23 < var9.field2668[var20].length; ++var23) {
                              boolean var24 = false;
                              if (var9.field2660 != null) {
                                 var24 = KeyHandler.KeyHandler_pressedKeys[var9.field2668[var20][var23]];
                              }

                              if (WorldMapLabel.method503(var9.field2668[var20][var23]) || var24) {
                                 var21 = true;
                                 if (var9.field2660 != null && var9.field2660[var20] > Client.cycle) {
                                    break;
                                 }

                                 byte var31 = var9.field2669[var20][var23];
                                 if (var31 == 0 || ((var31 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var31 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var31 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var31 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
                                    var27 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var27) {
                           if (var20 < 10) {
                              ApproximateRouteStrategy.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
                           } else if (var20 == 10) {
                              WorldMapSection2.Widget_runOnTargetLeave();
                              ArchiveDisk.selectSpell(var9.id, var9.childIndex, MusicPatch.Widget_unpackTargetMask(class60.getWidgetFlags(var9)), var9.itemId);
                              Client.selectedSpellActionName = Player.Widget_getSpellActionName(var9);
                              if (Client.selectedSpellActionName == null) {
                                 Client.selectedSpellActionName = "null";
                              }

                              Client.selectedSpellName = var9.dataText + FileSystem.colorStartTag(16777215);
                           }

                           var23 = var9.field2686[var20];
                           if (var9.field2660 == null) {
                              var9.field2660 = new int[var9.field2668.length];
                           }

                           if (var9.field2599 == null) {
                              var9.field2599 = new int[var9.field2668.length];
                           }

                           if (var23 != 0) {
                              if (var9.field2660[var20] == 0) {
                                 var9.field2660[var20] = var23 + Client.cycle + var9.field2599[var20];
                              } else {
                                 var9.field2660[var20] = var23 + Client.cycle;
                              }
                           } else {
                              var9.field2660[var20] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var21 && var9.field2660 != null) {
                           var9.field2660[var20] = 0;
                        }
                     }
                  }

                  if (var9.isIf3) {
                     if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        var33 = true;
                     } else {
                        var33 = false;
                     }

                     boolean var34 = false;
                     if ((MouseHandler.MouseHandler_currentButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) {
                        var34 = true;
                     }

                     var21 = false;
                     if ((MouseHandler.MouseHandler_lastButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
                        var21 = true;
                     }

                     if (var21) {
                        FriendSystem.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
                     }

                     if (var9.contentType == 1400) {
                        SoundSystem.worldMap.method6525(var17, var18, var33 & var34, var33 & var21);
                     }

                     if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && CollisionMap.method3781(class60.getWidgetFlags(var9))) {
                        Client.draggedOnWidget = var9;
                     }

                     if (var9 == Client.clickedWidgetParent) {
                        Client.field912 = true;
                        Client.field714 = var10;
                        Client.field844 = var11;
                     }

                     if (var9.hasListener) {
                        ScriptEvent var22;
                        if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
                           var22 = new ScriptEvent();
                           var22.isMouseInputEvent = true;
                           var22.widget = var9;
                           var22.mouseY = Client.mouseWheelRotation;
                           var22.args = var9.onScroll;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.clickedWidget != null || JagexCache.dragInventoryWidget != null || Client.isMenuOpen) {
                           var21 = false;
                           var34 = false;
                           var33 = false;
                        }

                        if (!var9.isClicked && var21) {
                           var9.isClicked = true;
                           if (var9.onClick != null) {
                              var22 = new ScriptEvent();
                              var22.isMouseInputEvent = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10;
                              var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
                              var22.args = var9.onClick;
                              Client.scriptEvents.addFirst(var22);
                           }
                        }

                        if (var9.isClicked && var34 && var9.onClickRepeat != null) {
                           var22 = new ScriptEvent();
                           var22.isMouseInputEvent = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var10;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onClickRepeat;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (var9.isClicked && !var34) {
                           var9.isClicked = false;
                           if (var9.onRelease != null) {
                              var22 = new ScriptEvent();
                              var22.isMouseInputEvent = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var10;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onRelease;
                              Client.field865.addFirst(var22);
                           }
                        }

                        if (var34 && var9.onHold != null) {
                           var22 = new ScriptEvent();
                           var22.isMouseInputEvent = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var10;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onHold;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (!var9.containsMouse && var33) {
                           var9.containsMouse = true;
                           if (var9.onMouseOver != null) {
                              var22 = new ScriptEvent();
                              var22.isMouseInputEvent = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var10;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onMouseOver;
                              Client.scriptEvents.addFirst(var22);
                           }
                        }

                        if (var9.containsMouse && var33 && var9.onMouseRepeat != null) {
                           var22 = new ScriptEvent();
                           var22.isMouseInputEvent = true;
                           var22.widget = var9;
                           var22.mouseX = MouseHandler.MouseHandler_x - var10;
                           var22.mouseY = MouseHandler.MouseHandler_y - var11;
                           var22.args = var9.onMouseRepeat;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (var9.containsMouse && !var33) {
                           var9.containsMouse = false;
                           if (var9.onMouseLeave != null) {
                              var22 = new ScriptEvent();
                              var22.isMouseInputEvent = true;
                              var22.widget = var9;
                              var22.mouseX = MouseHandler.MouseHandler_x - var10;
                              var22.mouseY = MouseHandler.MouseHandler_y - var11;
                              var22.args = var9.onMouseLeave;
                              Client.field865.addFirst(var22);
                           }
                        }

                        if (var9.onTimer != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onTimer;
                           Client.field660.addFirst(var22);
                        }

                        ScriptEvent var25;
                        int var35;
                        int var36;
                        if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field2727) {
                           if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field2727 <= 32) {
                              label763:
                              for(var36 = var9.field2727; var36 < Client.changedVarpCount; ++var36) {
                                 var23 = Client.changedVarps[var36 & 31];

                                 for(var35 = 0; var35 < var9.varTransmitTriggers.length; ++var35) {
                                    if (var23 == var9.varTransmitTriggers[var35]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onVarTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label763;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onVarTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field2727 = Client.changedVarpCount;
                        }

                        if (var9.onInvTransmit != null && Client.field870 > var9.field2728) {
                           if (var9.invTransmitTriggers != null && Client.field870 - var9.field2728 <= 32) {
                              label739:
                              for(var36 = var9.field2728; var36 < Client.field870; ++var36) {
                                 var23 = Client.changedItemContainers[var36 & 31];

                                 for(var35 = 0; var35 < var9.invTransmitTriggers.length; ++var35) {
                                    if (var23 == var9.invTransmitTriggers[var35]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onInvTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label739;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onInvTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field2728 = Client.field870;
                        }

                        if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2729) {
                           if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2729 <= 32) {
                              label715:
                              for(var36 = var9.field2729; var36 < Client.changedSkillsCount; ++var36) {
                                 var23 = Client.changedSkills[var36 & 31];

                                 for(var35 = 0; var35 < var9.statTransmitTriggers.length; ++var35) {
                                    if (var23 == var9.statTransmitTriggers[var35]) {
                                       var25 = new ScriptEvent();
                                       var25.widget = var9;
                                       var25.args = var9.onStatTransmit;
                                       Client.scriptEvents.addFirst(var25);
                                       break label715;
                                    }
                                 }
                              }
                           } else {
                              var22 = new ScriptEvent();
                              var22.widget = var9;
                              var22.args = var9.onStatTransmit;
                              Client.scriptEvents.addFirst(var22);
                           }

                           var9.field2729 = Client.changedSkillsCount;
                        }

                        if (Client.chatCycle > var9.field2719 && var9.onChatTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onChatTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field857 > var9.field2719 && var9.onFriendTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onFriendTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field858 > var9.field2719 && var9.onClanTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onClanTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field710 > var9.field2719 && var9.onStockTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onStockTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field860 > var9.field2719 && var9.field2678 != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.field2678;
                           Client.scriptEvents.addFirst(var22);
                        }

                        if (Client.field861 > var9.field2719 && var9.onMiscTransmit != null) {
                           var22 = new ScriptEvent();
                           var22.widget = var9;
                           var22.args = var9.onMiscTransmit;
                           Client.scriptEvents.addFirst(var22);
                        }

                        var9.field2719 = Client.cycleCntr;
                        if (var9.onKey != null) {
                           for(var36 = 0; var36 < Client.field885; ++var36) {
                              ScriptEvent var30 = new ScriptEvent();
                              var30.widget = var9;
                              var30.keyTyped = Client.field738[var36];
                              var30.keyPressed = Client.field886[var36];
                              var30.args = var9.onKey;
                              Client.scriptEvents.addFirst(var30);
                           }
                        }
                     }
                  }

                  if (!var9.isIf3) {
                     if (Client.clickedWidget != null || JagexCache.dragInventoryWidget != null || Client.isMenuOpen) {
                        continue;
                     }

                     if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        if (var9.mouseOverRedirect >= 0) {
                           Canvas.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
                        } else {
                           Canvas.mousedOverWidgetIf1 = var9;
                        }
                     }

                     if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
                        GrandExchangeOffer.field100 = var9;
                     }

                     if (var9.scrollHeight > var9.height) {
                        PrivateChatMode.method6107(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
                     }
                  }

                  if (var9.type == 0) {
                     updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
                     if (var9.children != null) {
                        updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
                     }

                     InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
                     if (var28 != null) {
                        if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
                           for(ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) {
                              if (var29.isMouseInputEvent) {
                                 var29.remove();
                                 var29.widget.containsMouse = false;
                              }
                           }

                           if (PlayerComposition.widgetDragDuration == 0) {
                              Client.clickedWidget = null;
                              Client.clickedWidgetParent = null;
                           }

                           if (!Client.isMenuOpen) {
                              Player.addCancelMenuEntry();
                           }
                        }

                        class22.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11);
                     }
                  }
               }
            }
         }
      }

   }
}
