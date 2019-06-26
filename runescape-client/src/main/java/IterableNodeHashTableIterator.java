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
   Node __f;
   @ObfuscatedName("q")
   int __q;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   Node __w;

   @ObfuscatedSignature(
      signature = "(Llh;)V"
   )
   IterableNodeHashTableIterator(IterableNodeHashTable var1) {
      this.__w = null;
      this.hashTable = var1;
      this.__u_483();
   }

   @ObfuscatedName("u")
   void __u_483() {
      this.__f = this.hashTable.buckets[0].previous;
      this.__q = 1;
      this.__w = null;
   }

   @Export("next")
   @ObfuscatedName("next")
   public Object next() {
      Node var1;
      if(this.hashTable.buckets[this.__q - 1] != this.__f) {
         var1 = this.__f;
         this.__f = var1.previous;
         this.__w = var1;
         return var1;
      } else {
         do {
            if(this.__q >= this.hashTable.size) {
               return null;
            }

            var1 = this.hashTable.buckets[this.__q++].previous;
         } while(var1 == this.hashTable.buckets[this.__q - 1]);

         this.__f = var1.previous;
         this.__w = var1;
         return var1;
      }
   }

   @Export("hasNext")
   @ObfuscatedName("hasNext")
   public boolean hasNext() {
      if(this.hashTable.buckets[this.__q - 1] != this.__f) {
         return true;
      } else {
         while(this.__q < this.hashTable.size) {
            if(this.hashTable.buckets[this.__q++].previous != this.hashTable.buckets[this.__q - 1]) {
               this.__f = this.hashTable.buckets[this.__q - 1].previous;
               return true;
            }

            this.__f = this.hashTable.buckets[this.__q - 1];
         }

         return false;
      }
   }

   @ObfuscatedName("remove")
   public void __remove_486() {
      if(this.__w == null) {
         throw new IllegalStateException();
      } else {
         this.__w.remove();
         this.__w = null;
      }
   }
}
