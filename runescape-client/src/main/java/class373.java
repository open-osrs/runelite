import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
final class class373 implements class370 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnk;I)V",
		garbageValue = "-2099055755"
	)
	public void vmethod6366(Object var1, Buffer var2) {
		this.method6338((Long)var1, var2); // L: 33
	} // L: 34

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)Ljava/lang/Object;",
		garbageValue = "-559339148"
	)
	public Object vmethod6362(Buffer var1) {
		return var1.readLong(); // L: 29
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lnk;I)V",
		garbageValue = "-1414599186"
	)
	void method6338(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 25
	} // L: 26

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Liv;B)Z",
		garbageValue = "0"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10161
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10162
				int var2 = class161.method3150(var0, var1); // L: 10163
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10164
				if (var0.cs1Comparisons[var1] == 2) { // L: 10165
					if (var2 >= var3) { // L: 10166
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10168
					if (var2 <= var3) { // L: 10169
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10171
					if (var3 == var2) { // L: 10172
						return false;
					}
				} else if (var2 != var3) { // L: 10174
					return false;
				}
			}

			return true; // L: 10176
		}
	}
}
