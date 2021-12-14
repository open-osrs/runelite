import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class194 {
	@ObfuscatedName("n")
	static int[][] field2280;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Ldf;"
	)
	class113[] field2278;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -750906287
	)
	int field2279;

	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V"
	)
	class194(Buffer var1, int var2) {
		this.field2278 = new class113[var2];
		this.field2279 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2278.length; ++var3) {
			class113 var4 = new class113(this.field2279, var1, false);
			this.field2278[var3] = var4;
		}

		this.method3921();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1651999275"
	)
	void method3921() {
		class113[] var1 = this.field2278;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class113 var3 = var1[var2];
			if (var3.field1377 >= 0) {
				var3.field1366 = this.field2278[var3.field1377];
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-18164"
	)
	public int method3935() {
		return this.field2278.length;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Ldf;",
		garbageValue = "-989126871"
	)
	class113 method3923(int var1) {
		return this.field2278[var1];
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldf;",
		garbageValue = "-59"
	)
	class113[] method3924() {
		return this.field2278;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldb;II)V",
		garbageValue = "-1934519141"
	)
	void method3939(class120 var1, int var2) {
		this.method3940(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ldb;I[ZZI)V",
		garbageValue = "-2019767334"
	)
	void method3940(class120 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2694();
		int var6 = 0;
		class113[] var7 = this.method3924();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class113 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method2700(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-664085"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		DevicePcmPlayerProvider.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;Lku;Lku;I)V",
		garbageValue = "-1945600553"
	)
	public static void method3937(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		CollisionMap.Widget_archive = var0;
		Widget.Widget_modelsArchive = var1;
		GraphicsObject.Widget_spritesArchive = var2;
		NPC.Widget_fontsArchive = var3;
		MouseRecorder.Widget_interfaceComponents = new Widget[CollisionMap.Widget_archive.getGroupCount()][];
		Widget.Widget_loadedInterfaces = new boolean[CollisionMap.Widget_archive.getGroupCount()];
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)[B",
		garbageValue = "16"
	)
	public static byte[] method3933(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) {
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) {
				var2[var3] = -128;
			} else if (var4 == 8218) {
				var2[var3] = -126;
			} else if (var4 == 402) {
				var2[var3] = -125;
			} else if (var4 == 8222) {
				var2[var3] = -124;
			} else if (var4 == 8230) {
				var2[var3] = -123;
			} else if (var4 == 8224) {
				var2[var3] = -122;
			} else if (var4 == 8225) {
				var2[var3] = -121;
			} else if (var4 == 710) {
				var2[var3] = -120;
			} else if (var4 == 8240) {
				var2[var3] = -119;
			} else if (var4 == 352) {
				var2[var3] = -118;
			} else if (var4 == 8249) {
				var2[var3] = -117;
			} else if (var4 == 338) {
				var2[var3] = -116;
			} else if (var4 == 381) {
				var2[var3] = -114;
			} else if (var4 == 8216) {
				var2[var3] = -111;
			} else if (var4 == 8217) {
				var2[var3] = -110;
			} else if (var4 == 8220) {
				var2[var3] = -109;
			} else if (var4 == 8221) {
				var2[var3] = -108;
			} else if (var4 == 8226) {
				var2[var3] = -107;
			} else if (var4 == 8211) {
				var2[var3] = -106;
			} else if (var4 == 8212) {
				var2[var3] = -105;
			} else if (var4 == 732) {
				var2[var3] = -104;
			} else if (var4 == 8482) {
				var2[var3] = -103;
			} else if (var4 == 353) {
				var2[var3] = -102;
			} else if (var4 == 8250) {
				var2[var3] = -101;
			} else if (var4 == 339) {
				var2[var3] = -100;
			} else if (var4 == 382) {
				var2[var3] = -98;
			} else if (var4 == 376) {
				var2[var3] = -97;
			} else {
				var2[var3] = 63;
			}
		}

		return var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-13840"
	)
	public static int method3926(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
