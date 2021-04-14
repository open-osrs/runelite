import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
public enum class337 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	field3920(3, 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	field3922(2, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	field3921(1, 3),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	field3925(0, 10);

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1527224895
	)
	final int field3923;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 436920949
	)
	final int field3924;

	class337(int var3, int var4) {
		this.field3923 = var3; // L: 16
		this.field3924 = var4; // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3924; // L: 21
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-405584171"
	)
	static String method5986(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lir;III)[Loh;",
		garbageValue = "738130292"
	)
	public static SpritePixels[] method5985(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) { // L: 58
			var3 = false; // L: 59
		} else {
			class244.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			SpritePixels[] var5 = new SpritePixels[class124.SpriteBuffer_spriteCount]; // L: 68

			for (int var6 = 0; var6 < class124.SpriteBuffer_spriteCount; ++var6) { // L: 69
				SpritePixels var7 = var5[var6] = new SpritePixels(); // L: 70
				var7.width = class395.SpriteBuffer_spriteWidth; // L: 71
				var7.height = class395.SpriteBuffer_spriteHeight; // L: 72
				var7.xOffset = class0.SpriteBuffer_xOffsets[var6]; // L: 73
				var7.yOffset = Interpreter.SpriteBuffer_yOffsets[var6]; // L: 74
				var7.subWidth = class395.SpriteBuffer_spriteWidths[var6]; // L: 75
				var7.subHeight = class157.SpriteBuffer_spriteHeights[var6]; // L: 76
				int var8 = var7.subWidth * var7.subHeight; // L: 77
				byte[] var9 = class223.SpriteBuffer_pixels[var6]; // L: 78
				var7.pixels = new int[var8]; // L: 79

				for (int var10 = 0; var10 < var8; ++var10) { // L: 80
					var7.pixels[var10] = Varps.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			WorldMapDecorationType.method4370(); // L: 82
			return var5; // L: 85
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1948443713"
	)
	public static void method5984(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 48
		VarbitComposition var2;
		if (var3 != null) { // L: 49
			var2 = var3; // L: 50
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 53
			var3 = new VarbitComposition(); // L: 54
			if (var4 != null) { // L: 55
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0); // L: 56
			var2 = var3; // L: 57
		}

		int var8 = var2.baseVar; // L: 60
		int var5 = var2.startBit; // L: 61
		int var6 = var2.endBit; // L: 62
		int var7 = Varps.Varps_masks[var6 - var5]; // L: 63
		if (var1 < 0 || var1 > var7) { // L: 64
			var1 = 0;
		}

		var7 <<= var5; // L: 65
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7; // L: 66
	} // L: 67
}
