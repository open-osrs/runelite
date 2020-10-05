import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public enum StudioGame implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	game3("game3", "Game 3", 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	game4("game4", "Game 4", 3),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	game5("game5", "Game 5", 4),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("x")
	public final String name;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1491225247
	)
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 21
		this.id = var5; // L: 22
	} // L: 23

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1502336414"
	)
	public static boolean method4230(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0; // L: 13
	}
}
