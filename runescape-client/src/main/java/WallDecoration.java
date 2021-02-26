import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 964756049
	)
	@Export("clientTickTimeIdx")
	static int clientTickTimeIdx;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 719575047
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -920611555
	)
	@Export("x")
	int x;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -730740551
	)
	@Export("y")
	int y;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 333766323
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1617230319
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2092861143
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1518269047
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 1249498855339190201L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1390179163
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "699816166"
	)
	public static String method3450(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = LoginPacket.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4); // L: 25
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljo;",
		garbageValue = "1862361389"
	)
	public static FloorOverlayDefinition method3449(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 30
		if (var1 != null) { // L: 31
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 32
			var1 = new FloorOverlayDefinition(); // L: 33
			if (var2 != null) { // L: 34
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 35
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 36
			return var1; // L: 37
		}
	}
}
