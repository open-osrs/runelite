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
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "14"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field3843 != 0 && var3 > AbstractArchive.field3843) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field3843 == 0 || var4 <= AbstractArchive.field3843)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}
}
