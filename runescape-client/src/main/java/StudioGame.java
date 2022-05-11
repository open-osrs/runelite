import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = 1529760587
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("p")
	@Export("name")
	public final String name;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2065228417
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 17
		this.id = var5;
	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 22
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-40"
	)
	static String method5590(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}
}
