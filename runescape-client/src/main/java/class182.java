import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class182 {
   @ObfuscatedName("d")
   @Export("directions")
   public static int[][] directions = new int[128][128];
   @ObfuscatedName("c")
   @Export("distances")
   public static int[][] distances = new int[128][128];
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1969487819
   )
   public static int field2118;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 512804251
   )
   public static int field2124;
   @ObfuscatedName("e")
   @Export("bufferX")
   public static int[] bufferX = new int[4096];
   @ObfuscatedName("q")
   @Export("bufferY")
   public static int[] bufferY = new int[4096];
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ldy;"
   )
   @Export("soundCache")
   public static SoundCache soundCache;

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      descriptor = "(ZLkd;B)V",
      garbageValue = "-1"
   )
   @Export("updateNpcs")
   static final void updateNpcs(boolean var0, PacketBuffer var1) {
      Client.field851 = 0;
      Client.field725 = 0;
      PacketBuffer var2 = Client.packetWriter.packetBuffer;
      var2.importIndex();
      int var3 = var2.readBits(8);
      int var4;
      if (var3 < Client.npcCount) {
         for(var4 = var3; var4 < Client.npcCount; ++var4) {
            Client.field845[++Client.field851 - 1] = Client.npcIndices[var4];
         }
      }

      if (var3 > Client.npcCount) {
         throw new RuntimeException("");
      } else {
         Client.npcCount = 0;

         int var5;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         for(var4 = 0; var4 < var3; ++var4) {
            var5 = Client.npcIndices[var4];
            NPC var16 = Client.npcs[var5];
            var7 = var2.readBits(1);
            if (var7 == 0) {
               Client.npcIndices[++Client.npcCount - 1] = var5;
               var16.npcCycle = Client.cycle;
            } else {
               var8 = var2.readBits(2);
               if (var8 == 0) {
                  Client.npcIndices[++Client.npcCount - 1] = var5;
                  var16.npcCycle = Client.cycle;
                  Client.field697[++Client.field725 - 1] = var5;
               } else if (var8 == 1) {
                  Client.npcIndices[++Client.npcCount - 1] = var5;
                  var16.npcCycle = Client.cycle;
                  var9 = var2.readBits(3);
                  var16.method2178(var9, (byte)1);
                  var10 = var2.readBits(1);
                  if (var10 == 1) {
                     Client.field697[++Client.field725 - 1] = var5;
                  }
               } else if (var8 == 2) {
                  Client.npcIndices[++Client.npcCount - 1] = var5;
                  var16.npcCycle = Client.cycle;
                  var9 = var2.readBits(3);
                  var16.method2178(var9, (byte)2);
                  var10 = var2.readBits(3);
                  var16.method2178(var10, (byte)2);
                  var11 = var2.readBits(1);
                  if (var11 == 1) {
                     Client.field697[++Client.field725 - 1] = var5;
                  }
               } else if (var8 == 3) {
                  Client.field845[++Client.field851 - 1] = var5;
               }
            }
         }

         SpriteMask.method4174(var0, var1);

         int var14;
         for(var14 = 0; var14 < Client.field725; ++var14) {
            var3 = Client.field697[var14];
            NPC var15 = Client.npcs[var3];
            var5 = var1.readUnsignedByte();
            if ((var5 & 16) != 0) {
               var15.field992 = var1.method5721();
               var15.field952 = var1.method5721();
               var15.field996 = var1.method5747();
               var15.field998 = var1.readByte();
               var15.field999 = var1.readUnsignedShort() + Client.cycle;
               var15.field1000 = var1.method5729() + Client.cycle;
               var15.field1001 = var1.method5729();
               var15.pathLength = 1;
               var15.field1012 = 0;
               var15.field992 += var15.pathX[0];
               var15.field952 += var15.pathY[0];
               var15.field996 += var15.pathX[0];
               var15.field998 += var15.pathY[0];
            }

            int var6;
            if ((var5 & 1) != 0) {
               var15.spotAnimation = var1.method5727();
               var6 = var1.readInt();
               var15.field994 = var6 >> 16;
               var15.field993 = (var6 & '\uffff') + Client.cycle;
               var15.spotAnimationFrame = 0;
               var15.spotAnimationFrameCycle = 0;
               if (var15.field993 > Client.cycle) {
                  var15.spotAnimationFrame = -1;
               }

               if (var15.spotAnimation == 65535) {
                  var15.spotAnimation = -1;
               }
            }

            if ((var5 & 2) != 0) {
               var15.definition = class90.getNpcDefinition(var1.method5728());
               var15.field1007 = var15.definition.size;
               var15.field1006 = var15.definition.rotation;
               var15.walkSequence = var15.definition.walkSequence;
               var15.walkBackSequence = var15.definition.walkBackSequence;
               var15.walkLeftSequence = var15.definition.walkLeftSequence;
               var15.walkRightSequence = var15.definition.walkRightSequence;
               var15.idleSequence = var15.definition.idleSequence;
               var15.turnLeftSequence = var15.definition.turnLeftSequence;
               var15.turnRightSequence = var15.definition.turnRightSequence;
            }

            if ((var5 & 4) != 0) {
               var6 = var1.method5727();
               if (var6 == 65535) {
                  var6 = -1;
               }

               var7 = var1.method5717();
               if (var6 == var15.sequence && var6 != -1) {
                  var8 = InterfaceParent.SequenceDefinition_get(var6).field3548;
                  if (var8 == 1) {
                     var15.sequenceFrame = 0;
                     var15.sequenceFrameCycle = 0;
                     var15.sequenceDelay = var7;
                     var15.field973 = 0;
                  }

                  if (var8 == 2) {
                     var15.field973 = 0;
                  }
               } else if (var6 == -1 || var15.sequence == -1 || InterfaceParent.SequenceDefinition_get(var6).field3560 >= InterfaceParent.SequenceDefinition_get(var15.sequence).field3560) {
                  var15.sequence = var6;
                  var15.sequenceFrame = 0;
                  var15.sequenceFrameCycle = 0;
                  var15.sequenceDelay = var7;
                  var15.field973 = 0;
                  var15.field1012 = var15.pathLength;
               }
            }

            if ((var5 & 128) != 0) {
               var6 = var1.readUnsignedByte();
               int var12;
               if (var6 > 0) {
                  for(var7 = 0; var7 < var6; ++var7) {
                     var9 = -1;
                     var10 = -1;
                     var11 = -1;
                     var8 = var1.readUShortSmart();
                     if (var8 == 32767) {
                        var8 = var1.readUShortSmart();
                        var10 = var1.readUShortSmart();
                        var9 = var1.readUShortSmart();
                        var11 = var1.readUShortSmart();
                     } else if (var8 != 32766) {
                        var10 = var1.readUShortSmart();
                     } else {
                        var8 = -1;
                     }

                     var12 = var1.readUShortSmart();
                     var15.addHitSplat(var8, var10, var9, var11, Client.cycle, var12);
                  }
               }

               var7 = var1.method5717();
               if (var7 > 0) {
                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var1.readUShortSmart();
                     var10 = var1.readUShortSmart();
                     if (var10 != 32767) {
                        var11 = var1.readUShortSmart();
                        var12 = var1.method5776();
                        int var13 = var10 > 0 ? var1.method5717() : var12;
                        var15.addHealthBar(var9, Client.cycle, var10, var11, var12, var13);
                     } else {
                        var15.removeHealthBar(var9);
                     }
                  }
               }
            }

            if ((var5 & 32) != 0) {
               var6 = var1.method5727();
               var7 = var1.readUnsignedShort();
               var8 = var15.x - (var6 - GrandExchangeOfferNameComparator.baseX * 64 - GrandExchangeOfferNameComparator.baseX * 64) * 64;
               var9 = var15.y - (var7 - NetCache.baseY * 64 - NetCache.baseY * 64) * 64;
               if (var8 != 0 || var9 != 0) {
                  var15.field981 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
               }
            }

            if ((var5 & 64) != 0) {
               var15.targetIndex = var1.method5727();
               if (var15.targetIndex == 65535) {
                  var15.targetIndex = -1;
               }
            }

            if ((var5 & 8) != 0) {
               var15.overheadText = var1.readStringCp1252NullTerminated();
               var15.overheadTextCyclesRemaining = 100;
            }
         }

         for(var14 = 0; var14 < Client.field851; ++var14) {
            var3 = Client.field845[var14];
            if (Client.npcs[var3].npcCycle != Client.cycle) {
               Client.npcs[var3].definition = null;
               Client.npcs[var3] = null;
            }
         }

         if (var1.offset != Client.packetWriter.serverPacketLength) {
            throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
         } else {
            for(var14 = 0; var14 < Client.npcCount; ++var14) {
               if (Client.npcs[Client.npcIndices[var14]] == null) {
                  throw new RuntimeException(var14 + "," + Client.npcCount);
               }
            }

         }
      }
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      descriptor = "([Lhz;Lhz;ZI)V",
      garbageValue = "-379515741"
   )
   @Export("revalidateWidgetScroll")
   static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
      int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
      int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
      ObjectSound.resizeInterface(var0, var1.id, var3, var4, var2);
      if (var1.children != null) {
         ObjectSound.resizeInterface(var1.children, var1.id, var3, var4, var2);
      }

      InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
      if (var5 != null) {
         int var6 = var5.group;
         if (WorldMapCacheName.loadInterface(var6)) {
            ObjectSound.resizeInterface(DefaultsGroup.Widget_interfaceComponents[var6], -1, var3, var4, var2);
         }
      }

      if (var1.contentType == 1337) {
         ;
      }

   }
}
