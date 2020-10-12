import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class DevicePcmPlayerProvider implements PlayerProvider {
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 1325063249
	)
	static int menuWidth;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Ldr;",
		garbageValue = "-1032997343"
	)
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 10
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	public static int iLog(int var0) {
		int var1 = 0; // L: 54
		if (var0 < 0 || var0 >= 65536) { // L: 55
			var0 >>>= 16; // L: 56
			var1 += 16; // L: 57
		}

		if (var0 >= 256) { // L: 59
			var0 >>>= 8; // L: 60
			var1 += 8; // L: 61
		}

		if (var0 >= 16) { // L: 63
			var0 >>>= 4; // L: 64
			var1 += 4; // L: 65
		}

		if (var0 >= 4) { // L: 67
			var0 >>>= 2; // L: 68
			var1 += 2; // L: 69
		}

		if (var0 >= 1) { // L: 71
			var0 >>>= 1; // L: 72
			++var1; // L: 73
		}

		return var0 + var1; // L: 75
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-2036549161"
	)
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 363
		int var2 = var1.readUnsignedByte(); // L: 364
		int var3 = var1.readInt(); // L: 365
		if (var3 < 0 || AbstractArchive.field3176 != 0 && var3 > AbstractArchive.field3176) { // L: 366
			throw new RuntimeException(); // L: 367
		} else if (var2 == 0) { // L: 369
			byte[] var6 = new byte[var3]; // L: 370
			var1.readBytes(var6, 0, var3); // L: 371
			return var6; // L: 372
		} else {
			int var4 = var1.readInt(); // L: 375
			if (var4 >= 0 && (AbstractArchive.field3176 == 0 || var4 <= AbstractArchive.field3176)) { // L: 376
				byte[] var5 = new byte[var4]; // L: 379
				if (var2 == 1) { // L: 380
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 381
				}

				return var5; // L: 382
			} else {
				throw new RuntimeException(); // L: 377
			}
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-334845913"
	)
	static void method897() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 10265
			int var1 = var0.group; // L: 10266
			if (WorldMapSprite.loadInterface(var1)) { // L: 10267
				boolean var2 = true; // L: 10268
				Widget[] var3 = Widget.Widget_interfaceComponents[var1]; // L: 10269

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 10270
					if (var3[var4] != null) { // L: 10271
						var2 = var3[var4].isIf3; // L: 10272
						break;
					}
				}

				if (!var2) { // L: 10276
					var4 = (int)var0.key; // L: 10277
					Widget var5 = TileItem.getWidget(var4); // L: 10278
					if (var5 != null) { // L: 10279
						class52.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 10283
}
