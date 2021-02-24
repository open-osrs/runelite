import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("WidgetFillMode")
@ObfuscatedName("lp")
public enum WidgetFillMode implements Enumerated {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   @Export("SOLID")
   SOLID(0, 0),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   field3896(1, 1),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   field3897(2, 2);

   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 981795357
   )
   public final int field3898;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1459508057
   )
   final int field3895;

   WidgetFillMode(int var3, int var4) {
      this.field3898 = var3;
      this.field3895 = var4;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "63"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field3895;
   }
}
