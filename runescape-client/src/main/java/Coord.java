import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("Coord")
public class Coord {
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 503621925
   )
   @Export("plane")
   public int plane;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1225620013
   )
   @Export("x")
   public int x;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 154740833
   )
   @Export("y")
   public int y;

   @ObfuscatedSignature(
      signature = "(Lhu;)V"
   )
   public Coord(Coord copy) {
      this.plane = copy.plane;
      this.x = copy.x;
      this.y = copy.y;
   }

   public Coord(int plane, int x, int y) {
      this.plane = plane;
      this.x = x;
      this.y = y;
   }

   public Coord(int packed) {
      if (packed == -1) {
         this.plane = -1;
      } else {
         this.plane = packed >> 28 & 3;
         this.x = packed >> 14 & 16383;
         this.y = packed & 16383;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1645833361"
   )
   @Export("packed")
   public int packed() {
      return this.plane << 28 | this.x << 14 | this.y;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lhu;B)Z",
      garbageValue = "-1"
   )
   @Export("equalsCoord")
   boolean equalsCoord(Coord other) {
      return this.plane != other.plane ? false : (this.x != other.x ? false : this.y == other.y);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "997364398"
   )
   @Export("toString")
   String toString(String separator) {
      return this.plane + separator + (this.x >> 6) + separator + (this.y >> 6) + separator + (this.x & 63) + separator + (this.y & 63);
   }

   public boolean equals(Object var1) {
      return this == var1 ? true : (!(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1));
   }

   public int hashCode() {
      return this.packed();
   }

   public String toString() {
      return this.toString(",");
   }
}
