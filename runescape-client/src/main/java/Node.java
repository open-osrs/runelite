import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("Node")
public class Node {
   @ObfuscatedName("cm")
   @Export("key")
   public long key;
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   @Export("previous")
   public Node previous;
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   @Export("next")
   public Node next;

   @ObfuscatedName("ea")
   @Export("remove")
   public void remove() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }

   @ObfuscatedName("eu")
   @Export("hasNext")
   public boolean hasNext() {
      return this.next != null;
   }
}
