import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3989(6, 22, false, false, true),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3984(7, 41, false, false, true),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3990(8, 42, false, false, true);

	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -455840439
	)
	static int field3985;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1489316805
	)
	@Export("id")
	final int id;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -468786571
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("c")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("w")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 26
		this.modIcon = var4; // L: 27
		this.isPrivileged = var6; // L: 28
		this.isUser = var7; // L: 29
	} // L: 30

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 34
	}
}
