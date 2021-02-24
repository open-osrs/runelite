import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   @Export("sentinel")
   Node sentinel = new Node();
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   Node field3568;

   public IterableNodeDeque() {
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

   @ObfuscatedName("n")
   @Export("rsClear")
   public void rsClear() {
      while(this.sentinel.previous != this.sentinel) {
         this.sentinel.previous.remove();
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lga;)V"
   )
   @Export("addFirst")
   public void addFirst(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lga;)V"
   )
   @Export("addLast")
   public void addLast(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel;
      var1.previous = this.sentinel.previous;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "()Lga;"
   )
   @Export("last")
   public Node last() {
      return this.method5062((Node)null);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lga;)Lga;"
   )
   Node method5062(Node var1) {
      Node var2;
      if (var1 == null) {
         var2 = this.sentinel.previous;
      } else {
         var2 = var1;
      }

      if (var2 == this.sentinel) {
         this.field3568 = null;
         return null;
      } else {
         this.field3568 = var2.previous;
         return var2;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "()Lga;"
   )
   @Export("previous")
   public Node previous() {
      Node var1 = this.field3568;
      if (var1 == this.sentinel) {
         this.field3568 = null;
         return null;
      } else {
         this.field3568 = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("e")
   int method5063() {
      int var1 = 0;

      for(Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
         ++var1;
      }

      return var1;
   }

   @ObfuscatedName("q")
   public boolean method5064() {
      return this.sentinel.previous == this.sentinel;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "()[Lga;"
   )
   Node[] method5034() {
      Node[] var1 = new Node[this.method5063()];
      int var2 = 0;

      for(Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lga;)Z"
   )
   boolean method5037(Node var1) {
      this.addFirst(var1);
      return true;
   }

   public Iterator iterator() {
      return new IterableNodeDequeDescendingIterator(this);
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.method5034();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int hashCode() {
      return super.hashCode();
   }

   public int size() {
      return this.method5063();
   }

   public boolean add(Object var1) {
      return this.method5037((Node)var1);
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean isEmpty() {
      return this.method5064();
   }

   public void clear() {
      this.rsClear();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lga;Lga;)V"
   )
   @Export("IterableNodeDeque_addBefore")
   public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
      if (var0.next != null) {
         var0.remove();
      }

      var0.next = var1;
      var0.previous = var1.previous;
      var0.next.previous = var0;
      var0.previous.next = var0;
   }
}
