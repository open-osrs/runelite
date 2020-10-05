import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1526550495
	)
	int rgb;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -196392257
	)
	public int hue;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1341685519
	)
	public int saturation;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 57935727
	)
	public int lightness;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1946992829
	)
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	public void postDecode() {
		this.setHsl(this.rgb); // L: 23
	} // L: 24

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "-1970476156"
	)
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 28
			if (var3 == 0) { // L: 29
				return; // L: 32
			}

			this.decodeNext(var1, var3, var2); // L: 30
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkf;III)V",
		garbageValue = "-789345955"
	)
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 35
			this.rgb = var1.readMedium();
		}

	} // L: 37

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "39"
	)
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 40
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 41
		double var6 = (double)(var1 & 255) / 256.0D; // L: 42
		double var8 = var2; // L: 43
		if (var4 < var2) { // L: 44
			var8 = var4;
		}

		if (var6 < var8) { // L: 45
			var8 = var6;
		}

		double var10 = var2; // L: 46
		if (var4 > var2) { // L: 47
			var10 = var4;
		}

		if (var6 > var10) { // L: 48
			var10 = var6;
		}

		double var12 = 0.0D; // L: 49
		double var14 = 0.0D; // L: 50
		double var16 = (var8 + var10) / 2.0D; // L: 51
		if (var10 != var8) { // L: 52
			if (var16 < 0.5D) { // L: 53
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 54
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 55
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 56
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 57
			}
		}

		var12 /= 6.0D; // L: 59
		this.saturation = (int)(var14 * 256.0D); // L: 60
		this.lightness = (int)(256.0D * var16); // L: 61
		if (this.saturation < 0) { // L: 62
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 63
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 64
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 65
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 66
			this.hueMultiplier = (int)(512.0D * (1.0D - var16) * var14);
		} else {
			this.hueMultiplier = (int)(512.0D * var14 * var16); // L: 67
		}

		if (this.hueMultiplier < 1) { // L: 68
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12); // L: 69
	} // L: 70
}
