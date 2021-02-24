import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ba")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
   @ObfuscatedName("iv")
   @ObfuscatedGetter(
      intValue = -1513110219
   )
   @Export("oculusOrbFocalPointY")
   static int oculusOrbFocalPointY;
   @ObfuscatedName("ls")
   @ObfuscatedGetter(
      intValue = 318238525
   )
   @Export("menuX")
   static int menuX;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIILfe;I)Z",
      garbageValue = "1148121553"
   )
   @Export("hasArrived")
   public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
      return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
   }

   @ObfuscatedName("n")
   @Export("sleepExact")
   public static final void sleepExact(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            long var2 = var0 - 1L;

            try {
               Thread.sleep(var2);
            } catch (InterruptedException var8) {
               ;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var7) {
               ;
            }
         } else {
            try {
               Thread.sleep(var0);
            } catch (InterruptedException var6) {
               ;
            }
         }

      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)[Lci;",
      garbageValue = "-915685508"
   )
   static AttackOption[] method1310() {
      return new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_dependsOnCombatLevels};
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)Lly;",
      garbageValue = "-1904582422"
   )
   public static IndexedSprite method1304() {
      IndexedSprite var0 = new IndexedSprite();
      var0.width = class336.SpriteBuffer_spriteWidth;
      var0.height = class336.SpriteBuffer_spriteHeight;
      var0.xOffset = class105.SpriteBuffer_xOffsets[0];
      var0.yOffset = class336.SpriteBuffer_yOffsets[0];
      var0.subWidth = class336.SpriteBuffer_spriteWidths[0];
      var0.subHeight = class225.SpriteBuffer_spriteHeights[0];
      var0.palette = HorizontalAlignment.SpriteBuffer_spritePalette;
      var0.pixels = class2.SpriteBuffer_pixels[0];
      class105.SpriteBuffer_xOffsets = null;
      class336.SpriteBuffer_yOffsets = null;
      class336.SpriteBuffer_spriteWidths = null;
      class225.SpriteBuffer_spriteHeights = null;
      HorizontalAlignment.SpriteBuffer_spritePalette = null;
      class2.SpriteBuffer_pixels = null;
      return var0;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZB)I",
      garbageValue = "-109"
   )
   static int method1313(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.SOUND_SYNTH) {
         Interpreter.Interpreter_intStackSize -= 3;
         class58.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
         return 1;
      } else if (var0 == ScriptOpcodes.SOUND_SONG) {
         AbstractSocket.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         return 1;
      } else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
         Interpreter.Interpreter_intStackSize -= 2;
         NPC.method2180(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         return 1;
      } else {
         int var3;
         if (var0 == 3203) {
            var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize], 0), 100);
            class194.method3820(Math.round(2.55F * (float)var3));
            return 1;
         } else if (var0 == 3204) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.round((float)WorldMapSectionType.clientPreferences.musicVolume / 2.55F);
            return 1;
         } else if (var0 == 3205) {
            var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize], 0), 100);
            class171.method3641(Math.round(1.27F * (float)var3));
            return 1;
         } else if (var0 == 3206) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.round((float)WorldMapSectionType.clientPreferences.soundEffectsVolume / 1.27F);
            return 1;
         } else if (var0 == 3207) {
            var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize], 0), 100);
            WorldMapData_1.method810(Math.round((float)var3 * 1.27F));
            return 1;
         } else if (var0 == 3208) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.round((float)WorldMapSectionType.clientPreferences.areaSoundEffectsVolume / 1.27F);
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZB)I",
      garbageValue = "-107"
   )
   static int method1315(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
         Interpreter.Interpreter_intStackSize -= 2;
         Client.field779 = (short)Canvas.method935(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
         if (Client.field779 <= 0) {
            Client.field779 = 256;
         }

         Client.field913 = (short)Canvas.method935(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         if (Client.field913 <= 0) {
            Client.field913 = 256;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
         Interpreter.Interpreter_intStackSize -= 2;
         Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         if (Client.zoomHeight <= 0) {
            Client.zoomHeight = 256;
         }

         Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (Client.zoomWidth <= 0) {
            Client.zoomWidth = 320;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
         Interpreter.Interpreter_intStackSize -= 4;
         Client.field916 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         if (Client.field916 <= 0) {
            Client.field916 = 1;
         }

         Client.field690 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (Client.field690 <= 0) {
            Client.field690 = 32767;
         } else if (Client.field690 < Client.field916) {
            Client.field690 = Client.field916;
         }

         Client.field918 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         if (Client.field918 <= 0) {
            Client.field918 = 1;
         }

         Client.field846 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         if (Client.field846 <= 0) {
            Client.field846 = 32767;
         } else if (Client.field846 < Client.field918) {
            Client.field846 = Client.field918;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
         if (Client.viewportWidget != null) {
            MenuAction.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth;
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight;
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth;
         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FileSystem.method3709(Client.field779);
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FileSystem.method3709(Client.field913);
         return 1;
      } else if (var0 == 6220) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
         return 1;
      } else if (var0 == 6223) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class25.canvasHeight;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "1969316699"
   )
   public static int method1314(String var0) {
      return var0.length() + 2;
   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      descriptor = "(IIIILjava/lang/String;B)V",
      garbageValue = "45"
   )
   @Export("widgetDefaultMenuAction")
   static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
      Widget var5 = ArchiveLoader.getWidgetChild(var1, var2);
      if (var5 != null) {
         if (var5.onOp != null) {
            ScriptEvent var6 = new ScriptEvent();
            var6.widget = var5;
            var6.opIndex = var0;
            var6.targetName = var4;
            var6.args = var5.onOp;
            PacketWriter.runScriptEvent(var6);
         }

         boolean var8 = true;
         if (var5.contentType > 0) {
            var8 = WorldMapLabelSize.method254(var5);
         }

         if (var8) {
            if (MidiPcmStream.method3972(class60.getWidgetFlags(var5), var0 - 1)) {
               PacketBufferNode var7;
               if (var0 == 1) {
                  var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2320, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 2) {
                  var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2291, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 3) {
                  var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2326, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 4) {
                  var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2248, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 5) {
                  var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2254, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 6) {
                  var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2280, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 7) {
                  var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2258, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 8) {
                  var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2328, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 9) {
                  var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2253, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 10) {
                  var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2300, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

            }
         }
      }
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      descriptor = "([Lhz;II)V",
      garbageValue = "-1753877400"
   )
   @Export("drawModelComponents")
   static final void drawModelComponents(Widget[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Widget var3 = var0[var2];
         if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !DevicePcmPlayerProvider.isComponentHidden(var3))) {
            int var5;
            if (var3.type == 0) {
               if (!var3.isIf3 && DevicePcmPlayerProvider.isComponentHidden(var3) && var3 != Canvas.mousedOverWidgetIf1) {
                  continue;
               }

               drawModelComponents(var0, var3.id);
               if (var3.children != null) {
                  drawModelComponents(var3.children, var3.id);
               }

               InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
               if (var4 != null) {
                  var5 = var4.group;
                  if (WorldMapCacheName.loadInterface(var5)) {
                     drawModelComponents(DefaultsGroup.Widget_interfaceComponents[var5], -1);
                  }
               }
            }

            if (var3.type == 6) {
               if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
                  boolean var7 = GrandExchangeOfferWorldComparator.runCs1(var3);
                  if (var7) {
                     var5 = var3.sequenceId2;
                  } else {
                     var5 = var3.sequenceId;
                  }

                  if (var5 != -1) {
                     SequenceDefinition var6 = InterfaceParent.SequenceDefinition_get(var5);

                     for(var3.modelFrameCycle += Client.field808; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; IsaacCipher.invalidateWidget(var3)) {
                        var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
                        ++var3.modelFrame;
                        if (var3.modelFrame >= var6.frameIds.length) {
                           var3.modelFrame -= var6.frameCount;
                           if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
                              var3.modelFrame = 0;
                           }
                        }
                     }
                  }
               }

               if (var3.field2649 != 0 && !var3.isIf3) {
                  int var8 = var3.field2649 >> 16;
                  var5 = var3.field2649 << 16 >> 16;
                  var8 *= Client.field808;
                  var5 *= Client.field808;
                  var3.modelAngleX = var8 + var3.modelAngleX & 2047;
                  var3.modelAngleY = var5 + var3.modelAngleY & 2047;
                  IsaacCipher.invalidateWidget(var3);
               }
            }
         }
      }

   }
}
