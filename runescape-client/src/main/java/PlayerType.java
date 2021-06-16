import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("PlayerType")
public enum PlayerType implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	field3544(6, 22, false, false, true);

	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1170932769
	)
	@Export("id")
	final int id;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1972754767
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("d")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("z")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 24
		this.modIcon = var4; // L: 25
		this.isPrivileged = var6; // L: 26
		this.isUser = var7; // L: 27
	} // L: 28

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 31
	}
}
