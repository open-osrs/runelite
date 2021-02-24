import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 272461805
   )
   public int field3676 = (int)(Tiles.currentTimeMillis() / 1000L);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lkk;"
   )
   @Export("username")
   public Username username;
   @ObfuscatedName("y")
   @Export("world")
   public short world;

   @ObfuscatedSignature(
      descriptor = "(Lkk;I)V"
   )
   FriendLoginUpdate(Username var1, int var2) {
      this.username = var1;
      this.world = (short)var2;
   }
}
