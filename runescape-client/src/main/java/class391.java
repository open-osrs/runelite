import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public class class391 implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	public static final class391 field4240;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	public static final class391 field4241;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	public static final class391 field4238;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -1479226469
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1478463419
	)
	final int field4239;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -52855613
	)
	public final int field4237;
	@ObfuscatedName("g")
	public final Class field4246;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	final class387 field4242;

	static {
		field4240 = new class391(2, 0, Integer.class, new class388());
		field4241 = new class391(0, 1, Long.class, new class390());
		field4238 = new class391(1, 2, String.class, new class392());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lnt;)V"
	)
	class391(int var1, int var2, Class var3, class387 var4) {
		this.field4239 = var1;
		this.field4237 = var2;
		this.field4246 = var3;
		this.field4242 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4237;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)Ljava/lang/Object;",
		garbageValue = "925014679"
	)
	public Object method6713(Buffer var1) {
		return this.field4242.vmethod6724(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Loa;",
		garbageValue = "-80"
	)
	public static class391 method6710(Class var0) {
		class391[] var1 = new class391[]{field4240, field4238, field4241};
		class391[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class391 var4 = var2[var3];
			if (var4.field4246 == var0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1580575077"
	)
	public static boolean method6716(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class316.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lot;I)V",
		garbageValue = "-1683603264"
	)
	public static void method6711(Object var0, Buffer var1) {
		Class var3 = var0.getClass();
		class391 var4 = method6710(var3);
		if (var4 == null) {
			throw new IllegalArgumentException();
		} else {
			class387 var2 = var4.field4242;
			var2.vmethod6721(var0, var1);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "1085881641"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6 + var1);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) {
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) {
				var3[var6 + var4] = -126;
			} else if (var7 == 402) {
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) {
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) {
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) {
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) {
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var6 + var4] = -119;
			} else if (var7 == 352) {
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) {
				var3[var6 + var4] = -117;
			} else if (var7 == 338) {
				var3[var6 + var4] = -116;
			} else if (var7 == 381) {
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) {
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) {
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) {
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) {
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) {
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105;
			} else if (var7 == 732) {
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) {
				var3[var6 + var4] = -103;
			} else if (var7 == 353) {
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) {
				var3[var6 + var4] = -101;
			} else if (var7 == 339) {
				var3[var6 + var4] = -100;
			} else if (var7 == 382) {
				var3[var6 + var4] = -98;
			} else if (var7 == 376) {
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63;
			}
		}

		return var5;
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IIIB)V",
		garbageValue = "46"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				MouseHandler.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
