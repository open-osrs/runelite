import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -1743026493
	)
	static int field2136;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 67638903
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 222487841
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("l")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1576648291
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1331174071
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1793349537
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 167555719
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -19762575
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1484296667
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1158289255
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1865539852"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) { // L: 28
			this.setHsl(this.secondaryRgb); // L: 29
			this.secondaryHue = this.hue; // L: 30
			this.secondarySaturation = this.saturation; // L: 31
			this.secondaryLightness = this.lightness; // L: 32
		}

		this.setHsl(this.primaryRgb); // L: 34
	} // L: 35

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V",
		garbageValue = "-1353822747"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lpd;IIS)V",
		garbageValue = "995"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 46
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) { // L: 47
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) { // L: 48
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 49
		} else if (var2 == 8) { // L: 50
		}

	} // L: 52

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2044852241"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 55
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 56
		double var6 = (double)(var1 & 255) / 256.0D; // L: 57
		double var8 = var2; // L: 58
		if (var4 < var2) { // L: 59
			var8 = var4;
		}

		if (var6 < var8) { // L: 60
			var8 = var6;
		}

		double var10 = var2; // L: 61
		if (var4 > var2) { // L: 62
			var10 = var4;
		}

		if (var6 > var10) { // L: 63
			var10 = var6;
		}

		double var12 = 0.0D; // L: 64
		double var14 = 0.0D; // L: 65
		double var16 = (var10 + var8) / 2.0D; // L: 66
		if (var8 != var10) { // L: 67
			if (var16 < 0.5D) { // L: 68
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 69
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 70
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 71
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(var12 * 256.0D);
		this.saturation = (int)(var14 * 256.0D);
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

	} // L: 82

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "110"
	)
	public static int method3788(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 72
			boolean var3 = false; // L: 73
			boolean var4 = false; // L: 74
			int var5 = 0; // L: 75
			int var6 = var0.length(); // L: 76

			for (int var7 = 0; var7 < var6; ++var7) { // L: 77
				char var8 = var0.charAt(var7); // L: 78
				if (var7 == 0) { // L: 79
					if (var8 == '-') { // L: 80
						var3 = true; // L: 81
						continue;
					}

					if (var8 == '+') { // L: 84
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 86
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 87
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 88
						throw new NumberFormatException(); // L: 89
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 90
					throw new NumberFormatException();
				}

				if (var3) { // L: 91
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 92
				if (var9 / var1 != var5) { // L: 93
					throw new NumberFormatException();
				}

				var5 = var9; // L: 94
				var4 = true; // L: 95
			}

			if (!var4) { // L: 97
				throw new NumberFormatException();
			} else {
				return var5; // L: 98
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-1419819792"
	)
	static int method3773(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2322
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2323
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = UserComparator3.method2600(var3) ? 1 : 0; // L: 2324
			return 1; // L: 2325
		} else if (var0 == 3501) { // L: 2327
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2328
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class268.method5227(var3) ? 1 : 0; // L: 2329
			return 1; // L: 2330
		} else if (var0 == 3502) { // L: 2332
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2333
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = PcmPlayer.method772(var3) ? 1 : 0; // L: 2334
			return 1; // L: 2335
		} else {
			return 2; // L: 2337
		}
	}
}
