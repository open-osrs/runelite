import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public abstract class class166 {
	@ObfuscatedName("g")
	String field1800;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lef;Ljava/lang/String;)V"
	)
	class166(class155 var1, String var2) {
		this.this$0 = var1; // L: 349
		this.field1800 = var2; // L: 350
	} // L: 351

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "695673663"
	)
	public abstract int vmethod3297();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1251344393"
	)
	public String vmethod3296() {
		return null; // L: 360
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2036911205"
	)
	public int vmethod3299() {
		return -1; // L: 364
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-188699154"
	)
	public String method3295() {
		return this.field1800; // L: 354
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;B)V",
		garbageValue = "-2"
	)
	public static void method3310(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "536525986"
	)
	public static int[] method3311() {
		int[] var0 = new int[KeyHandler.field134]; // L: 248

		for (int var1 = 0; var1 < KeyHandler.field134; ++var1) { // L: 249
			var0[var1] = KeyHandler.field133[var1]; // L: 250
		}

		return var0; // L: 252
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Lcw;ZB)V",
		garbageValue = "-64"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4303
			var0.isUnanimated = false; // L: 4304
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) { // L: 4305 4306
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4308
			int var3 = var0.y >> 7; // L: 4309
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4310
				long var4 = MilliClock.calculateTag(0, 0, 0, false, var0.index); // L: 4311
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4312
					var0.isUnanimated = false; // L: 4313
					var0.tileHeight = Archive.getTileHeight(var0.x, var0.y, class160.Client_plane); // L: 4314
					var0.playerCycle = Client.cycle; // L: 4315
					FriendSystem.scene.addNullableObject(class160.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 4316
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4319
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4320
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4321
					}

					var0.tileHeight = Archive.getTileHeight(var0.x, var0.y, class160.Client_plane); // L: 4323
					var0.playerCycle = Client.cycle; // L: 4324
					FriendSystem.scene.drawEntity(class160.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4325
				}
			}
		}

	} // L: 4329
}
