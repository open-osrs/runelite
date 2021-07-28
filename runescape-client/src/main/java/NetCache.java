import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1518348987
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -6196624692712558443L
	)
	public static long field3596;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 339430119
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -181649067
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("NetCache_pendingWrites")
	static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1394799651
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1172502871
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2062741245
	)
	public static int field3608;
	@ObfuscatedName("c")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("NetCache_reference")
	public static Buffer NetCache_reference;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Ljs;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("b")
	public static byte field3612;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1207728323
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 461247647
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
		field3608 = 0;
		NetCache_crc = new CRC32();
		NetCache_archives = new Archive[256];
		field3612 = 0;
		NetCache_crcMismatches = 0;
		NetCache_ioExceptions = 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-2098377035"
	)
	public static int method5088(CharSequence var0) {
		return ScriptFrame.method852(var0, 10, true);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "1812279831"
	)
	static final boolean method5089(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}
}
