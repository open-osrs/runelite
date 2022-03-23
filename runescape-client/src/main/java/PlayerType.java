import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3919(6, 22, false, false, true),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3926(7, 41, false, false, true),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3931(8, 42, false, false, true);

	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1546749787
	)
	@Export("id")
	final int id;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1126517569
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("x")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("c")
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
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 34
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqs;",
		garbageValue = "-1527934024"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field4695, FillMode.field4698, FillMode.SOLID}; // L: 15
	}
}
