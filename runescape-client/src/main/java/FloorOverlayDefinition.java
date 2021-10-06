import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 277028007
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1201778655
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("m")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1687723845
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2057236633
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 115242175
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -636729447
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -566217293
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 904207115
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 445278127
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1537548599"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-396376326"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lot;III)V",
		garbageValue = "2051623974"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) {
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1202743060"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var10 != var8) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(256.0D * var12);
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(var16 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "403924203"
	)
	public static int method3343(int var0) {
		return class245.field2899[var0];
	}
}
