import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("mouseWheel")
	static class158 mouseWheel;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1429096249
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2131658559
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1741045209
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1117975603
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("b")
	@Export("action")
	String action;

	MenuAction() {
	} // L: 12699

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "942696763"
	)
	static final void method1907() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7751 7752 7795
			if (var0.hitpoints > 0) { // L: 7753
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) { // L: 7754
				if (var0.objectId >= 0) { // L: 7756
					var2 = var0.objectId; // L: 7758
					var3 = var0.field1105; // L: 7759
					var4 = class146.getObjectDefinition(var2); // L: 7761
					if (var3 == 11) { // L: 7762
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) { // L: 7763
						var3 = 4;
					}

					var1 = var4.method3664(var3); // L: 7764
					if (!var1) { // L: 7766
						continue;
					}
				}

				ClanChannel.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1104, var0.field1105); // L: 7768
				var0.remove(); // L: 7769
			} else {
				if (var0.delay > 0) { // L: 7773
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) { // L: 7774
					if (var0.id >= 0) { // L: 7776
						var2 = var0.id; // L: 7778
						var3 = var0.field1107; // L: 7779
						var4 = class146.getObjectDefinition(var2); // L: 7781
						if (var3 == 11) { // L: 7782
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) { // L: 7783
							var3 = 4;
						}

						var1 = var4.method3664(var3); // L: 7784
						if (!var1) { // L: 7786
							continue;
						}
					}

					ClanChannel.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1107); // L: 7788
					var0.delay = -1; // L: 7789
					if (var0.id == var0.objectId && var0.objectId == -1) { // L: 7790
						var0.remove();
					} else if (var0.id == var0.objectId && var0.orientation == var0.field1104 && var0.field1105 == var0.field1107) { // L: 7791
						var0.remove();
					}
				}
			}
		}

	} // L: 7797
}
