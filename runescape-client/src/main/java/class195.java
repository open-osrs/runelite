import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class195 {
	@ObfuscatedName("p")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive19")
	static Archive archive19;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1214913884"
	)
	static void method3680() {
		class248.field3219 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = class2.method23((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var0 / 16.0F + 0.075F)); // L: 30
			class248.field3219[var0] = var3; // L: 31
			++var0; // L: 29
		}

		var1 = 48; // L: 33

		for (int var5 = var1 / 6; var0 < class248.field3219.length; var1 -= var5) { // L: 34 35 41
			var3 = var0 * 2; // L: 36

			for (int var4 = class2.method23((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class248.field3219.length; ++var0) { // L: 37 38
				class248.field3219[var0] = var4; // L: 39
			}
		}

	} // L: 43

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Lbg;",
		garbageValue = "36521879"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 44
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("inventoryQuantityFormat")
	static final String inventoryQuantityFormat(int var0) {
		if (var0 < 100000) { // L: 421
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 422 423
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-4544721"
	)
	static void method3681() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 10531
			int var1 = var0.group; // L: 10532
			if (class41.loadInterface(var1)) { // L: 10533
				boolean var2 = true; // L: 10534
				Widget[] var3 = class9.Widget_interfaceComponents[var1]; // L: 10535

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 10536
					if (var3[var4] != null) { // L: 10537
						var2 = var3[var4].isIf3; // L: 10538
						break;
					}
				}

				if (!var2) { // L: 10542
					var4 = (int)var0.key; // L: 10543
					Widget var5 = CollisionMap.getWidget(var4); // L: 10544
					if (var5 != null) { // L: 10545
						CollisionMap.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 10549
}
