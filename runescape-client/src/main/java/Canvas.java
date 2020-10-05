import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	static Widget field438;
	@ObfuscatedName("z")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-36"
	)
	public static int method905(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 35
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 36
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 37
		var0 += var0 >>> 8; // L: 38
		var0 += var0 >>> 16; // L: 39
		return var0 & 255; // L: 40
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1073407655"
	)
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < 1000) { // L: 76
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 77
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < 250) { // L: 80
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 81
		} else if (var0.length == 30000 && ByteArrayPool.ByteArrayPool_largeCount < 50) { // L: 84
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 85
		} else {
			if (ByteArrayPool.ByteArrayPool_arrays != null) { // L: 88
				for (int var1 = 0; var1 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 89
					if (var0.length == ByteArrayPool.ByteArrayPool_alternativeSizes[var1] && ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1] < ByteArrayPool.ByteArrayPool_arrays[var1].length) { // L: 90
						ByteArrayPool.ByteArrayPool_arrays[var1][ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 91
						return; // L: 92
					}
				}
			}

		}
	} // L: 78 82 86 96

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lct;B)V",
		garbageValue = "-37"
	)
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1720
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1721
			WorldMapManager.method726(var0.isMembersOnly()); // L: 1722
		}

		ItemContainer.worldHost = var0.host; // L: 1724
		Client.worldId = var0.id; // L: 1725
		Client.worldProperties = var0.properties; // L: 1726
		Client.port1 = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1727
		class23.port2 = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1728
		WorldMapScaleHandler.port3 = Client.port1; // L: 1729
	} // L: 1730

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)V",
		garbageValue = "-580678135"
	)
	static final void method903(Widget var0) {
		int var1 = var0.contentType; // L: 10437
		if (var1 == 324) { // L: 10438
			if (Client.field937 == -1) { // L: 10439
				Client.field937 = var0.spriteId2; // L: 10440
				Client.field942 = var0.spriteId; // L: 10441
			}

			if (Client.playerAppearance.isFemale) { // L: 10443
				var0.spriteId2 = Client.field937;
			} else {
				var0.spriteId2 = Client.field942; // L: 10444
			}

		} else if (var1 == 325) { // L: 10447
			if (Client.field937 == -1) { // L: 10448
				Client.field937 = var0.spriteId2; // L: 10449
				Client.field942 = var0.spriteId; // L: 10450
			}

			if (Client.playerAppearance.isFemale) { // L: 10452
				var0.spriteId2 = Client.field942;
			} else {
				var0.spriteId2 = Client.field937; // L: 10453
			}

		} else if (var1 == 327) { // L: 10456
			var0.modelAngleX = 150; // L: 10457
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 10458
			var0.modelType = 5; // L: 10459
			var0.modelId = 0; // L: 10460
		} else if (var1 == 328) { // L: 10463
			var0.modelAngleX = 150; // L: 10464
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 10465
			var0.modelType = 5; // L: 10466
			var0.modelId = 1; // L: 10467
		}
	} // L: 10445 10454 10461 10468 10470
}
