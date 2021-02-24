import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
   @ObfuscatedName("q")
   static int[][] field257;
   @ObfuscatedName("l")
   public static short[][] field259;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lfm;"
   )
   @Export("clock")
   protected static Clock clock;
   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   static Widget field260;
   @ObfuscatedName("v")
   @Export("tileColors")
   final int[] tileColors;

   WorldMapSprite() {
      this.tileColors = new int[4096];
   }

   WorldMapSprite(int[] var1) {
      this.tileColors = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-36950090"
   )
   @Export("getTileColor")
   final int getTileColor(int var1, int var2) {
      return this.tileColors[var2 * 64 + var1];
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lgd;Lmw;S)Lgk;",
      garbageValue = "22306"
   )
   @Export("getPacketBufferNode")
   public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
      PacketBufferNode var2;
      if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
         var2 = new PacketBufferNode();
      } else {
         var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
      }

      var2.clientPacket = var0;
      var2.clientPacketLength = var0.length;
      if (var2.clientPacketLength == -1) {
         var2.packetBuffer = new PacketBuffer(260);
      } else if (var2.clientPacketLength == -2) {
         var2.packetBuffer = new PacketBuffer(10000);
      } else if (var2.clientPacketLength <= 18) {
         var2.packetBuffer = new PacketBuffer(20);
      } else if (var2.clientPacketLength <= 98) {
         var2.packetBuffer = new PacketBuffer(100);
      } else {
         var2.packetBuffer = new PacketBuffer(260);
      }

      var2.packetBuffer.setIsaacCipher(var1);
      var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
      var2.index = 0;
      return var2;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lef;IIII)Z",
      garbageValue = "1577408669"
   )
   static final boolean method498(Model var0, int var1, int var2, int var3) {
      boolean var4 = ViewportMouse.ViewportMouse_isInViewport;
      if (!var4) {
         return false;
      } else {
         int var5;
         int var6;
         int var7;
         int var8;
         int var11;
         int var12;
         int var13;
         int var16;
         int var17;
         if (!ViewportMouse.ViewportMouse_false0) {
            var5 = Scene.Scene_cameraPitchSine;
            var6 = Scene.Scene_cameraPitchCosine;
            var7 = Scene.Scene_cameraYawSine;
            var8 = Scene.Scene_cameraYawCosine;
            byte var9 = 50;
            short var10 = 3500;
            var11 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var9 / Rasterizer3D.Rasterizer3D_zoom;
            var12 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var9 / Rasterizer3D.Rasterizer3D_zoom;
            var13 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var10 / Rasterizer3D.Rasterizer3D_zoom;
            int var14 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var10 / Rasterizer3D.Rasterizer3D_zoom;
            int var15 = Rasterizer3D.method3188(var12, var9, var6, var5);
            var16 = Rasterizer3D.method3189(var12, var9, var6, var5);
            var12 = var15;
            var15 = Rasterizer3D.method3188(var14, var10, var6, var5);
            var17 = Rasterizer3D.method3189(var14, var10, var6, var5);
            var14 = var15;
            var15 = Rasterizer3D.method3186(var11, var16, var8, var7);
            var16 = Rasterizer3D.method3187(var11, var16, var8, var7);
            var11 = var15;
            var15 = Rasterizer3D.method3186(var13, var17, var8, var7);
            var17 = Rasterizer3D.method3187(var13, var17, var8, var7);
            ViewportMouse.field1757 = (var15 + var11) / 2;
            class8.field45 = (var14 + var12) / 2;
            class39.field288 = (var16 + var17) / 2;
            ViewportMouse.field1758 = (var15 - var11) / 2;
            ViewportMouse.field1759 = (var14 - var12) / 2;
            class25.field146 = (var17 - var16) / 2;
            MusicPatchPcmStream.field2516 = Math.abs(ViewportMouse.field1758);
            class7.field35 = Math.abs(ViewportMouse.field1759);
            DynamicObject.field1311 = Math.abs(class25.field146);
         }

         var5 = var0.xMid + var1;
         var6 = var2 + var0.yMid;
         var7 = var3 + var0.zMid;
         var8 = var0.xMidOffset;
         var16 = var0.yMidOffset;
         var17 = var0.zMidOffset;
         var11 = ViewportMouse.field1757 - var5;
         var12 = class8.field45 - var6;
         var13 = class39.field288 - var7;
         if (Math.abs(var11) > var8 + MusicPatchPcmStream.field2516) {
            return false;
         } else if (Math.abs(var12) > var16 + class7.field35) {
            return false;
         } else if (Math.abs(var13) > var17 + DynamicObject.field1311) {
            return false;
         } else if (Math.abs(var13 * ViewportMouse.field1759 - var12 * class25.field146) > var16 * DynamicObject.field1311 + var17 * class7.field35) {
            return false;
         } else if (Math.abs(var11 * class25.field146 - var13 * ViewportMouse.field1758) > var8 * DynamicObject.field1311 + var17 * MusicPatchPcmStream.field2516) {
            return false;
         } else {
            return Math.abs(var12 * ViewportMouse.field1758 - var11 * ViewportMouse.field1759) <= var8 * class7.field35 + var16 * MusicPatchPcmStream.field2516;
         }
      }
   }

   @ObfuscatedName("kv")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1984621095"
   )
   static void method496(int var0) {
      Client.oculusOrbState = var0;
   }
}
