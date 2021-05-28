import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1025207361
	)
	int field2905;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	MusicPatchNode2 field2894;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2143225367
	)
	int field2893;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -723940785
	)
	int field2896;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1566640151
	)
	int field2897;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 970092925
	)
	int field2898;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 215164221
	)
	int field2900;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1146128297
	)
	int field2899;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1897214019
	)
	int field2901;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -955818271
	)
	int field2902;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 370154707
	)
	int field2903;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 939918277
	)
	int field2911;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1951740649
	)
	int field2895;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -292962099
	)
	int field2906;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 726334989
	)
	int field2907;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1237883869
	)
	int field2908;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 730487289
	)
	int field2891;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -576530835
	)
	int field2904;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-88"
	)
	void method4634() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field2894 = null; // L: 36
		this.stream = null; // L: 37
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "-387650050"
	)
	static boolean method4638(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 38
			boolean var3 = false; // L: 39
			boolean var4 = false; // L: 40
			int var5 = 0; // L: 41
			int var6 = var0.length(); // L: 42

			for (int var7 = 0; var7 < var6; ++var7) { // L: 43
				char var8 = var0.charAt(var7); // L: 44
				if (var7 == 0) { // L: 45
					if (var8 == '-') { // L: 46
						var3 = true; // L: 47
						continue;
					}

					if (var8 == '+') { // L: 50
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 52
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 53
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 54
						return false; // L: 55
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 56
					return false;
				}

				if (var3) { // L: 57
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 58
				if (var9 / var1 != var5) { // L: 59
					return false;
				}

				var5 = var9; // L: 60
				var4 = true; // L: 61
			}

			return var4; // L: 63
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
