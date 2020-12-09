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
		field2348 = new class194(3);
		field2342 = new class194(5);
		field2344 = new class194(14);
		field2350 = new class194(7);
		field2346 = new class194(15);
		field2345 = new class194(5);
		field2343 = new class194(4);
		field2349 = new class194(6);
		field2347 = new class194(2);
		field2351 = new class194(4);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "3"
	)
	class194(int var1) {
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1797863012"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class92.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class22.runScriptEvent(var5);
		}

		Client.field836 = var3;
		Client.isSpellSelected = true;
		MouseHandler.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		Player.selectedSpellFlags = var2;
		CollisionMap.invalidateWidget(var4);
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1005104193"
	)
	static final void method3676(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		Timer.clientPreferences.areaSoundEffectsVolume = var0;
		GrandExchangeOffer.savePreferences();
	}
}
