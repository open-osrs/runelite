import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("Ignored")
public class Ignored extends User {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1743470609
   )
   @Export("id")
   int id;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lke;I)I",
      garbageValue = "1892855432"
   )
   @Export("compareTo_ignored")
   int compareTo_ignored(Ignored var1) {
      return this.id - var1.id;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljn;I)I",
      garbageValue = "642739557"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.compareTo_ignored((Ignored)var1);
   }

   public int compareTo(Object var1) {
      return this.compareTo_ignored((Ignored)var1);
   }
}
