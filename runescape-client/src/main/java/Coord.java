import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("Coord")
public class Coord {
   @ObfuscatedName("q")
   static int[] field2560;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1010419141
   )
   @Export("plane")
   public int plane;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1636543291
   )
   @Export("x")
   public int x;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1486415971
   )
   @Export("y")
   public int y;

   @ObfuscatedSignature(
      descriptor = "(Lhd;)V"
   )
   public Coord(Coord var1) {
      this.plane = var1.plane;
      this.x = var1.x;
      this.y = var1.y;
   }

   public Coord(int var1, int var2, int var3) {
      this.plane = var1;
      this.x = var2;
      this.y = var3;
   }

   public Coord(int var1) {
      if (var1 == -1) {
         this.plane = -1;
      } else {
         this.plane = var1 >> 28 & 3;
         this.x = var1 >> 14 & 16383;
         this.y = var1 & 16383;
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "71745539"
   )
   @Export("packed")
   public int packed() {
      return this.plane << 28 | this.x << 14 | this.y;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lhd;S)Z",
      garbageValue = "144"
   )
   @Export("equalsCoord")
   boolean equalsCoord(Coord var1) {
      if (this.plane != var1.plane) {
         return false;
      } else if (this.x != var1.x) {
         return false;
      } else {
         return this.y == var1.y;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "31"
   )
   @Export("toString")
   String toString(String var1) {
      return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
      }
   }

   public int hashCode() {
      return this.packed();
   }

   public String toString() {
      return this.toString(",");
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1310695522"
   )
   @Export("iLog")
   public static int iLog(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }
}
