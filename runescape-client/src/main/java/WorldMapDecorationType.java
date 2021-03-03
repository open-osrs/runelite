import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2765(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2748(1, 0),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2749(2, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2750(3, 0),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2760(9, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2752(4, 1),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2768(5, 1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2754(6, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2755(7, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2751(8, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2757(12, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2767(13, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2758(14, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2756(15, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2761(16, 2),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2762(17, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2763(18, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2764(19, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2769(20, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2766(21, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2747(10, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2753(11, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field2759(22, 3);

	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -129094329
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3; // L: 34
	} // L: 35

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 38
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "98"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 370
		int var2 = var1.readUnsignedByte(); // L: 371
		int var3 = var1.readInt(); // L: 372
		if (var3 < 0 || AbstractArchive.field3171 != 0 && var3 > AbstractArchive.field3171) { // L: 373
			throw new RuntimeException(); // L: 374
		} else if (var2 == 0) { // L: 376
			byte[] var6 = new byte[var3]; // L: 377
			var1.readBytes(var6, 0, var3); // L: 378
			return var6; // L: 379
		} else {
			int var4 = var1.readInt(); // L: 382
			if (var4 >= 0 && (AbstractArchive.field3171 == 0 || var4 <= AbstractArchive.field3171)) { // L: 383
				byte[] var5 = new byte[var4]; // L: 386
				if (var2 == 1) { // L: 387
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 388
				}

				return var5; // L: 389
			} else {
				throw new RuntimeException(); // L: 384
			}
		}
	}
}
