import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
public class class431 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class431 field4595;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class431 field4592;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	public static final class431 field4598;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("do")
	static boolean field4602;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1045232419
	)
	final int field4594;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 690785775
	)
	public final int field4596;
	@ObfuscatedName("n")
	public final Class field4593;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	final class427 field4597;

	static {
		field4595 = new class431(1, 0, Integer.class, new class428()); // L: 10
		field4592 = new class431(0, 1, Long.class, new class430()); // L: 23
		field4598 = new class431(2, 2, String.class, new class432()); // L: 36
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lpw;)V"
	)
	class431(int var1, int var2, Class var3, class427 var4) {
		this.field4594 = var1; // L: 59
		this.field4596 = var2; // L: 60
		this.field4593 = var3; // L: 61
		this.field4597 = var4; // L: 62
	} // L: 63

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4596; // L: 94
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)Ljava/lang/Object;",
		garbageValue = "1124863933"
	)
	public Object method7581(Buffer var1) {
		return this.field4597.vmethod7598(var1); // L: 98
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "32"
	)
	static final void method7593(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 79
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 80
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 81
					class392.field4374[0][var5][var4] = 127; // L: 82
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpk;",
		garbageValue = "1"
	)
	public static class431[] method7584() {
		return new class431[]{field4592, field4595, field4598}; // L: 55
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpi;B)V",
		garbageValue = "54"
	)
	public static void method7579(Object var0, Buffer var1) {
		Class var3 = var0.getClass(); // L: 67
		class431[] var5 = method7584(); // L: 72
		int var6 = 0;

		class431 var4;
		while (true) {
			if (var6 >= var5.length) {
				var4 = null; // L: 83
				break;
			}

			class431 var7 = var5[var6]; // L: 74
			if (var3 == var7.field4593) { // L: 76
				var4 = var7; // L: 77
				break;
			}

			++var6; // L: 73
		}

		if (var4 == null) { // L: 86
			throw new IllegalArgumentException();
		} else {
			class427 var2 = var4.field4597; // L: 87
			var2.vmethod7597(var0, var1); // L: 90
		}
	} // L: 91

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;Ljava/lang/String;Ljava/lang/String;I)Lmd;",
		garbageValue = "986567968"
	)
	public static Font method7594(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 149
		int var5 = var0.getFileId(var4, var3); // L: 150
		return class163.method3322(var0, var1, var4, var5); // L: 151
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lky;I)Ljava/lang/String;",
		garbageValue = "695765846"
	)
	static String method7592(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10730
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10731
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10733
					if (var3 == -1) { // L: 10734
						break;
					}

					String var4 = var0.substring(0, var3); // L: 10735
					int var6 = BufferedSource.method6907(var1, var2 - 1); // L: 10737
					String var5;
					if (var6 < 999999999) { // L: 10739
						var5 = Integer.toString(var6); // L: 10740
					} else {
						var5 = "*"; // L: 10743
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 10745
				}
			}
		}

		return var0; // L: 10749
	}
}
