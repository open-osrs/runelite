import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("TileItemPile")
public final class TileItemPile {
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 1549080399
   )
   static int field1562;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -208446657
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("v")
   @Export("x")
   int x;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 2010120192
   )
   @Export("y")
   int y;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   @Export("first")
   Entity first;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   @Export("second")
   Entity second;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   @Export("third")
   Entity third;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = -6966472749415094835L
   )
   @Export("tag")
   long tag;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1439885111
   )
   @Export("height")
   int height;

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-81"
   )
   public static void method2938() {
      WorldMapElement.WorldMapElement_cachedSprites.clear();
   }
}
