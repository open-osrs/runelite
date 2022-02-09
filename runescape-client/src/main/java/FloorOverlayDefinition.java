import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("HitSplatDefinition_cached")
	static class409 HitSplatDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1253258649
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2096043849
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("r")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 583754113
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -457325531
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1533328135
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 61984717
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1537463893
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1841738529
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1909179785
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue; // L: 26
			this.secondarySaturation = this.saturation; // L: 27
			this.secondaryLightness = this.lightness; // L: 28
		}

		this.setHsl(this.primaryRgb); // L: 30
	} // L: 31

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "207241390"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 35
			if (var3 == 0) { // L: 36
				return; // L: 39
			}

			this.decodeNext(var1, var3, var2); // L: 37
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;III)V",
		garbageValue = "-1432325027"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 42
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte(); // L: 43
		} else if (var2 == 5) { // L: 44
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 45
		} else if (var2 == 8) { // L: 46
		}

	} // L: 48

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-38"
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
		this.hue = (int)(256.0D * var12); // L: 71
		this.saturation = (int)(var14 * 256.0D); // L: 72
		this.lightness = (int)(256.0D * var16); // L: 73
		if (this.saturation < 0) { // L: 74
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 75
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 76
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 77
			this.lightness = 255;
		}

	} // L: 78

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "18"
	)
	static void method3588(int var0) {
		class370.field4230 = var0; // L: 22
		class370.field4235 = new class370[var0]; // L: 23
		class370.field4231 = 0; // L: 24
	} // L: 25

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2023848504"
	)
	static String method3573() {
		String var0;
		if (class424.clientPreferences.hideUsername) { // L: 246
			String var2 = Login.Login_username; // L: 248
			int var4 = var2.length(); // L: 251
			char[] var5 = new char[var4]; // L: 253

			for (int var6 = 0; var6 < var4; ++var6) { // L: 254
				var5[var6] = '*';
			}

			String var3 = new String(var5); // L: 255
			var0 = var3; // L: 259
		} else {
			var0 = Login.Login_username; // L: 261
		}

		return var0; // L: 262
	}
}
