import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1449190645
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 2643126664749175459L
	)
	public static long field4029;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -318837229
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -524738317
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1780049053
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1884264021
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -29686833
	)
	public static int field4027;
	@ObfuscatedName("l")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Llc;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 294807501
	)
	static int field4031;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1367817673
	)
	static int field4032;
	@ObfuscatedName("o")
	public static byte field4033;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1326647825
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1616448373
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = -1436839649
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

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
		field4027 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field4031 = -1; // L: 33
		field4032 = 255; // L: 34
		field4033 = 0; // L: 35
		NetCache_crcMismatches = 0; // L: 36
		NetCache_ioExceptions = 0; // L: 37
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "140433559"
	)
	public static String method5952(CharSequence var0) {
		int var2 = var0.length(); // L: 187
		char[] var3 = new char[var2]; // L: 189

		for (int var4 = 0; var4 < var2; ++var4) { // L: 190
			var3[var4] = '*';
		}

		String var1 = new String(var3); // L: 191
		return var1; // L: 193
	}
}
