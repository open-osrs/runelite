import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -1089450297
	)
	static int field3150;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2120721647
	)
	int field3149;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	MusicPatchNode2 field3131;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -523823363
	)
	int field3128;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1860888427
	)
	int field3133;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 549821861
	)
	int field3132;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 266246813
	)
	int field3147;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 761118797
	)
	int field3136;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1410694573
	)
	int field3137;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1347738891
	)
	int field3138;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2102474829
	)
	int field3139;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 899740579
	)
	int field3140;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1668903755
	)
	int field3141;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 707181103
	)
	int field3142;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1399619147
	)
	int field3143;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1374449229
	)
	int field3144;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1593408009
	)
	int field3145;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1680704123
	)
	int field3134;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 125903423
	)
	int field3135;

	MusicPatchNode() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1075118408"
	)
	void method5292() {
		this.patch = null;
		this.rawSound = null;
		this.field3131 = null;
		this.stream = null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1684371840"
	)
	public static String method5294(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;
		int var5 = var1;

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) {
			int var7 = var0[var5++] & 255;
			if (var7 < 128) {
				if (var7 == 0) {
					var8 = 65533;
				} else {
					var8 = var7;
				}
			} else if (var7 < 192) {
				var8 = 65533;
			} else if (var7 < 224) {
				if (var5 < var6 && (var0[var5] & 192) == 128) {
					var8 = (var7 & 31) << 6 | var0[var5++] & 63;
					if (var8 < 128) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 240) {
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) {
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 < 2048) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 248) {
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) {
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 >= 65536 && var8 <= 1114111) {
						var8 = 65533;
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else {
				var8 = 65533;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "-8"
	)
	public static int method5293(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
