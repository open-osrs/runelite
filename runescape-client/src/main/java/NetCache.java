import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("NetCache")
public class NetCache {
      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "Lky;"
      )
      @Export("NetCache_socket")
      static AbstractSocket NetCache_socket;
      @ObfuscatedName("n")
      @ObfuscatedGetter(
            intValue = -76407529
      )
      @Export("NetCache_loadTime")
      static int NetCache_loadTime = 0;
      @ObfuscatedName("v")
      @ObfuscatedGetter(
            longValue = -6661371924416565423L
      )
      static long field3142;
      @ObfuscatedName("u")
      @ObfuscatedSignature(
            signature = "Llq;"
      )
      @Export("NetCache_pendingPriorityWrites")
      static NodeHashTable NetCache_pendingPriorityWrites = new NodeHashTable(4096);
      @ObfuscatedName("r")
      @ObfuscatedGetter(
            intValue = 2004934077
      )
      @Export("NetCache_pendingPriorityWritesCount")
      static int NetCache_pendingPriorityWritesCount = 0;
      @ObfuscatedName("p")
      @ObfuscatedSignature(
            signature = "Llq;"
      )
      @Export("NetCache_pendingPriorityResponses")
      static NodeHashTable NetCache_pendingPriorityResponses = new NodeHashTable(32);
      @ObfuscatedName("q")
      @ObfuscatedGetter(
            intValue = 1183889597
      )
      @Export("NetCache_pendingPriorityResponsesCount")
      static int NetCache_pendingPriorityResponsesCount = 0;
      @ObfuscatedName("m")
      @ObfuscatedSignature(
            signature = "Lic;"
      )
      @Export("NetCache_pendingWritesQueue")
      static DualNodeDeque NetCache_pendingWritesQueue = new DualNodeDeque();
      @ObfuscatedName("y")
      @ObfuscatedSignature(
            signature = "Llq;"
      )
      @Export("NetCache_pendingWrites")
      static NodeHashTable NetCache_pendingWrites = new NodeHashTable(4096);
      @ObfuscatedName("i")
      @ObfuscatedGetter(
            intValue = 809384467
      )
      @Export("NetCache_pendingWritesCount")
      static int NetCache_pendingWritesCount = 0;
      @ObfuscatedName("c")
      @ObfuscatedSignature(
            signature = "Llq;"
      )
      @Export("NetCache_pendingResponses")
      static NodeHashTable NetCache_pendingResponses = new NodeHashTable(4096);
      @ObfuscatedName("b")
      @ObfuscatedGetter(
            intValue = 1880332209
      )
      @Export("NetCache_pendingResponsesCount")
      static int NetCache_pendingResponsesCount = 0;
      @ObfuscatedName("e")
      @ObfuscatedSignature(
            signature = "Lkl;"
      )
      @Export("NetCache_responseHeaderBuffer")
      static Buffer NetCache_responseHeaderBuffer = new Buffer(8);
      @ObfuscatedName("t")
      @ObfuscatedGetter(
            intValue = 361699237
      )
      static int field3140 = 0;
      @ObfuscatedName("x")
      @Export("NetCache_crc")
      static CRC32 NetCache_crc = new CRC32();
      @ObfuscatedName("s")
      @ObfuscatedSignature(
            signature = "[Lie;"
      )
      @Export("NetCache_archives")
      static Archive[] NetCache_archives = new Archive[256];
      @ObfuscatedName("f")
      static byte field3156 = 0;
      @ObfuscatedName("j")
      @ObfuscatedGetter(
            intValue = 2096105199
      )
      @Export("NetCache_crcMismatches")
      public static int NetCache_crcMismatches = 0;
      @ObfuscatedName("d")
      @ObfuscatedGetter(
            intValue = -703948451
      )
      @Export("NetCache_ioExceptions")
      public static int NetCache_ioExceptions = 0;

      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "(IIS)Z",
            garbageValue = "20573"
      )
      static boolean method4284(int var0, int var1) {
            return var0 != 4 || var1 < 8;
      }

      @ObfuscatedName("jk")
      @ObfuscatedSignature(
            signature = "(Ljava/lang/String;B)V",
            garbageValue = "-108"
      )
      @Export("clanKickUser")
      static final void clanKickUser(String var0) {
            if (Varps.clanChat != null) {
                  PacketBufferNode var1 = InterfaceParent.getPacketBufferNode(ClientPacket.field2215, Client.packetWriter.isaacCipher);
                  var1.packetBuffer.writeByte(class268.stringCp1252NullTerminatedByteSize(var0));
                  var1.packetBuffer.writeStringCp1252NullTerminated(var0);
                  Client.packetWriter.addNode(var1);
            }
      }

      @ObfuscatedName("kl")
      @ObfuscatedSignature(
            signature = "(IB)V",
            garbageValue = "-101"
      )
      static void method4267(int var0) {
            Client.oculusOrbState = var0;
      }
}
