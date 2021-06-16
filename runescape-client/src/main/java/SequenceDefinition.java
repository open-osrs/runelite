import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("o")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("m")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("r")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("h")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 403704851
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("z")
	int[] field1886;
	@ObfuscatedName("b")
	public boolean field1888;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1860367517
	)
	public int field1892;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1677443273
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -757910463
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -374777757
	)
	public int field1896;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -302620765
	)
	public int field1895;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 317689877
	)
	public int field1893;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2048501497
	)
	public int field1894;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 15
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 16
	}

	SequenceDefinition() {
		this.frameCount = -1; // L: 21
		this.field1888 = false; // L: 23
		this.field1892 = 5; // L: 24
		this.shield = -1; // L: 25
		this.weapon = -1; // L: 26
		this.field1896 = 99; // L: 27
		this.field1895 = -1; // L: 28
		this.field1893 = -1; // L: 29
		this.field1894 = 2; // L: 30
	} // L: 32

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1823528439"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 47
			if (var2 == 0) { // L: 48
				return; // L: 51
			}

			this.decodeNext(var1, var2); // L: 49
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "48"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 54
			var3 = var1.readUnsignedShort(); // L: 55
			this.frameLengths = new int[var3]; // L: 56

			for (var4 = 0; var4 < var3; ++var4) { // L: 57
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3]; // L: 58

			for (var4 = 0; var4 < var3; ++var4) { // L: 59
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 60
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte(); // L: 64
			this.field1886 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1886[var4] = var1.readUnsignedByte();
			}

			this.field1886[var3] = 9999999;
		} else if (var2 == 4) {
			this.field1888 = true;
		} else if (var2 == 5) {
			this.field1892 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 72
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field1896 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field1895 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field1893 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field1894 = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte(); // L: 78
			this.chatFrameIds = new int[var3]; // L: 79

			for (var4 = 0; var4 < var3; ++var4) { // L: 80
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) { // L: 83
			var3 = var1.readUnsignedByte(); // L: 84
			this.soundEffects = new int[var3]; // L: 85

			for (var4 = 0; var4 < var3; ++var4) { // L: 86
				this.soundEffects[var4] = var1.readMedium();
			}
		}

	} // L: 89

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1961662829"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field1895 == -1) { // L: 92
			if (this.field1886 != null) { // L: 93
				this.field1895 = 2;
			} else {
				this.field1895 = 0; // L: 94
			}
		}

		if (this.field1893 == -1) { // L: 96
			if (this.field1886 != null) { // L: 97
				this.field1893 = 2;
			} else {
				this.field1893 = 0; // L: 98
			}
		}

	} // L: 100

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lgd;II)Lgd;",
		garbageValue = "-237449426"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2]; // L: 103
		Frames var3 = class69.getFrames(var2 >> 16); // L: 104
		var2 &= 65535; // L: 105
		if (var3 == null) {
			return var1.toSharedSequenceModel(true); // L: 106
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2)); // L: 107
			var4.animate(var3, var2); // L: 108
			return var4; // L: 109
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lgd;III)Lgd;",
		garbageValue = "-188678867"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2]; // L: 113
		Frames var4 = class69.getFrames(var2 >> 16); // L: 114
		var2 &= 65535; // L: 115
		if (var4 == null) { // L: 116
			return var1.toSharedSequenceModel(true);
		} else {
			Model var5 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var2)); // L: 117
			var3 &= 3; // L: 118
			if (var3 == 1) { // L: 119
				var5.rotateY270Ccw();
			} else if (var3 == 2) { // L: 120
				var5.rotateY180();
			} else if (var3 == 3) { // L: 121
				var5.rotateY90Ccw();
			}

			var5.animate(var4, var2); // L: 122
			if (var3 == 1) { // L: 123
				var5.rotateY90Ccw();
			} else if (var3 == 2) { // L: 124
				var5.rotateY180();
			} else if (var3 == 3) { // L: 125
				var5.rotateY270Ccw();
			}

			return var5; // L: 126
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lgd;IB)Lgd;",
		garbageValue = "-1"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2]; // L: 130
		Frames var3 = class69.getFrames(var2 >> 16); // L: 131
		var2 &= 65535; // L: 132
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true); // L: 133
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2)); // L: 134
			var4.animate(var3, var2); // L: 135
			return var4; // L: 136
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lgd;ILfm;II)Lgd;",
		garbageValue = "-1179378305"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 140
		Frames var5 = class69.getFrames(var2 >> 16); // L: 141
		var2 &= 65535; // L: 142
		if (var5 == null) { // L: 143
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 144
			Frames var6 = class69.getFrames(var4 >> 16); // L: 145
			var4 &= 65535; // L: 146
			Model var7;
			if (var6 == null) { // L: 147
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 148
				var7.animate(var5, var2); // L: 149
				return var7; // L: 150
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 152
				var7.animate2(var5, var2, var6, var4, this.field1886); // L: 153
				return var7; // L: 154
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lgd;II)Lgd;",
		garbageValue = "-23683496"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2]; // L: 158
		Frames var4 = class69.getFrames(var3 >> 16); // L: 159
		var3 &= 65535; // L: 160
		if (var4 == null) { // L: 161
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null; // L: 162
			int var6 = 0; // L: 163
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 164
				var6 = this.chatFrameIds[var2]; // L: 165
				var5 = class69.getFrames(var6 >> 16); // L: 166
				var6 &= 65535; // L: 167
			}

			Model var7;
			if (var5 != null && var6 != 65535) { // L: 169
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 174
				var7.animate(var4, var3); // L: 175
				var7.animate(var5, var6); // L: 176
				return var7; // L: 177
			} else {
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 170
				var7.animate(var4, var3); // L: 171
				return var7; // L: 172
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-88"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < 1000) { // L: 61
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 62
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < 250) { // L: 65
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 66
		} else if (var0.length == 30000 && ByteArrayPool.ByteArrayPool_largeCount < 50) { // L: 69
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 70
		} else {
			if (Tiles.ByteArrayPool_arrays != null) { // L: 73
				for (int var1 = 0; var1 < class372.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 74
					if (var0.length == class372.ByteArrayPool_alternativeSizes[var1] && WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts[var1] < Tiles.ByteArrayPool_arrays[var1].length) { // L: 75
						Tiles.ByteArrayPool_arrays[var1][WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 76
						return; // L: 77
					}
				}
			}

		}
	} // L: 63 67 71 81
}
