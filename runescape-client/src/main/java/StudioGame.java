import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("g")
	@Export("name")
	public final String name;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1771412669
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 17
		this.id = var5; // L: 18
	} // L: 19

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 22
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqy;",
		garbageValue = "-466654611"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.field4778, FillMode.field4783}; // L: 15
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1723835093"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 197
			return true;
		} else if (var0 >= 160 && var0 <= 255) { // L: 198
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 199
		}
	}
}
