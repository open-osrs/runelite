import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("PlayerType")
public enum PlayerType implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	field3551(6, 22, false, false, true);

	@ObfuscatedName("k")
	static boolean field3563;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 43390917
	)
	@Export("id")
	final int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1602973139
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("q")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("i")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 24
		this.modIcon = var4; // L: 25
		this.isPrivileged = var6; // L: 26
		this.isUser = var7; // L: 27
	} // L: 28

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 31
	}
}
