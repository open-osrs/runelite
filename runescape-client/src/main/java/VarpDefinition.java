import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static AbstractIndexCache field943;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 510774535
   )
   public static int field944;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ler;"
   )
   @Export("VarpDefinition_cached")
   public static EvictingDualNodeHashTable VarpDefinition_cached;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1792568421
   )
   @Export("type")
   public int type;

   VarpDefinition() {
      this.type = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgr;B)V",
      garbageValue = "-41"
   )
   @Export("read")
   void read(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.readNext(var1, var2);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgr;II)V",
      garbageValue = "-1859920822"
   )
   @Export("readNext")
   void readNext(Buffer var1, int var2) {
      if (var2 == 5) {
         this.type = var1.method43();
      }

   }

   static {
      VarpDefinition_cached = new EvictingDualNodeHashTable(64);
   }
}
