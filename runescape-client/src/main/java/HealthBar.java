import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("f")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1015592217
	)
	static int field1251;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-121"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcu;",
		garbageValue = "62"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40
				var2.remove(); // L: 42
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "82"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method6269(); // L: 55
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1836952304"
	)
	static void method2351() {
		class113.field1387 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = class92.method2373((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var0 / 16.0F + 0.075F)); // L: 30
			class113.field1387[var0] = var3; // L: 31
			++var0; // L: 29
		}

		var1 = 48; // L: 33

		for (int var5 = var1 / 6; var0 < class113.field1387.length; var1 -= var5) { // L: 34 35 41
			var3 = var0 * 2; // L: 36

			for (int var4 = class92.method2373((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class113.field1387.length; ++var0) { // L: 37 38
				class113.field1387[var0] = var4; // L: 39
			}
		}

	} // L: 43
}
