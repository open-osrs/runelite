import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("he")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -148316237
   )
   static int field2516;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lgg;"
   )
   @Export("superStream")
   MidiPcmStream superStream;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   @Export("queue")
   NodeDeque queue = new NodeDeque();
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Ldi;"
   )
   @Export("mixer")
   PcmStreamMixer mixer = new PcmStreamMixer();

   @ObfuscatedSignature(
      descriptor = "(Lgg;)V"
   )
   MusicPatchPcmStream(MidiPcmStream var1) {
      this.superStream = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lhq;[IIIIS)V",
      garbageValue = "23507"
   )
   void method4102(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if ((this.superStream.field2458[var1.field2471] & 4) != 0 && var1.field2486 < 0) {
         int var6 = this.superStream.field2468[var1.field2471] / (StructDefinition.field3338 * 22050);

         while(true) {
            int var7 = (var6 + 1048575 - var1.field2479) / var6;
            if (var7 > var4) {
               var1.field2479 += var6 * var4;
               break;
            }

            var1.stream.fill(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field2479 += var6 * var7 - 1048576;
            int var8 = StructDefinition.field3338 * 22050 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            RawPcmStream var10 = var1.stream;
            if (this.superStream.field2460[var1.field2471] == 0) {
               var1.stream = RawPcmStream.method2845(var1.rawSound, var10.method2728(), var10.method2719(), var10.method2773());
            } else {
               var1.stream = RawPcmStream.method2845(var1.rawSound, var10.method2728(), 0, var10.method2773());
               this.superStream.method3923(var1, var1.patch.field2513[var1.field2475] < 0);
               var1.stream.method2741(var8, var10.method2719());
            }

            if (var1.patch.field2513[var1.field2475] < 0) {
               var1.stream.setNumLoops(-1);
            }

            var10.method2803(var8);
            var10.fill(var2, var3, var5 - var3);
            if (var10.method2730()) {
               this.mixer.addSubStream(var10);
            }
         }
      }

      var1.stream.fill(var2, var3, var4);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lhq;II)V",
      garbageValue = "-1159313608"
   )
   void method4103(MusicPatchNode var1, int var2) {
      if ((this.superStream.field2458[var1.field2471] & 4) != 0 && var1.field2486 < 0) {
         int var3 = this.superStream.field2468[var1.field2471] / (StructDefinition.field3338 * 22050);
         int var4 = (var3 + 1048575 - var1.field2479) / var3;
         var1.field2479 = var3 * var2 + var1.field2479 & 1048575;
         if (var4 <= var2) {
            if (this.superStream.field2460[var1.field2471] == 0) {
               var1.stream = RawPcmStream.method2845(var1.rawSound, var1.stream.method2728(), var1.stream.method2719(), var1.stream.method2773());
            } else {
               var1.stream = RawPcmStream.method2845(var1.rawSound, var1.stream.method2728(), 0, var1.stream.method2773());
               this.superStream.method3923(var1, var1.patch.field2513[var1.field2475] < 0);
            }

            if (var1.patch.field2513[var1.field2475] < 0) {
               var1.stream.setNumLoops(-1);
            }

            var2 = var1.field2479 / var3;
         }
      }

      var1.stream.skip(var2);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "()Ldw;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
      if (var1 == null) {
         return null;
      } else {
         return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "()Ldw;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      MusicPatchNode var1;
      do {
         var1 = (MusicPatchNode)this.queue.previous();
         if (var1 == null) {
            return null;
         }
      } while(var1.stream == null);

      return var1.stream;
   }

   @ObfuscatedName("e")
   protected int vmethod4099() {
      return 0;
   }

   @ObfuscatedName("q")
   @Export("fill")
   protected void fill(int[] var1, int var2, int var3) {
      this.mixer.fill(var1, var2, var3);

      for(MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method3927(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field2484) {
                  this.method4102(var6, var1, var4, var5, var5 + var4);
                  var6.field2484 -= var5;
                  break;
               }

               this.method4102(var6, var1, var4, var6.field2484, var5 + var4);
               var4 += var6.field2484;
               var5 -= var6.field2484;
            } while(!this.superStream.method3953(var6, var1, var4, var5));
         }
      }

   }

   @ObfuscatedName("s")
   @Export("skip")
   protected void skip(int var1) {
      this.mixer.skip(var1);

      for(MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method3927(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field2484) {
                  this.method4103(var3, var2);
                  var3.field2484 -= var2;
                  break;
               }

               this.method4103(var3, var3.field2484);
               var2 -= var3.field2484;
            } while(!this.superStream.method3953(var3, (int[])null, 0, var2));
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IILgz;Lfe;I)Z",
      garbageValue = "604178296"
   )
   public static final boolean method4098(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
      int var4 = var0;
      int var5 = var1;
      byte var6 = 64;
      byte var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      class182.directions[var6][var7] = 99;
      class182.distances[var6][var7] = 0;
      byte var10 = 0;
      int var11 = 0;
      class182.bufferX[var10] = var0;
      byte var10001 = var10;
      int var18 = var10 + 1;
      class182.bufferY[var10001] = var1;
      int[][] var12 = var3.flags;

      while(var18 != var11) {
         var4 = class182.bufferX[var11];
         var5 = class182.bufferY[var11];
         var11 = var11 + 1 & 4095;
         int var16 = var4 - var8;
         int var17 = var5 - var9;
         int var13 = var4 - var3.xInset;
         int var14 = var5 - var3.yInset;
         if (var2.hasArrived(1, var4, var5, var3)) {
            class182.field2118 = var4;
            class182.field2124 = var5;
            return true;
         }

         int var15 = class182.distances[var16][var17] + 1;
         if (var16 > 0 && class182.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) {
            class182.bufferX[var18] = var4 - 1;
            class182.bufferY[var18] = var5;
            var18 = var18 + 1 & 4095;
            class182.directions[var16 - 1][var17] = 2;
            class182.distances[var16 - 1][var17] = var15;
         }

         if (var16 < 127 && class182.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) {
            class182.bufferX[var18] = var4 + 1;
            class182.bufferY[var18] = var5;
            var18 = var18 + 1 & 4095;
            class182.directions[var16 + 1][var17] = 8;
            class182.distances[var16 + 1][var17] = var15;
         }

         if (var17 > 0 && class182.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class182.bufferX[var18] = var4;
            class182.bufferY[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class182.directions[var16][var17 - 1] = 1;
            class182.distances[var16][var17 - 1] = var15;
         }

         if (var17 < 127 && class182.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class182.bufferX[var18] = var4;
            class182.bufferY[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class182.directions[var16][var17 + 1] = 4;
            class182.distances[var16][var17 + 1] = var15;
         }

         if (var16 > 0 && var17 > 0 && class182.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class182.bufferX[var18] = var4 - 1;
            class182.bufferY[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class182.directions[var16 - 1][var17 - 1] = 3;
            class182.distances[var16 - 1][var17 - 1] = var15;
         }

         if (var16 < 127 && var17 > 0 && class182.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class182.bufferX[var18] = var4 + 1;
            class182.bufferY[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class182.directions[var16 + 1][var17 - 1] = 9;
            class182.distances[var16 + 1][var17 - 1] = var15;
         }

         if (var16 > 0 && var17 < 127 && class182.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class182.bufferX[var18] = var4 - 1;
            class182.bufferY[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class182.directions[var16 - 1][var17 + 1] = 6;
            class182.distances[var16 - 1][var17 + 1] = var15;
         }

         if (var16 < 127 && var17 < 127 && class182.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class182.bufferX[var18] = var4 + 1;
            class182.bufferY[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class182.directions[var16 + 1][var17 + 1] = 12;
            class182.distances[var16 + 1][var17 + 1] = var15;
         }
      }

      class182.field2118 = var4;
      class182.field2124 = var5;
      return false;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "1484291347"
   )
   static int method4118(int var0, Script var1, boolean var2) {
      String var7;
      if (var0 == ScriptOpcodes.MES) {
         var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
         AbstractWorldMapData.addGameMessage(0, "", var7);
         return 1;
      } else if (var0 == ScriptOpcodes.ANIM) {
         Interpreter.Interpreter_intStackSize -= 2;
         UserComparator7.performPlayerAnimation(UserComparator9.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         return 1;
      } else if (var0 == ScriptOpcodes.IF_CLOSE) {
         if (!Interpreter.field1122) {
            Interpreter.field1120 = true;
         }

         return 1;
      } else {
         int var16;
         if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
            var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            var16 = 0;
            if (WorldMapDecoration.isNumber(var7)) {
               var16 = class217.parseInt(var7);
            }

            PacketBufferNode var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2285, Client.packetWriter.isaacCipher);
            var14.packetBuffer.writeInt(var16);
            Client.packetWriter.addNode(var14);
            return 1;
         } else {
            PacketBufferNode var12;
            if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
               var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               var12 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2303, Client.packetWriter.isaacCipher);
               var12.packetBuffer.writeByte(var7.length() + 1);
               var12.packetBuffer.writeStringCp1252NullTerminated(var7);
               Client.packetWriter.addNode(var12);
               return 1;
            } else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
               var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               var12 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2311, Client.packetWriter.isaacCipher);
               var12.packetBuffer.writeByte(var7.length() + 1);
               var12.packetBuffer.writeStringCp1252NullTerminated(var7);
               Client.packetWriter.addNode(var12);
               return 1;
            } else {
               String var4;
               int var10;
               if (var0 == ScriptOpcodes.OPPLAYER) {
                  var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                  class7.method83(var10, var4);
                  return 1;
               } else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
                  Interpreter.Interpreter_intStackSize -= 3;
                  var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                  var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                  int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                  Widget var15 = class237.getWidget(var9);
                  FriendSystem.clickWidget(var15, var10, var16);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
                  Interpreter.Interpreter_intStackSize -= 2;
                  var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                  var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                  Widget var13 = var2 ? class277.field3584 : Interpreter.field1117;
                  FriendSystem.clickWidget(var13, var10, var16);
                  return 1;
               } else if (var0 == ScriptOpcodes.MOUSECAM) {
                  class8.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.roofsHidden ? 1 : 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
                  WorldMapSectionType.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  class23.savePreferences();
                  return 1;
               } else if (var0 == ScriptOpcodes.OPENURL) {
                  var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                  boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  WorldMapRectangle.openURL(var7, var8, false);
                  return 1;
               } else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
                  var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var12 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2331, Client.packetWriter.isaacCipher);
                  var12.packetBuffer.writeShort(var10);
                  Client.packetWriter.addNode(var12);
                  return 1;
               } else if (var0 == ScriptOpcodes.BUG_REPORT) {
                  var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStackSize -= 2;
                  var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
                  String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
                  if (var4.length() > 500) {
                     return 1;
                  } else if (var5.length() > 500) {
                     return 1;
                  } else {
                     PacketBufferNode var6 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2319, Client.packetWriter.isaacCipher);
                     var6.packetBuffer.writeShort(1 + WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var4) + WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var5));
                     var6.packetBuffer.writeStringCp1252NullTerminated(var4);
                     var6.packetBuffer.method5778(var10);
                     var6.packetBuffer.writeStringCp1252NullTerminated(var5);
                     Client.packetWriter.addNode(var6);
                     return 1;
                  }
               } else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
                  Client.shiftClickDrop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
                  Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.RENDERSELF) {
                  Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 1;
                  } else {
                     Client.drawPlayerNames &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 2;
                  } else {
                     Client.drawPlayerNames &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 4;
                  } else {
                     Client.drawPlayerNames &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                     Client.drawPlayerNames |= 8;
                  } else {
                     Client.drawPlayerNames &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  Client.drawPlayerNames = 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
                  Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
                  Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETTAPTODROP) {
                  Tiles.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
                  return 1;
               } else if (var0 == ScriptOpcodes.GETTAPTODROP) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArea.getTapToDrop() ? 1 : 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
                  Interpreter.Interpreter_intStackSize -= 2;
                  Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                  Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                  return 1;
               } else if (var0 == 3130) {
                  Interpreter.Interpreter_intStackSize -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --Interpreter.Interpreter_intStackSize;
                  return 1;
               } else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class25.canvasHeight;
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
                  --Interpreter.Interpreter_intStackSize;
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
                  return 1;
               } else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
                  Interpreter.Interpreter_intStackSize -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  Client.field705 = 3;
                  Client.field699 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  return 1;
               } else if (var0 == 3137) {
                  Client.field705 = 2;
                  Client.field699 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  return 1;
               } else if (var0 == 3138) {
                  Client.field705 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  Client.field705 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  Client.field705 = 3;
                  Client.field699 = var2 ? class277.field3584.id : Interpreter.field1117.id;
                  return 1;
               } else {
                  boolean var11;
                  if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     WorldMapSectionType.clientPreferences.hideUsername = var11;
                     class23.savePreferences();
                     return 1;
                  } else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.hideUsername ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     Client.Login_isUsernameRemembered = var11;
                     if (!var11) {
                        WorldMapSectionType.clientPreferences.rememberedUsername = "";
                        class23.savePreferences();
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
                     return 1;
                  } else if (var0 == 3145) {
                     return 1;
                  } else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
                     var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (var11 == WorldMapSectionType.clientPreferences.titleMusicDisabled) {
                        WorldMapSectionType.clientPreferences.titleMusicDisabled = !var11;
                        class23.savePreferences();
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.titleMusicDisabled ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (var0 == 3149) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3150) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
                     return 1;
                  } else if (var0 == 3154) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ViewportMouse.method3161();
                     return 1;
                  } else if (var0 == 3155) {
                     --Interpreter.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (var0 == 3157) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --Interpreter.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --Interpreter.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     --Interpreter.Interpreter_stringStackSize;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --Interpreter.Interpreter_intStackSize;
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     --Interpreter.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3171) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3172) {
                     --Interpreter.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 3173) {
                     --Interpreter.Interpreter_intStackSize;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     --Interpreter.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 3175) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     return 1;
                  } else if (var0 == 3176) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (var0 == 3178) {
                     --Interpreter.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --Interpreter.Interpreter_stringStackSize;
                     return 1;
                  } else if (var0 == 3181) {
                     var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize], 0), 100);
                     Decimator.method2707((double)(0.5F + (float)var10 / 200.0F));
                     return 1;
                  } else if (var0 == 3182) {
                     float var3 = 200.0F * ((float)WorldMapSectionType.clientPreferences.field1072 - 0.5F);
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 100 - Math.round(var3);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }
}
