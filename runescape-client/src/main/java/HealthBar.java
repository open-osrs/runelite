import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1200843619
	)
	static int field1209;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2125258753"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) { // L: 27
				var5 = var7;
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lcn;",
		garbageValue = "849241629"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "80"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method5915(); // L: 55
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2114195084"
	)
	static void method2311() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 300
			if (SecureRandomFuture.clientPreferences.rememberedUsername != null) { // L: 301
				Login.Login_username = SecureRandomFuture.clientPreferences.rememberedUsername; // L: 302
				Client.Login_isUsernameRemembered = true; // L: 303
			} else {
				Client.Login_isUsernameRemembered = false; // L: 305
			}

		}
	} // L: 306

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "2115145690"
	)
	static char method2313(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0; // L: 61 62
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "517043711"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9881
			Widget var0 = class126.getWidgetChild(class20.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9882
			if (var0 != null && var0.onTargetLeave != null) { // L: 9883
				ScriptEvent var1 = new ScriptEvent(); // L: 9884
				var1.widget = var0; // L: 9885
				var1.args = var0.onTargetLeave; // L: 9886
				class285.runScriptEvent(var1); // L: 9887
			}

			Client.field633 = -1; // L: 9889
			Client.isSpellSelected = false; // L: 9890
			SecureRandomCallable.invalidateWidget(var0); // L: 9891
		}
	} // L: 9892
}
