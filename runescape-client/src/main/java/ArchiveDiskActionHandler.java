import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1765623667
	)
	public static int field3176;
	@ObfuscatedName("m")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3176 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 43
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 44
				} // L: 45

				if (var1 != null) { // L: 46
					if (var1.type == 0) { // L: 47
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 48
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 49
							var1.remove(); // L: 50
						} // L: 51
					} else if (var1.type == 1) { // L: 53
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 54
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 55
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 56
						} // L: 57
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 59
						if (field3176 <= 1) { // L: 60
							field3176 = 0; // L: 61
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 62
							return; // L: 63
						}

						field3176 = 600; // L: 65
					}
				} else {
					WorldMapSection3.sleepExact(100L); // L: 69
					synchronized(ArchiveDiskActionHandler_lock) { // L: 70
						if (field3176 <= 1) { // L: 71
							field3176 = 0; // L: 72
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 73
							return; // L: 74
						}

						--field3176; // L: 76
					}
				}
			}
		} catch (Exception var13) { // L: 81
			PacketWriter.RunException_sendStackTrace((String)null, var13); // L: 82
		}
	} // L: 84

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lgw;",
		garbageValue = "0"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2215, ServerPacket.field2202, ServerPacket.field2175, ServerPacket.field2145, ServerPacket.field2146, ServerPacket.field2147, ServerPacket.field2148, ServerPacket.field2142, ServerPacket.field2150, ServerPacket.field2218, ServerPacket.field2152, ServerPacket.field2178, ServerPacket.field2154, ServerPacket.field2155, ServerPacket.field2156, ServerPacket.field2170, ServerPacket.field2158, ServerPacket.field2159, ServerPacket.field2160, ServerPacket.field2161, ServerPacket.field2162, ServerPacket.field2163, ServerPacket.field2149, ServerPacket.field2186, ServerPacket.field2166, ServerPacket.field2153, ServerPacket.field2168, ServerPacket.field2197, ServerPacket.field2144, ServerPacket.field2171, ServerPacket.field2172, ServerPacket.field2173, ServerPacket.field2174, ServerPacket.field2165, ServerPacket.field2176, ServerPacket.field2177, ServerPacket.field2200, ServerPacket.field2179, ServerPacket.field2180, ServerPacket.field2181, ServerPacket.field2182, ServerPacket.field2183, ServerPacket.field2227, ServerPacket.field2185, ServerPacket.field2221, ServerPacket.field2190, ServerPacket.field2167, ServerPacket.field2199, ServerPacket.field2211, ServerPacket.field2191, ServerPacket.field2187, ServerPacket.field2193, ServerPacket.field2194, ServerPacket.field2195, ServerPacket.field2196, ServerPacket.field2220, ServerPacket.field2198, ServerPacket.field2219, ServerPacket.field2143, ServerPacket.field2201, ServerPacket.field2216, ServerPacket.field2203, ServerPacket.field2204, ServerPacket.field2205, ServerPacket.field2206, ServerPacket.field2207, ServerPacket.field2188, ServerPacket.field2209, ServerPacket.field2210, ServerPacket.field2230, ServerPacket.field2212, ServerPacket.field2213, ServerPacket.field2214, ServerPacket.field2189, ServerPacket.field2151, ServerPacket.field2217, ServerPacket.field2192, ServerPacket.field2157, ServerPacket.field2164, ServerPacket.field2184, ServerPacket.field2222, ServerPacket.field2223, ServerPacket.field2169, ServerPacket.field2225, ServerPacket.field2226, ServerPacket.field2224}; // L: 95
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(Lid;Ljava/lang/String;B)V",
		garbageValue = "125"
	)
	static void method4404(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1893
		Client.archiveLoaders.add(var2); // L: 1894
		Client.field953 += var2.groupCount; // L: 1895
	} // L: 1896
}
