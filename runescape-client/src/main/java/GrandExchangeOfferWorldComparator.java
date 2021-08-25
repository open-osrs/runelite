import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;I)I",
		garbageValue = "16711680"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1164500663"
	)
	public static int[] method5320() {
		int[] var0 = new int[KeyHandler.field114];

		for (int var1 = 0; var1 < KeyHandler.field114; ++var1) {
			var0[var1] = KeyHandler.field131[var1];
		}

		return var0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lbh;",
		garbageValue = "-994798359"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return SequenceDefinition.getNextWorldListWorld();
	}
}
