import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("IterableNodeHashTableIterator")
public class IterableNodeHashTableIterator implements Iterator {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Llh;"
   )
   @Export("hashTable")
   IterableNodeHashTable hashTable;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   @Export("head")
   Node head;
   @ObfuscatedName("q")
   @Export("index")
   int index;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   @Export("last")
   Node last;

   @ObfuscatedSignature(
      signature = "(Llh;)V"
   )
   IterableNodeHashTableIterator(IterableNodeHashTable var1) {
      this.last = null;
      this.hashTable = var1;
      this.start();
   }

   @ObfuscatedName("u")
   @Export("start")
   void start() {
      this.head = this.hashTable.buckets[0].previous;
      this.index = 1;
      this.last = null;
   }

   @Export("next")
   @ObfuscatedName("next")
   public Object next() {
      Node var1;
      if (this.hashTable.buckets[this.index - 1] != this.head) {
         var1 = this.head;
         this.head = var1.previous;
         this.last = var1;
         return var1;
      } else {
         while (this.index < this.hashTable.size) {
            var1 = this.hashTable.buckets[this.index++].previous;
            if (var1 != this.hashTable.buckets[this.index - 1]) {
               this.head = var1.previous;
               this.last = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @Export("hasNext")
   @ObfuscatedName("hasNext")
   public boolean hasNext() {
      if (this.hashTable.buckets[this.index - 1] != this.head) {
         return true;
      } else {
         while (this.index < this.hashTable.size) {
            if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) {
               this.head = this.hashTable.buckets[this.index - 1].previous;
               return true;
            }

            this.head = this.hashTable.buckets[this.index - 1];
         }

         return false;
      }
   }

   @ObfuscatedName("remove")
   @Export("remove")
   public void remove() {
      if (this.last == null) {
         throw new IllegalStateException();
      } else {
         this.last.remove();
         this.last = null;
      }
   }
}
