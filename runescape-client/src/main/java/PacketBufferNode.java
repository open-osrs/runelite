import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "[Lgg;"
   )
   @Export("packetBufferNodes")
   public static PacketBufferNode[] packetBufferNodes;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1583654139
   )
   public static int __gg_u;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   public ClientPacket __m;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1433542775
   )
   public int __f;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   @Export("packetBuffer")
   public PacketBuffer packetBuffer;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2051819203
   )
   public int __w;

   static {
      packetBufferNodes = new PacketBufferNode[300];
      __gg_u = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1987685511"
   )
   public void __f_292() {
      if(__gg_u < packetBufferNodes.length) {
         packetBufferNodes[++__gg_u - 1] = this;
      }
   }

   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      signature = "(Lho;I)Z",
      garbageValue = "-739353556"
   )
   static boolean method3673(Widget var0) {
      return var0.isHidden;
   }
}
