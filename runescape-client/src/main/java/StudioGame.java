import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("z")
	@Export("name")
	public final String name;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -689985923
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
