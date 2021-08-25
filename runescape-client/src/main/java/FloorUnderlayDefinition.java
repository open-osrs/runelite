import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("FloorUnderlayDefinition_archive")
	static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("FloorUnderlayDefinition_cached")
	static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("a")
	static byte[][][] field1769;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2135800243
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 928932641
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1423685575
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1235823941
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1016584497
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1292783248"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "625254252"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lot;III)V",
		garbageValue = "1903251237"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-78"
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

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.saturation = (int)(var14 * 256.0D);
		this.lightness = (int)(256.0D * var16);
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

		if (var16 > 0.5D) {
			this.hueMultiplier = (int)(512.0D * var14 * (1.0D - var16));
		} else {
			this.hueMultiplier = (int)(var16 * var14 * 512.0D);
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lpx;",
		garbageValue = "-1201806222"
	)
	public static PrivateChatMode method3025(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field4392, PrivateChatMode.field4394, PrivateChatMode.field4395};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field4393) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "643546348"
	)
	static byte[] method3026(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}
}
