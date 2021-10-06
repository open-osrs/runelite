import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -639284241
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -8014822856304325521L
	)
	public static long field3715;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -729381363
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 519470009
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("NetCache_pendingWrites")
	static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1002321909
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 958917169
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -358118347
	)
	public static int field3726;
	@ObfuscatedName("p")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lky;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("o")
	public static byte field3724;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -240410497
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -720954157
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;

	static {
		NetCache_loadTime = 0;
		NetCache_pendingPriorityWrites = new NodeHashTable(4096);
		NetCache_pendingPriorityWritesCount = 0;
		NetCache_pendingPriorityResponses = new NodeHashTable(32);
		NetCache_pendingPriorityResponsesCount = 0;
		NetCache_pendingWritesQueue = new DualNodeDeque();
		NetCache_pendingWrites = new NodeHashTable(4096);
		NetCache_pendingWritesCount = 0;
		NetCache_pendingResponses = new NodeHashTable(4096);
		NetCache_pendingResponsesCount = 0;
		NetCache_responseHeaderBuffer = new Buffer(8);
		field3726 = 0;
		NetCache_crc = new CRC32();
		NetCache_archives = new Archive[256];
		field3724 = 0;
		NetCache_crcMismatches = 0;
		NetCache_ioExceptions = 0;
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "29415"
	)
	static int method5335(int var0) {
		return var0 * 3 + 600;
	}
}
