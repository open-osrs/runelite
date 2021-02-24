import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("GameObject")
public final class GameObject {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1569819591
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1280994929
   )
   @Export("height")
   int height;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 554225733
   )
   @Export("centerX")
   int centerX;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1832118377
   )
   @Export("centerY")
   int centerY;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   @Export("entity")
   public Entity entity;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1300389529
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1124762067
   )
   @Export("startX")
   int startX;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 389479395
   )
   @Export("endX")
   int endX;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1171959885
   )
   @Export("startY")
   int startY;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1972895723
   )
   @Export("endY")
   int endY;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 2090583713
   )
   int field1947;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1378890207
   )
   @Export("lastDrawn")
   int lastDrawn;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = 5598826285352901571L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 328569779
   )
   @Export("flags")
   int flags = 0;

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-3"
   )
   public static int method3452(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "([BI)Lcl;",
      garbageValue = "-1796289150"
   )
   @Export("newScript")
   static Script newScript(byte[] var0) {
      Script var1 = new Script();
      Buffer var2 = new Buffer(var0);
      var2.offset = var2.array.length - 2;
      int var3 = var2.readUnsignedShort();
      int var4 = var2.array.length - 2 - var3 - 12;
      var2.offset = var4;
      int var5 = var2.readInt();
      var1.localIntCount = var2.readUnsignedShort();
      var1.localStringCount = var2.readUnsignedShort();
      var1.intArgumentCount = var2.readUnsignedShort();
      var1.stringArgumentCount = var2.readUnsignedShort();
      int var6 = var2.readUnsignedByte();
      int var7;
      int var8;
      if (var6 > 0) {
         var1.switches = var1.newIterableNodeHashTable(var6);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.readUnsignedShort();
            IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? method3452(var8) : 1);
            var1.switches[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.readInt();
               int var11 = var2.readInt();
               var9.put(new IntegerNode(var11), (long)var10);
            }
         }
      }

      var2.offset = 0;
      var2.readStringCp1252NullTerminatedOrNull();
      var1.opcodes = new int[var5];
      var1.intOperands = new int[var5];
      var1.stringOperands = new String[var5];

      for(var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
         var8 = var2.readUnsignedShort();
         if (var8 == 3) {
            var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
         } else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
            var1.intOperands[var7] = var2.readInt();
         } else {
            var1.intOperands[var7] = var2.readUnsignedByte();
         }
      }

      return var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1120887468"
   )
   static final int method3451(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      descriptor = "(Lcv;I)V",
      garbageValue = "871352937"
   )
   static final void method3453(Actor var0) {
      if (var0.field1006 != 0) {
         if (var0.targetIndex != -1) {
            Object var1 = null;
            if (var0.targetIndex < 32768) {
               var1 = Client.npcs[var0.targetIndex];
            } else if (var0.targetIndex >= 32768) {
               var1 = Client.players[var0.targetIndex - '耀'];
            }

            if (var1 != null) {
               int var2 = var0.x - ((Actor)var1).x;
               int var3 = var0.y - ((Actor)var1).y;
               if (var2 != 0 || var3 != 0) {
                  var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
               }
            } else if (var0.false0) {
               var0.targetIndex = -1;
               var0.false0 = false;
            }
         }

         if (var0.field981 != -1 && (var0.pathLength == 0 || var0.field989 > 0)) {
            var0.orientation = var0.field981;
            var0.field981 = -1;
         }

         int var4 = var0.orientation - var0.rotation & 2047;
         if (var4 == 0 && var0.false0) {
            var0.targetIndex = -1;
            var0.false0 = false;
         }

         if (var4 != 0) {
            ++var0.field957;
            boolean var6;
            if (var4 > 1024) {
               var0.rotation -= var0.field1006;
               var6 = true;
               if (var4 < var0.field1006 || var4 > 2048 - var0.field1006) {
                  var0.rotation = var0.orientation;
                  var6 = false;
               }

               if (var0.movementSequence == var0.idleSequence && (var0.field957 > 25 || var6)) {
                  if (var0.turnLeftSequence != -1) {
                     var0.movementSequence = var0.turnLeftSequence;
                  } else {
                     var0.movementSequence = var0.walkSequence;
                  }
               }
            } else {
               var0.rotation += var0.field1006;
               var6 = true;
               if (var4 < var0.field1006 || var4 > 2048 - var0.field1006) {
                  var0.rotation = var0.orientation;
                  var6 = false;
               }

               if (var0.movementSequence == var0.idleSequence && (var0.field957 > 25 || var6)) {
                  if (var0.turnRightSequence != -1) {
                     var0.movementSequence = var0.turnRightSequence;
                  } else {
                     var0.movementSequence = var0.walkSequence;
                  }
               }
            }

            var0.rotation &= 2047;
         } else {
            var0.field957 = 0;
         }

      }
   }
}
