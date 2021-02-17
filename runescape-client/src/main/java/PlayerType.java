import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("PlayerType")
public enum PlayerType implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	field3124(6, 22, false, false, true);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1249989015
	)
	@Export("id")
	final int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 597925501
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("z")
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 31
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIII)Llm;",
		garbageValue = "-320192439"
	)
	static SpritePixels method4170(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 38
		long var4 = (long)(var2 << 16 | var0 << 8 | var1); // L: 41
		return (SpritePixels)var3.get(var4); // L: 43
	}
}
