import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -503223355
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1970388375
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 274290143
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1605413599
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1454421193
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb); // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "-1891906576"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 24
			if (var3 == 0) { // L: 25
				return; // L: 28
			}

			this.decodeNext(var1, var3, var2); // L: 26
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IIB)V",
		garbageValue = "-108"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 31
			this.rgb = var1.readMedium();
		}

	} // L: 33

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-717507824"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 36
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 37
		double var6 = (double)(var1 & 255) / 256.0D; // L: 38
		double var8 = var2; // L: 39
		if (var4 < var2) { // L: 40
			var8 = var4;
		}

		if (var6 < var8) { // L: 41
			var8 = var6;
		}

		double var10 = var2; // L: 42
		if (var4 > var2) { // L: 43
			var10 = var4;
		}

		if (var6 > var10) { // L: 44
			var10 = var6;
		}

		double var12 = 0.0D; // L: 45
		double var14 = 0.0D; // L: 46
		double var16 = (var10 + var8) / 2.0D; // L: 47
		if (var10 != var8) { // L: 48
			if (var16 < 0.5D) { // L: 49
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 50
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 51
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 52
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 53
			}
		}

		var12 /= 6.0D; // L: 55
		this.saturation = (int)(var14 * 256.0D); // L: 56
		this.lightness = (int)(256.0D * var16); // L: 57
		if (this.saturation < 0) { // L: 58
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 59
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 60
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 61
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 62
			this.hueMultiplier = (int)(512.0D * (1.0D - var16) * var14);
		} else {
			this.hueMultiplier = (int)(512.0D * var14 * var16); // L: 63
		}

		if (this.hueMultiplier < 1) { // L: 64
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12); // L: 65
	} // L: 66
}
