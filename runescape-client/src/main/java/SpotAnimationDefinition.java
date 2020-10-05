import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 668491151
	)
	static int field3261;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -478410851
	)
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -19861827
	)
	int archive;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 393054485
	)
	public int sequence;
	@ObfuscatedName("w")
	short[] recolorFrom;
	@ObfuscatedName("g")
	short[] recolorTo;
	@ObfuscatedName("m")
	short[] retextureFrom;
	@ObfuscatedName("n")
	short[] retextureTo;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1945923571
	)
	int widthScale;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1138122677
	)
	int heightScale;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 702880483
	)
	int orientation;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1865720119
	)
	int ambient;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1594131491
	)
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128; // L: 23
		this.heightScale = 128; // L: 24
		this.orientation = 0; // L: 25
		this.ambient = 0; // L: 26
		this.contrast = 0; // L: 27
	} // L: 29

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)V",
		garbageValue = "106"
	)
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 44
			if (var2 == 0) { // L: 45
				return; // L: 48
			}

			this.decodeNext(var1, var2); // L: 46
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "1008523619"
	)
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 51
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 52
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) { // L: 53
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 54
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 55
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 56
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) { // L: 57
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 58
				var3 = var1.readUnsignedByte(); // L: 59
				this.recolorFrom = new short[var3]; // L: 60
				this.recolorTo = new short[var3]; // L: 61

				for (var4 = 0; var4 < var3; ++var4) { // L: 62
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 63
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 64
				}
			} else if (var2 == 41) { // L: 67
				var3 = var1.readUnsignedByte(); // L: 68
				this.retextureFrom = new short[var3]; // L: 69
				this.retextureTo = new short[var3]; // L: 70

				for (var4 = 0; var4 < var3; ++var4) { // L: 71
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 72
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 73
				}
			}
		}

	} // L: 77

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Ler;",
		garbageValue = "-820492992"
	)
	public final Model getModel(int var1) {
		Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id); // L: 80
		if (var2 == null) { // L: 81
			ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0); // L: 82
			if (var3 == null) { // L: 83
				return null;
			}

			int var4;
			if (this.recolorFrom != null) { // L: 84
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 85
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 86
				}
			}

			if (this.retextureFrom != null) { // L: 89
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 90
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 91
				}
			}

			var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 94
			SpotAnimationDefinition_cachedModels.put(var2, (long)this.id); // L: 95
		}

		Model var5;
		if (this.sequence != -1 && var1 != -1) { // L: 98
			var5 = WorldMapRegion.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var5 = var2.toSharedSpotAnimationModel(true); // L: 99
		}

		if (this.widthScale != 128 || this.heightScale != 128) { // L: 100
			var5.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) { // L: 101
			if (this.orientation == 90) { // L: 102
				var5.rotateY90Ccw();
			}

			if (this.orientation == 180) { // L: 103
				var5.rotateY90Ccw(); // L: 104
				var5.rotateY90Ccw(); // L: 105
			}

			if (this.orientation == 270) { // L: 107
				var5.rotateY90Ccw(); // L: 108
				var5.rotateY90Ccw(); // L: 109
				var5.rotateY90Ccw(); // L: 110
			}
		}

		return var5; // L: 113
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)[Lld;",
		garbageValue = "-17"
	)
	static PrivateChatMode[] method4518() {
		return new PrivateChatMode[]{PrivateChatMode.field3823, PrivateChatMode.field3822, PrivateChatMode.field3821}; // L: 11
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-2117209732"
	)
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 159
		int var4 = 0; // L: 160

		for (int var5 = 0; var5 < var2; ++var5) { // L: 161
			int var6 = var0[var5 + var1] & 255; // L: 162
			if (var6 != 0) { // L: 163
				if (var6 >= 128 && var6 < 160) { // L: 164
					char var7 = class297.cp1252AsciiExtension[var6 - 128]; // L: 165
					if (var7 == 0) { // L: 166
						var7 = '?';
					}

					var6 = var7; // L: 167
				}

				var3[var4++] = (char)var6; // L: 169
			}
		}

		return new String(var3, 0, var4); // L: 171
	}
}
