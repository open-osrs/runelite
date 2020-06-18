import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Llj;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1369664309
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lle;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -357267319
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lle;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1385595783
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ljd;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lle;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2008436555
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lle;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 764472147
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("c")
	public static boolean field3208;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lkn;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -534324197
	)
	public static int field3214;
	@ObfuscatedName("d")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "[Lig;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("t")
	public static byte field3213;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1163120283
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1725551387
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
		field3214 = 0;
		NetCache_crc = new CRC32();
		NetCache_archives = new Archive[256];
		field3213 = 0;
		NetCache_crcMismatches = 0;
		NetCache_ioExceptions = 0;
	}
}
