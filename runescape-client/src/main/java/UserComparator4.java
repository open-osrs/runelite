import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lmp;I)I",
		garbageValue = "-427505933"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Low;I)I",
		garbageValue = "801134739"
	)
	static final int method2508(LoginType var0) {
		if (var0 == null) { // L: 16
			return 12; // L: 17
		} else {
			switch(var0.field4406) { // L: 19
			case 5:
				return 20; // L: 21
			default:
				return 12; // L: 23
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([Lbw;II[I[II)V",
		garbageValue = "388391303"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 81
			int var5 = var1 - 1; // L: 82
			int var6 = var2 + 1; // L: 83
			int var7 = (var2 + var1) / 2; // L: 84
			World var8 = var0[var7]; // L: 85
			var0[var7] = var0[var1]; // L: 86
			var0[var1] = var8; // L: 87

			while (var5 < var6) { // L: 88
				boolean var9 = true; // L: 89

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 91

					for (var10 = 0; var10 < 4; ++var10) { // L: 92
						if (var3[var10] == 2) { // L: 95
							var11 = var0[var6].index; // L: 96
							var12 = var8.index; // L: 97
						} else if (var3[var10] == 1) { // L: 99
							var11 = var0[var6].population; // L: 100
							var12 = var8.population; // L: 101
							if (var11 == -1 && var4[var10] == 1) { // L: 102
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 103
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 105
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 106
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 107
						} else {
							var11 = var0[var6].id; // L: 110
							var12 = var8.id; // L: 111
						}

						if (var12 != var11) { // L: 113
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 116 117
								var9 = false; // L: 119
							}
							break;
						}

						if (var10 == 3) { // L: 114
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 124

				do {
					++var5; // L: 126

					for (var10 = 0; var10 < 4; ++var10) { // L: 127
						if (var3[var10] == 2) { // L: 130
							var11 = var0[var5].index; // L: 131
							var12 = var8.index; // L: 132
						} else if (var3[var10] == 1) { // L: 134
							var11 = var0[var5].population; // L: 135
							var12 = var8.population; // L: 136
							if (var11 == -1 && var4[var10] == 1) { // L: 137
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 138
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 140
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 141
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 142
						} else {
							var11 = var0[var5].id; // L: 145
							var12 = var8.id; // L: 146
						}

						if (var12 != var11) { // L: 148
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 151 152
								var9 = false; // L: 154
							}
							break;
						}

						if (var10 == 3) { // L: 149
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 159
					World var13 = var0[var5]; // L: 160
					var0[var5] = var0[var6]; // L: 161
					var0[var6] = var13; // L: 162
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 165
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 166
		}

	} // L: 168

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ldn;[F[FS)V",
		garbageValue = "5664"
	)
	static void method2504(class115 var0, float[] var1, float[] var2) {
		if (var0 != null) { // L: 288
			var0.field1406 = var1[0]; // L: 291
			float var3 = var1[3] - var1[0]; // L: 292
			float var4 = var2[3] - var2[0]; // L: 293
			float var5 = var1[1] - var1[0]; // L: 294
			float var6 = 0.0F; // L: 295
			float var7 = 0.0F; // L: 296
			if ((double)var5 != 0.0D) { // L: 297
				var6 = (var2[1] - var2[0]) / var5; // L: 298
			}

			var5 = var1[3] - var1[2]; // L: 300
			if (0.0D != (double)var5) { // L: 301
				var7 = (var2[3] - var2[2]) / var5; // L: 302
			}

			float var8 = 1.0F / (var3 * var3); // L: 304
			float var9 = var6 * var3; // L: 305
			float var10 = var7 * var3; // L: 306
			var0.field1401[0] = var8 * (var9 + var10 - var4 - var4) / var3; // L: 307
			var0.field1401[1] = (var4 + var4 + var4 - var9 - var9 - var10) * var8; // L: 308
			var0.field1401[2] = var6; // L: 309
			var0.field1401[3] = var2[0]; // L: 310
		}
	} // L: 289 311

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lbw;Lbw;IZIZB)I",
		garbageValue = "-82"
	)
	static int method2506(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = ReflectionCheck.compareWorlds(var0, var1, var2, var3); // L: 199
		if (var6 != 0) { // L: 200
			return var3 ? -var6 : var6; // L: 201
		} else if (var4 == -1) { // L: 204
			return 0;
		} else {
			int var7 = ReflectionCheck.compareWorlds(var0, var1, var4, var5); // L: 205
			return var5 ? -var7 : var7; // L: 206
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-452202636"
	)
	static void method2499(String var0) {
		class1.field3 = var0; // L: 12602

		try {
			String var1 = class295.client.getParameter(Integer.toString(18)); // L: 12604
			String var2 = class295.client.getParameter(Integer.toString(13)); // L: 12605
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12606
			if (var0.length() == 0) { // L: 12607
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class13.method195(Ignored.method6459() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 12608
			}

			class27.method432(class295.client, "document.cookie=\"" + var3 + "\""); // L: 12609
		} catch (Throwable var4) { // L: 12611
		}

	} // L: 12612
}
