import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ea")
public class class154 extends class166 {
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = -1435820145
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("v")
	String field1695;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lef;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class154(class155 var1, String var2, String var3) {
		super(var1, var2); // L: 390
		this.this$0 = var1; // L: 389
		this.field1695 = var3; // L: 391
	} // L: 392

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "695673663"
	)
	public int vmethod3297() {
		return 1; // L: 395
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1251344393"
	)
	public String vmethod3296() {
		return this.field1695; // L: 400
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FB)I",
		garbageValue = "1"
	)
	public static int method3129(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F; // L: 15

		for (int var8 = 0; var8 < var1 + 1; ++var8) { // L: 16
			var7 += Math.abs(var0[var8]); // L: 17
		}

		float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class114.field1396; // L: 19
		if (var7 <= var24) { // L: 20
			return -1; // L: 21
		} else {
			float[] var9 = new float[var1 + 1]; // L: 23

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) { // L: 24
				var9[var10] = var0[var10] * (1.0F / var7); // L: 25
			}

			while (Math.abs(var9[var1]) < var24) { // L: 27
				--var1; // L: 28
			}

			var10 = 0; // L: 30
			if (var1 == 0) { // L: 31
				return var10; // L: 32
			} else if (var1 == 1) { // L: 34
				var6[0] = -var9[0] / var9[1]; // L: 35
				boolean var22 = var3 ? var2 < var6[0] + var24 : var2 < var6[0] - var24; // L: 36
				boolean var23 = var5 ? var4 > var6[0] - var24 : var4 > var6[0] + var24; // L: 37
				var10 = var22 && var23 ? 1 : 0; // L: 38
				if (var10 > 0) { // L: 39
					if (var3 && var6[0] < var2) { // L: 40
						var6[0] = var2; // L: 41
					} else if (var5 && var6[0] > var4) { // L: 43
						var6[0] = var4; // L: 44
					}
				}

				return var10; // L: 47
			} else {
				class389 var11 = new class389(var9, var1); // L: 50
				float[] var12 = new float[var1 + 1]; // L: 51

				for (int var13 = 1; var13 <= var1; ++var13) { // L: 52
					var12[var13 - 1] = var9[var13] * (float)var13; // L: 53
				}

				float[] var21 = new float[var1 + 1]; // L: 55
				int var14 = method3129(var12, var1 - 1, var2, false, var4, false, var21);
				if (var14 == -1) {
					return 0;
				} else {
					boolean var15 = false;
					float var17 = 0.0F;
					float var18 = 0.0F;
					float var19 = 0.0F; // L: 64

					for (int var20 = 0; var20 <= var14; ++var20) {
						if (var10 > var1) {
							return var10;
						}

						float var16;
						if (var20 == 0) { // L: 67
							var16 = var2; // L: 68
							var18 = MidiPcmStream.method5405(var9, var1, var2);
							if (Math.abs(var18) <= var24 && var3) { // L: 70
								var6[var10++] = var2;
							}
						} else {
							var16 = var19; // L: 73
							var18 = var17;
						}

						if (var14 == var20) { // L: 76
							var19 = var4; // L: 77
							var15 = false;
						} else {
							var19 = var21[var20];
						}

						var17 = MidiPcmStream.method5405(var9, var1, var19);
						if (var15) {
							var15 = false; // L: 85
						} else if (Math.abs(var17) < var24) { // L: 88
							if (var14 != var20 || var5) {
								var6[var10++] = var19; // L: 90
								var15 = true; // L: 91
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) { // L: 94
							var6[var10++] = UserList.method6823(var11, var16, var19, 0.0F);
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) { // L: 96
								var6[var10 - 2] = 0.5F * (var6[var10 - 1] + var6[var10 - 2]);
								--var10;
							}
						}
					}

					return var10;
				}
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "0"
	)
	static boolean method3128(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 54
			try {
				if (!class29.field169.startsWith("win")) { // L: 56
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 57
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 58

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 59
						if (var11.indexOf(var0.charAt(var4)) == -1) { // L: 60
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 62
					return true; // L: 63
				}
			} catch (Throwable var5) { // L: 65
				return false; // L: 66
			}
		} else if (var1 == 1) { // L: 69
			try {
				Object var10 = class27.method412(class29.field168, var2, new Object[]{(new URL(class29.field168.getCodeBase(), var0)).toString()}); // L: 71
				return var10 != null; // L: 72
			} catch (Throwable var6) { // L: 74
				return false; // L: 75
			}
		} else if (var1 == 2) { // L: 78
			try {
				class29.field168.getAppletContext().showDocument(new URL(class29.field168.getCodeBase(), var0), "_blank"); // L: 80
				return true; // L: 81
			} catch (Exception var7) { // L: 83
				return false; // L: 84
			}
		} else if (var1 == 3) { // L: 87
			try {
				Applet var3 = class29.field168; // L: 89
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 92
			} catch (Throwable var9) { // L: 95
			}

			try {
				class29.field168.getAppletContext().showDocument(new URL(class29.field168.getCodeBase(), var0), "_top"); // L: 97
				return true; // L: 98
			} catch (Exception var8) { // L: 100
				return false; // L: 101
			}
		} else {
			throw new IllegalArgumentException(); // L: 104
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2051712033"
	)
	static void method3127() {
		if (ClanChannel.worldMap != null) { // L: 3890
			ClanChannel.worldMap.method7313(class160.Client_plane, (class19.localPlayer.x >> 7) + ApproximateRouteStrategy.baseX, (class19.localPlayer.y >> 7) + class250.baseY, false); // L: 3891
			ClanChannel.worldMap.loadCache(); // L: 3892
		}

	} // L: 3894
}
