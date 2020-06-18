import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1755156673
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1396694897
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("p")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 241976547
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 752648345
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1759175445
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1976855017
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -223897525
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1642260111
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 841175665
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "9136"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkn;II)V",
		garbageValue = "1893541080"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lkn;III)V",
		garbageValue = "965813090"
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
		signature = "(IB)V",
		garbageValue = "1"
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
		double var16 = (var8 + var10) / 2.0D;
		if (var10 != var8) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		signature = "([BII)I",
		garbageValue = "-2091622873"
	)
	public static int method4936(byte[] var0, int var1) {
		return Actor.method1822(var0, 0, var1);
	}
}
