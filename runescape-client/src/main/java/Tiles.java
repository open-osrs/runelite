import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("f")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("e")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -879678159
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("j")
	static byte[][][] field1111;
	@ObfuscatedName("h")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("z")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("k")
	static int[] field1095;
	@ObfuscatedName("g")
	static int[][][] field1101;
	@ObfuscatedName("q")
	static final int[] field1102;
	@ObfuscatedName("s")
	static final int[] field1107;
	@ObfuscatedName("p")
	static final int[] field1100;
	@ObfuscatedName("c")
	static final int[] field1105;
	@ObfuscatedName("n")
	static final int[] field1106;
	@ObfuscatedName("l")
	static final int[] field1097;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 892658251
	)
	static int field1108;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1828170801
	)
	static int field1109;

	static {
		Tiles_heights = new int[4][105][105]; // L: 16
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99; // L: 18
		field1102 = new int[]{1, 2, 4, 8}; // L: 34
		field1107 = new int[]{16, 32, 64, 128}; // L: 35
		field1100 = new int[]{1, 0, -1, 0}; // L: 36
		field1105 = new int[]{0, -1, 0, 1};
		field1106 = new int[]{1, -1, -1, 1};
		field1097 = new int[]{-1, -1, 1, 1};
		field1108 = (int)(Math.random() * 17.0D) - 8;
		field1109 = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Leu;",
		garbageValue = "-1940168302"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 39
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
			return var1; // L: 44
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Lez;",
		garbageValue = "107"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1675810560"
	)
	public static int[] method2154() {
		int[] var0 = new int[KeyHandler.field274]; // L: 257

		for (int var1 = 0; var1 < KeyHandler.field274; ++var1) { // L: 258
			var0[var1] = KeyHandler.field273[var1]; // L: 259
		}

		return var0; // L: 261
	}
}
