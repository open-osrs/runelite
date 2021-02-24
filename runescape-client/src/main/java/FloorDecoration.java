import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("FloorDecoration")
public final class FloorDecoration {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1598532417
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 142791141
   )
   @Export("x")
   int x;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 319839389
   )
   @Export("y")
   int y;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   @Export("entity")
   public Entity entity;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      longValue = 5699265069963851797L
   )
   @Export("tag")
   public long tag;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -641786975
   )
   @Export("flags")
   int flags;
}
