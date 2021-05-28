import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("j")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("r")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("b")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("d")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 729318423
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("u")
	int[] field1884;
	@ObfuscatedName("l")
	public boolean field1882;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 213844623
	)
	public int field1885;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1368426299
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -234609209
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 692165837
	)
	public int field1888;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1960140293
	)
	public int field1883;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -263393733
	)
	public int field1890;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1161864623
	)
	public int field1891;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 15
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 16
	}

	SequenceDefinition() {
		this.frameCount = -1; // L: 21
		this.field1882 = false; // L: 23
		this.field1885 = 5; // L: 24
		this.shield = -1; // L: 25
		this.weapon = -1; // L: 26
		this.field1888 = 99; // L: 27
		this.field1883 = -1; // L: 28
		this.field1890 = -1; // L: 29
		this.field1891 = 2; // L: 30
	} // L: 32

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "11"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) { // L: 48
				return; // L: 51
			}

			this.decodeNext(var1, var2); // L: 49
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "-1165284602"
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
			this.field1884 = new int[var3 + 1]; // L: 65

			for (var4 = 0; var4 < var3; ++var4) { // L: 66
				this.field1884[var4] = var1.readUnsignedByte();
			}

			this.field1884[var3] = 9999999; // L: 67
		} else if (var2 == 4) { // L: 69
			this.field1882 = true;
		} else if (var2 == 5) { // L: 70
			this.field1885 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 71
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 72
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 73
			this.field1888 = var1.readUnsignedByte();
		} else if (var2 == 9) { // L: 74
			this.field1883 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 75
			this.field1890 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 76
			this.field1891 = var1.readUnsignedByte();
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1519522081"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field1883 == -1) { // L: 92
			if (this.field1884 != null) { // L: 93
				this.field1883 = 2;
			} else {
				this.field1883 = 0; // L: 94
			}
		}

		if (this.field1890 == -1) { // L: 96
			if (this.field1884 != null) { // L: 97
				this.field1890 = 2;
			} else {
				this.field1890 = 0; // L: 98
			}
		}

	} // L: 100

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lgr;II)Lgr;",
		garbageValue = "-2056462779"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lgr;IIB)Lgr;",
		garbageValue = "-63"
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
			if (var3 == 1) {
				var5.rotateY270Ccw(); // L: 119
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lgr;II)Lgr;",
		garbageValue = "1547720783"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lgr;ILfl;II)Lgr;",
		garbageValue = "-924612466"
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
				var7.animate2(var5, var2, var6, var4, this.field1884); // L: 153
				return var7; // L: 154
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lgr;II)Lgr;",
		garbageValue = "1569515982"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2003025544"
	)
	public static int method3149(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 42
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 43
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 44
		var0 += var0 >>> 8; // L: 45
		var0 += var0 >>> 16; // L: 46
		return var0 & 255; // L: 47
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)Z",
		garbageValue = "376048815"
	)
	static final boolean method3148(Widget var0) {
		int var1 = var0.contentType; // L: 11093
		if (var1 == 205) { // L: 11094
			Client.logoutTimer = 250; // L: 11095
			return true; // L: 11096
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11098
				var2 = (var1 - 300) / 2; // L: 11099
				var3 = var1 & 1; // L: 11100
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11101
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11103
				var2 = (var1 - 314) / 2; // L: 11104
				var3 = var1 & 1; // L: 11105
				Client.playerAppearance.method4703(var2, var3 == 1); // L: 11106
			}

			if (var1 == 324) { // L: 11108
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) { // L: 11109
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 11110
				PacketBufferNode var4 = class21.getPacketBufferNode(ClientPacket.field2674, Client.packetWriter.isaacCipher); // L: 11112
				Client.playerAppearance.write(var4.packetBuffer); // L: 11113
				Client.packetWriter.addNode(var4); // L: 11114
				return true; // L: 11115
			} else {
				return false; // L: 11117
			}
		}
	}
}
