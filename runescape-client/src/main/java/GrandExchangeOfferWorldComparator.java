import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("k")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      descriptor = "[Llm;"
   )
   @Export("mapMarkerSprites")
   static SpritePixels[] mapMarkerSprites;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lx;Lx;I)I",
      garbageValue = "1040047906"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lby;IB)V",
      garbageValue = "-24"
   )
   @Export("runScript")
   static void runScript(ScriptEvent var0, int var1) {
      Object[] var2 = var0.args;
      Script var3;
      int var17;
      if (AbstractArchive.isWorldMapEvent(var0.type)) {
         Interpreter.worldMapEvent = (WorldMapEvent)var2[0];
         WorldMapElement var4 = InvDefinition.WorldMapElement_get(Interpreter.worldMapEvent.mapElement);
         var3 = GrandExchangeOfferTotalQuantityComparator.getWorldMapScript(var0.type, var4.objectId, var4.category);
      } else {
         var17 = (Integer)var2[0];
         var3 = Varcs.getScript(var17);
      }

      if (var3 != null) {
         Interpreter.Interpreter_intStackSize = 0;
         Interpreter.Interpreter_stringStackSize = 0;
         var17 = -1;
         int[] var5 = var3.opcodes;
         int[] var6 = var3.intOperands;
         byte var7 = -1;
         Interpreter.Interpreter_frameDepth = 0;
         Interpreter.field1120 = false;

         try {
            int var10;
            try {
               Interpreter.Interpreter_intLocals = new int[var3.localIntCount];
               int var8 = 0;
               class349.Interpreter_stringLocals = new String[var3.localStringCount];
               int var9 = 0;

               int var11;
               String var18;
               for(var10 = 1; var10 < var2.length; ++var10) {
                  if (var2[var10] instanceof Integer) {
                     var11 = (Integer)var2[var10];
                     if (var11 == -2147483647) {
                        var11 = var0.mouseX;
                     }

                     if (var11 == -2147483646) {
                        var11 = var0.mouseY;
                     }

                     if (var11 == -2147483645) {
                        var11 = var0.widget != null ? var0.widget.id : -1;
                     }

                     if (var11 == -2147483644) {
                        var11 = var0.opIndex;
                     }

                     if (var11 == -2147483643) {
                        var11 = var0.widget != null ? var0.widget.childIndex : -1;
                     }

                     if (var11 == -2147483642) {
                        var11 = var0.dragTarget != null ? var0.dragTarget.id : -1;
                     }

                     if (var11 == -2147483641) {
                        var11 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
                     }

                     if (var11 == -2147483640) {
                        var11 = var0.keyTyped;
                     }

                     if (var11 == -2147483639) {
                        var11 = var0.keyPressed;
                     }

                     Interpreter.Interpreter_intLocals[var8++] = var11;
                  } else if (var2[var10] instanceof String) {
                     var18 = (String)var2[var10];
                     if (var18.equals("event_opbase")) {
                        var18 = var0.targetName;
                     }

                     class349.Interpreter_stringLocals[var9++] = var18;
                  }
               }

               var10 = 0;
               Interpreter.field1123 = var0.field593;

               while(true) {
                  ++var10;
                  if (var10 > var1) {
                     throw new RuntimeException();
                  }

                  ++var17;
                  int var29 = var5[var17];
                  int var20;
                  if (var29 >= 100) {
                     boolean var32;
                     if (var3.intOperands[var17] == 1) {
                        var32 = true;
                     } else {
                        var32 = false;
                     }

                     var20 = class304.method5507(var29, var3, var32);
                     switch(var20) {
                     case 0:
                        return;
                     case 1:
                     default:
                        break;
                     case 2:
                        throw new IllegalStateException();
                     }
                  } else if (var29 == 0) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6[var17];
                  } else if (var29 == ScriptOpcodes.GET_VARP) {
                     var11 = var6[var17];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var11];
                  } else if (var29 == ScriptOpcodes.SET_VARP) {
                     var11 = var6[var17];
                     Varps.Varps_main[var11] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     AbstractWorldMapIcon.changeGameOptions(var11);
                  } else if (var29 == ScriptOpcodes.SCONST) {
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.stringOperands[var17];
                  } else if (var29 == ScriptOpcodes.JUMP) {
                     var17 += var6[var17];
                  } else if (var29 == ScriptOpcodes.IF_ICMPNE) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                        var17 += var6[var17];
                     }
                  } else if (var29 == ScriptOpcodes.IF_ICMPEQ) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                        var17 += var6[var17];
                     }
                  } else if (var29 == ScriptOpcodes.IF_ICMPLT) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                        var17 += var6[var17];
                     }
                  } else if (var29 == ScriptOpcodes.IF_ICMPGT) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                        var17 += var6[var17];
                     }
                  } else if (var29 == ScriptOpcodes.RETURN) {
                     if (Interpreter.Interpreter_frameDepth == 0) {
                        return;
                     }

                     ScriptFrame var34 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
                     var3 = var34.script;
                     var5 = var3.opcodes;
                     var6 = var3.intOperands;
                     var17 = var34.pc;
                     Interpreter.Interpreter_intLocals = var34.intLocals;
                     class349.Interpreter_stringLocals = var34.stringLocals;
                  } else if (var29 == ScriptOpcodes.GET_VARBIT) {
                     var11 = var6[var17];
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FontName.getVarbit(var11);
                  } else if (var29 == ScriptOpcodes.SET_VARBIT) {
                     var11 = var6[var17];
                     WorldMapIcon_1.method377(var11, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                  } else if (var29 == ScriptOpcodes.IF_ICMPLE) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                        var17 += var6[var17];
                     }
                  } else if (var29 == ScriptOpcodes.IF_ICMPGE) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                        var17 += var6[var17];
                     }
                  } else if (var29 == ScriptOpcodes.ILOAD) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var6[var17]];
                  } else if (var29 == ScriptOpcodes.ISTORE) {
                     Interpreter.Interpreter_intLocals[var6[var17]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  } else if (var29 == ScriptOpcodes.SLOAD) {
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class349.Interpreter_stringLocals[var6[var17]];
                  } else if (var29 == ScriptOpcodes.SSTORE) {
                     class349.Interpreter_stringLocals[var6[var17]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                  } else if (var29 == ScriptOpcodes.JOIN_STRING) {
                     var11 = var6[var17];
                     Interpreter.Interpreter_stringStackSize -= var11;
                     String var31 = WorldMapSection0.method311(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var11);
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var31;
                  } else if (var29 == ScriptOpcodes.POP_INT) {
                     --Interpreter.Interpreter_intStackSize;
                  } else if (var29 == ScriptOpcodes.POP_STRING) {
                     --Interpreter.Interpreter_stringStackSize;
                  } else {
                     int var15;
                     if (var29 != ScriptOpcodes.INVOKE) {
                        if (var29 == ScriptOpcodes.GET_VARC_INT) {
                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOffer.varcs.getInt(var6[var17]);
                        } else if (var29 == ScriptOpcodes.SET_VARC_INT) {
                           GrandExchangeOffer.varcs.setInt(var6[var17], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                        } else if (var29 == ScriptOpcodes.DEFINE_ARRAY) {
                           var11 = var6[var17] >> 16;
                           var20 = var6[var17] & '\uffff';
                           int var21 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                           if (var21 < 0 || var21 > 5000) {
                              throw new RuntimeException();
                           }

                           Interpreter.Interpreter_arrayLengths[var11] = var21;
                           byte var22 = -1;
                           if (var20 == 105) {
                              var22 = 0;
                           }

                           for(var15 = 0; var15 < var21; ++var15) {
                              Interpreter.Interpreter_arrays[var11][var15] = var22;
                           }
                        } else if (var29 == ScriptOpcodes.GET_ARRAY_INT) {
                           var11 = var6[var17];
                           var20 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                           if (var20 < 0 || var20 >= Interpreter.Interpreter_arrayLengths[var11]) {
                              throw new RuntimeException();
                           }

                           Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var11][var20];
                        } else if (var29 == ScriptOpcodes.SET_ARRAY_INT) {
                           var11 = var6[var17];
                           Interpreter.Interpreter_intStackSize -= 2;
                           var20 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                           if (var20 < 0 || var20 >= Interpreter.Interpreter_arrayLengths[var11]) {
                              throw new RuntimeException();
                           }

                           Interpreter.Interpreter_arrays[var11][var20] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                        } else if (var29 == ScriptOpcodes.GET_VARC_STRING_OLD) {
                           var18 = GrandExchangeOffer.varcs.getStringOld(var6[var17]);
                           if (var18 == null) {
                              var18 = "null";
                           }

                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var18;
                        } else if (var29 == ScriptOpcodes.SET_VARC_STRING_OLD) {
                           GrandExchangeOffer.varcs.setStringOld(var6[var17], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
                        } else if (var29 == ScriptOpcodes.GET_VARC_STRING) {
                           var18 = GrandExchangeOffer.varcs.getString(var6[var17]);
                           Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var18;
                        } else if (var29 == ScriptOpcodes.SET_VARC_STRING) {
                           GrandExchangeOffer.varcs.setString(var6[var17], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
                        } else {
                           if (var29 != ScriptOpcodes.SWITCH) {
                              throw new IllegalStateException();
                           }

                           IterableNodeHashTable var33 = var3.switches[var6[var17]];
                           IntegerNode var30 = (IntegerNode)var33.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                           if (var30 != null) {
                              var17 += var30.integer;
                           }
                        }
                     } else {
                        var11 = var6[var17];
                        Script var12 = Varcs.getScript(var11);
                        int[] var13 = new int[var12.localIntCount];
                        String[] var14 = new String[var12.localStringCount];

                        for(var15 = 0; var15 < var12.intArgumentCount; ++var15) {
                           var13[var15] = Interpreter.Interpreter_intStack[var15 + (Interpreter.Interpreter_intStackSize - var12.intArgumentCount)];
                        }

                        for(var15 = 0; var15 < var12.stringArgumentCount; ++var15) {
                           var14[var15] = Interpreter.Interpreter_stringStack[var15 + (Interpreter.Interpreter_stringStackSize - var12.stringArgumentCount)];
                        }

                        Interpreter.Interpreter_intStackSize -= var12.intArgumentCount;
                        Interpreter.Interpreter_stringStackSize -= var12.stringArgumentCount;
                        ScriptFrame var19 = new ScriptFrame();
                        var19.script = var3;
                        var19.pc = var17;
                        var19.intLocals = Interpreter.Interpreter_intLocals;
                        var19.stringLocals = class349.Interpreter_stringLocals;
                        Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var19;
                        var3 = var12;
                        var5 = var12.opcodes;
                        var6 = var12.intOperands;
                        var17 = -1;
                        Interpreter.Interpreter_intLocals = var13;
                        class349.Interpreter_stringLocals = var14;
                     }
                  }
               }
            } catch (Exception var27) {
               StringBuilder var24 = new StringBuilder(30);
               var24.append("").append(var3.key).append(" ");

               for(var10 = Interpreter.Interpreter_frameDepth - 1; var10 >= 0; --var10) {
                  var24.append("").append(Interpreter.Interpreter_frames[var10].script.key).append(" ");
               }

               var24.append("").append(var7);
               SequenceDefinition.RunException_sendStackTrace(var24.toString(), var27);
            }
         } finally {
            if (Interpreter.field1120) {
               Interpreter.field1122 = true;
               ModeWhere.method3878();
               Interpreter.field1122 = false;
               Interpreter.field1120 = false;
            }

         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "1834161075"
   )
   @Export("ByteArrayPool_release")
   public static synchronized void ByteArrayPool_release(byte[] var0) {
      if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < 1000) {
         ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
      } else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < 250) {
         ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
      } else if (var0.length == 30000 && ByteArrayPool.ByteArrayPool_largeCount < 50) {
         ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
      } else {
         if (ByteArrayPool.ByteArrayPool_arrays != null) {
            for(int var1 = 0; var1 < TriBool.ByteArrayPool_alternativeSizes.length; ++var1) {
               if (var0.length == TriBool.ByteArrayPool_alternativeSizes[var1] && class225.ByteArrayPool_altSizeArrayCounts[var1] < ByteArrayPool.ByteArrayPool_arrays[var1].length) {
                  ByteArrayPool.ByteArrayPool_arrays[var1][class225.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-508854974"
   )
   public static final void method137(int var0, int var1) {
      ViewportMouse.ViewportMouse_x = var0;
      ViewportMouse.ViewportMouse_y = var1;
      ViewportMouse.ViewportMouse_isInViewport = true;
      ViewportMouse.ViewportMouse_entityCount = 0;
      ViewportMouse.ViewportMouse_false0 = false;
   }

   @ObfuscatedName("w")
   static final void method129(long var0) {
      ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      descriptor = "(Lhz;I)Z",
      garbageValue = "441552279"
   )
   @Export("runCs1")
   static final boolean runCs1(Widget var0) {
      if (var0.cs1Comparisons == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
            int var2 = HealthBar.method2168(var0, var1);
            int var3 = var0.cs1ComparisonValues[var1];
            if (var0.cs1Comparisons[var1] == 2) {
               if (var2 >= var3) {
                  return false;
               }
            } else if (var0.cs1Comparisons[var1] == 3) {
               if (var2 <= var3) {
                  return false;
               }
            } else if (var0.cs1Comparisons[var1] == 4) {
               if (var2 == var3) {
                  return false;
               }
            } else if (var3 != var2) {
               return false;
            }
         }

         return true;
      }
   }
}
