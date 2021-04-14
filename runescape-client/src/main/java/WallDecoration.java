import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "[Lhu;"
	)
	static Widget[] field2179;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1866984259
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1233523215
	)
	@Export("x")
	int x;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1569724115
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1106091565
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -790495867
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1527389689
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 221325297
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -7920256203386986359L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1583095637
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "89979729"
	)
	static int method3808(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 55
			var1 /= 2;
		}

		if (var2 > 192) { // L: 56
			var1 /= 2;
		}

		if (var2 > 217) { // L: 57
			var1 /= 2;
		}

		if (var2 > 243) { // L: 58
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 59
		return var3; // L: 60
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)[Lit;",
		garbageValue = "-1357735054"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ironman, PlayerType.field3226, PlayerType.PlayerType_normal}; // L: 20
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "-1850423672"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class44.method521(var0, 10, var1) : Integer.toString(var0); // L: 135 136
	}
}
