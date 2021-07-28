import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("Language")
public class Language implements Enumerated {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Lkq;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 1092752765
	)
	static int field3694;
	@ObfuscatedName("f")
	final String field3687;
	@ObfuscatedName("o")
	@Export("language")
	final String language;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 789493505
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field3715, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field3715, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field3715, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field3715, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field3700, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3700, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3715, 6, "MX");
		Language[] var0 = method5217();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkj;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field3687 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "722138687"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIB)V",
		garbageValue = "90"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "238505543"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		Varcs.sortWorlds(class15.World_worlds, 0, class15.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1104134531"
	)
	static final void method5236(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) {
			for (int var4 = 0; var4 < 8; ++var4) {
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkq;",
		garbageValue = "-2080569263"
	)
	static Language[] method5217() {
		return new Language[]{Language_PT, Language_FR, Language_DE, Language_ES, Language_EN, Language_ES_MX, Language_NL};
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Lce;",
		garbageValue = "543100719"
	)
	static AttackOption[] method5233() {
		return new AttackOption[]{AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1157, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1156, AttackOption.AttackOption_hidden};
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lkq;",
		garbageValue = "-774900747"
	)
	public static Language method5215(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}
}
