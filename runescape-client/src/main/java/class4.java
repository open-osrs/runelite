import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("y")
final class class4 implements class0 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lkx;B)V",
      garbageValue = "-41"
   )
   public void vmethod48(Object var1, Buffer var2) {
      this.method54((String)var1, var2);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)Ljava/lang/Object;",
      garbageValue = "1678106953"
   )
   public Object vmethod45(Buffer var1) {
      return var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lkx;I)V",
      garbageValue = "-768475899"
   )
   void method54(String var1, Buffer var2) {
      var2.writeStringCp1252NullTerminated(var1);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "-21"
   )
   static final void method55(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               TaskHandler.field2045[0][var5][var4] = 127;
               if (var0 == var5 && var5 > 0) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
               }

               if (var0 + var2 == var5 && var5 < 103) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
               }

               if (var4 == var1 && var4 > 0) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
               }

               if (var4 == var3 + var1 && var4 < 103) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
               }
            }
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(III)Lcl;",
      garbageValue = "836178308"
   )
   static Script method46(int var0, int var1) {
      Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = WorldMapSection0.archive12.getGroupId(var3);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = WorldMapSection0.archive12.takeFileFlat(var4);
            if (var5 != null) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = GameObject.newScript(var5);
               if (var2 != null) {
                  Script.Script_cached.put(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-989634997"
   )
   public static boolean method56() {
      return class206.musicPlayerStatus != 0 ? true : VertexNormal.midiPcmStream.isReady();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "856520106"
   )
   static int method53(int var0, Script var1, boolean var2) {
      int var3 = -1;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         var4 = class237.getWidget(var3);
      } else {
         var4 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget;
      }

      if (var0 == ScriptOpcodes.CC_SETPOSITION) {
         Interpreter.Interpreter_intStackSize -= 4;
         var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         IsaacCipher.invalidateWidget(var4);
         class1.client.alignWidget(var4);
         if (var3 != -1 && var4.type == 0) {
            class182.revalidateWidgetScroll(DefaultsGroup.Widget_interfaceComponents[var3 >> 16], var4, false);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETSIZE) {
         Interpreter.Interpreter_intStackSize -= 4;
         var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         IsaacCipher.invalidateWidget(var4);
         class1.client.alignWidget(var4);
         if (var3 != -1 && var4.type == 0) {
            class182.revalidateWidgetScroll(DefaultsGroup.Widget_interfaceComponents[var3 >> 16], var4, false);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETHIDE) {
         boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         if (var5 != var4.isHidden) {
            var4.isHidden = var5;
            IsaacCipher.invalidateWidget(var4);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
         var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
         var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
         return 1;
      } else {
         return 2;
      }
   }
}
