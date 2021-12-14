import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1178341403
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 636484149
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2078228991
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 763623423
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -253277095
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1635877227
	)
	public static int field3863;
	@ObfuscatedName("k")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lkz;"
	)
	@Export("NetCache_archives")
	static Archive[] NetCache_archives;
	@ObfuscatedName("q")
	public static byte field3866;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1421644025
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2029504039
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
		field3863 = 0;
		NetCache_crc = new CRC32();
		NetCache_archives = new Archive[256];
		field3866 = 0;
		NetCache_crcMismatches = 0;
		NetCache_ioExceptions = 0;
	}
}
