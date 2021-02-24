import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ev")
@Implements("Skeleton")
public class Skeleton extends Node {
   @ObfuscatedName("rb")
   @ObfuscatedGetter(
      intValue = -517711137
   )
   static int field1809;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1957617641
   )
   @Export("id")
   int id;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -246210253
   )
   @Export("count")
   int count;
   @ObfuscatedName("d")
   @Export("transformTypes")
   int[] transformTypes;
   @ObfuscatedName("c")
   @Export("labels")
   int[][] labels;

   Skeleton(int var1, byte[] var2) {
      this.id = var1;
      Buffer var3 = new Buffer(var2);
      this.count = var3.readUnsignedByte();
      this.transformTypes = new int[this.count];
      this.labels = new int[this.count][];

      int var4;
      for(var4 = 0; var4 < this.count; ++var4) {
         this.transformTypes[var4] = var3.readUnsignedByte();
      }

      for(var4 = 0; var4 < this.count; ++var4) {
         this.labels[var4] = new int[var3.readUnsignedByte()];
      }

      for(var4 = 0; var4 < this.count; ++var4) {
         for(int var5 = 0; var5 < this.labels[var4].length; ++var5) {
            this.labels[var4][var5] = var3.readUnsignedByte();
         }
      }

   }
}
