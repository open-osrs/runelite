import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3652(6, 22, false, false, true),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3649(7, 41, false, false, true),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3650(8, 42, false, false, true);

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1222118175
	)
	@Export("id")
	final int id;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 279346655
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("y")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("k")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 26
		this.modIcon = var4; // L: 27
		this.isPrivileged = var6; // L: 28
		this.isUser = var7; // L: 29
	} // L: 30

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 33
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		ObjectSound.sortWorlds(WorldMapEvent.World_worlds, 0, WorldMapEvent.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "268701760"
	)
	public static boolean method5239(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false; // L: 224 225
	}
}
