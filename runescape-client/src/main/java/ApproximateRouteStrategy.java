import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = -1234921851
	)
	@Export("baseX")
	static int baseX;

	ApproximateRouteStrategy() {
	} // L: 12022

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILgf;I)Z",
		garbageValue = "-2070013036"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12026
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-22"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class143.getWidgetChild(var0, var1); // L: 9044
		if (var4 != null && var4.onTargetEnter != null) { // L: 9045
			ScriptEvent var5 = new ScriptEvent(); // L: 9046
			var5.widget = var4; // L: 9047
			var5.args = var4.onTargetEnter; // L: 9048
			class1.runScriptEvent(var5); // L: 9049
		}

		Client.field688 = var3; // L: 9051
		Client.isSpellSelected = true; // L: 9052
		class92.selectedSpellWidget = var0; // L: 9053
		Client.selectedSpellChildIndex = var1; // L: 9054
		class154.selectedSpellFlags = var2; // L: 9055
		class290.invalidateWidget(var4); // L: 9056
	} // L: 9057
}
