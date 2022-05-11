import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public abstract class class250 implements class252 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 659631733
	)
	protected int field2926;

	@ObfuscatedSignature(
		descriptor = "(Lke;Llq;I)V"
	)
	protected class250(StudioGame var1, Language var2, int var3) {
		this.field2926 = var3; // L: 10
	} // L: 11

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lle;IIIBZI)V",
		garbageValue = "185954668"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 122
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 123
		if (var8 == null) { // L: 124
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 125
			if (var8 == null) { // L: 126
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 127
				if (var8 != null) { // L: 128
					if (var5) { // L: 129
						var8.removeDual(); // L: 130
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 131
						--NetCache.NetCache_pendingWritesCount; // L: 132
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 133
					}

				} else {
					if (!var5) { // L: 137
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 138
						if (var8 != null) { // L: 139
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 141
					var8.archive = var0; // L: 142
					var8.crc = var3; // L: 143
					var8.padding = var4; // L: 144
					if (var5) { // L: 145
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 146
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 147
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 150
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 151
						++NetCache.NetCache_pendingWritesCount; // L: 152
					}

				}
			}
		}
	} // L: 135 154

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2017847021"
	)
	public static void method4933() {
		StructComposition.StructDefinition_cached.clear(); // L: 57
	} // L: 58
}
