import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("g")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("e")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("p")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("j")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -724339659
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("x")
	int[] field1957;
	@ObfuscatedName("y")
	public boolean field1958;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1109851961
	)
	public int field1959;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2080361701
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 911643557
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1755314831
	)
	public int field1962;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1777344097
	)
	public int field1963;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 532178661
	)
	public int field1956;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1664617853
	)
	public int field1965;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.frameCount = -1;
		this.field1958 = false;
		this.field1959 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field1962 = 99;
		this.field1963 = -1;
		this.field1956 = -1;
		this.field1965 = 2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;S)V",
		garbageValue = "-19285"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "1217260020"
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
		} else if (var2 == 2) { // L: 62
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) { // L: 63
			var3 = var1.readUnsignedByte(); // L: 64
			this.field1957 = new int[var3 + 1]; // L: 65

			for (var4 = 0; var4 < var3; ++var4) { // L: 66
				this.field1957[var4] = var1.readUnsignedByte();
			}

			this.field1957[var3] = 9999999; // L: 67
		} else if (var2 == 4) { // L: 69
			this.field1958 = true;
		} else if (var2 == 5) { // L: 70
			this.field1959 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 71
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 72
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 73
			this.field1962 = var1.readUnsignedByte();
		} else if (var2 == 9) { // L: 74
			this.field1963 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 75
			this.field1956 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 76
			this.field1965 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 77
			var3 = var1.readUnsignedByte(); // L: 78
			this.chatFrameIds = new int[var3]; // L: 79

			for (var4 = 0; var4 < var3; ++var4) { // L: 80
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 81
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2018272752"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field1963 == -1) { // L: 92
			if (this.field1957 != null) { // L: 93
				this.field1963 = 2;
			} else {
				this.field1963 = 0; // L: 94
			}
		}

		if (this.field1956 == -1) { // L: 96
			if (this.field1957 != null) { // L: 97
				this.field1956 = 2;
			} else {
				this.field1956 = 0; // L: 98
			}
		}

	} // L: 100

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IS)Lhl;",
		garbageValue = "11483"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2]; // L: 103
		Frames var3 = DynamicObject.getFrames(var2 >> 16); // L: 104
		var2 &= 65535; // L: 105
		if (var3 == null) {
			return var1.toSharedSequenceModel(true); // L: 106
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2)); // L: 107
			var4.animate(var3, var2); // L: 108
			return var4; // L: 109
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IIB)Lhl;",
		garbageValue = "0"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2]; // L: 113
		Frames var4 = DynamicObject.getFrames(var2 >> 16); // L: 114
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IB)Lhl;",
		garbageValue = "55"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2]; // L: 130
		Frames var3 = DynamicObject.getFrames(var2 >> 16); // L: 131
		var2 &= 65535; // L: 132
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true); // L: 133
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2)); // L: 134
			var4.animate(var3, var2); // L: 135
			return var4; // L: 136
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lhl;ILfm;II)Lhl;",
		garbageValue = "1824353368"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 140
		Frames var5 = DynamicObject.getFrames(var2 >> 16); // L: 141
		var2 &= 65535; // L: 142
		if (var5 == null) { // L: 143
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 144
			Frames var6 = DynamicObject.getFrames(var4 >> 16); // L: 145
			var4 &= 65535; // L: 146
			Model var7;
			if (var6 == null) { // L: 147
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 148
				var7.animate(var5, var2); // L: 149
				return var7; // L: 150
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 152
				var7.animate2(var5, var2, var6, var4, this.field1957); // L: 153
				return var7; // L: 154
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lhl;II)Lhl;",
		garbageValue = "530277296"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2]; // L: 158
		Frames var4 = DynamicObject.getFrames(var3 >> 16); // L: 159
		var3 &= 65535; // L: 160
		if (var4 == null) { // L: 161
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null; // L: 162
			int var6 = 0; // L: 163
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 164
				var6 = this.chatFrameIds[var2]; // L: 165
				var5 = DynamicObject.getFrames(var6 >> 16); // L: 166
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

	@ObfuscatedName("i")
	public static final int method3461(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var4 + var2 - var2 * var4; // L: 15
			}

			double var14 = 2.0D * var4 - var12; // L: 16
			double var16 = 0.3333333333333333D + var0; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (6.0D * var16 < 1.0D) { // L: 22
				var6 = var14 + 6.0D * (var12 - var14) * var16;
			} else if (2.0D * var16 < 1.0D) { // L: 23
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) { // L: 24
				var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = var14 + 6.0D * (var12 - var14) * var0;
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + (var12 - var14) * (0.6666666666666666D - var0) * 6.0D; // L: 28
			} else {
				var8 = var14; // L: 29
			}

			if (var20 * 6.0D < 1.0D) { // L: 30
				var10 = var20 * (var12 - var14) * 6.0D + var14;
			} else if (var20 * 2.0D < 1.0D) { // L: 31
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) { // L: 32
				var10 = var14 + 6.0D * (0.6666666666666666D - var20) * (var12 - var14);
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(var10 * 256.0D); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1706767111"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 3161
		class19.method289(); // L: 3162
		GameBuild.scene.clear(); // L: 3163

		for (int var0 = 0; var0 < 4; ++var0) { // L: 3164
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 3165
		class247.musicPlayerStatus = 1; // L: 3167
		class128.musicTrackArchive = null; // L: 3168
		FillMode.musicTrackGroupId = -1; // L: 3169
		ArchiveDiskActionHandler.musicTrackFileId = -1; // L: 3170
		class247.musicTrackVolume = 0; // L: 3171
		SecureRandomCallable.musicTrackBoolean = false; // L: 3172
		class247.pcmSampleLength = 2; // L: 3173
		Client.currentTrackGroupId = -1; // L: 3175
		Client.field710 = false; // L: 3176

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 3178
			if (var1.stream1 != null) { // L: 3179
				BuddyRankComparator.pcmStreamMixer.removeSubStream(var1.stream1); // L: 3180
				var1.stream1 = null; // L: 3181
			}

			if (var1.stream2 != null) { // L: 3183
				BuddyRankComparator.pcmStreamMixer.removeSubStream(var1.stream2); // L: 3184
				var1.stream2 = null; // L: 3185
			}
		}

		ObjectSound.objectSounds.clear(); // L: 3188
		WorldMapData_1.updateGameState(10); // L: 3190
	} // L: 3191
}
