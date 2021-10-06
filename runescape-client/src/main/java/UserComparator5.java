import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("l")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lmi;Lmi;I)I",
		garbageValue = "438182232"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "576257676"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1109 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = class247.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					PlayerComposition.scene.drawEntity(VertexNormal.Client_plane, var2.x, var2.y, MidiPcmStream.getTileHeight(var2.field1109 * 64 - 64 + var2.x, var2.field1109 * 64 - 64 + var2.y, VertexNormal.Client_plane), var2.field1109 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}
}
