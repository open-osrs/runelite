import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("ModelData0")
public class ModelData0 {
   @ObfuscatedName("ib")
   @ObfuscatedGetter(
      intValue = -1948740643
   )
   static int field1882;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkd;II)V",
      garbageValue = "-1780574680"
   )
   @Export("updatePlayers")
   static final void updatePlayers(PacketBuffer var0, int var1) {
      int var2 = var0.offset;
      Players.Players_pendingUpdateCount = 0;
      WorldMapDecoration.method404(var0);
      MusicPatch.method4095(var0);
      if (var0.offset - var2 != var1) {
         throw new RuntimeException(var0.offset - var2 + " " + var1);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "([BIIII[Lfe;I)V",
      garbageValue = "255234267"
   )
   static final void method3411(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
      int var7;
      int var8;
      for(int var6 = 0; var6 < 4; ++var6) {
         for(var7 = 0; var7 < 64; ++var7) {
            for(var8 = 0; var8 < 64; ++var8) {
               if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) {
                  var5[var6].flags[var7 + var1][var8 + var2] &= -16777217;
               }
            }
         }
      }

      Buffer var10 = new Buffer(var0);

      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(int var9 = 0; var9 < 64; ++var9) {
               KeyHandler.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0);
            }
         }
      }

   }
}
