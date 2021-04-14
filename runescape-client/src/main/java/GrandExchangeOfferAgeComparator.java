import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("aa")
	@Export("hasFocus")
	protected static boolean hasFocus;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljt;Ljt;I)I",
		garbageValue = "-1403961402"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1); // L: 13
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljv;",
		garbageValue = "1132956175"
	)
	public static VarcInt method4606(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0); // L: 23
			var1 = new VarcInt(); // L: 24
			if (var2 != null) { // L: 25
				var1.method4933(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "19"
	)
	public static String method4607(String var0) {
		int var1 = var0.length(); // L: 180
		char[] var2 = new char[var1]; // L: 181
		byte var3 = 2; // L: 182

		for (int var4 = 0; var4 < var1; ++var4) { // L: 183
			char var5 = var0.charAt(var4); // L: 184
			if (var3 == 0) { // L: 185
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 186
				var5 = PendingSpawn.method2152(var5);
			}

			if (Character.isLetter(var5)) { // L: 187
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 188
				if (Character.isSpaceChar(var5)) { // L: 189
					if (var3 != 2) { // L: 190
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 192
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 193
		}

		return new String(var2); // L: 195
	}
}
