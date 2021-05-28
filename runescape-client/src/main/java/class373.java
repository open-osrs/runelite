import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
final class class373 implements class370 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnd;I)V",
		garbageValue = "510448708"
	)
	public void vmethod6493(Object var1, Buffer var2) {
		this.method6465((Long)var1, var2); // L: 33
	} // L: 34

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)Ljava/lang/Object;",
		garbageValue = "-1954872085"
	)
	public Object vmethod6500(Buffer var1) {
		return var1.readLong(); // L: 29
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lnd;I)V",
		garbageValue = "-1988673452"
	)
	void method6465(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 25
	} // L: 26

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1793660977"
	)
	static void method6474() {
		int var0 = Players.Players_count; // L: 4352
		int[] var1 = Players.Players_indices; // L: 4353

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4354
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 4355
				NetSocket.addPlayerToScene(Client.players[var1[var2]], true); // L: 4356
			}
		}

	} // L: 4358
}
