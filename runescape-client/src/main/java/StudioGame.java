import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 1344605477
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("e")
	@Export("name")
	public final String name;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -866380781
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 21
		this.id = var5; // L: 22
	} // L: 23

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}
}
