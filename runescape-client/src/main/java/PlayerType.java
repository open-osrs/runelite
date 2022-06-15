import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3951(6, 22, false, false, true),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3952(7, 41, false, false, true),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3956(8, 42, false, false, true),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3954(9, 43, false, false, true),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3949(10, 44, false, false, true),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3945(11, 45, false, false, true),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3957(12, 46, false, false, true),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3958(13, 47, false, false, true),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3959(14, 48, false, false, true),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3960(15, 49, false, false, true);

	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1157893365
	)
	@Export("id")
	final int id;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -982051127
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("l")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("a")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 33
		this.modIcon = var4; // L: 34
		this.isPrivileged = var6; // L: 35
		this.isUser = var7; // L: 36
	} // L: 37

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 41
	}
}
