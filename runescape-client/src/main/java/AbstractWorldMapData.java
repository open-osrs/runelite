import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ac")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1122487872
   )
   @Export("regionXLow")
   int regionXLow;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -506277312
   )
   @Export("regionYLow")
   int regionYLow;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -226026385
   )
   @Export("regionX")
   int regionX;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 2108441199
   )
   @Export("regionY")
   int regionY;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -351352557
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 754636665
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1785019245
   )
   @Export("groupId")
   int groupId = -1;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1849711777
   )
   @Export("fileId")
   int fileId = -1;
   @ObfuscatedName("q")
   @Export("floorUnderlayIds")
   short[][][] floorUnderlayIds;
   @ObfuscatedName("l")
   @Export("floorOverlayIds")
   short[][][] floorOverlayIds;
   @ObfuscatedName("s")
   byte[][][] field193;
   @ObfuscatedName("b")
   byte[][][] field204;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "[[[[Lax;"
   )
   @Export("decorations")
   WorldMapDecoration[][][][] decorations;
   @ObfuscatedName("w")
   boolean field203;
   @ObfuscatedName("k")
   boolean field207;

   AbstractWorldMapData() {
      new LinkedList();
      this.field203 = false;
      this.field207 = false;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkx;B)V",
      garbageValue = "36"
   )
   @Export("readGeography")
   abstract void readGeography(Buffer var1);

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "16711935"
   )
   @Export("isFullyLoaded")
   boolean isFullyLoaded() {
      return this.field203 && this.field207;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lig;B)V",
      garbageValue = "116"
   )
   @Export("loadGeography")
   void loadGeography(AbstractArchive var1) {
      if (!this.isFullyLoaded()) {
         byte[] var2 = var1.takeFile(this.groupId, this.fileId);
         if (var2 != null) {
            this.readGeography(new Buffer(var2));
            this.field203 = true;
            this.field207 = true;
         }

      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-59"
   )
   @Export("reset")
   void reset() {
      this.floorUnderlayIds = null;
      this.floorOverlayIds = null;
      this.field193 = null;
      this.field204 = null;
      this.decorations = null;
      this.field203 = false;
      this.field207 = false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IILkx;I)V",
      garbageValue = "-1493570847"
   )
   @Export("readTile")
   void readTile(int var1, int var2, Buffer var3) {
      int var4 = var3.readUnsignedByte();
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.method327(var1, var2, var3, var4);
         } else {
            this.method328(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(IILkx;IB)V",
      garbageValue = "20"
   )
   void method327(int var1, int var2, Buffer var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if (var5) {
         this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
      }

      this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IILkx;II)V",
      garbageValue = "78729378"
   )
   void method328(int var1, int var2, Buffer var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
      int var8;
      int var9;
      int var11;
      if (var6) {
         var8 = var3.readUnsignedByte();

         for(var9 = 0; var9 < var8; ++var9) {
            int var14 = var3.readUnsignedByte();
            if (var14 != 0) {
               this.floorOverlayIds[var9][var1][var2] = (short)var14;
               var11 = var3.readUnsignedByte();
               this.field193[var9][var1][var2] = (byte)(var11 >> 2);
               this.field204[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.readUnsignedByte();
            if (var9 != 0) {
               WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.method5833();
                  int var13 = var3.readUnsignedByte();
                  var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-75109979"
   )
   @Export("getRegionX")
   int getRegionX() {
      return this.regionX;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2014407853"
   )
   @Export("getRegionY")
   int getRegionY() {
      return this.regionY;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1967773856"
   )
   @Export("addGameMessage")
   static void addGameMessage(int var0, String var1, String var2) {
      PlatformInfo.addChatMessage(var0, var1, var2, (String)null);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1751033687"
   )
   public static int method342() {
      return ViewportMouse.ViewportMouse_entityCount;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lkd;I)V",
      garbageValue = "352611015"
   )
   @Export("performReflectionCheck")
   public static void performReflectionCheck(PacketBuffer var0) {
      ReflectionCheck var1 = (ReflectionCheck)class105.reflectionChecks.last();
      if (var1 != null) {
         int var2 = var0.offset;
         var0.writeInt(var1.id);

         for(int var3 = 0; var3 < var1.size; ++var3) {
            if (var1.creationErrors[var3] != 0) {
               var0.writeByte(var1.creationErrors[var3]);
            } else {
               try {
                  int var4 = var1.operations[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.fields[var3];
                     var6 = Reflection.getInt(var5, (Object)null);
                     var0.writeByte(0);
                     var0.writeInt(var6);
                  } else if (var4 == 1) {
                     var5 = var1.fields[var3];
                     Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]);
                     var0.writeByte(0);
                  } else if (var4 == 2) {
                     var5 = var1.fields[var3];
                     var6 = var5.getModifiers();
                     var0.writeByte(0);
                     var0.writeInt(var6);
                  }

                  Method var25;
                  if (var4 != 3) {
                     if (var4 == 4) {
                        var25 = var1.methods[var3];
                        var6 = var25.getModifiers();
                        var0.writeByte(0);
                        var0.writeInt(var6);
                     }
                  } else {
                     var25 = var1.methods[var3];
                     byte[][] var10 = var1.arguments[var3];
                     Object[] var7 = new Object[var10.length];

                     for(int var8 = 0; var8 < var10.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var11 = Reflection.invoke(var25, (Object)null, var7);
                     if (var11 == null) {
                        var0.writeByte(0);
                     } else if (var11 instanceof Number) {
                        var0.writeByte(1);
                        var0.writeLong(((Number)var11).longValue());
                     } else if (var11 instanceof String) {
                        var0.writeByte(2);
                        var0.writeStringCp1252NullTerminated((String)var11);
                     } else {
                        var0.writeByte(4);
                     }
                  }
               } catch (ClassNotFoundException var13) {
                  var0.writeByte(-10);
               } catch (InvalidClassException var14) {
                  var0.writeByte(-11);
               } catch (StreamCorruptedException var15) {
                  var0.writeByte(-12);
               } catch (OptionalDataException var16) {
                  var0.writeByte(-13);
               } catch (IllegalAccessException var17) {
                  var0.writeByte(-14);
               } catch (IllegalArgumentException var18) {
                  var0.writeByte(-15);
               } catch (InvocationTargetException var19) {
                  var0.writeByte(-16);
               } catch (SecurityException var20) {
                  var0.writeByte(-17);
               } catch (IOException var21) {
                  var0.writeByte(-18);
               } catch (NullPointerException var22) {
                  var0.writeByte(-19);
               } catch (Exception var23) {
                  var0.writeByte(-20);
               } catch (Throwable var24) {
                  var0.writeByte(-21);
               }
            }
         }

         var0.writeCrc(var2);
         var1.remove();
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "1250443961"
   )
   static int method350(int var0, Script var1, boolean var2) {
      boolean var3 = true;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         var3 = false;
      } else {
         var4 = var2 ? class277.field3584 : Interpreter.field1117;
      }

      int var11;
      if (var0 == ScriptOpcodes.CC_SETOP) {
         var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
         if (var11 >= 0 && var11 <= 9) {
            var4.setAction(var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
            return 1;
         } else {
            --Interpreter.Interpreter_stringStackSize;
            return 1;
         }
      } else {
         int var6;
         if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
            Interpreter.Interpreter_intStackSize -= 2;
            var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var4.parent = ArchiveLoader.getWidgetChild(var11, var6);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
            var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
            var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
            var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
            var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
            var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
            var4.actions = null;
            return 1;
         } else if (var0 == 1308) {
            var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            return 1;
         } else if (var0 == 1309) {
            --Interpreter.Interpreter_intStackSize;
            return 1;
         } else {
            int var7;
            byte[] var8;
            if (var0 != ScriptOpcodes.CC_SETOPKEY) {
               byte var5;
               if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
                  Interpreter.Interpreter_intStackSize -= 2;
                  var5 = 10;
                  var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]};
                  byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]};
                  TaskHandler.Widget_setKey(var4, var5, var8, var9);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
                  Interpreter.Interpreter_intStackSize -= 3;
                  var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1;
                  var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                  var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                  if (var11 >= 0 && var11 <= 9) {
                     WorldMapRegion.Widget_setKeyRate(var4, var11, var6, var7);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
                  var5 = 10;
                  var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  WorldMapRegion.Widget_setKeyRate(var4, var5, var6, var7);
                  return 1;
               } else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
                  --Interpreter.Interpreter_intStackSize;
                  var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1;
                  if (var11 >= 0 && var11 <= 9) {
                     WorldMapIcon_0.Widget_setKeyIgnoreHeld(var4, var11);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
                  var5 = 10;
                  WorldMapIcon_0.Widget_setKeyIgnoreHeld(var4, var5);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var10 = null;
               var8 = null;
               if (var3) {
                  Interpreter.Interpreter_intStackSize -= 10;

                  for(var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) {
                     ;
                  }

                  if (var7 > 0) {
                     var10 = new byte[var7 / 2];
                     var8 = new byte[var7 / 2];

                     for(var7 -= 2; var7 >= 0; var7 -= 2) {
                        var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize];
                        var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1];
                     }
                  }
               } else {
                  Interpreter.Interpreter_intStackSize -= 2;
                  var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]};
                  var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]};
               }

               var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
               if (var7 >= 0 && var7 <= 9) {
                  TaskHandler.Widget_setKey(var4, var7, var10, var8);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1407692443"
   )
   static void method352() {
      for(int var0 = 0; var0 < Client.menuOptionsCount; ++var0) {
         if (AbstractWorldMapIcon.method685(Client.menuOpcodes[var0])) {
            if (var0 < Client.menuOptionsCount - 1) {
               for(int var1 = var0; var1 < Client.menuOptionsCount - 1; ++var1) {
                  Client.menuActions[var1] = Client.menuActions[var1 + 1];
                  Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
                  Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
                  Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
                  Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1];
                  Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1];
                  Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1];
               }
            }

            --var0;
            --Client.menuOptionsCount;
         }
      }

      class41.method650();
   }
}
