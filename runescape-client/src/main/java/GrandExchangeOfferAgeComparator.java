import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llj;Llj;B)I",
		garbageValue = "-38"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1); // L: 13
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	@ObfuscatedName("v")
	static final void method5989(long var0) {
		try {
			Thread.sleep(var0); // L: 30
		} catch (InterruptedException var3) { // L: 32
		}

	} // L: 33

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(I)Loe;",
		garbageValue = "439042509"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class121.worldMap; // L: 729
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "47"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ScriptFrame.getWidgetChild(var0, var1); // L: 9557
		if (var4 != null && var4.onTargetEnter != null) { // L: 9558
			ScriptEvent var5 = new ScriptEvent(); // L: 9559
			var5.widget = var4; // L: 9560
			var5.args = var4.onTargetEnter; // L: 9561
			BoundaryObject.runScriptEvent(var5); // L: 9562
		}

		Client.selectedSpellItemId = var3; // L: 9564
		Client.isSpellSelected = true; // L: 9565
		NetCache.selectedSpellWidget = var0; // L: 9566
		Client.selectedSpellChildIndex = var1; // L: 9567
		HealthBar.selectedSpellFlags = var2; // L: 9568
		ChatChannel.invalidateWidget(var4); // L: 9569
	} // L: 9570
}
