import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1385080741
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1702069549
	)
	@Export("health")
	int health;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 113982143
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -48902103
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "27"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	public static void method2200() {
		Widget.Widget_cachedSprites.clear(); // L: 728
		Widget.Widget_cachedModels.clear(); // L: 729
		Widget.Widget_cachedFonts.clear(); // L: 730
		Widget.Widget_cachedSpriteMasks.clear(); // L: 731
	} // L: 732

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1100971674"
	)
	static final void method2204(boolean var0) {
		if (var0) { // L: 3110
			Client.field652 = Login.field1008 ? class125.field1450 : class125.field1452; // L: 3111
		} else {
			LinkedHashMap var1 = class12.clientPreferences.parameters; // L: 3114
			String var3 = Login.Login_username; // L: 3116
			int var4 = var3.length(); // L: 3118
			int var5 = 0; // L: 3119

			for (int var6 = 0; var6 < var4; ++var6) { // L: 3120
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field652 = var1.containsKey(var5) ? class125.field1451 : class125.field1449; // L: 3123
		}

	} // L: 3125
}
