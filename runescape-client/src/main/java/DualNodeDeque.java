import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("DualNodeDeque")
public final class DualNodeDeque {
      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "Lfw;"
      )
      @Export("sentinel")
      DualNode sentinel = new DualNode();

      public DualNodeDeque() {
            this.sentinel.previousDual = this.sentinel;
            this.sentinel.nextDual = this.sentinel;
      }

      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "(Lfw;)V"
      )
      @Export("addFirst")
      public void addFirst(DualNode var1) {
            if (var1.nextDual != null) {
                  var1.removeDual();
            }

            var1.nextDual = this.sentinel.nextDual;
            var1.previousDual = this.sentinel;
            var1.nextDual.previousDual = var1;
            var1.previousDual.nextDual = var1;
      }

      @ObfuscatedName("n")
      @ObfuscatedSignature(
            signature = "(Lfw;)V"
      )
      @Export("addLast")
      public void addLast(DualNode var1) {
            if (var1.nextDual != null) {
                  var1.removeDual();
            }

            var1.nextDual = this.sentinel;
            var1.previousDual = this.sentinel.previousDual;
            var1.nextDual.previousDual = var1;
            var1.previousDual.nextDual = var1;
      }

      @ObfuscatedName("v")
      @ObfuscatedSignature(
            signature = "()Lfw;"
      )
      @Export("removeLast")
      public DualNode removeLast() {
            DualNode var1 = this.sentinel.previousDual;
            return var1 == this.sentinel ? null : var1;
      }
}
