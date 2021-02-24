import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("Bounds")
public class Bounds {
   @ObfuscatedName("e")
   @Export("ItemDefinition_inMembersWorld")
   public static boolean ItemDefinition_inMembersWorld;
   @ObfuscatedName("gs")
   @Export("xteaKeys")
   static int[][] xteaKeys;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1970300391
   )
   @Export("lowX")
   public int lowX;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -2105661203
   )
   @Export("lowY")
   public int lowY;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1049215037
   )
   @Export("highX")
   public int highX;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1664972525
   )
   @Export("highY")
   public int highY;

   public Bounds(int var1, int var2, int var3, int var4) {
      this.setLow(var1, var2);
      this.setHigh(var3, var4);
   }

   public Bounds(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-91"
   )
   @Export("setLow")
   public void setLow(int var1, int var2) {
      this.lowX = var1;
      this.lowY = var2;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "82"
   )
   @Export("setHigh")
   public void setHigh(int var1, int var2) {
      this.highX = var1;
      this.highY = var2;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lli;Lli;B)V",
      garbageValue = "16"
   )
   public void method6182(Bounds var1, Bounds var2) {
      this.method6193(var1, var2);
      this.method6179(var1, var2);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lli;Lli;I)V",
      garbageValue = "102469843"
   )
   void method6193(Bounds var1, Bounds var2) {
      var2.lowX = this.lowX;
      var2.highX = this.highX;
      if (this.lowX < var1.lowX) {
         var2.highX -= var1.lowX - this.lowX;
         var2.lowX = var1.lowX;
      }

      if (var2.method6185() > var1.method6185()) {
         var2.highX -= var2.method6185() - var1.method6185();
      }

      if (var2.highX < 0) {
         var2.highX = 0;
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lli;Lli;I)V",
      garbageValue = "1821841742"
   )
   void method6179(Bounds var1, Bounds var2) {
      var2.lowY = this.lowY;
      var2.highY = this.highY;
      if (this.lowY < var1.lowY) {
         var2.highY -= var1.lowY - this.lowY;
         var2.lowY = var1.lowY;
      }

      if (var2.method6186() > var1.method6186()) {
         var2.highY -= var2.method6186() - var1.method6186();
      }

      if (var2.highY < 0) {
         var2.highY = 0;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "16777215"
   )
   int method6185() {
      return this.highX + this.lowX;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "57"
   )
   int method6186() {
      return this.highY + this.lowY;
   }

   public String toString() {
      return null;
   }
}
