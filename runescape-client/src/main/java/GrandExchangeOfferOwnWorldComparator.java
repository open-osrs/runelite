import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1422085105
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 414005331
	)
	static int field475;
	@ObfuscatedName("n")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;I)I",
		garbageValue = "-1867608440"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1707101499"
	)
	public static void method1133() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1733564900"
	)
	static void method1134() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			class114.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "10"
	)
	static final boolean method1132(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}
}
