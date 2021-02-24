import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bo")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -67559491
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1512914817
   )
   @Export("type")
   int type;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -333030369
   )
   @Export("x")
   int x;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1122963499
   )
   @Export("y")
   int y;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1919980867
   )
   @Export("objectId")
   int objectId;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1123556215
   )
   int field944;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1772002075
   )
   int field945;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2057325195
   )
   @Export("id")
   int id;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1376003913
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -251784439
   )
   int field948;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 6874789
   )
   @Export("delay")
   int delay = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 738564505
   )
   @Export("hitpoints")
   int hitpoints = -1;

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lkd;IB)V",
      garbageValue = "-61"
   )
   @Export("readPlayerUpdate")
   static void readPlayerUpdate(PacketBuffer var0, int var1) {
      boolean var2 = var0.readBits(1) == 1;
      if (var2) {
         Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
      }

      int var3 = var0.readBits(2);
      Player var4 = Client.players[var1];
      if (var3 == 0) {
         if (var2) {
            var4.field652 = false;
         } else if (Client.localPlayerIndex == var1) {
            throw new RuntimeException();
         } else {
            Players.Players_regions[var1] = (var4.plane << 28) + (GrandExchangeOfferNameComparator.baseX * 64 + var4.pathX[0] >> 13 << 14) + (NetCache.baseY * 64 + var4.pathY[0] >> 13);
            if (var4.field981 != -1) {
               Players.Players_orientations[var1] = var4.field981;
            } else {
               Players.Players_orientations[var1] = var4.orientation;
            }

            Players.Players_targetIndices[var1] = var4.targetIndex;
            Client.players[var1] = null;
            if (var0.readBits(1) != 0) {
               World.updateExternalPlayer(var0, var1);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if (var3 == 1) {
            var5 = var0.readBits(3);
            var6 = var4.pathX[0];
            var7 = var4.pathY[0];
            if (var5 == 0) {
               --var6;
               --var7;
            } else if (var5 == 1) {
               --var7;
            } else if (var5 == 2) {
               ++var6;
               --var7;
            } else if (var5 == 3) {
               --var6;
            } else if (var5 == 4) {
               ++var6;
            } else if (var5 == 5) {
               --var6;
               ++var7;
            } else if (var5 == 6) {
               ++var7;
            } else if (var5 == 7) {
               ++var6;
               ++var7;
            }

            if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
               var4.resetPath(var6, var7);
               var4.field652 = false;
            } else if (var2) {
               var4.field652 = true;
               var4.tileX = var6;
               var4.tileY = var7;
            } else {
               var4.field652 = false;
               var4.method1327(var6, var7, Players.field1274[var1]);
            }

         } else if (var3 == 2) {
            var5 = var0.readBits(4);
            var6 = var4.pathX[0];
            var7 = var4.pathY[0];
            if (var5 == 0) {
               var6 -= 2;
               var7 -= 2;
            } else if (var5 == 1) {
               --var6;
               var7 -= 2;
            } else if (var5 == 2) {
               var7 -= 2;
            } else if (var5 == 3) {
               ++var6;
               var7 -= 2;
            } else if (var5 == 4) {
               var6 += 2;
               var7 -= 2;
            } else if (var5 == 5) {
               var6 -= 2;
               --var7;
            } else if (var5 == 6) {
               var6 += 2;
               --var7;
            } else if (var5 == 7) {
               var6 -= 2;
            } else if (var5 == 8) {
               var6 += 2;
            } else if (var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if (var5 == 10) {
               var6 += 2;
               ++var7;
            } else if (var5 == 11) {
               var6 -= 2;
               var7 += 2;
            } else if (var5 == 12) {
               --var6;
               var7 += 2;
            } else if (var5 == 13) {
               var7 += 2;
            } else if (var5 == 14) {
               ++var6;
               var7 += 2;
            } else if (var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
               if (var2) {
                  var4.field652 = true;
                  var4.tileX = var6;
                  var4.tileY = var7;
               } else {
                  var4.field652 = false;
                  var4.method1327(var6, var7, Players.field1274[var1]);
               }
            } else {
               var4.resetPath(var6, var7);
               var4.field652 = false;
            }

         } else {
            var5 = var0.readBits(1);
            int var8;
            int var9;
            int var10;
            int var11;
            if (var5 == 0) {
               var6 = var0.readBits(12);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if (var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var8 + var4.pathX[0];
               var11 = var9 + var4.pathY[0];
               if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
                  if (var2) {
                     var4.field652 = true;
                     var4.tileX = var10;
                     var4.tileY = var11;
                  } else {
                     var4.field652 = false;
                     var4.method1327(var10, var11, Players.field1274[var1]);
                  }
               } else {
                  var4.resetPath(var10, var11);
                  var4.field652 = false;
               }

               var4.plane = (byte)(var7 + var4.plane & 3);
               if (Client.localPlayerIndex == var1) {
                  class90.Client_plane = var4.plane;
               }

            } else {
               var6 = var0.readBits(30);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 16383;
               var10 = (GrandExchangeOfferNameComparator.baseX * 64 + var8 + var4.pathX[0] & 16383) - GrandExchangeOfferNameComparator.baseX * 64;
               var11 = (NetCache.baseY * 64 + var9 + var4.pathY[0] & 16383) - NetCache.baseY * 64;
               if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
                  var4.resetPath(var10, var11);
                  var4.field652 = false;
               } else if (var2) {
                  var4.field652 = true;
                  var4.tileX = var10;
                  var4.tileY = var11;
               } else {
                  var4.field652 = false;
                  var4.method1327(var10, var11, Players.field1274[var1]);
               }

               var4.plane = (byte)(var7 + var4.plane & 3);
               if (Client.localPlayerIndex == var1) {
                  class90.Client_plane = var4.plane;
               }

            }
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1139571995"
   )
   @Export("Messages_getNextChatID")
   static int Messages_getNextChatID(int var0) {
      Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZB)I",
      garbageValue = "54"
   )
   static int method1845(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class277.field3584 : Interpreter.field1117;
      if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETID) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "-369076606"
   )
   static int method1846(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode;
         return 1;
      } else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
         Interpreter.Interpreter_intStackSize -= 3;
         Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         ArchiveLoader.privateChatMode = UserComparator5.method3604(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         if (ArchiveLoader.privateChatMode == null) {
            ArchiveLoader.privateChatMode = PrivateChatMode.field3830;
         }

         Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         PacketBufferNode var18 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2264, Client.packetWriter.isaacCipher);
         var18.packetBuffer.writeByte(Client.publicChatMode);
         var18.packetBuffer.writeByte(ArchiveLoader.privateChatMode.field3832);
         var18.packetBuffer.writeByte(Client.tradeChatMode);
         Client.packetWriter.addNode(var18);
         return 1;
      } else {
         String var3;
         int var11;
         if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
            var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            Interpreter.Interpreter_intStackSize -= 2;
            var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            int var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            PacketBufferNode var13 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2314, Client.packetWriter.isaacCipher);
            var13.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var3) + 2);
            var13.packetBuffer.writeStringCp1252NullTerminated(var3);
            var13.packetBuffer.writeByte(var11 - 1);
            var13.packetBuffer.writeByte(var12);
            Client.packetWriter.addNode(var13);
            return 1;
         } else {
            int var10;
            if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
               Interpreter.Interpreter_intStackSize -= 2;
               var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               Message var16 = class89.Messages_getByChannelAndID(var10, var11);
               if (var16 != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var16.count;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var16.cycle;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.sender != null ? var16.sender : "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.prefix != null ? var16.prefix : "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.text != null ? var16.text : "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var16.isFromFriend() ? 1 : (var16.isFromIgnored() ? 2 : 0);
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
               var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               Message var14 = NPC.Messages_getMessage(var10);
               if (var14 != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.type;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.cycle;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var14.sender != null ? var14.sender : "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var14.prefix != null ? var14.prefix : "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var14.text != null ? var14.text : "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.isFromFriend() ? 1 : (var14.isFromIgnored() ? 2 : 0);
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
               if (ArchiveLoader.privateChatMode == null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveLoader.privateChatMode.field3832;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
               var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               String var15 = var3.toLowerCase();
               byte var17 = 0;
               if (var15.startsWith("yellow:")) {
                  var17 = 0;
                  var3 = var3.substring("yellow:".length());
               } else if (var15.startsWith("red:")) {
                  var17 = 1;
                  var3 = var3.substring("red:".length());
               } else if (var15.startsWith("green:")) {
                  var17 = 2;
                  var3 = var3.substring("green:".length());
               } else if (var15.startsWith("cyan:")) {
                  var17 = 3;
                  var3 = var3.substring("cyan:".length());
               } else if (var15.startsWith("purple:")) {
                  var17 = 4;
                  var3 = var3.substring("purple:".length());
               } else if (var15.startsWith("white:")) {
                  var17 = 5;
                  var3 = var3.substring("white:".length());
               } else if (var15.startsWith("flash1:")) {
                  var17 = 6;
                  var3 = var3.substring("flash1:".length());
               } else if (var15.startsWith("flash2:")) {
                  var17 = 7;
                  var3 = var3.substring("flash2:".length());
               } else if (var15.startsWith("flash3:")) {
                  var17 = 8;
                  var3 = var3.substring("flash3:".length());
               } else if (var15.startsWith("glow1:")) {
                  var17 = 9;
                  var3 = var3.substring("glow1:".length());
               } else if (var15.startsWith("glow2:")) {
                  var17 = 10;
                  var3 = var3.substring("glow2:".length());
               } else if (var15.startsWith("glow3:")) {
                  var17 = 11;
                  var3 = var3.substring("glow3:".length());
               } else if (Language.Language_EN != NPCDefinition.clientLanguage) {
                  if (var15.startsWith("yellow:")) {
                     var17 = 0;
                     var3 = var3.substring("yellow:".length());
                  } else if (var15.startsWith("red:")) {
                     var17 = 1;
                     var3 = var3.substring("red:".length());
                  } else if (var15.startsWith("green:")) {
                     var17 = 2;
                     var3 = var3.substring("green:".length());
                  } else if (var15.startsWith("cyan:")) {
                     var17 = 3;
                     var3 = var3.substring("cyan:".length());
                  } else if (var15.startsWith("purple:")) {
                     var17 = 4;
                     var3 = var3.substring("purple:".length());
                  } else if (var15.startsWith("white:")) {
                     var17 = 5;
                     var3 = var3.substring("white:".length());
                  } else if (var15.startsWith("flash1:")) {
                     var17 = 6;
                     var3 = var3.substring("flash1:".length());
                  } else if (var15.startsWith("flash2:")) {
                     var17 = 7;
                     var3 = var3.substring("flash2:".length());
                  } else if (var15.startsWith("flash3:")) {
                     var17 = 8;
                     var3 = var3.substring("flash3:".length());
                  } else if (var15.startsWith("glow1:")) {
                     var17 = 9;
                     var3 = var3.substring("glow1:".length());
                  } else if (var15.startsWith("glow2:")) {
                     var17 = 10;
                     var3 = var3.substring("glow2:".length());
                  } else if (var15.startsWith("glow3:")) {
                     var17 = 11;
                     var3 = var3.substring("glow3:".length());
                  }
               }

               var15 = var3.toLowerCase();
               byte var7 = 0;
               if (var15.startsWith("wave:")) {
                  var7 = 1;
                  var3 = var3.substring("wave:".length());
               } else if (var15.startsWith("wave2:")) {
                  var7 = 2;
                  var3 = var3.substring("wave2:".length());
               } else if (var15.startsWith("shake:")) {
                  var7 = 3;
                  var3 = var3.substring("shake:".length());
               } else if (var15.startsWith("scroll:")) {
                  var7 = 4;
                  var3 = var3.substring("scroll:".length());
               } else if (var15.startsWith("slide:")) {
                  var7 = 5;
                  var3 = var3.substring("slide:".length());
               } else if (NPCDefinition.clientLanguage != Language.Language_EN) {
                  if (var15.startsWith("wave:")) {
                     var7 = 1;
                     var3 = var3.substring("wave:".length());
                  } else if (var15.startsWith("wave2:")) {
                     var7 = 2;
                     var3 = var3.substring("wave2:".length());
                  } else if (var15.startsWith("shake:")) {
                     var7 = 3;
                     var3 = var3.substring("shake:".length());
                  } else if (var15.startsWith("scroll:")) {
                     var7 = 4;
                     var3 = var3.substring("scroll:".length());
                  } else if (var15.startsWith("slide:")) {
                     var7 = 5;
                     var3 = var3.substring("slide:".length());
                  }
               }

               PacketBufferNode var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2293, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeByte(0);
               int var9 = var8.packetBuffer.offset;
               var8.packetBuffer.writeByte(var11);
               var8.packetBuffer.writeByte(var17);
               var8.packetBuffer.writeByte(var7);
               Clock.method3721(var8.packetBuffer, var3);
               var8.packetBuffer.writeLengthByte(var8.packetBuffer.offset - var9);
               Client.packetWriter.addNode(var8);
               return 1;
            } else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
               Interpreter.Interpreter_stringStackSize -= 2;
               var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
               String var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
               PacketBufferNode var5 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2289, Client.packetWriter.isaacCipher);
               var5.packetBuffer.writeShort(0);
               int var6 = var5.packetBuffer.offset;
               var5.packetBuffer.writeStringCp1252NullTerminated(var3);
               Clock.method3721(var5.packetBuffer, var4);
               var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var6);
               Client.packetWriter.addNode(var5);
               return 1;
            } else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
               if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode;
                  return 1;
               } else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
                  var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MilliClock.Messages_getHistorySize(var10);
                  return 1;
               } else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
                  var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Messages_getNextChatID(var10);
                  return 1;
               } else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
                  var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.Messages_getLastChatID(var10);
                  return 1;
               } else if (var0 == ScriptOpcodes.DOCHEAT) {
                  var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                  WorldMapSection0.doCheat(var3);
                  return 1;
               } else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
                  Client.field882 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim();
                  return 1;
               } else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field882;
                  return 1;
               } else if (var0 == ScriptOpcodes.DEBUGMES) {
                  var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                  System.out.println(var3);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (UserComparator9.localPlayer != null && UserComparator9.localPlayer.username != null) {
                  var3 = UserComparator9.localPlayer.username.getName();
               } else {
                  var3 = "";
               }

               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
               return 1;
            }
         }
      }
   }

   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)V",
      garbageValue = "1774948144"
   )
   @Export("findItemDefinitions")
   static void findItemDefinitions(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var2 = new short[16];
      int var3 = 0;

      for(int var4 = 0; var4 < class52.ItemDefinition_fileCount; ++var4) {
         ItemDefinition var9 = class281.ItemDefinition_get(var4);
         if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
            if (var3 >= 250) {
               NPC.foundItemIdCount = -1;
               class52.foundItemIds = null;
               return;
            }

            if (var3 >= var2.length) {
               short[] var6 = new short[var2.length * 2];

               for(int var7 = 0; var7 < var3; ++var7) {
                  var6[var7] = var2[var7];
               }

               var2 = var6;
            }

            var2[var3++] = (short)var4;
         }
      }

      class52.foundItemIds = var2;
      WorldMapLabelSize.foundItemIndex = 0;
      NPC.foundItemIdCount = var3;
      String[] var8 = new String[NPC.foundItemIdCount];

      for(int var5 = 0; var5 < NPC.foundItemIdCount; ++var5) {
         var8[var5] = class281.ItemDefinition_get(var2[var5]).name;
      }

      HealthBarUpdate.method1873(var8, class52.foundItemIds);
   }
}
