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
   @Export("PacketBufferNode_packetBufferNodes")
   public static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1583654139
   )
   @Export("PacketBufferNode_packetBufferNodeCount")
   public static int PacketBufferNode_packetBufferNodeCount;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   @Export("clientPacket")
   public ClientPacket clientPacket;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1433542775
   )
   @Export("clientPacketLength")
   public int clientPacketLength;
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
   @Export("index")
   public int index;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1987685511"
   )
   public void method238() {
      if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
         PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
      }

   }

   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      signature = "(Lho;I)Z",
      garbageValue = "-739353556"
   )
   @Export("isComponentHidden")
   static boolean isComponentHidden(Widget component) {
      return component.isHidden;
   }

   static {
      PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
      PacketBufferNode_packetBufferNodeCount = 0;
   }
}
