import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aj")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("coord2")
   public final Coord coord2;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("coord1")
   public final Coord coord1;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -945361989
   )
   @Export("screenX")
   int screenX;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1326787305
   )
   @Export("screenY")
   int screenY;

   @ObfuscatedSignature(
      descriptor = "(Lhd;Lhd;)V"
   )
   AbstractWorldMapIcon(Coord var1, Coord var2) {
      this.coord1 = var1;
      this.coord2 = var2;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "7"
   )
   @Export("getElement")
   public abstract int getElement();

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(S)Laa;",
      garbageValue = "31041"
   )
   @Export("getLabel")
   abstract WorldMapLabel getLabel();

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-413607837"
   )
   @Export("getSubWidth")
   abstract int getSubWidth();

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1875187157"
   )
   @Export("getSubHeight")
   abstract int getSubHeight();

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "8"
   )
   @Export("fitsScreen")
   boolean fitsScreen(int var1, int var2) {
      if (this.elementFitsScreen(var1, var2)) {
         return true;
      } else {
         return this.labelFitsScreen(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "0"
   )
   @Export("hasValidElement")
   boolean hasValidElement() {
      return this.getElement() >= 0;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "-24"
   )
   @Export("elementFitsScreen")
   boolean elementFitsScreen(int var1, int var2) {
      if (!this.hasValidElement()) {
         return false;
      } else {
         WorldMapElement var3 = InvDefinition.WorldMapElement_get(this.getElement());
         int var4 = this.getSubWidth();
         int var5 = this.getSubHeight();
         switch(var3.horizontalAlignment.value) {
         case 0:
            if (var1 <= this.screenX - var4 || var1 > this.screenX) {
               return false;
            }
            break;
         case 1:
            if (var1 >= this.screenX && var1 < var4 + this.screenX) {
               break;
            }

            return false;
         case 2:
            if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
               return false;
            }
         }

         switch(var3.verticalAlignment.value) {
         case 0:
            if (var2 > this.screenY - var5 && var2 <= this.screenY) {
               break;
            }

            return false;
         case 1:
            if (var2 >= this.screenY && var2 < var5 + this.screenY) {
               break;
            }

            return false;
         case 2:
            if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1453906321"
   )
   @Export("labelFitsScreen")
   boolean labelFitsScreen(int var1, int var2) {
      WorldMapLabel var3 = this.getLabel();
      if (var3 == null) {
         return false;
      } else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
         return var2 >= this.screenY && var2 <= var3.height + this.screenY;
      } else {
         return false;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "2147435814"
   )
   public static int method710(int var0) {
      return class25.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "1537886729"
   )
   static int method713(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class277.field3584 : Interpreter.field1117;
      if (var0 == ScriptOpcodes.CC_GETX) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETY) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETHIDE) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETLAYER) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-83873281"
   )
   static final int method712() {
      if (WorldMapSectionType.clientPreferences.roofsHidden) {
         return class90.Client_plane;
      } else {
         int var0 = 3;
         if (KeyHandler.cameraPitch < 310) {
            label167: {
               int var1;
               int var2;
               if (Client.oculusOrbState == 1) {
                  var1 = HealthBarUpdate.oculusOrbFocalPointX >> 7;
                  var2 = ApproximateRouteStrategy.oculusOrbFocalPointY >> 7;
               } else {
                  var1 = UserComparator9.localPlayer.x >> 7;
                  var2 = UserComparator9.localPlayer.y >> 7;
               }

               int var3 = SecureRandomFuture.cameraX >> 7;
               int var4 = ObjectSound.cameraZ >> 7;
               if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                  if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                     if ((Tiles.Tiles_renderFlags[class90.Client_plane][var3][var4] & 4) != 0) {
                        var0 = class90.Client_plane;
                     }

                     int var5;
                     if (var1 > var3) {
                        var5 = var1 - var3;
                     } else {
                        var5 = var3 - var1;
                     }

                     int var6;
                     if (var2 > var4) {
                        var6 = var2 - var4;
                     } else {
                        var6 = var4 - var2;
                     }

                     int var7;
                     int var8;
                     if (var5 > var6) {
                        var7 = var6 * 65536 / var5;
                        var8 = 32768;

                        while(true) {
                           if (var1 == var3) {
                              break label167;
                           }

                           if (var3 < var1) {
                              ++var3;
                           } else if (var3 > var1) {
                              --var3;
                           }

                           if ((Tiles.Tiles_renderFlags[class90.Client_plane][var3][var4] & 4) != 0) {
                              var0 = class90.Client_plane;
                           }

                           var8 += var7;
                           if (var8 >= 65536) {
                              var8 -= 65536;
                              if (var4 < var2) {
                                 ++var4;
                              } else if (var4 > var2) {
                                 --var4;
                              }

                              if ((Tiles.Tiles_renderFlags[class90.Client_plane][var3][var4] & 4) != 0) {
                                 var0 = class90.Client_plane;
                              }
                           }
                        }
                     } else {
                        if (var6 > 0) {
                           var7 = var5 * 65536 / var6;
                           var8 = 32768;

                           while(var4 != var2) {
                              if (var4 < var2) {
                                 ++var4;
                              } else if (var4 > var2) {
                                 --var4;
                              }

                              if ((Tiles.Tiles_renderFlags[class90.Client_plane][var3][var4] & 4) != 0) {
                                 var0 = class90.Client_plane;
                              }

                              var8 += var7;
                              if (var8 >= 65536) {
                                 var8 -= 65536;
                                 if (var3 < var1) {
                                    ++var3;
                                 } else if (var3 > var1) {
                                    --var3;
                                 }

                                 if ((Tiles.Tiles_renderFlags[class90.Client_plane][var3][var4] & 4) != 0) {
                                    var0 = class90.Client_plane;
                                 }
                              }
                           }
                        }
                        break label167;
                     }
                  }

                  return class90.Client_plane;
               }

               return class90.Client_plane;
            }
         }

         if (UserComparator9.localPlayer.x >= 0 && UserComparator9.localPlayer.y >= 0 && UserComparator9.localPlayer.x < 13312 && UserComparator9.localPlayer.y < 13312) {
            if ((Tiles.Tiles_renderFlags[class90.Client_plane][UserComparator9.localPlayer.x >> 7][UserComparator9.localPlayer.y >> 7] & 4) != 0) {
               var0 = class90.Client_plane;
            }

            return var0;
         } else {
            return class90.Client_plane;
         }
      }
   }

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      descriptor = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
      garbageValue = "58"
   )
   @Export("menuAction")
   static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
      if (var2 >= 2000) {
         var2 -= 2000;
      }

      PacketBufferNode var8;
      if (var2 == 1) {
         Client.mouseCrossX = var6;
         Client.mouseCrossY = var7;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2247, Client.packetWriter.isaacCipher);
         var8.packetBuffer.writeShortLE(KeyHandler.selectedItemId);
         var8.packetBuffer.method5725(var3);
         var8.packetBuffer.method5725(class195.selectedItemSlot);
         var8.packetBuffer.writeShortLE(NetCache.baseY * 64 + var1);
         var8.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
         var8.packetBuffer.writeIntME(GrandExchangeOfferNameComparator.baseX * 64 + var0);
         var8.packetBuffer.method5876(ClientPacket.selectedItemWidget);
         Client.packetWriter.addNode(var8);
      } else if (var2 == 2) {
         Client.mouseCrossX = var6;
         Client.mouseCrossY = var7;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2309, Client.packetWriter.isaacCipher);
         var8.packetBuffer.method5883(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
         var8.packetBuffer.method5781(MidiPcmStream.selectedSpellWidget);
         var8.packetBuffer.writeIntME(var3);
         var8.packetBuffer.writeShort(NetCache.baseY * 64 + var1);
         var8.packetBuffer.writeIntME(Client.selectedSpellChildIndex);
         var8.packetBuffer.writeShortLE(GrandExchangeOfferNameComparator.baseX * 64 + var0);
         Client.packetWriter.addNode(var8);
      } else if (var2 == 3) {
         Client.mouseCrossX = var6;
         Client.mouseCrossY = var7;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2323, Client.packetWriter.isaacCipher);
         var8.packetBuffer.method5725(NetCache.baseY * 64 + var1);
         var8.packetBuffer.method5725(GrandExchangeOfferNameComparator.baseX * 64 + var0);
         var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
         var8.packetBuffer.writeShort(var3);
         Client.packetWriter.addNode(var8);
      } else if (var2 == 4) {
         Client.mouseCrossX = var6;
         Client.mouseCrossY = var7;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2307, Client.packetWriter.isaacCipher);
         var8.packetBuffer.method5725(NetCache.baseY * 64 + var1);
         var8.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
         var8.packetBuffer.writeShortLE(var3);
         var8.packetBuffer.writeShort(GrandExchangeOfferNameComparator.baseX * 64 + var0);
         Client.packetWriter.addNode(var8);
      } else if (var2 == 5) {
         Client.mouseCrossX = var6;
         Client.mouseCrossY = var7;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2324, Client.packetWriter.isaacCipher);
         var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
         var8.packetBuffer.writeShortLE(var3);
         var8.packetBuffer.writeShortLE(GrandExchangeOfferNameComparator.baseX * 64 + var0);
         var8.packetBuffer.writeIntME(NetCache.baseY * 64 + var1);
         Client.packetWriter.addNode(var8);
      } else if (var2 == 6) {
         Client.mouseCrossX = var6;
         Client.mouseCrossY = var7;
         Client.mouseCrossColor = 2;
         Client.mouseCrossState = 0;
         Client.destinationX = var0;
         Client.destinationY = var1;
         var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2246, Client.packetWriter.isaacCipher);
         var8.packetBuffer.writeIntME(NetCache.baseY * 64 + var1);
         var8.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
         var8.packetBuffer.writeIntME(GrandExchangeOfferNameComparator.baseX * 64 + var0);
         var8.packetBuffer.writeIntME(var3);
         Client.packetWriter.addNode(var8);
      } else {
         PacketBufferNode var9;
         NPC var13;
         if (var2 == 7) {
            var13 = Client.npcs[var3];
            if (var13 != null) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2271, Client.packetWriter.isaacCipher);
               var9.packetBuffer.method5781(ClientPacket.selectedItemWidget);
               var9.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var9.packetBuffer.writeShort(KeyHandler.selectedItemId);
               var9.packetBuffer.method5725(var3);
               var9.packetBuffer.writeShort(class195.selectedItemSlot);
               Client.packetWriter.addNode(var9);
            }
         } else if (var2 == 8) {
            var13 = Client.npcs[var3];
            if (var13 != null) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2267, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var9.packetBuffer.writeIntME(var3);
               var9.packetBuffer.writeInt(MidiPcmStream.selectedSpellWidget);
               var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
               Client.packetWriter.addNode(var9);
            }
         } else if (var2 == 9) {
            var13 = Client.npcs[var3];
            if (var13 != null) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2236, Client.packetWriter.isaacCipher);
               var9.packetBuffer.method5883(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var9.packetBuffer.method5725(var3);
               Client.packetWriter.addNode(var9);
            }
         } else if (var2 == 10) {
            var13 = Client.npcs[var3];
            if (var13 != null) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2235, Client.packetWriter.isaacCipher);
               var9.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var9.packetBuffer.writeShort(var3);
               Client.packetWriter.addNode(var9);
            }
         } else if (var2 == 11) {
            var13 = Client.npcs[var3];
            if (var13 != null) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2292, Client.packetWriter.isaacCipher);
               var9.packetBuffer.method5725(var3);
               var9.packetBuffer.method5883(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               Client.packetWriter.addNode(var9);
            }
         } else if (var2 == 12) {
            var13 = Client.npcs[var3];
            if (var13 != null) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2231, Client.packetWriter.isaacCipher);
               var9.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var9.packetBuffer.method5725(var3);
               Client.packetWriter.addNode(var9);
            }
         } else if (var2 == 13) {
            var13 = Client.npcs[var3];
            if (var13 != null) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2312, Client.packetWriter.isaacCipher);
               var9.packetBuffer.writeIntME(var3);
               var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               Client.packetWriter.addNode(var9);
            }
         } else {
            Player var15;
            if (var2 == 14) {
               var15 = Client.players[var3];
               if (var15 != null) {
                  Client.mouseCrossX = var6;
                  Client.mouseCrossY = var7;
                  Client.mouseCrossColor = 2;
                  Client.mouseCrossState = 0;
                  Client.destinationX = var0;
                  Client.destinationY = var1;
                  var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2265, Client.packetWriter.isaacCipher);
                  var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                  var9.packetBuffer.method5876(ClientPacket.selectedItemWidget);
                  var9.packetBuffer.method5725(class195.selectedItemSlot);
                  var9.packetBuffer.writeShortLE(var3);
                  var9.packetBuffer.writeShortLE(KeyHandler.selectedItemId);
                  Client.packetWriter.addNode(var9);
               }
            } else if (var2 == 15) {
               var15 = Client.players[var3];
               if (var15 != null) {
                  Client.mouseCrossX = var6;
                  Client.mouseCrossY = var7;
                  Client.mouseCrossColor = 2;
                  Client.mouseCrossState = 0;
                  Client.destinationX = var0;
                  Client.destinationY = var1;
                  var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2325, Client.packetWriter.isaacCipher);
                  var9.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                  var9.packetBuffer.writeIntME(var3);
                  var9.packetBuffer.writeIntME(Client.selectedSpellChildIndex);
                  var9.packetBuffer.method5876(MidiPcmStream.selectedSpellWidget);
                  Client.packetWriter.addNode(var9);
               }
            } else if (var2 == 16) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2238, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShortLE(var3);
               var8.packetBuffer.writeShort(KeyHandler.selectedItemId);
               var8.packetBuffer.writeShort(NetCache.baseY * 64 + var1);
               var8.packetBuffer.writeIntME(GrandExchangeOfferNameComparator.baseX * 64 + var0);
               var8.packetBuffer.method5883(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var8.packetBuffer.writeShort(class195.selectedItemSlot);
               var8.packetBuffer.method5876(ClientPacket.selectedItemWidget);
               Client.packetWriter.addNode(var8);
            } else if (var2 == 17) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2266, Client.packetWriter.isaacCipher);
               var8.packetBuffer.method5725(Client.selectedSpellChildIndex);
               var8.packetBuffer.method5736(MidiPcmStream.selectedSpellWidget);
               var8.packetBuffer.writeShortLE(var3);
               var8.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var8.packetBuffer.writeShort(NetCache.baseY * 64 + var1);
               var8.packetBuffer.writeShort(GrandExchangeOfferNameComparator.baseX * 64 + var0);
               Client.packetWriter.addNode(var8);
            } else if (var2 == 18) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2282, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeIntME(NetCache.baseY * 64 + var1);
               var8.packetBuffer.method5725(var3);
               var8.packetBuffer.writeShort(GrandExchangeOfferNameComparator.baseX * 64 + var0);
               var8.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               Client.packetWriter.addNode(var8);
            } else if (var2 == 19) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2256, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShortLE(GrandExchangeOfferNameComparator.baseX * 64 + var0);
               var8.packetBuffer.method5725(var3);
               var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var8.packetBuffer.writeShort(NetCache.baseY * 64 + var1);
               Client.packetWriter.addNode(var8);
            } else if (var2 == 20) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShort(var3);
               var8.packetBuffer.writeShortLE(NetCache.baseY * 64 + var1);
               var8.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var8.packetBuffer.writeShortLE(GrandExchangeOfferNameComparator.baseX * 64 + var0);
               Client.packetWriter.addNode(var8);
            } else if (var2 == 21) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2249, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShort(NetCache.baseY * 64 + var1);
               var8.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               var8.packetBuffer.writeIntME(var3);
               var8.packetBuffer.method5725(GrandExchangeOfferNameComparator.baseX * 64 + var0);
               Client.packetWriter.addNode(var8);
            } else if (var2 == 22) {
               Client.mouseCrossX = var6;
               Client.mouseCrossY = var7;
               Client.mouseCrossColor = 2;
               Client.mouseCrossState = 0;
               Client.destinationX = var0;
               Client.destinationY = var1;
               var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShort(NetCache.baseY * 64 + var1);
               var8.packetBuffer.writeIntME(GrandExchangeOfferNameComparator.baseX * 64 + var0);
               var8.packetBuffer.writeShort(var3);
               var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
               Client.packetWriter.addNode(var8);
            } else if (var2 == 23) {
               if (Client.isMenuOpen) {
                  MilliClock.scene.setViewportWalking();
               } else {
                  MilliClock.scene.menuOpen(class90.Client_plane, var0, var1, true);
               }
            } else {
               PacketBufferNode var11;
               Widget var16;
               if (var2 == 24) {
                  var16 = class237.getWidget(var1);
                  boolean var12 = true;
                  if (var16.contentType > 0) {
                     var12 = WorldMapLabelSize.method254(var16);
                  }

                  if (var12) {
                     var11 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher);
                     var11.packetBuffer.writeInt(var1);
                     Client.packetWriter.addNode(var11);
                  }
               } else {
                  if (var2 == 25) {
                     var16 = ArchiveLoader.getWidgetChild(var1, var0);
                     if (var16 != null) {
                        WorldMapSection2.Widget_runOnTargetLeave();
                        ArchiveDisk.selectSpell(var1, var0, MusicPatch.Widget_unpackTargetMask(class60.getWidgetFlags(var16)), var16.itemId);
                        Client.isItemSelected = 0;
                        Client.selectedSpellActionName = Player.Widget_getSpellActionName(var16);
                        if (Client.selectedSpellActionName == null) {
                           Client.selectedSpellActionName = "null";
                        }

                        if (var16.isIf3) {
                           Client.selectedSpellName = var16.dataText + FileSystem.colorStartTag(16777215);
                        } else {
                           Client.selectedSpellName = FileSystem.colorStartTag(65280) + var16.spellName + FileSystem.colorStartTag(16777215);
                        }
                     }

                     return;
                  }

                  if (var2 == 26) {
                     ModeWhere.method3878();
                  } else {
                     int var10;
                     Widget var14;
                     if (var2 == 28) {
                        var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeInt(var1);
                        Client.packetWriter.addNode(var8);
                        var14 = class237.getWidget(var1);
                        if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
                           var10 = var14.cs1Instructions[0][1];
                           Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10];
                           changeGameOptions(var10);
                        }
                     } else if (var2 == 29) {
                        var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeInt(var1);
                        Client.packetWriter.addNode(var8);
                        var14 = class237.getWidget(var1);
                        if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
                           var10 = var14.cs1Instructions[0][1];
                           if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) {
                              Varps.Varps_main[var10] = var14.cs1ComparisonValues[0];
                              changeGameOptions(var10);
                           }
                        }
                     } else if (var2 == 30) {
                        if (Client.meslayerContinueWidget == null) {
                           class25.resumePauseWidget(var1, var0);
                           Client.meslayerContinueWidget = ArchiveLoader.getWidgetChild(var1, var0);
                           IsaacCipher.invalidateWidget(Client.meslayerContinueWidget);
                        }
                     } else if (var2 == 31) {
                        var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2330, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.method5781(ClientPacket.selectedItemWidget);
                        var8.packetBuffer.writeShortLE(var0);
                        var8.packetBuffer.writeShortLE(var3);
                        var8.packetBuffer.writeIntME(KeyHandler.selectedItemId);
                        var8.packetBuffer.writeShort(class195.selectedItemSlot);
                        var8.packetBuffer.method5876(var1);
                        Client.packetWriter.addNode(var8);
                        Client.field770 = 0;
                        WorldMapSprite.field260 = class237.getWidget(var1);
                        Client.field931 = var0;
                     } else if (var2 == 32) {
                        var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2284, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeShortLE(var3);
                        var8.packetBuffer.writeIntME(var0);
                        var8.packetBuffer.method5876(MidiPcmStream.selectedSpellWidget);
                        var8.packetBuffer.method5736(var1);
                        var8.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
                        Client.packetWriter.addNode(var8);
                        Client.field770 = 0;
                        WorldMapSprite.field260 = class237.getWidget(var1);
                        Client.field931 = var0;
                     } else if (var2 == 33) {
                        var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.method5781(var1);
                        var8.packetBuffer.writeShort(var3);
                        var8.packetBuffer.writeShortLE(var0);
                        Client.packetWriter.addNode(var8);
                        Client.field770 = 0;
                        WorldMapSprite.field260 = class237.getWidget(var1);
                        Client.field931 = var0;
                     } else if (var2 == 34) {
                        var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2251, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeIntME(var3);
                        var8.packetBuffer.writeIntME(var0);
                        var8.packetBuffer.method5781(var1);
                        Client.packetWriter.addNode(var8);
                        Client.field770 = 0;
                        WorldMapSprite.field260 = class237.getWidget(var1);
                        Client.field931 = var0;
                     } else if (var2 == 35) {
                        var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2316, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeIntME(var0);
                        var8.packetBuffer.writeInt(var1);
                        var8.packetBuffer.writeShortLE(var3);
                        Client.packetWriter.addNode(var8);
                        Client.field770 = 0;
                        WorldMapSprite.field260 = class237.getWidget(var1);
                        Client.field931 = var0;
                     } else if (var2 == 36) {
                        var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2318, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.writeIntME(var0);
                        var8.packetBuffer.method5725(var3);
                        var8.packetBuffer.method5876(var1);
                        Client.packetWriter.addNode(var8);
                        Client.field770 = 0;
                        WorldMapSprite.field260 = class237.getWidget(var1);
                        Client.field931 = var0;
                     } else if (var2 == 37) {
                        var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2229, Client.packetWriter.isaacCipher);
                        var8.packetBuffer.method5736(var1);
                        var8.packetBuffer.writeShort(var3);
                        var8.packetBuffer.writeIntME(var0);
                        Client.packetWriter.addNode(var8);
                        Client.field770 = 0;
                        WorldMapSprite.field260 = class237.getWidget(var1);
                        Client.field931 = var0;
                     } else {
                        if (var2 == 38) {
                           WorldMapSection2.Widget_runOnTargetLeave();
                           var16 = class237.getWidget(var1);
                           Client.isItemSelected = 1;
                           class195.selectedItemSlot = var0;
                           ClientPacket.selectedItemWidget = var1;
                           KeyHandler.selectedItemId = var3;
                           IsaacCipher.invalidateWidget(var16);
                           Client.selectedItemName = FileSystem.colorStartTag(16748608) + class281.ItemDefinition_get(var3).name + FileSystem.colorStartTag(16777215);
                           if (Client.selectedItemName == null) {
                              Client.selectedItemName = "null";
                           }

                           return;
                        }

                        if (var2 == 39) {
                           var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2255, Client.packetWriter.isaacCipher);
                           var8.packetBuffer.writeShortLE(var3);
                           var8.packetBuffer.writeShortLE(var0);
                           var8.packetBuffer.method5876(var1);
                           Client.packetWriter.addNode(var8);
                           Client.field770 = 0;
                           WorldMapSprite.field260 = class237.getWidget(var1);
                           Client.field931 = var0;
                        } else if (var2 == 40) {
                           var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2294, Client.packetWriter.isaacCipher);
                           var8.packetBuffer.writeInt(var1);
                           var8.packetBuffer.method5725(var3);
                           var8.packetBuffer.method5725(var0);
                           Client.packetWriter.addNode(var8);
                           Client.field770 = 0;
                           WorldMapSprite.field260 = class237.getWidget(var1);
                           Client.field931 = var0;
                        } else if (var2 == 41) {
                           var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2232, Client.packetWriter.isaacCipher);
                           var8.packetBuffer.method5876(var1);
                           var8.packetBuffer.writeIntME(var0);
                           var8.packetBuffer.writeShort(var3);
                           Client.packetWriter.addNode(var8);
                           Client.field770 = 0;
                           WorldMapSprite.field260 = class237.getWidget(var1);
                           Client.field931 = var0;
                        } else if (var2 == 42) {
                           var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher);
                           var8.packetBuffer.method5725(var0);
                           var8.packetBuffer.writeShort(var3);
                           var8.packetBuffer.method5736(var1);
                           Client.packetWriter.addNode(var8);
                           Client.field770 = 0;
                           WorldMapSprite.field260 = class237.getWidget(var1);
                           Client.field931 = var0;
                        } else if (var2 == 43) {
                           var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2297, Client.packetWriter.isaacCipher);
                           var8.packetBuffer.writeShortLE(var0);
                           var8.packetBuffer.method5736(var1);
                           var8.packetBuffer.writeShort(var3);
                           Client.packetWriter.addNode(var8);
                           Client.field770 = 0;
                           WorldMapSprite.field260 = class237.getWidget(var1);
                           Client.field931 = var0;
                        } else if (var2 == 44) {
                           var15 = Client.players[var3];
                           if (var15 != null) {
                              Client.mouseCrossX = var6;
                              Client.mouseCrossY = var7;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.writeShortLE(var3);
                              var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              Client.packetWriter.addNode(var9);
                           }
                        } else if (var2 == 45) {
                           var15 = Client.players[var3];
                           if (var15 != null) {
                              Client.mouseCrossX = var6;
                              Client.mouseCrossY = var7;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2242, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              var9.packetBuffer.writeShortLE(var3);
                              Client.packetWriter.addNode(var9);
                           }
                        } else if (var2 == 46) {
                           var15 = Client.players[var3];
                           if (var15 != null) {
                              Client.mouseCrossX = var6;
                              Client.mouseCrossY = var7;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2278, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              var9.packetBuffer.method5725(var3);
                              Client.packetWriter.addNode(var9);
                           }
                        } else if (var2 == 47) {
                           var15 = Client.players[var3];
                           if (var15 != null) {
                              Client.mouseCrossX = var6;
                              Client.mouseCrossY = var7;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2275, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.writeShortLE(var3);
                              var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              Client.packetWriter.addNode(var9);
                           }
                        } else if (var2 == 48) {
                           var15 = Client.players[var3];
                           if (var15 != null) {
                              Client.mouseCrossX = var6;
                              Client.mouseCrossY = var7;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2233, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.method5725(var3);
                              var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              Client.packetWriter.addNode(var9);
                           }
                        } else if (var2 == 49) {
                           var15 = Client.players[var3];
                           if (var15 != null) {
                              Client.mouseCrossX = var6;
                              Client.mouseCrossY = var7;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2239, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.writeShort(var3);
                              var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              Client.packetWriter.addNode(var9);
                           }
                        } else if (var2 == 50) {
                           var15 = Client.players[var3];
                           if (var15 != null) {
                              Client.mouseCrossX = var6;
                              Client.mouseCrossY = var7;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2308, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.method5883(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              var9.packetBuffer.writeIntME(var3);
                              Client.packetWriter.addNode(var9);
                           }
                        } else if (var2 == 51) {
                           var15 = Client.players[var3];
                           if (var15 != null) {
                              Client.mouseCrossX = var6;
                              Client.mouseCrossY = var7;
                              Client.mouseCrossColor = 2;
                              Client.mouseCrossState = 0;
                              Client.destinationX = var0;
                              Client.destinationY = var1;
                              var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2327, Client.packetWriter.isaacCipher);
                              var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                              var9.packetBuffer.writeShortLE(var3);
                              Client.packetWriter.addNode(var9);
                           }
                        } else {
                           label637: {
                              if (var2 != 57) {
                                 if (var2 == 58) {
                                    var16 = ArchiveLoader.getWidgetChild(var1, var0);
                                    if (var16 != null) {
                                       var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2244, Client.packetWriter.isaacCipher);
                                       var9.packetBuffer.writeInt(MidiPcmStream.selectedSpellWidget);
                                       var9.packetBuffer.writeIntME(var16.itemId);
                                       var9.packetBuffer.method5725(Client.field821);
                                       var9.packetBuffer.writeIntME(var0);
                                       var9.packetBuffer.method5876(var1);
                                       var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
                                       Client.packetWriter.addNode(var9);
                                    }
                                    break label637;
                                 }

                                 if (var2 == 1001) {
                                    Client.mouseCrossX = var6;
                                    Client.mouseCrossY = var7;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    Client.destinationX = var0;
                                    Client.destinationY = var1;
                                    var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2288, Client.packetWriter.isaacCipher);
                                    var8.packetBuffer.writeShortLE(GrandExchangeOfferNameComparator.baseX * 64 + var0);
                                    var8.packetBuffer.writeIntME(var3);
                                    var8.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
                                    var8.packetBuffer.method5725(NetCache.baseY * 64 + var1);
                                    Client.packetWriter.addNode(var8);
                                    break label637;
                                 }

                                 if (var2 == 1002) {
                                    Client.mouseCrossX = var6;
                                    Client.mouseCrossY = var7;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2269, Client.packetWriter.isaacCipher);
                                    var8.packetBuffer.writeIntME(var3);
                                    Client.packetWriter.addNode(var8);
                                    break label637;
                                 }

                                 if (var2 == 1003) {
                                    Client.mouseCrossX = var6;
                                    Client.mouseCrossY = var7;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var13 = Client.npcs[var3];
                                    if (var13 != null) {
                                       NPCDefinition var17 = var13.definition;
                                       if (var17.transforms != null) {
                                          var17 = var17.transform();
                                       }

                                       if (var17 != null) {
                                          var11 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2279, Client.packetWriter.isaacCipher);
                                          var11.packetBuffer.writeShort(var17.id);
                                          Client.packetWriter.addNode(var11);
                                       }
                                    }
                                    break label637;
                                 }

                                 if (var2 == 1004) {
                                    Client.mouseCrossX = var6;
                                    Client.mouseCrossY = var7;
                                    Client.mouseCrossColor = 2;
                                    Client.mouseCrossState = 0;
                                    var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2333, Client.packetWriter.isaacCipher);
                                    var8.packetBuffer.method5725(var3);
                                    Client.packetWriter.addNode(var8);
                                    break label637;
                                 }

                                 if (var2 == 1005) {
                                    var16 = class237.getWidget(var1);
                                    if (var16 != null && var16.itemQuantities[var0] >= 100000) {
                                       AbstractWorldMapData.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class281.ItemDefinition_get(var3).name);
                                    } else {
                                       var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2333, Client.packetWriter.isaacCipher);
                                       var9.packetBuffer.method5725(var3);
                                       Client.packetWriter.addNode(var9);
                                    }

                                    Client.field770 = 0;
                                    WorldMapSprite.field260 = class237.getWidget(var1);
                                    Client.field931 = var0;
                                    break label637;
                                 }

                                 if (var2 != 1007) {
                                    if (var2 == 1010 || var2 == 1011 || var2 == 1009 || var2 == 1012 || var2 == 1008) {
                                       SoundSystem.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
                                    }
                                    break label637;
                                 }
                              }

                              var16 = ArchiveLoader.getWidgetChild(var1, var0);
                              if (var16 != null) {
                                 ApproximateRouteStrategy.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if (Client.isItemSelected != 0) {
         Client.isItemSelected = 0;
         IsaacCipher.invalidateWidget(class237.getWidget(ClientPacket.selectedItemWidget));
      }

      if (Client.isSpellSelected) {
         WorldMapSection2.Widget_runOnTargetLeave();
      }

      if (WorldMapSprite.field260 != null && Client.field770 == 0) {
         IsaacCipher.invalidateWidget(WorldMapSprite.field260);
      }

   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "24"
   )
   static boolean method685(int var0) {
      return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
   }

   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "90"
   )
   @Export("changeGameOptions")
   static final void changeGameOptions(int var0) {
      class219.method4171();

      for(ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var1.obj != null) {
            var1.set();
         }
      }

      int var3 = class204.VarpDefinition_get(var0).type;
      if (var3 != 0) {
         int var2 = Varps.Varps_main[var0];
         if (var3 == 1) {
            if (var2 == 1) {
               Decimator.method2707(0.9D);
            }

            if (var2 == 2) {
               Decimator.method2707(0.8D);
            }

            if (var2 == 3) {
               Decimator.method2707(0.7D);
            }

            if (var2 == 4) {
               Decimator.method2707(0.6D);
            }
         }

         if (var3 == 3) {
            if (var2 == 0) {
               class194.method3820(255);
            }

            if (var2 == 1) {
               class194.method3820(192);
            }

            if (var2 == 2) {
               class194.method3820(128);
            }

            if (var2 == 3) {
               class194.method3820(64);
            }

            if (var2 == 4) {
               class194.method3820(0);
            }
         }

         if (var3 == 4) {
            if (var2 == 0) {
               class171.method3641(127);
            }

            if (var2 == 1) {
               class171.method3641(96);
            }

            if (var2 == 2) {
               class171.method3641(64);
            }

            if (var2 == 3) {
               class171.method3641(32);
            }

            if (var2 == 4) {
               class171.method3641(0);
            }
         }

         if (var3 == 5) {
            Client.leftClickOpensMenu = var2;
         }

         if (var3 == 6) {
            Client.chatEffects = var2;
         }

         if (var3 == 9) {
            Client.field829 = var2;
         }

         if (var3 == 10) {
            if (var2 == 0) {
               WorldMapData_1.method810(127);
            }

            if (var2 == 1) {
               WorldMapData_1.method810(96);
            }

            if (var2 == 2) {
               WorldMapData_1.method810(64);
            }

            if (var2 == 3) {
               WorldMapData_1.method810(32);
            }

            if (var2 == 4) {
               WorldMapData_1.method810(0);
            }
         }

         if (var3 == 17) {
            Client.followerIndex = var2 & '\uffff';
         }

         if (var3 == 18) {
            Client.playerAttackOption = (AttackOption)InterfaceParent.findEnumerated(ApproximateRouteStrategy.method1310(), var2);
            if (Client.playerAttackOption == null) {
               Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

         if (var3 == 19) {
            if (var2 == -1) {
               Client.combatTargetPlayerIndex = -1;
            } else {
               Client.combatTargetPlayerIndex = var2 & 2047;
            }
         }

         if (var3 == 22) {
            Client.npcAttackOption = (AttackOption)InterfaceParent.findEnumerated(ApproximateRouteStrategy.method1310(), var2);
            if (Client.npcAttackOption == null) {
               Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

      }
   }
}
