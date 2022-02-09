import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3858(6, 22, false, false, true),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3856(7, 41, false, false, true),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3857(8, 42, false, false, true);

	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -963004919
	)
	@Export("id")
	final int id;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 714318491
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("u")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("h")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 26
		this.modIcon = var4; // L: 27
		this.isPrivileged = var6; // L: 28
		this.isUser = var7; // L: 29
	} // L: 30

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 34
	}
}
