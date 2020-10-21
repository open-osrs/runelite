import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("FloorOverlayDefinition_cached")
	static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1626409717
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1711745165
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("z")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -245262637
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -334470275
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 530209803
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1645062629
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 390180503
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 700927849
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 862539151
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1333451124"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IB)V",
		garbageValue = "10"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkb;III)V",
		garbageValue = "1891819359"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "23572"
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
			} else if (var10 == var4) { // L: 80
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 81
			}
		}

		var12 /= 6.0D; // L: 83
		this.hue = (int)(256.0D * var12); // L: 84
		this.saturation = (int)(256.0D * var14); // L: 85
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
}
