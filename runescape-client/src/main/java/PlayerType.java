import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("PlayerType")
public enum PlayerType implements Enumerated {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	field3540(6, 22, false, false, true);

	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 54331325
	)
	@Export("id")
	final int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -103099681
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("x")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("r")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
