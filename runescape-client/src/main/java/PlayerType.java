import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3801(6, 22, false, false, true),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3802(7, 41, false, false, true),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3795(8, 42, false, false, true);

	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1858175947
	)
	@Export("id")
	final int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1675383045
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("v")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("d")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 26
		this.modIcon = var4; // L: 27
		this.isPrivileged = var6; // L: 28
		this.isUser = var7; // L: 29
	} // L: 30

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 34
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1177241334"
	)
	static void method5521(int var0) {
		if (var0 != Login.loginIndex) { // L: 1986
			Login.loginIndex = var0; // L: 1987
		}
	} // L: 1988
}
