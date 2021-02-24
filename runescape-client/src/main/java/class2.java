import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
final class class2 implements class0 {
   @ObfuscatedName("q")
   @Export("SpriteBuffer_pixels")
   public static byte[][] SpriteBuffer_pixels;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ldk;"
   )
   @Export("pcmPlayerProvider")
   public static class108 pcmPlayerProvider;
   @ObfuscatedName("k")
   static int[][][] field12;
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("worldSelectRightSprite")
   static IndexedSprite worldSelectRightSprite;
   @ObfuscatedName("gn")
   @Export("regionLandArchives")
   static byte[][] regionLandArchives;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lkx;B)V",
      garbageValue = "-41"
   )
   public void vmethod48(Object var1, Buffer var2) {
      this.method20((Long)var1, var2);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)Ljava/lang/Object;",
      garbageValue = "1678106953"
   )
   public Object vmethod45(Buffer var1) {
      return var1.readLong();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Long;Lkx;I)V",
      garbageValue = "444192974"
   )
   void method20(Long var1, Buffer var2) {
      var2.writeLong(var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZS)I",
      garbageValue = "-27165"
   )
   static int method25(int var0, Script var1, boolean var2) {
      if (var0 != 3700 && var0 != 3701) {
         if (var0 == 3702) {
            ++Interpreter.Interpreter_intStackSize;
            return 1;
         } else {
            return 2;
         }
      } else {
         --Interpreter.Interpreter_intStackSize;
         --Interpreter.Interpreter_stringStackSize;
         return 1;
      }
   }

   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1857096968"
   )
   static void method27() {
      if (SoundSystem.worldMap != null) {
         SoundSystem.worldMap.method6530(class90.Client_plane, GrandExchangeOfferNameComparator.baseX * 64 + (UserComparator9.localPlayer.x >> 7), NetCache.baseY * 64 + (UserComparator9.localPlayer.y >> 7), false);
         SoundSystem.worldMap.loadCache();
      }

   }
}
