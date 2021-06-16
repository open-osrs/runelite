import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class class226 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2688;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2683;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2684;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2692;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2693;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2687;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2686;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2689;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2690;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2691;

	static {
		field2688 = new class226(5); // L: 5
		field2683 = new class226(4); // L: 6
		field2684 = new class226(3); // L: 7
		field2692 = new class226(6); // L: 8
		field2693 = new class226(7); // L: 9
		field2687 = new class226(5); // L: 10
		field2686 = new class226(4);
		field2689 = new class226(15);
		field2690 = new class226(2);
		field2691 = new class226(14);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "5"
	)
	class226(int var1) {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkn;I)I",
		garbageValue = "456849187"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		byte var7 = 0; // L: 15
		byte var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = (char)var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = (char)var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			byte var11;
			if (var9 == 198) { // L: 35
				var11 = 69; // L: 36
			} else if (var9 == 230) { // L: 39
				var11 = 101; // L: 40
			} else if (var9 == 223) { // L: 43
				var11 = 115; // L: 44
			} else if (var9 == 338) { // L: 47
				var11 = 69; // L: 48
			} else if (var9 == 339) { // L: 51
				var11 = 101; // L: 52
			} else {
				var11 = 0; // L: 55
			}

			var7 = var11; // L: 57
			byte var12;
			if (var10 == 198) { // L: 60
				var12 = 69; // L: 61
			} else if (var10 == 230) { // L: 64
				var12 = 101; // L: 65
			} else if (var10 == 223) { // L: 68
				var12 = 115; // L: 69
			} else if (var10 == 338) { // L: 72
				var12 = 69; // L: 73
			} else if (var10 == 339) { // L: 76
				var12 = 101; // L: 77
			} else {
				var12 = 0; // L: 80
			}

			var8 = var12; // L: 82
			var9 = class244.standardizeChar(var9, var2); // L: 83
			var10 = class244.standardizeChar(var10, var2); // L: 84
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 85
				var9 = Character.toLowerCase(var9); // L: 86
				var10 = Character.toLowerCase(var10); // L: 87
				if (var10 != var9) { // L: 88
					return SpotAnimationDefinition.lowercaseChar(var9, var2) - SpotAnimationDefinition.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 91

		int var17;
		char var20;
		for (var17 = 0; var17 < var16; ++var17) { // L: 92
			if (var2 == Language.Language_FR) { // L: 93
				var5 = var3 - 1 - var17; // L: 94
				var6 = var4 - 1 - var17; // L: 95
			} else {
				var6 = var17; // L: 97
				var5 = var17;
			}

			char var18 = var0.charAt(var5); // L: 98
			var20 = var1.charAt(var6); // L: 99
			if (var20 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) { // L: 100
				var18 = Character.toLowerCase(var18); // L: 101
				var20 = Character.toLowerCase(var20); // L: 102
				if (var20 != var18) {
					return SpotAnimationDefinition.lowercaseChar(var18, var2) - SpotAnimationDefinition.lowercaseChar(var20, var2); // L: 103
				}
			}
		}

		var17 = var3 - var4; // L: 106
		if (var17 != 0) { // L: 107
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) { // L: 108
				var20 = var0.charAt(var19); // L: 109
				char var13 = var1.charAt(var19); // L: 110
				if (var20 != var13) { // L: 111
					return SpotAnimationDefinition.lowercaseChar(var20, var2) - SpotAnimationDefinition.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 113
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1374315028"
	)
	@Export("updateSoundEffectVolume")
	static final void updateSoundEffectVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11132
		class4.clientPreferences.soundEffectsVolume = var0; // L: 11133
		Actor.savePreferences(); // L: 11134
	} // L: 11135
}
