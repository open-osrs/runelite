import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("q")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("k")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("c")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("u")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1610785433
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("e")
	int[] field3543;
	@ObfuscatedName("o")
	public boolean field3544;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -780702177
	)
	public int field3545;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -825305281
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1577634901
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 508955331
	)
	public int field3547;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -370859363
	)
	public int field3549;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -190010935
	)
	public int field3550;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 758592065
	)
	public int field3551;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 15
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 16
	}

	SequenceDefinition() {
		this.frameCount = -1; // L: 21
		this.field3544 = false; // L: 23
		this.field3545 = 5; // L: 24
		this.shield = -1; // L: 25
		this.weapon = -1; // L: 26
		this.field3547 = 99; // L: 27
		this.field3549 = -1; // L: 28
		this.field3550 = -1; // L: 29
		this.field3551 = 2; // L: 30
	} // L: 32

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "1755425441"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "-1461293345"
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
			this.field3543 = new int[var3 + 1]; // L: 65

			for (var4 = 0; var4 < var3; ++var4) { // L: 66
				this.field3543[var4] = var1.readUnsignedByte();
			}

			this.field3543[var3] = 9999999; // L: 67
		} else if (var2 == 4) { // L: 69
			this.field3544 = true;
		} else if (var2 == 5) { // L: 70
			this.field3545 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 71
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 72
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 73
			this.field3547 = var1.readUnsignedByte();
		} else if (var2 == 9) { // L: 74
			this.field3549 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 75
			this.field3550 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 76
			this.field3551 = var1.readUnsignedByte();
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "498097204"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field3549 == -1) { // L: 92
			if (this.field3543 != null) { // L: 93
				this.field3549 = 2;
			} else {
				this.field3549 = 0; // L: 94
			}
		}

		if (this.field3550 == -1) { // L: 96
			if (this.field3543 != null) { // L: 97
				this.field3550 = 2;
			} else {
				this.field3550 = 0; // L: 98
			}
		}

	} // L: 100

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Leh;II)Leh;",
		garbageValue = "311789628"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2]; // L: 103
		Frames var3 = LoginPacket.getFrames(var2 >> 16); // L: 104
		var2 &= 65535; // L: 105
		if (var3 == null) {
			return var1.toSharedSequenceModel(true); // L: 106
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2)); // L: 107
			var4.animate(var3, var2); // L: 108
			return var4; // L: 109
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Leh;III)Leh;",
		garbageValue = "-1889831767"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2]; // L: 113
		Frames var4 = LoginPacket.getFrames(var2 >> 16); // L: 114
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Leh;II)Leh;",
		garbageValue = "-52965568"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2]; // L: 130
		Frames var3 = LoginPacket.getFrames(var2 >> 16); // L: 131
		var2 &= 65535; // L: 132
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true); // L: 133
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2)); // L: 134
			var4.animate(var3, var2); // L: 135
			return var4; // L: 136
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Leh;ILjg;II)Leh;",
		garbageValue = "-1275419577"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 140
		Frames var5 = LoginPacket.getFrames(var2 >> 16); // L: 141
		var2 &= 65535; // L: 142
		if (var5 == null) { // L: 143
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 144
			Frames var6 = LoginPacket.getFrames(var4 >> 16); // L: 145
			var4 &= 65535; // L: 146
			Model var7;
			if (var6 == null) { // L: 147
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 148
				var7.animate(var5, var2); // L: 149
				return var7; // L: 150
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 152
				var7.animate2(var5, var2, var6, var4, this.field3543); // L: 153
				return var7; // L: 154
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Leh;II)Leh;",
		garbageValue = "211879185"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2]; // L: 158
		Frames var4 = LoginPacket.getFrames(var3 >> 16); // L: 159
		var3 &= 65535; // L: 160
		if (var4 == null) { // L: 161
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null; // L: 162
			int var6 = 0; // L: 163
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 164
				var6 = this.chatFrameIds[var2]; // L: 165
				var5 = LoginPacket.getFrames(var6 >> 16); // L: 166
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
}
