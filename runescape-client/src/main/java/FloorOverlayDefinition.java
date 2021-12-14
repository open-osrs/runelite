import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("FloorOverlayDefinition_cached")
	static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1992003453
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1656898905
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("t")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1327711179
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1999079223
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1848123961
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1467113517
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1581427721
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -4711899
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2013975253
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-40"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "105"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;III)V",
		garbageValue = "624487611"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1711015885"
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
		if (var8 != var10) {
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
		this.hue = (int)(var12 * 256.0D);
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1253625598"
	)
	public static int method3618(int var0) {
		return MouseRecorder.method2159(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1421542986"
	)
	public static int method3636(int var0, int var1, int var2) {
		int var3 = WorldMapEvent.method4942(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}
}
