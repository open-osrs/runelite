import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 3333293732747841481L
	)
	static long field565;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -30883449
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1222733201
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lid;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1049083276"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method4416(var1) || this.archive.method4411(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lco;",
		garbageValue = "-2052034218"
	)
	static Script method1240(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 59
		if (var2 != null) { // L: 60
			return var2; // L: 61
		} else {
			String var3 = String.valueOf(var0); // L: 63
			int var4 = ViewportMouse.archive12.getGroupId(var3); // L: 64
			if (var4 == -1) { // L: 65
				return null; // L: 66
			} else {
				byte[] var5 = ViewportMouse.archive12.takeFileFlat(var4); // L: 68
				if (var5 != null) { // L: 69
					if (var5.length <= 1) { // L: 70
						return null; // L: 71
					}

					var2 = ClientPacket.newScript(var5); // L: 73
					if (var2 != null) { // L: 74
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 75
						return var2; // L: 76
					}
				}

				return null; // L: 79
			}
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Lbi;ZI)V",
		garbageValue = "-788560949"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4830
			var0.isUnanimated = false; // L: 4831
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 4832 4833
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4835
			int var3 = var0.y >> 7; // L: 4836
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4837
				long var4 = GrandExchangeOfferOwnWorldComparator.calculateTag(0, 0, 0, false, var0.index); // L: 4838
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4839
					var0.isUnanimated = false; // L: 4840
					var0.tileHeight = GrandExchangeOfferWorldComparator.getTileHeight(var0.x, var0.y, GrandExchangeOfferUnitPriceComparator.Client_plane); // L: 4841
					var0.playerCycle = Client.cycle; // L: 4842
					ModeWhere.scene.addNullableObject(GrandExchangeOfferUnitPriceComparator.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.field646, var0.field669, var0.field660, var0.field661); // L: 4843
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4846
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4847
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4848
					}

					var0.tileHeight = GrandExchangeOfferWorldComparator.getTileHeight(var0.x, var0.y, GrandExchangeOfferUnitPriceComparator.Client_plane); // L: 4850
					var0.playerCycle = Client.cycle; // L: 4851
					ModeWhere.scene.drawEntity(GrandExchangeOfferUnitPriceComparator.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4852
				}
			}
		}

	} // L: 4856
}
