import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class249 {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljx;",
		garbageValue = "1095870927"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_normal, PlayerType.field3551, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ironman}; // L: 20
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "59"
	)
	static int method4732(int var0, Script var1, boolean var2) {
		if (var0 == 6900) { // L: 4205
			++class13.Interpreter_stringStackSize; // L: 4206
			return 1; // L: 4207
		} else if (var0 == 6950) { // L: 4209
			++WorldMapCacheName.Interpreter_intStackSize; // L: 4210
			return 1; // L: 4211
		} else {
			return 2; // L: 4213
		}
	}
}
