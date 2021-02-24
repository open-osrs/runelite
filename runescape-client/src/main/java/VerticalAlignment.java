import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enumerated {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lie;"
   )
   field3236(0, 0),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lie;"
   )
   @Export("VerticalAlignment_centered")
   VerticalAlignment_centered(2, 1),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lie;"
   )
   field3234(1, 2);

   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -876494083
   )
   @Export("value")
   public final int value;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 405688727
   )
   @Export("id")
   final int id;

   VerticalAlignment(int var3, int var4) {
      this.value = var3;
      this.id = var4;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "63"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }
}
