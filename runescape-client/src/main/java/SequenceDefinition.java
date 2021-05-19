import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("z")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("t")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("v")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("b")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1353705589
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("i")
	int[] field1892;
	@ObfuscatedName("x")
	public boolean field1898;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 302624317
	)
	public int field1894;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1963322079
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2146887017
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 964366639
	)
	public int field1897;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1889756253
	)
	public int field1886;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1557873209
	)
	public int field1882;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -125818589
	)
	public int field1900;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 15
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 16
	}

	SequenceDefinition() {
		this.frameCount = -1; // L: 21
		this.field1898 = false; // L: 23
		this.field1894 = 5; // L: 24
		this.shield = -1; // L: 25
		this.weapon = -1; // L: 26
		this.field1897 = 99; // L: 27
		this.field1886 = -1; // L: 28
		this.field1882 = -1; // L: 29
		this.field1900 = 2; // L: 30
	} // L: 32

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "492235636"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IB)V",
		garbageValue = "24"
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
			this.field1892 = new int[var3 + 1]; // L: 65

			for (var4 = 0; var4 < var3; ++var4) { // L: 66
				this.field1892[var4] = var1.readUnsignedByte();
			}

			this.field1892[var3] = 9999999; // L: 67
		} else if (var2 == 4) { // L: 69
			this.field1898 = true;
		} else if (var2 == 5) { // L: 70
			this.field1894 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 71
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 72
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 73
			this.field1897 = var1.readUnsignedByte();
		} else if (var2 == 9) { // L: 74
			this.field1886 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 75
			this.field1882 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 76
			this.field1900 = var1.readUnsignedByte();
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field1886 == -1) { // L: 92
			if (this.field1892 != null) { // L: 93
				this.field1886 = 2;
			} else {
				this.field1886 = 0; // L: 94
			}
		}

		if (this.field1882 == -1) { // L: 96
			if (this.field1892 != null) { // L: 97
				this.field1882 = 2;
			} else {
				this.field1882 = 0; // L: 98
			}
		}

	} // L: 100

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lgj;II)Lgj;",
		garbageValue = "-668605957"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2]; // L: 103
		Frames var3 = ParamComposition.getFrames(var2 >> 16); // L: 104
		var2 &= 65535; // L: 105
		if (var3 == null) {
			return var1.toSharedSequenceModel(true); // L: 106
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2)); // L: 107
			var4.animate(var3, var2); // L: 108
			return var4; // L: 109
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lgj;III)Lgj;",
		garbageValue = "2138325603"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2]; // L: 113
		Frames var4 = ParamComposition.getFrames(var2 >> 16); // L: 114
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lgj;IB)Lgj;",
		garbageValue = "86"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2]; // L: 130
		Frames var3 = ParamComposition.getFrames(var2 >> 16); // L: 131
		var2 &= 65535; // L: 132
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true); // L: 133
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2)); // L: 134
			var4.animate(var3, var2); // L: 135
			return var4; // L: 136
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lgj;ILfb;II)Lgj;",
		garbageValue = "-1845064839"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 140
		Frames var5 = ParamComposition.getFrames(var2 >> 16); // L: 141
		var2 &= 65535; // L: 142
		if (var5 == null) { // L: 143
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 144
			Frames var6 = ParamComposition.getFrames(var4 >> 16); // L: 145
			var4 &= 65535; // L: 146
			Model var7;
			if (var6 == null) { // L: 147
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 148
				var7.animate(var5, var2); // L: 149
				return var7; // L: 150
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 152
				var7.animate2(var5, var2, var6, var4, this.field1892); // L: 153
				return var7; // L: 154
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lgj;IB)Lgj;",
		garbageValue = "2"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2]; // L: 158
		Frames var4 = ParamComposition.getFrames(var3 >> 16); // L: 159
		var3 &= 65535; // L: 160
		if (var4 == null) { // L: 161
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null; // L: 162
			int var6 = 0; // L: 163
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 164
				var6 = this.chatFrameIds[var2]; // L: 165
				var5 = ParamComposition.getFrames(var6 >> 16); // L: 166
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljp;III)Lof;",
		garbageValue = "-6114463"
	)
	static IndexedSprite method3091(AbstractArchive var0, int var1, int var2) {
		return !Username.method5711(var0, var1, var2) ? null : GraphicsObject.method1938(); // L: 52 53
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1309555794"
	)
	static byte[] method3087(byte[] var0) {
		int var1 = var0.length; // L: 35
		byte[] var2 = new byte[var1]; // L: 36
		System.arraycopy(var0, 0, var2, 0, var1); // L: 37
		return var2; // L: 38
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "1"
	)
	static final void method3086(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field661; ++var1) { // L: 7698
			int var2 = Client.field662[var1]; // L: 7699
			NPC var3 = Client.npcs[var2]; // L: 7700
			int var4 = var0.readUnsignedByte(); // L: 7701
			int var5;
			int var6;
			int var7;
			if ((var4 & 32) != 0) { // L: 7702
				var5 = var0.method6620(); // L: 7703
				if (var5 == 65535) { // L: 7704
					var5 = -1;
				}

				var6 = var0.method6478(); // L: 7705
				if (var5 == var3.sequence && var5 != -1) { // L: 7706
					var7 = Player.SequenceDefinition_get(var5).field1900; // L: 7707
					if (var7 == 1) { // L: 7708
						var3.sequenceFrame = 0; // L: 7709
						var3.sequenceFrameCycle = 0; // L: 7710
						var3.sequenceDelay = var6; // L: 7711
						var3.field1244 = 0; // L: 7712
					}

					if (var7 == 2) { // L: 7714
						var3.field1244 = 0; // L: 7715
					}
				} else if (var5 == -1 || var3.sequence == -1 || Player.SequenceDefinition_get(var5).field1894 >= Player.SequenceDefinition_get(var3.sequence).field1894) { // L: 7718
					var3.sequence = var5; // L: 7719
					var3.sequenceFrame = 0; // L: 7720
					var3.sequenceFrameCycle = 0; // L: 7721
					var3.sequenceDelay = var6; // L: 7722
					var3.field1244 = 0; // L: 7723
					var3.field1215 = var3.pathLength; // L: 7724
				}
			}

			int var8;
			if ((var4 & 8) != 0) { // L: 7728
				var5 = var0.method6648(); // L: 7729
				var6 = var0.readUnsignedShort(); // L: 7730
				var7 = var3.x - (var5 - JagexCache.baseX - JagexCache.baseX) * 64; // L: 7731
				var8 = var3.y - (var6 - Messages.baseY - Messages.baseY) * 64; // L: 7732
				if (var7 != 0 || var8 != 0) { // L: 7733
					var3.field1247 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 2) != 0) { // L: 7735
				var3.definition = class8.getNpcDefinition(var0.method6620()); // L: 7736
				var3.field1211 = var3.definition.size; // L: 7737
				var3.field1261 = var3.definition.rotation; // L: 7738
				var3.walkSequence = var3.definition.walkSequence; // L: 7739
				var3.walkBackSequence = var3.definition.walkBackSequence; // L: 7740
				var3.walkLeftSequence = var3.definition.walkLeftSequence; // L: 7741
				var3.walkRightSequence = var3.definition.walkRightSequence; // L: 7742
				var3.idleSequence = var3.definition.idleSequence; // L: 7743
				var3.turnLeftSequence = var3.definition.turnLeftSequence; // L: 7744
				var3.turnRightSequence = var3.definition.turnRightSequence; // L: 7745
			}

			if ((var4 & 1) != 0) { // L: 7747
				var3.targetIndex = var0.method6620(); // L: 7748
				if (var3.targetIndex == 65535) { // L: 7749
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 128) != 0) { // L: 7751
				var3.field1236 = var0.method6530(); // L: 7752
				var3.field1252 = var0.method6530(); // L: 7753
				var3.field1251 = var0.method6526(); // L: 7754
				var3.field1253 = var0.method6480(); // L: 7755
				var3.field1254 = var0.method6486() + Client.cycle; // L: 7756
				var3.field1237 = var0.method6620() + Client.cycle; // L: 7757
				var3.field1256 = var0.method6486(); // L: 7758
				var3.pathLength = 1; // L: 7759
				var3.field1215 = 0; // L: 7760
				var3.field1236 += var3.pathX[0]; // L: 7761
				var3.field1252 += var3.pathY[0]; // L: 7762
				var3.field1251 += var3.pathX[0]; // L: 7763
				var3.field1253 += var3.pathY[0]; // L: 7764
			}

			if ((var4 & 64) != 0) { // L: 7766
				var5 = var0.method6478(); // L: 7767
				int var9;
				int var10;
				int var11;
				if (var5 > 0) { // L: 7768
					for (var6 = 0; var6 < var5; ++var6) { // L: 7769
						var8 = -1; // L: 7771
						var9 = -1; // L: 7772
						var10 = -1; // L: 7773
						var7 = var0.readUShortSmart(); // L: 7774
						if (var7 == 32767) { // L: 7775
							var7 = var0.readUShortSmart(); // L: 7776
							var9 = var0.readUShortSmart(); // L: 7777
							var8 = var0.readUShortSmart(); // L: 7778
							var10 = var0.readUShortSmart(); // L: 7779
						} else if (var7 != 32766) { // L: 7781
							var9 = var0.readUShortSmart(); // L: 7782
						} else {
							var7 = -1; // L: 7784
						}

						var11 = var0.readUShortSmart(); // L: 7785
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 7786
					}
				}

				var6 = var0.method6477(); // L: 7789
				if (var6 > 0) { // L: 7790
					for (var7 = 0; var7 < var6; ++var7) { // L: 7791
						var8 = var0.readUShortSmart(); // L: 7792
						var9 = var0.readUShortSmart(); // L: 7793
						if (var9 != 32767) { // L: 7794
							var10 = var0.readUShortSmart(); // L: 7795
							var11 = var0.method6477(); // L: 7796
							int var12 = var9 > 0 ? var0.method6478() : var11; // L: 7797
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 7798
						} else {
							var3.removeHealthBar(var8); // L: 7800
						}
					}
				}
			}

			if ((var4 & 4) != 0) { // L: 7804
				var3.spotAnimation = var0.method6648(); // L: 7805
				var5 = var0.method6428(); // L: 7806
				var3.field1224 = var5 >> 16; // L: 7807
				var3.field1243 = (var5 & 65535) + Client.cycle; // L: 7808
				var3.spotAnimationFrame = 0; // L: 7809
				var3.spotAnimationFrameCycle = 0; // L: 7810
				if (var3.field1243 > Client.cycle) { // L: 7811
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 7812
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 16) != 0) { // L: 7814
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 7815
				var3.overheadTextCyclesRemaining = 100; // L: 7816
			}
		}

	} // L: 7819
}
