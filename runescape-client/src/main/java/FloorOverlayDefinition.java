import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("FloorOverlayDefinition_archive")
	static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("FloorOverlayDefinition_cached")
	static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 229154339
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 537117493
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("y")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -151922243
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1474561599
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 580468697
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1227736915
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -214097909
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -996907009
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2132940635
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) { // L: 41
			this.setHsl(this.secondaryRgb); // L: 42
			this.secondaryHue = this.hue; // L: 43
			this.secondarySaturation = this.saturation; // L: 44
			this.secondaryLightness = this.lightness; // L: 45
		}

		this.setHsl(this.primaryRgb); // L: 47
	} // L: 48

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "581864251"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 52
			if (var3 == 0) { // L: 53
				return; // L: 56
			}

			this.decodeNext(var1, var3, var2); // L: 54
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lkx;IIB)V",
		garbageValue = "1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 59
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) { // L: 60
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) { // L: 61
			this.hideUnderlay = false;
		} else if (var2 == 7) { // L: 62
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) { // L: 63
		}

	} // L: 65

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "115"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 68
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 69
		double var6 = (double)(var1 & 255) / 256.0D; // L: 70
		double var8 = var2; // L: 71
		if (var4 < var2) { // L: 72
			var8 = var4;
		}

		if (var6 < var8) { // L: 73
			var8 = var6;
		}

		double var10 = var2; // L: 74
		if (var4 > var2) { // L: 75
			var10 = var4;
		}

		if (var6 > var10) { // L: 76
			var10 = var6;
		}

		double var12 = 0.0D; // L: 77
		double var14 = 0.0D; // L: 78
		double var16 = (var8 + var10) / 2.0D; // L: 79
		if (var8 != var10) { // L: 80
			if (var16 < 0.5D) { // L: 81
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 82
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 83
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 84
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 85
			}
		}

		var12 /= 6.0D; // L: 87
		this.hue = (int)(256.0D * var12); // L: 88
		this.saturation = (int)(256.0D * var14); // L: 89
		this.lightness = (int)(256.0D * var16); // L: 90
		if (this.saturation < 0) { // L: 91
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 92
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 93
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 94
			this.lightness = 255;
		}

	} // L: 95
}
