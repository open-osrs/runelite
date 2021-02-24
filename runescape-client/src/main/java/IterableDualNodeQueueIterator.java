import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("IterableDualNodeQueueIterator")
public class IterableDualNodeQueueIterator implements Iterator {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   @Export("queue")
   IterableDualNodeQueue queue;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lgj;"
   )
   @Export("head")
   DualNode head;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lgj;"
   )
   @Export("last")
   DualNode last = null;

   @ObfuscatedSignature(
      descriptor = "(Ljf;)V"
   )
   IterableDualNodeQueueIterator(IterableDualNodeQueue var1) {
      this.queue = var1;
      this.head = this.queue.sentinel.previousDual;
      this.last = null;
   }

   public Object next() {
      DualNode var1 = this.head;
      if (var1 == this.queue.sentinel) {
         var1 = null;
         this.head = null;
      } else {
         this.head = var1.previousDual;
      }

      this.last = var1;
      return var1;
   }

   public void remove() {
      this.last.removeDual();
      this.last = null;
   }

   public boolean hasNext() {
      return this.queue.sentinel != this.head;
   }
}
