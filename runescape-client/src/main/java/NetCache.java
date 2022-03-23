import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -218484267
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 2715459608811227853L
	)
	public static long field3976;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1619207221
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -447894711
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 494273937
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 988805017
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -315371955
	)
	public static int field3990;
	@ObfuscatedName("a")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Llu;"
	)
	@Export("NetCache_archives")
	static Archive[] NetCache_archives;
	@ObfuscatedName("y")
	public static byte field3999;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1125875511
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1768770895
	)
	@Export("NetCache_ioExceptions")
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
		field3990 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field3999 = 0; // L: 33
		NetCache_crcMismatches = 0; // L: 34
		NetCache_ioExceptions = 0; // L: 35
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	static void method5988() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "27"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 600
		if (PendingSpawn.garbageCollector == null || !PendingSpawn.garbageCollector.isValid()) { // L: 601
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 603

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 604
					if (var2.isValid()) { // L: 606
						PendingSpawn.garbageCollector = var2; // L: 607
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 608
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 609
					}
				}
			} catch (Throwable var11) { // L: 614
			}
		}

		if (PendingSpawn.garbageCollector != null) { // L: 616
			long var9 = WorldMapSprite.method4989(); // L: 617
			long var3 = PendingSpawn.garbageCollector.getCollectionTime(); // L: 618
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 619
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 620
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 621
				if (var7 != 0L) { // L: 622
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 624
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 625
		}

		return var0; // L: 627
	}
}
