import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("NetCache")
public class NetCache {
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 2069303121
   )
   @Export("NetCache_loadTime")
   public static int NetCache_loadTime = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      longValue = 5972391004989116827L
   )
   public static long field3222;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("NetCache_pendingPriorityWrites")
   public static NodeHashTable NetCache_pendingPriorityWrites = new NodeHashTable(4096);
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1443113315
   )
   @Export("NetCache_pendingPriorityWritesCount")
   public static int NetCache_pendingPriorityWritesCount = 0;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("NetCache_pendingPriorityResponses")
   public static NodeHashTable NetCache_pendingPriorityResponses = new NodeHashTable(32);
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1708401617
   )
   @Export("NetCache_pendingPriorityResponsesCount")
   public static int NetCache_pendingPriorityResponsesCount = 0;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljd;"
   )
   @Export("NetCache_pendingWritesQueue")
   public static DualNodeDeque NetCache_pendingWritesQueue = new DualNodeDeque();
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("NetCache_pendingWrites")
   public static NodeHashTable NetCache_pendingWrites = new NodeHashTable(4096);
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -767239881
   )
   @Export("NetCache_pendingWritesCount")
   public static int NetCache_pendingWritesCount = 0;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("NetCache_pendingResponses")
   public static NodeHashTable NetCache_pendingResponses = new NodeHashTable(4096);
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -462830745
   )
   @Export("NetCache_pendingResponsesCount")
   public static int NetCache_pendingResponsesCount = 0;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lkx;"
   )
   @Export("NetCache_responseHeaderBuffer")
   public static Buffer NetCache_responseHeaderBuffer = new Buffer(8);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lkx;"
   )
   @Export("NetCache_responseArchiveBuffer")
   public static Buffer NetCache_responseArchiveBuffer;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1342919903
   )
   public static int field3219 = 0;
   @ObfuscatedName("g")
   @Export("NetCache_crc")
   public static CRC32 NetCache_crc = new CRC32();
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "[Liy;"
   )
   @Export("NetCache_archives")
   public static Archive[] NetCache_archives = new Archive[256];
   @ObfuscatedName("p")
   public static byte field3213 = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 26880845
   )
   @Export("NetCache_crcMismatches")
   public static int NetCache_crcMismatches = 0;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 953608549
   )
   @Export("NetCache_ioExceptions")
   public static int NetCache_ioExceptions = 0;
   @ObfuscatedName("gz")
   @ObfuscatedGetter(
      intValue = -128407789
   )
   @Export("baseY")
   static int baseY;
}
