import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("deque")
   IterableNodeDeque deque;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   Node field3578;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   @Export("last")
   Node last = null;

   @ObfuscatedSignature(
      descriptor = "(Ljv;)V"
   )
   IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
      this.setDeque(var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljv;)V"
   )
   @Export("setDeque")
   void setDeque(IterableNodeDeque var1) {
      this.deque = var1;
      this.start();
   }

   @ObfuscatedName("q")
   @Export("start")
   void start() {
      this.field3578 = this.deque != null ? this.deque.sentinel.previous : null;
      this.last = null;
   }

   public Object next() {
      Node var1 = this.field3578;
      if (var1 == this.deque.sentinel) {
         var1 = null;
         this.field3578 = null;
      } else {
         this.field3578 = var1.previous;
      }

      this.last = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.deque.sentinel != this.field3578;
   }

   public void remove() {
      if (this.last == null) {
         throw new IllegalStateException();
      } else {
         this.last.remove();
         this.last = null;
      }
   }
}
