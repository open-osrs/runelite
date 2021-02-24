import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hi")
@Implements("Strings")
public class Strings {
   @ObfuscatedName("bp")
   public static String field2841 = "Please visit the support page for assistance.";
   @ObfuscatedName("cy")
   public static String field2918 = "Please visit the support page for assistance.";
   @ObfuscatedName("jd")
   public static String field3056 = "";
   @ObfuscatedName("jv")
   public static String field3057 = "Page has opened in a new window.";
   @ObfuscatedName("ji")
   public static String field3058 = "(Please check your popup blocker.)";

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([I[II)V",
      garbageValue = "-894693523"
   )
   public static void method4329(int[] var0, int[] var1) {
      if (var0 != null && var1 != null) {
         TriBool.ByteArrayPool_alternativeSizes = var0;
         class225.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
         ByteArrayPool.ByteArrayPool_arrays = new byte[var0.length][][];

         for(int var2 = 0; var2 < TriBool.ByteArrayPool_alternativeSizes.length; ++var2) {
            ByteArrayPool.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
         }

      } else {
         TriBool.ByteArrayPool_alternativeSizes = null;
         class225.ByteArrayPool_altSizeArrayCounts = null;
         ByteArrayPool.ByteArrayPool_arrays = null;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "9"
   )
   static void method4324() {
      Coord.field2560 = new int[2000];
      int var0 = 0;
      int var1 = 240;

      int var3;
      for(byte var2 = 12; var0 < 16; var1 -= var2) {
         var3 = class231.method4321((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var0 / 16.0F));
         Coord.field2560[var0] = var3;
         ++var0;
      }

      var1 = 48;

      for(int var5 = var1 / 6; var0 < Coord.field2560.length; var1 -= var5) {
         var3 = var0 * 2;

         for(int var4 = class231.method4321((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < Coord.field2560.length; ++var0) {
            Coord.field2560[var0] = var4;
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "([BIII)Ljava/lang/String;",
      garbageValue = "-983754831"
   )
   public static String method4327(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;
      int var5 = var1;

      int var8;
      for(int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) {
         int var7 = var0[var5++] & 255;
         if (var7 < 128) {
            if (var7 == 0) {
               var8 = 65533;
            } else {
               var8 = var7;
            }
         } else if (var7 < 192) {
            var8 = 65533;
         } else if (var7 < 224) {
            if (var5 < var6 && (var0[var5] & 192) == 128) {
               var8 = (var7 & 31) << 6 | var0[var5++] & 63;
               if (var8 < 128) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 240) {
            if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) {
               var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if (var8 < 2048) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 248) {
            if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) {
               var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if (var8 >= 65536 && var8 <= 1114111) {
                  var8 = 65533;
               } else {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else {
            var8 = 65533;
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-570785562"
   )
   @Export("isDigit")
   public static boolean isDigit(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "580078079"
   )
   static int method4326(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.CLIENTCLOCK) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle;
         return 1;
      } else {
         int var3;
         int var4;
         if (var0 == ScriptOpcodes.INV_GETOBJ) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.method1375(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_GETNUM) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.ItemContainer_getCount(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_TOTAL) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class232.method4322(var3, var4);
            return 1;
         } else if (var0 == ScriptOpcodes.INV_SIZE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.getInvDefinition(var3).size;
            return 1;
         } else if (var0 == ScriptOpcodes.STAT) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.STAT_BASE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.STAT_XP) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3];
            return 1;
         } else {
            int var5;
            if (var0 == ScriptOpcodes.COORD) {
               var3 = class90.Client_plane;
               var4 = GrandExchangeOfferNameComparator.baseX * 64 + (UserComparator9.localPlayer.x >> 7);
               var5 = NetCache.baseY * 64 + (UserComparator9.localPlayer.y >> 7);
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
               return 1;
            } else if (var0 == ScriptOpcodes.COORDX) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
               return 1;
            } else if (var0 == ScriptOpcodes.COORDZ) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28;
               return 1;
            } else if (var0 == ScriptOpcodes.COORDY) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383;
               return 1;
            } else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.method1375(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.ItemContainer_getCount(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
               Interpreter.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + '耀';
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class232.method4322(var3, var4);
               return 1;
            } else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
               if (Client.staffModLevel >= 2) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.REBOOTTIMER) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer;
               return 1;
            } else if (var0 == ScriptOpcodes.MAP_WORLD) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId;
               return 1;
            } else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy;
               return 1;
            } else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight;
               return 1;
            } else if (var0 == ScriptOpcodes.PLAYERMOD) {
               if (Client.playerMod) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.WORLDFLAGS) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties;
               return 1;
            } else if (var0 == ScriptOpcodes.MOVECOORD) {
               Interpreter.Interpreter_intStackSize -= 4;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
               int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
               var3 += var4 << 14;
               var3 += var5 << 28;
               var3 += var6;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   @ObfuscatedName("kz")
   @ObfuscatedSignature(
      descriptor = "(Lhz;B)Lhz;",
      garbageValue = "-45"
   )
   static Widget method4325(Widget var0) {
      int var2 = class60.getWidgetFlags(var0);
      int var1 = var2 >> 17 & 7;
      int var3 = var1;
      if (var1 == 0) {
         return null;
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            var0 = class237.getWidget(var0.parentId);
            if (var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }
}
