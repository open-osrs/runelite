import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("IsaacCipher")
public final class IsaacCipher {
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1316013603
   )
   @Export("valuesRemaining")
   int valuesRemaining;
   @ObfuscatedName("y")
   @Export("results")
   int[] results = new int[256];
   @ObfuscatedName("h")
   @Export("mm")
   int[] mm = new int[256];
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 901564777
   )
   @Export("aa")
   int aa;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1322054545
   )
   @Export("bb")
   int bb;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1647465607
   )
   @Export("cc")
   int cc;

   public IsaacCipher(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.results[var2] = var1[var2];
      }

      this.method6466();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "105"
   )
   @Export("nextInt")
   public final int nextInt() {
      if (this.valuesRemaining == 0) {
         this.generateMoreResults();
         this.valuesRemaining = 256;
      }

      return this.results[--this.valuesRemaining];
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "600034731"
   )
   public final int method6474() {
      if (this.valuesRemaining == 0) {
         this.generateMoreResults();
         this.valuesRemaining = 256;
      }

      return this.results[this.valuesRemaining - 1];
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2032903481"
   )
   @Export("generateMoreResults")
   final void generateMoreResults() {
      this.bb += ++this.cc;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.mm[var1];
         if ((var1 & 2) == 0) {
            if ((var1 & 1) == 0) {
               this.aa ^= this.aa << 13;
            } else {
               this.aa ^= this.aa >>> 6;
            }
         } else if ((var1 & 1) == 0) {
            this.aa ^= this.aa << 2;
         } else {
            this.aa ^= this.aa >>> 16;
         }

         this.aa += this.mm[var1 + 128 & 255];
         int var3;
         this.mm[var1] = var3 = this.mm[(var2 & 1020) >> 2] + this.aa + this.bb;
         this.results[var1] = this.bb = this.mm[(var3 >> 8 & 1020) >> 2] + var2;
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-852734098"
   )
   final void method6466() {
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.results[var1];
         var3 += this.results[var1 + 1];
         var4 += this.results[var1 + 2];
         var5 += this.results[var1 + 3];
         var6 += this.results[var1 + 4];
         var7 += this.results[var1 + 5];
         var8 += this.results[var1 + 6];
         var9 += this.results[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.mm[var1] = var2;
         this.mm[var1 + 1] = var3;
         this.mm[var1 + 2] = var4;
         this.mm[var1 + 3] = var5;
         this.mm[var1 + 4] = var6;
         this.mm[var1 + 5] = var7;
         this.mm[var1 + 6] = var8;
         this.mm[var1 + 7] = var9;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.mm[var1];
         var3 += this.mm[var1 + 1];
         var4 += this.mm[var1 + 2];
         var5 += this.mm[var1 + 3];
         var6 += this.mm[var1 + 4];
         var7 += this.mm[var1 + 5];
         var8 += this.mm[var1 + 6];
         var9 += this.mm[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.mm[var1] = var2;
         this.mm[var1 + 1] = var3;
         this.mm[var1 + 2] = var4;
         this.mm[var1 + 3] = var5;
         this.mm[var1 + 4] = var6;
         this.mm[var1 + 5] = var7;
         this.mm[var1 + 6] = var8;
         this.mm[var1 + 7] = var9;
      }

      this.generateMoreResults();
      this.valuesRemaining = 256;
   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      descriptor = "(Lhz;S)V",
      garbageValue = "180"
   )
   @Export("invalidateWidget")
   static void invalidateWidget(Widget var0) {
      if (var0.cycle == Client.field868) {
         Client.field816[var0.rootIndex] = true;
      }

   }
}
