import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("je")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lje;"
   )
   field3494(0, 0),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lje;"
   )
   @Export("HorizontalAlignment_centered")
   HorizontalAlignment_centered(2, 1),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lje;"
   )
   field3490(1, 2);

   @ObfuscatedName("e")
   @Export("SpriteBuffer_spritePalette")
   public static int[] SpriteBuffer_spritePalette;
   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   @Export("hoveredItemContainer")
   static Widget hoveredItemContainer;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1851733283
   )
   @Export("value")
   public final int value;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1519018517
   )
   @Export("id")
   final int id;

   HorizontalAlignment(int var3, int var4) {
      this.value = var3;
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

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "-2086152614"
   )
   static int method4924(int var0, Script var1, boolean var2) {
      String var3;
      int var9;
      if (var0 == ScriptOpcodes.APPEND_NUM) {
         var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
         var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var9;
         return 1;
      } else {
         String var4;
         if (var0 == ScriptOpcodes.APPEND) {
            Interpreter.Interpreter_stringStackSize -= 2;
            var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
            var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4;
            return 1;
         } else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
            var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + GrandExchangeOfferOwnWorldComparator.intToString(var9, true);
            return 1;
         } else if (var0 == ScriptOpcodes.LOWERCASE) {
            var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var10;
            if (var0 == ScriptOpcodes.FROMDATE) {
               var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               long var13 = ((long)var10 + 11745L) * 86400000L;
               Interpreter.Interpreter_calendar.setTime(new Date(var13));
               var6 = Interpreter.Interpreter_calendar.get(5);
               int var17 = Interpreter.Interpreter_calendar.get(2);
               int var8 = Interpreter.Interpreter_calendar.get(1);
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
               return 1;
            } else if (var0 != ScriptOpcodes.TEXT_GENDER) {
               if (var0 == ScriptOpcodes.TOSTRING) {
                  var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var10);
                  return 1;
               } else if (var0 == ScriptOpcodes.COMPARE) {
                  Interpreter.Interpreter_stringStackSize -= 2;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ServerPacket.method3810(User.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], NPCComposition.clientLanguage));
                  return 1;
               } else {
                  int var5;
                  byte[] var11;
                  Font var12;
                  if (var0 == ScriptOpcodes.PARAHEIGHT) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var11 = CollisionMap.archive13.takeFile(var5, 0);
                     var12 = new Font(var11);
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9);
                     return 1;
                  } else if (var0 == ScriptOpcodes.PARAWIDTH) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var11 = CollisionMap.archive13.takeFile(var5, 0);
                     var12 = new Font(var11);
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9);
                     return 1;
                  } else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
                     Interpreter.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
                     if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
                     } else {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ESCAPE) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
                     return 1;
                  } else if (var0 == ScriptOpcodes.APPEND_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + (char)var9;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBar.isCharPrintable((char)var10) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class225.isAlphaNumeric((char)var10) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class69.isCharAlphabetic((char)var10) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
                     var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Strings.isDigit((char)var10) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_LENGTH) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     if (var3 != null) {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.SUBSTRING) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     Interpreter.Interpreter_intStackSize -= 2;
                     var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var9, var5);
                     return 1;
                  } else if (var0 == ScriptOpcodes.REMOVETAGS) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     StringBuilder var15 = new StringBuilder(var3.length());
                     boolean var16 = false;

                     for(var6 = 0; var6 < var3.length(); ++var6) {
                        char var7 = var3.charAt(var6);
                        if (var7 == '<') {
                           var16 = true;
                        } else if (var7 == '>') {
                           var16 = false;
                        } else if (!var16) {
                           var15.append(var7);
                        }
                     }

                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var15.toString();
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var9);
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
                     Interpreter.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
                     var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5);
                     return 1;
                  } else if (var0 == ScriptOpcodes.UPPERCASE) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase();
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               Interpreter.Interpreter_stringStackSize -= 2;
               var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
               var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
               if (UserComparator9.localPlayer.appearance != null && UserComparator9.localPlayer.appearance.isFemale) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
               } else {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
               }

               return 1;
            }
         }
      }
   }
}
