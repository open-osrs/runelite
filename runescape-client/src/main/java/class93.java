import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public class class93 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("bd")
	static String field1280;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -504702499
	)
	int field1281;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 517872849
	)
	int field1276;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1558357321
	)
	int field1278;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1244522073
	)
	int field1279;

	class93(int var1, int var2, int var3, int var4) {
		this.field1281 = var1; // L: 10
		this.field1276 = var2; // L: 11
		this.field1278 = var3; // L: 12
		this.field1279 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "279766476"
	)
	int method2379() {
		return this.field1281; // L: 17
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1644349592"
	)
	int method2380() {
		return this.field1276; // L: 21
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method2389() {
		return this.field1278; // L: 25
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1608300695"
	)
	int method2382() {
		return this.field1279; // L: 29
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;ZI)V",
		garbageValue = "-14189171"
	)
	public static void method2392(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0; // L: 73
		ObjectComposition.ObjectDefinition_modelsArchive = var1; // L: 74
		ObjectComposition.ObjectDefinition_isLowDetail = var2; // L: 75
	} // L: 76

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-536546120"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ApproximateRouteStrategy.getWidgetChild(var0, var1); // L: 9770
		if (var4 != null && var4.onTargetEnter != null) { // L: 9771
			ScriptEvent var5 = new ScriptEvent(); // L: 9772
			var5.widget = var4; // L: 9773
			var5.args = var4.onTargetEnter; // L: 9774
			class144.runScriptEvent(var5); // L: 9775
		}

		Client.selectedSpellItemId = var3; // L: 9777
		Client.isSpellSelected = true; // L: 9778
		ArchiveDiskActionHandler.selectedSpellWidget = var0; // L: 9779
		Client.selectedSpellChildIndex = var1; // L: 9780
		class113.selectedSpellFlags = var2; // L: 9781
		GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var4); // L: 9782
	} // L: 9783
}
