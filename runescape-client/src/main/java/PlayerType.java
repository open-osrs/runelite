import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("PlayerType")
public enum PlayerType implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("f")
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
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	field3548(6, 22, false, false, true);

	@ObfuscatedName("k")
	@Export("cacheSubPaths")
	public static String[] cacheSubPaths;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -614053173
	)
	@Export("id")
	final int id;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 417414069
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("s")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("u")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 24
		this.modIcon = var4; // L: 25
		this.isPrivileged = var6; // L: 26
		this.isUser = var7; // L: 27
	} // L: 28

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 31
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "77"
	)
	static final void method4857(int var0, int var1, int var2, boolean var3) {
		if (Clock.loadInterface(var0)) { // L: 9766
			class27.resizeInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 9767
		}
	} // L: 9768
}
