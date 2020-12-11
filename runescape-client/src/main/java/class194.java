import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class194 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2348;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2342;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2344;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2350;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2346;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2345;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2343;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2349;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2347;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2351;

	static {
		field2348 = new class194(3); // L: 5
		field2342 = new class194(5); // L: 6
		field2344 = new class194(14); // L: 7
		field2350 = new class194(7); // L: 8
		field2346 = new class194(15); // L: 9
		field2345 = new class194(5); // L: 10
		field2343 = new class194(4); // L: 11
		field2349 = new class194(6); // L: 12
		field2347 = new class194(2); // L: 13
		field2351 = new class194(4); // L: 14
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "3"
	)
	class194(int var1) {
	} // L: 20

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1797863012"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class92.getWidgetChild(var0, var1); // L: 8331
		if (var4 != null && var4.onTargetEnter != null) { // L: 8332
			ScriptEvent var5 = new ScriptEvent(); // L: 8333
			var5.widget = var4; // L: 8334
			var5.args = var4.onTargetEnter; // L: 8335
			class22.runScriptEvent(var5); // L: 8336
		}

		Client.field836 = var3; // L: 8338
		Client.isSpellSelected = true; // L: 8339
		MouseHandler.selectedSpellWidget = var0; // L: 8340
		Client.selectedSpellChildIndex = var1; // L: 8341
		Player.selectedSpellFlags = var2; // L: 8342
		CollisionMap.invalidateWidget(var4); // L: 8343
	} // L: 8344

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1005104193"
	)
	static final void method3676(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 10678
		Timer.clientPreferences.areaSoundEffectsVolume = var0; // L: 10679
		GrandExchangeOffer.savePreferences(); // L: 10680
	} // L: 10681
}
