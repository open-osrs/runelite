import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 747226221
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1980117299
	)
	@Export("type")
	int type;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -554114639
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1191230763
	)
	@Export("y")
	int y;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -748187349
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1874163139
	)
	int field1087;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 474042509
	)
	int field1080;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -208489985
	)
	@Export("id")
	int id;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -104687109
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 753624769
	)
	int field1075;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2017319267
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1649420319
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0; // L: 16
		this.hitpoints = -1; // L: 17
	} // L: 19

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-94"
	)
	public static String method2224(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 58

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 59
			int var5 = var0[var4] & 255; // L: 60
			var3.append(class329.field4005[var5 >>> 2]); // L: 61
			if (var4 < var2 - 1) { // L: 62
				int var6 = var0[var4 + 1] & 255; // L: 63
				var3.append(class329.field4005[(var5 & 3) << 4 | var6 >>> 4]); // L: 64
				if (var4 < var2 - 2) { // L: 65
					int var7 = var0[var4 + 2] & 255; // L: 66
					var3.append(class329.field4005[(var6 & 15) << 2 | var7 >>> 6]).append(class329.field4005[var7 & 63]); // L: 67
				} else {
					var3.append(class329.field4005[(var6 & 15) << 2]).append("="); // L: 69
				}
			} else {
				var3.append(class329.field4005[(var5 & 3) << 4]).append("=="); // L: 71
			}
		}

		return var3.toString(); // L: 73
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2136768167"
	)
	static void method2225(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 246
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2); // L: 247
		if (var4 != null) { // L: 248
			NetCache.NetCache_pendingWritesQueue.addLast(var4); // L: 249
		}
	} // L: 250

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-373054385"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 152
		int var4 = 0; // L: 153

		for (int var5 = 0; var5 < var2; ++var5) { // L: 154
			int var6 = var0[var5 + var1] & 255; // L: 155
			if (var6 != 0) { // L: 156
				if (var6 >= 128 && var6 < 160) { // L: 157
					char var7 = class328.cp1252AsciiExtension[var6 - 128]; // L: 158
					if (var7 == 0) { // L: 159
						var7 = '?';
					}

					var6 = var7; // L: 160
				}

				var3[var4++] = (char)var6; // L: 162
			}
		}

		return new String(var3, 0, var4); // L: 164
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2133440883"
	)
	static final int method2223(int var0, int var1) {
		if (var0 == -2) { // L: 503
			return 12345678;
		} else if (var0 == -1) { // L: 504
			if (var1 < 2) { // L: 505
				var1 = 2;
			} else if (var1 > 126) { // L: 506
				var1 = 126;
			}

			return var1; // L: 507
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 509
			if (var1 < 2) { // L: 510
				var1 = 2;
			} else if (var1 > 126) { // L: 511
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 512
		}
	}
}
