import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("HealthBar")
public class HealthBar extends Node {
   @ObfuscatedName("q")
   public static short[] field1143;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lix;"
   )
   @Export("definition")
   HealthBarDefinition definition;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("updates")
   IterableNodeDeque updates = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lix;)V"
   )
   HealthBar(HealthBarDefinition var1) {
      this.definition = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "954576471"
   )
   @Export("put")
   void put(int var1, int var2, int var3, int var4) {
      HealthBarUpdate var5 = null;
      int var6 = 0;

      for(HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
         ++var6;
         if (var7.cycle == var1) {
            var7.set(var1, var2, var3, var4);
            return;
         }

         if (var7.cycle <= var1) {
            var5 = var7;
         }
      }

      if (var5 == null) {
         if (var6 < 4) {
            this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
         }

      } else {
         IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            this.updates.last().remove();
         }

      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Lcd;",
      garbageValue = "-1228863072"
   )
   @Export("get")
   HealthBarUpdate get(int var1) {
      HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
      if (var2 != null && var2.cycle <= var1) {
         for(HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
            var2.remove();
            var2 = var3;
         }

         if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) {
            return var2;
         } else {
            var2.remove();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-64"
   )
   @Export("isEmpty")
   boolean isEmpty() {
      return this.updates.method5064();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-391564902"
   )
   @Export("isCharPrintable")
   public static boolean isCharPrintable(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
      }
   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      descriptor = "(ZS)V",
      garbageValue = "2000"
   )
   static final void method2166(boolean var0) {
      UserComparator5.playPcmPlayers();
      ++Client.packetWriter.pendingWrites;
      if (Client.packetWriter.pendingWrites >= 50 || var0) {
         Client.packetWriter.pendingWrites = 0;
         if (!Client.field712 && Client.packetWriter.getSocket() != null) {
            PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2305, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(var1);

            try {
               Client.packetWriter.flush();
            } catch (IOException var3) {
               Client.field712 = true;
            }
         }

      }
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      descriptor = "(Lhz;II)I",
      garbageValue = "110664163"
   )
   static final int method2168(Widget var0, int var1) {
      if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
         try {
            int[] var2 = var0.cs1Instructions[var1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;

            while(true) {
               int var6 = var2[var4++];
               int var7 = 0;
               byte var8 = 0;
               if (var6 == 0) {
                  return var3;
               }

               if (var6 == 1) {
                  var7 = Client.currentLevels[var2[var4++]];
               }

               if (var6 == 2) {
                  var7 = Client.levels[var2[var4++]];
               }

               if (var6 == 3) {
                  var7 = Client.experience[var2[var4++]];
               }

               int var9;
               Widget var10;
               int var11;
               int var12;
               if (var6 == 4) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class237.getWidget(var9);
                  var11 = var2[var4++];
                  if (var11 != -1 && (!class281.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
                     for(var12 = 0; var12 < var10.itemIds.length; ++var12) {
                        if (var11 + 1 == var10.itemIds[var12]) {
                           var7 += var10.itemQuantities[var12];
                        }
                     }
                  }
               }

               if (var6 == 5) {
                  var7 = Varps.Varps_main[var2[var4++]];
               }

               if (var6 == 6) {
                  var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
               }

               if (var6 == 7) {
                  var7 = Varps.Varps_main[var2[var4++]] * 100 / '뜛';
               }

               if (var6 == 8) {
                  var7 = UserComparator9.localPlayer.combatLevel;
               }

               if (var6 == 9) {
                  for(var9 = 0; var9 < 25; ++var9) {
                     if (Skills.Skills_enabled[var9]) {
                        var7 += Client.levels[var9];
                     }
                  }
               }

               if (var6 == 10) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class237.getWidget(var9);
                  var11 = var2[var4++];
                  if (var11 != -1 && (!class281.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
                     for(var12 = 0; var12 < var10.itemIds.length; ++var12) {
                        if (var11 + 1 == var10.itemIds[var12]) {
                           var7 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var6 == 11) {
                  var7 = Client.runEnergy;
               }

               if (var6 == 12) {
                  var7 = Client.weight;
               }

               if (var6 == 13) {
                  var9 = Varps.Varps_main[var2[var4++]];
                  int var13 = var2[var4++];
                  var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
               }

               if (var6 == 14) {
                  var9 = var2[var4++];
                  var7 = FontName.getVarbit(var9);
               }

               if (var6 == 15) {
                  var8 = 1;
               }

               if (var6 == 16) {
                  var8 = 2;
               }

               if (var6 == 17) {
                  var8 = 3;
               }

               if (var6 == 18) {
                  var7 = GrandExchangeOfferNameComparator.baseX * 64 + (UserComparator9.localPlayer.x >> 7);
               }

               if (var6 == 19) {
                  var7 = NetCache.baseY * 64 + (UserComparator9.localPlayer.y >> 7);
               }

               if (var6 == 20) {
                  var7 = var2[var4++];
               }

               if (var8 == 0) {
                  if (var5 == 0) {
                     var3 += var7;
                  }

                  if (var5 == 1) {
                     var3 -= var7;
                  }

                  if (var5 == 2 && var7 != 0) {
                     var3 /= var7;
                  }

                  if (var5 == 3) {
                     var3 *= var7;
                  }

                  var5 = 0;
               } else {
                  var5 = var8;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }
}
