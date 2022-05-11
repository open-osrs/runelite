import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("o")
	byte[] field3232;
	@ObfuscatedName("q")
	byte[] field3223;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 706358109
	)
	int field3226;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2100894531
	)
	int field3225;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2080800417
	)
	int field3224;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1431898739
	)
	int field3227;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1294985269
	)
	int field3228;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1586241363
	)
	int field3229;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1620713125
	)
	int field3222;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1059182079"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9786
			Widget var0 = ApproximateRouteStrategy.getWidgetChild(ArchiveDiskActionHandler.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9787
			if (var0 != null && var0.onTargetLeave != null) { // L: 9788
				ScriptEvent var1 = new ScriptEvent(); // L: 9789
				var1.widget = var0; // L: 9790
				var1.args = var0.onTargetLeave; // L: 9791
				class144.runScriptEvent(var1); // L: 9792
			}

			Client.selectedSpellItemId = -1; // L: 9794
			Client.isSpellSelected = false; // L: 9795
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var0); // L: 9796
		}
	} // L: 9797
}
