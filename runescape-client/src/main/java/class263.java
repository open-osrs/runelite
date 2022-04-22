import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public class class263 {
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	public static final class263 field3006;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	public static final class263 field3005;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	public static final class263 field3015;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	public static final class263 field3007;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	public static final class263 field3008;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	public static final class263 field3009;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	public static final class263 field3004;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	public static final class263 field3011;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	public static final class263 field3012;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	public static final class263 field3013;

	static {
		field3006 = new class263(5); // L: 5
		field3005 = new class263(4); // L: 6
		field3015 = new class263(6); // L: 7
		field3007 = new class263(7); // L: 8
		field3008 = new class263(5); // L: 9
		field3009 = new class263(3); // L: 10
		field3004 = new class263(14); // L: 11
		field3011 = new class263(15); // L: 12
		field3012 = new class263(2); // L: 13
		field3013 = new class263(4); // L: 14
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "5"
	)
	class263(int var1) {
	} // L: 20

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-1248696661"
	)
	static int method5178(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 75
			boolean var3 = false; // L: 76
			boolean var4 = false; // L: 77
			int var5 = 0; // L: 78
			int var6 = var0.length(); // L: 79

			for (int var7 = 0; var7 < var6; ++var7) { // L: 80
				char var8 = var0.charAt(var7); // L: 81
				if (var7 == 0) { // L: 82
					if (var8 == '-') { // L: 83
						var3 = true; // L: 84
						continue;
					}

					if (var8 == '+') { // L: 87
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 89
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 90
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 91
						throw new NumberFormatException(); // L: 92
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 93
					throw new NumberFormatException();
				}

				if (var3) { // L: 94
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 95
				if (var9 / var1 != var5) { // L: 96
					throw new NumberFormatException();
				}

				var5 = var9; // L: 97
				var4 = true; // L: 98
			}

			if (!var4) { // L: 100
				throw new NumberFormatException();
			} else {
				return var5; // L: 101
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
