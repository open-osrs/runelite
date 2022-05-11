import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1281629783"
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
				var5 = var7; // L: 27
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcn;",
		garbageValue = "79"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "127"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method5986(); // L: 55
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldl;",
		garbageValue = "-95794784"
	)
	static class118[] method2333() {
		return new class118[]{class118.field1498, class118.field1491, class118.field1492, class118.field1499, class118.field1490, class118.field1495}; // L: 25
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lle;Ljava/lang/String;I)V",
		garbageValue = "757631192"
	)
	static void method2335(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1475
		Client.archiveLoaders.add(var2); // L: 1476
		Client.field770 += var2.groupCount; // L: 1477
	} // L: 1478

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "85"
	)
	static final void method2334() {
		if (Tiles.field997) { // L: 3842
			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3844
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3845
				var1.method2114(); // L: 3846
			}

			Tiles.field997 = false; // L: 3849
		}

	} // L: 3851

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2108689548"
	)
	static void method2336() {
		Client.menuOptionsCount = 0; // L: 8697
		Client.isMenuOpen = false; // L: 8698
	} // L: 8699
}
