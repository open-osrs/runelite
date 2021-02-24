import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("AttackOption")
public enum AttackOption implements Enumerated {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lci;"
   )
   @Export("AttackOption_dependsOnCombatLevels")
   AttackOption_dependsOnCombatLevels(0),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lci;"
   )
   @Export("AttackOption_alwaysRightClick")
   AttackOption_alwaysRightClick(1),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lci;"
   )
   @Export("AttackOption_leftClickWhereAvailable")
   AttackOption_leftClickWhereAvailable(2),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lci;"
   )
   @Export("AttackOption_hidden")
   AttackOption_hidden(3);

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lli;"
   )
   static Bounds field1190;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1405127233
   )
   @Export("id")
   final int id;

   AttackOption(int var3) {
      this.id = var3;
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

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIII)J",
      garbageValue = "-265115329"
   )
   static long method2203(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "2128325059"
   )
   static void method2202(int var0, int var1) {
      long var2 = (long)((var0 << 16) + var1);
      NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2);
      if (var4 != null) {
         NetCache.NetCache_pendingWritesQueue.addLast(var4);
      }
   }
}
