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
		this.reversed = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lmp;I)I",
		garbageValue = "-427505933"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Low;I)I",
		garbageValue = "801134739"
	)
	static final int method2508(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field4406) {
			case 5:
				return 20;
			default:
				return 12;
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
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ldn;[F[FS)V",
		garbageValue = "5664"
	)
	static void method2504(class115 var0, float[] var1, float[] var2) {
		if (var0 != null) {
			var0.field1406 = var1[0];
			float var3 = var1[3] - var1[0];
			float var4 = var2[3] - var2[0];
			float var5 = var1[1] - var1[0];
			float var6 = 0.0F;
			float var7 = 0.0F;
			if ((double)var5 != 0.0D) {
				var6 = (var2[1] - var2[0]) / var5;
			}

			var5 = var1[3] - var1[2];
			if (0.0D != (double)var5) {
				var7 = (var2[3] - var2[2]) / var5;
			}

			float var8 = 1.0F / (var3 * var3);
			float var9 = var6 * var3;
			float var10 = var7 * var3;
			var0.field1401[0] = var8 * (var9 + var10 - var4 - var4) / var3;
			var0.field1401[1] = (var4 + var4 + var4 - var9 - var9 - var10) * var8;
			var0.field1401[2] = var6;
			var0.field1401[3] = var2[0];
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lbw;Lbw;IZIZB)I",
		garbageValue = "-82"
	)
	static int method2506(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = ReflectionCheck.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = ReflectionCheck.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-452202636"
	)
	static void method2499(String var0) {
		class1.field3 = var0;

		try {
			String var1 = class295.client.getParameter(Integer.toString(18));
			String var2 = class295.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class13.method195(Ignored.method6459() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			class27.method432(class295.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var4) {
		}

	}
}
