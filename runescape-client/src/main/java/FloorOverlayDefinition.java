import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -895663505
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1431978933
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("o")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1633990945
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1872138701
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1122011313
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 358729949
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1228616867
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1504346497
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2075535817
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	} // L: 23

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) { // L: 37
			this.setHsl(this.secondaryRgb); // L: 38
			this.secondaryHue = this.hue; // L: 39
			this.secondarySaturation = this.saturation; // L: 40
			this.secondaryLightness = this.lightness; // L: 41
		}

		this.setHsl(this.primaryRgb); // L: 43
	} // L: 44

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "-730203033"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 48
			if (var3 == 0) { // L: 49
				return; // L: 52
			}

			this.decodeNext(var1, var3, var2); // L: 50
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;III)V",
		garbageValue = "641310816"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 55
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte(); // L: 56
		} else if (var2 == 5) { // L: 57
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 58
		} else if (var2 == 8) { // L: 59
		}

	} // L: 61

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 64
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 65
		double var6 = (double)(var1 & 255) / 256.0D; // L: 66
		double var8 = var2; // L: 67
		if (var4 < var2) { // L: 68
			var8 = var4;
		}

		if (var6 < var8) { // L: 69
			var8 = var6;
		}

		double var10 = var2; // L: 70
		if (var4 > var2) { // L: 71
			var10 = var4;
		}

		if (var6 > var10) { // L: 72
			var10 = var6;
		}

		double var12 = 0.0D; // L: 73
		double var14 = 0.0D; // L: 74
		double var16 = (var10 + var8) / 2.0D; // L: 75
		if (var10 != var8) { // L: 76
			if (var16 < 0.5D) { // L: 77
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 78
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 79
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 80
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 81
			}
		}

		var12 /= 6.0D; // L: 83
		this.hue = (int)(var12 * 256.0D); // L: 84
		this.saturation = (int)(var14 * 256.0D); // L: 85
		this.lightness = (int)(var16 * 256.0D); // L: 86
		if (this.saturation < 0) { // L: 87
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 88
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 89
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 90
			this.lightness = 255;
		}

	} // L: 91

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lfi;",
		garbageValue = "1313428327"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumComposition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lfq;I)V",
		garbageValue = "1444717536"
	)
	static final void method3427(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) { // L: 95
			for (var10 = 0; var10 < 8; ++var10) { // L: 96
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) { // L: 97
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var3 + var10] &= -16777217;
				}
			}
		}

		Buffer var28 = new Buffer(var0); // L: 100

		for (var10 = 0; var10 < 4; ++var10) { // L: 101
			for (int var11 = 0; var11 < 64; ++var11) { // L: 102
				for (int var12 = 0; var12 < 64; ++var12) { // L: 103
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) { // L: 104
						int var17 = var11 & 7; // L: 109
						int var18 = var12 & 7; // L: 110
						int var19 = var7 & 3; // L: 113
						int var16;
						if (var19 == 0) { // L: 114
							var16 = var17; // L: 115
						} else if (var19 == 1) { // L: 118
							var16 = var18; // L: 119
						} else if (var19 == 2) { // L: 122
							var16 = 7 - var17; // L: 123
						} else {
							var16 = 7 - var18; // L: 126
						}

						int var22 = var16 + var2; // L: 130
						int var25 = var11 & 7; // L: 133
						int var26 = var12 & 7; // L: 134
						int var27 = var7 & 3; // L: 137
						int var24;
						if (var27 == 0) { // L: 138
							var24 = var26; // L: 139
						} else if (var27 == 1) { // L: 142
							var24 = 7 - var25; // L: 143
						} else if (var27 == 2) { // L: 146
							var24 = 7 - var26; // L: 147
						} else {
							var24 = var25; // L: 150
						}

						GameEngine.loadTerrain(var28, var1, var22, var24 + var3, 0, 0, var7); // L: 152
					} else {
						GameEngine.loadTerrain(var28, 0, -1, -1, 0, 0, 0); // L: 154
					}
				}
			}
		}

	} // L: 158
}
