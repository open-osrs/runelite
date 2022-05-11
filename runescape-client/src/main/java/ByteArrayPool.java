import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -88837057
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1039424223
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1336676741
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1169134273
	)
	static int field4217;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -957559945
	)
	static int field4210;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1701731071
	)
	static int field4219;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1660116295
	)
	static int field4220;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1383703933
	)
	static int field4221;
	@ObfuscatedName("w")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("b")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("t")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("g")
	static byte[][] field4225;
	@ObfuscatedName("h")
	static ArrayList field4212;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4217 = 0; // L: 16
		field4210 = 1000; // L: 17
		field4219 = 250; // L: 18
		field4220 = 100; // L: 19
		field4221 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4225 = new byte[50][];
		field4212 = new ArrayList(); // L: 28
		LoginScreenAnimation.method2217(); // L: 31
		new HashMap();
	} // L: 36

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "1"
	)
	public static float method6364(int var0) {
		var0 &= 16383; // L: 24
		return (float)(6.283185307179586D * (double)((float)var0 / 16384.0F)); // L: 25
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "957663499"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) { // L: 70
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 71
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 72
			return var4; // L: 73
		}

		if (var0 != 5000) { // L: 75
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 76
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 77
			return var4; // L: 78
		}

		if (var0 != 10000) { // L: 80
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 81
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 82
			return var4; // L: 83
		}

		if (var0 != 30000) { // L: 85
			if (var0 < 30000) {
			}
		} else if (field4217 > 0) {
			var4 = field4225[--field4217]; // L: 86
			field4225[field4217] = null; // L: 87
			return var4; // L: 88
		}

		if (class131.ByteArrayPool_arrays != null) { // L: 90
			for (int var2 = 0; var2 < FileSystem.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 91
				if (FileSystem.ByteArrayPool_alternativeSizes[var2] != var0) { // L: 92
					if (var0 < FileSystem.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = class131.ByteArrayPool_arrays[var2][--GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 93
					class131.ByteArrayPool_arrays[var2][GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 94
					return var3; // L: 95
				}
			}
		}

		return new byte[var0]; // L: 108
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lqr;",
		garbageValue = "1594784812"
	)
	static SpritePixels method6365() {
		SpritePixels var0 = new SpritePixels(); // L: 149
		var0.width = class453.SpriteBuffer_spriteWidth; // L: 150
		var0.height = class453.SpriteBuffer_spriteHeight; // L: 151
		var0.xOffset = class453.SpriteBuffer_xOffsets[0]; // L: 152
		var0.yOffset = class453.SpriteBuffer_yOffsets[0]; // L: 153
		var0.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[0]; // L: 154
		var0.subHeight = class453.SpriteBuffer_spriteHeights[0]; // L: 155
		int var1 = var0.subHeight * var0.subWidth; // L: 156
		byte[] var2 = class127.SpriteBuffer_pixels[0]; // L: 157
		var0.pixels = new int[var1]; // L: 158

		for (int var3 = 0; var3 < var1; ++var3) { // L: 159
			var0.pixels[var3] = Decimator.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		VarcInt.method3325(); // L: 160
		return var0; // L: 161
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V",
		garbageValue = "-376973471"
	)
	static final void method6357(Actor var0, int var1) {
		AbstractWorldMapIcon.worldToScreen(var0.x, var0.y, var1); // L: 5456
	} // L: 5457
}
