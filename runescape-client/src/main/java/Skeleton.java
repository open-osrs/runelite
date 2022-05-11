import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1034195309
	)
	@Export("id")
	int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -27257925
	)
	@Export("count")
	int count;
	@ObfuscatedName("s")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("r")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	class202 field2409;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2409 = new class202(var3, var4);
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2063510736"
	)
	public int method4018() {
		return this.count; // L: 38
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lgb;",
		garbageValue = "2098752701"
	)
	public class202 method4023() {
		return this.field2409; // L: 42
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILnc;Lle;I)V",
		garbageValue = "-2024769656"
	)
	static void method4022(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
				if (var5.key == (long)var0 && var1 == var5.archiveDisk && var5.type == 0) {
					var3 = var5.data; // L: 34
					break;
				}
			}
		}

		if (var3 != null) { // L: 39
			var2.load(var1, var0, var3, true); // L: 40
		} else {
			byte[] var4 = var1.read(var0); // L: 43
			var2.load(var1, var0, var4, true); // L: 44
		}
	} // L: 41 45

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnf;ZI)V",
		garbageValue = "-824720850"
	)
	public static void method4024(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) { // L: 60
			try {
				NetCache.NetCache_socket.close(); // L: 62
			} catch (Exception var6) { // L: 64
			}

			NetCache.NetCache_socket = null; // L: 65
		}

		NetCache.NetCache_socket = var0; // L: 67
		MouseRecorder.method2088(var1); // L: 68
		NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 69
		WorldMapIcon_0.NetCache_currentResponse = null; // L: 70
		class357.NetCache_responseArchiveBuffer = null; // L: 71
		NetCache.field4052 = 0; // L: 72

		while (true) {
			NetFileRequest var2 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 74
			if (var2 == null) { // L: 75
				while (true) {
					var2 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 81
					if (var2 == null) { // L: 82
						if (NetCache.field4043 != 0) { // L: 88
							try {
								Buffer var7 = new Buffer(4); // L: 90
								var7.writeByte(4); // L: 91
								var7.writeByte(NetCache.field4043); // L: 92
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
						NetCache.field4041 = class113.method2624(); // L: 106
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1940091052"
	)
	static int method4019(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}
}
