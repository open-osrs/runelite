import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("LinkDeque")
public class LinkDeque {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lgm;"
   )
   @Export("sentinel")
   Link sentinel = new Link();
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lgm;"
   )
   @Export("current")
   Link current;

   public LinkDeque() {
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lgm;)V"
   )
   @Export("addFirst")
   public void addFirst(Link var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "()Lgm;"
   )
   @Export("last")
   public Link last() {
      Link var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "()Lgm;"
   )
   @Export("previous")
   public Link previous() {
      Link var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }
}
