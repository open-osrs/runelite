import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public class class355 extends class356 {
	public class355(int var1) {
		super(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-1820829801"
	)
	void vmethod6328(Buffer var1, int var2) {
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-86"
	)
	static void method6311() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
				class21.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}

	}
}
