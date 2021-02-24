import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lei;"
   )
   @Export("World_request")
   static UrlRequest World_request;
   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      descriptor = "Lbk;"
   )
   @Export("localPlayer")
   static Player localPlayer;
   @ObfuscatedName("n")
   @Export("reversed")
   final boolean reversed;

   public UserComparator9(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lky;Lky;B)I",
      garbageValue = "53"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (Client.worldId == var1.world && var2.world == Client.worldId) {
         return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;Lig;I)V",
      garbageValue = "-1134565802"
   )
   public static void method3562(AbstractArchive var0, AbstractArchive var1) {
      HealthBarDefinition.HealthBarDefinition_archive = var0;
      HealthBarDefinition.HitSplatDefinition_spritesArchive = var1;
   }
}
