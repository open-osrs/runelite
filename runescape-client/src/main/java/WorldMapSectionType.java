import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enumerated {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(1, (byte)3);

	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -695780183
	)
	@Export("type")
	final int type;
	@ObfuscatedName("h")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 22
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Liy;IIIBZI)V",
		garbageValue = "-1369121256"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 60
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 61
		if (var8 == null) { // L: 62
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 63
			if (var8 == null) { // L: 64
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 65
				if (var8 != null) { // L: 66
					if (var5) { // L: 67
						var8.removeDual(); // L: 68
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 69
						--NetCache.NetCache_pendingWritesCount; // L: 70
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 71
					}

				} else {
					if (!var5) { // L: 75
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 76
						if (var8 != null) { // L: 77
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 79
					var8.archive = var0; // L: 80
					var8.crc = var3; // L: 81
					var8.padding = var4; // L: 82
					if (var5) { // L: 83
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 84
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 85
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 88
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 89
						++NetCache.NetCache_pendingWritesCount; // L: 90
					}

				}
			}
		}
	} // L: 73 92

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-103793569"
	)
	static final int method320(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 558
		var2 ^= var2 << 13; // L: 559
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE; // L: 560
		return var3 >> 19 & 255; // L: 561
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-177467978"
	)
	static final void method318(int var0, int var1, int var2, int var3) {
		Client.field778 = 0; // L: 4869
		int var4 = (UserComparator9.localPlayer.x >> 7) + GrandExchangeOfferNameComparator.baseX; // L: 4870
		int var5 = (UserComparator9.localPlayer.y >> 7) + NetCache.baseY; // L: 4871
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) { // L: 4872
			Client.field778 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) { // L: 4873
			Client.field778 = 1;
		}

		if (Client.field778 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) { // L: 4874
			Client.field778 = 0;
		}

	} // L: 4876

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "417722917"
	)
	static final void method319() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7291 7292 7311
			if (var0.hitpoints > 0) { // L: 7293
				--var0.hitpoints;
			}

			if (var0.hitpoints == 0) { // L: 7294
				if (var0.objectId < 0 || TaskHandler.method3673(var0.objectId, var0.field945)) { // L: 7295
					SpriteMask.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field944, var0.field945); // L: 7296
					var0.remove(); // L: 7297
				}
			} else {
				if (var0.delay > 0) { // L: 7301
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102 && (var0.id < 0 || TaskHandler.method3673(var0.id, var0.field948))) { // L: 7302 7303
					SpriteMask.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field948); // L: 7304
					var0.delay = -1; // L: 7305
					if (var0.objectId == var0.id && var0.objectId == -1) { // L: 7306
						var0.remove();
					} else if (var0.id == var0.objectId && var0.field944 == var0.orientation && var0.field948 == var0.field945) { // L: 7307
						var0.remove();
					}
				}
			}
		}

	} // L: 7313
}
