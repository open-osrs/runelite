import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class445 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 739167355
	)
	public final int field4680;
	@ObfuscatedName("o")
	public Object field4681;

	public class445(int var1) {
		this.field4680 = var1; // L: 8
	} // L: 9

	public class445(int var1, Object var2) {
		this.field4680 = var1; // L: 12
		this.field4681 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 18
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class445)) { // L: 23
			return false;
		} else {
			class445 var2 = (class445)var1; // L: 24
			if (var2.field4681 == null && this.field4681 != null) { // L: 25
				return false;
			} else if (this.field4681 == null && var2.field4681 != null) { // L: 26
				return false;
			} else {
				return var2.field4680 == this.field4680 && var2.field4681.equals(this.field4681); // L: 27
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lbr;Lbr;IZIZB)I",
		garbageValue = "35"
	)
	static int method8053(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = GrandExchangeOffer.compareWorlds(var0, var1, var2, var3); // L: 199
		if (var6 != 0) { // L: 200
			return var3 ? -var6 : var6; // L: 201
		} else if (var4 == -1) { // L: 204
			return 0;
		} else {
			int var7 = GrandExchangeOffer.compareWorlds(var0, var1, var4, var5); // L: 205
			return var5 ? -var7 : var7; // L: 206
		}
	}
}
