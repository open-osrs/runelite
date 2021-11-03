import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -775773749
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -842998907
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2077270313
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1956452595
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 660177459
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2098968671"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb); // L: 19
	} // L: 20

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "-1624898788"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;III)V",
		garbageValue = "1243167673"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 31
			this.rgb = var1.readMedium();
		}

	} // L: 33

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "44"
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
		if (var8 != var10) { // L: 48
			if (var16 < 0.5D) { // L: 49
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 50
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 51
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 52
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 53
			}
		}

		var12 /= 6.0D; // L: 55
		this.saturation = (int)(var14 * 256.0D); // L: 56
		this.lightness = (int)(var16 * 256.0D); // L: 57
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
			this.hueMultiplier = (int)(var14 * (1.0D - var16) * 512.0D);
		} else {
			this.hueMultiplier = (int)(512.0D * var14 * var16); // L: 63
		}

		if (this.hueMultiplier < 1) { // L: 64
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12); // L: 65
	} // L: 66

	@ObfuscatedName("i")
	public static final void method3190(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				AttackOption.method2308(var0 - 1L); // L: 11
				AttackOption.method2308(1L); // L: 12
			} else {
				AttackOption.method2308(var0); // L: 14
			}

		}
	} // L: 15
}
