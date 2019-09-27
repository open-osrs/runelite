import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("VertexNormal")
public class VertexNormal {
      @ObfuscatedName("bd")
      @ObfuscatedSignature(
            signature = "Lhs;"
      )
      static ServerBuild field1726;
      @ObfuscatedName("z")
      @ObfuscatedGetter(
            intValue = 511779629
      )
      @Export("magnitude")
      int magnitude;
      // $FF: renamed from: x int
      @ObfuscatedName("n")
      @ObfuscatedGetter(
            intValue = 162355823
      )
      @Export("x")
      int field_46;
      // $FF: renamed from: y int
      @ObfuscatedName("v")
      @ObfuscatedGetter(
            intValue = 669484941
      )
      @Export("y")
      int field_47;
      // $FF: renamed from: z int
      @ObfuscatedName("u")
      @ObfuscatedGetter(
            intValue = -1691554905
      )
      @Export("z")
      int field_48;

      VertexNormal() {
      }

      @ObfuscatedSignature(
            signature = "(Ldp;)V"
      )
      VertexNormal(VertexNormal var1) {
            this.field_46 = var1.field_46;
            this.field_47 = var1.field_47;
            this.field_48 = var1.field_48;
            this.magnitude = var1.magnitude;
      }

      @ObfuscatedName("n")
      @ObfuscatedSignature(
            signature = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
            garbageValue = "-1499927610"
      )
      @Export("base37Decode")
      public static String base37Decode(CharSequence var0) {
            long var3 = 0L;
            int var5 = var0.length();

            for(int var6 = 0; var6 < var5; ++var6) {
                  var3 *= 37L;
                  char var7 = var0.charAt(var6);
                  if (var7 >= 'A' && var7 <= 'Z') {
                        var3 += (long)(var7 + 1 - 65);
                  } else if (var7 >= 'a' && var7 <= 'z') {
                        var3 += (long)(var7 + 1 - 97);
                  } else if (var7 >= '0' && var7 <= '9') {
                        var3 += (long)(var7 + 27 - 48);
                  }

                  if (var3 >= 177917621779460413L) {
                        break;
                  }
            }

            while(var3 % 37L == 0L && 0L != var3) {
                  var3 /= 37L;
            }

            String var8 = World.base37DecodeLong(var3);
            if (var8 == null) {
                  var8 = "";
            }

            return var8;
      }

      @ObfuscatedName("v")
      @ObfuscatedSignature(
            signature = "(I)V",
            garbageValue = "-1992175982"
      )
      public static void method2956() {
            class49.midiPcmStream.clear();
            class197.field2386 = 1;
            class197.musicTrackArchive = null;
      }

      @ObfuscatedName("u")
      @ObfuscatedSignature(
            signature = "(B)V",
            garbageValue = "11"
      )
      public static void method2955() {
            MouseHandler var0 = MouseHandler.MouseHandler_instance;
            synchronized(MouseHandler.MouseHandler_instance) {
                  MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
                  MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
                  MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
                  MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
                  MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
                  MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
                  MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
                  MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
                  MouseHandler.MouseHandler_lastButtonVolatile = 0;
            }
      }

      @ObfuscatedName("i")
      @ObfuscatedSignature(
            signature = "(Lhp;IIS)Z",
            garbageValue = "18259"
      )
      @Export("SpriteBuffer_bufferFile")
      static boolean SpriteBuffer_bufferFile(AbstractArchive var0, int var1, int var2) {
            byte[] var3 = var0.takeFile(var1, var2);
            if (var3 == null) {
                  return false;
            } else {
                  Tiles.SpriteBuffer_decode(var3);
                  return true;
            }
      }
}