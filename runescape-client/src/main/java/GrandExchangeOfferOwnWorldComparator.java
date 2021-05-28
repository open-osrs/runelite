import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	static Bounds field631;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 1130183005
	)
	static int field632;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static class369 field634;
	@ObfuscatedName("v")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 11583

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljs;Ljs;I)I",
		garbageValue = "-1562146243"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 11586
			return 0;
		} else {
			if (this.filterWorlds) { // L: 11587
				if (Client.worldId == var1.world) { // L: 11588
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 11589
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 11591
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 11599
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 11595
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lep;",
		garbageValue = "-78"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1916477751"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1870393029"
	)
	public static int method1166(int var0) {
		return class229.method4374(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 68
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "1889329497"
	)
	public static int method1176(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 45

		for (int var4 = var1; var4 < var2; ++var4) { // L: 46
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 47
		}

		var3 = ~var3; // L: 49
		return var3; // L: 50
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2022835517"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4390
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4391
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4392
				int var3 = var2.x >> 7; // L: 4393
				int var4 = var2.y >> 7; // L: 4394
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4395
					if (var2.field1239 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4396
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4397
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4398
					}

					long var5 = DevicePcmPlayerProvider.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4400
					var2.playerCycle = Client.cycle; // L: 4401
					AbstractSocket.scene.drawEntity(class22.Client_plane, var2.x, var2.y, class105.getTileHeight(var2.field1239 * 64 - 64 + var2.x, var2.field1239 * 64 - 64 + var2.y, class22.Client_plane), var2.field1239 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4402
				}
			}
		}

	} // L: 4406
}
