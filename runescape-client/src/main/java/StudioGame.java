import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("StudioGame")
public enum StudioGame implements Enumerated {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("runescape")
   runescape("runescape", "RuneScape", 0),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("stellardawn")
   stellardawn("stellardawn", "Stellar Dawn", 1),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("game3")
   game3("game3", "Game 3", 2),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("game4")
   game4("game4", "Game 4", 3),
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("game5")
   game5("game5", "Game 5", 4),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lim;"
   )
   @Export("oldscape")
   oldscape("oldscape", "RuneScape 2007", 5);

   @ObfuscatedName("z")
   @Export("name")
   public final String name;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1009925305
   )
   @Export("id")
   final int id;

   StudioGame(String var3, String var4, int var5) {
      this.name = var3;
      this.id = var5;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "63"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }
}
