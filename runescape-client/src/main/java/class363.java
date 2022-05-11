import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public final class class363 implements Comparable {
	@ObfuscatedName("o")
	Object field4289;
	@ObfuscatedName("q")
	Object field4288;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 8122509668442582777L
	)
	long field4290;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -2881932506811436755L
	)
	long field4291;

	class363(Object var1, Object var2) {
		this.field4289 = var1; // L: 10
		this.field4288 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "-1341616281"
	)
	int method6415(class363 var1) {
		if (this.field4291 < var1.field4291) {
			return -1; // L: 15
		} else {
			return this.field4291 > var1.field4291 ? 1 : 0; // L: 16 17
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class363) { // L: 22
			return this.field4288.equals(((class363)var1).field4288);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}

	public int compareTo(Object var1) {
		return this.method6415((class363)var1); // L: 32
	}

	public int hashCode() {
		return this.field4288.hashCode(); // L: 28
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lki;I[B[BI)V",
		garbageValue = "-1210183331"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3474 == null) { // L: 988
			if (var2 == null) { // L: 989
				return; // L: 995
			}

			var0.field3474 = new byte[11][]; // L: 990
			var0.field3419 = new byte[11][]; // L: 991
			var0.field3476 = new int[11]; // L: 992
			var0.field3481 = new int[11]; // L: 993
		}

		var0.field3474[var1] = var2; // L: 997
		if (var2 != null) {
			var0.field3473 = true; // L: 998
		} else {
			var0.field3473 = false; // L: 1000

			for (int var4 = 0; var4 < var0.field3474.length; ++var4) { // L: 1001
				if (var0.field3474[var4] != null) { // L: 1002
					var0.field3473 = true; // L: 1003
					break;
				}
			}
		}

		var0.field3419[var1] = var3; // L: 1008
	} // L: 1009
}
