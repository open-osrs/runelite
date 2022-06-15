import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4106("", 0, new class326[]{class326.field4080}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4103("", 1, new class326[]{class326.field4083, class326.field4080}),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4104("", 2, new class326[]{class326.field4083, class326.field4079, class326.field4080}),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4105("", 3, new class326[]{class326.field4083}),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4115("", 4),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4117("", 5, new class326[]{class326.field4083, class326.field4080}),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4108("", 6, new class326[]{class326.field4080}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4102("", 8, new class326[]{class326.field4083, class326.field4080}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4107("", 9, new class326[]{class326.field4083, class326.field4079}),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4111("", 10, new class326[]{class326.field4083}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4112("", 11, new class326[]{class326.field4083}),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4113("", 12, new class326[]{class326.field4083, class326.field4080}),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field4110("", 13, new class326[]{class326.field4083});

	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -2136536725
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("HitSplatDefinition_cached")
	static class427 HitSplatDefinition_cached;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2136032221
	)
	@Export("id")
	final int id;
	@ObfuscatedName("u")
	final Set field4116;

	static {
		method6075(); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Llg;)V"
	)
	ModeWhere(String var3, int var4, class326[] var5) {
		this.field4116 = new HashSet();
		this.id = var4; // L: 43
		class326[] var6 = var5; // L: 45

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 46
			class326 var8 = var6[var7]; // L: 47
			this.field4116.add(var8); // L: 48
		}

	} // L: 51

	ModeWhere(String var3, int var4) {
		this.field4116 = new HashSet(); // L: 32
		this.id = var4; // L: 39
	} // L: 40

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 55
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfk;",
		garbageValue = "1173982871"
	)
	static HorizontalAlignment[] method6076() {
		return new HorizontalAlignment[]{HorizontalAlignment.field1905, HorizontalAlignment.field1910, HorizontalAlignment.HorizontalAlignment_centered}; // L: 14
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Llz;",
		garbageValue = "110"
	)
	static ModeWhere[] method6075() {
		return new ModeWhere[]{field4107, field4106, field4110, field4112, field4102, field4111, field4113, field4108, field4115, field4104, field4105, field4117, field4103}; // L: 35
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "941818161"
	)
	public static byte[] method6082() {
		byte[] var0 = new byte[24]; // L: 277

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 279
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 280

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 281 282 283
			}

			if (var1 >= 24) {
				throw new IOException(); // L: 285
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 288
				var0[var2] = -1;
			}
		}

		return var0; // L: 290
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "16"
	)
	static final int method6079(int var0, int var1) {
		if (var0 == -2) { // L: 927
			return 12345678;
		} else if (var0 == -1) { // L: 928
			if (var1 < 2) { // L: 929
				var1 = 2;
			} else if (var1 > 126) { // L: 930
				var1 = 126;
			}

			return var1; // L: 931
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 933
			if (var1 < 2) { // L: 934
				var1 = 2;
			} else if (var1 > 126) { // L: 935
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 936
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Llc;",
		garbageValue = "-1168566075"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 2030
		if (JagexCache.JagexCache_dat2File != null) { // L: 2031
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class359.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, CollisionMap.masterDisk, var0, var1, var2, var3, var4); // L: 2032
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "4"
	)
	static String method6080(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12330
		if (Client.gameBuild == 1) { // L: 12331
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12332
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12333
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12334
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12335
			var0 = "local";
		}

		String var3 = ""; // L: 12336
		if (GrandExchangeOfferTotalQuantityComparator.field4045 != null) { // L: 12337
			var3 = "/p=" + GrandExchangeOfferTotalQuantityComparator.field4045;
		}

		String var4 = "runescape.com"; // L: 12338
		return var2 + var0 + "." + var4 + "/l=" + class134.clientLanguage + "/a=" + class17.field99 + var3 + "/"; // L: 12339
	}
}
