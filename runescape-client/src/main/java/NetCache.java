import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1923542721
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 2465787363820954015L
	)
	public static long field3911;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1981872173
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 765478121
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -24512561
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -871525075
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("h")
	public static boolean field3922;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 373280809
	)
	public static int field3926;
	@ObfuscatedName("d")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lkz;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("g")
	public static byte field3929;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1163414559
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 628378143
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
		field3926 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field3929 = 0; // L: 33
		NetCache_crcMismatches = 0; // L: 34
		NetCache_ioExceptions = 0; // L: 35
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "380033529"
	)
	public static void method5677() {
		ByteArrayPool.field4083.clear(); // L: 43
		ByteArrayPool.field4083.add(100); // L: 44
		ByteArrayPool.field4083.add(5000); // L: 45
		ByteArrayPool.field4083.add(10000); // L: 46
		ByteArrayPool.field4083.add(30000); // L: 47
	} // L: 48

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ljz;III)V",
		garbageValue = "1958547074"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10351
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10352
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10353
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10354
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10355
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10356
		}

		if (var0.yAlignment == 0) { // L: 10357
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10358
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10359
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10360
		} else if (var0.yAlignment == 4) { // L: 10361
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10362
		}

	} // L: 10363
}
