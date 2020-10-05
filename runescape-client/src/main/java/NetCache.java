import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class NetCache {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 570306795
	)
	static int NetCache_loadTime;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -7527120128916335365L
	)
	static long field3195;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1894418175
	)
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 994594523
	)
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1420450011
	)
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1710151389
	)
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -657334189
	)
	static int field3205;
	@ObfuscatedName("v")
	static CRC32 NetCache_crc;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Liw;"
	)
	static Archive[] NetCache_archives;
	@ObfuscatedName("u")
	static byte field3208;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 888421105
	)
	public static int NetCache_crcMismatches;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1735021825
	)
	public static int NetCache_ioExceptions;

	static {
		NetCache_loadTime = 0; // L: 13
		NetCache_pendingPriorityWrites = new NodeHashTable(4096); // L: 15
		NetCache_pendingPriorityWritesCount = 0; // L: 16
		NetCache_pendingPriorityResponses = new NodeHashTable(32); // L: 17
		NetCache_pendingPriorityResponsesCount = 0; // L: 18
		NetCache_pendingWritesQueue = new DualNodeDeque(); // L: 19
		NetCache_pendingWrites = new NodeHashTable(4096); // L: 20
		NetCache_pendingWritesCount = 0; // L: 21
		NetCache_pendingResponses = new NodeHashTable(4096); // L: 22
		NetCache_pendingResponsesCount = 0; // L: 23
		NetCache_responseHeaderBuffer = new Buffer(8); // L: 26
		field3205 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field3208 = 0; // L: 33
		NetCache_crcMismatches = 0; // L: 34
		NetCache_ioExceptions = 0; // L: 35
	}
}
