import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class120 extends class116 {
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = -346097947
	)
	static int field1408;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2132840675
	)
	int field1409;
	@ObfuscatedName("q")
	byte field1407;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class120(class119 var1) {
		this.this$0 = var1;
		this.field1409 = -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-912681401"
	)
	void vmethod2767(Buffer var1) {
		this.field1409 = var1.readUnsignedShort();
		this.field1407 = var1.readByte();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1225074726"
	)
	void vmethod2766(ClanSettings var1) {
		var1.method2619(this.field1409, this.field1407);
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1261296688"
	)
	static void method2530() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (GrandExchangeOfferTotalQuantityComparator.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = Widget.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = HealthBarUpdate.getWidget(var4);
					if (var5 != null) {
						class16.invalidateWidget(var5);
					}
				}
			}
		}

	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-1468568304"
	)
	static void method2533(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class321.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		class351.method6285(var0, var1);
	}
}
