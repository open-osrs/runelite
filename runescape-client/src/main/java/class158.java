import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class158 extends AbstractUserComparator {
      @ObfuscatedName("z")
      final boolean field1973;

      public class158(boolean var1) {
            this.field1973 = var1;
      }

      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "(Ljl;Ljl;I)I",
            garbageValue = "-1443378495"
      )
      int method3394(Buddy var1, Buddy var2) {
            if (var2.rank != var1.rank) {
                  return this.field1973 ? var1.rank - var2.rank : var2.rank - var1.rank;
            } else {
                  return this.compareUser(var1, var2);
            }
      }

      public int compare(Object var1, Object var2) {
            return this.method3394((Buddy)var1, (Buddy)var2);
      }

      @ObfuscatedName("hs")
      @ObfuscatedSignature(
            signature = "(B)I",
            garbageValue = "96"
      )
      @Export("getNewestMenuIdx")
      static final int getNewestMenuIdx() {
            return Client.menuOptionsCount - 1;
      }
}
