import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("StudioGame")
public enum StudioGame implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("t")
	@Export("name")
	public final String name;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2033006109
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 17
		this.id = var5; // L: 18
	} // L: 19

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 22
	}
}
