import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class118 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static final class118 field1498;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static final class118 field1491;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static final class118 field1492;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static final class118 field1499;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static final class118 field1490;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static final class118 field1495;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -733991275
	)
	final int field1496;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1625780091
	)
	final int field1497;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -808605415
	)
	final int field1493;

	static {
		field1498 = new class118(0, 0, (String)null, 0); // L: 14
		field1491 = new class118(1, 1, (String)null, 9); // L: 15
		field1492 = new class118(2, 2, (String)null, 3); // L: 16
		field1499 = new class118(3, 3, (String)null, 6); // L: 17
		field1490 = new class118(4, 4, (String)null, 1); // L: 18
		field1495 = new class118(5, 5, (String)null, 3); // L: 19
	}

	class118(int var1, int var2, String var3, int var4) {
		this.field1496 = var1;
		this.field1497 = var2; // L: 30
		this.field1493 = var4; // L: 31
	} // L: 32

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1497; // L: 46
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1599057614"
	)
	int method2732() {
		return this.field1493; // L: 41
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "-898838791"
	)
	public static void method2733(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.getGroupId(var1); // L: 26
		int var6 = var0.getFileId(var5, var2); // L: 27
		UserComparator8.method2574(var0, var5, var6, var3, var4); // L: 28
	} // L: 29

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkg;",
		garbageValue = "-495384223"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field3989, PlayerType.PlayerType_ironman, PlayerType.field3984, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_normal, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field3990}; // L: 22
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lca;I)Z",
		garbageValue = "1081302246"
	)
	static boolean method2720(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 5020
			return false;
		} else if (ModelData0.localPlayer != var0) { // L: 5021
			boolean var1 = (Client.drawPlayerNames & 4) != 0; // L: 5024
			return var1 || SoundSystem.method779() && var0.isFriend() || class116.method2685() && var0.isFriendsChatMember(); // L: 5026
		} else {
			return class21.method274(); // L: 5028
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "5517"
	)
	static boolean method2721() {
		return class12.clientPreferences.method2243() >= Client.field484; // L: 12710
	}
}
