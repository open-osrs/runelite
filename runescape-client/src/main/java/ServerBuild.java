import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("ServerBuild")
public class ServerBuild {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Liy;"
   )
   public static final ServerBuild __iy_m;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Liy;"
   )
   public static final ServerBuild __iy_f;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Liy;"
   )
   public static final ServerBuild __iy_q;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liy;"
   )
   public static final ServerBuild __iy_w;
   @ObfuscatedName("bx")
   @Export("worldsUrl")
   static String worldsUrl;
   @ObfuscatedName("lo")
   @ObfuscatedGetter(
      intValue = -365366303
   )
   static int __iy_lo;
   @ObfuscatedName("o")
   @Export("name")
   public final String name;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -947415971
   )
   @Export("id")
   public final int id;

   static {
      __iy_m = new ServerBuild("LIVE", 0);
      __iy_f = new ServerBuild("BUILDLIVE", 3);
      __iy_q = new ServerBuild("RC", 1);
      __iy_w = new ServerBuild("WIP", 2);
   }

   ServerBuild(String var1, int var2) {
      this.name = var1;
      this.id = var2;
   }
}
