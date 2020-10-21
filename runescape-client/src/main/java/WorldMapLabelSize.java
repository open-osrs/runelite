import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = -1977795359
	)
	static int field152;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 542681527
	)
	final int field147;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -679221485
	)
	final int field150;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1499246127
	)
	final int field148;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field147 = var1; // L: 19
		this.field150 = var2;
		this.field148 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-747547430"
	)
	boolean method277(float var1) {
		return var1 >= (float)this.field148; // L: 25
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lin;",
		garbageValue = "1762578081"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_ironman, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_normal, PlayerType.PlayerType_jagexModerator, PlayerType.field3125, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_ultimateIronman}; // L: 20
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lab;",
		garbageValue = "-594087890"
	)
	static WorldMapLabelSize[] method273() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_large, WorldMapLabelSize_medium}; // L: 15
	}
}
