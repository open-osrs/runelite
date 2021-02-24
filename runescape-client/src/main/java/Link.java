import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("Link")
public class Link {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lgm;"
   )
   @Export("previous")
   public Link previous;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lgm;"
   )
   @Export("next")
   public Link next;

   @ObfuscatedName("n")
   @Export("remove")
   public void remove() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }
}
