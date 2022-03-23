import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("d")
	@Export("name")
	public final String name;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1143281773
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 21
		this.id = var5; // L: 22
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;B)V",
		garbageValue = "36"
	)
	public static void method5783(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-907530629"
	)
	static void method5785() {
		class150.method3089(24); // L: 2086
		GrandExchangeEvent.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2087
	} // L: 2088

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(S)Lon;",
		garbageValue = "10040"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return ClanChannel.worldMap; // L: 664
	}
}
