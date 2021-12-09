import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("c")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 533460423
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1696550227
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("m")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2019317565
	)
	static int field2503;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 194867713
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("g")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "14"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 424
		int var2 = var1.readUnsignedByte(); // L: 425
		int var3 = var1.readInt(); // L: 426
		if (var3 < 0 || AbstractArchive.field3843 != 0 && var3 > AbstractArchive.field3843) { // L: 427
			throw new RuntimeException(); // L: 428
		} else if (var2 == 0) { // L: 430
			byte[] var6 = new byte[var3]; // L: 431
			var1.readBytes(var6, 0, var3); // L: 432
			return var6; // L: 433
		} else {
			int var4 = var1.readInt(); // L: 436
			if (var4 >= 0 && (AbstractArchive.field3843 == 0 || var4 <= AbstractArchive.field3843)) { // L: 437
				byte[] var5 = new byte[var4]; // L: 440
				if (var2 == 1) { // L: 441
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 442
				}

				return var5; // L: 443
			} else {
				throw new RuntimeException(); // L: 438
			}
		}
	}
}
