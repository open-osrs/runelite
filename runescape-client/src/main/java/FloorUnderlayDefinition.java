import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 21649565
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 125421579
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1389342831
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1607996817
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 995550405
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-473123862"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb); // L: 34
	} // L: 35

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnu;II)V",
		garbageValue = "1271291801"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 39
			if (var3 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var3, var2); // L: 41
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnu;III)V",
		garbageValue = "-1899368585"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 46
			this.rgb = var1.readMedium();
		}

	} // L: 48

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "6"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 51
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 52
		double var6 = (double)(var1 & 255) / 256.0D; // L: 53
		double var8 = var2; // L: 54
		if (var4 < var2) { // L: 55
			var8 = var4;
		}

		if (var6 < var8) { // L: 56
			var8 = var6;
		}

		double var10 = var2; // L: 57
		if (var4 > var2) { // L: 58
			var10 = var4;
		}

		if (var6 > var10) { // L: 59
			var10 = var6;
		}

		double var12 = 0.0D; // L: 60
		double var14 = 0.0D; // L: 61
		double var16 = (var8 + var10) / 2.0D; // L: 62
		if (var10 != var8) { // L: 63
			if (var16 < 0.5D) { // L: 64
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 65
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 66
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 67
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 68
			}
		}

		var12 /= 6.0D; // L: 70
		this.saturation = (int)(var14 * 256.0D); // L: 71
		this.lightness = (int)(256.0D * var16); // L: 72
		if (this.saturation < 0) { // L: 73
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 74
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 75
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 76
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 77
			this.hueMultiplier = (int)(var14 * (1.0D - var16) * 512.0D);
		} else {
			this.hueMultiplier = (int)(512.0D * var16 * var14); // L: 78
		}

		if (this.hueMultiplier < 1) { // L: 79
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12); // L: 80
	} // L: 81
}
