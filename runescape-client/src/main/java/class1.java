import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
final class class1 implements class0 {
   @ObfuscatedName("v")
   @Export("localPlayerName")
   public static String localPlayerName;
   @ObfuscatedName("z")
   static byte[][][] field1;
   @ObfuscatedName("av")
   @Export("client")
   @ObfuscatedSignature(
      descriptor = "Lclient;"
   )
   static Client client;
   @ObfuscatedName("bj")
   @Export("otp")
   static String otp;
   @ObfuscatedName("ex")
   static int[] field5;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lkx;B)V",
      garbageValue = "-41"
   )
   public void vmethod48(Object var1, Buffer var2) {
      this.method6((Integer)var1, var2);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)Ljava/lang/Object;",
      garbageValue = "1678106953"
   )
   public Object vmethod45(Buffer var1) {
      return var1.readInt();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Integer;Lkx;B)V",
      garbageValue = "127"
   )
   void method6(Integer var1, Buffer var2) {
      var2.writeInt(var1);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)[Liu;",
      garbageValue = "1202436859"
   )
   public static GameBuild[] method16() {
      return new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.RC, GameBuild.WIP};
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-116"
   )
   @Export("changeWorldSelectSorting")
   static void changeWorldSelectSorting(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if (World.World_sortOption1[var5] != var0) {
            var2[var4] = World.World_sortOption1[var5];
            var3[var4] = World.World_sortOption2[var5];
            ++var4;
         }
      }

      World.World_sortOption1 = var2;
      World.World_sortOption2 = var3;
      class206.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
   }
}
