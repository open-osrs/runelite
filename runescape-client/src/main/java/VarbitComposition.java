import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("o")
	static final int[] field1710;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = -1778547945
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1244645657
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1956088267
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 147814917
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field1710 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field1710[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	VarbitComposition() {
	} // L: 25

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-699123952"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "-59"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			this.baseVar = var1.readUnsignedShort(); // L: 47
			this.startBit = var1.readUnsignedByte(); // L: 48
			this.endBit = var1.readUnsignedByte(); // L: 49
		}

	} // L: 52

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Llk;ZB)V",
		garbageValue = "-27"
	)
	public static void method2928(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) { // L: 60
			try {
				NetCache.NetCache_socket.close(); // L: 62
			} catch (Exception var6) { // L: 64
			}

			NetCache.NetCache_socket = null; // L: 65
		}

		NetCache.NetCache_socket = var0; // L: 67
		class105.method2358(var1); // L: 68
		NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 69
		class34.NetCache_currentResponse = null; // L: 70
		class254.NetCache_responseArchiveBuffer = null; // L: 71
		NetCache.field3615 = 0; // L: 72

		while (true) {
			NetFileRequest var2 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 74
			if (var2 == null) { // L: 75
				while (true) {
					var2 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 81
					if (var2 == null) { // L: 82
						if (NetCache.field3618 != 0) { // L: 88
							try {
								Buffer var7 = new Buffer(4); // L: 90
								var7.writeByte(4); // L: 91
								var7.writeByte(NetCache.field3618); // L: 92
								var7.writeShort(0); // L: 93
								NetCache.NetCache_socket.write(var7.array, 0, 4); // L: 94
							} catch (IOException var5) {
								try {
									NetCache.NetCache_socket.close(); // L: 98
								} catch (Exception var4) { // L: 100
								}

								++NetCache.NetCache_ioExceptions; // L: 101
								NetCache.NetCache_socket = null; // L: 102
							}
						}

						NetCache.NetCache_loadTime = 0; // L: 105
						NetCache.field3604 = ClientPacket.currentTimeMillis(); // L: 106
						return; // L: 107
					}

					NetCache.NetCache_pendingWritesQueue.addLast(var2); // L: 83
					NetCache.NetCache_pendingWrites.put(var2, var2.key); // L: 84
					++NetCache.NetCache_pendingWritesCount; // L: 85
					--NetCache.NetCache_pendingResponsesCount; // L: 86
				}
			}

			NetCache.NetCache_pendingPriorityWrites.put(var2, var2.key); // L: 76
			++NetCache.NetCache_pendingPriorityWritesCount; // L: 77
			--NetCache.NetCache_pendingPriorityResponsesCount; // L: 78
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "264139195"
	)
	public static int method2935(int var0, int var1) {
		return (-3 - var0 << 8) + var1; // L: 17
	}
}
